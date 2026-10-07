package dev.redstones.mediaplayerinfo;

import dev.redstones.mediaplayerinfo.impl.DummyMediaPlayerInfo;
import dev.redstones.mediaplayerinfo.impl.linux.LinuxMediaPlayerInfo;
import dev.redstones.mediaplayerinfo.impl.win.WindowsMediaPlayerInfo;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MediaPlayerInfo.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:dev/redstones/mediaplayerinfo/MediaPlayerInfoKt.class */
public final class MediaPlayerInfoKt {

    @NotNull
    private static final MediaPlayerInfo systemMediaPlayerInfo;

    @NotNull
    public static final MediaPlayerInfo getSystemMediaPlayerInfo() {
        return systemMediaPlayerInfo;
    }

    static {
        DummyMediaPlayerInfo dummyMediaPlayerInfo;
        String property = System.getProperty("os.name");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        String lowerCase = property.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt.startsWith$default(lowerCase, "windows", false, 2, (Object) null)) {
            dummyMediaPlayerInfo = WindowsMediaPlayerInfo.INSTANCE;
        } else {
            String property2 = System.getProperty("os.name");
            Intrinsics.checkNotNullExpressionValue(property2, "getProperty(...)");
            String lowerCase2 = property2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            dummyMediaPlayerInfo = Intrinsics.areEqual(lowerCase2, "linux") ? LinuxMediaPlayerInfo.INSTANCE : DummyMediaPlayerInfo.INSTANCE;
        }
        systemMediaPlayerInfo = dummyMediaPlayerInfo;
    }
}
