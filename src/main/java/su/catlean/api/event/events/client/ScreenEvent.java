package su.catlean.api.event.events.client;

import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: ScreenEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/client/ScreenEvent.class */
public final class ScreenEvent extends Event {

    @NotNull
    public static final ScreenEvent INSTANCE = new ScreenEvent();

    @Nullable
    private static class_437 screen;

    private ScreenEvent() {
    }

    @Nullable
    public final class_437 getScreen() {
        return screen;
    }

    public final void setScreen(@Nullable class_437 class_437Var) {
        screen = class_437Var;
    }

    public final boolean call(@Nullable class_437 screen2) {
        setCancelled(false);
        screen = screen2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
