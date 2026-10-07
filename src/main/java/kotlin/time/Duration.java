package kotlin.time;

import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.comparisons.ComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/Duration.class */
@SinceKotlin(version = "1.6")
@JvmInline
public final class Duration implements Comparable<Duration> {
    private final long rawValue;

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m1674constructorimpl(0);
    private static final long INFINITE = DurationKt.durationOfMillis(DurationKt.MAX_MILLIS);
    private static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1672hashCodeimpl(long arg0) {
        return Long.hashCode(arg0);
    }

    public int hashCode() {
        return m1672hashCodeimpl(this.rawValue);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1673equalsimpl(long arg0, Object other) {
        return (other instanceof Duration) && arg0 == ((Duration) other).m1676unboximpl();
    }

    public boolean equals(Object other) {
        return m1673equalsimpl(this.rawValue, other);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m1675boximpl(long v) {
        return new Duration(v);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1676unboximpl() {
        return this.rawValue;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1677equalsimpl0(long p1, long p2) {
        return p1 == p2;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration other) {
        return m1648compareToLRDsOJo(other.m1676unboximpl());
    }

    private /* synthetic */ Duration(long rawValue) {
        this.rawValue = rawValue;
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    private static final long m1627getValueimpl(long arg0) {
        return arg0 >> 1;
    }

    /* JADX INFO: renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m1628getUnitDiscriminatorimpl(long arg0) {
        return ((int) arg0) & 1;
    }

    /* JADX INFO: renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m1629isInNanosimpl(long arg0) {
        return (((int) arg0) & 1) == 0;
    }

    /* JADX INFO: renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m1630isInMillisimpl(long arg0) {
        return (((int) arg0) & 1) == 1;
    }

    /* JADX INFO: renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m1631getStorageUnitimpl(long arg0) {
        return m1629isInNanosimpl(arg0) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1674constructorimpl(long rawValue) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m1629isInNanosimpl(rawValue)) {
                long jM1627getValueimpl = m1627getValueimpl(rawValue);
                boolean z = -4611686018426999999L <= jM1627getValueimpl && jM1627getValueimpl < 4611686018427000000L;
                if (!z) {
                    throw new AssertionError(m1627getValueimpl(rawValue) + " ns is out of nanoseconds range");
                }
            } else {
                long jM1627getValueimpl2 = m1627getValueimpl(rawValue);
                boolean z2 = -4611686018427387903L <= jM1627getValueimpl2 && jM1627getValueimpl2 < 4611686018427387904L;
                if (!z2) {
                    throw new AssertionError(m1627getValueimpl(rawValue) + " ms is out of milliseconds range");
                }
                long jM1627getValueimpl3 = m1627getValueimpl(rawValue);
                boolean z3 = -4611686018426L <= jM1627getValueimpl3 && jM1627getValueimpl3 < 4611686018427L;
                if (z3) {
                    throw new AssertionError(m1627getValueimpl(rawValue) + " ms is denormalized");
                }
            }
        }
        return rawValue;
    }

    /* JADX INFO: compiled from: Duration.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/Duration$Companion.class */
    public static final class Companion {
        @InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1683getNanosecondsUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1685getNanosecondsUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1687getNanosecondsUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1689getMicrosecondsUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1691getMicrosecondsUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1693getMicrosecondsUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1695getMillisecondsUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1697getMillisecondsUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1699getMillisecondsUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1701getSecondsUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1703getSecondsUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1705getSecondsUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1707getMinutesUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1709getMinutesUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1711getMinutesUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1713getHoursUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1715getHoursUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1717getHoursUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1719getDaysUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1721getDaysUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1723getDaysUwyO8pc$annotations(double d) {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m1679getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* JADX INFO: renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m1680getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* JADX INFO: renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m1681getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        @ExperimentalTime
        public final double convert(double value, @NotNull DurationUnit sourceUnit, @NotNull DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1682getNanosecondsUwyO8pc(int $this$nanoseconds) {
            return DurationKt.toDuration($this$nanoseconds, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1684getNanosecondsUwyO8pc(long $this$nanoseconds) {
            return DurationKt.toDuration($this$nanoseconds, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1686getNanosecondsUwyO8pc(double $this$nanoseconds) {
            return DurationKt.toDuration($this$nanoseconds, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1688getMicrosecondsUwyO8pc(int $this$microseconds) {
            return DurationKt.toDuration($this$microseconds, DurationUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1690getMicrosecondsUwyO8pc(long $this$microseconds) {
            return DurationKt.toDuration($this$microseconds, DurationUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1692getMicrosecondsUwyO8pc(double $this$microseconds) {
            return DurationKt.toDuration($this$microseconds, DurationUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1694getMillisecondsUwyO8pc(int $this$milliseconds) {
            return DurationKt.toDuration($this$milliseconds, DurationUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1696getMillisecondsUwyO8pc(long $this$milliseconds) {
            return DurationKt.toDuration($this$milliseconds, DurationUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1698getMillisecondsUwyO8pc(double $this$milliseconds) {
            return DurationKt.toDuration($this$milliseconds, DurationUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1700getSecondsUwyO8pc(int $this$seconds) {
            return DurationKt.toDuration($this$seconds, DurationUnit.SECONDS);
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1702getSecondsUwyO8pc(long $this$seconds) {
            return DurationKt.toDuration($this$seconds, DurationUnit.SECONDS);
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1704getSecondsUwyO8pc(double $this$seconds) {
            return DurationKt.toDuration($this$seconds, DurationUnit.SECONDS);
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1706getMinutesUwyO8pc(int $this$minutes) {
            return DurationKt.toDuration($this$minutes, DurationUnit.MINUTES);
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1708getMinutesUwyO8pc(long $this$minutes) {
            return DurationKt.toDuration($this$minutes, DurationUnit.MINUTES);
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1710getMinutesUwyO8pc(double $this$minutes) {
            return DurationKt.toDuration($this$minutes, DurationUnit.MINUTES);
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1712getHoursUwyO8pc(int $this$hours) {
            return DurationKt.toDuration($this$hours, DurationUnit.HOURS);
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1714getHoursUwyO8pc(long $this$hours) {
            return DurationKt.toDuration($this$hours, DurationUnit.HOURS);
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1716getHoursUwyO8pc(double $this$hours) {
            return DurationKt.toDuration($this$hours, DurationUnit.HOURS);
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1718getDaysUwyO8pc(int $this$days) {
            return DurationKt.toDuration($this$days, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1720getDaysUwyO8pc(long $this$days) {
            return DurationKt.toDuration($this$days, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1722getDaysUwyO8pc(double $this$days) {
            return DurationKt.toDuration($this$days, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m1724parseUwyO8pc(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.parseDuration(value, false);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e);
            }
        }

        /* JADX INFO: renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m1725parseIsoStringUwyO8pc(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.parseDuration(value, true);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m1726parseOrNullFghU774(@NotNull String value) {
            Duration durationM1675boximpl;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                durationM1675boximpl = Duration.m1675boximpl(DurationKt.parseDuration(value, false));
            } catch (IllegalArgumentException e) {
                durationM1675boximpl = null;
            }
            return durationM1675boximpl;
        }

        @Nullable
        /* JADX INFO: renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m1727parseIsoStringOrNullFghU774(@NotNull String value) {
            Duration durationM1675boximpl;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                durationM1675boximpl = Duration.m1675boximpl(DurationKt.parseDuration(value, true));
            } catch (IllegalArgumentException e) {
                durationM1675boximpl = null;
            }
            return durationM1675boximpl;
        }
    }

    /* JADX INFO: renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m1632unaryMinusUwyO8pc(long arg0) {
        return DurationKt.durationOf(-m1627getValueimpl(arg0), ((int) arg0) & 1);
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m1633plusLRDsOJo(long arg0, long other) {
        if (m1644isInfiniteimpl(arg0)) {
            if (m1645isFiniteimpl(other) || (arg0 ^ other) >= 0) {
                return arg0;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m1644isInfiniteimpl(other)) {
            return other;
        }
        if ((((int) arg0) & 1) == (((int) other) & 1)) {
            long result = m1627getValueimpl(arg0) + m1627getValueimpl(other);
            return m1629isInNanosimpl(arg0) ? DurationKt.durationOfNanosNormalized(result) : DurationKt.durationOfMillisNormalized(result);
        }
        if (m1630isInMillisimpl(arg0)) {
            return m1634addValuesMixedRangesUwyO8pc(arg0, m1627getValueimpl(arg0), m1627getValueimpl(other));
        }
        return m1634addValuesMixedRangesUwyO8pc(arg0, m1627getValueimpl(other), m1627getValueimpl(arg0));
    }

    /* JADX INFO: renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m1634addValuesMixedRangesUwyO8pc(long arg0, long thisMillis, long otherNanos) {
        long otherMillis = DurationKt.nanosToMillis(otherNanos);
        long resultMillis = thisMillis + otherMillis;
        boolean z = -4611686018426L <= resultMillis && resultMillis < 4611686018427L;
        if (!z) {
            return DurationKt.durationOfMillis(RangesKt.coerceIn(resultMillis, -4611686018427387903L, DurationKt.MAX_MILLIS));
        }
        long otherNanoRemainder = otherNanos - DurationKt.millisToNanos(otherMillis);
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(resultMillis) + otherNanoRemainder);
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m1635minusLRDsOJo(long arg0, long other) {
        return m1633plusLRDsOJo(arg0, m1632unaryMinusUwyO8pc(other));
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1636timesUwyO8pc(long arg0, int scale) {
        if (m1644isInfiniteimpl(arg0)) {
            if (scale == 0) {
                throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
            }
            return scale > 0 ? arg0 : m1632unaryMinusUwyO8pc(arg0);
        }
        if (scale == 0) {
            return ZERO;
        }
        long value = m1627getValueimpl(arg0);
        long result = value * ((long) scale);
        if (!m1629isInNanosimpl(arg0)) {
            if (result / ((long) scale) == value) {
                return DurationKt.durationOfMillis(RangesKt.coerceIn(result, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
            }
            return MathKt.getSign(value) * MathKt.getSign(scale) > 0 ? INFINITE : NEG_INFINITE;
        }
        boolean z = -2147483647L <= value && value < 2147483648L;
        if (z) {
            return DurationKt.durationOfNanos(result);
        }
        if (result / ((long) scale) == value) {
            return DurationKt.durationOfNanosNormalized(result);
        }
        long millis = DurationKt.nanosToMillis(value);
        long remNanos = value - DurationKt.millisToNanos(millis);
        long resultMillis = millis * ((long) scale);
        long totalMillis = resultMillis + DurationKt.nanosToMillis(remNanos * ((long) scale));
        if (resultMillis / ((long) scale) != millis || (totalMillis ^ resultMillis) < 0) {
            return MathKt.getSign(value) * MathKt.getSign(scale) > 0 ? INFINITE : NEG_INFINITE;
        }
        return DurationKt.durationOfMillis(RangesKt.coerceIn(totalMillis, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1637timesUwyO8pc(long arg0, double scale) {
        int intScale = MathKt.roundToInt(scale);
        if (((double) intScale) == scale) {
            return m1636timesUwyO8pc(arg0, intScale);
        }
        DurationUnit unit = m1631getStorageUnitimpl(arg0);
        double result = m1657toDoubleimpl(arg0, unit) * scale;
        return DurationKt.toDuration(result, unit);
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1638divUwyO8pc(long arg0, int scale) {
        if (scale == 0) {
            if (m1643isPositiveimpl(arg0)) {
                return INFINITE;
            }
            if (m1642isNegativeimpl(arg0)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m1629isInNanosimpl(arg0)) {
            return DurationKt.durationOfNanos(m1627getValueimpl(arg0) / ((long) scale));
        }
        if (m1644isInfiniteimpl(arg0)) {
            return m1636timesUwyO8pc(arg0, MathKt.getSign(scale));
        }
        long result = m1627getValueimpl(arg0) / ((long) scale);
        boolean z = -4611686018426L <= result && result < 4611686018427L;
        if (z) {
            long rem = DurationKt.millisToNanos(m1627getValueimpl(arg0) - (result * ((long) scale))) / ((long) scale);
            return DurationKt.durationOfNanos(DurationKt.millisToNanos(result) + rem);
        }
        return DurationKt.durationOfMillis(result);
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1639divUwyO8pc(long arg0, double scale) {
        int intScale = MathKt.roundToInt(scale);
        if ((((double) intScale) == scale) && intScale != 0) {
            return m1638divUwyO8pc(arg0, intScale);
        }
        DurationUnit unit = m1631getStorageUnitimpl(arg0);
        double result = m1657toDoubleimpl(arg0, unit) / scale;
        return DurationKt.toDuration(result, unit);
    }

    /* JADX INFO: renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m1640divLRDsOJo(long arg0, long other) {
        DurationUnit coarserUnit = (DurationUnit) ComparisonsKt.maxOf(m1631getStorageUnitimpl(arg0), m1631getStorageUnitimpl(other));
        return m1657toDoubleimpl(arg0, coarserUnit) / m1657toDoubleimpl(other, coarserUnit);
    }

    /* JADX INFO: renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m1641truncateToUwyO8pc$kotlin_stdlib(long arg0, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit storageUnit = m1631getStorageUnitimpl(arg0);
        if (unit.compareTo(storageUnit) <= 0 || m1644isInfiniteimpl(arg0)) {
            return arg0;
        }
        long scale = DurationUnitKt.convertDurationUnit(1L, unit, storageUnit);
        long result = m1627getValueimpl(arg0) - (m1627getValueimpl(arg0) % scale);
        return DurationKt.toDuration(result, storageUnit);
    }

    /* JADX INFO: renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m1642isNegativeimpl(long arg0) {
        return arg0 < 0;
    }

    /* JADX INFO: renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m1643isPositiveimpl(long arg0) {
        return arg0 > 0;
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m1644isInfiniteimpl(long arg0) {
        return arg0 == INFINITE || arg0 == NEG_INFINITE;
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m1645isFiniteimpl(long arg0) {
        return !m1644isInfiniteimpl(arg0);
    }

    /* JADX INFO: renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m1646getAbsoluteValueUwyO8pc(long arg0) {
        return m1642isNegativeimpl(arg0) ? m1632unaryMinusUwyO8pc(arg0) : arg0;
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m1648compareToLRDsOJo(long other) {
        return m1647compareToLRDsOJo(this.rawValue, other);
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m1647compareToLRDsOJo(long arg0, long other) {
        long compareBits = arg0 ^ other;
        if (compareBits < 0 || (((int) compareBits) & 1) == 0) {
            return Intrinsics.compare(arg0, other);
        }
        int r = (((int) arg0) & 1) - (((int) other) & 1);
        return m1642isNegativeimpl(arg0) ? -r : r;
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1649toComponentsimpl(long arg0, @NotNull Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1660getInWholeDaysimpl(arg0)), Integer.valueOf(m1653getHoursComponentimpl(arg0)), Integer.valueOf(m1654getMinutesComponentimpl(arg0)), Integer.valueOf(m1655getSecondsComponentimpl(arg0)), Integer.valueOf(m1656getNanosecondsComponentimpl(arg0)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1650toComponentsimpl(long arg0, @NotNull Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1661getInWholeHoursimpl(arg0)), Integer.valueOf(m1654getMinutesComponentimpl(arg0)), Integer.valueOf(m1655getSecondsComponentimpl(arg0)), Integer.valueOf(m1656getNanosecondsComponentimpl(arg0)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1651toComponentsimpl(long arg0, @NotNull Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1662getInWholeMinutesimpl(arg0)), Integer.valueOf(m1655getSecondsComponentimpl(arg0)), Integer.valueOf(m1656getNanosecondsComponentimpl(arg0)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1652toComponentsimpl(long arg0, @NotNull Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1663getInWholeSecondsimpl(arg0)), Integer.valueOf(m1656getNanosecondsComponentimpl(arg0)));
    }

    /* JADX INFO: renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m1653getHoursComponentimpl(long arg0) {
        if (m1644isInfiniteimpl(arg0)) {
            return 0;
        }
        return (int) (m1661getInWholeHoursimpl(arg0) % ((long) 24));
    }

    /* JADX INFO: renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m1654getMinutesComponentimpl(long arg0) {
        if (m1644isInfiniteimpl(arg0)) {
            return 0;
        }
        return (int) (m1662getInWholeMinutesimpl(arg0) % ((long) 60));
    }

    /* JADX INFO: renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m1655getSecondsComponentimpl(long arg0) {
        if (m1644isInfiniteimpl(arg0)) {
            return 0;
        }
        return (int) (m1663getInWholeSecondsimpl(arg0) % ((long) 60));
    }

    /* JADX INFO: renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m1656getNanosecondsComponentimpl(long arg0) {
        if (m1644isInfiniteimpl(arg0)) {
            return 0;
        }
        if (m1630isInMillisimpl(arg0)) {
            return (int) DurationKt.millisToNanos(m1627getValueimpl(arg0) % ((long) 1000));
        }
        return (int) (m1627getValueimpl(arg0) % ((long) InstantKt.NANOS_PER_SECOND));
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m1657toDoubleimpl(long arg0, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (arg0 == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (arg0 == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt.convertDurationUnit(m1627getValueimpl(arg0), m1631getStorageUnitimpl(arg0), unit);
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m1658toLongimpl(long arg0, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (arg0 == INFINITE) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (arg0 == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt.convertDurationUnit(m1627getValueimpl(arg0), m1631getStorageUnitimpl(arg0), unit);
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m1659toIntimpl(long arg0, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) RangesKt.coerceIn(m1658toLongimpl(arg0, unit), -2147483648L, 2147483647L);
    }

    /* JADX INFO: renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m1660getInWholeDaysimpl(long arg0) {
        return m1658toLongimpl(arg0, DurationUnit.DAYS);
    }

    /* JADX INFO: renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m1661getInWholeHoursimpl(long arg0) {
        return m1658toLongimpl(arg0, DurationUnit.HOURS);
    }

    /* JADX INFO: renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m1662getInWholeMinutesimpl(long arg0) {
        return m1658toLongimpl(arg0, DurationUnit.MINUTES);
    }

    /* JADX INFO: renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m1663getInWholeSecondsimpl(long arg0) {
        return m1658toLongimpl(arg0, DurationUnit.SECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m1664getInWholeMillisecondsimpl(long arg0) {
        return (m1630isInMillisimpl(arg0) && m1645isFiniteimpl(arg0)) ? m1627getValueimpl(arg0) : m1658toLongimpl(arg0, DurationUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m1665getInWholeMicrosecondsimpl(long arg0) {
        return m1658toLongimpl(arg0, DurationUnit.MICROSECONDS);
    }

    /* JADX INFO: renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m1666getInWholeNanosecondsimpl(long arg0) {
        long value = m1627getValueimpl(arg0);
        if (m1629isInNanosimpl(arg0)) {
            return value;
        }
        if (value > 9223372036854L) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (value < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return DurationKt.millisToNanos(value);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1667toStringimpl(long arg0) {
        if (arg0 == 0) {
            return "0s";
        }
        if (arg0 == INFINITE) {
            return "Infinity";
        }
        if (arg0 == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean isNegative = m1642isNegativeimpl(arg0);
        StringBuilder $this$toString_impl_u24lambda_u241 = new StringBuilder();
        if (isNegative) {
            $this$toString_impl_u24lambda_u241.append('-');
        }
        long arg0$iv = m1646getAbsoluteValueUwyO8pc(arg0);
        long days = m1660getInWholeDaysimpl(arg0$iv);
        int hours = m1653getHoursComponentimpl(arg0$iv);
        int minutes = m1654getMinutesComponentimpl(arg0$iv);
        int seconds = m1655getSecondsComponentimpl(arg0$iv);
        int nanoseconds = m1656getNanosecondsComponentimpl(arg0$iv);
        boolean hasDays = days != 0;
        boolean hasHours = hours != 0;
        boolean hasMinutes = minutes != 0;
        boolean hasSeconds = (seconds == 0 && nanoseconds == 0) ? false : true;
        int components = 0;
        if (hasDays) {
            $this$toString_impl_u24lambda_u241.append(days).append('d');
            components = 0 + 1;
        }
        if (hasHours || (hasDays && (hasMinutes || hasSeconds))) {
            int i = components;
            components++;
            if (i > 0) {
                $this$toString_impl_u24lambda_u241.append(' ');
            }
            $this$toString_impl_u24lambda_u241.append(hours).append('h');
        }
        if (hasMinutes || (hasSeconds && (hasHours || hasDays))) {
            int i2 = components;
            components++;
            if (i2 > 0) {
                $this$toString_impl_u24lambda_u241.append(' ');
            }
            $this$toString_impl_u24lambda_u241.append(minutes).append('m');
        }
        if (hasSeconds) {
            int i3 = components;
            components++;
            if (i3 > 0) {
                $this$toString_impl_u24lambda_u241.append(' ');
            }
            if (seconds != 0 || hasDays || hasHours || hasMinutes) {
                m1668appendFractionalimpl(arg0, $this$toString_impl_u24lambda_u241, seconds, nanoseconds, 9, "s", false);
            } else if (nanoseconds >= 1000000) {
                m1668appendFractionalimpl(arg0, $this$toString_impl_u24lambda_u241, nanoseconds / DurationKt.NANOS_IN_MILLIS, nanoseconds % DurationKt.NANOS_IN_MILLIS, 6, "ms", false);
            } else if (nanoseconds >= 1000) {
                m1668appendFractionalimpl(arg0, $this$toString_impl_u24lambda_u241, nanoseconds / 1000, nanoseconds % 1000, 3, "us", false);
            } else {
                $this$toString_impl_u24lambda_u241.append(nanoseconds).append("ns");
            }
        }
        if (isNegative && components > 1) {
            $this$toString_impl_u24lambda_u241.insert(1, '(').append(')');
        }
        return $this$toString_impl_u24lambda_u241.toString();
    }

    @NotNull
    public String toString() {
        return m1667toStringimpl(this.rawValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX INFO: renamed from: appendFractional-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void m1668appendFractionalimpl(long r6, java.lang.StringBuilder r8, int r9, int r10, int r11, java.lang.String r12, boolean r13) {
        /*
            r0 = r8
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            if (r0 == 0) goto Lab
            r0 = r8
            r1 = 46
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1 = r11
            r2 = 48
            java.lang.String r0 = kotlin.text.StringsKt.padStart(r0, r1, r2)
            r14 = r0
            r0 = r14
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r16 = r0
            r0 = 0
            r17 = r0
            r0 = r16
            int r0 = r0.length()
            r1 = -1
            int r0 = r0 + r1
            r18 = r0
            r0 = 0
            r1 = r18
            if (r0 > r1) goto L6a
        L3b:
            r0 = r18
            r19 = r0
            int r18 = r18 + (-1)
            r0 = r16
            r1 = r19
            char r0 = r0.charAt(r1)
            r20 = r0
            r0 = 0
            r21 = r0
            r0 = r20
            r1 = 48
            if (r0 == r1) goto L5b
            r0 = 1
            goto L5c
        L5b:
            r0 = 0
        L5c:
            if (r0 == 0) goto L64
            r0 = r19
            goto L6b
        L64:
            r0 = 0
            r1 = r18
            if (r0 <= r1) goto L3b
        L6a:
            r0 = -1
        L6b:
            r1 = 1
            int r0 = r0 + r1
            r15 = r0
            r0 = r13
            if (r0 != 0) goto L91
            r0 = r15
            r1 = 3
            if (r0 >= r1) goto L91
            r0 = r8
            r1 = r14
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            r3 = r15
            java.lang.StringBuilder r0 = r0.append(r1, r2, r3)
            r1 = r0
            java.lang.String r2 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            goto Laa
        L91:
            r0 = r8
            r1 = r14
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            r3 = r15
            r4 = 2
            int r3 = r3 + r4
            r4 = 3
            int r3 = r3 / r4
            r4 = 3
            int r3 = r3 * r4
            java.lang.StringBuilder r0 = r0.append(r1, r2, r3)
            r1 = r0
            java.lang.String r2 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
        Laa:
        Lab:
            r0 = r8
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.Duration.m1668appendFractionalimpl(long, java.lang.StringBuilder, int, int, int, java.lang.String, boolean):void");
    }

    /* JADX INFO: renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m1670toStringimpl$default(long j, DurationUnit durationUnit, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m1669toStringimpl(j, durationUnit, i);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static final String m1669toStringimpl(long arg0, @NotNull DurationUnit unit, int decimals) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (!(decimals >= 0)) {
            throw new IllegalArgumentException(("decimals must be not negative, but was " + decimals).toString());
        }
        double number = m1657toDoubleimpl(arg0, unit);
        return Double.isInfinite(number) ? String.valueOf(number) : DurationJvmKt.formatToExactDecimals(number, RangesKt.coerceAtMost(decimals, 12)) + DurationUnitKt.shortName(unit);
    }

    @NotNull
    /* JADX INFO: renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m1671toIsoStringimpl(long arg0) {
        StringBuilder $this$toIsoString_impl_u24lambda_u245 = new StringBuilder();
        if (m1642isNegativeimpl(arg0)) {
            $this$toIsoString_impl_u24lambda_u245.append('-');
        }
        $this$toIsoString_impl_u24lambda_u245.append("PT");
        long arg0$iv = m1646getAbsoluteValueUwyO8pc(arg0);
        long hours = m1661getInWholeHoursimpl(arg0$iv);
        int minutes = m1654getMinutesComponentimpl(arg0$iv);
        int seconds = m1655getSecondsComponentimpl(arg0$iv);
        int nanoseconds = m1656getNanosecondsComponentimpl(arg0$iv);
        long hours2 = hours;
        if (m1644isInfiniteimpl(arg0)) {
            hours2 = 9999999999999L;
        }
        boolean hasHours = hours2 != 0;
        boolean hasSeconds = (seconds == 0 && nanoseconds == 0) ? false : true;
        boolean hasMinutes = minutes != 0 || (hasSeconds && hasHours);
        if (hasHours) {
            $this$toIsoString_impl_u24lambda_u245.append(hours2).append('H');
        }
        if (hasMinutes) {
            $this$toIsoString_impl_u24lambda_u245.append(minutes).append('M');
        }
        if (hasSeconds || (!hasHours && !hasMinutes)) {
            m1668appendFractionalimpl(arg0, $this$toIsoString_impl_u24lambda_u245, seconds, nanoseconds, 9, "S", true);
        }
        return $this$toIsoString_impl_u24lambda_u245.toString();
    }
}
