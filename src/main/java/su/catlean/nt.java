package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/nt.class */
public final class nt {

    @NotNull
    private static final nd r;

    @NotNull
    private static final nd q;

    @NotNull
    private static final nd H;

    @NotNull
    private static final nd F;

    @NotNull
    public static final nd m() {
        return r;
    }

    @NotNull
    public static final nd J() {
        return q;
    }

    @NotNull
    public static final nd d() {
        return H;
    }

    @NotNull
    public static final nd h() {
        return F;
    }

    static {
        int i;
        long jA = (yz.a(-3477903525195447015L, -7720611515454701748L, MethodHandles.lookup().lookupClass()).a(13110237613992L) ^ 69741202846868L) ^ 67820703868462L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (r0 >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((r0 << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[4];
        int i3 = 0;
        String str = "P\"\u008bÃw»z\u007fß\u001a°[¹®{c\bojhdÁÀ\u001cÄ";
        int length = "P\"\u008bÃw»z\u007fß\u001a°[¹®{c\bojhdÁÀ\u001cÄ".length();
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
                            r = new nd(jA, strArr[2], CollectionsKt.arrayListOf(jt.Q(), jt.A(), jt.n()));
                            q = new nd(jA, strArr[0], CollectionsKt.arrayListOf(jt.c(), jt.V()));
                            H = new nd(jA, strArr[1], CollectionsKt.arrayListOf(jt.F(), jt.z()));
                            F = new nd(jA, strArr[3], CollectionsKt.arrayListOf(jt.y(), jt.I(), jt.v(), jt.d()));
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
                        str = "É+\u00198\u0006ÚSC\bâË\ntß\u0089Ke";
                        length = "É+\u00198\u0006ÚSC\bâË\ntß\u0089Ke".length();
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
