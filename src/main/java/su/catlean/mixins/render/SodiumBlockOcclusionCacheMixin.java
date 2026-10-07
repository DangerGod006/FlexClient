package su.catlean.mixins.render;

import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.GofraState;
import su.catlean.api.event.events.render.XRayBlockEvent;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/render/SodiumBlockOcclusionCacheMixin.class */
@Pseudo
@Mixin(targets = {"net/caffeinemc/mods/sodium/client/render/chunk/compile/pipeline/BlockOcclusionCache"}, remap = false)
public class SodiumBlockOcclusionCacheMixin {
    @Inject(method = {"shouldDrawSide"}, at = {@At("RETURN")}, cancellable = true)
    void shouldDrawSideHook(class_2680 state, class_1922 view, class_2338 pos, class_2350 facing, CallbackInfoReturnable<Boolean> cir) {
        if (GofraState.INSTANCE.getXray()) {
            XRayBlockEvent event = new XRayBlockEvent();
            event.call(state.method_26204());
            cir.setReturnValue(Boolean.valueOf(event.getCancelled()));
        }
    }
}
