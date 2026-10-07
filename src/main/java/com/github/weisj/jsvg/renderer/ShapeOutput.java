package com.github.weisj.jsvg.renderer;

import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.util.Provider;
import com.github.weisj.jsvg.util.ShapeUtil;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.Optional;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/ShapeOutput.class */
public class ShapeOutput implements Output {

    @NotNull
    private final Area accumulatorShape;

    @NotNull
    private AffineTransform currentTransform;

    @NotNull
    private Stroke currentStroke;

    @Nullable
    private Shape currentClip;

    public ShapeOutput(@NotNull Area area) {
        this.accumulatorShape = area;
        this.currentStroke = new BasicStroke();
        this.currentTransform = new AffineTransform();
        this.currentClip = null;
    }

    private ShapeOutput(@NotNull ShapeOutput parent) {
        this.accumulatorShape = parent.accumulatorShape;
        this.currentStroke = parent.currentStroke;
        this.currentTransform = new AffineTransform(parent.currentTransform);
        this.currentClip = parent.currentClip != null ? new Area(parent.currentClip) : null;
    }

    private void addShape(@NotNull Shape shape) {
        Shape shapeIntersect;
        if (this.currentClip != null) {
            shapeIntersect = ShapeUtil.intersect(this.currentClip, shape, true, false);
        } else {
            shapeIntersect = shape;
        }
        Shape s = shapeIntersect;
        this.accumulatorShape.add(new Area(s));
    }

    private void append(@NotNull Shape shape, @NotNull AffineTransform transform) {
        AffineTransform at = new AffineTransform(this.currentTransform);
        at.concatenate(transform);
        addShape(ShapeUtil.transformShape(shape, at));
    }

    private void append(@NotNull Shape shape) {
        addShape(ShapeUtil.transformShape(shape, this.currentTransform));
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void fillShape(@NotNull Shape shape) {
        append(shape);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void drawShape(@NotNull Shape shape) {
        append(this.currentStroke.createStrokedShape(shape));
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void drawImage(@NotNull BufferedImage image) {
        append(new Rectangle2D.Float(0.0f, 0.0f, image.getWidth(), image.getHeight()));
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void drawImage(@NotNull Image image, @Nullable ImageObserver observer) {
        append(new Rectangle2D.Float(0.0f, 0.0f, image.getWidth((ImageObserver) null), image.getHeight((ImageObserver) null)));
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void drawImage(@NotNull Image image, @NotNull AffineTransform at, @Nullable ImageObserver observer) {
        append(new Rectangle2D.Float(0.0f, 0.0f, image.getWidth((ImageObserver) null), image.getHeight((ImageObserver) null)), at);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void setPaint(@NotNull Paint paint) {
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void setPaint(@NotNull Provider<Paint> paintProvider) {
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void setStroke(@NotNull Stroke stroke) {
        this.currentStroke = stroke;
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    @NotNull
    public Stroke stroke() {
        return this.currentStroke;
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void applyClip(@NotNull Shape clipShape) {
        Shape transformedShape = ShapeUtil.transformShape(clipShape, this.currentTransform);
        if (this.currentClip != null) {
            this.currentClip = ShapeUtil.intersect(this.currentClip, transformedShape, true, false);
        } else {
            this.currentClip = transformedShape;
        }
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void setClip(@Nullable Shape shape) {
        Shape shapeTransformShape;
        if (shape != null) {
            shapeTransformShape = ShapeUtil.transformShape(shape, this.currentTransform);
        } else {
            shapeTransformShape = null;
        }
        this.currentClip = shapeTransformShape;
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public Optional<Float> contextFontSize() {
        return Optional.empty();
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    @NotNull
    public Output createChild() {
        return new ShapeOutput(this);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void dispose() {
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void debugPaint(@NotNull Consumer<Graphics2D> painter) {
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    @NotNull
    public Rectangle2D clipBounds() {
        return this.currentClip != null ? this.currentClip.getBounds2D() : new Rectangle2D.Float(-8.5070587E37f, -8.5070587E37f, 2.0f * 8.5070587E37f, 2.0f * 8.5070587E37f);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    @Nullable
    public RenderingHints renderingHints() {
        return null;
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    @Nullable
    public Object renderingHint(RenderingHints.Key key) {
        return null;
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void setRenderingHint(RenderingHints.Key key, @Nullable Object value) {
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    @NotNull
    public AffineTransform transform() {
        return new AffineTransform(this.currentTransform);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void setTransform(@NotNull AffineTransform affineTransform) {
        this.currentTransform = new AffineTransform(affineTransform);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void applyTransform(@NotNull AffineTransform transform) {
        this.currentTransform.concatenate(transform);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void rotate(double angle) {
        this.currentTransform.rotate(angle);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void scale(double sx, double sy) {
        this.currentTransform.scale(sx, sy);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void translate(double dx, double dy) {
        this.currentTransform.translate(dx, dy);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void applyOpacity(float opacity) {
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    @NotNull
    public Output.SafeState safeState() {
        return new ShapeOutputSafeState();
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public boolean supportsFilters() {
        return false;
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public boolean supportsColors() {
        return false;
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public boolean isSoftClippingEnabled() {
        return false;
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/ShapeOutput$ShapeOutputSafeState.class */
    private static class ShapeOutputSafeState implements Output.SafeState {

        @NotNull
        private final ShapeOutput shapeOutput;

        @NotNull
        private final Stroke oldStroke;

        @NotNull
        private final AffineTransform oldTransform;

        @Nullable
        private final Area oldClip;

        private ShapeOutputSafeState(@NotNull ShapeOutput shapeOutput) {
            this.shapeOutput = shapeOutput;
            this.oldStroke = shapeOutput.stroke();
            this.oldTransform = shapeOutput.transform();
            this.oldClip = shapeOutput.currentClip != null ? new Area(shapeOutput.currentClip) : null;
        }

        @Override // com.github.weisj.jsvg.renderer.Output.SafeState
        public void restore() {
            this.shapeOutput.currentStroke = this.oldStroke;
            this.shapeOutput.currentTransform = this.oldTransform;
            this.shapeOutput.currentClip = this.oldClip;
        }
    }
}
