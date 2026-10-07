package kotlinx.serialization.encoding;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ChunkedDecoder.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/encoding/ChunkedDecoder.class */
@ExperimentalSerializationApi
public interface ChunkedDecoder {
    @ExperimentalSerializationApi
    void decodeStringChunked(@NotNull Function1<? super String, Unit> function1);
}
