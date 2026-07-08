package dev.lvstrng.argon.event.events;

import dev.lvstrng.argon.event.Event;
import dev.lvstrng.argon.event.Listener;
import java.util.ArrayList;
import net.minecraft.class_332;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/HudListener.class */
public interface HudListener extends Listener {
    void onRenderHud(HudEvent hudEvent);

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/HudListener$HudEvent.class */
    public static class HudEvent extends Event<HudListener> {
        public class_332 context;
        public float delta;

        public HudEvent(class_332 context, float delta) {
            this.context = context;
            this.delta = delta;
        }

        @Override // dev.lvstrng.argon.event.Event
        public void fire(ArrayList<HudListener> listeners) {
            listeners.forEach(e -> {
                e.onRenderHud(this);
            });
        }

        @Override // dev.lvstrng.argon.event.Event
        public Class<HudListener> getListenerType() {
            return HudListener.class;
        }
    }
}
