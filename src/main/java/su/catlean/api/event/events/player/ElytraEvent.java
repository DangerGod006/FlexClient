package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: ElytraEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/ElytraEvent.class */
public class ElytraEvent extends Event {

    @NotNull
    private class_243 vec;

    public ElytraEvent() {
        class_243 ZERO = class_243.field_1353;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.vec = ZERO;
    }

    @NotNull
    public final class_243 getVec() {
        return this.vec;
    }

    public final void setVec(@NotNull class_243 class_243Var) {
        Intrinsics.checkNotNullParameter(class_243Var, "<set-?>");
        this.vec = class_243Var;
    }
}
