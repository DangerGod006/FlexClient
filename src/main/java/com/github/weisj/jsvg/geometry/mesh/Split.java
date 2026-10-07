package com.github.weisj.jsvg.geometry.mesh;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/mesh/Split.class */
final class Split<T> {

    @NotNull
    public final T left;

    @NotNull
    public final T right;

    public Split(@NotNull T left, @NotNull T right) {
        this.left = left;
        this.right = right;
    }
}
