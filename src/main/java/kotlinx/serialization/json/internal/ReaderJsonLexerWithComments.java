package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CommentLexers.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/ReaderJsonLexerWithComments.class */
public final class ReaderJsonLexerWithComments extends ReaderJsonLexer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderJsonLexerWithComments(@NotNull InternalJsonReader reader, @NotNull char[] buffer) {
        super(reader, buffer);
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char expected) {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int current = skipWhitespaces();
        if (current >= source.length() || current == -1) {
            this.currentPosition = -1;
            unexpectedToken(expected);
        }
        char c = source.charAt(current);
        this.currentPosition = current + 1;
        if (c == expected) {
            return;
        }
        unexpectedToken(expected);
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        ensureHaveChars();
        int current = skipWhitespaces();
        if (current >= getSource().length() || current == -1) {
            return false;
        }
        return isValidValueStart(getSource().charAt(current));
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int cpos = skipWhitespaces();
        if (cpos >= source.length() || cpos == -1) {
            return (byte) 10;
        }
        this.currentPosition = cpos + 1;
        return AbstractJsonLexerKt.charToTokenClass(source.charAt(cpos));
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte peekNextToken() {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int cpos = skipWhitespaces();
        if (cpos >= source.length() || cpos == -1) {
            return (byte) 10;
        }
        this.currentPosition = cpos;
        return AbstractJsonLexerKt.charToTokenClass(source.charAt(cpos));
    }

    private final Pair<Integer, Boolean> handleComment(int position) {
        int current = position;
        int startIndex = current + 2;
        switch (getSource().charAt(current + 1)) {
            case '*':
                boolean rareCaseHit = false;
                while (current != -1) {
                    int current2 = StringsKt.indexOf$default((CharSequence) getSource(), "*/", startIndex, false, 4, (Object) null);
                    if (current2 != -1) {
                        return TuplesKt.to(Integer.valueOf(current2 + 2), true);
                    }
                    if (getSource().charAt(getSource().length() - 1) != '*') {
                        current = prefetchOrEof(getSource().length());
                        startIndex = current;
                    } else {
                        current = prefetchWithinThreshold(getSource().length() - 1);
                        if (!rareCaseHit) {
                            rareCaseHit = true;
                            startIndex = current;
                        } else {
                            this.currentPosition = getSource().length();
                            AbstractJsonLexer.fail$default(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                    }
                }
                this.currentPosition = getSource().length();
                AbstractJsonLexer.fail$default(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                throw new KotlinNothingValueException();
            case '/':
                break;
            default:
                return TuplesKt.to(Integer.valueOf(current), false);
        }
        while (current != -1) {
            int current3 = StringsKt.indexOf$default((CharSequence) getSource(), '\n', startIndex, false, 4, (Object) null);
            if (current3 == -1) {
                current = prefetchOrEof(getSource().length());
                startIndex = current;
            } else {
                return TuplesKt.to(Integer.valueOf(current3 + 1), true);
            }
        }
        return TuplesKt.to(-1, true);
    }

    private final int prefetchWithinThreshold(int position) {
        if (getSource().length() - position > this.threshold) {
            return position;
        }
        this.currentPosition = position;
        ensureHaveChars();
        if (this.currentPosition == 0) {
            return getSource().length() == 0 ? -1 : 0;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        int current = this.currentPosition;
        while (true) {
            current = prefetchOrEof(current);
            if (current == -1) {
                break;
            }
            char c = getSource().charAt(current);
            if (c == ' ' || c == '\n' || c == '\r' || c == '\t') {
                current++;
            } else {
                if (c != '/' || current + 1 >= getSource().length()) {
                    break;
                }
                Pair<Integer, Boolean> pairHandleComment = handleComment(current);
                int iIntValue = pairHandleComment.component1().intValue();
                boolean cont = pairHandleComment.component2().booleanValue();
                current = iIntValue;
                if (!cont) {
                    break;
                }
            }
        }
        this.currentPosition = current;
        return current;
    }
}
