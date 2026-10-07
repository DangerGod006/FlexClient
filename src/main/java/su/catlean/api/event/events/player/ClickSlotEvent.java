package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1713;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: ClickSlotEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/ClickSlotEvent.class */
public final class ClickSlotEvent extends Event {

    @NotNull
    public static final ClickSlotEvent INSTANCE = new ClickSlotEvent();

    @NotNull
    private static class_1713 action = class_1713.field_7790;
    private static int id;
    private static int button;
    private static int syncId;

    private ClickSlotEvent() {
    }

    @NotNull
    public final class_1713 getAction() {
        return action;
    }

    public final void setAction(@NotNull class_1713 class_1713Var) {
        Intrinsics.checkNotNullParameter(class_1713Var, "<set-?>");
        action = class_1713Var;
    }

    public final int getId() {
        return id;
    }

    public final void setId(int i) {
        id = i;
    }

    public final int getButton() {
        return button;
    }

    public final void setButton(int i) {
        button = i;
    }

    public final int getSyncId() {
        return syncId;
    }

    public final void setSyncId(int i) {
        syncId = i;
    }

    public final boolean call(@NotNull class_1713 action2, int id2, int button2, int syncId2) {
        Intrinsics.checkNotNullParameter(action2, "action");
        setCancelled(false);
        action = action2;
        id = id2;
        button = button2;
        syncId = syncId2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
