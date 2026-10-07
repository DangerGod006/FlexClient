package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: EntityAlphaEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/EntityAlphaEvent.class */
public final class EntityAlphaEvent extends Event {

    @NotNull
    public static final EntityAlphaEvent INSTANCE = new EntityAlphaEvent();

    @NotNull
    private static class_243 pos;
    private static float alpha;

    private EntityAlphaEvent() {
    }

    @NotNull
    public final class_243 getPos() {
        return pos;
    }

    public final void setPos(@NotNull class_243 class_243Var) {
        Intrinsics.checkNotNullParameter(class_243Var, "<set-?>");
        pos = class_243Var;
    }

    static {
        class_243 ZERO = class_243.field_1353;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        pos = ZERO;
        alpha = 1.0f;
    }

    public final float getAlpha() {
        return alpha;
    }

    public final void setAlpha(float f) {
        alpha = f;
    }

    public final boolean call(@NotNull class_243 pos2) {
        Intrinsics.checkNotNullParameter(pos2, "pos");
        pos = pos2;
        alpha = 1.0f;
        setCancelled(false);
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
