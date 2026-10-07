package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/SVGNode.class */
public interface SVGNode {
    @NotNull
    String tagName();

    @Nullable
    String id();

    void build(@NotNull AttributeNode attributeNode);

    void addContent(char[] cArr);
}
