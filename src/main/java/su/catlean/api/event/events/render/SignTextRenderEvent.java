package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: SignTextRenderEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/SignTextRenderEvent.class */
public final class SignTextRenderEvent extends Event {

    @NotNull
    public static final SignTextRenderEvent INSTANCE = new SignTextRenderEvent();
    private static class_2338 pos;

    private SignTextRenderEvent() {
    }

    @NotNull
    public final class_2338 getPos() {
        class_2338 class_2338Var = pos;
        if (class_2338Var != null) {
            return class_2338Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pos");
        return null;
    }

    public final boolean call(@NotNull class_2338 pos2) {
        Intrinsics.checkNotNullParameter(pos2, "pos");
        setCancelled(false);
        pos = pos2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
