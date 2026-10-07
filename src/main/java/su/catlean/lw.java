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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/lw.class */
final class lw {
    public static final lw GLOBAL;
    public static final lw LOCAL;
    public static final lw WHISPERS;
    private static final lw[] N;
    private static final EnumEntries p;

    private lw(String str, int i) {
    }

    public static lw[] values() {
        return (lw[]) N.clone();
    }

    public static lw valueOf(String value) {
        return (lw) Enum.valueOf(lw.class, value);
    }

    @NotNull
    public static EnumEntries P() {
        return p;
    }

    private static final lw[] G() {
        return new lw[]{GLOBAL, LOCAL, WHISPERS};
    }

    static {
        long jA = yz.a(4897489042939343776L, 2941431525160700064L, MethodHandles.lookup().lookupClass()).a(97907818341269L) ^ 7930283577223L;
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
        int length = "\u009dJ8\u0085¨ob7\b\u001bb³I\u0004\u0005\u0088ô\u0010\u001f(ðà\u0003m\u0010\u001d\u009c\u001dgª³\n\u008c?".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("\u009dJ8\u0085¨ob7\b\u001bb³I\u0004\u0005\u0088ô\u0010\u001f(ðà\u0003m\u0010\u001d\u009c\u001dgª³\n\u008c?".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                GLOBAL = new lw(strArr[1], 0);
                LOCAL = new lw(strArr[0], 1);
                WHISPERS = new lw(strArr[2], 2);
                N = G();
                p = EnumEntriesKt.enumEntries(N);
                return;
            }
            cCharAt = "\u009dJ8\u0085¨ob7\b\u001bb³I\u0004\u0005\u0088ô\u0010\u001f(ðà\u0003m\u0010\u001d\u009c\u001dgª³\n\u008c?".charAt(i3);
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
