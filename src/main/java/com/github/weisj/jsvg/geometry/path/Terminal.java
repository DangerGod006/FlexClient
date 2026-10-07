package com.github.weisj.jsvg.geometry.path;

import java.awt.geom.Path2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/path/Terminal.class */
public final class Terminal extends PathCommand {
    Terminal() {
        super(1);
    }

    @Override // com.github.weisj.jsvg.geometry.path.PathCommand
    public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
        path.closePath();
        hist.setLastPoint(hist.startPoint);
        hist.setLastKnot(hist.startPoint);
    }

    public String toString() {
        return "Z";
    }
}
