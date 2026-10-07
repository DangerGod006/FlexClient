package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import net.minecraft.class_1306;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: SwingArmEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/EquipArmEvent.class */
public final class EquipArmEvent extends Event {
    public static class_1306 arm;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(EquipArmEvent.class, "progress", "getProgress()F", 0))};

    @NotNull
    public static final EquipArmEvent INSTANCE = new EquipArmEvent();

    @NotNull
    private static final ReadWriteProperty progress$delegate = Delegates.INSTANCE.notNull();

    private EquipArmEvent() {
    }

    public final float getProgress() {
        return ((Number) progress$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    public final void setProgress(float f) {
        progress$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f));
    }

    @NotNull
    public final class_1306 getArm() {
        class_1306 class_1306Var = arm;
        if (class_1306Var != null) {
            return class_1306Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("arm");
        return null;
    }

    public final void setArm(@NotNull class_1306 class_1306Var) {
        Intrinsics.checkNotNullParameter(class_1306Var, "<set-?>");
        arm = class_1306Var;
    }

    public final boolean call(float swingProgress, @NotNull class_1306 arm2) {
        Intrinsics.checkNotNullParameter(arm2, "arm");
        setCancelled(false);
        setProgress(swingProgress);
        setArm(arm2);
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
