package dev.lvstrng.argon.event.events;

import dev.lvstrng.argon.event.Event;
import dev.lvstrng.argon.event.Listener;
import java.util.ArrayList;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/TickListener.class */
public interface TickListener extends Listener {
    void onTick();

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/TickListener$TickEvent.class */
    public static class TickEvent extends Event<TickListener> {
        @Override // dev.lvstrng.argon.event.Event
        public void fire(ArrayList<TickListener> listeners) {
            listeners.forEach((v0) -> {
                v0.onTick();
            });
        }

        @Override // dev.lvstrng.argon.event.Event
        public Class<TickListener> getListenerType() {
            return TickListener.class;
        }
    }
}
