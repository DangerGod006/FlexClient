package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractJsonLexer.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/AbstractJsonLexer.class */
public abstract class AbstractJsonLexer {

    @JvmField
    public int currentPosition;

    @Nullable
    private String peekedString;

    @JvmField
    @NotNull
    public final JsonPath path = new JsonPath();

    @NotNull
    private StringBuilder escapedString = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public abstract CharSequence getSource();

    public abstract int prefetchOrEof(int i);

    public abstract boolean canConsumeValue();

    public abstract byte consumeNextToken();

    public abstract void consumeNextToken(char c);

    public abstract int skipWhitespaces();

    @Nullable
    public abstract String peekLeadingMatchingValue(@NotNull String str, boolean z);

    @NotNull
    public abstract String consumeKeyString();

    protected final boolean isWs(char $this$isWs) {
        return $this$isWs == ' ' || $this$isWs == '\n' || $this$isWs == '\r' || $this$isWs == '\t';
    }

    public void ensureHaveChars() {
    }

    public final boolean isNotEof() {
        return peekNextToken() != 10;
    }

    public final boolean tryConsumeComma() {
        int current = skipWhitespaces();
        CharSequence source = getSource();
        if (current < source.length() && current != -1 && source.charAt(current) == ',') {
            this.currentPosition++;
            int i = this.currentPosition;
            return true;
        }
        return false;
    }

    protected final boolean isValidValueStart(char c) {
        switch (c) {
            case AbstractJsonLexerKt.COMMA /* 44 */:
            case AbstractJsonLexerKt.COLON /* 58 */:
            case AbstractJsonLexerKt.END_LIST /* 93 */:
            case AbstractJsonLexerKt.END_OBJ /* 125 */:
                return false;
            default:
                return true;
        }
    }

