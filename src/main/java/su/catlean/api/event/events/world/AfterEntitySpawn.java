package su.catlean.api.event.events.world;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: EntitySpawnEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/world/AfterEntitySpawn.class */
public final class AfterEntitySpawn extends Event {

    @NotNull
    public static final AfterEntitySpawn INSTANCE = new AfterEntitySpawn();
    private static class_1297 entity;

    private AfterEntitySpawn() {
    }

    @NotNull
    public final class_1297 getEntity() {
        class_1297 class_1297Var = entity;
        if (class_1297Var != null) {
            return class_1297Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("entity");
        return null;
    }

    public final boolean call(@NotNull class_1297 entity2) {
        Intrinsics.checkNotNullParameter(entity2, "entity");
        setCancelled(false);
        entity = entity2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
