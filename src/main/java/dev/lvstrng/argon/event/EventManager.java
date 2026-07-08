package dev.lvstrng.argon.event;

import dev.lvstrng.argon.Argon;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/EventManager.class */
public final class EventManager {
    private final HashMap<Class<? extends Listener>, ArrayList<PrioritizedListener<? extends Listener>>> listenerMap = new HashMap<>();

    public static <L extends Listener, E extends Event<L>> void fire(E event) {
        EventManager eventManager = Argon.INSTANCE.getEventManager();
        if (eventManager != null) {
            eventManager.fireImpl(event);
        }
    }

    private <L extends Listener, E extends Event<L>> void fireImpl(E event) {
        Class<L> listenerType = event.getListenerType();
        ArrayList<PrioritizedListener<? extends Listener>> arrayList = this.listenerMap.get(listenerType);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<PrioritizedListener<L>> listeners2 = new ArrayList<>(arrayList);
        listeners2.removeIf((v0) -> {
            return Objects.isNull(v0);
        });
        listeners2.sort(Comparator.comparing(listener -> {
            return Integer.valueOf(Integer.MAX_VALUE - listener.getPriority());
        }));
        ArrayList<L> listeners3 = new ArrayList<>();
        listeners2.forEach(listener2 -> {
            listeners3.add(listener2.getListener());
        });
        event.fire(listeners3);
    }

    public <L extends Listener> void add(Class<L> type, L listener) {
        add(type, listener, 0);
    }

    public <L extends Listener> void add(Class<L> type, L listener, int priority) {
        ArrayList<PrioritizedListener<? extends Listener>> arrayList = this.listenerMap.get(type);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.listenerMap.put(type, arrayList);
        }
        arrayList.add(new PrioritizedListener<>(listener, priority));
    }

    public <L extends Listener> void remove(Class<L> type, L listener) {
        ArrayList<PrioritizedListener<? extends Listener>> arrayList = this.listenerMap.get(type);
        if (arrayList != null) {
            arrayList.removeIf(l -> {
                return l.getListener().equals(listener);
            });
        }
    }

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/EventManager$PrioritizedListener.class */
    private static class PrioritizedListener<L extends Listener> {
        private final L listener;
        private final int priority;

        public PrioritizedListener(L listener) {
            this(listener, 0);
        }

        public PrioritizedListener(L listener, int priority) {
            this.listener = listener;
            this.priority = priority;
        }

        public int getPriority() {
            return this.priority;
        }

        public L getListener() {
            return this.listener;
        }
    }
}
