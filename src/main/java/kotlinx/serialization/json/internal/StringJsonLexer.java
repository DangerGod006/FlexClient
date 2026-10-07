package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringJsonLexer.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/StringJsonLexer.class */
public class StringJsonLexer extends AbstractJsonLexer {

    @NotNull
    private final String source;

    public StringJsonLexer(@NotNull String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    @NotNull
    public String getSource() {
        return this.source;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int prefetchOrEof(int position) {
        if (position < getSource().length()) {
            return position;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        String source = getSource();
        int cpos = this.currentPosition;
        while (cpos != -1 && cpos < source.length()) {
            int i = cpos;
            cpos++;
            char c = source.charAt(i);
            if (!(c == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                this.currentPosition = cpos;
                return AbstractJsonLexerKt.charToTokenClass(c);
            }
        }
        this.currentPosition = source.length();
        return (byte) 10;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        int current = this.currentPosition;
        if (current == -1) {
            return false;
        }
        String source = getSource();
        while (current < source.length()) {
            char c = source.charAt(current);
            if (c == ' ' || c == '\n' || c == '\r' || c == '\t') {
                current++;
            } else {
                this.currentPosition = current;
                return isValidValueStart(c);
            }
        }
        this.currentPosition = current;
        return false;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        int current = this.currentPosition;
        if (current == -1) {
            return current;
        }
        String source = getSource();
        while (current < source.length()) {
            char c = source.charAt(current);
            if (!(c == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            current++;
        }
        this.currentPosition = current;
        return current;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char expected) {
        if (this.currentPosition == -1) {
            unexpectedToken(expected);
        }
        String source = getSource();
        int cpos = this.currentPosition;
        while (cpos < source.length()) {
            int i = cpos;
            cpos++;
            char c = source.charAt(i);
            if (!(c == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                this.currentPosition = cpos;
                if (c == expected) {
                    return;
                } else {
                    unexpectedToken(expected);
                }
            }
        }
        this.currentPosition = -1;
        unexpectedToken(expected);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    @NotNull
    public String consumeKeyString() {
        consumeNextToken('\"');
        int current = this.currentPosition;
        int closingQuote = StringsKt.indexOf$default((CharSequence) getSource(), '\"', current, false, 4, (Object) null);
        if (closingQuote == -1) {
            consumeStringLenient();
            StringJsonLexer $this$iv = this;
            String expected$iv = AbstractJsonLexerKt.tokenDescription((byte) 1);
            int position$iv = $this$iv.currentPosition;
            String s$iv = ($this$iv.currentPosition == $this$iv.getSource().length() || position$iv < 0) ? "EOF" : String.valueOf($this$iv.getSource().charAt(position$iv));
            AbstractJsonLexer.fail$default($this$iv, "Expected " + expected$iv + ", but had '" + s$iv + "' instead", position$iv, null, 4, null);
            throw new KotlinNothingValueException();
        }
        for (int i = current; i < closingQuote; i++) {
            if (getSource().charAt(i) == '\\') {
                return consumeString(getSource(), this.currentPosition, i);
            }
        }
        this.currentPosition = closingQuote + 1;
        String strSubstring = getSource().substring(current, closingQuote);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeStringChunked(boolean isLenient, @NotNull Function1<? super String, Unit> consumeChunk) {
        Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
        Iterable $this$forEach$iv = StringsKt.chunked(isLenient ? consumeStringLenient() : consumeString(), ReaderJsonLexerKt.BATCH_SIZE);
        for (Object element$iv : $this$forEach$iv) {
            consumeChunk.invoke(element$iv);
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    @Nullable
    public String peekLeadingMatchingValue(@NotNull String keyToMatch, boolean isLenient) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int positionSnapshot = this.currentPosition;
        try {
            if (consumeNextToken() != 6) {
                return null;
            }
            String firstKey = peekString(isLenient);
            if (!Intrinsics.areEqual(firstKey, keyToMatch)) {
                this.currentPosition = positionSnapshot;
                discardPeeked();
                return null;
            }
            discardPeeked();
            if (consumeNextToken() != 5) {
                this.currentPosition = positionSnapshot;
                discardPeeked();
                return null;
            }
            String strPeekString = peekString(isLenient);
            this.currentPosition = positionSnapshot;
            discardPeeked();
            return strPeekString;
        } finally {
            this.currentPosition = positionSnapshot;
            discardPeeked();
        }
    }
}
