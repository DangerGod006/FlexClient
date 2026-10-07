package com.github.weisj.jsvg.parser.css.impl;

import com.github.weisj.jsvg.parser.css.CssParser;
import com.github.weisj.jsvg.parser.css.StyleProperty;
import com.github.weisj.jsvg.parser.css.StyleSheet;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/css/impl/SimpleCssParser.class */
public final class SimpleCssParser implements CssParser {
    private static final Logger LOGGER = Logger.getLogger(SimpleCssParser.class.getName());

    @Override // com.github.weisj.jsvg.parser.css.CssParser
    @NotNull
    public /* bridge */ /* synthetic */ StyleSheet parse(@NotNull List list) {
        return parse((List<char[]>) list);
    }

    @Override // com.github.weisj.jsvg.parser.css.CssParser
    @NotNull
    public SimpleStyleSheet parse(@NotNull List<char[]> input) {
        return new Parser(input).parse();
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/css/impl/SimpleCssParser$Parser.class */
    private static final class Parser {

        @NotNull
        private final Lexer lexer;

        @NotNull
        private final SimpleStyleSheet sheet;

        @NotNull
        private Token current;

        private Parser(@NotNull List<char[]> input) {
            this.sheet = new SimpleStyleSheet();
            this.current = new Token(TokenType.START);
            this.lexer = new Lexer(input);
        }

        private void next() {
            Token next;
            do {
                next = this.lexer.nextToken();
            } while (next.type() == TokenType.COMMENT);
            this.current = next;
        }

        private void expected(@NotNull String type) {
            SimpleCssParser.LOGGER.warning(() -> {
                return MessageFormat.format("Expected ''{0}'' but got ''{1}''", type, this.current);
            });
        }

        private void consumeOrSkipAllowedToken(TokenType type, TokenType allowedTokeToSkip) {
            if (this.current.type() != type) {
                if (this.current.type() != allowedTokeToSkip) {
                    expected(type.toString());
                    throw new ParserException();
                }
                return;
            }
            next();
        }

        private void consume(TokenType type) {
            consumeOrSkipAllowedToken(type, null);
        }

        @NotNull
        private String consumeValue(TokenType type) {
            if (this.current.type() != type) {
                expected(type.toString());
                throw new ParserException();
            }
            if (this.current.data() == null) {
                throw new ParserException();
            }
            String value = (String) Objects.requireNonNull(this.current.data());
            next();
            return value;
        }

        @NotNull
        private List<Token> readIdentifierList() {
            List<Token> list = new ArrayList<>();
            while (this.current.type() != TokenType.CURLY_OPEN && this.current.type() != TokenType.EOF) {
                TokenType type = this.current.type();
                if (type != TokenType.IDENTIFIER && type != TokenType.ID_NAME && type != TokenType.CLASS_NAME) {
                    expected("identifier");
                    throw new ParserException();
                }
                list.add(this.current);
                next();
                if (this.current.type() != TokenType.COMMA) {
                    break;
                }
                next();
            }
            return list;
        }

        @NotNull
        private List<StyleProperty> readProperties() {
            List<StyleProperty> list = new ArrayList<>();
            consume(TokenType.CURLY_OPEN);
            while (this.current.type() != TokenType.CURLY_CLOSE && this.current.type() != TokenType.EOF) {
                String name = consumeValue(TokenType.IDENTIFIER);
                consume(TokenType.COLON);
                String value = consumeValue(TokenType.RAW_DATA);
                consumeOrSkipAllowedToken(TokenType.SEMICOLON, TokenType.CURLY_CLOSE);
                list.add(new StyleProperty(name, value.trim()));
            }
            consume(TokenType.CURLY_CLOSE);
            return list;
        }

        private void skipToNextDefinition() {
            while (this.current.type() != TokenType.CURLY_CLOSE && this.current.type() != TokenType.EOF) {
                try {
                    next();
                } catch (ParserException e) {
                }
            }
            if (this.current.type() != TokenType.EOF) {
                this.current = new Token(TokenType.START);
            }
        }

        @NotNull
        SimpleStyleSheet parse() {
            do {
                try {
                    if (this.current.type() == TokenType.START) {
                        next();
                    }
                    List<Token> identifierList = readIdentifierList();
                    List<StyleProperty> properties = readProperties();
                    for (Token token : identifierList) {
                        switch (token.type()) {
                            case CLASS_NAME:
                                this.sheet.addClassRules((String) Objects.requireNonNull(token.data()), properties);
                                break;
                            case ID_NAME:
                                this.sheet.addIdRules((String) Objects.requireNonNull(token.data()), properties);
                                break;
                            case IDENTIFIER:
                                this.sheet.addTagNameRules((String) Objects.requireNonNull(token.data()), properties);
                                break;
                            default:
                                throw new IllegalStateException("Toke = " + token);
                        }
                    }
                } catch (ParserException e) {
                    skipToNextDefinition();
                }
            } while (this.current.type() != TokenType.EOF);
            return this.sheet;
        }
    }
}
