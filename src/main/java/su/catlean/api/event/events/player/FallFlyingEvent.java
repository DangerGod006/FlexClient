package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: FallFlyingEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/FallFlyingEvent.class */
public final class FallFlyingEvent extends Event {

    @NotNull
    public static final FallFlyingEvent INSTANCE = new FallFlyingEvent();
    private static boolean value;

    private FallFlyingEvent() {
    }

    public final boolean getValue() {
        return value;
    }

    public final void setValue(boolean z) {
        value = z;
    }

    public final boolean call(boolean value2) {
        setCancelled(false);
        value = value2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
