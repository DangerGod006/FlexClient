package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.event.events.AttackListener;
import dev.lvstrng.argon.event.events.ButtonListener;
import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.KeybindSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import net.minecraft.class_1799;
import net.minecraft.class_1887;
import net.minecraft.class_2868;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_9304;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/SpearSwap.class */
public final class SpearSwap extends Module implements AttackListener, TickListener, ButtonListener {
    private final NumberSetting triggerSlot;
    private final KeybindSetting activateKey;
    private final BooleanSetting autoJump;
    private final NumberSetting fixDelay;
    private boolean needsSwapBack;
    private int originalSlot;
    private int ticksWaited;
    private boolean waitingForApex;

    public SpearSwap() {
        super(EncryptedString.of("Spear Swap"), EncryptedString.of("Classic spear swap logic with trigger slot and keybind support"), -1, Category.COMBAT);
        this.triggerSlot = new NumberSetting(EncryptedString.of("Trigger Slot"), 1.0d, 9.0d, 9.0d, 1.0d).setDescription(EncryptedString.of("The slot you must be on to activate (1-9)"));
        this.activateKey = new KeybindSetting(EncryptedString.of("Activate Key"), -1, false);
        this.autoJump = new BooleanSetting(EncryptedString.of("Auto Jump"), true);
        this.fixDelay = new NumberSetting(EncryptedString.of("Fix Delay (Ticks)"), 1.0d, 10.0d, 1.0d, 1.0d).setDescription(EncryptedString.of("Ticks to wait before swapping back"));
        this.needsSwapBack = false;
        this.originalSlot = -1;
        this.ticksWaited = 0;
        this.waitingForApex = false;
        addSettings(this.triggerSlot, this.activateKey, this.autoJump, this.fixDelay);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(AttackListener.class, this);
        this.eventManager.add(TickListener.class, this);
        this.eventManager.add(ButtonListener.class, this);
        reset();
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(AttackListener.class, this);
        this.eventManager.remove(TickListener.class, this);
        this.eventManager.remove(ButtonListener.class, this);
        if (this.needsSwapBack && this.mc.field_1724 != null && this.originalSlot != -1) {
            forceSwap(this.originalSlot);
        }
        reset();
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.ButtonListener
    public void onButtonPress(ButtonListener.ButtonEvent event) {
        int spearSlot;
        if (this.mc.field_1724 != null && event.action == 1 && this.activateKey.getKey() != -1 && event.button == this.activateKey.getKey() && (spearSlot = findSpear()) != -1) {
            if (this.autoJump.getValue() && this.mc.field_1724.method_24828()) {
                this.mc.field_1724.method_6043();
                this.waitingForApex = true;
            } else {
                executeLunge(spearSlot);
            }
        }
    }

    @Override // dev.lvstrng.argon.event.events.AttackListener
    public void onAttack(AttackListener.AttackEvent event) {
        int spearSlot;
        if (this.mc.field_1724 == null || this.needsSwapBack) {
            return;
        }
        int current = this.mc.field_1724.method_31548().method_67532();
        if (current == this.triggerSlot.getValueInt() - 1 && (spearSlot = findSpear()) != -1) {
            event.cancel();
            if (this.autoJump.getValue() && this.mc.field_1724.method_24828()) {
                this.mc.field_1724.method_6043();
                this.waitingForApex = true;
            } else {
                executeLunge(spearSlot);
            }
        }
    }

    private void executeLunge(int spearSlot) {
        int oldSlot = this.mc.field_1724.method_31548().method_67532();
        if (oldSlot == spearSlot) {
            this.mc.invokeDoAttack();
            return;
        }
        forceSwap(spearSlot);
        this.mc.invokeDoAttack();
        this.needsSwapBack = true;
        this.originalSlot = oldSlot;
        this.ticksWaited = this.fixDelay.getValueInt();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        if (this.mc.field_1724 == null) {
            return;
        }
        if (this.waitingForApex && (this.mc.field_1724.method_18798().field_1351 <= 0.0d || this.mc.field_1724.method_24828())) {
            int spearSlot = findSpear();
            if (spearSlot != -1) {
                executeLunge(spearSlot);
            }
            this.waitingForApex = false;
        }
        if (this.needsSwapBack && !this.waitingForApex) {
            this.ticksWaited--;
            if (this.ticksWaited <= 0) {
                forceSwap(this.originalSlot);
                this.needsSwapBack = false;
            }
        }
    }

    private int findSpear() {
        for (int i = 0; i < 9; i++) {
            class_1799 stack = this.mc.field_1724.method_31548().method_5438(i);
            if (!stack.method_7960()) {
                String name = stack.method_7909().method_63680().getString().toLowerCase();
                String type = stack.method_7909().toString().toLowerCase();
                if (name.contains("spear") || type.contains("spear") || type.contains("trident")) {
                    class_9304 enchants = stack.method_58657();
                    for (class_6880<class_1887> entry : enchants.method_57534()) {
                        if (entry.method_40230().isPresent() && ((class_5321) entry.method_40230().get()).method_29177().toString().toLowerCase().contains("lunge")) {
                            return i;
                        }
                    }
                }
            }
        }
        return -1;
    }

    private void forceSwap(int slot) {
        if (this.mc.field_1724 == null || this.mc.method_1562() == null) {
            return;
        }
        this.mc.method_1562().method_52787(new class_2868(slot));
        this.mc.field_1724.method_31548().method_61496(slot);
    }

    private void reset() {
        this.needsSwapBack = false;
        this.originalSlot = -1;
        this.ticksWaited = 0;
        this.waitingForApex = false;
    }
}
