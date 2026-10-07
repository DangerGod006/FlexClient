package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Encoding.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/encoding/CompositeEncoder.class */
public interface CompositeEncoder {
    @NotNull
    SerializersModule getSerializersModule();

    void endStructure(@NotNull SerialDescriptor serialDescriptor);

    void encodeBooleanElement(@NotNull SerialDescriptor serialDescriptor, int i, boolean z);

    void encodeByteElement(@NotNull SerialDescriptor serialDescriptor, int i, byte b);

    void encodeShortElement(@NotNull SerialDescriptor serialDescriptor, int i, short s);

    void encodeCharElement(@NotNull SerialDescriptor serialDescriptor, int i, char c);

    void encodeIntElement(@NotNull SerialDescriptor serialDescriptor, int i, int i2);

    void encodeLongElement(@NotNull SerialDescriptor serialDescriptor, int i, long j);

    void encodeFloatElement(@NotNull SerialDescriptor serialDescriptor, int i, float f);

    void encodeDoubleElement(@NotNull SerialDescriptor serialDescriptor, int i, double d);

    void encodeStringElement(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull String str);

    @NotNull
    Encoder encodeInlineElement(@NotNull SerialDescriptor serialDescriptor, int i);

    <T> void encodeSerializableElement(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull SerializationStrategy<? super T> serializationStrategy, T t);

    @ExperimentalSerializationApi
    <T> void encodeNullableSerializableElement(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull SerializationStrategy<? super T> serializationStrategy, @Nullable T t);

    /* JADX INFO: compiled from: Encoding.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/encoding/CompositeEncoder$DefaultImpls.class */
    public static final class DefaultImpls {
        @ExperimentalSerializationApi
        @Deprecated
        public static boolean shouldEncodeElementDefault(@NotNull CompositeEncoder $this, @NotNull SerialDescriptor descriptor, int index) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return $this.shouldEncodeElementDefault(descriptor, index);
        }
    }

    @ExperimentalSerializationApi
    default boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }
}
