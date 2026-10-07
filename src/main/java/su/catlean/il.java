package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/il.class */
public final class il extends i8 {

    @NotNull
    public static final il r = null;

    @NotNull
    private static final List M = null;

    @Nullable
    private static f6 Q;

    @Nullable
    private static f6 t;

    @Nullable
    private static f6 c;

    @Nullable
    private static xw Z;

    @NotNull
    private static fd w;

    @NotNull
    private static fd F;

    @NotNull
    private static fd S;
    private static boolean s;
    private static float B;

    @NotNull
    private static final fz i = null;

    @NotNull
    private static final fz P = null;

    @NotNull
    private static final fz V = null;

    @NotNull
    private static final fz z = null;

    @NotNull
    private static final fz J = null;
    private static String v;
    private static final long b = 0;
    private static final String[] e = null;
    private static final String[] j = null;
    private static final Map m = null;
    private static final long[] n = null;
    private static final Integer[] q = null;
    private static final Map y = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private il(long j2) {
        long j3 = b ^ j2;
        super((String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20738, 2127196748142436945L ^ j3) /* invoke-custom */, 0.0f, j3 ^ 140357993297591L, 0.0f, 0.0f, 0.0f, (int) d(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20292, 206589336674027787L ^ j3) /* invoke-custom */, null);
    }

    @NotNull
    public final List n() {
        return M;
    }

    @Nullable
    public final f6 Q() {
        return Q;
    }

    public final void N(@Nullable f6 f6Var) {
        Q = f6Var;
    }

    @Nullable
    public final f6 Z() {
        return c;
    }

    public final void v(@Nullable f6 f6Var) {
        c = f6Var;
    }

    @Nullable
    public final xw S() {
        return Z;
    }

    public final void C(@Nullable xw xwVar) {
        Z = xwVar;
    }

    @NotNull
    public final fd E() {
        return w;
    }

