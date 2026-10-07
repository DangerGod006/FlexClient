package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: XRayBlockEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/XRayBlockEvent.class */
public final class XRayBlockEvent extends Event {

    @NotNull
    private class_2248 block;

    public XRayBlockEvent() {
        class_2248 DIRT = class_2246.field_10566;
        Intrinsics.checkNotNullExpressionValue(DIRT, "DIRT");
        this.block = DIRT;
    }

    @NotNull
    public final class_2248 getBlock() {
        return this.block;
    }

    public final void setBlock(@NotNull class_2248 class_2248Var) {
        Intrinsics.checkNotNullParameter(class_2248Var, "<set-?>");
        this.block = class_2248Var;
    }

    public final boolean call(@NotNull class_2248 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        setCancelled(false);
        this.block = block;
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
