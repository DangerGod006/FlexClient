package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.renderer.RenderContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/FilterPrimitive.class */
public interface FilterPrimitive {
    @NotNull
    Length y();

    @NotNull
    Length x();

    @NotNull
    Length width();

    @NotNull
    Length height();

    void layoutFilter(@NotNull RenderContext renderContext, @NotNull FilterLayoutContext filterLayoutContext);

    void applyFilter(@NotNull RenderContext renderContext, @NotNull FilterContext filterContext);

    default boolean isValid() {
        return true;
    }
}
