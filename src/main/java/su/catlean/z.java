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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/z.class */
public final class z {
    public static final z SINGLE;
    public static final z DOUBLE_X;
    public static final z DOUBLE_Z;
    public static final z QUAD;
    private static final /* synthetic */ z[] f;
    private static final /* synthetic */ EnumEntries A;

    private z(String str, int i) {
    }

    public static z[] values() {
        return (z[]) f.clone();
    }

    public static z valueOf(String value) {
        return (z) Enum.valueOf(z.class, value);
    }

    @NotNull
    public static EnumEntries v() {
        return A;
    }

    private static final /* synthetic */ z[] T() {
        return new z[]{SINGLE, DOUBLE_X, DOUBLE_Z, QUAD};
    }

    static {
        int i;
        long jA = yz.a(7429417545604169321L, 6099476212186543714L, MethodHandles.lookup().lookupClass()).a(202331151158501L) ^ 37461081179047L;
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
        String str = "%D\u0015tj\u008a7s\u0010îöÒ¯Ö¯M\u0088çY\u001ewD\u008ac¡";
        int length = "%D\u0015tj\u008a7s\u0010îöÒ¯Ö¯M\u0088çY\u001ewD\u008ac¡".length();
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
                            SINGLE = new z(strArr[3], 0);
                            DOUBLE_X = new z(strArr[1], 1);
                            DOUBLE_Z = new z(strArr[2], 2);
                            QUAD = new z(strArr[0], 3);
                            f = T();
                            A = EnumEntriesKt.enumEntries(f);
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
                        str = "¦×¼\u0085Q\u0019\"²\\[¤g\u0093wÂ\u008d\bWºG\u0095Z¿x³";
                        length = "¦×¼\u0085Q\u0019\"²\\[¤g\u0093wÂ\u008d\bWºG\u0095Z¿x³".length();
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
