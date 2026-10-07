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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/fy.class */
public final class fy {
    public static final fy AUTO;
    public static final fy CUSTOM;
    public static final fy OFF;
    private static final fy[] w;
    private static final EnumEntries u;

    private fy(String str, int i) {
    }

    public static fy[] values() {
        return (fy[]) w.clone();
    }

    public static fy valueOf(String value) {
        return (fy) Enum.valueOf(fy.class, value);
    }

    @NotNull
    public static EnumEntries z() {
        return u;
    }

    private static final fy[] d() {
        return new fy[]{AUTO, CUSTOM, OFF};
    }

    static {
        long jA = yz.a(54591576832972997L, -312313463657965551L, MethodHandles.lookup().lookupClass()).a(57005856315367L) ^ 57060121441229L;
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
        int length = "Y\u0089ËX\u0007ízÈ\bä$\u0095ØiØÿú\b\u00ad\u0010P7ÌÖ]¶".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("Y\u0089ËX\u0007ízÈ\bä$\u0095ØiØÿú\b\u00ad\u0010P7ÌÖ]¶".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                AUTO = new fy(strArr[0], 0);
                CUSTOM = new fy(strArr[1], 1);
                OFF = new fy(strArr[2], 2);
                w = d();
                u = EnumEntriesKt.enumEntries(w);
                return;
            }
            cCharAt = "Y\u0089ËX\u0007ízÈ\bä$\u0095ØiØÿú\b\u00ad\u0010P7ÌÖ]¶".charAt(i3);
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
