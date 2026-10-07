package com.github.weisj.jsvg.renderer.awt;

import com.github.weisj.jsvg.attributes.font.SVGFont;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/awt/PlatformSupport.class */
public interface PlatformSupport {

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/awt/PlatformSupport$TargetSurface.class */
    public interface TargetSurface {
        void repaint();
    }

    @Nullable
    ImageObserver imageObserver();

    @Nullable
    TargetSurface targetSurface();

    default float fontSize() {
        return SVGFont.defaultFontSize();
    }

    @NotNull
    default Image createImage(@NotNull ImageProducer imageProducer) {
        return Toolkit.getDefaultToolkit().createImage(imageProducer);
    }
}