    public final void expectEof() {
        byte nextToken = consumeNextToken();
        if (nextToken != 10) {
            fail$default(this, "Expected EOF after parsing, but had " + getSource().charAt(this.currentPosition - 1) + " instead", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @NotNull
    protected final StringBuilder getEscapedString() {
        return this.escapedString;
    }

    protected final void setEscapedString(@NotNull StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "<set-?>");
        this.escapedString = sb;
    }

    public final byte consumeNextToken(byte expected) {
        byte token = consumeNextToken();
        if (token == expected) {
            return token;
        }
        String expected$iv = AbstractJsonLexerKt.tokenDescription(expected);
        int position$iv = this.currentPosition - 1;
        String s$iv = (this.currentPosition == getSource().length() || position$iv < 0) ? "EOF" : String.valueOf(getSource().charAt(position$iv));
        fail$default(this, "Expected " + expected$iv + ", but had '" + s$iv + "' instead", position$iv, null, 4, null);
        throw new KotlinNothingValueException();
    }

    protected final void unexpectedToken(char expected) {
        if (this.currentPosition > 0 && expected == '\"') {
            int snapshot$iv = this.currentPosition;
            try {
                this.currentPosition--;
                String inputLiteral = consumeStringLenient();
                this.currentPosition = snapshot$iv;
                if (Intrinsics.areEqual(inputLiteral, AbstractJsonLexerKt.NULL)) {
                    fail("Expected string literal but 'null' literal was found", this.currentPosition - 1, AbstractJsonLexerKt.coerceInputValuesHint);
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th) {
                this.currentPosition = snapshot$iv;
                throw th;
            }
        }
        byte expectedToken$iv = AbstractJsonLexerKt.charToTokenClass(expected);
        String expected$iv = AbstractJsonLexerKt.tokenDescription(expectedToken$iv);
        int position$iv = this.currentPosition - 1;
        String s$iv = (this.currentPosition == getSource().length() || position$iv < 0) ? "EOF" : String.valueOf(getSource().charAt(position$iv));
        fail$default(this, "Expected " + expected$iv + ", but had '" + s$iv + "' instead", position$iv, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void fail$kotlinx_serialization_json$default(AbstractJsonLexer $this, byte expectedToken, boolean wasConsumed, Function2 message, int $i$f$fail$kotlinx_serialization_json, Object expected) {
        if (expected != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if (($i$f$fail$kotlinx_serialization_json & 2) != 0) {
            wasConsumed = true;
        }
        if (($i$f$fail$kotlinx_serialization_json & 4) != 0) {
            message = new Function2<String, String, String>() { // from class: kotlinx.serialization.json.internal.AbstractJsonLexer.fail.1
                @Override // kotlin.jvm.functions.Function2
                public final String invoke(String expected2, String source) {
                    Intrinsics.checkNotNullParameter(expected2, "expected");
                    Intrinsics.checkNotNullParameter(source, "source");
                    return "Expected " + expected2 + ", but had '" + source + "' instead";
                }
            };
        }
        Intrinsics.checkNotNullParameter(message, "message");
        String expected2 = AbstractJsonLexerKt.tokenDescription(expectedToken);
        int position = wasConsumed ? $this.currentPosition - 1 : $this.currentPosition;
        String s = ($this.currentPosition == $this.getSource().length() || position < 0) ? "EOF" : String.valueOf($this.getSource().charAt(position));
        fail$default($this, (String) message.invoke(expected2, s), position, null, 4, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final Void fail$kotlinx_serialization_json(byte expectedToken, boolean wasConsumed, @NotNull Function2<? super String, ? super String, String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String expected = AbstractJsonLexerKt.tokenDescription(expectedToken);
        int position = wasConsumed ? this.currentPosition - 1 : this.currentPosition;
        String s = (this.currentPosition == getSource().length() || position < 0) ? "EOF" : String.valueOf(getSource().charAt(position));
        fail$default(this, message.invoke(expected, s), position, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public byte peekNextToken() {
        CharSequence source = getSource();
        int cpos = this.currentPosition;
        while (true) {
            int cpos2 = prefetchOrEof(cpos);
            if (cpos2 != -1) {
                char ch = source.charAt(cpos2);
                switch (ch) {
                    case AbstractJsonLexerKt.TC_END_LIST /* 9 */:
                    case '\n':
                    case '\r':
                    case ' ':
                        cpos = cpos2 + 1;
                        break;
                    default:
                        this.currentPosition = cpos2;
                        return AbstractJsonLexerKt.charToTokenClass(ch);
                }
            } else {
                this.currentPosition = cpos2;
                return (byte) 10;
            }
        }
    }

    public static /* synthetic */ boolean tryConsumeNull$default(AbstractJsonLexer abstractJsonLexer, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return abstractJsonLexer.tryConsumeNull(z);
    }

    public final boolean tryConsumeNull(boolean doConsume) {
        int current = prefetchOrEof(skipWhitespaces());
        int len = getSource().length() - current;
        if (len < 4 || current == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (AbstractJsonLexerKt.NULL.charAt(i) != getSource().charAt(current + i)) {
                return false;
            }
        }
        if (len > 4 && AbstractJsonLexerKt.charToTokenClass(getSource().charAt(current + 4)) == 0) {
            return false;
        }
        if (doConsume) {
            this.currentPosition = current + 4;
            return true;
        }
        return true;
    }

    @Nullable
    public final String peekString(boolean isLenient) {
        String strConsumeString;
        byte token = peekNextToken();
        if (isLenient) {
            if (token != 1 && token != 0) {
                return null;
            }
            strConsumeString = consumeStringLenient();
        } else {
            if (token != 1) {
                return null;
            }
            strConsumeString = consumeString();
        }
        String string = strConsumeString;
        this.peekedString = string;
        return string;
    }

    public final void discardPeeked() {
        this.peekedString = null;
    }

    public int indexOf(char c, int startPos) {
        return StringsKt.indexOf$default(getSource(), c, startPos, false, 4, (Object) null);
    }

    @NotNull
    public String substring(int startPos, int endPos) {
        return getSource().subSequence(startPos, endPos).toString();
    }

    private final boolean insideString(boolean isLenient, char c) {
        return isLenient ? AbstractJsonLexerKt.charToTokenClass(c) == 0 : c != '\"';
    }

    public void consumeStringChunked(boolean isLenient, @NotNull Function1<? super String, Unit> consumeChunk) {
        Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
        byte nextToken = peekNextToken();
        if (!isLenient || nextToken == 0) {
            if (!isLenient) {
                consumeNextToken('\"');
            }
            int currentPosition = this.currentPosition;
            int lastPosition = currentPosition;
            char cCharAt = getSource().charAt(currentPosition);
            boolean usedAppend = false;
            while (insideString(isLenient, cCharAt)) {
                if (isLenient || cCharAt != '\\') {
                    currentPosition++;
                } else {
                    usedAppend = true;
                    currentPosition = prefetchOrEof(appendEscape(lastPosition, currentPosition));
                    lastPosition = currentPosition;
                }
                if (currentPosition >= getSource().length()) {
                    writeRange(lastPosition, currentPosition, usedAppend, consumeChunk);
                    usedAppend = false;
                    currentPosition = prefetchOrEof(currentPosition);
                    if (currentPosition == -1) {
                        fail$default(this, "EOF", currentPosition, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    lastPosition = currentPosition;
                }
                cCharAt = getSource().charAt(currentPosition);
            }
            writeRange(lastPosition, currentPosition, usedAppend, consumeChunk);
            this.currentPosition = currentPosition;
            if (!isLenient) {
                consumeNextToken('\"');
            }
        }
    }

    private final void writeRange(int fromIndex, int toIndex, boolean currentChunkHasEscape, Function1<? super String, Unit> consumeChunk) {
        if (currentChunkHasEscape) {
            consumeChunk.invoke(decodedString(fromIndex, toIndex));
        } else {
            consumeChunk.invoke(substring(fromIndex, toIndex));
        }
    }

    @NotNull
    public final String consumeString() {
        if (this.peekedString != null) {
            return takePeeked();
        }
        return consumeKeyString();
    }

    @NotNull
    protected final String consumeString(@NotNull CharSequence source, int startPosition, int current) {
        String strDecodedString;
        Intrinsics.checkNotNullParameter(source, "source");
        int currentPosition = current;
        int lastPosition = startPosition;
        char cCharAt = source.charAt(currentPosition);
        boolean usedAppend = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                usedAppend = true;
                currentPosition = prefetchOrEof(appendEscape(lastPosition, currentPosition));
                if (currentPosition == -1) {
                    fail$default(this, "Unexpected EOF", currentPosition, null, 4, null);
                    throw new KotlinNothingValueException();
                }
                lastPosition = currentPosition;
            } else {
                currentPosition++;
                if (currentPosition >= source.length()) {
                    usedAppend = true;
                    appendRange(lastPosition, currentPosition);
                    currentPosition = prefetchOrEof(currentPosition);
                    if (currentPosition == -1) {
                        fail$default(this, "Unexpected EOF", currentPosition, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    lastPosition = currentPosition;
                } else {
                    continue;
                }
            }
            cCharAt = source.charAt(currentPosition);
        }
        if (!usedAppend) {
            strDecodedString = substring(lastPosition, currentPosition);
        } else {
            strDecodedString = decodedString(lastPosition, currentPosition);
        }
        String string = strDecodedString;
        this.currentPosition = currentPosition + 1;
        return string;
    }

    private final int appendEscape(int lastPosition, int current) {
        appendRange(lastPosition, current);
        return appendEsc(current + 1);
    }

    private final String decodedString(int lastPosition, int currentPosition) {
        appendRange(lastPosition, currentPosition);
        String result = this.escapedString.toString();
        Intrinsics.checkNotNullExpressionValue(result, "toString(...)");
        this.escapedString.setLength(0);
        return result;
    }

    private final String takePeeked() {
        String str = this.peekedString;
        Intrinsics.checkNotNull(str);
        this.peekedString = null;
        return str;
    }

    @NotNull
    public final String consumeStringLenientNotNull() {
        String result = consumeStringLenient();
        if (Intrinsics.areEqual(result, AbstractJsonLexerKt.NULL) && wasUnquotedString()) {
            fail$default(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return result;
    }

    private final boolean wasUnquotedString() {
        return getSource().charAt(this.currentPosition - 1) != '\"';
    }

    @NotNull
    public final String consumeStringLenient() {
        String strDecodedString;
        if (this.peekedString != null) {
            return takePeeked();
        }
        int current = skipWhitespaces();
        if (current >= getSource().length() || current == -1) {
            fail$default(this, "EOF", current, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte token = AbstractJsonLexerKt.charToTokenClass(getSource().charAt(current));
        if (token == 1) {
            return consumeString();
        }
        if (token != 0) {
            fail$default(this, "Expected beginning of the string, but got " + getSource().charAt(current), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean usedAppend = false;
        while (AbstractJsonLexerKt.charToTokenClass(getSource().charAt(current)) == 0) {
            current++;
            if (current >= getSource().length()) {
                usedAppend = true;
                appendRange(this.currentPosition, current);
                int eof = prefetchOrEof(current);
                if (eof == -1) {
                    this.currentPosition = current;
                    return decodedString(0, 0);
                }
                current = eof;
            }
        }
        if (!usedAppend) {
            strDecodedString = substring(this.currentPosition, current);
        } else {
            strDecodedString = decodedString(this.currentPosition, current);
        }
        String result = strDecodedString;
        this.currentPosition = current;
        return result;
    }

    protected void appendRange(int fromIndex, int toIndex) {
        this.escapedString.append(getSource(), fromIndex, toIndex);
    }

    private final int appendEsc(int startPosition) {
        int currentPosition = prefetchOrEof(startPosition);
        if (currentPosition == -1) {
            fail$default(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int currentPosition2 = currentPosition + 1;
        char currentChar = getSource().charAt(currentPosition);
        if (currentChar == 'u') {
            return appendHex(getSource(), currentPosition2);
        }
        char c = AbstractJsonLexerKt.escapeToChar(currentChar);
        if (c == 0) {
            fail$default(this, "Invalid escaped char '" + currentChar + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        this.escapedString.append(c);
        return currentPosition2;
    }

    private final int appendHex(CharSequence source, int startPos) {
        if (startPos + 4 < source.length()) {
            this.escapedString.append((char) ((fromHexChar(source, startPos) << 12) + (fromHexChar(source, startPos + 1) << 8) + (fromHexChar(source, startPos + 2) << 4) + fromHexChar(source, startPos + 3)));
            return startPos + 4;
        }
        this.currentPosition = startPos;
        ensureHaveChars();
        if (this.currentPosition + 4 < source.length()) {
            return appendHex(source, this.currentPosition);
        }
        fail$default(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void require$kotlinx_serialization_json$default(AbstractJsonLexer $this, boolean condition, int position, Function0 message, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: require");
        }
        if ((i & 2) != 0) {
            position = $this.currentPosition;
        }
        Intrinsics.checkNotNullParameter(message, "message");
        if (condition) {
            return;
        }
        fail$default($this, (String) message.invoke(), position, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void require$kotlinx_serialization_json(boolean condition, int position, @NotNull Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (condition) {
            return;
        }
        fail$default(this, message.invoke(), position, null, 4, null);
        throw new KotlinNothingValueException();
    }

    private final int fromHexChar(CharSequence source, int currentPosition) {
        char character = source.charAt(currentPosition);
        boolean z = '0' <= character && character < ':';
        if (z) {
            return character - '0';
        }
        boolean z2 = 'a' <= character && character < 'g';
        if (z2) {
            return (character - 'a') + 10;
        }
        boolean z3 = 'A' <= character && character < 'G';
        if (z3) {
            return (character - 'A') + 10;
        }
        fail$default(this, "Invalid toHexChar char '" + character + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void skipElement(boolean allowLenientStrings) {
        List tokenStack = new ArrayList();
        byte lastToken = peekNextToken();
        if (lastToken != 8 && lastToken != 6) {
            consumeStringLenient();
            return;
        }
        while (true) {
            byte lastToken2 = peekNextToken();
            if (lastToken2 == 1) {
                if (allowLenientStrings) {
                    consumeStringLenient();
                } else {
                    consumeKeyString();
                }
            } else {
                if (lastToken2 == 8 || lastToken2 == 6) {
                    tokenStack.add(Byte.valueOf(lastToken2));
                } else if (lastToken2 == 9) {
                    if (((Number) CollectionsKt.last(tokenStack)).byteValue() != 8) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found ] instead of } at path: " + this.path, getSource());
                    }
                    CollectionsKt.removeLast(tokenStack);
                } else if (lastToken2 == 7) {
                    if (((Number) CollectionsKt.last(tokenStack)).byteValue() != 6) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found } instead of ] at path: " + this.path, getSource());
                    }
                    CollectionsKt.removeLast(tokenStack);
                } else if (lastToken2 == 10) {
                    fail$default(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                consumeNextToken();
                if (tokenStack.size() == 0) {
                    return;
                }
            }
        }
    }

    @NotNull
    public String toString() {
        return "JsonReader(source='" + ((Object) getSource()) + "', currentPosition=" + this.currentPosition + ')';
    }

    public final void failOnUnknownKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String processed = substring(0, this.currentPosition);
        int lastIndexOf = StringsKt.lastIndexOf$default((CharSequence) processed, key, 0, false, 6, (Object) null);
        throw new JsonDecodingException("Encountered an unknown key '" + key + "' at offset " + lastIndexOf + " at path: " + this.path.getPath() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) JsonExceptionsKt.minify(getSource(), lastIndexOf)));
    }

    public static /* synthetic */ Void fail$default(AbstractJsonLexer abstractJsonLexer, String str, int i, String str2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i2 & 2) != 0) {
            i = abstractJsonLexer.currentPosition;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return abstractJsonLexer.fail(str, i, str2);
    }

    @NotNull
    public final Void fail(@NotNull String message, int position, @NotNull String hint) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        String hintMessage = hint.length() == 0 ? "" : '\n' + hint;
        throw JsonExceptionsKt.JsonDecodingException(position, message + " at path: " + this.path.getPath() + hintMessage, getSource());
    }

    public final long consumeNumericLiteral() {
        boolean z;
        int current = prefetchOrEof(skipWhitespaces());
        if (current >= getSource().length() || current == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (getSource().charAt(current) == '\"') {
            current++;
            if (current == getSource().length()) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            z = true;
        } else {
            z = false;
        }
        boolean hasQuotation = z;
        long accumulator = 0;
        long exponentAccumulator = 0;
        boolean isNegative = false;
        boolean isExponentPositive = false;
        boolean hasExponent = false;
        int start = current;
        while (current != getSource().length()) {
            char ch = getSource().charAt(current);
            if ((ch == 'e' || ch == 'E') && !hasExponent) {
                if (current == start) {
                    fail$default(this, "Unexpected symbol " + ch + " in numeric literal", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                isExponentPositive = true;
                hasExponent = true;
                current++;
            } else if (ch == '-' && hasExponent) {
                if (current == start) {
                    fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                isExponentPositive = false;
                current++;
            } else if (ch == '+' && hasExponent) {
                if (current == start) {
                    fail$default(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                isExponentPositive = true;
                current++;
            } else if (ch == '-') {
                if (current != start) {
                    fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                isNegative = true;
                current++;
            } else {
                byte token = AbstractJsonLexerKt.charToTokenClass(ch);
                if (token != 0) {
                    break;
                }
                current++;
                int digit = ch - '0';
                boolean z2 = 0 <= digit && digit < 10;
                if (!z2) {
                    fail$default(this, "Unexpected symbol '" + ch + "' in numeric literal", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                if (hasExponent) {
                    exponentAccumulator = (exponentAccumulator * ((long) 10)) + ((long) digit);
                } else {
                    accumulator = (accumulator * ((long) 10)) - ((long) digit);
                    if (accumulator > 0) {
                        fail$default(this, "Numeric value overflow", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
        }
        boolean hasChars = current != start;
        if (start == current || (isNegative && start == current - 1)) {
            fail$default(this, "Expected numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (hasQuotation) {
            if (!hasChars) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (getSource().charAt(current) != '\"') {
                fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            current++;
        }
        this.currentPosition = current;
        if (hasExponent) {
            double doubleAccumulator = accumulator * consumeNumericLiteral$calculateExponent(exponentAccumulator, isExponentPositive);
            if (doubleAccumulator > 9.223372036854776E18d || doubleAccumulator < -9.223372036854776E18d) {
                fail$default(this, "Numeric value overflow", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (!(Math.floor(doubleAccumulator) == doubleAccumulator)) {
                fail$default(this, "Can't convert " + doubleAccumulator + " to Long", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            accumulator = (long) doubleAccumulator;
        }
        if (isNegative) {
            return accumulator;
        }
        if (accumulator != Long.MIN_VALUE) {
            return -accumulator;
        }
        fail$default(this, "Numeric value overflow", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private static final double consumeNumericLiteral$calculateExponent(long exponentAccumulator, boolean isExponentPositive) {
        if (!isExponentPositive) {
            return Math.pow(10.0d, -exponentAccumulator);
        }
        if (isExponentPositive) {
            return Math.pow(10.0d, exponentAccumulator);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long consumeNumericLiteralFully() {
        long result = consumeNumericLiteral();
        byte next = consumeNextToken();
        if (next == 10) {
            return result;
        }
        AbstractJsonLexerKt.tokenDescription((byte) 10);
        int position$iv = this.currentPosition - 1;
        String s$iv = (this.currentPosition == getSource().length() || position$iv < 0) ? "EOF" : String.valueOf(getSource().charAt(position$iv));
        fail$default(this, "Expected input to contain a single valid number, but got '" + s$iv + "' after it", position$iv, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final boolean consumeBoolean() {
        return consumeBoolean(skipWhitespaces());
    }

    public final boolean consumeBooleanLenient() {
        boolean z;
        int current = skipWhitespaces();
        if (current == getSource().length()) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (getSource().charAt(current) == '\"') {
            current++;
            z = true;
        } else {
            z = false;
        }
        boolean hasQuotation = z;
        boolean result = consumeBoolean(current);
        if (hasQuotation) {
            if (this.currentPosition == getSource().length()) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (getSource().charAt(this.currentPosition) != '\"') {
                fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            this.currentPosition++;
            int i = this.currentPosition;
        }
        return result;
    }

    private final boolean consumeBoolean(int start) {
        int current = prefetchOrEof(start);
        if (current >= getSource().length() || current == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int current2 = current + 1;
        switch (getSource().charAt(current) | ' ') {
            case 102:
                consumeBooleanLiteral("alse", current2);
                return false;
            case 116:
                consumeBooleanLiteral("rue", current2);
                return true;
            default:
                fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
        }
    }

    private final void consumeBooleanLiteral(String literalSuffix, int current) {
        if (getSource().length() - current < literalSuffix.length()) {
            fail$default(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = literalSuffix.length();
        for (int i = 0; i < length; i++) {
            char expected = literalSuffix.charAt(i);
            char actual = getSource().charAt(current + i);
            if (expected != (actual | ' ')) {
                fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.currentPosition = current + literalSuffix.length();
    }

    private final <T> T withPositionRollback(Function0<? extends T> action) {
        int snapshot = this.currentPosition;
        try {
            T tInvoke = action.invoke();
            InlineMarker.finallyStart(1);
            this.currentPosition = snapshot;
            InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            this.currentPosition = snapshot;
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }
}
