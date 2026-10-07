package com.github.weisj.jsvg.util;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/util/ConstantProvider.class */
public final class ConstantProvider<T> implements Provider<T> {

    @NotNull
    private final T t;

    public ConstantProvider(@NotNull T t) {
        this.t = t;
    }

    @Override // com.github.weisj.jsvg.util.Provider
    @NotNull
    public T get() {
        return this.t;
    }
}
