package com.github.weisj.jsvg.nodes.text;

import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.geometry.util.GeometryUtil;
import com.github.weisj.jsvg.geometry.util.SegmentIteratorWithLookBehind;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/text/PathGlyphCursor.class */
final class PathGlyphCursor extends GlyphCursor {
    private float remainingSegmentLength;
    private float segmentLength;
    private SegmentIteratorWithLookBehind.Segment currentSegment;

    @NotNull
    private final SegmentIteratorWithLookBehind segmentIterator;
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !PathGlyphCursor.class.desiredAssertionStatus();
    }

    PathGlyphCursor(@NotNull PathIterator pathIterator, float startOffset) {
        super(0.0f, 0.0f, new AffineTransform());
        this.segmentIterator = new SegmentIteratorWithLookBehind(pathIterator, 0.0f);
        setupInitialData();
        advance(startOffset);
    }

    PathGlyphCursor(@NotNull GlyphCursor cursor, float startOffset, @NotNull PathIterator pathIterator) {
        super(cursor);
        this.segmentIterator = new SegmentIteratorWithLookBehind(pathIterator, 0.0f);
        setupInitialData();
        advance(startOffset);
    }

    private void setupInitialData() {
        this.currentSegment = this.segmentIterator.currentSegment();
        float length = (float) this.currentSegment.length();
        this.remainingSegmentLength = length;
        this.segmentLength = length;
        this.x = this.currentSegment.xStart;
        this.y = this.currentSegment.yStart;
    }

    private PathGlyphCursor(@NotNull PathGlyphCursor pathCursor) {
        super(pathCursor);
        this.segmentIterator = pathCursor.segmentIterator;
        this.remainingSegmentLength = pathCursor.remainingSegmentLength;
        this.segmentLength = pathCursor.segmentLength;
        this.currentSegment = pathCursor.currentSegment;
    }

    @Override // com.github.weisj.jsvg.nodes.text.GlyphCursor
    GlyphCursor derive() {
        return new PathGlyphCursor(this);
    }

    @Override // com.github.weisj.jsvg.nodes.text.GlyphCursor
    void updateFrom(GlyphCursor local) {
        super.updateFrom(local);
        if (!$assertionsDisabled && !(local instanceof PathGlyphCursor)) {
            throw new AssertionError();
        }
        PathGlyphCursor glyphCursor = (PathGlyphCursor) local;
        this.remainingSegmentLength = glyphCursor.remainingSegmentLength;
        this.segmentLength = glyphCursor.segmentLength;
        this.currentSegment = glyphCursor.currentSegment;
    }

    @Override // com.github.weisj.jsvg.nodes.text.GlyphCursor
    public void setAdvancement(@NotNull GlyphAdvancement advancement) {
        super.setAdvancement(advancement);
        this.segmentIterator.setMaxLookBehindLength(Math.max(advancement.maxLookBehind(), this.segmentIterator.maxLookBehindLength()));
    }

    @Override // com.github.weisj.jsvg.nodes.text.GlyphCursor
    @Nullable
    AffineTransform advance(@NotNull MeasureContext measure, @NotNull Glyph glyph) {
        if (this.segmentIterator.isDone() && GeometryUtil.approximatelyNegative(this.remainingSegmentLength)) {
            return null;
        }
        float deltaX = nextDeltaX(measure);
        if (deltaX != 0.0f) {
            advance(deltaX);
        }
        float advanceDist = this.advancement.glyphAdvancement(glyph);
        float halfAdvance = advanceDist / 2.0f;
        advance(halfAdvance);
        float walkedFraction = halfAdvance / this.segmentLength;
        float slopeX = walkedFraction * (this.currentSegment.xEnd - this.currentSegment.xStart);
        float slopeY = walkedFraction * (this.currentSegment.yEnd - this.currentSegment.yStart);
        float anchorX = this.x - slopeX;
        float anchorY = this.y - slopeY;
        if (this.segmentIterator.isDone() && GeometryUtil.approximatelyNegative(this.remainingSegmentLength)) {
            return null;
        }
        advance(halfAdvance);
        this.transform.setToTranslation(anchorX, anchorY);
        float charRotation = calculateSegmentRotation(anchorX, anchorY, this.x + slopeX, this.y + slopeY);
        this.transform.rotate(charRotation, 0.0d, 0.0d);
        float deltaY = nextDeltaY(measure);
        if (deltaY != 0.0f) {
            float nx = -(this.y - anchorX);
            float ny = this.x - anchorY;
            float nn = deltaY / norm(nx, ny);
            this.transform.translate(nx * nn, ny * nn);
        }
        return this.advancement.glyphTransform(this.transform);
    }

    @Override // com.github.weisj.jsvg.nodes.text.GlyphCursor
    void advanceSpacing(float letterSpacing) {
        advance(this.advancement.spacingAdvancement(letterSpacing));
    }

    private void advance(float distance) {
        if (distance >= 0.0f) {
            advanceInsideSegment(advanceIntoSegment(distance));
        } else {
            advanceInsideSegment(-reverseIntoSegment(-distance));
        }
    }

    private float travelledSegmentLength() {
        return this.segmentLength - this.remainingSegmentLength;
    }

    private float advanceIntoSegment(float distance) {
        if (GeometryUtil.approximatelyNegative(distance)) {
            return 0.0f;
        }
        while (this.segmentIterator.hasNext() && this.remainingSegmentLength < distance) {
            distance -= this.remainingSegmentLength;
            this.segmentIterator.moveToNext();
            this.currentSegment = this.segmentIterator.currentSegment();
            this.x = this.currentSegment.xStart;
            this.y = this.currentSegment.yStart;
            this.segmentLength = (float) this.currentSegment.length();
            this.remainingSegmentLength = this.segmentLength;
        }
        return distance;
    }

    private float reverseIntoSegment(float distance) {
        if (GeometryUtil.approximatelyNegative(distance)) {
            return 0.0f;
        }
        while (this.segmentIterator.hasPrevious() && travelledSegmentLength() < distance) {
            distance -= travelledSegmentLength();
            this.segmentIterator.moveToPrevious();
            this.currentSegment = this.segmentIterator.currentSegment();
            this.x = this.currentSegment.xEnd;
            this.y = this.currentSegment.yEnd;
            this.segmentLength = (float) this.currentSegment.length();
            this.remainingSegmentLength = 0.0f;
        }
        if (GeometryUtil.notablyGreater(distance, travelledSegmentLength())) {
            throw new IllegalStateException("Not enough buffer " + distance + " > " + travelledSegmentLength());
        }
        return distance;
    }

    private void advanceInsideSegment(float distance) {
        if (GeometryUtil.approximatelyZero(distance)) {
            return;
        }
        if (distance < 0.0f && (-distance) > travelledSegmentLength()) {
            throw new IllegalStateException("Distance too large " + distance + " of maximum " + travelledSegmentLength());
        }
        float fractionWalked = distance / this.segmentLength;
        this.x += (this.currentSegment.xEnd - this.currentSegment.xStart) * fractionWalked;
        this.y += (this.currentSegment.yEnd - this.currentSegment.yStart) * fractionWalked;
        this.remainingSegmentLength -= distance;
    }

    private float calculateSegmentRotation(float x1, float y1, float x2, float y2) {
        return (float) Math.atan2(y2 - y1, x2 - x1);
    }

    private float norm(float a, float b) {
        return (float) Math.sqrt((a * a) + (b * b));
    }
}
