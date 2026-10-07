package kotlin.ranges;

import java.util.Iterator;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UIntRange.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/UIntProgression.class */
@SinceKotlin(version = "1.5")
public class UIntProgression implements Iterable<UInt>, KMappedMarker {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int first;
    private final int last;
    private final int step;

    public /* synthetic */ UIntProgression(int start, int endInclusive, int step, DefaultConstructorMarker $constructor_marker) {
        this(start, endInclusive, step);
    }

    private UIntProgression(int start, int endInclusive, int step) {
        if (step == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (step == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = start;
        this.last = UProgressionUtilKt.m1426getProgressionLastElementNkh28Cs(start, endInclusive, step);
        this.step = step;
    }

    /* JADX INFO: renamed from: getFirst-pVg5ArA, reason: not valid java name */
    public final int m1492getFirstpVg5ArA() {
        return this.first;
    }

    /* JADX INFO: renamed from: getLast-pVg5ArA, reason: not valid java name */
    public final int m1493getLastpVg5ArA() {
        return this.last;
    }

    public final int getStep() {
        return this.step;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<UInt> iterator() {
        return new UIntProgressionIterator(this.first, this.last, this.step, null);
    }

    public boolean isEmpty() {
        return this.step > 0 ? Integer.compareUnsigned(this.first, this.last) > 0 : Integer.compareUnsigned(this.first, this.last) < 0;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof UIntProgression) && ((isEmpty() && ((UIntProgression) other).isEmpty()) || (this.first == ((UIntProgression) other).first && this.last == ((UIntProgression) other).last && this.step == ((UIntProgression) other).step));
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (31 * ((31 * this.first) + this.last)) + this.step;
    }

    @NotNull
    public String toString() {
        return this.step > 0 ? ((Object) UInt.m323toStringimpl(this.first)) + ".." + ((Object) UInt.m323toStringimpl(this.last)) + " step " + this.step : ((Object) UInt.m323toStringimpl(this.first)) + " downTo " + ((Object) UInt.m323toStringimpl(this.last)) + " step " + (-this.step);
    }

    /* JADX INFO: compiled from: UIntRange.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/UIntProgression$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: fromClosedRange-Nkh28Cs, reason: not valid java name */
        public final UIntProgression m1495fromClosedRangeNkh28Cs(int rangeStart, int rangeEnd, int step) {
            return new UIntProgression(rangeStart, rangeEnd, step, null);
        }
    }
}
