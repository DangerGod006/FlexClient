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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mb.class */
final class mb {
    public static final mb NONE;
    public static final mb ALWAYS;
    public static final mb ELYTRA_PLUS;
    public static final mb IGNORE;
    private static final mb[] Y;
    private static final EnumEntries L;

    private mb(String str, int i) {
    }

    public static mb[] values() {
        return (mb[]) Y.clone();
    }

    public static mb valueOf(String value) {
        return (mb) Enum.valueOf(mb.class, value);
    }

    @NotNull
    public static EnumEntries u() {
        return L;
    }

    private static final mb[] f() {
        return new mb[]{NONE, ALWAYS, ELYTRA_PLUS, IGNORE};
    }

    static {
        int i;
        long jA = yz.a(8026915209759146663L, -724339515260618886L, MethodHandles.lookup().lookupClass()).a(85239508610129L) ^ 2211822911499L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((jA << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[4];
        int i3 = 0;
        String str = "3VÁ³\u0006Iªñ\b.²ëºQ¨¢ý";
        int length = "3VÁ³\u0006Iªñ\b.²ëºQ¨¢ý".length();
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
                            NONE = new mb(strArr[0], 0);
                            ALWAYS = new mb(strArr[3], 1);
                            ELYTRA_PLUS = new mb(strArr[2], 2);
                            IGNORE = new mb(strArr[1], 3);
                            Y = f();
                            L = EnumEntriesKt.enumEntries(Y);
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
                        str = "K½¢Ø\u0011g\u001b\u001c{\u0093\u0014\u0010xoML\bÂµ\u0000ý-YM ";
                        length = "K½¢Ø\u0011g\u001b\u001c{\u0093\u0014\u0010xoML\bÂµ\u0000ý-YM ".length();
                        cCharAt = 16;
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
