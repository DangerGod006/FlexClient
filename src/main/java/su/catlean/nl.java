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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/nl.class */
public final class nl {
    public static final nl OFF;
    public static final nl VULCAN;
    public static final nl DEFAULT;
    private static final nl[] k;
    private static final EnumEntries E;

    private nl(String str, int i) {
    }

    public static nl[] values() {
        return (nl[]) k.clone();
    }

    public static nl valueOf(String value) {
        return (nl) Enum.valueOf(nl.class, value);
    }

    @NotNull
    public static EnumEntries b() {
        return E;
    }

    private static final nl[] F() {
        return new nl[]{OFF, VULCAN, DEFAULT};
    }

    static {
        long jA = yz.a(-3762964432659866167L, 3582390213947192588L, MethodHandles.lookup().lookupClass()).a(122756228468641L) ^ 118749831822358L;
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
        int length = "ã\u008a8\u000fG\u0015¨z\b¶\u0003z(©ò\u0095í\bp'¸&[-Êp".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("ã\u008a8\u000fG\u0015¨z\b¶\u0003z(©ò\u0095í\bp'¸&[-Êp".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                OFF = new nl(strArr[0], 0);
                VULCAN = new nl(strArr[1], 1);
                DEFAULT = new nl(strArr[2], 2);
                k = F();
                E = EnumEntriesKt.enumEntries(k);
                return;
            }
            cCharAt = "ã\u008a8\u000fG\u0015¨z\b¶\u0003z(©ò\u0095í\bp'¸&[-Êp".charAt(i3);
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
