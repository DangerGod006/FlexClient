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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/am.class */
public final class am {
    public static final am OFF;
    public static final am TIMER;
    public static final am BLOCK;
    private static final am[] M;
    private static final EnumEntries w;

    private am(String str, int i) {
    }

    public static am[] values() {
        return (am[]) M.clone();
    }

    public static am valueOf(String value) {
        return (am) Enum.valueOf(am.class, value);
    }

    @NotNull
    public static EnumEntries z() {
        return w;
    }

    private static final am[] N() {
        return new am[]{OFF, TIMER, BLOCK};
    }

    static {
        long jA = yz.a(-2991934829130037773L, 93750557635976987L, MethodHandles.lookup().lookupClass()).a(126685996171477L) ^ 11472375539299L;
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
        int length = "D \u001d\u0018n\u0006ë\u0085\bU\u0092úv~»\u0001z\bØÀ[\u0087©`ë\u008a".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("D \u001d\u0018n\u0006ë\u0085\bU\u0092úv~»\u0001z\bØÀ[\u0087©`ë\u008a".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                OFF = new am(strArr[1], 0);
                TIMER = new am(strArr[2], 1);
                BLOCK = new am(strArr[0], 2);
                M = N();
                w = EnumEntriesKt.enumEntries(M);
                return;
            }
            cCharAt = "D \u001d\u0018n\u0006ë\u0085\bU\u0092úv~»\u0001z\bØÀ[\u0087©`ë\u008a".charAt(i3);
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
