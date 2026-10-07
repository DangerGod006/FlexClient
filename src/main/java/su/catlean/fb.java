package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/fb.class */
final class fb {
    public static final fb SEQUENTIAL;
    public static final fb VANILLA;
    public static final fb GRIM;
    private static final fb[] q;
    private static final EnumEntries K;

    private fb(String str, int i) {
    }

    public static fb[] values() {
        return (fb[]) q.clone();
    }

    public static fb valueOf(String value) {
        return (fb) Enum.valueOf(fb.class, value);
    }

    @NotNull
    public static EnumEntries P() {
        return K;
    }

    private static final fb[] Z() {
        return new fb[]{SEQUENTIAL, VANILLA, GRIM};
    }

    static {
        long jA = yz.a(-3853953273758925497L, 749558951171038333L, MethodHandles.lookup().lookupClass()).a(254865472585860L) ^ 44969007886692L;
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
        int length = "\u0087\u0003QÝ\u0080Õ\u0082ë\u0010¶ß&R\u00ad,\u0003,»à[\u0015¨\u0014N¶\bÛééa<û÷\u0011".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("\u0087\u0003QÝ\u0080Õ\u0082ë\u0010¶ß&R\u00ad,\u0003,»à[\u0015¨\u0014N¶\bÛééa<û÷\u0011".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                SEQUENTIAL = new fb(strArr[1], 0);
                VANILLA = new fb(strArr[0], 1);
                GRIM = new fb(strArr[2], 2);
                q = Z();
                K = EnumEntriesKt.enumEntries(q);
                return;
            }
            cCharAt = "\u0087\u0003QÝ\u0080Õ\u0082ë\u0010¶ß&R\u00ad,\u0003,»à[\u0015¨\u0014N¶\bÛééa<û÷\u0011".charAt(i3);
        }
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
