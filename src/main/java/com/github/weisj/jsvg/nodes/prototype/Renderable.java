package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/prototype/Renderable.class */
public interface Renderable {
    boolean isVisible(@NotNull RenderContext renderContext);

    void render(@NotNull RenderContext renderContext, @NotNull Output output);

    default boolean requiresInstantiation() {
        return false;
    }

    default boolean parseIsVisible(@NotNull AttributeNode node) {
        return ("none".equals(node.getValue("display")) || "hidden".equals(node.getValue("visibility")) || "collapse".equals(node.getValue("visibility"))) ? false : true;
    }
}
