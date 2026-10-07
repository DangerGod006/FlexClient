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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/w7.class */
public final class w7 {
    public static final w7 DEFAULT;
    public static final w7 ALWAYS;
    public static final w7 BOOLS;
    private static final /* synthetic */ w7[] P;
    private static final /* synthetic */ EnumEntries G;
    private static String[] c;

    private w7(String str, int i) {
    }

    public static w7[] values() {
        return (w7[]) P.clone();
    }

    public static w7 valueOf(String value) {
        return (w7) Enum.valueOf(w7.class, value);
    }

    @NotNull
    public static EnumEntries t() {
        return G;
    }

    private static final /* synthetic */ w7[] P() {
        return new w7[]{DEFAULT, ALWAYS, BOOLS};
    }

    static {
        long jA = yz.a(2314452742185648538L, -1981299622445369348L, MethodHandles.lookup().lookupClass()).a(157974217895209L) ^ 115817947621782L;
        if ((String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8505974006662249824L, jA) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[4], -8551433858531190564L, jA) /* invoke-custom */;
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
        int length = "»Ø\u001d×ô¡Ýá\b\u009e{\u0095¯7ÐëT\bNæjøN\u001eª\\".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("»Ø\u001d×ô¡Ýá\b\u009e{\u0095¯7ÐëT\bNæjøN\u001eª\\".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                DEFAULT = new w7(strArr[0], 0);
                ALWAYS = new w7(strArr[1], 1);
                BOOLS = new w7(strArr[2], 2);
                P = P();
                G = EnumEntriesKt.enumEntries(P);
                return;
            }
            cCharAt = "»Ø\u001d×ô¡Ýá\b\u009e{\u0095¯7ÐëT\bNæjøN\u001eª\\".charAt(i3);
        }
    }

    public static void l(String[] strArr) {
        c = strArr;
    }

    public static String[] x() {
        return c;
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
                char c2 = (char) (((char) (((char) (i3 & 15)) << '\f')) | (((char) (bArr[i6] & 63)) << 6));
                i2 = i6 + 1;
                int i7 = i;
                i++;
                cArr[i7] = (char) (c2 | ((char) (bArr[i2] & 63)));
            }
            i2++;
        }
        return new String(cArr, 0, i);
    }
}
