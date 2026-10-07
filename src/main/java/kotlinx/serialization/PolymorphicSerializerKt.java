package kotlinx.serialization;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.AbstractPolymorphicSerializerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PolymorphicSerializer.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/PolymorphicSerializerKt.class */
public final class PolymorphicSerializerKt {
    @InternalSerializationApi
    @NotNull
    public static final <T> DeserializationStrategy<T> findPolymorphicSerializer(@NotNull AbstractPolymorphicSerializer<T> $this$findPolymorphicSerializer, @NotNull CompositeDecoder decoder, @Nullable String klassName) {
        Intrinsics.checkNotNullParameter($this$findPolymorphicSerializer, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        DeserializationStrategy<T> deserializationStrategyFindPolymorphicSerializerOrNull = $this$findPolymorphicSerializer.findPolymorphicSerializerOrNull(decoder, klassName);
        if (deserializationStrategyFindPolymorphicSerializerOrNull != null) {
            return deserializationStrategyFindPolymorphicSerializerOrNull;
        }
        AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered(klassName, (KClass<?>) $this$findPolymorphicSerializer.getBaseClass());
        throw new KotlinNothingValueException();
    }

    @InternalSerializationApi
    @NotNull
    public static final <T> SerializationStrategy<T> findPolymorphicSerializer(@NotNull AbstractPolymorphicSerializer<T> $this$findPolymorphicSerializer, @NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter($this$findPolymorphicSerializer, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerializationStrategy<T> serializationStrategyFindPolymorphicSerializerOrNull = $this$findPolymorphicSerializer.findPolymorphicSerializerOrNull(encoder, value);
        if (serializationStrategyFindPolymorphicSerializerOrNull != null) {
            return serializationStrategyFindPolymorphicSerializerOrNull;
        }
        AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered((KClass<?>) Reflection.getOrCreateKotlinClass(value.getClass()), (KClass<?>) $this$findPolymorphicSerializer.getBaseClass());
        throw new KotlinNothingValueException();
    }
}
