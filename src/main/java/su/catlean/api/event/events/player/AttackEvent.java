package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: AttackEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/AttackEvent.class */
public final class AttackEvent extends Event {

    @NotNull
    public static final AttackEvent INSTANCE = new AttackEvent();

    private AttackEvent() {
    }
}
