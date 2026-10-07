package su.catlean.api.event.events.render;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: WeatherRenderEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/WeatherRenderEvent.class */
public final class WeatherRenderEvent extends Event {

    @NotNull
    public static final WeatherRenderEvent INSTANCE = new WeatherRenderEvent();

    private WeatherRenderEvent() {
    }
}
