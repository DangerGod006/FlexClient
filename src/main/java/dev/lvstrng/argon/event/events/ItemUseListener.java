package dev.lvstrng.argon.event.events;

import dev.lvstrng.argon.event.CancellableEvent;
import dev.lvstrng.argon.event.Listener;
import java.util.ArrayList;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/ItemUseListener.class */
public interface ItemUseListener extends Listener {
    void onItemUse(ItemUseEvent itemUseEvent);

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/ItemUseListener$ItemUseEvent.class */
    public static class ItemUseEvent extends CancellableEvent<ItemUseListener> {
        @Override // dev.lvstrng.argon.event.Event
        public void fire(ArrayList<ItemUseListener> listeners) {
            listeners.forEach(e -> {
                e.onItemUse(this);
            });
        }

        @Override // dev.lvstrng.argon.event.Event
        public Class<ItemUseListener> getListenerType() {
            return ItemUseListener.class;
        }
    }
}
