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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/jz.class */
public final class jz {
    public static final jz FLAT;
    public static final jz NORMAL;
    private static final jz[] q;
    private static final EnumEntries Z;

    private jz(String str, int i) {
    }

    public static jz[] values() {
        return (jz[]) q.clone();
    }

    public static jz valueOf(String value) {
        return (jz) Enum.valueOf(jz.class, value);
    }

    @NotNull
    public static EnumEntries W() {
        return Z;
    }

    private static final jz[] l() {
        return new jz[]{FLAT, NORMAL};
    }

    static {
        long jA = yz.a(-3864414613544443954L, 3350118940803715243L, MethodHandles.lookup().lookupClass()).a(155231222570349L) ^ 121850679171357L;
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
        int length = "ë\u009fl\u0003~\u0082á\t\b»\\\u0012NV-« ".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("ë\u009fl\u0003~\u0082á\t\b»\\\u0012NV-« ".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                FLAT = new jz(strArr[1], 0);
                NORMAL = new jz(strArr[0], 1);
                q = l();
                Z = EnumEntriesKt.enumEntries(q);
                return;
            }
            cCharAt = "ë\u009fl\u0003~\u0082á\t\b»\\\u0012NV-« ".charAt(i3);
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
