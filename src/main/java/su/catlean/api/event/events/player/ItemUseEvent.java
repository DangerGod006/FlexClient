package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: ItemUseEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/ItemUseEvent.class */
public final class ItemUseEvent extends Event {

    @NotNull
    public static final ItemUseEvent INSTANCE = new ItemUseEvent();

    private ItemUseEvent() {
    }
}
