package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StreamingJsonDecoder.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/StreamingJsonDecoderKt.class */
public final class StreamingJsonDecoderKt {
    @JsonFriendModuleApi
    @NotNull
    public static final <T> JsonElement decodeStringToJsonTree(@NotNull Json json, @NotNull DeserializationStrategy<? extends T> deserializer, @NotNull String source) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(source, "source");
        StringJsonLexer lexer = StringJsonLexerKt.StringJsonLexer(json, source);
        StreamingJsonDecoder input = new StreamingJsonDecoder(json, WriteMode.OBJ, lexer, deserializer.getDescriptor(), null);
        JsonElement tree = input.decodeJsonElement();
        lexer.expectEof();
        return tree;
    }

    private static final <T> T parseString(AbstractJsonLexer $this$parseString, String expectedType, Function1<? super String, ? extends T> block) {
        String input = $this$parseString.consumeStringLenient();
        try {
            return block.invoke(input);
        } catch (IllegalArgumentException e) {
            AbstractJsonLexer.fail$default($this$parseString, "Failed to parse type '" + expectedType + "' for input '" + input + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
