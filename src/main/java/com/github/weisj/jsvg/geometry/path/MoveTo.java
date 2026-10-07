package com.github.weisj.jsvg.geometry.path;

import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/path/MoveTo.class */
final class MoveTo extends PathCommand {
    private final float x;
    private final float y;

    public MoveTo(boolean isRelative, float x, float y) {
        super(isRelative, 2);
        this.x = x;
        this.y = y;
    }

    @Override // com.github.weisj.jsvg.geometry.path.PathCommand
    public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
        Point2D.Float offset = offset(hist);
        path.moveTo(this.x + offset.x, this.y + offset.y);
        hist.setStartPoint(path.getCurrentPoint());
        hist.setLastPoint(path.getCurrentPoint());
        hist.setLastKnot(path.getCurrentPoint());
    }

    public String toString() {
        return "M " + this.x + " " + this.y;
    }
}
