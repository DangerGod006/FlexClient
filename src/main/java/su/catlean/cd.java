package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/cd.class */
public final class cd {

    @NotNull
    private static o_ x;
    private static final long a = yz.a(-7178842063185856478L, -2932489648419997534L, MethodHandles.lookup().lookupClass()).a(92510374512673L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    @NotNull
    public static final o_ C() {
        return x;
    }

    public static final void x(long a2, @NotNull o_ o_Var) {
        Intrinsics.checkNotNullParameter(o_Var, (String) a(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22613, 3494664689699158003L ^ (a ^ a2)) /* invoke-custom */);
        x = o_Var;
    }

    static {
        long j = a ^ 74948333939076L;
        long j2 = j >>> 16;
        int i = (int) (((j ^ 83962185435095L) << 48) >>> 48);
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[2];
        int i3 = 0;
        int length = "\u008eùF\u009bÓñ\u0013_¡\u001c£¶ïë¨¹\u0010ï\u001a\r\u0010\u008c\u008a´Y4â¬4´ Ý\u0011".length();
        char cCharAt = 16;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            int i6 = i3;
            i3++;
            strArr[i6] = a(cipher.doFinal("\u008eùF\u009bÓñ\u0013_¡\u001c£¶ïë¨¹\u0010ï\u001a\r\u0010\u008c\u008a´Y4â¬4´ Ý\u0011".substring(i5, i5 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i7 = i5 + cCharAt;
            i4 = i7;
            if (i7 >= length) {
                break;
            } else {
                cCharAt = "\u008eùF\u009bÓñ\u0013_¡\u001c£¶ïë¨¹\u0010ï\u001a\r\u0010\u008c\u008a´Y4â¬4´ Ý\u0011".charAt(i4);
            }
        }
        b = strArr;
        c = new String[2];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] bArr2 = new byte[8];
        bArr2[0] = (byte) (j >>> 56);
        for (int i8 = 1; i8 < 8; i8++) {
            bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
        }
        cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
        long[] jArr = new long[29];
        int i9 = 0;
        String str = "q\u0013ÃÀ\u008eöUa\u0095½Á\u0006]É\u0004Â^\u001eèåÎ8HðÚ\u0087¶`îî\u009ceûL?H¬à\u0007\u0012\u008d%d\u009e\f\u000e°7Öþ Ãp÷1LH\n\u0094¼\u00968\u0014\u008cHþfw¬\u0001©\u0096´1~ßMÀ§@\rô²E,$Ç}ßº\u0004?[£)\u001d\u008c}\u00ad\u009d\feôÈ\u0001\u008fXæ¯~\u0082\u0094=]0h\u0094\u0092ïìHô¨#A\u000b>ÓH,\u0097>µO9\u0010L*ÖÊ\u0080\u000eá\u009a\u009c\u001a\u00008;\u0086óëÍe\u009eFë¹×kwSw«e1'r¬JyïüûÉèì\u0080§±\u009b°4ø\u0017\u008eRJ/9Y[Eîb[\u00968\u0018LÒljÌu\u001fçÎê\u00ad-gv[¿B";
        int length2 = "q\u0013ÃÀ\u008eöUa\u0095½Á\u0006]É\u0004Â^\u001eèåÎ8HðÚ\u0087¶`îî\u009ceûL?H¬à\u0007\u0012\u008d%d\u009e\f\u000e°7Öþ Ãp÷1LH\n\u0094¼\u00968\u0014\u008cHþfw¬\u0001©\u0096´1~ßMÀ§@\rô²E,$Ç}ßº\u0004?[£)\u001d\u008c}\u00ad\u009d\feôÈ\u0001\u008fXæ¯~\u0082\u0094=]0h\u0094\u0092ïìHô¨#A\u000b>ÓH,\u0097>µO9\u0010L*ÖÊ\u0080\u000eá\u009a\u009c\u001a\u00008;\u0086óëÍe\u009eFë¹×kwSw«e1'r¬JyïüûÉèì\u0080§±\u009b°4ø\u0017\u008eRJ/9Y[Eîb[\u00968\u0018LÒljÌu\u001fçÎê\u00ad-gv[¿B".length();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            i10 += 8;
            byte[] bytes = str.substring(i11, i10).getBytes("ISO-8859-1");
            long[] jArr2 = jArr;
            int i12 = i9;
            i9++;
            long j3 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
            byte b2 = -1;
            while (true) {
                byte b3 = b2;
                long j4 = j3;
                int i13 = i12;
                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j4 >>> 56), (byte) (j4 >>> 48), (byte) (j4 >>> 40), (byte) (j4 >>> 32), (byte) (j4 >>> 24), (byte) (j4 >>> 16), (byte) (j4 >>> 8), (byte) j4});
                long j5 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                switch (i13) {
                    case 0:
                        jArr2[b3] = j5;
                        if (i10 >= length2) {
                            x = new o_((String) a(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12776, 4058473813235731667L ^ j) /* invoke-custom */, new Color((int) jArr[23]), new Color((int) jArr[16]), new Color((int) jArr[15], (int) jArr[6], (int) jArr[6]), new Color((int) jArr[3], (int) jArr[5], (int) jArr[0]), j2, new Color((int) jArr[20], (int) jArr[10], (int) jArr[24]), new Color((int) jArr[28], (int) jArr[13], (int) jArr[13]), new Color((int) jArr[19], (int) jArr[9], (int) jArr[9]), new Color((int) jArr[21], (int) jArr[18], (int) jArr[2]), (char) i, new Color((int) jArr[17], (int) jArr[4], (int) jArr[26], (int) jArr[14]), new Color((int) jArr[22], (int) jArr[27], (int) jArr[12], (int) jArr[11]), new Color((int) jArr[27], (int) jArr[27], (int) jArr[8], (int) jArr[25]), new Color((int) jArr[7], (int) jArr[7], (int) jArr[1], (int) jArr[13]));
                            return;
                        }
                        break;
                        break;
                    default:
                        jArr2[b3] = j5;
                        if (i10 >= length2) {
                            str = "\u00adJÊ&\u0001\u00860¿{H÷´\u0019%&$";
                            length2 = "\u00adJÊ&\u0001\u00860¿{H÷´\u0019%&$".length();
                            i10 = 0;
                        }
                        break;
                }
                int i14 = i10;
                i10 += 8;
                byte[] bytes2 = str.substring(i14, i10).getBytes("ISO-8859-1");
                jArr2 = jArr;
                i12 = i9;
                i9++;
                j3 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                b2 = 0;
            }
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

