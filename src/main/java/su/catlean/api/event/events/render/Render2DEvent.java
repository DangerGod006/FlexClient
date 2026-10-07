package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: Render2DEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/Render2DEvent.class */
public final class Render2DEvent extends Event {

    @NotNull
    public static final Render2DEvent INSTANCE = new Render2DEvent();
    private static class_332 context;

    private Render2DEvent() {
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
