package com.github.weisj.jsvg.renderer.jdk;

import java.awt.Color;
import java.awt.MultipleGradientPaint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/jdk/SVGRadialGradientPaint.class */
public final class SVGRadialGradientPaint extends SVGMultipleGradientPaint {

    @NotNull
    private final Point2D focus;

    @NotNull
    private final Point2D center;
    private final float radius;
    private final float focusRadius;

    public SVGRadialGradientPaint(@NotNull Point2D center, float radius, @NotNull Point2D focus, float focusRadius, float[] fractions, Color[] colors, MultipleGradientPaint.CycleMethod cycleMethod, MultipleGradientPaint.ColorSpaceType colorSpace, @NotNull AffineTransform gradientTransform) {
        super(fractions, colors, cycleMethod, colorSpace, gradientTransform);
        if (radius <= 0.0f) {
            throw new IllegalArgumentException("Radius must be greater than zero");
        }
        if (focusRadius < 0.0f) {
            throw new IllegalArgumentException("Radius must be greater than zero");
        }
        this.center = new Point2D.Double(center.getX(), center.getY());
        this.focus = new Point2D.Double(focus.getX(), focus.getY());
        this.radius = radius;
        this.focusRadius = focusRadius;
    }

    public PaintContext createContext(ColorModel cm, Rectangle deviceBounds, Rectangle2D userBounds, AffineTransform transform, RenderingHints hints) {
        AffineTransform transform2 = new AffineTransform(transform);
        transform2.concatenate(this.gradientTransform);
        return new SVGRadialGradientPaintContext(this, transform2, (float) this.center.getX(), (float) this.center.getY(), this.radius, (float) this.focus.getX(), (float) this.focus.getY(), this.focusRadius, this.fractions, this.colors, this.cycleMethod, this.colorSpace);
    }
}
