package dev.redstones.mediaplayerinfo.impl.win;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WindowsMediaPlayerInfo.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:dev/redstones/mediaplayerinfo/impl/win/WindowsMediaPlayerInfo.class */
public final class WindowsMediaPlayerInfo implements MediaPlayerInfo {

    @NotNull
    public static final WindowsMediaPlayerInfo INSTANCE = new WindowsMediaPlayerInfo();

    @Override // dev.redstones.mediaplayerinfo.MediaPlayerInfo
    @NotNull
    public native List<IMediaSession> getMediaSessions();

    private WindowsMediaPlayerInfo() {
    }

    static {
        File dllFile = Files.createTempDirectory("mediaplayerinfo-", new FileAttribute[0]).resolve("MediaPlayerInfo.dll").toFile();
        Intrinsics.checkNotNull(dllFile);
        InputStream resourceAsStream = INSTANCE.getClass().getResourceAsStream("/mediaplayerinfo/natives/win/MediaPlayerInfo.dll");
        Intrinsics.checkNotNull(resourceAsStream);
        byte[] allBytes = resourceAsStream.readAllBytes();
        Intrinsics.checkNotNullExpressionValue(allBytes, "readAllBytes(...)");
        FilesKt.writeBytes(dllFile, allBytes);
        System.load(dllFile.getCanonicalPath());
    }
}
