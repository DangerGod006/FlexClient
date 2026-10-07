package su.catlean.api.event.events.world;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: BlockStateEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/world/BlockStateEvent.class */
public final class BlockStateEvent extends Event {

    @NotNull
    public static final BlockStateEvent INSTANCE = new BlockStateEvent();
    private static class_2338 pos;

    @Nullable
    private static class_2680 prevState;

    @Nullable
    private static class_2680 state;

    private BlockStateEvent() {
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

    @Nullable
    public final class_2680 getPrevState() {
        return prevState;
    }

    public final void setPrevState(@Nullable class_2680 class_2680Var) {
        prevState = class_2680Var;
    }

    @Nullable
    public final class_2680 getState() {
        return state;
    }

    public final boolean call(@NotNull class_2338 pos2, @Nullable class_2680 prevState2, @Nullable class_2680 state2) {
        Intrinsics.checkNotNullParameter(pos2, "pos");
        setCancelled(false);
        pos = pos2;
        state = state2;
        prevState = prevState2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
