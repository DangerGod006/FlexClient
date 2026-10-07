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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_j.class */
public final class _j {
    public static final _j Entity;
    public static final _j ScoreBoard;
    public static final _j PlayerList;
    private static final _j[] k;
    private static final EnumEntries C;

    private _j(String str, int i) {
    }

    public static _j[] values() {
        return (_j[]) k.clone();
    }

    public static _j valueOf(String value) {
        return (_j) Enum.valueOf(_j.class, value);
    }

    @NotNull
    public static EnumEntries S() {
        return C;
    }

    private static final _j[] y() {
        return new _j[]{Entity, ScoreBoard, PlayerList};
    }

    static {
        long jA = yz.a(4366845909566078131L, -3433268952717824730L, MethodHandles.lookup().lookupClass()).a(167485264598026L) ^ 62848569188072L;
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
        int length = "Ø\u0084\u0088ü\u001d.X<ú\u0091\u0093j÷\u0092^\u0012\u0010Ý$ê\u0099î;\t±Pà¢Ù\u001c£òR\b\" -ãÅ\u008bÍ,".length();
        char cCharAt = 16;
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("Ø\u0084\u0088ü\u001d.X<ú\u0091\u0093j÷\u0092^\u0012\u0010Ý$ê\u0099î;\t±Pà¢Ù\u001c£òR\b\" -ãÅ\u008bÍ,".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                Entity = new _j(strArr[2], 0);
                ScoreBoard = new _j(strArr[0], 1);
                PlayerList = new _j(strArr[1], 2);
                k = y();
                C = EnumEntriesKt.enumEntries(k);
                return;
            }
            cCharAt = "Ø\u0084\u0088ü\u001d.X<ú\u0091\u0093j÷\u0092^\u0012\u0010Ý$ê\u0099î;\t±Pà¢Ù\u001c£òR\b\" -ãÅ\u008bÍ,".charAt(i3);
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
