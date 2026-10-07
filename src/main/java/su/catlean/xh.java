package su.catlean;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/xh.class */
final class xh {
    public static final xh Fade = null;
    public static final xh CubeOutline = null;
    public static final xh CubeFill = null;
    public static final xh CubeBoth = null;
    public static final xh Shader = null;
    public static final xh BLOOM = null;
    private static final xh[] Z = null;
    private static final EnumEntries r = null;
    private static final long a = 0;
    private static final long b = 0;

    private xh(String str, int i) {
    }

    public static xh[] values() {
        return (xh[]) Z.clone();
    }

    public static xh valueOf(String value) {
        return (xh) Enum.valueOf(xh.class, value);
    }

    @NotNull
    public static EnumEntries Y() {
        return r;
    }

    private static final xh[] N(int i, int i2) {
        long j = ((((long) i) << 32) | ((((long) i2) << 32) >>> 32)) ^ a;
        xh[] xhVarArr = new xh[(int) b];
        xhVarArr[0] = Fade;
        xhVarArr[1] = CubeOutline;
        xhVarArr[2] = CubeFill;
        xhVarArr[3] = CubeBoth;
        xhVarArr[4] = Shader;
        xhVarArr[5] = BLOOM;
        return xhVarArr;
    }

    private static String a(byte[] bArr) {
        int i = 0;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i2 = 0;
        while (i2 < length) {
            int i3 = 255 & bArr[i2];
            if (i3 < 192) {
                int i4 = i;
                i++;
                cArr[i4] = (char) i3;
            } else if (i3 < 224) {
                i2++;
                int i5 = i;
                i++;
                cArr[i5] = (char) (((char) (((char) (i3 & 31)) << 6)) | ((char) (bArr[i2] & 63)));
            } else if (i2 < length - 2) {
                int i6 = i2 + 1;
                char c = (char) (((char) (((char) (i3 & 15)) << '\f')) | (((char) (bArr[i6] & 63)) << 6));
                i2 = i6 + 1;
                int i7 = i;
                i++;
                cArr[i7] = (char) (c | ((char) (bArr[i2] & 63)));
            }
            i2++;
        }
        return new String(cArr, 0, i);
    }
}
