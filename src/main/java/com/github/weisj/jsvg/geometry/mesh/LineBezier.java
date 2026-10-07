package com.github.weisj.jsvg.geometry.mesh;

import com.github.weisj.jsvg.geometry.util.GeometryUtil;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/mesh/LineBezier.class */
final class LineBezier extends Bezier {
    LineBezier(@NotNull Point2D.Float a, @NotNull Point2D.Float b) {
        super(a, GeometryUtil.lerp(0.33333334f, b, a), GeometryUtil.lerp(0.6666667f, b, a), b);
    }

    @Override // com.github.weisj.jsvg.geometry.mesh.Bezier
    public void appendTo(@NotNull Path2D p) {
        p.lineTo(this.d.x, this.d.y);
    }

    @Override // com.github.weisj.jsvg.geometry.mesh.Bezier
    @NotNull
    public Split<Bezier> split() {
        Point2D.Float mid = GeometryUtil.midPoint(this.a, this.d);
        return new Split<>(new LineBezier(this.a, mid), new LineBezier(mid, this.d));
    }
}
