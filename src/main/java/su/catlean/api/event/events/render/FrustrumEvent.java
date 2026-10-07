package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4604;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: FrustrumEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/FrustrumEvent.class */
public final class FrustrumEvent extends Event {

    @NotNull
    public static final FrustrumEvent INSTANCE = new FrustrumEvent();
    public static class_4604 frustrum;

    private FrustrumEvent() {
    }

    @NotNull
    public final class_4604 getFrustrum() {
        class_4604 class_4604Var = frustrum;
        if (class_4604Var != null) {
            return class_4604Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("frustrum");
        return null;
    }

    public final void setFrustrum(@NotNull class_4604 class_4604Var) {
        Intrinsics.checkNotNullParameter(class_4604Var, "<set-?>");
        frustrum = class_4604Var;
    }
}
