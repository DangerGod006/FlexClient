package kotlin.random;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.ULongRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: URandom.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/random/URandomKt.class */
public final class URandomKt {
    @SinceKotlin(version = "1.5")
    public static final int nextUInt(@NotNull Random $this$nextUInt) {
        Intrinsics.checkNotNullParameter($this$nextUInt, "<this>");
        return UInt.m326constructorimpl($this$nextUInt.nextInt());
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: nextUInt-qCasIEU, reason: not valid java name */
    public static final int m1476nextUIntqCasIEU(@NotNull Random nextUInt, int until) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        return m1477nextUInta8DCA5k(nextUInt, 0, until);
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: nextUInt-a8DCA5k, reason: not valid java name */
    public static final int m1477nextUInta8DCA5k(@NotNull Random nextUInt, int from, int until) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        m1483checkUIntRangeBoundsJ1ME1BU(from, until);
        int signedFrom = from ^ IntCompanionObject.MIN_VALUE;
        int signedUntil = until ^ IntCompanionObject.MIN_VALUE;
        int signedResult = nextUInt.nextInt(signedFrom, signedUntil) ^ IntCompanionObject.MIN_VALUE;
        return UInt.m326constructorimpl(signedResult);
    }

    @SinceKotlin(version = "1.5")
    public static final int nextUInt(@NotNull Random $this$nextUInt, @NotNull UIntRange range) {
        Intrinsics.checkNotNullParameter($this$nextUInt, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        if (Integer.compareUnsigned(range.m1493getLastpVg5ArA(), -1) < 0) {
            return m1477nextUInta8DCA5k($this$nextUInt, range.m1492getFirstpVg5ArA(), UInt.m326constructorimpl(range.m1493getLastpVg5ArA() + 1));
        }
        if (Integer.compareUnsigned(range.m1492getFirstpVg5ArA(), 0) > 0) {
            return UInt.m326constructorimpl(m1477nextUInta8DCA5k($this$nextUInt, UInt.m326constructorimpl(range.m1492getFirstpVg5ArA() - 1), range.m1493getLastpVg5ArA()) + 1);
        }
        return nextUInt($this$nextUInt);
    }

    @SinceKotlin(version = "1.5")
    public static final long nextULong(@NotNull Random $this$nextULong) {
        Intrinsics.checkNotNullParameter($this$nextULong, "<this>");
        return ULong.m406constructorimpl($this$nextULong.nextLong());
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: nextULong-V1Xi4fY, reason: not valid java name */
    public static final long m1478nextULongV1Xi4fY(@NotNull Random nextULong, long until) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        return m1479nextULongjmpaWc(nextULong, 0L, until);
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: nextULong-jmpaW-c, reason: not valid java name */
    public static final long m1479nextULongjmpaWc(@NotNull Random nextULong, long from, long until) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        m1484checkULongRangeBoundseb3DHEI(from, until);
        long signedFrom = from ^ Long.MIN_VALUE;
        long signedUntil = until ^ Long.MIN_VALUE;
        long signedResult = nextULong.nextLong(signedFrom, signedUntil) ^ Long.MIN_VALUE;
        return ULong.m406constructorimpl(signedResult);
    }

    @SinceKotlin(version = "1.5")
    public static final long nextULong(@NotNull Random $this$nextULong, @NotNull ULongRange range) {
        Intrinsics.checkNotNullParameter($this$nextULong, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        if (Long.compareUnsigned(range.m1504getLastsVKNKU(), -1L) < 0) {
            return m1479nextULongjmpaWc($this$nextULong, range.m1503getFirstsVKNKU(), ULong.m406constructorimpl(range.m1504getLastsVKNKU() + ULong.m406constructorimpl(((long) 1) & 4294967295L)));
        }
        if (Long.compareUnsigned(range.m1503getFirstsVKNKU(), 0L) > 0) {
            return ULong.m406constructorimpl(m1479nextULongjmpaWc($this$nextULong, ULong.m406constructorimpl(range.m1503getFirstsVKNKU() - ULong.m406constructorimpl(((long) 1) & 4294967295L)), range.m1504getLastsVKNKU()) + ULong.m406constructorimpl(((long) 1) & 4294967295L));
        }
        return nextULong($this$nextULong);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: nextUBytes-EVgfTAA, reason: not valid java name */
    public static final byte[] m1480nextUBytesEVgfTAA(@NotNull Random nextUBytes, @NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array);
        return array;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] nextUBytes(@NotNull Random $this$nextUBytes, int size) {
        Intrinsics.checkNotNullParameter($this$nextUBytes, "<this>");
        return UByteArray.m264constructorimpl($this$nextUBytes.nextBytes(size));
    }

    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4$default, reason: not valid java name */
    public static /* synthetic */ byte[] m1482nextUBytesWvrt4B4$default(Random random, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UByteArray.m254getSizeimpl(bArr);
        }
        return m1481nextUBytesWvrt4B4(random, bArr, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4, reason: not valid java name */
    public static final byte[] m1481nextUBytesWvrt4B4(@NotNull Random nextUBytes, @NotNull byte[] array, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array, fromIndex, toIndex);
        return array;
    }

    /* JADX INFO: renamed from: checkUIntRangeBounds-J1ME1BU, reason: not valid java name */
    public static final void m1483checkUIntRangeBoundsJ1ME1BU(int from, int until) {
        if (!(Integer.compareUnsigned(until, from) > 0)) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(UInt.m327boximpl(from), UInt.m327boximpl(until)).toString());
        }
    }

    /* JADX INFO: renamed from: checkULongRangeBounds-eb3DHEI, reason: not valid java name */
    public static final void m1484checkULongRangeBoundseb3DHEI(long from, long until) {
        if (!(Long.compareUnsigned(until, from) > 0)) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(ULong.m407boximpl(from), ULong.m407boximpl(until)).toString());
        }
    }
}
