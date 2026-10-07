package su.catlean.api.event.events.render;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: MapRenderEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/MapRenderEvent.class */
public final class MapRenderEvent extends Event {

    @NotNull
    public static final MapRenderEvent INSTANCE = new MapRenderEvent();

    private MapRenderEvent() {
    }
}
