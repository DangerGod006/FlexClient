package kotlinx.serialization;

import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KSerializer.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/KSerializer.class */
public interface KSerializer<T> extends SerializationStrategy<T>, DeserializationStrategy<T> {
    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    SerialDescriptor getDescriptor();
}
