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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/yg.class */
final class yg {
    public static final yg OFF;
    public static final yg NOTIFICATION;
    public static final yg CHAT;
    public static final yg BOTH;
    private static final yg[] t;
    private static final EnumEntries a;

    private yg(String str, int i) {
    }

    public static yg[] values() {
        return (yg[]) t.clone();
    }

    public static yg valueOf(String value) {
        return (yg) Enum.valueOf(yg.class, value);
    }

    @NotNull
    public static EnumEntries i() {
        return a;
    }

    private static final yg[] e() {
        return new yg[]{OFF, NOTIFICATION, CHAT, BOTH};
    }

    static {
        int i;
        long jA = yz.a(-5178786605598295598L, 435062875030569706L, MethodHandles.lookup().lookupClass()).a(100931386559824L) ^ 110662822859335L;
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
        String str = "ðå¶íHÕ@\u001aý=5}ê\u0084\u0094w\b¡O\u0019g\u0099Ä\u000e}";
        int length = "ðå¶íHÕ@\u001aý=5}ê\u0084\u0094w\b¡O\u0019g\u0099Ä\u000e}".length();
        char cCharAt = 16;
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
                            OFF = new yg(strArr[2], 0);
                            NOTIFICATION = new yg(strArr[0], 1);
                            CHAT = new yg(strArr[1], 2);
                            BOTH = new yg(strArr[3], 3);
                            t = e();
                            a = EnumEntriesKt.enumEntries(t);
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
                        str = "l_\u009e\u0093Ò\u0089SÒ\b6f\u0087§\u0015C?Y";
                        length = "l_\u009e\u0093Ò\u0089SÒ\b6f\u0087§\u0015C?Y".length();
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
