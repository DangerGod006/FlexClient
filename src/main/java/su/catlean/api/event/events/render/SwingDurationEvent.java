package su.catlean.api.event.events.render;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: SwingDurationEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/SwingDurationEvent.class */
public final class SwingDurationEvent extends Event {

    @NotNull
    public static final SwingDurationEvent INSTANCE = new SwingDurationEvent();
    private static int value = 12;

    private SwingDurationEvent() {
    }

    public final int getValue() {
        return value;
    }

    public final void setValue(int i) {
        value = i;
    }
}
