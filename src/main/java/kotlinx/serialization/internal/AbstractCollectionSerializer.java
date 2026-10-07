package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/AbstractCollectionSerializer.class */
@InternalSerializationApi
public abstract class AbstractCollectionSerializer<Element, Collection, Builder> implements KSerializer<Collection> {
    protected abstract int collectionSize(Collection collection);

    @NotNull
    protected abstract Iterator<Element> collectionIterator(Collection collection);

    protected abstract Builder builder();

    protected abstract int builderSize(Builder builder);

    protected abstract Collection toResult(Builder builder);

    protected abstract Builder toBuilder(Collection collection);

    protected abstract void checkCapacity(Builder builder, int i);

    @Override // kotlinx.serialization.SerializationStrategy
    public abstract void serialize(@NotNull Encoder encoder, Collection collection);

    protected abstract void readElement(@NotNull CompositeDecoder compositeDecoder, int i, Builder builder, boolean z);

    protected abstract void readAll(@NotNull CompositeDecoder compositeDecoder, Builder builder, int i, int i2);

    public /* synthetic */ AbstractCollectionSerializer(DefaultConstructorMarker $constructor_marker) {
        this();
    }

    private AbstractCollectionSerializer() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @kotlinx.serialization.InternalSerializationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Collection merge(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r9, @org.jetbrains.annotations.Nullable Collection r10) {
        /*
            r8 = this;
            r0 = r9
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r10
            r1 = r0
            if (r1 == 0) goto L14
            r1 = r8
            r2 = r0; r0 = r1; r1 = r2; 
            java.lang.Object r0 = r0.toBuilder(r1)
            r1 = r0
            if (r1 != 0) goto L19
        L14:
        L15:
            r0 = r8
            java.lang.Object r0 = r0.builder()
        L19:
            r11 = r0
            r0 = r8
            r1 = r11
            int r0 = r0.builderSize(r1)
            r12 = r0
            r0 = r9
            r1 = r8
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r1.getDescriptor()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.beginStructure(r1)
            r13 = r0
            r0 = r13
            boolean r0 = r0.decodeSequentially()
            if (r0 == 0) goto L4a
            r0 = r8
            r1 = r13
            r2 = r11
            r3 = r12
            r4 = r8
            r5 = r13
            r6 = r11
            int r4 = r4.readSize(r5, r6)
            r0.readAll(r1, r2, r3, r4)
            goto L71
        L4a:
            r0 = r13
            r1 = r8
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r1.getDescriptor()
            int r0 = r0.decodeElementIndex(r1)
            r14 = r0
            r0 = r14
            r1 = -1
            if (r0 == r1) goto L71
            r0 = r8
            r1 = r13
            r2 = r12
            r3 = r14
            int r2 = r2 + r3
            r3 = r11
            r4 = 0
            r5 = 8
            r6 = 0
            readElement$default(r0, r1, r2, r3, r4, r5, r6)
            goto L4a
        L71:
            r0 = r13
            r1 = r8
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r1.getDescriptor()
            r0.endStructure(r1)
            r0 = r8
            r1 = r11
            java.lang.Object r0 = r0.toResult(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.AbstractCollectionSerializer.merge(kotlinx.serialization.encoding.Decoder, java.lang.Object):java.lang.Object");
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: deserialize */
    public Collection mo1886deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return merge(decoder, null);
    }

    private final int readSize(CompositeDecoder decoder, Builder builder) {
        int size = decoder.decodeCollectionSize(getDescriptor());
        checkCapacity(builder, size);
        return size;
    }

    public static /* synthetic */ void readElement$default(AbstractCollectionSerializer abstractCollectionSerializer, CompositeDecoder compositeDecoder, int i, Object obj, boolean z, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        abstractCollectionSerializer.readElement(compositeDecoder, i, obj, z);
    }
}
