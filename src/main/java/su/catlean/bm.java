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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/bm.class */
final class bm {
    public static final bm FOV;
    public static final bm DISTANCE;
    private static final bm[] m;
    private static final EnumEntries j;

    private bm(String str, int i) {
    }

    public static bm[] values() {
        return (bm[]) m.clone();
    }

    public static bm valueOf(String value) {
        return (bm) Enum.valueOf(bm.class, value);
    }

    @NotNull
    public static EnumEntries S() {
        return j;
    }

    private static final bm[] M() {
        return new bm[]{FOV, DISTANCE};
    }

    static {
        long jA = yz.a(-9187233981207588441L, -6602505443838160441L, MethodHandles.lookup().lookupClass()).a(155626852801778L) ^ 45491521934426L;
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
        int length = "ÇM@\u0097t\u0087\u0098Æ\u0010\u008b\u0016Ãþü(v³\u0081\u008dß\u00889Svâ".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("ÇM@\u0097t\u0087\u0098Æ\u0010\u008b\u0016Ãþü(v³\u0081\u008dß\u00889Svâ".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                FOV = new bm(strArr[0], 0);
                DISTANCE = new bm(strArr[1], 1);
                m = M();
                j = EnumEntriesKt.enumEntries(m);
                return;
            }
            cCharAt = "ÇM@\u0097t\u0087\u0098Æ\u0010\u008b\u0016Ãþü(v³\u0081\u008dß\u00889Svâ".charAt(i3);
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
