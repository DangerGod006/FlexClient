package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.ClipPath;
import com.github.weisj.jsvg.nodes.Mask;
import com.github.weisj.jsvg.nodes.filter.Filter;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/prototype/HasGeometryContext.class */
public interface HasGeometryContext extends Transformable, HasClip, HasFilter {

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/prototype/HasGeometryContext$ByDelegate.class */
    public interface ByDelegate extends HasGeometryContext {
        @NotNull
        HasGeometryContext geometryContextDelegate();

        @Override // com.github.weisj.jsvg.nodes.prototype.HasClip
        @Nullable
        default ClipPath clipPath() {
            return geometryContextDelegate().clipPath();
        }

        @Override // com.github.weisj.jsvg.nodes.prototype.HasClip
        @Nullable
        default Mask mask() {
            return geometryContextDelegate().mask();
        }

        @Override // com.github.weisj.jsvg.nodes.prototype.HasFilter
        @Nullable
        default Filter filter() {
            return geometryContextDelegate().filter();
        }

        @Override // com.github.weisj.jsvg.nodes.prototype.Transformable
        @Nullable
        default AffineTransform transform() {
            return geometryContextDelegate().transform();
        }

        @Override // com.github.weisj.jsvg.nodes.prototype.Transformable
        @NotNull
        default Point2D transformOrigin(@NotNull MeasureContext context) {
            return geometryContextDelegate().transformOrigin(context);
        }
    }
}
