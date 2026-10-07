package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.nodes.ClipPath;
import com.github.weisj.jsvg.nodes.Mask;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/prototype/HasClip.class */
public interface HasClip {
    @Nullable
    ClipPath clipPath();

    @Nullable
    Mask mask();
}
