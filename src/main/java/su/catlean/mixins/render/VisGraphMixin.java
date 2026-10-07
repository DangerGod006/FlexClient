package su.catlean.mixins.render;

import net.minecraft.class_2338;
import net.minecraft.class_852;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.GofraState;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/render/VisGraphMixin.class */
@Mixin({class_852.class})
public class VisGraphMixin {
    @Inject(method = {"method_3682"}, at = {@At("HEAD")}, cancellable = true)
    private void markClosedHook(class_2338 pos, CallbackInfo ci) {
        if (GofraState.INSTANCE.getXray()) {
            ci.cancel();
        }
    }
}
