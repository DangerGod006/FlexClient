package dev.lvstrng.argon.mixin;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.event.EventManager;
import dev.lvstrng.argon.event.events.GameRenderListener;
import dev.lvstrng.argon.module.modules.misc.Freecam;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/mixin/GameRendererMixin.class */
@Mixin({class_757.class})
public abstract class GameRendererMixin {
    @Inject(method = {"method_3188"}, at = {@At(value = "INVOKE_STRING", target = "Lnet/minecraft/class_3695;method_15405(Ljava/lang/String;)V", args = {"ldc=hand"})})
    private void onWorldRender(class_9779 tickCounter, CallbackInfo ci) {
        class_4587 matrixStack = new class_4587();
        EventManager.fire(new GameRenderListener.GameRenderEvent(matrixStack, tickCounter.method_60637(true)));
    }

    @Inject(method = {"method_3202"}, at = {@At("HEAD")}, cancellable = true)
    private void onShouldRenderBlockOutline(CallbackInfoReturnable<Boolean> cir) {
        if (((Freecam) Argon.INSTANCE.getModuleManager().getModule(Freecam.class)).isEnabled()) {
            cir.setReturnValue(false);
        }
    }
}
