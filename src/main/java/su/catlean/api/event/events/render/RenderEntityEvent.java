package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: RenderEntityEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/RenderEntityEvent.class */
public final class RenderEntityEvent extends Event {

    @NotNull
    public static final RenderEntityEvent INSTANCE = new RenderEntityEvent();

    @Nullable
    private static class_1297 state;

    private RenderEntityEvent() {
    }

    @Nullable
    public final class_1297 getState() {
        return state;
    }

    public final void setState(@Nullable class_1297 class_1297Var) {
        state = class_1297Var;
    }

    public final boolean call(@NotNull class_1297 state2) {
        Intrinsics.checkNotNullParameter(state2, "state");
        state = state2;
        setCancelled(false);
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
