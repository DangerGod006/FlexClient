package su.catlean;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/dz.class */
public final class dz {

    @NotNull
    private final jr C;
    public static final dz FIRE_WORK = null;
    public static final dz BOOST = null;
    public static final dz CONTROL = null;
    public static final dz INFINITE = null;
    public static final dz PACKET = null;
    public static final dz SILENT_FIRE_WORK = null;
    private static final dz[] r = null;
    private static final EnumEntries D = null;
    private static final long a = 0;
    private static final long b = 0;

    private dz(String str, int i, jr jrVar) {
        this.C = jrVar;
    }

    @NotNull
    public final jr Y() {
        return this.C;
    }

    public static dz[] values() {
        return (dz[]) r.clone();
    }

    public static dz valueOf(String value) {
        return (dz) Enum.valueOf(dz.class, value);
    }

    @NotNull
    public static EnumEntries z() {
        return D;
    }

    private static final dz[] f(long j) {
        long j2 = a ^ j;
        dz[] dzVarArr = new dz[(int) b];
        dzVarArr[0] = FIRE_WORK;
        dzVarArr[1] = BOOST;
        dzVarArr[2] = CONTROL;
        dzVarArr[3] = INFINITE;
        dzVarArr[4] = PACKET;
        dzVarArr[5] = SILENT_FIRE_WORK;
        return dzVarArr;
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
