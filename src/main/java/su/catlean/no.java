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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/no.class */
public final class no {
    public static final no DEFAULT;
    public static final no AROUND_PLAYERS;
    private static final no[] s;
    private static final EnumEntries i;

    private no(String str, int i2) {
    }

    public static no[] values() {
        return (no[]) s.clone();
    }

    public static no valueOf(String value) {
        return (no) Enum.valueOf(no.class, value);
    }

    @NotNull
    public static EnumEntries E() {
        return i;
    }

    private static final no[] v() {
        return new no[]{DEFAULT, AROUND_PLAYERS};
    }

    static {
        long jA = yz.a(-4035063224913844569L, -9084480572557258245L, MethodHandles.lookup().lookupClass()).a(226728512952515L) ^ 140167765084133L;
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
        int length = "<øáëïñ-û\u0010z\u00968±}\u0019\u0011\b·!C¤½§U\u0086".length();
        char cCharAt = '\b';
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            int i6 = i3;
            i3++;
            strArr[i6] = a(cipher.doFinal("<øáëïñ-û\u0010z\u00968±}\u0019\u0011\b·!C¤½§U\u0086".substring(i5, i5 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i7 = i5 + cCharAt;
            i4 = i7;
            if (i7 >= length) {
                DEFAULT = new no(strArr[0], 0);
                AROUND_PLAYERS = new no(strArr[1], 1);
                s = v();
                i = EnumEntriesKt.enumEntries(s);
                return;
            }
            cCharAt = "<øáëïñ-û\u0010z\u00968±}\u0019\u0011\b·!C¤½§U\u0086".charAt(i4);
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
