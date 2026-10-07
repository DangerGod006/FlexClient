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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ni.class */
public final class ni {
    public static final ni NCP;
    public static final ni DEFAULT;
    public static final ni ANTI;
    private static final ni[] i;
    private static final EnumEntries h;
    private static int[] C;

    private ni(String str, int i2) {
    }

    public static ni[] values() {
        return (ni[]) i.clone();
    }

    public static ni valueOf(String value) {
        return (ni) Enum.valueOf(ni.class, value);
    }

    @NotNull
    public static EnumEntries x() {
        return h;
    }

    private static final ni[] Z() {
        return new ni[]{NCP, DEFAULT, ANTI};
    }

    static {
        long jA = yz.a(5928394995408356025L, -7046884351538614701L, MethodHandles.lookup().lookupClass()).a(164389713824525L) ^ 2561057358066L;
        if ((int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-311577910381226874L, jA) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[3], -341943776904115443L, jA) /* invoke-custom */;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((jA << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[3];
        int i3 = 0;
        int length = "\u008dgW\u0000!`\u0088\t\b]\u0001q|é\u009ar;\b]«%\u0017¿Ò\u0014J".length();
        char cCharAt = '\b';
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            int i6 = i3;
            i3++;
            strArr[i6] = a(cipher.doFinal("\u008dgW\u0000!`\u0088\t\b]\u0001q|é\u009ar;\b]«%\u0017¿Ò\u0014J".substring(i5, i5 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i7 = i5 + cCharAt;
            i4 = i7;
            if (i7 >= length) {
                NCP = new ni(strArr[2], 0);
                DEFAULT = new ni(strArr[0], 1);
                ANTI = new ni(strArr[1], 2);
                i = Z();
                h = EnumEntriesKt.enumEntries(i);
                return;
            }
            cCharAt = "\u008dgW\u0000!`\u0088\t\b]\u0001q|é\u009ar;\b]«%\u0017¿Ò\u0014J".charAt(i4);
        }
    }

    public static void w(int[] iArr) {
        C = iArr;
    }

    public static int[] e() {
        return C;
    }

    private static String a(byte[] bArr) {
        int i2 = 0;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i3 = 0;
        while (i3 < length) {
            int i4 = 255 & bArr[i3];
            if (i4 < 192) {
                int i5 = i2;
                i2++;
                cArr[i5] = (char) i4;
            } else if (i4 < 224) {
                i3++;
                int i6 = i2;
                i2++;
                cArr[i6] = (char) (((char) (((char) (i4 & 31)) << 6)) | ((char) (bArr[i3] & 63)));
            } else if (i3 < length - 2) {
                int i7 = i3 + 1;
                char c = (char) (((char) (((char) (i4 & 15)) << '\f')) | (((char) (bArr[i7] & 63)) << 6));
                i3 = i7 + 1;
                int i8 = i2;
                i2++;
                cArr[i8] = (char) (c | ((char) (bArr[i3] & 63)));
            }
            i3++;
        }
        return new String(cArr, 0, i2);
    }
}
