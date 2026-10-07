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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/wa.class */
public final class wa {
    public static final wa AUTO;
    public static final wa ALL;
    private static final wa[] t;
    private static final EnumEntries u;
    private static boolean F;

    private wa(String str, int i) {
    }

    public static wa[] values() {
        return (wa[]) t.clone();
    }

    public static wa valueOf(String value) {
        return (wa) Enum.valueOf(wa.class, value);
    }

    @NotNull
    public static EnumEntries r() {
        return u;
    }

    private static final wa[] f() {
        return new wa[]{AUTO, ALL};
    }

    static {
        long jA = yz.a(8297554724617641741L, -6004046721809987967L, MethodHandles.lookup().lookupClass()).a(111407080355946L) ^ 124618480722733L;
        if (!(boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6921408823236039489L, jA) /* invoke-custom */) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, -6953071281635062214L, jA) /* invoke-custom */;
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
        int length = "9\u0017\u001f6ñ\u0001\u009d\u0087\bÚ«rÀä\u0081mm".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("9\u0017\u001f6ñ\u0001\u009d\u0087\bÚ«rÀä\u0081mm".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                AUTO = new wa(strArr[1], 0);
                ALL = new wa(strArr[0], 1);
                t = f();
                u = EnumEntriesKt.enumEntries(t);
                return;
            }
            cCharAt = "9\u0017\u001f6ñ\u0001\u009d\u0087\bÚ«rÀä\u0081mm".charAt(i3);
        }
    }

    public static void d(boolean z) {
        F = z;
    }

    public static boolean W() {
        return F;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean R() {
        return !W();
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
