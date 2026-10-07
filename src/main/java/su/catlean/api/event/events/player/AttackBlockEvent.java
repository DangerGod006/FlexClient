package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: AttackBlockEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/AttackBlockEvent.class */
public final class AttackBlockEvent extends Event {

    @NotNull
    public static final AttackBlockEvent INSTANCE = new AttackBlockEvent();

    @NotNull
    private static class_2350 direction = class_2350.field_11036;

    @NotNull
    private static class_2338 pos;

    private AttackBlockEvent() {
    }

    @NotNull
    public final class_2350 getDirection() {
        return direction;
    }

    public final void setDirection(@NotNull class_2350 class_2350Var) {
        Intrinsics.checkNotNullParameter(class_2350Var, "<set-?>");
        direction = class_2350Var;
    }

    static {
        class_2338 ZERO = class_2338.field_10980;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        pos = ZERO;
    }

    @NotNull
    public final class_2338 getPos() {
        return pos;
    }

    public final void setPos(@NotNull class_2338 class_2338Var) {
        Intrinsics.checkNotNullParameter(class_2338Var, "<set-?>");
        pos = class_2338Var;
    }

    public final boolean call(@NotNull class_2350 direction2, @NotNull class_2338 pos2) {
        Intrinsics.checkNotNullParameter(direction2, "direction");
        Intrinsics.checkNotNullParameter(pos2, "pos");
        setCancelled(false);
        pos = pos2;
        direction = direction2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
