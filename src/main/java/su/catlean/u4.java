package su.catlean;

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
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/u4.class */
public final class u4 extends _g {

    @NotNull
    public static final u4 S = null;
    static final KProperty[] u = null;

    @NotNull
    private static final cw A = null;

    @NotNull
    private static final cq V = null;

    @NotNull
    private static final cq y = null;

    @NotNull
    private static final cq j = null;

    @NotNull
    private static final c8 E = null;

    @NotNull
    private static final c8 z = null;

    @NotNull
    private static final cq T = null;

    @NotNull
    private static final ct x = null;

    @NotNull
    private static final ct c = null;

    @NotNull
    private static final ct o = null;

    @NotNull
    private static final cw O = null;

    @NotNull
    private static final ct n = null;

    @NotNull
    private static final c8 G = null;
    private static double d;
    private static int i;
    private static int t;
    private static float l;

    @NotNull
    private static final bg h = null;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] e = null;
    private static final Map f = null;
    private static final long[] g = null;
    private static final Integer[] k = null;
    private static final Map m = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private u4(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(373, 3366533575113741553L ^ j3) /* invoke-custom */, jt.V(), null, 4, null, j3 ^ 4719412282409L);
    }

    private final gq Z(long j2) {
        return (gq) A.E(this, (a ^ j2) ^ 138659891555726L, u[0]);
    }

    private final boolean Y(long j2) {
        return ((Boolean) V.E(this, (a ^ j2) ^ 126381240930221L, u[1])).booleanValue();
    }

    private final void k(boolean z2, long j2) {
        V.b(this, (a ^ j2) ^ 243308521181L, u[1], Boolean.valueOf(z2));
    }

    private final boolean r(char c2, int i2, char c3) {
        return ((Boolean) y.E(this, ((((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c3) << 48) >>> 48)) ^ a) ^ 2636078030423L, u[2])).booleanValue();
    }

    private final void j(boolean z2, long j2) {
        y.b(this, (a ^ j2) ^ 38281829956876L, u[2], Boolean.valueOf(z2));
    }

    private final boolean A(int i2, int i3, int i4) {
        return ((Boolean) j.E(this, ((((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) i4) << 48) >>> 48)) ^ a) ^ 104835845283114L, u[3])).booleanValue();
    }

    private final void y(long j2, boolean z2, short s) {
        j.b(this, (((j2 << 16) | ((((long) s) << 48) >>> 48)) ^ a) ^ 44386739198167L, u[3], Boolean.valueOf(z2));
    }

    private final int H(int i2, char c2, char c3) {
        return ((Number) E.E(this, ((((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) c3) << 48) >>> 48)) ^ a) ^ 114342747193385L, u[4])).intValue();
    }

    private final int v(long j2) {
        return ((Number) z.E(this, (a ^ j2) ^ 74802542004775L, u[5])).intValue();
    }

    private final boolean I(long j2) {
        long j3 = a ^ j2;
        return ((Boolean) T.E(this, j3 ^ 73337147166276L, u[(int) c(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31515, 6044926734770550225L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final float K(int i2, int i3, short s) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ a;
        return ((Number) x.E(this, j2 ^ 84895919946533L, u[(int) c(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9914, 3007384534649625884L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final void V(int i2, float f2, int i3) {
        long j2 = ((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ a;
        x.b(this, j2 ^ 106712720599340L, u[(int) c(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27688, 2176714827595633256L ^ j2) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float s(char c2, int i2, int i3) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ a;
        return ((Number) c.E(this, j2 ^ 74290601494506L, u[(int) c(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5333, 8993296689183413167L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final void Z(char c2, int i2, float f2, char c3) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c3) << 48) >>> 48)) ^ a;
        c.b(this, j2 ^ 30132968524835L, u[(int) c(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5333, 8993396753184804746L ^ j2) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float i(long j2) {
        long j3 = a ^ j2;
        return ((Number) o.E(this, j3 ^ 63424639646829L, u[(int) c(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(350, 1052172964986322357L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void n(float f2, long j2) {
        long j3 = a ^ j2;
        o.b(this, j3 ^ 96527980424822L, u[(int) c(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12275, 6279797687241250548L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final px R(long j2) {
        long j3 = a ^ j2;
        return (px) O.E(this, j3 ^ 123204918878606L, u[(int) c(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2519, 1266261824106850526L ^ j3) /* invoke-custom */]);
    }

    private final void C(px pxVar, long j2) {
        long j3 = a ^ j2;
        O.b(this, j3 ^ 74139201429673L, u[(int) c(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14312, 1335021456780132396L ^ j3) /* invoke-custom */], pxVar);
    }

    private final float z(long j2) {
        long j3 = a ^ j2;
        return ((Number) n.E(this, j3 ^ 76001528343729L, u[(int) c(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13938, 1443835991958395457L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void i(byte b2, float f2, long j2) {
        long j3 = ((((long) b2) << 56) | ((j2 << 8) >>> 8)) ^ a;
        n.b(this, j3 ^ 23037513284497L, u[(int) c(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8545, 5745817909060849026L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final int T(long j2) {
        long j3 = a ^ j2;
        return ((Number) G.E(this, j3 ^ 21127923206120L, u[(int) c(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28523, 3674535975018080287L ^ j3) /* invoke-custom */])).intValue();
    }

    private final void m(int i2, int i3, int i4, byte b2) {
        long j2 = (((((long) i3) << 32) | ((((long) i4) << 40) >>> 32)) | ((((long) b2) << 56) >>> 56)) ^ a;
        G.b(this, j2 ^ 76128308938746L, u[(int) c(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30124, 7089933688250950945L ^ j2) /* invoke-custom */], Integer.valueOf(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, su.catlean._g[]] */
    @Override // su.catlean._g
    public void O(long j2) {
        i = 1;
        t = 0;
        d = 0.2873d;
        int i2 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2620191443214299061L, j2) /* invoke-custom */;
        h.l();
        int i3 = i2;
        int i4 = i3;
        if (j2 >= 0) {
            if (i3 != 0) {
                return;
            } else {
                i4 = 5;
            }
        }
        try {
            i4 = new _g[i4];
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(i4, 2605814174822968852L, j2) /* invoke-custom */;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(i4, 2663721874717435670L, j2) /* invoke-custom */;
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
    @su.catlean.gofra.Flow
    private final void C(su.catlean.api.event.events.player.PreSyncEvent r11) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u4.C(su.catlean.api.event.events.player.PreSyncEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x083e: INVOKE 
          (r-1 I:int)
          (r0 I:long)
          (r1 I:int)
          (r2 I:net.minecraft.class_1713)
          (r3 I:boolean)
          (r4 I:int)
          (r5 I:java.lang.Object)
         STATIC call: su.catlean.ag.e(int, long, int, net.minecraft.class_1713, boolean, int, java.lang.Object):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow(priority = -10)
    private final void t(su.catlean.api.event.events.player.PlayerUpdateEvent r15) {
        /*
            Method dump skipped, instruction units count: 2886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u4.t(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void I(su.catlean.api.event.events.player.MoveEvent r12) {
        /*
            Method dump skipped, instruction units count: 2072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u4.I(su.catlean.api.event.events.player.MoveEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[PHI: r0 r1
  0x007d: PHI (r0v13 ??) = (r0v11 ??), (r0v16 ??) binds: [B:13:0x0053, B:18:0x0066] A[DONT_GENERATE, DONT_INLINE]
  0x007d: PHI (r1v11 su.catlean.gq) = (r1v9 su.catlean.gq), (r1v13 su.catlean.gq) binds: [B:13:0x0053, B:18:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.gq] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.gq] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean q() {
        /*
            long r0 = su.catlean.u4.a
            r1 = 69378764500266(0x3f19809ced2a, double:3.42776640904917E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 1947699350688(0x1c57bed8ca0, double:9.62291337602E-312)
            long r1 = r1 ^ r2
            r9 = r1
            r0 = 8081615105262238670(0x7027aa1eb8963bce, double:1.8369806468067046E232)
            r1 = r7
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r11 = r0
            su.catlean.u4 r0 = su.catlean.u4.S     // Catch: kotlin.NoWhenBranchMatchedException -> L30
            r1 = r9
            su.catlean.gq r0 = r0.Z(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L30
            su.catlean.gq r1 = su.catlean.gq.NCP     // Catch: kotlin.NoWhenBranchMatchedException -> L30
            r2 = r11
            if (r2 == 0) goto L51
            if (r0 == r1) goto L80
            goto L3a
        L30:
            r1 = 8109875497785111405(0x708c10cc1a20336d, double:1.3943159696063845E234)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L47
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L47
        L3a:
            su.catlean.u4 r0 = su.catlean.u4.S     // Catch: kotlin.NoWhenBranchMatchedException -> L47
            r1 = r9
            su.catlean.gq r0 = r0.Z(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L47
            su.catlean.gq r1 = su.catlean.gq.STRICT_STRAFE     // Catch: kotlin.NoWhenBranchMatchedException -> L47
            goto L51
        L47:
            r1 = 8109875497785111405(0x708c10cc1a20336d, double:1.3943159696063845E234)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r2 = r11
            if (r2 == 0) goto L7d
            if (r0 == r1) goto L80
            goto L66
        L5c:
            r1 = 8109875497785111405(0x708c10cc1a20336d, double:1.3943159696063845E234)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L73
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L73
        L66:
            su.catlean.u4 r0 = su.catlean.u4.S     // Catch: kotlin.NoWhenBranchMatchedException -> L73
            r1 = r9
            su.catlean.gq r0 = r0.Z(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L73
            su.catlean.gq r1 = su.catlean.gq.MATRIX     // Catch: kotlin.NoWhenBranchMatchedException -> L73
            goto L7d
        L73:
            r1 = 8109875497785111405(0x708c10cc1a20336d, double:1.3943159696063845E234)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L7d:
            if (r0 != r1) goto L8e
        L80:
            r0 = 1
            goto L8f
        L84:
            r1 = 8109875497785111405(0x708c10cc1a20336d, double:1.3943159696063845E234)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8e:
            r0 = 0
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u4.q():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gq] */
    private static final boolean x() {
        long j2 = a ^ 137817630456051L;
        Object objZ = j2;
        try {
            objZ = S.Z(objZ ^ 74237731232121L);
            return objZ == gq.FIREWORK;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, -6533224915928815948L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gq] */
    private static final boolean g() {
        long j2 = a ^ 20946796018133L;
        Object objZ = j2;
        try {
            objZ = S.Z(objZ ^ 50379784231007L);
            return objZ == gq.FIREWORK;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, 7238195927023429522L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gq] */
    private static final boolean M() {
        long j2 = a ^ 119766265900267L;
        Object objZ = j2;
        try {
            objZ = S.Z(objZ ^ 90373540892001L);
            return objZ == gq.GRIM_ENTITY;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, -5670802444318084436L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gq] */
    private static final boolean j() {
        long j2 = a ^ 124323432982671L;
        Object objZ = j2;
        try {
            objZ = S.Z(objZ ^ 87749226793221L);
            return objZ == gq.GRIM_ENTITY;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, -780988848012020024L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gq] */
    private static final boolean F() {
        long j2 = a ^ 56734167454153L;
        Object objZ = j2;
        try {
            objZ = S.Z(objZ ^ 14592295350339L);
            return objZ == gq.GRIM_ENTITY;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, 5507651985955426190L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gq] */
    private static final boolean V() {
        long j2 = a ^ 137381291901316L;
        Object objZ = j2;
        try {
            objZ = S.Z(objZ ^ 72767087779854L);
            return objZ == gq.GRIM_ENTITY;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, -2584411809026498621L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gq] */
    private static final boolean Q() {
        long j2 = a ^ 56483007942887L;
        Object objZ = j2;
        try {
            objZ = S.Z(objZ ^ 14852046106989L);
            return objZ == gq.GRIM_ENTITY;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, 5566761999395917472L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.u4] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.px] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.gq] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
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
    private static final boolean E() {
        /*
            long r0 = su.catlean.u4.a
            r1 = 38203362238502(0x22bee9d5e026, double:1.88749688376726E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 31207545143724(0x1c6212a481ac, double:1.5418575946554E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 20288190057900(0x1273b65c8dac, double:1.00236977239063E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 9077156521436293636(0x7df889c36ed4aa04, double:6.419147073753015E298)
            r1 = r7
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.u4 r0 = su.catlean.u4.S     // Catch: kotlin.NoWhenBranchMatchedException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.gq r0 = r0.Z(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L37 kotlin.NoWhenBranchMatchedException -> L47
            su.catlean.gq r1 = su.catlean.gq.GRIM_ENTITY     // Catch: kotlin.NoWhenBranchMatchedException -> L37 kotlin.NoWhenBranchMatchedException -> L47
            if (r0 != r1) goto L6a
            goto L41
        L37:
            r1 = 9043242806908894817(0x7d800d6b73693e61, double:3.2806982181998766E296)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L47
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L47
        L41:
            su.catlean.u4 r0 = su.catlean.u4.S     // Catch: kotlin.NoWhenBranchMatchedException -> L47
            goto L51
        L47:
            r1 = 9043242806908894817(0x7d800d6b73693e61, double:3.2806982181998766E296)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            su.catlean.px r0 = r0.R(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L60
            su.catlean.px r1 = su.catlean.px.PREDICT     // Catch: kotlin.NoWhenBranchMatchedException -> L60
            if (r0 != r1) goto L6a
            r0 = 1
            goto L6b
        L60:
            r1 = 9043242806908894817(0x7d800d6b73693e61, double:3.2806982181998766E296)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6a:
            r0 = 0
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u4.E():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gq] */
    private static final boolean B() {
        long j2 = a ^ 52296779155443L;
        Object objZ = j2;
        try {
            objZ = S.Z(objZ ^ 19021093185145L);
            return objZ == gq.GRIM_ENTITY;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, 6509109136281377204L, j2) /* invoke-custom */;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 16722;
        if (e[i3] == null) {
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
                e[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/u4", e2);
            }
        }
        return e[i3];
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
            java.lang.String r1 = "su/catlean/u4"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u4.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 3218;
        if (k[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) m.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/u4", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            k[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return k[i3].intValue();
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
            java.lang.String r1 = "su/catlean/u4"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u4.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
