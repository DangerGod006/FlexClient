package kotlin.ranges;

import java.lang.Comparable;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/OpenEndRange.class */
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
public interface OpenEndRange<T extends Comparable<? super T>> {
    @NotNull
    T getStart();

    @NotNull
    T getEndExclusive();

    boolean contains(@NotNull T t);

    boolean isEmpty();

    /* JADX INFO: compiled from: Range.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/OpenEndRange$DefaultImpls.class */
    public static final class DefaultImpls {
        public static <T extends Comparable<? super T>> boolean contains(@NotNull OpenEndRange<T> $this, @NotNull T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.compareTo($this.getStart()) >= 0 && value.compareTo($this.getEndExclusive()) < 0;
        }

        public static <T extends Comparable<? super T>> boolean isEmpty(@NotNull OpenEndRange<T> $this) {
            return $this.getStart().compareTo($this.getEndExclusive()) >= 0;
        }
    }
}
