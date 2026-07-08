package dev.lvstrng.argon.event;

import dev.lvstrng.argon.event.Listener;
import java.util.ArrayList;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/Event.class */
public abstract class Event<T extends Listener> {
    public abstract void fire(ArrayList<T> arrayList);

    public abstract Class<T> getListenerType();
}
