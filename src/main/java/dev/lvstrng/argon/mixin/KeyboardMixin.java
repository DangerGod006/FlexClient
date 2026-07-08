package dev.lvstrng.argon.mixin;

import dev.lvstrng.argon.event.EventManager;
import dev.lvstrng.argon.event.events.ButtonListener;
import net.minecraft.class_11908;
import net.minecraft.class_309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/mixin/KeyboardMixin.class */
@Mixin({class_309.class})
public class KeyboardMixin {
    @Inject(method = {"method_1466"}, at = {@At("HEAD")})
    private void onKey(long window, int action, class_11908 input, CallbackInfo ci) {
        EventManager.fire(new ButtonListener.ButtonEvent(input.comp_4795(), window, action));
    }
}
