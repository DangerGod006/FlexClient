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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/y4.class */
public final class y4 {
    public static final y4 NONE;
    public static final y4 ALL;
    public static final y4 ONLY_CRYSTALS;
    private static final /* synthetic */ y4[] w;
    private static final /* synthetic */ EnumEntries b;
    private static int[] X;

    private y4(String str, int i) {
    }

    public static y4[] values() {
        return (y4[]) w.clone();
    }

    public static y4 valueOf(String value) {
        return (y4) Enum.valueOf(y4.class, value);
    }

    @NotNull
    public static EnumEntries c() {
        return b;
    }

    private static final /* synthetic */ y4[] s() {
        return new y4[]{NONE, ALL, ONLY_CRYSTALS};
    }

    static {
        long jA = yz.a(-6667116833853643612L, -204609502276127754L, MethodHandles.lookup().lookupClass()).a(103971763783115L) ^ 100453390953486L;
        if ((int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1263930476504196349L, jA) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[1], -1166022503943370959L, jA) /* invoke-custom */;
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
        int length = "\u009c\u008f\u0002\u009drä\"ó\bE\u0019\u0093¡&\u0012Wï\u0010\u007f°sú\"]\u0015¤É\u0015ûLDVp\u0003".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("\u009c\u008f\u0002\u009drä\"ó\bE\u0019\u0093¡&\u0012Wï\u0010\u007f°sú\"]\u0015¤É\u0015ûLDVp\u0003".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                NONE = new y4(strArr[1], 0);
                ALL = new y4(strArr[0], 1);
                ONLY_CRYSTALS = new y4(strArr[2], 2);
                w = s();
                b = EnumEntriesKt.enumEntries(w);
                return;
            }
            cCharAt = "\u009c\u008f\u0002\u009drä\"ó\bE\u0019\u0093¡&\u0012Wï\u0010\u007f°sú\"]\u0015¤É\u0015ûLDVp\u0003".charAt(i3);
        }
    }

    public static void O(int[] iArr) {
        X = iArr;
    }

    public static int[] E() {
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
