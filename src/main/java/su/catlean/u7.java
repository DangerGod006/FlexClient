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
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/u7.class */
public final class u7 extends _g {

    @NotNull
    public static final u7 G;
    static final KProperty[] K;

    @NotNull
    private static final cw A;

    @NotNull
    private static final cw J;

    @NotNull
    private static final c8 w;

    @NotNull
    private static final cq o;

    @NotNull
    private static final cq h;

    @NotNull
    private static final cq c;

    @NotNull
    private static final cq i;

    @NotNull
    private static final cq L;

    @NotNull
    private static final cq g;

    @NotNull
    private static final bg W;
    private static boolean e;
    private static int u;
    private static int k;
    private static boolean j;
    private static final long a = yz.a(2583107197582518083L, 377041133615913263L, MethodHandles.lookup().lookupClass()).a(13217624884272L);
    private static final String[] b;
    private static final String[] d;
    private static final Map f;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;

    /* JADX WARN: Illegal instructions before constructor call */
    private u7(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2500, 3810197544761772950L ^ j3) /* invoke-custom */, jt.V(), null, 4, null, j3 ^ 70142685120227L);
    }

    private final lh n(long j2) {
        return (lh) A.E(this, (a ^ j2) ^ 88662254727012L, K[0]);
    }

    private final mo e(int i2, int i3) {
        return (mo) J.E(this, (((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ a) ^ 47219425717710L, K[1]);
    }

    private final int z(long j2) {
        return ((Number) w.E(this, (a ^ j2) ^ 44909745821283L, K[2])).intValue();
    }

    private final boolean j(long j2, byte b2) {
        return ((Boolean) o.E(this, (((j2 << 8) | ((((long) b2) << 56) >>> 56)) ^ a) ^ 62285603029081L, K[3])).booleanValue();
    }

    private final boolean G(long j2) {
        return ((Boolean) h.E(this, (a ^ j2) ^ 74502028888792L, K[4])).booleanValue();
    }

    private final boolean P(int i2, short s, short s2) {
        return ((Boolean) c.E(this, ((((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ a) ^ 123495054977910L, K[5])).booleanValue();
    }

    private final boolean T(int i2, char c2, char c3) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) c3) << 48) >>> 48)) ^ a;
        return ((Boolean) i.E(this, j2 ^ 78035368524797L, K[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24654, 7694470171334181275L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean W(long j2) {
        long j3 = a ^ j2;
        return ((Boolean) L.E(this, j3 ^ 17543113813653L, K[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1115, 4573794888152903919L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean C(long j2) {
        long j3 = a ^ j2;
        return ((Boolean) g.E(this, j3 ^ 27969775140654L, K[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(712, 9197782512973752280L ^ j3) /* invoke-custom */])).booleanValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0255: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    public final void M(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.player.PlayerUpdateEvent r14) {
        /*
            Method dump skipped, instruction units count: 1799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u7.M(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0060: INVOKE (r-1 I:su.catlean._8), (r0 I:long), (r1 I:su.catlean.t5) VIRTUAL call: su.catlean._8.C(long, su.catlean.t5):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void q(long r18, su.catlean.fg r20) {
        /*
            r17 = this;
            long r0 = su.catlean.u7.a
            r1 = r18
            long r0 = r0 ^ r1
            r18 = r0
            r0 = r18
            r1 = r0; r1 = r0; 
            r2 = 80495072620600(0x4935b835b038, double:3.9769850041335E-310)
            long r1 = r1 ^ r2
            r21 = r1
            r1 = r0; r2 = r0; 
            r2 = 109607861832051(0x63b011ab4973, double:5.41534790453304E-310)
            long r1 = r1 ^ r2
            r23 = r1
            r1 = r0; r2 = r0; 
            r2 = 120055638318528(0x6d30a1acddc0, double:5.93153664827266E-310)
            long r1 = r1 ^ r2
            r25 = r1
            r1 = r0; r2 = r0; 
            r2 = 114271359769552(0x67eddfce9bd0, double:5.6457553165701E-310)
            long r1 = r1 ^ r2
            r27 = r1
            su.catlean._8 r0 = su.catlean._8.P
            su.catlean.t5 r1 = new su.catlean.t5
            r2 = r1
            su.catlean._w r3 = new su.catlean._w
            r4 = r3
            r5 = r27
            net.minecraft.class_746 r5 = su.catlean.zf.v(r5)
            float r5 = r5.method_36454()
            r6 = r23
            r7 = 1119092736(0x42b40000, float:90.0)
            r8 = 0
            r9 = 0
            r10 = 528(0x210, float:7.4E-43)
            r11 = 8979426153559612545(0x7c9d5482f9c5dc81, double:1.8293200882878638E292)
            r12 = r18
            long r11 = r11 ^ r12
            int r10 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/u7;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "n"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r10, r11)
            r11 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r4 = r25
            r5 = 0
            r6 = r20
            void r6 = () -> { // kotlin.jvm.functions.Function0.invoke():java.lang.Object
                return O(r6);
            }
            r7 = 2
            r8 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r2 = r21
            r3 = r2; r2 = r1; r1 = r3; 
            r-1.C(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u7.q(long, su.catlean.fg):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.gw] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private final void q(fg fgVar, int i2, class_2338 class_2338Var, int i3) {
        long j2 = ((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ a;
        long j3 = j2 ^ 28554508455658L;
        long j4 = j2 ^ 79035517647300L;
        long j5 = j2 ^ 110754657570551L;
        long j6 = j2 ^ 115695749632556L;
        Object obj = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4544563722850544667L, j2) /* invoke-custom */;
        try {
            obj = gw.Y;
            t5 t5VarP = gw.P(obj, class_2338Var, fgVar.a(), C(j3) ? xx.GRIM : xx.Strict, zr.Normal, y4.ALL, (float) zf.v(j6).method_55754(), 0.0f, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12952, 1365171996376983026L ^ j2) /* invoke-custom */, j5, yi.Silent, null, false, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9732, 2958668976395383140L ^ j2) /* invoke-custom */, null);
            if (obj == 0 || t5VarP == null) {
                return;
            }
            _8.P.C(j4, t5VarP);
            W.l();
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -4548579216734986657L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final boolean a(long r9) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u7.a(long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010f A[Catch: NoWhenBranchMatchedException -> 0x0130, TRY_LEAVE, TryCatch #1 {NoWhenBranchMatchedException -> 0x0130, blocks: (B:47:0x0100, B:49:0x010f), top: B:82:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [su.catlean.lh] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [su.catlean.mixins.accessors.ServerboundMovePlayerPacketAccessor] */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v56, types: [su.catlean.lh] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58, types: [int] */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [su.catlean.mixins.accessors.ServerboundMovePlayerPacketAccessor] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v0 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.network.SendPacket r9) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u7.L(su.catlean.api.event.events.network.SendPacket):void");
    }

    private final void K(long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 106003818183897L;
        zf.v(j3 ^ 71250929742591L).method_5728(false);
        zf.F(j4).field_1690.field_1894.method_23481(false);
        zf.F(j4).field_1690.field_1881.method_23481(false);
        zf.F(j4).field_1690.field_1913.method_23481(false);
        zf.F(j4).field_1690.field_1849.method_23481(false);
        zf.F(j4).field_1690.field_1903.method_23481(false);
    }

    @Override // su.catlean._g
    public void O(long j2) {
        j = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.mo] */
    private static final boolean w() {
        long j2 = a ^ 33007234150993L;
        Object objE = j2;
        try {
            objE = G.e((int) (objE >>> 32), (int) (((objE ^ 127781845996443L) << 32) >>> 32));
            return objE == mo.Custom;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objE, -3498895586532503090L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.lh] */
    private static final boolean r() {
        long j2 = a ^ 73877691823196L;
        Object objN = j2;
        try {
            objN = G.n(objN ^ 91616102881084L);
            return objN == lh.Items;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 5295160267807184835L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.u7] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean I() {
        /*
            long r0 = su.catlean.u7.a
            r1 = 28044393254986(0x19819819104a, double:1.38557712657506E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 107635533847575(0x61e4d9c29c17, double:5.31790195458695E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 8
            long r2 = r2 >>> r3
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 56
            long r2 = r2 << r3
            r3 = 56
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 10868092728106(0x9e26cce732a, double:5.369551252774E-311)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -5952581585504649617(0xad642e960b76be6f, double:-4.9537605707813365E-90)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.u7 r0 = su.catlean.u7.G     // Catch: kotlin.NoWhenBranchMatchedException -> L47
            r1 = r15
            if (r1 == 0) goto L61
            r1 = r13
            su.catlean.lh r0 = r0.n(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L47 kotlin.NoWhenBranchMatchedException -> L57
            su.catlean.lh r1 = su.catlean.lh.Items     // Catch: kotlin.NoWhenBranchMatchedException -> L47 kotlin.NoWhenBranchMatchedException -> L57
            if (r0 != r1) goto L81
            goto L51
        L47:
            r1 = -5950826842400082987(0xad6a6a8402e233d5, double:-6.483949507746648E-90)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L57
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L57
        L51:
            su.catlean.u7 r0 = su.catlean.u7.G     // Catch: kotlin.NoWhenBranchMatchedException -> L57
            goto L61
        L57:
            r1 = -5950826842400082987(0xad6a6a8402e233d5, double:-6.483949507746648E-90)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L61:
            r1 = r10
            r2 = r12
            byte r2 = (byte) r2     // Catch: kotlin.NoWhenBranchMatchedException -> L73
            boolean r0 = r0.j(r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L73
            r1 = r15
            if (r1 == 0) goto L7e
            if (r0 == 0) goto L81
            goto L7d
        L73:
            r1 = -5950826842400082987(0xad6a6a8402e233d5, double:-6.483949507746648E-90)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L7d:
            r0 = 1
        L7e:
            goto L82
        L81:
            r0 = 0
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u7.I():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.lh] */
    private static final boolean s() {
        long j2 = a ^ 90720037965404L;
        Object objN = j2;
        try {
            objN = G.n(objN ^ 73536608955708L);
            return objN == lh.Items;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, -5513494975853613629L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.lh] */
    private static final boolean V() {
        long j2 = a ^ 114304477530550L;
        Object objN = j2;
        try {
            objN = G.n(objN ^ 131487757298390L);
            return objN == lh.Items;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 3789239157759191593L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.lh] */
    private static final boolean F() {
        long j2 = a ^ 14712037467350L;
        Object objN = j2;
        try {
            objN = G.n(objN ^ 31897062410166L);
            return objN == lh.Items;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, -2740864351165528247L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.lh] */
    private static final boolean Z() {
        long j2 = a ^ 31598148941314L;
        Object objN = j2;
        try {
            objN = G.n(objN ^ 14151659689314L);
            return objN == lh.Items;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, -3809359496077486691L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, net.minecraft.class_1269] */
    private static final Unit O(fg fgVar) {
        long j2 = a ^ 70858319187859L;
        long j3 = j2 ^ 135625241489591L;
        long j4 = j2 ^ 74275287752414L;
        long j5 = j2 ^ 121441701686379L;
        long j6 = j2 ^ 91265735342723L;
        long j7 = j2 ^ 115451469013119L;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8267895772765118902L, j2) /* invoke-custom */;
        gg.P.o(j4);
        fgVar.x(j6);
        Object objX = ag.x(class_1268.field_5808, zf.v(j7).method_36454(), j3, 90.0f);
        try {
            objX = str;
            if (objX != 0) {
                try {
                    objX = Intrinsics.areEqual((Object) objX, class_1269.field_5811);
                    if (objX == 0) {
                        W.l();
                    }
                    zf.v(j7).method_6104(class_1268.field_5808);
                    gg.P.d(j5);
                } catch (NoWhenBranchMatchedException unused) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, 8265006316176206860L, j2) /* invoke-custom */;
                }
            }
            return Unit.INSTANCE;
        } catch (NoWhenBranchMatchedException unused2) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, 8265006316176206860L, j2) /* invoke-custom */;
        }
    }

    static {
        int i2;
        long j2 = a ^ 68673379558980L;
        long j3 = j2 ^ 35783192883326L;
        long j4 = j2 ^ 69483070787955L;
        long j5 = j2 ^ 18238157626389L;
        long j6 = j2 ^ 90073388623521L;
        f = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[38];
        int i4 = 0;
        String str = "ÚµÕ\u008695HGÚÕ½J©ia\u000fXH\u0013\u0085ðDLò\u0090v¿¨,,ç\u000e ºJT%iýàUNõ\u00014²1\u008b\u0093\u008fÕ)Ëv¨#m¨:#z\u0011Ü\u009f¿¦ý÷§ð[÷.ÅÑAç\u009d` Ôð\u009fÀ{$oP¸\u0088çÝÖ\u009c:\u0016\ruT\u0086\u0095gOc3)¶åV\u0003\u0016ÆM`ynl9zü6xg\u0006õð3\u0017'v\u007f\u0088\u0083\"\u0093´\u001d|äz\u009d\u0093\u008e¤\u001c9\u008f·×+Ï\u0092h.p%ø\u0017<\u0085\u0087E²¤\u008eå\u0099Ww§÷\u0005¸¨j®Sr#º÷\fì\u008a¡ ª\u009b[!}²K\u0010¨HÃ M1\u0084\u008e¯\u0091Ï\u0018\\\u001e\u0015\u008a\u0010<a\u0093¸\u0014!}õK\u0094,»\u0019c«( bÌ§!í\u0083?ä\u0091Ï*ªð÷ÂÎão\u0016l'\u001cè°\u000bïF.\u009drâ\u001f\u0018\u0096\u001daÝæ-²x>_ÎiÄ=\u001fj\u008cnº§©(\u0092\u001a\u0018ú\u001f?¢e\u0090\u0080~§'\u0087_Mâ\u0090òez\u0086\u0097Ñtøª Þ\u009aÑVÿ\u001d\u009f\u008e·\u0091\u0013f/\u0093K\\åvõQV\u009bªÔxV^ã\u0089²A® ÄÃÜiè\u009b\u001e!n\u0099\u001bÃ#Ø\u0003§'\u0018·0Äç¼ñ\u0081\u001a\u009b\\é\u0082ïC \r\u000e7¶æ\fpÊ°,É\u008a\u0000Ø~\u009bê²Ùm\u0097\u0086ßà\u007f'}¸{øó\u0080 ývª½b\u0006Ó\bËÚð\né!Ü¬²ãÚMFPb;Óñ4\u001f\u0002\u00adÒ.(0\u0000\u00966\u009e·\u0010\u0007»é²\u0003ºÌ·s×:ÿ¨Rh\u0015\u009bú¬\\øwÃ\u008d\u000b\u0084\u008eØõÀÜeÎ\u00186ïÙÈ\u0093T\u0086ò\bd`¤dò.\u008fø\u008bp2µjæ\u0092 ¶\u008bsE¢:ãÐ~p¤/¥\u0000Î\u008b\\\táÔ ®n^Ê\b\u0005\u0013ò¦óF\u0018S\u008a/ÖI\u007fïmd2uÒv4±g,}ª\u0088BüÛó Ô\u0096J?\u009c«.`a\u00ad§\u0091ÖJë\u0010\u009cæ«Z#ï¤Ô\u000e¬\u008cå\u0019ò`s8Ê\u009fÒ\u0099\u000fH\u0017Í\u0091\u0012ª3>\u0003¥Ñ³ã¯/§Å¦\u000eR^søW}G\bz3'?©,R×Ç\u0091æh¬U|îð0,\u0000\u001a'3~\u0010C¬ø\u0004ÆÈBH\u00ad ãzÀr\u0099\u0010(R\u0013\u009b1ï?9r\u0099é¨T\u000f\u0099M«\u000b'êÇ\u0003îìc\u000fª°+\u000fÈC\u008cQ\u0000¾\u0085\u009a\u0080Ý1 h_JOgÚ\\Óßû\u009b\u0001+Å>\u0098°\u0098C½¯\u0092e\u009dã\u0090¡\u009d^¿a¿éx·õ\u009c÷ñ\u0094$/T\u0011\u0013_ \u000fµ¾Fº*úÓH3«¥\u0093t¡iæLº\u0085Y±Å\u009b\u008dÅ3|rbî\rÌ\u0002=JX\u0097à\u0016Óá1\u0085G\u008aq\u008f\u0017®Â\u007f\u0093ÜSk^Ü:¼Æµo«sC\u007f~?\u00858\u000b.æF\u009f#u©L\u0084\u0092\u007f\u0091´:\u007f\u0013¹\u0080Ó\u0097¤¶':é§!u@âÿVu\u0001¤d\u0098á (à\u0018Ï#|\u0096\u0007HD<\\£Î§ùÿ\u0083IR\u009eÛêðMå\f\u0010Ç%µ«P\u0007\u001b=yØÅ\u001b\u0097lr\u0095(>{m CÓ¡7\u000e\u008a¦³Ñ\u0098^D¸'\u008f\u0085ÿWslâ÷\u0019\u0096unv&.7ØùQ\u009b\u008bÞ ¡\u008fø\u0005\u0087û\u001d×brfõêwä\\.\u0013W½~ù*4¦Hb3×]U\u00ad\u0010\u000bõdÔbµwNÓbó¼Êü8¦ \u00058\\]tù«2^sH5\u0015<Ðø\u0099\u001a\u008dÀ\u0000\u008dGÛÎP\u0005 1{\u0015À\u0010ár\u0011\u001aW¬(§\u0084\u0086gëà]¦·\u0010\u0017\u0006¬WV\u008c8¶\bµ\u0083\\\u008bwf_\u0018\\k\u0016XZ\u001d4:\u0095ã#\u0090Ï5¼èzdÑëÃ O7 ¾´\u000e3\u000b#íDß\u009dg¶Fc\u0003tá$\u0000W\u009e>ò=÷\u0092\u0013\u008c2¢îX\u0010¼9Ô\u0011ÌîÁwM\u0010Í\u001béÜµÆ(O¾xA<:éÍ9ZL\u009dSä\u009e\\¾Rze\u000b[@\u0094cf:I\"N\u0086Þo\u0088ßì\nq\u0095-Hé\u008c*ýÜ\u0006uècÆ\u0083Z[ä<ð@\u008eL0\u0098\u0005×å\u0081\u008e]½Ý\u009a\u000bÌèKÖÚº\u001c¤¢ØM3;\u008d@ñÊ#B§Sµ/Ç£\u0004\u009að\u001ev\u0096ïú\u009e\u008dªq\u00842\u0004÷\u0018GáfíþÙ\u0011Fæ\u00034\f`(´ Õ:u\rmG[\u0092(<\u0098\u009a°\u0098\"õ-j\u0011éBC\b´e. \u0082¯.ÀKAÙër\u008a¬é/ð\t¿i%\bÜ\u001eå(\u009b\u001f\u0002#|û\u0097èÏù\u009f4#Ã\u001eì\u0085\nî\u008d¤4ê¾´Kx\u0081\u0005l¡UYS»c&ý\u008em";
        int length = "ÚµÕ\u008695HGÚÕ½J©ia\u000fXH\u0013\u0085ðDLò\u0090v¿¨,,ç\u000e ºJT%iýàUNõ\u00014²1\u008b\u0093\u008fÕ)Ëv¨#m¨:#z\u0011Ü\u009f¿¦ý÷§ð[÷.ÅÑAç\u009d` Ôð\u009fÀ{$oP¸\u0088çÝÖ\u009c:\u0016\ruT\u0086\u0095gOc3)¶åV\u0003\u0016ÆM`ynl9zü6xg\u0006õð3\u0017'v\u007f\u0088\u0083\"\u0093´\u001d|äz\u009d\u0093\u008e¤\u001c9\u008f·×+Ï\u0092h.p%ø\u0017<\u0085\u0087E²¤\u008eå\u0099Ww§÷\u0005¸¨j®Sr#º÷\fì\u008a¡ ª\u009b[!}²K\u0010¨HÃ M1\u0084\u008e¯\u0091Ï\u0018\\\u001e\u0015\u008a\u0010<a\u0093¸\u0014!}õK\u0094,»\u0019c«( bÌ§!í\u0083?ä\u0091Ï*ªð÷ÂÎão\u0016l'\u001cè°\u000bïF.\u009drâ\u001f\u0018\u0096\u001daÝæ-²x>_ÎiÄ=\u001fj\u008cnº§©(\u0092\u001a\u0018ú\u001f?¢e\u0090\u0080~§'\u0087_Mâ\u0090òez\u0086\u0097Ñtøª Þ\u009aÑVÿ\u001d\u009f\u008e·\u0091\u0013f/\u0093K\\åvõQV\u009bªÔxV^ã\u0089²A® ÄÃÜiè\u009b\u001e!n\u0099\u001bÃ#Ø\u0003§'\u0018·0Äç¼ñ\u0081\u001a\u009b\\é\u0082ïC \r\u000e7¶æ\fpÊ°,É\u008a\u0000Ø~\u009bê²Ùm\u0097\u0086ßà\u007f'}¸{øó\u0080 ývª½b\u0006Ó\bËÚð\né!Ü¬²ãÚMFPb;Óñ4\u001f\u0002\u00adÒ.(0\u0000\u00966\u009e·\u0010\u0007»é²\u0003ºÌ·s×:ÿ¨Rh\u0015\u009bú¬\\øwÃ\u008d\u000b\u0084\u008eØõÀÜeÎ\u00186ïÙÈ\u0093T\u0086ò\bd`¤dò.\u008fø\u008bp2µjæ\u0092 ¶\u008bsE¢:ãÐ~p¤/¥\u0000Î\u008b\\\táÔ ®n^Ê\b\u0005\u0013ò¦óF\u0018S\u008a/ÖI\u007fïmd2uÒv4±g,}ª\u0088BüÛó Ô\u0096J?\u009c«.`a\u00ad§\u0091ÖJë\u0010\u009cæ«Z#ï¤Ô\u000e¬\u008cå\u0019ò`s8Ê\u009fÒ\u0099\u000fH\u0017Í\u0091\u0012ª3>\u0003¥Ñ³ã¯/§Å¦\u000eR^søW}G\bz3'?©,R×Ç\u0091æh¬U|îð0,\u0000\u001a'3~\u0010C¬ø\u0004ÆÈBH\u00ad ãzÀr\u0099\u0010(R\u0013\u009b1ï?9r\u0099é¨T\u000f\u0099M«\u000b'êÇ\u0003îìc\u000fª°+\u000fÈC\u008cQ\u0000¾\u0085\u009a\u0080Ý1 h_JOgÚ\\Óßû\u009b\u0001+Å>\u0098°\u0098C½¯\u0092e\u009dã\u0090¡\u009d^¿a¿éx·õ\u009c÷ñ\u0094$/T\u0011\u0013_ \u000fµ¾Fº*úÓH3«¥\u0093t¡iæLº\u0085Y±Å\u009b\u008dÅ3|rbî\rÌ\u0002=JX\u0097à\u0016Óá1\u0085G\u008aq\u008f\u0017®Â\u007f\u0093ÜSk^Ü:¼Æµo«sC\u007f~?\u00858\u000b.æF\u009f#u©L\u0084\u0092\u007f\u0091´:\u007f\u0013¹\u0080Ó\u0097¤¶':é§!u@âÿVu\u0001¤d\u0098á (à\u0018Ï#|\u0096\u0007HD<\\£Î§ùÿ\u0083IR\u009eÛêðMå\f\u0010Ç%µ«P\u0007\u001b=yØÅ\u001b\u0097lr\u0095(>{m CÓ¡7\u000e\u008a¦³Ñ\u0098^D¸'\u008f\u0085ÿWslâ÷\u0019\u0096unv&.7ØùQ\u009b\u008bÞ ¡\u008fø\u0005\u0087û\u001d×brfõêwä\\.\u0013W½~ù*4¦Hb3×]U\u00ad\u0010\u000bõdÔbµwNÓbó¼Êü8¦ \u00058\\]tù«2^sH5\u0015<Ðø\u0099\u001a\u008dÀ\u0000\u008dGÛÎP\u0005 1{\u0015À\u0010ár\u0011\u001aW¬(§\u0084\u0086gëà]¦·\u0010\u0017\u0006¬WV\u008c8¶\bµ\u0083\\\u008bwf_\u0018\\k\u0016XZ\u001d4:\u0095ã#\u0090Ï5¼èzdÑëÃ O7 ¾´\u000e3\u000b#íDß\u009dg¶Fc\u0003tá$\u0000W\u009e>ò=÷\u0092\u0013\u008c2¢îX\u0010¼9Ô\u0011ÌîÁwM\u0010Í\u001béÜµÆ(O¾xA<:éÍ9ZL\u009dSä\u009e\\¾Rze\u000b[@\u0094cf:I\"N\u0086Þo\u0088ßì\nq\u0095-Hé\u008c*ýÜ\u0006uècÆ\u0083Z[ä<ð@\u008eL0\u0098\u0005×å\u0081\u008e]½Ý\u009a\u000bÌèKÖÚº\u001c¤¢ØM3;\u008d@ñÊ#B§Sµ/Ç£\u0004\u009að\u001ev\u0096ïú\u009e\u008dªq\u00842\u0004÷\u0018GáfíþÙ\u0011Fæ\u00034\f`(´ Õ:u\rmG[\u0092(<\u0098\u009a°\u0098\"õ-j\u0011éBC\b´e. \u0082¯.ÀKAÙër\u008a¬é/ð\t¿i%\bÜ\u001eå(\u009b\u001f\u0002#|û\u0097èÏù\u009f4#Ã\u001eì\u0085\nî\u008d¤4ê¾´Kx\u0081\u0005l¡UYS»c&ý\u008em".length();
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
                            d = new String[38];
                            n = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[18];
                            int i10 = 0;
                            String str3 = "ÌL\u001a3\u009eõ\u0087¸Þwqq,X¦h\u0019Uí (¹;b\u0093\u009d³\u0019Þ\u0087^GtL\u000bO\u0015CrüÞFð-ü_ÏäÏLb\u001e\u008d\u00ad|xSö\u001e\u0003|BÞJ·\u0090lzÒP\u000fÕësÉË\t\"\"Ámbï\b|³¹8Ë\u008d¾-\tÐ\u0015\u001f¨\u009f'ü¨\u0080_ghñoÊÜèÓßUà:I0jÌ\u009d34Ç\u0002qi`;";
                            int length2 = "ÌL\u001a3\u009eõ\u0087¸Þwqq,X¦h\u0019Uí (¹;b\u0093\u009d³\u0019Þ\u0087^GtL\u000bO\u0015CrüÞFð-ü_ÏäÏLb\u001e\u008d\u00ad|xSö\u001e\u0003|BÞJ·\u0090lzÒP\u000fÕësÉË\t\"\"Ámbï\b|³¹8Ë\u008d¾-\tÐ\u0015\u001f¨\u009f'ü¨\u0080_ghñoÊÜèÓßUà:I0jÌ\u009d34Ç\u0002qi`;".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j7 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j8 = j7;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j8 >>> 56), (byte) (j8 >>> 48), (byte) (j8 >>> 40), (byte) (j8 >>> 32), (byte) (j8 >>> 24), (byte) (j8 >>> 16), (byte) (j8 >>> 8), (byte) j8});
                                    long j9 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j9;
                                            if (i11 >= length2) {
                                                l = jArr;
                                                m = new Integer[18];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31232, 4619909700369790696L ^ j2) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(u7.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1628, 4749497907888736495L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26885, 7691809426226685880L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(u7.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7717, 982945599055483014L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29169, 7009985151384141692L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(u7.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2472, 953008969561163559L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19115, 4605924063032837136L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(u7.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15943, 4768904087971524815L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31654, 6368310280383706368L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(u7.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2376, 579251024321398752L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4674, 4453189867120712936L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(u7.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5214, 9066767157186419434L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3279, 5600304801216905840L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16953, 6164624601127325406L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(u7.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9739, 5981978184837523621L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11693, 5687648932907082516L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19744, 603282624507544012L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(u7.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28209, 3991807945366806717L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24360, 8230296000897487270L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13078, 2645999892331954166L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(u7.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7427, 5896267470281888650L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30840, 9079604023502714588L ^ j2) /* invoke-custom */, 0));
                                                K = kPropertyArr;
                                                G = new u7(j3);
                                                A = yp.L(G, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17085, 3376093142877637637L ^ j2) /* invoke-custom */, lh.Rubberband, null, null, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7680, 8441962332102251247L ^ j2) /* invoke-custom */, null, j6);
                                                J = yp.L(G, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32504, 5646496879817142362L ^ j2) /* invoke-custom */, mo.Calc, null, null, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(528, 8979373275055574777L ^ j2) /* invoke-custom */, null, j6);
                                                w = yp.L(G, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16966, 7302974647461416180L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30383, 8433290699457870412L ^ j2) /* invoke-custom */, new IntRange(2, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28006, 5178494779935629708L ^ j2) /* invoke-custom */), j4, null, u7::w, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13078, 2645999892331954166L ^ j2) /* invoke-custom */, null);
                                                o = yp.t(G, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24690, 711675024440176338L ^ j2) /* invoke-custom */, true, j5, null, u7::r, 4, null);
                                                h = yp.t(G, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8345, 9025619833043742258L ^ j2) /* invoke-custom */, true, j5, null, u7::I, 4, null);
                                                c = yp.t(G, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30224, 2237937878291658913L ^ j2) /* invoke-custom */, true, j5, null, u7::s, 4, null);
                                                i = yp.t(G, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8583, 7892389666702880560L ^ j2) /* invoke-custom */, true, j5, null, u7::V, 4, null);
                                                L = yp.t(G, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4666, 7347280441687891103L ^ j2) /* invoke-custom */, true, j5, null, u7::F, 4, null);
                                                g = yp.t(G, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16520, 1615086529198296628L ^ j2) /* invoke-custom */, true, j5, null, u7::Z, 4, null);
                                                W = new bg();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j9;
                                            if (i11 >= length2) {
                                                str3 = "\u0012Ocm\u0089\u0019õ±À\u0018qD\u0019)ø\u008a";
                                                length2 = "\u0012Ocm\u0089\u0019õ±À\u0018qD\u0019)ø\u008a".length();
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
                                    j7 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "OÛç?\u00adRô\u009a8tÿào£ëµ ´t\u0097\u0013\u0001õN3¿7IÀÞ\u008b\u008a¨HÿQ[\u0012ðút®\u0081\u001b\u009c4vÚ]";
                        length = "OÛç?\u00adRô\u009a8tÿào£ëµ ´t\u0097\u0013\u0001õN3¿7IÀÞ\u008b\u008a¨HÿQ[\u0012ðút®\u0081\u001b\u009c4vÚ]".length();
                        cCharAt = 16;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 5226;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/u7", e2);
            }
        }
        return d[i3];
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
            java.lang.String r1 = "su/catlean/u7"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u7.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 5674;
        if (m[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) l[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) n.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    n.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/u7", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            m[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return m[i3].intValue();
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
            java.lang.String r1 = "su/catlean/u7"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u7.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
