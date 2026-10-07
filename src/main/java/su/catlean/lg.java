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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/lg.class */
public final class lg {
    public static final lg OLD;
    public static final lg NEW;
    private static final lg[] s;
    private static final EnumEntries v;

    private lg(String str, int i) {
    }

    public static lg[] values() {
        return (lg[]) s.clone();
    }

    public static lg valueOf(String value) {
        return (lg) Enum.valueOf(lg.class, value);
    }

    @NotNull
    public static EnumEntries e() {
        return v;
    }

    private static final lg[] O() {
        return new lg[]{OLD, NEW};
    }

    static {
        long jA = yz.a(8816050544330769838L, 6284989965513449200L, MethodHandles.lookup().lookupClass()).a(55141259467508L) ^ 31168504968992L;
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
        int length = "Z\u0091\u0014\u001e¤\u0019\u0090k\bKGa\u0005syq\u00ad".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("Z\u0091\u0014\u001e¤\u0019\u0090k\bKGa\u0005syq\u00ad".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                OLD = new lg(strArr[0], 0);
                NEW = new lg(strArr[1], 1);
                s = O();
                v = EnumEntriesKt.enumEntries(s);
                return;
            }
            cCharAt = "Z\u0091\u0014\u001e¤\u0019\u0090k\bKGa\u0005syq\u00ad".charAt(i3);
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
