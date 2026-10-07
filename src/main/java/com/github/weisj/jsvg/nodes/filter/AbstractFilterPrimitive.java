package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.nodes.AbstractSVGNode;
import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/AbstractFilterPrimitive.class */
public abstract class AbstractFilterPrimitive extends AbstractSVGNode implements FilterPrimitive {
    private FilterPrimitiveBase filterPrimitiveBase;

    @Override // com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    @MustBeInvokedByOverriders
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        this.filterPrimitiveBase = new FilterPrimitiveBase(attributeNode);
    }

    @NotNull
    protected final FilterPrimitiveBase impl() {
        return this.filterPrimitiveBase;
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    @NotNull
    public Length x() {
        return impl().x;
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    @NotNull
    public Length y() {
        return impl().y;
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    @NotNull
    public Length width() {
        return impl().width;
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    @NotNull
    public Length height() {
        return impl().height;
    }
}
