package su.catlean.mixins.client;

import net.minecraft.class_3830;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.world.SweetBerryBushCollisionEvent;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/client/SweetBerryBushBlockMixin.class */
@Mixin({class_3830.class})
public class SweetBerryBushBlockMixin {
    @Inject(method = {"method_9548"}, at = {@At("HEAD")}, cancellable = true)
    public void onEntityCollisionHook(CallbackInfo ci) {
        if (SweetBerryBushCollisionEvent.INSTANCE.call()) {
            ci.cancel();
        }
    }
}
