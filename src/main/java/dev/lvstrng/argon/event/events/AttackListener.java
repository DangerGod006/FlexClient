package dev.lvstrng.argon.event.events;

import dev.lvstrng.argon.event.CancellableEvent;
import dev.lvstrng.argon.event.Listener;
import java.util.ArrayList;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/AttackListener.class */
public interface AttackListener extends Listener {
    void onAttack(AttackEvent attackEvent);

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/AttackListener$AttackEvent.class */
    public static class AttackEvent extends CancellableEvent<AttackListener> {
        @Override // dev.lvstrng.argon.event.Event
        public void fire(ArrayList<AttackListener> listeners) {
            listeners.forEach(e -> {
                e.onAttack(this);
            });
        }

        @Override // dev.lvstrng.argon.event.Event
        public Class<AttackListener> getListenerType() {
            return AttackListener.class;
        }
    }
}
