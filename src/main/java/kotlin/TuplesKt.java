package kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/TuplesKt.class */
@JvmName(name = "TuplesKt")
public final class TuplesKt {
    @NotNull
    public static final <A, B> Pair<A, B> to(A $this$to, B that) {
        return new Pair<>($this$to, that);
    }

    @NotNull
    public static final <T> List<T> toList(@NotNull Pair<? extends T, ? extends T> $this$toList) {
        Intrinsics.checkNotNullParameter($this$toList, "<this>");
        return CollectionsKt.listOf($this$toList.getFirst(), $this$toList.getSecond());
    }

    @NotNull
    public static final <T> List<T> toList(@NotNull Triple<? extends T, ? extends T, ? extends T> $this$toList) {
        Intrinsics.checkNotNullParameter($this$toList, "<this>");
        return CollectionsKt.listOf($this$toList.getFirst(), $this$toList.getSecond(), $this$toList.getThird());
    }
}
