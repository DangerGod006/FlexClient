package kotlin.internal;

import kotlin.PublishedApi;

/* JADX INFO: compiled from: progressionUtil.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/internal/ProgressionUtilKt.class */
public final class ProgressionUtilKt {
    private static final int mod(int a, int b) {
        int mod = a % b;
        return mod >= 0 ? mod : mod + b;
    }

    private static final long mod(long a, long b) {
        long mod = a % b;
        return mod >= 0 ? mod : mod + b;
    }

    private static final int differenceModulo(int a, int b, int c) {
        return mod(mod(a, c) - mod(b, c), c);
    }

    private static final long differenceModulo(long a, long b, long c) {
        return mod(mod(a, c) - mod(b, c), c);
    }

    @PublishedApi
    public static final int getProgressionLastElement(int start, int end, int step) {
        if (step > 0) {
            return start >= end ? end : end - differenceModulo(end, start, step);
        }
        if (step < 0) {
            return start <= end ? end : end + differenceModulo(start, end, -step);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @PublishedApi
    public static final long getProgressionLastElement(long start, long end, long step) {
        if (step > 0) {
            return start >= end ? end : end - differenceModulo(end, start, step);
        }
        if (step < 0) {
            return start <= end ? end : end + differenceModulo(start, end, -step);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
