package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NullableSerializer.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/NullableSerializer.class */
@PublishedApi
public final class NullableSerializer<T> implements KSerializer<T> {

    @NotNull
    private final KSerializer<T> serializer;

    @NotNull
    private final SerialDescriptor descriptor;

    public NullableSerializer(@NotNull KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.serializer = serializer;
        this.descriptor = new SerialDescriptorForNullable(this.serializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @Nullable T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (value != null) {
            encoder.encodeNotNullMark();
            encoder.encodeSerializableValue(this.serializer, value);
        } else {
            encoder.encodeNull();
        }
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @Nullable
    /* JADX INFO: renamed from: deserialize */
    public T mo1886deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.decodeNotNullMark() ? (T) decoder.decodeSerializableValue(this.serializer) : (T) decoder.decodeNull();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.serializer, ((NullableSerializer) other).serializer);
    }

    public int hashCode() {
        return this.serializer.hashCode();
    }
}
