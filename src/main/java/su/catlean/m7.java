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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/m7.class */
public final class m7 {
    public static final m7 Number;
    public static final m7 Hearts;
    public static final m7 Dots;
    private static final m7[] v;
    private static final EnumEntries U;

    private m7(String str, int i) {
    }

    public static m7[] values() {
        return (m7[]) v.clone();
    }

    public static m7 valueOf(String value) {
        return (m7) Enum.valueOf(m7.class, value);
    }

    @NotNull
    public static EnumEntries A() {
        return U;
    }

    private static final m7[] c() {
        return new m7[]{Number, Hearts, Dots};
    }

    static {
        long jA = yz.a(1846145089549973952L, 6524750754293588900L, MethodHandles.lookup().lookupClass()).a(58150557025145L) ^ 58781040568357L;
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
        int length = "Âª*°;\bÖµ\bÉ WpYãvE\bÁÙ\u0091`X¢µ»".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("Âª*°;\bÖµ\bÉ WpYãvE\bÁÙ\u0091`X¢µ»".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                Number = new m7(strArr[0], 0);
                Hearts = new m7(strArr[1], 1);
                Dots = new m7(strArr[2], 2);
                v = c();
                U = EnumEntriesKt.enumEntries(v);
                return;
            }
            cCharAt = "Âª*°;\bÖµ\bÉ WpYãvE\bÁÙ\u0091`X¢µ»".charAt(i3);
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
