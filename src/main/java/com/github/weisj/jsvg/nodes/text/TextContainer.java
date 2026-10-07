package com.github.weisj.jsvg.nodes.text;

import com.github.weisj.jsvg.attributes.PaintOrder;
import com.github.weisj.jsvg.attributes.VectorEffect;
import com.github.weisj.jsvg.attributes.font.AttributeFontSpec;
import com.github.weisj.jsvg.attributes.font.FontParser;
import com.github.weisj.jsvg.attributes.font.SVGFont;
import com.github.weisj.jsvg.attributes.text.LengthAdjust;
import com.github.weisj.jsvg.attributes.text.TextAnchor;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.nodes.container.BaseContainerNode;
import com.github.weisj.jsvg.nodes.prototype.HasContext;
import com.github.weisj.jsvg.nodes.prototype.HasShape;
import com.github.weisj.jsvg.nodes.prototype.HasVectorEffects;
import com.github.weisj.jsvg.nodes.prototype.Renderable;
import com.github.weisj.jsvg.nodes.prototype.impl.HasContextImpl;
import com.github.weisj.jsvg.nodes.text.TextSegment;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.NodeRenderer;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/text/TextContainer.class */
abstract class TextContainer extends BaseContainerNode<TextSegment> implements TextSegment.RenderableSegment, HasShape, HasContext.ByDelegate, HasVectorEffects, Renderable {
    private final List<TextSegment> segments = new ArrayList();
    private PaintOrder paintOrder;
    protected AttributeFontSpec fontSpec;
    protected LengthAdjust lengthAdjust;
    protected Length textLength;
    private boolean isVisible;
    private HasContext context;
    private Set<VectorEffect> vectorEffects;

    protected abstract GlyphCursor createLocalCursor(@NotNull RenderContext renderContext, @NotNull GlyphCursor glyphCursor);

    protected abstract void cleanUpLocalCursor(@NotNull GlyphCursor glyphCursor, @NotNull GlyphCursor glyphCursor2);

    TextContainer() {
    }

