package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1743;
import net.minecraft.class_1799;
import net.minecraft.class_1821;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/bq.class */
public final class bq implements n5 {
    public static final bq O;
    private static final long a = yz.a(1431061559134902667L, 4073669698222776954L, MethodHandles.lookup().lookupClass()).a(157623333199920L);
    private static final String b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    @Override // su.catlean.n5
    public final boolean b(class_1799 it) {
        long j = a ^ 97954125228597L;
        long j2 = j ^ 49957463800879L;
        long j3 = j ^ 97262075997865L;
        Object objN = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5589518386797259818L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(it, b);
        try {
            try {
                try {
                    try {
                        objN = xa.N(it, j3);
                        if (objN != 0) {
                            return objN;
                        }
                        if (objN == 0) {
                            try {
                                objN = xa.K(it, j2);
                                if (objN != 0) {
                                    return objN;
                                }
                                try {
                                    if (objN == 0) {
                                        try {
                                            boolean z = it.method_7909() instanceof class_1743;
                                            if (objN != 0) {
                                                return z;
                                            }
                                            if (!z) {
                                                boolean z2 = it.method_7909() instanceof class_1821;
                                                if (objN != 0) {
                                                    return z2;
                                                }
                                                if (!z2) {
                                                    return false;
                                                }
                                            }
                                        } catch (NumberFormatException unused) {
                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, -5559055620104927976L, j) /* invoke-custom */;
                                        }
                                    }
                                } catch (NumberFormatException unused2) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, -5559055620104927976L, j) /* invoke-custom */;
                                }
                            } catch (NumberFormatException unused3) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, -5559055620104927976L, j) /* invoke-custom */;
                            }
                        }
                        return true;
                    } catch (NumberFormatException unused4) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, -5559055620104927976L, j) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused5) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, -5559055620104927976L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused6) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, -5559055620104927976L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused7) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, -5559055620104927976L, j) /* invoke-custom */;
        }
    }

    static {
        long j = a ^ 34232849440871L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        b = a(cipher.doFinal("\"|eï÷-\u0004\u0011".getBytes("ISO-8859-1"))).intern();
        O = new bq();
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
