package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/ClosedRange.class */
public interface ClosedRange<T extends Comparable<? super T>> {
    @NotNull
    T getStart();

    @NotNull
    T getEndInclusive();

    boolean contains(@NotNull T t);

    boolean isEmpty();

    /* JADX INFO: compiled from: Range.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/ClosedRange$DefaultImpls.class */
    public static final class DefaultImpls {
        public static <T extends Comparable<? super T>> boolean contains(@NotNull ClosedRange<T> $this, @NotNull T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.compareTo($this.getStart()) >= 0 && value.compareTo($this.getEndInclusive()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean isEmpty(@NotNull ClosedRange<T> $this) {
            return $this.getStart().compareTo($this.getEndInclusive()) > 0;
        }
    }
}
