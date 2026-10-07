package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Encoding.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/encoding/Encoder.class */
public interface Encoder {
    @NotNull
    SerializersModule getSerializersModule();

    @ExperimentalSerializationApi
    void encodeNull();

    void encodeBoolean(boolean z);

    void encodeByte(byte b);

    void encodeShort(short s);

    void encodeChar(char c);

    void encodeInt(int i);

    void encodeLong(long j);

    void encodeFloat(float f);

    void encodeDouble(double d);

    void encodeString(@NotNull String str);

    void encodeEnum(@NotNull SerialDescriptor serialDescriptor, int i);

    @NotNull
    Encoder encodeInline(@NotNull SerialDescriptor serialDescriptor);

    @NotNull
    CompositeEncoder beginStructure(@NotNull SerialDescriptor serialDescriptor);

    /* JADX INFO: compiled from: Encoding.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/encoding/Encoder$DefaultImpls.class */
    public static final class DefaultImpls {
        @ExperimentalSerializationApi
        @Deprecated
        public static void encodeNotNullMark(@NotNull Encoder $this) {
            $this.encodeNotNullMark();
        }

        @Deprecated
        @NotNull
        public static CompositeEncoder beginCollection(@NotNull Encoder $this, @NotNull SerialDescriptor descriptor, int collectionSize) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return $this.beginCollection(descriptor, collectionSize);
        }

        @Deprecated
        public static <T> void encodeSerializableValue(@NotNull Encoder $this, @NotNull SerializationStrategy<? super T> serializer, T value) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            $this.encodeSerializableValue(serializer, value);
        }

        @ExperimentalSerializationApi
        @Deprecated
        public static <T> void encodeNullableSerializableValue(@NotNull Encoder $this, @NotNull SerializationStrategy<? super T> serializer, @Nullable T value) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            $this.encodeNullableSerializableValue(serializer, value);
        }
    }

    @ExperimentalSerializationApi
    default void encodeNotNullMark() {
    }

    @NotNull
    default CompositeEncoder beginCollection(@NotNull SerialDescriptor descriptor, int collectionSize) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return beginStructure(descriptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    default <T> void encodeSerializableValue(@NotNull SerializationStrategy<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        serializer.serialize(this, value);
    }

    @ExperimentalSerializationApi
    default <T> void encodeNullableSerializableValue(@NotNull SerializationStrategy<? super T> serializer, @Nullable T value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        boolean isNullabilitySupported = serializer.getDescriptor().isNullable();
        if (isNullabilitySupported) {
            encodeSerializableValue(serializer, value);
        } else if (value == null) {
            encodeNull();
        } else {
            encodeNotNullMark();
            encodeSerializableValue(serializer, value);
        }
    }
}
