package kotlinx.serialization.internal;

import kotlin.jvm.JvmField;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/CacheEntry.class */
final class CacheEntry<T> {

    @JvmField
    @Nullable
    public final KSerializer<T> serializer;

    public CacheEntry(@Nullable KSerializer<T> serializer) {
        this.serializer = serializer;
    }
}
