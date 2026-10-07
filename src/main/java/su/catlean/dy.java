package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/dy.class */
public final class dy {

    @NotNull
    public static final dy u;
    public static final int A;
    public static final int m;
    public static final int w;
    public static final int i;
    public static final int v;
    public static final int G = 0;

    private dy() {
    }

    static {
        long jA = yz.a(6115731909346166342L, -2224935160261448626L, MethodHandles.lookup().lookupClass()).a(191397439557427L) ^ 31136701203871L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((jA << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        long[] jArr = new long[5];
        int i3 = 0;
        String str = "&\u0003¤SKÁ\u0014ªYókÌ¢mþ\u0083U\u009c6\u0090\u009cÎÇ~";
        int length = "&\u0003¤SKÁ\u0014ªYókÌ¢mþ\u0083U\u009c6\u0090\u009cÎÇ~".length();
        int i4 = 0;
        while (true) {
            int i5 = i4;
            i4 += 8;
            byte[] bytes = str.substring(i5, i4).getBytes("ISO-8859-1");
            long[] jArr2 = jArr;
            int i6 = i3;
            i3++;
            long j = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
            byte b = -1;
            while (true) {
                byte b2 = b;
                long j2 = j;
                int i7 = i6;
                byte[] bArrDoFinal = cipher.doFinal(new byte[]{(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2});
                long j3 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                switch (i7) {
                    case 0:
                        jArr2[b2] = j3;
                        if (i4 >= length) {
                            i = (int) jArr[0];
                            v = (int) jArr[4];
                            m = (int) jArr[2];
                            w = (int) jArr[1];
                            A = (int) jArr[3];
                            u = new dy();
                            return;
                        }
                        break;
                        break;
                    default:
                        jArr2[b2] = j3;
                        if (i4 >= length) {
                            str = "xk»\u00ad\fà\u008f\u0010\u0097·o(×g»x";
                            length = "xk»\u00ad\fà\u008f\u0010\u0097·o(×g»x".length();
                            i4 = 0;
                        }
                        break;
                }
                int i8 = i4;
                i4 += 8;
                byte[] bytes2 = str.substring(i8, i4).getBytes("ISO-8859-1");
                jArr2 = jArr;
                i6 = i3;
                i3++;
                j = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                b = 0;
            }
        }
    }
}
