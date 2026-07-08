package dev.lvstrng.argon.module.modules.misc;

import dev.lvstrng.argon.event.events.AttackListener;
import dev.lvstrng.argon.event.events.BlockBreakingListener;
import dev.lvstrng.argon.event.events.ItemUseListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.utils.BlockUtils;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.WorldUtils;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_3965;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/misc/Prevent.class */
public final class Prevent extends Module implements ItemUseListener, AttackListener, BlockBreakingListener {
    private final BooleanSetting doubleGlowstone;
    private final BooleanSetting glowstoneMisplace;
    private final BooleanSetting anchorOnAnchor;
    private final BooleanSetting obiPunch;
    private final BooleanSetting echestClick;

    public Prevent() {
        super(EncryptedString.of("Prevent"), EncryptedString.of("Prevents you from certain actions"), -1, Category.MISC);
        this.doubleGlowstone = new BooleanSetting(EncryptedString.of("Double Glowstone"), false).setDescription(EncryptedString.of("Makes it so you can't charge the anchor again if it's already charged"));
        this.glowstoneMisplace = new BooleanSetting(EncryptedString.of("Glowstone Misplace"), false).setDescription(EncryptedString.of("Makes it so you can only right-click with glowstone only when aiming at an anchor"));
        this.anchorOnAnchor = new BooleanSetting(EncryptedString.of("Anchor on Anchor"), false).setDescription(EncryptedString.of("Makes it so you can't place an anchor on/next to another anchor unless charged"));
        this.obiPunch = new BooleanSetting(EncryptedString.of("Obi Punch"), false).setDescription(EncryptedString.of("Makes it so you can crystal faster by not letting you left click/start breaking the obsidian"));
        this.echestClick = new BooleanSetting(EncryptedString.of("E-chest click"), false).setDescription(EncryptedString.of("Makes it so you can't click on e-chests with PvP items"));
        addSettings(this.doubleGlowstone, this.glowstoneMisplace, this.anchorOnAnchor, this.obiPunch, this.echestClick);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(BlockBreakingListener.class, this);
        this.eventManager.add(AttackListener.class, this);
        this.eventManager.add(ItemUseListener.class, this);
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(BlockBreakingListener.class, this);
        this.eventManager.remove(AttackListener.class, this);
        this.eventManager.remove(ItemUseListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.AttackListener
    public void onAttack(AttackListener.AttackEvent event) {
        class_3965 class_3965Var = this.mc.field_1765;
        if (class_3965Var instanceof class_3965) {
            class_3965 hit = class_3965Var;
            if (BlockUtils.isBlock(hit.method_17777(), class_2246.field_10540) && this.obiPunch.getValue() && this.mc.field_1724.method_24518(class_1802.field_8301)) {
                event.cancel();
            }
        }
    }

    @Override // dev.lvstrng.argon.event.events.BlockBreakingListener
    public void onBlockBreaking(BlockBreakingListener.BlockBreakingEvent event) {
        class_3965 class_3965Var = this.mc.field_1765;
        if (class_3965Var instanceof class_3965) {
            class_3965 hit = class_3965Var;
            if (BlockUtils.isBlock(hit.method_17777(), class_2246.field_10540) && this.obiPunch.getValue() && this.mc.field_1724.method_24518(class_1802.field_8301)) {
                event.cancel();
            }
        }
    }

    @Override // dev.lvstrng.argon.event.events.ItemUseListener
    public void onItemUse(ItemUseListener.ItemUseEvent event) {
        class_3965 class_3965Var = this.mc.field_1765;
        if (class_3965Var instanceof class_3965) {
            class_3965 hit = class_3965Var;
            if (BlockUtils.isAnchorCharged(hit.method_17777()) && this.doubleGlowstone.getValue() && this.mc.field_1724.method_24518(class_1802.field_8801)) {
                event.cancel();
            }
            if (!BlockUtils.isBlock(hit.method_17777(), class_2246.field_23152) && this.glowstoneMisplace.getValue() && this.mc.field_1724.method_24518(class_1802.field_8801)) {
                event.cancel();
            }
            if (BlockUtils.isAnchorNotCharged(hit.method_17777()) && this.anchorOnAnchor.getValue() && this.mc.field_1724.method_24518(class_1802.field_23141)) {
                event.cancel();
            }
            if (BlockUtils.isBlock(hit.method_17777(), class_2246.field_10443) && this.echestClick.getValue()) {
                if (WorldUtils.isSword(this.mc.field_1724.method_6047()) || this.mc.field_1724.method_6047().method_7909() == class_1802.field_8301 || this.mc.field_1724.method_6047().method_7909() == class_1802.field_8281 || this.mc.field_1724.method_6047().method_7909() == class_1802.field_23141 || this.mc.field_1724.method_6047().method_7909() == class_1802.field_8801) {
                    event.cancel();
                }
            }
        }
    }
}
