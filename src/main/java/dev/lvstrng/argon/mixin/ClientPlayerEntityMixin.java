package dev.lvstrng.argon.mixin;

import com.mojang.authlib.GameProfile;
import dev.lvstrng.argon.event.EventManager;
import dev.lvstrng.argon.event.events.MovementPacketListener;
import dev.lvstrng.argon.event.events.PlayerTickListener;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/mixin/ClientPlayerEntityMixin.class */
@Mixin({class_746.class})
public class ClientPlayerEntityMixin extends class_742 {

    @Shadow
    @Final
    protected class_310 field_3937;

    public ClientPlayerEntityMixin(class_638 world, GameProfile profile) {
        super(world, profile);
    }

    @Inject(method = {"method_3136"}, at = {@At("HEAD")})
    private void onSendMovementPackets(CallbackInfo ci) {
        EventManager.fire(new MovementPacketListener.MovementPacketEvent());
    }

    @Inject(method = {"method_5773"}, at = {@At("HEAD")})
    private void onPlayerTick(CallbackInfo ci) {
        EventManager.fire(new PlayerTickListener.PlayerTickEvent());
    }
}
