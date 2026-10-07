package com.github.weisj.jsvg.parser.css.impl;

import com.google.errorprone.annotations.Immutable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/css/impl/Token.class */
@Immutable
public final class Token {

    @NotNull
    private final TokenType type;

    @Nullable
    private final String data;

    public Token(@NotNull TokenType type) {
        this(type, null);
    }

    public Token(@NotNull TokenType type, @Nullable String data) {
        this.type = type;
        this.data = data;
    }

    @NotNull
    public TokenType type() {
        return this.type;
    }

    @Nullable
    public String data() {
        return this.data;
    }

    public String toString() {
        return "Token{type=" + this.type + ", data='" + this.data + "'}";
    }
}
