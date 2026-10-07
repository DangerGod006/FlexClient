package dev.redstones.mediaplayerinfo.impl;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DummyMediaPlayerInfo.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:dev/redstones/mediaplayerinfo/impl/DummyMediaPlayerInfo.class */
public final class DummyMediaPlayerInfo implements MediaPlayerInfo {

    @NotNull
    public static final DummyMediaPlayerInfo INSTANCE = new DummyMediaPlayerInfo();

    private DummyMediaPlayerInfo() {
    }

    @Override // dev.redstones.mediaplayerinfo.MediaPlayerInfo
    @NotNull
    public List<IMediaSession> getMediaSessions() {
        return CollectionsKt.emptyList();
    }
}
