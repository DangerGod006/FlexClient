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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/b_.class */
final class b_ {
    public static final b_ DEFAULT;
    public static final b_ V1_17;
    private static final b_[] B;
    private static final EnumEntries f;

    private b_(String str, int i) {
    }

    public static b_[] values() {
        return (b_[]) B.clone();
    }

    public static b_ valueOf(String value) {
        return (b_) Enum.valueOf(b_.class, value);
    }

    @NotNull
    public static EnumEntries h() {
        return f;
    }

    private static final b_[] z() {
        return new b_[]{DEFAULT, V1_17};
    }

    static {
        long jA = yz.a(-1181328539446902369L, -1809443190147566237L, MethodHandles.lookup().lookupClass()).a(100558438428492L) ^ 112561828052049L;
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
        int length = "P\u0085\u0088®\u0095\u008e\u0092d\bÛN\tøAÖ\u008e@".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("P\u0085\u0088®\u0095\u008e\u0092d\bÛN\tøAÖ\u008e@".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                DEFAULT = new b_(strArr[0], 0);
                V1_17 = new b_(strArr[1], 1);
                B = z();
                f = EnumEntriesKt.enumEntries(B);
                return;
            }
            cCharAt = "P\u0085\u0088®\u0095\u008e\u0092d\bÛN\tøAÖ\u008e@".charAt(i3);
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
