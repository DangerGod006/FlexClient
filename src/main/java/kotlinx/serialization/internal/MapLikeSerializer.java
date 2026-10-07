package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/MapLikeSerializer.class */
@InternalSerializationApi
public abstract class MapLikeSerializer<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractCollectionSerializer<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    @NotNull
    private final KSerializer<Key> keySerializer;

    @NotNull
    private final KSerializer<Value> valueSerializer;

    protected abstract void insertKeyValuePair(@NotNull Builder builder, int i, Key key, Value value);

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public abstract SerialDescriptor getDescriptor();

    public /* synthetic */ MapLikeSerializer(KSerializer keySerializer, KSerializer valueSerializer, DefaultConstructorMarker $constructor_marker) {
        this(keySerializer, valueSerializer);
    }

    @NotNull
    public final KSerializer<Key> getKeySerializer() {
        return this.keySerializer;
    }

    @NotNull
    public final KSerializer<Value> getValueSerializer() {
        return this.valueSerializer;
    }

    private MapLikeSerializer(KSerializer<Key> keySerializer, KSerializer<Value> valueSerializer) {
        super(null);
        this.keySerializer = keySerializer;
        this.valueSerializer = valueSerializer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readAll(@NotNull CompositeDecoder decoder, @NotNull Builder builder, int startIndex, int size) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (!(size >= 0)) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, size * 2), 2);
        int index = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step <= 0 || index > last) && (step >= 0 || last > index)) {
            return;
        }
        while (true) {
            readElement(decoder, startIndex + index, (Map) builder, false);
            if (index == last) {
                return;
            } else {
                index += step;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull Builder builder, boolean checkIndex) {
        int i;
        Object objDecodeSerializableElement$default;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object key = CompositeDecoder.decodeSerializableElement$default(decoder, getDescriptor(), index, this.keySerializer, null, 8, null);
        if (checkIndex) {
            int it = decoder.decodeElementIndex(getDescriptor());
            if (it == index + 1) {
                i = it;
            } else {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + index + ", returned index for value: " + it).toString());
            }
        } else {
            i = index + 1;
        }
        int vIndex = i;
        if (builder.containsKey(key) && !(this.valueSerializer.getDescriptor().getKind() instanceof PrimitiveKind)) {
            objDecodeSerializableElement$default = decoder.decodeSerializableElement(getDescriptor(), vIndex, this.valueSerializer, MapsKt.getValue(builder, key));
        } else {
            objDecodeSerializableElement$default = CompositeDecoder.decodeSerializableElement$default(decoder, getDescriptor(), vIndex, this.valueSerializer, null, 8, null);
        }
        Object value = objDecodeSerializableElement$default;
        builder.put(key, value);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, Collection value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int size = collectionSize(value);
        SerialDescriptor descriptor$iv = getDescriptor();
        CompositeEncoder composite$iv = encoder.beginCollection(descriptor$iv, size);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itCollectionIterator = collectionIterator(value);
        int index = 0;
        while (itCollectionIterator.hasNext()) {
            Object element$iv = itCollectionIterator.next();
            Map.Entry<? extends Key, ? extends Value> entry = (Map.Entry) element$iv;
            Key key = entry.getKey();
            Value value2 = entry.getValue();
            int i = index;
            int index2 = i + 1;
            composite$iv.encodeSerializableElement(getDescriptor(), i, getKeySerializer(), key);
            index = index2 + 1;
            composite$iv.encodeSerializableElement(getDescriptor(), index2, getValueSerializer(), value2);
        }
        composite$iv.endStructure(descriptor$iv);
    }
}
