package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageFilter;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/Channel.class */
public interface Channel {
    @NotNull
    ImageProducer producer();

    @NotNull
    Channel applyFilter(@NotNull ImageFilter imageFilter);

    @NotNull
    PixelProvider pixels(@NotNull RenderContext renderContext);

    @NotNull
    default Image toImage(@NotNull RenderContext context) {
        return context.platformSupport().createImage(producer());
    }

    @NotNull
    default BufferedImage toBufferedImageNonAliased(@NotNull RenderContext context) {
        return makeNonAliased(toImage(context));
    }

    @NotNull
    static BufferedImage makeNonAliased(@NotNull Image img) {
        BufferedImage bufferedImage = new BufferedImage(img.getWidth((ImageObserver) null), img.getHeight((ImageObserver) null), 2);
        Graphics imageGraphics = bufferedImage.getGraphics();
        imageGraphics.drawImage(img, 0, 0, (ImageObserver) null);
        imageGraphics.dispose();
        return bufferedImage;
    }
}
