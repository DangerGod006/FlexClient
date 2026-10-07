package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import net.minecraft.class_1306;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: SwingArmEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/SwingArmEvent.class */
public final class SwingArmEvent extends Event {
    public static class_4587 matrices;
    public static class_1306 arm;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SwingArmEvent.class, "swingProgress", "getSwingProgress()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SwingArmEvent.class, "armX", "getArmX()I", 0))};

    @NotNull
    public static final SwingArmEvent INSTANCE = new SwingArmEvent();

    @NotNull
    private static final ReadWriteProperty swingProgress$delegate = Delegates.INSTANCE.notNull();

    @NotNull
    private static final ReadWriteProperty armX$delegate = Delegates.INSTANCE.notNull();

    private SwingArmEvent() {
    }

    public final float getSwingProgress() {
        return ((Number) swingProgress$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    public final void setSwingProgress(float f) {
        swingProgress$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f));
    }

    @NotNull
    public final class_4587 getMatrices() {
        class_4587 class_4587Var = matrices;
        if (class_4587Var != null) {
            return class_4587Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matrices");
        return null;
    }

    public final void setMatrices(@NotNull class_4587 class_4587Var) {
        Intrinsics.checkNotNullParameter(class_4587Var, "<set-?>");
        matrices = class_4587Var;
    }

    private final int getArmX() {
        return ((Number) armX$delegate.getValue(this, $$delegatedProperties[1])).intValue();
    }

    private final void setArmX(int i) {
        armX$delegate.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
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

    public final boolean call(float swingProgress, @NotNull class_4587 matrices2, int armX, @NotNull class_1306 arm2) {
        Intrinsics.checkNotNullParameter(matrices2, "matrices");
        Intrinsics.checkNotNullParameter(arm2, "arm");
        setCancelled(false);
        setSwingProgress(swingProgress);
        setMatrices(matrices2);
        setArm(arm2);
        setArmX(armX);
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
