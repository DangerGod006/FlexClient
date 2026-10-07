package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: EntityPushEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/EntityPushEvent.class */
public final class EntityPushEvent extends Event {

    @NotNull
    public static final EntityPushEvent INSTANCE = new EntityPushEvent();

    private EntityPushEvent() {
    }
}
