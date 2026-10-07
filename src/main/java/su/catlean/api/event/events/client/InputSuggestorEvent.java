package su.catlean.api.event.events.client;

import com.mojang.brigadier.CommandDispatcher;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2172;
import net.minecraft.class_637;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: InputSuggestorEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/client/InputSuggestorEvent.class */
public final class InputSuggestorEvent extends Event {

    @NotNull
    public static final InputSuggestorEvent INSTANCE = new InputSuggestorEvent();

    @NotNull
    private static String prefix = "";

    @Nullable
    private static CommandDispatcher<class_2172> dispatcher;

    @Nullable
    private static class_637 source;

    private InputSuggestorEvent() {
    }

    @NotNull
    public final String getPrefix() {
        return prefix;
    }

    public final void setPrefix(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        prefix = str;
    }

    @Nullable
    public final CommandDispatcher<class_2172> getDispatcher() {
        return dispatcher;
    }

    public final void setDispatcher(@Nullable CommandDispatcher<class_2172> commandDispatcher) {
        dispatcher = commandDispatcher;
    }

    @Nullable
    public final class_637 getSource() {
        return source;
    }

    public final void setSource(@Nullable class_637 class_637Var) {
        source = class_637Var;
    }
}
