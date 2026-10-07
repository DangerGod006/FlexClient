package com.github.weisj.jsvg.renderer;

import com.github.weisj.jsvg.attributes.paint.AwtSVGPaint;
import com.github.weisj.jsvg.attributes.paint.SVGPaint;
import com.github.weisj.jsvg.nodes.prototype.Mutator;
import com.github.weisj.jsvg.parser.AttributeNode;
import java.awt.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/PaintContext.class */
public final class PaintContext implements Mutator<PaintContext> {

    @Nullable
    public final AwtSVGPaint color;

    @Nullable
    public final SVGPaint fillPaint;

    @Nullable
    public final SVGPaint strokePaint;
    public final float opacity;
    public final float fillOpacity;
    public final float strokeOpacity;

    @Nullable
    public final StrokeContext strokeContext;

    public PaintContext(@Nullable AwtSVGPaint color, @Nullable SVGPaint fillPaint, float fillOpacity, @Nullable SVGPaint strokePaint, float strokeOpacity, float opacity, @Nullable StrokeContext strokeContext) {
        this.color = color;
        this.fillPaint = fillPaint;
        this.strokePaint = strokePaint;
        this.fillOpacity = fillOpacity;
        this.strokeOpacity = strokeOpacity;
        this.opacity = opacity;
        this.strokeContext = (strokeContext == null || strokeContext.isTrivial()) ? null : strokeContext;
    }

    @NotNull
    public static PaintContext createDefault() {
        return new PaintContext(SVGPaint.DEFAULT_PAINT, SVGPaint.DEFAULT_PAINT, 1.0f, SVGPaint.NONE, 1.0f, 1.0f, StrokeContext.createDefault());
    }

    @NotNull
    public static PaintContext parse(@NotNull AttributeNode attributeNode) {
        return new PaintContext(parseColorAttribute(attributeNode), attributeNode.getPaint("fill"), attributeNode.getPercentage("fill-opacity", 1.0f), attributeNode.getPaint("stroke"), attributeNode.getPercentage("stroke-opacity", 1.0f), attributeNode.getPercentage("opacity", 1.0f), StrokeContext.parse(attributeNode));
    }

    @Nullable
    private static AwtSVGPaint parseColorAttribute(@NotNull AttributeNode attributeNode) {
        Color c = attributeNode.getColor("color", null);
        if (c == null) {
            return null;
        }
        return new AwtSVGPaint(c);
    }

    @NotNull
    public PaintContext derive(@NotNull PaintContext context) {
        StrokeContext strokeContextDerive;
        AwtSVGPaint awtSVGPaint = context.color != null ? context.color : this.color;
        SVGPaint sVGPaint = context.fillPaint != null ? context.fillPaint : this.fillPaint;
        float f = this.fillOpacity * context.fillOpacity;
        SVGPaint sVGPaint2 = context.strokePaint != null ? context.strokePaint : this.strokePaint;
        float f2 = this.strokeOpacity * context.strokeOpacity;
        float f3 = this.opacity * context.opacity;
        if (this.strokeContext != null) {
            strokeContextDerive = this.strokeContext.derive(context.strokeContext);
        } else {
            strokeContextDerive = context.strokeContext;
        }
        return new PaintContext(awtSVGPaint, sVGPaint, f, sVGPaint2, f2, f3, strokeContextDerive);
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.Mutator
    @NotNull
    public PaintContext mutate(@NotNull PaintContext element) {
        return element.derive(this);
    }

    public String toString() {
        return "PaintContext{color=" + this.color + ", fillPaint=" + this.fillPaint + ", strokePaint=" + this.strokePaint + ", opacity=" + this.opacity + ", fillOpacity=" + this.fillOpacity + ", strokeOpacity=" + this.strokeOpacity + ", strokeContext=" + this.strokeContext + '}';
    }
}
