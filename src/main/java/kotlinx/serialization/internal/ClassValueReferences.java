package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/ClassValueReferences.class */
@SuppressAnimalSniffer
final class ClassValueReferences<T> extends ClassValue<MutableSoftReference<T>> {
    @Override // java.lang.ClassValue
    public /* bridge */ /* synthetic */ Object computeValue(Class p0) {
        return computeValue((Class<?>) p0);
    }

    @Override // java.lang.ClassValue
    @NotNull
    protected MutableSoftReference<T> computeValue(@NotNull Class<?> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new MutableSoftReference<>();
    }

    public final T getOrSet(@NotNull Class<?> key, @NotNull final Function0<? extends T> factory) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(factory, "factory");
        T t = get(key);
        Intrinsics.checkNotNullExpressionValue(t, "get(...)");
        MutableSoftReference mutableSoftReference = (MutableSoftReference) t;
        T t2 = mutableSoftReference.reference.get();
        if (t2 != null) {
            return t2;
        }
        return (T) mutableSoftReference.getOrSetWithLock(new Function0<T>() { // from class: kotlinx.serialization.internal.ClassValueReferences.getOrSet.2
            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return factory.invoke();
            }
        });
    }

    public final boolean isStored(@NotNull Class<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((MutableSoftReference) get(key)).reference.get() != null;
    }
}
