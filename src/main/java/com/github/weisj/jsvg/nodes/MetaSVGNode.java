package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/MetaSVGNode.class */
public abstract class MetaSVGNode implements SVGNode {
    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @Nullable
    public String id() {
        return null;
    }

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    public void build(@NotNull AttributeNode attributeNode) {
    }

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    public void addContent(char[] content) {
    }
}
