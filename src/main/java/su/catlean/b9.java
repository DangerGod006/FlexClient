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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/b9.class */
public final class b9 {
    public static final b9 ONLY_SELF;
    public static final b9 FRIENDS;
    public static final b9 ALL;
    private static final b9[] y;
    private static final EnumEntries h;
    private static _g[] N;

    private b9(String str, int i) {
    }

    public static b9[] values() {
        return (b9[]) y.clone();
    }

    public static b9 valueOf(String value) {
        return (b9) Enum.valueOf(b9.class, value);
    }

    @NotNull
    public static EnumEntries M() {
        return h;
    }

    private static final b9[] E() {
        return new b9[]{ONLY_SELF, FRIENDS, ALL};
    }

    static {
        long jA = yz.a(-8157752009596557228L, -3941876658401929917L, MethodHandles.lookup().lookupClass()).a(16001232321969L) ^ 28657910901278L;
        if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3020441363307275513L, jA) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[2], -2999364704385219229L, jA) /* invoke-custom */;
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
        int length = "9õ¼Ï»øúÑ\u0010aIRù\u0098®X¹2¹x)çíé¥\bCT\u009føùI¡£".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("9õ¼Ï»øúÑ\u0010aIRù\u0098®X¹2¹x)çíé¥\bCT\u009føùI¡£".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                ONLY_SELF = new b9(strArr[1], 0);
                FRIENDS = new b9(strArr[0], 1);
                ALL = new b9(strArr[2], 2);
                y = E();
                h = EnumEntriesKt.enumEntries(y);
                return;
            }
            cCharAt = "9õ¼Ï»øúÑ\u0010aIRù\u0098®X¹2¹x)çíé¥\bCT\u009føùI¡£".charAt(i3);
        }
    }

    public static void t(_g[] _gVarArr) {
        N = _gVarArr;
    }

    public static _g[] u() {
        return N;
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
