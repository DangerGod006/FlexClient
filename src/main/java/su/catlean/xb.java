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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/xb.class */
final class xb {
    public static final xb Select;
    public static final xb All;
    public static final xb BlackList;
    public static final xb WhiteList;
    private static final xb[] P;
    private static final EnumEntries l;

    private xb(String str, int i) {
    }

    public static xb[] values() {
        return (xb[]) P.clone();
    }

    public static xb valueOf(String value) {
        return (xb) Enum.valueOf(xb.class, value);
    }

    @NotNull
    public static EnumEntries n() {
        return l;
    }

    private static final xb[] T() {
        return new xb[]{Select, All, BlackList, WhiteList};
    }

    static {
        int i;
        long jA = yz.a(5170981708187696684L, -1579051143705660869L, MethodHandles.lookup().lookupClass()).a(142410184547896L) ^ 20149370402434L;
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
        String str = "\u0007öw\u0095 (\\\u0095P1<Ã¾\u009d\u0016·\u0010\u008fì\u001e-Ê½ú\u001e}\u000f.&ð³ø\u0093";
        int length = "\u0007öw\u0095 (\\\u0095P1<Ã¾\u009d\u0016·\u0010\u008fì\u001e-Ê½ú\u001e}\u000f.&ð³ø\u0093".length();
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
                            Select = new xb(strArr[2], 0);
                            All = new xb(strArr[3], 1);
                            BlackList = new xb(strArr[0], 2);
                            WhiteList = new xb(strArr[1], 3);
                            P = T();
                            l = EnumEntriesKt.enumEntries(P);
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
                        str = "\u000f¿îâ\u0010\u00adìÀ\b\u0005I@d\u0014\bæè";
                        length = "\u000f¿îâ\u0010\u00adìÀ\b\u0005I@d\u0014\bæè".length();
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
