package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: PushOutOfBlocksEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/PushOutOfBlocksEvent.class */
public final class PushOutOfBlocksEvent extends Event {

    @NotNull
    public static final PushOutOfBlocksEvent INSTANCE = new PushOutOfBlocksEvent();

    private PushOutOfBlocksEvent() {
    }
}
