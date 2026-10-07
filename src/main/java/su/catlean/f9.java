package su.catlean;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/f9.class */
public final class f9 {
    public static final f9 NORMAL = null;
    public static final f9 SILENT = null;
    public static final f9 INVENTORY_SILENT = null;
    public static final f9 INVENTORY_NORMAL = null;
    public static final f9 SILENT_FULL = null;
    public static final f9 NORMAL_FULL = null;
    private static final /* synthetic */ f9[] R = null;
    private static final /* synthetic */ EnumEntries E = null;
    private static int[] W;
    private static final long a = 0;
    private static final long b = 0;

    private f9(String str, int i) {
    }

    public static f9[] values() {
        return (f9[]) R.clone();
    }

    public static f9 valueOf(String value) {
        return (f9) Enum.valueOf(f9.class, value);
    }

    @NotNull
    public static EnumEntries V() {
        return E;
    }

    private static final /* synthetic */ f9[] O(long j) {
        long j2 = a ^ j;
        f9[] f9VarArr = new f9[(int) b];
        f9VarArr[0] = NORMAL;
        f9VarArr[1] = SILENT;
        f9VarArr[2] = INVENTORY_SILENT;
        f9VarArr[3] = INVENTORY_NORMAL;
        f9VarArr[4] = SILENT_FULL;
        f9VarArr[5] = NORMAL_FULL;
        return f9VarArr;
    }

    public static void T(int[] iArr) {
        W = iArr;
    }

    public static int[] N() {
        return W;
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
