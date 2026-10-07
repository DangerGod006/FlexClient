package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_703;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: RenderParticleEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/RenderParticleEvent.class */
public final class RenderParticleEvent extends Event {

    @NotNull
    public static final RenderParticleEvent INSTANCE = new RenderParticleEvent();
    private static class_703 particle;

    private RenderParticleEvent() {
    }

    @NotNull
    public final class_703 getParticle() {
        class_703 class_703Var = particle;
        if (class_703Var != null) {
            return class_703Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("particle");
        return null;
    }

    public final boolean call(@NotNull class_703 particle2) {
        Intrinsics.checkNotNullParameter(particle2, "particle");
        setCancelled(false);
        particle = particle2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
