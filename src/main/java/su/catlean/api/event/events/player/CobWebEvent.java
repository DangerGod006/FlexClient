package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: CobWebEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/CobWebEvent.class */
public final class CobWebEvent extends Event {

    @NotNull
    public static final CobWebEvent INSTANCE = new CobWebEvent();

    @NotNull
    private static class_2338 pos;

    private CobWebEvent() {
    }

    @NotNull
    public final class_2338 getPos() {
        return pos;
    }

    public final void setPos(@NotNull class_2338 class_2338Var) {
        Intrinsics.checkNotNullParameter(class_2338Var, "<set-?>");
        pos = class_2338Var;
    }

    static {
        class_2338 ZERO = class_2338.field_10980;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        pos = ZERO;
    }

    public final boolean call(@NotNull class_2338 pos2) {
        Intrinsics.checkNotNullParameter(pos2, "pos");
        setCancelled(false);
        pos = pos2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
