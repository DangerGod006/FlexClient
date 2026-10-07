package kotlinx.serialization.internal;

import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PluginHelperInterfaces.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/GeneratedSerializer.class */
@InternalSerializationApi
public interface GeneratedSerializer<T> extends KSerializer<T> {
    @NotNull
    KSerializer<?>[] childSerializers();

    /* JADX INFO: compiled from: PluginHelperInterfaces.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/GeneratedSerializer$DefaultImpls.class */
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static <T> KSerializer<?>[] typeParametersSerializers(@NotNull GeneratedSerializer<T> $this) {
            return $this.typeParametersSerializers();
        }
    }

    @NotNull
    default KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
