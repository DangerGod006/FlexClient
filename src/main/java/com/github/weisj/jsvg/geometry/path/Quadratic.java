package com.github.weisj.jsvg.geometry.path;

import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/path/Quadratic.class */
final class Quadratic extends PathCommand {
    private final float kx;
    private final float ky;
    private final float x;
    private final float y;

    public String toString() {
        return "Q " + this.kx + " " + this.ky + " " + this.x + " " + this.y;
    }

    public Quadratic(boolean isRelative, float kx, float ky, float x, float y) {
        super(isRelative, 4);
        this.kx = kx;
        this.ky = ky;
        this.x = x;
        this.y = y;
    }

    @Override // com.github.weisj.jsvg.geometry.path.PathCommand
    public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
        Point2D.Float offset = offset(hist);
        path.quadTo(this.kx + offset.x, this.ky + offset.y, this.x + offset.x, this.y + offset.y);
        hist.setLastPoint(path.getCurrentPoint());
        hist.setLastKnot(this.kx + offset.x, this.ky + offset.y);
    }
}
