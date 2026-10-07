package com.github.weisj.jsvg.nodes.container;

import com.github.weisj.jsvg.geometry.size.FloatSize;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.nodes.prototype.ShapedContainer;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.geom.Point2D;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/container/CommonInnerViewContainer.class */
public abstract class CommonInnerViewContainer extends BaseInnerViewContainer implements ShapedContainer<SVGNode> {
    protected Length x;
    protected Length y;
    protected Length width;
    protected Length height;

    @Override // com.github.weisj.jsvg.nodes.container.BaseInnerViewContainer
    @NotNull
    protected Point2D outerLocation(@NotNull MeasureContext context) {
        return new Point2D.Float(this.x.resolveWidth(context), this.y.resolveHeight(context));
    }

    @Override // com.github.weisj.jsvg.nodes.container.BaseInnerViewContainer
    @Nullable
    protected Point2D anchorLocation(@NotNull MeasureContext context) {
        return null;
    }

    @Override // com.github.weisj.jsvg.nodes.container.BaseInnerViewContainer
    @NotNull
    public FloatSize size(@NotNull RenderContext context) {
        MeasureContext measure = context.measureContext();
        return new FloatSize(this.width.orElseIfUnspecified(measure.viewWidth()).resolveWidth(measure), this.height.orElseIfUnspecified(measure.viewHeight()).resolveHeight(measure));
    }

    @Override // com.github.weisj.jsvg.nodes.container.CommonRenderableContainerNode, com.github.weisj.jsvg.nodes.prototype.Renderable
    public boolean isVisible(@NotNull RenderContext context) {
        return (this.width.isZero() || this.height.isZero() || !super.isVisible(context)) ? false : true;
    }

    @Override // com.github.weisj.jsvg.nodes.container.BaseInnerViewContainer, com.github.weisj.jsvg.nodes.container.CommonRenderableContainerNode, com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    @MustBeInvokedByOverriders
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        this.x = attributeNode.getLength("x", 0.0f);
        this.y = attributeNode.getLength("y", 0.0f);
        this.width = attributeNode.getLength("width", Length.UNSPECIFIED);
        this.height = attributeNode.getLength("height", Length.UNSPECIFIED);
    }
}
