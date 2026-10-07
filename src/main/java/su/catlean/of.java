package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/of.class */
public final class of {

    @NotNull
    private final String x;

    @NotNull
    private final Map k;
    public static final of EN;
    public static final of RU;
    public static final of PL;
    private static final of[] N;
    private static final EnumEntries t;

    private of(String str, int i, String str2, Map map) {
        this.x = str2;
        this.k = map;
    }

    @NotNull
    public final String i() {
        return this.x;
    }

    @NotNull
    public final Map A() {
        return this.k;
    }

    public static of[] values() {
        return (of[]) N.clone();
    }

    public static of valueOf(String value) {
        return (of) Enum.valueOf(of.class, value);
    }

    @NotNull
    public static EnumEntries b() {
        return t;
    }

    private static final of[] y() {
        return new of[]{EN, RU, PL};
    }

    static {
        int i;
        long jA = yz.a(1268896906261118318L, -8345833253705726917L, MethodHandles.lookup().lookupClass()).a(24725270067053L) ^ 70496827022608L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((jA << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[6];
        int i3 = 0;
        String str = "t\u0086S\u001d¸\u0007\u0092Ü\bÌ÷8~\u0081}\u009aÑ\bþ&\"f\u001a\u0000\u0083Ê\bmÎ\u009cß\u001d³K=";
        int length = "t\u0086S\u001d¸\u0007\u0092Ü\bÌ÷8~\u0081}\u009aÑ\bþ&\"f\u001a\u0000\u0083Ê\bmÎ\u009cß\u001d³K=".length();
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
                            EN = new of(strArr[3], 0, strArr[1], new LinkedHashMap());
                            RU = new of(strArr[2], 1, strArr[4], new LinkedHashMap());
                            PL = new of(strArr[5], 2, strArr[0], new LinkedHashMap());
                            N = y();
                            t = EnumEntriesKt.enumEntries(N);
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
                        str = "^4\u009a¤\u0089!ía\bc\u0015AÇ\u0016\u0087Àí";
                        length = "^4\u009a¤\u0089!ía\bc\u0015AÇ\u0016\u0087Àí".length();
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
