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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/yi.class */
public final class yi {
    public static final yi Silent;
    public static final yi Normal;
    public static final yi Alternative;
    private static final /* synthetic */ yi[] i;
    private static final /* synthetic */ EnumEntries E;
    private static String[] U;

    private yi(String str, int i2) {
    }

    public static yi[] values() {
        return (yi[]) i.clone();
    }

    public static yi valueOf(String value) {
        return (yi) Enum.valueOf(yi.class, value);
    }

    @NotNull
    public static EnumEntries c() {
        return E;
    }

    private static final /* synthetic */ yi[] t() {
        return new yi[]{Silent, Normal, Alternative};
    }

    static {
        long jA = yz.a(-5544823922492988137L, 8749429005879151083L, MethodHandles.lookup().lookupClass()).a(236928401814027L) ^ 97990127468841L;
        if ((String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6084933917888515904L, jA) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[3], 6093379788549924188L, jA) /* invoke-custom */;
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
        int length = "7.H\u0094À sì&\u008d7Ì8\u0016úõ\bø\u0007Ê\fäö\u0007;\bã->$\u008f\u001aeN".length();
        char cCharAt = 16;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            int i6 = i3;
            i3++;
            strArr[i6] = a(cipher.doFinal("7.H\u0094À sì&\u008d7Ì8\u0016úõ\bø\u0007Ê\fäö\u0007;\bã->$\u008f\u001aeN".substring(i5, i5 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i7 = i5 + cCharAt;
            i4 = i7;
            if (i7 >= length) {
                Silent = new yi(strArr[2], 0);
                Normal = new yi(strArr[1], 1);
                Alternative = new yi(strArr[0], 2);
                i = t();
                E = EnumEntriesKt.enumEntries(i);
                return;
            }
            cCharAt = "7.H\u0094À sì&\u008d7Ì8\u0016úõ\bø\u0007Ê\fäö\u0007;\bã->$\u008f\u001aeN".charAt(i4);
        }
    }

    public static void C(String[] strArr) {
        U = strArr;
    }

    public static String[] m() {
        return U;
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
