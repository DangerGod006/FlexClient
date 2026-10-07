package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: ElytraEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/PreElytraEvent.class */
public final class PreElytraEvent extends ElytraEvent {

    @NotNull
    public static final PreElytraEvent INSTANCE = new PreElytraEvent();

    private PreElytraEvent() {
    }

    public final boolean call(@NotNull class_243 vec) {
        Intrinsics.checkNotNullParameter(vec, "vec");
        setCancelled(false);
        setVec(vec);
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
