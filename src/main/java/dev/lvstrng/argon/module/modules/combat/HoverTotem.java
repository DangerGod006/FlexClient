package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.mixin.HandledScreenMixin;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1802;
import net.minecraft.class_490;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/HoverTotem.class */
public final class HoverTotem extends Module implements TickListener {
    private final NumberSetting delay;
    private final BooleanSetting hotbar;
    private final NumberSetting slot;
    private final BooleanSetting autoSwitch;
    private int clock;

    public HoverTotem() {
        super(EncryptedString.of("Hover Totem"), EncryptedString.of("Equips a totem in your totem and offhand slots if a totem is hovered"), -1, Category.COMBAT);
        this.delay = new NumberSetting(EncryptedString.of("Delay"), 0.0d, 20.0d, 0.0d, 1.0d);
        this.hotbar = new BooleanSetting(EncryptedString.of("Hotbar"), true).setDescription(EncryptedString.of("Puts a totem in your hotbar as well, if enabled (Setting below will work if this is enabled)"));
        this.slot = new NumberSetting(EncryptedString.of("Totem Slot"), 1.0d, 9.0d, 1.0d, 1.0d).setDescription(EncryptedString.of("Your preferred totem slot"));
        this.autoSwitch = new BooleanSetting(EncryptedString.of("Auto Switch"), false).setDescription(EncryptedString.of("Switches to totem slot when going inside the inventory"));
        addSettings(this.delay, this.hotbar, this.slot, this.autoSwitch);
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
            class_1735 hoveredSlot = handledScreenMixin2.getFocusedSlot();
            if (this.autoSwitch.getValue()) {
                this.mc.field_1724.method_31548().method_61496(this.slot.getValueInt() - 1);
            }
            if (hoveredSlot == null || (slot = hoveredSlot.method_34266()) > 35) {
                return;
            }
            int totem = this.slot.getValueInt() - 1;
            if (hoveredSlot.method_7677().method_7909() == class_1802.field_8288) {
                if (this.hotbar.getValue() && this.mc.field_1724.method_31548().method_5438(totem).method_7909() != class_1802.field_8288) {
                    if (this.clock > 0) {
                        this.clock--;
                        return;
                    } else {
                        this.mc.field_1761.method_2906(handledScreenMixin2.method_17577().field_7763, slot, totem, class_1713.field_7791, this.mc.field_1724);
                        this.clock = this.delay.getValueInt();
                        return;
                    }
                }
                if (!this.mc.field_1724.method_6079().method_31574(class_1802.field_8288)) {
                    if (this.clock > 0) {
                        this.clock--;
                        return;
                    } else {
                        this.mc.field_1761.method_2906(handledScreenMixin2.method_17577().field_7763, slot, 40, class_1713.field_7791, this.mc.field_1724);
                        this.clock = this.delay.getValueInt();
                        return;
                    }
                }
                return;
            }
            return;
        }
        this.clock = this.delay.getValueInt();
    }
}
