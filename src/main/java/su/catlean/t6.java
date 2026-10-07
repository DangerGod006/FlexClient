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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/t6.class */
final class t6 {
    public static final t6 SEMI;
    public static final t6 FULL;
    private static final t6[] c;
    private static final EnumEntries N;

    private t6(String str, int i) {
    }

    public static t6[] values() {
        return (t6[]) c.clone();
    }

    public static t6 valueOf(String value) {
        return (t6) Enum.valueOf(t6.class, value);
    }

    @NotNull
    public static EnumEntries U() {
        return N;
    }

    private static final t6[] V() {
        return new t6[]{SEMI, FULL};
    }

    static {
        long jA = yz.a(7751736438329789926L, 6149879536846226146L, MethodHandles.lookup().lookupClass()).a(104047696576825L) ^ 114440225973164L;
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
        int length = "äÒçõÕ\u001bM\u0010\b¸\u001c÷\u001a\"v\u0093D".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("äÒçõÕ\u001bM\u0010\b¸\u001c÷\u001a\"v\u0093D".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                SEMI = new t6(strArr[1], 0);
                FULL = new t6(strArr[0], 1);
                c = V();
                N = EnumEntriesKt.enumEntries(c);
                return;
            }
            cCharAt = "äÒçõÕ\u001bM\u0010\b¸\u001c÷\u001a\"v\u0093D".charAt(i3);
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
                char c2 = (char) (((char) (((char) (i3 & 15)) << '\f')) | (((char) (bArr[i6] & 63)) << 6));
                i2 = i6 + 1;
                int i7 = i;
                i++;
                cArr[i7] = (char) (c2 | ((char) (bArr[i2] & 63)));
            }
            i2++;
        }
        return new String(cArr, 0, i);
    }
}
