package com.github.weisj.jsvg.nodes.text;

import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.geom.Path2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/text/TextSegment.class */
interface TextSegment {

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/text/TextSegment$RenderableSegment.class */
    public interface RenderableSegment extends TextSegment {

        /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/text/TextSegment$RenderableSegment$UseTextLengthForCalculation.class */
        public enum UseTextLengthForCalculation {
            YES,
            NO
        }

        void prepareSegmentForRendering(@NotNull GlyphCursor glyphCursor, @NotNull RenderContext renderContext);

        void renderSegmentWithoutLayout(@NotNull GlyphCursor glyphCursor, @NotNull RenderContext renderContext, @NotNull Output output);

        boolean hasFixedLength();

        @NotNull
        TextMetrics computeTextMetrics(@NotNull RenderContext renderContext, @NotNull UseTextLengthForCalculation useTextLengthForCalculation);

        void appendTextShape(@NotNull GlyphCursor glyphCursor, @NotNull Path2D path2D, @NotNull RenderContext renderContext);
    }
}
