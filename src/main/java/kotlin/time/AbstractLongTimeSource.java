package kotlin.time;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.math.MathKt;
import kotlin.time.ComparableTimeMark;
import kotlin.time.TimeSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/AbstractLongTimeSource.class */
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {

    @NotNull
    private final DurationUnit unit;

    @NotNull
    private final Lazy zero$delegate;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract long read();

    public AbstractLongTimeSource(@NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
        this.zero$delegate = LazyKt.lazy(() -> {
            return zero_delegate$lambda$0(r1);
        });
    }

    @NotNull
    protected final DurationUnit getUnit() {
        return this.unit;
    }

    private final long getZero() {
        return ((Number) this.zero$delegate.getValue()).longValue();
    }

    private static final long zero_delegate$lambda$0(AbstractLongTimeSource this$0) {
        return this$0.read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long adjustedRead() {
        return read() - getZero();
    }

    /* JADX INFO: compiled from: TimeSources.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/AbstractLongTimeSource$LongTimeMark.class */
    private static final class LongTimeMark implements ComparableTimeMark {
        private final long startedAt;

        @NotNull
        private final AbstractLongTimeSource timeSource;
        private final long offset;

        public /* synthetic */ LongTimeMark(long startedAt, AbstractLongTimeSource timeSource, long offset, DefaultConstructorMarker $constructor_marker) {
            this(startedAt, timeSource, offset);
        }

        private LongTimeMark(long startedAt, AbstractLongTimeSource timeSource, long offset) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.startedAt = startedAt;
            this.timeSource = timeSource;
            this.offset = offset;
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        /* JADX INFO: renamed from: minus-LRDsOJo */
        public ComparableTimeMark mo1621minusLRDsOJo(long duration) {
            return ComparableTimeMark.DefaultImpls.m1626minusLRDsOJo(this, duration);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.Comparable
        public int compareTo(@NotNull ComparableTimeMark other) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, other);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasNotPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
        public long mo1618elapsedNowUwyO8pc() {
            return Duration.m1635minusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.timeSource.adjustedRead(), this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        /* JADX INFO: renamed from: plus-LRDsOJo */
        public ComparableTimeMark mo1619plusLRDsOJo(long duration) {
            DurationUnit unit = this.timeSource.getUnit();
            if (Duration.m1644isInfiniteimpl(duration)) {
                return new LongTimeMark(LongSaturatedMathKt.m1741saturatingAddNuflL3o(this.startedAt, unit, duration), this.timeSource, Duration.Companion.m1679getZEROUwyO8pc(), null);
            }
            long durationInUnit = Duration.m1641truncateToUwyO8pc$kotlin_stdlib(duration, unit);
            long rest = Duration.m1633plusLRDsOJo(Duration.m1635minusLRDsOJo(duration, durationInUnit), this.offset);
            long sum = LongSaturatedMathKt.m1741saturatingAddNuflL3o(this.startedAt, unit, durationInUnit);
            long restInUnit = Duration.m1641truncateToUwyO8pc$kotlin_stdlib(rest, unit);
            long sum2 = LongSaturatedMathKt.m1741saturatingAddNuflL3o(sum, unit, restInUnit);
            long restUnderUnit = Duration.m1635minusLRDsOJo(rest, restInUnit);
            long restUnderUnitNs = Duration.m1666getInWholeNanosecondsimpl(restUnderUnit);
            if (sum2 != 0 && restUnderUnitNs != 0 && (sum2 ^ restUnderUnitNs) < 0) {
                long correction = DurationKt.toDuration(MathKt.getSign(restUnderUnitNs), unit);
                sum2 = LongSaturatedMathKt.m1741saturatingAddNuflL3o(sum2, unit, correction);
                restUnderUnit = Duration.m1635minusLRDsOJo(restUnderUnit, correction);
            }
            long newValue = sum2;
            long newOffset = (((newValue - 1) | 1) > LongCompanionObject.MAX_VALUE ? 1 : (((newValue - 1) | 1) == LongCompanionObject.MAX_VALUE ? 0 : -1)) == 0 ? Duration.Companion.m1679getZEROUwyO8pc() : restUnderUnit;
            return new LongTimeMark(newValue, this.timeSource, newOffset, null);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* JADX INFO: renamed from: minus-UwyO8pc */
        public long mo1620minusUwyO8pc(@NotNull ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!(other instanceof LongTimeMark) || !Intrinsics.areEqual(this.timeSource, ((LongTimeMark) other).timeSource)) {
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
            }
            long startedAtDiff = LongSaturatedMathKt.saturatingOriginsDiff(this.startedAt, ((LongTimeMark) other).startedAt, this.timeSource.getUnit());
            return Duration.m1633plusLRDsOJo(startedAtDiff, Duration.m1635minusLRDsOJo(this.offset, ((LongTimeMark) other).offset));
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(@Nullable Object other) {
            return (other instanceof LongTimeMark) && Intrinsics.areEqual(this.timeSource, ((LongTimeMark) other).timeSource) && Duration.m1677equalsimpl0(mo1620minusUwyO8pc((ComparableTimeMark) other), Duration.Companion.m1679getZEROUwyO8pc());
        }

        @Override // kotlin.time.ComparableTimeMark
        public int hashCode() {
            return (Duration.m1672hashCodeimpl(this.offset) * 37) + Long.hashCode(this.startedAt);
        }

        @NotNull
        public String toString() {
            return "LongTimeMark(" + this.startedAt + DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + ((Object) Duration.m1667toStringimpl(this.offset)) + ", " + this.timeSource + ')';
        }
    }

    @Override // kotlin.time.TimeSource
    @NotNull
    public ComparableTimeMark markNow() {
        return new LongTimeMark(adjustedRead(), this, Duration.Companion.m1679getZEROUwyO8pc(), null);
    }
}
