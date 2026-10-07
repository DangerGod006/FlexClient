package kotlin.concurrent.atomics;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Atomics.common.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/concurrent/atomics/AtomicsKt__Atomics_commonKt.class */
class AtomicsKt__Atomics_commonKt {
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final void plusAssign(@NotNull AtomicInteger $this$plusAssign, int delta) {
        Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
        $this$plusAssign.addAndGet(delta);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final void minusAssign(@NotNull AtomicInteger $this$minusAssign, int delta) {
        Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
        $this$minusAssign.addAndGet(-delta);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int fetchAndIncrement(@NotNull AtomicInteger $this$fetchAndIncrement) {
        Intrinsics.checkNotNullParameter($this$fetchAndIncrement, "<this>");
        return $this$fetchAndIncrement.getAndAdd(1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int incrementAndFetch(@NotNull AtomicInteger $this$incrementAndFetch) {
        Intrinsics.checkNotNullParameter($this$incrementAndFetch, "<this>");
        return $this$incrementAndFetch.addAndGet(1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int decrementAndFetch(@NotNull AtomicInteger $this$decrementAndFetch) {
        Intrinsics.checkNotNullParameter($this$decrementAndFetch, "<this>");
        return $this$decrementAndFetch.addAndGet(-1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int fetchAndDecrement(@NotNull AtomicInteger $this$fetchAndDecrement) {
        Intrinsics.checkNotNullParameter($this$fetchAndDecrement, "<this>");
        return $this$fetchAndDecrement.getAndAdd(-1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final void plusAssign(@NotNull AtomicLong $this$plusAssign, long delta) {
        Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
        $this$plusAssign.addAndGet(delta);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final void minusAssign(@NotNull AtomicLong $this$minusAssign, long delta) {
        Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
        $this$minusAssign.addAndGet(-delta);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long fetchAndIncrement(@NotNull AtomicLong $this$fetchAndIncrement) {
        Intrinsics.checkNotNullParameter($this$fetchAndIncrement, "<this>");
        return $this$fetchAndIncrement.getAndAdd(1L);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long incrementAndFetch(@NotNull AtomicLong $this$incrementAndFetch) {
        Intrinsics.checkNotNullParameter($this$incrementAndFetch, "<this>");
        return $this$incrementAndFetch.addAndGet(1L);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long decrementAndFetch(@NotNull AtomicLong $this$decrementAndFetch) {
        Intrinsics.checkNotNullParameter($this$decrementAndFetch, "<this>");
        return $this$decrementAndFetch.addAndGet(-1L);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long fetchAndDecrement(@NotNull AtomicLong $this$fetchAndDecrement) {
        Intrinsics.checkNotNullParameter($this$fetchAndDecrement, "<this>");
        return $this$fetchAndDecrement.getAndAdd(-1L);
    }
}
