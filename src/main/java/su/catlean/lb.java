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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/lb.class */
public final class lb {
    public static final lb LEGIT;
    public static final lb LEGIT_EXTRA;
    public static final lb NORMAL;
    public static final lb HVH;
    private static final /* synthetic */ lb[] N;
    private static final /* synthetic */ EnumEntries n;

    private lb(String str, int i) {
    }

    public static lb[] values() {
        return (lb[]) N.clone();
    }

    public static lb valueOf(String value) {
        return (lb) Enum.valueOf(lb.class, value);
    }

    @NotNull
    public static EnumEntries X() {
        return n;
    }

    private static final /* synthetic */ lb[] j() {
        return new lb[]{LEGIT, LEGIT_EXTRA, NORMAL, HVH};
    }

    static {
        int i;
        long jA = yz.a(-6974713882722719076L, 8221851925633384623L, MethodHandles.lookup().lookupClass()).a(184949068906915L) ^ 102926965418776L;
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
        String str = "Î@\u0094E¬\\p¼\b*·s\u008d?Mú\u009e";
        int length = "Î@\u0094E¬\\p¼\b*·s\u008d?Mú\u009e".length();
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
                            LEGIT = new lb(strArr[1], 0);
                            LEGIT_EXTRA = new lb(strArr[3], 1);
                            NORMAL = new lb(strArr[2], 2);
                            HVH = new lb(strArr[0], 3);
                            N = j();
                            n = EnumEntriesKt.enumEntries(N);
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
                        str = "\u00109WæOÇ\u0000à\u0010] ä$ûX\u009b&ÄH'\u009b\u0000\b0¥";
                        length = "\u00109WæOÇ\u0000à\u0010] ä$ûX\u009b&ÄH'\u009b\u0000\b0¥".length();
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
