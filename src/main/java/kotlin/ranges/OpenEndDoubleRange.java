package kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/OpenEndDoubleRange.class */
final class OpenEndDoubleRange implements OpenEndRange<Double> {
    private final double _start;
    private final double _endExclusive;

    public OpenEndDoubleRange(double start, double endExclusive) {
        this._start = start;
        this._endExclusive = endExclusive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable value) {
        return contains(((Number) value).doubleValue());
    }

    @Override // kotlin.ranges.OpenEndRange
    @NotNull
    public Double getStart() {
        return Double.valueOf(this._start);
    }

    @Override // kotlin.ranges.OpenEndRange
    @NotNull
    public Double getEndExclusive() {
        return Double.valueOf(this._endExclusive);
    }

    private final boolean lessThanOrEquals(double a, double b) {
        return a <= b;
    }

    public boolean contains(double value) {
        return value >= this._start && value < this._endExclusive;
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return this._start >= this._endExclusive;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof OpenEndDoubleRange) {
            if (!isEmpty() || !((OpenEndDoubleRange) other).isEmpty()) {
                if (this._start == ((OpenEndDoubleRange) other)._start) {
                    if (this._endExclusive == ((OpenEndDoubleRange) other)._endExclusive) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (31 * Double.hashCode(this._start)) + Double.hashCode(this._endExclusive);
    }

    @NotNull
    public String toString() {
        return this._start + "..<" + this._endExclusive;
    }
}
