package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.UnitType;
import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
import com.github.weisj.jsvg.geometry.util.GeometryUtil;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImageFilter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/FeOffset.class */
@PermittedContent(anyOf = {Animate.class, Set.class})
@ElementCategories({Category.FilterPrimitive})
public final class FeOffset extends AbstractFilterPrimitive {
    public static final String TAG = "feOffset";
    private float dx;
    private float dy;

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    @Override // com.github.weisj.jsvg.nodes.filter.AbstractFilterPrimitive, com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        this.dx = attributeNode.getFloat("dx", 0.0f);
        this.dy = attributeNode.getFloat("dy", 0.0f);
    }

    private Point2D.Double offset(@Nullable AffineTransform at, @NotNull UnitType filterPrimitiveUnits, @NotNull Rectangle2D elementBounds) {
        Point2D.Double off = new Point2D.Double(this.dx, this.dy);
        if (at != null) {
            off.x *= GeometryUtil.scaleXOfTransform(at);
            off.y *= GeometryUtil.scaleYOfTransform(at);
        }
        if (filterPrimitiveUnits == UnitType.ObjectBoundingBox) {
            off.x *= elementBounds.getWidth();
            off.y *= elementBounds.getHeight();
        }
        return off;
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
        LayoutBounds input = impl().layoutInput(filterLayoutContext);
        Point2D.Double off = offset(null, filterLayoutContext.primitiveUnits(), filterLayoutContext.elementBounds());
        LayoutBounds result = input.translate((float) off.x, (float) off.y, filterLayoutContext);
        impl().saveLayoutResult(result, filterLayoutContext);
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
        Channel in = impl().inputChannel(filterContext);
        Channel result = in;
        if (this.dx != 0.0f || this.dy != 0.0f) {
            AffineTransform at = filterContext.info().output().transform();
            Point2D.Double off = offset(at, filterContext.primitiveUnits(), filterContext.info().elementBounds());
            AffineTransform transform = AffineTransform.getTranslateInstance(off.x, off.y);
            AffineTransformOp op = new AffineTransformOp(transform, filterContext.renderingHints());
            result = in.applyFilter(new BufferedImageFilter(op));
        }
        impl().saveResult(result, filterContext);
    }
}
