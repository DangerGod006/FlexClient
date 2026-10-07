package su.catlean.api.event.events.render;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: ScreenMouseCoordsEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/ScreenMouseCoordsEvent.class */
public final class ScreenMouseCoordsEvent extends Event {

    @NotNull
    public static final ScreenMouseCoordsEvent INSTANCE = new ScreenMouseCoordsEvent();
    private static int x;
    private static int y;

    private ScreenMouseCoordsEvent() {
    }

    public final int getX() {
        return x;
    }

    public final void setX(int i) {
        x = i;
    }

    public final int getY() {
        return y;
    }

    public final void setY(int i) {
        y = i;
    }

    public final boolean call(int x2, int y2) {
        setCancelled(false);
        Gofra.INSTANCE.drain(this);
        x = x2;
        y = y2;
        return getCancelled();
    }
}
