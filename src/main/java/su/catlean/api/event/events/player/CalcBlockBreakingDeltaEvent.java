package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: CalcBlockBreakingDeltaEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/CalcBlockBreakingDeltaEvent.class */
public final class CalcBlockBreakingDeltaEvent extends Event {

    @NotNull
    public static final CalcBlockBreakingDeltaEvent INSTANCE = new CalcBlockBreakingDeltaEvent();
    public static class_2338 blockPos;
    public static class_2680 state;
    private static float delta;

    private CalcBlockBreakingDeltaEvent() {
    }

    @NotNull
    public final class_2338 getBlockPos() {
        class_2338 class_2338Var = blockPos;
        if (class_2338Var != null) {
            return class_2338Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("blockPos");
        return null;
    }

    public final void setBlockPos(@NotNull class_2338 class_2338Var) {
        Intrinsics.checkNotNullParameter(class_2338Var, "<set-?>");
        blockPos = class_2338Var;
    }

    @NotNull
    public final class_2680 getState() {
        class_2680 class_2680Var = state;
        if (class_2680Var != null) {
            return class_2680Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state");
        return null;
    }

    public final void setState(@NotNull class_2680 class_2680Var) {
        Intrinsics.checkNotNullParameter(class_2680Var, "<set-?>");
        state = class_2680Var;
    }

    public final float getDelta() {
        return delta;
    }

    public final void setDelta(float f) {
        delta = f;
    }

    public final boolean call(@NotNull class_2338 pos, @NotNull class_2680 state2) {
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(state2, "state");
        setCancelled(false);
        setBlockPos(pos);
        INSTANCE.setState(state2);
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
