package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_124;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/xk.class */
public final class xk implements Runnable {
    final int U;
    final String a;
    private static final long b = yz.a(-8392838322034085229L, 5239270906462121891L, MethodHandles.lookup().lookupClass()).a(33777481023029L);
    private static final String c;

    public xk(int i, String str) {
        this.U = i;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        Object obj;
        long j = b ^ 20638873672821L;
        long j2 = j ^ 22317440313194L;
        long j3 = j ^ 13766966796122L;
        long j4 = j ^ 134917758121794L;
        (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1132642445350573509L, j) /* invoke-custom */;
        Thread.sleep(this.U);
        try {
            ej ejVar = ej.J;
            class_124 class_124Var = class_124.field_1068;
            ej ejVar2 = ej.J;
            String str = this.a;
            String lowerCase = ej.V(j2, ej.J).name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, c);
            o2.S(ejVar, class_124Var + ej.h(ejVar2, str, lowerCase, j4), false, 2, null, j3);
            obj = ejVar;
        } catch (Exception e) {
            Exception exc = e;
            exc.printStackTrace();
            obj = exc;
        }
        try {
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1149676099602288998L, j) /* invoke-custom */ != null) {
                obj = new String[4];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1090113682730106461L, j) /* invoke-custom */;
            }
        } catch (Exception unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1108262106612241714L, j) /* invoke-custom */;
        }
    }

    static {
        long j = b ^ 104598644299805L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        c = a(cipher.doFinal("\u000b»Á=kTf5{S\u007fáÄô²\u00adxr\u0096\u0017Äô\u008bÝ".getBytes("ISO-8859-1"))).intern();
    }

    private static Exception a(Exception exc) {
        return exc;
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
