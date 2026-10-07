package kotlinx.serialization.encoding;

import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Encoding.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/encoding/EncodingKt.class */
public final class EncodingKt {
    public static final void encodeStructure(@NotNull Encoder $this$encodeStructure, @NotNull SerialDescriptor descriptor, @NotNull Function1<? super CompositeEncoder, Unit> block) {
        Intrinsics.checkNotNullParameter($this$encodeStructure, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(block, "block");
        CompositeEncoder composite = $this$encodeStructure.beginStructure(descriptor);
        block.invoke(composite);
        composite.endStructure(descriptor);
    }

    public static final void encodeCollection(@NotNull Encoder $this$encodeCollection, @NotNull SerialDescriptor descriptor, int collectionSize, @NotNull Function1<? super CompositeEncoder, Unit> block) {
        Intrinsics.checkNotNullParameter($this$encodeCollection, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(block, "block");
        CompositeEncoder composite = $this$encodeCollection.beginCollection(descriptor, collectionSize);
        block.invoke(composite);
        composite.endStructure(descriptor);
    }

    public static final <E> void encodeCollection(@NotNull Encoder $this$encodeCollection, @NotNull SerialDescriptor descriptor, @NotNull Collection<? extends E> collection, @NotNull Function3<? super CompositeEncoder, ? super Integer, ? super E, Unit> block) {
        Intrinsics.checkNotNullParameter($this$encodeCollection, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(block, "block");
        int collectionSize$iv = collection.size();
        CompositeEncoder composite$iv = $this$encodeCollection.beginCollection(descriptor, collectionSize$iv);
        Collection<? extends E> $this$forEachIndexed$iv = collection;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int index = index$iv;
            index$iv++;
            if (index < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            block.invoke(composite$iv, Integer.valueOf(index), item$iv);
        }
        composite$iv.endStructure(descriptor);
    }
}
