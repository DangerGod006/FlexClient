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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/yu.class */
public final class yu {
    public static final yu None;
    public static final yu Full;
    public static final yu Durability;
    private static final yu[] L;
    private static final EnumEntries f;

    private yu(String str, int i) {
    }

    public static yu[] values() {
        return (yu[]) L.clone();
    }

    public static yu valueOf(String value) {
        return (yu) Enum.valueOf(yu.class, value);
    }

    @NotNull
    public static EnumEntries F() {
        return f;
    }

    private static final yu[] N() {
        return new yu[]{None, Full, Durability};
    }

    static {
        long jA = yz.a(1024607904779056836L, -2216895185901628600L, MethodHandles.lookup().lookupClass()).a(124431479226509L) ^ 39997542215167L;
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
        int length = "M£WÛ\u0082öb\u008e\b\u00adqÊðþ¨\u001c³\u0010\u0007\u0010\u0016»°KEx\u0083V£\u0005\rº\u0085ö".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("M£WÛ\u0082öb\u008e\b\u00adqÊðþ¨\u001c³\u0010\u0007\u0010\u0016»°KEx\u0083V£\u0005\rº\u0085ö".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                None = new yu(strArr[0], 0);
                Full = new yu(strArr[1], 1);
                Durability = new yu(strArr[2], 2);
                L = N();
                f = EnumEntriesKt.enumEntries(L);
                return;
            }
            cCharAt = "M£WÛ\u0082öb\u008e\b\u00adqÊðþ¨\u001c³\u0010\u0007\u0010\u0016»°KEx\u0083V£\u0005\rº\u0085ö".charAt(i3);
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
