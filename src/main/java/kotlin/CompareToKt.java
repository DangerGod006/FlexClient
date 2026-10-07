package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: compareTo.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/CompareToKt.class */
public final class CompareToKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final <T> int compareTo(Comparable<? super T> $this$compareTo, T other) {
        Intrinsics.checkNotNullParameter($this$compareTo, "<this>");
        return $this$compareTo.compareTo(other);
    }
}
