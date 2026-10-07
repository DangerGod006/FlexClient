package com.github.weisj.jsvg.attributes.paint;

import com.github.weisj.jsvg.parser.AttributeNode;
import java.awt.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/paint/PaintParser.class */
public interface PaintParser {
    public static final Color DEFAULT_COLOR = Color.BLACK;

    @Nullable
    Color parseColor(@NotNull String str, @NotNull AttributeNode attributeNode);

    @Nullable
    SVGPaint parsePaint(@Nullable String str, @NotNull AttributeNode attributeNode);
}
