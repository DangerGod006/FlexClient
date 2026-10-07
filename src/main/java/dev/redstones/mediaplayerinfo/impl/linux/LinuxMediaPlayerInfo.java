package dev.redstones.mediaplayerinfo.impl.linux;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import dev.redstones.mediaplayerinfo.impl.linux.dbus.Player;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.freedesktop.dbus.connections.impl.DBusConnection;
import org.freedesktop.dbus.connections.impl.DBusConnectionBuilder;
import org.freedesktop.dbus.interfaces.DBus;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.interfaces.Properties;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LinuxMediaPlayerInfo.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:dev/redstones/mediaplayerinfo/impl/linux/LinuxMediaPlayerInfo.class */
public final class LinuxMediaPlayerInfo implements MediaPlayerInfo {

    @NotNull
    public static final LinuxMediaPlayerInfo INSTANCE = new LinuxMediaPlayerInfo();
    private static final DBusConnection conn = DBusConnectionBuilder.forSessionBus().build();
    private static final DBus dbus = conn.getRemoteObject("org.freedesktop.DBus", "/", DBus.class);

    private LinuxMediaPlayerInfo() {
    }

    @Override // dev.redstones.mediaplayerinfo.MediaPlayerInfo
    @NotNull
    public List<IMediaSession> getMediaSessions() {
        String[] strArrListNames = dbus.ListNames();
        Intrinsics.checkNotNullExpressionValue(strArrListNames, "ListNames(...)");
        String[] strArr = strArrListNames;
        Collection destination$iv$iv = new ArrayList();
        for (String str : strArr) {
            String it = str;
            Intrinsics.checkNotNull(it);
            if (StringsKt.startsWith$default(it, "org.mpris.MediaPlayer2.", false, 2, (Object) null)) {
                destination$iv$iv.add(str);
            }
        }
        Iterable $this$map$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String it2 = (String) item$iv$iv;
            DBusInterface remoteObject = conn.getRemoteObject(it2, "/org/mpris/MediaPlayer2", Player.class);
            Intrinsics.checkNotNullExpressionValue(remoteObject, "getRemoteObject(...)");
            Intrinsics.checkNotNull(it2);
            destination$iv$iv2.add(new LinuxMediaSession((Player) remoteObject, StringsKt.removePrefix(it2, (CharSequence) "org.mpris.MediaPlayer2.")));
        }
        Iterable $this$filter$iv = (List) destination$iv$iv2;
        Collection destination$iv$iv3 = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            if (!Intrinsics.areEqual(INSTANCE.getProperty$MediaPlayerInfo(((LinuxMediaSession) element$iv$iv).getOwner(), "PlaybackStatus"), "Stopped")) {
                destination$iv$iv3.add(element$iv$iv);
            }
        }
        return (List) destination$iv$iv3;
    }

    public final <T> T getProperty$MediaPlayerInfo(@NotNull String owner, @NotNull String property) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(property, "property");
        return (T) conn.getRemoteObject("org.mpris.MediaPlayer2." + owner, "/org/mpris/MediaPlayer2", Properties.class).Get("org.mpris.MediaPlayer2.Player", property);
    }
}
