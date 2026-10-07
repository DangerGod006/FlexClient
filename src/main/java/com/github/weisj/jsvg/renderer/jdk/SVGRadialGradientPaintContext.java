package com.github.weisj.jsvg.renderer.jdk;

import java.awt.Color;
import java.awt.MultipleGradientPaint;
import java.awt.geom.AffineTransform;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/jdk/SVGRadialGradientPaintContext.class */
final class SVGRadialGradientPaintContext extends SVGMultipleGradientPaintContext {
    private final boolean isSimpleFocus;
    private final boolean isNonCyclic;
    private final float centerX;
    private final float centerY;
    private float focusX;
    private float focusY;
    private final float radiusSq;
    private final float focusRadius;
    private final float focusRadiusSq;
    private final float constA;
    private final float constB;
    private final float gDeltaDelta;
    private final float trivial;
    private static final float FOCUS_CLAMP_DOWNSCALE = 0.99f;
    private static final int SQRT_LUT_SIZE = 2048;
    private static final float[] sqrtLookup = new float[2049];

    SVGRadialGradientPaintContext(@NotNull SVGRadialGradientPaint paint, @NotNull AffineTransform t, float cx, float cy, float r, float fx, float fy, float fr, float[] fractions, @NotNull Color[] colors, MultipleGradientPaint.CycleMethod cycleMethod, MultipleGradientPaint.ColorSpaceType colorSpace) {
        super(paint, t, fractions, colors, cycleMethod, colorSpace);
        this.centerX = cx;
        this.centerY = cy;
        this.focusX = fx;
        this.focusY = fy;
        this.isSimpleFocus = this.focusX == this.centerX && this.focusY == this.centerY && fr == 0.0f;
        this.isNonCyclic = cycleMethod == MultipleGradientPaint.CycleMethod.NO_CYCLE;
        this.radiusSq = r * r;
        this.focusRadius = fr;
        this.focusRadiusSq = fr * fr;
        float dX = this.focusX - this.centerX;
        float dY = this.focusY - this.centerY;
        double distSq = (dX * dX) + (dY * dY);
        if (distSq > this.radiusSq * FOCUS_CLAMP_DOWNSCALE) {
            float scale = (float) Math.sqrt(((double) (this.radiusSq * FOCUS_CLAMP_DOWNSCALE)) / distSq);
            dX *= scale;
            this.focusX = this.centerX + dX;
            this.focusY = this.centerY + (dY * scale);
        }
        this.trivial = (float) Math.sqrt(this.radiusSq - (dX * dX));
        this.constA = this.a02 - this.centerX;
        this.constB = this.a12 - this.centerY;
        this.gDeltaDelta = (2.0f * ((this.a00 * this.a00) + (this.a10 * this.a10))) / this.radiusSq;
    }

    @Override // com.github.weisj.jsvg.renderer.jdk.SVGMultipleGradientPaintContext
    protected void fillRaster(int[] pixels, int off, int adjust, int x, int y, int w, int h) {
        if (this.isSimpleFocus && this.isNonCyclic && this.isSimpleLookup) {
            simpleNonCyclicFillRaster(pixels, off, adjust, x, y, w, h);
        } else {
            cyclicCircularGradientFillRaster(pixels, off, adjust, x, y, w, h);
        }
    }

    private void simpleNonCyclicFillRaster(int[] pixels, int off, int adjust, int x, int y, int w, int h) {
        int i;
        float rowX = (this.a00 * x) + (this.a01 * y) + this.constA;
        float rowY = (this.a10 * x) + (this.a11 * y) + this.constB;
        float gDeltaDelta = this.gDeltaDelta;
        int adjust2 = adjust + w;
        int rgbclip = this.gradient[this.fastGradientArraySize];
        for (int j = 0; j < h; j++) {
            float gRel = ((rowX * rowX) + (rowY * rowY)) / this.radiusSq;
            float gDelta = ((2.0f * ((this.a00 * rowX) + (this.a10 * rowY))) / this.radiusSq) + (gDeltaDelta / 2.0f);
            int i2 = 0;
            while (i2 < w && gRel >= 1.0f) {
                pixels[off + i2] = rgbclip;
                gRel += gDelta;
                gDelta += gDeltaDelta;
                i2++;
            }
            while (i2 < w && gRel < 1.0f) {
                if (gRel <= 0.0f) {
                    i = 0;
                } else {
                    float fIndex = gRel * 2048.0f;
                    int iIndex = (int) fIndex;
                    float s0 = sqrtLookup[iIndex];
                    float s1 = sqrtLookup[iIndex + 1] - s0;
                    i = (int) ((s0 + ((fIndex - iIndex) * s1)) * this.fastGradientArraySize);
                }
                int gIndex = i;
                pixels[off + i2] = this.gradient[gIndex];
                gRel += gDelta;
                gDelta += gDeltaDelta;
                i2++;
            }
            while (i2 < w) {
                pixels[off + i2] = rgbclip;
                i2++;
            }
            off += adjust2;
            rowX += this.a01;
            rowY += this.a11;
        }
    }

