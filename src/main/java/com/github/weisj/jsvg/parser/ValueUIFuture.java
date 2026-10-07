package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.renderer.awt.PlatformSupport;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/ValueUIFuture.class */
public final class ValueUIFuture<T> implements UIFuture<T> {
    private final T value;

    public ValueUIFuture(T value) {
        this.value = value;
    }

    @Override // com.github.weisj.jsvg.parser.UIFuture
    public boolean checkIfReady(@NotNull PlatformSupport platformSupport) {
        return true;
    }

    @Override // com.github.weisj.jsvg.parser.UIFuture
    public T get() {
        return this.value;
    }
}
