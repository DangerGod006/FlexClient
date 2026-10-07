package com.github.weisj.jsvg.renderer.awt;

import com.github.weisj.jsvg.renderer.awt.PlatformSupport;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Objects;
import javax.swing.JComponent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/awt/JComponentPlatformSupport.class */
public final class JComponentPlatformSupport implements PlatformSupport {

    @NotNull
    private final JComponent component;

    public JComponentPlatformSupport(@NotNull JComponent component) {
        this.component = component;
    }

    @Override // com.github.weisj.jsvg.renderer.awt.PlatformSupport
    public float fontSize() {
        Font font = this.component.getFont();
        return font != null ? font.getSize2D() : super.fontSize();
    }

    @Override // com.github.weisj.jsvg.renderer.awt.PlatformSupport
    @NotNull
    public PlatformSupport.TargetSurface targetSurface() {
        JComponent jComponent = this.component;
        Objects.requireNonNull(jComponent);
        return jComponent::repaint;
    }

    @Override // com.github.weisj.jsvg.renderer.awt.PlatformSupport
    @NotNull
    public ImageObserver imageObserver() {
        return this.component;
    }

    @Override // com.github.weisj.jsvg.renderer.awt.PlatformSupport
    @NotNull
    public Image createImage(@NotNull ImageProducer imageProducer) {
        return this.component.createImage(imageProducer);
    }

    public String toString() {
        return "JComponentAwtSupport{component=" + this.component + '}';
    }
}
