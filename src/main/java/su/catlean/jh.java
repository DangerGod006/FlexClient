package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/jh.class */
public final class jh {

    @NotNull
    public static final jh f = null;

    @NotNull
    private static o_ H;

    @NotNull
    private static final fd o = null;

    @NotNull
    private static Color z;

    @NotNull
    private static Color O;

    @NotNull
    private static Color X;

    @NotNull
    private static Color F;

    @NotNull
    private static Color m;

    @NotNull
    private static Color V;

    @NotNull
    private static Color U;

    @NotNull
    private static Color J;

    @NotNull
    private static Color B;

    @NotNull
    private static Color Z;

    @NotNull
    private static Color y;

    @NotNull
    private static Color p;

    @NotNull
    private static Color K;
    private static boolean b;
    private static final long a = 0;
    private static final String[] c = null;
    private static final String[] d = null;
    private static final Map e = null;
    private static final long[] g = null;
    private static final Integer[] h = null;
    private static final Map i = null;

    private jh() {
    }

    @NotNull
    public final Color l() {
        return z;
    }

    public final void I(@NotNull Color color, long a2) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16156, 5667585266545485287L ^ (a ^ a2)) /* invoke-custom */);
        z = color;
    }

    @NotNull
    public final Color t() {
        return O;
    }

    public final void t(@NotNull Color color, long a2) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16156, 5667514877008711676L ^ (a ^ a2)) /* invoke-custom */);
        O = color;
    }

    @NotNull
    public final Color H() {
        return X;
    }

    public final void M(int a2, int a3, @NotNull Color color, int a4) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16156, 5667576356378460558L ^ ((((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a)) /* invoke-custom */);
        X = color;
    }

    @NotNull
    public final Color g() {
        return F;
    }

    public final void m(long a2, short a3, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16156, 5667604413493015967L ^ (((a2 << 16) | ((((long) a3) << 48) >>> 48)) ^ a)) /* invoke-custom */);
        F = color;
    }

    @NotNull
    public final Color T() {
        return m;
    }

    public final void r(long a2, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16156, 5667612430522560133L ^ (a ^ a2)) /* invoke-custom */);
        m = color;
    }

    @NotNull
    public final Color F() {
        return V;
    }

    public final void v(@NotNull Color color, long a2) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16156, 5667553753416335156L ^ (a ^ a2)) /* invoke-custom */);
        V = color;
    }

    @NotNull
    public final Color n() {
        return U;
    }

    public final void W(@NotNull Color color, long a2) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16156, 5667584040308552234L ^ (a ^ a2)) /* invoke-custom */);
        U = color;
    }

    @NotNull
    public final Color r() {
        return J;
    }

    public final void q(@NotNull Color color, long a2) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6197, 6008284147051715618L ^ (a ^ a2)) /* invoke-custom */);
        J = color;
    }

    @NotNull
    public final Color S() {
        return B;
    }

    public final void l(long a2, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16156, 5667612004772942093L ^ (a ^ a2)) /* invoke-custom */);
        B = color;
    }

    @NotNull
    public final Color i() {
        return Z;
    }

    public final void x(@NotNull Color color, long a2) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16156, 5667572322469978188L ^ (a ^ a2)) /* invoke-custom */);
        Z = color;
    }

    @NotNull
    public final Color j() {
        return y;
    }

    public final void n(long a2, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16156, 5667531280069314776L ^ (a ^ a2)) /* invoke-custom */);
        y = color;
    }

    @NotNull
    public final Color Z() {
        return p;
    }

    public final void c(long a2, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16156, 5667615921922814668L ^ (a ^ a2)) /* invoke-custom */);
        p = color;
    }

    @NotNull
    public final Color h() {
        return K;
    }

    public final void s(long a2, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16156, 5667622500112273382L ^ (a ^ a2)) /* invoke-custom */);
        K = color;
    }

    public final void i(long a2, @NotNull o_ newTheme) {
        long j = a ^ a2;
        long j2 = j ^ 124330620419303L;
        Intrinsics.checkNotNullParameter(newTheme, (String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18986, 5567264419521553913L ^ j) /* invoke-custom */);
        H = yl.g.y().k(j ^ 44548781318326L);
        yl.g.y().W(j ^ 108221848854096L, newTheme);
        yl.g.h().W(j ^ 10609431061024L).H(newTheme.z(), j2);
        o.P(0.0f);
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x00C6: MOVE_MULTI in method: su.catlean.jh.P(long):void, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/jh.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x00C6: MOVE_MULTI
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -3 out of bounds for object array[9]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:304)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    public final void P(long r1) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jh.P(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @NotNull
    public final Color Z(long j, int i2) {
        int i3;
        long j2 = a ^ j;
        long j3 = j2 ^ 81021706965617L;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6642283305998579533L, j2) /* invoke-custom */;
        int iA = (int) (((zf.A() / 14.0d) + ((double) i2)) % ((double) (int) b(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(854, 3372297827563309950L ^ j2) /* invoke-custom */));
        try {
            try {
                obj = iA;
                int iB = (int) b(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27436, 9011402063515575042L ^ j2) /* invoke-custom */;
                int iB2 = obj;
                if (obj == 0) {
                    i3 = iB2 - iB;
                } else if (obj >= iB) {
                    iB = iA;
                    iB2 = (int) b(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16522, 3237849337479219371L ^ j2) /* invoke-custom */;
                    i3 = iB2 - iB;
                } else {
                    i3 = iA;
                }
                return jl.y.C(O, j3, X, i3 / 360.0f);
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6643127590162083032L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6643127590162083032L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.Map] */
    @NotNull
    public final Map I(long a2, @NotNull o_ theme) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(theme, (String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11622, 5767836401570562094L ^ j) /* invoke-custom */);
        Pair[] pairArr = new Pair[(int) b(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4992, 6324461382252291194L ^ j) /* invoke-custom */];
        pairArr[0] = TuplesKt.to((String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9475, 1962768005404313667L ^ j) /* invoke-custom */, theme.b());
        pairArr[1] = TuplesKt.to((String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9032, 98182945437208065L ^ j) /* invoke-custom */, theme.V());
        Object objMapOf = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6630032726672176994L, j) /* invoke-custom */;
        pairArr[2] = TuplesKt.to((String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15155, 53689015058519664L ^ j) /* invoke-custom */, theme.t());
        try {
            pairArr[3] = TuplesKt.to((String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4629, 2942639505216438097L ^ j) /* invoke-custom */, theme.X());
            pairArr[4] = TuplesKt.to((String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25412, 1514638135780544003L ^ j) /* invoke-custom */, theme.a());
            pairArr[5] = TuplesKt.to((String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26836, 2404458464133907867L ^ j) /* invoke-custom */, theme.I());
            pairArr[(int) b(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9703, 5576793967581712921L ^ j) /* invoke-custom */] = TuplesKt.to((String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32448, 3807560425750958986L ^ j) /* invoke-custom */, theme.P());
            pairArr[(int) b(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26626, 1541650150289252346L ^ j) /* invoke-custom */] = TuplesKt.to((String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4940, 2110202620579282446L ^ j) /* invoke-custom */, theme.U());
            pairArr[(int) b(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16319, 7068499902016276550L ^ j) /* invoke-custom */] = TuplesKt.to((String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12915, 4730642153881689909L ^ j) /* invoke-custom */, theme.F());
            pairArr[(int) b(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26859, 7635182000549306135L ^ j) /* invoke-custom */] = TuplesKt.to((String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15263, 1950400206757156562L ^ j) /* invoke-custom */, theme.M());
            pairArr[(int) b(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32385, 6777936964769188222L ^ j) /* invoke-custom */] = TuplesKt.to((String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27104, 1720822241313948844L ^ j) /* invoke-custom */, theme.Y());
            pairArr[(int) b(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26508, 3170862480580579455L ^ j) /* invoke-custom */] = TuplesKt.to((String) a(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2178, 1330931861746181577L ^ j) /* invoke-custom */, theme.H());
            objMapOf = MapsKt.mapOf(pairArr);
            if (objMapOf == 0) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[3], -6660398048643602004L, j) /* invoke-custom */;
            }
            return objMapOf;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMapOf, -6637632412559486197L, j) /* invoke-custom */;
        }
    }

    public static void c(boolean z2) {
        b = z2;
    }

    public static boolean u() {
        return b;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean Q() {
        return !u();
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String a(byte[] bArr) {
        int i2 = 0;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i3 = 0;
        while (i3 < length) {
            int i4 = 255 & bArr[i3];
            if (i4 < 192) {
                int i5 = i2;
                i2++;
                cArr[i5] = (char) i4;
            } else if (i4 < 224) {
                i3++;
                int i6 = i2;
                i2++;
                cArr[i6] = (char) (((char) (((char) (i4 & 31)) << 6)) | ((char) (bArr[i3] & 63)));
            } else if (i3 < length - 2) {
                int i7 = i3 + 1;
                char c2 = (char) (((char) (((char) (i4 & 15)) << '\f')) | (((char) (bArr[i7] & 63)) << 6));
                i3 = i7 + 1;
                int i8 = i2;
                i2++;
                cArr[i8] = (char) (c2 | ((char) (bArr[i3] & 63)));
            }
            i3++;
        }
        return new String(cArr, 0, i2);
    }

    private static String a(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 20466;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = a(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/jh", e2);
            }
        }
        return d[i3];
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
            java.lang.String r1 = "su/catlean/jh"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jh.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 21837;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/jh", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            h[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return h[i3].intValue();
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iB)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iB;
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
            java.lang.String r1 = "su/catlean/jh"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jh.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
