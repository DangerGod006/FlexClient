package su.catlean.api.event.events.network;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: SendMessageEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/network/SendMessageEvent.class */
public final class SendMessageEvent extends Event {

    @NotNull
    public static final SendMessageEvent INSTANCE = new SendMessageEvent();

    @NotNull
    private static String message = "";

    private SendMessageEvent() {
    }

    @NotNull
    public final String getMessage() {
        return message;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        message = str;
    }

    public final boolean call(@NotNull String message2) {
        Intrinsics.checkNotNullParameter(message2, "message");
        message = message2;
        setCancelled(false);
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
