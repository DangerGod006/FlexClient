package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: HandModifyEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/HandModifyEvent.class */
public final class HandModifyEvent extends Event {

    @NotNull
    public static final HandModifyEvent INSTANCE = new HandModifyEvent();

    @NotNull
    private static class_1268 hand = class_1268.field_5808;

    @NotNull
    private static class_4587 stack = new class_4587();

    @NotNull
    private static class_1799 item;
    private static boolean eating;

    private HandModifyEvent() {
    }

    @NotNull
    public final class_1268 getHand() {
        return hand;
    }

    public final void setHand(@NotNull class_1268 class_1268Var) {
        Intrinsics.checkNotNullParameter(class_1268Var, "<set-?>");
        hand = class_1268Var;
    }

    static {
        class_1799 class_1799VarMethod_7854 = class_1802.field_8162.method_7854();
        Intrinsics.checkNotNullExpressionValue(class_1799VarMethod_7854, "getDefaultInstance(...)");
        item = class_1799VarMethod_7854;
    }

    @NotNull
    public final class_4587 getStack() {
        return stack;
    }

    public final void setStack(@NotNull class_4587 class_4587Var) {
        Intrinsics.checkNotNullParameter(class_4587Var, "<set-?>");
        stack = class_4587Var;
    }

    @NotNull
    public final class_1799 getItem() {
        return item;
    }

    public final void setItem(@NotNull class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, "<set-?>");
        item = class_1799Var;
    }

    public final boolean getEating() {
        return eating;
    }

    public final void setEating(boolean z) {
        eating = z;
    }

    public final boolean call(@NotNull class_1268 hand2, @NotNull class_4587 stack2, @NotNull class_1799 item2, boolean eating2) {
        Intrinsics.checkNotNullParameter(hand2, "hand");
        Intrinsics.checkNotNullParameter(stack2, "stack");
        Intrinsics.checkNotNullParameter(item2, "item");
        setCancelled(false);
        stack = stack2;
        hand = hand2;
        item = item2;
        eating = eating2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
