package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/at.class */
public final class at {
    public static final at ON;
    public static final at ANONYMOUSLY;
    public static final at OFF;
    private static final at[] h;
    private static final EnumEntries I;
    private static int L;

    private at(String str, int i) {
    }

    public static at[] values() {
        return (at[]) h.clone();
    }

    public static at valueOf(String value) {
        return (at) Enum.valueOf(at.class, value);
    }

    @NotNull
    public static EnumEntries L() {
        return I;
    }

    private static final at[] n() {
        return new at[]{ON, ANONYMOUSLY, OFF};
    }

    static {
        long jA = yz.a(3930256523858628277L, 2816251230300084115L, MethodHandles.lookup().lookupClass()).a(134990515210451L) ^ 112564528121032L;
        if ((int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7598100791886340478L, jA) /* invoke-custom */ == 0) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(AbstractJsonLexerKt.UNICODE_ESC, 7615668240544081768L, jA) /* invoke-custom */;
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
        int length = "\u001ch0K\u0097ù¨&\u0010\u008b\u0017A\"L\u009b\u008b¸ËIæ\u000bk\u0005\u0086\u009d\bÔTõdF\u0098\bæ".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("\u001ch0K\u0097ù¨&\u0010\u008b\u0017A\"L\u009b\u008b¸ËIæ\u000bk\u0005\u0086\u009d\bÔTõdF\u0098\bæ".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                ON = new at(strArr[2], 0);
                ANONYMOUSLY = new at(strArr[1], 1);
                OFF = new at(strArr[0], 2);
                h = n();
                I = EnumEntriesKt.enumEntries(h);
                return;
            }
            cCharAt = "\u001ch0K\u0097ù¨&\u0010\u008b\u0017A\"L\u009b\u008b¸ËIæ\u000bk\u0005\u0086\u009d\bÔTõdF\u0098\bæ".charAt(i3);
        }
    }

    public static void V(int i) {
        L = i;
    }

    public static int Z() {
        return L;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int B() {
        return Z() == 0 ? 111 : 0;
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
