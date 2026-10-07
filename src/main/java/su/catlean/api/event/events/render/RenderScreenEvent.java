package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: Render2DEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/RenderScreenEvent.class */
public final class RenderScreenEvent extends Event {

    @NotNull
    public static final RenderScreenEvent INSTANCE = new RenderScreenEvent();
    private static class_332 context;

    private RenderScreenEvent() {
    }

    @NotNull
    public final class_332 getContext() {
        class_332 class_332Var = context;
        if (class_332Var != null) {
            return class_332Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    public final boolean call(@NotNull class_332 context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        setCancelled(false);
        context = context2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
