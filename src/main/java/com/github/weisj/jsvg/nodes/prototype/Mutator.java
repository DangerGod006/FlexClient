package com.github.weisj.jsvg.nodes.prototype;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/prototype/Mutator.class */
@FunctionalInterface
public interface Mutator<T> {
    @NotNull
    T mutate(@NotNull T t);
}
