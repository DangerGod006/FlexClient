package dev.lvstrng.argon.event.events;

import dev.lvstrng.argon.event.CancellableEvent;
import dev.lvstrng.argon.event.Listener;
import java.util.ArrayList;
import net.minecraft.class_2596;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/PacketSendListener.class */
public interface PacketSendListener extends Listener {
    void onPacketSend(PacketSendEvent packetSendEvent);

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/PacketSendListener$PacketSendEvent.class */
    public static class PacketSendEvent extends CancellableEvent<PacketSendListener> {
        public class_2596 packet;

        public PacketSendEvent(class_2596 packet) {
            this.packet = packet;
        }

        @Override // dev.lvstrng.argon.event.Event
        public void fire(ArrayList<PacketSendListener> listeners) {
            listeners.forEach(e -> {
                e.onPacketSend(this);
            });
        }

        @Override // dev.lvstrng.argon.event.Event
        public Class<PacketSendListener> getListenerType() {
            return PacketSendListener.class;
        }
    }
}
