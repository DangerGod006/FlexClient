package su.catlean.api.event.events.render;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: RenderSpawnerEntityEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/RenderSpawnerEntityEvent.class */
public final class RenderSpawnerEntityEvent extends Event {

    @NotNull
    public static final RenderSpawnerEntityEvent INSTANCE = new RenderSpawnerEntityEvent();

    private RenderSpawnerEntityEvent() {
    }
}
