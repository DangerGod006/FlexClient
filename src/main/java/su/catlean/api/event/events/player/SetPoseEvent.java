package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4050;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: SetPoseEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/SetPoseEvent.class */
public final class SetPoseEvent extends Event {

    @NotNull
    public static final SetPoseEvent INSTANCE = new SetPoseEvent();

    @NotNull
    private static class_4050 pose = class_4050.field_18076;

    private SetPoseEvent() {
    }

    @NotNull
    public final class_4050 getPose() {
        return pose;
    }

    public final void setPose(@NotNull class_4050 class_4050Var) {
        Intrinsics.checkNotNullParameter(class_4050Var, "<set-?>");
        pose = class_4050Var;
    }
}
