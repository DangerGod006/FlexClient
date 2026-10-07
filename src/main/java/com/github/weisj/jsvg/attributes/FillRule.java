package com.github.weisj.jsvg.attributes;

import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/FillRule.class */
public enum FillRule {
    Nonzero(1),
    EvenOdd(0),
    Inherit(Nonzero.awtWindingRule);

    public final int awtWindingRule;

    FillRule(int awtWindingRule) {
        this.awtWindingRule = awtWindingRule;
    }

    @NotNull
    public static FillRule parse(@NotNull AttributeNode attributeNode) {
        return (FillRule) attributeNode.getEnum("fill-rule", Inherit);
    }
}
