package com.github.weisj.jsvg.attributes.paint;

import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/paint/SimplePaintSVGPaint.class */
public interface SimplePaintSVGPaint extends SVGPaint {
    @NotNull
    Paint paint();

    @Override // com.github.weisj.jsvg.attributes.paint.SVGPaint
    default void fillShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
        output.setPaint(paint());
        output.fillShape(shape);
    }

    @Override // com.github.weisj.jsvg.attributes.paint.SVGPaint
    default void drawShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
        output.setPaint(paint());
        output.drawShape(shape);
    }
}
