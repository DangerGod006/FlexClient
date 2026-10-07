package kotlin.properties;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ObservableProperty.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/properties/ObservableProperty.class */
public abstract class ObservableProperty<V> implements ReadWriteProperty<Object, V> {
    private V value;

    public ObservableProperty(V initialValue) {
        this.value = initialValue;
    }

    protected boolean beforeChange(@NotNull KProperty<?> property, V oldValue, V newValue) {
        Intrinsics.checkNotNullParameter(property, "property");
        return true;
    }

    protected void afterChange(@NotNull KProperty<?> property, V oldValue, V newValue) {
        Intrinsics.checkNotNullParameter(property, "property");
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public V getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.value;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, V value) {
        Intrinsics.checkNotNullParameter(property, "property");
        V v = this.value;
        if (!beforeChange(property, v, value)) {
            return;
        }
        this.value = value;
        afterChange(property, v, value);
    }

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
