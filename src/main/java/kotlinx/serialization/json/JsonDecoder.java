package kotlinx.serialization.json;

import kotlin.SubclassOptInRequired;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SealedSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JsonDecoder.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/JsonDecoder.class */
@SubclassOptInRequired(markerClass = {SealedSerializationApi.class})
public interface JsonDecoder extends Decoder, CompositeDecoder {
    @NotNull
    Json getJson();

    @NotNull
    JsonElement decodeJsonElement();

    /* JADX INFO: compiled from: JsonDecoder.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/JsonDecoder$DefaultImpls.class */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> T decodeSerializableValue(@NotNull JsonDecoder jsonDecoder, @NotNull DeserializationStrategy<? extends T> deserializer) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return (T) jsonDecoder.decodeSerializableValue(deserializer);
        }

        @ExperimentalSerializationApi
        @Deprecated
        @Nullable
        public static <T> T decodeNullableSerializableValue(@NotNull JsonDecoder jsonDecoder, @NotNull DeserializationStrategy<? extends T> deserializer) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return (T) jsonDecoder.decodeNullableSerializableValue(deserializer);
        }

        @ExperimentalSerializationApi
        @Deprecated
        public static boolean decodeSequentially(@NotNull JsonDecoder $this) {
            return $this.decodeSequentially();
        }

        @Deprecated
        public static int decodeCollectionSize(@NotNull JsonDecoder $this, @NotNull SerialDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return $this.decodeCollectionSize(descriptor);
        }
    }
}
