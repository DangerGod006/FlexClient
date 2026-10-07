package com.github.weisj.jsvg.geometry.path;

import com.github.weisj.jsvg.geometry.mesh.Bezier;
import java.awt.geom.Point2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/path/LineToBezier.class */
final class LineToBezier implements BezierPathCommand {
    private final boolean relative;
    private final float x;
    private final float y;

    public LineToBezier(boolean relative, float x, float y) {
        this.relative = relative;
        this.x = x;
        this.y = y;
    }

    @Override // com.github.weisj.jsvg.geometry.path.BezierPathCommand
    @NotNull
    public Bezier createBezier(@NotNull Point2D.Float start) {
        if (this.relative) {
            return Bezier.straightLine(start, new Point2D.Float(start.x + this.x, start.y + this.y));
        }
        return Bezier.straightLine(start, new Point2D.Float(this.x, this.y));
    }
}
