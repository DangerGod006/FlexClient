package su.catlean.mixins.world;

import net.minecraft.class_1511;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.world.CrystalCreateEvent;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/world/EndCrystalMixin.class */
@Mixin({class_1511.class})
public class EndCrystalMixin {

    @Shadow
    public int field_7034;

    @Unique
    float startAge = -1.0f;

    @Inject(method = {"<init>(Lnet/minecraft/class_1299;Lnet/minecraft/class_1937;)V"}, at = {@At("TAIL")})
    private void tickHook(CallbackInfo ci) {
        if (CrystalCreateEvent.INSTANCE.call() && this.startAge == -1.0f) {
            this.startAge = this.field_7034;
            this.field_7034 = 0;
        }
    }
}
