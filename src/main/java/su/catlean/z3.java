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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/z3.class */
public final class z3 {
    public static final z3 NONE;
    public static final z3 SILENT;
    public static final z3 FORCE;
    private static final /* synthetic */ z3[] q;
    private static final /* synthetic */ EnumEntries p;
    private static boolean w;

    private z3(String str, int i) {
    }

    public static z3[] values() {
        return (z3[]) q.clone();
    }

    public static z3 valueOf(String value) {
        return (z3) Enum.valueOf(z3.class, value);
    }

    @NotNull
    public static EnumEntries I() {
        return p;
    }

    private static final /* synthetic */ z3[] i() {
        return new z3[]{NONE, SILENT, FORCE};
    }

    static {
        long jA = yz.a(-3675638091934078602L, 3240287982813831777L, MethodHandles.lookup().lookupClass()).a(106176044848639L) ^ 109024674164924L;
        if ((boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4310492425569485963L, jA) /* invoke-custom */) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, 4260729653991290496L, jA) /* invoke-custom */;
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
        int length = "Á\u0010\u0091öÈ \"d\bö7½P\u008f>RU\bk5k7¤yÒ?".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("Á\u0010\u0091öÈ \"d\bö7½P\u008f>RU\bk5k7¤yÒ?".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                NONE = new z3(strArr[0], 0);
                SILENT = new z3(strArr[2], 1);
                FORCE = new z3(strArr[1], 2);
                q = i();
                p = EnumEntriesKt.enumEntries(q);
                return;
            }
            cCharAt = "Á\u0010\u0091öÈ \"d\bö7½P\u008f>RU\bk5k7¤yÒ?".charAt(i3);
        }
    }

    public static void j(boolean z) {
        w = z;
    }

    public static boolean y() {
        return w;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean u() {
        return !y();
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
