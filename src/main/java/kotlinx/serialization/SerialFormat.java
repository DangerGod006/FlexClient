package kotlinx.serialization;

import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SerialFormat.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/SerialFormat.class */
public interface SerialFormat {
    @NotNull
    SerializersModule getSerializersModule();
}
