package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonIterator.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/JsonIteratorKt.class */
public final class JsonIteratorKt {

    /* JADX INFO: compiled from: JsonIterator.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/JsonIteratorKt$WhenMappings.class */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DecodeSequenceMode.values().length];
            try {
                iArr[DecodeSequenceMode.WHITESPACE_SEPARATED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[DecodeSequenceMode.ARRAY_WRAPPED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[DecodeSequenceMode.AUTO_DETECT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final <T> Iterator<T> JsonIterator(@NotNull DecodeSequenceMode mode, @NotNull Json json, @NotNull ReaderJsonLexer lexer, @NotNull DeserializationStrategy<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        switch (WhenMappings.$EnumSwitchMapping$0[determineFormat(lexer, mode).ordinal()]) {
            case 1:
                return new JsonIteratorWsSeparated(json, lexer, deserializer);
            case 2:
                return new JsonIteratorArrayWrapped(json, lexer, deserializer);
            case 3:
                throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.".toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final DecodeSequenceMode determineFormat(AbstractJsonLexer $this$determineFormat, DecodeSequenceMode suggested) {
        switch (WhenMappings.$EnumSwitchMapping$0[suggested.ordinal()]) {
            case 1:
                return DecodeSequenceMode.WHITESPACE_SEPARATED;
            case 2:
                if (tryConsumeStartArray($this$determineFormat)) {
                    return DecodeSequenceMode.ARRAY_WRAPPED;
                }
                String expected$iv = AbstractJsonLexerKt.tokenDescription((byte) 8);
                int position$iv = $this$determineFormat.currentPosition - 1;
                String s$iv = ($this$determineFormat.currentPosition == $this$determineFormat.getSource().length() || position$iv < 0) ? "EOF" : String.valueOf($this$determineFormat.getSource().charAt(position$iv));
                AbstractJsonLexer.fail$default($this$determineFormat, "Expected " + expected$iv + ", but had '" + s$iv + "' instead", position$iv, null, 4, null);
                throw new KotlinNothingValueException();
            case 3:
                return tryConsumeStartArray($this$determineFormat) ? DecodeSequenceMode.ARRAY_WRAPPED : DecodeSequenceMode.WHITESPACE_SEPARATED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean tryConsumeStartArray(AbstractJsonLexer $this$tryConsumeStartArray) {
        if ($this$tryConsumeStartArray.peekNextToken() == 8) {
            $this$tryConsumeStartArray.consumeNextToken((byte) 8);
            return true;
        }
        return false;
    }
}
