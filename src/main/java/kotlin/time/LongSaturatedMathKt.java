package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: longSaturatedMath.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/LongSaturatedMathKt.class */
public final class LongSaturatedMathKt {
    /* JADX INFO: renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m1741saturatingAddNuflL3o(long value, @NotNull DurationUnit unit, long duration) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long durationInUnit = Duration.m1658toLongimpl(duration, unit);
        if (((value - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return m1742checkInfiniteSumDefinedPjuGub4(value, duration, durationInUnit);
        }
        if (((durationInUnit - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return m1743saturatingAddInHalvesNuflL3o(value, unit, duration);
        }
        long result = value + durationInUnit;
        if (((value ^ result) & (durationInUnit ^ result)) >= 0) {
            return result;
        }
        if (value < 0) {
            return Long.MIN_VALUE;
        }
        return LongCompanionObject.MAX_VALUE;
    }

    /* JADX INFO: renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m1742checkInfiniteSumDefinedPjuGub4(long value, long duration, long durationInUnit) {
        if (!Duration.m1644isInfiniteimpl(duration) || (value ^ durationInUnit) >= 0) {
            return value;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    /* JADX INFO: renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m1743saturatingAddInHalvesNuflL3o(long value, DurationUnit unit, long duration) {
        long half = Duration.m1638divUwyO8pc(duration, 2);
        long halfInUnit = Duration.m1658toLongimpl(half, unit);
        if (((halfInUnit - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return halfInUnit;
        }
        return m1741saturatingAddNuflL3o(m1741saturatingAddNuflL3o(value, unit, half), unit, Duration.m1635minusLRDsOJo(duration, half));
    }

    private static final long infinityOfSign(long value) {
        return value < 0 ? Duration.Companion.m1681getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.Companion.m1680getINFINITEUwyO8pc();
    }

    public static final long saturatingDiff(long valueNs, long origin, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((origin - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return Duration.m1632unaryMinusUwyO8pc(infinityOfSign(origin));
        }
        return saturatingFiniteDiff(valueNs, origin, unit);
    }

    public static final long saturatingOriginsDiff(long origin1, long origin2, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((origin2 - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return origin1 == origin2 ? Duration.Companion.m1679getZEROUwyO8pc() : Duration.m1632unaryMinusUwyO8pc(infinityOfSign(origin2));
        }
        if (((origin1 - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return infinityOfSign(origin1);
        }
        return saturatingFiniteDiff(origin1, origin2, unit);
    }

    private static final long saturatingFiniteDiff(long value1, long value2, DurationUnit unit) {
        long result = value1 - value2;
        if (((result ^ value1) & ((result ^ value2) ^ (-1))) < 0) {
            if (unit.compareTo(DurationUnit.MILLISECONDS) < 0) {
                long unitsInMilli = DurationUnitKt.convertDurationUnit(1L, DurationUnit.MILLISECONDS, unit);
                long resultMs = (value1 / unitsInMilli) - (value2 / unitsInMilli);
                long resultUnit = (value1 % unitsInMilli) - (value2 % unitsInMilli);
                Duration.Companion companion = Duration.Companion;
                return Duration.m1633plusLRDsOJo(DurationKt.toDuration(resultMs, DurationUnit.MILLISECONDS), DurationKt.toDuration(resultUnit, unit));
            }
            return Duration.m1632unaryMinusUwyO8pc(infinityOfSign(result));
        }
        return DurationKt.toDuration(result, unit);
    }

    public static final boolean isSaturated(long $this$isSaturated) {
        return (($this$isSaturated - 1) | 1) == LongCompanionObject.MAX_VALUE;
    }
}
