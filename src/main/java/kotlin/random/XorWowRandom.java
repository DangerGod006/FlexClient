package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: XorWowRandom.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/random/XorWowRandom.class */
public final class XorWowRandom extends Random implements Serializable {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private int x;
    private int y;
    private int z;
    private int w;
    private int v;
    private int addend;
    private static final long serialVersionUID = 0;

    public XorWowRandom(int x, int y, int z, int w, int v, int addend) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.v = v;
        this.addend = addend;
        if (!(((((this.x | this.y) | this.z) | this.w) | this.v) != 0)) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i = 0; i < 64; i++) {
            nextInt();
        }
    }

    public XorWowRandom(int seed1, int seed2) {
        this(seed1, seed2, 0, 0, seed1 ^ (-1), (seed1 << 10) ^ (seed2 >>> 4));
    }

    @Override // kotlin.random.Random
    public int nextInt() {
        int t = this.x;
        int t2 = t ^ (t >>> 2);
        this.x = this.y;
        this.y = this.z;
        this.z = this.w;
        int v0 = this.v;
        this.w = v0;
        int t3 = ((t2 ^ (t2 << 1)) ^ v0) ^ (v0 << 4);
        this.v = t3;
        this.addend += 362437;
        return t3 + this.addend;
    }

    @Override // kotlin.random.Random
    public int nextBits(int bitCount) {
        return RandomKt.takeUpperBits(nextInt(), bitCount);
    }

    /* JADX INFO: compiled from: XorWowRandom.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/random/XorWowRandom$Companion.class */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }
}
