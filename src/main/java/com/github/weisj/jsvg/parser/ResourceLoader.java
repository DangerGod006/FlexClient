package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.parser.resources.RenderableResource;
import java.io.IOException;
import java.net.URI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/ResourceLoader.class */
@FunctionalInterface
public interface ResourceLoader {
    @Nullable
    UIFuture<RenderableResource> loadImage(@NotNull URI uri) throws IOException;
}
