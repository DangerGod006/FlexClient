package kotlinx.serialization;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KSerializer.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/DeserializationStrategy.class */
public interface DeserializationStrategy<T> {
    @NotNull
    SerialDescriptor getDescriptor();

    /* JADX INFO: renamed from: deserialize */
    T mo1886deserialize(@NotNull Decoder decoder);
}
