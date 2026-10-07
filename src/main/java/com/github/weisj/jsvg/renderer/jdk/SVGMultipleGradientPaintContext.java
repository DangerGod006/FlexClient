package com.github.weisj.jsvg.renderer.jdk;

import java.awt.Color;
import java.awt.MultipleGradientPaint;
import java.awt.PaintContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/jdk/SVGMultipleGradientPaintContext.class */
abstract class SVGMultipleGradientPaintContext implements PaintContext {
    private static final float MIN_INTERVAL_LENGTH = 0.001f;
    protected ColorModel model;
    protected static ColorModel cachedModel;
    protected static WeakReference<Raster> cached;
    protected Raster saved;
    protected MultipleGradientPaint.CycleMethod cycleMethod;
    protected MultipleGradientPaint.ColorSpaceType colorSpace;
    protected float a00;
    protected float a01;
    protected float a10;
    protected float a11;
    protected float a02;
    protected float a12;
    protected boolean isSimpleLookup;
    protected int fastGradientArraySize;
    protected int[] gradient;
    private int[][] gradients;
    private float[] normalizedIntervals;
    private final float[] fractions;
    private int transparencyTest;
    protected static final int GRADIENT_SIZE_INDEX = 255;
    private static final int MAX_GRADIENT_ARRAY_SIZE = 5000;
    private static final ColorModel XRGB_MODEL = new DirectColorModel(24, 16711680, 65280, 255);
    protected static final int GRADIENT_SIZE = 256;
    private static final int[] SRGBtoLinearRGB = new int[GRADIENT_SIZE];
    private static final int[] LinearRGBtoSRGB = new int[GRADIENT_SIZE];

    protected abstract void fillRaster(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6);

    static {
        for (int k = 0; k < GRADIENT_SIZE; k++) {
            SRGBtoLinearRGB[k] = convertSRGBtoLinearRGB(k);
            LinearRGBtoSRGB[k] = convertLinearRGBtoSRGB(k);
        }
    }

