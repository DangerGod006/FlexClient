package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.renderer.ContextElementAttributes;
import com.github.weisj.jsvg.renderer.RenderContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/prototype/Instantiator.class */
public interface Instantiator {
    boolean canInstantiate(@NotNull SVGNode sVGNode);

    @NotNull
    default ContextElementAttributes createContextAttributes(@NotNull RenderContext context) {
        return new ContextElementAttributes(context.fillPaint(), context.strokePaint());
    }
}
