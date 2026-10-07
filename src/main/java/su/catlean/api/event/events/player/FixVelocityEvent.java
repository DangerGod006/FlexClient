package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: FixVelocityEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/FixVelocityEvent.class */
public final class FixVelocityEvent extends Event {
    private static float speed;
    private static float yaw;

    @NotNull
    public static final FixVelocityEvent INSTANCE = new FixVelocityEvent();

    @NotNull
    private static class_243 movementInput = new class_243(0.0d, 0.0d, 0.0d);

    @NotNull
    private static class_243 velocity = new class_243(0.0d, 0.0d, 0.0d);

    private FixVelocityEvent() {
    }

    @NotNull
    public final class_243 getMovementInput() {
        return movementInput;
    }

    public final void setMovementInput(@NotNull class_243 class_243Var) {
        Intrinsics.checkNotNullParameter(class_243Var, "<set-?>");
        movementInput = class_243Var;
    }

    public final float getSpeed() {
        return speed;
    }

    public final void setSpeed(float f) {
        speed = f;
    }

    public final float getYaw() {
        return yaw;
    }

    public final void setYaw(float f) {
        yaw = f;
    }

    @NotNull
    public final class_243 getVelocity() {
        return velocity;
    }

    public final void setVelocity(@NotNull class_243 class_243Var) {
        Intrinsics.checkNotNullParameter(class_243Var, "<set-?>");
        velocity = class_243Var;
    }

    public final boolean call(@NotNull class_243 movementInput2, float speed2, float yaw2) {
        Intrinsics.checkNotNullParameter(movementInput2, "movementInput");
        setCancelled(false);
        movementInput = movementInput2;
        speed = speed2;
        yaw = yaw2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
