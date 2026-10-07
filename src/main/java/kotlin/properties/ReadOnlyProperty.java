package kotlin.properties;

import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Interfaces.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/properties/ReadOnlyProperty.class */
public interface ReadOnlyProperty<T, V> {
    V getValue(T t, @NotNull KProperty<?> kProperty);
}
