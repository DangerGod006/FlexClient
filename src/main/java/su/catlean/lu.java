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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/lu.class */
public final class lu {
    public static final lu FREE;
    public static final lu FOCUS;
    private static final lu[] I;
    private static final EnumEntries w;
    private static String M;

    private lu(String str, int i) {
    }

    public static lu[] values() {
        return (lu[]) I.clone();
    }

    public static lu valueOf(String value) {
        return (lu) Enum.valueOf(lu.class, value);
    }

    @NotNull
    public static EnumEntries m() {
        return w;
    }

    private static final lu[] M() {
        return new lu[]{FREE, FOCUS};
    }

    static {
        long jA = yz.a(-1612781149014954849L, 385752184262550171L, MethodHandles.lookup().lookupClass()).a(99517531690846L) ^ 36776646882695L;
        if ((String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5582225300420765852L, jA) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("NuMShc", 5599759381023009038L, jA) /* invoke-custom */;
        }
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
        int length = "vB\u0084Ï\u0095¬ñõ\b\u009b\u008e¿¿V¿\u0016ú".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("vB\u0084Ï\u0095¬ñõ\b\u009b\u008e¿¿V¿\u0016ú".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                FREE = new lu(strArr[1], 0);
                FOCUS = new lu(strArr[0], 1);
                I = M();
                w = EnumEntriesKt.enumEntries(I);
                return;
            }
            cCharAt = "vB\u0084Ï\u0095¬ñõ\b\u009b\u008e¿¿V¿\u0016ú".charAt(i3);
        }
    }

    public static void h(String str) {
        M = str;
    }

    public static String b() {
        return M;
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
