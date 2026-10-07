package su.catlean.api.event.events.render;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: CameraOffsetEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/CameraOffsetEvent.class */
public final class CameraOffsetEvent extends Event {

    @NotNull
    public static final CameraOffsetEvent INSTANCE = new CameraOffsetEvent();
    private static float offset;

    private CameraOffsetEvent() {
    }

    public final float getOffset() {
        return offset;
    }

    public final void setOffset(float f) {
        offset = f;
    }
}
