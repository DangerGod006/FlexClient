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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/bc.class */
public final class bc {
    public static final bc CENTER;
    public static final bc LEFT;
    private static final bc[] a;
    private static final EnumEntries R;
    private static int q;

    private bc(String str, int i) {
    }

    public static bc[] values() {
        return (bc[]) a.clone();
    }

    public static bc valueOf(String value) {
        return (bc) Enum.valueOf(bc.class, value);
    }

    @NotNull
    public static EnumEntries C() {
        return R;
    }

    private static final bc[] P() {
        return new bc[]{CENTER, LEFT};
    }

    static {
        long jA = yz.a(4032788424236711666L, -3719495614645525276L, MethodHandles.lookup().lookupClass()).a(173556589701170L) ^ 64488133916612L;
        if ((int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6984926248146344626L, jA) /* invoke-custom */ != 0) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(31, 6963120707720462864L, jA) /* invoke-custom */;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((jA << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[2];
        int i2 = 0;
        int length = "\u0013¿\u000b&¦L\u008c\u001a\b§L9?£¤¤\u0083".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("\u0013¿\u000b&¦L\u008c\u001a\b§L9?£¤¤\u0083".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                CENTER = new bc(strArr[1], 0);
                LEFT = new bc(strArr[0], 1);
                a = P();
                R = EnumEntriesKt.enumEntries(a);
                return;
            }
            cCharAt = "\u0013¿\u000b&¦L\u008c\u001a\b§L9?£¤¤\u0083".charAt(i3);
        }
    }

    public static void y(int i) {
        q = i;
    }

    public static int b() {
        return q;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int x() {
        return b() == 0 ? 60 : 0;
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
