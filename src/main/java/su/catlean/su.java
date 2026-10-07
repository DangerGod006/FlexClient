package su.catlean;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/su.class */
public final class su {
    public static final su NONE = null;
    public static final su DISABLE_CLICKS = null;
    public static final su STRICT_NCP = null;
    public static final su STRICT_NCP_2 = null;
    public static final su MATRIX_NCP = null;
    public static final su LEGIT = null;
    private static final su[] g = null;
    private static final EnumEntries P = null;
    private static int[] b;
    private static final long a = 0;
    private static final long c = 0;

    private su(String str, int i) {
    }

    public static su[] values() {
        return (su[]) g.clone();
    }

    public static su valueOf(String value) {
        return (su) Enum.valueOf(su.class, value);
    }

    @NotNull
    public static EnumEntries z() {
        return P;
    }

    private static final su[] O(long j) {
        long j2 = a ^ j;
        su[] suVarArr = new su[(int) c];
        suVarArr[0] = NONE;
        suVarArr[1] = DISABLE_CLICKS;
        suVarArr[2] = STRICT_NCP;
        suVarArr[3] = STRICT_NCP_2;
        suVarArr[4] = MATRIX_NCP;
        suVarArr[5] = LEGIT;
        return suVarArr;
    }

    public static void e(int[] iArr) {
        b = iArr;
    }

    public static int[] u() {
        return b;
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
                char c2 = (char) (((char) (((char) (i3 & 15)) << '\f')) | (((char) (bArr[i6] & 63)) << 6));
                i2 = i6 + 1;
                int i7 = i;
                i++;
                cArr[i7] = (char) (c2 | ((char) (bArr[i2] & 63)));
            }
            i2++;
        }
        return new String(cArr, 0, i);
    }
}
