package su.catlean.api.event.events.render;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: LookRenderEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/LookRenderEvent.class */
public final class LookRenderEvent extends Event {

    @NotNull
    public static final LookRenderEvent INSTANCE = new LookRenderEvent();
    private static float yaw;
    private static float pitch;
    private static float bodyYaw;

    private LookRenderEvent() {
    }

    public final float getYaw() {
        return yaw;
    }

    public final void setYaw(float f) {
        yaw = f;
    }

    public final float getPitch() {
        return pitch;
    }

    public final void setPitch(float f) {
        pitch = f;
    }

    public final float getBodyYaw() {
        return bodyYaw;
    }

    public final void setBodyYaw(float f) {
        bodyYaw = f;
    }

    public final boolean call(float yaw2, float pitch2, float bodyYaw2) {
        setCancelled(false);
        yaw = yaw2;
        pitch = pitch2;
        bodyYaw = bodyYaw2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
