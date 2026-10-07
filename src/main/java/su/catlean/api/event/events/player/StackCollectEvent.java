package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: StackCollectEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/StackCollectEvent.class */
public final class StackCollectEvent extends Event {

    @NotNull
    public static final StackCollectEvent INSTANCE = new StackCollectEvent();

    @NotNull
    private static class_1799 itemStack;

    private StackCollectEvent() {
    }

    @NotNull
    public final class_1799 getItemStack() {
        return itemStack;
    }

    public final void setItemStack(@NotNull class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, "<set-?>");
        itemStack = class_1799Var;
    }

    static {
        class_1799 class_1799VarMethod_7854 = class_1802.field_8831.method_7854();
        Intrinsics.checkNotNullExpressionValue(class_1799VarMethod_7854, "getDefaultInstance(...)");
        itemStack = class_1799VarMethod_7854;
    }
}
