package kotlin.io.encoding;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/io/encoding/StreamEncodingKt__Base64IOStreamKt.class */
class StreamEncodingKt__Base64IOStreamKt {
    @ExperimentalEncodingApi
    @SinceKotlin(version = "1.8")
    @NotNull
    public static final InputStream decodingWith(@NotNull InputStream $this$decodingWith, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter($this$decodingWith, "<this>");
        Intrinsics.checkNotNullParameter(base64, "base64");
        return new DecodeInputStream($this$decodingWith, base64);
    }

    @ExperimentalEncodingApi
    @SinceKotlin(version = "1.8")
    @NotNull
    public static final OutputStream encodingWith(@NotNull OutputStream $this$encodingWith, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter($this$encodingWith, "<this>");
        Intrinsics.checkNotNullParameter(base64, "base64");
        return new EncodeOutputStream($this$encodingWith, base64);
    }
}
