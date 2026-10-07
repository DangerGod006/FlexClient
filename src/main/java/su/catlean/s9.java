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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/s9.class */
public final class s9 {
    public static final s9 OFF;
    public static final s9 COMETS;
    public static final s9 SELECTION;
    public static final s9 BLOOM_CIRCLE;
    private static final s9[] r;
    private static final EnumEntries D;
    private static String[] F;

    private s9(String str, int i) {
    }

    public static s9[] values() {
        return (s9[]) r.clone();
    }

    public static s9 valueOf(String value) {
        return (s9) Enum.valueOf(s9.class, value);
    }

    @NotNull
    public static EnumEntries K() {
        return D;
    }

    private static final s9[] q() {
        return new s9[]{OFF, COMETS, SELECTION, BLOOM_CIRCLE};
    }

    static {
        int i;
        long jA = yz.a(-8757791319968255937L, -8215806995277794035L, MethodHandles.lookup().lookupClass()).a(51276432287758L) ^ 48721193389081L;
        if ((String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5010085600819078305L, jA) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[4], 4998235497353153942L, jA) /* invoke-custom */;
        }
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
        String str = ":¯\u001a\u001b°\u0004\u0091Ë\u0010\fl0ñ¿\u009c\u009c\u0010\u0086]n{³Å.¼";
        int length = ":¯\u001a\u001b°\u0004\u0091Ë\u0010\fl0ñ¿\u009c\u009c\u0010\u0086]n{³Å.¼".length();
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
                            OFF = new s9(strArr[0], 0);
                            COMETS = new s9(strArr[3], 1);
                            SELECTION = new s9(strArr[2], 2);
                            BLOOM_CIRCLE = new s9(strArr[1], 3);
                            r = q();
                            D = EnumEntriesKt.enumEntries(r);
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
                        str = "?ó 7\u0085\\¾Õ£\u000bÕ\u009cd.¦î\bÔ¹Tô}\u0086ÿX";
                        length = "?ó 7\u0085\\¾Õ£\u000bÕ\u009cd.¦î\bÔ¹Tô}\u0086ÿX".length();
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

    public static void D(String[] strArr) {
        F = strArr;
    }

    public static String[] g() {
        return F;
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
