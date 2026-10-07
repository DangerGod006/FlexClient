package kotlinx.serialization.json;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonContentPolymorphicSerializer.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/JsonContentPolymorphicSerializer.class */
public abstract class JsonContentPolymorphicSerializer<T> implements KSerializer<T> {

    @NotNull
    private final KClass<T> baseClass;

    @NotNull
    private final SerialDescriptor descriptor;

    @NotNull
    protected abstract DeserializationStrategy<T> selectDeserializer(@NotNull JsonElement jsonElement);

    public JsonContentPolymorphicSerializer(@NotNull KClass<T> baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.baseClass = baseClass;
        this.descriptor = SerialDescriptorsKt.buildSerialDescriptor$default("JsonContentPolymorphicSerializer<" + this.baseClass.getSimpleName() + '>', PolymorphicKind.SEALED.INSTANCE, new SerialDescriptor[0], null, 8, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        KSerializer polymorphic = encoder.getSerializersModule().getPolymorphic(this.baseClass, value);
        if (polymorphic == null) {
            KSerializer kSerializerSerializerOrNull = SerializersKt.serializerOrNull(Reflection.getOrCreateKotlinClass(value.getClass()));
            if (kSerializerSerializerOrNull == null) {
                throwSubtypeNotRegistered(Reflection.getOrCreateKotlinClass(value.getClass()), this.baseClass);
                throw new KotlinNothingValueException();
            }
            polymorphic = kSerializerSerializerOrNull;
        }
        SerializationStrategy<T> actualSerializer = polymorphic;
        ((KSerializer) actualSerializer).serialize(encoder, value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    /* JADX INFO: renamed from: deserialize */
    public final T mo1886deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonDecoder jsonDecoderAsJsonDecoder = JsonElementSerializersKt.asJsonDecoder(decoder);
        JsonElement jsonElementDecodeJsonElement = jsonDecoderAsJsonDecoder.decodeJsonElement();
        DeserializationStrategy<T> deserializationStrategySelectDeserializer = selectDeserializer(jsonElementDecodeJsonElement);
        Intrinsics.checkNotNull(deserializationStrategySelectDeserializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return (T) jsonDecoderAsJsonDecoder.getJson().decodeFromJsonElement((KSerializer) deserializationStrategySelectDeserializer, jsonElementDecodeJsonElement);
    }

    private final Void throwSubtypeNotRegistered(KClass<?> subClass, KClass<?> baseClass) {
        String simpleName = subClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(subClass);
        }
        String subClassName = simpleName;
        String scope = "in the scope of '" + baseClass.getSimpleName() + '\'';
        throw new SerializationException("Class '" + subClassName + "' is not registered for polymorphic serialization " + scope + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }
}
