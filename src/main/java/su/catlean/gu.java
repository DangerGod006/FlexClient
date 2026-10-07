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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gu.class */
public final class gu {
    public static final gu NORMAL;
    public static final gu ENCHANTED;
    private static final gu[] z;
    private static final EnumEntries x;

    private gu(String str, int i) {
    }

    public static gu[] values() {
        return (gu[]) z.clone();
    }

    public static gu valueOf(String value) {
        return (gu) Enum.valueOf(gu.class, value);
    }

    @NotNull
    public static EnumEntries g() {
        return x;
    }

    private static final gu[] N() {
        return new gu[]{NORMAL, ENCHANTED};
    }

    static {
        long jA = yz.a(-3608822814334143435L, 5752228435703056134L, MethodHandles.lookup().lookupClass()).a(137876144548756L) ^ 14490796937735L;
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
        int length = "\n\u0095Ù-{e$µÓî\u0090PñÀ<\u0094\bþ\u007fÅý\u009a¶K\u0087".length();
        char cCharAt = 16;
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("\n\u0095Ù-{e$µÓî\u0090PñÀ<\u0094\bþ\u007fÅý\u009a¶K\u0087".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                NORMAL = new gu(strArr[1], 0);
                ENCHANTED = new gu(strArr[0], 1);
                z = N();
                x = EnumEntriesKt.enumEntries(z);
                return;
            }
            cCharAt = "\n\u0095Ù-{e$µÓî\u0090PñÀ<\u0094\bþ\u007fÅý\u009a¶K\u0087".charAt(i3);
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
