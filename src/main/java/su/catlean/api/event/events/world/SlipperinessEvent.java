package su.catlean.api.event.events.world;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2248;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: SlipperinessEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/world/SlipperinessEvent.class */
public final class SlipperinessEvent extends Event {

    @NotNull
    public static final SlipperinessEvent INSTANCE = new SlipperinessEvent();
    private static class_2248 block;

    private SlipperinessEvent() {
    }

    @NotNull
    public final class_2248 getBlock() {
        class_2248 class_2248Var = block;
        if (class_2248Var != null) {
            return class_2248Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("block");
        return null;
    }

    public final boolean call(@NotNull class_2248 block2) {
        Intrinsics.checkNotNullParameter(block2, "block");
        setCancelled(false);
        block = block2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
