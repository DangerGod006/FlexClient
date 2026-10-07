package dev.redstones.mediaplayerinfo.impl.linux;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaInfo;
import dev.redstones.mediaplayerinfo.impl.linux.dbus.Player;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import org.freedesktop.dbus.DBusMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LinuxMediaSession.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:dev/redstones/mediaplayerinfo/impl/linux/LinuxMediaSession.class */
public final class LinuxMediaSession implements IMediaSession {

    @NotNull
    private final Player dbus;

    @NotNull
    private final String owner;

    @NotNull
    private final MediaInfo media;

    public LinuxMediaSession(@NotNull Player dbus, @NotNull String owner) {
        Intrinsics.checkNotNullParameter(dbus, "dbus");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.dbus = dbus;
        this.owner = owner;
        this.media = generateMediaInfo();
    }

    @Override // dev.redstones.mediaplayerinfo.IMediaSession
    @NotNull
    public String getOwner() {
        return this.owner;
    }

    @Override // dev.redstones.mediaplayerinfo.IMediaSession
    @NotNull
    public MediaInfo getMedia() {
        return this.media;
    }

    @Override // dev.redstones.mediaplayerinfo.IMediaSession
    public void play() {
        this.dbus.Play();
    }

    @Override // dev.redstones.mediaplayerinfo.IMediaSession
    public void pause() {
        this.dbus.Pause();
    }

    @Override // dev.redstones.mediaplayerinfo.IMediaSession
    public void playPause() {
        this.dbus.PlayPause();
    }

    @Override // dev.redstones.mediaplayerinfo.IMediaSession
    public void stop() {
        this.dbus.Stop();
    }

    @Override // dev.redstones.mediaplayerinfo.IMediaSession
    public void next() {
        this.dbus.Next();
    }

    @Override // dev.redstones.mediaplayerinfo.IMediaSession
    public void previous() {
        this.dbus.Previous();
    }

    private final MediaInfo generateMediaInfo() throws IOException {
        String strJoinToString$default;
        byte[] bytes;
        DBusMap metadata = (DBusMap) LinuxMediaPlayerInfo.INSTANCE.getProperty$MediaPlayerInfo(getOwner(), "Metadata");
        boolean playing = Intrinsics.areEqual(LinuxMediaPlayerInfo.INSTANCE.getProperty$MediaPlayerInfo(getOwner(), "PlaybackStatus"), "Playing");
        long position = ((long) ((Number) LinuxMediaPlayerInfo.INSTANCE.getProperty$MediaPlayerInfo(getOwner(), "Position")).doubleValue()) / ((long) DurationKt.NANOS_IN_MILLIS);
        Object obj = metadata.get("mpris:length");
        Intrinsics.checkNotNull(obj);
        long duration = Long.parseLong(obj.toString()) / ((long) DurationKt.NANOS_IN_MILLIS);
        Object obj2 = metadata.get("xesam:title");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        String title = (String) obj2;
        Object $this$generateMediaInfo_u24lambda_u240 = metadata.get("xesam:artist");
        if ($this$generateMediaInfo_u24lambda_u240 instanceof String) {
            strJoinToString$default = (String) $this$generateMediaInfo_u24lambda_u240;
        } else {
            Intrinsics.checkNotNull($this$generateMediaInfo_u24lambda_u240, "null cannot be cast to non-null type kotlin.collections.List<*>");
            strJoinToString$default = CollectionsKt.joinToString$default((List) $this$generateMediaInfo_u24lambda_u240, ", ", null, null, 0, null, null, 62, null);
        }
        String artist = strJoinToString$default;
        Object artworkUrl = metadata.get("mpris:artUrl");
        if (artworkUrl instanceof String) {
            bytes = TextStreamsKt.readBytes(new URL((String) artworkUrl));
        } else {
            bytes = new byte[0];
        }
        byte[] artwork = bytes;
        return new MediaInfo(title, artist, artwork, position, duration, playing);
    }
}
