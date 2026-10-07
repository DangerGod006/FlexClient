package su.catlean.api.event.events.network;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: PlayerTickMoveEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/network/PlayerTickMoveEvent.class */
public final class PlayerTickMoveEvent extends Event {

    @NotNull
    public static final PlayerTickMoveEvent INSTANCE = new PlayerTickMoveEvent();

    private PlayerTickMoveEvent() {
    }
}
