package com.github.weisj.jsvg.renderer;

import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.util.GraphicsResetHelper;
import com.github.weisj.jsvg.util.Provider;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.Optional;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/Graphics2DOutput.class */
public class Graphics2DOutput implements Output {
    private final Graphics2D g;

    @NotNull
    public Graphics2D graphics() {
        return this.g;
    }

    public Graphics2DOutput(@NotNull Graphics2D g) {
        this.g = g;
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void fillShape(@NotNull Shape shape) {
        this.g.fill(shape);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void drawShape(@NotNull Shape shape) {
        this.g.draw(shape);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void drawImage(@NotNull BufferedImage image) {
        this.g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), (Color) null, (ImageObserver) null);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void drawImage(@NotNull Image image, @Nullable ImageObserver observer) {
        this.g.drawImage(image, 0, 0, (ImageObserver) null);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void drawImage(@NotNull Image image, @NotNull AffineTransform at, @Nullable ImageObserver observer) {
        this.g.drawImage(image, at, observer);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void setPaint(@NotNull Paint paint) {
        GraphicsUtil.safelySetPaint(this.g, paint);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void setPaint(@NotNull Provider<Paint> paintProvider) {
        setPaint(paintProvider.get());
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void setStroke(@NotNull Stroke stroke) {
        this.g.setStroke(stroke);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    @NotNull
    public Stroke stroke() {
        return this.g.getStroke();
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void applyClip(@NotNull Shape clipShape) {
        this.g.clip(clipShape);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void setClip(@Nullable Shape shape) {
        this.g.setClip(shape);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public Optional<Float> contextFontSize() {
        Font f = this.g.getFont();
        return f != null ? Optional.of(Float.valueOf(f.getSize2D())) : Optional.empty();
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    @NotNull
    public Output createChild() {
        return new Graphics2DOutput(this.g.create());
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void dispose() {
        this.g.dispose();
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void debugPaint(@NotNull Consumer<Graphics2D> painter) {
        Graphics2D debugGraphics = (Graphics2D) this.g.create();
        painter.accept(debugGraphics);
        debugGraphics.dispose();
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    @NotNull
    public Rectangle2D clipBounds() {
        return this.g.getClipBounds();
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    @NotNull
    public RenderingHints renderingHints() {
        return this.g.getRenderingHints();
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    @Nullable
    public Object renderingHint(RenderingHints.Key key) {
        return this.g.getRenderingHint(key);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void setRenderingHint(RenderingHints.Key key, @Nullable Object value) {
        this.g.setRenderingHint(key, value);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    @NotNull
    public AffineTransform transform() {
        return this.g.getTransform();
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void setTransform(@NotNull AffineTransform affineTransform) {
        this.g.setTransform(affineTransform);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void applyTransform(@NotNull AffineTransform transform) {
        this.g.transform(transform);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void rotate(double angle) {
        this.g.rotate(angle);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void scale(double sx, double sy) {
        this.g.scale(sx, sy);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void translate(double dx, double dy) {
        this.g.translate(dx, dy);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public void applyOpacity(float opacity) {
        this.g.setComposite(GraphicsUtil.deriveComposite(this.g, opacity));
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    @NotNull
    public Output.SafeState safeState() {
        return new GraphicsResetHelper(this.g);
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public boolean supportsFilters() {
        return true;
    }

    @Override // com.github.weisj.jsvg.renderer.Output
    public boolean supportsColors() {
        return true;
    }
}
