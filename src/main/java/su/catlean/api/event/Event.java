package su.catlean.api.event;

import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: Event.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/Event.class */
public abstract class Event {
    private boolean cancelled;

    public final boolean getCancelled() {
        return this.cancelled;
    }

    public final void setCancelled(boolean z) {
        this.cancelled = z;
    }

    public final void cancel() {
        this.cancelled = true;
    }

    public boolean call() {
        this.cancelled = false;
        Gofra.INSTANCE.drain(this);
        return this.cancelled;
    }
}
