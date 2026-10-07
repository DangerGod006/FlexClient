package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1268;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: InteractBlockEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/InteractBlockEvent.class */
public final class InteractBlockEvent extends Event {

    @NotNull
    public static final InteractBlockEvent INSTANCE = new InteractBlockEvent();
    public static class_1268 hand;
    public static class_3965 hitResult;

    private InteractBlockEvent() {
    }

    @NotNull
    public final class_1268 getHand() {
        class_1268 class_1268Var = hand;
        if (class_1268Var != null) {
            return class_1268Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hand");
        return null;
    }

    public final void setHand(@NotNull class_1268 class_1268Var) {
        Intrinsics.checkNotNullParameter(class_1268Var, "<set-?>");
        hand = class_1268Var;
    }

    @NotNull
    public final class_3965 getHitResult() {
        class_3965 class_3965Var = hitResult;
        if (class_3965Var != null) {
            return class_3965Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hitResult");
        return null;
    }

    public final void setHitResult(@NotNull class_3965 class_3965Var) {
        Intrinsics.checkNotNullParameter(class_3965Var, "<set-?>");
        hitResult = class_3965Var;
    }

    public final boolean call(@NotNull class_1268 hand2, @NotNull class_3965 hitResult2) {
        Intrinsics.checkNotNullParameter(hand2, "hand");
        Intrinsics.checkNotNullParameter(hitResult2, "hitResult");
        setHand(hand2);
        setHitResult(hitResult2);
        setCancelled(false);
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
