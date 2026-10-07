package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_10017;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: RenderNameTagEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/RenderNameTagEvent.class */
public final class RenderNameTagEvent extends Event {

    @NotNull
    public static final RenderNameTagEvent INSTANCE = new RenderNameTagEvent();
    public static class_10017 state;

    private RenderNameTagEvent() {
    }

    @NotNull
    public final class_10017 getState() {
        class_10017 class_10017Var = state;
        if (class_10017Var != null) {
            return class_10017Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state");
        return null;
    }

    public final void setState(@NotNull class_10017 class_10017Var) {
        Intrinsics.checkNotNullParameter(class_10017Var, "<set-?>");
        state = class_10017Var;
    }

    public final boolean call(@NotNull class_10017 state2) {
        Intrinsics.checkNotNullParameter(state2, "state");
        setState(state2);
        setCancelled(false);
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
