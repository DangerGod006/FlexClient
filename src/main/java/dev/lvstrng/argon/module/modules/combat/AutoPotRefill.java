package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.mixin.HandledScreenMixin;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.ModeSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.InventoryUtils;
import net.minecraft.class_1291;
import net.minecraft.class_1294;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_490;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/AutoPotRefill.class */
public final class AutoPotRefill extends Module implements TickListener {
    private final ModeSetting<Mode> mode;
    private final NumberSetting delay;
    private int clock;

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/AutoPotRefill$Mode.class */
    public enum Mode {
        Auto,
        Hover
    }

    public AutoPotRefill() {
        super(EncryptedString.of("Auto Pot Refill"), EncryptedString.of("Refills your hotbar with potions"), -1, Category.COMBAT);
        this.mode = new ModeSetting<>(EncryptedString.of("Mode"), Mode.Auto, Mode.class);
        this.delay = new NumberSetting(EncryptedString.of("Delay"), 0.0d, 10.0d, 0.0d, 1.0d);
        addSettings(this.mode, this.delay);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        this.clock = 0;
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(TickListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        int slot;
        HandledScreenMixin handledScreenMixin = this.mc.field_1755;
        if (handledScreenMixin instanceof class_490) {
            HandledScreenMixin handledScreenMixin2 = (class_490) handledScreenMixin;
            if (this.mode.isMode(Mode.Hover)) {
                class_1735 focusedSlot = handledScreenMixin2.getFocusedSlot();
                if (focusedSlot == null) {
                    return;
                }
                class_1661 inventory = this.mc.field_1724.method_31548();
                int emptySlot = -1;
                int i = 0;
                while (true) {
                    if (i > 8) {
                        break;
                    }
                    if (!inventory.method_5438(i).method_7960()) {
                        i++;
                    } else {
                        emptySlot = i;
                        break;
                    }
                }
                if (emptySlot == -1) {
                    return;
                }
                if (InventoryUtils.isThatSplash((class_1291) class_1294.field_5915.comp_349(), 1, 1, focusedSlot.method_7677())) {
                    if (this.clock < this.delay.getValueInt()) {
                        this.clock++;
                        return;
                    } else {
                        this.mc.field_1761.method_2906(handledScreenMixin2.method_17577().field_7763, focusedSlot.method_34266(), emptySlot, class_1713.field_7791, this.mc.field_1724);
                        this.clock = 0;
                    }
                }
            }
            if (this.mode.isMode(Mode.Auto) && (slot = InventoryUtils.findPot((class_1291) class_1294.field_5915.comp_349(), 1, 1)) != -1) {
                class_1661 inventory2 = this.mc.field_1724.method_31548();
                int emptySlot2 = -1;
                int i2 = 0;
                while (true) {
                    if (i2 > 8) {
                        break;
                    }
                    if (!inventory2.method_5438(i2).method_7960()) {
                        i2++;
                    } else {
                        emptySlot2 = i2;
                        break;
                    }
                }
                if (emptySlot2 == -1) {
                    return;
                }
                if (this.clock < this.delay.getValueInt()) {
                    this.clock++;
                } else {
                    this.mc.field_1761.method_2906(handledScreenMixin2.method_17577().field_7763, slot, emptySlot2, class_1713.field_7791, this.mc.field_1724);
                    this.clock = 0;
                }
            }
        }
    }
}
