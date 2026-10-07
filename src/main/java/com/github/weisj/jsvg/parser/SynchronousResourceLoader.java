package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.parser.resources.RenderableResource;
import com.github.weisj.jsvg.util.ResourceUtil;
import java.io.IOException;
import java.net.URI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/SynchronousResourceLoader.class */
public final class SynchronousResourceLoader implements ResourceLoader {
    @Override // com.github.weisj.jsvg.parser.ResourceLoader
    @NotNull
    public UIFuture<RenderableResource> loadImage(@NotNull URI uri) throws IOException {
        return new ValueUIFuture(ResourceUtil.loadImage(uri));
    }
}
