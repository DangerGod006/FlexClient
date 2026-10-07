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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/y.class */
public final class y {
    public static final y VANILLA;
    public static final y SEQUENTIAL;
    private static final y[] F;
    private static final EnumEntries y;

    private y(String str, int i) {
    }

    public static y[] values() {
        return (y[]) F.clone();
    }

    public static y valueOf(String value) {
        return (y) Enum.valueOf(y.class, value);
    }

    @NotNull
    public static EnumEntries B() {
        return y;
    }

    private static final y[] g() {
        return new y[]{VANILLA, SEQUENTIAL};
    }

    static {
        long jA = yz.a(-4515308598718357109L, -5802883472422080234L, MethodHandles.lookup().lookupClass()).a(51890864406582L) ^ 5812095987572L;
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
        int length = "î\u009b^f\b\u0001o´\u0010¦\u0080y\u0001\u001eÏR`õÑÈa\u009f\u009de\u00ad".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("î\u009b^f\b\u0001o´\u0010¦\u0080y\u0001\u001eÏR`õÑÈa\u009f\u009de\u00ad".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                VANILLA = new y(strArr[0], 0);
                SEQUENTIAL = new y(strArr[1], 1);
                F = g();
                y = EnumEntriesKt.enumEntries(F);
                return;
            }
            cCharAt = "î\u009b^f\b\u0001o´\u0010¦\u0080y\u0001\u001eÏR`õÑÈa\u009f\u009de\u00ad".charAt(i3);
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
