package su.catlean.api.event.events.client;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: CloseEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/client/CloseEvent.class */
public final class CloseEvent extends Event {

    @NotNull
    public static final CloseEvent INSTANCE = new CloseEvent();

    private CloseEvent() {
    }
}
