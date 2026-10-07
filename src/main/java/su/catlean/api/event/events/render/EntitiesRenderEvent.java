package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: EntitiesRenderEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/EntitiesRenderEvent.class */
public final class EntitiesRenderEvent extends Event {

    @NotNull
    public static final EntitiesRenderEvent INSTANCE = new EntitiesRenderEvent();
    private static class_4587 stack;

    private EntitiesRenderEvent() {
    }

    @NotNull
    public final class_4587 getStack() {
        class_4587 class_4587Var = stack;
        if (class_4587Var != null) {
            return class_4587Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stack");
        return null;
    }

    public final boolean call(@NotNull class_4587 stack2) {
        Intrinsics.checkNotNullParameter(stack2, "stack");
        setCancelled(false);
        stack = stack2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
