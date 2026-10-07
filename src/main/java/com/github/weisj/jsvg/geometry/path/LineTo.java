package com.github.weisj.jsvg.geometry.path;

import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/path/LineTo.class */
final class LineTo extends PathCommand {
    private final float x;
    private final float y;

    public LineTo(boolean isRelative, float x, float y) {
        super(isRelative, 2);
        this.x = x;
        this.y = y;
    }

    public float x() {
        return this.x;
    }

    public float y() {
        return this.y;
    }

    @Override // com.github.weisj.jsvg.geometry.path.PathCommand
    public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
        Point2D.Float offset = offset(hist);
        path.lineTo(this.x + offset.x, this.y + offset.y);
        hist.setLastPoint(path.getCurrentPoint());
        hist.setLastKnot(path.getCurrentPoint());
    }

    @Override // com.github.weisj.jsvg.geometry.path.PathCommand
    public int nodeCount() {
        return 2;
    }

    public String toString() {
        return "L " + this.x + " " + this.y;
    }
}
