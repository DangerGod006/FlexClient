package su.catlean.mixins.render;

import com.mojang.blaze3d.opengl.GlStateManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.GofraState;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/render/GlStateManagerMixin.class */
@Mixin({GlStateManager.class})
public class GlStateManagerMixin {
    @Inject(method = {"_glBindFramebuffer"}, at = {@At("HEAD")}, cancellable = true)
    private static void _glBindFramebuffer(int target, int framebuffer, CallbackInfo ci) {
        if (GofraState.INSTANCE.getStopSwapBuffers()) {
            ci.cancel();
        }
    }
}
