package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.renderer.PaintContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/prototype/HasPaintContext.class */
public interface HasPaintContext {
    @NotNull
    Mutator<PaintContext> paintContext();
}
