package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: StringDecomposerEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/StringDecomposerEvent.class */
public final class StringDecomposerEvent extends Event {

    @NotNull
    public static final StringDecomposerEvent INSTANCE = new StringDecomposerEvent();

    @NotNull
    private static String string = "";

    private StringDecomposerEvent() {
    }

    @NotNull
    public final String getString() {
        return string;
    }

    public final void setString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        string = str;
    }

    @NotNull
    public final String call(@NotNull String string2) {
        Intrinsics.checkNotNullParameter(string2, "string");
        string = string2;
        Gofra.INSTANCE.drain(this);
        return string;
    }
}
