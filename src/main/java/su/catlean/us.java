package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.minecraft.class_744;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/us.class */
public final class us extends _g {

    @NotNull
    public static final us z = null;
    static final KProperty[] P = null;

    @NotNull
    private static final c8 G = null;

    @NotNull
    private static final cw K = null;

    @NotNull
    private static final cw b = null;

    @NotNull
    private static final av J = null;

    @NotNull
    private static final cq X = null;

    @NotNull
    private static final cq U = null;

    @NotNull
    private static final cq e = null;

    @NotNull
    private static final cq W = null;

    @NotNull
    private static final ct k = null;

    @NotNull
    private static final cp E = null;

    @NotNull
    private static final cq D = null;

    @NotNull
    private static final cq u = null;

    @NotNull
    private static final cq A = null;

    @NotNull
    private static class_243 m;
    private static float t;
    private static boolean L;

    @NotNull
    private static final Queue x = null;

    @NotNull
    private static final Queue S = null;

    @NotNull
    private static final AtomicBoolean j = null;

    @Nullable
    private static class_744 I;

    @Nullable
    private static class_243 N;
    private static boolean Y;
    private static String f;
    private static final long a = 0;
    private static final String[] c = null;
    private static final String[] d = null;
    private static final Map g = null;
    private static final long[] h = null;
    private static final Integer[] i = null;
    private static final Map l = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private us(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13759, 4030934436046796956L ^ j3) /* invoke-custom */, jt.V(), null, 4, null, j3 ^ 79110471084890L);
    }

    private final int j(long j2) {
        return ((Number) G.E(this, (a ^ j2) ^ 4341728538526L, P[0])).intValue();
    }

    private final void q(int i2, long j2) {
        G.b(this, (a ^ j2) ^ 125020909963455L, P[0], Integer.valueOf(i2));
    }

    @NotNull
    public final st I(long j2) {
        return (st) K.E(this, (a ^ j2) ^ 36544545785413L, P[1]);
    }

    public final void o(@NotNull st stVar, long a2) {
        long j2 = a ^ a2;
        long j3 = j2 ^ 29562464741469L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8263241049007031219L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(stVar, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25409, 5083029362463499840L ^ j2) /* invoke-custom */);
        try {
            K.b(this, j3, P[1], stVar);
            if (_gVarArr != null) {
                _gVarArr = new _g[3];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr, 8255900584660727983L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr, 8252757140786123456L, j2) /* invoke-custom */;
        }
    }

    private final st F(long j2) {
        return (st) b.E(this, (a ^ j2) ^ 133008391981856L, P[2]);
    }

    private final void K(st stVar, long j2) {
        b.b(this, (a ^ j2) ^ 88418333295434L, P[2], stVar);
    }

    private final lj x(int i2, int i3, byte b2) {
        return (lj) J.E(this, ((((((long) i2) << 32) | ((((long) i3) << 40) >>> 32)) | ((((long) b2) << 56) >>> 56)) ^ a) ^ 65504123451208L, P[3]);
    }

    private final boolean P(long j2) {
        return ((Boolean) X.E(this, (a ^ j2) ^ 83974257933629L, P[4])).booleanValue();
    }

    private final boolean T(long j2, char c2) {
        return ((Boolean) U.E(this, (((j2 << 16) | ((((long) c2) << 48) >>> 48)) ^ a) ^ 89693239676644L, P[5])).booleanValue();
    }

    private final boolean t(long j2, int i2) {
        long j3 = ((j2 << 32) | ((((long) i2) << 32) >>> 32)) ^ a;
        return ((Boolean) e.E(this, j3 ^ 5348283000833L, P[(int) c(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28325, 722191188276409983L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean W(long j2) {
        long j3 = a ^ j2;
        return ((Boolean) W.E(this, j3 ^ 6858251927420L, P[(int) c(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16467, 4884929950607020027L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final float L(long j2) {
        long j3 = a ^ j2;
        return ((Number) k.E(this, j3 ^ 117292527748558L, P[(int) c(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(826, 7614086203533866536L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final h a(int i2, int i3) {
        long j2 = ((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ a;
        return (h) E.E(this, j2 ^ 32173917074570L, P[(int) c(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10163, 7748151746966217725L ^ j2) /* invoke-custom */]);
    }

    private final boolean s(long j2) {
        long j3 = a ^ j2;
        return ((Boolean) D.E(this, j3 ^ 92886625532823L, P[(int) c(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17344, 2217758102071396485L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean C(long j2) {
        long j3 = a ^ j2;
        return ((Boolean) u.E(this, j3 ^ 32924037248929L, P[(int) c(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17643, 5595913485486392220L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean w(char c2, char c3, int i2) {
        long j2 = (((((long) c2) << 48) | ((((long) c3) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a;
        return ((Boolean) A.E(this, j2 ^ 110170944721583L, P[(int) c(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19352, 758557838379264497L ^ j2) /* invoke-custom */])).booleanValue();
    }

    @Nullable
    public final class_243 l() {
        return N;
    }

    public final void t(@Nullable class_243 class_243Var) {
        N = class_243Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a A[EXC_TOP_SPLITTER, PHI: r0
  0x009a: PHI (r0v19 ??) = (r0v54 ??), (r0v55 ??), (r0v56 ??) binds: [B:11:0x0061, B:13:0x0066, B:22:0x0089] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v19, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Override // su.catlean._g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void O(long r9) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.us.O(long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x006c: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @Override // su.catlean._g
    public void b(long r9) {
        /*
            r8 = this;
            r0 = r9
            r1 = r0; r0 = r0; 
            r2 = 65044256163258(0x3b284bc885ba, double:3.21361324295635E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 29291705890158(0x1aa401b9756e, double:1.4472025588413E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = 1395453573672264258(0x135da5a1bf48e242, double:2.1500267168635763E-215)
            r1 = r9
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r15 = r0
            r0 = r8
            r1 = r11
            boolean r0 = r0.S(r1)     // Catch: java.lang.NumberFormatException -> L2a
            r1 = r15
            if (r1 != 0) goto L49
            if (r0 == 0) goto L87
            goto L34
        L2a:
            r1 = 1402561980347544369(0x1376e6b0a6157331, double:6.643241989547966E-215)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L3f
            throw r0     // Catch: java.lang.NumberFormatException -> L3f
        L34:
            java.util.Queue r0 = su.catlean.us.x     // Catch: java.lang.NumberFormatException -> L3f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.NumberFormatException -> L3f
            goto L49
        L3f:
            r1 = 1402561980347544369(0x1376e6b0a6157331, double:6.643241989547966E-215)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L49:
            if (r0 != 0) goto L87
            java.util.Queue r0 = su.catlean.us.x     // Catch: java.lang.NumberFormatException -> L7d
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.NumberFormatException -> L7d
            r1 = r0
            r2 = 13751(0x35b7, float:1.9269E-41)
            r3 = 7186620415443456322(0x63bc01310613d142, double:2.7056259333515427E172)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/us;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "m"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)     // Catch: java.lang.NumberFormatException -> L7d
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.NumberFormatException -> L7d
            net.minecraft.class_2596 r0 = (net.minecraft.class_2596) r0     // Catch: java.lang.NumberFormatException -> L7d
            r1 = r13
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.NumberFormatException -> L7d
            su.catlean._r.a(r-1, r0)     // Catch: java.lang.NumberFormatException -> L7d
            r-1 = r15
            if (r-1 == 0) goto L34
            r-1 = r9
            r0 = 0
            int r-1 = (r-1 > r0 ? 1 : (r-1 == r0 ? 0 : -1))
            if (r-1 <= 0) goto L87
            goto L87
        L7d:
            r1 = 1402561980347544369(0x1376e6b0a6157331, double:6.643241989547966E-215)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.us.b(long):void");
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
    private final void F(su.catlean.api.event.events.network.ReceivePacket r9) {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.us.F(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    public final void r(long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 16770521694029L;
        long j5 = j3 ^ 51258241610936L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(348053408289781195L, j3) /* invoke-custom */;
        q((int) c(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28968, 5785957163511973937L ^ j3) /* invoke-custom */, j4);
        try {
            K(st.OFF, j5);
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(332309951699360269L, j3) /* invoke-custom */ != null) {
                _gVarArr = new _g[3];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr, 353615226757074878L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr, 360230426396353720L, j3) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x018c: INVOKE (r-1 I:su.catlean.us), (r0 I:byte), (r1 I:long), (r2 I:net.minecraft.class_1297) VIRTUAL call: su.catlean.us.J(byte, long, net.minecraft.class_1297):net.minecraft.class_243
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void p(su.catlean.api.event.events.network.SendPacket r12) {
        /*
            Method dump skipped, instruction units count: 1235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.us.p(su.catlean.api.event.events.network.SendPacket):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.us] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [su.catlean.us] */
    @Flow
    private final void I(TickEvent tickEvent) {
        long j2 = a ^ 46785073283192L;
        long j3 = j2 ^ 61016451366481L;
        long j4 = j2 ^ 62572593072433L;
        long j5 = j2 ^ 24880671292096L;
        ?? S2 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2933719087939377577L, j2) /* invoke-custom */;
        try {
            try {
                S2 = this;
                ?? r0 = S2;
                if (S2 == 0) {
                    try {
                        S2 = S2.S(j3);
                        if (S2 != 0 && !zf.v(j5).method_29504()) {
                            return;
                        }
                        r0 = this;
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(S2, 2926753608877033690L, j2) /* invoke-custom */;
                    }
                }
                r0.d(j4);
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(S2, 2926753608877033690L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(S2, 2926753608877033690L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [int[]] */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void n(su.catlean.api.event.events.player.PlayerUpdateEvent r9) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.us.n(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, net.minecraft.class_2596] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private final void H(long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 111535452197252L;
        long j5 = j3 ^ 75851629846864L;
        long j6 = j3 ^ 75515649611029L;
        ?? S2 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8690825808299526532L, j3) /* invoke-custom */;
        try {
            S2 = S(j4);
            if (S2 == 0) {
                return;
            }
            j.set(true);
            loop0: while (true) {
                boolean zIsEmpty = x.isEmpty();
                while (!zIsEmpty) {
                    ?? r0 = (class_2596) x.poll();
                    try {
                        Intrinsics.checkNotNull(r0);
                        _r.a(j5, (class_2596) r0);
                        r0 = S2;
                        r0 = r0;
                        if (j3 >= 0) {
                            if (r0 != 0) {
                                return;
                            } else {
                                r0 = S2;
                            }
                        }
                        if (j3 >= 0) {
                            if (r0 == 0) {
                                try {
                                    zIsEmpty = r0 instanceof class_2828;
                                    if (j3 >= 0) {
                                        if (zIsEmpty) {
                                            N = new class_243(((class_2828) r0).method_12269(zf.v(j6).method_23317()), ((class_2828) r0).method_12268(zf.v(j6).method_23318()), ((class_2828) r0).method_12274(zf.v(j6).method_23321()));
                                        } else {
                                            continue;
                                        }
                                    }
                                } catch (NumberFormatException unused) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8698499372840655089L, j3) /* invoke-custom */;
                                }
                            }
                            r0 = S2;
                        }
                        if (r0 != 0) {
                            break;
                        }
                    } catch (NumberFormatException unused2) {
                        r0 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8698499372840655089L, j3) /* invoke-custom */;
                        throw r0;
                    }
                }
                break loop0;
            }
            j.set(false);
            x.clear();
            if (j3 > 0) {
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(S2, -8698499372840655089L, j3) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00f3: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void n(long r10) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.us.n(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    @Flow
    private final void w(Render3DEvent render3DEvent) {
        long j2 = a ^ 39324351512608L;
        int i2 = (int) (j2 >>> 56);
        long j3 = ((j2 ^ 137037730560665L) << 8) >>> 8;
        long j4 = j2 ^ 68381957225993L;
        long j5 = j2 ^ 35042389043838L;
        long j6 = j2 ^ 52074653249817L;
        long j7 = j2 ^ 35115354733208L;
        Object objS = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7561157539199752689L, j2) /* invoke-custom */;
        try {
            try {
                objS = S(j4);
                class_243 class_243VarP = objS;
                if (objS == 0) {
                    if (objS == 0) {
                        return;
                    } else {
                        class_243VarP = P(j6);
                    }
                }
                if (class_243VarP != 0) {
                    try {
                        class_243VarP = N;
                        if (class_243VarP != 0) {
                            Object objAreEqual = 0;
                            objAreEqual = 0;
                            try {
                                try {
                                    us usVar = z;
                                    if (objS == 0) {
                                        objAreEqual = Intrinsics.areEqual(N, z.J((byte) i2, j3, (class_1297) zf.v(j7)));
                                        if (objAreEqual == 0) {
                                            zi.Q(zi.v, render3DEvent.getStack(), class_243VarP, zf.v(j7), 0.45f, false, (int) c(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3957, 5969163115813313115L ^ j2) /* invoke-custom */, null, j5);
                                        }
                                    }
                                } catch (NumberFormatException unused) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, 7549690667620436098L, j2) /* invoke-custom */;
                                }
                            } catch (NumberFormatException unused2) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, 7549690667620436098L, j2) /* invoke-custom */;
                            }
                        }
                    } catch (NumberFormatException unused3) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_243VarP, 7549690667620436098L, j2) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused4) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objS, 7549690667620436098L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused5) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objS, 7549690667620436098L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean e() {
        long j2 = a ^ 124712170669062L;
        long j3 = j2 >>> 16;
        int i2 = (int) (((j2 ^ 105824705087206L) << 48) >>> 48);
        Object objT = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7838781334794640855L, j2) /* invoke-custom */;
        try {
            objT = z.T(j3, (char) i2);
            return objT == 0 ? objT == 0 : objT;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objT, 7846309618312023204L, j2) /* invoke-custom */;
        }
    }

    private static final boolean R() {
        return z.W((a ^ 34196373411101L) ^ 98842363962981L);
    }

    public static void M(String str) {
        f = str;
    }

    public static String i() {
        return f;
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

    private static String b(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 30393;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) g.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = b(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/us", e2);
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
            java.lang.String r1 = "su/catlean/us"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.us.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 31953;
        if (i[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) h[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) l.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/us", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            i[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return i[i3].intValue();
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
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
            java.lang.String r1 = "su/catlean/us"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.us.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
