package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ULongRange;
import kotlin.ranges.URangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ULong.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ULong.class */
@SinceKotlin(version = "1.5")
@JvmInline
public final class ULong implements Comparable<ULong> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final long data;
    public static final long MIN_VALUE = 0;
    public static final long MAX_VALUE = -1;
    public static final int SIZE_BYTES = 8;
    public static final int SIZE_BITS = 64;

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m404hashCodeimpl(long arg0) {
        return Long.hashCode(arg0);
    }

    public int hashCode() {
        return m404hashCodeimpl(this.data);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m405equalsimpl(long arg0, Object other) {
        return (other instanceof ULong) && arg0 == ((ULong) other).m408unboximpl();
    }

    public boolean equals(Object other) {
        return m405equalsimpl(this.data, other);
    }

    @IntrinsicConstEvaluation
    @PublishedApi
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m406constructorimpl(long data) {
        return data;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ULong m407boximpl(long v) {
        return new ULong(v);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m408unboximpl() {
        return this.data;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m409equalsimpl0(long p1, long p2) {
        return p1 == p2;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong other) {
        return UnsignedKt.ulongCompare(m408unboximpl(), other.m408unboximpl());
    }

    @IntrinsicConstEvaluation
    @PublishedApi
    private /* synthetic */ ULong(long data) {
        this.data = data;
    }

    /* JADX INFO: compiled from: ULong.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ULong$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m350compareTo7apg3OU(long arg0, byte other) {
        return Long.compareUnsigned(arg0, m406constructorimpl(((long) other) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m351compareToxj2QHRw(long arg0, short other) {
        return Long.compareUnsigned(arg0, m406constructorimpl(((long) other) & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m352compareToWZ4Q5Ns(long arg0, int other) {
        return Long.compareUnsigned(arg0, m406constructorimpl(((long) other) & 4294967295L));
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private int m354compareToVKZWuLQ(long other) {
        return UnsignedKt.ulongCompare(m408unboximpl(), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static int m353compareToVKZWuLQ(long arg0, long other) {
        return UnsignedKt.ulongCompare(arg0, other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final long m355plus7apg3OU(long arg0, byte other) {
        return m406constructorimpl(arg0 + m406constructorimpl(((long) other) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final long m356plusxj2QHRw(long arg0, short other) {
        return m406constructorimpl(arg0 + m406constructorimpl(((long) other) & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final long m357plusWZ4Q5Ns(long arg0, int other) {
        return m406constructorimpl(arg0 + m406constructorimpl(((long) other) & 4294967295L));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m358plusVKZWuLQ(long arg0, long other) {
        return m406constructorimpl(arg0 + other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final long m359minus7apg3OU(long arg0, byte other) {
        return m406constructorimpl(arg0 - m406constructorimpl(((long) other) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final long m360minusxj2QHRw(long arg0, short other) {
        return m406constructorimpl(arg0 - m406constructorimpl(((long) other) & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final long m361minusWZ4Q5Ns(long arg0, int other) {
        return m406constructorimpl(arg0 - m406constructorimpl(((long) other) & 4294967295L));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m362minusVKZWuLQ(long arg0, long other) {
        return m406constructorimpl(arg0 - other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final long m363times7apg3OU(long arg0, byte other) {
        return m406constructorimpl(arg0 * m406constructorimpl(((long) other) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final long m364timesxj2QHRw(long arg0, short other) {
        return m406constructorimpl(arg0 * m406constructorimpl(((long) other) & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final long m365timesWZ4Q5Ns(long arg0, int other) {
        return m406constructorimpl(arg0 * m406constructorimpl(((long) other) & 4294967295L));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m366timesVKZWuLQ(long arg0, long other) {
        return m406constructorimpl(arg0 * other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final long m367div7apg3OU(long arg0, byte other) {
        return Long.divideUnsigned(arg0, m406constructorimpl(((long) other) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final long m368divxj2QHRw(long arg0, short other) {
        return Long.divideUnsigned(arg0, m406constructorimpl(((long) other) & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final long m369divWZ4Q5Ns(long arg0, int other) {
        return Long.divideUnsigned(arg0, m406constructorimpl(((long) other) & 4294967295L));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m370divVKZWuLQ(long arg0, long other) {
        return UnsignedKt.m540ulongDivideeb3DHEI(arg0, other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final long m371rem7apg3OU(long arg0, byte other) {
        return Long.remainderUnsigned(arg0, m406constructorimpl(((long) other) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final long m372remxj2QHRw(long arg0, short other) {
        return Long.remainderUnsigned(arg0, m406constructorimpl(((long) other) & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final long m373remWZ4Q5Ns(long arg0, int other) {
        return Long.remainderUnsigned(arg0, m406constructorimpl(((long) other) & 4294967295L));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m374remVKZWuLQ(long arg0, long other) {
        return UnsignedKt.m541ulongRemaindereb3DHEI(arg0, other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final long m375floorDiv7apg3OU(long arg0, byte other) {
        return Long.divideUnsigned(arg0, m406constructorimpl(((long) other) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final long m376floorDivxj2QHRw(long arg0, short other) {
        return Long.divideUnsigned(arg0, m406constructorimpl(((long) other) & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final long m377floorDivWZ4Q5Ns(long arg0, int other) {
        return Long.divideUnsigned(arg0, m406constructorimpl(((long) other) & 4294967295L));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m378floorDivVKZWuLQ(long arg0, long other) {
        return Long.divideUnsigned(arg0, other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m379mod7apg3OU(long arg0, byte other) {
        return UByte.m246constructorimpl((byte) Long.remainderUnsigned(arg0, m406constructorimpl(((long) other) & 255)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m380modxj2QHRw(long arg0, short other) {
        return UShort.m513constructorimpl((short) Long.remainderUnsigned(arg0, m406constructorimpl(((long) other) & 65535)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m381modWZ4Q5Ns(long arg0, int other) {
        return UInt.m326constructorimpl((int) Long.remainderUnsigned(arg0, m406constructorimpl(((long) other) & 4294967295L)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m382modVKZWuLQ(long arg0, long other) {
        return Long.remainderUnsigned(arg0, other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: inc-s-VKNKU, reason: not valid java name */
    private static final long m383incsVKNKU(long arg0) {
        return m406constructorimpl(arg0 + 1);
    }

    @InlineOnly
    /* JADX INFO: renamed from: dec-s-VKNKU, reason: not valid java name */
    private static final long m384decsVKNKU(long arg0) {
        return m406constructorimpl(arg0 - 1);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rangeTo-VKZWuLQ, reason: not valid java name */
    private static final ULongRange m385rangeToVKZWuLQ(long arg0, long other) {
        return new ULongRange(arg0, other, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: rangeUntil-VKZWuLQ, reason: not valid java name */
    private static final ULongRange m386rangeUntilVKZWuLQ(long arg0, long other) {
        return URangesKt.m1528untileb3DHEI(arg0, other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: shl-s-VKNKU, reason: not valid java name */
    private static final long m387shlsVKNKU(long arg0, int bitCount) {
        return m406constructorimpl(arg0 << bitCount);
    }

    @InlineOnly
    /* JADX INFO: renamed from: shr-s-VKNKU, reason: not valid java name */
    private static final long m388shrsVKNKU(long arg0, int bitCount) {
        return m406constructorimpl(arg0 >>> bitCount);
    }

    @InlineOnly
    /* JADX INFO: renamed from: and-VKZWuLQ, reason: not valid java name */
    private static final long m389andVKZWuLQ(long arg0, long other) {
        return m406constructorimpl(arg0 & other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: or-VKZWuLQ, reason: not valid java name */
    private static final long m390orVKZWuLQ(long arg0, long other) {
        return m406constructorimpl(arg0 | other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: xor-VKZWuLQ, reason: not valid java name */
    private static final long m391xorVKZWuLQ(long arg0, long other) {
        return m406constructorimpl(arg0 ^ other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: inv-s-VKNKU, reason: not valid java name */
    private static final long m392invsVKNKU(long arg0) {
        return m406constructorimpl(arg0 ^ (-1));
    }

    @InlineOnly
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m393toByteimpl(long arg0) {
        return (byte) arg0;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m394toShortimpl(long arg0) {
        return (short) arg0;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m395toIntimpl(long arg0) {
        return (int) arg0;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m396toLongimpl(long arg0) {
        return arg0;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m397toUBytew2LRezQ(long arg0) {
        return UByte.m246constructorimpl((byte) arg0);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m398toUShortMh2AYeg(long arg0) {
        return UShort.m513constructorimpl((short) arg0);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m399toUIntpVg5ArA(long arg0) {
        return UInt.m326constructorimpl((int) arg0);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m400toULongsVKNKU(long arg0) {
        return arg0;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m401toFloatimpl(long arg0) {
        return (float) UnsignedKt.ulongToDouble(arg0);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m402toDoubleimpl(long arg0) {
        return UnsignedKt.ulongToDouble(arg0);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m403toStringimpl(long arg0) {
        return UnsignedKt.ulongToString(arg0, 10);
    }

    @NotNull
    public String toString() {
        return m403toStringimpl(this.data);
    }
}
