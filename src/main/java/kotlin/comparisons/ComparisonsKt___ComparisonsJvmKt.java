package kotlin.comparisons;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _ComparisonsJvm.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/comparisons/ComparisonsKt___ComparisonsJvmKt.class */
public class ComparisonsKt___ComparisonsJvmKt extends ComparisonsKt__ComparisonsKt {
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T maxOf(@NotNull T a, @NotNull T b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return a.compareTo(b) >= 0 ? a : b;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte maxOf(byte a, byte b) {
        return (byte) Math.max((int) a, (int) b);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short maxOf(short a, short b) {
        return (short) Math.max((int) a, (int) b);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int maxOf(int a, int b) {
        return Math.max(a, b);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long maxOf(long a, long b) {
        return Math.max(a, b);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float maxOf(float a, float b) {
        return Math.max(a, b);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double maxOf(double a, double b) {
        return Math.max(a, b);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T maxOf(@NotNull T a, @NotNull T b, @NotNull T c) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(c, "c");
        return (T) ComparisonsKt.maxOf(a, ComparisonsKt.maxOf(b, c));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte maxOf(byte a, byte b, byte c) {
        return (byte) Math.max((int) a, Math.max((int) b, (int) c));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short maxOf(short a, short b, short c) {
        return (short) Math.max((int) a, Math.max((int) b, (int) c));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int maxOf(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long maxOf(long a, long b, long c) {
        return Math.max(a, Math.max(b, c));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float maxOf(float a, float b, float c) {
        return Math.max(a, Math.max(b, c));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double maxOf(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T extends Comparable<? super T>> T maxOf(@NotNull T a, @NotNull T... other) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        Comparable comparableMaxOf = a;
        for (T t : other) {
            comparableMaxOf = ComparisonsKt.maxOf(comparableMaxOf, t);
        }
        return (T) comparableMaxOf;
    }

    @SinceKotlin(version = "1.4")
    public static final byte maxOf(byte a, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        byte max = a;
        for (byte e : other) {
            max = (byte) Math.max((int) max, (int) e);
        }
        return max;
    }

    @SinceKotlin(version = "1.4")
    public static final short maxOf(short a, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        short max = a;
        for (short e : other) {
            max = (short) Math.max((int) max, (int) e);
        }
        return max;
    }

    @SinceKotlin(version = "1.4")
    public static final int maxOf(int a, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int max = a;
        for (int e : other) {
            max = Math.max(max, e);
        }
        return max;
    }

    @SinceKotlin(version = "1.4")
    public static final long maxOf(long a, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        long max = a;
        for (long e : other) {
            max = Math.max(max, e);
        }
        return max;
    }

    @SinceKotlin(version = "1.4")
    public static final float maxOf(float a, @NotNull float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        float max = a;
        for (float e : other) {
            max = Math.max(max, e);
        }
        return max;
    }

    @SinceKotlin(version = "1.4")
    public static final double maxOf(double a, @NotNull double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double max = a;
        for (double e : other) {
            max = Math.max(max, e);
        }
        return max;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T a, @NotNull T b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return a.compareTo(b) <= 0 ? a : b;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte minOf(byte a, byte b) {
        return (byte) Math.min((int) a, (int) b);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short minOf(short a, short b) {
        return (short) Math.min((int) a, (int) b);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int minOf(int a, int b) {
        return Math.min(a, b);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long minOf(long a, long b) {
        return Math.min(a, b);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float minOf(float a, float b) {
        return Math.min(a, b);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double minOf(double a, double b) {
        return Math.min(a, b);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T a, @NotNull T b, @NotNull T c) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(c, "c");
        return (T) ComparisonsKt.minOf(a, ComparisonsKt.minOf(b, c));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte minOf(byte a, byte b, byte c) {
        return (byte) Math.min((int) a, Math.min((int) b, (int) c));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short minOf(short a, short b, short c) {
        return (short) Math.min((int) a, Math.min((int) b, (int) c));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int minOf(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long minOf(long a, long b, long c) {
        return Math.min(a, Math.min(b, c));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float minOf(float a, float b, float c) {
        return Math.min(a, Math.min(b, c));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double minOf(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T a, @NotNull T... other) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        Comparable comparableMinOf = a;
        for (T t : other) {
            comparableMinOf = ComparisonsKt.minOf(comparableMinOf, t);
        }
        return (T) comparableMinOf;
    }

    @SinceKotlin(version = "1.4")
    public static final byte minOf(byte a, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        byte min = a;
        for (byte e : other) {
            min = (byte) Math.min((int) min, (int) e);
        }
        return min;
    }

    @SinceKotlin(version = "1.4")
    public static final short minOf(short a, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        short min = a;
        for (short e : other) {
            min = (short) Math.min((int) min, (int) e);
        }
        return min;
    }

    @SinceKotlin(version = "1.4")
    public static final int minOf(int a, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int min = a;
        for (int e : other) {
            min = Math.min(min, e);
        }
        return min;
    }

    @SinceKotlin(version = "1.4")
    public static final long minOf(long a, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        long min = a;
        for (long e : other) {
            min = Math.min(min, e);
        }
        return min;
    }

    @SinceKotlin(version = "1.4")
    public static final float minOf(float a, @NotNull float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        float min = a;
        for (float e : other) {
            min = Math.min(min, e);
        }
        return min;
    }

    @SinceKotlin(version = "1.4")
    public static final double minOf(double a, @NotNull double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double min = a;
        for (double e : other) {
            min = Math.min(min, e);
        }
        return min;
    }
}
