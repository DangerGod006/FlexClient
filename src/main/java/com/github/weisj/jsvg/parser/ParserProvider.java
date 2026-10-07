package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.attributes.paint.PaintParser;
import com.github.weisj.jsvg.parser.css.CssParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/ParserProvider.class */
public interface ParserProvider {
    @NotNull
    PaintParser createPaintParser();

    @NotNull
    CssParser createCssParser();

    @Nullable
    DomProcessor createPreProcessor();

    @Nullable
    DomProcessor createPostProcessor();
}
