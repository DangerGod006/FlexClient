package su.catlean.api.event.events.world;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: FireWorkVectorEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/world/FireWorkVectorEvent.class */
public final class FireWorkVectorEvent extends Event {

    @NotNull
    public static final FireWorkVectorEvent INSTANCE = new FireWorkVectorEvent();
    public static class_243 vector;

    private FireWorkVectorEvent() {
    }

    @NotNull
    public final class_243 getVector() {
        class_243 class_243Var = vector;
        if (class_243Var != null) {
            return class_243Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vector");
        return null;
    }

    public final void setVector(@NotNull class_243 class_243Var) {
        Intrinsics.checkNotNullParameter(class_243Var, "<set-?>");
        vector = class_243Var;
    }

    public final boolean call(@NotNull class_243 vec) {
        Intrinsics.checkNotNullParameter(vec, "vec");
        setVector(vec);
        setCancelled(false);
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
