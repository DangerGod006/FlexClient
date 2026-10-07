package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.SpreadMethod;
import com.github.weisj.jsvg.attributes.UnitType;
import com.github.weisj.jsvg.attributes.paint.PaintParser;
import com.github.weisj.jsvg.attributes.paint.SVGPaint;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.AbstractGradient;
import com.github.weisj.jsvg.nodes.container.ContainerNode;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/AbstractGradient.class */
abstract class AbstractGradient<Self extends AbstractGradient<Self>> extends ContainerNode implements SVGPaint {
    protected AffineTransform gradientTransform;
    protected UnitType gradientUnits;
    protected SpreadMethod spreadMethod;

    @NotNull
    private Color[] colors;
    private float[] offsets;

    protected abstract void buildGradient(@NotNull AttributeNode attributeNode, @Nullable Self self);

    @NotNull
    protected abstract Paint gradientForBounds(@NotNull MeasureContext measureContext, @NotNull Rectangle2D rectangle2D, float[] fArr, @NotNull Color[] colorArr);

    AbstractGradient() {
    }

    public final float[] offsets() {
        return this.offsets;
    }

    @NotNull
    public final Color[] colors() {
        return this.colors;
    }

    @Override // com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public final void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        AbstractGradient<?> template = parseTemplate(attributeNode);
        this.gradientUnits = (UnitType) attributeNode.getEnum("gradientUnits", template != null ? template.gradientUnits : UnitType.ObjectBoundingBox);
        this.spreadMethod = (SpreadMethod) attributeNode.getEnum("spreadMethod", template != null ? template.spreadMethod : SpreadMethod.Pad);
        this.gradientTransform = attributeNode.parseTransform("gradientTransform");
        if (this.gradientTransform == null && template != null) {
            this.gradientTransform = template.gradientTransform;
        }
        List<Stop> stops = childrenOfType(Stop.class);
        if (stops.isEmpty() && template != null) {
            this.colors = template.colors();
            this.offsets = template.offsets();
        } else {
            parseStops(stops);
        }
        buildGradient(attributeNode, getClass().isInstance(template) ? template : null);
        children().clear();
    }

    private void parseStops(@NotNull List<Stop> stops) {
        stops.sort((s1, s2) -> {
            return Float.compare(s1.offset(), s2.offset());
        });
        this.colors = new Color[stops.size()];
        this.offsets = new float[stops.size()];
        boolean realGradient = false;
        for (int i = 0; i < this.offsets.length; i++) {
            Stop stop = stops.get(i);
            float stopOffset = Math.max(0.0f, Math.min(1.0f, stop.offset()));
            Color stopColor = stop.color();
            if (i > 0) {
                realGradient = realGradient || stopOffset > stops.get(i - 1).offset() || !stopColor.equals(this.colors[i - 1]);
                if (stopOffset <= this.offsets[i - 1]) {
                    stopOffset = Math.nextAfter(this.offsets[i - 1], Double.MAX_VALUE);
                }
            }
            this.offsets[i] = stopOffset;
            this.colors[i] = stopColor;
        }
        if (this.offsets[this.offsets.length - 1] > 1.0f) {
            float diff = this.offsets[this.offsets.length - 1] - 1.0f;
            this.offsets[this.offsets.length - 1] = 1.0f;
            int i2 = this.offsets.length - 2;
            while (i2 >= 0 && this.offsets[i2] >= this.offsets[i2 + 1]) {
                float[] fArr = this.offsets;
                fArr[i2] = fArr[i2] - diff;
            }
        }
        if (!realGradient && this.colors.length > 0) {
            this.colors = new Color[]{this.colors[0]};
            this.offsets = new float[]{0.0f};
            return;
        }
        int offsetLength = this.offsets.length;
        int off = 0;
        boolean fixFirst = false;
        boolean fixLast = false;
        if (this.offsets[0] != 0.0f) {
            fixFirst = true;
            offsetLength++;
            off = 0 + 1;
        }
        if (this.offsets[this.offsets.length - 1] != 1.0f) {
            fixLast = true;
            offsetLength++;
        }
        float[] oldOffsets = this.offsets;
        Color[] oldColors = this.colors;
        this.offsets = new float[offsetLength];
        this.colors = new Color[offsetLength];
        System.arraycopy(oldOffsets, 0, this.offsets, off, oldOffsets.length);
        System.arraycopy(oldColors, 0, this.colors, off, oldColors.length);
        if (fixFirst) {
            this.offsets[0] = 0.0f;
            this.colors[0] = oldColors[0];
        }
        if (fixLast) {
            this.offsets[offsetLength - 1] = 1.0f;
            this.colors[offsetLength - 1] = oldColors[oldColors.length - 1];
        }
    }

    @Nullable
    private AbstractGradient<?> parseTemplate(@NotNull AttributeNode attributeNode) {
        AbstractGradient<?> template = (AbstractGradient) attributeNode.getElementByHref(AbstractGradient.class, attributeNode.getHref());
        if (template != this) {
            return template;
        }
        return null;
    }

    @Override // com.github.weisj.jsvg.attributes.paint.SVGPaint
    public void fillShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
        Rectangle2D b = bounds != null ? bounds : shape.getBounds2D();
        output.setPaint(() -> {
            return paintForBounds(context.measureContext(), b);
        });
        output.fillShape(shape);
    }

    @Override // com.github.weisj.jsvg.attributes.paint.SVGPaint
    public void drawShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
        Rectangle2D b = bounds != null ? bounds : shape.getBounds2D();
        output.setPaint(() -> {
            return paintForBounds(context.measureContext(), b);
        });
        output.drawShape(shape);
    }

    @NotNull
    private Paint paintForBounds(@NotNull MeasureContext context, @NotNull Rectangle2D bounds) {
        Paint[] paintArrColors = colors();
        return paintArrColors.length == 0 ? PaintParser.DEFAULT_COLOR : paintArrColors.length == 1 ? paintArrColors[0] : gradientForBounds(this.gradientUnits.deriveMeasure(context), bounds, offsets(), paintArrColors);
    }

    @NotNull
    protected final AffineTransform computeViewTransform(@NotNull Rectangle2D bounds) {
        AffineTransform viewTransform = this.gradientUnits.viewTransform(bounds);
        if (this.gradientTransform != null) {
            viewTransform.concatenate(this.gradientTransform);
        }
        return viewTransform;
    }
}
