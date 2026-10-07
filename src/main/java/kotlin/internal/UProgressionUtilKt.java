package kotlin.internal;

import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;

/* JADX INFO: compiled from: UProgressionUtil.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/internal/UProgressionUtilKt.class */
public final class UProgressionUtilKt {
    /* JADX INFO: renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m1424differenceModuloWZ9TVnA(int a, int b, int c) {
        int ac = Integer.remainderUnsigned(a, c);
        int bc = Integer.remainderUnsigned(b, c);
        return Integer.compareUnsigned(ac, bc) >= 0 ? UInt.m326constructorimpl(ac - bc) : UInt.m326constructorimpl(UInt.m326constructorimpl(ac - bc) + c);
    }

    /* JADX INFO: renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m1425differenceModulosambcqE(long a, long b, long c) {
        long ac = Long.remainderUnsigned(a, c);
        long bc = Long.remainderUnsigned(b, c);
        return Long.compareUnsigned(ac, bc) >= 0 ? ULong.m406constructorimpl(ac - bc) : ULong.m406constructorimpl(ULong.m406constructorimpl(ac - bc) + c);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m1426getProgressionLastElementNkh28Cs(int start, int end, int step) {
        if (step > 0) {
            return Integer.compareUnsigned(start, end) >= 0 ? end : UInt.m326constructorimpl(end - m1424differenceModuloWZ9TVnA(end, start, UInt.m326constructorimpl(step)));
        }
        if (step < 0) {
            return Integer.compareUnsigned(start, end) <= 0 ? end : UInt.m326constructorimpl(end + m1424differenceModuloWZ9TVnA(start, end, UInt.m326constructorimpl(-step)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m1427getProgressionLastElement7ftBX0g(long start, long end, long step) {
        if (step > 0) {
            return Long.compareUnsigned(start, end) >= 0 ? end : ULong.m406constructorimpl(end - m1425differenceModulosambcqE(end, start, ULong.m406constructorimpl(step)));
        }
        if (step < 0) {
            return Long.compareUnsigned(start, end) <= 0 ? end : ULong.m406constructorimpl(end + m1425differenceModulosambcqE(start, end, ULong.m406constructorimpl(-step)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
