package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonExceptions.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/JsonExceptionsKt.class */
public final class JsonExceptionsKt {
    @NotNull
    public static final JsonDecodingException JsonDecodingException(int offset, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new JsonDecodingException(offset >= 0 ? "Unexpected JSON token at offset " + offset + ": " + message : message);
    }

    @NotNull
    public static final JsonDecodingException JsonDecodingException(int offset, @NotNull String message, @NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        return JsonDecodingException(offset, message + "\nJSON input: " + ((Object) minify(input, offset)));
    }

    @NotNull
    public static final JsonEncodingException InvalidFloatingPointEncoded(@NotNull Number value, @NotNull String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) minify$default(output, 0, 1, null)));
    }

    @NotNull
    public static final Void throwInvalidFloatingPointDecoded(@NotNull AbstractJsonLexer $this$throwInvalidFloatingPointDecoded, @NotNull Number result) {
        Intrinsics.checkNotNullParameter($this$throwInvalidFloatingPointDecoded, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        AbstractJsonLexer.fail$default($this$throwInvalidFloatingPointDecoded, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, AbstractJsonLexerKt.specialFlowingValuesHint, 2, null);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void invalidTrailingComma$default(AbstractJsonLexer abstractJsonLexer, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "object";
        }
        return invalidTrailingComma(abstractJsonLexer, str);
    }

    @NotNull
    public static final Void invalidTrailingComma(@NotNull AbstractJsonLexer $this$invalidTrailingComma, @NotNull String entity) {
        Intrinsics.checkNotNullParameter($this$invalidTrailingComma, "<this>");
        Intrinsics.checkNotNullParameter(entity, "entity");
        $this$invalidTrailingComma.fail("Trailing comma before the end of JSON " + entity, $this$invalidTrailingComma.currentPosition - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final JsonEncodingException InvalidKeyKindException(@NotNull SerialDescriptor keyDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.getSerialName() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    @NotNull
    public static final JsonEncodingException InvalidFloatingPointEncoded(@NotNull Number value, @NotNull String key, @NotNull String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return new JsonEncodingException(unexpectedFpErrorMessage(value, key, output));
    }

    @NotNull
    public static final JsonDecodingException InvalidFloatingPointDecoded(@NotNull Number value, @NotNull String key, @NotNull String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return JsonDecodingException(-1, unexpectedFpErrorMessage(value, key, output));
    }

    private static final String unexpectedFpErrorMessage(Number value, String key, String output) {
        return "Unexpected special floating-point value " + value + " with key " + key + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) minify$default(output, 0, 1, null));
    }

    public static /* synthetic */ CharSequence minify$default(CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return minify(charSequence, i);
    }

    @NotNull
    public static final CharSequence minify(@NotNull CharSequence $this$minify, int offset) {
        Intrinsics.checkNotNullParameter($this$minify, "<this>");
        if ($this$minify.length() < 200) {
            return $this$minify;
        }
        if (offset == -1) {
            int start = $this$minify.length() - 60;
            return start <= 0 ? $this$minify : "....." + $this$minify.subSequence(start, $this$minify.length()).toString();
        }
        int start2 = offset - 30;
        int end = offset + 30;
        String prefix = start2 <= 0 ? "" : ".....";
        String suffix = end >= $this$minify.length() ? "" : ".....";
        return prefix + $this$minify.subSequence(RangesKt.coerceAtLeast(start2, 0), RangesKt.coerceAtMost(end, $this$minify.length())).toString() + suffix;
    }
}
