package kotlin.ranges;

import java.util.Iterator;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ULongRange.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/ULongProgression.class */
@SinceKotlin(version = "1.5")
public class ULongProgression implements Iterable<ULong>, KMappedMarker {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final long first;
    private final long last;
    private final long step;

    public /* synthetic */ ULongProgression(long start, long endInclusive, long step, DefaultConstructorMarker $constructor_marker) {
        this(start, endInclusive, step);
    }

    private ULongProgression(long start, long endInclusive, long step) {
        if (step == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (step == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = start;
        this.last = UProgressionUtilKt.m1427getProgressionLastElement7ftBX0g(start, endInclusive, step);
        this.step = step;
    }

    /* JADX INFO: renamed from: getFirst-s-VKNKU, reason: not valid java name */
    public final long m1503getFirstsVKNKU() {
        return this.first;
    }

    /* JADX INFO: renamed from: getLast-s-VKNKU, reason: not valid java name */
    public final long m1504getLastsVKNKU() {
        return this.last;
    }

    public final long getStep() {
        return this.step;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<ULong> iterator() {
        return new ULongProgressionIterator(this.first, this.last, this.step, null);
    }

    public boolean isEmpty() {
        return this.step > 0 ? Long.compareUnsigned(this.first, this.last) > 0 : Long.compareUnsigned(this.first, this.last) < 0;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof ULongProgression) && ((isEmpty() && ((ULongProgression) other).isEmpty()) || (this.first == ((ULongProgression) other).first && this.last == ((ULongProgression) other).last && this.step == ((ULongProgression) other).step));
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (31 * ((31 * ((int) ULong.m406constructorimpl(this.first ^ ULong.m406constructorimpl(this.first >>> 32)))) + ((int) ULong.m406constructorimpl(this.last ^ ULong.m406constructorimpl(this.last >>> 32))))) + ((int) (this.step ^ (this.step >>> 32)));
    }

    @NotNull
    public String toString() {
        return this.step > 0 ? ((Object) ULong.m403toStringimpl(this.first)) + ".." + ((Object) ULong.m403toStringimpl(this.last)) + " step " + this.step : ((Object) ULong.m403toStringimpl(this.first)) + " downTo " + ((Object) ULong.m403toStringimpl(this.last)) + " step " + (-this.step);
    }

    /* JADX INFO: compiled from: ULongRange.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/ULongProgression$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: fromClosedRange-7ftBX0g, reason: not valid java name */
        public final ULongProgression m1506fromClosedRange7ftBX0g(long rangeStart, long rangeEnd, long step) {
            return new ULongProgression(rangeStart, rangeEnd, step, null);
        }
    }
}
