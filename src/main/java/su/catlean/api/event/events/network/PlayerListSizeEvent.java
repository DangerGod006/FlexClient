package su.catlean.api.event.events.network;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: PlayerListSizeEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/network/PlayerListSizeEvent.class */
public final class PlayerListSizeEvent extends Event {

    @NotNull
    public static final PlayerListSizeEvent INSTANCE = new PlayerListSizeEvent();

    private PlayerListSizeEvent() {
    }
}
