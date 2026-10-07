package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/prototype/HasShape.class */
public interface HasShape {
    @NotNull
    Shape untransformedElementShape(@NotNull RenderContext renderContext);

    @NotNull
    Rectangle2D untransformedElementBounds(@NotNull RenderContext renderContext);

    @NotNull
    default Shape elementShape(@NotNull RenderContext context) {
        Shape shape = untransformedElementShape(context);
        if (this instanceof Transformable) {
            return ((Transformable) this).transformShape(shape, context.measureContext());
        }
        return shape;
    }

    @NotNull
    default Rectangle2D elementBounds(@NotNull RenderContext context) {
        Shape shapeUntransformedElementBounds = untransformedElementBounds(context);
        if (this instanceof Transformable) {
            return ((Transformable) this).transformShape(shapeUntransformedElementBounds, context.measureContext()).getBounds2D();
        }
        return shapeUntransformedElementBounds;
    }
}
