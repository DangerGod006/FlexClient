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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/jp.class */
public final class jp {
    public static final jp VANILLA;
    public static final jp SEQUENTIAL;
    public static final jp GRIM;
    private static final jp[] J;
    private static final EnumEntries O;

    private jp(String str, int i) {
    }

    public static jp[] values() {
        return (jp[]) J.clone();
    }

    public static jp valueOf(String value) {
        return (jp) Enum.valueOf(jp.class, value);
    }

    @NotNull
    public static EnumEntries g() {
        return O;
    }

    private static final jp[] O() {
        return new jp[]{VANILLA, SEQUENTIAL, GRIM};
    }

    static {
        long jA = yz.a(-5851459525380704418L, -623182249837506890L, MethodHandles.lookup().lookupClass()).a(50124946930697L) ^ 57781074914012L;
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
        int length = "¤8Î\u0018^\u001f¿\u0016\u0002é\u0006«È\u009e\u0092Í\bm¬I5Õ¬\u007f\u00ad\bø\u000f\u0011\u0090-\u0007Ò]".length();
        char cCharAt = 16;
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("¤8Î\u0018^\u001f¿\u0016\u0002é\u0006«È\u009e\u0092Í\bm¬I5Õ¬\u007f\u00ad\bø\u000f\u0011\u0090-\u0007Ò]".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                VANILLA = new jp(strArr[2], 0);
                SEQUENTIAL = new jp(strArr[0], 1);
                GRIM = new jp(strArr[1], 2);
                J = O();
                O = EnumEntriesKt.enumEntries(J);
                return;
            }
            cCharAt = "¤8Î\u0018^\u001f¿\u0016\u0002é\u0006«È\u009e\u0092Í\bm¬I5Õ¬\u007f\u00ad\bø\u000f\u0011\u0090-\u0007Ò]".charAt(i3);
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
