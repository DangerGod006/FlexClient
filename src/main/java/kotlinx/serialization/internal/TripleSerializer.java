package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/TripleSerializer.class */
@PublishedApi
public final class TripleSerializer<A, B, C> implements KSerializer<Triple<? extends A, ? extends B, ? extends C>> {

    @NotNull
    private final KSerializer<A> aSerializer;

    @NotNull
    private final KSerializer<B> bSerializer;

    @NotNull
    private final KSerializer<C> cSerializer;

    @NotNull
    private final SerialDescriptor descriptor;

    public TripleSerializer(@NotNull KSerializer<A> aSerializer, @NotNull KSerializer<B> bSerializer, @NotNull KSerializer<C> cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.aSerializer = aSerializer;
        this.bSerializer = bSerializer;
        this.cSerializer = cSerializer;
        this.descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("kotlin.Triple", new SerialDescriptor[0], (v1) -> {
            return descriptor$lambda$0(r3, v1);
        });
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    private static final Unit descriptor$lambda$0(TripleSerializer this$0, ClassSerialDescriptorBuilder buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        ClassSerialDescriptorBuilder.element$default(buildClassSerialDescriptor, "first", this$0.aSerializer.getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(buildClassSerialDescriptor, "second", this$0.bSerializer.getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(buildClassSerialDescriptor, "third", this$0.cSerializer.getDescriptor(), null, false, 12, null);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull Triple<? extends A, ? extends B, ? extends C> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        CompositeEncoder structuredEncoder = encoder.beginStructure(getDescriptor());
        structuredEncoder.encodeSerializableElement(getDescriptor(), 0, this.aSerializer, value.getFirst());
        structuredEncoder.encodeSerializableElement(getDescriptor(), 1, this.bSerializer, value.getSecond());
        structuredEncoder.encodeSerializableElement(getDescriptor(), 2, this.cSerializer, value.getThird());
        structuredEncoder.endStructure(getDescriptor());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    /* JADX INFO: renamed from: deserialize */
    public Triple<A, B, C> mo1886deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        CompositeDecoder composite = decoder.beginStructure(getDescriptor());
        if (composite.decodeSequentially()) {
            return decodeSequentially(composite);
        }
        return decodeStructure(composite);
    }

    private final Triple<A, B, C> decodeSequentially(CompositeDecoder composite) {
        Object a = CompositeDecoder.decodeSerializableElement$default(composite, getDescriptor(), 0, this.aSerializer, null, 8, null);
        Object b = CompositeDecoder.decodeSerializableElement$default(composite, getDescriptor(), 1, this.bSerializer, null, 8, null);
        Object c = CompositeDecoder.decodeSerializableElement$default(composite, getDescriptor(), 2, this.cSerializer, null, 8, null);
        composite.endStructure(getDescriptor());
        return new Triple<>(a, b, c);
    }

    private final Triple<A, B, C> decodeStructure(CompositeDecoder composite) {
        Object a = TuplesKt.NULL;
        Object b = TuplesKt.NULL;
        Object c = TuplesKt.NULL;
        while (true) {
            int index = composite.decodeElementIndex(getDescriptor());
            switch (index) {
                case -1:
                    composite.endStructure(getDescriptor());
                    if (a == TuplesKt.NULL) {
                        throw new SerializationException("Element 'first' is missing");
                    }
                    if (b == TuplesKt.NULL) {
                        throw new SerializationException("Element 'second' is missing");
                    }
                    if (c == TuplesKt.NULL) {
                        throw new SerializationException("Element 'third' is missing");
                    }
                    return new Triple<>(a, b, c);
                case 0:
                    a = CompositeDecoder.decodeSerializableElement$default(composite, getDescriptor(), 0, this.aSerializer, null, 8, null);
                    break;
                case 1:
                    b = CompositeDecoder.decodeSerializableElement$default(composite, getDescriptor(), 1, this.bSerializer, null, 8, null);
                    break;
                case 2:
                    c = CompositeDecoder.decodeSerializableElement$default(composite, getDescriptor(), 2, this.cSerializer, null, 8, null);
                    break;
                default:
                    throw new SerializationException("Unexpected index " + index);
            }
        }
    }
}
