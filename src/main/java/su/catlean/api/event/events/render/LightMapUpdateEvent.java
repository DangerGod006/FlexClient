package su.catlean.api.event.events.render;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: LightMapUpdateEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/LightMapUpdateEvent.class */
public final class LightMapUpdateEvent extends Event {

    @NotNull
    public static final LightMapUpdateEvent INSTANCE = new LightMapUpdateEvent();

    private LightMapUpdateEvent() {
    }
}
