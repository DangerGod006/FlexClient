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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/al.class */
public final class al {
    public static final al DEFAULT;
    public static final al FULL;
    public static final al SEMI;
    private static final al[] u;
    private static final EnumEntries z;

    private al(String str, int i) {
    }

    public static al[] values() {
        return (al[]) u.clone();
    }

    public static al valueOf(String value) {
        return (al) Enum.valueOf(al.class, value);
    }

    @NotNull
    public static EnumEntries t() {
        return z;
    }

    private static final al[] q() {
        return new al[]{DEFAULT, FULL, SEMI};
    }

    static {
        long jA = yz.a(-5106880044350635469L, -2800041082836635694L, MethodHandles.lookup().lookupClass()).a(52159362502024L) ^ 20717091054811L;
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
        int length = "\u0000EJO\u007fÅö\u0012\b<\u008fÀ<\u001c\u001d(\u001f\b_#Fî]m\u000e¶".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("\u0000EJO\u007fÅö\u0012\b<\u008fÀ<\u001c\u001d(\u001f\b_#Fî]m\u000e¶".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                DEFAULT = new al(strArr[2], 0);
                FULL = new al(strArr[0], 1);
                SEMI = new al(strArr[1], 2);
                u = q();
                z = EnumEntriesKt.enumEntries(u);
                return;
            }
            cCharAt = "\u0000EJO\u007fÅö\u0012\b<\u008fÀ<\u001c\u001d(\u001f\b_#Fî]m\u000e¶".charAt(i3);
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
