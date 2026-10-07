package kotlinx.serialization.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/ConcurrentHashMapCache.class */
final class ConcurrentHashMapCache<T> implements SerializerCache<T> {

    @NotNull
    private final Function1<KClass<?>, KSerializer<T>> compute;

    @NotNull
    private final ConcurrentHashMap<Class<?>, CacheEntry<T>> cache;

    /* JADX WARN: Multi-variable type inference failed */
    public ConcurrentHashMapCache(@NotNull Function1<? super KClass<?>, ? extends KSerializer<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    @Nullable
    public KSerializer<T> get(@NotNull KClass<Object> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentMap $this$getOrPut$iv = this.cache;
        Class<?> javaClass = JvmClassMappingKt.getJavaClass((KClass) key);
        CacheEntry<T> cacheEntryPutIfAbsent = $this$getOrPut$iv.get(javaClass);
        if (cacheEntryPutIfAbsent == null) {
            CacheEntry<T> cacheEntry = new CacheEntry<>(this.compute.invoke(key));
            cacheEntryPutIfAbsent = $this$getOrPut$iv.putIfAbsent(javaClass, cacheEntry);
            if (cacheEntryPutIfAbsent == null) {
                cacheEntryPutIfAbsent = cacheEntry;
            }
        }
        return cacheEntryPutIfAbsent.serializer;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public boolean isStored(@NotNull KClass<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.cache.containsKey(JvmClassMappingKt.getJavaClass((KClass) key));
    }
}
