package kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Grouping.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/GroupingKt__GroupingKt.class */
class GroupingKt__GroupingKt extends GroupingKt__GroupingJVMKt {
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> aggregate(@NotNull Grouping<T, ? extends K> $this$aggregate, @NotNull Function4<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter($this$aggregate, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itSourceIterator = $this$aggregate.sourceIterator();
        while (itSourceIterator.hasNext()) {
            T next = itSourceIterator.next();
            Object key$iv = $this$aggregate.keyOf(next);
            Object accumulator$iv = linkedHashMap.get(key$iv);
            linkedHashMap.put(key$iv, operation.invoke(key$iv, accumulator$iv, next, Boolean.valueOf(accumulator$iv == null && !linkedHashMap.containsKey(key$iv))));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M aggregateTo(@NotNull Grouping<T, ? extends K> $this$aggregateTo, @NotNull M destination, @NotNull Function4<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter($this$aggregateTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<T> itSourceIterator = $this$aggregateTo.sourceIterator();
        while (itSourceIterator.hasNext()) {
            T next = itSourceIterator.next();
            Object key = $this$aggregateTo.keyOf(next);
            Object accumulator = destination.get(key);
            destination.put(key, operation.invoke(key, accumulator, next, Boolean.valueOf(accumulator == null && !destination.containsKey(key))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> fold(@NotNull Grouping<T, ? extends K> $this$fold, @NotNull Function2<? super K, ? super T, ? extends R> initialValueSelector, @NotNull Function3<? super K, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter($this$fold, "<this>");
        Intrinsics.checkNotNullParameter(initialValueSelector, "initialValueSelector");
        Intrinsics.checkNotNullParameter(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itSourceIterator = $this$fold.sourceIterator();
        while (itSourceIterator.hasNext()) {
            T next = itSourceIterator.next();
            Object key$iv$iv = $this$fold.keyOf(next);
            Object accumulator$iv$iv = linkedHashMap.get(key$iv$iv);
            boolean first = accumulator$iv$iv == null && !linkedHashMap.containsKey(key$iv$iv);
            linkedHashMap.put(key$iv$iv, operation.invoke(key$iv$iv, first ? initialValueSelector.invoke(key$iv$iv, next) : accumulator$iv$iv, next));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M foldTo(@NotNull Grouping<T, ? extends K> $this$foldTo, @NotNull M destination, @NotNull Function2<? super K, ? super T, ? extends R> initialValueSelector, @NotNull Function3<? super K, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter($this$foldTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(initialValueSelector, "initialValueSelector");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<T> itSourceIterator = $this$foldTo.sourceIterator();
        while (itSourceIterator.hasNext()) {
            T next = itSourceIterator.next();
            Object key$iv = $this$foldTo.keyOf(next);
            Object accumulator$iv = destination.get(key$iv);
            boolean first = accumulator$iv == null && !destination.containsKey(key$iv);
            destination.put(key$iv, operation.invoke(key$iv, first ? initialValueSelector.invoke(key$iv, next) : accumulator$iv, next));
        }
        return destination;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> fold(@NotNull Grouping<T, ? extends K> $this$fold, R initialValue, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter($this$fold, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Map destination$iv$iv = new LinkedHashMap();
        Iterator<T> itSourceIterator = $this$fold.sourceIterator();
        while (itSourceIterator.hasNext()) {
            T next = itSourceIterator.next();
            K kKeyOf = $this$fold.keyOf(next);
            Object accumulator$iv$iv = destination$iv$iv.get(kKeyOf);
            boolean first = accumulator$iv$iv == null && !destination$iv$iv.containsKey(kKeyOf);
            destination$iv$iv.put(kKeyOf, operation.invoke(first ? initialValue : accumulator$iv$iv, next));
        }
        return destination$iv$iv;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M foldTo(@NotNull Grouping<T, ? extends K> $this$foldTo, @NotNull M destination, R initialValue, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter($this$foldTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<T> itSourceIterator = $this$foldTo.sourceIterator();
        while (itSourceIterator.hasNext()) {
            T next = itSourceIterator.next();
            K kKeyOf = $this$foldTo.keyOf(next);
            Object accumulator$iv = destination.get(kKeyOf);
            boolean first = accumulator$iv == null && !destination.containsKey(kKeyOf);
            destination.put(kKeyOf, operation.invoke(first ? initialValue : accumulator$iv, next));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Object] */
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <S, T extends S, K> Map<K, S> reduce(@NotNull Grouping<T, ? extends K> grouping, @NotNull Function3<? super K, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(grouping, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            Object objKeyOf = grouping.keyOf(next);
            Object obj = linkedHashMap.get(objKeyOf);
            linkedHashMap.put(objKeyOf, obj == null && !linkedHashMap.containsKey(objKeyOf) ? (S) (next == true ? 1 : 0) : operation.invoke(objKeyOf, obj, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Object] */
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <S, T extends S, K, M extends Map<? super K, S>> M reduceTo(@NotNull Grouping<T, ? extends K> grouping, @NotNull M destination, @NotNull Function3<? super K, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(grouping, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<T> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            Object objKeyOf = grouping.keyOf(next);
            Object obj = destination.get(objKeyOf);
            destination.put(objKeyOf, obj == null && !destination.containsKey(objKeyOf) ? (S) (next == true ? 1 : 0) : operation.invoke(objKeyOf, obj, next));
        }
        return destination;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, M extends Map<? super K, Integer>> M eachCountTo(@NotNull Grouping<T, ? extends K> $this$eachCountTo, @NotNull M destination) {
        Intrinsics.checkNotNullParameter($this$eachCountTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator<T> itSourceIterator = $this$eachCountTo.sourceIterator();
        while (itSourceIterator.hasNext()) {
            K kKeyOf = $this$eachCountTo.keyOf(itSourceIterator.next());
            Object accumulator$iv$iv = destination.get(kKeyOf);
            boolean first$iv = accumulator$iv$iv == null && !destination.containsKey(kKeyOf);
            int acc = ((Number) (first$iv ? 0 : accumulator$iv$iv)).intValue();
            destination.put(kKeyOf, Integer.valueOf(acc + 1));
        }
        return destination;
    }
}
