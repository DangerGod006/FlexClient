package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.Overflow;
import com.github.weisj.jsvg.geometry.size.FloatSize;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.geometry.size.Unit;
import com.github.weisj.jsvg.nodes.container.CommonInnerViewContainer;
import com.github.weisj.jsvg.nodes.filter.Filter;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.nodes.text.Text;
import com.github.weisj.jsvg.parser.AttributeNode;
import java.awt.Point;
import java.awt.geom.Point2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/SVG.class */
@PermittedContent(categories = {Category.Animation, Category.Descriptive, Category.Shape, Category.Structural, Category.Gradient}, anyOf = {Anchor.class, ClipPath.class, Filter.class, Image.class, Mask.class, Marker.class, Pattern.class, Style.class, Text.class, View.class})
@ElementCategories({Category.Container, Category.Structural})
public final class SVG extends CommonInnerViewContainer {
    public static final String TAG = "svg";

    @NotNull
    private static final Length TOP_LEVEL_TRANSFORM_ORIGIN = Unit.PERCENTAGE.valueOf(50.0f);
    private static final float FALLBACK_WIDTH = 300.0f;
    private static final float FALLBACK_HEIGHT = 150.0f;
    private boolean isTopLevel;

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    public boolean isTopLevel() {
        return this.isTopLevel;
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.Transformable
    public boolean shouldTransform() {
        return !isTopLevel();
    }

    @Override // com.github.weisj.jsvg.nodes.container.CommonInnerViewContainer, com.github.weisj.jsvg.nodes.container.BaseInnerViewContainer, com.github.weisj.jsvg.nodes.container.CommonRenderableContainerNode, com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public void build(@NotNull AttributeNode attributeNode) {
        this.isTopLevel = attributeNode.parent() == null;
        super.build(attributeNode);
    }

    @Override // com.github.weisj.jsvg.nodes.container.CommonInnerViewContainer, com.github.weisj.jsvg.nodes.container.BaseInnerViewContainer
    @NotNull
    protected Point2D outerLocation(@NotNull MeasureContext context) {
        return this.isTopLevel ? new Point(0, 0) : super.outerLocation(context);
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.HasGeometryContext.ByDelegate, com.github.weisj.jsvg.nodes.prototype.Transformable
    @NotNull
    public Point2D transformOrigin(@NotNull MeasureContext context) {
        return !this.isTopLevel ? super.transformOrigin(context) : new Point2D.Float(TOP_LEVEL_TRANSFORM_ORIGIN.resolveWidth(context), TOP_LEVEL_TRANSFORM_ORIGIN.resolveHeight(context));
    }

    @Override // com.github.weisj.jsvg.nodes.container.BaseInnerViewContainer
    @NotNull
    protected Overflow defaultOverflow() {
        return this.isTopLevel ? Overflow.Visible : Overflow.Hidden;
    }

    @NotNull
    public FloatSize sizeForTopLevel(float em, float ex) {
        MeasureContext topLevelContext = MeasureContext.createInitial(new FloatSize(100.0f, 100.0f), em, ex);
        return new FloatSize(this.width.orElseIfUnspecified(this.viewBox != null ? this.viewBox.width : FALLBACK_WIDTH).resolveWidth(topLevelContext), this.height.orElseIfUnspecified(this.viewBox != null ? this.viewBox.height : FALLBACK_HEIGHT).resolveHeight(topLevelContext));
    }
}
