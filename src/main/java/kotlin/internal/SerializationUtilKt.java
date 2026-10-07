package kotlin.internal;

import java.io.InvalidObjectException;

/* JADX INFO: compiled from: serializationUtil.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/internal/SerializationUtilKt.class */
public final class SerializationUtilKt {
    @InlineOnly
    private static final Void throwReadObjectNotSupported() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
