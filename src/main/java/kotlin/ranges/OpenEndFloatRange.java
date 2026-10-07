package kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/OpenEndFloatRange.class */
final class OpenEndFloatRange implements OpenEndRange<Float> {
    private final float _start;
    private final float _endExclusive;

    public OpenEndFloatRange(float start, float endExclusive) {
        this._start = start;
        this._endExclusive = endExclusive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable value) {
        return contains(((Number) value).floatValue());
    }

    @Override // kotlin.ranges.OpenEndRange
    @NotNull
    public Float getStart() {
        return Float.valueOf(this._start);
    }

    @Override // kotlin.ranges.OpenEndRange
    @NotNull
    public Float getEndExclusive() {
        return Float.valueOf(this._endExclusive);
    }

    private final boolean lessThanOrEquals(float a, float b) {
        return a <= b;
    }

    public boolean contains(float value) {
        return value >= this._start && value < this._endExclusive;
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return this._start >= this._endExclusive;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof OpenEndFloatRange) {
            if (!isEmpty() || !((OpenEndFloatRange) other).isEmpty()) {
                if (this._start == ((OpenEndFloatRange) other)._start) {
                    if (this._endExclusive == ((OpenEndFloatRange) other)._endExclusive) {
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
        return (31 * Float.hashCode(this._start)) + Float.hashCode(this._endExclusive);
    }

    @NotNull
    public String toString() {
        return this._start + "..<" + this._endExclusive;
    }
}
