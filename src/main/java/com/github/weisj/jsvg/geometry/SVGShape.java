package com.github.weisj.jsvg.geometry;

import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/SVGShape.class */
public interface SVGShape {
    @NotNull
    Shape shape(@NotNull RenderContext renderContext, boolean z);

    @NotNull
    Rectangle2D bounds(@NotNull RenderContext renderContext, boolean z);

    default boolean canBeFilled() {
        return true;
    }

    @NotNull
    default Shape shape(@NotNull RenderContext context) {
        return shape(context, true);
    }

    default boolean usesOptimizedBoundsCalculation() {
        return true;
    }
}
