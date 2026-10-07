package su.catlean.api.event.events.client;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: InitEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/client/InitEvent.class */
public final class InitEvent extends Event {

    @NotNull
    public static final InitEvent INSTANCE = new InitEvent();

    private InitEvent() {
    }
}
