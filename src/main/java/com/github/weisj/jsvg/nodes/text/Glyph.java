package com.github.weisj.jsvg.nodes.text;

import java.awt.Shape;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/text/Glyph.class */
public final class Glyph {

    @NotNull
    private final Shape outline;
    private final float advance;
    private final boolean isEmpty;

    public Glyph(@NotNull Shape outline, float advance, boolean isEmpty) {
        this.outline = outline;
        this.advance = advance;
        this.isEmpty = isEmpty;
    }

    public float advance() {
        return this.advance;
    }

    @NotNull
    public Shape glyphOutline() {
        return this.outline;
    }

    public boolean isRendered() {
        return !this.isEmpty;
    }
}
