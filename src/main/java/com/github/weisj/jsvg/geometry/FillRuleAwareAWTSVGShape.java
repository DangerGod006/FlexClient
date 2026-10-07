package com.github.weisj.jsvg.geometry;

import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.Path2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/FillRuleAwareAWTSVGShape.class */
public final class FillRuleAwareAWTSVGShape extends AWTSVGShape<Path2D> {
    public FillRuleAwareAWTSVGShape(@NotNull Path2D shape) {
        super(shape);
    }

    @Override // com.github.weisj.jsvg.geometry.AWTSVGShape, com.github.weisj.jsvg.geometry.SVGShape
    @NotNull
    public Shape shape(@NotNull RenderContext context, boolean validate) {
        this.shape.setWindingRule(context.fillRule().awtWindingRule);
        return super.shape(context, validate);
    }
}
