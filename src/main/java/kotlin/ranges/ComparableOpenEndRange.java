package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.OpenEndRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/ComparableOpenEndRange.class */
class ComparableOpenEndRange<T extends Comparable<? super T>> implements OpenEndRange<T> {

    @NotNull
    private final T start;

    @NotNull
    private final T endExclusive;

    public ComparableOpenEndRange(@NotNull T start, @NotNull T endExclusive) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(endExclusive, "endExclusive");
        this.start = start;
        this.endExclusive = endExclusive;
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean contains(@NotNull T value) {
        return OpenEndRange.DefaultImpls.contains(this, value);
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return OpenEndRange.DefaultImpls.isEmpty(this);
    }

    @Override // kotlin.ranges.OpenEndRange
    @NotNull
    public T getStart() {
        return this.start;
    }

    @Override // kotlin.ranges.OpenEndRange
    @NotNull
    public T getEndExclusive() {
        return this.endExclusive;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof ComparableOpenEndRange) && ((isEmpty() && ((ComparableOpenEndRange) other).isEmpty()) || (Intrinsics.areEqual(getStart(), ((ComparableOpenEndRange) other).getStart()) && Intrinsics.areEqual(getEndExclusive(), ((ComparableOpenEndRange) other).getEndExclusive())));
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (31 * getStart().hashCode()) + getEndExclusive().hashCode();
    }

    @NotNull
    public String toString() {
        return getStart() + "..<" + getEndExclusive();
    }
}
