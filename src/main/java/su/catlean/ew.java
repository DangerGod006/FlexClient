package su.catlean;

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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ew.class */
public final class ew extends _g {

    @NotNull
    public static final ew O;
    static final KProperty[] V;

    @NotNull
    private static final cw o;

    @NotNull
    private static final cw h;

    @NotNull
    private static final cw I;
    private static int Y;
    private static final long a = yz.a(-3082537083315868688L, -5029862328146011263L, MethodHandles.lookup().lookupClass()).a(186088794932831L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /* JADX WARN: Illegal instructions before constructor call */
    private ew(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19721, 5069107569658719060L ^ j2) /* invoke-custom */, jt.d(), null, 4, null, j2 ^ 38601655987733L);
    }

    @NotNull
    public final bl I(long j) {
        return (bl) o.E(this, (a ^ j) ^ 67417001694374L, V[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [su.catlean.bc] */
    @NotNull
    public final bc z(long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 53900382091734L;
        Object obj = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8388329966535609908L, j2) /* invoke-custom */;
        try {
            obj = (bc) h.E(this, j3, V[1]);
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8395802063845878290L, j2) /* invoke-custom */ != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj + 1, 8369902143009085078L, j2) /* invoke-custom */;
            }
            return obj;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8400293364943878761L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.lg] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    @NotNull
    public final lg P(char c2, short s, int i) {
        long j = (((((long) c2) << 48) | ((((long) s) << 48) >>> 16)) | ((((long) i) << 32) >>> 32)) ^ a;
        long j2 = j ^ 58456551648186L;
        Object obj = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2739685586888612952L, j) /* invoke-custom */;
        try {
            obj = (lg) I.E(this, j2, V[2]);
            if (obj != 0) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[5], 2781469657883094180L, j) /* invoke-custom */;
            }
            return obj;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2810196005924022277L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [kotlin.reflect.KProperty[]] */
    /* JADX WARN: Type inference failed for: r0v62, types: [su.catlean.lj] */
    static {
        int i;
        long j = a ^ 65757135936049L;
        long j2 = j ^ 9740457613093L;
        long j3 = j ^ 63636759700733L;
        long j4 = j ^ 114432169124395L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(0, -2375692645111166003L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[10];
        int i3 = 0;
        String str = "£IQ##\u008an`g\u0084>ZVÎ°\u0095°SB\u0011}&?\u000f ÏqÞùý-)âÚULbUKÆ\u0019úë%\u008aØ£±\u0004\u009b/5ÿ\u0019Ðm\r q´v¿]Õ{\u001bçµ¡çãY\u008aõ\u0003_¦\u0007ÿj\u001c\u009b%@\u0081ÜË)uï LÏ4àÌ\u0007.Ùõ\u0084\u008a\u001fió\n\u009c\u0083UG\u0012V\u001fQ¸ ¦A½å\u0014É}\u0010µù\u0017RqÄ\fg]\u0007\u0003\u008a9a\u0094°0ê&\u0093\u001b4ÍAOôXß\u007fÜøú_@\u0091\u0015«zLl\u000eÄvâû®)\u0000Äóa¥½:oJ©\u0097q³\u0006ç\u0007ý\u0081\u0080.\bñ\u001eF¡X\u0082\u0018j°\u0016Êæ\u000e°vM\u0080J\u0005éêC\u001a\\¿¢yíSG©C?ðÍ2¹ÅòN\u007f\u0096.åÚ=q_ú¡éÚ\u0082[]õ\tâ\u00995\u008e|°\u0007\u0011\u0089$}_=µ\u001f)\b\u009b¥õ©¨\u009eSnÉ¨Ô\u0089ãÎU\u0017\u008c\u0005\u0083\u000e\u008fÙr¨×\u0086¡\u0017Ø²ª\u0018Ë\u0005\u000b¹,À\u0097\u001cÜ÷Ñ\u000b¿i2\u001b\u0016\u00830¶ b±ÎôÉÒ $P\u0017r(\u0006ï¯:i\u000f\u0003?=\u001aÕÖ¤\u0088\u0000\u009cy^8\u0014";
        int length = "£IQ##\u008an`g\u0084>ZVÎ°\u0095°SB\u0011}&?\u000f ÏqÞùý-)âÚULbUKÆ\u0019úë%\u008aØ£±\u0004\u009b/5ÿ\u0019Ðm\r q´v¿]Õ{\u001bçµ¡çãY\u008aõ\u0003_¦\u0007ÿj\u001c\u009b%@\u0081ÜË)uï LÏ4àÌ\u0007.Ùõ\u0084\u008a\u001fió\n\u009c\u0083UG\u0012V\u001fQ¸ ¦A½å\u0014É}\u0010µù\u0017RqÄ\fg]\u0007\u0003\u008a9a\u0094°0ê&\u0093\u001b4ÍAOôXß\u007fÜøú_@\u0091\u0015«zLl\u000eÄvâû®)\u0000Äóa¥½:oJ©\u0097q³\u0006ç\u0007ý\u0081\u0080.\bñ\u001eF¡X\u0082\u0018j°\u0016Êæ\u000e°vM\u0080J\u0005éêC\u001a\\¿¢yíSG©C?ðÍ2¹ÅòN\u007f\u0096.åÚ=q_ú¡éÚ\u0082[]õ\tâ\u00995\u008e|°\u0007\u0011\u0089$}_=µ\u001f)\b\u009b¥õ©¨\u009eSnÉ¨Ô\u0089ãÎU\u0017\u008c\u0005\u0083\u000e\u008fÙr¨×\u0086¡\u0017Ø²ª\u0018Ë\u0005\u000b¹,À\u0097\u001cÜ÷Ñ\u000b¿i2\u001b\u0016\u00830¶ b±ÎôÉÒ $P\u0017r(\u0006ï¯:i\u000f\u0003?=\u001aÕÖ¤\u0088\u0000\u009cy^8\u0014".length();
        char cCharAt = 24;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 >= length) {
                            b = strArr;
                            c = new String[10];
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[3];
                            int i9 = 0;
                            int length2 = "!óZ\u008a\u0019ÜÔoØ@|ºä»\u0091\u009fãÂº\u001bÁÑ±û".length();
                            int i10 = 0;
                            do {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = "!óZ\u008a\u0019ÜÔoØ@|ºä»\u0091\u009fãÂº\u001bÁÑ±û".substring(i11, i10).getBytes("ISO-8859-1");
                                i9++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i10 < length2);
                            Object objM = new KProperty[3];
                            try {
                                objM[0] = Reflection.property1(new PropertyReference1Impl(ew.class, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20766, 8538674560263608263L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27243, 7088435377963691195L ^ j) /* invoke-custom */, 0));
                                objM[1] = Reflection.property1(new PropertyReference1Impl(ew.class, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21447, 7344789183099950360L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30094, 7727737519723770707L ^ j) /* invoke-custom */, 0));
                                objM[2] = Reflection.property1(new PropertyReference1Impl(ew.class, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32197, 5512484920988334879L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21293, 4630686410129823219L ^ j) /* invoke-custom */, 0));
                                V = objM;
                                O = new ew(j3);
                                o = yp.L(O, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(73, 166626867876431512L ^ j) /* invoke-custom */, bl.DEFAULT, null, null, (int) jArr[0], null, j4);
                                h = yp.L(O, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(95, 7228890614545876615L ^ j) /* invoke-custom */, bc.CENTER, null, null, (int) jArr[2], null, j4);
                                I = yp.L(O, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9745, 4219075200443162826L ^ j) /* invoke-custom */, lg.NEW, null, null, (int) jArr[2], null, j4);
                                if (O.m(j2).X() == -1) {
                                    objM = O.m(j2);
                                    objM.D((int) jArr[1]);
                                    return;
                                }
                                return;
                            } catch (NumberFormatException unused) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objM, -2374324980498214410L, j) /* invoke-custom */;
                            }
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i12 = i3;
                        i3++;
                        strArr[i12] = strIntern;
                        int i13 = i5 + cCharAt;
                        i4 = i13;
                        if (i13 < length) {
                        }
                        str = "\u0089\b2?¹°\u0019|BÓ\u0006\u008f?\u000eî\u0097\u0086Oï\u0081[Öü\u0097{\"ÞÏÏ ÎvÐ×)J\u001aÓ\ré\u00802þ\u0081]î\u00888\u0081ÿLÔ¢\u0004\u0085(\u0018\u0086\u000bÁ\\Û[±Î\u0011¡\u00adUÏA½Þ\u000bÄóp1\u0018Ý\u008d";
                        length = "\u0089\b2?¹°\u0019|BÓ\u0006\u008f?\u000eî\u0097\u0086Oï\u0081[Öü\u0097{\"ÞÏÏ ÎvÐ×)J\u001aÓ\ré\u00802þ\u0081]î\u00888\u0081ÿLÔ¢\u0004\u0085(\u0018\u0086\u000bÁ\\Û[±Î\u0011¡\u00adUÏA½Þ\u000bÄóp1\u0018Ý\u008d".length();
                        cCharAt = '8';
                        i = -1;
                        break;
                        break;
                }
                i5 = i + 1;
                strSubstring = str.substring(i5, i5 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i4);
        }
    }

    public static void b(int i) {
        Y = i;
    }

    public static int r() {
        return Y;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int Z() {
        return r() == 0 ? 56 : 0;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String b(byte[] bArr) {
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

    private static String b(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 22677;
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
                c[i2] = b(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/ew", e);
            }
        }
        return c[i2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strB), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strB;
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = 0
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
            java.lang.String r1 = "su/catlean/ew"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ew.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
