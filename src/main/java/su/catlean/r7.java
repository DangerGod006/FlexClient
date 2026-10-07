package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/r7.class */
public final class r7 {
    public static final r7 INVENTORY;
    public static final r7 ALWAYS;
    public static final r7 NOT_IN_INVENTORY;
    public static final r7 OFF;
    private static final r7[] I;
    private static final EnumEntries D;

    private r7(String str, int i) {
    }

    public static r7[] values() {
        return (r7[]) I.clone();
    }

    public static r7 valueOf(String value) {
        return (r7) Enum.valueOf(r7.class, value);
    }

    @NotNull
    public static EnumEntries u() {
        return D;
    }

    private static final r7[] y() {
        return new r7[]{INVENTORY, ALWAYS, NOT_IN_INVENTORY, OFF};
    }

    static {
        int i;
        long jA = yz.a(-6067065945642038472L, -3805465629103244954L, MethodHandles.lookup().lookupClass()).a(45041308095109L) ^ 70064781364105L;
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
        String str = "z¸qõö(¹R\u0010ÎJ û\u0013\u008d\u0089ê,IñXÑ&M^";
        int length = "z¸qõö(¹R\u0010ÎJ û\u0013\u008d\u0089ê,IñXÑ&M^".length();
        char cCharAt = '\b';
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 >= length) {
                            INVENTORY = new r7(strArr[1], 0);
                            ALWAYS = new r7(strArr[2], 1);
                            NOT_IN_INVENTORY = new r7(strArr[3], 2);
                            OFF = new r7(strArr[0], 3);
                            I = y();
                            D = EnumEntriesKt.enumEntries(I);
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
                        str = "f\u000eª\u009f¿²¬@\u0018È=\u0003\u0002\u000bk\u0083÷IÏjD\u0000\u0013a\u009bµôýÉ\u0088P+h";
                        length = "f\u000eª\u009f¿²¬@\u0018È=\u0003\u0002\u000bk\u0083÷IÏjD\u0000\u0013a\u009bµôýÉ\u0088P+h".length();
                        cCharAt = '\b';
                        i = -1;
                        break;
                        break;
                }
                i5 = i + 1;
                strSubstring = str.substring(i5, i5 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i4);
        }
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
