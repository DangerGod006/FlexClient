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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/s8.class */
public final class s8 {
    public static final s8 FILL;
    public static final s8 OUTLINE;
    public static final s8 BOTH;
    private static final /* synthetic */ s8[] Q;
    private static final /* synthetic */ EnumEntries n;
    private static boolean E;

    private s8(String str, int i) {
    }

    public static s8[] values() {
        return (s8[]) Q.clone();
    }

    public static s8 valueOf(String value) {
        return (s8) Enum.valueOf(s8.class, value);
    }

    @NotNull
    public static EnumEntries r() {
        return n;
    }

    private static final /* synthetic */ s8[] Q() {
        return new s8[]{FILL, OUTLINE, BOTH};
    }

    static {
        long jA = yz.a(2650816473532229466L, -1143701505941476031L, MethodHandles.lookup().lookupClass()).a(76676192592645L) ^ 74210606349921L;
        if ((boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2511885001855230493L, jA) /* invoke-custom */) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, 2592231594729314989L, jA) /* invoke-custom */;
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
        int length = "\u0089\u00186\u0011awÖÀ\b$\u009bRæÎøn\u0088\bYÔP#r\u009c\u009eB".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("\u0089\u00186\u0011awÖÀ\b$\u009bRæÎøn\u0088\bYÔP#r\u009c\u009eB".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                FILL = new s8(strArr[1], 0);
                OUTLINE = new s8(strArr[2], 1);
                BOTH = new s8(strArr[0], 2);
                Q = Q();
                n = EnumEntriesKt.enumEntries(Q);
                return;
            }
            cCharAt = "\u0089\u00186\u0011awÖÀ\b$\u009bRæÎøn\u0088\bYÔP#r\u009c\u009eB".charAt(i3);
        }
    }

    public static void S(boolean z) {
        E = z;
    }

    public static boolean j() {
        return E;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean C() {
        return !j();
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
