package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.geometry.size.Unit;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.AnimateTransform;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import com.github.weisj.jsvg.renderer.jdk.SVGRadialGradientPaint;
import java.awt.Color;
import java.awt.MultipleGradientPaint;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/RadialGradient.class */
@PermittedContent(categories = {Category.Descriptive}, anyOf = {Stop.class, Animate.class, AnimateTransform.class, Set.class})
@ElementCategories({Category.Gradient})
public final class RadialGradient extends AbstractGradient<RadialGradient> {
    public static final String TAG = "radialgradient";
    private Length cx;
    private Length cy;
    private Length r;
    private Length fr;
    private Length fx;
    private Length fy;

    @Override // com.github.weisj.jsvg.nodes.AbstractGradient, com.github.weisj.jsvg.attributes.paint.SVGPaint
    public /* bridge */ /* synthetic */ void drawShape(@NotNull Output output, @NotNull RenderContext renderContext, @NotNull Shape shape, @Nullable Rectangle2D rectangle2D) {
        super.drawShape(output, renderContext, shape, rectangle2D);
    }

    @Override // com.github.weisj.jsvg.nodes.AbstractGradient, com.github.weisj.jsvg.attributes.paint.SVGPaint
    public /* bridge */ /* synthetic */ void fillShape(@NotNull Output output, @NotNull RenderContext renderContext, @NotNull Shape shape, @Nullable Rectangle2D rectangle2D) {
        super.fillShape(output, renderContext, shape, rectangle2D);
    }

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.weisj.jsvg.nodes.AbstractGradient
    public void buildGradient(@NotNull AttributeNode attributeNode, @Nullable RadialGradient template) {
        this.cx = attributeNode.getLength("cx", template != null ? template.cx : Unit.PERCENTAGE.valueOf(50.0f));
        this.cy = attributeNode.getLength("cy", template != null ? template.cy : Unit.PERCENTAGE.valueOf(50.0f));
        this.r = attributeNode.getLength("r", template != null ? template.r : Unit.PERCENTAGE.valueOf(50.0f));
        this.fr = attributeNode.getLength("fr", template != null ? template.fr : Unit.PERCENTAGE.valueOf(0.0f));
        this.fx = attributeNode.getLength("fx", template != null ? template.fx : this.cx);
        this.fy = attributeNode.getLength("fy", template != null ? template.fy : this.cy);
    }

    @Override // com.github.weisj.jsvg.nodes.AbstractGradient
    @NotNull
    protected Paint gradientForBounds(@NotNull MeasureContext measure, @NotNull Rectangle2D bounds, float[] gradOffsets, @NotNull Color[] gradColors) {
        Point2D.Float center = new Point2D.Float(this.cx.resolveWidth(measure), this.cy.resolveHeight(measure));
        Point2D.Float focusCenter = new Point2D.Float(this.fx.resolveWidth(measure), this.fy.resolveHeight(measure));
        float radius = this.r.resolveLength(measure);
        float focusRadius = this.fr.resolveLength(measure);
        return new SVGRadialGradientPaint(center, radius, focusCenter, focusRadius, gradOffsets, gradColors, this.spreadMethod.cycleMethod(), MultipleGradientPaint.ColorSpaceType.SRGB, computeViewTransform(bounds));
    }

    @Override // com.github.weisj.jsvg.nodes.AbstractSVGNode
    public String toString() {
        return "RadialGradient{spreadMethod=" + this.spreadMethod + ", gradientTransform=" + this.gradientTransform + ", cx=" + this.cx + ", cy=" + this.cy + ", r=" + this.r + ", fr=" + this.fr + ", fx=" + this.fx + ", fy=" + this.fy + ", colors=" + Arrays.toString(colors()) + ", offsets=" + Arrays.toString(offsets()) + '}';
    }
}
