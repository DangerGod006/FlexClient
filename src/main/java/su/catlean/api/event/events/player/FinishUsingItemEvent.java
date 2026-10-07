package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: FinishUsingItemEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/FinishUsingItemEvent.class */
public final class FinishUsingItemEvent extends Event {

    @NotNull
    public static final FinishUsingItemEvent INSTANCE = new FinishUsingItemEvent();

    @Nullable
    private static class_1799 item;

    private FinishUsingItemEvent() {
    }

    @Nullable
    public final class_1799 getItem() {
        return item;
    }

    public final void setItem(@Nullable class_1799 class_1799Var) {
        item = class_1799Var;
    }

    public final boolean call(@NotNull class_1799 item2) {
        Intrinsics.checkNotNullParameter(item2, "item");
        setCancelled(false);
        item = item2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
