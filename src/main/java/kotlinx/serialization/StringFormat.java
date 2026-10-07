package kotlinx.serialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SerialFormat.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/StringFormat.class */
public interface StringFormat extends SerialFormat {
    @NotNull
    <T> String encodeToString(@NotNull SerializationStrategy<? super T> serializationStrategy, T t);

    <T> T decodeFromString(@NotNull DeserializationStrategy<? extends T> deserializationStrategy, @NotNull String str);
}
