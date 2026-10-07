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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/be.class */
final class be {
    public static final be Vanilla;
    public static final be Creative;
    public static final be MATRIX_JUMP;
    public static final be GRIM_GLIDE;
    private static final be[] g;
    private static final EnumEntries d;

    private be(String str, int i) {
    }

    public static be[] values() {
        return (be[]) g.clone();
    }

    public static be valueOf(String value) {
        return (be) Enum.valueOf(be.class, value);
    }

    @NotNull
    public static EnumEntries o() {
        return d;
    }

    private static final be[] R() {
        return new be[]{Vanilla, Creative, MATRIX_JUMP, GRIM_GLIDE};
    }

    static {
        int i;
        long jA = yz.a(-7185450343715966961L, 2113565741700202873L, MethodHandles.lookup().lookupClass()).a(208607582065856L) ^ 124638081348036L;
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
        String str = "jCú*\u001bI\u0093Ë<\u0093Î\u001fW+(\u0004\u0010û\u001amÌÀÄ:\u0094\u0091Y|k\u0014¯\u009bÀ";
        int length = "jCú*\u001bI\u0093Ë<\u0093Î\u001fW+(\u0004\u0010û\u001amÌÀÄ:\u0094\u0091Y|k\u0014¯\u009bÀ".length();
        char cCharAt = 16;
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
                            Vanilla = new be(strArr[3], 0);
                            Creative = new be(strArr[2], 1);
                            MATRIX_JUMP = new be(strArr[1], 2);
                            GRIM_GLIDE = new be(strArr[0], 3);
                            g = R();
                            d = EnumEntriesKt.enumEntries(g);
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
                        str = "ð\u0081èa¢¿÷Ck\u000bïT]®\b¯\b\u0005\u0082ÁÅ\u008a33\u001f";
                        length = "ð\u0081èa¢¿÷Ck\u000bïT]®\b¯\b\u0005\u0082ÁÅ\u008a33\u001f".length();
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
