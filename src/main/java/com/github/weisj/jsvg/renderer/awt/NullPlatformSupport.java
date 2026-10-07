package com.github.weisj.jsvg.renderer.awt;

import com.github.weisj.jsvg.renderer.awt.PlatformSupport;
import java.awt.image.ImageObserver;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/awt/NullPlatformSupport.class */
public final class NullPlatformSupport implements PlatformSupport {
    @Override // com.github.weisj.jsvg.renderer.awt.PlatformSupport
    @Nullable
    public ImageObserver imageObserver() {
        return null;
    }

    @Override // com.github.weisj.jsvg.renderer.awt.PlatformSupport
    @Nullable
    public PlatformSupport.TargetSurface targetSurface() {
        return null;
    }
}
