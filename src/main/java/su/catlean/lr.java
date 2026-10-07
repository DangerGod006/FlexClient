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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/lr.class */
public final class lr {
    public static final lr SHADER;
    public static final lr FILL;
    public static final lr LINE;
    public static final lr BOTH;
    public static final lr NONE;
    private static final /* synthetic */ lr[] A;
    private static final /* synthetic */ EnumEntries G;

    private lr(String str, int i) {
    }

    public static lr[] values() {
        return (lr[]) A.clone();
    }

    public static lr valueOf(String value) {
        return (lr) Enum.valueOf(lr.class, value);
    }

    @NotNull
    public static EnumEntries M() {
        return G;
    }

    private static final /* synthetic */ lr[] D() {
        return new lr[]{SHADER, FILL, LINE, BOTH, NONE};
    }

    static {
        int i;
        long jA = yz.a(-7691775826243645173L, 2544694215888733678L, MethodHandles.lookup().lookupClass()).a(176413099920965L) ^ 55543459997782L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((jA << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[5];
        int i3 = 0;
        String str = "¯Ì\u0086æØ\u0082#\u008f\bnzãÖ\u0015Òî\u0098\bXç¢\u0086?\u0088f2";
        int length = "¯Ì\u0086æØ\u0082#\u008f\bnzãÖ\u0015Òî\u0098\bXç¢\u0086?\u0088f2".length();
        char cCharAt = '\b';
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 >= length) {
                            SHADER = new lr(strArr[4], 0);
                            FILL = new lr(strArr[2], 1);
                            LINE = new lr(strArr[0], 2);
                            BOTH = new lr(strArr[3], 3);
                            NONE = new lr(strArr[1], 4);
                            A = D();
                            G = EnumEntriesKt.enumEntries(A);
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i8 = i3;
                        i3++;
                        strArr[i8] = strIntern;
                        int i9 = i5 + cCharAt;
                        i4 = i9;
                        if (i9 < length) {
                        }
                        str = "4µ\"|c\u0014\u0002?\b~W Ö\u001a¤e\u0084";
                        length = "4µ\"|c\u0014\u0002?\b~W Ö\u001a¤e\u0084".length();
                        cCharAt = '\b';
                        i = -1;
                        break;
                        break;
                }
                i5 = i + 1;
                strSubstring = str.substring(i5, i5 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i4);
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
