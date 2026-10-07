package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UShort.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/UShort.class */
@SinceKotlin(version = "1.5")
@JvmInline
public final class UShort implements Comparable<UShort> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final short data;
    public static final short MIN_VALUE = 0;
    public static final short MAX_VALUE = -1;
    public static final int SIZE_BYTES = 2;
    public static final int SIZE_BITS = 16;

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m511hashCodeimpl(short arg0) {
        return Short.hashCode(arg0);
    }

    public int hashCode() {
        return m511hashCodeimpl(this.data);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m512equalsimpl(short arg0, Object other) {
        return (other instanceof UShort) && arg0 == ((UShort) other).m515unboximpl();
    }

    public boolean equals(Object other) {
        return m512equalsimpl(this.data, other);
    }

    @IntrinsicConstEvaluation
    @PublishedApi
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m513constructorimpl(short data) {
        return data;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShort m514boximpl(short v) {
        return new UShort(v);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m515unboximpl() {
        return this.data;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m516equalsimpl0(short p1, short p2) {
        return p1 == p2;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort other) {
        return Intrinsics.compare(m515unboximpl() & 65535, other.m515unboximpl() & 65535);
    }

    @IntrinsicConstEvaluation
    @PublishedApi
    private /* synthetic */ UShort(short data) {
        this.data = data;
    }

    /* JADX INFO: compiled from: UShort.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/UShort$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m459compareTo7apg3OU(short arg0, byte other) {
        return Intrinsics.compare(arg0 & 65535, other & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private int m461compareToxj2QHRw(short other) {
        return Intrinsics.compare(m515unboximpl() & 65535, other & 65535);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static int m460compareToxj2QHRw(short arg0, short other) {
        return Intrinsics.compare(arg0 & 65535, other & 65535);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m462compareToWZ4Q5Ns(short arg0, int other) {
        return Integer.compareUnsigned(UInt.m326constructorimpl(arg0 & 65535), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m463compareToVKZWuLQ(short arg0, long other) {
        return Long.compareUnsigned(ULong.m406constructorimpl(((long) arg0) & 65535), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m464plus7apg3OU(short arg0, byte other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 65535) + UInt.m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m465plusxj2QHRw(short arg0, short other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 65535) + UInt.m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m466plusWZ4Q5Ns(short arg0, int other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 65535) + other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m467plusVKZWuLQ(short arg0, long other) {
        return ULong.m406constructorimpl(ULong.m406constructorimpl(((long) arg0) & 65535) + other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m468minus7apg3OU(short arg0, byte other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 65535) - UInt.m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m469minusxj2QHRw(short arg0, short other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 65535) - UInt.m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m470minusWZ4Q5Ns(short arg0, int other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 65535) - other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m471minusVKZWuLQ(short arg0, long other) {
        return ULong.m406constructorimpl(ULong.m406constructorimpl(((long) arg0) & 65535) - other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m472times7apg3OU(short arg0, byte other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 65535) * UInt.m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m473timesxj2QHRw(short arg0, short other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 65535) * UInt.m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m474timesWZ4Q5Ns(short arg0, int other) {
        return UInt.m326constructorimpl(UInt.m326constructorimpl(arg0 & 65535) * other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m475timesVKZWuLQ(short arg0, long other) {
        return ULong.m406constructorimpl(ULong.m406constructorimpl(((long) arg0) & 65535) * other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m476div7apg3OU(short arg0, byte other) {
        return Integer.divideUnsigned(UInt.m326constructorimpl(arg0 & 65535), UInt.m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m477divxj2QHRw(short arg0, short other) {
        return Integer.divideUnsigned(UInt.m326constructorimpl(arg0 & 65535), UInt.m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m478divWZ4Q5Ns(short arg0, int other) {
        return Integer.divideUnsigned(UInt.m326constructorimpl(arg0 & 65535), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m479divVKZWuLQ(short arg0, long other) {
        return Long.divideUnsigned(ULong.m406constructorimpl(((long) arg0) & 65535), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m480rem7apg3OU(short arg0, byte other) {
        return Integer.remainderUnsigned(UInt.m326constructorimpl(arg0 & 65535), UInt.m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m481remxj2QHRw(short arg0, short other) {
        return Integer.remainderUnsigned(UInt.m326constructorimpl(arg0 & 65535), UInt.m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m482remWZ4Q5Ns(short arg0, int other) {
        return Integer.remainderUnsigned(UInt.m326constructorimpl(arg0 & 65535), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m483remVKZWuLQ(short arg0, long other) {
        return Long.remainderUnsigned(ULong.m406constructorimpl(((long) arg0) & 65535), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m484floorDiv7apg3OU(short arg0, byte other) {
        return Integer.divideUnsigned(UInt.m326constructorimpl(arg0 & 65535), UInt.m326constructorimpl(other & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m485floorDivxj2QHRw(short arg0, short other) {
        return Integer.divideUnsigned(UInt.m326constructorimpl(arg0 & 65535), UInt.m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m486floorDivWZ4Q5Ns(short arg0, int other) {
        return Integer.divideUnsigned(UInt.m326constructorimpl(arg0 & 65535), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m487floorDivVKZWuLQ(short arg0, long other) {
        return Long.divideUnsigned(ULong.m406constructorimpl(((long) arg0) & 65535), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m488mod7apg3OU(short arg0, byte other) {
        return UByte.m246constructorimpl((byte) Integer.remainderUnsigned(UInt.m326constructorimpl(arg0 & 65535), UInt.m326constructorimpl(other & 255)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m489modxj2QHRw(short arg0, short other) {
        return m513constructorimpl((short) Integer.remainderUnsigned(UInt.m326constructorimpl(arg0 & 65535), UInt.m326constructorimpl(other & 65535)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m490modWZ4Q5Ns(short arg0, int other) {
        return Integer.remainderUnsigned(UInt.m326constructorimpl(arg0 & 65535), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m491modVKZWuLQ(short arg0, long other) {
        return Long.remainderUnsigned(ULong.m406constructorimpl(((long) arg0) & 65535), other);
    }

    @InlineOnly
    /* JADX INFO: renamed from: inc-Mh2AYeg, reason: not valid java name */
    private static final short m492incMh2AYeg(short arg0) {
        return m513constructorimpl((short) (arg0 + 1));
    }

    @InlineOnly
    /* JADX INFO: renamed from: dec-Mh2AYeg, reason: not valid java name */
    private static final short m493decMh2AYeg(short arg0) {
        return m513constructorimpl((short) (arg0 - 1));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rangeTo-xj2QHRw, reason: not valid java name */
    private static final UIntRange m494rangeToxj2QHRw(short arg0, short other) {
        return new UIntRange(UInt.m326constructorimpl(arg0 & 65535), UInt.m326constructorimpl(other & 65535), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: rangeUntil-xj2QHRw, reason: not valid java name */
    private static final UIntRange m495rangeUntilxj2QHRw(short arg0, short other) {
        return URangesKt.m1527untilJ1ME1BU(UInt.m326constructorimpl(arg0 & 65535), UInt.m326constructorimpl(other & 65535));
    }

    @InlineOnly
    /* JADX INFO: renamed from: and-xj2QHRw, reason: not valid java name */
    private static final short m496andxj2QHRw(short arg0, short other) {
        return m513constructorimpl((short) (arg0 & other));
    }

    @InlineOnly
    /* JADX INFO: renamed from: or-xj2QHRw, reason: not valid java name */
    private static final short m497orxj2QHRw(short arg0, short other) {
        return m513constructorimpl((short) (arg0 | other));
    }

    @InlineOnly
    /* JADX INFO: renamed from: xor-xj2QHRw, reason: not valid java name */
    private static final short m498xorxj2QHRw(short arg0, short other) {
        return m513constructorimpl((short) (arg0 ^ other));
    }

    @InlineOnly
    /* JADX INFO: renamed from: inv-Mh2AYeg, reason: not valid java name */
    private static final short m499invMh2AYeg(short arg0) {
        return m513constructorimpl((short) (arg0 ^ (-1)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m500toByteimpl(short arg0) {
        return (byte) arg0;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m501toShortimpl(short arg0) {
        return arg0;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m502toIntimpl(short arg0) {
        return arg0 & 65535;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m503toLongimpl(short arg0) {
        return ((long) arg0) & 65535;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m504toUBytew2LRezQ(short arg0) {
        return UByte.m246constructorimpl((byte) arg0);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m505toUShortMh2AYeg(short arg0) {
        return arg0;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m506toUIntpVg5ArA(short arg0) {
        return UInt.m326constructorimpl(arg0 & 65535);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m507toULongsVKNKU(short arg0) {
        return ULong.m406constructorimpl(((long) arg0) & 65535);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m508toFloatimpl(short arg0) {
        return (float) UnsignedKt.uintToDouble(arg0 & 65535);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m509toDoubleimpl(short arg0) {
        return UnsignedKt.uintToDouble(arg0 & 65535);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m510toStringimpl(short arg0) {
        return String.valueOf(arg0 & 65535);
    }

    @NotNull
    public String toString() {
        return m510toStringimpl(this.data);
    }
}
