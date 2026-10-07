package kotlin.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.internal.HidesMembers;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Collections.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/CollectionsKt___CollectionsKt.class */
public class CollectionsKt___CollectionsKt extends CollectionsKt___CollectionsJvmKt {
    @InlineOnly
    private static final <T> T component1(List<? extends T> $this$component1) {
        Intrinsics.checkNotNullParameter($this$component1, "<this>");
        return $this$component1.get(0);
    }

    @InlineOnly
    private static final <T> T component2(List<? extends T> $this$component2) {
        Intrinsics.checkNotNullParameter($this$component2, "<this>");
        return $this$component2.get(1);
    }

    @InlineOnly
    private static final <T> T component3(List<? extends T> $this$component3) {
        Intrinsics.checkNotNullParameter($this$component3, "<this>");
        return $this$component3.get(2);
    }

    @InlineOnly
    private static final <T> T component4(List<? extends T> $this$component4) {
        Intrinsics.checkNotNullParameter($this$component4, "<this>");
        return $this$component4.get(3);
    }

    @InlineOnly
    private static final <T> T component5(List<? extends T> $this$component5) {
        Intrinsics.checkNotNullParameter($this$component5, "<this>");
        return $this$component5.get(4);
    }

    public static final <T> boolean contains(@NotNull Iterable<? extends T> $this$contains, T element) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        if ($this$contains instanceof Collection) {
            return ((Collection) $this$contains).contains(element);
        }
        return CollectionsKt.indexOf($this$contains, element) >= 0;
    }

    public static final <T> T elementAt(@NotNull Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) ((List) iterable).get(i);
        }
        return (T) CollectionsKt.elementAtOrElse(iterable, i, (v1) -> {
            return elementAt$lambda$0$CollectionsKt___CollectionsKt(r2, v1);
        });
    }

    private static final Object elementAt$lambda$0$CollectionsKt___CollectionsKt(int $index, int it) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + $index + '.');
    }

    @InlineOnly
    private static final <T> T elementAt(List<? extends T> $this$elementAt, int index) {
        Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
        return $this$elementAt.get(index);
    }

    public static final <T> T elementAtOrElse(@NotNull Iterable<? extends T> iterable, int i, @NotNull Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            boolean z = 0 <= i && i < list.size();
            return z ? (T) list.get(i) : defaultValue.invoke(Integer.valueOf(i));
        }
        if (i < 0) {
            return defaultValue.invoke(Integer.valueOf(i));
        }
        int i2 = 0;
        for (T t : iterable) {
            int i3 = i2;
            i2++;
            if (i == i3) {
                return t;
            }
        }
        return defaultValue.invoke(Integer.valueOf(i));
    }

    @InlineOnly
    private static final <T> T elementAtOrElse(List<? extends T> $this$elementAtOrElse, int index, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter($this$elementAtOrElse, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean z = 0 <= index && index < $this$elementAtOrElse.size();
        return z ? $this$elementAtOrElse.get(index) : defaultValue.invoke(Integer.valueOf(index));
    }

    @Nullable
    public static final <T> T elementAtOrNull(@NotNull Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) CollectionsKt.getOrNull((List) iterable, i);
        }
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (T t : iterable) {
            int i3 = i2;
            i2++;
            if (i == i3) {
                return t;
            }
        }
        return null;
    }

    @InlineOnly
    private static final <T> T elementAtOrNull(List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return (T) CollectionsKt.getOrNull(list, i);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Object] */
    @InlineOnly
    private static final <T> T find(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t : iterable) {
            if (predicate.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @InlineOnly
    private static final <T> T findLast(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object obj = null;
        for (Object obj2 : iterable) {
            if (predicate.invoke(obj2).booleanValue()) {
                obj = obj2;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Object] */
    @InlineOnly
    private static final <T> T findLast(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (predicate.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    public static final <T> T first(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) CollectionsKt.first((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return it.next();
    }

    public static final <T> T first(@NotNull List<? extends T> $this$first) {
        Intrinsics.checkNotNullParameter($this$first, "<this>");
        if ($this$first.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return $this$first.get(0);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Object] */
    public static final <T> T first(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t : iterable) {
            if (predicate.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T, R> R firstNotNullOf(Iterable<? extends T> iterable, Function1<? super T, ? extends R> transform) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
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
            throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T, R> R firstNotNullOfOrNull(Iterable<? extends T> $this$firstNotNullOfOrNull, Function1<? super T, ? extends R> transform) {
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
    public static final <T> T firstOrNull(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            if (((List) iterable).isEmpty()) {
                return null;
            }
            return (T) ((List) iterable).get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    @Nullable
    public static final <T> T firstOrNull(@NotNull List<? extends T> $this$firstOrNull) {
        Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
        if ($this$firstOrNull.isEmpty()) {
            return null;
        }
        return $this$firstOrNull.get(0);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Object] */
    @Nullable
    public static final <T> T firstOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t : iterable) {
            if (predicate.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @InlineOnly
    private static final <T> T getOrElse(List<? extends T> $this$getOrElse, int index, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter($this$getOrElse, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean z = 0 <= index && index < $this$getOrElse.size();
        return z ? $this$getOrElse.get(index) : defaultValue.invoke(Integer.valueOf(index));
    }

    @Nullable
    public static final <T> T getOrNull(@NotNull List<? extends T> $this$getOrNull, int index) {
        Intrinsics.checkNotNullParameter($this$getOrNull, "<this>");
        boolean z = 0 <= index && index < $this$getOrNull.size();
        if (z) {
            return $this$getOrNull.get(index);
        }
        return null;
    }

    public static final <T> int indexOf(@NotNull Iterable<? extends T> $this$indexOf, T element) {
        Intrinsics.checkNotNullParameter($this$indexOf, "<this>");
        if ($this$indexOf instanceof List) {
            return ((List) $this$indexOf).indexOf(element);
        }
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

    public static final <T> int indexOf(@NotNull List<? extends T> $this$indexOf, T element) {
        Intrinsics.checkNotNullParameter($this$indexOf, "<this>");
        return $this$indexOf.indexOf(element);
    }

    public static final <T> int indexOfFirst(@NotNull Iterable<? extends T> $this$indexOfFirst, @NotNull Function1<? super T, Boolean> predicate) {
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

    public static final <T> int indexOfFirst(@NotNull List<? extends T> $this$indexOfFirst, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$indexOfFirst, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int index = 0;
        for (Object item : $this$indexOfFirst) {
            if (predicate.invoke(item).booleanValue()) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(@NotNull Iterable<? extends T> $this$indexOfLast, @NotNull Function1<? super T, Boolean> predicate) {
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

    public static final <T> int indexOfLast(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (predicate.invoke(listIterator.previous()).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static final <T> T last(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) CollectionsKt.last((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
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

    public static final <T> T last(@NotNull List<? extends T> $this$last) {
        Intrinsics.checkNotNullParameter($this$last, "<this>");
        if ($this$last.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return $this$last.get(CollectionsKt.getLastIndex($this$last));
    }

    public static final <T> T last(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object obj = null;
        boolean z = false;
        for (Object obj2 : iterable) {
            if (predicate.invoke(obj2).booleanValue()) {
                obj = obj2;
                z = true;
            }
        }
        if (z) {
            return (T) obj;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Object] */
    public static final <T> T last(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (predicate.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public static final <T> int lastIndexOf(@NotNull Iterable<? extends T> $this$lastIndexOf, T element) {
        Intrinsics.checkNotNullParameter($this$lastIndexOf, "<this>");
        if ($this$lastIndexOf instanceof List) {
            return ((List) $this$lastIndexOf).lastIndexOf(element);
        }
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

    public static final <T> int lastIndexOf(@NotNull List<? extends T> $this$lastIndexOf, T element) {
        Intrinsics.checkNotNullParameter($this$lastIndexOf, "<this>");
        return $this$lastIndexOf.lastIndexOf(element);
    }

    @Nullable
    public static final <T> T lastOrNull(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            if (((List) iterable).isEmpty()) {
                return null;
            }
            return (T) ((List) iterable).get(((List) iterable).size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
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
    public static final <T> T lastOrNull(@NotNull List<? extends T> $this$lastOrNull) {
        Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
        if ($this$lastOrNull.isEmpty()) {
            return null;
        }
        return $this$lastOrNull.get($this$lastOrNull.size() - 1);
    }

    @Nullable
    public static final <T> T lastOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object obj = null;
        for (Object obj2 : iterable) {
            if (predicate.invoke(obj2).booleanValue()) {
                obj = obj2;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Object] */
    @Nullable
    public static final <T> T lastOrNull(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (predicate.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> T random(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return (T) CollectionsKt.random(collection, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    public static final <T> T random(@NotNull Collection<? extends T> collection, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) CollectionsKt.elementAt(collection, random.nextInt(collection.size()));
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <T> T randomOrNull(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return (T) CollectionsKt.randomOrNull(collection, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T> T randomOrNull(@NotNull Collection<? extends T> collection, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return (T) CollectionsKt.elementAt(collection, random.nextInt(collection.size()));
    }

    public static final <T> T single(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) CollectionsKt.single((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <T> T single(@NotNull List<? extends T> $this$single) {
        Intrinsics.checkNotNullParameter($this$single, "<this>");
        switch ($this$single.size()) {
            case 0:
                throw new NoSuchElementException("List is empty.");
            case 1:
                return $this$single.get(0);
            default:
                throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static final <T> T single(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object obj = null;
        boolean z = false;
        for (Object obj2 : iterable) {
            if (predicate.invoke(obj2).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                obj = obj2;
                z = true;
            }
        }
        if (z) {
            return (T) obj;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Nullable
    public static final <T> T singleOrNull(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            if (((List) iterable).size() == 1) {
                return (T) ((List) iterable).get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
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
    public static final <T> T singleOrNull(@NotNull List<? extends T> $this$singleOrNull) {
        Intrinsics.checkNotNullParameter($this$singleOrNull, "<this>");
        if ($this$singleOrNull.size() == 1) {
            return $this$singleOrNull.get(0);
        }
        return null;
    }

    @Nullable
    public static final <T> T singleOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object obj = null;
        boolean z = false;
        for (Object obj2 : iterable) {
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

    @NotNull
    public static final <T> List<T> drop(@NotNull Iterable<? extends T> $this$drop, int n) {
        ArrayList list;
        Intrinsics.checkNotNullParameter($this$drop, "<this>");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        if (n == 0) {
            return CollectionsKt.toList($this$drop);
        }
        if ($this$drop instanceof Collection) {
            int resultSize = ((Collection) $this$drop).size() - n;
            if (resultSize <= 0) {
                return CollectionsKt.emptyList();
            }
            if (resultSize == 1) {
                return CollectionsKt.listOf(CollectionsKt.last($this$drop));
            }
            list = new ArrayList(resultSize);
            if ($this$drop instanceof List) {
                if ($this$drop instanceof RandomAccess) {
                    int size = ((List) $this$drop).size();
                    for (int index = n; index < size; index++) {
                        list.add(((List) $this$drop).get(index));
                    }
                } else {
                    ListIterator listIterator = ((List) $this$drop).listIterator(n);
                    while (listIterator.hasNext()) {
                        Object item = listIterator.next();
                        list.add(item);
                    }
                }
                return list;
            }
        } else {
            list = new ArrayList();
        }
        int count = 0;
        for (T t : $this$drop) {
            if (count >= n) {
                Boolean.valueOf(list.add(t));
            } else {
                count++;
                Integer.valueOf(count);
            }
        }
        return CollectionsKt.optimizeReadOnlyList(list);
    }

    @NotNull
    public static final <T> List<T> dropLast(@NotNull List<? extends T> $this$dropLast, int n) {
        Intrinsics.checkNotNullParameter($this$dropLast, "<this>");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        return CollectionsKt.take($this$dropLast, RangesKt.coerceAtLeast($this$dropLast.size() - n, 0));
    }

    @NotNull
    public static final <T> List<T> dropLastWhile(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!predicate.invoke(listIterator.previous()).booleanValue()) {
                    return CollectionsKt.take(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return CollectionsKt.emptyList();
    }

    @NotNull
    public static final <T> List<T> dropWhile(@NotNull Iterable<? extends T> $this$dropWhile, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$dropWhile, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean yielding = false;
        ArrayList list = new ArrayList();
        for (Object item : $this$dropWhile) {
            if (yielding) {
                list.add(item);
            } else if (!predicate.invoke(item).booleanValue()) {
                list.add(item);
                yielding = true;
            }
        }
        return list;
    }

    @NotNull
    public static final <T> List<T> filter(@NotNull Iterable<? extends T> $this$filter, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$filter, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Collection destination$iv = new ArrayList();
        for (Object element$iv : $this$filter) {
            if (predicate.invoke(element$iv).booleanValue()) {
                destination$iv.add(element$iv);
            }
        }
        return (List) destination$iv;
    }

    @NotNull
    public static final <T> List<T> filterIndexed(@NotNull Iterable<? extends T> $this$filterIndexed, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$filterIndexed, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Collection destination$iv = new ArrayList();
        int index$iv$iv = 0;
        for (Object item$iv$iv : $this$filterIndexed) {
            int index$iv = index$iv$iv;
            index$iv$iv++;
            if (index$iv < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (predicate.invoke(Integer.valueOf(index$iv), item$iv$iv).booleanValue()) {
                destination$iv.add(item$iv$iv);
            }
        }
        return (List) destination$iv;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterIndexedTo(@NotNull Iterable<? extends T> $this$filterIndexedTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
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

    public static final /* synthetic */ <R> List<R> filterIsInstance(Iterable<?> $this$filterIsInstance) {
        Intrinsics.checkNotNullParameter($this$filterIsInstance, "<this>");
        Collection destination$iv = new ArrayList();
        for (Object element$iv : $this$filterIsInstance) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (element$iv instanceof Object) {
                destination$iv.add(element$iv);
            }
        }
        return (List) destination$iv;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Iterable<?> $this$filterIsInstanceTo, C destination) {
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
    public static final <T> List<T> filterNot(@NotNull Iterable<? extends T> $this$filterNot, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$filterNot, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Collection destination$iv = new ArrayList();
        for (Object element$iv : $this$filterNot) {
            if (!predicate.invoke(element$iv).booleanValue()) {
                destination$iv.add(element$iv);
            }
        }
        return (List) destination$iv;
    }

    @NotNull
    public static final <T> List<T> filterNotNull(@NotNull Iterable<? extends T> $this$filterNotNull) {
        Intrinsics.checkNotNullParameter($this$filterNotNull, "<this>");
        return (List) CollectionsKt.filterNotNullTo($this$filterNotNull, new ArrayList());
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C filterNotNullTo(@NotNull Iterable<? extends T> $this$filterNotNullTo, @NotNull C destination) {
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
    public static final <T, C extends Collection<? super T>> C filterNotTo(@NotNull Iterable<? extends T> $this$filterNotTo, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
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
    public static final <T, C extends Collection<? super T>> C filterTo(@NotNull Iterable<? extends T> $this$filterTo, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
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
    public static final <T> List<T> slice(@NotNull List<? extends T> $this$slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter($this$slice, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt.emptyList() : CollectionsKt.toList($this$slice.subList(indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    @NotNull
    public static final <T> List<T> slice(@NotNull List<? extends T> $this$slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter($this$slice, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int size = CollectionsKt.collectionSizeOrDefault(indices, 10);
        if (size == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList list = new ArrayList(size);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            int index = it.next().intValue();
            list.add($this$slice.get(index));
        }
        return list;
    }

    @NotNull
    public static final <T> List<T> take(@NotNull Iterable<? extends T> $this$take, int n) {
        Intrinsics.checkNotNullParameter($this$take, "<this>");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        if (n == 0) {
            return CollectionsKt.emptyList();
        }
        if ($this$take instanceof Collection) {
            if (n >= ((Collection) $this$take).size()) {
                return CollectionsKt.toList($this$take);
            }
            if (n == 1) {
                return CollectionsKt.listOf(CollectionsKt.first($this$take));
            }
        }
        int count = 0;
        ArrayList list = new ArrayList(n);
        Iterator<? extends T> it = $this$take.iterator();
        while (it.hasNext()) {
            list.add(it.next());
            count++;
            if (count == n) {
                break;
            }
        }
        return CollectionsKt.optimizeReadOnlyList(list);
    }

    @NotNull
    public static final <T> List<T> takeLast(@NotNull List<? extends T> $this$takeLast, int n) {
        Intrinsics.checkNotNullParameter($this$takeLast, "<this>");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        if (n == 0) {
            return CollectionsKt.emptyList();
        }
        int size = $this$takeLast.size();
        if (n >= size) {
            return CollectionsKt.toList($this$takeLast);
        }
        if (n == 1) {
            return CollectionsKt.listOf(CollectionsKt.last((List) $this$takeLast));
        }
        ArrayList list = new ArrayList(n);
        if ($this$takeLast instanceof RandomAccess) {
            for (int index = size - n; index < size; index++) {
                list.add($this$takeLast.get(index));
            }
        } else {
            ListIterator<? extends T> listIterator = $this$takeLast.listIterator(size - n);
            while (listIterator.hasNext()) {
                list.add(listIterator.next());
            }
        }
        return list;
    }

    @NotNull
    public static final <T> List<T> takeLastWhile(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!predicate.invoke(listIterator.previous()).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return CollectionsKt.toList(list);
    }

    @NotNull
    public static final <T> List<T> takeWhile(@NotNull Iterable<? extends T> $this$takeWhile, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$takeWhile, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList list = new ArrayList();
        for (Object item : $this$takeWhile) {
            if (!predicate.invoke(item).booleanValue()) {
                break;
            }
            list.add(item);
        }
        return list;
    }

    @NotNull
    public static final <T> List<T> reversed(@NotNull Iterable<? extends T> $this$reversed) {
        Intrinsics.checkNotNullParameter($this$reversed, "<this>");
        if (($this$reversed instanceof Collection) && ((Collection) $this$reversed).size() <= 1) {
            return CollectionsKt.toList($this$reversed);
        }
        List<T> mutableList = CollectionsKt.toMutableList($this$reversed);
        CollectionsKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    public static final <T> void shuffle(@NotNull List<T> $this$shuffle, @NotNull Random random) {
        Intrinsics.checkNotNullParameter($this$shuffle, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int i = CollectionsKt.getLastIndex($this$shuffle); 0 < i; i--) {
            int j = random.nextInt(i + 1);
            $this$shuffle.set(j, $this$shuffle.set(i, $this$shuffle.get(j)));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortBy(@NotNull List<T> $this$sortBy, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$sortBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$sortBy.size() > 1) {
            CollectionsKt.sortWith($this$sortBy, new ComparisonsKt__ComparisonsKt.AnonymousClass2(selector));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortByDescending(@NotNull List<T> $this$sortByDescending, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$sortByDescending, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$sortByDescending.size() > 1) {
            CollectionsKt.sortWith($this$sortByDescending, new ComparisonsKt__ComparisonsKt.AnonymousClass1(selector));
        }
    }

    public static final <T extends Comparable<? super T>> void sortDescending(@NotNull List<T> $this$sortDescending) {
        Intrinsics.checkNotNullParameter($this$sortDescending, "<this>");
        CollectionsKt.sortWith($this$sortDescending, ComparisonsKt.reverseOrder());
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> sorted(@NotNull Iterable<? extends T> $this$sorted) {
        Intrinsics.checkNotNullParameter($this$sorted, "<this>");
        if (!($this$sorted instanceof Collection)) {
            List<T> mutableList = CollectionsKt.toMutableList($this$sorted);
            CollectionsKt.sort(mutableList);
            return mutableList;
        }
        if (((Collection) $this$sorted).size() <= 1) {
            return CollectionsKt.toList($this$sorted);
        }
        Collection $this$toTypedArray$iv = (Collection) $this$sorted;
        Object[] array = $this$toTypedArray$iv.toArray(new Comparable[0]);
        Comparable[] $this$sorted_u24lambda_u247 = (Comparable[]) array;
        ArraysKt.sort((Object[]) $this$sorted_u24lambda_u247);
        return ArraysKt.asList(array);
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> sortedBy(@NotNull Iterable<? extends T> $this$sortedBy, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$sortedBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return CollectionsKt.sortedWith($this$sortedBy, new ComparisonsKt__ComparisonsKt.AnonymousClass2(selector));
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> sortedByDescending(@NotNull Iterable<? extends T> $this$sortedByDescending, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$sortedByDescending, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return CollectionsKt.sortedWith($this$sortedByDescending, new ComparisonsKt__ComparisonsKt.AnonymousClass1(selector));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> sortedDescending(@NotNull Iterable<? extends T> $this$sortedDescending) {
        Intrinsics.checkNotNullParameter($this$sortedDescending, "<this>");
        return CollectionsKt.sortedWith($this$sortedDescending, ComparisonsKt.reverseOrder());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> sortedWith(@NotNull Iterable<? extends T> $this$sortedWith, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter($this$sortedWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!($this$sortedWith instanceof Collection)) {
            List<T> mutableList = CollectionsKt.toMutableList($this$sortedWith);
            CollectionsKt.sortWith(mutableList, comparator);
            return mutableList;
        }
        if (((Collection) $this$sortedWith).size() <= 1) {
            return CollectionsKt.toList($this$sortedWith);
        }
        Object[] $this$sortedWith_u24lambda_u249 = ((Collection) $this$sortedWith).toArray(new Object[0]);
        ArraysKt.sortWith($this$sortedWith_u24lambda_u249, comparator);
        return ArraysKt.asList($this$sortedWith_u24lambda_u249);
    }

    @NotNull
    public static final boolean[] toBooleanArray(@NotNull Collection<Boolean> $this$toBooleanArray) {
        Intrinsics.checkNotNullParameter($this$toBooleanArray, "<this>");
        boolean[] result = new boolean[$this$toBooleanArray.size()];
        int index = 0;
        Iterator<Boolean> it = $this$toBooleanArray.iterator();
        while (it.hasNext()) {
            boolean element = it.next().booleanValue();
            int i = index;
            index++;
            result[i] = element;
        }
        return result;
    }

    @NotNull
    public static final byte[] toByteArray(@NotNull Collection<Byte> $this$toByteArray) {
        Intrinsics.checkNotNullParameter($this$toByteArray, "<this>");
        byte[] result = new byte[$this$toByteArray.size()];
        int index = 0;
        Iterator<Byte> it = $this$toByteArray.iterator();
        while (it.hasNext()) {
            byte element = it.next().byteValue();
            int i = index;
            index++;
            result[i] = element;
        }
        return result;
    }

    @NotNull
    public static final char[] toCharArray(@NotNull Collection<Character> $this$toCharArray) {
        Intrinsics.checkNotNullParameter($this$toCharArray, "<this>");
        char[] result = new char[$this$toCharArray.size()];
        int index = 0;
        Iterator<Character> it = $this$toCharArray.iterator();
        while (it.hasNext()) {
            char element = it.next().charValue();
            int i = index;
            index++;
            result[i] = element;
        }
        return result;
    }

    @NotNull
    public static final double[] toDoubleArray(@NotNull Collection<Double> $this$toDoubleArray) {
        Intrinsics.checkNotNullParameter($this$toDoubleArray, "<this>");
        double[] result = new double[$this$toDoubleArray.size()];
        int index = 0;
        Iterator<Double> it = $this$toDoubleArray.iterator();
        while (it.hasNext()) {
            double element = it.next().doubleValue();
            int i = index;
            index++;
            result[i] = element;
        }
        return result;
    }

    @NotNull
    public static final float[] toFloatArray(@NotNull Collection<Float> $this$toFloatArray) {
        Intrinsics.checkNotNullParameter($this$toFloatArray, "<this>");
        float[] result = new float[$this$toFloatArray.size()];
        int index = 0;
        Iterator<Float> it = $this$toFloatArray.iterator();
        while (it.hasNext()) {
            float element = it.next().floatValue();
            int i = index;
            index++;
            result[i] = element;
        }
        return result;
    }

    @NotNull
    public static final int[] toIntArray(@NotNull Collection<Integer> $this$toIntArray) {
        Intrinsics.checkNotNullParameter($this$toIntArray, "<this>");
        int[] result = new int[$this$toIntArray.size()];
        int index = 0;
        Iterator<Integer> it = $this$toIntArray.iterator();
        while (it.hasNext()) {
            int element = it.next().intValue();
            int i = index;
            index++;
            result[i] = element;
        }
        return result;
    }

    @NotNull
    public static final long[] toLongArray(@NotNull Collection<Long> $this$toLongArray) {
        Intrinsics.checkNotNullParameter($this$toLongArray, "<this>");
        long[] result = new long[$this$toLongArray.size()];
        int index = 0;
        Iterator<Long> it = $this$toLongArray.iterator();
        while (it.hasNext()) {
            long element = it.next().longValue();
            int i = index;
            index++;
            result[i] = element;
        }
        return result;
    }

    @NotNull
    public static final short[] toShortArray(@NotNull Collection<Short> $this$toShortArray) {
        Intrinsics.checkNotNullParameter($this$toShortArray, "<this>");
        short[] result = new short[$this$toShortArray.size()];
        int index = 0;
        Iterator<Short> it = $this$toShortArray.iterator();
        while (it.hasNext()) {
            short element = it.next().shortValue();
            int i = index;
            index++;
            result[i] = element;
        }
        return result;
    }

    @NotNull
    public static final <T, K, V> Map<K, V> associate(@NotNull Iterable<? extends T> $this$associate, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter($this$associate, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate, 10)), 16);
        Map destination$iv = new LinkedHashMap(capacity);
        for (Object element$iv : $this$associate) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(element$iv);
            destination$iv.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination$iv;
    }

    @NotNull
    public static final <T, K> Map<K, T> associateBy(@NotNull Iterable<? extends T> $this$associateBy, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter($this$associateBy, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateBy, 10)), 16);
        Map destination$iv = new LinkedHashMap(capacity);
        for (Object element$iv : $this$associateBy) {
            destination$iv.put(keySelector.invoke(element$iv), element$iv);
        }
        return destination$iv;
    }

    @NotNull
    public static final <T, K, V> Map<K, V> associateBy(@NotNull Iterable<? extends T> $this$associateBy, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter($this$associateBy, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateBy, 10)), 16);
        Map destination$iv = new LinkedHashMap(capacity);
        for (Object element$iv : $this$associateBy) {
            destination$iv.put(keySelector.invoke(element$iv), valueTransform.invoke(element$iv));
        }
        return destination$iv;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(@NotNull Iterable<? extends T> $this$associateByTo, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter($this$associateByTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (Object element : $this$associateByTo) {
            destination.put(keySelector.invoke(element), element);
        }
        return destination;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull Iterable<? extends T> $this$associateByTo, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
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
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull Iterable<? extends T> $this$associateTo, @NotNull M destination, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
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
    public static final <K, V> Map<K, V> associateWith(@NotNull Iterable<? extends K> $this$associateWith, @NotNull Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter($this$associateWith, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap result = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateWith, 10)), 16));
        for (Object element$iv : $this$associateWith) {
            result.put(element$iv, valueSelector.invoke(element$iv));
        }
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(@NotNull Iterable<? extends K> $this$associateWithTo, @NotNull M destination, @NotNull Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter($this$associateWithTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (Object element : $this$associateWithTo) {
            destination.put(element, valueSelector.invoke(element));
        }
        return destination;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C toCollection(@NotNull Iterable<? extends T> $this$toCollection, @NotNull C destination) {
        Intrinsics.checkNotNullParameter($this$toCollection, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator<? extends T> it = $this$toCollection.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    @NotNull
    public static final <T> HashSet<T> toHashSet(@NotNull Iterable<? extends T> $this$toHashSet) {
        Intrinsics.checkNotNullParameter($this$toHashSet, "<this>");
        return (HashSet) CollectionsKt.toCollection($this$toHashSet, new HashSet(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$toHashSet, 12))));
    }

    @NotNull
    public static final <T> List<T> toList(@NotNull Iterable<? extends T> $this$toList) {
        Intrinsics.checkNotNullParameter($this$toList, "<this>");
        if ($this$toList instanceof Collection) {
            switch (((Collection) $this$toList).size()) {
                case 0:
                    return CollectionsKt.emptyList();
                case 1:
                    return CollectionsKt.listOf($this$toList instanceof List ? ((List) $this$toList).get(0) : ((Collection) $this$toList).iterator().next());
                default:
                    return CollectionsKt.toMutableList((Collection) $this$toList);
            }
        }
        return CollectionsKt.optimizeReadOnlyList(CollectionsKt.toMutableList($this$toList));
    }

    @NotNull
    public static final <T> List<T> toMutableList(@NotNull Iterable<? extends T> $this$toMutableList) {
        Intrinsics.checkNotNullParameter($this$toMutableList, "<this>");
        if ($this$toMutableList instanceof Collection) {
            return CollectionsKt.toMutableList((Collection) $this$toMutableList);
        }
        return (List) CollectionsKt.toCollection($this$toMutableList, new ArrayList());
    }

    @NotNull
    public static final <T> List<T> toMutableList(@NotNull Collection<? extends T> $this$toMutableList) {
        Intrinsics.checkNotNullParameter($this$toMutableList, "<this>");
        return new ArrayList($this$toMutableList);
    }

    @NotNull
    public static final <T> Set<T> toSet(@NotNull Iterable<? extends T> $this$toSet) {
        Intrinsics.checkNotNullParameter($this$toSet, "<this>");
        if ($this$toSet instanceof Collection) {
            switch (((Collection) $this$toSet).size()) {
                case 0:
                    return SetsKt.emptySet();
                case 1:
                    return SetsKt.setOf($this$toSet instanceof List ? ((List) $this$toSet).get(0) : ((Collection) $this$toSet).iterator().next());
                default:
                    return (Set) CollectionsKt.toCollection($this$toSet, new LinkedHashSet(MapsKt.mapCapacity(((Collection) $this$toSet).size())));
            }
        }
        return SetsKt.optimizeReadOnlySet((Set) CollectionsKt.toCollection($this$toSet, new LinkedHashSet()));
    }

    @NotNull
    public static final <T, R> List<R> flatMap(@NotNull Iterable<? extends T> $this$flatMap, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter($this$flatMap, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Collection destination$iv = new ArrayList();
        for (Object element$iv : $this$flatMap) {
            CollectionsKt.addAll(destination$iv, transform.invoke(element$iv));
        }
        return (List) destination$iv;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapSequence")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R> List<R> flatMapSequence(@NotNull Iterable<? extends T> $this$flatMap, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter($this$flatMap, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Collection destination$iv = new ArrayList();
        for (Object element$iv : $this$flatMap) {
            CollectionsKt.addAll(destination$iv, transform.invoke(element$iv));
        }
        return (List) destination$iv;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIndexedIterable")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <T, R> List<R> flatMapIndexedIterable(Iterable<? extends T> iterable, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : iterable) {
            int i2 = i;
            i++;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i2), t));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIndexedSequence")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <T, R> List<R> flatMapIndexedSequence(Iterable<? extends T> iterable, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : iterable) {
            int i2 = i;
            i++;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i2), t));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIndexedIterableTo")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedIterableTo(Iterable<? extends T> $this$flatMapIndexedTo, C destination, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
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
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedSequenceTo(Iterable<? extends T> $this$flatMapIndexedTo, C destination, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
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

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C flatMapTo(@NotNull Iterable<? extends T> $this$flatMapTo, @NotNull C destination, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter($this$flatMapTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (Object element : $this$flatMapTo) {
            CollectionsKt.addAll(destination, transform.invoke(element));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapSequenceTo")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R, C extends Collection<? super R>> C flatMapSequenceTo(@NotNull Iterable<? extends T> $this$flatMapTo, @NotNull C destination, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter($this$flatMapTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (Object element : $this$flatMapTo) {
            CollectionsKt.addAll(destination, transform.invoke(element));
        }
        return destination;
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> groupBy(@NotNull Iterable<? extends T> $this$groupBy, @NotNull Function1<? super T, ? extends K> keySelector) {
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
    public static final <T, K, V> Map<K, List<V>> groupBy(@NotNull Iterable<? extends T> $this$groupBy, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
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
    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(@NotNull Iterable<? extends T> $this$groupByTo, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
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
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull Iterable<? extends T> $this$groupByTo, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
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
    public static final <T, K> Grouping<T, K> groupingBy(@NotNull final Iterable<? extends T> $this$groupingBy, @NotNull final Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter($this$groupingBy, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new Grouping<T, K>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt.groupingBy.1
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
    public static final <T, R> List<R> map(@NotNull Iterable<? extends T> $this$map, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$map, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Collection destination$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map, 10));
        for (Object item$iv : $this$map) {
            destination$iv.add(transform.invoke(item$iv));
        }
        return (List) destination$iv;
    }

    @NotNull
    public static final <T, R> List<R> mapIndexed(@NotNull Iterable<? extends T> $this$mapIndexed, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapIndexed, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Collection destination$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$mapIndexed, 10));
        int index$iv = 0;
        for (Object item$iv : $this$mapIndexed) {
            int i = index$iv;
            index$iv++;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            destination$iv.add(transform.invoke(Integer.valueOf(i), item$iv));
        }
        return (List) destination$iv;
    }

    @NotNull
    public static final <T, R> List<R> mapIndexedNotNull(@NotNull Iterable<? extends T> $this$mapIndexedNotNull, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapIndexedNotNull, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Collection destination$iv = new ArrayList();
        int index$iv$iv = 0;
        for (Object item$iv$iv : $this$mapIndexedNotNull) {
            int index$iv = index$iv$iv;
            index$iv$iv++;
            if (index$iv < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            R rInvoke = transform.invoke(Integer.valueOf(index$iv), item$iv$iv);
            if (rInvoke != null) {
                destination$iv.add(rInvoke);
            }
        }
        return (List) destination$iv;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull Iterable<? extends T> $this$mapIndexedNotNullTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
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
    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(@NotNull Iterable<? extends T> $this$mapIndexedTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
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
    public static final <T, R> List<R> mapNotNull(@NotNull Iterable<? extends T> $this$mapNotNull, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapNotNull, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Collection destination$iv = new ArrayList();
        for (Object element$iv$iv : $this$mapNotNull) {
            R rInvoke = transform.invoke(element$iv$iv);
            if (rInvoke != null) {
                destination$iv.add(rInvoke);
            }
        }
        return (List) destination$iv;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(@NotNull Iterable<? extends T> $this$mapNotNullTo, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
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
    public static final <T, R, C extends Collection<? super R>> C mapTo(@NotNull Iterable<? extends T> $this$mapTo, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (Object item : $this$mapTo) {
            destination.add(transform.invoke(item));
        }
        return destination;
    }

    @NotNull
    public static final <T> Iterable<IndexedValue<T>> withIndex(@NotNull Iterable<? extends T> $this$withIndex) {
        Intrinsics.checkNotNullParameter($this$withIndex, "<this>");
        return new IndexingIterable(() -> {
            return withIndex$lambda$17$CollectionsKt___CollectionsKt(r2);
        });
    }

    private static final Iterator withIndex$lambda$17$CollectionsKt___CollectionsKt(Iterable $this_withIndex) {
        return $this_withIndex.iterator();
    }

    @NotNull
    public static final <T> List<T> distinct(@NotNull Iterable<? extends T> $this$distinct) {
        Intrinsics.checkNotNullParameter($this$distinct, "<this>");
        return CollectionsKt.toList(CollectionsKt.toMutableSet($this$distinct));
    }

    @NotNull
    public static final <T, K> List<T> distinctBy(@NotNull Iterable<? extends T> $this$distinctBy, @NotNull Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter($this$distinctBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet set = new HashSet();
        ArrayList list = new ArrayList();
        for (Object e : $this$distinctBy) {
            if (set.add(selector.invoke(e))) {
                list.add(e);
            }
        }
        return list;
    }

    @NotNull
    public static final <T> Set<T> intersect(@NotNull Iterable<? extends T> $this$intersect, @NotNull Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter($this$intersect, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = CollectionsKt.toMutableSet($this$intersect);
        CollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final <T> Set<T> subtract(@NotNull Iterable<? extends T> $this$subtract, @NotNull Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter($this$subtract, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = CollectionsKt.toMutableSet($this$subtract);
        CollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final <T> Set<T> toMutableSet(@NotNull Iterable<? extends T> $this$toMutableSet) {
        Intrinsics.checkNotNullParameter($this$toMutableSet, "<this>");
        return $this$toMutableSet instanceof Collection ? new LinkedHashSet((Collection) $this$toMutableSet) : (Set) CollectionsKt.toCollection($this$toMutableSet, new LinkedHashSet());
    }

    @NotNull
    public static final <T> Set<T> union(@NotNull Iterable<? extends T> $this$union, @NotNull Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter($this$union, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = CollectionsKt.toMutableSet($this$union);
        CollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T> boolean all(@NotNull Iterable<? extends T> $this$all, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$all, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (($this$all instanceof Collection) && ((Collection) $this$all).isEmpty()) {
            return true;
        }
        for (Object element : $this$all) {
            if (!predicate.invoke(element).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(@NotNull Iterable<? extends T> $this$any) {
        Intrinsics.checkNotNullParameter($this$any, "<this>");
        if ($this$any instanceof Collection) {
            return !((Collection) $this$any).isEmpty();
        }
        return $this$any.iterator().hasNext();
    }

    public static final <T> boolean any(@NotNull Iterable<? extends T> $this$any, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$any, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (($this$any instanceof Collection) && ((Collection) $this$any).isEmpty()) {
            return false;
        }
        for (Object element : $this$any) {
            if (predicate.invoke(element).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T> int count(@NotNull Iterable<? extends T> $this$count) {
        Intrinsics.checkNotNullParameter($this$count, "<this>");
        if ($this$count instanceof Collection) {
            return ((Collection) $this$count).size();
        }
        int count = 0;
        for (T t : $this$count) {
            count++;
            if (count < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return count;
    }

    @InlineOnly
    private static final <T> int count(Collection<? extends T> $this$count) {
        Intrinsics.checkNotNullParameter($this$count, "<this>");
        return $this$count.size();
    }

    public static final <T> int count(@NotNull Iterable<? extends T> $this$count, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$count, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (($this$count instanceof Collection) && ((Collection) $this$count).isEmpty()) {
            return 0;
        }
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

    public static final <T, R> R fold(@NotNull Iterable<? extends T> iterable, R r, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        R rInvoke = r;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            rInvoke = operation.invoke((Object) rInvoke, it.next());
        }
        return rInvoke;
    }

    public static final <T, R> R foldIndexed(@NotNull Iterable<? extends T> iterable, R r, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i = 0;
        R rInvoke = r;
        for (Object obj : iterable) {
            int i2 = i;
            i++;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            rInvoke = operation.invoke(Integer.valueOf(i2), (Object) rInvoke, obj);
        }
        return rInvoke;
    }

    public static final <T, R> R foldRight(@NotNull List<? extends T> list, R r, @NotNull Function2<? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        R rInvoke = r;
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                rInvoke = operation.invoke(listIterator.previous(), (Object) rInvoke);
            }
        }
        return rInvoke;
    }

    public static final <T, R> R foldRightIndexed(@NotNull List<? extends T> list, R r, @NotNull Function3<? super Integer, ? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        R rInvoke = r;
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                rInvoke = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), (Object) rInvoke);
            }
        }
        return rInvoke;
    }

    @HidesMembers
    public static final <T> void forEach(@NotNull Iterable<? extends T> $this$forEach, @NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter($this$forEach, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (Object element : $this$forEach) {
            action.invoke(element);
        }
    }

    public static final <T> void forEachIndexed(@NotNull Iterable<? extends T> $this$forEachIndexed, @NotNull Function2<? super Integer, ? super T, Unit> action) {
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
    public static final double maxOrThrow(@NotNull Iterable<Double> $this$max) {
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
    public static final float m625maxOrThrow(@NotNull Iterable<Float> $this$max) {
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
    public static final <T extends Comparable<? super T>> T m626maxOrThrow(@NotNull Iterable<? extends T> $this$max) {
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
    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final <T, R extends Comparable<? super R>> T maxByOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T> double maxOf(Iterable<? extends T> iterable, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T> float m627maxOf(Iterable<? extends T> iterable, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T, R extends Comparable<? super R>> R m628maxOf(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T> Double maxOfOrNull(Iterable<? extends T> iterable, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T> Float m629maxOfOrNull(Iterable<? extends T> iterable, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T, R extends Comparable<? super R>> R m630maxOfOrNull(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T, R> R maxOfWith(Iterable<? extends T> iterable, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T, R> R maxOfWithOrNull(Iterable<? extends T> iterable, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final Double maxOrNull(@NotNull Iterable<Double> $this$maxOrNull) {
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
    public static final Float m631maxOrNull(@NotNull Iterable<Float> $this$maxOrNull) {
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
    public static final <T extends Comparable<? super T>> T m632maxOrNull(@NotNull Iterable<? extends T> $this$maxOrNull) {
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
    public static final <T> T maxWithOrThrow(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final <T> T maxWithOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final double minOrThrow(@NotNull Iterable<Double> $this$min) {
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
    public static final float m633minOrThrow(@NotNull Iterable<Float> $this$min) {
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
    public static final <T extends Comparable<? super T>> T m634minOrThrow(@NotNull Iterable<? extends T> $this$min) {
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
    public static final <T, R extends Comparable<? super R>> T minByOrThrow(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final <T, R extends Comparable<? super R>> T minByOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T> double minOf(Iterable<? extends T> iterable, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T> float m635minOf(Iterable<? extends T> iterable, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T, R extends Comparable<? super R>> R m636minOf(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T> Double minOfOrNull(Iterable<? extends T> iterable, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T> Float m637minOfOrNull(Iterable<? extends T> iterable, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T, R extends Comparable<? super R>> R m638minOfOrNull(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T, R> R minOfWith(Iterable<? extends T> iterable, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T, R> R minOfWithOrNull(Iterable<? extends T> iterable, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final Double minOrNull(@NotNull Iterable<Double> $this$minOrNull) {
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
    public static final Float m639minOrNull(@NotNull Iterable<Float> $this$minOrNull) {
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
    public static final <T extends Comparable<? super T>> T m640minOrNull(@NotNull Iterable<? extends T> $this$minOrNull) {
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
    public static final <T> T minWithOrThrow(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final <T> T minWithOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
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

    public static final <T> boolean none(@NotNull Iterable<? extends T> $this$none) {
        Intrinsics.checkNotNullParameter($this$none, "<this>");
        return $this$none instanceof Collection ? ((Collection) $this$none).isEmpty() : !$this$none.iterator().hasNext();
    }

    public static final <T> boolean none(@NotNull Iterable<? extends T> $this$none, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$none, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (($this$none instanceof Collection) && ((Collection) $this$none).isEmpty()) {
            return true;
        }
        for (Object element : $this$none) {
            if (predicate.invoke(element).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, C extends Iterable<? extends T>> C onEach(@NotNull C $this$onEach, @NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter($this$onEach, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (Object element : $this$onEach) {
            action.invoke(element);
        }
        return $this$onEach;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, C extends Iterable<? extends T>> C onEachIndexed(@NotNull C $this$onEachIndexed, @NotNull Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter($this$onEachIndexed, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int index$iv = 0;
        for (Object item$iv : $this$onEachIndexed) {
            int i = index$iv;
            index$iv++;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i), item$iv);
        }
        return $this$onEachIndexed;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [S, java.lang.Object] */
    public static final <S, T extends S> S reduce(@NotNull Iterable<? extends T> iterable, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
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
    public static final <S, T extends S> S reduceIndexed(@NotNull Iterable<? extends T> iterable, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
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
    public static final <S, T extends S> S reduceIndexedOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final <S, T extends S> S reduceOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
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

    /* JADX WARN: Type inference failed for: r8v0, types: [S, java.lang.Object] */
    public static final <S, T extends S> S reduceRight(@NotNull List<? extends T> list, @NotNull Function2<? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        boolean zPrevious = listIterator.previous();
        while (true) {
            ?? r8 = (Object) (zPrevious ? 1 : 0);
            if (listIterator.hasPrevious()) {
                zPrevious = operation.invoke(listIterator.previous(), r8);
            } else {
                return r8;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [S, java.lang.Object] */
    public static final <S, T extends S> S reduceRightIndexed(@NotNull List<? extends T> list, @NotNull Function3<? super Integer, ? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        boolean zPrevious = listIterator.previous();
        while (true) {
            ?? r9 = (Object) (zPrevious ? 1 : 0);
            if (listIterator.hasPrevious()) {
                zPrevious = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), r9);
            } else {
                return r9;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [S, java.lang.Object] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <S, T extends S> S reduceRightIndexedOrNull(@NotNull List<? extends T> list, @NotNull Function3<? super Integer, ? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        boolean zPrevious = listIterator.previous();
        while (true) {
            ?? r9 = (Object) (zPrevious ? 1 : 0);
            if (listIterator.hasPrevious()) {
                zPrevious = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), r9);
            } else {
                return r9;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [S, java.lang.Object] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <S, T extends S> S reduceRightOrNull(@NotNull List<? extends T> list, @NotNull Function2<? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        boolean zPrevious = listIterator.previous();
        while (true) {
            ?? r8 = (Object) (zPrevious ? 1 : 0);
            if (listIterator.hasPrevious()) {
                zPrevious = operation.invoke(listIterator.previous(), r8);
            } else {
                return r8;
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> List<R> runningFold(@NotNull Iterable<? extends T> iterable, R r, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r);
        R rInvoke = r;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            rInvoke = operation.invoke((Object) rInvoke, it.next());
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> List<R> runningFoldIndexed(@NotNull Iterable<? extends T> iterable, R r, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r);
        int i = 0;
        R rInvoke = r;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            int i2 = i;
            i++;
            rInvoke = operation.invoke(Integer.valueOf(i2), (Object) rInvoke, it.next());
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <S, T extends S> List<S> runningReduce(@NotNull Iterable<? extends T> iterable, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.emptyList();
        }
        Object next = it.next();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        arrayList.add(next);
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
            arrayList.add(next);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <S, T extends S> List<S> runningReduceIndexed(@NotNull Iterable<? extends T> iterable, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.emptyList();
        }
        Object next = it.next();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        arrayList.add(next);
        int i = 1;
        while (it.hasNext()) {
            int i2 = i;
            i++;
            next = operation.invoke(Integer.valueOf(i2), next, it.next());
            arrayList.add(next);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> List<R> scan(@NotNull Iterable<? extends T> iterable, R r, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r);
        R rInvoke = r;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            rInvoke = operation.invoke((Object) rInvoke, it.next());
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> List<R> scanIndexed(@NotNull Iterable<? extends T> iterable, R r, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r);
        int i = 0;
        R rInvoke = r;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            int i2 = i;
            i++;
            rInvoke = operation.invoke(Integer.valueOf(i2), (Object) rInvoke, it.next());
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> int sumBy(@NotNull Iterable<? extends T> $this$sumBy, @NotNull Function1<? super T, Integer> selector) {
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
    public static final <T> double sumByDouble(@NotNull Iterable<? extends T> $this$sumByDouble, @NotNull Function1<? super T, Double> selector) {
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
    private static final <T> double sumOfDouble(Iterable<? extends T> $this$sumOf, Function1<? super T, Double> selector) {
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
    private static final <T> int sumOfInt(Iterable<? extends T> $this$sumOf, Function1<? super T, Integer> selector) {
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
    private static final <T> long sumOfLong(Iterable<? extends T> $this$sumOf, Function1<? super T, Long> selector) {
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
    private static final <T> int sumOfUInt(Iterable<? extends T> $this$sumOf, Function1<? super T, UInt> selector) {
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
    private static final <T> long sumOfULong(Iterable<? extends T> $this$sumOf, Function1<? super T, ULong> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long sum = ULong.m406constructorimpl(0L);
        for (Object element : $this$sumOf) {
            sum = ULong.m406constructorimpl(sum + selector.invoke(element).m408unboximpl());
        }
        return sum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Iterable<T> requireNoNulls(@NotNull Iterable<? extends T> $this$requireNoNulls) {
        Intrinsics.checkNotNullParameter($this$requireNoNulls, "<this>");
        for (Object element : $this$requireNoNulls) {
            if (element == null) {
                throw new IllegalArgumentException("null element found in " + $this$requireNoNulls + '.');
            }
        }
        return $this$requireNoNulls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> requireNoNulls(@NotNull List<? extends T> $this$requireNoNulls) {
        Intrinsics.checkNotNullParameter($this$requireNoNulls, "<this>");
        for (Object element : $this$requireNoNulls) {
            if (element == null) {
                throw new IllegalArgumentException("null element found in " + $this$requireNoNulls + '.');
            }
        }
        return $this$requireNoNulls;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> List<List<T>> chunked(@NotNull Iterable<? extends T> $this$chunked, int size) {
        Intrinsics.checkNotNullParameter($this$chunked, "<this>");
        return CollectionsKt.windowed($this$chunked, size, size, true);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T, R> List<R> chunked(@NotNull Iterable<? extends T> $this$chunked, int size, @NotNull Function1<? super List<? extends T>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$chunked, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return CollectionsKt.windowed($this$chunked, size, size, true, transform);
    }

    @NotNull
    public static final <T> List<T> minus(@NotNull Iterable<? extends T> $this$minus, T element) {
        boolean z;
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        ArrayList result = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$minus, 10));
        boolean removed = false;
        for (T t : $this$minus) {
            if (removed || !Intrinsics.areEqual(t, element)) {
                z = true;
            } else {
                removed = true;
                z = false;
            }
            if (z) {
                result.add(t);
            }
        }
        return result;
    }

    @NotNull
    public static final <T> List<T> minus(@NotNull Iterable<? extends T> $this$minus, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return CollectionsKt.toList($this$minus);
        }
        Collection destination$iv$iv = new ArrayList();
        for (T t : $this$minus) {
            if (!ArraysKt.contains(elements, t)) {
                destination$iv$iv.add(t);
            }
        }
        return (List) destination$iv$iv;
    }

    @NotNull
    public static final <T> List<T> minus(@NotNull Iterable<? extends T> $this$minus, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection other = CollectionsKt.convertToListIfNotCollection(elements);
        if (other.isEmpty()) {
            return CollectionsKt.toList($this$minus);
        }
        Collection destination$iv$iv = new ArrayList();
        for (T t : $this$minus) {
            if (!other.contains(t)) {
                destination$iv$iv.add(t);
            }
        }
        return (List) destination$iv$iv;
    }

    @NotNull
    public static final <T> List<T> minus(@NotNull Iterable<? extends T> $this$minus, @NotNull Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        List other = SequencesKt.toList(elements);
        if (other.isEmpty()) {
            return CollectionsKt.toList($this$minus);
        }
        Collection destination$iv$iv = new ArrayList();
        for (T t : $this$minus) {
            if (!other.contains(t)) {
                destination$iv$iv.add(t);
            }
        }
        return (List) destination$iv$iv;
    }

    @InlineOnly
    private static final <T> List<T> minusElement(Iterable<? extends T> $this$minusElement, T element) {
        Intrinsics.checkNotNullParameter($this$minusElement, "<this>");
        return CollectionsKt.minus($this$minusElement, element);
    }

    @NotNull
    public static final <T> Pair<List<T>, List<T>> partition(@NotNull Iterable<? extends T> $this$partition, @NotNull Function1<? super T, Boolean> predicate) {
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
    public static final <T> List<T> plus(@NotNull Iterable<? extends T> $this$plus, T element) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        if ($this$plus instanceof Collection) {
            return CollectionsKt.plus((Collection) $this$plus, (Object) element);
        }
        ArrayList result = new ArrayList();
        CollectionsKt.addAll(result, $this$plus);
        result.add(element);
        return result;
    }

    @NotNull
    public static final <T> List<T> plus(@NotNull Collection<? extends T> $this$plus, T element) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        ArrayList result = new ArrayList($this$plus.size() + 1);
        result.addAll($this$plus);
        result.add(element);
        return result;
    }

    @NotNull
    public static final <T> List<T> plus(@NotNull Iterable<? extends T> $this$plus, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if ($this$plus instanceof Collection) {
            return CollectionsKt.plus((Collection) $this$plus, (Object[]) elements);
        }
        ArrayList result = new ArrayList();
        CollectionsKt.addAll(result, $this$plus);
        CollectionsKt.addAll(result, elements);
        return result;
    }

    @NotNull
    public static final <T> List<T> plus(@NotNull Collection<? extends T> $this$plus, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList result = new ArrayList($this$plus.size() + elements.length);
        result.addAll($this$plus);
        CollectionsKt.addAll(result, elements);
        return result;
    }

    @NotNull
    public static final <T> List<T> plus(@NotNull Iterable<? extends T> $this$plus, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if ($this$plus instanceof Collection) {
            return CollectionsKt.plus((Collection) $this$plus, (Iterable) elements);
        }
        ArrayList result = new ArrayList();
        CollectionsKt.addAll(result, $this$plus);
        CollectionsKt.addAll(result, elements);
        return result;
    }

    @NotNull
    public static final <T> List<T> plus(@NotNull Collection<? extends T> $this$plus, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            ArrayList result = new ArrayList($this$plus.size() + ((Collection) elements).size());
            result.addAll($this$plus);
            result.addAll((Collection) elements);
            return result;
        }
        ArrayList result2 = new ArrayList($this$plus);
        CollectionsKt.addAll(result2, elements);
        return result2;
    }

    @NotNull
    public static final <T> List<T> plus(@NotNull Iterable<? extends T> $this$plus, @NotNull Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList result = new ArrayList();
        CollectionsKt.addAll(result, $this$plus);
        CollectionsKt.addAll(result, elements);
        return result;
    }

    @NotNull
    public static final <T> List<T> plus(@NotNull Collection<? extends T> $this$plus, @NotNull Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList result = new ArrayList($this$plus.size() + 10);
        result.addAll($this$plus);
        CollectionsKt.addAll(result, elements);
        return result;
    }

    @InlineOnly
    private static final <T> List<T> plusElement(Iterable<? extends T> $this$plusElement, T element) {
        Intrinsics.checkNotNullParameter($this$plusElement, "<this>");
        return CollectionsKt.plus($this$plusElement, element);
    }

    @InlineOnly
    private static final <T> List<T> plusElement(Collection<? extends T> $this$plusElement, T element) {
        Intrinsics.checkNotNullParameter($this$plusElement, "<this>");
        return CollectionsKt.plus((Collection) $this$plusElement, (Object) element);
    }

    public static /* synthetic */ List windowed$default(Iterable iterable, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return CollectionsKt.windowed(iterable, i, i2, z);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> List<List<T>> windowed(@NotNull Iterable<? extends T> $this$windowed, int size, int step, boolean partialWindows) {
        int windowSize;
        Intrinsics.checkNotNullParameter($this$windowed, "<this>");
        SlidingWindowKt.checkWindowSizeStep(size, step);
        if (!($this$windowed instanceof RandomAccess) || !($this$windowed instanceof List)) {
            ArrayList result = new ArrayList();
            Iterator $this$forEach$iv = SlidingWindowKt.windowedIterator($this$windowed.iterator(), size, step, partialWindows, false);
            while ($this$forEach$iv.hasNext()) {
                Object element$iv = $this$forEach$iv.next();
                List it = (List) element$iv;
                result.add(it);
            }
            return result;
        }
        int thisSize = ((List) $this$windowed).size();
        int resultCapacity = (thisSize / step) + (thisSize % step == 0 ? 0 : 1);
        ArrayList result2 = new ArrayList(resultCapacity);
        int i = 0;
        while (true) {
            int index = i;
            boolean z = 0 <= index && index < thisSize;
            if (!z || ((windowSize = RangesKt.coerceAtMost(size, thisSize - index)) < size && !partialWindows)) {
                break;
            }
            ArrayList arrayList = new ArrayList(windowSize);
            for (int i2 = 0; i2 < windowSize; i2++) {
                int it2 = i2;
                arrayList.add(((List) $this$windowed).get(it2 + index));
            }
            result2.add(arrayList);
            i = index + step;
        }
        return result2;
    }

    public static /* synthetic */ List windowed$default(Iterable iterable, int i, int i2, boolean z, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return CollectionsKt.windowed(iterable, i, i2, z, function1);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T, R> List<R> windowed(@NotNull Iterable<? extends T> $this$windowed, int size, int step, boolean partialWindows, @NotNull Function1<? super List<? extends T>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$windowed, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(size, step);
        if (($this$windowed instanceof RandomAccess) && ($this$windowed instanceof List)) {
            int thisSize = ((List) $this$windowed).size();
            int resultCapacity = (thisSize / step) + (thisSize % step == 0 ? 0 : 1);
            ArrayList result = new ArrayList(resultCapacity);
            MovingSubList window = new MovingSubList((List) $this$windowed);
            int i = 0;
            while (true) {
                int index = i;
                boolean z = 0 <= index && index < thisSize;
                if (!z) {
                    break;
                }
                int windowSize = RangesKt.coerceAtMost(size, thisSize - index);
                if (!partialWindows && windowSize < size) {
                    break;
                }
                window.move(index, index + windowSize);
                result.add(transform.invoke(window));
                i = index + step;
            }
            return result;
        }
        ArrayList result2 = new ArrayList();
        Iterator $this$forEach$iv = SlidingWindowKt.windowedIterator($this$windowed.iterator(), size, step, partialWindows, true);
        while ($this$forEach$iv.hasNext()) {
            Object element$iv = $this$forEach$iv.next();
            List it = (List) element$iv;
            result2.add(transform.invoke(it));
        }
        return result2;
    }

    @NotNull
    public static final <T, R> List<Pair<T, R>> zip(@NotNull Iterable<? extends T> $this$zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter($this$zip, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int arraySize$iv = other.length;
        ArrayList list$iv = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault($this$zip, 10), arraySize$iv));
        int i$iv = 0;
        for (Object element$iv : $this$zip) {
            if (i$iv >= arraySize$iv) {
                break;
            }
            int i = i$iv;
            i$iv++;
            list$iv.add(TuplesKt.to(element$iv, other[i]));
        }
        return list$iv;
    }

    @NotNull
    public static final <T, R, V> List<V> zip(@NotNull Iterable<? extends T> $this$zip, @NotNull R[] other, @NotNull Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter($this$zip, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int arraySize = other.length;
        ArrayList list = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault($this$zip, 10), arraySize));
        int i = 0;
        for (Object element : $this$zip) {
            if (i >= arraySize) {
                break;
            }
            int i2 = i;
            i++;
            list.add(transform.invoke(element, other[i2]));
        }
        return list;
    }

    @NotNull
    public static final <T, R> List<Pair<T, R>> zip(@NotNull Iterable<? extends T> $this$zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter($this$zip, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator<? extends T> it = $this$zip.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList list$iv = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault($this$zip, 10), CollectionsKt.collectionSizeOrDefault(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object t1 = it.next();
            Object t2 = it2.next();
            list$iv.add(TuplesKt.to(t1, t2));
        }
        return list$iv;
    }

    @NotNull
    public static final <T, R, V> List<V> zip(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends R> other, @NotNull Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(iterable, 10), CollectionsKt.collectionSizeOrDefault(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(transform.invoke(it.next(), it2.next()));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> List<Pair<T, T>> zipWithNext(@NotNull Iterable<? extends T> $this$zipWithNext) {
        Intrinsics.checkNotNullParameter($this$zipWithNext, "<this>");
        Iterator<? extends T> it = $this$zipWithNext.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.emptyList();
        }
        List result$iv = new ArrayList();
        Object next = it.next();
        while (true) {
            Object current$iv = next;
            if (it.hasNext()) {
                Object next$iv = it.next();
                result$iv.add(TuplesKt.to(current$iv, next$iv));
                next = next$iv;
            } else {
                return result$iv;
            }
        }
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T, R> List<R> zipWithNext(@NotNull Iterable<? extends T> $this$zipWithNext, @NotNull Function2<? super T, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$zipWithNext, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = $this$zipWithNext.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.emptyList();
        }
        List result = new ArrayList();
        Object next = it.next();
        while (true) {
            Object current = next;
            if (it.hasNext()) {
                Object next2 = it.next();
                result.add(transform.invoke(current, next2));
                next = next2;
            } else {
                return result;
            }
        }
    }

    public static /* synthetic */ Appendable joinTo$default(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return CollectionsKt.joinTo(iterable, appendable, charSequence, charSequence2, charSequence3, i, charSequence4, function1);
    }

    @NotNull
    public static final <T, A extends Appendable> A joinTo(@NotNull Iterable<? extends T> $this$joinTo, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> transform) throws IOException {
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

    public static /* synthetic */ String joinToString$default(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return CollectionsKt.joinToString(iterable, charSequence, charSequence2, charSequence3, i, charSequence4, function1);
    }

    @NotNull
    public static final <T> String joinToString(@NotNull Iterable<? extends T> $this$joinToString, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter($this$joinToString, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) CollectionsKt.joinTo($this$joinToString, new StringBuilder(), separator, prefix, postfix, limit, truncated, transform)).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> Iterable<T> asIterable(Iterable<? extends T> $this$asIterable) {
        Intrinsics.checkNotNullParameter($this$asIterable, "<this>");
        return $this$asIterable;
    }

    @NotNull
    public static final <T> Sequence<T> asSequence(@NotNull final Iterable<? extends T> $this$asSequence) {
        Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
        return new Sequence<T>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return $this$asSequence.iterator();
            }
        };
    }

    @JvmName(name = "averageOfByte")
    public static final double averageOfByte(@NotNull Iterable<Byte> $this$average) {
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
    public static final double averageOfShort(@NotNull Iterable<Short> $this$average) {
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
    public static final double averageOfInt(@NotNull Iterable<Integer> $this$average) {
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
    public static final double averageOfLong(@NotNull Iterable<Long> $this$average) {
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
    public static final double averageOfFloat(@NotNull Iterable<Float> $this$average) {
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
    public static final double averageOfDouble(@NotNull Iterable<Double> $this$average) {
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
    public static final int sumOfByte(@NotNull Iterable<Byte> $this$sum) {
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
    public static final int sumOfShort(@NotNull Iterable<Short> $this$sum) {
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
    public static final int sumOfInt(@NotNull Iterable<Integer> $this$sum) {
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
    public static final long sumOfLong(@NotNull Iterable<Long> $this$sum) {
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
    public static final float sumOfFloat(@NotNull Iterable<Float> $this$sum) {
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
    public static final double sumOfDouble(@NotNull Iterable<Double> $this$sum) {
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
