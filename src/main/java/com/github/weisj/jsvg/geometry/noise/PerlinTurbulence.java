package com.github.weisj.jsvg.geometry.noise;

import java.awt.geom.Rectangle2D;
import kotlin.io.ConstantsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/noise/PerlinTurbulence.class */
public final class PerlinTurbulence {
    private static final int RAND_m = Integer.MAX_VALUE;
    private static final int RAND_a = 16807;
    private static final int RAND_q = 127773;
    private static final int RAND_r = 2836;
    private static final int BSize = 256;
    private static final int BM = 255;
    private static final double PerlinN = 4096.0d;
    private final int[] uLatticeSelector = new int[257];
    private final double[] fGradient = new double[2056];
    private final int numOctaves;
    private final double xFrequency;
    private final double yFrequency;
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !PerlinTurbulence.class.desiredAssertionStatus();
    }

    public PerlinTurbulence(int seed, int numOctaves, double xFrequency, double yFrequency) {
        this.numOctaves = numOctaves;
        this.xFrequency = xFrequency;
        this.yFrequency = yFrequency;
        init(seed);
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/noise/PerlinTurbulence$StitchInfo.class */
    public static final class StitchInfo {
        private int width;
        private int height;
        private int wrapX;
        private int wrapY;

        static /* synthetic */ int access$128(StitchInfo x0, int x1) {
            int i = x0.width * x1;
            x0.width = i;
            return i;
        }

        static /* synthetic */ int access$028(StitchInfo x0, int x1) {
            int i = x0.wrapX * x1;
            x0.wrapX = i;
            return i;
        }

        static /* synthetic */ int access$012(StitchInfo x0, int x1) {
            int i = x0.wrapX + x1;
            x0.wrapX = i;
            return i;
        }

        static /* synthetic */ int access$328(StitchInfo x0, int x1) {
            int i = x0.height * x1;
            x0.height = i;
            return i;
        }

        static /* synthetic */ int access$228(StitchInfo x0, int x1) {
            int i = x0.wrapY * x1;
            x0.wrapY = i;
            return i;
        }

        static /* synthetic */ int access$212(StitchInfo x0, int x1) {
            int i = x0.wrapY + x1;
            x0.wrapY = i;
            return i;
        }
    }

    private static int setupSeed(int seed) {
        if (seed <= 0) {
            seed = (-(seed % 2147483646)) + 1;
        }
        if (seed > 2147483646) {
            seed = 2147483646;
        }
        return seed;
    }

    private static int random(int seed) {
        int result = (RAND_a * (seed % RAND_q)) - (RAND_r * (seed / RAND_q));
        if (result <= 0) {
            result += Integer.MAX_VALUE;
        }
        return result;
    }

    private void init(int seed) {
        double v;
        int lSeed = setupSeed(seed);
        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < BSize; i++) {
                do {
                    int lSeed2 = random(lSeed);
                    double u = ((double) (lSeed2 % ConstantsKt.MINIMUM_BLOCK_SIZE)) - 256.0d;
                    int iRandom = random(lSeed2);
                    lSeed = iRandom;
                    v = ((double) (iRandom % ConstantsKt.MINIMUM_BLOCK_SIZE)) - 256.0d;
                    if (u == 0.0d) {
                    }
                    double s = Math.sqrt((u * u) + (v * v));
                    double si = 1.0d / s;
                    this.fGradient[(i * 8) + (k * 2)] = u * si;
                    this.fGradient[(i * 8) + (k * 2) + 1] = v * si;
                } while (v == 0.0d);
                double s2 = Math.sqrt((u * u) + (v * v));
                double si2 = 1.0d / s2;
                this.fGradient[(i * 8) + (k * 2)] = u * si2;
                this.fGradient[(i * 8) + (k * 2) + 1] = v * si2;
            }
        }
        int i2 = 0;
        while (i2 < BSize) {
            this.uLatticeSelector[i2] = i2;
            i2++;
        }
        while (true) {
            i2--;
            if (i2 <= 0) {
                break;
            }
            int k2 = this.uLatticeSelector[i2];
            int iRandom2 = random(lSeed);
            lSeed = iRandom2;
            int j = iRandom2 % BSize;
            this.uLatticeSelector[i2] = this.uLatticeSelector[j];
            this.uLatticeSelector[j] = k2;
            int s1 = i2 << 3;
            int s22 = j << 3;
            for (int j2 = 0; j2 < 8; j2++) {
                double s3 = this.fGradient[s1 + j2];
                this.fGradient[s1 + j2] = this.fGradient[s22 + j2];
                this.fGradient[s22 + j2] = s3;
            }
        }
        this.uLatticeSelector[BSize] = this.uLatticeSelector[0];
        for (int j3 = 0; j3 < 8; j3++) {
            this.fGradient[2048 + j3] = this.fGradient[j3];
        }
    }

    private static double curve(double t) {
        return t * t * (3.0d - (2.0d * t));
    }

    private static double lerp(double t, double a, double b) {
        return a + (t * (b - a));
    }

    private void noise2(double[] noiseChannels, double vec0, double vec1, @Nullable StitchInfo stitchInfo) {
        double t = vec0 + PerlinN;
        int bx0 = (int) t;
        int bx1 = bx0 + 1;
        double rx0 = t - ((double) bx0);
        double rx1 = rx0 - 1.0d;
        double sx = curve(rx0);
        double t2 = vec1 + PerlinN;
        int by0 = (int) t2;
        int by1 = by0 + 1;
        double ry0 = t2 - ((double) ((int) t2));
        double ry1 = ry0 - 1.0d;
        double sy = curve(ry0);
        if (stitchInfo != null) {
            if (bx0 >= stitchInfo.wrapX) {
                bx0 -= stitchInfo.width;
            }
            if (bx1 >= stitchInfo.wrapX) {
                bx1 -= stitchInfo.width;
            }
            if (by0 >= stitchInfo.wrapY) {
                by0 -= stitchInfo.height;
            }
            if (by1 >= stitchInfo.wrapY) {
                by1 -= stitchInfo.height;
            }
        }
        int by02 = by0 & 255;
        int by12 = by1 & 255;
        int i = this.uLatticeSelector[bx0 & 255];
        int j = this.uLatticeSelector[bx1 & 255];
        int b00 = ((i + by02) & 255) << 3;
        int b10 = ((j + by02) & 255) << 3;
        int b01 = ((i + by12) & 255) << 3;
        int b11 = ((j + by12) & 255) << 3;
        for (int channelIndex = 0; channelIndex < noiseChannels.length; channelIndex++) {
            int offset = 2 * channelIndex;
            noiseChannels[channelIndex] = lerp(sy, lerp(sx, (rx0 * this.fGradient[b00 + offset]) + (ry0 * this.fGradient[b00 + offset + 1]), (rx1 * this.fGradient[b10 + offset]) + (ry0 * this.fGradient[b10 + offset + 1])), lerp(sx, (rx0 * this.fGradient[b01 + offset]) + (ry1 * this.fGradient[b01 + offset + 1]), (rx1 * this.fGradient[b11 + offset]) + (ry1 * this.fGradient[b11 + offset + 1])));
        }
    }

    public void turbulence(double[] turbulenceChannels, double pointX, double pointY, boolean fractalSum, @Nullable StitchInfo stitchInfo, @Nullable Rectangle2D.Double tile) {
        double[] dArr;
        double baseFrequencyX = this.xFrequency;
        double baseFrequencyY = this.yFrequency;
        if (stitchInfo != null) {
            if (!$assertionsDisabled && tile == null) {
                throw new AssertionError();
            }
            if (baseFrequencyX != 0.0d) {
                baseFrequencyX = adjustFrequency(baseFrequencyX, tile.width);
            }
            if (baseFrequencyY != 0.0d) {
                baseFrequencyY = adjustFrequency(baseFrequencyY, tile.height);
            }
            stitchInfo.width = (int) ((tile.width * baseFrequencyX) + 0.5d);
            stitchInfo.wrapX = (int) ((tile.x * baseFrequencyX) + PerlinN + ((double) stitchInfo.width));
            stitchInfo.height = (int) ((tile.height * baseFrequencyY) + 0.5d);
            stitchInfo.wrapY = (int) ((tile.y * baseFrequencyY) + PerlinN + ((double) stitchInfo.height));
        }
        if (fractalSum) {
            dArr = new double[]{127.5d, 127.5d, 127.5d, 127.5d};
        } else {
            dArr = new double[]{0.0d, 0.0d, 0.0d, 0.0d};
        }
        double[] fSum = dArr;
        double vec0 = pointX * baseFrequencyX;
        double vec1 = pointY * baseFrequencyY;
        double ratio = fractalSum ? 127.5d : 255.0d;
        for (int nOctave = 0; nOctave < this.numOctaves; nOctave++) {
            noise2(turbulenceChannels, vec0, vec1, stitchInfo);
            if (fractalSum) {
                for (int i = 0; i < turbulenceChannels.length; i++) {
                    int i2 = i;
                    fSum[i2] = fSum[i2] + (turbulenceChannels[i] * ratio);
                }
            } else {
                for (int i3 = 0; i3 < turbulenceChannels.length; i3++) {
                    int i4 = i3;
                    fSum[i4] = fSum[i4] + (Math.abs(turbulenceChannels[i3]) * ratio);
                }
            }
            vec0 *= 2.0d;
            vec1 *= 2.0d;
            ratio *= 0.5d;
            if (stitchInfo != null) {
                StitchInfo.access$128(stitchInfo, 2);
                StitchInfo.access$028(stitchInfo, 2);
                StitchInfo.access$012(stitchInfo, ConstantsKt.DEFAULT_BLOCK_SIZE);
                StitchInfo.access$328(stitchInfo, 2);
                StitchInfo.access$228(stitchInfo, 2);
                StitchInfo.access$212(stitchInfo, ConstantsKt.DEFAULT_BLOCK_SIZE);
            }
        }
        System.arraycopy(fSum, 0, turbulenceChannels, 0, fSum.length);
    }

    private double adjustFrequency(double frequency, double tileSize) {
        double fLoFreq = Math.floor(tileSize * frequency) / tileSize;
        double fHiFreq = Math.ceil(tileSize * frequency) / tileSize;
        if (frequency / fLoFreq < fHiFreq / frequency) {
            return fLoFreq;
        }
        return fHiFreq;
    }
}
