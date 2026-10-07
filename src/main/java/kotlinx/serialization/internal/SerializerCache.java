package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Platform.common.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/SerializerCache.class */
public interface SerializerCache<T> {
    @Nullable
    KSerializer<T> get(@NotNull KClass<Object> kClass);

    /* JADX INFO: compiled from: Platform.common.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/SerializerCache$DefaultImpls.class */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> boolean isStored(@NotNull SerializerCache<T> $this, @NotNull KClass<?> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return $this.isStored(key);
        }
    }

    default boolean isStored(@NotNull KClass<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return false;
    }
}
