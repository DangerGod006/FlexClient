package com.github.weisj.jsvg.parser.css;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/css/CssParser.class */
public interface CssParser {
    @NotNull
    StyleSheet parse(@NotNull List<char[]> list);
}
