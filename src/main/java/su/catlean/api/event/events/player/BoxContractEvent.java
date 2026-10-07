package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_238;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: BoxContractEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/BoxContractEvent.class */
public final class BoxContractEvent extends Event {

    @NotNull
    public static final BoxContractEvent INSTANCE = new BoxContractEvent();
    public static class_238 value;

    private BoxContractEvent() {
    }

    @NotNull
    public final class_238 getValue() {
        class_238 class_238Var = value;
        if (class_238Var != null) {
            return class_238Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("value");
        return null;
    }

    public final void setValue(@NotNull class_238 class_238Var) {
        Intrinsics.checkNotNullParameter(class_238Var, "<set-?>");
        value = class_238Var;
    }
}
