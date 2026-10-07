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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ji.class */
public final class ji {
    public static final ji NONE;
    public static final ji RANDOM;
    public static final ji ROAMING;
    public static final ji SINE;
    public static final ji DRUNK_SINE;
    private static final ji[] a;
    private static final EnumEntries Q;
    private static String V;

    private ji(String str, int i) {
    }

    public static ji[] values() {
        return (ji[]) a.clone();
    }

    public static ji valueOf(String value) {
        return (ji) Enum.valueOf(ji.class, value);
    }

    @NotNull
    public static EnumEntries m() {
        return Q;
    }

    private static final ji[] P() {
        return new ji[]{NONE, RANDOM, ROAMING, SINE, DRUNK_SINE};
    }

    static {
        int i;
        long jA = yz.a(-4781377104962693916L, 6836573162517082784L, MethodHandles.lookup().lookupClass()).a(62645829198134L) ^ 129393143799090L;
        if ((String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1024855617711578594L, jA) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("cSZjo", 1043539721536487520L, jA) /* invoke-custom */;
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
        String str = "NO+\u00adbêÆß\b=mò¾\u0014SV\u0004\u0010\u008c¸Yükváé\u0010a\u0016²½bò\u0088";
        int length = "NO+\u00adbêÆß\b=mò¾\u0014SV\u0004\u0010\u008c¸Yükváé\u0010a\u0016²½bò\u0088".length();
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
                            NONE = new ji(strArr[3], 0);
                            RANDOM = new ji(strArr[0], 1);
                            ROAMING = new ji(strArr[4], 2);
                            SINE = new ji(strArr[1], 3);
                            DRUNK_SINE = new ji(strArr[2], 4);
                            a = P();
                            Q = EnumEntriesKt.enumEntries(a);
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
                        str = "ä¡\u0090;\u0088\u0089\u001d¼\b)æGkBüç\u008b";
                        length = "ä¡\u0090;\u0088\u0089\u001d¼\b)æGkBüç\u008b".length();
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

    public static void x(String str) {
        V = str;
    }

    public static String Y() {
        return V;
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
