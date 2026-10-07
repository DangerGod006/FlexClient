package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: SprintEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/SprintEvent.class */
public final class SprintEvent extends Event {

    @NotNull
    public static final SprintEvent INSTANCE = new SprintEvent();
    private static boolean sprinting;

    private SprintEvent() {
    }

    public final boolean getSprinting() {
        return sprinting;
    }

    public final void setSprinting(boolean z) {
        sprinting = z;
    }
}
