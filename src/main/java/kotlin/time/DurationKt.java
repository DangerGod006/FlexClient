package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/DurationKt.class */
public final class DurationKt {
    public static final int NANOS_IN_MILLIS = 1000000;
    public static final long MAX_NANOS = 4611686018426999999L;
    public static final long MAX_MILLIS = 4611686018427387903L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;

    @SinceKotlin(version = "1.6")
    public static final long toDuration(int $this$toDuration, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (unit.compareTo(DurationUnit.SECONDS) <= 0) {
            return durationOfNanos(DurationUnitKt.convertDurationUnitOverflow($this$toDuration, unit, DurationUnit.NANOSECONDS));
        }
        return toDuration($this$toDuration, unit);
    }

    @SinceKotlin(version = "1.6")
    public static final long toDuration(long $this$toDuration, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long maxNsInUnit = DurationUnitKt.convertDurationUnitOverflow(MAX_NANOS, DurationUnit.NANOSECONDS, unit);
        boolean z = (-maxNsInUnit) <= $this$toDuration && $this$toDuration <= maxNsInUnit;
        if (z) {
            return durationOfNanos(DurationUnitKt.convertDurationUnitOverflow($this$toDuration, unit, DurationUnit.NANOSECONDS));
        }
        long millis = DurationUnitKt.convertDurationUnit($this$toDuration, unit, DurationUnit.MILLISECONDS);
        return durationOfMillis(RangesKt.coerceIn(millis, -4611686018427387903L, MAX_MILLIS));
    }

    @SinceKotlin(version = "1.6")
    public static final long toDuration(double $this$toDuration, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double valueInNs = DurationUnitKt.convertDurationUnit($this$toDuration, unit, DurationUnit.NANOSECONDS);
        if (!(!Double.isNaN(valueInNs))) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long nanos = MathKt.roundToLong(valueInNs);
        boolean z = -4611686018426999999L <= nanos && nanos < 4611686018427000000L;
        if (z) {
            return durationOfNanos(nanos);
        }
        long millis = MathKt.roundToLong(DurationUnitKt.convertDurationUnit($this$toDuration, unit, DurationUnit.MILLISECONDS));
        return durationOfMillisNormalized(millis);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* JADX INFO: renamed from: times-mvk6XK0, reason: not valid java name */
    private static final long m1729timesmvk6XK0(int $this$times_u2dmvk6XK0, long duration) {
        return Duration.m1636timesUwyO8pc(duration, $this$times_u2dmvk6XK0);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* JADX INFO: renamed from: times-kIfJnKk, reason: not valid java name */
    private static final long m1730timeskIfJnKk(double $this$times_u2dkIfJnKk, long duration) {
        return Duration.m1637timesUwyO8pc(duration, $this$times_u2dkIfJnKk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x015a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0477 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long parseDuration(java.lang.String r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 1277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.DurationKt.parseDuration(java.lang.String, boolean):long");
    }

    private static final long parseOverLongIsoComponent(String value) {
        int length = value.length();
        int startIndex = 0;
        if (length > 0 && StringsKt.contains$default((CharSequence) "+-", value.charAt(0), false, 2, (Object) null)) {
            startIndex = 0 + 1;
        }
        if (length - startIndex > 16) {
            int firstNonZero = startIndex;
            int index = startIndex;
            while (true) {
                if (index < length) {
                    char cCharAt = value.charAt(index);
                    if (cCharAt != '0') {
                        boolean z = '1' <= cCharAt && cCharAt < ':';
                        if (!z) {
                            break;
                        }
                    } else if (firstNonZero == index) {
                        firstNonZero++;
                    }
                    index++;
                } else if (length - firstNonZero > 16) {
                    if (value.charAt(0) == '-') {
                        return Long.MIN_VALUE;
                    }
                    return LongCompanionObject.MAX_VALUE;
                }
            }
        }
        if (StringsKt.startsWith$default(value, "+", false, 2, (Object) null) && length > 1) {
            char cCharAt2 = value.charAt(1);
            boolean z2 = '0' <= cCharAt2 && cCharAt2 < ':';
            if (z2) {
                return Long.parseLong(StringsKt.drop(value, 1));
            }
        }
        return Long.parseLong(value);
    }

    private static final String substringWhile(String $this$substringWhile, int startIndex, Function1<? super Character, Boolean> predicate) {
        int i$iv = startIndex;
        while (i$iv < $this$substringWhile.length() && predicate.invoke(Character.valueOf($this$substringWhile.charAt(i$iv))).booleanValue()) {
            i$iv++;
        }
        Intrinsics.checkNotNull($this$substringWhile, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = $this$substringWhile.substring(startIndex, i$iv);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final int skipWhile(String $this$skipWhile, int startIndex, Function1<? super Character, Boolean> predicate) {
        int i = startIndex;
        while (i < $this$skipWhile.length() && predicate.invoke(Character.valueOf($this$skipWhile.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long nanosToMillis(long nanos) {
        return nanos / ((long) NANOS_IN_MILLIS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long millisToNanos(long millis) {
        return millis * ((long) NANOS_IN_MILLIS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanos(long normalNanos) {
        return Duration.m1674constructorimpl(normalNanos << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillis(long normalMillis) {
        return Duration.m1674constructorimpl((normalMillis << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOf(long normalValue, int unitDiscriminator) {
        return Duration.m1674constructorimpl((normalValue << 1) + ((long) unitDiscriminator));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanosNormalized(long nanos) {
        boolean z = -4611686018426999999L <= nanos && nanos < 4611686018427000000L;
        if (z) {
            return durationOfNanos(nanos);
        }
        return durationOfMillis(nanosToMillis(nanos));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillisNormalized(long millis) {
        boolean z = -4611686018426L <= millis && millis < 4611686018427L;
        if (z) {
            return durationOfNanos(millisToNanos(millis));
        }
        return durationOfMillis(RangesKt.coerceIn(millis, -4611686018427387903L, MAX_MILLIS));
    }
}
