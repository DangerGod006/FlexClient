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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/x3.class */
public final class x3 {
    public static final x3 BEFORE_RANDOM;
    public static final x3 AFTER_RANDOM;
    private static final x3[] Y;
    private static final EnumEntries g;

    private x3(String str, int i) {
    }

    public static x3[] values() {
        return (x3[]) Y.clone();
    }

    public static x3 valueOf(String value) {
        return (x3) Enum.valueOf(x3.class, value);
    }

    @NotNull
    public static EnumEntries g() {
        return g;
    }

    private static final x3[] W() {
        return new x3[]{BEFORE_RANDOM, AFTER_RANDOM};
    }

    static {
        long jA = yz.a(-5847621020693462334L, 3292292918537209915L, MethodHandles.lookup().lookupClass()).a(222727691915551L) ^ 98597104751194L;
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
        int length = "QÅ\u0004µ×Ö?PÌ_Ï\fÝ\u008fyÔ\u0010\u0092Ùj\u009d ëÚÚ\u001c©É\u0004s\u001dðÅ".length();
        char cCharAt = 16;
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("QÅ\u0004µ×Ö?PÌ_Ï\fÝ\u008fyÔ\u0010\u0092Ùj\u009d ëÚÚ\u001c©É\u0004s\u001dðÅ".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                BEFORE_RANDOM = new x3(strArr[1], 0);
                AFTER_RANDOM = new x3(strArr[0], 1);
                Y = W();
                g = EnumEntriesKt.enumEntries(Y);
                return;
            }
            cCharAt = "QÅ\u0004µ×Ö?PÌ_Ï\fÝ\u008fyÔ\u0010\u0092Ùj\u009d ëÚÚ\u001c©É\u0004s\u001dðÅ".charAt(i3);
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
