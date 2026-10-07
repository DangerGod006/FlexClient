package su.catlean;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/sj.class */
public final class sj {

    @NotNull
    private final gi a;
    public static final sj ARROWS_1 = null;
    public static final sj ARROWS_2 = null;
    public static final sj ARROWS_3 = null;
    public static final sj ARROWS_4 = null;
    public static final sj ARROWS_5 = null;
    public static final sj LINES = null;
    private static final sj[] B = null;
    private static final EnumEntries g = null;
    private static int E;
    private static final long b = 0;
    private static final long c = 0;

    private sj(String str, int i, gi giVar) {
        this.a = giVar;
    }

    @NotNull
    public final gi e() {
        return this.a;
    }

    public static sj[] values() {
        return (sj[]) B.clone();
    }

    public static sj valueOf(String value) {
        return (sj) Enum.valueOf(sj.class, value);
    }

    @NotNull
    public static EnumEntries s() {
        return g;
    }

    private static final sj[] R(long j) {
        long j2 = b ^ j;
        sj[] sjVarArr = new sj[(int) c];
        sjVarArr[0] = ARROWS_1;
        sjVarArr[1] = ARROWS_2;
        sjVarArr[2] = ARROWS_3;
        sjVarArr[3] = ARROWS_4;
        sjVarArr[4] = ARROWS_5;
        sjVarArr[5] = LINES;
        return sjVarArr;
    }

    public static void K(int i) {
        E = i;
    }

    public static int N() {
        return E;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int l() {
        return N() == 0 ? 94 : 0;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
