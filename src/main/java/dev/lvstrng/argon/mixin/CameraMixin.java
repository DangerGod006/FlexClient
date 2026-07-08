package dev.lvstrng.argon.mixin;

import dev.lvstrng.argon.event.EventManager;
import dev.lvstrng.argon.event.events.CameraUpdateListener;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/mixin/CameraMixin.class */
@Mixin({class_4184.class})
public class CameraMixin {
    @ModifyArgs(method = {"method_19321"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/class_4184;method_19327(DDD)V"))
    private void update(Args args) {
        CameraUpdateListener.CameraUpdateEvent event = new CameraUpdateListener.CameraUpdateEvent(((Double) args.get(0)).doubleValue(), ((Double) args.get(1)).doubleValue(), ((Double) args.get(2)).doubleValue());
        EventManager.fire(event);
        args.set(0, Double.valueOf(event.getX()));
        args.set(1, Double.valueOf(event.getY()));
        args.set(2, Double.valueOf(event.getZ()));
    }
}
