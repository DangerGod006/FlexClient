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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ta.class */
final class ta {
    public static final ta NONE;
    public static final ta WHITE_LIST;
    public static final ta BLACK_LIST;
    private static final ta[] x;
    private static final EnumEntries C;

    private ta(String str, int i) {
    }

    public static ta[] values() {
        return (ta[]) x.clone();
    }

    public static ta valueOf(String value) {
        return (ta) Enum.valueOf(ta.class, value);
    }

    @NotNull
    public static EnumEntries H() {
        return C;
    }

    private static final ta[] p() {
        return new ta[]{NONE, WHITE_LIST, BLACK_LIST};
    }

    static {
        long jA = yz.a(-2256986737403996747L, -9071631990665175722L, MethodHandles.lookup().lookupClass()).a(243234246589586L) ^ 62566612012256L;
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
        int length = "y2\u0094üÍäH§mÖùÙÂ\u007fIC\b]\u0089\u0081\u0081»y\u00894\u0010\u009e¬t¸á#þÑÝ¸´=}(@'".length();
        char cCharAt = 16;
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("y2\u0094üÍäH§mÖùÙÂ\u007fIC\b]\u0089\u0081\u0081»y\u00894\u0010\u009e¬t¸á#þÑÝ¸´=}(@'".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                NONE = new ta(strArr[1], 0);
                WHITE_LIST = new ta(strArr[2], 1);
                BLACK_LIST = new ta(strArr[0], 2);
                x = p();
                C = EnumEntriesKt.enumEntries(x);
                return;
            }
            cCharAt = "y2\u0094üÍäH§mÖùÙÂ\u007fIC\b]\u0089\u0081\u0081»y\u00894\u0010\u009e¬t¸á#þÑÝ¸´=}(@'".charAt(i3);
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
