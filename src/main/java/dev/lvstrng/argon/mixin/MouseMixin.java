package dev.lvstrng.argon.mixin;

import dev.lvstrng.argon.event.EventManager;
import dev.lvstrng.argon.event.events.ButtonListener;
import dev.lvstrng.argon.event.events.MouseMoveListener;
import dev.lvstrng.argon.event.events.MouseUpdateListener;
import net.minecraft.class_310;
import net.minecraft.class_312;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/mixin/MouseMixin.class */
@Mixin({class_312.class})
public abstract class MouseMixin {

    @Shadow
    @Final
    private class_310 field_1779;

    @Unique
    private double argon$lastMouseX;

    @Unique
    private double argon$lastMouseY;

    @Unique
    private boolean argon$initialized;

    @Unique
    private final int[] argon$buttonStates = new int[8];

    @Shadow
    public abstract double method_1603();

    @Shadow
    public abstract double method_1604();

    @Inject(method = {"method_55793"}, at = {@At("TAIL")})
    private void onMouseUpdate(CallbackInfo ci) {
        EventManager.fire(new MouseUpdateListener.MouseUpdateEvent());
        long window = this.field_1779.method_22683().method_4490();
        double x = method_1603();
        double y = method_1604();
        if (!this.argon$initialized) {
            this.argon$initialized = true;
            this.argon$lastMouseX = x;
            this.argon$lastMouseY = y;
            for (int button = 0; button < this.argon$buttonStates.length; button++) {
                this.argon$buttonStates[button] = GLFW.glfwGetMouseButton(window, button);
            }
            return;
        }
        if (x != this.argon$lastMouseX || y != this.argon$lastMouseY) {
            this.argon$lastMouseX = x;
            this.argon$lastMouseY = y;
            EventManager.fire(new MouseMoveListener.MouseMoveEvent(window, x, y));
        }
        for (int button2 = 0; button2 < this.argon$buttonStates.length; button2++) {
            int state = GLFW.glfwGetMouseButton(window, button2);
            if (state != this.argon$buttonStates[button2]) {
                this.argon$buttonStates[button2] = state;
                EventManager.fire(new ButtonListener.ButtonEvent(button2, window, state));
            }
        }
    }
}
