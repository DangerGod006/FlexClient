package com.github.weisj.jsvg.geometry;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/SVGRectangle.class */
public final class SVGRectangle implements MeasurableShape {

    @NotNull
    private final Rectangle2D.Float rect = new Rectangle2D.Float();

    @NotNull
    private final Length x;

    @NotNull
    private final Length y;

    @NotNull
    private final Length w;

    @NotNull
    private final Length h;

    public SVGRectangle(@NotNull Length x, @NotNull Length y, @NotNull Length w, @NotNull Length h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    private void validateShape(@NotNull MeasureContext measureContext) {
        this.rect.setRect(this.x.resolveWidth(measureContext), this.y.resolveHeight(measureContext), this.w.resolveWidth(measureContext), this.h.resolveHeight(measureContext));
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
        return this.rect;
    }

    @Override // com.github.weisj.jsvg.geometry.MeasurableLength
    public double pathLength(@NotNull MeasureContext measureContext) {
        return 2.0f * (this.w.resolveWidth(measureContext) + this.h.resolveHeight(measureContext));
    }
}
