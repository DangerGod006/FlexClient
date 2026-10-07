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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/a0.class */
public final class a0 {
    public static final a0 NORMAL;
    public static final a0 NONE;
    public static final a0 SILENT;
    private static final a0[] y;
    private static final EnumEntries g;

    private a0(String str, int i) {
    }

    public static a0[] values() {
        return (a0[]) y.clone();
    }

    public static a0 valueOf(String value) {
        return (a0) Enum.valueOf(a0.class, value);
    }

    @NotNull
    public static EnumEntries V() {
        return g;
    }

    private static final a0[] T() {
        return new a0[]{NORMAL, NONE, SILENT};
    }

    static {
        long jA = yz.a(-4971455597248057978L, -7403916565539765632L, MethodHandles.lookup().lookupClass()).a(151520578350456L) ^ 71111726458268L;
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
        int length = "\u0012\u0001hUÂ\u0003xÜ\b\u000fJ\u008c¨Òp5\r\b0\u0098ÔÊt\u0014Òþ".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("\u0012\u0001hUÂ\u0003xÜ\b\u000fJ\u008c¨Òp5\r\b0\u0098ÔÊt\u0014Òþ".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                NORMAL = new a0(strArr[0], 0);
                NONE = new a0(strArr[2], 1);
                SILENT = new a0(strArr[1], 2);
                y = T();
                g = EnumEntriesKt.enumEntries(y);
                return;
            }
            cCharAt = "\u0012\u0001hUÂ\u0003xÜ\b\u000fJ\u008c¨Òp5\r\b0\u0098ÔÊt\u0014Òþ".charAt(i3);
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
