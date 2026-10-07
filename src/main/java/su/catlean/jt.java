package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/jt.class */
public final class jt {

    @NotNull
    private static final fu g;

    @NotNull
    private static final fu D;

    @NotNull
    private static final fu u;

    @NotNull
    private static final fu O;

    @NotNull
    private static final fu s;

    @NotNull
    private static final fu h;

    @NotNull
    private static final fu e;

    @NotNull
    private static final fu H;

    @NotNull
    private static final fu W;

    @NotNull
    private static final fu v;

    @NotNull
    private static final fu L;
    private static _g[] k;

    @NotNull
    public static final fu n() {
        return g;
    }

    @NotNull
    public static final fu Q() {
        return D;
    }

    @NotNull
    public static final fu A() {
        return u;
    }

    @NotNull
    public static final fu c() {
        return O;
    }

    @NotNull
    public static final fu V() {
        return s;
    }

    @NotNull
    public static final fu F() {
        return h;
    }

    @NotNull
    public static final fu z() {
        return e;
    }

    @NotNull
    public static final fu y() {
        return H;
    }

    @NotNull
    public static final fu I() {
        return W;
    }

    @NotNull
    public static final fu v() {
        return v;
    }

    @NotNull
    public static final fu d() {
        return L;
    }

    static {
        int i;
        long jA = yz.a(-1411855101450747916L, 3514975155890691561L, MethodHandles.lookup().lookupClass()).a(68634786437873L) ^ 137543174313079L;
        long j = jA ^ 236692984055L;
        if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6916539072279976941L, jA) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[3], -6875134307901612531L, jA) /* invoke-custom */;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((jA << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[11];
        int i3 = 0;
        String str = "\u008cªd\u009fµ\u008cd\u0084\bÙ)<£PäV\u0095\u0010zÈ¿Î*\u0090ôõ\u0093\u009bdp÷w1Ö\bS/\u007f\n¢\u000búã\b¸°¾\u001aZÃT\u0010\bùlÞ°\u0006\u008aÌ\u0096\b$\u007fÞÏ³ðw\u000f\bÊüD\rÛxIÑ\bZ\u0012°\u001bªêC\u009e";
        int length = "\u008cªd\u009fµ\u008cd\u0084\bÙ)<£PäV\u0095\u0010zÈ¿Î*\u0090ôõ\u0093\u009bdp÷w1Ö\bS/\u007f\n¢\u000búã\b¸°¾\u001aZÃT\u0010\bùlÞ°\u0006\u008aÌ\u0096\b$\u007fÞÏ³ðw\u000f\bÊüD\rÛxIÑ\bZ\u0012°\u001bªêC\u009e".length();
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
                            g = new fu(j, strArr[0]);
                            D = new fu(j, strArr[10]);
                            u = new fu(j, strArr[7]);
                            O = new fu(j, strArr[4]);
                            s = new fu(j, strArr[9]);
                            h = new fu(j, strArr[2]);
                            e = new fu(j, strArr[3]);
                            H = new fu(j, strArr[1]);
                            W = new fu(j, strArr[5]);
                            v = new fu(j, strArr[6]);
                            L = new fu(j, strArr[8]);
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
                        str = "u®ò\u0005\\\u0099Î§\b\u001e¬, aþb©";
                        length = "u®ò\u0005\\\u0099Î§\b\u001e¬, aþb©".length();
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

    public static void o(_g[] _gVarArr) {
        k = _gVarArr;
    }

    public static _g[] h() {
        return k;
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