    static {
        for (int i = 0; i < sqrtLookup.length; i++) {
            sqrtLookup[i] = (float) Math.sqrt(i / 2048.0f);
        }
    }

    private void cyclicCircularGradientFillRaster(int[] pixels, int off, int adjust, int x, int y, int w, int h) {
        double solutionX;
        double solutionY;
        float g;
        int iIndexIntoGradientsArrays;
        double constC = (-this.radiusSq) + (this.centerX * this.centerX) + (this.centerY * this.centerY);
        float constX = (this.a00 * x) + (this.a01 * y) + this.a02;
        float constY = (this.a10 * x) + (this.a11 * y) + this.a12;
        float precalc2 = 2.0f * this.centerY;
        float precalc3 = (-2.0f) * this.centerX;
        int indexer = off;
        int pixInc = w + adjust;
        for (int j = 0; j < h; j++) {
            float X = (this.a01 * j) + constX;
            float Y = (this.a11 * j) + constY;
            for (int i = 0; i < w; i++) {
                if (X == this.focusX) {
                    solutionX = this.focusX;
                    double solutionY2 = this.centerY;
                    solutionY = solutionY2 + (Y > this.focusY ? this.trivial : -this.trivial);
                } else {
                    double slope = (Y - this.focusY) / (X - this.focusX);
                    double yIntercept = ((double) Y) - (slope * ((double) X));
                    double A = (slope * slope) + 1.0d;
                    double B = ((double) precalc3) + ((-2.0d) * slope * (((double) this.centerY) - yIntercept));
                    double C = constC + (yIntercept * (yIntercept - ((double) precalc2)));
                    float det = (float) Math.sqrt((B * B) - ((4.0d * A) * C));
                    solutionX = ((-B) + (X < this.focusX ? -det : det)) / (2.0d * A);
                    solutionY = (slope * solutionX) + yIntercept;
                }
                float deltaXSq = X - this.focusX;
                float deltaXSq2 = deltaXSq * deltaXSq;
                float deltaYSq = Y - this.focusY;
                float currentToFocusSq = deltaXSq2 + (deltaYSq * deltaYSq);
                if (currentToFocusSq <= this.focusRadiusSq) {
                    iIndexIntoGradientsArrays = indexIntoGradientsArrays(0.0f);
                } else {
                    float deltaXSq3 = ((float) solutionX) - this.focusX;
                    float deltaXSq4 = deltaXSq3 * deltaXSq3;
                    float deltaYSq2 = ((float) solutionY) - this.focusY;
                    float intersectToFocusSq = deltaXSq4 + (deltaYSq2 * deltaYSq2);
                    if (this.focusRadius > 0.0f) {
                        float currentToFocus = (float) Math.sqrt(currentToFocusSq);
                        float intersectToFocus = (float) Math.sqrt(intersectToFocusSq);
                        g = (currentToFocus - this.focusRadius) / (intersectToFocus - this.focusRadius);
                    } else {
                        g = (float) Math.sqrt(currentToFocusSq / intersectToFocusSq);
                    }
                    iIndexIntoGradientsArrays = indexIntoGradientsArrays(g);
                }
                int colorAtPoint = iIndexIntoGradientsArrays;
                pixels[indexer + i] = colorAtPoint;
                X += this.a00;
                Y += this.a10;
            }
            indexer += pixInc;
        }
    }
}
