package kotlinx.serialization.encoding;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Decoding.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/encoding/DecodingKt.class */
public final class DecodingKt {
    @Nullable
    public static final <T> T decodeIfNullable(@NotNull Decoder decoder, @NotNull DeserializationStrategy<? extends T> deserializer, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(decoder, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(block, "block");
        return (deserializer.getDescriptor().isNullable() || decoder.decodeNotNullMark()) ? block.invoke() : (T) decoder.decodeNull();
    }

    public static final <T> T decodeStructure(@NotNull Decoder $this$decodeStructure, @NotNull SerialDescriptor descriptor, @NotNull Function1<? super CompositeDecoder, ? extends T> block) {
        Intrinsics.checkNotNullParameter($this$decodeStructure, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(block, "block");
        CompositeDecoder composite = $this$decodeStructure.beginStructure(descriptor);
        T tInvoke = block.invoke(composite);
        composite.endStructure(descriptor);
        return tInvoke;
    }
}
