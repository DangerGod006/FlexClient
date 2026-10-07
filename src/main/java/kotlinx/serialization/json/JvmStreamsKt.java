package kotlinx.serialization.json;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KType;
import kotlin.sequences.Sequence;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.internal.JavaStreamSerialReader;
import kotlinx.serialization.json.internal.JsonStreamsKt;
import kotlinx.serialization.json.internal.JsonToJavaStreamWriter;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmStreams.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/JvmStreamsKt.class */
public final class JvmStreamsKt {
    @ExperimentalSerializationApi
    public static final <T> void encodeToStream(@NotNull Json $this$encodeToStream, @NotNull SerializationStrategy<? super T> serializer, T value, @NotNull OutputStream stream) throws IOException {
        Intrinsics.checkNotNullParameter($this$encodeToStream, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(stream, "stream");
        JsonToJavaStreamWriter writer = new JsonToJavaStreamWriter(stream);
        try {
            JsonStreamsKt.encodeByWriter($this$encodeToStream, writer, serializer, value);
            writer.release();
        } catch (Throwable th) {
            writer.release();
            throw th;
        }
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> void encodeToStream(Json $this$encodeToStream, T value, OutputStream stream) throws IOException {
        Intrinsics.checkNotNullParameter($this$encodeToStream, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        SerializersModule serializersModule = $this$encodeToStream.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        encodeToStream($this$encodeToStream, SerializersKt.serializer(serializersModule, (KType) null), value, stream);
    }

    @ExperimentalSerializationApi
    public static final <T> T decodeFromStream(@NotNull Json json, @NotNull DeserializationStrategy<? extends T> deserializer, @NotNull InputStream stream) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(stream, "stream");
        JavaStreamSerialReader javaStreamSerialReader = new JavaStreamSerialReader(stream);
        try {
            T t = (T) JsonStreamsKt.decodeByReader(json, deserializer, javaStreamSerialReader);
            javaStreamSerialReader.release();
            return t;
        } catch (Throwable th) {
            javaStreamSerialReader.release();
            throw th;
        }
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> T decodeFromStream(Json json, InputStream stream) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromStream(json, SerializersKt.serializer(serializersModule, (KType) null), stream);
    }

    public static /* synthetic */ Sequence decodeToSequence$default(Json json, InputStream inputStream, DeserializationStrategy deserializationStrategy, DecodeSequenceMode decodeSequenceMode, int i, Object obj) {
        if ((i & 4) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        return decodeToSequence(json, inputStream, deserializationStrategy, decodeSequenceMode);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final <T> Sequence<T> decodeToSequence(@NotNull Json $this$decodeToSequence, @NotNull InputStream stream, @NotNull DeserializationStrategy<? extends T> deserializer, @NotNull DecodeSequenceMode format) {
        Intrinsics.checkNotNullParameter($this$decodeToSequence, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(format, "format");
        return JsonStreamsKt.decodeToSequenceByReader($this$decodeToSequence, new JavaStreamSerialReader(stream), deserializer, format);
    }

    public static /* synthetic */ Sequence decodeToSequence$default(Json $this$decodeToSequence_u24default, InputStream stream, DecodeSequenceMode format, int i, Object obj) {
        if ((i & 2) != 0) {
            format = DecodeSequenceMode.AUTO_DETECT;
        }
        Intrinsics.checkNotNullParameter($this$decodeToSequence_u24default, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(format, "format");
        SerializersModule serializersModule = $this$decodeToSequence_u24default.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequence($this$decodeToSequence_u24default, stream, SerializersKt.serializer(serializersModule, (KType) null), format);
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> Sequence<T> decodeToSequence(Json $this$decodeToSequence, InputStream stream, DecodeSequenceMode format) {
        Intrinsics.checkNotNullParameter($this$decodeToSequence, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(format, "format");
        SerializersModule serializersModule = $this$decodeToSequence.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequence($this$decodeToSequence, stream, SerializersKt.serializer(serializersModule, (KType) null), format);
    }
}
