package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/AbstractSVGNode.class */
public abstract class AbstractSVGNode implements SVGNode {

    @Nullable
    private String id;

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @Nullable
    public String id() {
        return this.id;
    }

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @MustBeInvokedByOverriders
    public void build(@NotNull AttributeNode attributeNode) {
        this.id = attributeNode.getValue("id");
    }

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    public void addContent(char[] content) {
    }

    public String toString() {
        return getClass().getSimpleName() + "{id='" + this.id + "'}";
    }
}
