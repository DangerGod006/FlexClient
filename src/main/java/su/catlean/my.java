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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/my.class */
public final class my {
    public static final my CENTER;
    public static final my EYES;
    public static final my CLOSEST;
    public static final my ROAMING;
    public static final my RUST;
    private static final my[] C;
    private static final EnumEntries i;

    private my(String str, int i2) {
    }

    public static my[] values() {
        return (my[]) C.clone();
    }

    public static my valueOf(String value) {
        return (my) Enum.valueOf(my.class, value);
    }

    @NotNull
    public static EnumEntries C() {
        return i;
    }

    private static final my[] x() {
        return new my[]{CENTER, EYES, CLOSEST, ROAMING, RUST};
    }

    static {
        int i2;
        long jA = yz.a(5824445265659733564L, -7339248401476368947L, MethodHandles.lookup().lookupClass()).a(111427794106751L) ^ 63740139840928L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((jA << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[5];
        int i4 = 0;
        String str = "·ø\u001díZïak\b\u008cõðläÞä\u0010\bâÚâaÓü\u00ad¾";
        int length = "·ø\u001díZïak\b\u008cõðläÞä\u0010\bâÚâaÓü\u00ad¾".length();
        char cCharAt = '\b';
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i7 = i4;
                        i4++;
                        strArr[i7] = strIntern;
                        int i8 = i6 + cCharAt;
                        i2 = i8;
                        if (i8 >= length) {
                            CENTER = new my(strArr[3], 0);
                            EYES = new my(strArr[0], 1);
                            CLOSEST = new my(strArr[4], 2);
                            ROAMING = new my(strArr[2], 3);
                            RUST = new my(strArr[1], 4);
                            C = x();
                            i = EnumEntriesKt.enumEntries(C);
                            return;
                        }
                        cCharAt = str.charAt(i2);
                        break;
                        break;
                    default:
                        int i9 = i4;
                        i4++;
                        strArr[i9] = strIntern;
                        int i10 = i6 + cCharAt;
                        i5 = i10;
                        if (i10 < length) {
                        }
                        str = "Å\u0083j\u008eG×³.\b\bóêÎ5q4Ð";
                        length = "Å\u0083j\u008eG×³.\b\bóêÎ5q4Ð".length();
                        cCharAt = '\b';
                        i2 = -1;
                        break;
                        break;
                }
                i6 = i2 + 1;
                strSubstring = str.substring(i6, i6 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i5);
        }
    }

    private static String a(byte[] bArr) {
        int i2 = 0;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i3 = 0;
        while (i3 < length) {
            int i4 = 255 & bArr[i3];
            if (i4 < 192) {
                int i5 = i2;
                i2++;
                cArr[i5] = (char) i4;
            } else if (i4 < 224) {
                i3++;
                int i6 = i2;
                i2++;
                cArr[i6] = (char) (((char) (((char) (i4 & 31)) << 6)) | ((char) (bArr[i3] & 63)));
            } else if (i3 < length - 2) {
                int i7 = i3 + 1;
                char c = (char) (((char) (((char) (i4 & 15)) << '\f')) | (((char) (bArr[i7] & 63)) << 6));
                i3 = i7 + 1;
                int i8 = i2;
                i2++;
                cArr[i8] = (char) (c | ((char) (bArr[i3] & 63)));
            }
            i3++;
        }
        return new String(cArr, 0, i2);
    }
}
