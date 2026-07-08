package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.event.events.AttackListener;
import dev.lvstrng.argon.event.events.BlockBreakingListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.WorldUtils;
import net.minecraft.class_239;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/NoMissDelay.class */
public final class NoMissDelay extends Module implements AttackListener, BlockBreakingListener {
    private final BooleanSetting onlyWeapon;
    private final BooleanSetting air;
    private final BooleanSetting blocks;

    public NoMissDelay() {
        super(EncryptedString.of("No Miss Delay"), EncryptedString.of("Doesn't let you miss your sword/axe hits"), -1, Category.COMBAT);
        this.onlyWeapon = new BooleanSetting(EncryptedString.of("Only weapon"), true);
        this.air = new BooleanSetting(EncryptedString.of("Air"), true).setDescription(EncryptedString.of("Whether to stop hits directed to the air"));
        this.blocks = new BooleanSetting(EncryptedString.of("Blocks"), false).setDescription(EncryptedString.of("Whether to stop hits directed to blocks"));
        addSettings(this.onlyWeapon, this.air, this.blocks);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(AttackListener.class, this);
        this.eventManager.add(BlockBreakingListener.class, this);
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(AttackListener.class, this);
        this.eventManager.remove(BlockBreakingListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.AttackListener
    public void onAttack(AttackListener.AttackEvent event) {
        if (this.onlyWeapon.getValue() && !WorldUtils.isWeapon(this.mc.field_1724.method_6047())) {
        }
        switch (AnonymousClass1.$SwitchMap$net$minecraft$util$hit$HitResult$Type[this.mc.field_1765.method_17783().ordinal()]) {
            case 1:
                if (this.air.getValue()) {
                    event.cancel();
                }
                break;
            case 2:
                if (this.blocks.getValue()) {
                    event.cancel();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: dev.lvstrng.argon.module.modules.combat.NoMissDelay$1, reason: invalid class name */
    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/NoMissDelay$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$minecraft$util$hit$HitResult$Type = new int[class_239.class_240.values().length];

        static {
            try {
                $SwitchMap$net$minecraft$util$hit$HitResult$Type[class_239.class_240.field_1333.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$net$minecraft$util$hit$HitResult$Type[class_239.class_240.field_1332.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    @Override // dev.lvstrng.argon.event.events.BlockBreakingListener
    public void onBlockBreaking(BlockBreakingListener.BlockBreakingEvent event) {
        if ((!this.onlyWeapon.getValue() || WorldUtils.isWeapon(this.mc.field_1724.method_6047())) && this.mc.field_1765.method_17783() == class_239.class_240.field_1332 && this.blocks.getValue()) {
            event.cancel();
        }
    }
}