    public final void G(long a, @NotNull fd fdVar, char a2) {
        Intrinsics.checkNotNullParameter(fdVar, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4726, 8116801700221475137L ^ (((a << 16) | ((((long) a2) << 48) >>> 48)) ^ b)) /* invoke-custom */);
        w = fdVar;
    }

    @Override // su.catlean.i8
    public void Y(long j2) {
        long j3 = j2 ^ 135417448851113L;
        M.clear();
        for (c2 c2Var : jg.l.M(j2 ^ 25583469870279L)) {
            il ilVar = r;
            M.add(new xw(j3, c2Var));
            if (j2 < 0 || j2 < 0) {
                return;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x010a: INVOKE (r-1 I:su.catlean.fd), (r0 I:long), (r1 I:float) VIRTUAL call: su.catlean.fd.B(long, float):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @Override // su.catlean.i8
    public void p(@org.jetbrains.annotations.NotNull net.minecraft.class_332 r24, int r25, int r26, long r27) {
        /*
            Method dump skipped, instruction units count: 1853
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.il.p(net.minecraft.class_332, int, int, long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0057: INVOKE (r-1 I:su.catlean.jg), (r0 I:long), (r1 I:su.catlean.c2) VIRTUAL call: su.catlean.jg.B(long, su.catlean.c2):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void H(java.lang.String r19, long r20) {
        /*
            r18 = this;
            long r0 = su.catlean.il.b
            r1 = r20
            long r0 = r0 ^ r1
            r20 = r0
            r0 = r20
            r1 = r0; r1 = r0; 
            r2 = 72122391592176(0x41984d87fcf0, double:3.56331959816037E-310)
            long r1 = r1 ^ r2
            r22 = r1
            r1 = r0; r2 = r0; 
            r2 = 99164662230804(0x5a3092776f14, double:4.8993852889691E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r24 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r25 = r2
            r1 = r0; r3 = r0; 
            r2 = 77173186768669(0x463048622f1d, double:3.81286203624896E-310)
            long r1 = r1 ^ r2
            r26 = r1
            su.catlean.jg r0 = su.catlean.jg.l
            su.catlean.c2 r1 = new su.catlean.c2
            r2 = r1
            r3 = r24
            r4 = r19
            java.lang.String r5 = ""
            r6 = 0
            r7 = r25
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            r10 = 0
            r11 = 0
            r12 = 12994(0x32c2, float:1.8208E-41)
            r13 = 6944114496386227906(0x605e7357ccbddec2, double:1.6331009572046416E156)
            r14 = r20
            long r13 = r13 ^ r14
            int r12 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/il;->d(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "v"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r12, r13)
            r13 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = r26
            r3 = r2; r2 = r1; r1 = r3; 
            r-1.B(r0, r1)
            r-1 = r18
            r0 = r22
            r-1.Y(r0)
            r-1 = r18
            r0 = 0
            r-1.l(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.il.H(java.lang.String, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d6 A[PHI: r0
  0x01d6: PHI (r0v40 ??) = (r0v77 ??), (r0v78 ??), (r0v79 ??) binds: [B:56:0x0162, B:58:0x0167, B:73:0x01b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0219  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [su.catlean.cu] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [su.catlean.il] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [su.catlean.f6] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v55, types: [su.catlean.fd] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [su.catlean.jg] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Override // su.catlean.i8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(float r10, float r11, short r12, int r13, int r14, char r15) {
        /*
            Method dump skipped, instruction units count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.il.c(float, float, short, int, int, char):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // su.catlean.i8
    public void a(double r8, long r10, double r12, double r14) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.il.a(double, long, double, double):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [su.catlean.c2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    private static final Unit c(fz fzVar) {
        long j2 = b ^ 118046885818737L;
        Object objB = j2;
        long j3 = objB ^ 88233822140894L;
        try {
            try {
                Intrinsics.checkNotNullParameter(fzVar, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31130, 1781706119289413195L ^ j2) /* invoke-custom */);
                il ilVar = r;
                xw xwVar = Z;
                if (xwVar != null) {
                    objB = xwVar.b();
                    if (objB != 0) {
                        objB.F(fzVar.m(), j3);
                    }
                }
                return Unit.INSTANCE;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objB, 2537078152338779429L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objB, 2537078152338779429L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [su.catlean.c2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    private static final Unit n(fz fzVar) {
        long j2 = b ^ 70143620382464L;
        Object objB = j2;
        long j3 = objB ^ 114528175923370L;
        int i2 = (int) (objB >>> 48);
        int i3 = (int) ((j3 << 16) >>> 48);
        int i4 = (int) ((j3 << 32) >>> 32);
        try {
            try {
                Intrinsics.checkNotNullParameter(fzVar, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31130, 1781649543411257402L ^ j2) /* invoke-custom */);
                il ilVar = r;
                xw xwVar = Z;
                if (xwVar != null) {
                    objB = xwVar.b();
                    if (objB != 0) {
                        objB.N((char) i2, (char) i3, i4, fzVar.m());
                    }
                }
                return Unit.INSTANCE;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objB, 7873655217964704596L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objB, 7873655217964704596L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean.c2] */
    private static final Unit x(fz fzVar) {
        Object objB = b ^ 40495927858546L;
        try {
            try {
                try {
                    Intrinsics.checkNotNullParameter(fzVar, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23794, 6405832125225803572L ^ objB) /* invoke-custom */);
                    il ilVar = r;
                    xw xwVar = Z;
                    if (xwVar != null) {
                        objB = xwVar.b();
                        if (objB != 0) {
                            Integer intOrNull = StringsKt.toIntOrNull(fzVar.m());
                            objB.W(Math.abs(intOrNull != null ? intOrNull.intValue() : (int) d(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1790, 716515452012785718L ^ objB) /* invoke-custom */));
                        }
                    }
                    return Unit.INSTANCE;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objB, 519827843603597606L, objB) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objB, 519827843603597606L, objB) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objB, 519827843603597606L, objB) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [su.catlean.c2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    private static final Unit g(fz fzVar) {
        long j2 = b ^ 4388781455376L;
        Object objB = j2;
        long j3 = objB ^ 119079269691740L;
        int i2 = (int) (objB >>> 48);
        int i3 = (int) ((j3 << 16) >>> 48);
        int i4 = (int) ((j3 << 32) >>> 32);
        try {
            try {
                Intrinsics.checkNotNullParameter(fzVar, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31130, 1781610054438541098L ^ j2) /* invoke-custom */);
                il ilVar = r;
                xw xwVar = Z;
                if (xwVar != null) {
                    objB = xwVar.b();
                    if (objB != 0) {
                        objB.q((short) i2, fzVar.m(), (char) i3, i4);
                    }
                }
                return Unit.INSTANCE;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objB, 7662007809860363332L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objB, 7662007809860363332L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [su.catlean.c2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    private static final Unit k(fz fzVar) {
        long j2 = b ^ 39156223236518L;
        Object objB = j2;
        long j3 = objB ^ 29843638085048L;
        try {
            try {
                Intrinsics.checkNotNullParameter(fzVar, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31130, 1781644821880272540L ^ j2) /* invoke-custom */);
                il ilVar = r;
                xw xwVar = Z;
                if (xwVar != null) {
                    objB = xwVar.b();
                    if (objB != 0) {
                        objB.U(fzVar.m(), j3);
                    }
                }
                return Unit.INSTANCE;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objB, -3755214962919062030L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objB, -3755214962919062030L, j2) /* invoke-custom */;
        }
    }

    private static final Unit g() {
        long j2 = (b ^ 6874918096757L) ^ 15849051135411L;
        jg jgVar = jg.l;
        il ilVar = r;
        xw xwVar = Z;
        Intrinsics.checkNotNull(xwVar);
        jgVar.Q(j2, xwVar.b());
        il ilVar2 = r;
        List list = M;
        il ilVar3 = r;
        TypeIntrinsics.asMutableCollection(list).remove(Z);
        il ilVar4 = r;
        Z = null;
        return Unit.INSTANCE;
    }

    private static final Unit L(String str) {
        long j2 = b ^ 138716284355949L;
        Intrinsics.checkNotNullParameter(str, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31130, 1781720329048697431L ^ j2) /* invoke-custom */);
        r.H(str, j2 ^ 108697711253611L);
        return Unit.INSTANCE;
    }

    public static void B(String str) {
        v = str;
    }

    public static String v() {
        return v;
    }

    private static NumberFormatException b(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String b(byte[] bArr) {
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

    private static String b(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 17436;
        if (j[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) m.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                j[i3] = b(((Cipher) objArr[0]).doFinal(e[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/il", e2);
            }
        }
        return j[i3];
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
            r1 = r8
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
            java.lang.String r1 = "su/catlean/il"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.il.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int d(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 28934;
        if (q[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) n[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) y.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    y.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/il", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            q[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return q[i3].intValue();
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iD = d(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iD)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iD;
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
    private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = r8
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
            java.lang.String r1 = "su/catlean/il"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.il.d(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
