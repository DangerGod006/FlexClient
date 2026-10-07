package com.github.weisj.jsvg.nodes.text;

import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/text/StringTextSegment.class */
final class StringTextSegment implements TextSegment {
    private final char[] codepoints;
    private final TextContainer parent;
    private final int index;

    @Nullable
    Shape currentGlyphRun = null;

    @Nullable
    RenderContext currentRenderContext = null;
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !StringTextSegment.class.desiredAssertionStatus();
    }

    public StringTextSegment(@NotNull TextContainer parent, int index, char[] codepoints) {
        this.parent = parent;
        this.index = index;
        if (!$assertionsDisabled && codepoints.length == 0) {
            throw new AssertionError();
        }
        this.codepoints = codepoints;
    }

    public char[] codepoints() {
        return this.codepoints;
    }

    public boolean isLastSegmentInParent() {
        return this.index == this.parent.children().size() - 1;
    }
}
