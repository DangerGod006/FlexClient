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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/wm.class */
final class wm {
    public static final wm VANILLA;
    public static final wm PEARL;
    public static final wm STEP;
    private static final wm[] C;
    private static final EnumEntries v;

    private wm(String str, int i) {
    }

    public static wm[] values() {
        return (wm[]) C.clone();
    }

    public static wm valueOf(String value) {
        return (wm) Enum.valueOf(wm.class, value);
    }

    @NotNull
    public static EnumEntries d() {
        return v;
    }

    private static final wm[] j() {
        return new wm[]{VANILLA, PEARL, STEP};
    }

    static {
        long jA = yz.a(-5870575641896950029L, -6967735387127980367L, MethodHandles.lookup().lookupClass()).a(104951707657849L) ^ 1350887681358L;
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
        int length = "\u0004æ\u009dÒP+Çn\bÅvw3Az\u0097è\b3êäUW\u0097Äþ".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("\u0004æ\u009dÒP+Çn\bÅvw3Az\u0097è\b3êäUW\u0097Äþ".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                VANILLA = new wm(strArr[1], 0);
                PEARL = new wm(strArr[2], 1);
                STEP = new wm(strArr[0], 2);
                C = j();
                v = EnumEntriesKt.enumEntries(C);
                return;
            }
            cCharAt = "\u0004æ\u009dÒP+Çn\bÅvw3Az\u0097è\b3êäUW\u0097Äþ".charAt(i3);
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
