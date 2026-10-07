package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: StopUsingItemEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/StopUsingItemEvent.class */
public final class StopUsingItemEvent extends Event {

    @NotNull
    public static final StopUsingItemEvent INSTANCE = new StopUsingItemEvent();

    private StopUsingItemEvent() {
    }
}
