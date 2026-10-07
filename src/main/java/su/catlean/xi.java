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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/xi.class */
public final class xi {
    public static final xi ALWAYS;
    public static final xi AIR_REBREAK;
    public static final xi REBREAK;
    public static final xi OFF;
    private static final xi[] N;
    private static final EnumEntries f;

    private xi(String str, int i) {
    }

    public static xi[] values() {
        return (xi[]) N.clone();
    }

    public static xi valueOf(String value) {
        return (xi) Enum.valueOf(xi.class, value);
    }

    @NotNull
    public static EnumEntries F() {
        return f;
    }

    private static final xi[] D() {
        return new xi[]{ALWAYS, AIR_REBREAK, REBREAK, OFF};
    }

    static {
        int i;
        long jA = yz.a(1948764539025470230L, -7942601080177276727L, MethodHandles.lookup().lookupClass()).a(112864324952125L) ^ 19480043615521L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((jA << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[4];
        int i3 = 0;
        String str = "\u0090u\u009fÉ(¡\u0088\u008a\u0010\u0086Ð Ù\u0091,^\u000e\u008eÐ¤\u001eÇ>Hµ";
        int length = "\u0090u\u009fÉ(¡\u0088\u008a\u0010\u0086Ð Ù\u0091,^\u000e\u008eÐ¤\u001eÇ>Hµ".length();
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
                            ALWAYS = new xi(strArr[0], 0);
                            AIR_REBREAK = new xi(strArr[1], 1);
                            REBREAK = new xi(strArr[3], 2);
                            OFF = new xi(strArr[2], 3);
                            N = D();
                            f = EnumEntriesKt.enumEntries(N);
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
                        str = "ø³¥ÕÜ²ç\u008a\b6\u0096½\u0098`{ªÿ";
                        length = "ø³¥ÕÜ²ç\u008a\b6\u0096½\u0098`{ªÿ".length();
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
