package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.ModeSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.FakeInvScreen;
import dev.lvstrng.argon.utils.InventoryUtils;
import dev.lvstrng.argon.utils.TimerUtils;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_490;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/AutoInventoryTotem.class */
public final class AutoInventoryTotem extends Module implements TickListener {
    private final ModeSetting<Mode> mode;
    private final NumberSetting delay;
    private final BooleanSetting hotbar;
    private final NumberSetting totemSlot;
    private final BooleanSetting autoSwitch;
    private final BooleanSetting forceTotem;
    private final BooleanSetting autoOpen;
    private final NumberSetting stayOpenFor;
    int clock;
    int closeClock;
    TimerUtils openTimer;
    TimerUtils closeTimer;

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/AutoInventoryTotem$Mode.class */
    public enum Mode {
        Blatant,
        Random
    }

    public AutoInventoryTotem() {
        super(EncryptedString.of("Auto Inventory Totem"), EncryptedString.of("Automatically equips a totem in your offhand and main hand if empty"), -1, Category.COMBAT);
        this.mode = (ModeSetting) new ModeSetting(EncryptedString.of("Mode"), Mode.Blatant, Mode.class).setDescription(EncryptedString.of("Whether to randomize the toteming pattern or no"));
        this.delay = new NumberSetting(EncryptedString.of("Delay"), 0.0d, 20.0d, 0.0d, 1.0d);
        this.hotbar = new BooleanSetting(EncryptedString.of("Hotbar"), true).setDescription(EncryptedString.of("Puts a totem in your hotbar as well, if enabled (Setting below will work if this is enabled)"));
        this.totemSlot = new NumberSetting(EncryptedString.of("Totem Slot"), 1.0d, 9.0d, 1.0d, 1.0d).setDescription(EncryptedString.of("Your preferred totem slot"));
        this.autoSwitch = new BooleanSetting(EncryptedString.of("Auto Switch"), false).setDescription(EncryptedString.of("Switches to totem slot when going inside the inventory"));
        this.forceTotem = new BooleanSetting(EncryptedString.of("Force Totem"), false).setDescription(EncryptedString.of("Puts the totem in the slot, regardless if its space is taken up by something else"));
        this.autoOpen = new BooleanSetting(EncryptedString.of("Auto Open"), false).setDescription(EncryptedString.of("Automatically opens and closes the inventory for you"));
        this.stayOpenFor = new NumberSetting(EncryptedString.of("Stay Open For"), 0.0d, 20.0d, 0.0d, 1.0d);
        this.clock = -1;
        this.closeClock = -1;
        this.openTimer = new TimerUtils();
        this.closeTimer = new TimerUtils();
        addSettings(this.mode, this.delay, this.hotbar, this.totemSlot, this.autoSwitch, this.forceTotem, this.autoOpen, this.stayOpenFor);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        this.clock = -1;
        this.closeClock = -1;
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(TickListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        if (shouldOpenScreen() && this.autoOpen.getValue()) {
            this.mc.method_1507(new FakeInvScreen(this.mc.field_1724));
        }
        if (!(this.mc.field_1755 instanceof class_490) && !(this.mc.field_1755 instanceof FakeInvScreen)) {
            this.clock = -1;
            this.closeClock = -1;
            return;
        }
        if (this.clock == -1) {
            this.clock = this.delay.getValueInt();
        }
        if (this.closeClock == -1) {
            this.closeClock = this.stayOpenFor.getValueInt();
        }
        if (this.clock > 0) {
            this.clock--;
        }
        class_1661 inventory = this.mc.field_1724.method_31548();
        if (this.autoSwitch.getValue()) {
            inventory.method_61496(this.totemSlot.getValueInt() - 1);
        }
        if (this.clock <= 0) {
            if (this.mc.field_1724.method_6079().method_7909() != class_1802.field_8288) {
                int slot = this.mode.isMode(Mode.Blatant) ? InventoryUtils.findTotemSlot() : InventoryUtils.findRandomTotemSlot();
                if (slot != -1) {
                    this.mc.field_1761.method_2906(this.mc.field_1755.method_17577().field_7763, slot, 40, class_1713.field_7791, this.mc.field_1724);
                    return;
                }
            }
            if (this.hotbar.getValue()) {
                class_1799 mainHand = this.mc.field_1724.method_6047();
                if (mainHand.method_7960() || (this.forceTotem.getValue() && mainHand.method_7909() != class_1802.field_8288)) {
                    int slot2 = this.mode.isMode(Mode.Blatant) ? InventoryUtils.findTotemSlot() : InventoryUtils.findRandomTotemSlot();
                    if (slot2 != -1) {
                        this.mc.field_1761.method_2906(this.mc.field_1755.method_17577().field_7763, slot2, inventory.method_67532(), class_1713.field_7791, this.mc.field_1724);
                        return;
                    }
                }
            }
            if (shouldCloseScreen() && this.autoOpen.getValue()) {
                if (this.closeClock != 0) {
                    this.closeClock--;
                } else {
                    this.mc.field_1755.method_25419();
                    this.closeClock = this.stayOpenFor.getValueInt();
                }
            }
        }
    }

    public boolean shouldCloseScreen() {
        return this.hotbar.getValue() ? this.mc.field_1724.method_31548().method_5438(this.totemSlot.getValueInt() - 1).method_7909() == class_1802.field_8288 && this.mc.field_1724.method_6079().method_7909() == class_1802.field_8288 && (this.mc.field_1755 instanceof FakeInvScreen) : this.mc.field_1724.method_6079().method_7909() == class_1802.field_8288 && (this.mc.field_1755 instanceof FakeInvScreen);
    }

    public boolean shouldOpenScreen() {
        return this.hotbar.getValue() ? ((this.mc.field_1724.method_6079().method_7909() == class_1802.field_8288 && this.mc.field_1724.method_31548().method_5438(this.totemSlot.getValueInt() - 1).method_7909() == class_1802.field_8288) || (this.mc.field_1755 instanceof FakeInvScreen) || InventoryUtils.countItemExceptHotbar(item -> {
            return item == class_1802.field_8288;
        }) == 0) ? false : true : (this.mc.field_1724.method_6079().method_7909() == class_1802.field_8288 || (this.mc.field_1755 instanceof FakeInvScreen) || InventoryUtils.countItemExceptHotbar(item2 -> {
            return item2 == class_1802.field_8288;
        }) == 0) ? false : true;
    }
}
