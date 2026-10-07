package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: InsertStackEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/InsertStackEvent.class */
public final class InsertStackEvent extends Event {

    @NotNull
    public static final InsertStackEvent INSTANCE = new InsertStackEvent();

    @NotNull
    private static class_1799 stack;

    private InsertStackEvent() {
    }

    @NotNull
    public final class_1799 getStack() {
        return stack;
    }

    public final void setStack(@NotNull class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, "<set-?>");
        stack = class_1799Var;
    }

    static {
        class_1799 EMPTY = class_1799.field_8037;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        stack = EMPTY;
    }
}
