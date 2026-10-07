package su.catlean.api.event.events.render;

import java.util.Optional;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import net.minecraft.class_4011;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: SplashOverlayEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/SplashOverlayEvent.class */
public final class SplashOverlayEvent extends Event {
    private static boolean reloading;
    private static float progress;

    @Nullable
    private static class_4011 reload;

    @Nullable
    private static Consumer<Optional<Throwable>> exceptionHandler;

    @Nullable
    private static class_332 context;

    @NotNull
    public static final SplashOverlayEvent INSTANCE = new SplashOverlayEvent();
    private static long reloadCompleteTime = -1;
    private static long reloadStartTime = -1;

    private SplashOverlayEvent() {
    }

    public final boolean getReloading() {
        return reloading;
    }

    public final void setReloading(boolean z) {
        reloading = z;
    }

    public final float getProgress() {
        return progress;
    }

    public final void setProgress(float f) {
        progress = f;
    }

    public final long getReloadCompleteTime() {
        return reloadCompleteTime;
    }

    public final void setReloadCompleteTime(long j) {
        reloadCompleteTime = j;
    }

    public final long getReloadStartTime() {
        return reloadStartTime;
    }

    public final void setReloadStartTime(long j) {
        reloadStartTime = j;
    }

    @Nullable
    public final class_4011 getReload() {
        return reload;
    }

    public final void setReload(@Nullable class_4011 class_4011Var) {
        reload = class_4011Var;
    }

    @Nullable
    public final Consumer<Optional<Throwable>> getExceptionHandler() {
        return exceptionHandler;
    }

    public final void setExceptionHandler(@Nullable Consumer<Optional<Throwable>> consumer) {
        exceptionHandler = consumer;
    }

    @Nullable
    public final class_332 getContext() {
        return context;
    }

    public final void setContext(@Nullable class_332 class_332Var) {
        context = class_332Var;
    }

    public final boolean call(@NotNull class_332 context2, boolean reloading2, float progress2, long reloadCompleteTime2, long reloadStartTime2, @Nullable class_4011 reload2, @Nullable Consumer<Optional<Throwable>> exceptionHandler2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        context = context2;
        reloading = reloading2;
        progress = progress2;
        reloadCompleteTime = reloadCompleteTime2;
        reloadStartTime = reloadStartTime2;
        reload = reload2;
        exceptionHandler = exceptionHandler2;
        setCancelled(false);
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
