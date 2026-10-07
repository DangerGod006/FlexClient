package com.github.weisj.jsvg.geometry.path;

import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/path/QuadraticSmooth.class */
final class QuadraticSmooth extends PathCommand {
    private final float x;
    private final float y;

    public QuadraticSmooth(boolean isRelative, float x, float y) {
        super(isRelative, 4);
        this.x = x;
        this.y = y;
    }

    @Override // com.github.weisj.jsvg.geometry.path.PathCommand
    public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
        Point2D.Float offset = offset(hist);
        Point2D.Float knot = lastKnotReflection(hist);
        path.quadTo(knot.x, knot.y, this.x + offset.x, this.y + offset.y);
        hist.setLastPoint(path.getCurrentPoint());
        hist.setLastKnot(knot);
    }

    public String toString() {
        return "T " + this.x + " " + this.y;
    }
}
