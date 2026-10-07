package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/g_.class */
public final /* synthetic */ class g_ {
    public static final int[] U;
    private static int[] S;

    static {
        long jA = yz.a(8812510347309605629L, -8638373890432316000L, MethodHandles.lookup().lookupClass()).a(12842099158326L) ^ 64580000981265L;
        if ((int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(288612428818374819L, jA) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[5], 340905215072903697L, jA) /* invoke-custom */;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((jA << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        long[] jArr = new long[6];
        int i2 = 0;
        String str = "ê]qI¶¿VÔÙ\u000e\u008búÆ\u0097²Ê5Z\u0092%xyíµÜ¶îÚV\u009dØX";
        int length = "ê]qI¶¿VÔÙ\u000e\u008búÆ\u0097²Ê5Z\u0092%xyíµÜ¶îÚV\u009dØX".length();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            i3 += 8;
            byte[] bytes = str.substring(i4, i3).getBytes("ISO-8859-1");
            long[] jArr2 = jArr;
            int i5 = i2;
            i2++;
            long j = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
            byte b = -1;
            while (true) {
                byte b2 = b;
                long j2 = j;
                int i6 = i5;
                byte[] bArrDoFinal = cipher.doFinal(new byte[]{(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2});
                long j3 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                switch (i6) {
                    case 0:
                        jArr2[b2] = j3;
                        if (i3 >= length) {
                            int[] iArr = new int[df.values().length];
                            try {
                                iArr[df.Default.ordinal()] = 1;
                                break;
                            } catch (NoSuchFieldError e) {
                            }
                            try {
                                iArr[df.Bonk.ordinal()] = 2;
                                break;
                            } catch (NoSuchFieldError e2) {
                            }
                            try {
                                iArr[df.Rubber.ordinal()] = 3;
                                break;
                            } catch (NoSuchFieldError e3) {
                            }
                            try {
                                iArr[df.Flip.ordinal()] = 4;
                                break;
                            } catch (NoSuchFieldError e4) {
                            }
                            try {
                                iArr[df.Snap.ordinal()] = 5;
                                break;
                            } catch (NoSuchFieldError e5) {
                            }
                            try {
                                iArr[df.Hook.ordinal()] = (int) jArr[4];
                                break;
                            } catch (NoSuchFieldError e6) {
                            }
                            try {
                                iArr[df.Swipe.ordinal()] = (int) jArr[3];
                                break;
                            } catch (NoSuchFieldError e7) {
                            }
                            try {
                                iArr[df.Tap.ordinal()] = (int) jArr[1];
                                break;
                            } catch (NoSuchFieldError e8) {
                            }
                            try {
                                iArr[df.Inject.ordinal()] = (int) jArr[2];
                                break;
                            } catch (NoSuchFieldError e9) {
                            }
                            try {
                                iArr[df.Slap.ordinal()] = (int) jArr[5];
                                break;
                            } catch (NoSuchFieldError e10) {
                            }
                            try {
                                iArr[df.Akrien.ordinal()] = (int) jArr[0];
                                break;
                            } catch (NoSuchFieldError e11) {
                            }
                            U = iArr;
                            return;
                        }
                        break;
                        break;
                    default:
                        jArr2[b2] = j3;
                        if (i3 >= length) {
                            str = "\u0010\u00833@7ók\u000b\u0017Õö]ZCê\u0004";
                            length = "\u0010\u00833@7ók\u000b\u0017Õö]ZCê\u0004".length();
                            i3 = 0;
                        }
                        break;
                }
                int i7 = i3;
                i3 += 8;
                byte[] bytes2 = str.substring(i7, i3).getBytes("ISO-8859-1");
                jArr2 = jArr;
                i5 = i2;
                i2++;
                j = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                b = 0;
            }
        }
    }

    public static void h(int[] iArr) {
        S = iArr;
    }

    public static int[] M() {
        return S;
    }
}
