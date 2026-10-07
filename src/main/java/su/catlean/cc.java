package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/cc.class */
public final class cc {
    private final float Q;
    private final float x;
    private final float D;
    private final float Y;
    private final float u;
    private final float Z;
    private final int l;
    private final int n;
    private final int O;
    private final int v;
    private final int K;
    private final int L;
    private final float U;

    @NotNull
    private final Matrix3x2f b;
    private static final long a = yz.a(-1323630252890563535L, -4327020380130851021L, MethodHandles.lookup().lookupClass()).a(155679556902218L);
    private static final String c;

    public cc(float atX, float atY, float r, float g, float b, long a2, float a3, int w, int h, int ow, int oh, int u, int v, float z, @NotNull Matrix3x2f matrix) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(matrix, c);
        this.Q = atX;
        this.x = atY;
        this.D = r;
        this.Y = g;
        this.u = b;
        this.Z = a3;
        this.l = w;
        this.n = h;
        this.O = ow;
        this.v = oh;
        this.K = u;
        this.L = v;
        this.U = z;
        this.b = matrix;
    }

    public final float J() {
        return this.Q;
    }

    public final float X() {
        return this.x;
    }

    public final float p() {
        return this.D;
    }

    public final float L() {
        return this.Y;
    }

    public final float u() {
        return this.u;
    }

    public final float s() {
        return this.Z;
    }

    public final int q() {
        return this.l;
    }

    public final int i() {
        return this.n;
    }

    public final int K() {
        return this.O;
    }

    public final int U() {
        return this.v;
    }

    public final int G() {
        return this.K;
    }

    public final int g() {
        return this.L;
    }

    public final float Z() {
        return this.U;
    }

    @NotNull
    public final Matrix3x2f o() {
        return this.b;
    }

    static {
        long j = a ^ 178368473284L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        c = a(cipher.doFinal("\u008cÍ¶Ô\u009cSb\u007f".getBytes("ISO-8859-1"))).intern();
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
                char c2 = (char) (((char) (((char) (i3 & 15)) << '\f')) | (((char) (bArr[i6] & 63)) << 6));
                i2 = i6 + 1;
                int i7 = i;
                i++;
                cArr[i7] = (char) (c2 | ((char) (bArr[i2] & 63)));
            }
            i2++;
        }
        return new String(cArr, 0, i);
    }
}
