package com.github.weisj.jsvg.nodes.text;

import com.github.weisj.jsvg.attributes.PaintOrder;
import com.github.weisj.jsvg.attributes.VectorEffect;
import com.github.weisj.jsvg.attributes.font.SVGFont;
import com.github.weisj.jsvg.attributes.text.DominantBaseline;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.renderer.FontRenderContext;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import com.github.weisj.jsvg.renderer.ShapeRenderer;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/text/GlyphRenderer.class */
final class GlyphRenderer {
    private static final boolean DEBUG = false;
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !GlyphRenderer.class.desiredAssertionStatus();
    }

    private GlyphRenderer() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void prepareGlyphRun(@NotNull StringTextSegment segment, @NotNull GlyphCursor cursor, @NotNull SVGFont font, @NotNull RenderContext context) {
        MeasureContext measure = context.measureContext();
        Shape glyphRun = layoutGlyphRun(segment, cursor, font, measure, context.fontRenderContext());
        Rectangle2D bounds = glyphRun.getBounds2D();
        if (Length.isUnspecified((float) cursor.completeGlyphRunBounds.getX())) {
            cursor.completeGlyphRunBounds.setRect(bounds);
        } else {
            Rectangle2D.union(cursor.completeGlyphRunBounds, bounds, cursor.completeGlyphRunBounds);
        }
        segment.currentGlyphRun = glyphRun;
        segment.currentRenderContext = context;
    }

    static void renderGlyphRun(@NotNull Output output, @NotNull PaintOrder paintOrder, @NotNull Set<VectorEffect> vectorEffects, @NotNull StringTextSegment segment, @NotNull Rectangle2D completeGlyphRunBounds) {
        RenderContext context = segment.currentRenderContext;
        if (!$assertionsDisabled && context == null) {
            throw new AssertionError();
        }
        Shape glyphRun = segment.currentGlyphRun;
        if (!$assertionsDisabled && glyphRun == null) {
            throw new AssertionError();
        }
        Stroke stroke = context.stroke(1.0f);
        ShapeRenderer.renderWithPaintOrder(output, true, paintOrder, new ShapeRenderer.ShapePaintContext(context, vectorEffects, stroke, null), new ShapeRenderer.PaintShape(glyphRun, completeGlyphRunBounds), null);
        segment.currentRenderContext = null;
        segment.currentGlyphRun = null;
    }

    static Shape layoutGlyphRun(@NotNull StringTextSegment segment, @NotNull GlyphCursor cursor, @NotNull SVGFont font, @NotNull MeasureContext measure, @NotNull FontRenderContext fontRenderContext) {
        float letterSpacing = fontRenderContext.letterSpacing().resolveLength(measure);
        Path2D.Float r0 = new Path2D.Float();
        boolean isLastSegment = segment.isLastSegmentInParent();
        boolean shouldSkipLastSpacing = isLastSegment && cursor.advancement().shouldSkipLastSpacing();
        char[] codepoints = segment.codepoints();
        int i = 0;
        int count = codepoints.length;
        while (i < count) {
            char codepoint = codepoints[i];
            boolean lastCodepoint = i == count - 1;
            Glyph glyph = font.codepointGlyph(codepoint);
            AffineTransform glyphTransform = cursor.advance(measure, glyph);
            boolean skipSpacing = lastCodepoint && shouldSkipLastSpacing;
            if (!skipSpacing) {
                cursor.advanceSpacing(letterSpacing);
            }
            if (glyphTransform == null) {
                break;
            }
            if (glyph.isRendered()) {
                Shape glyphOutline = glyph.glyphOutline();
                float baselineOffset = computeBaselineOffset(font, fontRenderContext);
                glyphTransform.translate(0.0d, -baselineOffset);
                Shape renderPath = glyphTransform.createTransformedShape(glyphOutline);
                r0.append(renderPath, false);
            }
            i++;
        }
        return r0;
    }

    /* JADX INFO: renamed from: com.github.weisj.jsvg.nodes.text.GlyphRenderer$1, reason: invalid class name */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/text/GlyphRenderer$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$weisj$jsvg$attributes$text$DominantBaseline = new int[DominantBaseline.values().length];

        static {
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$text$DominantBaseline[DominantBaseline.Auto.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$text$DominantBaseline[DominantBaseline.Alphabetic.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$text$DominantBaseline[DominantBaseline.Hanging.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$text$DominantBaseline[DominantBaseline.Central.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$text$DominantBaseline[DominantBaseline.Middle.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$text$DominantBaseline[DominantBaseline.Mathematical.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$text$DominantBaseline[DominantBaseline.Ideographic.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$text$DominantBaseline[DominantBaseline.TextAfterEdge.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$text$DominantBaseline[DominantBaseline.TextBottom.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$text$DominantBaseline[DominantBaseline.TextBeforeEdge.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$text$DominantBaseline[DominantBaseline.TextTop.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
        }
    }

    private static float computeBaselineOffset(@NotNull SVGFont font, @NotNull FontRenderContext fontRenderContext) {
        switch (AnonymousClass1.$SwitchMap$com$github$weisj$jsvg$attributes$text$DominantBaseline[fontRenderContext.dominantBaseline().ordinal()]) {
            case 1:
            case 2:
            default:
                return font.romanBaseline();
            case 3:
                return font.hangingBaseline();
            case 4:
                return font.centerBaseline();
            case AbstractJsonLexerKt.TC_COLON /* 5 */:
                return font.middleBaseline();
            case AbstractJsonLexerKt.TC_BEGIN_OBJ /* 6 */:
                return font.mathematicalBaseline();
            case AbstractJsonLexerKt.TC_END_OBJ /* 7 */:
            case 8:
            case AbstractJsonLexerKt.TC_END_LIST /* 9 */:
                return font.textUnderBaseline();
            case 10:
            case 11:
                return font.textOverBaseline();
        }
    }
}
