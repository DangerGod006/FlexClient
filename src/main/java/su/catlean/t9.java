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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/t9.class */
public final class t9 {
    public static final t9 NO_REACTION;
    public static final t9 ATTACK;
    public static final t9 ACTION_X;
    private static final t9[] L;
    private static final EnumEntries N;

    private t9(String str, int i) {
    }

    public static t9[] values() {
        return (t9[]) L.clone();
    }

    public static t9 valueOf(String value) {
        return (t9) Enum.valueOf(t9.class, value);
    }

    @NotNull
    public static EnumEntries L() {
        return N;
    }

    private static final t9[] Q() {
        return new t9[]{NO_REACTION, ATTACK, ACTION_X};
    }

    static {
        long jA = yz.a(784951996779157343L, -6836794891654330358L, MethodHandles.lookup().lookupClass()).a(157521311330632L) ^ 45178765485455L;
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
        int length = "ïkÓ.}`ªÔ\u001f\u0018DÙVcIç\býû4âf÷åj\u0010\u009c\u0006Kl\u00110\u001fø§ç¨xh\u001dÏø".length();
        char cCharAt = 16;
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("ïkÓ.}`ªÔ\u001f\u0018DÙVcIç\býû4âf÷åj\u0010\u009c\u0006Kl\u00110\u001fø§ç¨xh\u001dÏø".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                NO_REACTION = new t9(strArr[0], 0);
                ATTACK = new t9(strArr[1], 1);
                ACTION_X = new t9(strArr[2], 2);
                L = Q();
                N = EnumEntriesKt.enumEntries(L);
                return;
            }
            cCharAt = "ïkÓ.}`ªÔ\u001f\u0018DÙVcIç\býû4âf÷åj\u0010\u009c\u0006Kl\u00110\u001fø§ç¨xh\u001dÏø".charAt(i3);
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
