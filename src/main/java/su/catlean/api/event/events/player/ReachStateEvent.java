package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: ReachStateEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/ReachStateEvent.class */
public final class ReachStateEvent extends Event {

    @NotNull
    public static final ReachStateEvent INSTANCE = new ReachStateEvent();
    private static float blockRange;
    private static float entityRange;

    private ReachStateEvent() {
    }

    public final float getBlockRange() {
        return blockRange;
    }

    public final void setBlockRange(float f) {
        blockRange = f;
    }

    public final float getEntityRange() {
        return entityRange;
    }

    public final void setEntityRange(float f) {
        entityRange = f;
    }
}
