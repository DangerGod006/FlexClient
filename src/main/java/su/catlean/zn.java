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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/zn.class */
public final class zn {
    public static final zn Cancel;
    public static final zn Custom;
    public static final zn OldGrim;
    public static final zn GrimNew;
    private static final zn[] d;
    private static final EnumEntries w;
    private static boolean b;

    private zn(String str, int i) {
    }

    public static zn[] values() {
        return (zn[]) d.clone();
    }

    public static zn valueOf(String value) {
        return (zn) Enum.valueOf(zn.class, value);
    }

    @NotNull
    public static EnumEntries L() {
        return w;
    }

    private static final zn[] d() {
        return new zn[]{Cancel, Custom, OldGrim, GrimNew};
    }

    static {
        int i;
        long jA = yz.a(1652038190971609697L, -2252690783727045464L, MethodHandles.lookup().lookupClass()).a(121684452093189L) ^ 74546236387324L;
        if (!(boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7926869590436354611L, jA) /* invoke-custom */) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, -8009707464507758986L, jA) /* invoke-custom */;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((jA << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[4];
        int i3 = 0;
        String str = "\u0099L®~\u0081W~v\bÁ\u00adá\u0094XÄ{ã";
        int length = "\u0099L®~\u0081W~v\bÁ\u00adá\u0094XÄ{ã".length();
        char cCharAt = '\b';
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 >= length) {
                            Cancel = new zn(strArr[2], 0);
                            Custom = new zn(strArr[3], 1);
                            OldGrim = new zn(strArr[1], 2);
                            GrimNew = new zn(strArr[0], 3);
                            d = d();
                            w = EnumEntriesKt.enumEntries(d);
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i8 = i3;
                        i3++;
                        strArr[i8] = strIntern;
                        int i9 = i5 + cCharAt;
                        i4 = i9;
                        if (i9 < length) {
                        }
                        str = "\u0000\u0013Åù¬QÎL\b[\u0019pEñ\u0016x¸";
                        length = "\u0000\u0013Åù¬QÎL\b[\u0019pEñ\u0016x¸".length();
                        cCharAt = '\b';
                        i = -1;
                        break;
                        break;
                }
                i5 = i + 1;
                strSubstring = str.substring(i5, i5 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i4);
        }
    }

    public static void h(boolean z) {
        b = z;
    }

    public static boolean O() {
        return b;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean w() {
        return !O();
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
