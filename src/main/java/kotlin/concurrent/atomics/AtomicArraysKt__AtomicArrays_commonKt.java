package kotlin.concurrent.atomics;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AtomicArrays.common.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/concurrent/atomics/AtomicArraysKt__AtomicArrays_commonKt.class */
class AtomicArraysKt__AtomicArrays_commonKt {
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicIntegerArray AtomicIntArray(int size, @NotNull Function1<? super Integer, Integer> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            int i2 = i;
            iArr[i2] = init.invoke(Integer.valueOf(i2)).intValue();
        }
        return new AtomicIntegerArray(iArr);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int fetchAndIncrementAt(@NotNull AtomicIntegerArray $this$fetchAndIncrementAt, int index) {
        Intrinsics.checkNotNullParameter($this$fetchAndIncrementAt, "<this>");
        return $this$fetchAndIncrementAt.getAndAdd(index, 1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int incrementAndFetchAt(@NotNull AtomicIntegerArray $this$incrementAndFetchAt, int index) {
        Intrinsics.checkNotNullParameter($this$incrementAndFetchAt, "<this>");
        return $this$incrementAndFetchAt.addAndGet(index, 1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int decrementAndFetchAt(@NotNull AtomicIntegerArray $this$decrementAndFetchAt, int index) {
        Intrinsics.checkNotNullParameter($this$decrementAndFetchAt, "<this>");
        return $this$decrementAndFetchAt.addAndGet(index, -1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int fetchAndDecrementAt(@NotNull AtomicIntegerArray $this$fetchAndDecrementAt, int index) {
        Intrinsics.checkNotNullParameter($this$fetchAndDecrementAt, "<this>");
        return $this$fetchAndDecrementAt.getAndAdd(index, -1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicLongArray AtomicLongArray(int size, @NotNull Function1<? super Integer, Long> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            int i2 = i;
            jArr[i2] = init.invoke(Integer.valueOf(i2)).longValue();
        }
        return new AtomicLongArray(jArr);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long fetchAndIncrementAt(@NotNull AtomicLongArray $this$fetchAndIncrementAt, int index) {
        Intrinsics.checkNotNullParameter($this$fetchAndIncrementAt, "<this>");
        return $this$fetchAndIncrementAt.getAndAdd(index, 1L);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long incrementAndFetchAt(@NotNull AtomicLongArray $this$incrementAndFetchAt, int index) {
        Intrinsics.checkNotNullParameter($this$incrementAndFetchAt, "<this>");
        return $this$incrementAndFetchAt.addAndGet(index, 1L);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long decrementAndFetchAt(@NotNull AtomicLongArray $this$decrementAndFetchAt, int index) {
        Intrinsics.checkNotNullParameter($this$decrementAndFetchAt, "<this>");
        return $this$decrementAndFetchAt.addAndGet(index, -1L);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long fetchAndDecrementAt(@NotNull AtomicLongArray $this$fetchAndDecrementAt, int index) {
        Intrinsics.checkNotNullParameter($this$fetchAndDecrementAt, "<this>");
        return $this$fetchAndDecrementAt.getAndAdd(index, -1L);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final /* synthetic */ <T> AtomicReferenceArray<T> AtomicArray(int size, Function1<? super Integer, ? extends T> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        Intrinsics.reifiedOperationMarker(0, "T");
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            int i2 = i;
            objArr[i2] = init.invoke(Integer.valueOf(i2));
        }
        return new AtomicReferenceArray<>(objArr);
    }
}
