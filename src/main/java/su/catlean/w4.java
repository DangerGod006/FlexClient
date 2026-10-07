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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/w4.class */
final class w4 {
    public static final w4 OFF;
    public static final w4 CRYSTAL;
    public static final w4 GAPPLE;
    private static final w4[] r;
    private static final EnumEntries h;

    private w4(String str, int i) {
    }

    public static w4[] values() {
        return (w4[]) r.clone();
    }

    public static w4 valueOf(String value) {
        return (w4) Enum.valueOf(w4.class, value);
    }

    @NotNull
    public static EnumEntries k() {
        return h;
    }

    private static final w4[] t() {
        return new w4[]{OFF, CRYSTAL, GAPPLE};
    }

    static {
        long jA = yz.a(-760311683863498902L, -3478499478754854030L, MethodHandles.lookup().lookupClass()).a(261225398375343L) ^ 129755282771235L;
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
        int length = "\u0001NN\u0083c\u0087^Ë\bûÉXp·\u008f`¨\b¡ìNñä7\u0096Ø".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("\u0001NN\u0083c\u0087^Ë\bûÉXp·\u008f`¨\b¡ìNñä7\u0096Ø".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                OFF = new w4(strArr[1], 0);
                CRYSTAL = new w4(strArr[0], 1);
                GAPPLE = new w4(strArr[2], 2);
                r = t();
                h = EnumEntriesKt.enumEntries(r);
                return;
            }
            cCharAt = "\u0001NN\u0083c\u0087^Ë\bûÉXp·\u008f`¨\b¡ìNñä7\u0096Ø".charAt(i3);
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
