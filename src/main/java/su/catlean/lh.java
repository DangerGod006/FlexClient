package su.catlean;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/lh.class */
public final class lh {
    public static final lh Rubberband = null;
    public static final lh Items = null;
    public static final lh MatrixOffGround = null;
    public static final lh Vanilla = null;
    public static final lh GrimOld = null;
    public static final lh GRIM_NEW = null;
    private static final lh[] X = null;
    private static final EnumEntries r = null;
    private static String g;
    private static final long a = 0;
    private static final long b = 0;

    private lh(String str, int i) {
    }

    public static lh[] values() {
        return (lh[]) X.clone();
    }

    public static lh valueOf(String value) {
        return (lh) Enum.valueOf(lh.class, value);
    }

    @NotNull
    public static EnumEntries B() {
        return r;
    }

    private static final lh[] a(char c, long j) {
        long j2 = ((((long) c) << 48) | ((j << 16) >>> 16)) ^ a;
        lh[] lhVarArr = new lh[(int) b];
        lhVarArr[0] = Rubberband;
        lhVarArr[1] = Items;
        lhVarArr[2] = MatrixOffGround;
        lhVarArr[3] = Vanilla;
        lhVarArr[4] = GrimOld;
        lhVarArr[5] = GRIM_NEW;
        return lhVarArr;
    }

    public static void K(String str) {
        g = str;
    }

    public static String F() {
        return g;
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
