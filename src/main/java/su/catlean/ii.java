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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ii.class */
public final class ii {
    public static final ii SWITCH;
    public static final ii TOGGLE;
    public static final ii EATING;
    private static final ii[] b;
    private static final EnumEntries f;

    private ii(String str, int i) {
    }

    public static ii[] values() {
        return (ii[]) b.clone();
    }

    public static ii valueOf(String value) {
        return (ii) Enum.valueOf(ii.class, value);
    }

    @NotNull
    public static EnumEntries f() {
        return f;
    }

    private static final ii[] r() {
        return new ii[]{SWITCH, TOGGLE, EATING};
    }

    static {
        long jA = yz.a(-2871795143353586668L, -8154784940214194967L, MethodHandles.lookup().lookupClass()).a(51457858978219L) ^ 55273325647510L;
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
        int length = "\u0003\u0005j\u009diÇdß\b\u001ac\u0084]ú£×\u009b\b\u0004,\u0010\u0081\u00816Q|".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("\u0003\u0005j\u009diÇdß\b\u001ac\u0084]ú£×\u009b\b\u0004,\u0010\u0081\u00816Q|".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                SWITCH = new ii(strArr[0], 0);
                TOGGLE = new ii(strArr[2], 1);
                EATING = new ii(strArr[1], 2);
                b = r();
                f = EnumEntriesKt.enumEntries(b);
                return;
            }
            cCharAt = "\u0003\u0005j\u009diÇdß\b\u001ac\u0084]ú£×\u009b\b\u0004,\u0010\u0081\u00816Q|".charAt(i3);
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
