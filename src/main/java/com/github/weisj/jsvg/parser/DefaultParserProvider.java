package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.attributes.paint.DefaultPaintParser;
import com.github.weisj.jsvg.attributes.paint.PaintParser;
import com.github.weisj.jsvg.parser.css.CssParser;
import com.github.weisj.jsvg.parser.css.impl.SimpleCssParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/DefaultParserProvider.class */
public class DefaultParserProvider implements ParserProvider {
    @Override // com.github.weisj.jsvg.parser.ParserProvider
    @NotNull
    public PaintParser createPaintParser() {
        return new DefaultPaintParser();
    }

    @Override // com.github.weisj.jsvg.parser.ParserProvider
    @NotNull
    public CssParser createCssParser() {
        return new SimpleCssParser();
    }

    @Override // com.github.weisj.jsvg.parser.ParserProvider
    @Nullable
    public DomProcessor createPreProcessor() {
        return null;
    }

    @Override // com.github.weisj.jsvg.parser.ParserProvider
    @Nullable
    public DomProcessor createPostProcessor() {
        return null;
    }
}
