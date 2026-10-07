package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.nodes.prototype.HasGeometryContext;
import com.github.weisj.jsvg.nodes.prototype.Renderable;
import com.github.weisj.jsvg.nodes.prototype.impl.HasGeometryContextImpl;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.RenderContext;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/RenderableSVGNode.class */
public abstract class RenderableSVGNode extends AbstractSVGNode implements Renderable, HasGeometryContext.ByDelegate {
    private boolean isVisible;
    private HasGeometryContext geometryContext;

    public boolean isVisible(@NotNull RenderContext context) {
        return this.isVisible && context.rawOpacity() > 0.0f;
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.HasGeometryContext.ByDelegate
    @NotNull
    public HasGeometryContext geometryContextDelegate() {
        return this.geometryContext;
    }

    @Override // com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    @MustBeInvokedByOverriders
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        this.isVisible = parseIsVisible(attributeNode);
        this.geometryContext = HasGeometryContextImpl.parse(attributeNode);
    }
}
