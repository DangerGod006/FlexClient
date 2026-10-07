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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mo.class */
public final class mo {
    public static final mo Calc;
    public static final mo Custom;
    private static final mo[] t;
    private static final EnumEntries r;

    private mo(String str, int i) {
    }

    public static mo[] values() {
        return (mo[]) t.clone();
    }

    public static mo valueOf(String value) {
        return (mo) Enum.valueOf(mo.class, value);
    }

    @NotNull
    public static EnumEntries O() {
        return r;
    }

    private static final mo[] h() {
        return new mo[]{Calc, Custom};
    }

    static {
        long jA = yz.a(725316229809152294L, 6437019199915753738L, MethodHandles.lookup().lookupClass()).a(220814760615297L) ^ 65737234203326L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((jA << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[2];
        int i2 = 0;
        int length = "Ðd\u0015\u00963·\u0083°\bÄê\u0006¯\u0005±\u0088H".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("Ðd\u0015\u00963·\u0083°\bÄê\u0006¯\u0005±\u0088H".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                Calc = new mo(strArr[0], 0);
                Custom = new mo(strArr[1], 1);
                t = h();
                r = EnumEntriesKt.enumEntries(t);
                return;
            }
            cCharAt = "Ðd\u0015\u00963·\u0083°\bÄê\u0006¯\u0005±\u0088H".charAt(i3);
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
