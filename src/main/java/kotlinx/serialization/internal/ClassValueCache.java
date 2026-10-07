package kotlinx.serialization.internal;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/ClassValueCache.class */
final class ClassValueCache<T> implements SerializerCache<T> {

    @NotNull
    private final Function1<KClass<?>, KSerializer<T>> compute;

    @NotNull
    private final ClassValueReferences<CacheEntry<T>> classValue;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassValueCache(@NotNull Function1<? super KClass<?>, ? extends KSerializer<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.classValue = new ClassValueReferences<>();
    }

    @NotNull
    public final Function1<KClass<?>, KSerializer<T>> getCompute() {
        return this.compute;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    @Nullable
    public KSerializer<T> get(@NotNull final KClass<Object> key) {
        Object orSetWithLock;
        Intrinsics.checkNotNullParameter(key, "key");
        CacheEntry<T> cacheEntry = this.classValue.get(JvmClassMappingKt.getJavaClass((KClass) key));
        Intrinsics.checkNotNullExpressionValue(cacheEntry, "get(...)");
        MutableSoftReference mutableSoftReference = (MutableSoftReference) cacheEntry;
        T t = mutableSoftReference.reference.get();
        if (t != null) {
            orSetWithLock = t;
        } else {
            orSetWithLock = mutableSoftReference.getOrSetWithLock(new Function0<T>() { // from class: kotlinx.serialization.internal.ClassValueCache$get$$inlined$getOrSet$1
                @Override // kotlin.jvm.functions.Function0
                public final T invoke() {
                    return (T) new CacheEntry(this.this$0.getCompute().invoke(key));
                }
            });
        }
        return ((CacheEntry) orSetWithLock).serializer;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public boolean isStored(@NotNull KClass<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.classValue.isStored(JvmClassMappingKt.getJavaClass((KClass) key));
    }
}
