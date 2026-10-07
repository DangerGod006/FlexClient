package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.Overflow;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.container.CommonInnerViewContainer;
import com.github.weisj.jsvg.nodes.filter.Filter;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.nodes.text.Text;
import com.github.weisj.jsvg.parser.AttributeNode;
import java.awt.geom.Point2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/Symbol.class */
@PermittedContent(categories = {Category.Animation, Category.Descriptive, Category.Shape, Category.Structural, Category.Gradient}, anyOf = {Anchor.class, ClipPath.class, Filter.class, Image.class, Mask.class, Marker.class, Pattern.class, Style.class, Text.class, View.class})
@ElementCategories({Category.Container, Category.Structural})
public final class Symbol extends CommonInnerViewContainer {
    public static final String TAG = "symbol";
    private Length refX;
    private Length refY;

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    @Override // com.github.weisj.jsvg.nodes.container.CommonInnerViewContainer, com.github.weisj.jsvg.nodes.container.BaseInnerViewContainer
    @NotNull
    protected Point2D anchorLocation(@NotNull MeasureContext context) {
        return new Point2D.Float(-this.refX.resolveWidth(context), -this.refY.resolveHeight(context));
    }

    @Override // com.github.weisj.jsvg.nodes.container.BaseInnerViewContainer
    @NotNull
    protected Overflow defaultOverflow() {
        return Overflow.Hidden;
    }

    @Override // com.github.weisj.jsvg.nodes.container.CommonInnerViewContainer, com.github.weisj.jsvg.nodes.container.BaseInnerViewContainer, com.github.weisj.jsvg.nodes.container.CommonRenderableContainerNode, com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        this.refX = attributeNode.getHorizontalReferenceLength("refX");
        this.refY = attributeNode.getVerticalReferenceLength("refY");
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.Renderable
    public boolean requiresInstantiation() {
        return true;
    }
}
