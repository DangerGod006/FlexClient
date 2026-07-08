package dev.lvstrng.argon.event.events;

import dev.lvstrng.argon.event.Event;
import dev.lvstrng.argon.event.Listener;
import java.util.ArrayList;
import net.minecraft.class_1041;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/ResolutionListener.class */
public interface ResolutionListener extends Listener {
    void onResolution(ResolutionEvent resolutionEvent);

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/ResolutionListener$ResolutionEvent.class */
    public static class ResolutionEvent extends Event<ResolutionListener> {
        public class_1041 window;

        public ResolutionEvent(class_1041 window) {
            this.window = window;
        }

        @Override // dev.lvstrng.argon.event.Event
        public void fire(ArrayList<ResolutionListener> listeners) {
            listeners.forEach(l -> {
                l.onResolution(this);
            });
        }

        @Override // dev.lvstrng.argon.event.Event
        public Class<ResolutionListener> getListenerType() {
            return ResolutionListener.class;
        }
    }
}
