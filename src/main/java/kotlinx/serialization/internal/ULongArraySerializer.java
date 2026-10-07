package kotlinx.serialization.internal;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/ULongArraySerializer.class */
@ExperimentalSerializationApi
@PublishedApi
@ExperimentalUnsignedTypes
public final class ULongArraySerializer extends PrimitiveArraySerializer<ULong, ULongArray, ULongArrayBuilder> implements KSerializer<ULongArray> {

    @NotNull
    public static final ULongArraySerializer INSTANCE = new ULongArraySerializer();

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ int collectionSize(Object $this$collectionSize) {
        return m1867collectionSizeQwZRm1k(((ULongArray) $this$collectionSize).m426unboximpl());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ Object toBuilder(Object $this$toBuilder) {
        return m1868toBuilderQwZRm1k(((ULongArray) $this$toBuilder).m426unboximpl());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ ULongArray empty() {
        return ULongArray.m425boximpl(m1869emptyY2RjT0g());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ void writeContent(CompositeEncoder encoder, ULongArray content, int size) {
        m1870writeContent0q3Fkuo(encoder, content.m426unboximpl(), size);
    }

    private ULongArraySerializer() {
        super(BuiltinSerializersKt.serializer(ULong.Companion));
    }

    /* JADX INFO: renamed from: collectionSize-QwZRm1k, reason: not valid java name */
    protected int m1867collectionSizeQwZRm1k(@NotNull long[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return ULongArray.m414getSizeimpl(collectionSize);
    }

    @NotNull
    /* JADX INFO: renamed from: toBuilder-QwZRm1k, reason: not valid java name */
    protected ULongArrayBuilder m1868toBuilderQwZRm1k(@NotNull long[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new ULongArrayBuilder(toBuilder, null);
    }

    @NotNull
    /* JADX INFO: renamed from: empty-Y2RjT0g, reason: not valid java name */
    protected long[] m1869emptyY2RjT0g() {
        return ULongArray.m411constructorimpl(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull ULongArrayBuilder builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m1865appendVKZWuLQ$kotlinx_serialization_core(ULong.m406constructorimpl(decoder.decodeInlineElement(getDescriptor(), index).decodeLong()));
    }

    /* JADX INFO: renamed from: writeContent-0q3Fkuo, reason: not valid java name */
    protected void m1870writeContent0q3Fkuo(@NotNull CompositeEncoder encoder, @NotNull long[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i = 0; i < size; i++) {
            encoder.encodeInlineElement(getDescriptor(), i).encodeLong(ULongArray.m412getsVKNKU(content, i));
        }
    }
}
