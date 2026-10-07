package com.github.weisj.jsvg.geometry;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/SVGCircle.class */
public final class SVGCircle implements MeasurableShape {

    @NotNull
    private final Ellipse2D.Float circle = new Ellipse2D.Float();

    @NotNull
    private final Length cx;

    @NotNull
    private final Length cy;

    @NotNull
    private final Length r;

    public SVGCircle(@NotNull Length cx, @NotNull Length cy, @NotNull Length r) {
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    private void validateShape(@NotNull MeasureContext measureContext) {
        float x = this.cx.resolveWidth(measureContext);
        float y = this.cy.resolveHeight(measureContext);
        float rr = this.r.resolveLength(measureContext);
        this.circle.setFrame(x - rr, y - rr, 2.0f * rr, 2.0f * rr);
    }

    @Override // com.github.weisj.jsvg.geometry.SVGShape
    @NotNull
    public Shape shape(@NotNull RenderContext context, boolean validate) {
        if (validate) {
            validateShape(context.measureContext());
        }
        return this.circle;
    }

    @Override // com.github.weisj.jsvg.geometry.SVGShape
    @NotNull
    public Rectangle2D bounds(@NotNull RenderContext context, boolean validate) {
        if (validate) {
            validateShape(context.measureContext());
        }
        return this.circle.getBounds2D();
    }

    @Override // com.github.weisj.jsvg.geometry.MeasurableLength
    public double pathLength(@NotNull MeasureContext measureContext) {
        return circumference(this.r.resolveLength(measureContext));
    }

    static double circumference(double radius) {
        return 6.283185307179586d * radius;
    }
}
