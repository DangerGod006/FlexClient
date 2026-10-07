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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/i5.class */
public final class i5 {
    public static final i5 DolphinGrace;
    public static final i5 Vanilla;
    public static final i5 Legit;
    private static final i5[] n;
    private static final EnumEntries I;
    private static int[] w;

    private i5(String str, int i) {
    }

    public static i5[] values() {
        return (i5[]) n.clone();
    }

    public static i5 valueOf(String value) {
        return (i5) Enum.valueOf(i5.class, value);
    }

    @NotNull
    public static EnumEntries o() {
        return I;
    }

    private static final i5[] f() {
        return new i5[]{DolphinGrace, Vanilla, Legit};
    }

    static {
        long jA = yz.a(6216400581323690239L, -3266457304470007553L, MethodHandles.lookup().lookupClass()).a(240451194362858L) ^ 109132107185908L;
        if ((int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2190562635843526471L, jA) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[3], 2258055406001250121L, jA) /* invoke-custom */;
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
        int length = "x\u0011\u0099Ö\u0081Leóö\u0086\u00992\tÈO\u001e\b\u009aÎâèðË0Z\bi\u0015ðÇ\r\u0097\u0016¨".length();
        char cCharAt = 16;
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("x\u0011\u0099Ö\u0081Leóö\u0086\u00992\tÈO\u001e\b\u009aÎâèðË0Z\bi\u0015ðÇ\r\u0097\u0016¨".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                DolphinGrace = new i5(strArr[0], 0);
                Vanilla = new i5(strArr[1], 1);
                Legit = new i5(strArr[2], 2);
                n = f();
                I = EnumEntriesKt.enumEntries(n);
                return;
            }
            cCharAt = "x\u0011\u0099Ö\u0081Leóö\u0086\u00992\tÈO\u001e\b\u009aÎâèðË0Z\bi\u0015ðÇ\r\u0097\u0016¨".charAt(i3);
        }
    }

    public static void o(int[] iArr) {
        w = iArr;
    }

    public static int[] k() {
        return w;
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