    @Override // com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    @MustBeInvokedByOverriders
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        this.paintOrder = PaintOrder.parse(attributeNode);
        this.fontSpec = FontParser.parseFontSpec(attributeNode);
        this.lengthAdjust = (LengthAdjust) attributeNode.getEnum("lengthAdjust", LengthAdjust.Spacing);
        this.textLength = attributeNode.getLength("textLength", Length.UNSPECIFIED);
        if (this.textLength.raw() < 0.0f) {
            this.textLength = Length.UNSPECIFIED;
        }
        this.isVisible = parseIsVisible(attributeNode);
        this.context = HasContextImpl.parse(attributeNode);
        this.vectorEffects = VectorEffect.parse(attributeNode);
    }

    @NotNull
    public Set<VectorEffect> vectorEffects() {
        return this.vectorEffects;
    }

    @NotNull
    public HasContext contextDelegate() {
        return this.context;
    }

    @Override // com.github.weisj.jsvg.nodes.container.BaseContainerNode
    protected boolean acceptChild(@Nullable String id, @NotNull SVGNode node) {
        return node instanceof TextSegment;
    }

    @Override // com.github.weisj.jsvg.nodes.container.BaseContainerNode
    protected void doAdd(@NotNull SVGNode node) {
        this.segments.add((TextSegment) node);
    }

    @Override // com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public final void addContent(char[] content) {
        if (content.length == 0) {
            return;
        }
        this.segments.add(new StringTextSegment(this, this.segments.size(), content));
    }

    public List<? extends TextSegment> children() {
        return this.segments;
    }

    protected final void renderSegment(@NotNull GlyphCursor cursor, @NotNull RenderContext context, @NotNull Output output) {
        prepareSegmentForRendering(cursor, context);
        double offset = textAnchorOffset(context.fontRenderContext().textAnchor(), cursor);
        context.translate(output, -offset, 0.0d);
        renderSegmentWithoutLayout(cursor, context, output);
    }

    private double textAnchorOffset(@NotNull TextAnchor textAnchor, @NotNull GlyphCursor glyphCursor) {
        switch (textAnchor) {
            case Start:
            default:
                return 0.0d;
            case Middle:
                return glyphCursor.completeGlyphRunBounds.getWidth() / 2.0d;
            case End:
                return glyphCursor.completeGlyphRunBounds.getWidth();
        }
    }

    private void forEachSegment(@NotNull RenderContext context, @NotNull BiConsumer<StringTextSegment, RenderContext> onStringTextSegment, @NotNull BiConsumer<TextSegment.RenderableSegment, RenderContext> onRenderableSegment) {
        for (TextSegment segment : children()) {
            RenderContext currentContext = context;
            if (segment instanceof Renderable) {
                currentContext = NodeRenderer.setupRenderContext(segment, context);
            }
            if (segment instanceof StringTextSegment) {
                onStringTextSegment.accept((StringTextSegment) segment, currentContext);
            } else if (segment instanceof TextSegment.RenderableSegment) {
                onRenderableSegment.accept((TextSegment.RenderableSegment) segment, currentContext);
            } else {
                throw new IllegalStateException("Unexpected segment " + segment);
            }
        }
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/text/TextContainer$IntermediateTextMetrics.class */
    private static final class IntermediateTextMetrics {
        double letterSpacingLength;
        double glyphLength;
        double fixedGlyphLength;
        int glyphCount;
        int controllableLetterSpacingCount;

        private IntermediateTextMetrics() {
            this.letterSpacingLength = 0.0d;
            this.glyphLength = 0.0d;
            this.fixedGlyphLength = 0.0d;
            this.glyphCount = 0;
            this.controllableLetterSpacingCount = 0;
        }
    }

    @NotNull
    public TextMetrics computeTextMetrics(@NotNull RenderContext context, @NotNull TextSegment.RenderableSegment.UseTextLengthForCalculation flag) {
        if (flag == TextSegment.RenderableSegment.UseTextLengthForCalculation.YES && hasFixedLength()) {
            return new TextMetrics(0.0d, 0.0d, 0, this.textLength.resolveLength(context.measureContext()), 0);
        }
        SVGFont font = context.font();
        float letterSpacing = context.fontRenderContext().letterSpacing().resolveLength(context.measureContext());
        IntermediateTextMetrics metrics = new IntermediateTextMetrics();
        int index = 0;
        for (TextSegment segment : children()) {
            RenderContext currentContext = context;
            if (segment instanceof Renderable) {
                currentContext = NodeRenderer.setupRenderContext(segment, context);
            }
            if (segment instanceof StringTextSegment) {
                StringTextSegment stringTextSegment = (StringTextSegment) segment;
                accumulateSegmentMetrics(metrics, stringTextSegment, font, letterSpacing, index);
            } else if (segment instanceof TextSegment.RenderableSegment) {
                accumulateRenderableSegmentMetrics((TextSegment.RenderableSegment) segment, metrics, currentContext);
            } else {
                throw new IllegalStateException("Unexpected segment " + segment);
            }
            index++;
        }
        return new TextMetrics(metrics.letterSpacingLength, metrics.glyphLength, metrics.glyphCount, metrics.fixedGlyphLength, metrics.controllableLetterSpacingCount);
    }

    private void accumulateRenderableSegmentMetrics(@NotNull TextSegment.RenderableSegment segment, @NotNull IntermediateTextMetrics metrics, @NotNull RenderContext currentContext) {
        TextMetrics textMetrics = segment.computeTextMetrics(currentContext, TextSegment.RenderableSegment.UseTextLengthForCalculation.YES);
        metrics.letterSpacingLength += textMetrics.letterSpacingLength();
        metrics.glyphLength += textMetrics.glyphLength();
        metrics.glyphCount += textMetrics.glyphCount();
        metrics.fixedGlyphLength += textMetrics.fixedGlyphLength();
        metrics.controllableLetterSpacingCount += textMetrics.controllableLetterSpacingCount();
    }

    private void accumulateSegmentMetrics(@NotNull IntermediateTextMetrics metrics, @NotNull StringTextSegment segment, @NotNull SVGFont font, float letterSpacing, int index) {
        int glyphCount = segment.codepoints().length;
        boolean lastSegment = index == children().size() - 1;
        int whiteSpaceCount = lastSegment ? glyphCount - 1 : glyphCount;
        metrics.glyphCount += glyphCount;
        metrics.letterSpacingLength += (double) (whiteSpaceCount * letterSpacing);
        metrics.controllableLetterSpacingCount += whiteSpaceCount;
        for (char codepoint : segment.codepoints()) {
            metrics.glyphLength += (double) font.codepointGlyph(codepoint).advance();
        }
    }

    public boolean hasFixedLength() {
        return this.textLength.isSpecified();
    }

    public void renderSegmentWithoutLayout(@NotNull GlyphCursor cursor, @NotNull RenderContext context, @NotNull Output output) {
        forEachSegment(context, (segment, ctx) -> {
            if (isVisible(ctx)) {
                GlyphRenderer.renderGlyphRun(output, this.paintOrder, vectorEffects(), segment, cursor.completeGlyphRunBounds);
            }
        }, (segment2, ctx2) -> {
            segment2.renderSegmentWithoutLayout(cursor, ctx2, output);
        });
    }

    public void prepareSegmentForRendering(@NotNull GlyphCursor cursor, @NotNull RenderContext context) {
        SVGFont font = context.font();
        GlyphCursor localCursor = createLocalCursor(context, cursor);
        localCursor.setAdvancement(localGlyphAdvancement(context, cursor));
        forEachSegment(context, (segment, ctx) -> {
            GlyphRenderer.prepareGlyphRun(segment, localCursor, font, ctx);
        }, (segment2, ctx2) -> {
            segment2.prepareSegmentForRendering(localCursor, ctx2);
        });
        cleanUpLocalCursor(cursor, localCursor);
    }

    public void appendTextShape(@NotNull GlyphCursor cursor, @NotNull Path2D textShape, @NotNull RenderContext context) {
        SVGFont font = context.font();
        GlyphCursor localCursor = createLocalCursor(context, cursor);
        localCursor.setAdvancement(localGlyphAdvancement(context, cursor));
        forEachSegment(context, (segment, ctx) -> {
            textShape.append(GlyphRenderer.layoutGlyphRun(segment, localCursor, font, ctx.measureContext(), ctx.fontRenderContext()), false);
        }, (segment2, ctx2) -> {
            segment2.appendTextShape(localCursor, textShape, ctx2);
        });
        cleanUpLocalCursor(cursor, localCursor);
    }

    @NotNull
    private GlyphAdvancement localGlyphAdvancement(@NotNull RenderContext context, @NotNull GlyphCursor cursor) {
        if (hasFixedLength()) {
            return new GlyphAdvancement(computeTextMetrics(context, TextSegment.RenderableSegment.UseTextLengthForCalculation.NO), this.textLength.resolveWidth(context.measureContext()), this.lengthAdjust);
        }
        return cursor.advancement();
    }

    @NotNull
    public Rectangle2D untransformedElementBounds(@NotNull RenderContext context) {
        return untransformedElementShape(context).getBounds2D();
    }

    public boolean isVisible(@NotNull RenderContext context) {
        return this.isVisible;
    }
}
