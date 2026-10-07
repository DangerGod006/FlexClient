package su.catlean.api.event.events.client;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: TickEvents.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/client/TickEvent.class */
public final class TickEvent extends Event {

    @NotNull
    public static final TickEvent INSTANCE = new TickEvent();

    private TickEvent() {
    }
}
