package com.github.weisj.jsvg.nodes.text;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/text/GlyphCursor.class */
class GlyphCursor {
    protected final Rectangle2D completeGlyphRunBounds;

    @NotNull
    protected GlyphAdvancement advancement;
    protected float x;
    protected float y;
    protected int glyphOffset;
    protected final AffineTransform transform;
    protected Length[] xLocations;
    protected int xOff;
    protected Length[] xDeltas;
    protected int dxOff;
    protected Length[] yLocations;
    protected int yOff;
    protected Length[] yDeltas;
    protected int dyOff;
    protected float[] rotations;
    protected int rotOff;

    GlyphCursor(float x, float y, @NotNull AffineTransform transform) {
        this(x, y, transform, new Rectangle2D.Float(Float.NaN, Float.NaN, 0.0f, 0.0f));
    }

    private GlyphCursor(float x, float y, @NotNull AffineTransform transform, @NotNull Rectangle2D glyphBounds) {
        this.advancement = GlyphAdvancement.defaultAdvancement();
        this.x = x;
        this.y = y;
        this.transform = transform;
        this.completeGlyphRunBounds = glyphBounds;
        this.glyphOffset = 0;
    }

    GlyphCursor(@NotNull GlyphCursor c) {
        this(c.x, c.y, c.transform, c.completeGlyphRunBounds);
        this.advancement = c.advancement;
        this.glyphOffset = 0;
        this.xLocations = c.xLocations;
        this.xOff = c.xOff;
        this.yLocations = c.yLocations;
        this.yOff = c.yOff;
        this.xDeltas = c.xDeltas;
        this.dxOff = c.dxOff;
        this.yDeltas = c.yDeltas;
        this.dyOff = c.dyOff;
        this.rotations = c.rotations;
        this.rotOff = c.rotOff;
    }

    GlyphCursor derive() {
        return new GlyphCursor(this);
    }

    void updateFrom(GlyphCursor local) {
        this.x = local.x;
        this.y = local.y;
    }

    public void setAdvancement(@NotNull GlyphAdvancement advancement) {
        this.advancement = advancement;
    }

    public GlyphAdvancement advancement() {
        return this.advancement;
    }

    @Nullable
    AffineTransform advance(@NotNull MeasureContext measure, @NotNull Glyph glyph) {
        this.x = nextX(measure);
        this.x += nextDeltaX(measure);
        this.y = nextY(measure);
        this.y += nextDeltaY(measure);
        this.transform.setToTranslation(this.x, this.y);
        double rotation = nextRotation();
        if (rotation != 0.0d) {
            this.transform.rotate(rotation);
        }
        this.glyphOffset++;
        this.x += this.advancement.glyphAdvancement(glyph);
        return this.advancement.glyphTransform(this.transform);
    }

    void advanceSpacing(float letterSpacing) {
        this.x += this.advancement.spacingAdvancement(letterSpacing);
    }

    protected float nextX(@NotNull MeasureContext measure) {
        if (this.xLocations != null && this.xOff < this.xLocations.length) {
            this.x = this.xLocations[this.xOff].resolveWidth(measure);
            this.xOff++;
        }
        return this.x;
    }

    protected float nextDeltaX(@NotNull MeasureContext measure) {
        if (this.xDeltas != null && this.dxOff < this.xDeltas.length) {
            Length[] lengthArr = this.xDeltas;
            int i = this.dxOff;
            this.dxOff = i + 1;
            return lengthArr[i].resolveWidth(measure);
        }
        return 0.0f;
    }

    protected float nextY(@NotNull MeasureContext measure) {
        if (this.yLocations != null && this.yOff < this.yLocations.length) {
            this.y = this.yLocations[this.yOff].resolveHeight(measure);
            this.yOff++;
        }
        return this.y;
    }

    protected float nextDeltaY(@NotNull MeasureContext measure) {
        if (this.yDeltas != null && this.dyOff < this.yDeltas.length) {
            Length[] lengthArr = this.yDeltas;
            int i = this.dyOff;
            this.dyOff = i + 1;
            return lengthArr[i].resolveHeight(measure);
        }
        return 0.0f;
    }

    protected double nextRotation() {
        if (this.rotations != null && this.rotations.length != 0) {
            float rotation = this.rotations[this.rotOff];
            this.rotOff = Math.min(this.rotations.length - 1, this.rotOff + 1);
            return Math.toRadians(rotation);
        }
        return 0.0d;
    }
}
