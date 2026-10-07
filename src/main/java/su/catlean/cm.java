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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/cm.class */
public final class cm {
    public static final cm OFF;
    public static final cm CHAT;
    public static final cm NOTIFICATION;
    public static final cm BOTH;
    private static final cm[] i;
    private static final EnumEntries D;

    private cm(String str, int i2) {
    }

    public static cm[] values() {
        return (cm[]) i.clone();
    }

    public static cm valueOf(String value) {
        return (cm) Enum.valueOf(cm.class, value);
    }

    @NotNull
    public static EnumEntries U() {
        return D;
    }

    private static final cm[] v() {
        return new cm[]{OFF, CHAT, NOTIFICATION, BOTH};
    }

    static {
        int i2;
        long jA = yz.a(-779966600652859937L, 6966998855783515954L, MethodHandles.lookup().lookupClass()).a(105036832911912L) ^ 4490124221476L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((jA << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[4];
        int i4 = 0;
        String str = "CÇTÑiü\u0081È\bé½¸Óhx6c";
        int length = "CÇTÑiü\u0081È\bé½¸Óhx6c".length();
        char cCharAt = '\b';
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i7 = i4;
                        i4++;
                        strArr[i7] = strIntern;
                        int i8 = i6 + cCharAt;
                        i2 = i8;
                        if (i8 >= length) {
                            OFF = new cm(strArr[2], 0);
                            CHAT = new cm(strArr[0], 1);
                            NOTIFICATION = new cm(strArr[3], 2);
                            BOTH = new cm(strArr[1], 3);
                            i = v();
                            D = EnumEntriesKt.enumEntries(i);
                            return;
                        }
                        cCharAt = str.charAt(i2);
                        break;
                        break;
                    default:
                        int i9 = i4;
                        i4++;
                        strArr[i9] = strIntern;
                        int i10 = i6 + cCharAt;
                        i5 = i10;
                        if (i10 < length) {
                        }
                        str = "%_Ê 0îòn\u0010\u009bÙ§\u000eYÛ\"¹Sêg\t\u001b)~\u0086";
                        length = "%_Ê 0îòn\u0010\u009bÙ§\u000eYÛ\"¹Sêg\t\u001b)~\u0086".length();
                        cCharAt = '\b';
                        i2 = -1;
                        break;
                        break;
                }
                i6 = i2 + 1;
                strSubstring = str.substring(i6, i6 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i5);
        }
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
