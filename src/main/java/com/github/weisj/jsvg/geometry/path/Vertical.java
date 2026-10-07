package com.github.weisj.jsvg.geometry.path;

import java.awt.geom.Path2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/path/Vertical.class */
final class Vertical extends PathCommand {
    private final float y;

    public Vertical(boolean isRelative, float y) {
        super(isRelative, 2);
        this.y = y;
    }

    @Override // com.github.weisj.jsvg.geometry.path.PathCommand
    public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
        float xOff = hist.lastPoint.x;
        float yOff = isRelative() ? hist.lastPoint.y : 0.0f;
        path.lineTo(xOff, this.y + yOff);
        hist.setLastPoint(path.getCurrentPoint());
        hist.setLastKnot(path.getCurrentPoint());
    }

    public String toString() {
        return "V " + this.y;
    }
}
