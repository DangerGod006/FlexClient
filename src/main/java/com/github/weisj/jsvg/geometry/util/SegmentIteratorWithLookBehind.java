package com.github.weisj.jsvg.geometry.util;

import com.github.weisj.jsvg.geometry.size.Length;
import java.awt.geom.PathIterator;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/util/SegmentIteratorWithLookBehind.class */
public final class SegmentIteratorWithLookBehind {

    @NotNull
    private final PathIterator pathIterator;
    private float maxLookBehindLength;
    private Segment currentSegment;
    private float moveToX;
    private float moveToY;
    private float currentLookBehindLength = 0.0f;
    private final ArrayList<Segment> lookBehind = new ArrayList<>();
    private final float[] cords = new float[2];
    private int lookBehindCursor = -1;

    public SegmentIteratorWithLookBehind(@NotNull PathIterator pathIterator, float maxLookBehindLength) {
        this.pathIterator = pathIterator;
        this.maxLookBehindLength = maxLookBehindLength;
        prepareFirstSegment();
    }

    private void prepareFirstSegment() {
        this.currentSegment = new Segment(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
        moveToNext();
        if (Length.isUnspecified(this.currentSegment.xStart) || Length.isUnspecified(this.currentSegment.yStart)) {
            throw new IllegalStateException("Path iterator did not establish starting position");
        }
    }

    public void setMaxLookBehindLength(float maxLookBehindLength) {
        this.maxLookBehindLength = maxLookBehindLength;
        trimLookBehindIfNecessary();
    }

    public float maxLookBehindLength() {
        return this.maxLookBehindLength;
    }

    public boolean hasNext() {
        return this.lookBehindCursor >= 0 || !this.pathIterator.isDone();
    }

    public boolean isDone() {
        return !hasNext();
    }

    public boolean hasPrevious() {
        return this.lookBehindCursor < this.lookBehind.size() - 1;
    }

    @NotNull
    public Segment currentSegment() {
        if (this.lookBehindCursor >= 0) {
            return this.lookBehind.get((this.lookBehind.size() - 1) - this.lookBehindCursor);
        }
        return this.currentSegment;
    }

    public void moveToPrevious() {
        if (!hasPrevious()) {
            throw new IllegalStateException("Can't move back anymore. Maximum capacity is " + this.maxLookBehindLength);
        }
        this.lookBehindCursor++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e4, code lost:
    
        if (java.lang.Float.isNaN(r0.xEnd) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ee, code lost:
    
        if (java.lang.Float.isNaN(r0.yEnd) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f1, code lost:
    
        r0.xEnd = r0.xStart;
        r0.yEnd = r0.yStart;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0107, code lost:
    
        if (r8.maxLookBehindLength <= 0.0f) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x010a, code lost:
    
        r8.lookBehind.add(r8.currentSegment);
        r8.currentLookBehindLength += (float) r8.currentSegment.length();
        trimLookBehindIfNecessary();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x012b, code lost:
    
        r8.currentSegment = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0130, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void moveToNext() {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.weisj.jsvg.geometry.util.SegmentIteratorWithLookBehind.moveToNext():void");
    }

    private void trimLookBehindIfNecessary() {
        while (GeometryUtil.notablyGreater(this.currentLookBehindLength, this.maxLookBehindLength)) {
            Segment segment = this.lookBehind.get(0);
            double segmentLength = segment.length();
            if (((double) this.currentLookBehindLength) - segmentLength >= this.maxLookBehindLength) {
                this.currentLookBehindLength -= (float) segmentLength;
                this.lookBehind.remove(0);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/util/SegmentIteratorWithLookBehind$Segment.class */
    public static final class Segment {
        public float xStart;
        public float yStart;
        public float xEnd;
        public float yEnd;
        public boolean moveHappened;

        private Segment(float xStart, float yStart, float xEnd, float yEnd) {
            this.xStart = xStart;
            this.yStart = yStart;
            this.xEnd = xEnd;
            this.yEnd = yEnd;
        }

        public double length() {
            return GeometryUtil.lineLength(this.xStart, this.yStart, this.xEnd, this.yEnd);
        }

        public String toString() {
            return String.format("[%.2f,%.2f] -> [%.2f,%.2f] (moved: %b)", Float.valueOf(this.xStart), Float.valueOf(this.yStart), Float.valueOf(this.xEnd), Float.valueOf(this.yEnd), Boolean.valueOf(this.moveHappened));
        }
    }
}
