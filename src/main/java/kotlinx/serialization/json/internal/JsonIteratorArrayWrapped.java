package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonIterator.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/JsonIteratorArrayWrapped.class */
final class JsonIteratorArrayWrapped<T> implements Iterator<T>, KMappedMarker {

    @NotNull
    private final Json json;

    @NotNull
    private final ReaderJsonLexer lexer;

    @NotNull
    private final DeserializationStrategy<T> deserializer;
    private boolean first;
    private boolean finished;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonIteratorArrayWrapped(@NotNull Json json, @NotNull ReaderJsonLexer lexer, @NotNull DeserializationStrategy<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.json = json;
        this.lexer = lexer;
        this.deserializer = deserializer;
        this.first = true;
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.first) {
            this.first = false;
        } else {
            this.lexer.consumeNextToken(',');
        }
        return (T) new StreamingJsonDecoder(this.json, WriteMode.OBJ, this.lexer, this.deserializer.getDescriptor(), null).decodeSerializableValue(this.deserializer);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.finished) {
            return false;
        }
        if (this.lexer.peekNextToken() == 9) {
            this.finished = true;
            this.lexer.consumeNextToken((byte) 9);
            if (this.lexer.isNotEof()) {
                if (this.lexer.peekNextToken() == 8) {
                    AbstractJsonLexer.fail$default(this.lexer, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                this.lexer.expectEof();
                return false;
            }
            return false;
        }
        if (this.lexer.isNotEof() || this.finished) {
            return true;
        }
        AbstractJsonLexer $this$iv = this.lexer;
        String expected$iv = AbstractJsonLexerKt.tokenDescription((byte) 9);
        int position$iv = $this$iv.currentPosition - 1;
        String s$iv = ($this$iv.currentPosition == $this$iv.getSource().length() || position$iv < 0) ? "EOF" : String.valueOf($this$iv.getSource().charAt(position$iv));
        AbstractJsonLexer.fail$default($this$iv, "Expected " + expected$iv + ", but had '" + s$iv + "' instead", position$iv, null, 4, null);
        throw new KotlinNothingValueException();
    }
}
