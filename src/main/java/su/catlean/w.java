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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/w.class */
public final class w {
    public static final w BOX;
    public static final w OUTLINE;
    public static final w FRAME;
    public static final w SHADER;
    public static final w OFF;
    private static final /* synthetic */ w[] u;
    private static final /* synthetic */ EnumEntries B;

    private w(String str, int i) {
    }

    public static w[] values() {
        return (w[]) u.clone();
    }

    public static w valueOf(String value) {
        return (w) Enum.valueOf(w.class, value);
    }

    @NotNull
    public static EnumEntries v() {
        return B;
    }

    private static final /* synthetic */ w[] K() {
        return new w[]{BOX, OUTLINE, FRAME, SHADER, OFF};
    }

    static {
        int i;
        long jA = yz.a(4243346128314371937L, -2825454912494151937L, MethodHandles.lookup().lookupClass()).a(223405524443575L) ^ 20778147855817L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((jA << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[5];
        int i3 = 0;
        String str = "\u0004Q\u0011ßN¼\u0080^\b7\u0016¼\u0089U`Fa\b\u0000VÓ\u009c¹Â\fú";
        int length = "\u0004Q\u0011ßN¼\u0080^\b7\u0016¼\u0089U`Fa\b\u0000VÓ\u009c¹Â\fú".length();
        char cCharAt = '\b';
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 >= length) {
                            BOX = new w(strArr[4], 0);
                            OUTLINE = new w(strArr[3], 1);
                            FRAME = new w(strArr[0], 2);
                            SHADER = new w(strArr[2], 3);
                            OFF = new w(strArr[1], 4);
                            u = K();
                            B = EnumEntriesKt.enumEntries(u);
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i8 = i3;
                        i3++;
                        strArr[i8] = strIntern;
                        int i9 = i5 + cCharAt;
                        i4 = i9;
                        if (i9 < length) {
                        }
                        str = "·i±óü¸\u0016ù\b\u0000äüÒ'@\u0000ü";
                        length = "·i±óü¸\u0016ù\b\u0000äüÒ'@\u0000ü".length();
                        cCharAt = '\b';
                        i = -1;
                        break;
                        break;
                }
                i5 = i + 1;
                strSubstring = str.substring(i5, i5 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i4);
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
