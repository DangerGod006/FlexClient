package kotlinx.serialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SerialFormat.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/BinaryFormat.class */
public interface BinaryFormat extends SerialFormat {
    @NotNull
    <T> byte[] encodeToByteArray(@NotNull SerializationStrategy<? super T> serializationStrategy, T t);

    <T> T decodeFromByteArray(@NotNull DeserializationStrategy<? extends T> deserializationStrategy, @NotNull byte[] bArr);
}
