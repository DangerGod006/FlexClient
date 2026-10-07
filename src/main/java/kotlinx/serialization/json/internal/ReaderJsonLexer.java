package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReaderJsonLexer.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/ReaderJsonLexer.class */
public class ReaderJsonLexer extends AbstractJsonLexer {

    @NotNull
    private final InternalJsonReader reader;

    @NotNull
    private final char[] buffer;

    @JvmField
    protected int threshold;

    @NotNull
    private final ArrayAsSequence source;

    public /* synthetic */ ReaderJsonLexer(InternalJsonReader internalJsonReader, char[] cArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalJsonReader, (i & 2) != 0 ? CharArrayPoolBatchSize.INSTANCE.take() : cArr);
    }

    @NotNull
    public final InternalJsonReader getReader() {
        return this.reader;
    }

    @NotNull
    public final char[] getBuffer() {
        return this.buffer;
    }

    public ReaderJsonLexer(@NotNull InternalJsonReader reader, @NotNull char[] buffer) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.reader = reader;
        this.buffer = buffer;
        this.threshold = Uuid.SIZE_BITS;
        this.source = new ArrayAsSequence(this.buffer);
        preload(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    @NotNull
    public ArrayAsSequence getSource() {
        return this.source;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        ensureHaveChars();
        int current = this.currentPosition;
        while (true) {
            int current2 = prefetchOrEof(current);
            if (current2 != -1) {
                char c = getSource().charAt(current2);
                if (c == ' ' || c == '\n' || c == '\r' || c == '\t') {
                    current = current2 + 1;
                } else {
                    this.currentPosition = current2;
                    return isValidValueStart(c);
                }
            } else {
                this.currentPosition = current2;
                return false;
            }
        }
    }

    private final void preload(int unprocessedCount) {
        char[] buffer = getSource().getBuffer$kotlinx_serialization_json();
        if (unprocessedCount != 0) {
            ArraysKt.copyInto(buffer, buffer, 0, this.currentPosition, this.currentPosition + unprocessedCount);
        }
        int filledCount = unprocessedCount;
        int sizeTotal = getSource().length();
        while (true) {
            if (filledCount == sizeTotal) {
                break;
            }
            int actual = this.reader.read(buffer, filledCount, sizeTotal - filledCount);
            if (actual == -1) {
                getSource().trim(filledCount);
                this.threshold = -1;
                break;
            }
            filledCount += actual;
        }
        this.currentPosition = 0;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int prefetchOrEof(int position) {
        if (position < getSource().length()) {
            return position;
        }
        this.currentPosition = position;
        ensureHaveChars();
        if (this.currentPosition == 0) {
            return getSource().length() == 0 ? -1 : 0;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        byte tc;
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int cpos = this.currentPosition;
        do {
            int cpos2 = prefetchOrEof(cpos);
            if (cpos2 != -1) {
                cpos = cpos2 + 1;
                char ch = source.charAt(cpos2);
                tc = AbstractJsonLexerKt.charToTokenClass(ch);
            } else {
                this.currentPosition = cpos2;
                return (byte) 10;
            }
        } while (tc == 3);
        this.currentPosition = cpos;
        return tc;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char expected) {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int cpos = this.currentPosition;
        while (true) {
            int cpos2 = prefetchOrEof(cpos);
            if (cpos2 != -1) {
                cpos = cpos2 + 1;
                char c = source.charAt(cpos2);
                if (!(c == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                    this.currentPosition = cpos;
                    if (c == expected) {
                        return;
                    } else {
                        unexpectedToken(expected);
                    }
                }
            } else {
                this.currentPosition = cpos2;
                unexpectedToken(expected);
                return;
            }
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        int current;
        int current2 = this.currentPosition;
        while (true) {
            current = prefetchOrEof(current2);
            if (current != -1) {
                char c = getSource().charAt(current);
                if (!(c == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                    break;
                }
                current2 = current + 1;
            } else {
                break;
            }
        }
        this.currentPosition = current;
        return current;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void ensureHaveChars() {
        int cur = this.currentPosition;
        int oldSize = getSource().length();
        int spaceLeft = oldSize - cur;
        if (spaceLeft > this.threshold) {
            return;
        }
        preload(spaceLeft);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    @NotNull
    public String consumeKeyString() {
        consumeNextToken('\"');
        int current = this.currentPosition;
        int closingQuote = indexOf('\"', current);
        if (closingQuote == -1) {
            int current2 = prefetchOrEof(current);
            if (current2 != -1) {
                return consumeString(getSource(), this.currentPosition, current2);
            }
            ReaderJsonLexer $this$iv = this;
            String expected$iv = AbstractJsonLexerKt.tokenDescription((byte) 1);
            int position$iv = $this$iv.currentPosition - 1;
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
        return substring(current, closingQuote);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int indexOf(char c, int startPos) {
        ArrayAsSequence src = getSource();
        int length = src.length();
        for (int i = startPos; i < length; i++) {
            if (src.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    @NotNull
    public String substring(int startPos, int endPos) {
        return getSource().substring(startPos, endPos);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    protected void appendRange(int fromIndex, int toIndex) {
        Intrinsics.checkNotNullExpressionValue(getEscapedString().append(getSource().getBuffer$kotlinx_serialization_json(), fromIndex, toIndex - fromIndex), "append(...)");
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    @Nullable
    public String peekLeadingMatchingValue(@NotNull String keyToMatch, boolean isLenient) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        return null;
    }

    public final void release() {
        CharArrayPoolBatchSize.INSTANCE.release(this.buffer);
    }
}
