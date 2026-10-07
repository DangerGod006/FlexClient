package kotlinx.serialization.internal;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PluginHelperInterfaces.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/SerializerFactory.class */
@Deprecated(message = "Inserted into generated code and should not be used directly", level = DeprecationLevel.HIDDEN)
public interface SerializerFactory {
    @NotNull
    KSerializer<?> serializer(@NotNull KSerializer<?>... kSerializerArr);
}
