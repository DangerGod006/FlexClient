package su.catlean.api.event;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Gofra.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/GofraState.class */
public final class GofraState {

    @NotNull
    public static final GofraState INSTANCE = new GofraState();
    private static boolean modifyBuffer;
    private static boolean modifyCollisions;
    private static boolean shouldRender;
    private static boolean stopSwapBuffers;
    private static boolean xray;

    private GofraState() {
    }

    public final boolean getModifyBuffer() {
        return modifyBuffer;
    }

    public final void setModifyBuffer(boolean z) {
        modifyBuffer = z;
    }

    public final boolean getModifyCollisions() {
        return modifyCollisions;
    }

    public final void setModifyCollisions(boolean z) {
        modifyCollisions = z;
    }

    public final boolean getShouldRender() {
        return shouldRender;
    }

    public final void setShouldRender(boolean z) {
        shouldRender = z;
    }

    public final boolean getStopSwapBuffers() {
        return stopSwapBuffers;
    }

    public final void setStopSwapBuffers(boolean z) {
        stopSwapBuffers = z;
    }

    public final boolean getXray() {
        return xray;
    }

    public final void setXray(boolean z) {
        xray = z;
    }
}
