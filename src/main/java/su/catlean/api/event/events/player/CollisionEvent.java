package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: CollisionEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/CollisionEvent.class */
public final class CollisionEvent extends Event {

    @NotNull
    private class_2680 state;

    @NotNull
    private class_2338 pos;

    public CollisionEvent() {
        class_2680 class_2680VarMethod_9564 = class_2246.field_10124.method_9564();
        Intrinsics.checkNotNullExpressionValue(class_2680VarMethod_9564, "defaultBlockState(...)");
        this.state = class_2680VarMethod_9564;
        class_2338 ZERO = class_2338.field_10980;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.pos = ZERO;
    }

    @NotNull
    public final class_2680 getState() {
        return this.state;
    }

    public final void setState(@NotNull class_2680 class_2680Var) {
        Intrinsics.checkNotNullParameter(class_2680Var, "<set-?>");
        this.state = class_2680Var;
    }

    @NotNull
    public final class_2338 getPos() {
        return this.pos;
    }

    public final void setPos(@NotNull class_2338 class_2338Var) {
        Intrinsics.checkNotNullParameter(class_2338Var, "<set-?>");
        this.pos = class_2338Var;
    }

    public final boolean call(@NotNull class_2680 state, @NotNull class_2338 pos) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pos, "pos");
        setCancelled(false);
        this.pos = pos;
        this.state = state;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
