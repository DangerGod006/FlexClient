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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/y8.class */
public final class y8 {
    public static final y8 DEFAULT;
    public static final y8 LINES;
    public static final y8 DOTS;
    private static final y8[] n;
    private static final EnumEntries J;
    private static int[] q;

    private y8(String str, int i) {
    }

    public static y8[] values() {
        return (y8[]) n.clone();
    }

    public static y8 valueOf(String value) {
        return (y8) Enum.valueOf(y8.class, value);
    }

    @NotNull
    public static EnumEntries E() {
        return J;
    }

    private static final y8[] N() {
        return new y8[]{DEFAULT, LINES, DOTS};
    }

    static {
        long jA = yz.a(8815998564268878848L, 6904128356196001765L, MethodHandles.lookup().lookupClass()).a(8432005734363L) ^ 91042157120508L;
        if ((int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3297509086702599760L, jA) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[5], -3227976704151434893L, jA) /* invoke-custom */;
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
        int length = "Ù=k;\u0094C\u0012\u0001\b\t\u008dâ\u0089_¡\u000f#\bñçÇ/-~!ì".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("Ù=k;\u0094C\u0012\u0001\b\t\u008dâ\u0089_¡\u000f#\bñçÇ/-~!ì".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                DEFAULT = new y8(strArr[2], 0);
                LINES = new y8(strArr[1], 1);
                DOTS = new y8(strArr[0], 2);
                n = N();
                J = EnumEntriesKt.enumEntries(n);
                return;
            }
            cCharAt = "Ù=k;\u0094C\u0012\u0001\b\t\u008dâ\u0089_¡\u000f#\bñçÇ/-~!ì".charAt(i3);
        }
    }

    public static void j(int[] iArr) {
        q = iArr;
    }

    public static int[] g() {
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
