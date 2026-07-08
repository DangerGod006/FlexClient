package dev.lvstrng.argon.event.events;

import dev.lvstrng.argon.event.CancellableEvent;
import dev.lvstrng.argon.event.Listener;
import java.util.ArrayList;
import net.minecraft.class_2596;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/PacketReceiveListener.class */
public interface PacketReceiveListener extends Listener {
    void onPacketReceive(PacketReceiveEvent packetReceiveEvent);

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/PacketReceiveListener$PacketReceiveEvent.class */
    public static class PacketReceiveEvent extends CancellableEvent<PacketReceiveListener> {
        public class_2596 packet;

        public PacketReceiveEvent(class_2596 packet) {
            this.packet = packet;
        }

        @Override // dev.lvstrng.argon.event.Event
        public void fire(ArrayList<PacketReceiveListener> listeners) {
            listeners.forEach(e -> {
                e.onPacketReceive(this);
            });
        }

        @Override // dev.lvstrng.argon.event.Event
        public Class<PacketReceiveListener> getListenerType() {
            return PacketReceiveListener.class;
        }
    }
}
