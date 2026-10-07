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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/tz.class */
public final class tz {
    public static final tz CUSTOM;
    public static final tz SYNC;
    public static final tz RGB;
    public static final tz SKY;
    public static final tz LIGHT_RGB;
    private static final tz[] l;
    private static final EnumEntries R;
    private static String[] W;

    private tz(String str, int i) {
    }

    public static tz[] values() {
        return (tz[]) l.clone();
    }

    public static tz valueOf(String value) {
        return (tz) Enum.valueOf(tz.class, value);
    }

    @NotNull
    public static EnumEntries W() {
        return R;
    }

    private static final tz[] k() {
        return new tz[]{CUSTOM, SYNC, RGB, SKY, LIGHT_RGB};
    }

    static {
        int i;
        long jA = yz.a(-6764769074393202073L, 5356158761306579670L, MethodHandles.lookup().lookupClass()).a(200735882615803L) ^ 111353807826257L;
        if ((String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2706192256201761490L, jA) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[1], -2670653563025241138L, jA) /* invoke-custom */;
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
        String str = "ùb\u001f~ÿ`õ9\b\u0005C\u0086÷O\u0005Ô\u0083\u0010\u0095F\u0016D\u0090ôgµ4= Ã[r\u0004Y";
        int length = "ùb\u001f~ÿ`õ9\b\u0005C\u0086÷O\u0005Ô\u0083\u0010\u0095F\u0016D\u0090ôgµ4= Ã[r\u0004Y".length();
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
                            CUSTOM = new tz(strArr[3], 0);
                            SYNC = new tz(strArr[4], 1);
                            RGB = new tz(strArr[0], 2);
                            SKY = new tz(strArr[1], 3);
                            LIGHT_RGB = new tz(strArr[2], 4);
                            l = k();
                            R = EnumEntriesKt.enumEntries(l);
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
                        str = "\u0088¶\u0012oÕfiÐ\b\u0093\u009d\u008dæÍU\u000f¸";
                        length = "\u0088¶\u0012oÕfiÐ\b\u0093\u009d\u008dæÍU\u000f¸".length();
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

    public static void Z(String[] strArr) {
        W = strArr;
    }

    public static String[] x() {
        return W;
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
