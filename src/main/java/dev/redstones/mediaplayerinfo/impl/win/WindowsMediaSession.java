package dev.redstones.mediaplayerinfo.impl.win;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WindowsMediaSession.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:dev/redstones/mediaplayerinfo/impl/win/WindowsMediaSession.class */
public final class WindowsMediaSession implements IMediaSession {

    @NotNull
    private final MediaInfo media;

    @NotNull
    private final String owner;
    private final int index;

    @Override // dev.redstones.mediaplayerinfo.IMediaSession
    public native void play();

    @Override // dev.redstones.mediaplayerinfo.IMediaSession
    public native void pause();

    @Override // dev.redstones.mediaplayerinfo.IMediaSession
    public native void playPause();

    @Override // dev.redstones.mediaplayerinfo.IMediaSession
    public native void stop();

    @Override // dev.redstones.mediaplayerinfo.IMediaSession
    public native void next();

    @Override // dev.redstones.mediaplayerinfo.IMediaSession
    public native void previous();

    public WindowsMediaSession(@NotNull MediaInfo media, @NotNull String owner, int index) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.media = media;
        this.owner = owner;
        this.index = index;
    }

    @Override // dev.redstones.mediaplayerinfo.IMediaSession
    @NotNull
    public MediaInfo getMedia() {
        return this.media;
    }

    @Override // dev.redstones.mediaplayerinfo.IMediaSession
    @NotNull
    public String getOwner() {
        return this.owner;
    }
}
