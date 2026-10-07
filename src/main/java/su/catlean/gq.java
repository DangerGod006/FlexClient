package su.catlean;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gq.class */
public final class gq {
    public static final gq STRICT_STRAFE = null;
    public static final gq MATRIX = null;
    public static final gq NCP = null;
    public static final gq GRIM_ENTITY = null;
    public static final gq FIREWORK = null;
    public static final gq OLD_MATRIX = null;
    private static final gq[] E = null;
    private static final EnumEntries s = null;
    private static final long a = 0;
    private static final long b = 0;

    private gq(String str, int i) {
    }

    public static gq[] values() {
        return (gq[]) E.clone();
    }

    public static gq valueOf(String value) {
        return (gq) Enum.valueOf(gq.class, value);
    }

    @NotNull
    public static EnumEntries G() {
        return s;
    }

    private static final gq[] N(long j) {
        long j2 = a ^ j;
        gq[] gqVarArr = new gq[(int) b];
        gqVarArr[0] = STRICT_STRAFE;
        gqVarArr[1] = MATRIX;
        gqVarArr[2] = NCP;
        gqVarArr[3] = GRIM_ENTITY;
        gqVarArr[4] = FIREWORK;
        gqVarArr[5] = OLD_MATRIX;
        return gqVarArr;
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
