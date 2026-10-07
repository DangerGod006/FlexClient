package com.github.weisj.jsvg.geometry.path;

import java.awt.geom.Path2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/path/Horizontal.class */
final class Horizontal extends PathCommand {
    private final float x;

    public Horizontal(boolean isRelative, float x) {
        super(isRelative, 2);
        this.x = x;
    }

    @Override // com.github.weisj.jsvg.geometry.path.PathCommand
    public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
        float xOff = isRelative() ? hist.lastPoint.x : 0.0f;
        float yOff = hist.lastPoint.y;
        path.lineTo(this.x + xOff, yOff);
        hist.setLastPoint(path.getCurrentPoint());
        hist.setLastKnot(path.getCurrentPoint());
    }

    public String toString() {
        return "H " + this.x;
    }
}
