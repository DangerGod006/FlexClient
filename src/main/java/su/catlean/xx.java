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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/xx.class */
public final class xx {
    public static final xx Vanilla;
    public static final xx Strict;
    public static final xx AirPlace;
    public static final xx GRIM;
    private static final /* synthetic */ xx[] P;
    private static final /* synthetic */ EnumEntries O;
    private static String D;

    private xx(String str, int i) {
    }

    public static xx[] values() {
        return (xx[]) P.clone();
    }

    public static xx valueOf(String value) {
        return (xx) Enum.valueOf(xx.class, value);
    }

    @NotNull
    public static EnumEntries w() {
        return O;
    }

    private static final /* synthetic */ xx[] K() {
        return new xx[]{Vanilla, Strict, AirPlace, GRIM};
    }

    static {
        int i;
        long jA = yz.a(3335129741400859212L, -1976340919752615847L, MethodHandles.lookup().lookupClass()).a(250642316908530L) ^ 23736009575425L;
        if ((String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7498136180867397520L, jA) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("dCKYkc", 7549934304778165665L, jA) /* invoke-custom */;
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
        String str = "J\u0092\u0092Úwõ|)\u0010ÔÐ åø{\u0084\u0096\u001d<\u0001\u001emù¨ÿ";
        int length = "J\u0092\u0092Úwõ|)\u0010ÔÐ åø{\u0084\u0096\u001d<\u0001\u001emù¨ÿ".length();
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
                            Vanilla = new xx(strArr[0], 0);
                            Strict = new xx(strArr[3], 1);
                            AirPlace = new xx(strArr[1], 2);
                            GRIM = new xx(strArr[2], 3);
                            P = K();
                            O = EnumEntriesKt.enumEntries(P);
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
                        str = "xÃ¿1y\u0095õH\b\u001bG\u00adD(Ú\u0010Ñ";
                        length = "xÃ¿1y\u0095õH\b\u001bG\u00adD(Ú\u0010Ñ".length();
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

    public static void A(String str) {
        D = str;
    }

    public static String Q() {
        return D;
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
