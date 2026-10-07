package kotlinx.serialization.json.internal;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmJsonStreams.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/JavaStreamSerialReader.class */
public final class JavaStreamSerialReader implements InternalJsonReader {

    @NotNull
    private final CharsetReader reader;

    public JavaStreamSerialReader(@NotNull InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.reader = new CharsetReader(stream, Charsets.UTF_8);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonReader
    public int read(@NotNull char[] buffer, int bufferOffset, int count) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return this.reader.read(buffer, bufferOffset, count);
    }

    public final void release() {
        this.reader.release();
    }
}
