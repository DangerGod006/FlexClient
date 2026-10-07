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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/zh.class */
public final class zh {
    public static final zh NCP;
    public static final zh TIMER;
    private static final zh[] J;
    private static final EnumEntries q;
    private static String X;

    private zh(String str, int i) {
    }

    public static zh[] values() {
        return (zh[]) J.clone();
    }

    public static zh valueOf(String value) {
        return (zh) Enum.valueOf(zh.class, value);
    }

    @NotNull
    public static EnumEntries f() {
        return q;
    }

    private static final zh[] e() {
        return new zh[]{NCP, TIMER};
    }

    static {
        long jA = yz.a(7469839121367524561L, -2754140706543760477L, MethodHandles.lookup().lookupClass()).a(117601208026736L) ^ 102508448877066L;
        if ((String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1841852709491005505L, jA) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("o6MVqc", -1856267370259393072L, jA) /* invoke-custom */;
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
        int length = "û\u0096\u0019°é#[\u000b\bã\u0015\u0093\u0080\u008c\b\bÌ".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("û\u0096\u0019°é#[\u000b\bã\u0015\u0093\u0080\u008c\b\bÌ".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                NCP = new zh(strArr[0], 0);
                TIMER = new zh(strArr[1], 1);
                J = e();
                q = EnumEntriesKt.enumEntries(J);
                return;
            }
            cCharAt = "û\u0096\u0019°é#[\u000b\bã\u0015\u0093\u0080\u008c\b\bÌ".charAt(i3);
        }
    }

    public static void I(String str) {
        X = str;
    }

    public static String l() {
        return X;
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
