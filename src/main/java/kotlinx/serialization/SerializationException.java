package kotlinx.serialization;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SerializationExceptions.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/SerializationException.class */
public class SerializationException extends IllegalArgumentException {
    public SerializationException() {
    }

    public SerializationException(@Nullable String message) {
        super(message);
    }

    public SerializationException(@Nullable String message, @Nullable Throwable cause) {
        super(message, cause);
    }

    public SerializationException(@Nullable Throwable cause) {
        super(cause);
    }
}
