package com.github.weisj.jsvg.geometry.path;

import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/path/PathCommand.class */
public abstract class PathCommand {
    private final boolean isRelative;
    private final int nodeCount;

    public abstract void appendPath(@NotNull Path2D path2D, @NotNull BuildHistory buildHistory);

    protected PathCommand(int nodeCount) {
        this(false, nodeCount);
    }

    protected PathCommand(boolean isRelative, int nodeCount) {
        this.isRelative = isRelative;
        this.nodeCount = nodeCount;
    }

    protected Point2D.Float offset(@NotNull BuildHistory hist) {
        if (isRelative()) {
            return new Point2D.Float(hist.lastPoint.x, hist.lastPoint.y);
        }
        return new Point2D.Float(0.0f, 0.0f);
    }

    protected Point2D.Float lastKnotReflection(@NotNull BuildHistory hist) {
        float oldKx = hist.lastKnot.x;
        float oldKy = hist.lastKnot.y;
        float oldX = hist.lastPoint.x;
        float oldY = hist.lastPoint.y;
        float kx = (oldX * 2.0f) - oldKx;
        float ky = (oldY * 2.0f) - oldKy;
        return new Point2D.Float(kx, ky);
    }

    public boolean isRelative() {
        return this.isRelative;
    }

    public int nodeCount() {
        return this.nodeCount;
    }
}
