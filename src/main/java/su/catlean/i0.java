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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/i0.class */
public final class i0 {
    public static final i0 MODULES;
    public static final i0 WIDGETS;
    private static final /* synthetic */ i0[] V;
    private static final /* synthetic */ EnumEntries G;
    private static boolean c;

    private i0(String str, int i) {
    }

    public static i0[] values() {
        return (i0[]) V.clone();
    }

    public static i0 valueOf(String value) {
        return (i0) Enum.valueOf(i0.class, value);
    }

    @NotNull
    public static EnumEntries Y() {
        return G;
    }

    private static final /* synthetic */ i0[] k() {
        return new i0[]{MODULES, WIDGETS};
    }

    static {
        long jA = yz.a(8602056568126115225L, -1025180388145894059L, MethodHandles.lookup().lookupClass()).a(95021656136352L) ^ 25676505378713L;
        if ((boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(628181602496581948L, jA) /* invoke-custom */) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, 677928901484549956L, jA) /* invoke-custom */;
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
        int length = "Y\u0006(O|\u0004\u0097*\bÈÜ~\u0004¹0ß°".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("Y\u0006(O|\u0004\u0097*\bÈÜ~\u0004¹0ß°".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                MODULES = new i0(strArr[0], 0);
                WIDGETS = new i0(strArr[1], 1);
                V = k();
                G = EnumEntriesKt.enumEntries(V);
                return;
            }
            cCharAt = "Y\u0006(O|\u0004\u0097*\bÈÜ~\u0004¹0ß°".charAt(i3);
        }
    }

    public static void H(boolean z) {
        c = z;
    }

    public static boolean w() {
        return c;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean V() {
        return !w();
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
