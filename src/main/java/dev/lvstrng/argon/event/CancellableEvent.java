package dev.lvstrng.argon.event;

import dev.lvstrng.argon.event.Listener;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/CancellableEvent.class */
public abstract class CancellableEvent<T extends Listener> extends Event<T> {
    private boolean isCancelled = false;

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public void cancel() {
        this.isCancelled = true;
    }
}
