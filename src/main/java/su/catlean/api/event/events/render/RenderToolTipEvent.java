package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: RenderToolTipEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/RenderToolTipEvent.class */
public final class RenderToolTipEvent extends Event {

    @NotNull
    public static final RenderToolTipEvent INSTANCE = new RenderToolTipEvent();

    @Nullable
    private static class_1799 stack;

    @Nullable
    private static class_332 context;
    private static int mouseX;
    private static int mouseY;

    private RenderToolTipEvent() {
    }

    @Nullable
    public final class_1799 getStack() {
        return stack;
    }

    public final void setStack(@Nullable class_1799 class_1799Var) {
        stack = class_1799Var;
    }

    @Nullable
    public final class_332 getContext() {
        return context;
    }

    public final void setContext(@Nullable class_332 class_332Var) {
        context = class_332Var;
    }

    public final int getMouseX() {
        return mouseX;
    }

    public final void setMouseX(int i) {
        mouseX = i;
    }

    public final int getMouseY() {
        return mouseY;
    }

    public final void setMouseY(int i) {
        mouseY = i;
    }

    public final void call(@NotNull class_1799 stack2, @NotNull class_332 context2, int mouseX2, int mouseY2) {
        Intrinsics.checkNotNullParameter(stack2, "stack");
        Intrinsics.checkNotNullParameter(context2, "context");
        stack = stack2;
        context = context2;
        mouseX = mouseX2;
        mouseY = mouseY2;
        call();
    }
}
