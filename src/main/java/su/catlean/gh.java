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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gh.class */
final class gh {
    public static final gh NONE;
    public static final gh WHITE_LIST;
    public static final gh BLACK_LIST;
    private static final gh[] g;
    private static final EnumEntries J;

    private gh(String str, int i) {
    }

    public static gh[] values() {
        return (gh[]) g.clone();
    }

    public static gh valueOf(String value) {
        return (gh) Enum.valueOf(gh.class, value);
    }

    @NotNull
    public static EnumEntries f() {
        return J;
    }

    private static final gh[] M() {
        return new gh[]{NONE, WHITE_LIST, BLACK_LIST};
    }

    static {
        long jA = yz.a(-2156196764533259870L, 1043553272528788290L, MethodHandles.lookup().lookupClass()).a(40606834420834L) ^ 123396149231246L;
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
        int length = "Î\u0092 Ôäá£¦ç/\u008f+e® µ\u0010µÓ\u00ad\n¶íÄ\u009d\u009f·ç\"\u0084>Ü\u0001\bF©¢K\u008e\u0097ÿÕ".length();
        char cCharAt = 16;
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("Î\u0092 Ôäá£¦ç/\u008f+e® µ\u0010µÓ\u00ad\n¶íÄ\u009d\u009f·ç\"\u0084>Ü\u0001\bF©¢K\u008e\u0097ÿÕ".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                NONE = new gh(strArr[2], 0);
                WHITE_LIST = new gh(strArr[1], 1);
                BLACK_LIST = new gh(strArr[0], 2);
                g = M();
                J = EnumEntriesKt.enumEntries(g);
                return;
            }
            cCharAt = "Î\u0092 Ôäá£¦ç/\u008f+e® µ\u0010µÓ\u00ad\n¶íÄ\u009d\u009f·ç\"\u0084>Ü\u0001\bF©¢K\u008e\u0097ÿÕ".charAt(i3);
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
