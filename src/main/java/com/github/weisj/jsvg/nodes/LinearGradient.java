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
import java.awt.Color;
import java.awt.LinearGradientPaint;
import java.awt.MultipleGradientPaint;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/LinearGradient.class */
@PermittedContent(categories = {Category.Descriptive}, anyOf = {Stop.class, Animate.class, AnimateTransform.class, Set.class})
@ElementCategories({Category.Gradient})
public final class LinearGradient extends AbstractGradient<LinearGradient> {
    public static final String TAG = "lineargradient";
    private Length x1;
    private Length x2;
    private Length y1;
    private Length y2;

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
    public void buildGradient(@NotNull AttributeNode attributeNode, @Nullable LinearGradient template) {
        this.x1 = attributeNode.getLength("x1", template != null ? template.x1 : Unit.PERCENTAGE.valueOf(0.0f));
        this.x2 = attributeNode.getLength("x2", template != null ? template.x2 : Unit.PERCENTAGE.valueOf(100.0f));
        this.y1 = attributeNode.getLength("y1", template != null ? template.y1 : Unit.PERCENTAGE.valueOf(0.0f));
        this.y2 = attributeNode.getLength("y2", template != null ? template.y2 : Unit.PERCENTAGE.valueOf(0.0f));
    }

    @Override // com.github.weisj.jsvg.nodes.AbstractGradient
    @NotNull
    protected Paint gradientForBounds(@NotNull MeasureContext measure, @NotNull Rectangle2D bounds, float[] gradOffsets, @NotNull Color[] gradColors) {
        Point2D.Float pt1 = new Point2D.Float(this.x1.resolveWidth(measure), this.y1.resolveHeight(measure));
        Point2D.Float pt2 = new Point2D.Float(this.x2.resolveWidth(measure), this.y2.resolveHeight(measure));
        return pt1.equals(pt2) ? gradColors[0] : new LinearGradientPaint(pt1, pt2, gradOffsets, gradColors, this.spreadMethod.cycleMethod(), MultipleGradientPaint.ColorSpaceType.SRGB, computeViewTransform(bounds));
    }

    @Override // com.github.weisj.jsvg.nodes.AbstractSVGNode
    public String toString() {
        return "LinearGradient{spreadMethod=" + this.spreadMethod + ", gradientTransform=" + this.gradientTransform + ", x1=" + this.x1 + ", x2=" + this.x2 + ", y1=" + this.y1 + ", y2=" + this.y2 + ", colors=" + Arrays.toString(colors()) + ", offsets=" + Arrays.toString(offsets()) + '}';
    }
}
