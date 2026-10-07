package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1735;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: SlotRenderEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/SlotRenderEvent.class */
public final class SlotRenderEvent extends Event {

    @NotNull
    public static final SlotRenderEvent INSTANCE = new SlotRenderEvent();
    public static class_332 context;
    public static class_1735 slot;

    private SlotRenderEvent() {
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

    public final void setContext(@NotNull class_332 class_332Var) {
        Intrinsics.checkNotNullParameter(class_332Var, "<set-?>");
        context = class_332Var;
    }

    @NotNull
    public final class_1735 getSlot() {
        class_1735 class_1735Var = slot;
        if (class_1735Var != null) {
            return class_1735Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slot");
        return null;
    }

    public final void setSlot(@NotNull class_1735 class_1735Var) {
        Intrinsics.checkNotNullParameter(class_1735Var, "<set-?>");
        slot = class_1735Var;
    }
}
