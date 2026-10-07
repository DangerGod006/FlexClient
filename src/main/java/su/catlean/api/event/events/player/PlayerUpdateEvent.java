package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: PlayerUpdateEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/PlayerUpdateEvent.class */
public final class PlayerUpdateEvent extends Event {

    @NotNull
    public static final PlayerUpdateEvent INSTANCE = new PlayerUpdateEvent();

    private PlayerUpdateEvent() {
    }
}