    protected SVGMultipleGradientPaintContext(@NotNull SVGMultipleGradientPaint mgp, @NotNull AffineTransform t, float[] fractions, @NotNull Color[] colors, MultipleGradientPaint.CycleMethod cycleMethod, MultipleGradientPaint.ColorSpaceType colorSpace) {
        AffineTransform tInv;
        try {
            t.invert();
            tInv = t;
        } catch (NoninvertibleTransformException e) {
            tInv = new AffineTransform();
        }
        double[] m = new double[6];
        tInv.getMatrix(m);
        this.a00 = (float) m[0];
        this.a10 = (float) m[1];
        this.a01 = (float) m[2];
        this.a11 = (float) m[3];
        this.a02 = (float) m[4];
        this.a12 = (float) m[5];
        this.cycleMethod = cycleMethod;
        this.colorSpace = colorSpace;
        this.fractions = fractions;
        int[] gradient = mgp.gradient != null ? mgp.gradient.get() : null;
        int[][] gradients = mgp.gradients != null ? mgp.gradients.get() : null;
        if (gradient == null && gradients == null) {
            calculateLookupData(colors);
            mgp.model = this.model;
            mgp.normalizedIntervals = this.normalizedIntervals;
            mgp.isSimpleLookup = this.isSimpleLookup;
            if (this.isSimpleLookup) {
                mgp.fastGradientArraySize = this.fastGradientArraySize;
                mgp.gradient = new SoftReference<>(this.gradient);
                return;
            } else {
                mgp.gradients = new SoftReference<>(this.gradients);
                return;
            }
        }
        this.model = mgp.model;
        this.normalizedIntervals = mgp.normalizedIntervals;
        this.isSimpleLookup = mgp.isSimpleLookup;
        this.gradient = gradient;
        this.fastGradientArraySize = mgp.fastGradientArraySize;
        this.gradients = gradients;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [int[], int[][]] */
    private void calculateLookupData(Color[] colors) {
        Color[] normalizedColors;
        if (this.colorSpace == MultipleGradientPaint.ColorSpaceType.LINEAR_RGB) {
            normalizedColors = new Color[colors.length];
            for (int i = 0; i < colors.length; i++) {
                int argb = colors[i].getRGB();
                int a = argb >>> 24;
                int r = SRGBtoLinearRGB[(argb >> 16) & 255];
                int g = SRGBtoLinearRGB[(argb >> 8) & 255];
                int b = SRGBtoLinearRGB[argb & 255];
                normalizedColors[i] = new Color(r, g, b, a);
            }
        } else {
            normalizedColors = colors;
        }
        this.normalizedIntervals = new float[this.fractions.length - 1];
        for (int i2 = 0; i2 < this.normalizedIntervals.length; i2++) {
            this.normalizedIntervals[i2] = this.fractions[i2 + 1] - this.fractions[i2];
        }
        this.transparencyTest = -16777216;
        this.gradients = new int[this.normalizedIntervals.length];
        float Imin = 1.0f;
        for (float interval : this.normalizedIntervals) {
            if (interval > MIN_INTERVAL_LENGTH) {
                Imin = Math.min(Imin, interval);
            }
        }
        int estimatedSize = 0;
        for (float normalizedInterval : this.normalizedIntervals) {
            estimatedSize += (int) ((normalizedInterval / Imin) * 256.0f);
        }
        if (estimatedSize > MAX_GRADIENT_ARRAY_SIZE) {
            calculateMultipleArrayGradient(normalizedColors);
        } else {
            calculateSingleArrayGradient(normalizedColors, Imin);
        }
        if ((this.transparencyTest >>> 24) == 255) {
            this.model = XRGB_MODEL;
        } else {
            this.model = ColorModel.getRGBdefault();
        }
    }

    private void calculateSingleArrayGradient(Color[] colors, float Imin) {
        this.isSimpleLookup = true;
        int gradientsTot = 1;
        for (int i = 0; i < this.gradients.length; i++) {
            int nGradients = (int) ((this.normalizedIntervals[i] / Imin) * 255.0f);
            gradientsTot += nGradients;
            this.gradients[i] = new int[nGradients];
            int rgb1 = colors[i].getRGB();
            int rgb2 = colors[i + 1].getRGB();
            interpolate(rgb1, rgb2, this.gradients[i]);
            this.transparencyTest &= rgb1;
            this.transparencyTest &= rgb2;
        }
        this.gradient = new int[gradientsTot];
        int curOffset = 0;
        for (int[] ints : this.gradients) {
            System.arraycopy(ints, 0, this.gradient, curOffset, ints.length);
            curOffset += ints.length;
        }
        this.gradient[this.gradient.length - 1] = colors[colors.length - 1].getRGB();
        if (this.colorSpace == MultipleGradientPaint.ColorSpaceType.LINEAR_RGB) {
            for (int i2 = 0; i2 < this.gradient.length; i2++) {
                this.gradient[i2] = convertEntireColorLinearRGBtoSRGB(this.gradient[i2]);
            }
        }
        this.fastGradientArraySize = this.gradient.length - 1;
    }

    private void calculateMultipleArrayGradient(Color[] colors) {
        this.isSimpleLookup = false;
        for (int i = 0; i < this.gradients.length; i++) {
            this.gradients[i] = new int[GRADIENT_SIZE];
            int rgb1 = colors[i].getRGB();
            int rgb2 = colors[i + 1].getRGB();
            interpolate(rgb1, rgb2, this.gradients[i]);
            this.transparencyTest &= rgb1;
            this.transparencyTest &= rgb2;
        }
        if (this.colorSpace == MultipleGradientPaint.ColorSpaceType.LINEAR_RGB) {
            for (int j = 0; j < this.gradients.length; j++) {
                for (int i2 = 0; i2 < this.gradients[j].length; i2++) {
                    this.gradients[j][i2] = convertEntireColorLinearRGBtoSRGB(this.gradients[j][i2]);
                }
            }
        }
    }

    private void interpolate(int rgb1, int rgb2, int[] output) {
        float stepSize = 1.0f / output.length;
        int a1 = (rgb1 >> 24) & 255;
        int r1 = (rgb1 >> 16) & 255;
        int g1 = (rgb1 >> 8) & 255;
        int b1 = rgb1 & 255;
        int da = ((rgb2 >> 24) & 255) - a1;
        int dr = ((rgb2 >> 16) & 255) - r1;
        int dg = ((rgb2 >> 8) & 255) - g1;
        int db = (rgb2 & 255) - b1;
        for (int i = 0; i < output.length; i++) {
            output[i] = (((int) (((double) (a1 + ((i * da) * stepSize))) + 0.5d)) << 24) | (((int) (((double) (r1 + ((i * dr) * stepSize))) + 0.5d)) << 16) | (((int) (((double) (g1 + ((i * dg) * stepSize))) + 0.5d)) << 8) | ((int) (((double) (b1 + (i * db * stepSize))) + 0.5d));
        }
    }

    private int convertEntireColorLinearRGBtoSRGB(int rgb) {
        int a1 = (rgb >> 24) & 255;
        int r1 = (rgb >> 16) & 255;
        int g1 = (rgb >> 8) & 255;
        int b1 = rgb & 255;
        int r12 = LinearRGBtoSRGB[r1];
        int g12 = LinearRGBtoSRGB[g1];
        return (a1 << 24) | (r12 << 16) | (g12 << 8) | LinearRGBtoSRGB[b1];
    }

    protected final int indexIntoGradientsArrays(float position) {
        if (this.cycleMethod == MultipleGradientPaint.CycleMethod.NO_CYCLE) {
            if (position > 1.0f) {
                position = 1.0f;
            } else if (position < 0.0f) {
                position = 0.0f;
            }
        } else if (this.cycleMethod == MultipleGradientPaint.CycleMethod.REPEAT) {
            position -= (int) position;
            if (position < 0.0f) {
                position += 1.0f;
            }
        } else {
            if (position < 0.0f) {
                position = -position;
            }
            int part = (int) position;
            position -= part;
            if ((part & 1) == 1) {
                position = 1.0f - position;
            }
        }
        if (this.isSimpleLookup) {
            return this.gradient[(int) (position * this.fastGradientArraySize)];
        }
        for (int i = 0; i < this.gradients.length; i++) {
            if (position < this.fractions[i + 1]) {
                float delta = position - this.fractions[i];
                int index = (int) ((delta / this.normalizedIntervals[i]) * 255.0f);
                return this.gradients[i][index];
            }
        }
        return this.gradients[this.gradients.length - 1][255];
    }

    private static int convertSRGBtoLinearRGB(int color) {
        float output;
        float input = color / 255.0f;
        if (input <= 0.04045f) {
            output = input / 12.92f;
        } else {
            output = (float) Math.pow((((double) input) + 0.055d) / 1.055d, 2.4d);
        }
        return Math.round(output * 255.0f);
    }

    private static int convertLinearRGBtoSRGB(int color) {
        float output;
        float input = color / 255.0f;
        if (input <= 0.0031308d) {
            output = input * 12.92f;
        } else {
            output = (1.055f * ((float) Math.pow(input, 0.4166666666666667d))) - 0.055f;
        }
        return Math.round(output * 255.0f);
    }

    public final Raster getRaster(int x, int y, int w, int h) {
        Raster raster = this.saved;
        if (raster == null || raster.getWidth() < w || raster.getHeight() < h) {
            raster = getCachedRaster(this.model, w, h);
            this.saved = raster;
        }
        DataBufferInt rasterDB = raster.getDataBuffer();
        int[] pixels = rasterDB.getData(0);
        int off = rasterDB.getOffset();
        int scanlineStride = raster.getSampleModel().getScanlineStride();
        int adjust = scanlineStride - w;
        fillRaster(pixels, off, adjust, x, y, w, h);
        return raster;
    }

    private static synchronized Raster getCachedRaster(ColorModel cm, int w, int h) {
        Raster ras;
        if (Objects.equals(cm, cachedModel) && cached != null && (ras = cached.get()) != null && ras.getWidth() >= w && ras.getHeight() >= h) {
            cached = null;
            return ras;
        }
        return cm.createCompatibleWritableRaster(w, h);
    }

    private static synchronized void putCachedRaster(ColorModel cm, Raster ras) {
        Raster cras;
        if (cached != null && (cras = cached.get()) != null) {
            int cw = cras.getWidth();
            int ch = cras.getHeight();
            int iw = ras.getWidth();
            int ih = ras.getHeight();
            if ((cw >= iw && ch >= ih) || cw * ch >= iw * ih) {
                return;
            }
        }
        cachedModel = cm;
        cached = new WeakReference<>(ras);
    }

    public final void dispose() {
        if (this.saved != null) {
            putCachedRaster(this.model, this.saved);
            this.saved = null;
        }
    }

    public final ColorModel getColorModel() {
        return this.model;
    }
}
