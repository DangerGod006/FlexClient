package com.github.weisj.jsvg.geometry.path;

import com.github.weisj.jsvg.geometry.mesh.Bezier;
import java.awt.geom.Point2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/path/BezierPathCommand.class */
@FunctionalInterface
public interface BezierPathCommand {
    @NotNull
    Bezier createBezier(@NotNull Point2D.Float r1);
}
