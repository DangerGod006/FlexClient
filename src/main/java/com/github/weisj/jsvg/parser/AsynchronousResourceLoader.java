package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.parser.resources.RenderableResource;
import com.github.weisj.jsvg.util.ResourceUtil;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/AsynchronousResourceLoader.class */
public final class AsynchronousResourceLoader implements ResourceLoader {
    private static final Logger LOGGER = Logger.getLogger(AsynchronousResourceLoader.class.getName());

    @Override // com.github.weisj.jsvg.parser.ResourceLoader
    @NotNull
    public UIFuture<RenderableResource> loadImage(@NotNull URI uri) {
        return new SwingUIFuture(() -> {
            try {
                return ResourceUtil.loadImage(uri);
            } catch (IOException e) {
                LOGGER.log(Level.SEVERE, e.getMessage(), (Throwable) e);
                return null;
            }
        });
    }
}
