package su.catlean.api.event.events.world;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3610;
import net.minecraft.class_3611;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: WaterPushEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/world/WaterPushEvent.class */
public final class WaterPushEvent extends Event {

    @NotNull
    public static final WaterPushEvent INSTANCE = new WaterPushEvent();
    private static class_2338 pos;
    private static class_3610 state;
    private static class_3611 fluid;
    public static class_243 vec;

    private WaterPushEvent() {
    }

    @NotNull
    public final class_2338 getPos() {
        class_2338 class_2338Var = pos;
        if (class_2338Var != null) {
            return class_2338Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pos");
        return null;
    }

    @NotNull
    public final class_3610 getState() {
        class_3610 class_3610Var = state;
        if (class_3610Var != null) {
            return class_3610Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state");
        return null;
    }

    @NotNull
    public final class_3611 getFluid() {
        class_3611 class_3611Var = fluid;
        if (class_3611Var != null) {
            return class_3611Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fluid");
        return null;
    }

    @NotNull
    public final class_243 getVec() {
        class_243 class_243Var = vec;
        if (class_243Var != null) {
            return class_243Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vec");
        return null;
    }

    public final void setVec(@NotNull class_243 class_243Var) {
        Intrinsics.checkNotNullParameter(class_243Var, "<set-?>");
        vec = class_243Var;
    }

    public final boolean call(@NotNull class_2338 pos2, @NotNull class_3611 fluid2, @NotNull class_3610 state2, @NotNull class_243 vec2) {
        Intrinsics.checkNotNullParameter(pos2, "pos");
        Intrinsics.checkNotNullParameter(fluid2, "fluid");
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(vec2, "vec");
        setCancelled(false);
        pos = pos2;
        setVec(vec2);
        fluid = fluid2;
        state = state2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
