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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/p.class */
final class p {
    public static final p LackOfRegen;
    public static final p Health;
    private static final p[] h;
    private static final EnumEntries x;

    private p(String str, int i) {
    }

    public static p[] values() {
        return (p[]) h.clone();
    }

    public static p valueOf(String value) {
        return (p) Enum.valueOf(p.class, value);
    }

    @NotNull
    public static EnumEntries E() {
        return x;
    }

    private static final p[] V() {
        return new p[]{LackOfRegen, Health};
    }

    static {
        long jA = yz.a(1295002422901335120L, 6111724733008814030L, MethodHandles.lookup().lookupClass()).a(175234990209590L) ^ 20934314360464L;
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
        int length = "¤7ebè\u0098\u00036\u0010ö`¬ü5\u0089\u0018¨`ª1\u009dW<±\u0002".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("¤7ebè\u0098\u00036\u0010ö`¬ü5\u0089\u0018¨`ª1\u009dW<±\u0002".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                LackOfRegen = new p(strArr[1], 0);
                Health = new p(strArr[0], 1);
                h = V();
                x = EnumEntriesKt.enumEntries(h);
                return;
            }
            cCharAt = "¤7ebè\u0098\u00036\u0010ö`¬ü5\u0089\u0018¨`ª1\u009dW<±\u0002".charAt(i3);
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
