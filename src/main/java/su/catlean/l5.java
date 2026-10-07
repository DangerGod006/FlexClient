package su.catlean;

import java.lang.invoke.MethodHandles;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/l5.class */
final class l5 {
    private float h;
    private float b;
    private static final long a = yz.a(2360773594629889511L, 2992802427112181265L, MethodHandles.lookup().lookupClass()).a(86650162089207L);

    public l5(float value, float velocity) {
        this.h = value;
        this.b = velocity;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l5(float f, float f2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
        long j2 = a ^ j;
    }

    public final float P() {
        return this.h;
    }

    public final void j(float f) {
        this.h = f;
    }

    public final float B() {
        return this.b;
    }

    public final void m(float f) {
        this.b = f;
    }

    public final float G(long j) {
        long j2 = a ^ j;
        this.b = mf.D(j2 ^ 127353899713418L, -0.1f, 0.1f, false, 4, null);
        this.h += this.b;
        this.h = tp.nc.L(this.h, RangesKt.rangeTo(-1.0f, 1.0f), (int) (j2 >>> 32), ((j2 ^ 104695479796942L) << 32) >>> 32);
        return this.h;
    }

    public l5(long j) {
        this(0.0f, 0.0f, (a ^ j) ^ 43998291916538L, 3, null);
    }
}
