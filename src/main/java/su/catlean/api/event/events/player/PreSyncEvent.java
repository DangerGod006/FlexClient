package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SyncEvents.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/PreSyncEvent.class */
public final class PreSyncEvent extends SyncEvent {

    @NotNull
    public static final PreSyncEvent INSTANCE = new PreSyncEvent();

    private PreSyncEvent() {
    }
}
