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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/sk.class */
public final class sk {
    public static final sk NCP;
    public static final sk VANILLA;
    public static final sk STRICT_NCP;
    public static final sk NCP_2;
    private static final sk[] w;
    private static final EnumEntries z;
    private static boolean R;

    private sk(String str, int i) {
    }

    public static sk[] values() {
        return (sk[]) w.clone();
    }

    public static sk valueOf(String value) {
        return (sk) Enum.valueOf(sk.class, value);
    }

    @NotNull
    public static EnumEntries U() {
        return z;
    }

    private static final sk[] A() {
        return new sk[]{NCP, VANILLA, STRICT_NCP, NCP_2};
    }

    static {
        int i;
        long jA = yz.a(2381825671182051710L, 1346934818306096760L, MethodHandles.lookup().lookupClass()).a(55629206515553L) ^ 98157579779710L;
        if ((boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2356147865532962841L, jA) /* invoke-custom */) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, -2330638867356815409L, jA) /* invoke-custom */;
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
        String str = "éyK.vn\u0094V\b\u009d\u009c¼\u001bøxà ";
        int length = "éyK.vn\u0094V\b\u009d\u009c¼\u001bøxà ".length();
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
                            NCP = new sk(strArr[1], 0);
                            VANILLA = new sk(strArr[0], 1);
                            STRICT_NCP = new sk(strArr[2], 2);
                            NCP_2 = new sk(strArr[3], 3);
                            w = A();
                            z = EnumEntriesKt.enumEntries(w);
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
                        str = "£\u009bë»oqÌ9I6\u001b|´ûÖ\f\b8òTôÓÅ\u009dl";
                        length = "£\u009bë»oqÌ9I6\u001b|´ûÖ\f\b8òTôÓÅ\u009dl".length();
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

    public static void y(boolean z2) {
        R = z2;
    }

    public static boolean W() {
        return R;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean p() {
        return !W();
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
