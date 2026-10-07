package su.catlean.api.event.events.render;

import net.minecraft.class_276;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: FrameBufferEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/FrameBufferEvent.class */
public final class FrameBufferEvent extends Event {

    @NotNull
    public static final FrameBufferEvent INSTANCE = new FrameBufferEvent();

    @Nullable
    private static class_276 frameBuffer;

    private FrameBufferEvent() {
    }

    @Nullable
    public final class_276 getFrameBuffer() {
        return frameBuffer;
    }

    public final void setFrameBuffer(@Nullable class_276 class_276Var) {
        frameBuffer = class_276Var;
    }
}
