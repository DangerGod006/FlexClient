package com.github.weisj.jsvg.parser;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/DomProcessor.class */
@FunctionalInterface
public interface DomProcessor {
    void process(@NotNull ParsedElement parsedElement);
}
