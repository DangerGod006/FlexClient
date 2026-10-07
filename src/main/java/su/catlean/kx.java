package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_2248;
import net.minecraft.class_2596;
import net.minecraft.class_2672;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.world.BlockStateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/kx.class */
public final class kx extends _g {

    @NotNull
    public static final kx E;
    static final KProperty[] z;

    @NotNull
    private static final az K;

    @NotNull
    private static final cj V;

    @NotNull
    private static final cq D;

    @NotNull
    private static final c8 y;

    @NotNull
    private static final cq u;

    @NotNull
    private static final cs x;

    @NotNull
    private static final cq t;

    @NotNull
    private static final cq a;

    @NotNull
    private static final cq b;

    @NotNull
    private static final ArrayList L;
    private static final ExecutorService c;

    @NotNull
    private static final bg O;
    private static long J;
    private static boolean m;
    private static final long d = yz.a(-3048513154843461334L, -3887378791680686365L, MethodHandles.lookup().lookupClass()).a(90942984204258L);
    private static final String[] e;
    private static final String[] f;
    private static final Map g;
    private static final long[] h;
    private static final Integer[] i;
    private static final Map j;

    /* JADX WARN: Illegal instructions before constructor call */
    private kx(int i2, short s, short s2) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ d;
        super((String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27647, 5382861717234410806L ^ j2) /* invoke-custom */, jt.z(), null, 4, null, j2 ^ 95575367005090L);
    }

    private final dg v(long j2) {
        return (dg) K.E(this, (d ^ j2) ^ 70277135841191L, z[0]);
    }

    private final void W(long j2, dg dgVar) {
        K.b(this, (d ^ j2) ^ 115525491749903L, z[0], dgVar);
    }

    private final d4 g(long j2, short s) {
        return (d4) V.E(this, (((j2 << 16) | ((((long) s) << 48) >>> 48)) ^ d) ^ 89066946297291L, z[1]);
    }

    private final void n(long j2, d4 d4Var) {
        V.b(this, (d ^ j2) ^ 32490398676683L, z[1], d4Var);
    }

    private final boolean t(long j2) {
        return ((Boolean) D.E(this, (d ^ j2) ^ 109750037230261L, z[2])).booleanValue();
    }

    private final int V(long j2) {
        return ((Number) y.E(this, (d ^ j2) ^ 114469593826525L, z[3])).intValue();
    }

    private final boolean L(long j2) {
        return ((Boolean) u.E(this, (d ^ j2) ^ 17680887081085L, z[4])).booleanValue();
    }

    private final Color C(long j2) {
        return (Color) x.E(this, (d ^ j2) ^ 43308342053365L, z[5]);
    }

    private final boolean j(int i2, char c2, short s) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ d;
        return ((Boolean) t.E(this, j2 ^ 71321313375705L, z[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18841, 4983537029349101590L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean q(long j2) {
        long j3 = d ^ j2;
        return ((Boolean) a.E(this, j3 ^ 84179206956695L, z[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14004, 9135713432309415037L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean F(long j2) {
        long j3 = d ^ j2;
        return ((Boolean) b.E(this, j3 ^ 11617341761785L, z[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1520, 8335392886920708440L ^ j3) /* invoke-custom */])).booleanValue();
    }

    @Override // su.catlean._g
    public void O(long j2) {
        L.clear();
        J = System.currentTimeMillis();
        m = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.concurrent.Future] */
    @Flow
    public final void p(@NotNull PlayerUpdateEvent e2) {
        Object objSubmit = d ^ 127297034226434L;
        try {
            Intrinsics.checkNotNullParameter(e2, "e");
            if (m) {
                objSubmit = c.submit(kx::P);
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objSubmit, -9082339193296195614L, objSubmit) /* invoke-custom */;
        }
    }

    @Flow
    public final void W(@NotNull BlockStateEvent e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        c.submit(() -> {
            F(r1);
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    @Flow
    public final void j(@NotNull AfterReceivePacket e2) {
        long j2 = d ^ 118138824403652L;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6911282880438054323L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(e2, "e");
        try {
            try {
                class_2596<?> packet = e2.getPacket();
                if (obj == 0) {
                    obj = packet instanceof class_2672;
                    if (obj == 0) {
                        return;
                    }
                    packet = e2.getPacket();
                    Intrinsics.checkNotNull(packet, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11415, 6865659762107506913L ^ j2) /* invoke-custom */);
                }
                class_2672 class_2672Var = (class_2672) packet;
                c.submit(() -> {
                    F(r1);
                });
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6903151627607159260L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6903151627607159260L, j2) /* invoke-custom */;
        }
    }

    private final void Z() {
        m = false;
        c.submit(kx::I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a9, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ac, code lost:
    
        if (r0 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00af, code lost:
    
        r32 = r0 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c0, code lost:
    
        if (r32 >= call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/kx;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "a"}
            {METHOD_TYPE: (I, J)I}
        ).invoke(16803, 1410404392905452437L ^ r0)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c3, code lost:
    
        r0.method_10103(r0 + r31, r30, r0 + (r32 == true ? 1 : 0));
        r0 = su.catlean.zf.z(r1).method_8320(r0).method_26204();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/kx;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "d"}
            {METHOD_TYPE: (I, J)Ljava/lang/String;}
        ).invoke(3594, 6563289613063367116L ^ r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f8, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fd, code lost:
    
        if (r0 <= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0100, code lost:
    
        if (r0 != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0103, code lost:
    
        r0 = B(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x010d, code lost:
    
        if (r0 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0113, code lost:
    
        if (r0 < 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0122, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -3768644116161059420L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0123, code lost:
    
        if (r0 == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0126, code lost:
    
        r0 = r1;
        r3 = r0.method_10062();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/kx;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "d"}
            {METHOD_TYPE: (I, J)Ljava/lang/String;}
        ).invoke(15217, 5375895360943660198L ^ r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0148, code lost:
    
        if (L(r1) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x014e, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -3768644116161059420L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0157, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0158, code lost:
    
        r4 = new java.awt.Color(r0.method_26403().field_16011);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0173, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -3768644116161059420L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0174, code lost:
    
        r4 = C(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x017a, code lost:
    
        r0.add(new su.catlean.mw(r3, r4, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0185, code lost:
    
        r32 = r32 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0188, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x018a, code lost:
    
        if (r0 == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x018d, code lost:
    
        r31 = r31 + 1;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0195, code lost:
    
        if (r0 <= 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0198, code lost:
    
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x019b, code lost:
    
        r30 = r30 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a1, code lost:
    
        if (r0 <= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a4, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a6, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ac, code lost:
    
        if (r0 <= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01b1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0091, code lost:
    
        if (r0 < call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/kx;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "a"}
            {METHOD_TYPE: (I, J)I}
        ).invoke(7732, 1363901268375860225L ^ r0)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0094, code lost:
    
        r31 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0097, code lost:
    
        r0 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a6, code lost:
    
        if (r0 >= call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/kx;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "a"}
            {METHOD_TYPE: (I, J)I}
        ).invoke(16803, 1410404392905452437L ^ r0)) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:6:0x0094, B:50:0x01a9], limit reached: 72 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x01a1 -> B:10:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01ac -> B:6:0x0094). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List k(net.minecraft.class_1923 r12, long r13) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kx.k(net.minecraft.class_1923, long):java.util.List");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:85:0x0324
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    public final void r(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.render.Render3DEvent r16) {
        /*
            Method dump skipped, instruction units count: 1823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kx.r(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    private final boolean B(long j2, class_2248 class_2248Var) {
        return v((d ^ j2) ^ 15884204603060L).e().contains(class_2248Var);
    }

    private static final boolean B() {
        return E.t((d ^ 20445670556142L) ^ 54468606443359L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean h() {
        long j2 = d ^ 51649970664680L;
        long j3 = j2 ^ 138734594740369L;
        Object objL = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(9095711442368105569L, j2) /* invoke-custom */;
        try {
            objL = E.L(j3);
            return objL == 0 ? objL == 0 : objL;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objL, 9088072323535081480L, j2) /* invoke-custom */;
        }
    }

    private static final void P() {
        E.Z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [su.catlean.l0] */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [int] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void F(su.catlean.api.event.events.world.BlockStateEvent r6) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kx.F(su.catlean.api.event.events.world.BlockStateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.l0] */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v41, types: [int] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void F(net.minecraft.class_2672 r6) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kx.F(net.minecraft.class_2672):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    private static final boolean p(int i2, int i3, l0 l0Var) {
        long j2 = d ^ 62127814467073L;
        long j3 = j2 ^ 55420792801402L;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3111033905178335608L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(l0Var, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19032, 6547243549026841321L ^ j2) /* invoke-custom */);
        try {
            obj = (Math.hypot(((double) i2) - ((double) l0Var.i()), ((double) i3) - ((double) l0Var.Z())) > ((((Number) zf.F(j3).field_1690.method_42503().method_41753()).intValue() + 4) * (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16803, 1410350911467533520L ^ j2) /* invoke-custom */) ? 1 : (Math.hypot(((double) i2) - ((double) l0Var.i()), ((double) i3) - ((double) l0Var.Z())) == ((((Number) zf.F(j3).field_1690.method_42503().method_41753()).intValue() + 4) * (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16803, 1410350911467533520L ^ j2) /* invoke-custom */) ? 0 : -1));
            return obj == 0 ? obj > 0 : obj;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3101212298862740767L, j2) /* invoke-custom */;
        }
    }

    private static final boolean f(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private static final void I() {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kx.I():void");
    }

    static {
        int i2;
        long j2 = d ^ 77436458330171L;
        long j3 = j2 >>> 8;
        int i3 = (int) (((j2 ^ 39809583940233L) << 56) >>> 56);
        long j4 = j2 ^ 54650211109696L;
        int i4 = (int) (j2 >>> 32);
        int i5 = (int) ((j4 << 32) >>> 48);
        int i6 = (int) ((j4 << 48) >>> 48);
        long j5 = j2 ^ 118457520891355L;
        long j6 = j2 ^ 74883381635261L;
        int i7 = (int) (j2 >>> 48);
        long j7 = ((j2 ^ 28156063215438L) << 16) >>> 16;
        long j8 = j2 ^ 130838100500091L;
        long j9 = j2 ^ 14507657730986L;
        long j10 = j2 ^ 77274250564943L;
        int i8 = (int) (j2 >>> 48);
        int i9 = (int) ((j10 << 16) >>> 48);
        int i10 = (int) ((j10 << 32) >>> 32);
        g = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i11 = 1; i11 < 8; i11++) {
            bArr[i11] = (byte) ((j2 << (i11 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[39];
        int i12 = 0;
        String str = ">×#K\u0089µ(¿\u0004°ÛÞµ\u008d\u0018ç\u0018FèIw«\u009c·o¨\u0097à{CDy¹©»5ÏõöÐv òÕ»°Á>R,øb\u007fèÛ5:ÅÝ\u0096ôYZÀïIÜ;E\u0002\u0097Ô½\u009f(\u000b ön°§gËN\u0080ÅÍVÀò\u001a\u0090Ol¡\u008fõD\"\u0018\f\u009d\u00864\u0017FÚëy\u001a4ô0\u0094o Ñ¾ÛÆÿ÷ôVRâ@\u0002Ó9\u008d±kFô\u0001\u0084ÿd?rÚæÒ\u0089/\u009d3\u0018\u008c¢\u009eå%ß7J7\u009d(z!\u0086\u0092dú\u001fÚþ×ìJi\u0018 w\u009c¿\u0003¼m\u0010ªÆy¤S'Ö\u00ad'é\u008cO\u0094*=6\u0010<e\u0013\u001ck\u0011z\r\u001d\u008bï\u0093§\u008a\u0091® =ÄJ\u0084!\u001cNx4yb\u00adHwQ¯bùïÆ½Ê\u0007Qgæ!\u0017 q\\Ø \u009alhça%\u0011H\u0083\u001a\u0007Fä\u0084²mR«\u001ewgíÝ\u0001\u001fÇJ´:\u0081\u0096)\u0010Ð\rGbTN°£9 9EÙ\u0017\u0016Ð\u0010¢ûjêCÑ±½*ÌòÍh5¿B\u0018{ÏG+«\u0018D\u0003üÁ«ê\fÎj×]ÓneÅ\u0096\u007f$0$\u0010k0êwf¨ÞÊÏÍËµtÌ\u0001Tç}!z0ù*WTKóÓ¡î\u0088\u00add\u0012/\u008b-ëÉ\u009fc?ã'\u0085% \u0097\u009fØñ\u0097\u0017LÚ\u0082\u0089F\t\u000eàQ»M`$hØ\u0001ÌIÞ\u0093)\u0005\u0019Ág+H¼ÖÈÙa\u0082f\u0088\u0002\u0084:à\u0015²\u0090 É\u00956þ¸¯\u0007³+n\b\u0019JlØVÎE\u0081\t×EÁ\u008dæ|\u0081¹\u0082C\u0091¶Êÿû\u0005s\u0094£í\u009fÚW\u0006\rq\u0013¿û\u0097\u0019z\u0010ã¸× s|m¹»ä³¢\u0017LþëòLîZ1¦á!\u000e\u009d\u0099Ex~h4\u0018\u0002æ\u0092\u0010Ï)3.§É(\u008d\u0087Á\u008d¥\u0019\u0005ß \u0010F\u0091y\u008e»\u0093Ý¬ôá\u009d°¼æ\u0094é +XW,b@F~%Q\u008f¶Òvá\u00ad\u0005.GL\u0010Å¥À\u008e\u0014\f¹«\u0091\u0091¢\u0010ÚiÐAk\u0002p\u007fôqµõ\u0094\u0003æ8\u0010¿\u001cÌíñÙY¯\u0014\u0081©Õ{\u001fÂ\r(Û\u0089\\U\u0091¾`\u008f\u001füAÅ\u0007;D\u008c\u0004`\u009dtO?-¢ñ\u0090¬\u009cÍt°\u0018\u0018ù\u009a\u008a%K\u009f\u001a\u0018P9á\u008a\u008al±)\u009b¹¬_¥\u009b½Ì:ÿèLä(Ö<\u0010Ô\u0007)ý OÒ\u0016Õ\faVwR²\u0010 c\u0099\u001b\u0006\u008aÀ\u0087\u0010xO¾\u0003\u000e#ªûªõº\u0017\u0080k¯Ý\u0096µ}ò¬µ+\u00858ló#\u0081ö\u0013oÆ|0\u00041ïdN\u0004ÑWwO\u00951 \u008aHG\u008d²ò7\nB\u0006\u0095\u00ad¤\u0084[õ\u009d\u009cp±çJg(Ñ\u0015óLX\"®yì0¼v\u0018@!iÙa9\u0090un\u009cT@sÊZm-´\\|^Ô# Ù:\u0019U¬\u000b`<q¿\n¤ÁCBcª\u008fýÇ]\u0018\u008dK\u008aô×a\u008e'G^VCÑ?ôúIw\bº\"Ýw¥\u0018\u0004Ý=\u0089küe¬ì_-«\u00918U§\f§=-ê Ìr\u0010\u009c\u0013Mq\u0098\u0001\u0080\u0018\u0087\u0001)¬ZÊ4^\u0010´\u0090Ò`ä\u0001Lá'*\u00adñ-À\u0012z@ßXÚ\u0093©\u001f\u0011_¸È\u009bÚ\\\u0083\u008c¬R~¤\u009a×\u008dË\u0090|Vú+D\u009bðþ§'\u0083¹\bnêí§\\ðAc\u0097H\u000f4±hô\u00ad?Óùu \u0083\\\u0082!\u0013\"\u00105¥_mÏ8\r\u000eóCÏ\"YÕ\fQ ÀjÀ6èãì¨\u0086¦'Éü¬\u0097ô&3¸\u0004¡üÌr\u001b¨½ë\u0082\u0086ÁÒ¨\u0014\u0003 \u0012¬q>¤yújæ\u001eo\u001d|É\u0086Å/ÆÝú3½P\u0086ä4Z2°q¦\u0085}eGL\u0016\u0089r£ÈîP-£\u000f\u0096R&õ¿cÍ¶N\u0084Â\"ë$òô8\tïW»3Æô¤;\u009d+\u009d\u0014\u0011'ªð\u0011+:_Öïþð½ª\u0005\u0097ÌùX!R\u0083÷÷[¡|\u009fù¾óvS\u0005}ÒÅ\u009fB\u0082Y|Ä$oÒ{S\u008bÛ=%ÃlwÄrýòG\u009dÀñÒ\"1\"\u0013º\u0082ãu0é¸Õïá{\"\u0081Öaæ\u0013[0\u0087W\u0010>6,1\u0004¦µ\u0083:\u0016ÖÊ1\u0006þ\u001b";
        int length = ">×#K\u0089µ(¿\u0004°ÛÞµ\u008d\u0018ç\u0018FèIw«\u009c·o¨\u0097à{CDy¹©»5ÏõöÐv òÕ»°Á>R,øb\u007fèÛ5:ÅÝ\u0096ôYZÀïIÜ;E\u0002\u0097Ô½\u009f(\u000b ön°§gËN\u0080ÅÍVÀò\u001a\u0090Ol¡\u008fõD\"\u0018\f\u009d\u00864\u0017FÚëy\u001a4ô0\u0094o Ñ¾ÛÆÿ÷ôVRâ@\u0002Ó9\u008d±kFô\u0001\u0084ÿd?rÚæÒ\u0089/\u009d3\u0018\u008c¢\u009eå%ß7J7\u009d(z!\u0086\u0092dú\u001fÚþ×ìJi\u0018 w\u009c¿\u0003¼m\u0010ªÆy¤S'Ö\u00ad'é\u008cO\u0094*=6\u0010<e\u0013\u001ck\u0011z\r\u001d\u008bï\u0093§\u008a\u0091® =ÄJ\u0084!\u001cNx4yb\u00adHwQ¯bùïÆ½Ê\u0007Qgæ!\u0017 q\\Ø \u009alhça%\u0011H\u0083\u001a\u0007Fä\u0084²mR«\u001ewgíÝ\u0001\u001fÇJ´:\u0081\u0096)\u0010Ð\rGbTN°£9 9EÙ\u0017\u0016Ð\u0010¢ûjêCÑ±½*ÌòÍh5¿B\u0018{ÏG+«\u0018D\u0003üÁ«ê\fÎj×]ÓneÅ\u0096\u007f$0$\u0010k0êwf¨ÞÊÏÍËµtÌ\u0001Tç}!z0ù*WTKóÓ¡î\u0088\u00add\u0012/\u008b-ëÉ\u009fc?ã'\u0085% \u0097\u009fØñ\u0097\u0017LÚ\u0082\u0089F\t\u000eàQ»M`$hØ\u0001ÌIÞ\u0093)\u0005\u0019Ág+H¼ÖÈÙa\u0082f\u0088\u0002\u0084:à\u0015²\u0090 É\u00956þ¸¯\u0007³+n\b\u0019JlØVÎE\u0081\t×EÁ\u008dæ|\u0081¹\u0082C\u0091¶Êÿû\u0005s\u0094£í\u009fÚW\u0006\rq\u0013¿û\u0097\u0019z\u0010ã¸× s|m¹»ä³¢\u0017LþëòLîZ1¦á!\u000e\u009d\u0099Ex~h4\u0018\u0002æ\u0092\u0010Ï)3.§É(\u008d\u0087Á\u008d¥\u0019\u0005ß \u0010F\u0091y\u008e»\u0093Ý¬ôá\u009d°¼æ\u0094é +XW,b@F~%Q\u008f¶Òvá\u00ad\u0005.GL\u0010Å¥À\u008e\u0014\f¹«\u0091\u0091¢\u0010ÚiÐAk\u0002p\u007fôqµõ\u0094\u0003æ8\u0010¿\u001cÌíñÙY¯\u0014\u0081©Õ{\u001fÂ\r(Û\u0089\\U\u0091¾`\u008f\u001füAÅ\u0007;D\u008c\u0004`\u009dtO?-¢ñ\u0090¬\u009cÍt°\u0018\u0018ù\u009a\u008a%K\u009f\u001a\u0018P9á\u008a\u008al±)\u009b¹¬_¥\u009b½Ì:ÿèLä(Ö<\u0010Ô\u0007)ý OÒ\u0016Õ\faVwR²\u0010 c\u0099\u001b\u0006\u008aÀ\u0087\u0010xO¾\u0003\u000e#ªûªõº\u0017\u0080k¯Ý\u0096µ}ò¬µ+\u00858ló#\u0081ö\u0013oÆ|0\u00041ïdN\u0004ÑWwO\u00951 \u008aHG\u008d²ò7\nB\u0006\u0095\u00ad¤\u0084[õ\u009d\u009cp±çJg(Ñ\u0015óLX\"®yì0¼v\u0018@!iÙa9\u0090un\u009cT@sÊZm-´\\|^Ô# Ù:\u0019U¬\u000b`<q¿\n¤ÁCBcª\u008fýÇ]\u0018\u008dK\u008aô×a\u008e'G^VCÑ?ôúIw\bº\"Ýw¥\u0018\u0004Ý=\u0089küe¬ì_-«\u00918U§\f§=-ê Ìr\u0010\u009c\u0013Mq\u0098\u0001\u0080\u0018\u0087\u0001)¬ZÊ4^\u0010´\u0090Ò`ä\u0001Lá'*\u00adñ-À\u0012z@ßXÚ\u0093©\u001f\u0011_¸È\u009bÚ\\\u0083\u008c¬R~¤\u009a×\u008dË\u0090|Vú+D\u009bðþ§'\u0083¹\bnêí§\\ðAc\u0097H\u000f4±hô\u00ad?Óùu \u0083\\\u0082!\u0013\"\u00105¥_mÏ8\r\u000eóCÏ\"YÕ\fQ ÀjÀ6èãì¨\u0086¦'Éü¬\u0097ô&3¸\u0004¡üÌr\u001b¨½ë\u0082\u0086ÁÒ¨\u0014\u0003 \u0012¬q>¤yújæ\u001eo\u001d|É\u0086Å/ÆÝú3½P\u0086ä4Z2°q¦\u0085}eGL\u0016\u0089r£ÈîP-£\u000f\u0096R&õ¿cÍ¶N\u0084Â\"ë$òô8\tïW»3Æô¤;\u009d+\u009d\u0014\u0011'ªð\u0011+:_Öïþð½ª\u0005\u0097ÌùX!R\u0083÷÷[¡|\u009fù¾óvS\u0005}ÒÅ\u009fB\u0082Y|Ä$oÒ{S\u008bÛ=%ÃlwÄrýòG\u009dÀñÒ\"1\"\u0013º\u0082ãu0é¸Õïá{\"\u0081Öaæ\u0013[0\u0087W\u0010>6,1\u0004¦µ\u0083:\u0016ÖÊ1\u0006þ\u001b".length();
        char cCharAt = 16;
        int i13 = -1;
        while (true) {
            int i14 = i13 + 1;
            String strSubstring = str.substring(i14, i14 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i15 = i12;
                        i12++;
                        strArr[i15] = strIntern;
                        int i16 = i14 + cCharAt;
                        i2 = i16;
                        if (i16 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            e = strArr;
                            f = new String[39];
                            j = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i17 = 1; i17 < 8; i17++) {
                                bArr2[i17] = (byte) ((j2 << (i17 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[19];
                            int i18 = 0;
                            String str3 = "m¦|Ã\u0016T÷&åûÕ³ø\u0082õ1\u009aÈúæ\f¦\u0087\fî(\f\u009eÉbRé\u008a\u0015\u0097Ú¡çd ~\b\u0012\u0013í\u0098\u0016\u0001\u001fì)\u001ck¬\u001aGïíÖh8\u0084f\u008b\u001afìSzN\u0015H=ÒOkì«X\u0014I½ü\u0093PUH\u0089¡Íßæ¥Æ`tkåÖ\u008b] ®fÜMF1úî\u0011ã$9ëLf\u008aòØ²\u0015\u009e®fD»Ï\u0087lÿ\u0080YÎ=\u0012";
                            int length2 = "m¦|Ã\u0016T÷&åûÕ³ø\u0082õ1\u009aÈúæ\f¦\u0087\fî(\f\u009eÉbRé\u008a\u0015\u0097Ú¡çd ~\b\u0012\u0013í\u0098\u0016\u0001\u001fì)\u001ck¬\u001aGïíÖh8\u0084f\u008b\u001afìSzN\u0015H=ÒOkì«X\u0014I½ü\u0093PUH\u0089¡Íßæ¥Æ`tkåÖ\u008b] ®fÜMF1úî\u0011ã$9ëLf\u008aòØ²\u0015\u009e®fD»Ï\u0087lÿ\u0080YÎ=\u0012".length();
                            int i19 = 0;
                            while (true) {
                                int i20 = i19;
                                i19 += 8;
                                byte[] bytes = str3.substring(i20, i19).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i21 = i18;
                                i18++;
                                long j11 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j12 = j11;
                                    int i22 = i21;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j12 >>> 56), (byte) (j12 >>> 48), (byte) (j12 >>> 40), (byte) (j12 >>> 32), (byte) (j12 >>> 24), (byte) (j12 >>> 16), (byte) (j12 >>> 8), (byte) j12});
                                    long j13 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i22) {
                                        case 0:
                                            jArr2[b5] = j13;
                                            if (i19 >= length2) {
                                                h = jArr;
                                                i = new Integer[19];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(380, 4604932837885919789L ^ j2) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(kx.class, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8076, 2960058632918176035L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(570, 154159180311694512L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(kx.class, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2458, 4128815015499368230L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21498, 3353101376848485727L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(kx.class, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7029, 8354973402940642763L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30541, 7845561851416738242L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(kx.class, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4391, 7020731231946121114L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3211, 4247359520332153402L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(kx.class, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19262, 677559590336251293L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5936, 4904395575520860566L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(kx.class, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14273, 6710265975860476256L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21507, 4122372953038772900L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23594, 7688543588461387645L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(kx.class, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2163, 2878355295539168966L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8603, 3741818115843043127L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3156, 4178275056859270914L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(kx.class, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8629, 8769925346312859393L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12115, 7927599146638942705L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24383, 3346390623988489318L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(kx.class, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5493, 3547607305581140952L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6022, 3585075445523683632L ^ j2) /* invoke-custom */, 0));
                                                z = kPropertyArr;
                                                E = new kx(i4, (short) i5, (short) i6);
                                                K = yp.y(E, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28997, 3416002076483223499L ^ j2) /* invoke-custom */, j9, new dg(j3, null, 1, null, (byte) i3), (h) null, (Function0) null, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1963, 5030584386662483168L ^ j2) /* invoke-custom */, (Object) null);
                                                V = yp.I(E, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29929, 3326230363427371597L ^ j2) /* invoke-custom */, (char) i8, new d4(null, j8, 1, null), null, null, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4353, 8736822438559339097L ^ j2) /* invoke-custom */, null, (char) i9, i10);
                                                D = yp.t(E, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24241, 3757085912263381009L ^ j2) /* invoke-custom */, true, j5, null, null, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4353, 8736822438559339097L ^ j2) /* invoke-custom */, null);
                                                y = yp.L(E, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28872, 7661567114802003558L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28992, 8423555373180596756L ^ j2) /* invoke-custom */, new IntRange(1, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1717, 1618157056118441455L ^ j2) /* invoke-custom */), j6, null, kx::B, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1520, 8335415931362854572L ^ j2) /* invoke-custom */, null);
                                                u = yp.t(E, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13235, 7795914424804818180L ^ j2) /* invoke-custom */, false, j5, null, null, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4353, 8736822438559339097L ^ j2) /* invoke-custom */, null);
                                                x = yp.b(E, (short) i7, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27873, 495586514285093459L ^ j2) /* invoke-custom */, new Color((int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26526, 8711469404713395403L ^ j2) /* invoke-custom */, 0, 0, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10278, 2490245315486641017L ^ j2) /* invoke-custom */), null, kx::h, 4, null, j7);
                                                t = yp.t(E, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12643, 7698799882766401500L ^ j2) /* invoke-custom */, false, j5, null, null, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4353, 8736822438559339097L ^ j2) /* invoke-custom */, null);
                                                a = yp.t(E, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(835, 2436025659137494505L ^ j2) /* invoke-custom */, true, j5, null, null, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4353, 8736822438559339097L ^ j2) /* invoke-custom */, null);
                                                b = yp.t(E, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16123, 4919874200452149315L ^ j2) /* invoke-custom */, true, j5, null, null, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4353, 8736822438559339097L ^ j2) /* invoke-custom */, null);
                                                L = new ArrayList();
                                                c = Executors.newSingleThreadExecutor();
                                                O = new bg();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j13;
                                            if (i19 >= length2) {
                                                str3 = "2\u0013\r\u0094Æ@A\u0097}\\\u0081\u009d\u0002ín\u009b";
                                                length2 = "2\u0013\r\u0094Æ@A\u0097}\\\u0081\u009d\u0002ín\u009b".length();
                                                i19 = 0;
                                            }
                                            break;
                                    }
                                    int i23 = i19;
                                    i19 += 8;
                                    byte[] bytes2 = str3.substring(i23, i19).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i21 = i18;
                                    i18++;
                                    j11 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i24 = i12;
                        i12++;
                        strArr[i24] = strIntern;
                        int i25 = i14 + cCharAt;
                        i13 = i25;
                        if (i25 < length) {
                        }
                        str = ">¶H¤¦Ö¤\u0011\u0002àp~Âª\u0019\u0003\u008f¡/a\u0011\u001a\b\u0012Ò·»\u0013y-ò¦ \u001bÞêõA·\u00ad\f!\u0001\u0007\u0089cú\u008aáf\u009dÐ\u0016\beSç!RceÔÃ\u0099\u0089";
                        length = ">¶H¤¦Ö¤\u0011\u0002àp~Âª\u0019\u0003\u008f¡/a\u0011\u001a\b\u0012Ò·»\u0013y-ò¦ \u001bÞêõA·\u00ad\f!\u0001\u0007\u0089cú\u008aáf\u009dÐ\u0016\beSç!RceÔÃ\u0099\u0089".length();
                        cCharAt = ' ';
                        i2 = -1;
                        break;
                        break;
                }
                i14 = i2 + 1;
                strSubstring = str.substring(i14, i14 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i13);
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

    private static String b(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 28067;
        if (f[i3] == null) {
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
                f[i3] = b(((Cipher) objArr[0]).doFinal(e[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/kx", e2);
            }
        }
        return f[i3];
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
            java.lang.String r1 = "su/catlean/kx"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kx.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 8274;
        if (i[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) h[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) j.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/kx", e2);
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
            java.lang.String r1 = "su/catlean/kx"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kx.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
