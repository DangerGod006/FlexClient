package su.catlean.mixins.client;

import net.minecraft.class_1144;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.client.CloseSoundManagerEvent;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/client/SoundManagerMixin.class */
@Mixin({class_1144.class})
public class SoundManagerMixin {
    @Inject(method = {"method_4882"}, at = {@At("HEAD")})
    public void close(CallbackInfo ci) {
        CloseSoundManagerEvent.INSTANCE.call();
    }
}
