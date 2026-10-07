package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mf.class */
public final class mf {

    @NotNull
    private static final Random h = null;
    private static String V;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map d = null;

    @NotNull
    public static final Random c() {
        return h;
    }

    public static final int O(int from, int to, boolean normalDistribution) {
        return MathKt.roundToInt(from + ((to - from) * ((float) T(normalDistribution))));
    }

    public static /* synthetic */ int P(int i, int i2, boolean z, long j, int i3, Object obj) {
        long j2 = a ^ j;
        if ((i3 & 4) != 0) {
            z = true;
        }
        return O(i, i2, z);
    }

    public static final float q(float from, float to, boolean normalDistribution) {
        return from + ((to - from) * ((float) T(normalDistribution)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public static /* synthetic */ float D(long j, float f, float f2, boolean z, int i, Object obj) {
        long j2 = a ^ j;
        ?? r0 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2920555531972431971L, j2) /* invoke-custom */;
        try {
            r0 = i & 4;
            ?? r10 = z;
            ?? r02 = r0;
            if (r0 != 0) {
                r10 = r02;
            } else if (r0 != 0) {
                r02 = 1;
                r10 = r02;
            }
            return q(f, f2, (boolean) r10);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 2960469012258425619L, j2) /* invoke-custom */;
        }
    }

    public static final double q(double from, double to, boolean normalDistribution) {
        return from + ((to - from) * T(normalDistribution));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public static /* synthetic */ double a(long j, double d2, double d3, boolean z, int i, Object obj) {
        long j2 = a ^ j;
        ?? r0 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6565391305100403704L, j2) /* invoke-custom */;
        try {
            r0 = i & 4;
            ?? r12 = z;
            ?? r02 = r0;
            if (r0 != 0) {
                r12 = r02;
            } else if (r0 != 0) {
                r02 = 1;
                r12 = r02;
            }
            return q(d2, d3, (boolean) r12);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 6525332897518418056L, j2) /* invoke-custom */;
        }
    }

    public static final double x(char a2, @NotNull ClosedRange range, int a3, boolean normalDistribution, char a4) {
        Intrinsics.checkNotNullParameter(range, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17089, 6256282029613139003L ^ ((((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ a)) /* invoke-custom */);
        return q(((Number) range.getStart()).doubleValue(), ((Number) range.getEndInclusive()).doubleValue(), normalDistribution);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static /* synthetic */ double k(ClosedRange closedRange, boolean z, int i, Object obj, long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 37066146862657L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j3 << 16) >>> 32);
        int i4 = (int) ((j3 << 48) >>> 48);
        ?? r0 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6606121261468721993L, j2) /* invoke-custom */;
        try {
            r0 = i & 2;
            ?? r9 = z;
            ?? r02 = r0;
            if (r0 != 0) {
                r9 = r02;
            } else if (r0 != 0) {
                r02 = 1;
                r9 = r02;
            }
            return x((char) i2, closedRange, i3, r9, (char) i4);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 6503197177660864569L, j2) /* invoke-custom */;
        }
    }

    public static final float G(@NotNull ClosedRange range, boolean normalDistribution, long a2) {
        Intrinsics.checkNotNullParameter(range, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17089, 6256308839627715655L ^ (a ^ a2)) /* invoke-custom */);
        return q(((Number) range.getStart()).floatValue(), ((Number) range.getEndInclusive()).floatValue(), normalDistribution);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    public static /* synthetic */ float p(ClosedRange closedRange, long j, boolean z, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 22731942203703L;
        ?? r0 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3217687476009817155L, j2) /* invoke-custom */;
        try {
            r0 = i & 2;
            ?? r10 = z;
            ?? r02 = r0;
            if (r0 != 0) {
                r10 = r02;
            } else if (r0 != 0) {
                r02 = 1;
                r10 = r02;
            }
            return G(closedRange, r10, j3);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 3257741489840197427L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String] */
    public static final int N(int a2, @NotNull ClosedRange range, boolean normalDistribution, int a3) {
        long j = ((((long) a2) << 32) | ((((long) a3) << 32) >>> 32)) ^ a;
        Object objO = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6829613467392648739L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(range, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1417, 7650430124582356178L ^ j) /* invoke-custom */);
        try {
            objO = O(((Number) range.getStart()).intValue(), ((Number) range.getEndInclusive()).intValue(), normalDistribution);
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6880019209929441771L, j) /* invoke-custom */ != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("sx0s2", 6880583297803749017L, j) /* invoke-custom */;
            }
            return objO;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objO, 6869676539841772883L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    public static /* synthetic */ int f(ClosedRange closedRange, boolean z, long j, int i, Object obj) {
        long j2 = a ^ j;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) (((j2 ^ 104603750876392L) << 32) >>> 32);
        Object obj2 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1055116145041208896L, j2) /* invoke-custom */;
        try {
            obj2 = i & 2;
            if (obj2 != 0) {
                return obj2;
            }
            if (obj2 != 0) {
                z = true;
            }
            return N(i2, closedRange, z, i3);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, 1096294056780508464L, j2) /* invoke-custom */;
        }
    }

    public static final double T(boolean normalDistribution) {
        return h.nextDouble();
    }

    public static final double x() {
        return h.nextGaussian();
    }

    public static void V(String str) {
        V = str;
    }

    public static String y() {
        return V;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 8049;
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
                throw new RuntimeException("su/catlean/mf", e);
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
            r1 = 3
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
            java.lang.String r1 = "su/catlean/mf"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.mf.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
