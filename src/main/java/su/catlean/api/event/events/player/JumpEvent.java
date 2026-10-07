package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: JumpEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/JumpEvent.class */
public final class JumpEvent extends Event {

    @NotNull
    public static final JumpEvent INSTANCE = new JumpEvent();
    private static float yaw;
    private static float y;
    private static float xz;

    private JumpEvent() {
    }

    public final float getYaw() {
        return yaw;
    }

    public final void setYaw(float f) {
        yaw = f;
    }

    public final float getY() {
        return y;
    }

    public final void setY(float f) {
        y = f;
    }

    public final float getXz() {
        return xz;
    }

    public final void setXz(float f) {
        xz = f;
    }

    public final boolean call(float yaw2, float y2, float xz2) {
        setCancelled(false);
        yaw = yaw2;
        y = y2;
        xz = xz2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
