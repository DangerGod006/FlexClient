package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: MoveEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/MoveEvent.class */
public final class MoveEvent extends Event {

    @NotNull
    public static final MoveEvent INSTANCE = new MoveEvent();
    private static double x;
    private static double y;
    private static double z;

    private MoveEvent() {
    }

    public final double getX() {
        return x;
    }

    public final void setX(double d) {
        x = d;
    }

    public final double getY() {
        return y;
    }

    public final void setY(double d) {
        y = d;
    }

    public final double getZ() {
        return z;
    }

    public final void setZ(double d) {
        z = d;
    }

    public final boolean call(double x2, double y2, double z2) {
        setCancelled(false);
        x = x2;
        y = y2;
        z = z2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
