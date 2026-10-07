package su.catlean.api.event.events.client;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: InputEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/client/InputEvent.class */
public final class InputEvent extends Event {
    public static Action action;
    public static Device device;

    @NotNull
    public static final InputEvent INSTANCE = new InputEvent();
    private static int key = -1;

    /* JADX INFO: compiled from: InputEvent.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/client/InputEvent$Action.class */
    public enum Action {
        Press,
        Release,
        Hold;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        @NotNull
        public static EnumEntries<Action> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: InputEvent.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/client/InputEvent$Device.class */
    public enum Device {
        Mouse,
        Keyboard;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        @NotNull
        public static EnumEntries<Device> getEntries() {
            return $ENTRIES;
        }
    }

    private InputEvent() {
    }

    @NotNull
    public final Action getAction() {
        Action action2 = action;
        if (action2 != null) {
            return action2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("action");
        return null;
    }

    public final void setAction(@NotNull Action action2) {
        Intrinsics.checkNotNullParameter(action2, "<set-?>");
        action = action2;
    }

    @NotNull
    public final Device getDevice() {
        Device device2 = device;
        if (device2 != null) {
            return device2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("device");
        return null;
    }

    public final void setDevice(@NotNull Device device2) {
        Intrinsics.checkNotNullParameter(device2, "<set-?>");
        device = device2;
    }

    public final int getKey() {
        return key;
    }

    public final void setKey(int i) {
        key = i;
    }

    public final boolean call(int key2, @NotNull Device device2, @NotNull Action action2) {
        Intrinsics.checkNotNullParameter(device2, "device");
        Intrinsics.checkNotNullParameter(action2, "action");
        setCancelled(false);
        setDevice(device2);
        setAction(action2);
        key = key2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
