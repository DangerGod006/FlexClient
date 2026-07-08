package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.InventoryUtils;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1291;
import net.minecraft.class_1294;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/AutoPot.class */
public final class AutoPot extends Module implements TickListener {
    private final NumberSetting minHealth;
    private final NumberSetting switchDelay;
    private final NumberSetting throwDelay;
    private final BooleanSetting goToPrevSlot;
    private final BooleanSetting lookDown;
    private int switchClock;
    private int throwClock;
    private int prevSlot;
    private float prevPitch;
    private boolean bool;

    public AutoPot() {
        super(EncryptedString.of("Auto Pot"), EncryptedString.of("Automatically throws health potions when low on health"), -1, Category.COMBAT);
        this.minHealth = new NumberSetting(EncryptedString.of("Min Health"), 1.0d, 20.0d, 10.0d, 1.0d);
        this.switchDelay = new NumberSetting(EncryptedString.of("Switch Delay"), 0.0d, 10.0d, 0.0d, 1.0d);
        this.throwDelay = new NumberSetting(EncryptedString.of("Throw Delay"), 0.0d, 10.0d, 0.0d, 1.0d);
        this.goToPrevSlot = new BooleanSetting(EncryptedString.of("Switch Back"), true);
        this.lookDown = new BooleanSetting(EncryptedString.of("Look Down"), true);
        addSettings(this.minHealth, this.switchDelay, this.throwDelay, this.goToPrevSlot, this.lookDown);
    }

    private void reset() {
        this.switchClock = 0;
        this.throwClock = 0;
        this.prevSlot = -1;
        this.prevPitch = -1.0f;
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        reset();
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(TickListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        if (this.mc.field_1755 != null) {
            return;
        }
        if (this.mc.field_1724.method_6032() <= this.minHealth.getValueFloat() || this.bool) {
            if (this.bool && this.mc.field_1724.method_6032() >= this.mc.field_1724.method_6063()) {
                this.bool = false;
                return;
            }
            if (!InventoryUtils.isThatSplash((class_1291) class_1294.field_5915.comp_349(), 1, 1, this.mc.field_1724.method_6047())) {
                if (this.switchClock < this.switchDelay.getValue()) {
                    this.switchClock++;
                    return;
                }
                if (this.goToPrevSlot.getValue() && this.prevSlot == -1) {
                    this.prevSlot = this.mc.field_1724.method_31548().method_67532();
                }
                if (this.lookDown.getValue() && this.prevPitch == -1.0f) {
                    this.prevPitch = this.mc.field_1724.method_36455();
                }
                int potSlot = InventoryUtils.findSplash((class_1291) class_1294.field_5915.comp_349(), 1, 1);
                if (potSlot != -1) {
                    InventoryUtils.setInvSlot(potSlot);
                    this.switchClock = 0;
                }
            }
            if (InventoryUtils.isThatSplash((class_1291) class_1294.field_5915.comp_349(), 1, 1, this.mc.field_1724.method_6047())) {
                if (this.throwClock < this.throwDelay.getValue()) {
                    this.throwClock++;
                    return;
                }
                if (this.lookDown.getValue()) {
                    this.mc.field_1724.method_36457(90.0f);
                }
                class_1269 actionResult = this.mc.field_1761.method_2919(this.mc.field_1724, class_1268.field_5808);
                if (actionResult.method_23665()) {
                    this.mc.field_1724.method_6104(class_1268.field_5808);
                }
                this.throwClock = 0;
                return;
            }
            return;
        }
        if (this.prevSlot != -1 || this.prevPitch != -1.0f) {
            InventoryUtils.setInvSlot(this.prevSlot);
            this.prevSlot = -1;
            this.mc.field_1724.method_36457(this.prevPitch);
            this.prevPitch = -1.0f;
        }
    }
}
