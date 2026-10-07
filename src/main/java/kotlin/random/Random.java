package kotlin.random;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/random/Random.class */
@SinceKotlin(version = "1.3")
public abstract class Random {

    @NotNull
    public static final Default Default = new Default(null);

    @NotNull
    private static final Random defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();

    public abstract int nextBits(int i);

    public int nextInt() {
        return nextBits(32);
    }

    public int nextInt(int until) {
        return nextInt(0, until);
    }

    public int nextInt(int from, int until) {
        int bits;
        int v;
        int rnd;
        int rnd2;
        RandomKt.checkRangeBounds(from, until);
        int n = until - from;
        if (n > 0 || n == Integer.MIN_VALUE) {
            if ((n & (-n)) == n) {
                int bitCount = RandomKt.fastLog2(n);
                rnd = nextBits(bitCount);
            } else {
                do {
                    bits = nextInt() >>> 1;
                    v = bits % n;
                } while ((bits - v) + (n - 1) < 0);
                rnd = v;
            }
            return from + rnd;
        }
        do {
            rnd2 = nextInt();
        } while (!(from <= rnd2 ? rnd2 < until : false));
        return rnd2;
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    public long nextLong(long until) {
        return nextLong(0L, until);
    }

    public long nextLong(long from, long until) {
        long rnd;
        long bits;
        long v;
        long rnd2;
        long jNextBits;
        RandomKt.checkRangeBounds(from, until);
        long n = until - from;
        if (n <= 0) {
            do {
                rnd = nextLong();
            } while (!(from <= rnd ? rnd < until : false));
            return rnd;
        }
        if ((n & (-n)) == n) {
            int nLow = (int) n;
            int nHigh = (int) (n >>> 32);
            if (nLow != 0) {
                int bitCount = RandomKt.fastLog2(nLow);
                jNextBits = ((long) nextBits(bitCount)) & 4294967295L;
            } else if (nHigh == 1) {
                jNextBits = ((long) nextInt()) & 4294967295L;
            } else {
                int bitCount2 = RandomKt.fastLog2(nHigh);
                jNextBits = (((long) nextBits(bitCount2)) << 32) + (((long) nextInt()) & 4294967295L);
            }
            rnd2 = jNextBits;
        } else {
            do {
                bits = nextLong() >>> 1;
                v = bits % n;
            } while ((bits - v) + (n - 1) < 0);
            rnd2 = v;
        }
        return from + rnd2;
    }

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    public double nextDouble() {
        return PlatformRandomKt.doubleFromParts(nextBits(26), nextBits(27));
    }

    public double nextDouble(double until) {
        return nextDouble(0.0d, until);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double nextDouble(double r10, double r12) {
        /*
            r9 = this;
            r0 = r10
            r1 = r12
            kotlin.random.RandomKt.checkRangeBounds(r0, r1)
            r0 = r12
            r1 = r10
            double r0 = r0 - r1
            r14 = r0
            r0 = r14
            boolean r0 = java.lang.Double.isInfinite(r0)
            if (r0 == 0) goto L52
            r0 = r10
            double r0 = java.lang.Math.abs(r0)
            r1 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 == 0) goto L52
            r0 = r12
            double r0 = java.lang.Math.abs(r0)
            r1 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            if (r0 == 0) goto L52
            r0 = r9
            double r0 = r0.nextDouble()
            r1 = r12
            r2 = 2
            double r2 = (double) r2
            double r1 = r1 / r2
            r2 = r10
            r3 = 2
            double r3 = (double) r3
            double r2 = r2 / r3
            double r1 = r1 - r2
            double r0 = r0 * r1
            r18 = r0
            r0 = r10
            r1 = r18
            double r0 = r0 + r1
            r1 = r18
            double r0 = r0 + r1
            goto L5b
        L52:
            r0 = r10
            r1 = r9
            double r1 = r1.nextDouble()
            r2 = r14
            double r1 = r1 * r2
            double r0 = r0 + r1
        L5b:
            r16 = r0
            r0 = r16
            r1 = r12
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L6e
            r0 = r12
            r1 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r0 = java.lang.Math.nextAfter(r0, r1)
            goto L70
        L6e:
            r0 = r16
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.nextDouble(double, double):double");
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return random.nextBytes(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] nextBytes(@org.jetbrains.annotations.NotNull byte[] r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.nextBytes(byte[], int, int):byte[]");
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return nextBytes(array, 0, array.length);
    }

    @NotNull
    public byte[] nextBytes(int size) {
        return nextBytes(new byte[size]);
    }

    /* JADX INFO: compiled from: Random.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/random/Random$Default.class */
    public static final class Default extends Random implements Serializable {
        public /* synthetic */ Default(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Default() {
        }

        /* JADX INFO: compiled from: Random.kt */
        /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/random/Random$Default$Serialized.class */
        private static final class Serialized implements Serializable {

            @NotNull
            public static final Serialized INSTANCE = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.Default;
            }
        }

        private final Object writeReplace() {
            return Serialized.INSTANCE;
        }

        private final void readObject(ObjectInputStream input) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        @Override // kotlin.random.Random
        public int nextBits(int bitCount) {
            return Random.defaultRandom.nextBits(bitCount);
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return Random.defaultRandom.nextInt();
        }

        @Override // kotlin.random.Random
        public int nextInt(int until) {
            return Random.defaultRandom.nextInt(until);
        }

        @Override // kotlin.random.Random
        public int nextInt(int from, int until) {
            return Random.defaultRandom.nextInt(from, until);
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return Random.defaultRandom.nextLong();
        }

        @Override // kotlin.random.Random
        public long nextLong(long until) {
            return Random.defaultRandom.nextLong(until);
        }

        @Override // kotlin.random.Random
        public long nextLong(long from, long until) {
            return Random.defaultRandom.nextLong(from, until);
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
            return Random.defaultRandom.nextBoolean();
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
            return Random.defaultRandom.nextDouble();
        }

        @Override // kotlin.random.Random
        public double nextDouble(double until) {
            return Random.defaultRandom.nextDouble(until);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double from, double until) {
            return Random.defaultRandom.nextDouble(from, until);
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
            return Random.defaultRandom.nextFloat();
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(@NotNull byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return Random.defaultRandom.nextBytes(array);
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(int size) {
            return Random.defaultRandom.nextBytes(size);
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(@NotNull byte[] array, int fromIndex, int toIndex) {
            Intrinsics.checkNotNullParameter(array, "array");
            return Random.defaultRandom.nextBytes(array, fromIndex, toIndex);
        }
    }
}
