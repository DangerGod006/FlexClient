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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/iw.class */
public final class iw {
    public static final iw Silent;
    public static final iw Normal;
    public static final iw Alternative;
    private static final iw[] Z;
    private static final EnumEntries o;

    private iw(String str, int i) {
    }

    public static iw[] values() {
        return (iw[]) Z.clone();
    }

    public static iw valueOf(String value) {
        return (iw) Enum.valueOf(iw.class, value);
    }

    @NotNull
    public static EnumEntries a() {
        return o;
    }

    private static final iw[] e() {
        return new iw[]{Silent, Normal, Alternative};
    }

    static {
        long jA = yz.a(2889817315561399854L, 4571349189029241490L, MethodHandles.lookup().lookupClass()).a(44951483552002L) ^ 14713335897588L;
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
        int length = " @ýd\u008eÆuâ\b£lÓñ!@Øä\u0010\\Ú\u001d¸\u0087³ö\u0099\u000eO\u0014¢\u0006/\u001f§".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal(" @ýd\u008eÆuâ\b£lÓñ!@Øä\u0010\\Ú\u001d¸\u0087³ö\u0099\u000eO\u0014¢\u0006/\u001f§".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                Silent = new iw(strArr[1], 0);
                Normal = new iw(strArr[0], 1);
                Alternative = new iw(strArr[2], 2);
                Z = e();
                o = EnumEntriesKt.enumEntries(Z);
                return;
            }
            cCharAt = " @ýd\u008eÆuâ\b£lÓñ!@Øä\u0010\\Ú\u001d¸\u0087³ö\u0099\u000eO\u0014¢\u0006/\u001f§".charAt(i3);
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
