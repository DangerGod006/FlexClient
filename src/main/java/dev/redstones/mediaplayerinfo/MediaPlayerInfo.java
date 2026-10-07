package dev.redstones.mediaplayerinfo;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MediaPlayerInfo.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:dev/redstones/mediaplayerinfo/MediaPlayerInfo.class */
public interface MediaPlayerInfo {

    @NotNull
    public static final Instance Instance = Instance.$$INSTANCE;

    @NotNull
    List<IMediaSession> getMediaSessions();

    /* JADX INFO: compiled from: MediaPlayerInfo.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:dev/redstones/mediaplayerinfo/MediaPlayerInfo$Instance.class */
    public static final class Instance implements MediaPlayerInfo {
        static final /* synthetic */ Instance $$INSTANCE = new Instance();
        private final /* synthetic */ MediaPlayerInfo $$delegate_0 = MediaPlayerInfoKt.getSystemMediaPlayerInfo();

        @Override // dev.redstones.mediaplayerinfo.MediaPlayerInfo
        @NotNull
        public List<IMediaSession> getMediaSessions() {
            return this.$$delegate_0.getMediaSessions();
        }

        private Instance() {
        }
    }
}
