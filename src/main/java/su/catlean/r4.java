package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/r4.class */
public final class r4 {
    private float A;
    private float b;
    private float i;
    private float s;
    private float o;
    private float E;
    private float y;
    private float U;
    private float w;
    private float C;
    private float W;
    private float Y;
    private float B;
    private int K;
    private int Z;
    private boolean R;
    private boolean V;
    private int l;

    @NotNull
    private final Color u;
    private float g;
    private static final long[] c;
    private static final Integer[] d;
    private static final long a = yz.a(2829213519929027138L, 4420343396535405648L, MethodHandles.lookup().lookupClass()).a(260760626420435L);
    private static final Map e = new HashMap(13);

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x017c: IPUT (r0 I:int), (r-1 I:su.catlean.r4) su.catlean.r4.K int
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public r4(char r14, char r15, float r16, int r17, float r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25) {
        /*
            Method dump skipped, instruction units count: 877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.r4.<init>(char, char, float, int, float, float, float, float, float, float, float, float):void");
    }

    public final float X() {
        return this.A;
    }

    public final void t(float f) {
        this.A = f;
    }

    public final float z() {
        return this.b;
    }

    public final void N(float f) {
        this.b = f;
    }

    public final float W() {
        return this.i;
    }

    public final void l(float f) {
        this.i = f;
    }

    public final float b() {
        return this.s;
    }

    public final void k(float f) {
        this.s = f;
    }

    public final float G() {
        return this.o;
    }

    public final void d(float f) {
        this.o = f;
    }

    public final float s() {
        return this.E;
    }

    public final void y(float f) {
        this.E = f;
    }

    public final float C() {
        return this.y;
    }

    public final void s(float f) {
        this.y = f;
    }

    public final float R() {
        return this.U;
    }

    public final void P(float f) {
        this.U = f;
    }

    public final float M() {
        return this.w;
    }

    public final void H(float f) {
        this.w = f;
    }

    public final float f() {
        return this.C;
    }

    public final void M(float f) {
        this.C = f;
    }

    public final float h() {
        return this.W;
    }

    public final void q(float f) {
        this.W = f;
    }

    public final float k() {
        return this.Y;
    }

    public final void f(float f) {
        this.Y = f;
    }

    public final float Y() {
        return this.B;
    }

    public final void b(float f) {
        this.B = f;
    }

    public final int E() {
        return this.K;
    }

    public final void q(int i) {
        this.K = i;
    }

    public final int H() {
        return this.Z;
    }

    public final void I(int i) {
        this.Z = i;
    }

    public final boolean r() {
        return this.R;
    }

    public final void K(boolean z) {
        this.R = z;
    }

    public final boolean t() {
        return this.V;
    }

    public final void k(boolean z) {
        this.V = z;
    }

    public final int D() {
        return this.l;
    }

    public final void p(int i) {
        this.l = i;
    }

    @NotNull
    public final Color j() {
        return this.u;
    }

    public final float B() {
        return this.g;
    }

    public final void R(float f) {
        this.g = f;
    }

    static {
        long j = a ^ 76953059398063L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        long[] jArr = new long[5];
        int i2 = 0;
        String str = "$?YÅ4\u0004áüÓ>\u0000\u008aGt\u0094ÇrÕÇu\u008c(Ýä";
        int length = "$?YÅ4\u0004áüÓ>\u0000\u008aGt\u0094ÇrÕÇu\u008c(Ýä".length();
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
                            c = jArr;
                            d = new Integer[5];
                            return;
                        }
                        break;
                        break;
                    default:
                        jArr2[b2] = j4;
                        if (i3 >= length) {
                            str = "S(Ñïñô8\u0006¬êx)\u007fÐ\"\u0090";
                            length = "S(Ñïñô8\u0006¬êx)\u007fÐ\"\u0090".length();
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

    private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException noWhenBranchMatchedException) {
        return noWhenBranchMatchedException;
    }

    private static int a(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 5721;
        if (d[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) c[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) e.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/r4", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            d[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return d[i2].intValue();
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
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
            r1 = -1
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
            java.lang.String r1 = "su/catlean/r4"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.r4.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
