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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/n_.class */
public final class n_ {
    public static final n_ PACKET;
    public static final n_ ADD_TO_WORLD;
    private static final n_[] p;
    private static final EnumEntries i;

    private n_(String str, int i2) {
    }

    public static n_[] values() {
        return (n_[]) p.clone();
    }

    public static n_ valueOf(String value) {
        return (n_) Enum.valueOf(n_.class, value);
    }

    @NotNull
    public static EnumEntries w() {
        return i;
    }

    private static final n_[] u() {
        return new n_[]{PACKET, ADD_TO_WORLD};
    }

    static {
        long jA = yz.a(-2858430058926751124L, -1142730457971126755L, MethodHandles.lookup().lookupClass()).a(216803091501600L) ^ 74757634090540L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((jA << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[2];
        int i3 = 0;
        int length = "_áóíwñWÇ³×\u0012|\u0013å\u000eg\b\u0012\f\u0089Ñ,\u009aÊ\u0087".length();
        char cCharAt = 16;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            int i6 = i3;
            i3++;
            strArr[i6] = a(cipher.doFinal("_áóíwñWÇ³×\u0012|\u0013å\u000eg\b\u0012\f\u0089Ñ,\u009aÊ\u0087".substring(i5, i5 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i7 = i5 + cCharAt;
            i4 = i7;
            if (i7 >= length) {
                PACKET = new n_(strArr[1], 0);
                ADD_TO_WORLD = new n_(strArr[0], 1);
                p = u();
                i = EnumEntriesKt.enumEntries(p);
                return;
            }
            cCharAt = "_áóíwñWÇ³×\u0012|\u0013å\u000eg\b\u0012\f\u0089Ñ,\u009aÊ\u0087".charAt(i4);
        }
    }

    private static String a(byte[] bArr) {
        int i2 = 0;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i3 = 0;
        while (i3 < length) {
            int i4 = 255 & bArr[i3];
            if (i4 < 192) {
                int i5 = i2;
                i2++;
                cArr[i5] = (char) i4;
            } else if (i4 < 224) {
                i3++;
                int i6 = i2;
                i2++;
                cArr[i6] = (char) (((char) (((char) (i4 & 31)) << 6)) | ((char) (bArr[i3] & 63)));
            } else if (i3 < length - 2) {
                int i7 = i3 + 1;
                char c = (char) (((char) (((char) (i4 & 15)) << '\f')) | (((char) (bArr[i7] & 63)) << 6));
                i3 = i7 + 1;
                int i8 = i2;
                i2++;
                cArr[i8] = (char) (c | ((char) (bArr[i3] & 63)));
            }
            i3++;
        }
        return new String(cArr, 0, i2);
    }
}
