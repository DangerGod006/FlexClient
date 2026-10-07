package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UInt.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/UInt.class */
@SinceKotlin(version = "1.5")
@JvmInline
public final class UInt implements Comparable<UInt> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int data;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = -1;
    public static final int SIZE_BYTES = 4;
    public static final int SIZE_BITS = 32;

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m324hashCodeimpl(int arg0) {
        return Integer.hashCode(arg0);
    }

    public int hashCode() {
        return m324hashCodeimpl(this.data);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m325equalsimpl(int arg0, Object other) {
        return (other instanceof UInt) && arg0 == ((UInt) other).m328unboximpl();
    }

    public boolean equals(Object other) {
        return m325equalsimpl(this.data, other);
    }

    @IntrinsicConstEvaluation
    @PublishedApi
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m326constructorimpl(int data) {
        return data;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UInt m327boximpl(int v) {
        return new UInt(v);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m328unboximpl() {
        return this.data;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m329equalsimpl0(int p1, int p2) {
        return p1 == p2;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UInt other) {
        return UnsignedKt.uintCompare(m328unboximpl(), other.m328unboximpl());
    }

    @IntrinsicConstEvaluation
    @PublishedApi
    private /* synthetic */ UInt(int data) {
        this.data = data;
    }

    /* JADX INFO: compiled from: UInt.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/UInt$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m270compareTo7apg3OU(int arg0, byte other) {
        return Integer.compareUnsigned(arg0, m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m271compareToxj2QHRw(int arg0, short other) {
        return Integer.compareUnsigned(arg0, m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private int m273compareToWZ4Q5Ns(int other) {
        return UnsignedKt.uintCompare(m328unboximpl(), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static int m272compareToWZ4Q5Ns(int arg0, int other) {
        return UnsignedKt.uintCompare(arg0, other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m274compareToVKZWuLQ(int arg0, long other) {
        return Long.compareUnsigned(ULong.m406constructorimpl(((long) arg0) & 4294967295L), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m275plus7apg3OU(int arg0, byte other) {
        return m326constructorimpl(arg0 + m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m276plusxj2QHRw(int arg0, short other) {
        return m326constructorimpl(arg0 + m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m277plusWZ4Q5Ns(int arg0, int other) {
        return m326constructorimpl(arg0 + other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m278plusVKZWuLQ(int arg0, long other) {
        return ULong.m406constructorimpl(ULong.m406constructorimpl(((long) arg0) & 4294967295L) + other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m279minus7apg3OU(int arg0, byte other) {
        return m326constructorimpl(arg0 - m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m280minusxj2QHRw(int arg0, short other) {
        return m326constructorimpl(arg0 - m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m281minusWZ4Q5Ns(int arg0, int other) {
        return m326constructorimpl(arg0 - other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m282minusVKZWuLQ(int arg0, long other) {
        return ULong.m406constructorimpl(ULong.m406constructorimpl(((long) arg0) & 4294967295L) - other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m283times7apg3OU(int arg0, byte other) {
        return m326constructorimpl(arg0 * m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m284timesxj2QHRw(int arg0, short other) {
        return m326constructorimpl(arg0 * m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m285timesWZ4Q5Ns(int arg0, int other) {
        return m326constructorimpl(arg0 * other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m286timesVKZWuLQ(int arg0, long other) {
        return ULong.m406constructorimpl(ULong.m406constructorimpl(((long) arg0) & 4294967295L) * other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m287div7apg3OU(int arg0, byte other) {
        return Integer.divideUnsigned(arg0, m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m288divxj2QHRw(int arg0, short other) {
        return Integer.divideUnsigned(arg0, m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m289divWZ4Q5Ns(int arg0, int other) {
        return UnsignedKt.m539uintDivideJ1ME1BU(arg0, other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m290divVKZWuLQ(int arg0, long other) {
        return Long.divideUnsigned(ULong.m406constructorimpl(((long) arg0) & 4294967295L), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m291rem7apg3OU(int arg0, byte other) {
        return Integer.remainderUnsigned(arg0, m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m292remxj2QHRw(int arg0, short other) {
        return Integer.remainderUnsigned(arg0, m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m293remWZ4Q5Ns(int arg0, int other) {
        return UnsignedKt.m538uintRemainderJ1ME1BU(arg0, other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m294remVKZWuLQ(int arg0, long other) {
        return Long.remainderUnsigned(ULong.m406constructorimpl(((long) arg0) & 4294967295L), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m295floorDiv7apg3OU(int arg0, byte other) {
        return Integer.divideUnsigned(arg0, m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m296floorDivxj2QHRw(int arg0, short other) {
        return Integer.divideUnsigned(arg0, m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m297floorDivWZ4Q5Ns(int arg0, int other) {
        return Integer.divideUnsigned(arg0, other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m298floorDivVKZWuLQ(int arg0, long other) {
        return Long.divideUnsigned(ULong.m406constructorimpl(((long) arg0) & 4294967295L), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m299mod7apg3OU(int arg0, byte other) {
        return UByte.m246constructorimpl((byte) Integer.remainderUnsigned(arg0, m326constructorimpl(other & 255)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m300modxj2QHRw(int arg0, short other) {
        return UShort.m513constructorimpl((short) Integer.remainderUnsigned(arg0, m326constructorimpl(other & 65535)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m301modWZ4Q5Ns(int arg0, int other) {
        return Integer.remainderUnsigned(arg0, other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m302modVKZWuLQ(int arg0, long other) {
        return Long.remainderUnsigned(ULong.m406constructorimpl(((long) arg0) & 4294967295L), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: inc-pVg5ArA, reason: not valid java name */
    private static final int m303incpVg5ArA(int arg0) {
        return m326constructorimpl(arg0 + 1);
    }

    @InlineOnly
    /* JADX INFO: renamed from: dec-pVg5ArA, reason: not valid java name */
    private static final int m304decpVg5ArA(int arg0) {
        return m326constructorimpl(arg0 - 1);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rangeTo-WZ4Q5Ns, reason: not valid java name */
    private static final UIntRange m305rangeToWZ4Q5Ns(int arg0, int other) {
        return new UIntRange(arg0, other, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: rangeUntil-WZ4Q5Ns, reason: not valid java name */
    private static final UIntRange m306rangeUntilWZ4Q5Ns(int arg0, int other) {
        return URangesKt.m1527untilJ1ME1BU(arg0, other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: shl-pVg5ArA, reason: not valid java name */
    private static final int m307shlpVg5ArA(int arg0, int bitCount) {
        return m326constructorimpl(arg0 << bitCount);
    }

    @InlineOnly
    /* JADX INFO: renamed from: shr-pVg5ArA, reason: not valid java name */
    private static final int m308shrpVg5ArA(int arg0, int bitCount) {
        return m326constructorimpl(arg0 >>> bitCount);
    }

    @InlineOnly
    /* JADX INFO: renamed from: and-WZ4Q5Ns, reason: not valid java name */
    private static final int m309andWZ4Q5Ns(int arg0, int other) {
        return m326constructorimpl(arg0 & other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: or-WZ4Q5Ns, reason: not valid java name */
    private static final int m310orWZ4Q5Ns(int arg0, int other) {
        return m326constructorimpl(arg0 | other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: xor-WZ4Q5Ns, reason: not valid java name */
    private static final int m311xorWZ4Q5Ns(int arg0, int other) {
        return m326constructorimpl(arg0 ^ other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: inv-pVg5ArA, reason: not valid java name */
    private static final int m312invpVg5ArA(int arg0) {
        return m326constructorimpl(arg0 ^ (-1));
    }

    @InlineOnly
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m313toByteimpl(int arg0) {
        return (byte) arg0;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m314toShortimpl(int arg0) {
        return (short) arg0;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m315toIntimpl(int arg0) {
        return arg0;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m316toLongimpl(int arg0) {
        return ((long) arg0) & 4294967295L;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m317toUBytew2LRezQ(int arg0) {
        return UByte.m246constructorimpl((byte) arg0);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m318toUShortMh2AYeg(int arg0) {
        return UShort.m513constructorimpl((short) arg0);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m319toUIntpVg5ArA(int arg0) {
        return arg0;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m320toULongsVKNKU(int arg0) {
        return ULong.m406constructorimpl(((long) arg0) & 4294967295L);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m321toFloatimpl(int arg0) {
        return (float) UnsignedKt.uintToDouble(arg0);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m322toDoubleimpl(int arg0) {
        return UnsignedKt.uintToDouble(arg0);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m323toStringimpl(int arg0) {
        return String.valueOf(((long) arg0) & 4294967295L);
    }

    @NotNull
    public String toString() {
        return m323toStringimpl(this.data);
    }
}
