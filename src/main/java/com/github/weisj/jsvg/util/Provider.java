package com.github.weisj.jsvg.util;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/util/Provider.class */
@FunctionalInterface
public interface Provider<T> {
    @NotNull
    T get();
}
