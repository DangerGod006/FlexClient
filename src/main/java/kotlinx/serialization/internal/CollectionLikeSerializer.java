package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/CollectionLikeSerializer.class */
@PublishedApi
public abstract class CollectionLikeSerializer<Element, Collection, Builder> extends AbstractCollectionSerializer<Element, Collection, Builder> {

    @NotNull
    private final KSerializer<Element> elementSerializer;

    protected abstract void insert(Builder builder, int i, Element element);

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public abstract SerialDescriptor getDescriptor();

    public /* synthetic */ CollectionLikeSerializer(KSerializer elementSerializer, DefaultConstructorMarker $constructor_marker) {
        this(elementSerializer);
    }

    private CollectionLikeSerializer(KSerializer<Element> elementSerializer) {
        super(null);
        this.elementSerializer = elementSerializer;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, Collection value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int size = collectionSize(value);
        SerialDescriptor descriptor$iv = getDescriptor();
        CompositeEncoder composite$iv = encoder.beginCollection(descriptor$iv, size);
        Iterator<Element> itCollectionIterator = collectionIterator(value);
        for (int index = 0; index < size; index++) {
            composite$iv.encodeSerializableElement(getDescriptor(), index, this.elementSerializer, itCollectionIterator.next());
        }
        composite$iv.endStructure(descriptor$iv);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    protected final void readAll(@NotNull CompositeDecoder decoder, Builder builder, int startIndex, int size) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(size >= 0)) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        for (int index = 0; index < size; index++) {
            readElement(decoder, startIndex + index, builder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    protected void readElement(@NotNull CompositeDecoder decoder, int index, Builder builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        insert(builder, index, CompositeDecoder.decodeSerializableElement$default(decoder, getDescriptor(), index, this.elementSerializer, null, 8, null));
    }
}
