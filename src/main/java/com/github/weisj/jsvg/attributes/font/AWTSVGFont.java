package com.github.weisj.jsvg.attributes.font;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.nodes.text.Glyph;
import java.awt.Font;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphMetrics;
import java.awt.font.GlyphVector;
import java.awt.font.LineMetrics;
import java.awt.geom.AffineTransform;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/AWTSVGFont.class */
public final class AWTSVGFont implements SVGFont {

    @NotNull
    private final Font font;

    @Nullable
    private LineMetrics lineMetrics;
    private float[] baselineOffsets;
    private final FontRenderContext frc = new FontRenderContext((AffineTransform) null, true, true);
    private float exHeight = Float.NaN;
    private float mathBaseline = Float.NaN;
    private final HashMap<Character, Glyph> glyphCache = new HashMap<>();

    public AWTSVGFont(@NotNull Font font) {
        this.font = font;
    }

    @Override // com.github.weisj.jsvg.attributes.font.SVGFont
    @NotNull
    public Glyph codepointGlyph(char codepoint) {
        Glyph glyph = this.glyphCache.get(Character.valueOf(codepoint));
        if (glyph != null) {
            return glyph;
        }
        Glyph glyph2 = createGlyph(codepoint);
        this.glyphCache.put(Character.valueOf(codepoint), glyph2);
        return glyph2;
    }

    @Override // com.github.weisj.jsvg.attributes.font.SVGFont
    @NotNull
    public String family() {
        return this.font.getFamily();
    }

    @Override // com.github.weisj.jsvg.attributes.font.SVGFont
    public int size() {
        return this.font.getSize();
    }

    @NotNull
    private LineMetrics lineMetrics() {
        if (this.lineMetrics == null) {
            this.lineMetrics = this.font.getLineMetrics("Ax-", 0, 1, this.frc);
        }
        return this.lineMetrics;
    }

    @Override // com.github.weisj.jsvg.attributes.font.SVGFont
    public float effectiveExHeight() {
        if (Length.isUnspecified(this.exHeight)) {
            this.exHeight = (float) codepointGlyph('x').glyphOutline().getBounds2D().getHeight();
        }
        return this.exHeight;
    }

    @Override // com.github.weisj.jsvg.attributes.font.SVGFont
    public float effectiveEmHeight() {
        return this.font.getSize2D();
    }

    @Override // com.github.weisj.jsvg.attributes.font.SVGFont
    public float mathematicalBaseline() {
        if (Length.isUnspecified(this.mathBaseline)) {
            this.mathBaseline = (-effectiveExHeight()) / 2.0f;
        }
        return this.mathBaseline;
    }

    private float[] baselineOffsets() {
        if (this.baselineOffsets == null) {
            this.baselineOffsets = lineMetrics().getBaselineOffsets();
        }
        return this.baselineOffsets;
    }

    @Override // com.github.weisj.jsvg.attributes.font.SVGFont
    public float hangingBaseline() {
        return baselineOffsets()[2];
    }

    @Override // com.github.weisj.jsvg.attributes.font.SVGFont
    public float romanBaseline() {
        return baselineOffsets()[0];
    }

    @Override // com.github.weisj.jsvg.attributes.font.SVGFont
    public float centerBaseline() {
        return baselineOffsets()[1];
    }

    @Override // com.github.weisj.jsvg.attributes.font.SVGFont
    public float middleBaseline() {
        return (romanBaseline() - effectiveExHeight()) / 2.0f;
    }

    @Override // com.github.weisj.jsvg.attributes.font.SVGFont
    public float textUnderBaseline() {
        return lineMetrics().getUnderlineOffset();
    }

    @Override // com.github.weisj.jsvg.attributes.font.SVGFont
    public float textOverBaseline() {
        return textUnderBaseline() - effectiveEmHeight();
    }

    @NotNull
    private Glyph createGlyph(char codepoint) {
        char[] buffer = {codepoint};
        GlyphVector glyphVector = this.font.createGlyphVector(this.frc, buffer);
        GlyphMetrics gm = glyphVector.getGlyphMetrics(0);
        float advance = gm.getAdvanceX();
        Shape shape = glyphVector.getGlyphOutline(0);
        return new Glyph(shape, advance, gm.getBounds2D().isEmpty());
    }
}
