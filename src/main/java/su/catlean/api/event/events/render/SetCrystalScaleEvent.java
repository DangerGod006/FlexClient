package su.catlean.api.event.events.render;

import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: SetCrystalScaleEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/SetCrystalScaleEvent.class */
public final class SetCrystalScaleEvent extends Event {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SetCrystalScaleEvent.class, "age", "getAge()F", 0))};

    @NotNull
    public static final SetCrystalScaleEvent INSTANCE = new SetCrystalScaleEvent();
    private static float scale = 1.0f;

    @NotNull
    private static final ReadWriteProperty age$delegate = Delegates.INSTANCE.notNull();

    private SetCrystalScaleEvent() {
    }

    public final float getScale() {
        return scale;
    }

    public final void setScale(float f) {
        scale = f;
    }

    public final float getAge() {
        return ((Number) age$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    public final void setAge(float f) {
        age$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f));
    }

    public final boolean call(float age) {
        scale = 1.0f;
        setCancelled(false);
        setAge(age);
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
