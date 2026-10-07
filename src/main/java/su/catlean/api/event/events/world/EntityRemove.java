package su.catlean.api.event.events.world;

import net.minecraft.class_1297;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: EntitySpawnEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/world/EntityRemove.class */
public final class EntityRemove extends Event {

    @NotNull
    public static final EntityRemove INSTANCE = new EntityRemove();

    @Nullable
    private static class_1297 entity;

    private EntityRemove() {
    }

    @Nullable
    public final class_1297 getEntity() {
        return entity;
    }

    public final boolean call(@Nullable class_1297 entity2) {
        setCancelled(false);
        entity = entity2;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
