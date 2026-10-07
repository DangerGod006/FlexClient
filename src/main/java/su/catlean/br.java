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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/br.class */
public final class br {
    public static final br AUTO;
    public static final br ALL;
    private static final br[] v;
    private static final EnumEntries u;
    private static boolean d;

    private br(String str, int i) {
    }

    public static br[] values() {
        return (br[]) v.clone();
    }

    public static br valueOf(String value) {
        return (br) Enum.valueOf(br.class, value);
    }

    @NotNull
    public static EnumEntries Y() {
        return u;
    }

    private static final br[] q() {
        return new br[]{AUTO, ALL};
    }

    static {
        long jA = yz.a(-5484645126284063236L, -3764033489861790344L, MethodHandles.lookup().lookupClass()).a(120513915867702L) ^ 45899668301298L;
        if ((boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1501174749704465783L, jA) /* invoke-custom */) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, 1451418613578675841L, jA) /* invoke-custom */;
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
        int length = "\u0088¦\u0082\u0003ó\u0002a¶\bJ4î *g\u007fÁ".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("\u0088¦\u0082\u0003ó\u0002a¶\bJ4î *g\u007fÁ".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                AUTO = new br(strArr[0], 0);
                ALL = new br(strArr[1], 1);
                v = q();
                u = EnumEntriesKt.enumEntries(v);
                return;
            }
            cCharAt = "\u0088¦\u0082\u0003ó\u0002a¶\bJ4î *g\u007fÁ".charAt(i3);
        }
    }

    public static void q(boolean z) {
        d = z;
    }

    public static boolean u() {
        return d;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean n() {
        return !u();
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
