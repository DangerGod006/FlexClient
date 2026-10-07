package com.github.weisj.jsvg.parser.css.impl;

import java.text.MessageFormat;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/css/impl/Lexer.class */
public final class Lexer {
    private static final Logger LOGGER = Logger.getLogger(Lexer.class.getName());

    @NotNull
    private final List<char[]> input;
    private int listIndex = 0;
    private int index = 0;
    private boolean inRuleDefinition;
    private boolean parsingRaw;

    public Lexer(@NotNull List<char[]> input) {
        this.input = input;
    }

    @NotNull
    public Token nextToken() {
        consumeWhiteSpace();
        if (this.inRuleDefinition && this.parsingRaw) {
            this.parsingRaw = false;
            return new Token(TokenType.RAW_DATA, readWhile(c -> {
                return (c.charValue() == ';' || c.charValue() == '}') ? false : true;
            }));
        }
        if (isEof()) {
            return new Token(TokenType.EOF);
        }
        char c2 = current();
        switch (c2) {
            case '#':
                next();
                return new Token(TokenType.ID_NAME, readIdentifier());
            case AbstractJsonLexerKt.COMMA /* 44 */:
                next();
                return new Token(TokenType.COMMA);
            case '.':
                next();
                return new Token(TokenType.CLASS_NAME, readIdentifier());
            case '/':
                if (peekNext() == '*') {
                    next();
                    next();
                    String comment = readWhile(n -> {
                        return (n.charValue() == '*' && peekNext() == '/') ? false : true;
                    });
                    next();
                    next();
                    return new Token(TokenType.COMMENT, comment);
                }
                break;
            case AbstractJsonLexerKt.COLON /* 58 */:
                this.parsingRaw = true;
                next();
                return new Token(TokenType.COLON);
            case ';':
                next();
                return new Token(TokenType.SEMICOLON);
            case AbstractJsonLexerKt.BEGIN_OBJ /* 123 */:
                this.inRuleDefinition = true;
                this.parsingRaw = false;
                next();
                return new Token(TokenType.CURLY_OPEN);
            case AbstractJsonLexerKt.END_OBJ /* 125 */:
                this.inRuleDefinition = false;
                this.parsingRaw = false;
                next();
                return new Token(TokenType.CURLY_CLOSE);
        }
        return new Token(TokenType.IDENTIFIER, readIdentifier());
    }

    private boolean isEof() {
        return this.listIndex >= this.input.size() || (this.listIndex == this.input.size() - 1 && this.index >= this.input.get(this.listIndex).length);
    }

    private void consumeWhiteSpace() {
        while (Character.isWhitespace(current())) {
            next();
        }
    }

    private boolean isIdentifierCharStart(char c) {
        if ('A' > c || c > 'Z') {
            return ('a' <= c && c <= 'z') || c == '-' || c == '_';
        }
        return true;
    }

    private boolean isIdentifierChar(char c) {
        if (isIdentifierCharStart(c)) {
            return true;
        }
        return '0' <= c && c <= '9';
    }

    @NotNull
    private String readIdentifier() {
        if (!isIdentifierCharStart(current()) || !isIdentifierChar(current())) {
            LOGGER.warning(() -> {
                return MessageFormat.format("Identifier starting with unexpected char ''{0}''", Character.valueOf(current()));
            });
            if (readWhile((v1) -> {
                return isIdentifierChar(v1);
            }).isEmpty()) {
                next();
            }
            throw new ParserException();
        }
        return readWhile((v1) -> {
            return isIdentifierChar(v1);
        });
    }

    @NotNull
    private String readWhile(@NotNull Predicate<Character> filter) {
        if (isEof()) {
            return "";
        }
        int startListIndex = this.listIndex;
        int startIndex = this.index;
        while (!isEof() && filter.test(Character.valueOf(current()))) {
            next();
        }
        int endListIndex = isEof() ? this.input.size() - 1 : this.listIndex;
        int endIndex = isEof() ? this.input.get(endListIndex).length - 1 : this.index;
        StringBuilder builder = new StringBuilder();
        int start = startIndex;
        int i = startListIndex;
        while (i <= endListIndex) {
            char[] segment = this.input.get(i);
            int end = i == endListIndex ? endIndex : segment.length;
            builder.append(String.valueOf(segment, start, end - start));
            start = 0;
            i++;
        }
        return builder.toString();
    }

    private char current() {
        if (isEof()) {
            return (char) 0;
        }
        return this.input.get(this.listIndex)[this.index];
    }

    private char peekNext() {
        if (isEof()) {
            return (char) 0;
        }
        if (this.index + 1 < this.input.get(this.listIndex).length) {
            return this.input.get(this.listIndex)[this.index + 1];
        }
        for (int currentIndex = this.listIndex + 1; currentIndex < this.input.size(); currentIndex++) {
            if (this.input.get(currentIndex).length > 0) {
                return this.input.get(currentIndex)[0];
            }
        }
        return (char) 0;
    }

    private void next() {
        this.index++;
        if (this.index >= this.input.get(this.listIndex).length && this.listIndex + 1 < this.input.size()) {
            this.index = 0;
            this.listIndex++;
        }
    }
}