    private static String a(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 19299;
        if (c[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i2] = a(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/cd", e);
            }
        }
        return c[i2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strA = a(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strA), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strA;
    }

    /*  JADX ERROR: Failed to decode insn: 0x000A: CONST
        jadx.plugins.input.java.utils.JavaClassParseException: Unsupported constant type: METHOD_HANDLE
        	at jadx.plugins.input.java.data.code.decoders.LoadConstDecoder.decode(LoadConstDecoder.java:65)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = 1
            r2 = r10
            int r2 = r2.parameterCount()
            java.lang.invoke.MethodHandle r0 = r0.asCollector(r1, r2)
            r1 = 0
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r11
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r9
            r3[r4] = r5
            java.lang.invoke.MethodHandle r0 = java.lang.invoke.MethodHandles.insertArguments(r0, r1, r2)
            r1 = r10
            java.lang.invoke.MethodHandle r0 = java.lang.invoke.MethodHandles.explicitCastArguments(r0, r1)
            r-1.setTarget(r0)
            goto L62
            r12 = r-2
            java.lang.RuntimeException r-2 = new java.lang.RuntimeException
            r-1 = r-2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "su/catlean/cd"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " : "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " : "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r12
            r-1.<init>(r0, r1)
            throw r-2
            r-1 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.cd.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
