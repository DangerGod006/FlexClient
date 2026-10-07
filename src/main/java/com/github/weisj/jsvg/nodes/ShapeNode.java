package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.PaintOrder;
import com.github.weisj.jsvg.attributes.VectorEffect;
import com.github.weisj.jsvg.attributes.font.FontParser;
import com.github.weisj.jsvg.attributes.font.FontSize;
import com.github.weisj.jsvg.attributes.font.MeasurableFontSpec;
import com.github.weisj.jsvg.geometry.MeasurableShape;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.prototype.HasFontContext;
import com.github.weisj.jsvg.nodes.prototype.HasPaintContext;
import com.github.weisj.jsvg.nodes.prototype.HasShape;
import com.github.weisj.jsvg.nodes.prototype.HasVectorEffects;
import com.github.weisj.jsvg.nodes.prototype.Instantiator;
import com.github.weisj.jsvg.nodes.prototype.Mutator;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.PaintContext;
import com.github.weisj.jsvg.renderer.RenderContext;
import com.github.weisj.jsvg.renderer.ShapeRenderer;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/ShapeNode.class */
public abstract class ShapeNode extends RenderableSVGNode implements HasShape, HasPaintContext, HasFontContext, HasVectorEffects, Instantiator {
    private PaintOrder paintOrder;
    private PaintContext paintContext;
    private FontSize fontSize;
    private Length fontSizeAdjust;
    private Length pathLength;
    private MeasurableShape shape;
    private Marker markerStart;
    private Marker markerMid;
    private Marker markerEnd;
    private Set<VectorEffect> vectorEffects;

    @NotNull
    protected abstract MeasurableShape buildShape(@NotNull AttributeNode attributeNode);

    @Override // com.github.weisj.jsvg.nodes.prototype.HasPaintContext
    @NotNull
    public PaintContext paintContext() {
        return this.paintContext;
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.HasFontContext
    @NotNull
    public Mutator<MeasurableFontSpec> fontSpec() {
        return s -> {
            return s.withFontSize(this.fontSize, this.fontSizeAdjust);
        };
    }

    @NotNull
    public MeasurableShape shape() {
        return this.shape;
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.HasVectorEffects
    @NotNull
    public Set<VectorEffect> vectorEffects() {
        return this.vectorEffects;
    }

    @Override // com.github.weisj.jsvg.nodes.RenderableSVGNode, com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public final void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        this.paintOrder = PaintOrder.parse(attributeNode);
        this.paintContext = PaintContext.parse(attributeNode);
        this.fontSize = FontParser.parseFontSize(attributeNode);
        this.fontSizeAdjust = FontParser.parseSizeAdjust(attributeNode);
        this.shape = buildShape(attributeNode);
        this.pathLength = attributeNode.getLength("pathLength", Length.UNSPECIFIED);
        Marker template = (Marker) attributeNode.getElementByHref(Marker.class, attributeNode.getValue(Marker.TAG));
        this.markerStart = (Marker) attributeNode.getElementByHref(Marker.class, attributeNode.getValue("marker-start"));
        if (this.markerStart == null) {
            this.markerStart = template;
        }
        this.markerMid = (Marker) attributeNode.getElementByHref(Marker.class, attributeNode.getValue("marker-mid"));
        if (this.markerMid == null) {
            this.markerMid = template;
        }
        this.markerEnd = (Marker) attributeNode.getElementByHref(Marker.class, attributeNode.getValue("marker-end"));
        if (this.markerEnd == null) {
            this.markerEnd = template;
        }
        this.vectorEffects = VectorEffect.parse(attributeNode);
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.HasShape
    @NotNull
    public Shape untransformedElementShape(@NotNull RenderContext context) {
        return this.shape.shape(context);
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.HasShape
    @NotNull
    public Rectangle2D untransformedElementBounds(@NotNull RenderContext context) {
        return this.shape.bounds(context, true);
    }

    @Override // com.github.weisj.jsvg.nodes.RenderableSVGNode, com.github.weisj.jsvg.nodes.prototype.Renderable
    public boolean isVisible(@NotNull RenderContext context) {
        return super.isVisible(context);
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.Instantiator
    public boolean canInstantiate(@NotNull SVGNode node) {
        return node instanceof Marker;
    }

    @NotNull
    private Stroke computeEffectiveStroke(@NotNull RenderContext context) {
        MeasureContext measureContext = context.measureContext();
        float pathLengthFactor = 1.0f;
        if (this.pathLength.isSpecified()) {
            double effectiveLength = this.pathLength.resolveLength(measureContext);
            double actualLength = this.shape.pathLength(measureContext);
            pathLengthFactor = (float) (actualLength / effectiveLength);
        }
        return context.stroke(pathLengthFactor);
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.Renderable
    public final void render(@NotNull RenderContext context, @NotNull Output output) {
        Rectangle2D rectangle2DBounds;
        Shape paintShape = this.shape.shape(context);
        if (this.shape.usesOptimizedBoundsCalculation()) {
            rectangle2DBounds = this.shape.bounds(context, false);
        } else {
            rectangle2DBounds = null;
        }
        Rectangle2D bounds = rectangle2DBounds;
        Stroke effectiveStroke = computeEffectiveStroke(context);
        ShapeRenderer.renderWithPaintOrder(output, this.shape.canBeFilled(), this.paintOrder, new ShapeRenderer.ShapePaintContext(context, vectorEffects(), effectiveStroke, transform()), new ShapeRenderer.PaintShape(paintShape, bounds), new ShapeRenderer.ShapeMarkerInfo(this, this.markerStart, this.markerMid, this.markerEnd, shouldPaintStartEndMarkersInMiddle()));
    }

    protected boolean shouldPaintStartEndMarkersInMiddle() {
        return true;
    }
}
