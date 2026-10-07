package kotlinx.serialization.json.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: createMapForCache.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/CreateMapForCacheKt.class */
public final class CreateMapForCacheKt {
    @NotNull
    public static final <K, V> Map<K, V> createMapForCache(int initialCapacity) {
        return new ConcurrentHashMap(initialCapacity);
    }
}
