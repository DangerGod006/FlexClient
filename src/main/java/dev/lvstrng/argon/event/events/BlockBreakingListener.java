package dev.lvstrng.argon.event.events;

import dev.lvstrng.argon.event.CancellableEvent;
import dev.lvstrng.argon.event.Listener;
import java.util.ArrayList;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/BlockBreakingListener.class */
public interface BlockBreakingListener extends Listener {
    void onBlockBreaking(BlockBreakingEvent blockBreakingEvent);

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/BlockBreakingListener$BlockBreakingEvent.class */
    public static class BlockBreakingEvent extends CancellableEvent<BlockBreakingListener> {
        @Override // dev.lvstrng.argon.event.Event
        public void fire(ArrayList<BlockBreakingListener> listeners) {
            listeners.forEach(e -> {
                e.onBlockBreaking(this);
            });
        }

        @Override // dev.lvstrng.argon.event.Event
        public Class<BlockBreakingListener> getListenerType() {
            return BlockBreakingListener.class;
        }
    }
}
