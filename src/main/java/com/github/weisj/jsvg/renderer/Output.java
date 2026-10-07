package com.github.weisj.jsvg.renderer;

import com.github.weisj.jsvg.SVGRenderingHints;
import com.github.weisj.jsvg.util.Provider;
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

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/Output.class */
public interface Output {

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/Output$SafeState.class */
    public interface SafeState {
        void restore();
    }

    void fillShape(@NotNull Shape shape);

    void drawShape(@NotNull Shape shape);

    void drawImage(@NotNull BufferedImage bufferedImage);

    void drawImage(@NotNull Image image, @Nullable ImageObserver imageObserver);

    void drawImage(@NotNull Image image, @NotNull AffineTransform affineTransform, @Nullable ImageObserver imageObserver);

    void setPaint(@NotNull Paint paint);

    void setPaint(@NotNull Provider<Paint> provider);

    void setStroke(@NotNull Stroke stroke);

    @NotNull
    Stroke stroke();

    void applyClip(@NotNull Shape shape);

    void setClip(@Nullable Shape shape);

    Optional<Float> contextFontSize();

    @NotNull
    Output createChild();

    void dispose();

    void debugPaint(@NotNull Consumer<Graphics2D> consumer);

    @NotNull
    Rectangle2D clipBounds();

    @Nullable
    RenderingHints renderingHints();

    @Nullable
    Object renderingHint(@NotNull RenderingHints.Key key);

    void setRenderingHint(@NotNull RenderingHints.Key key, @Nullable Object obj);

    @NotNull
    AffineTransform transform();

    void setTransform(@NotNull AffineTransform affineTransform);

    void applyTransform(@NotNull AffineTransform affineTransform);

    void rotate(double d);

    void scale(double d, double d2);

    void translate(double d, double d2);

    void applyOpacity(float f);

    @NotNull
    SafeState safeState();

    boolean supportsFilters();

    boolean supportsColors();

    default boolean isSoftClippingEnabled() {
        return renderingHint(SVGRenderingHints.KEY_SOFT_CLIPPING) == SVGRenderingHints.VALUE_SOFT_CLIPPING_ON;
    }
}
