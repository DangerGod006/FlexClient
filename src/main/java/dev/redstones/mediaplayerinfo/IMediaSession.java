package dev.redstones.mediaplayerinfo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IMediaSession.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:dev/redstones/mediaplayerinfo/IMediaSession.class */
public interface IMediaSession {
    @NotNull
    String getOwner();

    @NotNull
    MediaInfo getMedia();

    void play();

    void pause();

    void playPause();

    void stop();

    void next();

    void previous();
}
