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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/rw.class */
public final class rw {
    public static final rw MIRROR;
    public static final rw DEFAULT;
    public static final rw BLOOM;
    public static final rw DOUBLE;
    public static final rw CAMOUFLAGE;
    private static final rw[] X;
    private static final EnumEntries G;
    private static int v;

    private rw(String str, int i) {
    }

    public static rw[] values() {
        return (rw[]) X.clone();
    }

    public static rw valueOf(String value) {
        return (rw) Enum.valueOf(rw.class, value);
    }

    @NotNull
    public static EnumEntries T() {
        return G;
    }

    private static final rw[] S() {
        return new rw[]{MIRROR, DEFAULT, BLOOM, DOUBLE, CAMOUFLAGE};
    }

    static {
        int i;
        long jA = yz.a(7319074314789041939L, -1086925738408626528L, MethodHandles.lookup().lookupClass()).a(228645840305507L) ^ 69548038974762L;
        if ((int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7615565463409832330L, jA) /* invoke-custom */ == 0) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(69, -7624596103289823411L, jA) /* invoke-custom */;
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
        String str = "ë\u000bJ\u009d1\t\u0089®\bm\u0005bW#?}Î\bT\u009e\u000bï}¾\"¬";
        int length = "ë\u000bJ\u009d1\t\u0089®\bm\u0005bW#?}Î\bT\u009e\u000bï}¾\"¬".length();
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
                            MIRROR = new rw(strArr[3], 0);
                            DEFAULT = new rw(strArr[2], 1);
                            BLOOM = new rw(strArr[1], 2);
                            DOUBLE = new rw(strArr[0], 3);
                            CAMOUFLAGE = new rw(strArr[4], 4);
                            X = S();
                            G = EnumEntriesKt.enumEntries(X);
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
                        str = "Ì8õ¿\u001fû?e\u0010ódNiðÐ\u009cqdopýµ}i\u0003";
                        length = "Ì8õ¿\u001fû?e\u0010ódNiðÐ\u009cqdopýµ}i\u0003".length();
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

    public static void P(int i) {
        v = i;
    }

    public static int G() {
        return v;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int R() {
        return G() == 0 ? 44 : 0;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
