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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/i.class */
public final class i {
    public static final i OFF;
    public static final i ON;
    public static final i ONLY;
    private static final i[] d;
    private static final EnumEntries z;

    private i(String str, int i) {
    }

    public static i[] values() {
        return (i[]) d.clone();
    }

    public static i valueOf(String value) {
        return (i) Enum.valueOf(i.class, value);
    }

    @NotNull
    public static EnumEntries f() {
        return z;
    }

    private static final i[] U() {
        return new i[]{OFF, ON, ONLY};
    }

    static {
        long jA = yz.a(-1398857615602257380L, -6617791783889949732L, MethodHandles.lookup().lookupClass()).a(200531890710964L) ^ 109172093582908L;
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
        int length = "ë\u007fô\u0007#ü\u0003Ö\bp,_x\u0084\u0099_*\bµ\u00ad\u0019åÙÂìî".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("ë\u007fô\u0007#ü\u0003Ö\bp,_x\u0084\u0099_*\bµ\u00ad\u0019åÙÂìî".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                OFF = new i(strArr[0], 0);
                ON = new i(strArr[1], 1);
                ONLY = new i(strArr[2], 2);
                d = U();
                z = EnumEntriesKt.enumEntries(d);
                return;
            }
            cCharAt = "ë\u007fô\u0007#ü\u0003Ö\bp,_x\u0084\u0099_*\bµ\u00ad\u0019åÙÂìî".charAt(i3);
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
