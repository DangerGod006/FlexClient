package su.catlean;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.AfterElytraEvent;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreElytraEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.api.event.events.world.FireWorkVelocityEvent;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/jr.class */
public interface jr {
    void w(long j, @NotNull PreSyncEvent preSyncEvent);

    void y(@NotNull PreElytraEvent preElytraEvent, long j);

    void b(long j, @NotNull AfterElytraEvent afterElytraEvent);

    void h(@NotNull MoveEvent moveEvent, long j);

    void j(long j, @NotNull AfterSendPacket afterSendPacket);

    void A(@NotNull ReceivePacket receivePacket, long j, char c);

    void P(int i, @NotNull PlayerUpdateEvent playerUpdateEvent, char c, char c2);

    void m(char c, int i, short s);

    void b(long j);

    void U(long j, @NotNull FireWorkVelocityEvent fireWorkVelocityEvent);

    void s(@NotNull SetPoseEvent setPoseEvent);

    void k(long j, @NotNull ReceivePacket receivePacket);
}
