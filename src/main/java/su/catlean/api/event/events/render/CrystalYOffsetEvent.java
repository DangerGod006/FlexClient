package su.catlean.api.event.events.render;

import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: CrystalYOffsetEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/CrystalYOffsetEvent.class */
public final class CrystalYOffsetEvent extends Event {
    private static float offset;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CrystalYOffsetEvent.class, "age", "getAge()F", 0))};

    @NotNull
    public static final CrystalYOffsetEvent INSTANCE = new CrystalYOffsetEvent();

    @NotNull
    private static final ReadWriteProperty age$delegate = Delegates.INSTANCE.notNull();

    private CrystalYOffsetEvent() {
    }

    public final float getOffset() {
        return offset;
    }

    public final void setOffset(float f) {
        offset = f;
    }

    public final float getAge() {
        return ((Number) age$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    public final void setAge(float f) {
        age$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f));
    }

    public final boolean call(float age) {
        setAge(age);
        setCancelled(false);
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
