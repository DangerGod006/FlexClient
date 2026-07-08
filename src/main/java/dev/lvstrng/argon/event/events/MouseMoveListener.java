package dev.lvstrng.argon.event.events;

import dev.lvstrng.argon.event.CancellableEvent;
import dev.lvstrng.argon.event.Listener;
import java.util.ArrayList;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/MouseMoveListener.class */
public interface MouseMoveListener extends Listener {
    void onMouseMove(MouseMoveEvent mouseMoveEvent);

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/MouseMoveListener$MouseMoveEvent.class */
    public static class MouseMoveEvent extends CancellableEvent<MouseMoveListener> {
        public long windowHandle;
        public double x;
        public double y;

        public MouseMoveEvent(long windowHandle, double x, double y) {
            this.windowHandle = windowHandle;
            this.x = x;
            this.y = y;
        }

        @Override // dev.lvstrng.argon.event.Event
        public void fire(ArrayList<MouseMoveListener> listeners) {
            listeners.forEach(e -> {
                e.onMouseMove(this);
            });
        }

        @Override // dev.lvstrng.argon.event.Event
        public Class<MouseMoveListener> getListenerType() {
            return MouseMoveListener.class;
        }
    }
}
