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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/sa.class */
public final class sa {
    public static final sa SINGLE;
    public static final sa RGB;
    public static final sa DOUBLE;
    public static final sa DOUBLE_UP;
    public static final sa TV;
    private static final sa[] Q;
    private static final EnumEntries r;

    private sa(String str, int i) {
    }

    public static sa[] values() {
        return (sa[]) Q.clone();
    }

    public static sa valueOf(String value) {
        return (sa) Enum.valueOf(sa.class, value);
    }

    @NotNull
    public static EnumEntries h() {
        return r;
    }

    private static final sa[] A() {
        return new sa[]{SINGLE, RGB, DOUBLE, DOUBLE_UP, TV};
    }

    static {
        int i;
        long jA = yz.a(4430562677826445128L, 131152190543300301L, MethodHandles.lookup().lookupClass()).a(103681074798373L) ^ 84674039231332L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((jA << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[5];
        int i3 = 0;
        String str = "\u0012IF\u001bïwv§\bøäÐ\u001cÂbu°\b3Ró\u001a\u0096ÆÝ\u0095";
        int length = "\u0012IF\u001bïwv§\bøäÐ\u001cÂbu°\b3Ró\u001a\u0096ÆÝ\u0095".length();
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
                            SINGLE = new sa(strArr[2], 0);
                            RGB = new sa(strArr[1], 1);
                            DOUBLE = new sa(strArr[0], 2);
                            DOUBLE_UP = new sa(strArr[3], 3);
                            TV = new sa(strArr[4], 4);
                            Q = A();
                            r = EnumEntriesKt.enumEntries(Q);
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
                        str = "Ô` \u0003°Ô³o^ÕF0În$\u008f\b¦\u008bHã\u0005(\u0087&";
                        length = "Ô` \u0003°Ô³o^ÕF0În$\u008f\b¦\u008bHã\u0005(\u0087&".length();
                        cCharAt = 16;
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
