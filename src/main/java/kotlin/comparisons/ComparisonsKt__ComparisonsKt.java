package kotlin.comparisons;

import java.util.Comparator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/comparisons/ComparisonsKt__ComparisonsKt.class */
public class ComparisonsKt__ComparisonsKt {
    public static final <T> int compareValuesBy(T a, T b, @NotNull Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return compareValuesByImpl$ComparisonsKt__ComparisonsKt(a, b, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int compareValuesByImpl$ComparisonsKt__ComparisonsKt(T a, T b, Function1<? super T, ? extends Comparable<?>>[] selectors) {
        for (Function1<? super T, ? extends Comparable<?>> function1 : selectors) {
            int diff = ComparisonsKt.compareValues(function1.invoke(a), function1.invoke(b));
            if (diff != 0) {
                return diff;
            }
        }
        return 0;
    }

    @InlineOnly
    private static final <T> int compareValuesBy(T a, T b, Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return ComparisonsKt.compareValues(selector.invoke(a), selector.invoke(b));
    }

    @InlineOnly
    private static final <T, K> int compareValuesBy(T t, T t2, Comparator<? super K> comparator, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return comparator.compare(selector.invoke(t), selector.invoke(t2));
    }

    public static final <T extends Comparable<?>> int compareValues(@Nullable T a, @Nullable T b) {
        if (a == b) {
            return 0;
        }
        if (a == null) {
            return -1;
        }
        if (b == null) {
            return 1;
        }
        return a.compareTo(b);
    }

    @NotNull
    public static final <T> Comparator<T> compareBy(@NotNull Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return (v1, v2) -> {
                return compareBy$lambda$0$ComparisonsKt__ComparisonsKt(r0, v1, v2);
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final int compareBy$lambda$0$ComparisonsKt__ComparisonsKt(Function1[] $selectors, Object a, Object b) {
        return compareValuesByImpl$ComparisonsKt__ComparisonsKt(a, b, $selectors);
    }

    /* JADX INFO: renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$2, reason: invalid class name */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2.class */
    public static final class AnonymousClass2<T> implements Comparator {
        final /* synthetic */ Function1<T, Comparable<?>> $selector;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super T, ? extends Comparable<?>> $selector) {
            this.$selector = $selector;
        }

        @Override // java.util.Comparator
        public final int compare(T a, T b) {
            Function1<T, Comparable<?>> function1 = this.$selector;
            return ComparisonsKt.compareValues(function1.invoke(a), function1.invoke(b));
        }
    }

    @InlineOnly
    private static final <T> Comparator<T> compareBy(Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new AnonymousClass2(selector);
    }

    @InlineOnly
    private static final <T, K> Comparator<T> compareBy(final Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.compareBy.3
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Comparator<? super K> comparator2 = comparator;
                Function1<T, K> function1 = selector;
                return comparator2.compare((Object) function1.invoke(t), (Object) function1.invoke(t2));
            }
        };
    }

    /* JADX INFO: renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$1, reason: invalid class name */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1.class */
    public static final class AnonymousClass1<T> implements Comparator {
        final /* synthetic */ Function1<T, Comparable<?>> $selector;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super T, ? extends Comparable<?>> $selector) {
            this.$selector = $selector;
        }

        @Override // java.util.Comparator
        public final int compare(T a, T b) {
            Function1<T, Comparable<?>> function1 = this.$selector;
            return ComparisonsKt.compareValues(function1.invoke(b), function1.invoke(a));
        }
    }

    @InlineOnly
    private static final <T> Comparator<T> compareByDescending(Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new AnonymousClass1(selector);
    }

