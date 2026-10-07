package su.catlean;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mj.class */
public final class mj {

    @NotNull
    private static final File j;

    @NotNull
    private static final File Z;

    @NotNull
    private static final File v;

    @NotNull
    private static final File[] Y;
    private static String[] q;

    @NotNull
    public static final File v() {
        return j;
    }

    @NotNull
    public static final File t() {
        return Z;
    }

    @NotNull
    public static final File z() {
        return v;
    }

    @NotNull
    public static final File[] l() {
        return Y;
    }

    static {
        int i;
        long jA = yz.a(6698001044120371411L, 2540612746589965740L, MethodHandles.lookup().lookupClass()).a(8539572600840L) ^ 112080634316937L;
        if ((String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6815368246432678115L, jA) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[5], 6785809893857906659L, jA) /* invoke-custom */;
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
        String str = "*ÉE ·Ïì|)£\u009dÑef\u008e\u009d\u0010g¢\nìO2ªéoÏépm\u0015\u0099\u0081";
        int length = "*ÉE ·Ïì|)£\u009dÑef\u008e\u009d\u0010g¢\nìO2ªéoÏépm\u0015\u0099\u0081".length();
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
                            j = new File(System.getProperty(strArr[2]) + strArr[3]);
                            Z = new File(j + strArr[1]);
                            v = new File(j + strArr[0]);
                            Y = new File[]{j, Z, v};
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
                        str = "]\u0018\u001a³@\u0000\u0090\t¡ôæEÑ\u001a\u0010È\b\u0013\u008bY|\u008a\u0099Ó\u0090";
                        length = "]\u0018\u001a³@\u0000\u0090\t¡ôæEÑ\u001a\u0010È\b\u0013\u008bY|\u008a\u0099Ó\u0090".length();
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

    public static void h(String[] strArr) {
        q = strArr;
    }

    public static String[] C() {
        return q;
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
