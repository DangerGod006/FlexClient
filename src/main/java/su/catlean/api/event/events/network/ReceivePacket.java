package su.catlean.api.event.events.network;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2596;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: PacketEvents.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/network/ReceivePacket.class */
public final class ReceivePacket extends Event {

    @NotNull
    private final class_2596<?> packet;

    public ReceivePacket(@NotNull class_2596<?> packet) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        this.packet = packet;
    }

    @NotNull
    public final class_2596<?> getPacket() {
        return this.packet;
    }
}
