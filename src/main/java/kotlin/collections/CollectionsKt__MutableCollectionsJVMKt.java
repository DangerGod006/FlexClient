package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.NotImplementedError;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: MutableCollectionsJVM.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/CollectionsKt__MutableCollectionsJVMKt.class */
public class CollectionsKt__MutableCollectionsJVMKt extends CollectionsKt__IteratorsKt {
    @Deprecated(message = "Use sortWith(comparator) instead.", replaceWith = @ReplaceWith(expression = "this.sortWith(comparator)", imports = {}), level = DeprecationLevel.ERROR)
    @InlineOnly
    private static final <T> void sort(List<T> $this$sort, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        throw new NotImplementedError(null, 1, null);
    }

    @Deprecated(message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @ReplaceWith(expression = "this.sortWith(Comparator(comparison))", imports = {}), level = DeprecationLevel.ERROR)
    @InlineOnly
    private static final <T> void sort(List<T> $this$sort, Function2<? super T, ? super T, Integer> comparison) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        throw new NotImplementedError(null, 1, null);
    }

    public static final <T extends Comparable<? super T>> void sort(@NotNull List<T> $this$sort) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        if ($this$sort.size() > 1) {
            Collections.sort($this$sort);
        }
    }

    public static final <T> void sortWith(@NotNull List<T> $this$sortWith, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter($this$sortWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if ($this$sortWith.size() > 1) {
            Collections.sort($this$sortWith, comparator);
        }
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final <T> void fill(List<T> $this$fill, T value) {
        Intrinsics.checkNotNullParameter($this$fill, "<this>");
        Collections.fill($this$fill, value);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final <T> void shuffle(List<T> $this$shuffle) {
        Intrinsics.checkNotNullParameter($this$shuffle, "<this>");
        Collections.shuffle($this$shuffle);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final <T> void shuffle(List<T> $this$shuffle, Random random) {
        Intrinsics.checkNotNullParameter($this$shuffle, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        Collections.shuffle($this$shuffle, random);
    }
}
