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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/sv.class */
public final class sv {
    public static final sv NONE;
    public static final sv ONLY_LETHAL;
    public static final sv FULL;
    private static final sv[] A;
    private static final EnumEntries E;
    private static String[] x;

    private sv(String str, int i) {
    }

    public static sv[] values() {
        return (sv[]) A.clone();
    }

    public static sv valueOf(String value) {
        return (sv) Enum.valueOf(sv.class, value);
    }

    @NotNull
    public static EnumEntries i() {
        return E;
    }

    private static final sv[] Q() {
        return new sv[]{NONE, ONLY_LETHAL, FULL};
    }

    static {
        long jA = yz.a(-4405215554472099033L, 620361660512433241L, MethodHandles.lookup().lookupClass()).a(208946230006268L) ^ 25259605424648L;
        if ((String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2337115802308755927L, jA) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[1], 2398469294730234893L, jA) /* invoke-custom */;
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
        int length = "MD£Ü\u009dÚD³\b.\u0087Xb1kÈ3\u0010Ýs¬á¶Zl\u0097LR\u0015\u0092ø\u008f^²".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("MD£Ü\u009dÚD³\b.\u0087Xb1kÈ3\u0010Ýs¬á¶Zl\u0097LR\u0015\u0092ø\u008f^²".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                NONE = new sv(strArr[0], 0);
                ONLY_LETHAL = new sv(strArr[2], 1);
                FULL = new sv(strArr[1], 2);
                A = Q();
                E = EnumEntriesKt.enumEntries(A);
                return;
            }
            cCharAt = "MD£Ü\u009dÚD³\b.\u0087Xb1kÈ3\u0010Ýs¬á¶Zl\u0097LR\u0015\u0092ø\u008f^²".charAt(i3);
        }
    }

    public static void M(String[] strArr) {
        x = strArr;
    }

    public static String[] O() {
        return x;
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
