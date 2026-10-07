package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/MutableMapWithDefaultImpl.class */
final class MutableMapWithDefaultImpl<K, V> implements MutableMapWithDefault<K, V> {

    @NotNull
    private final Map<K, V> map;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @NotNull
    private final Function1<K, V> f2default;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableMapWithDefaultImpl(@NotNull Map<K, V> map, @NotNull Function1<? super K, ? extends V> function1) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(function1, "default");
        this.map = map;
        this.f2default = function1;
    }

    @Override // kotlin.collections.MutableMapWithDefault, kotlin.collections.MapWithDefault
    @NotNull
    public Map<K, V> getMap() {
        return this.map;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object other) {
        return getMap().equals(other);
    }

    @Override // java.util.Map
    public int hashCode() {
        return getMap().hashCode();
    }

    @NotNull
    public String toString() {
        return getMap().toString();
    }

    public int getSize() {
        return getMap().size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getMap().isEmpty();
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return getMap().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return getMap().containsValue(value);
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object key) {
        return getMap().get(key);
    }

    @NotNull
    public Set<K> getKeys() {
        return getMap().keySet();
    }

    @NotNull
    public Collection<V> getValues() {
        return getMap().values();
    }

    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return getMap().entrySet();
    }

    @Override // java.util.Map
    @Nullable
    public V put(K key, V value) {
        return getMap().put(key, value);
    }

    @Override // java.util.Map
    @Nullable
    public V remove(Object key) {
        return getMap().remove(key);
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        getMap().putAll(from);
    }

    @Override // java.util.Map
    public void clear() {
        getMap().clear();
    }

    @Override // kotlin.collections.MapWithDefault
    public V getOrImplicitDefault(K key) {
        Map<K, V> map = getMap();
        V v = map.get(key);
        if (v == null && !map.containsKey(key)) {
            return this.f2default.invoke(key);
        }
        return v;
    }
}
