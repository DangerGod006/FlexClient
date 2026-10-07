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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/nc.class */
public final class nc {
    public static final nc Block;
    public static final nc Shrink;
    public static final nc Grow;
    private static final nc[] u;
    private static final EnumEntries K;

    private nc(String str, int i) {
    }

    public static nc[] values() {
        return (nc[]) u.clone();
    }

    public static nc valueOf(String value) {
        return (nc) Enum.valueOf(nc.class, value);
    }

    @NotNull
    public static EnumEntries d() {
        return K;
    }

    private static final nc[] c() {
        return new nc[]{Block, Shrink, Grow};
    }

    static {
        long jA = yz.a(-6994048443976957303L, 1408750333046290536L, MethodHandles.lookup().lookupClass()).a(172252026095913L) ^ 118962364798248L;
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
        int length = "_»ÏZK üT\bwI±\b\f~\u009dz\bïj£QÏyô\u0006".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("_»ÏZK üT\bwI±\b\f~\u009dz\bïj£QÏyô\u0006".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                Block = new nc(strArr[2], 0);
                Shrink = new nc(strArr[1], 1);
                Grow = new nc(strArr[0], 2);
                u = c();
                K = EnumEntriesKt.enumEntries(u);
                return;
            }
            cCharAt = "_»ÏZK üT\bwI±\b\f~\u009dz\bïj£QÏyô\u0006".charAt(i3);
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
