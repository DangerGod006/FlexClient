package su.catlean.mixins.client;

import net.minecraft.class_2547;
import net.minecraft.class_2596;
import net.minecraft.class_310;
import net.minecraft.class_8042;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.network.AfterReceivePacket;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/client/MixinNetworkThreadUtils.class */
@Mixin(targets = {"net/minecraft/class_11980$class_11981"})
public class MixinNetworkThreadUtils<T extends class_2547> {

    @Shadow
    @Final
    private class_2596<T> comp_4822;

    @Inject(method = {"method_74450"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/class_2596;method_65081(Lnet/minecraft/class_2547;)V", shift = At.Shift.AFTER)})
    private void afterPacketApply(CallbackInfo ci) {
        if (class_310.method_1551().field_1724 == null) {
            return;
        }
        class_8042 class_8042Var = this.comp_4822;
        if (class_8042Var instanceof class_8042) {
            class_8042 packs = class_8042Var;
            packs.method_48324().forEach(p -> {
                new AfterReceivePacket(p).call();
            });
        } else {
            new AfterReceivePacket(this.comp_4822).call();
        }
    }
}
