package kotlin.io.encoding;

import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/io/encoding/Base64Kt.class */
public final class Base64Kt {

    @NotNull
    private static final byte[] base64EncodeMap = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    @NotNull
    private static final int[] base64DecodeMap;

    @NotNull
    private static final byte[] base64UrlEncodeMap;

    @NotNull
    private static final int[] base64UrlDecodeMap;

    static {
        int[] $this$base64DecodeMap_u24lambda_u241 = new int[256];
        ArraysKt.fill$default($this$base64DecodeMap_u24lambda_u241, -1, 0, 0, 6, (Object) null);
        $this$base64DecodeMap_u24lambda_u241[61] = -2;
        byte[] $this$forEachIndexed$iv = base64EncodeMap;
        int index$iv = 0;
        for (byte item$iv : $this$forEachIndexed$iv) {
            int index = index$iv;
            index$iv++;
            $this$base64DecodeMap_u24lambda_u241[item$iv] = index;
        }
        base64DecodeMap = $this$base64DecodeMap_u24lambda_u241;
        base64UrlEncodeMap = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        int[] $this$base64UrlDecodeMap_u24lambda_u243 = new int[256];
        ArraysKt.fill$default($this$base64UrlDecodeMap_u24lambda_u243, -1, 0, 0, 6, (Object) null);
        $this$base64UrlDecodeMap_u24lambda_u243[61] = -2;
        byte[] $this$forEachIndexed$iv2 = base64UrlEncodeMap;
        int index$iv2 = 0;
        for (byte item$iv2 : $this$forEachIndexed$iv2) {
            int index2 = index$iv2;
            index$iv2++;
            $this$base64UrlDecodeMap_u24lambda_u243[item$iv2] = index2;
        }
        base64UrlDecodeMap = $this$base64UrlDecodeMap_u24lambda_u243;
    }

    @SinceKotlin(version = "1.8")
    public static final boolean isInMimeAlphabet(int symbol) {
        boolean z = 0 <= symbol && symbol < base64DecodeMap.length;
        return z && base64DecodeMap[symbol] != -1;
    }
}
