package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UnsignedJVM.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/UnsignedKt.class */
@JvmName(name = "UnsignedKt")
public final class UnsignedKt {
    @PublishedApi
    /* JADX INFO: renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m538uintRemainderJ1ME1BU(int v1, int v2) {
        return UInt.m326constructorimpl((int) ((((long) v1) & 4294967295L) % (((long) v2) & 4294967295L)));
    }

    @PublishedApi
    /* JADX INFO: renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m539uintDivideJ1ME1BU(int v1, int v2) {
        return UInt.m326constructorimpl((int) ((((long) v1) & 4294967295L) / (((long) v2) & 4294967295L)));
    }

    @PublishedApi
    /* JADX INFO: renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m540ulongDivideeb3DHEI(long v1, long v2) {
        if (v2 < 0) {
            return Long.compareUnsigned(v1, v2) < 0 ? ULong.m406constructorimpl(0L) : ULong.m406constructorimpl(1L);
        }
        if (v1 < 0) {
            long quotient = ((v1 >>> 1) / v2) << 1;
            long rem = v1 - (quotient * v2);
            return ULong.m406constructorimpl(quotient + ((long) (Long.compareUnsigned(ULong.m406constructorimpl(rem), ULong.m406constructorimpl(v2)) >= 0 ? 1 : 0)));
        }
        return ULong.m406constructorimpl(v1 / v2);
    }

    @PublishedApi
    /* JADX INFO: renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m541ulongRemaindereb3DHEI(long v1, long v2) {
        if (v2 < 0) {
            if (Long.compareUnsigned(v1, v2) < 0) {
                return v1;
            }
            return ULong.m406constructorimpl(v1 - v2);
        }
        if (v1 < 0) {
            long quotient = ((v1 >>> 1) / v2) << 1;
            long rem = v1 - (quotient * v2);
            return ULong.m406constructorimpl(rem - (Long.compareUnsigned(ULong.m406constructorimpl(rem), ULong.m406constructorimpl(v2)) >= 0 ? v2 : 0L));
        }
        return ULong.m406constructorimpl(v1 % v2);
    }

    @PublishedApi
    public static final int uintCompare(int v1, int v2) {
        return Intrinsics.compare(v1 ^ IntCompanionObject.MIN_VALUE, v2 ^ IntCompanionObject.MIN_VALUE);
    }

    @PublishedApi
    public static final int ulongCompare(long v1, long v2) {
        return Intrinsics.compare(v1 ^ Long.MIN_VALUE, v2 ^ Long.MIN_VALUE);
    }

    @PublishedApi
    @InlineOnly
    private static final long uintToULong(int value) {
        return ULong.m406constructorimpl(((long) value) & 4294967295L);
    }

    @PublishedApi
    @InlineOnly
    private static final long uintToLong(int value) {
        return ((long) value) & 4294967295L;
    }

    @PublishedApi
    @InlineOnly
    private static final float uintToFloat(int value) {
        return (float) uintToDouble(value);
    }

    @PublishedApi
    @InlineOnly
    private static final int floatToUInt(float value) {
        return doubleToUInt(value);
    }

    @PublishedApi
    public static final double uintToDouble(int value) {
        return ((double) (value & IntCompanionObject.MAX_VALUE)) + (((double) ((value >>> 31) << 30)) * ((double) 2));
    }

    @PublishedApi
    public static final int doubleToUInt(double value) {
        if (Double.isNaN(value) || value <= uintToDouble(0)) {
            return 0;
        }
        if (value >= uintToDouble(-1)) {
            return -1;
        }
        return value <= 2.147483647E9d ? UInt.m326constructorimpl((int) value) : UInt.m326constructorimpl(UInt.m326constructorimpl((int) (value - ((double) IntCompanionObject.MAX_VALUE))) + UInt.m326constructorimpl(IntCompanionObject.MAX_VALUE));
    }

    @PublishedApi
    @InlineOnly
    private static final float ulongToFloat(long value) {
        return (float) ulongToDouble(value);
    }

    @PublishedApi
    @InlineOnly
    private static final long floatToULong(float value) {
        return doubleToULong(value);
    }

    @PublishedApi
    public static final double ulongToDouble(long value) {
        return ((value >>> 11) * ((double) 2048)) + (value & 2047);
    }

    @PublishedApi
    public static final long doubleToULong(double value) {
        if (Double.isNaN(value) || value <= ulongToDouble(0L)) {
            return 0L;
        }
        if (value >= ulongToDouble(-1L)) {
            return -1L;
        }
        return value < 9.223372036854776E18d ? ULong.m406constructorimpl((long) value) : ULong.m406constructorimpl(ULong.m406constructorimpl((long) (value - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @InlineOnly
    private static final String uintToString(int value) {
        return String.valueOf(((long) value) & 4294967295L);
    }

    @InlineOnly
    private static final String uintToString(int value, int base) {
        return ulongToString(((long) value) & 4294967295L, base);
    }

    @InlineOnly
    private static final String ulongToString(long value) {
        return ulongToString(value, 10);
    }

    @NotNull
    public static final String ulongToString(long value, int base) {
        if (value >= 0) {
            String string = Long.toString(value, CharsKt.checkRadix(base));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long quotient = ((value >>> 1) / ((long) base)) << 1;
        long rem = value - (quotient * ((long) base));
        if (rem >= base) {
            rem -= (long) base;
            quotient++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(quotient, CharsKt.checkRadix(base));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        StringBuilder sbAppend = sb.append(string2);
        String string3 = Long.toString(rem, CharsKt.checkRadix(base));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return sbAppend.append(string3).toString();
    }
}
