package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.builders.MapBuilder;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: MapsJVM.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/MapsKt__MapsJVMKt.class */
public class MapsKt__MapsJVMKt extends MapsKt__MapWithDefaultKt {
    private static final int INT_MAX_POWER_OF_TWO = 1073741824;

    @NotNull
    public static final <K, V> Map<K, V> mapOf(@NotNull Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final <K, V> Map<K, V> buildMapInternal(Function1<? super Map<K, V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        builderAction.invoke(mapCreateMapBuilder);
        return MapsKt.build(mapCreateMapBuilder);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final <K, V> Map<K, V> buildMapInternal(int capacity, Function1<? super Map<K, V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder(capacity);
        builderAction.invoke(mapCreateMapBuilder);
        return MapsKt.build(mapCreateMapBuilder);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final <K, V> Map<K, V> createMapBuilder() {
        return new MapBuilder();
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final <K, V> Map<K, V> createMapBuilder(int capacity) {
        return new MapBuilder(capacity);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final <K, V> Map<K, V> build(@NotNull Map<K, V> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((MapBuilder) builder).build();
    }

    public static final <K, V> V getOrPut(@NotNull ConcurrentMap<K, V> $this$getOrPut, K key, @NotNull Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter($this$getOrPut, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v = $this$getOrPut.get(key);
        if (v != null) {
            return v;
        }
        V vInvoke = defaultValue.invoke();
        V vPutIfAbsent = $this$getOrPut.putIfAbsent(key, vInvoke);
        return vPutIfAbsent == null ? vInvoke : vPutIfAbsent;
    }

    @NotNull
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> toSortedMap(@NotNull Map<? extends K, ? extends V> $this$toSortedMap) {
        Intrinsics.checkNotNullParameter($this$toSortedMap, "<this>");
        return new TreeMap($this$toSortedMap);
    }

    @NotNull
    public static final <K, V> SortedMap<K, V> toSortedMap(@NotNull Map<? extends K, ? extends V> $this$toSortedMap, @NotNull Comparator<? super K> comparator) {
        Intrinsics.checkNotNullParameter($this$toSortedMap, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        TreeMap $this$toSortedMap_u24lambda_u241 = new TreeMap(comparator);
        $this$toSortedMap_u24lambda_u241.putAll($this$toSortedMap);
        return $this$toSortedMap_u24lambda_u241;
    }

    @NotNull
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> sortedMapOf(@NotNull Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        TreeMap $this$sortedMapOf_u24lambda_u242 = new TreeMap();
        MapsKt.putAll($this$sortedMapOf_u24lambda_u242, pairs);
        return $this$sortedMapOf_u24lambda_u242;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <K, V> SortedMap<K, V> sortedMapOf(@NotNull Comparator<? super K> comparator, @NotNull Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        TreeMap $this$sortedMapOf_u24lambda_u243 = new TreeMap(comparator);
        MapsKt.putAll($this$sortedMapOf_u24lambda_u243, pairs);
        return $this$sortedMapOf_u24lambda_u243;
    }

    @InlineOnly
    private static final Properties toProperties(Map<String, String> $this$toProperties) {
        Intrinsics.checkNotNullParameter($this$toProperties, "<this>");
        Properties $this$toProperties_u24lambda_u244 = new Properties();
        $this$toProperties_u24lambda_u244.putAll($this$toProperties);
        return $this$toProperties_u24lambda_u244;
    }

    @InlineOnly
    private static final <K, V> Map<K, V> toSingletonMapOrSelf(Map<K, ? extends V> $this$toSingletonMapOrSelf) {
        Intrinsics.checkNotNullParameter($this$toSingletonMapOrSelf, "<this>");
        return MapsKt.toSingletonMap($this$toSingletonMapOrSelf);
    }

    @NotNull
    public static final <K, V> Map<K, V> toSingletonMap(@NotNull Map<? extends K, ? extends V> $this$toSingletonMap) {
        Intrinsics.checkNotNullParameter($this$toSingletonMap, "<this>");
        Map.Entry<? extends K, ? extends V> next = $this$toSingletonMap.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    @PublishedApi
    public static final int mapCapacity(int expectedSize) {
        return expectedSize < 0 ? expectedSize : expectedSize < 3 ? expectedSize + 1 : expectedSize < INT_MAX_POWER_OF_TWO ? (int) ((expectedSize / 0.75f) + 1.0f) : IntCompanionObject.MAX_VALUE;
    }
}
