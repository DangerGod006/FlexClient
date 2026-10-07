package su.catlean;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/bt.class */
final class bt {
    private int J;
    private static final long a = 0;
    private static final long b = 0;

    public bt(int age) {
        this.J = age;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bt(long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? (int) b : i);
        long j2 = a ^ j;
    }

    public final int M() {
        return this.J;
    }

    public final void j(int i) {
        this.J = i;
    }

    public bt(long j) {
        this((a ^ j) ^ 55663659173475L, 0, 1, null);
    }
}
