package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: ShowFloatingItemEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/ShowFloatingItemEvent.class */
public final class ShowFloatingItemEvent extends Event {

    @NotNull
    public static final ShowFloatingItemEvent INSTANCE = new ShowFloatingItemEvent();
    public static class_1799 item;

    private ShowFloatingItemEvent() {
    }

    @NotNull
    public final class_1799 getItem() {
        class_1799 class_1799Var = item;
        if (class_1799Var != null) {
            return class_1799Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("item");
        return null;
    }

    public final void setItem(@NotNull class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, "<set-?>");
        item = class_1799Var;
    }

    public final boolean call(@NotNull class_1799 item2) {
        Intrinsics.checkNotNullParameter(item2, "item");
        setCancelled(false);
        setItem(item2);
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
