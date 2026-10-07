package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/af.class */
public final class af {
    public static final af DEFAULT;
    public static final af MATRIX;
    public static final af MATRIX_2;
    public static final af WATER_BUCKET;
    public static final af FT_FENCE;
    private static final af[] p;
    private static final EnumEntries u;
    private static String[] E;

    private af(String str, int i) {
    }

    public static af[] values() {
        return (af[]) p.clone();
    }

    public static af valueOf(String value) {
        return (af) Enum.valueOf(af.class, value);
    }

    @NotNull
    public static EnumEntries F() {
        return u;
    }

    private static final af[] c() {
        return new af[]{DEFAULT, MATRIX, MATRIX_2, WATER_BUCKET, FT_FENCE};
    }

    static {
        int i;
        long jA = yz.a(-5939860606891966860L, 91943142864566276L, MethodHandles.lookup().lookupClass()).a(32225959345879L) ^ 85434103527433L;
        if ((String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7612687952487564635L, jA) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[2], -7599056912821452240L, jA) /* invoke-custom */;
        }
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
        String str = "\u0097\n1®Èß\u009fiÿÓ¹Wú\u0002ùW\u0010Ë'¼\u0082ëæ\u0091ùT\u008e\u001c£\u0005°Ác\b\u0094tþ¹1Ï\u0001,";
        int length = "\u0097\n1®Èß\u009fiÿÓ¹Wú\u0002ùW\u0010Ë'¼\u0082ëæ\u0091ùT\u008e\u001c£\u0005°Ác\b\u0094tþ¹1Ï\u0001,".length();
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
                            DEFAULT = new af(strArr[3], 0);
                            MATRIX = new af(strArr[2], 1);
                            MATRIX_2 = new af(strArr[0], 2);
                            WATER_BUCKET = new af(strArr[4], 3);
                            FT_FENCE = new af(strArr[1], 4);
                            p = c();
                            u = EnumEntriesKt.enumEntries(p);
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
                        str = "\bZ\u0017e?(GÍ\u0010\u001cÒæ®U;®M\u0083`Ið§\u0099Çç";
                        length = "\bZ\u0017e?(GÍ\u0010\u001cÒæ®U;®M\u0083`Ið§\u0099Çç".length();
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

    public static void T(String[] strArr) {
        E = strArr;
    }

    public static String[] R() {
        return E;
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
