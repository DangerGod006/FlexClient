package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.UnitType;
import com.github.weisj.jsvg.attributes.paint.PaintParser;
import com.github.weisj.jsvg.geometry.util.GeometryUtil;
import com.github.weisj.jsvg.nodes.container.ContainerNode;
import com.github.weisj.jsvg.nodes.prototype.ShapedContainer;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.nodes.text.Text;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.MaskedPaint;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import com.github.weisj.jsvg.util.BlittableImage;
import com.github.weisj.jsvg.util.ImageUtil;
import com.github.weisj.jsvg.util.ShapeUtil;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/ClipPath.class */
@PermittedContent(categories = {Category.Animation, Category.Descriptive, Category.Shape}, anyOf = {Use.class, Text.class})
@ElementCategories({})
public final class ClipPath extends ContainerNode implements ShapedContainer<SVGNode> {
    public static final String TAG = "clippath";
    private boolean isValid;
    private UnitType clipPathUnits;

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    public boolean isValid() {
        return this.isValid;
    }

    @Override // com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        this.isValid = checkIsValid();
        this.clipPathUnits = (UnitType) attributeNode.getEnum("clipPathUnits", UnitType.UserSpaceOnUse);
    }

    private boolean checkIsValid() {
        SVGNode referenced;
        for (SVGNode child : children()) {
            if ((child instanceof Use) && (referenced = ((Use) child).referencedNode()) != null && !isAcceptableType(referenced)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public Shape clipShape(@NotNull RenderContext context, @NotNull Rectangle2D elementBounds, boolean useSoftClip) {
        Shape shape = super.elementShape(context);
        if (!useSoftClip && this.clipPathUnits == UnitType.ObjectBoundingBox) {
            shape = this.clipPathUnits.viewTransform(elementBounds).createTransformedShape(shape);
        }
        Area areaShape = new Area(shape);
        if (areaShape.isRectangular()) {
            return areaShape.getBounds();
        }
        return areaShape;
    }

    @NotNull
    public Paint createPaintForSoftClipping(@NotNull Output output, @NotNull RenderContext context, @NotNull Rectangle2D objectBounds, @NotNull Shape clipShape) {
        Rectangle2D transformedClipBounds = GeometryUtil.containingBoundsAfterTransform(this.clipPathUnits.viewTransform(objectBounds), clipShape.getBounds());
        BlittableImage blitImage = BlittableImage.create(ImageUtil::createLuminosityBuffer, context, output.clipBounds(), transformedClipBounds, objectBounds, this.clipPathUnits);
        Rectangle2D clipBoundsInUserSpace = blitImage.boundsInUserSpace();
        if (ShapeUtil.isInvalidArea(clipBoundsInUserSpace)) {
            return PaintParser.DEFAULT_COLOR;
        }
        blitImage.render(output, g -> {
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, blitImage.image().getWidth(), blitImage.image().getHeight());
            g.setColor(Color.WHITE);
            g.fill(clipShape);
        });
        Point2D.Double r0 = new Point2D.Double(clipBoundsInUserSpace.getX(), clipBoundsInUserSpace.getY());
        context.rootTransform().transform(r0, r0);
        return new MaskedPaint(PaintParser.DEFAULT_COLOR, blitImage.image().getRaster(), r0);
    }
}
