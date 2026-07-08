package dev.lvstrng.argon.mixin;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.module.modules.misc.NoHitDelay;
import dev.lvstrng.argon.utils.WorldUtils;
import net.minecraft.class_1657;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/mixin/PlayerEntityMixin.class */
@Mixin({class_1657.class})
public class PlayerEntityMixin {
    @Inject(method = {"method_7261"}, at = {@At("RETURN")}, cancellable = true)
    private void onGetAttackCooldownProgress(float baseTime, CallbackInfoReturnable<Float> cir) {
        NoHitDelay mod;
        if (Argon.mc.field_1724 != null && this == Argon.mc.field_1724 && (mod = (NoHitDelay) Argon.INSTANCE.getModuleManager().getModule(NoHitDelay.class)) != null && mod.isEnabled()) {
            if (!mod.weaponsOnly.getValue() || WorldUtils.isWeapon(Argon.mc.field_1724.method_6047())) {
                if (!mod.onlyOnGround.getValue() || Argon.mc.field_1724.method_24828()) {
                    int delayTicks = mod.delay.getValueInt();
                    if (delayTicks == 0) {
                        cir.setReturnValue(Float.valueOf(1.0f));
                    } else {
                        float reduced = 1.0f - (delayTicks / 20.0f);
                        cir.setReturnValue(Float.valueOf(Math.max(0.0f, Math.min(1.0f, reduced))));
                    }
                }
            }
        }
    }
}
