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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/w2.class */
public final class w2 {
    public static final w2 DISTANCE;
    public static final w2 FOV;
    public static final w2 HEALTH;
    private static final w2[] v;
    private static final EnumEntries U;
    private static boolean P;

    private w2(String str, int i) {
    }

    public static w2[] values() {
        return (w2[]) v.clone();
    }

    public static w2 valueOf(String value) {
        return (w2) Enum.valueOf(w2.class, value);
    }

    @NotNull
    public static EnumEntries P() {
        return U;
    }

    private static final w2[] R() {
        return new w2[]{DISTANCE, FOV, HEALTH};
    }

    static {
        long jA = yz.a(-8089621578697062869L, -3515601153509769730L, MethodHandles.lookup().lookupClass()).a(227058087978971L) ^ 89344141747071L;
        if ((boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2924101300108539445L, jA) /* invoke-custom */) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, 2893770791473267864L, jA) /* invoke-custom */;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((jA << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[3];
        int i2 = 0;
        int length = "v~Ä\u0013åÕÚ!\rÝLy¯ô®ð\b\u001a8¼\u009fgÁLÍ\b'\u0094\u009d\u0004ÿMæô".length();
        char cCharAt = 16;
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("v~Ä\u0013åÕÚ!\rÝLy¯ô®ð\b\u001a8¼\u009fgÁLÍ\b'\u0094\u009d\u0004ÿMæô".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                DISTANCE = new w2(strArr[0], 0);
                FOV = new w2(strArr[2], 1);
                HEALTH = new w2(strArr[1], 2);
                v = R();
                U = EnumEntriesKt.enumEntries(v);
                return;
            }
            cCharAt = "v~Ä\u0013åÕÚ!\rÝLy¯ô®ð\b\u001a8¼\u009fgÁLÍ\b'\u0094\u009d\u0004ÿMæô".charAt(i3);
        }
    }

    public static void S(boolean z) {
        P = z;
    }

    public static boolean H() {
        return P;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean s() {
        return !H();
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
