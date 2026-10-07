package com.github.weisj.jsvg.nodes.text;

import com.github.weisj.jsvg.nodes.Anchor;
import com.github.weisj.jsvg.nodes.prototype.HasContext;
import com.github.weisj.jsvg.nodes.prototype.HasGeometryContext;
import com.github.weisj.jsvg.nodes.prototype.impl.HasGeometryContextImpl;
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
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/text/Text.class */
@PermittedContent(categories = {Category.Animation, Category.Descriptive, Category.TextContentChild}, anyOf = {Anchor.class}, charData = true)
@ElementCategories({Category.Graphic, Category.TextContent})
public final class Text extends LinearTextContainer implements HasGeometryContext.ByDelegate {
    public static final String TAG = "text";
    private HasGeometryContext geometryContext;

    @Override // com.github.weisj.jsvg.nodes.text.LinearTextContainer, com.github.weisj.jsvg.nodes.prototype.Renderable
    public /* bridge */ /* synthetic */ void render(@NotNull RenderContext renderContext, @NotNull Output output) {
        super.render(renderContext, output);
    }

    @Override // com.github.weisj.jsvg.nodes.text.LinearTextContainer, com.github.weisj.jsvg.nodes.prototype.HasShape
    @NotNull
    public /* bridge */ /* synthetic */ Shape untransformedElementShape(@NotNull RenderContext renderContext) {
        return super.untransformedElementShape(renderContext);
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
    public /* bridge */ /* synthetic */ Set vectorEffects() {
        return super.vectorEffects();
    }

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    @Override // com.github.weisj.jsvg.nodes.text.LinearTextContainer, com.github.weisj.jsvg.nodes.text.TextContainer, com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        this.geometryContext = HasGeometryContextImpl.parse(attributeNode);
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.HasGeometryContext.ByDelegate
    @NotNull
    public HasGeometryContext geometryContextDelegate() {
        return this.geometryContext;
    }
}
