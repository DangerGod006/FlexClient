package com.github.weisj.jsvg.geometry;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/SVGEllipse.class */
public final class SVGEllipse implements MeasurableShape {

    @NotNull
    private final Ellipse2D.Float ellipse = new Ellipse2D.Float();

    @NotNull
    private final Length cx;

    @NotNull
    private final Length cy;

    @NotNull
    private final Length rx;

    @NotNull
    private final Length ry;

    public SVGEllipse(@NotNull Length cx, @NotNull Length cy, @NotNull Length rx, @NotNull Length ry) {
        this.cx = cx;
        this.cy = cy;
        this.rx = rx;
        this.ry = ry;
    }

    private void validateShape(@NotNull MeasureContext measureContext) {
        float x = this.cx.resolveWidth(measureContext);
        float y = this.cy.resolveHeight(measureContext);
        float rrx = this.rx.resolveWidth(measureContext);
        float rry = this.ry.resolveHeight(measureContext);
        this.ellipse.setFrame(x - rrx, y - rry, 2.0f * rrx, 2.0f * rry);
    }

    @Override // com.github.weisj.jsvg.geometry.SVGShape
    @NotNull
    public Shape shape(@NotNull RenderContext context, boolean validate) {
        if (validate) {
            validateShape(context.measureContext());
        }
        return this.ellipse;
    }

    @Override // com.github.weisj.jsvg.geometry.SVGShape
    @NotNull
    public Rectangle2D bounds(@NotNull RenderContext context, boolean validate) {
        if (validate) {
            validateShape(context.measureContext());
        }
        return this.ellipse.getBounds2D();
    }

    @Override // com.github.weisj.jsvg.geometry.MeasurableLength
    public double pathLength(@NotNull MeasureContext measureContext) {
        float a = this.rx.resolveWidth(measureContext);
        float b = this.ry.resolveHeight(measureContext);
        return a == b ? SVGCircle.circumference(a) : ellipseCircumference(a, b);
    }

    static double ellipseCircumference(double a, double b) {
        double h = ((a - b) * (a - b)) / ((a + b) * (a + b));
        double h4 = h / 4.0d;
        return 0.7853981633974483d * (a + b) * ((3.0d * (1.0d + h4)) + (1.0d / (1.0d - h4)));
    }
}
