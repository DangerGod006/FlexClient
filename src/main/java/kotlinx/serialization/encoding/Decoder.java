package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Decoding.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/encoding/Decoder.class */
public interface Decoder {
    @NotNull
    SerializersModule getSerializersModule();

    @ExperimentalSerializationApi
    boolean decodeNotNullMark();

    @ExperimentalSerializationApi
    @Nullable
    Void decodeNull();

    boolean decodeBoolean();

    byte decodeByte();

    short decodeShort();

    char decodeChar();

    int decodeInt();

    long decodeLong();

    float decodeFloat();

    double decodeDouble();

    @NotNull
    String decodeString();

    int decodeEnum(@NotNull SerialDescriptor serialDescriptor);

    @NotNull
    Decoder decodeInline(@NotNull SerialDescriptor serialDescriptor);

    @NotNull
    CompositeDecoder beginStructure(@NotNull SerialDescriptor serialDescriptor);

    /* JADX INFO: compiled from: Decoding.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/encoding/Decoder$DefaultImpls.class */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> T decodeSerializableValue(@NotNull Decoder decoder, @NotNull DeserializationStrategy<? extends T> deserializer) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return (T) decoder.decodeSerializableValue(deserializer);
        }

        @ExperimentalSerializationApi
        @Deprecated
        @Nullable
        public static <T> T decodeNullableSerializableValue(@NotNull Decoder decoder, @NotNull DeserializationStrategy<? extends T> deserializer) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return (T) decoder.decodeNullableSerializableValue(deserializer);
        }
    }

    default <T> T decodeSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return deserializer.mo1886deserialize(this);
    }

    @ExperimentalSerializationApi
    @Nullable
    default <T> T decodeNullableSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!deserializer.getDescriptor().isNullable() && !decodeNotNullMark()) {
            return (T) decodeNull();
        }
        return (T) decodeSerializableValue(deserializer);
    }
}
