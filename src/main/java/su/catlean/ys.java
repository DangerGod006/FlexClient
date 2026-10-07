package su.catlean;

import kotlin.enums.EnumEntries;
import net.minecraft.class_124;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ys.class */
public final class ys {

    @NotNull
    private final class_124 T;
    public static final ys SUCCESS = null;
    public static final ys INFO = null;
    public static final ys WARNING = null;
    public static final ys ERROR = null;
    public static final ys ENABLED = null;
    public static final ys DISABLED = null;
    private static final /* synthetic */ ys[] Y = null;
    private static final /* synthetic */ EnumEntries y = null;
    private static String g;
    private static final long a = 0;
    private static final long b = 0;

    private ys(String str, int i, class_124 class_124Var) {
        this.T = class_124Var;
    }

    @NotNull
    public final class_124 F() {
        return this.T;
    }

    public static ys[] values() {
        return (ys[]) Y.clone();
    }

    public static ys valueOf(String value) {
        return (ys) Enum.valueOf(ys.class, value);
    }

    @NotNull
    public static EnumEntries o() {
        return y;
    }

    private static final /* synthetic */ ys[] H(long j) {
        long j2 = a ^ j;
        ys[] ysVarArr = new ys[(int) b];
        ysVarArr[0] = SUCCESS;
        ysVarArr[1] = INFO;
        ysVarArr[2] = WARNING;
        ysVarArr[3] = ERROR;
        ysVarArr[4] = ENABLED;
        ysVarArr[5] = DISABLED;
        return ysVarArr;
    }

    public static void q(String str) {
        g = str;
    }

    public static String I() {
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
