package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1268;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: InteractItemEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/PreInteractItemEvent.class */
public final class PreInteractItemEvent extends Event {

    @NotNull
    public static final PreInteractItemEvent INSTANCE = new PreInteractItemEvent();

    @NotNull
    private static class_1268 hand = class_1268.field_5808;

    private PreInteractItemEvent() {
    }

    @NotNull
    public final class_1268 getHand() {
        return hand;
    }

    public final void setHand(@NotNull class_1268 class_1268Var) {
        Intrinsics.checkNotNullParameter(class_1268Var, "<set-?>");
        hand = class_1268Var;
    }

    public final boolean call(@NotNull class_1268 hand2) {
        Intrinsics.checkNotNullParameter(hand2, "hand");
        hand = hand2;
        setCancelled(false);
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
