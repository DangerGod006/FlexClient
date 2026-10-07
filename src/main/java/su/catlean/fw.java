package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/fw.class */
final class fw {
    private float z;
    private float K;
    private float f;
    private float a;
    private float x;
    private float b;
    private float U;
    private float v;
    private float G;
    private int I;
    private float O;
    private final float F;
    private final int e;
    private final int E;
    private static final long[] d;
    private static final Integer[] g;
    private static final long c = yz.a(3219430370203488093L, -687638557866968794L, MethodHandles.lookup().lookupClass()).a(209337593382170L);
    private static final Map h = new HashMap(13);

    public fw(float x, float y, long a, float z, float prevX, float prevY, float prevZ, float motionX, float motionY, float motionZ, int age, float rotation, float rotationSpeed, int offset, int maxAge) {
        long j = c ^ a;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4830229378078622355L, j) /* invoke-custom */;
        try {
            this.z = x;
            this.K = y;
            this.f = z;
            this.a = prevX;
            this.x = prevY;
            this.b = prevZ;
            this.U = motionX;
            this.v = motionY;
            this.G = motionZ;
            this.I = age;
            this.O = rotation;
            this.F = rotationSpeed;
            this.e = offset;
            this.E = maxAge;
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4872979926855081266L, j) /* invoke-custom */ != null) {
                _gVarArr = new _g[1];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr, -4843556904864620608L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr, -4844032065714604777L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fw(float f, float f2, char c2, float f3, int i, char c3, float f4, float f5, float f6, float f7, float f8, float f9, int i2, float f10, float f11, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        long j = (((((long) c2) << 48) | ((((long) i) << 32) >>> 16)) | ((((long) c3) << 48) >>> 48)) ^ c;
        long j2 = j ^ 60516841238957L;
        long j3 = j ^ 35136678743447L;
        long j4 = j ^ 31653195771796L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-815468723834456780L, j) /* invoke-custom */;
        this(f, f2, j2, f3, (i5 & (int) a(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9159, 8314624926737833424L ^ j) /* invoke-custom */) != 0 ? f : f4, (i5 & (int) a(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23236, 852815380896408795L ^ j) /* invoke-custom */) != 0 ? f2 : f5, (i5 & (int) a(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10561, 601451879787829084L ^ j) /* invoke-custom */) != 0 ? f3 : f6, (i5 & (int) a(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24378, 6093111458420220196L ^ j) /* invoke-custom */) != 0 ? mf.p(RangesKt.rangeTo(-0.1f, 0.1f), j3, false, 2, null) : f7, (i5 & (int) a(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2590, 1795938967382012932L ^ j) /* invoke-custom */) != 0 ? mf.p(RangesKt.rangeTo(0.01f, 0.03f), j3, false, 2, null) : f8, (i5 & (int) a(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26030, 9222223256167668669L ^ j) /* invoke-custom */) != 0 ? mf.p(RangesKt.rangeTo(-0.1f, 0.1f), j3, false, 2, null) : f9, (i5 & (int) a(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7561, 4744010326500025241L ^ j) /* invoke-custom */) != 0 ? 0 : i2, (i5 & (int) a(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7468, 2167955794739471159L ^ j) /* invoke-custom */) != 0 ? mf.p(RangesKt.rangeTo(-15.0f, 15.0f), j3, false, 2, null) : f10, (i5 & (int) a(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16055, 6700789498404077743L ^ j) /* invoke-custom */) != 0 ? mf.p(RangesKt.rangeTo(-0.5f, 0.5f), j3, false, 2, null) : f11, (i5 & (int) a(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8446, 5188426965546933986L ^ j) /* invoke-custom */) != 0 ? mf.f(new IntRange(0, (int) a(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25347, 1666493172013915410L ^ j) /* invoke-custom */), false, j4, 2, null) : i3, (i5 & (int) a(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19971, 8588414949719633941L ^ j) /* invoke-custom */) != 0 ? mf.f(new IntRange((int) a(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3776, 221395491850727641L ^ j) /* invoke-custom */, (int) a(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27607, 3751286000455931333L ^ j) /* invoke-custom */), false, j4, 2, null) : i4);
        _g[] _gVarArr2 = _gVarArr;
        if (c3 > 0) {
            if (_gVarArr2 != null) {
                return;
            } else {
                _gVarArr2 = new _g[2];
            }
        }
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr2, -832928074887594419L, j) /* invoke-custom */;
    }

    public final float q() {
        return this.z;
    }

    public final void x(float f) {
        this.z = f;
    }

    public final float S() {
        return this.K;
    }

    public final void h(float f) {
        this.K = f;
    }

    public final float Y() {
        return this.f;
    }

    public final void a(float f) {
        this.f = f;
    }

    public final float s() {
        return this.a;
    }

    public final void j(float f) {
        this.a = f;
    }

    public final float a() {
        return this.x;
    }

    public final void e(float f) {
        this.x = f;
    }

    public final float V() {
        return this.b;
    }

    public final void W(float f) {
        this.b = f;
    }

    public final float C() {
        return this.U;
    }

    public final void J(float f) {
        this.U = f;
    }

    public final float H() {
        return this.v;
    }

    public final void N(float f) {
        this.v = f;
    }

    public final float R() {
        return this.G;
    }

    public final void n(float f) {
        this.G = f;
    }

    public final int N() {
        return this.I;
    }

    public final void e(int i) {
        this.I = i;
    }

    public final float K() {
        return this.O;
    }

    public final void T(float f) {
        this.O = f;
    }

    public final float b() {
        return this.F;
    }

    public final int F() {
        return this.e;
    }

    public final int g() {
        return this.E;
    }

    static {
        long j = c ^ 53315603422676L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        long[] jArr = new long[14];
        int i2 = 0;
        String str = "uf|\u0083(\u0085´ÌØ æçqÁ0\nPOuÝ\u0088\u0016 Bt\u009d\u0092Ù\u001e\u008ca\u0004Cö\tbsa99ª\r\u0012\u0004¢à\u0012ñYj\"1\u008bZ¼SaÚ«8BÎÑVò\u000eé)9ªè@è\u009eklûä>¥\u0091O>ºÜ½@\u0092M\u00adxúý\u0098Å¢";
        int length = "uf|\u0083(\u0085´ÌØ æçqÁ0\nPOuÝ\u0088\u0016 Bt\u009d\u0092Ù\u001e\u008ca\u0004Cö\tbsa99ª\r\u0012\u0004¢à\u0012ñYj\"1\u008bZ¼SaÚ«8BÎÑVò\u000eé)9ªè@è\u009eklûä>¥\u0091O>ºÜ½@\u0092M\u00adxúý\u0098Å¢".length();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            i3 += 8;
            byte[] bytes = str.substring(i4, i3).getBytes("ISO-8859-1");
            long[] jArr2 = jArr;
            int i5 = i2;
            i2++;
            long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
            byte b = -1;
            while (true) {
                byte b2 = b;
                long j3 = j2;
                int i6 = i5;
                byte[] bArrDoFinal = cipher.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                switch (i6) {
                    case 0:
                        jArr2[b2] = j4;
                        if (i3 >= length) {
                            d = jArr;
                            g = new Integer[14];
                            return;
                        }
                        break;
                        break;
                    default:
                        jArr2[b2] = j4;
                        if (i3 >= length) {
                            str = "\u009aiÔ·(a«\u0086þ&Ìý,Ú\u0015N";
                            length = "\u009aiÔ·(a«\u0086þ&Ìý,Ú\u0015N".length();
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
                j2 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                b = 0;
            }
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static int a(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 19277;
        if (g[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) d[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/fw", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            g[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return g[i2].intValue();
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iA = a(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iA)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iA;
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
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
            r1 = 4
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
            java.lang.String r1 = "su/catlean/fw"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.fw.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
