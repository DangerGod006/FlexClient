package su.catlean.api.event.events.client;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: TickFactorEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/client/TickFactorEvent.class */
public final class TickFactorEvent extends Event {

    @NotNull
    public static final TickFactorEvent INSTANCE = new TickFactorEvent();
    private static float factor = 1.0f;

    private TickFactorEvent() {
    }

    public final float getFactor() {
        return factor;
    }

    public final void setFactor(float f) {
        factor = f;
    }

    @Override // su.catlean.api.event.Event
    public boolean call() {
        factor = 1.0f;
        return super.call();
    }
}
