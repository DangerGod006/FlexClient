package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/KeyValueSerializer.class */
@PublishedApi
public abstract class KeyValueSerializer<K, V, R> implements KSerializer<R> {

    @NotNull
    private final KSerializer<K> keySerializer;

    @NotNull
    private final KSerializer<V> valueSerializer;

    protected abstract K getKey(R r);

    protected abstract V getValue(R r);

    protected abstract R toResult(K k, V v);

    public /* synthetic */ KeyValueSerializer(KSerializer keySerializer, KSerializer valueSerializer, DefaultConstructorMarker $constructor_marker) {
        this(keySerializer, valueSerializer);
    }

    private KeyValueSerializer(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        this.keySerializer = keySerializer;
        this.valueSerializer = valueSerializer;
    }

    @NotNull
    protected final KSerializer<K> getKeySerializer() {
        return this.keySerializer;
    }

    @NotNull
    protected final KSerializer<V> getValueSerializer() {
        return this.valueSerializer;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, R value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        CompositeEncoder structuredEncoder = encoder.beginStructure(getDescriptor());
        structuredEncoder.encodeSerializableElement(getDescriptor(), 0, this.keySerializer, getKey(value));
        structuredEncoder.encodeSerializableElement(getDescriptor(), 1, this.valueSerializer, getValue(value));
        structuredEncoder.endStructure(getDescriptor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: deserialize */
    public R mo1886deserialize(@NotNull Decoder decoder) {
        Object result;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        if (!compositeDecoderBeginStructure.decodeSequentially()) {
            Object objDecodeSerializableElement$default = TuplesKt.NULL;
            Object objDecodeSerializableElement$default2 = TuplesKt.NULL;
            while (true) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(getDescriptor());
                switch (iDecodeElementIndex) {
                    case -1:
                        if (objDecodeSerializableElement$default == TuplesKt.NULL) {
                            throw new SerializationException("Element 'key' is missing");
                        }
                        if (objDecodeSerializableElement$default2 == TuplesKt.NULL) {
                            throw new SerializationException("Element 'value' is missing");
                        }
                        result = toResult(objDecodeSerializableElement$default, objDecodeSerializableElement$default2);
                        break;
                    case 0:
                        objDecodeSerializableElement$default = CompositeDecoder.decodeSerializableElement$default(compositeDecoderBeginStructure, getDescriptor(), 0, getKeySerializer(), null, 8, null);
                        continue;
                    case 1:
                        objDecodeSerializableElement$default2 = CompositeDecoder.decodeSerializableElement$default(compositeDecoderBeginStructure, getDescriptor(), 1, getValueSerializer(), null, 8, null);
                        continue;
                    default:
                        throw new SerializationException("Invalid index: " + iDecodeElementIndex);
                }
            }
        } else {
            result = toResult(CompositeDecoder.decodeSerializableElement$default(compositeDecoderBeginStructure, getDescriptor(), 0, getKeySerializer(), null, 8, null), CompositeDecoder.decodeSerializableElement$default(compositeDecoderBeginStructure, getDescriptor(), 1, getValueSerializer(), null, 8, null));
        }
        R r = (R) result;
        compositeDecoderBeginStructure.endStructure(descriptor);
        return r;
    }
}
