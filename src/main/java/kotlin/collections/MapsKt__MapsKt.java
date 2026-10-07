package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.BuilderInference;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Maps.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/MapsKt__MapsKt.class */
public class MapsKt__MapsKt extends MapsKt__MapsJVMKt {
    @NotNull
    public static final <K, V> Map<K, V> emptyMap() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        Intrinsics.checkNotNull(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> mapOf(@NotNull Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return pairs.length > 0 ? MapsKt.toMap(pairs, new LinkedHashMap(MapsKt.mapCapacity(pairs.length))) : MapsKt.emptyMap();
    }

    @InlineOnly
    private static final <K, V> Map<K, V> mapOf() {
        return MapsKt.emptyMap();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> Map<K, V> mutableMapOf() {
        return new LinkedHashMap();
    }

    @NotNull
    public static final <K, V> Map<K, V> mutableMapOf(@NotNull Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap $this$mutableMapOf_u24lambda_u240 = new LinkedHashMap(MapsKt.mapCapacity(pairs.length));
        MapsKt.putAll($this$mutableMapOf_u24lambda_u240, pairs);
        return $this$mutableMapOf_u24lambda_u240;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> HashMap<K, V> hashMapOf() {
        return new HashMap<>();
    }

    @NotNull
    public static final <K, V> HashMap<K, V> hashMapOf(@NotNull Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        HashMap<K, V> map = new HashMap<>(MapsKt.mapCapacity(pairs.length));
        MapsKt.putAll(map, pairs);
        return map;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> LinkedHashMap<K, V> linkedMapOf() {
        return new LinkedHashMap<>();
    }

    @NotNull
    public static final <K, V> LinkedHashMap<K, V> linkedMapOf(@NotNull Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return (LinkedHashMap) MapsKt.toMap(pairs, new LinkedHashMap(MapsKt.mapCapacity(pairs.length)));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final <K, V> Map<K, V> buildMap(@BuilderInference Function1<? super Map<K, V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        builderAction.invoke(mapCreateMapBuilder);
        return MapsKt.build(mapCreateMapBuilder);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final <K, V> Map<K, V> buildMap(int capacity, @BuilderInference Function1<? super Map<K, V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder(capacity);
        builderAction.invoke(mapCreateMapBuilder);
        return MapsKt.build(mapCreateMapBuilder);
    }

    @InlineOnly
    private static final <K, V> boolean isNotEmpty(Map<? extends K, ? extends V> $this$isNotEmpty) {
        Intrinsics.checkNotNullParameter($this$isNotEmpty, "<this>");
        return !$this$isNotEmpty.isEmpty();
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <K, V> boolean isNullOrEmpty(Map<? extends K, ? extends V> $this$isNullOrEmpty) {
        return $this$isNullOrEmpty == null || $this$isNullOrEmpty.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <K, V> Map<K, V> orEmpty(Map<K, ? extends V> $this$orEmpty) {
        return $this$orEmpty == 0 ? MapsKt.emptyMap() : $this$orEmpty;
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final Object ifEmpty(Map $this$ifEmpty, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return $this$ifEmpty.isEmpty() ? defaultValue.invoke() : $this$ifEmpty;
    }

    @InlineOnly
    private static final <K, V> boolean contains(Map<? extends K, ? extends V> $this$contains, K key) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.containsKey(key);
    }

    @InlineOnly
    private static final <K, V> V get(Map<? extends K, ? extends V> $this$get, K key) {
        Intrinsics.checkNotNullParameter($this$get, "<this>");
        return $this$get.get(key);
    }

    @InlineOnly
    private static final <K, V> void set(Map<K, V> $this$set, K key, V value) {
        Intrinsics.checkNotNullParameter($this$set, "<this>");
        $this$set.put(key, value);
    }

    @InlineOnly
    private static final <K> boolean containsKey(Map<? extends K, ?> $this$containsKey, K key) {
        Intrinsics.checkNotNullParameter($this$containsKey, "<this>");
        return $this$containsKey.containsKey(key);
    }

    @InlineOnly
    private static final <K, V> boolean containsValue(Map<K, ? extends V> $this$containsValue, V value) {
        Intrinsics.checkNotNullParameter($this$containsValue, "<this>");
        return $this$containsValue.containsValue(value);
    }

    @InlineOnly
    private static final <K, V> V remove(Map<? extends K, V> map, K k) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return (V) TypeIntrinsics.asMutableMap(map).remove(k);
    }

    @InlineOnly
    private static final <K, V> K component1(Map.Entry<? extends K, ? extends V> $this$component1) {
        Intrinsics.checkNotNullParameter($this$component1, "<this>");
        return $this$component1.getKey();
    }

    @InlineOnly
    private static final <K, V> V component2(Map.Entry<? extends K, ? extends V> $this$component2) {
        Intrinsics.checkNotNullParameter($this$component2, "<this>");
        return $this$component2.getValue();
    }

    @InlineOnly
    private static final <K, V> Pair<K, V> toPair(Map.Entry<? extends K, ? extends V> $this$toPair) {
        Intrinsics.checkNotNullParameter($this$toPair, "<this>");
        return new Pair<>($this$toPair.getKey(), $this$toPair.getValue());
    }

    @InlineOnly
    private static final <K, V> V getOrElse(Map<K, ? extends V> $this$getOrElse, K key, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter($this$getOrElse, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v = $this$getOrElse.get(key);
        return v == null ? defaultValue.invoke() : v;
    }

    public static final <K, V> V getOrElseNullable(@NotNull Map<K, ? extends V> $this$getOrElseNullable, K key, @NotNull Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter($this$getOrElseNullable, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v = $this$getOrElseNullable.get(key);
        if (v == null && !$this$getOrElseNullable.containsKey(key)) {
            return defaultValue.invoke();
        }
        return v;
    }

    @SinceKotlin(version = "1.1")
    public static final <K, V> V getValue(@NotNull Map<K, ? extends V> map, K k) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return (V) MapsKt.getOrImplicitDefaultNullable(map, k);
    }

    public static final <K, V> V getOrPut(@NotNull Map<K, V> $this$getOrPut, K key, @NotNull Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter($this$getOrPut, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v = $this$getOrPut.get(key);
        if (v == null) {
            V vInvoke = defaultValue.invoke();
            $this$getOrPut.put(key, vInvoke);
            return vInvoke;
        }
        return v;
    }

    @InlineOnly
    private static final <K, V> Iterator<Map.Entry<K, V>> iterator(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @JvmName(name = "mutableIterator")
    @InlineOnly
    private static final <K, V> Iterator<Map.Entry<K, V>> mutableIterator(Map<K, V> $this$iterator) {
        Intrinsics.checkNotNullParameter($this$iterator, "<this>");
        return $this$iterator.entrySet().iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R, M extends Map<? super K, ? super R>> M mapValuesTo(@NotNull Map<? extends K, ? extends V> $this$mapValuesTo, @NotNull M destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapValuesTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterable $this$associateByTo$iv = $this$mapValuesTo.entrySet();
        for (Object element$iv : $this$associateByTo$iv) {
            Map.Entry it = (Map.Entry) element$iv;
            destination.put(it.getKey(), transform.invoke(element$iv));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R, M extends Map<? super R, ? super V>> M mapKeysTo(@NotNull Map<? extends K, ? extends V> $this$mapKeysTo, @NotNull M destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapKeysTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterable $this$associateByTo$iv = $this$mapKeysTo.entrySet();
        for (Object element$iv : $this$associateByTo$iv) {
            Map.Entry it = (Map.Entry) element$iv;
            destination.put(transform.invoke(element$iv), it.getValue());
        }
        return destination;
    }

    public static final <K, V> void putAll(@NotNull Map<? super K, ? super V> $this$putAll, @NotNull Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter($this$putAll, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            Object key = pair.component1();
            Object value = pair.component2();
            $this$putAll.put(key, value);
        }
    }

    public static final <K, V> void putAll(@NotNull Map<? super K, ? super V> $this$putAll, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter($this$putAll, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            Object key = pair.component1();
            Object value = pair.component2();
            $this$putAll.put(key, value);
        }
    }

    public static final <K, V> void putAll(@NotNull Map<? super K, ? super V> $this$putAll, @NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter($this$putAll, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            Object key = pair.component1();
            Object value = pair.component2();
            $this$putAll.put(key, value);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R> Map<K, R> mapValues(@NotNull Map<? extends K, ? extends V> map, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Object obj : map.entrySet()) {
            linkedHashMap.put(((Map.Entry) obj).getKey(), transform.invoke(obj));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R> Map<R, V> mapKeys(@NotNull Map<? extends K, ? extends V> map, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Object obj : map.entrySet()) {
            linkedHashMap.put(transform.invoke(obj), ((Map.Entry) obj).getValue());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> filterKeys(@NotNull Map<? extends K, ? extends V> map, @NotNull Function1<? super K, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> filterValues(@NotNull Map<? extends K, ? extends V> map, @NotNull Function1<? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M filterTo(@NotNull Map<? extends K, ? extends V> $this$filterTo, @NotNull M destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$filterTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : $this$filterTo.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    @NotNull
    public static final <K, V> Map<K, V> filter(@NotNull Map<? extends K, ? extends V> $this$filter, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$filter, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Map destination$iv = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : $this$filter.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                destination$iv.put(entry.getKey(), entry.getValue());
            }
        }
        return destination$iv;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M filterNotTo(@NotNull Map<? extends K, ? extends V> $this$filterNotTo, @NotNull M destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$filterNotTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : $this$filterNotTo.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    @NotNull
    public static final <K, V> Map<K, V> filterNot(@NotNull Map<? extends K, ? extends V> $this$filterNot, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$filterNot, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Map destination$iv = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : $this$filterNot.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                destination$iv.put(entry.getKey(), entry.getValue());
            }
        }
        return destination$iv;
    }

    @NotNull
    public static final <K, V> Map<K, V> toMap(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> $this$toMap) {
        Intrinsics.checkNotNullParameter($this$toMap, "<this>");
        if ($this$toMap instanceof Collection) {
            switch (((Collection) $this$toMap).size()) {
                case 0:
                    return MapsKt.emptyMap();
                case 1:
                    return MapsKt.mapOf($this$toMap instanceof List ? (Pair) ((List) $this$toMap).get(0) : (Pair) ((Collection) $this$toMap).iterator().next());
                default:
                    return MapsKt.toMap($this$toMap, new LinkedHashMap(MapsKt.mapCapacity(((Collection) $this$toMap).size())));
            }
        }
        return MapsKt.optimizeReadOnlyMap(MapsKt.toMap($this$toMap, new LinkedHashMap()));
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> $this$toMap, @NotNull M destination) {
        Intrinsics.checkNotNullParameter($this$toMap, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MapsKt.putAll(destination, $this$toMap);
        return destination;
    }

    @NotNull
    public static final <K, V> Map<K, V> toMap(@NotNull Pair<? extends K, ? extends V>[] $this$toMap) {
        Intrinsics.checkNotNullParameter($this$toMap, "<this>");
        switch ($this$toMap.length) {
            case 0:
                return MapsKt.emptyMap();
            case 1:
                return MapsKt.mapOf($this$toMap[0]);
            default:
                return MapsKt.toMap($this$toMap, new LinkedHashMap(MapsKt.mapCapacity($this$toMap.length)));
        }
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Pair<? extends K, ? extends V>[] $this$toMap, @NotNull M destination) {
        Intrinsics.checkNotNullParameter($this$toMap, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MapsKt.putAll(destination, $this$toMap);
        return destination;
    }

    @NotNull
    public static final <K, V> Map<K, V> toMap(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> $this$toMap) {
        Intrinsics.checkNotNullParameter($this$toMap, "<this>");
        return MapsKt.optimizeReadOnlyMap(MapsKt.toMap($this$toMap, new LinkedHashMap()));
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> $this$toMap, @NotNull M destination) {
        Intrinsics.checkNotNullParameter($this$toMap, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MapsKt.putAll(destination, $this$toMap);
        return destination;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> toMap(@NotNull Map<? extends K, ? extends V> $this$toMap) {
        Intrinsics.checkNotNullParameter($this$toMap, "<this>");
        switch ($this$toMap.size()) {
            case 0:
                return MapsKt.emptyMap();
            case 1:
                return MapsKt.toSingletonMap($this$toMap);
            default:
                return MapsKt.toMutableMap($this$toMap);
        }
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> toMutableMap(@NotNull Map<? extends K, ? extends V> $this$toMutableMap) {
        Intrinsics.checkNotNullParameter($this$toMutableMap, "<this>");
        return new LinkedHashMap($this$toMutableMap);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Map<? extends K, ? extends V> $this$toMap, @NotNull M destination) {
        Intrinsics.checkNotNullParameter($this$toMap, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.putAll($this$toMap);
        return destination;
    }

    @NotNull
    public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $this$plus, @NotNull Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        if ($this$plus.isEmpty()) {
            return MapsKt.mapOf(pair);
        }
        LinkedHashMap $this$plus_u24lambda_u248 = new LinkedHashMap($this$plus);
        $this$plus_u24lambda_u248.put(pair.getFirst(), pair.getSecond());
        return $this$plus_u24lambda_u248;
    }

    @NotNull
    public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $this$plus, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if ($this$plus.isEmpty()) {
            return MapsKt.toMap(pairs);
        }
        LinkedHashMap $this$plus_u24lambda_u249 = new LinkedHashMap($this$plus);
        MapsKt.putAll($this$plus_u24lambda_u249, pairs);
        return $this$plus_u24lambda_u249;
    }

    @NotNull
    public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $this$plus, @NotNull Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if ($this$plus.isEmpty()) {
            return MapsKt.toMap(pairs);
        }
        LinkedHashMap $this$plus_u24lambda_u2410 = new LinkedHashMap($this$plus);
        MapsKt.putAll($this$plus_u24lambda_u2410, pairs);
        return $this$plus_u24lambda_u2410;
    }

    @NotNull
    public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $this$plus, @NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap $this$plus_u24lambda_u2411 = new LinkedHashMap($this$plus);
        MapsKt.putAll($this$plus_u24lambda_u2411, pairs);
        return MapsKt.optimizeReadOnlyMap($this$plus_u24lambda_u2411);
    }

    @NotNull
    public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $this$plus, @NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        LinkedHashMap $this$plus_u24lambda_u2412 = new LinkedHashMap($this$plus);
        $this$plus_u24lambda_u2412.putAll(map);
        return $this$plus_u24lambda_u2412;
    }

    @InlineOnly
    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        map.put(pair.getFirst(), pair.getSecond());
    }

    @InlineOnly
    private static final <K, V> void plusAssign(Map<? super K, ? super V> $this$plusAssign, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MapsKt.putAll($this$plusAssign, pairs);
    }

    @InlineOnly
    private static final <K, V> void plusAssign(Map<? super K, ? super V> $this$plusAssign, Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MapsKt.putAll($this$plusAssign, pairs);
    }

    @InlineOnly
    private static final <K, V> void plusAssign(Map<? super K, ? super V> $this$plusAssign, Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MapsKt.putAll($this$plusAssign, pairs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <K, V> void plusAssign(Map<? super K, ? super V> $this$plusAssign, Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        $this$plusAssign.putAll(map);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> $this$minus, K key) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Map $this$minus_u24lambda_u2413 = MapsKt.toMutableMap($this$minus);
        $this$minus_u24lambda_u2413.remove(key);
        return MapsKt.optimizeReadOnlyMap($this$minus_u24lambda_u2413);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> $this$minus, @NotNull Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Map $this$minus_u24lambda_u2414 = MapsKt.toMutableMap($this$minus);
        CollectionsKt.removeAll($this$minus_u24lambda_u2414.keySet(), keys);
        return MapsKt.optimizeReadOnlyMap($this$minus_u24lambda_u2414);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> $this$minus, @NotNull K[] keys) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Map $this$minus_u24lambda_u2415 = MapsKt.toMutableMap($this$minus);
        CollectionsKt.removeAll($this$minus_u24lambda_u2415.keySet(), keys);
        return MapsKt.optimizeReadOnlyMap($this$minus_u24lambda_u2415);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> $this$minus, @NotNull Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Map $this$minus_u24lambda_u2416 = MapsKt.toMutableMap($this$minus);
        CollectionsKt.removeAll($this$minus_u24lambda_u2416.keySet(), keys);
        return MapsKt.optimizeReadOnlyMap($this$minus_u24lambda_u2416);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> void minusAssign(Map<K, V> $this$minusAssign, K key) {
        Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
        $this$minusAssign.remove(key);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> void minusAssign(Map<K, V> $this$minusAssign, Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        CollectionsKt.removeAll($this$minusAssign.keySet(), keys);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> void minusAssign(Map<K, V> $this$minusAssign, K[] keys) {
        Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        CollectionsKt.removeAll($this$minusAssign.keySet(), keys);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> void minusAssign(Map<K, V> $this$minusAssign, Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        CollectionsKt.removeAll($this$minusAssign.keySet(), keys);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> optimizeReadOnlyMap(@NotNull Map<K, ? extends V> $this$optimizeReadOnlyMap) {
        Intrinsics.checkNotNullParameter($this$optimizeReadOnlyMap, "<this>");
        switch ($this$optimizeReadOnlyMap.size()) {
            case 0:
                return MapsKt.emptyMap();
            case 1:
                return MapsKt.toSingletonMap($this$optimizeReadOnlyMap);
            default:
                return $this$optimizeReadOnlyMap;
        }
    }
}
