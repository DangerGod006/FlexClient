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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/oz.class */
public final class oz {
    public static final oz Off;
    public static final oz Jitter;
    public static final oz Glide;
    private static final oz[] u;
    private static final EnumEntries W;

    private oz(String str, int i) {
    }

    public static oz[] values() {
        return (oz[]) u.clone();
    }

    public static oz valueOf(String value) {
        return (oz) Enum.valueOf(oz.class, value);
    }

    @NotNull
    public static EnumEntries F() {
        return W;
    }

    private static final oz[] n() {
        return new oz[]{Off, Jitter, Glide};
    }

    static {
        long jA = yz.a(-2993007959801444049L, -2136246928980805545L, MethodHandles.lookup().lookupClass()).a(101381312055256L) ^ 120111832335518L;
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
        int length = "Ö²tN\u001e\u0006\u007f\u009d\b\u008a²ÌøË\u0099#ù\bÀ\u009bX\u008dæêØ\u0006".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("Ö²tN\u001e\u0006\u007f\u009d\b\u008a²ÌøË\u0099#ù\bÀ\u009bX\u008dæêØ\u0006".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                Off = new oz(strArr[2], 0);
                Jitter = new oz(strArr[0], 1);
                Glide = new oz(strArr[1], 2);
                u = n();
                W = EnumEntriesKt.enumEntries(u);
                return;
            }
            cCharAt = "Ö²tN\u001e\u0006\u007f\u009d\b\u008a²ÌøË\u0099#ù\bÀ\u009bX\u008dæêØ\u0006".charAt(i3);
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
