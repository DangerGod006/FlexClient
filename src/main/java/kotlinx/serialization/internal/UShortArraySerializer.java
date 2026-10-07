package kotlinx.serialization.internal;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/UShortArraySerializer.class */
@ExperimentalSerializationApi
@PublishedApi
@ExperimentalUnsignedTypes
public final class UShortArraySerializer extends PrimitiveArraySerializer<UShort, UShortArray, UShortArrayBuilder> implements KSerializer<UShortArray> {

    @NotNull
    public static final UShortArraySerializer INSTANCE = new UShortArraySerializer();

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ int collectionSize(Object $this$collectionSize) {
        return m1877collectionSizerL5Bavg(((UShortArray) $this$collectionSize).m533unboximpl());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ Object toBuilder(Object $this$toBuilder) {
        return m1878toBuilderrL5Bavg(((UShortArray) $this$toBuilder).m533unboximpl());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ UShortArray empty() {
        return UShortArray.m532boximpl(m1879emptyamswpOA());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ void writeContent(CompositeEncoder encoder, UShortArray content, int size) {
        m1880writeContenteny0XGE(encoder, content.m533unboximpl(), size);
    }

    private UShortArraySerializer() {
        super(BuiltinSerializersKt.serializer(UShort.Companion));
    }

    /* JADX INFO: renamed from: collectionSize-rL5Bavg, reason: not valid java name */
    protected int m1877collectionSizerL5Bavg(@NotNull short[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UShortArray.m521getSizeimpl(collectionSize);
    }

    @NotNull
    /* JADX INFO: renamed from: toBuilder-rL5Bavg, reason: not valid java name */
    protected UShortArrayBuilder m1878toBuilderrL5Bavg(@NotNull short[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new UShortArrayBuilder(toBuilder, null);
    }

    @NotNull
    /* JADX INFO: renamed from: empty-amswpOA, reason: not valid java name */
    protected short[] m1879emptyamswpOA() {
        return UShortArray.m518constructorimpl(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull UShortArrayBuilder builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m1875appendxj2QHRw$kotlinx_serialization_core(UShort.m513constructorimpl(decoder.decodeInlineElement(getDescriptor(), index).decodeShort()));
    }

    /* JADX INFO: renamed from: writeContent-eny0XGE, reason: not valid java name */
    protected void m1880writeContenteny0XGE(@NotNull CompositeEncoder encoder, @NotNull short[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i = 0; i < size; i++) {
            encoder.encodeInlineElement(getDescriptor(), i).encodeShort(UShortArray.m519getMh2AYeg(content, i));
        }
    }
}
