package dev.lvstrng.argon.mixin;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.module.modules.misc.NoBreakDelay;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/mixin/ClientPlayerInteractionManagerMixin.class */
@Mixin({class_636.class})
public class ClientPlayerInteractionManagerMixin {

    @Shadow
    private int field_3716;

    @Redirect(method = {"method_2902"}, at = @At(value = "FIELD", target = "Lnet/minecraft/class_636;field_3716:I", opcode = 180, ordinal = 0))
    public int updateBlockBreakingProgress(class_636 clientPlayerInteractionManager) {
        int cooldown = this.field_3716;
        if (((NoBreakDelay) Argon.INSTANCE.getModuleManager().getModule(NoBreakDelay.class)).isEnabled()) {
            return 0;
        }
        return cooldown;
    }
}
