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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/lk.class */
public final class lk {
    public static final lk OFF;
    public static final lk ALWAYS;
    public static final lk ONLY_SAFE;
    private static final lk[] i;
    private static final EnumEntries o;

    private lk(String str, int i2) {
    }

    public static lk[] values() {
        return (lk[]) i.clone();
    }

    public static lk valueOf(String value) {
        return (lk) Enum.valueOf(lk.class, value);
    }

    @NotNull
    public static EnumEntries R() {
        return o;
    }

    private static final lk[] F() {
        return new lk[]{OFF, ALWAYS, ONLY_SAFE};
    }

    static {
        long jA = yz.a(8221992601869048853L, -7586399405623357540L, MethodHandles.lookup().lookupClass()).a(233820741312798L) ^ 64121615448685L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((jA << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[3];
        int i3 = 0;
        int length = "ãm½0\u0006ÿkÊ\b\u009a¡O\u009f¶\u0012&>\u0010·\u000féÁ2 v¶\u0010KD\u008a\u0088\u008f\u0016Ã".length();
        char cCharAt = '\b';
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            int i6 = i3;
            i3++;
            strArr[i6] = a(cipher.doFinal("ãm½0\u0006ÿkÊ\b\u009a¡O\u009f¶\u0012&>\u0010·\u000féÁ2 v¶\u0010KD\u008a\u0088\u008f\u0016Ã".substring(i5, i5 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i7 = i5 + cCharAt;
            i4 = i7;
            if (i7 >= length) {
                OFF = new lk(strArr[1], 0);
                ALWAYS = new lk(strArr[0], 1);
                ONLY_SAFE = new lk(strArr[2], 2);
                i = F();
                o = EnumEntriesKt.enumEntries(i);
                return;
            }
            cCharAt = "ãm½0\u0006ÿkÊ\b\u009a¡O\u009f¶\u0012&>\u0010·\u000féÁ2 v¶\u0010KD\u008a\u0088\u008f\u0016Ã".charAt(i4);
        }
    }

    private static String a(byte[] bArr) {
        int i2 = 0;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i3 = 0;
        while (i3 < length) {
            int i4 = 255 & bArr[i3];
            if (i4 < 192) {
                int i5 = i2;
                i2++;
                cArr[i5] = (char) i4;
            } else if (i4 < 224) {
                i3++;
                int i6 = i2;
                i2++;
                cArr[i6] = (char) (((char) (((char) (i4 & 31)) << 6)) | ((char) (bArr[i3] & 63)));
            } else if (i3 < length - 2) {
                int i7 = i3 + 1;
                char c = (char) (((char) (((char) (i4 & 15)) << '\f')) | (((char) (bArr[i7] & 63)) << 6));
                i3 = i7 + 1;
                int i8 = i2;
                i2++;
                cArr[i8] = (char) (c | ((char) (bArr[i3] & 63)));
            }
            i3++;
        }
        return new String(cArr, 0, i2);
    }
}
