package com.github.weisj.jsvg.nodes.text;

import com.github.weisj.jsvg.nodes.Anchor;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.AnimateTransform;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.prototype.HasContext;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.nodes.text.TextSegment;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.util.List;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/text/TextSpan.class */
@PermittedContent(categories = {Category.Descriptive}, anyOf = {Anchor.class, TextSpan.class, Animate.class, AnimateTransform.class, Set.class}, charData = true)
@ElementCategories({Category.TextContent, Category.TextContentChild})
public final class TextSpan extends LinearTextContainer {
    public static final String TAG = "tspan";

    @Override // com.github.weisj.jsvg.nodes.text.LinearTextContainer, com.github.weisj.jsvg.nodes.prototype.Renderable
    public /* bridge */ /* synthetic */ void render(@NotNull RenderContext renderContext, @NotNull Output output) {
        super.render(renderContext, output);
    }

    @Override // com.github.weisj.jsvg.nodes.text.LinearTextContainer, com.github.weisj.jsvg.nodes.prototype.HasShape
    @NotNull
    public /* bridge */ /* synthetic */ Shape untransformedElementShape(@NotNull RenderContext renderContext) {
        return super.untransformedElementShape(renderContext);
    }

    @Override // com.github.weisj.jsvg.nodes.text.LinearTextContainer, com.github.weisj.jsvg.nodes.text.TextContainer, com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    @MustBeInvokedByOverriders
    public /* bridge */ /* synthetic */ void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
    }

    @Override // com.github.weisj.jsvg.nodes.text.TextContainer, com.github.weisj.jsvg.nodes.prototype.Renderable
    public /* bridge */ /* synthetic */ boolean isVisible(@NotNull RenderContext renderContext) {
        return super.isVisible(renderContext);
    }

    @Override // com.github.weisj.jsvg.nodes.text.TextContainer, com.github.weisj.jsvg.nodes.prototype.HasShape
    @NotNull
    public /* bridge */ /* synthetic */ Rectangle2D untransformedElementBounds(@NotNull RenderContext renderContext) {
        return super.untransformedElementBounds(renderContext);
    }

    @Override // com.github.weisj.jsvg.nodes.text.TextContainer, com.github.weisj.jsvg.nodes.text.TextSegment.RenderableSegment
    public /* bridge */ /* synthetic */ void appendTextShape(@NotNull GlyphCursor glyphCursor, @NotNull Path2D path2D, @NotNull RenderContext renderContext) {
        super.appendTextShape(glyphCursor, path2D, renderContext);
    }

    @Override // com.github.weisj.jsvg.nodes.text.TextContainer, com.github.weisj.jsvg.nodes.text.TextSegment.RenderableSegment
    public /* bridge */ /* synthetic */ void prepareSegmentForRendering(@NotNull GlyphCursor glyphCursor, @NotNull RenderContext renderContext) {
        super.prepareSegmentForRendering(glyphCursor, renderContext);
    }

    @Override // com.github.weisj.jsvg.nodes.text.TextContainer, com.github.weisj.jsvg.nodes.text.TextSegment.RenderableSegment
    public /* bridge */ /* synthetic */ void renderSegmentWithoutLayout(@NotNull GlyphCursor glyphCursor, @NotNull RenderContext renderContext, @NotNull Output output) {
        super.renderSegmentWithoutLayout(glyphCursor, renderContext, output);
    }

    @Override // com.github.weisj.jsvg.nodes.text.TextContainer, com.github.weisj.jsvg.nodes.text.TextSegment.RenderableSegment
    public /* bridge */ /* synthetic */ boolean hasFixedLength() {
        return super.hasFixedLength();
    }

    @Override // com.github.weisj.jsvg.nodes.text.TextContainer, com.github.weisj.jsvg.nodes.text.TextSegment.RenderableSegment
    @NotNull
    public /* bridge */ /* synthetic */ TextMetrics computeTextMetrics(@NotNull RenderContext renderContext, @NotNull TextSegment.RenderableSegment.UseTextLengthForCalculation useTextLengthForCalculation) {
        return super.computeTextMetrics(renderContext, useTextLengthForCalculation);
    }

    @Override // com.github.weisj.jsvg.nodes.text.TextContainer, com.github.weisj.jsvg.nodes.prototype.Container
    public /* bridge */ /* synthetic */ List children() {
        return super.children();
    }

    @Override // com.github.weisj.jsvg.nodes.text.TextContainer, com.github.weisj.jsvg.nodes.prototype.HasContext.ByDelegate
    @NotNull
    public /* bridge */ /* synthetic */ HasContext contextDelegate() {
        return super.contextDelegate();
    }

    @Override // com.github.weisj.jsvg.nodes.text.TextContainer, com.github.weisj.jsvg.nodes.prototype.HasVectorEffects
    @NotNull
    public /* bridge */ /* synthetic */ java.util.Set vectorEffects() {
        return super.vectorEffects();
    }

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }
}
