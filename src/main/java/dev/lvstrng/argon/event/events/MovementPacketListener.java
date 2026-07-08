package dev.lvstrng.argon.event.events;

import dev.lvstrng.argon.event.Event;
import dev.lvstrng.argon.event.Listener;
import java.util.ArrayList;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/MovementPacketListener.class */
public interface MovementPacketListener extends Listener {
    void onSendMovementPackets();

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/MovementPacketListener$MovementPacketEvent.class */
    public static class MovementPacketEvent extends Event<MovementPacketListener> {
        @Override // dev.lvstrng.argon.event.Event
        public void fire(ArrayList<MovementPacketListener> listeners) {
            listeners.forEach((v0) -> {
                v0.onSendMovementPackets();
            });
        }

        @Override // dev.lvstrng.argon.event.Event
        public Class<MovementPacketListener> getListenerType() {
            return MovementPacketListener.class;
        }
    }
}
