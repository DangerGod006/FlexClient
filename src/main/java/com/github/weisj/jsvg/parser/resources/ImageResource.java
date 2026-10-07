package com.github.weisj.jsvg.parser.resources;

import com.github.weisj.jsvg.SVGRenderingHints;
import com.github.weisj.jsvg.geometry.size.FloatSize;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/resources/ImageResource.class */
public class ImageResource implements RenderableResource {

    @NotNull
    private final BufferedImage image;

    public ImageResource(@NotNull BufferedImage image) {
        this.image = image;
    }

    @Override // com.github.weisj.jsvg.parser.resources.RenderableResource
    @NotNull
    public FloatSize intrinsicSize(@NotNull RenderContext context) {
        return new FloatSize(this.image.getWidth(context.platformSupport().imageObserver()), this.image.getHeight(context.platformSupport().imageObserver()));
    }

    @Override // com.github.weisj.jsvg.parser.resources.RenderableResource
    public void render(@NotNull Output output, @NotNull RenderContext context, @NotNull AffineTransform imgTransform) {
        int imgWidth = this.image.getWidth();
        int imgHeight = this.image.getHeight();
        Object imageAntialiasing = output.renderingHint(SVGRenderingHints.KEY_IMAGE_ANTIALIASING);
        if (imageAntialiasing == SVGRenderingHints.VALUE_IMAGE_ANTIALIASING_OFF) {
            output.drawImage(this.image, imgTransform, context.platformSupport().imageObserver());
            return;
        }
        output.applyTransform(imgTransform);
        Rectangle imgRect = new Rectangle(0, 0, imgWidth, imgHeight);
        output.setPaint((Paint) new TexturePaint(this.image, imgRect));
        output.fillShape(imgRect);
    }
}
