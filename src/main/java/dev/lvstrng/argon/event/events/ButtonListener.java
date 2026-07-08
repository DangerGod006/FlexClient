package dev.lvstrng.argon.event.events;

import dev.lvstrng.argon.event.Event;
import dev.lvstrng.argon.event.Listener;
import java.util.ArrayList;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/ButtonListener.class */
public interface ButtonListener extends Listener {
    void onButtonPress(ButtonEvent buttonEvent);

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/ButtonListener$ButtonEvent.class */
    public static class ButtonEvent extends Event<ButtonListener> {
        public int button;
        public int action;
        public long window;

        public ButtonEvent(int button, long window, int action) {
            this.button = button;
            this.window = window;
            this.action = action;
        }

        @Override // dev.lvstrng.argon.event.Event
        public void fire(ArrayList<ButtonListener> listeners) {
            listeners.forEach(e -> {
                e.onButtonPress(this);
            });
        }

        @Override // dev.lvstrng.argon.event.Event
        public Class<ButtonListener> getListenerType() {
            return ButtonListener.class;
        }
    }
}
