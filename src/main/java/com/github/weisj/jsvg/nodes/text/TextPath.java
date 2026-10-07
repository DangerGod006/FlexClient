package com.github.weisj.jsvg.nodes.text;

import com.github.weisj.jsvg.attributes.FillRule;
import com.github.weisj.jsvg.attributes.text.GlyphRenderMethod;
import com.github.weisj.jsvg.attributes.text.Side;
import com.github.weisj.jsvg.attributes.text.Spacing;
import com.github.weisj.jsvg.geometry.SVGShape;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.geometry.util.ReversePathIterator;
import com.github.weisj.jsvg.nodes.Anchor;
import com.github.weisj.jsvg.nodes.Path;
import com.github.weisj.jsvg.nodes.ShapeNode;
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
import com.github.weisj.jsvg.util.PathUtil;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/text/TextPath.class */
@PermittedContent(categories = {Category.Descriptive}, anyOf = {Anchor.class, TextSpan.class, Animate.class, AnimateTransform.class, Set.class}, charData = true)
@ElementCategories({Category.Graphic, Category.TextContent, Category.TextContentChild})
public final class TextPath extends TextContainer {
    public static final String TAG = "textpath";
    private static final boolean DEBUG = false;
    private SVGShape pathShape;
    private Spacing spacing;
    private GlyphRenderMethod renderMethod;
    private Side side;
    private Length startOffset;

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

    @Override // com.github.weisj.jsvg.nodes.text.TextContainer, com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        this.renderMethod = (GlyphRenderMethod) attributeNode.getEnum("method", GlyphRenderMethod.Align);
        this.side = (Side) attributeNode.getEnum("side", Side.Left);
        this.spacing = (Spacing) attributeNode.getEnum("spacing", Spacing.Auto);
        this.startOffset = attributeNode.getLength("startOffset", 0.0f);
        String pathData = attributeNode.getValue(Path.TAG);
        if (pathData != null) {
            this.pathShape = PathUtil.parseFromPathData(pathData, FillRule.EvenOdd);
            return;
        }
        String href = attributeNode.getHref();
        ShapeNode shaped = (ShapeNode) attributeNode.getElementByHref(ShapeNode.class, Category.Shape, href);
        if (shaped != null) {
            this.pathShape = shaped.shape();
        }
    }

    @Override // com.github.weisj.jsvg.nodes.text.TextContainer, com.github.weisj.jsvg.nodes.prototype.Renderable
    public boolean isVisible(@NotNull RenderContext context) {
        return this.pathShape != null && super.isVisible(context);
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.HasShape
    @NotNull
    public Shape untransformedElementShape(@NotNull RenderContext context) {
        Path2D.Float r0 = new Path2D.Float();
        appendTextShape(createCursor(context), r0, context);
        return r0;
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.Renderable
    public void render(@NotNull RenderContext context, @NotNull Output output) {
        renderSegment(createCursor(context), context, output);
    }

    @NotNull
    private PathGlyphCursor createCursor(@NotNull RenderContext context) {
        return new PathGlyphCursor(createPathIterator(context), this.startOffset.resolveLength(context.measureContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: paintDebugPath, reason: merged with bridge method [inline-methods] */
    public void lambda$render$0(@NotNull RenderContext context, @NotNull Graphics2D g) {
        PathIterator pathIterator = createPathIterator(context);
        float startX = 0.0f;
        float startY = 0.0f;
        float curX = 0.0f;
        float curY = 0.0f;
        g.setStroke(new BasicStroke(0.5f));
        float[] cord = new float[2];
        while (!pathIterator.isDone()) {
            switch (pathIterator.currentSegment(cord)) {
                case 0:
                    curX = cord[0];
                    curY = cord[1];
                    startX = curX;
                    startY = curY;
                    break;
                case 1:
                    g.setColor(Color.MAGENTA);
                    g.draw(new Line2D.Float(curX, curY, cord[0], cord[1]));
                    g.setColor(Color.RED);
                    g.fillRect(((int) curX) - 2, ((int) curY) - 2, 4, 4);
                    g.fillRect(((int) cord[0]) - 2, ((int) cord[1]) - 2, 4, 4);
                    curX = cord[0];
                    curY = cord[1];
                    break;
                case 2:
                case 3:
                default:
                    throw new IllegalStateException();
                case 4:
                    g.setColor(Color.MAGENTA);
                    g.draw(new Line2D.Float(curX, curY, startX, startY));
                    g.setColor(Color.RED);
                    g.fillRect(((int) curX) - 2, ((int) curY) - 2, 4, 4);
                    g.fillRect(((int) startX) - 2, ((int) startY) - 2, 4, 4);
                    curX = startX;
                    curY = startY;
                    break;
            }
            pathIterator.next();
        }
    }

    @NotNull
    private PathIterator createPathIterator(@NotNull RenderContext context) {
        MeasureContext measureContext = context.measureContext();
        Shape path = this.pathShape.shape(context);
        float flatness = 0.1f * measureContext.ex();
        switch (this.side) {
            case Left:
                return path.getPathIterator((AffineTransform) null, flatness);
            case Right:
                return new ReversePathIterator(path.getPathIterator((AffineTransform) null, flatness));
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.github.weisj.jsvg.nodes.text.TextContainer
    protected GlyphCursor createLocalCursor(@NotNull RenderContext context, @NotNull GlyphCursor current) {
        return new PathGlyphCursor(current, this.startOffset.resolveLength(context.measureContext()), createPathIterator(context));
    }

    @Override // com.github.weisj.jsvg.nodes.text.TextContainer
    protected void cleanUpLocalCursor(@NotNull GlyphCursor current, @NotNull GlyphCursor local) {
        current.updateFrom(local);
    }
}
