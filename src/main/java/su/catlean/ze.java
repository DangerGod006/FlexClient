package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ze.class */
public final class ze {
    private final int J;
    private final int U;
    private final int w;
    private final int Q;
    private final char f;

    @NotNull
    private final fj I;
    private static final long a = yz.a(-810995229064868910L, 6853255934013737892L, MethodHandles.lookup().lookupClass()).a(279284565300984L);
    private static final String b;

    public ze(int u, int v, int width, int height, char value, long a2, @NotNull fj owner) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(owner, b);
        this.J = u;
        this.U = v;
        this.w = width;
        this.Q = height;
        this.f = value;
        this.I = owner;
    }

    public final int x() {
        return this.J;
    }

    public final int T() {
        return this.U;
    }

    public final int w() {
        return this.w;
    }

    public final int r() {
        return this.Q;
    }

    public final char z() {
        return this.f;
    }

    @NotNull
    public final fj X() {
        return this.I;
    }

    static {
        long j = a ^ 86084784111428L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        b = a(cipher.doFinal("1çÝÛ\u0091¾µ«".getBytes("ISO-8859-1"))).intern();
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
