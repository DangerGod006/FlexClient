package kotlinx.serialization;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContextualSerializer.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/ContextualSerializer.class */
@ExperimentalSerializationApi
public final class ContextualSerializer<T> implements KSerializer<T> {

    @NotNull
    private final KClass<T> serializableClass;

    @Nullable
    private final KSerializer<T> fallbackSerializer;

    @NotNull
    private final List<KSerializer<?>> typeArgumentsSerializers;

    @NotNull
    private final SerialDescriptor descriptor;

    public ContextualSerializer(@NotNull KClass<T> serializableClass, @Nullable KSerializer<T> fallbackSerializer, @NotNull KSerializer<?>[] typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(serializableClass, "serializableClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.serializableClass = serializableClass;
        this.fallbackSerializer = fallbackSerializer;
        this.typeArgumentsSerializers = ArraysKt.asList(typeArgumentsSerializers);
        this.descriptor = ContextAwareKt.withContext(SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.ContextualSerializer", SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], (v1) -> {
            return descriptor$lambda$0(r4, v1);
        }), this.serializableClass);
    }

    private final KSerializer<T> serializer(SerializersModule serializersModule) {
        KSerializer<T> contextual = serializersModule.getContextual(this.serializableClass, this.typeArgumentsSerializers);
        if (contextual == null) {
            contextual = this.fallbackSerializer;
            if (contextual == null) {
                Platform_commonKt.serializerNotRegistered(this.serializableClass);
                throw new KotlinNothingValueException();
            }
        }
        return contextual;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextualSerializer(@NotNull KClass<T> serializableClass) {
        this(serializableClass, null, PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY);
        Intrinsics.checkNotNullParameter(serializableClass, "serializableClass");
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.Unit descriptor$lambda$0(kotlinx.serialization.ContextualSerializer r4, kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder r5) {
        /*
            r0 = r5
            java.lang.String r1 = "$this$buildSerialDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r5
            r1 = r4
            kotlinx.serialization.KSerializer<T> r1 = r1.fallbackSerializer
            r2 = r1
            if (r2 == 0) goto L20
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r1.getDescriptor()
            r2 = r1
            if (r2 == 0) goto L20
            java.util.List r1 = r1.getAnnotations()
            goto L22
        L20:
            r1 = 0
        L22:
            r2 = r1
            if (r2 != 0) goto L2a
        L27:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L2a:
            r0.setAnnotations(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.ContextualSerializer.descriptor$lambda$0(kotlinx.serialization.ContextualSerializer, kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder):kotlin.Unit");
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(serializer(encoder.getSerializersModule()), value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    /* JADX INFO: renamed from: deserialize */
    public T mo1886deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return (T) decoder.decodeSerializableValue(serializer(decoder.getSerializersModule()));
    }
}
