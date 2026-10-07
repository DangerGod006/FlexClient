package su.catlean.api.event.events.network;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: SlowDownEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/network/SlowDownEvent.class */
public final class SlowDownEvent extends Event {

    @NotNull
    public static final SlowDownEvent INSTANCE = new SlowDownEvent();

    private SlowDownEvent() {
    }
}
