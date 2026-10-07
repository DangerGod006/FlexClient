package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.renderer.awt.PlatformSupport;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/UIFuture.class */
public interface UIFuture<T> {
    boolean checkIfReady(@NotNull PlatformSupport platformSupport);

    T get();
}
