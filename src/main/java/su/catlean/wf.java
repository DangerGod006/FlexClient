package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4588;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/wf.class */
public final class wf implements class_4588 {

    @NotNull
    private final g7 f;

    @NotNull
    private final Color L;
    private static final long a = yz.a(9142289781137877925L, -3782846691724570767L, MethodHandles.lookup().lookupClass()).a(236401166593230L);
    private static final String b;

    public wf(long a2, byte a3, @NotNull g7 polygon, @NotNull Color c) {
        long j = ((a2 << 8) | ((((long) a3) << 56) >>> 56)) ^ a;
        Intrinsics.checkNotNullParameter(polygon, b);
        Intrinsics.checkNotNullParameter(c, "c");
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7465575463228414461L, j) /* invoke-custom */;
        this.f = polygon;
        try {
            this.L = c;
            if (obj != null) {
                obj = new _g[4];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -7432136772876725530L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -7487530744403329826L, j) /* invoke-custom */;
        }
    }

    @NotNull
    public final g7 Y() {
        return this.f;
    }

    @NotNull
    public final Color R() {
        return this.L;
    }

    @NotNull
    public class_4588 method_22912(float x, float y, float z) {
        this.f.G(x, (a ^ 83149520982153L) ^ 76462108569525L, y, z);
        return this;
    }

    @NotNull
    public wf y(int red, int green, int blue, int alpha) {
        return this;
    }

    @NotNull
    public class_4588 method_39415(int argb) {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [net.minecraft.class_4588] */
    @NotNull
    public class_4588 method_22913(float u, float v) {
        long j = a ^ 63212719088600L;
        long j2 = j ^ 135993317054986L;
        long j3 = j ^ 46871861247793L;
        wf wfVar = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8651414265236555368L, j) /* invoke-custom */;
        this.f.j(u, j3, v).n(this.L, j2);
        try {
            wfVar = this;
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8702807727793464919L, j) /* invoke-custom */ != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[2], 8651234641101730764L, j) /* invoke-custom */;
            }
            return wfVar;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(wfVar, 8682376792940223669L, j) /* invoke-custom */;
        }
    }

    @NotNull
    public wf F(int u, int v) {
        return this;
    }

    @NotNull
    public wf H(int u, int v) {
        return this;
    }

    @NotNull
    public wf e(float x, float y, float z) {
        return this;
    }

    @NotNull
    public wf S(float width) {
        return this;
    }

    public class_4588 method_1336(int i, int j, int k, int l) {
        return y(i, j, k, l);
    }

    public class_4588 method_60796(int i, int j) {
        return F(i, j);
    }

    public class_4588 method_22921(int i, int j) {
        return H(i, j);
    }

    public class_4588 method_22914(float f, float g, float h) {
        return e(f, g, h);
    }

    public class_4588 method_75298(float f) {
        return S(f);
    }

    static {
        long j = a ^ 13691079689324L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        b = a(cipher.doFinal("¿\u0081Õ\u0019ð\u00184F".getBytes("ISO-8859-1"))).intern();
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
