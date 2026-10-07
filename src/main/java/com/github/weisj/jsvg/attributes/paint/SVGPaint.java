package com.github.weisj.jsvg.attributes.paint;

import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/paint/SVGPaint.class */
public interface SVGPaint {
    public static final AwtSVGPaint DEFAULT_PAINT = new AwtSVGPaint(PaintParser.DEFAULT_COLOR);
    public static final SVGPaint NONE = new SVGPaint() { // from class: com.github.weisj.jsvg.attributes.paint.SVGPaint.1
        @Override // com.github.weisj.jsvg.attributes.paint.SVGPaint
        public void fillShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
        }

        @Override // com.github.weisj.jsvg.attributes.paint.SVGPaint
        public void drawShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
        }

        public String toString() {
            return "SVGPaint.None";
        }
    };
    public static final SVGPaint CURRENT_COLOR = new SVGPaint() { // from class: com.github.weisj.jsvg.attributes.paint.SVGPaint.2
        @Override // com.github.weisj.jsvg.attributes.paint.SVGPaint
        public void fillShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
            throw new IllegalStateException("Sentinel color CURRENT_COLOR shouldn't be used for painting directly");
        }

        @Override // com.github.weisj.jsvg.attributes.paint.SVGPaint
        public void drawShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
            throw new IllegalStateException("Sentinel color CURRENT_COLOR shouldn't be used for painting directly");
        }

        public String toString() {
            return "SVGPaint.CurrentColor";
        }
    };
    public static final SVGPaint CONTEXT_FILL = new SVGPaint() { // from class: com.github.weisj.jsvg.attributes.paint.SVGPaint.3
        @Override // com.github.weisj.jsvg.attributes.paint.SVGPaint
        public void fillShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
            throw new IllegalStateException("Sentinel color CONTEXT_FILL shouldn't be used for painting directly");
        }

        @Override // com.github.weisj.jsvg.attributes.paint.SVGPaint
        public void drawShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
            throw new IllegalStateException("Sentinel color CONTEXT_FILL shouldn't be used for painting directly");
        }

        public String toString() {
            return "SVGPaint.ContextFill";
        }
    };
    public static final SVGPaint CONTEXT_STROKE = new SVGPaint() { // from class: com.github.weisj.jsvg.attributes.paint.SVGPaint.4
        @Override // com.github.weisj.jsvg.attributes.paint.SVGPaint
        public void fillShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
            throw new IllegalStateException("Sentinel color CONTEXT_STROKE shouldn't be used for painting directly");
        }

        @Override // com.github.weisj.jsvg.attributes.paint.SVGPaint
        public void drawShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
            throw new IllegalStateException("Sentinel color CONTEXT_STROKE shouldn't be used for painting directly");
        }

        public String toString() {
            return "SVGPaint.ContextStroke";
        }
    };

    void fillShape(@NotNull Output output, @NotNull RenderContext renderContext, @NotNull Shape shape, @Nullable Rectangle2D rectangle2D);

    void drawShape(@NotNull Output output, @NotNull RenderContext renderContext, @NotNull Shape shape, @Nullable Rectangle2D rectangle2D);

    default boolean isVisible() {
        return this != NONE;
    }
}
