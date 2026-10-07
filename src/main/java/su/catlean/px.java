package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/px.class */
public final class px {
    public static final px CLIENT;
    public static final px SERVER;
    public static final px PREDICT;
    private static final px[] l;
    private static final EnumEntries X;
    private static int b;

    private px(String str, int i) {
    }

    public static px[] values() {
        return (px[]) l.clone();
    }

    public static px valueOf(String value) {
        return (px) Enum.valueOf(px.class, value);
    }

    @NotNull
    public static EnumEntries K() {
        return X;
    }

    private static final px[] d() {
        return new px[]{CLIENT, SERVER, PREDICT};
    }

    static {
        long jA = yz.a(-215940243364797820L, -2928266778495009530L, MethodHandles.lookup().lookupClass()).a(8704444188403L) ^ 37778945394487L;
        if ((int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1893469200383856058L, jA) /* invoke-custom */ != 0) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(29, 1909622180299921719L, jA) /* invoke-custom */;
        }
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
        int length = "®A×QæÂ\u00ad£\bQ=\fÆQyj£\b\u008f\u0090tá«zÓ\u0005".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("®A×QæÂ\u00ad£\bQ=\fÆQyj£\b\u008f\u0090tá«zÓ\u0005".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                CLIENT = new px(strArr[2], 0);
                SERVER = new px(strArr[0], 1);
                PREDICT = new px(strArr[1], 2);
                l = d();
                X = EnumEntriesKt.enumEntries(l);
                return;
            }
            cCharAt = "®A×QæÂ\u00ad£\bQ=\fÆQyj£\b\u008f\u0090tá«zÓ\u0005".charAt(i3);
        }
    }

    public static void n(int i) {
        b = i;
    }

    public static int g() {
        return b;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int n() {
        return g() == 0 ? 110 : 0;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
