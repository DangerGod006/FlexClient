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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gr.class */
public final class gr {
    public static final gr Config;
    public static final gr Window;
    private static final /* synthetic */ gr[] a;
    private static final /* synthetic */ EnumEntries S;
    private static _g[] P;

    private gr(String str, int i) {
    }

    public static gr[] values() {
        return (gr[]) a.clone();
    }

    public static gr valueOf(String value) {
        return (gr) Enum.valueOf(gr.class, value);
    }

    @NotNull
    public static EnumEntries c() {
        return S;
    }

    private static final /* synthetic */ gr[] U() {
        return new gr[]{Config, Window};
    }

    static {
        long jA = yz.a(4400548242696601110L, 4905836105992513256L, MethodHandles.lookup().lookupClass()).a(9513679863243L) ^ 109808189237779L;
        if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3867560214186802123L, jA) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[5], 3849935101487100232L, jA) /* invoke-custom */;
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
        int length = "Zdt)%òâ5\bù\u0096ÿ\u0004D\u0092î\u008c".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("Zdt)%òâ5\bù\u0096ÿ\u0004D\u0092î\u008c".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                Config = new gr(strArr[0], 0);
                Window = new gr(strArr[1], 1);
                a = U();
                S = EnumEntriesKt.enumEntries(a);
                return;
            }
            cCharAt = "Zdt)%òâ5\bù\u0096ÿ\u0004D\u0092î\u008c".charAt(i3);
        }
    }

    public static void t(_g[] _gVarArr) {
        P = _gVarArr;
    }

    public static _g[] B() {
        return P;
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
