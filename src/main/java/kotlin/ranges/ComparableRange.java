package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/ComparableRange.class */
class ComparableRange<T extends Comparable<? super T>> implements ClosedRange<T> {

    @NotNull
    private final T start;

    @NotNull
    private final T endInclusive;

    public ComparableRange(@NotNull T start, @NotNull T endInclusive) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(endInclusive, "endInclusive");
        this.start = start;
        this.endInclusive = endInclusive;
    }

    @Override // kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public boolean contains(@NotNull T value) {
        return ClosedRange.DefaultImpls.contains(this, value);
    }

    @Override // kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return ClosedRange.DefaultImpls.isEmpty(this);
    }

    @Override // kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    @NotNull
    public T getStart() {
        return this.start;
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public T getEndInclusive() {
        return this.endInclusive;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof ComparableRange) && ((isEmpty() && ((ComparableRange) other).isEmpty()) || (Intrinsics.areEqual(getStart(), ((ComparableRange) other).getStart()) && Intrinsics.areEqual(getEndInclusive(), ((ComparableRange) other).getEndInclusive())));
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (31 * getStart().hashCode()) + getEndInclusive().hashCode();
    }

    @NotNull
    public String toString() {
        return getStart() + ".." + getEndInclusive();
    }
}
