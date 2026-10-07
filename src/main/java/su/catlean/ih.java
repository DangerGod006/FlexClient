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
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ih.class */
public final class ih extends i8 {

    @NotNull
    public static final ih v = null;

    @NotNull
    private static final List V = null;

    @Nullable
    private static f6 j;

    @Nullable
    private static f6 F;

    @Nullable
    private static f6 G;
    private static boolean B;

    @Nullable
    private static xj q;

    @Nullable
    private static xj K;

    @NotNull
    private static final fd y = null;

    @NotNull
    private static final fd e = null;

    @NotNull
    private static final fd J = null;
    private static boolean H;
    private static float E;

    @NotNull
    private static final fz Z = null;

    @NotNull
    private static final fz U = null;

    @NotNull
    private static final fz M = null;

    @NotNull
    private static final fz b = null;

    @NotNull
    private static final fz S = null;

    @NotNull
    private static final fz P = null;

    @NotNull
    private static final fz r = null;
    private static String[] Q;
    private static final long c = 0;
    private static final String[] i = null;
    private static final String[] m = null;
    private static final Map n = null;
    private static final long[] s = null;
    private static final Integer[] t = null;
    private static final Map w = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private ih(int i2, int i3) {
        long j2 = ((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ c;
        super((String) b(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20834, 8162800031789297804L ^ j2) /* invoke-custom */, 0.0f, j2 ^ 64775179426607L, 0.0f, 0.0f, 0.0f, (int) d(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8213, 4933415235080796652L ^ j2) /* invoke-custom */, null);
    }

    @NotNull
    public final List d() {
        return V;
    }

    @Nullable
    public final f6 A() {
        return j;
    }

    public final void p(@Nullable f6 f6Var) {
        j = f6Var;
    }

    @Nullable
    public final f6 U() {
        return G;
    }

    public final void N(@Nullable f6 f6Var) {
        G = f6Var;
    }

    public final boolean L() {
        return B;
    }

    public final void t(boolean z) {
        B = z;
    }

    @Nullable
    public final xj r() {
        return q;
    }

    public final void b(@Nullable xj xjVar) {
        q = xjVar;
    }

    @Nullable
    public final xj O() {
        return K;
    }

    public final void k(@Nullable xj xjVar) {
        K = xjVar;
    }

    @NotNull
    public final fd g() {
        return y;
    }

    @Override // su.catlean.i8
    public void Y(long j2) {
        long j3 = j2 ^ 115595886169135L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) (((j2 ^ 115779852416719L) << 32) >>> 32);
        V.clear();
        for (wl wlVar : zg.v.h((char) (j2 >>> 48), (int) ((j3 << 16) >>> 32), (int) ((j3 << 48) >>> 48))) {
            ih ihVar = v;
            V.add(new xj(wlVar, i2, i3));
            if (j2 <= 0 || j2 <= 0) {
                return;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0140: INVOKE (r-1 I:su.catlean.fd), (r0 I:long), (r1 I:float) VIRTUAL call: su.catlean.fd.B(long, float):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @Override // su.catlean.i8
    public void p(@org.jetbrains.annotations.NotNull net.minecraft.class_332 r24, int r25, int r26, long r27) {
        /*
            Method dump skipped, instruction units count: 2512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ih.p(net.minecraft.class_332, int, int, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.xj] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Override // su.catlean.i8
    public void R(int keyCode, int scanCode, long a, int modifiers) {
        long j2 = a ^ 0;
        long j3 = a ^ 37401059096302L;
        long j4 = a ^ 103591931905114L;
        ?? r0 = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6350265956045806346L, a) /* invoke-custom */;
        if (r0 == 0) {
            try {
                try {
                    try {
                        try {
                            r0 = K;
                            if (r0 == 0) {
                                super.R(keyCode, scanCode, j2, modifiers);
                                return;
                            }
                            xj xjVar = K;
                            if (xjVar != null) {
                                wl wlVarA = xjVar.a();
                                if (wlVarA != null) {
                                    wlVarA.r(new lj(keyCode, false, j4, false, (int) d(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22843, 6816741035635653803L ^ a) /* invoke-custom */, null), j3);
                                }
                            }
                            K = null;
                        } catch (NoWhenBranchMatchedException unused) {
                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6391785887582884320L, a) /* invoke-custom */;
                        }
                    } catch (NoWhenBranchMatchedException unused2) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6391785887582884320L, a) /* invoke-custom */;
                    }
                } catch (NoWhenBranchMatchedException unused3) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6391785887582884320L, a) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused4) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6391785887582884320L, a) /* invoke-custom */;
            }
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x0416: MOVE_MULTI in method: su.catlean.ih.c(float, float, short, int, int, char):void, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ih.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x0416: MOVE_MULTI
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -3 out of bounds for object array[11]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:304)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    @Override // su.catlean.i8
    public void c(float r1, float r2, short r3, int r4, int r5, char r6) {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ih.c(float, float, short, int, int, char):void");
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ih.a(double, long, double, double):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [su.catlean.wl] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    private static final Unit P(fz fzVar) {
        long j2 = c ^ 23934344295714L;
        Object objA = j2;
        long j3 = objA ^ 106658961111503L;
        try {
            try {
                Intrinsics.checkNotNullParameter(fzVar, (String) b(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31556, 1664747181792010763L ^ j2) /* invoke-custom */);
                ih ihVar = v;
                xj xjVar = q;
                if (xjVar != null) {
                    objA = xjVar.a();
                    if (objA != 0) {
                        objA.j(fzVar.m(), j3);
                    }
                }
                return Unit.INSTANCE;
            } catch (NoWhenBranchMatchedException unused) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objA, 7171585168991824621L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused2) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objA, 7171585168991824621L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [su.catlean.xj] */
    /* JADX WARN: Type inference failed for: r0v28, types: [kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v29, types: [su.catlean.xj] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.Unit J(su.catlean.fz r8) {
        /*
            long r0 = su.catlean.ih.c
            r1 = 134225808466217(0x7a13e1a22129, double:6.6316360748425E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 49831191277379(0x2d523a746f43, double:2.4619879701497E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -5253032001121471440(0xb7197b3a0b653430, double:-2.8565586275407314E-43)
            r1 = r9
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r1 = r8
            r2 = 31556(0x7b44, float:4.422E-41)
            r3 = 1664697346224518656(0x171a316a9c3f7600, double:2.190022834654182E-197)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ih;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "v"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r13 = r0
            su.catlean.ih r0 = su.catlean.ih.v     // Catch: kotlin.NoWhenBranchMatchedException -> L3f
            r0 = r13
            if (r0 != 0) goto L5a
            su.catlean.xj r0 = su.catlean.ih.q     // Catch: kotlin.NoWhenBranchMatchedException -> L3f kotlin.NoWhenBranchMatchedException -> L4f
            r1 = r0
            if (r1 == 0) goto L59
            goto L49
        L3f:
            r1 = -5220242195134316826(0xb78df961ad837ee6, double:-4.3010791150399845E-41)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L4f
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L4f
        L49:
            su.catlean.wl r0 = r0.a()     // Catch: kotlin.NoWhenBranchMatchedException -> L4f
            goto L5b
        L4f:
            r1 = -5220242195134316826(0xb78df961ad837ee6, double:-4.3010791150399845E-41)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L59:
        L5a:
            r0 = 0
        L5b:
            boolean r0 = r0 instanceof su.catlean.bp     // Catch: kotlin.NoWhenBranchMatchedException -> L65
            if (r0 != 0) goto L6f
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: kotlin.NoWhenBranchMatchedException -> L65
            return r0
        L65:
            r1 = -5220242195134316826(0xb78df961ad837ee6, double:-4.3010791150399845E-41)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6f:
            su.catlean.ih r0 = su.catlean.ih.v     // Catch: kotlin.NoWhenBranchMatchedException -> L82
            r0 = r13
            if (r0 != 0) goto L9d
            su.catlean.xj r0 = su.catlean.ih.q     // Catch: kotlin.NoWhenBranchMatchedException -> L82 kotlin.NoWhenBranchMatchedException -> L92
            r1 = r0
            if (r1 == 0) goto L9c
            goto L8c
        L82:
            r1 = -5220242195134316826(0xb78df961ad837ee6, double:-4.3010791150399845E-41)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L92
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L92
        L8c:
            su.catlean.wl r0 = r0.a()     // Catch: kotlin.NoWhenBranchMatchedException -> L92
            goto L9e
        L92:
            r1 = -5220242195134316826(0xb78df961ad837ee6, double:-4.3010791150399845E-41)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L9c:
        L9d:
            r0 = 0
        L9e:
            r1 = r0
            r2 = 401(0x191, float:5.62E-43)
            r3 = 2046635018568699072(0x1c671bb4b2a98cc0, double:7.47444740913414E-172)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ih;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "v"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            su.catlean.bp r0 = (su.catlean.bp) r0
            r1 = r8
            java.lang.String r1 = r1.m()
            r2 = r11
            r3 = r2; r2 = r1; r1 = r3; 
            r0.i(r1, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ih.J(su.catlean.fz):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [su.catlean.xj] */
    /* JADX WARN: Type inference failed for: r0v28, types: [kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v29, types: [su.catlean.xj] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.Unit N(su.catlean.fz r8) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ih.N(su.catlean.fz):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [su.catlean.xj] */
    /* JADX WARN: Type inference failed for: r0v28, types: [kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v29, types: [su.catlean.xj] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.Unit a(su.catlean.fz r8) {
        /*
            long r0 = su.catlean.ih.c
            r1 = 101467460520668(0x5c48bbf0cadc, double:5.0131586414015E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 48143777292370(0x2bc958be6052, double:2.3786186421192E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 6659746919057474097(0x5c6c2c89bc6c4231, double:1.638234981763643E137)
            r1 = r9
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r1 = r8
            r2 = 31556(0x7b44, float:4.422E-41)
            r3 = 1664668514816728565(0x171a1731c66d9df5, double:2.1814585930613447E-197)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ih;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "v"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r13 = r0
            su.catlean.ih r0 = su.catlean.ih.v     // Catch: kotlin.NoWhenBranchMatchedException -> L3f
            r0 = r13
            if (r0 == 0) goto L5a
            su.catlean.xj r0 = su.catlean.ih.q     // Catch: kotlin.NoWhenBranchMatchedException -> L3f kotlin.NoWhenBranchMatchedException -> L4f
            r1 = r0
            if (r1 == 0) goto L59
            goto L49
        L3f:
            r1 = 6663321093053453587(0x5c78df3af7d19513, double:2.892468487791242E137)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L4f
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L4f
        L49:
            su.catlean.wl r0 = r0.a()     // Catch: kotlin.NoWhenBranchMatchedException -> L4f
            goto L5b
        L4f:
            r1 = 6663321093053453587(0x5c78df3af7d19513, double:2.892468487791242E137)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L59:
        L5a:
            r0 = 0
        L5b:
            boolean r0 = r0 instanceof su.catlean.nh     // Catch: kotlin.NoWhenBranchMatchedException -> L65
            if (r0 != 0) goto L6f
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: kotlin.NoWhenBranchMatchedException -> L65
            return r0
        L65:
            r1 = 6663321093053453587(0x5c78df3af7d19513, double:2.892468487791242E137)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6f:
            su.catlean.ih r0 = su.catlean.ih.v     // Catch: kotlin.NoWhenBranchMatchedException -> L82
            r0 = r13
            if (r0 == 0) goto L9d
            su.catlean.xj r0 = su.catlean.ih.q     // Catch: kotlin.NoWhenBranchMatchedException -> L82 kotlin.NoWhenBranchMatchedException -> L92
            r1 = r0
            if (r1 == 0) goto L9c
            goto L8c
        L82:
            r1 = 6663321093053453587(0x5c78df3af7d19513, double:2.892468487791242E137)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L92
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L92
        L8c:
            su.catlean.wl r0 = r0.a()     // Catch: kotlin.NoWhenBranchMatchedException -> L92
            goto L9e
        L92:
            r1 = 6663321093053453587(0x5c78df3af7d19513, double:2.892468487791242E137)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L9c:
        L9d:
            r0 = 0
        L9e:
            r1 = r0
            r2 = 7214(0x1c2e, float:1.0109E-41)
            r3 = 3622446219417647773(0x324583a4de587a9d, double:1.5960146145579755E-66)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ih;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "v"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            su.catlean.nh r0 = (su.catlean.nh) r0
            r1 = r8
            java.lang.String r1 = r1.m()
            r2 = r11
            r0.l(r1, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ih.a(su.catlean.fz):kotlin.Unit");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x01f3: INVOKE (r-1 I:su.catlean.fz), (r0 I:long), (r1 I:su.catlean.j0) VIRTUAL call: su.catlean.fz.d(long, su.catlean.j0):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final kotlin.Unit Q(su.catlean.fz r9) {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ih.Q(su.catlean.fz):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [su.catlean.xj] */
    /* JADX WARN: Type inference failed for: r0v28, types: [kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v29, types: [su.catlean.xj] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.Unit s(su.catlean.fz r8) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ih.s(su.catlean.fz):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [su.catlean.xj] */
    /* JADX WARN: Type inference failed for: r0v28, types: [kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v29, types: [su.catlean.xj] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.Unit W(su.catlean.fz r8) {
        /*
            long r0 = su.catlean.ih.c
            r1 = 128355425406004(0x74bd13894c34, double:6.34160061504453E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 34555376478729(0x1f6d8cf0aa09, double:1.70726243972507E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -2736933390836147923(0xda047594f94e592d, double:-4.327918495331317E125)
            r1 = r9
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r1 = r8
            r2 = 31556(0x7b44, float:4.422E-41)
            r3 = 1664713125159770909(0x171a3fc46e141b1d, double:2.1947098972687407E-197)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ih;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "v"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r13 = r0
            su.catlean.ih r0 = su.catlean.ih.v     // Catch: kotlin.NoWhenBranchMatchedException -> L3f
            r0 = r13
            if (r0 != 0) goto L5a
            su.catlean.xj r0 = su.catlean.ih.q     // Catch: kotlin.NoWhenBranchMatchedException -> L3f kotlin.NoWhenBranchMatchedException -> L4f
            r1 = r0
            if (r1 == 0) goto L59
            goto L49
        L3f:
            r1 = -2697383706759785477(0xda90f7cf5fa813fb, double:-1.8377610003585387E128)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L4f
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L4f
        L49:
            su.catlean.wl r0 = r0.a()     // Catch: kotlin.NoWhenBranchMatchedException -> L4f
            goto L5b
        L4f:
            r1 = -2697383706759785477(0xda90f7cf5fa813fb, double:-1.8377610003585387E128)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L59:
        L5a:
            r0 = 0
        L5b:
            boolean r0 = r0 instanceof su.catlean.nh     // Catch: kotlin.NoWhenBranchMatchedException -> L65
            if (r0 != 0) goto L6f
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: kotlin.NoWhenBranchMatchedException -> L65
            return r0
        L65:
            r1 = -2697383706759785477(0xda90f7cf5fa813fb, double:-1.8377610003585387E128)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6f:
            su.catlean.ih r0 = su.catlean.ih.v     // Catch: kotlin.NoWhenBranchMatchedException -> L82
            r0 = r13
            if (r0 != 0) goto L9d
            su.catlean.xj r0 = su.catlean.ih.q     // Catch: kotlin.NoWhenBranchMatchedException -> L82 kotlin.NoWhenBranchMatchedException -> L92
            r1 = r0
            if (r1 == 0) goto L9c
            goto L8c
        L82:
            r1 = -2697383706759785477(0xda90f7cf5fa813fb, double:-1.8377610003585387E128)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L92
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L92
        L8c:
            su.catlean.wl r0 = r0.a()     // Catch: kotlin.NoWhenBranchMatchedException -> L92
            goto L9e
        L92:
            r1 = -2697383706759785477(0xda90f7cf5fa813fb, double:-1.8377610003585387E128)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L9c:
        L9d:
            r0 = 0
        L9e:
            r1 = r0
            r2 = 7214(0x1c2e, float:1.0109E-41)
            r3 = 3622489841652071541(0x3245ab517621fc75, double:1.6075114703085097E-66)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ih;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "v"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            su.catlean.nh r0 = (su.catlean.nh) r0
            r1 = r8
            java.lang.String r1 = r1.m()
            r2 = r11
            r0.x(r1, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ih.W(su.catlean.fz):kotlin.Unit");
    }

    private static final Unit b() {
        long j2 = c ^ 58315379892440L;
        long j3 = j2 ^ 108969504625696L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j3 << 32) >>> 56);
        int i4 = (int) ((j3 << 40) >>> 40);
        zg zgVar = zg.v;
        ih ihVar = v;
        xj xjVar = q;
        Intrinsics.checkNotNull(xjVar);
        zgVar.u(i2, (byte) i3, i4, xjVar.a());
        ih ihVar2 = v;
        List list = V;
        ih ihVar3 = v;
        TypeIntrinsics.asMutableCollection(list).remove(q);
        ih ihVar4 = v;
        q = null;
        return Unit.INSTANCE;
    }

    public static void w(String[] strArr) {
        Q = strArr;
    }

    public static String[] H() {
        return Q;
    }

    private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException noWhenBranchMatchedException) {
        return noWhenBranchMatchedException;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 15137;
        if (m[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) n.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    n.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                m[i3] = b(((Cipher) objArr[0]).doFinal(i[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/ih", e2);
            }
        }
        return m[i3];
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
            r1 = r9
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
            java.lang.String r1 = "su/catlean/ih"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ih.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int d(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 17199;
        if (t[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) s[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) w.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    w.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/ih", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            t[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return t[i3].intValue();
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
            r1 = r9
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
            java.lang.String r1 = "su/catlean/ih"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ih.d(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
