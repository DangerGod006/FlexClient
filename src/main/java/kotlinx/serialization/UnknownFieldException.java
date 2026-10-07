package kotlinx.serialization;

import kotlin.PublishedApi;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SerializationExceptions.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/UnknownFieldException.class */
@PublishedApi
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(@Nullable String message) {
        super(message);
    }

    public UnknownFieldException(int index) {
        this("An unknown field for index " + index);
    }
}
