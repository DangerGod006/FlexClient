package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ULongRange.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/ULongRange.class */
@SinceKotlin(version = "1.5")
public final class ULongRange extends ULongProgression implements ClosedRange<ULong>, OpenEndRange<ULong> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final ULongRange EMPTY = new ULongRange(-1, 0, null);

    @Deprecated(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* JADX INFO: renamed from: getEndExclusive-s-VKNKU$annotations, reason: not valid java name */
    public static /* synthetic */ void m1511getEndExclusivesVKNKU$annotations() {
    }

    public /* synthetic */ ULongRange(long start, long endInclusive, DefaultConstructorMarker $constructor_marker) {
        this(start, endInclusive);
    }

    @Override // kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ Comparable getStart() {
        return ULong.m407boximpl(m1508getStartsVKNKU());
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ Comparable getEndInclusive() {
        return ULong.m407boximpl(m1509getEndInclusivesVKNKU());
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ Comparable getEndExclusive() {
        return ULong.m407boximpl(m1510getEndExclusivesVKNKU());
    }

    @Override // kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable value) {
        return m1512containsVKZWuLQ(((ULong) value).m408unboximpl());
    }

    private ULongRange(long start, long endInclusive) {
        super(start, endInclusive, 1L, null);
    }

    /* JADX INFO: renamed from: getStart-s-VKNKU, reason: not valid java name */
    public long m1508getStartsVKNKU() {
        return m1503getFirstsVKNKU();
    }

    /* JADX INFO: renamed from: getEndInclusive-s-VKNKU, reason: not valid java name */
    public long m1509getEndInclusivesVKNKU() {
        return m1504getLastsVKNKU();
    }

    /* JADX INFO: renamed from: getEndExclusive-s-VKNKU, reason: not valid java name */
    public long m1510getEndExclusivesVKNKU() {
        if (m1504getLastsVKNKU() == -1) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
        }
        return ULong.m406constructorimpl(m1504getLastsVKNKU() + ULong.m406constructorimpl(((long) 1) & 4294967295L));
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m1512containsVKZWuLQ(long value) {
        return Long.compareUnsigned(m1503getFirstsVKNKU(), value) <= 0 && Long.compareUnsigned(value, m1504getLastsVKNKU()) <= 0;
    }

    @Override // kotlin.ranges.ULongProgression, kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return Long.compareUnsigned(m1503getFirstsVKNKU(), m1504getLastsVKNKU()) > 0;
    }

    @Override // kotlin.ranges.ULongProgression
    public boolean equals(@Nullable Object other) {
        return (other instanceof ULongRange) && ((isEmpty() && ((ULongRange) other).isEmpty()) || (m1503getFirstsVKNKU() == ((ULongRange) other).m1503getFirstsVKNKU() && m1504getLastsVKNKU() == ((ULongRange) other).m1504getLastsVKNKU()));
    }

    @Override // kotlin.ranges.ULongProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (31 * ((int) ULong.m406constructorimpl(m1503getFirstsVKNKU() ^ ULong.m406constructorimpl(m1503getFirstsVKNKU() >>> 32)))) + ((int) ULong.m406constructorimpl(m1504getLastsVKNKU() ^ ULong.m406constructorimpl(m1504getLastsVKNKU() >>> 32)));
    }

    @Override // kotlin.ranges.ULongProgression
    @NotNull
    public String toString() {
        return ((Object) ULong.m403toStringimpl(m1503getFirstsVKNKU())) + ".." + ((Object) ULong.m403toStringimpl(m1504getLastsVKNKU()));
    }

    /* JADX INFO: compiled from: ULongRange.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/ULongRange$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final ULongRange getEMPTY() {
            return ULongRange.EMPTY;
        }
    }
}
