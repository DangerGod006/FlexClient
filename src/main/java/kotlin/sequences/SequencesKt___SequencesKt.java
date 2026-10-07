package kotlin.sequences;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.IndexedValue;
import kotlin.collections.SetsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/SequencesKt___SequencesKt.class */
public class SequencesKt___SequencesKt extends SequencesKt___SequencesJvmKt {
    public static final <T> boolean contains(@NotNull Sequence<? extends T> $this$contains, T element) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return SequencesKt.indexOf($this$contains, element) >= 0;
    }

    public static final <T> T elementAt(@NotNull Sequence<? extends T> sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return (T) SequencesKt.elementAtOrElse(sequence, i, (v1) -> {
            return elementAt$lambda$0$SequencesKt___SequencesKt(r2, v1);
        });
    }

    private static final Object elementAt$lambda$0$SequencesKt___SequencesKt(int $index, int it) {
        throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + $index + '.');
    }

    public static final <T> T elementAtOrElse(@NotNull Sequence<? extends T> $this$elementAtOrElse, int index, @NotNull Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter($this$elementAtOrElse, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (index < 0) {
            return defaultValue.invoke(Integer.valueOf(index));
        }
        int count = 0;
        for (T t : $this$elementAtOrElse) {
            int i = count;
            count++;
            if (index == i) {
                return t;
            }
        }
        return defaultValue.invoke(Integer.valueOf(index));
    }

    @Nullable
    public static final <T> T elementAtOrNull(@NotNull Sequence<? extends T> $this$elementAtOrNull, int index) {
        Intrinsics.checkNotNullParameter($this$elementAtOrNull, "<this>");
        if (index < 0) {
            return null;
        }
        int count = 0;
        for (T t : $this$elementAtOrNull) {
            int i = count;
            count++;
            if (index == i) {
                return t;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Object] */
    @InlineOnly
    private static final <T> T find(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t : sequence) {
            if (predicate.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @InlineOnly
    private static final <T> T findLast(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object obj = null;
        for (Object obj2 : sequence) {
            if (predicate.invoke(obj2).booleanValue()) {
                obj = obj2;
            }
        }
        return (T) obj;
    }

    public static final <T> T first(@NotNull Sequence<? extends T> $this$first) {
        Intrinsics.checkNotNullParameter($this$first, "<this>");
        Iterator<? extends T> it = $this$first.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        return it.next();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Object] */
    public static final <T> T first(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t : sequence) {
            if (predicate.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T, R> R firstNotNullOf(Sequence<? extends T> sequence, Function1<? super T, ? extends R> transform) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        while (true) {
            if (!it.hasNext()) {
                rInvoke = null;
                break;
            }
            rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                break;
            }
        }
        if (rInvoke == null) {
            throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T, R> R firstNotNullOfOrNull(Sequence<? extends T> $this$firstNotNullOfOrNull, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$firstNotNullOfOrNull, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (Object element : $this$firstNotNullOfOrNull) {
            R rInvoke = transform.invoke(element);
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @Nullable
    public static final <T> T firstOrNull(@NotNull Sequence<? extends T> $this$firstOrNull) {
        Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
        Iterator<? extends T> it = $this$firstOrNull.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Object] */
    @Nullable
    public static final <T> T firstOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t : sequence) {
            if (predicate.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    public static final <T> int indexOf(@NotNull Sequence<? extends T> $this$indexOf, T element) {
        Intrinsics.checkNotNullParameter($this$indexOf, "<this>");
        int index = 0;
        for (Object item : $this$indexOf) {
            if (index < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(element, item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(@NotNull Sequence<? extends T> $this$indexOfFirst, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$indexOfFirst, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int index = 0;
        for (Object item : $this$indexOfFirst) {
            if (index < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (predicate.invoke(item).booleanValue()) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(@NotNull Sequence<? extends T> $this$indexOfLast, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$indexOfLast, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int lastIndex = -1;
        int index = 0;
        for (Object item : $this$indexOfLast) {
            if (index < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (predicate.invoke(item).booleanValue()) {
                lastIndex = index;
            }
            index++;
        }
        return lastIndex;
    }

    public static final <T> T last(@NotNull Sequence<? extends T> $this$last) {
        Intrinsics.checkNotNullParameter($this$last, "<this>");
        Iterator<? extends T> it = $this$last.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (true) {
            T t = next;
            if (it.hasNext()) {
                next = it.next();
            } else {
                return t;
            }
        }
    }

    public static final <T> T last(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object obj = null;
        boolean z = false;
        for (Object obj2 : sequence) {
            if (predicate.invoke(obj2).booleanValue()) {
                obj = obj2;
                z = true;
            }
        }
        if (z) {
            return (T) obj;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final <T> int lastIndexOf(@NotNull Sequence<? extends T> $this$lastIndexOf, T element) {
        Intrinsics.checkNotNullParameter($this$lastIndexOf, "<this>");
        int lastIndex = -1;
        int index = 0;
        for (Object item : $this$lastIndexOf) {
            if (index < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(element, item)) {
                lastIndex = index;
            }
            index++;
        }
        return lastIndex;
    }

    @Nullable
    public static final <T> T lastOrNull(@NotNull Sequence<? extends T> $this$lastOrNull) {
        Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
        Iterator<? extends T> it = $this$lastOrNull.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (true) {
            T t = next;
            if (it.hasNext()) {
                next = it.next();
            } else {
                return t;
            }
        }
    }

    @Nullable
    public static final <T> T lastOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object obj = null;
        for (Object obj2 : sequence) {
            if (predicate.invoke(obj2).booleanValue()) {
                obj = obj2;
            }
        }
        return (T) obj;
    }

    public static final <T> T single(@NotNull Sequence<? extends T> $this$single) {
        Intrinsics.checkNotNullParameter($this$single, "<this>");
        Iterator<? extends T> it = $this$single.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        return next;
    }

    public static final <T> T single(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object obj = null;
        boolean z = false;
        for (Object obj2 : sequence) {
            if (predicate.invoke(obj2).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                obj = obj2;
                z = true;
            }
        }
        if (z) {
            return (T) obj;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @Nullable
    public static final <T> T singleOrNull(@NotNull Sequence<? extends T> $this$singleOrNull) {
        Intrinsics.checkNotNullParameter($this$singleOrNull, "<this>");
        Iterator<? extends T> it = $this$singleOrNull.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @Nullable
    public static final <T> T singleOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object obj = null;
        boolean z = false;
        for (Object obj2 : sequence) {
            if (predicate.invoke(obj2).booleanValue()) {
                if (z) {
                    return null;
                }
                obj = obj2;
                z = true;
            }
        }
        if (z) {
            return (T) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Sequence<T> drop(@NotNull Sequence<? extends T> $this$drop, int n) {
        Intrinsics.checkNotNullParameter($this$drop, "<this>");
        if (n >= 0) {
            return n == 0 ? $this$drop : $this$drop instanceof DropTakeSequence ? ((DropTakeSequence) $this$drop).drop(n) : new DropSequence($this$drop, n);
        }
        throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
    }

    @NotNull
    public static final <T> Sequence<T> dropWhile(@NotNull Sequence<? extends T> $this$dropWhile, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$dropWhile, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new DropWhileSequence($this$dropWhile, predicate);
    }

    @NotNull
    public static final <T> Sequence<T> filter(@NotNull Sequence<? extends T> $this$filter, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$filter, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new FilteringSequence($this$filter, true, predicate);
    }

    @NotNull
    public static final <T> Sequence<T> filterIndexed(@NotNull Sequence<? extends T> $this$filterIndexed, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$filterIndexed, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new TransformingSequence(new FilteringSequence(new IndexingSequence($this$filterIndexed), true, (v1) -> {
            return filterIndexed$lambda$2$SequencesKt___SequencesKt(r6, v1);
        }), SequencesKt___SequencesKt::filterIndexed$lambda$3$SequencesKt___SequencesKt);
    }

    private static final boolean filterIndexed$lambda$2$SequencesKt___SequencesKt(Function2 $predicate, IndexedValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Boolean) $predicate.invoke(Integer.valueOf(it.getIndex()), it.getValue())).booleanValue();
    }

    private static final Object filterIndexed$lambda$3$SequencesKt___SequencesKt(IndexedValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getValue();
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterIndexedTo(@NotNull Sequence<? extends T> $this$filterIndexedTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$filterIndexedTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int index$iv = 0;
        for (Object item$iv : $this$filterIndexedTo) {
            int index = index$iv;
            index$iv++;
            if (index < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (predicate.invoke(Integer.valueOf(index), item$iv).booleanValue()) {
                destination.add(item$iv);
            }
        }
        return destination;
    }

    public static final /* synthetic */ <R> Sequence<R> filterIsInstance(Sequence<?> $this$filterIsInstance) {
        Intrinsics.checkNotNullParameter($this$filterIsInstance, "<this>");
        Intrinsics.needClassReification();
        Sequence<R> sequenceFilter = SequencesKt.filter($this$filterIsInstance, new Function1<Object, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object it) {
                Intrinsics.reifiedOperationMarker(3, "R");
                return Boolean.valueOf(it instanceof Object);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return sequenceFilter;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Sequence<?> $this$filterIsInstanceTo, C destination) {
        Intrinsics.checkNotNullParameter($this$filterIsInstanceTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object element : $this$filterIsInstanceTo) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (element instanceof Object) {
                destination.add(element);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T> Sequence<T> filterNot(@NotNull Sequence<? extends T> $this$filterNot, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$filterNot, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new FilteringSequence($this$filterNot, false, predicate);
    }

    @NotNull
    public static final <T> Sequence<T> filterNotNull(@NotNull Sequence<? extends T> $this$filterNotNull) {
        Intrinsics.checkNotNullParameter($this$filterNotNull, "<this>");
        Sequence<T> sequenceFilterNot = SequencesKt.filterNot($this$filterNotNull, SequencesKt___SequencesKt::filterNotNull$lambda$5$SequencesKt___SequencesKt);
        Intrinsics.checkNotNull(sequenceFilterNot, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return sequenceFilterNot;
    }

    private static final boolean filterNotNull$lambda$5$SequencesKt___SequencesKt(Object it) {
        return it == null;
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C filterNotNullTo(@NotNull Sequence<? extends T> $this$filterNotNullTo, @NotNull C destination) {
        Intrinsics.checkNotNullParameter($this$filterNotNullTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t : $this$filterNotNullTo) {
            if (t != null) {
                destination.add(t);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterNotTo(@NotNull Sequence<? extends T> $this$filterNotTo, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$filterNotTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (Object element : $this$filterNotTo) {
            if (!predicate.invoke(element).booleanValue()) {
                destination.add(element);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterTo(@NotNull Sequence<? extends T> $this$filterTo, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$filterTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (Object element : $this$filterTo) {
            if (predicate.invoke(element).booleanValue()) {
                destination.add(element);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T> Sequence<T> take(@NotNull Sequence<? extends T> $this$take, int n) {
        Intrinsics.checkNotNullParameter($this$take, "<this>");
        if (n >= 0) {
            return n == 0 ? SequencesKt.emptySequence() : $this$take instanceof DropTakeSequence ? ((DropTakeSequence) $this$take).take(n) : new TakeSequence($this$take, n);
        }
        throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
    }

    @NotNull
    public static final <T> Sequence<T> takeWhile(@NotNull Sequence<? extends T> $this$takeWhile, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$takeWhile, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new TakeWhileSequence($this$takeWhile, predicate);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Sequence<T> sorted(@NotNull final Sequence<? extends T> $this$sorted) {
        Intrinsics.checkNotNullParameter($this$sorted, "<this>");
        return (Sequence) new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.sorted.1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                List sortedList = SequencesKt.toMutableList($this$sorted);
                CollectionsKt.sort(sortedList);
                return sortedList.iterator();
            }
        };
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> Sequence<T> sortedBy(@NotNull Sequence<? extends T> $this$sortedBy, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$sortedBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return SequencesKt.sortedWith($this$sortedBy, new ComparisonsKt__ComparisonsKt.AnonymousClass2(selector));
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> Sequence<T> sortedByDescending(@NotNull Sequence<? extends T> $this$sortedByDescending, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$sortedByDescending, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return SequencesKt.sortedWith($this$sortedByDescending, new ComparisonsKt__ComparisonsKt.AnonymousClass1(selector));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Sequence<T> sortedDescending(@NotNull Sequence<? extends T> $this$sortedDescending) {
        Intrinsics.checkNotNullParameter($this$sortedDescending, "<this>");
        return SequencesKt.sortedWith($this$sortedDescending, ComparisonsKt.reverseOrder());
    }

    @NotNull
    public static final <T> Sequence<T> sortedWith(@NotNull final Sequence<? extends T> $this$sortedWith, @NotNull final Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter($this$sortedWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.sortedWith.1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                List sortedList = SequencesKt.toMutableList($this$sortedWith);
                CollectionsKt.sortWith(sortedList, comparator);
                return sortedList.iterator();
            }
        };
    }

    @NotNull
    public static final <T, K, V> Map<K, V> associate(@NotNull Sequence<? extends T> $this$associate, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter($this$associate, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Map destination$iv = new LinkedHashMap();
        for (Object element$iv : $this$associate) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(element$iv);
            destination$iv.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination$iv;
    }

    @NotNull
    public static final <T, K> Map<K, T> associateBy(@NotNull Sequence<? extends T> $this$associateBy, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter($this$associateBy, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Map destination$iv = new LinkedHashMap();
        for (Object element$iv : $this$associateBy) {
            destination$iv.put(keySelector.invoke(element$iv), element$iv);
        }
        return destination$iv;
    }

    @NotNull
    public static final <T, K, V> Map<K, V> associateBy(@NotNull Sequence<? extends T> $this$associateBy, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter($this$associateBy, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        Map destination$iv = new LinkedHashMap();
        for (Object element$iv : $this$associateBy) {
            destination$iv.put(keySelector.invoke(element$iv), valueTransform.invoke(element$iv));
        }
        return destination$iv;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(@NotNull Sequence<? extends T> $this$associateByTo, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter($this$associateByTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (Object element : $this$associateByTo) {
            destination.put(keySelector.invoke(element), element);
        }
        return destination;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull Sequence<? extends T> $this$associateByTo, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter($this$associateByTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (Object element : $this$associateByTo) {
            destination.put(keySelector.invoke(element), valueTransform.invoke(element));
        }
        return destination;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull Sequence<? extends T> $this$associateTo, @NotNull M destination, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter($this$associateTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (Object element : $this$associateTo) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(element);
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <K, V> Map<K, V> associateWith(@NotNull Sequence<? extends K> $this$associateWith, @NotNull Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter($this$associateWith, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap result = new LinkedHashMap();
        for (Object element$iv : $this$associateWith) {
            result.put(element$iv, valueSelector.invoke(element$iv));
        }
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(@NotNull Sequence<? extends K> $this$associateWithTo, @NotNull M destination, @NotNull Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter($this$associateWithTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (Object element : $this$associateWithTo) {
            destination.put(element, valueSelector.invoke(element));
        }
        return destination;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C toCollection(@NotNull Sequence<? extends T> $this$toCollection, @NotNull C destination) {
        Intrinsics.checkNotNullParameter($this$toCollection, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator<? extends T> it = $this$toCollection.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    @NotNull
    public static final <T> HashSet<T> toHashSet(@NotNull Sequence<? extends T> $this$toHashSet) {
        Intrinsics.checkNotNullParameter($this$toHashSet, "<this>");
        return (HashSet) SequencesKt.toCollection($this$toHashSet, new HashSet());
    }

    @NotNull
    public static final <T> List<T> toList(@NotNull Sequence<? extends T> $this$toList) {
        Intrinsics.checkNotNullParameter($this$toList, "<this>");
        Iterator<? extends T> it = $this$toList.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.emptyList();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return CollectionsKt.listOf(next);
        }
        ArrayList dst = new ArrayList();
        dst.add(next);
        while (it.hasNext()) {
            dst.add(it.next());
        }
        return dst;
    }

    @NotNull
    public static final <T> List<T> toMutableList(@NotNull Sequence<? extends T> $this$toMutableList) {
        Intrinsics.checkNotNullParameter($this$toMutableList, "<this>");
        return (List) SequencesKt.toCollection($this$toMutableList, new ArrayList());
    }

    @NotNull
    public static final <T> Set<T> toSet(@NotNull Sequence<? extends T> $this$toSet) {
        Intrinsics.checkNotNullParameter($this$toSet, "<this>");
        Iterator<? extends T> it = $this$toSet.iterator();
        if (!it.hasNext()) {
            return SetsKt.emptySet();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return SetsKt.setOf(next);
        }
        LinkedHashSet dst = new LinkedHashSet();
        dst.add(next);
        while (it.hasNext()) {
            dst.add(it.next());
        }
        return dst;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt___SequencesKt$flatMap$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: _Sequences.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/SequencesKt___SequencesKt$flatMap$1.class */
    static final /* synthetic */ class C00111<R> extends FunctionReferenceImpl implements Function1<Iterable<? extends R>, Iterator<? extends R>> {
        public static final C00111 INSTANCE = new C00111();

        C00111() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Iterator<R> invoke(Iterable<? extends R> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.iterator();
        }
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIterable")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R> Sequence<R> flatMapIterable(@NotNull Sequence<? extends T> $this$flatMap, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter($this$flatMap, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new FlatteningSequence($this$flatMap, transform, C00111.INSTANCE);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt___SequencesKt$flatMap$2, reason: invalid class name */
    /* JADX INFO: compiled from: _Sequences.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/SequencesKt___SequencesKt$flatMap$2.class */
    static final /* synthetic */ class AnonymousClass2<R> extends FunctionReferenceImpl implements Function1<Sequence<? extends R>, Iterator<? extends R>> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Iterator<R> invoke(Sequence<? extends R> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.iterator();
        }
    }

    @NotNull
    public static final <T, R> Sequence<R> flatMap(@NotNull Sequence<? extends T> $this$flatMap, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter($this$flatMap, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new FlatteningSequence($this$flatMap, transform, AnonymousClass2.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIndexedIterable")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R> Sequence<R> flatMapIndexedIterable(@NotNull Sequence<? extends T> $this$flatMapIndexed, @NotNull Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter($this$flatMapIndexed, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return SequencesKt.flatMapIndexed($this$flatMapIndexed, transform, SequencesKt___SequencesKt$flatMapIndexed$1.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIndexedSequence")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R> Sequence<R> flatMapIndexedSequence(@NotNull Sequence<? extends T> $this$flatMapIndexed, @NotNull Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter($this$flatMapIndexed, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return SequencesKt.flatMapIndexed($this$flatMapIndexed, transform, SequencesKt___SequencesKt$flatMapIndexed$2.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIndexedIterableTo")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedIterableTo(Sequence<? extends T> $this$flatMapIndexedTo, C destination, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter($this$flatMapIndexedTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int index = 0;
        for (Object element : $this$flatMapIndexedTo) {
            int i = index;
            index++;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i), element));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIndexedSequenceTo")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedSequenceTo(Sequence<? extends T> $this$flatMapIndexedTo, C destination, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter($this$flatMapIndexedTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int index = 0;
        for (Object element : $this$flatMapIndexedTo) {
            int i = index;
            index++;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i), element));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIterableTo")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R, C extends Collection<? super R>> C flatMapIterableTo(@NotNull Sequence<? extends T> $this$flatMapTo, @NotNull C destination, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter($this$flatMapTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (Object element : $this$flatMapTo) {
            CollectionsKt.addAll(destination, transform.invoke(element));
        }
        return destination;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C flatMapTo(@NotNull Sequence<? extends T> $this$flatMapTo, @NotNull C destination, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter($this$flatMapTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (Object element : $this$flatMapTo) {
            CollectionsKt.addAll(destination, transform.invoke(element));
        }
        return destination;
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> groupBy(@NotNull Sequence<? extends T> $this$groupBy, @NotNull Function1<? super T, ? extends K> keySelector) {
        Object obj;
        Intrinsics.checkNotNullParameter($this$groupBy, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Map destination$iv = new LinkedHashMap();
        for (Object element$iv : $this$groupBy) {
            K kInvoke = keySelector.invoke(element$iv);
            Object value$iv$iv = destination$iv.get(kInvoke);
            if (value$iv$iv == null) {
                ArrayList arrayList = new ArrayList();
                destination$iv.put(kInvoke, arrayList);
                obj = arrayList;
            } else {
                obj = value$iv$iv;
            }
            List list$iv = (List) obj;
            list$iv.add(element$iv);
        }
        return destination$iv;
    }

    @NotNull
    public static final <T, K, V> Map<K, List<V>> groupBy(@NotNull Sequence<? extends T> $this$groupBy, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Object obj;
        Intrinsics.checkNotNullParameter($this$groupBy, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        Map destination$iv = new LinkedHashMap();
        for (Object element$iv : $this$groupBy) {
            K kInvoke = keySelector.invoke(element$iv);
            Object value$iv$iv = destination$iv.get(kInvoke);
            if (value$iv$iv == null) {
                ArrayList arrayList = new ArrayList();
                destination$iv.put(kInvoke, arrayList);
                obj = arrayList;
            } else {
                obj = value$iv$iv;
            }
            List list$iv = (List) obj;
            list$iv.add(valueTransform.invoke(element$iv));
        }
        return destination$iv;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(@NotNull Sequence<? extends T> $this$groupByTo, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
        Object obj;
        Intrinsics.checkNotNullParameter($this$groupByTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (Object element : $this$groupByTo) {
            K kInvoke = keySelector.invoke(element);
            Object value$iv = destination.get(kInvoke);
            if (value$iv == null) {
                ArrayList arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
                obj = arrayList;
            } else {
                obj = value$iv;
            }
            List list = (List) obj;
            list.add(element);
        }
        return destination;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull Sequence<? extends T> $this$groupByTo, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Object obj;
        Intrinsics.checkNotNullParameter($this$groupByTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (Object element : $this$groupByTo) {
            K kInvoke = keySelector.invoke(element);
            Object value$iv = destination.get(kInvoke);
            if (value$iv == null) {
                ArrayList arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
                obj = arrayList;
            } else {
                obj = value$iv;
            }
            List list = (List) obj;
            list.add(valueTransform.invoke(element));
        }
        return destination;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K> Grouping<T, K> groupingBy(@NotNull final Sequence<? extends T> $this$groupingBy, @NotNull final Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter($this$groupingBy, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new Grouping<T, K>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.groupingBy.1
            @Override // kotlin.collections.Grouping
            public Iterator<T> sourceIterator() {
                return $this$groupingBy.iterator();
            }

            @Override // kotlin.collections.Grouping
            public K keyOf(T element) {
                return keySelector.invoke(element);
            }
        };
    }

    @NotNull
    public static final <T, R> Sequence<R> map(@NotNull Sequence<? extends T> $this$map, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$map, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new TransformingSequence($this$map, transform);
    }

    @NotNull
    public static final <T, R> Sequence<R> mapIndexed(@NotNull Sequence<? extends T> $this$mapIndexed, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapIndexed, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new TransformingIndexedSequence($this$mapIndexed, transform);
    }

    @NotNull
    public static final <T, R> Sequence<R> mapIndexedNotNull(@NotNull Sequence<? extends T> $this$mapIndexedNotNull, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapIndexedNotNull, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return SequencesKt.filterNotNull(new TransformingIndexedSequence($this$mapIndexedNotNull, transform));
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull Sequence<? extends T> $this$mapIndexedNotNullTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapIndexedNotNullTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int index$iv = 0;
        for (Object item$iv : $this$mapIndexedNotNullTo) {
            int index = index$iv;
            index$iv++;
            if (index < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            R rInvoke = transform.invoke(Integer.valueOf(index), item$iv);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(@NotNull Sequence<? extends T> $this$mapIndexedTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapIndexedTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int index = 0;
        for (Object item : $this$mapIndexedTo) {
            int i = index;
            index++;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            destination.add(transform.invoke(Integer.valueOf(i), item));
        }
        return destination;
    }

    @NotNull
    public static final <T, R> Sequence<R> mapNotNull(@NotNull Sequence<? extends T> $this$mapNotNull, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapNotNull, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return SequencesKt.filterNotNull(new TransformingSequence($this$mapNotNull, transform));
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(@NotNull Sequence<? extends T> $this$mapNotNullTo, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapNotNullTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (Object element$iv : $this$mapNotNullTo) {
            R rInvoke = transform.invoke(element$iv);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapTo(@NotNull Sequence<? extends T> $this$mapTo, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (Object item : $this$mapTo) {
            destination.add(transform.invoke(item));
        }
        return destination;
    }

    @NotNull
    public static final <T> Sequence<IndexedValue<T>> withIndex(@NotNull Sequence<? extends T> $this$withIndex) {
        Intrinsics.checkNotNullParameter($this$withIndex, "<this>");
        return new IndexingSequence($this$withIndex);
    }

    @NotNull
    public static final <T> Sequence<T> distinct(@NotNull Sequence<? extends T> $this$distinct) {
        Intrinsics.checkNotNullParameter($this$distinct, "<this>");
        return SequencesKt.distinctBy($this$distinct, SequencesKt___SequencesKt::distinct$lambda$13$SequencesKt___SequencesKt);
    }

    private static final Object distinct$lambda$13$SequencesKt___SequencesKt(Object it) {
        return it;
    }

    @NotNull
    public static final <T, K> Sequence<T> distinctBy(@NotNull Sequence<? extends T> $this$distinctBy, @NotNull Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter($this$distinctBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new DistinctSequence($this$distinctBy, selector);
    }

    @NotNull
    public static final <T> Set<T> toMutableSet(@NotNull Sequence<? extends T> $this$toMutableSet) {
        Intrinsics.checkNotNullParameter($this$toMutableSet, "<this>");
        LinkedHashSet set = new LinkedHashSet();
        Iterator<? extends T> it = $this$toMutableSet.iterator();
        while (it.hasNext()) {
            set.add(it.next());
        }
        return set;
    }

    public static final <T> boolean all(@NotNull Sequence<? extends T> $this$all, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$all, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (Object element : $this$all) {
            if (!predicate.invoke(element).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(@NotNull Sequence<? extends T> $this$any) {
        Intrinsics.checkNotNullParameter($this$any, "<this>");
        return $this$any.iterator().hasNext();
    }

    public static final <T> boolean any(@NotNull Sequence<? extends T> $this$any, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$any, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (Object element : $this$any) {
            if (predicate.invoke(element).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T> int count(@NotNull Sequence<? extends T> $this$count) {
        Intrinsics.checkNotNullParameter($this$count, "<this>");
        int count = 0;
        for (T t : $this$count) {
            count++;
            if (count < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return count;
    }

    public static final <T> int count(@NotNull Sequence<? extends T> $this$count, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$count, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int count = 0;
        for (Object element : $this$count) {
            if (predicate.invoke(element).booleanValue()) {
                count++;
                if (count < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return count;
    }

    public static final <T, R> R fold(@NotNull Sequence<? extends T> sequence, R r, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        R rInvoke = r;
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            rInvoke = operation.invoke((Object) rInvoke, it.next());
        }
        return rInvoke;
    }

    public static final <T, R> R foldIndexed(@NotNull Sequence<? extends T> sequence, R r, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i = 0;
        R rInvoke = r;
        for (Object obj : sequence) {
            int i2 = i;
            i++;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            rInvoke = operation.invoke(Integer.valueOf(i2), (Object) rInvoke, obj);
        }
        return rInvoke;
    }

    public static final <T> void forEach(@NotNull Sequence<? extends T> $this$forEach, @NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter($this$forEach, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (Object element : $this$forEach) {
            action.invoke(element);
        }
    }

    public static final <T> void forEachIndexed(@NotNull Sequence<? extends T> $this$forEachIndexed, @NotNull Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter($this$forEachIndexed, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int index = 0;
        for (Object item : $this$forEachIndexed) {
            int i = index;
            index++;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i), item);
        }
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final double maxOrThrow(@NotNull Sequence<Double> $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        Iterator<Double> it = $this$max.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (true) {
            double max = dDoubleValue;
            if (it.hasNext()) {
                double e = it.next().doubleValue();
                dDoubleValue = Math.max(max, e);
            } else {
                return max;
            }
        }
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    /* JADX INFO: renamed from: maxOrThrow, reason: collision with other method in class */
    public static final float m1559maxOrThrow(@NotNull Sequence<Float> $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        Iterator<Float> it = $this$max.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (true) {
            float max = fFloatValue;
            if (it.hasNext()) {
                float e = it.next().floatValue();
                fFloatValue = Math.max(max, e);
            } else {
                return max;
            }
        }
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    @NotNull
    /* JADX INFO: renamed from: maxOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m1560maxOrThrow(@NotNull Sequence<? extends T> $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        Iterator<? extends T> it = $this$max.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            Object next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = (T) next2;
            }
        } while (it.hasNext());
        return (??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) next;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T maxByOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            Object next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = (T) next2;
            }
        } while (it.hasNext());
        return (??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) next;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> double maxOf(Sequence<? extends T> sequence, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (true) {
            double d = dDoubleValue;
            if (it.hasNext()) {
                dDoubleValue = Math.max(d, selector.invoke(it.next()).doubleValue());
            } else {
                return d;
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <T> float m1561maxOf(Sequence<? extends T> sequence, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (true) {
            float f = fFloatValue;
            if (it.hasNext()) {
                fFloatValue = Math.max(f, selector.invoke(it.next()).floatValue());
            } else {
                return f;
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m1562maxOf(Sequence<? extends T> sequence, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> Double maxOfOrNull(Sequence<? extends T> sequence, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (true) {
            double d = dDoubleValue;
            if (it.hasNext()) {
                dDoubleValue = Math.max(d, selector.invoke(it.next()).doubleValue());
            } else {
                return Double.valueOf(d);
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Float m1563maxOfOrNull(Sequence<? extends T> sequence, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (true) {
            float f = fFloatValue;
            if (it.hasNext()) {
                fFloatValue = Math.max(f, selector.invoke(it.next()).floatValue());
            } else {
                return Float.valueOf(f);
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m1564maxOfOrNull(Sequence<? extends T> sequence, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R maxOfWith(Sequence<? extends T> sequence, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object objInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            Object objInvoke2 = selector.invoke(it.next());
            if (comparator.compare(objInvoke, objInvoke2) < 0) {
                objInvoke = objInvoke2;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R maxOfWithOrNull(Sequence<? extends T> sequence, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object objInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            Object objInvoke2 = selector.invoke(it.next());
            if (comparator.compare(objInvoke, objInvoke2) < 0) {
                objInvoke = objInvoke2;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double maxOrNull(@NotNull Sequence<Double> $this$maxOrNull) {
        Intrinsics.checkNotNullParameter($this$maxOrNull, "<this>");
        Iterator<Double> it = $this$maxOrNull.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (true) {
            double max = dDoubleValue;
            if (it.hasNext()) {
                double e = it.next().doubleValue();
                dDoubleValue = Math.max(max, e);
            } else {
                return Double.valueOf(max);
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: maxOrNull, reason: collision with other method in class */
    public static final Float m1565maxOrNull(@NotNull Sequence<Float> $this$maxOrNull) {
        Intrinsics.checkNotNullParameter($this$maxOrNull, "<this>");
        Iterator<Float> it = $this$maxOrNull.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (true) {
            float max = fFloatValue;
            if (it.hasNext()) {
                float e = it.next().floatValue();
                fFloatValue = Math.max(max, e);
            } else {
                return Float.valueOf(max);
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: maxOrNull, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m1566maxOrNull(@NotNull Sequence<? extends T> $this$maxOrNull) {
        Intrinsics.checkNotNullParameter($this$maxOrNull, "<this>");
        Iterator<? extends T> it = $this$maxOrNull.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final <T> T maxWithOrThrow(@NotNull Sequence<? extends T> sequence, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return (T) next;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T> T maxWithOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return (T) next;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final double minOrThrow(@NotNull Sequence<Double> $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        Iterator<Double> it = $this$min.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (true) {
            double min = dDoubleValue;
            if (it.hasNext()) {
                double e = it.next().doubleValue();
                dDoubleValue = Math.min(min, e);
            } else {
                return min;
            }
        }
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    /* JADX INFO: renamed from: minOrThrow, reason: collision with other method in class */
    public static final float m1567minOrThrow(@NotNull Sequence<Float> $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        Iterator<Float> it = $this$min.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (true) {
            float min = fFloatValue;
            if (it.hasNext()) {
                float e = it.next().floatValue();
                fFloatValue = Math.min(min, e);
            } else {
                return min;
            }
        }
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    @NotNull
    /* JADX INFO: renamed from: minOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m1568minOrThrow(@NotNull Sequence<? extends T> $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        Iterator<? extends T> it = $this$min.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T minByOrThrow(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            Object next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = (T) next2;
            }
        } while (it.hasNext());
        return (??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) next;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T minByOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            Object next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = (T) next2;
            }
        } while (it.hasNext());
        return (??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) next;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> double minOf(Sequence<? extends T> sequence, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (true) {
            double d = dDoubleValue;
            if (it.hasNext()) {
                dDoubleValue = Math.min(d, selector.invoke(it.next()).doubleValue());
            } else {
                return d;
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <T> float m1569minOf(Sequence<? extends T> sequence, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (true) {
            float f = fFloatValue;
            if (it.hasNext()) {
                fFloatValue = Math.min(f, selector.invoke(it.next()).floatValue());
            } else {
                return f;
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m1570minOf(Sequence<? extends T> sequence, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> Double minOfOrNull(Sequence<? extends T> sequence, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (true) {
            double d = dDoubleValue;
            if (it.hasNext()) {
                dDoubleValue = Math.min(d, selector.invoke(it.next()).doubleValue());
            } else {
                return Double.valueOf(d);
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Float m1571minOfOrNull(Sequence<? extends T> sequence, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (true) {
            float f = fFloatValue;
            if (it.hasNext()) {
                fFloatValue = Math.min(f, selector.invoke(it.next()).floatValue());
            } else {
                return Float.valueOf(f);
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m1572minOfOrNull(Sequence<? extends T> sequence, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R minOfWith(Sequence<? extends T> sequence, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object objInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            Object objInvoke2 = selector.invoke(it.next());
            if (comparator.compare(objInvoke, objInvoke2) > 0) {
                objInvoke = objInvoke2;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R minOfWithOrNull(Sequence<? extends T> sequence, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object objInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            Object objInvoke2 = selector.invoke(it.next());
            if (comparator.compare(objInvoke, objInvoke2) > 0) {
                objInvoke = objInvoke2;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double minOrNull(@NotNull Sequence<Double> $this$minOrNull) {
        Intrinsics.checkNotNullParameter($this$minOrNull, "<this>");
        Iterator<Double> it = $this$minOrNull.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (true) {
            double min = dDoubleValue;
            if (it.hasNext()) {
                double e = it.next().doubleValue();
                dDoubleValue = Math.min(min, e);
            } else {
                return Double.valueOf(min);
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: minOrNull, reason: collision with other method in class */
    public static final Float m1573minOrNull(@NotNull Sequence<Float> $this$minOrNull) {
        Intrinsics.checkNotNullParameter($this$minOrNull, "<this>");
        Iterator<Float> it = $this$minOrNull.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (true) {
            float min = fFloatValue;
            if (it.hasNext()) {
                float e = it.next().floatValue();
                fFloatValue = Math.min(min, e);
            } else {
                return Float.valueOf(min);
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: minOrNull, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m1574minOrNull(@NotNull Sequence<? extends T> $this$minOrNull) {
        Intrinsics.checkNotNullParameter($this$minOrNull, "<this>");
        Iterator<? extends T> it = $this$minOrNull.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final <T> T minWithOrThrow(@NotNull Sequence<? extends T> sequence, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return (T) next;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T> T minWithOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return (T) next;
    }

    public static final <T> boolean none(@NotNull Sequence<? extends T> $this$none) {
        Intrinsics.checkNotNullParameter($this$none, "<this>");
        return !$this$none.iterator().hasNext();
    }

    public static final <T> boolean none(@NotNull Sequence<? extends T> $this$none, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$none, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (Object element : $this$none) {
            if (predicate.invoke(element).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T> Sequence<T> onEach(@NotNull Sequence<? extends T> $this$onEach, @NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter($this$onEach, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return SequencesKt.map($this$onEach, (v1) -> {
            return onEach$lambda$14$SequencesKt___SequencesKt(r1, v1);
        });
    }

    private static final Object onEach$lambda$14$SequencesKt___SequencesKt(Function1 $action, Object it) {
        $action.invoke(it);
        return it;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T> Sequence<T> onEachIndexed(@NotNull Sequence<? extends T> $this$onEachIndexed, @NotNull Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter($this$onEachIndexed, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return SequencesKt.mapIndexed($this$onEachIndexed, (v1, v2) -> {
            return onEachIndexed$lambda$15$SequencesKt___SequencesKt(r1, v1, v2);
        });
    }

    private static final Object onEachIndexed$lambda$15$SequencesKt___SequencesKt(Function2 $action, int index, Object element) {
        $action.invoke(Integer.valueOf(index), element);
        return element;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [S, java.lang.Object] */
    public static final <S, T extends S> S reduce(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        boolean next = it.next();
        while (true) {
            ?? r8 = (Object) (next ? 1 : 0);
            if (it.hasNext()) {
                next = operation.invoke(r8, it.next());
            } else {
                return r8;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [S, java.lang.Object] */
    public static final <S, T extends S> S reduceIndexed(@NotNull Sequence<? extends T> sequence, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        int i = 1;
        boolean next = it.next();
        while (true) {
            ?? r10 = (Object) (next ? 1 : 0);
            if (it.hasNext()) {
                int i2 = i;
                i++;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                next = operation.invoke(Integer.valueOf(i2), r10, it.next());
            } else {
                return r10;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [S, java.lang.Object] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <S, T extends S> S reduceIndexedOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        int i = 1;
        boolean next = it.next();
        while (true) {
            ?? r10 = (Object) (next ? 1 : 0);
            if (it.hasNext()) {
                int i2 = i;
                i++;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                next = operation.invoke(Integer.valueOf(i2), r10, it.next());
            } else {
                return r10;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [S, java.lang.Object] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <S, T extends S> S reduceOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        boolean next = it.next();
        while (true) {
            ?? r8 = (Object) (next ? 1 : 0);
            if (it.hasNext()) {
                next = operation.invoke(r8, it.next());
            } else {
                return r8;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt___SequencesKt$runningFold$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: _Sequences.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/SequencesKt___SequencesKt$runningFold$1.class */
    static final class C00151<R> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        private /* synthetic */ Object L$0;
        final /* synthetic */ R $initial;
        final /* synthetic */ Sequence<T> $this_runningFold;
        final /* synthetic */ Function2<R, T, R> $operation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C00151(R $initial, Sequence<? extends T> $receiver, Function2<? super R, ? super T, ? extends R> $operation, Continuation<? super C00151> $completion) {
            super(2, $completion);
            this.$initial = $initial;
            this.$this_runningFold = $receiver;
            this.$operation = $operation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            C00151 c00151 = new C00151(this.$initial, this.$this_runningFold, this.$operation, $completion);
            c00151.L$0 = value;
            return c00151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super R> p1, Continuation<? super Unit> p2) {
            return ((C00151) create(p1, p2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt.C00151.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> Sequence<R> runningFold(@NotNull Sequence<? extends T> $this$runningFold, R initial, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter($this$runningFold, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return SequencesKt.sequence(new C00151(initial, $this$runningFold, operation, null));
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: _Sequences.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/SequencesKt___SequencesKt$runningFoldIndexed$1.class */
    static final class C00161<R> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {
        Object L$1;
        Object L$2;
        Object L$3;
        int I$0;
        int label;
        private /* synthetic */ Object L$0;
        final /* synthetic */ R $initial;
        final /* synthetic */ Sequence<T> $this_runningFoldIndexed;
        final /* synthetic */ Function3<Integer, R, T, R> $operation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C00161(R $initial, Sequence<? extends T> $receiver, Function3<? super Integer, ? super R, ? super T, ? extends R> $operation, Continuation<? super C00161> $completion) {
            super(2, $completion);
            this.$initial = $initial;
            this.$this_runningFoldIndexed = $receiver;
            this.$operation = $operation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            C00161 c00161 = new C00161(this.$initial, this.$this_runningFoldIndexed, this.$operation, $completion);
            c00161.L$0 = value;
            return c00161;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super R> p1, Continuation<? super Unit> p2) {
            return ((C00161) create(p1, p2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 261
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt.C00161.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> Sequence<R> runningFoldIndexed(@NotNull Sequence<? extends T> $this$runningFoldIndexed, R initial, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter($this$runningFoldIndexed, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return SequencesKt.sequence(new C00161(initial, $this$runningFoldIndexed, operation, null));
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: _Sequences.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/SequencesKt___SequencesKt$runningReduce$1.class */
    static final class C00171<S> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super S>, Continuation<? super Unit>, Object> {
        Object L$1;
        Object L$2;
        int label;
        private /* synthetic */ Object L$0;
        final /* synthetic */ Sequence<T> $this_runningReduce;
        final /* synthetic */ Function2<S, T, S> $operation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C00171(Sequence<? extends T> $receiver, Function2<? super S, ? super T, ? extends S> $operation, Continuation<? super C00171> $completion) {
            super(2, $completion);
            this.$this_runningReduce = $receiver;
            this.$operation = $operation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            C00171 c00171 = new C00171(this.$this_runningReduce, this.$operation, $completion);
            c00171.L$0 = value;
            return c00171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super S> p1, Continuation<? super Unit> p2) {
            return ((C00171) create(p1, p2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 240
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt.C00171.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <S, T extends S> Sequence<S> runningReduce(@NotNull Sequence<? extends T> $this$runningReduce, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter($this$runningReduce, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return SequencesKt.sequence(new C00171($this$runningReduce, operation, null));
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: _Sequences.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/SequencesKt___SequencesKt$runningReduceIndexed$1.class */
    static final class C00181<S> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super S>, Continuation<? super Unit>, Object> {
        Object L$1;
        Object L$2;
        int I$0;
        int label;
        private /* synthetic */ Object L$0;
        final /* synthetic */ Sequence<T> $this_runningReduceIndexed;
        final /* synthetic */ Function3<Integer, S, T, S> $operation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C00181(Sequence<? extends T> $receiver, Function3<? super Integer, ? super S, ? super T, ? extends S> $operation, Continuation<? super C00181> $completion) {
            super(2, $completion);
            this.$this_runningReduceIndexed = $receiver;
            this.$operation = $operation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            C00181 c00181 = new C00181(this.$this_runningReduceIndexed, this.$operation, $completion);
            c00181.L$0 = value;
            return c00181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super S> p1, Continuation<? super Unit> p2) {
            return ((C00181) create(p1, p2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0093  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 275
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt.C00181.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <S, T extends S> Sequence<S> runningReduceIndexed(@NotNull Sequence<? extends T> $this$runningReduceIndexed, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter($this$runningReduceIndexed, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return SequencesKt.sequence(new C00181($this$runningReduceIndexed, operation, null));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> Sequence<R> scan(@NotNull Sequence<? extends T> $this$scan, R initial, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter($this$scan, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return SequencesKt.runningFold($this$scan, initial, operation);
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> Sequence<R> scanIndexed(@NotNull Sequence<? extends T> $this$scanIndexed, R initial, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter($this$scanIndexed, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return SequencesKt.runningFoldIndexed($this$scanIndexed, initial, operation);
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> int sumBy(@NotNull Sequence<? extends T> $this$sumBy, @NotNull Function1<? super T, Integer> selector) {
        Intrinsics.checkNotNullParameter($this$sumBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = 0;
        for (Object element : $this$sumBy) {
            sum += selector.invoke(element).intValue();
        }
        return sum;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> double sumByDouble(@NotNull Sequence<? extends T> $this$sumByDouble, @NotNull Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter($this$sumByDouble, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double sum = 0.0d;
        for (Object element : $this$sumByDouble) {
            sum += selector.invoke(element).doubleValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfDouble")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <T> double sumOfDouble(Sequence<? extends T> $this$sumOf, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double sum = 0.0d;
        for (Object element : $this$sumOf) {
            sum += selector.invoke(element).doubleValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfInt")
    @InlineOnly
    private static final <T> int sumOfInt(Sequence<? extends T> $this$sumOf, Function1<? super T, Integer> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = 0;
        for (Object element : $this$sumOf) {
            sum += selector.invoke(element).intValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfLong")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <T> long sumOfLong(Sequence<? extends T> $this$sumOf, Function1<? super T, Long> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long sum = 0;
        for (Object element : $this$sumOf) {
            sum += selector.invoke(element).longValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUInt")
    @InlineOnly
    private static final <T> int sumOfUInt(Sequence<? extends T> $this$sumOf, Function1<? super T, UInt> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = UInt.m326constructorimpl(0);
        for (Object element : $this$sumOf) {
            sum = UInt.m326constructorimpl(sum + selector.invoke(element).m328unboximpl());
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfULong")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <T> long sumOfULong(Sequence<? extends T> $this$sumOf, Function1<? super T, ULong> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long sum = ULong.m406constructorimpl(0L);
        for (Object element : $this$sumOf) {
            sum = ULong.m406constructorimpl(sum + selector.invoke(element).m408unboximpl());
        }
        return sum;
    }

    @NotNull
    public static final <T> Sequence<T> requireNoNulls(@NotNull Sequence<? extends T> $this$requireNoNulls) {
        Intrinsics.checkNotNullParameter($this$requireNoNulls, "<this>");
        return SequencesKt.map($this$requireNoNulls, (v1) -> {
            return requireNoNulls$lambda$16$SequencesKt___SequencesKt(r1, v1);
        });
    }

    private static final Object requireNoNulls$lambda$16$SequencesKt___SequencesKt(Sequence $this_requireNoNulls, Object it) {
        if (it == null) {
            throw new IllegalArgumentException("null element found in " + $this_requireNoNulls + '.');
        }
        return it;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> Sequence<List<T>> chunked(@NotNull Sequence<? extends T> $this$chunked, int size) {
        Intrinsics.checkNotNullParameter($this$chunked, "<this>");
        return SequencesKt.windowed($this$chunked, size, size, true);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T, R> Sequence<R> chunked(@NotNull Sequence<? extends T> $this$chunked, int size, @NotNull Function1<? super List<? extends T>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$chunked, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return SequencesKt.windowed($this$chunked, size, size, true, transform);
    }

    @NotNull
    public static final <T> Sequence<T> minus(@NotNull final Sequence<? extends T> $this$minus, final T element) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.minus.1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                Ref.BooleanRef removed = new Ref.BooleanRef();
                Sequence<T> sequence = $this$minus;
                T t = element;
                return SequencesKt.filter(sequence, (v2) -> {
                    return iterator$lambda$0(r1, r2, v2);
                }).iterator();
            }

            private static final boolean iterator$lambda$0(Ref.BooleanRef $removed, Object $element, Object it) {
                if ($removed.element || !Intrinsics.areEqual(it, $element)) {
                    return true;
                }
                $removed.element = true;
                return false;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Sequence<T> minus(@NotNull final Sequence<? extends T> $this$minus, @NotNull final T[] elements) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? $this$minus : new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.minus.2
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                Sequence<T> sequence = $this$minus;
                T[] tArr = elements;
                return SequencesKt.filterNot(sequence, (v1) -> {
                    return iterator$lambda$0(r1, v1);
                }).iterator();
            }

            private static final boolean iterator$lambda$0(Object[] $elements, Object it) {
                return ArraysKt.contains($elements, it);
            }
        };
    }

    @NotNull
    public static final <T> Sequence<T> minus(@NotNull final Sequence<? extends T> $this$minus, @NotNull final Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.minus.3
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                Collection other = CollectionsKt.convertToListIfNotCollection(elements);
                if (other.isEmpty()) {
                    return $this$minus.iterator();
                }
                return SequencesKt.filterNot($this$minus, (v1) -> {
                    return iterator$lambda$0(r1, v1);
                }).iterator();
            }

            private static final boolean iterator$lambda$0(Collection $other, Object it) {
                return $other.contains(it);
            }
        };
    }

    @NotNull
    public static final <T> Sequence<T> minus(@NotNull final Sequence<? extends T> $this$minus, @NotNull final Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.minus.4
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                List other = SequencesKt.toList(elements);
                if (other.isEmpty()) {
                    return $this$minus.iterator();
                }
                return SequencesKt.filterNot($this$minus, (v1) -> {
                    return iterator$lambda$0(r1, v1);
                }).iterator();
            }

            private static final boolean iterator$lambda$0(List $other, Object it) {
                return $other.contains(it);
            }
        };
    }

    @InlineOnly
    private static final <T> Sequence<T> minusElement(Sequence<? extends T> $this$minusElement, T element) {
        Intrinsics.checkNotNullParameter($this$minusElement, "<this>");
        return SequencesKt.minus($this$minusElement, element);
    }

    @NotNull
    public static final <T> Pair<List<T>, List<T>> partition(@NotNull Sequence<? extends T> $this$partition, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$partition, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList first = new ArrayList();
        ArrayList second = new ArrayList();
        for (Object element : $this$partition) {
            if (predicate.invoke(element).booleanValue()) {
                first.add(element);
            } else {
                second.add(element);
            }
        }
        return new Pair<>(first, second);
    }

    @NotNull
    public static final <T> Sequence<T> plus(@NotNull Sequence<? extends T> $this$plus, T element) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        return SequencesKt.flatten(SequencesKt.sequenceOf((Object[]) new Sequence[]{$this$plus, SequencesKt.sequenceOf(element)}));
    }

    @NotNull
    public static final <T> Sequence<T> plus(@NotNull Sequence<? extends T> $this$plus, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return SequencesKt.plus((Sequence) $this$plus, (Iterable) ArraysKt.asList(elements));
    }

    @NotNull
    public static final <T> Sequence<T> plus(@NotNull Sequence<? extends T> $this$plus, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return SequencesKt.flatten(SequencesKt.sequenceOf((Object[]) new Sequence[]{$this$plus, CollectionsKt.asSequence(elements)}));
    }

    @NotNull
    public static final <T> Sequence<T> plus(@NotNull Sequence<? extends T> $this$plus, @NotNull Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return SequencesKt.flatten(SequencesKt.sequenceOf((Object[]) new Sequence[]{$this$plus, elements}));
    }

    @InlineOnly
    private static final <T> Sequence<T> plusElement(Sequence<? extends T> $this$plusElement, T element) {
        Intrinsics.checkNotNullParameter($this$plusElement, "<this>");
        return SequencesKt.plus($this$plusElement, element);
    }

    public static /* synthetic */ Sequence windowed$default(Sequence sequence, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return SequencesKt.windowed(sequence, i, i2, z);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> Sequence<List<T>> windowed(@NotNull Sequence<? extends T> $this$windowed, int size, int step, boolean partialWindows) {
        Intrinsics.checkNotNullParameter($this$windowed, "<this>");
        return SlidingWindowKt.windowedSequence($this$windowed, size, step, partialWindows, false);
    }

    public static /* synthetic */ Sequence windowed$default(Sequence sequence, int i, int i2, boolean z, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return SequencesKt.windowed(sequence, i, i2, z, function1);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T, R> Sequence<R> windowed(@NotNull Sequence<? extends T> $this$windowed, int size, int step, boolean partialWindows, @NotNull Function1<? super List<? extends T>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$windowed, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return SequencesKt.map(SlidingWindowKt.windowedSequence($this$windowed, size, step, partialWindows, true), transform);
    }

    @NotNull
    public static final <T, R> Sequence<Pair<T, R>> zip(@NotNull Sequence<? extends T> $this$zip, @NotNull Sequence<? extends R> other) {
        Intrinsics.checkNotNullParameter($this$zip, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new MergingSequence($this$zip, other, SequencesKt___SequencesKt::zip$lambda$17$SequencesKt___SequencesKt);
    }

    private static final Pair zip$lambda$17$SequencesKt___SequencesKt(Object t1, Object t2) {
        return TuplesKt.to(t1, t2);
    }

    @NotNull
    public static final <T, R, V> Sequence<V> zip(@NotNull Sequence<? extends T> $this$zip, @NotNull Sequence<? extends R> other, @NotNull Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter($this$zip, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new MergingSequence($this$zip, other, transform);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> Sequence<Pair<T, T>> zipWithNext(@NotNull Sequence<? extends T> $this$zipWithNext) {
        Intrinsics.checkNotNullParameter($this$zipWithNext, "<this>");
        return SequencesKt.zipWithNext($this$zipWithNext, SequencesKt___SequencesKt::zipWithNext$lambda$18$SequencesKt___SequencesKt);
    }

    private static final Pair zipWithNext$lambda$18$SequencesKt___SequencesKt(Object a, Object b) {
        return TuplesKt.to(a, b);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: _Sequences.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/SequencesKt___SequencesKt$zipWithNext$2.class */
    static final class C00212<R> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        private /* synthetic */ Object L$0;
        final /* synthetic */ Sequence<T> $this_zipWithNext;
        final /* synthetic */ Function2<T, T, R> $transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C00212(Sequence<? extends T> $receiver, Function2<? super T, ? super T, ? extends R> $transform, Continuation<? super C00212> $completion) {
            super(2, $completion);
            this.$this_zipWithNext = $receiver;
            this.$transform = $transform;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            C00212 c00212 = new C00212(this.$this_zipWithNext, this.$transform, $completion);
            c00212.L$0 = value;
            return c00212;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super R> p1, Continuation<? super Unit> p2) {
            return ((C00212) create(p1, p2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Iterator it;
            Object next;
            SequenceScope sequenceScope = (SequenceScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    it = this.$this_zipWithNext.iterator();
                    if (!it.hasNext()) {
                        return Unit.INSTANCE;
                    }
                    next = it.next();
                    break;
                    break;
                case 1:
                    Object obj2 = this.L$3;
                    Object obj3 = this.L$2;
                    it = (Iterator) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    next = obj2;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                this.L$0 = sequenceScope;
                this.L$1 = it;
                this.L$2 = SpillingKt.nullOutSpilledVariable(next);
                this.L$3 = next2;
                this.label = 1;
                if (sequenceScope.yield(this.$transform.invoke((T) next, (T) next2), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                next = next2;
            }
            return Unit.INSTANCE;
        }
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T, R> Sequence<R> zipWithNext(@NotNull Sequence<? extends T> $this$zipWithNext, @NotNull Function2<? super T, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$zipWithNext, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return SequencesKt.sequence(new C00212($this$zipWithNext, transform, null));
    }

    public static /* synthetic */ Appendable joinTo$default(Sequence sequence, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
            i = -1;
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
            function1 = null;
        }
        return SequencesKt.joinTo(sequence, appendable, charSequence, charSequence2, charSequence3, i, charSequence4, function1);
    }

    @NotNull
    public static final <T, A extends Appendable> A joinTo(@NotNull Sequence<? extends T> $this$joinTo, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> transform) throws IOException {
        Intrinsics.checkNotNullParameter($this$joinTo, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int count = 0;
        for (Object element : $this$joinTo) {
            count++;
            if (count > 1) {
                buffer.append(separator);
            }
            if (limit >= 0 && count > limit) {
                break;
            }
            StringsKt.appendElement(buffer, element, transform);
        }
        if (limit >= 0 && count > limit) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ String joinToString$default(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return SequencesKt.joinToString(sequence, charSequence, charSequence2, charSequence3, i, charSequence4, function1);
    }

    @NotNull
    public static final <T> String joinToString(@NotNull Sequence<? extends T> $this$joinToString, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter($this$joinToString, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) SequencesKt.joinTo($this$joinToString, new StringBuilder(), separator, prefix, postfix, limit, truncated, transform)).toString();
    }

    @NotNull
    public static final <T> Iterable<T> asIterable(@NotNull Sequence<? extends T> $this$asIterable) {
        Intrinsics.checkNotNullParameter($this$asIterable, "<this>");
        return new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1($this$asIterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> Sequence<T> asSequence(Sequence<? extends T> $this$asSequence) {
        Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
        return $this$asSequence;
    }

    @JvmName(name = "averageOfByte")
    public static final double averageOfByte(@NotNull Sequence<Byte> $this$average) {
        Intrinsics.checkNotNullParameter($this$average, "<this>");
        double sum = 0.0d;
        int count = 0;
        Iterator<Byte> it = $this$average.iterator();
        while (it.hasNext()) {
            byte element = it.next().byteValue();
            sum += (double) element;
            count++;
            if (count < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (count == 0) {
            return Double.NaN;
        }
        return sum / ((double) count);
    }

    @JvmName(name = "averageOfShort")
    public static final double averageOfShort(@NotNull Sequence<Short> $this$average) {
        Intrinsics.checkNotNullParameter($this$average, "<this>");
        double sum = 0.0d;
        int count = 0;
        Iterator<Short> it = $this$average.iterator();
        while (it.hasNext()) {
            short element = it.next().shortValue();
            sum += (double) element;
            count++;
            if (count < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (count == 0) {
            return Double.NaN;
        }
        return sum / ((double) count);
    }

    @JvmName(name = "averageOfInt")
    public static final double averageOfInt(@NotNull Sequence<Integer> $this$average) {
        Intrinsics.checkNotNullParameter($this$average, "<this>");
        double sum = 0.0d;
        int count = 0;
        Iterator<Integer> it = $this$average.iterator();
        while (it.hasNext()) {
            int element = it.next().intValue();
            sum += (double) element;
            count++;
            if (count < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (count == 0) {
            return Double.NaN;
        }
        return sum / ((double) count);
    }

    @JvmName(name = "averageOfLong")
    public static final double averageOfLong(@NotNull Sequence<Long> $this$average) {
        Intrinsics.checkNotNullParameter($this$average, "<this>");
        double sum = 0.0d;
        int count = 0;
        Iterator<Long> it = $this$average.iterator();
        while (it.hasNext()) {
            long element = it.next().longValue();
            sum += element;
            count++;
            if (count < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (count == 0) {
            return Double.NaN;
        }
        return sum / ((double) count);
    }

    @JvmName(name = "averageOfFloat")
    public static final double averageOfFloat(@NotNull Sequence<Float> $this$average) {
        Intrinsics.checkNotNullParameter($this$average, "<this>");
        double sum = 0.0d;
        int count = 0;
        Iterator<Float> it = $this$average.iterator();
        while (it.hasNext()) {
            float element = it.next().floatValue();
            sum += (double) element;
            count++;
            if (count < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (count == 0) {
            return Double.NaN;
        }
        return sum / ((double) count);
    }

    @JvmName(name = "averageOfDouble")
    public static final double averageOfDouble(@NotNull Sequence<Double> $this$average) {
        Intrinsics.checkNotNullParameter($this$average, "<this>");
        double sum = 0.0d;
        int count = 0;
        Iterator<Double> it = $this$average.iterator();
        while (it.hasNext()) {
            double element = it.next().doubleValue();
            sum += element;
            count++;
            if (count < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (count == 0) {
            return Double.NaN;
        }
        return sum / ((double) count);
    }

    @JvmName(name = "sumOfByte")
    public static final int sumOfByte(@NotNull Sequence<Byte> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        Iterator<Byte> it = $this$sum.iterator();
        while (it.hasNext()) {
            byte element = it.next().byteValue();
            sum += element;
        }
        return sum;
    }

    @JvmName(name = "sumOfShort")
    public static final int sumOfShort(@NotNull Sequence<Short> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        Iterator<Short> it = $this$sum.iterator();
        while (it.hasNext()) {
            short element = it.next().shortValue();
            sum += element;
        }
        return sum;
    }

    @JvmName(name = "sumOfInt")
    public static final int sumOfInt(@NotNull Sequence<Integer> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        Iterator<Integer> it = $this$sum.iterator();
        while (it.hasNext()) {
            int element = it.next().intValue();
            sum += element;
        }
        return sum;
    }

    @JvmName(name = "sumOfLong")
    public static final long sumOfLong(@NotNull Sequence<Long> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        long sum = 0;
        Iterator<Long> it = $this$sum.iterator();
        while (it.hasNext()) {
            long element = it.next().longValue();
            sum += element;
        }
        return sum;
    }

    @JvmName(name = "sumOfFloat")
    public static final float sumOfFloat(@NotNull Sequence<Float> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        float sum = 0.0f;
        Iterator<Float> it = $this$sum.iterator();
        while (it.hasNext()) {
            float element = it.next().floatValue();
            sum += element;
        }
        return sum;
    }

    @JvmName(name = "sumOfDouble")
    public static final double sumOfDouble(@NotNull Sequence<Double> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        double sum = 0.0d;
        Iterator<Double> it = $this$sum.iterator();
        while (it.hasNext()) {
            double element = it.next().doubleValue();
            sum += element;
        }
        return sum;
    }
}
