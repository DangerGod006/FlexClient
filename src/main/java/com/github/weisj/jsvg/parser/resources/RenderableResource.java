package com.github.weisj.jsvg.parser.resources;

import com.github.weisj.jsvg.geometry.size.FloatSize;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.geom.AffineTransform;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/resources/RenderableResource.class */
public interface RenderableResource {
    @NotNull
    FloatSize intrinsicSize(@NotNull RenderContext renderContext);

    void render(@NotNull Output output, @NotNull RenderContext renderContext, @NotNull AffineTransform affineTransform);
}
