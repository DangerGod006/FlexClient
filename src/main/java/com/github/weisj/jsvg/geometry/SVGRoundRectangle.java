package com.github.weisj.jsvg.geometry;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/SVGRoundRectangle.class */
public final class SVGRoundRectangle implements MeasurableShape {

    @NotNull
    private final RoundRectangle2D.Float rect = new RoundRectangle2D.Float();

    @NotNull
    private final Length x;

    @NotNull
    private final Length y;

    @NotNull
    private final Length w;

    @NotNull
    private final Length h;

    @NotNull
    private final Length rx;

    @NotNull
    private final Length ry;

    public SVGRoundRectangle(@NotNull Length x, @NotNull Length y, @NotNull Length w, @NotNull Length h, @NotNull Length rx, @NotNull Length ry) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.rx = rx;
        this.ry = ry;
    }

    private void validateShape(@NotNull MeasureContext measureContext) {
        this.rect.setRoundRect(this.x.resolveWidth(measureContext), this.y.resolveHeight(measureContext), this.w.resolveWidth(measureContext), this.h.resolveHeight(measureContext), this.rx.resolveWidth(measureContext) * 2.0f, this.ry.resolveHeight(measureContext) * 2.0f);
    }

    @Override // com.github.weisj.jsvg.geometry.SVGShape
    @NotNull
    public Shape shape(@NotNull RenderContext context, boolean validate) {
        if (validate) {
            validateShape(context.measureContext());
        }
        return this.rect;
    }

    @Override // com.github.weisj.jsvg.geometry.SVGShape
    @NotNull
    public Rectangle2D bounds(@NotNull RenderContext context, boolean validate) {
        if (validate) {
            validateShape(context.measureContext());
        }
        return this.rect.getBounds2D();
    }

    @Override // com.github.weisj.jsvg.geometry.MeasurableLength
    public double pathLength(@NotNull MeasureContext measureContext) {
        float a = this.rx.resolveWidth(measureContext);
        float b = this.ry.resolveHeight(measureContext);
        double l = 2.0f * ((this.w.resolveWidth(measureContext) - (2.0f * a)) + (this.h.resolveHeight(measureContext) - (2.0f * b)));
        if (a == b) {
            return l + SVGCircle.circumference(a);
        }
        return l + SVGEllipse.ellipseCircumference(a, b);
    }
}