    @InlineOnly
    private static final <T, K> Comparator<T> compareByDescending(final Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.compareByDescending.2
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Comparator<? super K> comparator2 = comparator;
                Function1<T, K> function1 = selector;
                return comparator2.compare((Object) function1.invoke(t2), (Object) function1.invoke(t));
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> thenBy(final Comparator<T> $this$thenBy, final Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter($this$thenBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenBy.1
            @Override // java.util.Comparator
            public final int compare(T a, T b) {
                int previousCompare = $this$thenBy.compare(a, b);
                if (previousCompare != 0) {
                    return previousCompare;
                }
                Function1<T, Comparable<?>> function1 = selector;
                return ComparisonsKt.compareValues(function1.invoke(a), function1.invoke(b));
            }
        };
    }

    @InlineOnly
    private static final <T, K> Comparator<T> thenBy(final Comparator<T> $this$thenBy, final Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter($this$thenBy, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenBy.2
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = $this$thenBy.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                Comparator<? super K> comparator2 = comparator;
                Function1<T, K> function1 = selector;
                return comparator2.compare((Object) function1.invoke(t), (Object) function1.invoke(t2));
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> thenByDescending(final Comparator<T> $this$thenByDescending, final Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter($this$thenByDescending, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenByDescending.1
            @Override // java.util.Comparator
            public final int compare(T a, T b) {
                int previousCompare = $this$thenByDescending.compare(a, b);
                if (previousCompare != 0) {
                    return previousCompare;
                }
                Function1<T, Comparable<?>> function1 = selector;
                return ComparisonsKt.compareValues(function1.invoke(b), function1.invoke(a));
            }
        };
    }

    @InlineOnly
    private static final <T, K> Comparator<T> thenByDescending(final Comparator<T> $this$thenByDescending, final Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter($this$thenByDescending, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenByDescending.2
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = $this$thenByDescending.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                Comparator<? super K> comparator2 = comparator;
                Function1<T, K> function1 = selector;
                return comparator2.compare((Object) function1.invoke(t2), (Object) function1.invoke(t));
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> thenComparator(final Comparator<T> $this$thenComparator, final Function2<? super T, ? super T, Integer> comparison) {
        Intrinsics.checkNotNullParameter($this$thenComparator, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenComparator.1
            @Override // java.util.Comparator
            public final int compare(T a, T b) {
                int previousCompare = $this$thenComparator.compare(a, b);
                return previousCompare != 0 ? previousCompare : comparison.invoke(a, b).intValue();
            }
        };
    }

    @NotNull
    public static final <T> Comparator<T> then(@NotNull Comparator<T> $this$then, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter($this$then, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (v2, v3) -> {
            return then$lambda$1$ComparisonsKt__ComparisonsKt(r0, r1, v2, v3);
        };
    }

    private static final int then$lambda$1$ComparisonsKt__ComparisonsKt(Comparator $this_then, Comparator $comparator, Object a, Object b) {
        int previousCompare = $this_then.compare(a, b);
        return previousCompare != 0 ? previousCompare : $comparator.compare(a, b);
    }

    @NotNull
    public static final <T> Comparator<T> thenDescending(@NotNull Comparator<T> $this$thenDescending, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter($this$thenDescending, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (v2, v3) -> {
            return thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(r0, r1, v2, v3);
        };
    }

    private static final int thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(Comparator $this_thenDescending, Comparator $comparator, Object a, Object b) {
        int previousCompare = $this_thenDescending.compare(a, b);
        return previousCompare != 0 ? previousCompare : $comparator.compare(b, a);
    }

    @NotNull
    public static final <T> Comparator<T> nullsFirst(@NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (v1, v2) -> {
            return nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt(r0, v1, v2);
        };
    }

    private static final int nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt(Comparator $comparator, Object a, Object b) {
        if (a == b) {
            return 0;
        }
        if (a == null) {
            return -1;
        }
        if (b == null) {
            return 1;
        }
        return $comparator.compare(a, b);
    }

    @InlineOnly
    private static final <T extends Comparable<? super T>> Comparator<T> nullsFirst() {
        return ComparisonsKt.nullsFirst(ComparisonsKt.naturalOrder());
    }

    @NotNull
    public static final <T> Comparator<T> nullsLast(@NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (v1, v2) -> {
            return nullsLast$lambda$4$ComparisonsKt__ComparisonsKt(r0, v1, v2);
        };
    }

    private static final int nullsLast$lambda$4$ComparisonsKt__ComparisonsKt(Comparator $comparator, Object a, Object b) {
        if (a == b) {
            return 0;
        }
        if (a == null) {
            return 1;
        }
        if (b == null) {
            return -1;
        }
        return $comparator.compare(a, b);
    }

    @InlineOnly
    private static final <T extends Comparable<? super T>> Comparator<T> nullsLast() {
        return ComparisonsKt.nullsLast(ComparisonsKt.naturalOrder());
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        NaturalOrderComparator naturalOrderComparator = NaturalOrderComparator.INSTANCE;
        Intrinsics.checkNotNull(naturalOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return naturalOrderComparator;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.INSTANCE;
        Intrinsics.checkNotNull(reverseOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return reverseOrderComparator;
    }

    @NotNull
    public static final <T> Comparator<T> reversed(@NotNull Comparator<T> $this$reversed) {
        Intrinsics.checkNotNullParameter($this$reversed, "<this>");
        if ($this$reversed instanceof ReversedComparator) {
            return ((ReversedComparator) $this$reversed).getComparator();
        }
        if (Intrinsics.areEqual($this$reversed, NaturalOrderComparator.INSTANCE)) {
            ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.INSTANCE;
            Intrinsics.checkNotNull(reverseOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
            return reverseOrderComparator;
        }
        if (!Intrinsics.areEqual($this$reversed, ReverseOrderComparator.INSTANCE)) {
            return new ReversedComparator($this$reversed);
        }
        NaturalOrderComparator naturalOrderComparator = NaturalOrderComparator.INSTANCE;
        Intrinsics.checkNotNull(naturalOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
        return naturalOrderComparator;
    }
}
