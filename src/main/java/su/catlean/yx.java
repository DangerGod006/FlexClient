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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/yx.class */
public final class yx {
    public static final yx REMOVE;
    public static final yx REPLACE;
    public static final yx OFF;
    private static final yx[] s;
    private static final EnumEntries V;

    private yx(String str, int i) {
    }

    public static yx[] values() {
        return (yx[]) s.clone();
    }

    public static yx valueOf(String value) {
        return (yx) Enum.valueOf(yx.class, value);
    }

    @NotNull
    public static EnumEntries J() {
        return V;
    }

    private static final yx[] x() {
        return new yx[]{REMOVE, REPLACE, OFF};
    }

    static {
        long jA = yz.a(1571353401888515652L, 1625959072303378288L, MethodHandles.lookup().lookupClass()).a(208278064030901L) ^ 65082073620137L;
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
        int length = "$¾ù'(\u0019<)\bY\u009f8\u0091\u0090\u0095\u0080\u0018\b@t®<{-\u0010\u0011".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("$¾ù'(\u0019<)\bY\u009f8\u0091\u0090\u0095\u0080\u0018\b@t®<{-\u0010\u0011".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                REMOVE = new yx(strArr[0], 0);
                REPLACE = new yx(strArr[2], 1);
                OFF = new yx(strArr[1], 2);
                s = x();
                V = EnumEntriesKt.enumEntries(s);
                return;
            }
            cCharAt = "$¾ù'(\u0019<)\bY\u009f8\u0091\u0090\u0095\u0080\u0018\b@t®<{-\u0010\u0011".charAt(i3);
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
