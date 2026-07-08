package dev.lvstrng.argon.event.events;

import dev.lvstrng.argon.event.Event;
import dev.lvstrng.argon.event.Listener;
import java.util.ArrayList;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/MouseUpdateListener.class */
public interface MouseUpdateListener extends Listener {
    void onMouseUpdate();

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/MouseUpdateListener$MouseUpdateEvent.class */
    public static class MouseUpdateEvent extends Event<MouseUpdateListener> {
        @Override // dev.lvstrng.argon.event.Event
        public void fire(ArrayList<MouseUpdateListener> listeners) {
            listeners.forEach((v0) -> {
                v0.onMouseUpdate();
            });
        }

        @Override // dev.lvstrng.argon.event.Event
        public Class<MouseUpdateListener> getListenerType() {
            return MouseUpdateListener.class;
        }
    }
}
