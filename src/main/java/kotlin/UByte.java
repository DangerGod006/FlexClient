package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UByte.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/UByte.class */
@SinceKotlin(version = "1.5")
@JvmInline
public final class UByte implements Comparable<UByte> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final byte data;
    public static final byte MIN_VALUE = 0;
    public static final byte MAX_VALUE = -1;
    public static final int SIZE_BYTES = 1;
    public static final int SIZE_BITS = 8;

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m244hashCodeimpl(byte arg0) {
        return Byte.hashCode(arg0);
    }

    public int hashCode() {
        return m244hashCodeimpl(this.data);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m245equalsimpl(byte arg0, Object other) {
        return (other instanceof UByte) && arg0 == ((UByte) other).m248unboximpl();
    }

    public boolean equals(Object other) {
        return m245equalsimpl(this.data, other);
    }

    @IntrinsicConstEvaluation
    @PublishedApi
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte m246constructorimpl(byte data) {
        return data;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByte m247boximpl(byte v) {
        return new UByte(v);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m248unboximpl() {
        return this.data;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m249equalsimpl0(byte p1, byte p2) {
        return p1 == p2;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte other) {
        return Intrinsics.compare(m248unboximpl() & 255, other.m248unboximpl() & 255);
    }

    @IntrinsicConstEvaluation
    @PublishedApi
    private /* synthetic */ UByte(byte data) {
        this.data = data;
    }

    /* JADX INFO: compiled from: UByte.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/UByte$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private int m193compareTo7apg3OU(byte other) {
        return Intrinsics.compare(m248unboximpl() & 255, other & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static int m192compareTo7apg3OU(byte arg0, byte other) {
        return Intrinsics.compare(arg0 & 255, other & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m194compareToxj2QHRw(byte arg0, short other) {
        return Intrinsics.compare(arg0 & 255, other & 65535);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m195compareToWZ4Q5Ns(byte arg0, int other) {
        return Integer.compareUnsigned(UInt.m326constructorimpl(arg0 & 255), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m196compareToVKZWuLQ(byte arg0, long other) {
        return Long.compareUnsigned(ULong.m406constructorimpl(((long) arg0) & 255), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m197plus7apg3OU(byte arg0, byte other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 255) + UInt.m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m198plusxj2QHRw(byte arg0, short other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 255) + UInt.m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m199plusWZ4Q5Ns(byte arg0, int other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 255) + other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m200plusVKZWuLQ(byte arg0, long other) {
        return ULong.m406constructorimpl(ULong.m406constructorimpl(((long) arg0) & 255) + other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m201minus7apg3OU(byte arg0, byte other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 255) - UInt.m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m202minusxj2QHRw(byte arg0, short other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 255) - UInt.m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m203minusWZ4Q5Ns(byte arg0, int other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 255) - other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m204minusVKZWuLQ(byte arg0, long other) {
        return ULong.m406constructorimpl(ULong.m406constructorimpl(((long) arg0) & 255) - other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m205times7apg3OU(byte arg0, byte other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 255) * UInt.m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m206timesxj2QHRw(byte arg0, short other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 255) * UInt.m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m207timesWZ4Q5Ns(byte arg0, int other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 255) * other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m208timesVKZWuLQ(byte arg0, long other) {
        return ULong.m406constructorimpl(ULong.m406constructorimpl(((long) arg0) & 255) * other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m209div7apg3OU(byte arg0, byte other) {
        return Integer.divideUnsigned(UInt.m326constructorimpl(arg0 & 255), UInt.m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m210divxj2QHRw(byte arg0, short other) {
        return Integer.divideUnsigned(UInt.m326constructorimpl(arg0 & 255), UInt.m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m211divWZ4Q5Ns(byte arg0, int other) {
        return Integer.divideUnsigned(UInt.m326constructorimpl(arg0 & 255), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m212divVKZWuLQ(byte arg0, long other) {
        return Long.divideUnsigned(ULong.m406constructorimpl(((long) arg0) & 255), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m213rem7apg3OU(byte arg0, byte other) {
        return Integer.remainderUnsigned(UInt.m326constructorimpl(arg0 & 255), UInt.m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m214remxj2QHRw(byte arg0, short other) {
        return Integer.remainderUnsigned(UInt.m326constructorimpl(arg0 & 255), UInt.m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m215remWZ4Q5Ns(byte arg0, int other) {
        return Integer.remainderUnsigned(UInt.m326constructorimpl(arg0 & 255), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m216remVKZWuLQ(byte arg0, long other) {
        return Long.remainderUnsigned(ULong.m406constructorimpl(((long) arg0) & 255), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m217floorDiv7apg3OU(byte arg0, byte other) {
        return Integer.divideUnsigned(UInt.m326constructorimpl(arg0 & 255), UInt.m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m218floorDivxj2QHRw(byte arg0, short other) {
        return Integer.divideUnsigned(UInt.m326constructorimpl(arg0 & 255), UInt.m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m219floorDivWZ4Q5Ns(byte arg0, int other) {
        return Integer.divideUnsigned(UInt.m326constructorimpl(arg0 & 255), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m220floorDivVKZWuLQ(byte arg0, long other) {
        return Long.divideUnsigned(ULong.m406constructorimpl(((long) arg0) & 255), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m221mod7apg3OU(byte arg0, byte other) {
        return m246constructorimpl((byte) Integer.remainderUnsigned(UInt.m326constructorimpl(arg0 & 255), UInt.m326constructorimpl(other & 255)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m222modxj2QHRw(byte arg0, short other) {
        return UShort.m513constructorimpl((short) Integer.remainderUnsigned(UInt.m326constructorimpl(arg0 & 255), UInt.m326constructorimpl(other & 65535)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m223modWZ4Q5Ns(byte arg0, int other) {
        return Integer.remainderUnsigned(UInt.m326constructorimpl(arg0 & 255), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m224modVKZWuLQ(byte arg0, long other) {
        return Long.remainderUnsigned(ULong.m406constructorimpl(((long) arg0) & 255), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: inc-w2LRezQ, reason: not valid java name */
    private static final byte m225incw2LRezQ(byte arg0) {
        return m246constructorimpl((byte) (arg0 + 1));
    }

    @InlineOnly
    /* JADX INFO: renamed from: dec-w2LRezQ, reason: not valid java name */
    private static final byte m226decw2LRezQ(byte arg0) {
        return m246constructorimpl((byte) (arg0 - 1));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rangeTo-7apg3OU, reason: not valid java name */
    private static final UIntRange m227rangeTo7apg3OU(byte arg0, byte other) {
        return new UIntRange(UInt.m326constructorimpl(arg0 & 255), UInt.m326constructorimpl(other & 255), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: rangeUntil-7apg3OU, reason: not valid java name */
    private static final UIntRange m228rangeUntil7apg3OU(byte arg0, byte other) {
        return URangesKt.m1527untilJ1ME1BU(UInt.m326constructorimpl(arg0 & 255), UInt.m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: and-7apg3OU, reason: not valid java name */
    private static final byte m229and7apg3OU(byte arg0, byte other) {
        return m246constructorimpl((byte) (arg0 & other));
    }

    @InlineOnly
    /* JADX INFO: renamed from: or-7apg3OU, reason: not valid java name */
    private static final byte m230or7apg3OU(byte arg0, byte other) {
        return m246constructorimpl((byte) (arg0 | other));
    }

    @InlineOnly
    /* JADX INFO: renamed from: xor-7apg3OU, reason: not valid java name */
    private static final byte m231xor7apg3OU(byte arg0, byte other) {
        return m246constructorimpl((byte) (arg0 ^ other));
    }

    @InlineOnly
    /* JADX INFO: renamed from: inv-w2LRezQ, reason: not valid java name */
    private static final byte m232invw2LRezQ(byte arg0) {
        return m246constructorimpl((byte) (arg0 ^ (-1)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m233toByteimpl(byte arg0) {
        return arg0;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m234toShortimpl(byte arg0) {
        return (short) (arg0 & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m235toIntimpl(byte arg0) {
        return arg0 & 255;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m236toLongimpl(byte arg0) {
        return ((long) arg0) & 255;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m237toUBytew2LRezQ(byte arg0) {
        return arg0;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m238toUShortMh2AYeg(byte arg0) {
        return UShort.m513constructorimpl((short) (arg0 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m239toUIntpVg5ArA(byte arg0) {
        return UInt.m326constructorimpl(arg0 & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m240toULongsVKNKU(byte arg0) {
        return ULong.m406constructorimpl(((long) arg0) & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m241toFloatimpl(byte arg0) {
        return (float) UnsignedKt.uintToDouble(arg0 & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m242toDoubleimpl(byte arg0) {
        return UnsignedKt.uintToDouble(arg0 & 255);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m243toStringimpl(byte arg0) {
        return String.valueOf(arg0 & 255);
    }

    @NotNull
    public String toString() {
        return m243toStringimpl(this.data);
    }
}
