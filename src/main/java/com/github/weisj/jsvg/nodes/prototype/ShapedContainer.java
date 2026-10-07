package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.renderer.NodeRenderer;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/prototype/ShapedContainer.class */
public interface ShapedContainer<E> extends Container<E>, HasShape {
    @Override // com.github.weisj.jsvg.nodes.prototype.HasShape
    @NotNull
    default Shape untransformedElementShape(@NotNull RenderContext context) {
        Path2D.Float r0 = new Path2D.Float();
        for (E child : children()) {
            if (child instanceof HasShape) {
                RenderContext childContext = NodeRenderer.setupRenderContext(child, context);
                Shape childShape = ((HasShape) child).elementShape(childContext);
                r0.append(childShape, false);
            }
        }
        return r0;
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.HasShape
    @NotNull
    default Rectangle2D untransformedElementBounds(@NotNull RenderContext context) {
        Rectangle2D bounds = null;
        for (E child : children()) {
            if (child instanceof HasShape) {
                RenderContext childContext = NodeRenderer.setupRenderContext(child, context);
                Rectangle2D childBounds = ((HasShape) child).elementBounds(childContext);
                if (!childBounds.isEmpty()) {
                    if (bounds == null) {
                        bounds = childBounds;
                    } else {
                        Rectangle2D.union(bounds, childBounds, bounds);
                    }
                }
            }
        }
        return bounds == null ? new Rectangle2D.Float(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, 0.0f, 0.0f) : bounds;
    }
}
