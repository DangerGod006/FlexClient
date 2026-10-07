package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PickUpBlockEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/q5.class */
public final class q5 extends _g {

    @NotNull
    public static final q5 E;
    static final KProperty[] I;

    @NotNull
    private static final cw t;

    @NotNull
    private static final cw u;

    @NotNull
    private static final cw T;

    @NotNull
    private static final cw e;

    @NotNull
    private static final cq A;

    @NotNull
    private static final cq n;

    @NotNull
    private static final c8 D;

    @NotNull
    private static final cq h;

    @NotNull
    private static final c8 x;

    @NotNull
    private static final c8 X;

    @NotNull
    private static final cq L;

    @NotNull
    private static final bg y;
    private static boolean m;
    private static final long a = yz.a(8412661908427240085L, -2868034301487351901L, MethodHandles.lookup().lookupClass()).a(117956561957485L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map i;

    /* JADX WARN: Illegal instructions before constructor call */
    private q5(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18609, 7500834119848917323L ^ j2) /* invoke-custom */, jt.I(), null, 4, null, j2 ^ 140194822796256L);
    }

    private final cn Z(long j) {
        return (cn) t.E(this, (a ^ j) ^ 92489806743778L, I[0]);
    }

    private final cn T(char c2, int i2, int i3) {
        return (cn) u.E(this, ((((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ a) ^ 36884205984542L, I[1]);
    }

    private final cn h(long j) {
        return (cn) T.E(this, (a ^ j) ^ 23278140337689L, I[2]);
    }

    private final cn F(char c2, int i2, short s) {
        return (cn) e.E(this, ((((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s) << 48) >>> 48)) ^ a) ^ 126552581300395L, I[3]);
    }

    private final boolean Y(long j) {
        return ((Boolean) A.E(this, (a ^ j) ^ 11024764736680L, I[4])).booleanValue();
    }

    private final boolean g(long j) {
        return ((Boolean) n.E(this, (a ^ j) ^ 51111244451755L, I[5])).booleanValue();
    }

    private final int W(long j) {
        long j2 = a ^ j;
        return ((Number) D.E(this, j2 ^ 11909169046238L, I[(int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12864, 4676473913994198534L ^ j2) /* invoke-custom */])).intValue();
    }

    private final boolean R(long j) {
        long j2 = a ^ j;
        return ((Boolean) h.E(this, j2 ^ 20645366138309L, I[(int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27011, 1347594792492827357L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final int P(long j) {
        long j2 = a ^ j;
        return ((Number) x.E(this, j2 ^ 123550444825811L, I[(int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23890, 826416542180056833L ^ j2) /* invoke-custom */])).intValue();
    }

    private final int V(long j) {
        long j2 = a ^ j;
        return ((Number) X.E(this, j2 ^ 105063590227185L, I[(int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16591, 2765909831037698746L ^ j2) /* invoke-custom */])).intValue();
    }

    private final boolean q(int i2, char c2, short s) {
        long j = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ a;
        return ((Boolean) L.E(this, j ^ 139139351049453L, I[(int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(961, 2207244934225107376L ^ j) /* invoke-custom */])).booleanValue();
    }

    @Flow
    private final void Z(PickUpBlockEvent pickUpBlockEvent) {
        pickUpBlockEvent.cancel();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:102:0x0280
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow(priority = -10)
    private final void K(su.catlean.api.event.events.player.PlayerUpdateEvent r9) {
        /*
            Method dump skipped, instruction units count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q5.K(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:42:0x0170
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void O(su.catlean.api.event.events.render.Render3DEvent r13) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q5.O(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00d1: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_746) STATIC call: su.catlean.s_.z(long, net.minecraft.class_746):java.util.List
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final boolean t(int r12, int r13, byte r14) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q5.t(int, int, byte):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0198: INVOKE (r-1 I:su.catlean.gg), (r0 I:int), (r1 I:long), (r2 I:int) VIRTUAL call: su.catlean.gg.r(int, long, int):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void p(long r13) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q5.p(long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0160: INVOKE (r-1 I:su.catlean.c7), (r0 I:long), (r1 I:net.minecraft.class_1657) VIRTUAL call: su.catlean.c7.u(long, net.minecraft.class_1657):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void M(long r15) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q5.M(long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x018a: INVOKE (r-1 I:su.catlean._8), (r0 I:long), (r1 I:su.catlean.t5) VIRTUAL call: su.catlean._8.C(long, su.catlean.t5):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void C(char r18, int r19, short r20) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q5.C(char, int, short):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0096: INVOKE (r-1 I:su.catlean._8), (r0 I:long), (r1 I:su.catlean.t5) VIRTUAL call: su.catlean._8.C(long, su.catlean.t5):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void s(long r18) {
        /*
            r17 = this;
            long r0 = su.catlean.q5.a
            r1 = r18
            long r0 = r0 ^ r1
            r18 = r0
            r0 = r18
            r1 = r0; r1 = r0; 
            r2 = 33768286551126(0x1eb64ab97c56, double:1.66837503038343E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r20 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 40
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r21 = r2
            r2 = r1; r3 = r0; 
            r3 = 56
            long r2 = r2 << r3
            r3 = 56
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r22 = r2
            r1 = r0; r3 = r0; 
            r2 = 117857968584227(0x6b30f259f623, double:5.82295733661035E-310)
            long r1 = r1 ^ r2
            r23 = r1
            r1 = r0; r2 = r0; 
            r2 = 72247184658280(0x41b55bc70f68, double:3.5694851948405E-310)
            long r1 = r1 ^ r2
            r25 = r1
            r1 = r0; r2 = r0; 
            r2 = 83946651678988(0x4c595a5a790c, double:4.14751566779894E-310)
            long r1 = r1 ^ r2
            r27 = r1
            r1 = r0; r2 = r0; 
            r2 = 76865245208011(0x45e895a2ddcb, double:3.79764770164417E-310)
            long r1 = r1 ^ r2
            r29 = r1
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = r22
            byte r3 = (byte) r3     // Catch: java.lang.NumberFormatException -> L9c
            boolean r0 = r0.t(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L9c
            if (r0 == 0) goto La6
            su.catlean._8 r0 = su.catlean._8.P     // Catch: java.lang.NumberFormatException -> L9c
            su.catlean.t5 r1 = new su.catlean.t5     // Catch: java.lang.NumberFormatException -> L9c
            r2 = r1
            su.catlean._w r3 = new su.catlean._w     // Catch: java.lang.NumberFormatException -> L9c
            r4 = r3
            r5 = r29
            net.minecraft.class_746 r5 = su.catlean.zf.v(r5)     // Catch: java.lang.NumberFormatException -> L9c
            float r5 = r5.method_36454()     // Catch: java.lang.NumberFormatException -> L9c
            r6 = r25
            r7 = 1119092736(0x42b40000, float:90.0)
            r8 = 0
            r9 = 0
            r10 = 25754(0x649a, float:3.6089E-41)
            r11 = 5594586697467087033(0x4da3f6f5bfa6c8b9, double:1.0512634874073246E66)
            r12 = r18
            long r11 = r11 ^ r12
            int r10 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/q5;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "z"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r10, r11)     // Catch: java.lang.NumberFormatException -> L9c
            r11 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.NumberFormatException -> L9c
            r4 = r27
            r5 = 13510(0x34c6, float:1.8932E-41)
            r6 = 5517643152614660324(0x4c929b36acf698e4, double:7.474794052096027E60)
            r7 = r18
            long r6 = r6 ^ r7
            int r5 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/q5;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "z"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r5, r6)     // Catch: java.lang.NumberFormatException -> L9c
            void r6 = su.catlean.q5::i     // Catch: java.lang.NumberFormatException -> L9c
            r2.<init>(r3, r4, r5, r6)     // Catch: java.lang.NumberFormatException -> L9c
            r2 = r23
            r3 = r2; r2 = r1; r1 = r3;      // Catch: java.lang.NumberFormatException -> L9c
            r-1.C(r0, r1)     // Catch: java.lang.NumberFormatException -> L9c
            goto La6
        L9c:
            r1 = 1097316754640434272(0xf3a73c6466d7460, double:2.5998358170303625E-235)
            r2 = r18
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q5.s(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean v() {
        long j = a ^ 46434071748743L;
        long j2 = j ^ 106640272554027L;
        Object objY = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2487250256745875320L, j) /* invoke-custom */;
        try {
            objY = E.Y(j2);
            return objY == 0 ? objY == 0 : objY;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objY, 2472026644619680020L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0163, code lost:
    
        if (r0 != 0) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fe A[PHI: r0
  0x00fe: PHI (r0v47 ??) = (r0v62 ??), (r0v48 ??) binds: [B:22:0x00ea, B:27:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01df A[PHI: r0
  0x01df: PHI (r0v22 ??) = (r0v15 ??), (r0v35 ??) binds: [B:42:0x017d, B:65:0x01de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [su.catlean.i3] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49, types: [su.catlean.gg] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.Unit r(int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q5.r(int, int):kotlin.Unit");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0076: INVOKE (r-1 I:su.catlean.gg), (r0 I:int), (r1 I:long), (r2 I:int) VIRTUAL call: su.catlean.gg.r(int, long, int):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final kotlin.Unit i() {
        /*
            long r0 = su.catlean.q5.a
            r1 = 5544207059025(0x50adc7e0851, double:2.739202241295E-311)
            long r0 = r0 ^ r1
            r12 = r0
            r0 = r12
            r1 = r0; r1 = r0; 
            r2 = 28881094617252(0x1a446762a8a4, double:1.4269156664675E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r1 = r0; r2 = r0; 
            r2 = 58033312257148(0x34c7eef6547c, double:2.86722659006346E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r16 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r17 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r18 = r2
            r1 = r0; r3 = r0; 
            r2 = 89946363764500(0x51ce450f9f14, double:4.44394083043794E-310)
            long r1 = r1 ^ r2
            r19 = r1
            su.catlean.gg r0 = su.catlean.gg.P
            su.catlean.gg r1 = su.catlean.gg.P
            r2 = 1
            net.minecraft.class_1792[] r2 = new net.minecraft.class_1792[r2]
            r21 = r2
            r2 = r21
            r3 = 0
            net.minecraft.class_1792 r4 = net.minecraft.class_1802.field_8287
            r5 = r4
            r6 = 14860(0x3a0c, float:2.0823E-41)
            r7 = 8898239840630727669(0x7b7ce5fd7b05e3f5, double:6.875585283963028E286)
            r8 = r12
            long r7 = r7 ^ r8
            java.lang.String r6 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/q5;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "w"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r6, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r2[r3] = r4
            r2 = r16
            r3 = r21
            r4 = r17
            r5 = r18
            char r5 = (char) r5
            su.catlean.fg r1 = r1.Y(r2, r3, r4, r5)
            int r1 = r1.a()
            su.catlean.q5 r2 = su.catlean.q5.E
            r3 = r14
            int r2 = r2.V(r3)
            r3 = r19
            r4 = r3; r3 = r2; r2 = r4; 
            r-1.r(r0, r1, r2)
            kotlin.Unit r-1 = kotlin.Unit.INSTANCE
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q5.i():kotlin.Unit");
    }

    public static final void Z(int a2, q5 $this, short a3, int a4) {
        $this.p(((((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a) ^ 136447609465480L);
    }

    public static final void a(int a2, char a3, int a4, q5 $this) {
        $this.M(((((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a) ^ 102071107535820L);
    }

    public static final boolean q(int a2, char a3, int a4, q5 $this) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a;
        long j2 = j ^ 49466939743796L;
        return $this.q((int) (j >>> 32), (char) ((j2 << 32) >>> 48), (short) ((j2 << 48) >>> 48));
    }

    public static final void g(q5 $this, long a2) {
        $this.C((char) (r0 >>> 48), (int) ((((a ^ a2) ^ 33184457355480L) << 16) >>> 32), (short) ((r1 << 48) >>> 48));
    }

    public static final void B(q5 $this, long a2) {
        $this.s((a ^ a2) ^ 93767565686446L);
    }

    static {
        int i2;
        long j = a ^ 130657401033271L;
        long j2 = j ^ 11476824135602L;
        long j3 = j ^ 41607616142036L;
        long j4 = j ^ 44400706400526L;
        long j5 = j ^ 82521735539974L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[45];
        int i4 = 0;
        String str = "UÄ\u0003Á°%)mZ\n\u0081\u0082\n\u0092K\u0083`ë'z·\u009c¿\u009c]\u0014'Æb\u0092ÄH8Þ\u001eu°aýZ¥r\u001aÈ\u008f\u000eñxEÖ\u0080á\u0007;b÷¸\u008cÔ®\u0006\u008dug-r(Õ\u001c3ó¿ò÷\u001a\u0094[Î¢²å÷ÍH8d[ýÐ\u0010\u0092J!R\u0087E\u007fHÏ;æ\u0086âç_- î4dù0\u0005\u0099\u007fÖ\u0094'GíäÍ\u00074\f,¼ßÏÂü\u0081ú\u008dS â\u009d\b\u0018ûE\u0012#h\u001fØ\u0084\u0083K\u0003éçD\u001eËÂ,y\u0080)\u009dAÿ\u0010µáK1%åa0ÐAi\u0092'\u0019\u00834\u0018d¬.[XãØ\"µï¼l©käëÙ\f?Åï\u0081¥\f 4xéd\u0085\"\u0012³÷Ø\u0089õpæx=R)JË/ìJpÅkJÊ±å>Æ\u0010)|é\u0015QU\u0089\u0080äa\u0013\u009bwJ\u001a\u001d\u0018\u009dº¢ÑßÞÔßêså\u0096ç\u0011O1TÕåïõ,\u001cþ \u0019FyÒ=\u0093´Ú\u001d¨Qw½C0Mº#ûN\u0099¾©XKTÐ\u008e*_È°(á\u0091Âõ\u0081Û¤@\u008d±ÄÉ@à$\u00ad\u008c¹òéê\u0007;BðE¸WuõÙc¥b*\u0088Õ]T\u0006\u0010\u0084©\u0010[ì-r\u0019IwÈ\u0081äOEPxY¼CÐ)\u0017TGqPþ ,®âÆÏ«r\u0012\u0003Y3\u0019\u001b¼¼®xc¢%e£@4`.\u009363Ü§ñ\u000eÜG¾öUndZW[|Åá!¸\u001f¥·h×Ê4¾\u008bÌÓ9\u0093Õ\u0082MÀ\u0084®\u0098\u0098\u009dfrnÁKNs/\u001f\u008bFÞæÀóQ\u000eÆ\u0088\u008aê£\u0099\bäÏ?JYgüÜ`\u0002¸\u009b\t²xH\u0091\u0014E¼\u0092\u009aù\u0014¦\u0097C}J\u0001cQ\u001bE¡\u009eälú¼õú\u0091)N¿Ð¤bæÿR®héð±ú¿¶¸À-\u0099ûËØåmG\u008dì©á?\u0005;ÄÓ§½þ5^¯{³86oä\u001fJ\u000e\u0013.Ñÿè)Á\u009aU\u0015Ú\u0012¬/½Ë É\u0004³zN\u0088\u00923\u0084Ð\u0095³EÈeî\u0098^µ\u009c\u0090,\u008fà\u0018fæV\u009a\u00943¢ËnõEç\tIÛ5..w\u0093.{aò üÝO¦W\u008e\u009c\u0012åÜ\bc\\\u0083\u001d².W.ÆéT\næ\u0018ÀLUñ\u0015\u009aæ8> ½#vðI\u001b\u008e+«\u001b½[´ÆÌ\u0003sì^û\u001d³[ei\u00156ÿ\u0081\u00132v!1¥_('å3z¶iÙ\u008eà\u0017\u0018i/£ÍIð\u00102e\u0013\u0083ök·\u009fÖØ\u0083ì \u0088èÛ \u000eôÙ\u007fð¾\u0014\u0086\u0004I\u008d1j\u0082Wé\u00042ígr®Vÿñ\u0086(\u0084EÍõE\u0018Ù>\u0081dq\u008bAjØ \u009c!å\n%I\u0081¢ûOù¨<< ÞóW8â_ë\u009f\u008bxÉjÿ\u001cùhÓj82ç\u0016-#e\u0002\u009e«\u000f\u0010ûåpøÕâ\u0007\fTÛ\u009c±4\u0000\u0080wdð²¶°º\u000e\u0096³]åáá:ë¸£\u009bOõI~Ä*>y\u0001Xs¨!è *¿\u0012\u000bµø-¥[\u001euv\u0018ÿ²@ç\u0001áÂ{ð2µ>u\u0003Ð¾ÝÐsyÁÇú)\u001eö\u0005H`GößºìØtÊÒ£\u000e\u0099y\u001c\nip\u001bþG.m\u0093¬\u0018T ÔöóH0Å®~\u0080\u007fû±õMxc=Fg¶¾\u0017\u0010#IG_¤Ä¥Q\u0086ºùS\u0096\u009b¨4 \u0003\u0092\u0099\u0017z\u0097éf\fË%÷`m©,àö:¾P).æÝµ\u0013&wÝ]g\u0018P\u001aÞ¸´å\u0081ë\u0005D\u0002rº\u0098,²åîè>½\u0090?p\u0018\u007f\u0085é\u0096\u008b»ahäã\u0007ØVh\u0083·ð@'I\u008fJÍ0\u0018\u0098Ö\u009b\u0087E¨#+0B\u000fCTæª¾Â\u009bÕ\u0019P\u0005ý¢ Ml\u0089\u0094J\r@fÿ»ý\u0007d\u0098e-\u0096\u0005jO`[½yÀú\u0082Ø`;cn\u0010ìÞ\u0016ß\u0085v\u0091²Y²\u0082\u0081\u000e`ª\u0094 \"P\u0012«Ztv3Ú\u0018:\u0098?\u0098cÇ\u0011\u008f\u008fhÌ³¡\u0015\u008fBßhWFM«(µÜ3Ô\f\u0013¡¤\u009e\u0016$¦\u0093ÚÙ\u0003;\u001cÝ¹\u001b\u001c\u000eÔË^:tF\u008aIÞ\u008e7pq%¬'Æ ü&²B\u001aÌ¼\t\u0092Ó½\u0094ùô\u0090YøA\u0083W$L\u0096ÂlÈi¿±ÆQJ @ºÆ\u0096_ìw}\u008b²\u008f\u009c®À\u008c¨fLkï»ÌöIG\u0012dqpKþ) b\u001b~\u0089\u008eU \u007f\u0000p±o\u009b\u001aà\u0012i\u000eªF*\u001cÍ»xñ`Os\u0090<s\u0010K\u0080âzÕ]\u0001\u001aÏêË\u0099y«,\u0018(x\u009a\u0093û£í\u008aÜ¹úÔñÌ\u0092T\\±âûõ\u0005\u0086\u0095\t»\u0091\u0090\u0087\u0010X\u0099þ§¤.¼=\u0093\u0090ú8¬X\u0002\u0096¼y\u001eÆ\u0006\u008d±Ö,usdþ\rs}§q©K<\fµH>QÞ\u0092Õ\u0000\fn~L*ªXUeP\\oÓÉ\u0092ú\u0082þ\u0011Ä\u0012\u00928»\u0014Äè\u001f\u008eá\u0091Á\u0015q\u0001òv4éß¾åAo\u008e\t2înP\u0084±\u0004 hû\u001bLy#v\u001a\u0004ðüN,\u001fg\u0095ÓN\u000eà\u001d~ò·¨(ÞË\u0017¼\u000e\u009cnWF\u0004\u0088²\u008e\u0007ìãz\u001fÇ\u00061\u0005ÙÞèÉ\u0082\u008d[õùØ\u000e>i\fý4o\\ °7\f±k\u008eº[Ô[IÎòÉ¾\u0090@l\u009a.äP»&('På\u000fñ\u0097] ék\u001b²»[\"ZQ\u0001ÅJ\f\t\u001dusX\u0001\u009eÈl7\u00930Vs§þ\u0006\u007fe";
        int length = "UÄ\u0003Á°%)mZ\n\u0081\u0082\n\u0092K\u0083`ë'z·\u009c¿\u009c]\u0014'Æb\u0092ÄH8Þ\u001eu°aýZ¥r\u001aÈ\u008f\u000eñxEÖ\u0080á\u0007;b÷¸\u008cÔ®\u0006\u008dug-r(Õ\u001c3ó¿ò÷\u001a\u0094[Î¢²å÷ÍH8d[ýÐ\u0010\u0092J!R\u0087E\u007fHÏ;æ\u0086âç_- î4dù0\u0005\u0099\u007fÖ\u0094'GíäÍ\u00074\f,¼ßÏÂü\u0081ú\u008dS â\u009d\b\u0018ûE\u0012#h\u001fØ\u0084\u0083K\u0003éçD\u001eËÂ,y\u0080)\u009dAÿ\u0010µáK1%åa0ÐAi\u0092'\u0019\u00834\u0018d¬.[XãØ\"µï¼l©käëÙ\f?Åï\u0081¥\f 4xéd\u0085\"\u0012³÷Ø\u0089õpæx=R)JË/ìJpÅkJÊ±å>Æ\u0010)|é\u0015QU\u0089\u0080äa\u0013\u009bwJ\u001a\u001d\u0018\u009dº¢ÑßÞÔßêså\u0096ç\u0011O1TÕåïõ,\u001cþ \u0019FyÒ=\u0093´Ú\u001d¨Qw½C0Mº#ûN\u0099¾©XKTÐ\u008e*_È°(á\u0091Âõ\u0081Û¤@\u008d±ÄÉ@à$\u00ad\u008c¹òéê\u0007;BðE¸WuõÙc¥b*\u0088Õ]T\u0006\u0010\u0084©\u0010[ì-r\u0019IwÈ\u0081äOEPxY¼CÐ)\u0017TGqPþ ,®âÆÏ«r\u0012\u0003Y3\u0019\u001b¼¼®xc¢%e£@4`.\u009363Ü§ñ\u000eÜG¾öUndZW[|Åá!¸\u001f¥·h×Ê4¾\u008bÌÓ9\u0093Õ\u0082MÀ\u0084®\u0098\u0098\u009dfrnÁKNs/\u001f\u008bFÞæÀóQ\u000eÆ\u0088\u008aê£\u0099\bäÏ?JYgüÜ`\u0002¸\u009b\t²xH\u0091\u0014E¼\u0092\u009aù\u0014¦\u0097C}J\u0001cQ\u001bE¡\u009eälú¼õú\u0091)N¿Ð¤bæÿR®héð±ú¿¶¸À-\u0099ûËØåmG\u008dì©á?\u0005;ÄÓ§½þ5^¯{³86oä\u001fJ\u000e\u0013.Ñÿè)Á\u009aU\u0015Ú\u0012¬/½Ë É\u0004³zN\u0088\u00923\u0084Ð\u0095³EÈeî\u0098^µ\u009c\u0090,\u008fà\u0018fæV\u009a\u00943¢ËnõEç\tIÛ5..w\u0093.{aò üÝO¦W\u008e\u009c\u0012åÜ\bc\\\u0083\u001d².W.ÆéT\næ\u0018ÀLUñ\u0015\u009aæ8> ½#vðI\u001b\u008e+«\u001b½[´ÆÌ\u0003sì^û\u001d³[ei\u00156ÿ\u0081\u00132v!1¥_('å3z¶iÙ\u008eà\u0017\u0018i/£ÍIð\u00102e\u0013\u0083ök·\u009fÖØ\u0083ì \u0088èÛ \u000eôÙ\u007fð¾\u0014\u0086\u0004I\u008d1j\u0082Wé\u00042ígr®Vÿñ\u0086(\u0084EÍõE\u0018Ù>\u0081dq\u008bAjØ \u009c!å\n%I\u0081¢ûOù¨<< ÞóW8â_ë\u009f\u008bxÉjÿ\u001cùhÓj82ç\u0016-#e\u0002\u009e«\u000f\u0010ûåpøÕâ\u0007\fTÛ\u009c±4\u0000\u0080wdð²¶°º\u000e\u0096³]åáá:ë¸£\u009bOõI~Ä*>y\u0001Xs¨!è *¿\u0012\u000bµø-¥[\u001euv\u0018ÿ²@ç\u0001áÂ{ð2µ>u\u0003Ð¾ÝÐsyÁÇú)\u001eö\u0005H`GößºìØtÊÒ£\u000e\u0099y\u001c\nip\u001bþG.m\u0093¬\u0018T ÔöóH0Å®~\u0080\u007fû±õMxc=Fg¶¾\u0017\u0010#IG_¤Ä¥Q\u0086ºùS\u0096\u009b¨4 \u0003\u0092\u0099\u0017z\u0097éf\fË%÷`m©,àö:¾P).æÝµ\u0013&wÝ]g\u0018P\u001aÞ¸´å\u0081ë\u0005D\u0002rº\u0098,²åîè>½\u0090?p\u0018\u007f\u0085é\u0096\u008b»ahäã\u0007ØVh\u0083·ð@'I\u008fJÍ0\u0018\u0098Ö\u009b\u0087E¨#+0B\u000fCTæª¾Â\u009bÕ\u0019P\u0005ý¢ Ml\u0089\u0094J\r@fÿ»ý\u0007d\u0098e-\u0096\u0005jO`[½yÀú\u0082Ø`;cn\u0010ìÞ\u0016ß\u0085v\u0091²Y²\u0082\u0081\u000e`ª\u0094 \"P\u0012«Ztv3Ú\u0018:\u0098?\u0098cÇ\u0011\u008f\u008fhÌ³¡\u0015\u008fBßhWFM«(µÜ3Ô\f\u0013¡¤\u009e\u0016$¦\u0093ÚÙ\u0003;\u001cÝ¹\u001b\u001c\u000eÔË^:tF\u008aIÞ\u008e7pq%¬'Æ ü&²B\u001aÌ¼\t\u0092Ó½\u0094ùô\u0090YøA\u0083W$L\u0096ÂlÈi¿±ÆQJ @ºÆ\u0096_ìw}\u008b²\u008f\u009c®À\u008c¨fLkï»ÌöIG\u0012dqpKþ) b\u001b~\u0089\u008eU \u007f\u0000p±o\u009b\u001aà\u0012i\u000eªF*\u001cÍ»xñ`Os\u0090<s\u0010K\u0080âzÕ]\u0001\u001aÏêË\u0099y«,\u0018(x\u009a\u0093û£í\u008aÜ¹úÔñÌ\u0092T\\±âûõ\u0005\u0086\u0095\t»\u0091\u0090\u0087\u0010X\u0099þ§¤.¼=\u0093\u0090ú8¬X\u0002\u0096¼y\u001eÆ\u0006\u008d±Ö,usdþ\rs}§q©K<\fµH>QÞ\u0092Õ\u0000\fn~L*ªXUeP\\oÓÉ\u0092ú\u0082þ\u0011Ä\u0012\u00928»\u0014Äè\u001f\u008eá\u0091Á\u0015q\u0001òv4éß¾åAo\u008e\t2înP\u0084±\u0004 hû\u001bLy#v\u001a\u0004ðüN,\u001fg\u0095ÓN\u000eà\u001d~ò·¨(ÞË\u0017¼\u000e\u009cnWF\u0004\u0088²\u008e\u0007ìãz\u001fÇ\u00061\u0005ÙÞèÉ\u0082\u008d[õùØ\u000e>i\fý4o\\ °7\f±k\u008eº[Ô[IÎòÉ¾\u0090@l\u009a.äP»&('På\u000fñ\u0097] ék\u001b²»[\"ZQ\u0001ÅJ\f\t\u001dusX\u0001\u009eÈl7\u00930Vs§þ\u0006\u007fe".length();
        char cCharAt = ' ';
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i7 = i4;
                        i4++;
                        strArr[i7] = strIntern;
                        int i8 = i6 + cCharAt;
                        i2 = i8;
                        if (i8 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            b = strArr;
                            c = new String[45];
                            i = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[25];
                            int i10 = 0;
                            String str3 = "öõ#±¥On\u008b¯Ä\u0001¼Y¦£\u000bÿ¼\u009dovíKq`î\r«qLä\u0011ÿ\u0089.°9W\u000b\u008b1¦\u0095w\u007f\u009a\u0011}5Ê\u0013`Øiïc\u0091Ù½\"\u0004\tK°7\u0005À\u0086Wèñg×{Õ\u001dþþì÷¿\u0099øfr?AãÆæ·p\u008có\u0017ºTWäûêA3Þ\u009aÔ\u008b\u0083·U\u0082#þrD·PQNØ¥Ìâ1ï¹Îá\u0005\u0000Z\u009eÂ0«Sf\u0002(\u0006ÍT\u00adW\u0085\u009aEÃi9d\u0010\rí-êØÞ19ã¨QLãÕß\u0091\u0019Á¯\u0019MAü\u0084uAd\u000fü>Ig";
                            int length2 = "öõ#±¥On\u008b¯Ä\u0001¼Y¦£\u000bÿ¼\u009dovíKq`î\r«qLä\u0011ÿ\u0089.°9W\u000b\u008b1¦\u0095w\u007f\u009a\u0011}5Ê\u0013`Øiïc\u0091Ù½\"\u0004\tK°7\u0005À\u0086Wèñg×{Õ\u001dþþì÷¿\u0099øfr?AãÆæ·p\u008có\u0017ºTWäûêA3Þ\u009aÔ\u008b\u0083·U\u0082#þrD·PQNØ¥Ìâ1ï¹Îá\u0005\u0000Z\u009eÂ0«Sf\u0002(\u0006ÍT\u00adW\u0085\u009aEÃi9d\u0010\rí-êØÞ19ã¨QLãÕß\u0091\u0019Á¯\u0019MAü\u0084uAd\u000fü>Ig".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j6 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j7 = j6;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j7 >>> 56), (byte) (j7 >>> 48), (byte) (j7 >>> 40), (byte) (j7 >>> 32), (byte) (j7 >>> 24), (byte) (j7 >>> 16), (byte) (j7 >>> 8), (byte) j7});
                                    long j8 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j8;
                                            if (i11 >= length2) {
                                                f = jArr;
                                                g = new Integer[25];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8737, 6805225442735542740L ^ j) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(q5.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11055, 7655263602794801309L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19666, 3193316303565410164L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(q5.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3288, 2608739403082108797L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19869, 6896857195022306859L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(q5.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8311, 2044713136429310918L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2196, 2221659568775990020L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(q5.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29608, 1352085694675251208L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17244, 7750836826941800653L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(q5.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5784, 5565509658162926887L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4294, 7109240661770408801L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(q5.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29864, 1648030847094912773L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26838, 4957079262296664899L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7706, 5776648740478381546L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q5.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19456, 1114310264140156856L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11673, 3219339911810821683L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25310, 7837123866892407103L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q5.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(421, 7292000708721508891L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22780, 8537611778826787663L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27009, 6355499019634416227L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q5.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18023, 2200123909289592307L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9485, 8687243069302974111L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17721, 2484643423601506010L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q5.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19900, 8409783170686242322L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23492, 9148518192485095532L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21508, 3496335841824155639L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q5.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14174, 792519537409635555L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11516, 9121190702210494304L ^ j) /* invoke-custom */, 0));
                                                I = kPropertyArr;
                                                E = new q5(j4);
                                                t = yp.L(E, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29869, 8978016662191273754L ^ j) /* invoke-custom */, cn.XP, null, null, (int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25754, 5594525166692669309L ^ j) /* invoke-custom */, null, j5);
                                                u = yp.L(E, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6418, 2534929908889688765L ^ j) /* invoke-custom */, cn.PEARL, null, null, (int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25754, 5594525166692669309L ^ j) /* invoke-custom */, null, j5);
                                                T = yp.L(E, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(394, 463227450412630574L ^ j) /* invoke-custom */, cn.FRIEND, null, null, (int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25754, 5594525166692669309L ^ j) /* invoke-custom */, null, j5);
                                                e = yp.L(E, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10798, 6579131167610612108L ^ j) /* invoke-custom */, cn.FIREWORK, null, null, (int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25754, 5594525166692669309L ^ j) /* invoke-custom */, null, j5);
                                                A = yp.t(E, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26224, 2084164715174946245L ^ j) /* invoke-custom */, true, j2, null, null, (int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25754, 5594525166692669309L ^ j) /* invoke-custom */, null);
                                                n = yp.t(E, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30246, 2984966928407360952L ^ j) /* invoke-custom */, true, j2, null, null, (int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25754, 5594525166692669309L ^ j) /* invoke-custom */, null);
                                                D = yp.L(E, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4551, 3791252713774977651L ^ j) /* invoke-custom */, (int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1066, 492917466124253139L ^ j) /* invoke-custom */, new IntRange(0, (int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4522, 7960890724485522014L ^ j) /* invoke-custom */), j3, null, q5::v, (int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23890, 826416578073079478L ^ j) /* invoke-custom */, null);
                                                h = yp.t(E, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28974, 2122893519890313907L ^ j) /* invoke-custom */, true, j2, null, null, (int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25754, 5594525166692669309L ^ j) /* invoke-custom */, null);
                                                x = yp.L(E, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28950, 518422978938598061L ^ j) /* invoke-custom */, (int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4151, 7135510341094007756L ^ j) /* invoke-custom */, new IntRange(0, (int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6015, 8645554460098323607L ^ j) /* invoke-custom */), j3, null, null, (int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12438, 6757638441232024423L ^ j) /* invoke-custom */, null);
                                                X = yp.L(E, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22385, 2989474837694207210L ^ j) /* invoke-custom */, 1, new IntRange(1, (int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17642, 4445660002485122844L ^ j) /* invoke-custom */), j3, null, null, (int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5000, 1491684237622206578L ^ j) /* invoke-custom */, null);
                                                L = yp.t(E, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16714, 3099332994880357085L ^ j) /* invoke-custom */, true, j2, null, null, (int) c(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25754, 5594525166692669309L ^ j) /* invoke-custom */, null);
                                                y = new bg();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j8;
                                            if (i11 >= length2) {
                                                str3 = "3Åvß)j\u0015>\u009f\u0018ÒÎú\u0004ª\u0014";
                                                length2 = "3Åvß)j\u0015>\u009f\u0018ÒÎú\u0004ª\u0014".length();
                                                i11 = 0;
                                            }
                                            break;
                                    }
                                    int i15 = i11;
                                    i11 += 8;
                                    byte[] bytes2 = str3.substring(i15, i11).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i13 = i10;
                                    i10++;
                                    j6 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i16 = i4;
                        i4++;
                        strArr[i16] = strIntern;
                        int i17 = i6 + cCharAt;
                        i5 = i17;
                        if (i17 < length) {
                        }
                        str = "\u008bÌY©\u0004\u009d¿$OkÏ9ÕäiÛ\u0086\u0086¼EQ)_õ³=l\u0016\u001c?\"6\u008f.ßY¾\u0081ëÈ\u0018±Ã\u0015zP\u0018\u0094¡ïv\u0006\u0084%}eD\u0083Ø\u0013Æf\u0084±\t";
                        length = "\u008bÌY©\u0004\u009d¿$OkÏ9ÕäiÛ\u0086\u0086¼EQ)_õ³=l\u0016\u001c?\"6\u008f.ßY¾\u0081ëÈ\u0018±Ã\u0015zP\u0018\u0094¡ïv\u0006\u0084%}eD\u0083Ø\u0013Æf\u0084±\t".length();
                        cCharAt = '(';
                        i2 = -1;
                        break;
                        break;
                }
                i6 = i2 + 1;
                strSubstring = str.substring(i6, i6 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i5);
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
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

    private static String b(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 21207;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/q5", e2);
            }
        }
        return c[i3];
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
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
            r1 = 1073741824(0x40000000, float:2.0)
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
            java.lang.String r1 = "su/catlean/q5"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q5.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 8848;
        if (g[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/q5", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            g[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return g[i3].intValue();
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iC)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iC;
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
    private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = 1073741824(0x40000000, float:2.0)
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
            java.lang.String r1 = "su/catlean/q5"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q5.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
