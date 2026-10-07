package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mz.class */
public final class mz {
    public static final mz THROW;
    public static final mz TAKE;
    public static final mz NONE;
    private static final /* synthetic */ mz[] P;
    private static final /* synthetic */ EnumEntries F;

    private mz(String str, int i) {
    }

    public static mz[] values() {
        return (mz[]) P.clone();
    }

    public static mz valueOf(String value) {
        return (mz) Enum.valueOf(mz.class, value);
    }

    @NotNull
    public static EnumEntries S() {
        return F;
    }

    private static final /* synthetic */ mz[] u() {
        return new mz[]{THROW, TAKE, NONE};
    }

    static {
        long jA = yz.a(7014956411523928880L, 8160000632042841166L, MethodHandles.lookup().lookupClass()).a(69171128252082L) ^ 62305750623970L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((jA << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[3];
        int i2 = 0;
        int length = "àì\u009a\u009c\fóß³\bg]2\u001bÄ3\u0094g\b\u0019|°¤1Fx\u0001".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("àì\u009a\u009c\fóß³\bg]2\u001bÄ3\u0094g\b\u0019|°¤1Fx\u0001".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                THROW = new mz(strArr[1], 0);
                TAKE = new mz(strArr[2], 1);
                NONE = new mz(strArr[0], 2);
                P = u();
                F = EnumEntriesKt.enumEntries(P);
                return;
            }
            cCharAt = "àì\u009a\u009c\fóß³\bg]2\u001bÄ3\u0094g\b\u0019|°¤1Fx\u0001".charAt(i3);
        }
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
