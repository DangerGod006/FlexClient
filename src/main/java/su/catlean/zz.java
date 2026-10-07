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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/zz.class */
public final class zz {
    public static final zz ALWAYS;
    public static final zz CONDITIONS;
    public static final zz OFF;
    private static final zz[] g;
    private static final EnumEntries w;

    private zz(String str, int i) {
    }

    public static zz[] values() {
        return (zz[]) g.clone();
    }

    public static zz valueOf(String value) {
        return (zz) Enum.valueOf(zz.class, value);
    }

    @NotNull
    public static EnumEntries T() {
        return w;
    }

    private static final zz[] E() {
        return new zz[]{ALWAYS, CONDITIONS, OFF};
    }

    static {
        long jA = yz.a(7986536159333297206L, 1974778559131046629L, MethodHandles.lookup().lookupClass()).a(202763486358446L) ^ 33866839558604L;
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
        int length = "ô7C\"ÿ\u0089õ3ñÏ8Xw\u009dôj\b©\u0090Ó\u0098\u0018Ò7\u0005\b\u001fw³\u0081\u001e¿ÖQ".length();
        char cCharAt = 16;
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("ô7C\"ÿ\u0089õ3ñÏ8Xw\u009dôj\b©\u0090Ó\u0098\u0018Ò7\u0005\b\u001fw³\u0081\u001e¿ÖQ".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                ALWAYS = new zz(strArr[1], 0);
                CONDITIONS = new zz(strArr[0], 1);
                OFF = new zz(strArr[2], 2);
                g = E();
                w = EnumEntriesKt.enumEntries(g);
                return;
            }
            cCharAt = "ô7C\"ÿ\u0089õ3ñÏ8Xw\u009dôj\b©\u0090Ó\u0098\u0018Ò7\u0005\b\u001fw³\u0081\u001e¿ÖQ".charAt(i3);
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
