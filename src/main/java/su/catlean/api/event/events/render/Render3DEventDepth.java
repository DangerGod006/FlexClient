package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: Render3DEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/Render3DEventDepth.class */
public final class Render3DEventDepth extends Event {

    @NotNull
    public static final Render3DEventDepth INSTANCE = new Render3DEventDepth();
    private static class_4587 stack;
    private static Matrix4f projection;

    private Render3DEventDepth() {
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

    @NotNull
    public final Matrix4f getProjection() {
        Matrix4f matrix4f = projection;
        if (matrix4f != null) {
            return matrix4f;
        }
        Intrinsics.throwUninitializedPropertyAccessException("projection");
        return null;
    }

    public final boolean call(@NotNull class_4587 stack2, @NotNull Matrix4f projection2) {
        Intrinsics.checkNotNullParameter(stack2, "stack");
        Intrinsics.checkNotNullParameter(projection2, "projection");
        setCancelled(false);
        stack = stack2;
        projection = projection2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
