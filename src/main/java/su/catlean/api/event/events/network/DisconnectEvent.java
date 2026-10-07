package su.catlean.api.event.events.network;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: DisconnectEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/network/DisconnectEvent.class */
public final class DisconnectEvent extends Event {

    @NotNull
    public static final DisconnectEvent INSTANCE = new DisconnectEvent();

    private DisconnectEvent() {
    }
}
