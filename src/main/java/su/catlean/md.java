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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/md.class */
final class md {
    public static final md STANDING;
    public static final md LYING;
    private static final md[] B;
    private static final EnumEntries M;

    private md(String str, int i) {
    }

    public static md[] values() {
        return (md[]) B.clone();
    }

    public static md valueOf(String value) {
        return (md) Enum.valueOf(md.class, value);
    }

    @NotNull
    public static EnumEntries i() {
        return M;
    }

    private static final md[] u() {
        return new md[]{STANDING, LYING};
    }

    static {
        long jA = yz.a(-2140437615512148705L, -8200713657216822599L, MethodHandles.lookup().lookupClass()).a(58768823647790L) ^ 26555786479687L;
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
        int length = "~\u0094n|$\u0005ªÀ\u00999\u008b\u008fÞÆ\u0016o\b\u0015Åß\u0084\u0081\u008cà®".length();
        char cCharAt = 16;
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("~\u0094n|$\u0005ªÀ\u00999\u008b\u008fÞÆ\u0016o\b\u0015Åß\u0084\u0081\u008cà®".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                STANDING = new md(strArr[0], 0);
                LYING = new md(strArr[1], 1);
                B = u();
                M = EnumEntriesKt.enumEntries(B);
                return;
            }
            cCharAt = "~\u0094n|$\u0005ªÀ\u00999\u008b\u008fÞÆ\u0016o\b\u0015Åß\u0084\u0081\u008cà®".charAt(i3);
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
