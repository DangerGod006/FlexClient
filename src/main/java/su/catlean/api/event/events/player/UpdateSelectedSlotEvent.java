package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: UpdateSelectedSlotEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/UpdateSelectedSlotEvent.class */
public final class UpdateSelectedSlotEvent extends Event {

    @NotNull
    public static final UpdateSelectedSlotEvent INSTANCE = new UpdateSelectedSlotEvent();
    private static int slot;

    private UpdateSelectedSlotEvent() {
    }

    public final int getSlot() {
        return slot;
    }

    public final void setSlot(int i) {
        slot = i;
    }
}
