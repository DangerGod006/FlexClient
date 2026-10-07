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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/st.class */
public final class st {
    public static final st REPEAT;
    public static final st OFF;
    public static final st NONE;
    private static final st[] K;
    private static final EnumEntries v;
    private static _g[] F;

    private st(String str, int i) {
    }

    public static st[] values() {
        return (st[]) K.clone();
    }

    public static st valueOf(String value) {
        return (st) Enum.valueOf(st.class, value);
    }

    @NotNull
    public static EnumEntries d() {
        return v;
    }

    private static final st[] M() {
        return new st[]{REPEAT, OFF, NONE};
    }

    static {
        long jA = yz.a(-2656821758572010543L, -2785104965501049143L, MethodHandles.lookup().lookupClass()).a(159000456412414L) ^ 93797480174662L;
        if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4429362287985085544L, jA) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[3], -4414796607424525843L, jA) /* invoke-custom */;
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
        int length = "(\\P\u0018S\u0099zÍ\b\u008c®QkZ9)\u0096\bRJÎÂÀo\u0083P".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("(\\P\u0018S\u0099zÍ\b\u008c®QkZ9)\u0096\bRJÎÂÀo\u0083P".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                REPEAT = new st(strArr[0], 0);
                OFF = new st(strArr[2], 1);
                NONE = new st(strArr[1], 2);
                K = M();
                v = EnumEntriesKt.enumEntries(K);
                return;
            }
            cCharAt = "(\\P\u0018S\u0099zÍ\b\u008c®QkZ9)\u0096\bRJÎÂÀo\u0083P".charAt(i3);
        }
    }

    public static void i(_g[] _gVarArr) {
        F = _gVarArr;
    }

    public static _g[] L() {
        return F;
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
