package dev.lvstrng.argon.event.events;

import dev.lvstrng.argon.event.Event;
import dev.lvstrng.argon.event.Listener;
import java.util.ArrayList;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/PlayerTickListener.class */
public interface PlayerTickListener extends Listener {
    void onPlayerTick();

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/PlayerTickListener$PlayerTickEvent.class */
    public static class PlayerTickEvent extends Event<PlayerTickListener> {
        @Override // dev.lvstrng.argon.event.Event
        public void fire(ArrayList<PlayerTickListener> listeners) {
            listeners.forEach((v0) -> {
                v0.onPlayerTick();
            });
        }

        @Override // dev.lvstrng.argon.event.Event
        public Class<PlayerTickListener> getListenerType() {
            return PlayerTickListener.class;
        }
    }
}
