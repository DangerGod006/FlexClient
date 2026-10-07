package su.catlean;

import io.netty.buffer.Unpooled;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_2540;
import net.minecraft.class_2824;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/u2.class */
public final class u2 extends _g {

    @NotNull
    public static final u2 u = null;
    static final KProperty[] P = null;

    @NotNull
    private static final cw N = null;

    @NotNull
    private static final cw d = null;

    @NotNull
    private static final cp C = null;

    @NotNull
    private static final cq l = null;

    @NotNull
    private static final cq j = null;

    @NotNull
    private static final cq o = null;

    @NotNull
    private static final ct G = null;

    @NotNull
    private static final cp U = null;

    @NotNull
    private static final cq K = null;

    @NotNull
    private static final cq n = null;

    @NotNull
    private static final cq J = null;

    @NotNull
    private static final ct c = null;

    @NotNull
    private static final cp f = null;

    @NotNull
    private static final cq a = null;

    @NotNull
    private static final cq w = null;

    @NotNull
    private static final cq X = null;

    @NotNull
    private static final ct T = null;

    @NotNull
    private static final cp F = null;

    @NotNull
    private static final cq m = null;

    @NotNull
    private static final cq W = null;

    @NotNull
    private static final cq I = null;

    @NotNull
    private static final ct e = null;

    @NotNull
    private static final cp y = null;

    @NotNull
    private static final cq g = null;

    @NotNull
    private static final cq x = null;

    @NotNull
    private static final cq V = null;

    @NotNull
    private static final ct S = null;
    private static String[] t;
    private static final long b = 0;
    private static final String[] h = null;
    private static final String[] i = null;
    private static final Map k = null;
    private static final long[] z = null;
    private static final Integer[] A = null;
    private static final Map B = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private u2(long j2) {
        long j3 = b ^ j2;
        super((String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25017, 6216142702960246828L ^ j3) /* invoke-custom */, jt.Q(), null, 4, null, j3 ^ 36939237259912L);
    }

    @NotNull
    public final p6 x(short s, char c2, int i2) {
        return (p6) N.E(this, ((((((long) s) << 48) | ((((long) c2) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ b) ^ 98940358684023L, P[0]);
    }

    private final wn MU(long j2) {
        return (wn) d.E(this, (b ^ j2) ^ 122814206414275L, P[1]);
    }

    private final h MA(long j2) {
        return (h) C.E(this, (b ^ j2) ^ 21269046454585L, P[2]);
    }

    private final boolean MB(long j2) {
        return ((Boolean) l.E(this, (b ^ j2) ^ 90030495423536L, P[3])).booleanValue();
    }

    private final boolean G(long j2) {
        return ((Boolean) j.E(this, (b ^ j2) ^ 12535929850671L, P[4])).booleanValue();
    }

    private final boolean n(long j2) {
        return ((Boolean) o.E(this, (b ^ j2) ^ 23657322128544L, P[5])).booleanValue();
    }

    private final float H(char c2, char c3, int i2) {
        long j2 = (((((long) c2) << 48) | ((((long) c3) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ b;
        return ((Number) G.E(this, j2 ^ 43523035543891L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5843, 158064318297850231L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final h V(long j2) {
        long j3 = b ^ j2;
        return (h) U.E(this, j3 ^ 10201056526676L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5250, 2609461742615477028L ^ j3) /* invoke-custom */]);
    }

    private final boolean D(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) K.E(this, j3 ^ 87866016251200L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1244, 5808519540856903521L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean s(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) n.E(this, j3 ^ 118348004498323L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12100, 471694469205645863L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean M1(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) J.E(this, j3 ^ 125521425677683L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21765, 6002211117003769507L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final float E(long j2) {
        long j3 = b ^ j2;
        return ((Number) c.E(this, j3 ^ 84099293768388L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18509, 4302330425028299856L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final h z(long j2) {
        long j3 = b ^ j2;
        return (h) f.E(this, j3 ^ 122862054885095L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16588, 673176209114753237L ^ j3) /* invoke-custom */]);
    }

    private final boolean Mj(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) a.E(this, j3 ^ 25396091646483L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9541, 5395823266297395638L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean l(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) w.E(this, j3 ^ 94508491117304L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26295, 8888420676136540843L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean h(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) X.E(this, j3 ^ 128831638528793L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2367, 5639871548648916176L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final float MD(long j2) {
        long j3 = b ^ j2;
        return ((Number) T.E(this, j3 ^ 86392943612565L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18878, 8610194348256507358L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final h Y(long j2) {
        long j3 = b ^ j2;
        return (h) F.E(this, j3 ^ 45323797108720L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14495, 5616365607641235893L ^ j3) /* invoke-custom */]);
    }

    private final boolean C(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) m.E(this, j3 ^ 41249495522300L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32306, 9058008475119749909L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean F(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) W.E(this, j3 ^ 112776526383650L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32460, 6089881115759106563L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean q(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) I.E(this, j3 ^ 65832120849278L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15178, 2902482885811914476L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final float I(int i2, int i3, byte b2) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 40) >>> 32)) | ((((long) b2) << 56) >>> 56)) ^ b;
        return ((Number) e.E(this, j2 ^ 129622565198196L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28000, 7831499882512587467L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final h g(long j2, char c2) {
        long j3 = ((j2 << 16) | ((((long) c2) << 48) >>> 48)) ^ b;
        return (h) y.E(this, j3 ^ 133514850438718L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31509, 574080050781658068L ^ j3) /* invoke-custom */]);
    }

    private final boolean MR(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) g.E(this, j3 ^ 14447805106846L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23147, 19031704343199263L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean a(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) x.E(this, j3 ^ 19157899574806L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31227, 3421953419355089211L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean w(int i2, int i3, short s) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ b;
        return ((Boolean) V.E(this, j2 ^ 100943136643102L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15908, 9194076188305885401L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final float MT(long j2) {
        long j3 = b ^ j2;
        return ((Number) S.E(this, j3 ^ 89875266860307L, P[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4378, 8999345501727689428L ^ j3) /* invoke-custom */])).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [su.catlean.u2] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(su.catlean.api.event.events.network.SendPacket r8) {
        /*
            r7 = this;
            long r0 = su.catlean.u2.b
            r1 = 136515601971568(0x7c2903f63970, double:6.74476690554893E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 107352207326621(0x61a2e22efd9d, double:5.30390376453104E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 16100221285584(0xea49ff874d0, double:7.954566227649E-311)
            long r1 = r1 ^ r2
            r13 = r1
            r1 = r0; r2 = r0; 
            r2 = 52213649470595(0x2f7cf0077483, double:2.5796970447418E-310)
            long r1 = r1 ^ r2
            r15 = r1
            r0 = -1636481440408617630(0xe94a0ccce6ecbd62, double:-1.5578114974481908E199)
            r1 = r9
            int[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[I}
            ).invoke(r0, r1)
            r17 = r0
            r0 = r8
            net.minecraft.class_2596 r0 = r0.getPacket()     // Catch: kotlin.NoWhenBranchMatchedException -> L3c
            boolean r0 = r0 instanceof net.minecraft.class_2824     // Catch: kotlin.NoWhenBranchMatchedException -> L3c
            r1 = r17
            if (r1 != 0) goto L74
            if (r0 == 0) goto Lc5
            goto L46
        L3c:
            r1 = -1630282860464520626(0xe9601260429ac24e, double:-3.8444229126057875E199)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L56
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L56
        L46:
            r0 = r7
            r1 = r8
            net.minecraft.class_2596 r1 = r1.getPacket()     // Catch: kotlin.NoWhenBranchMatchedException -> L56 kotlin.NoWhenBranchMatchedException -> L6a
            net.minecraft.class_2824 r1 = (net.minecraft.class_2824) r1     // Catch: kotlin.NoWhenBranchMatchedException -> L56 kotlin.NoWhenBranchMatchedException -> L6a
            r2 = r17
            if (r2 != 0) goto L8c
            goto L60
        L56:
            r1 = -1630282860464520626(0xe9601260429ac24e, double:-3.8444229126057875E199)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L6a
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L6a
        L60:
            r2 = r11
            r3 = r2; r2 = r1; r1 = r3;      // Catch: kotlin.NoWhenBranchMatchedException -> L6a
            boolean r0 = r0.E(r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L6a
            goto L74
        L6a:
            r1 = -1630282860464520626(0xe9601260429ac24e, double:-3.8444229126057875E199)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L74:
            if (r0 == 0) goto Lc5
            r0 = r7
            r1 = r8
            net.minecraft.class_2596 r1 = r1.getPacket()     // Catch: kotlin.NoWhenBranchMatchedException -> L82
            net.minecraft.class_2824 r1 = (net.minecraft.class_2824) r1     // Catch: kotlin.NoWhenBranchMatchedException -> L82
            goto L8c
        L82:
            r1 = -1630282860464520626(0xe9601260429ac24e, double:-3.8444229126057875E199)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8c:
            r2 = r13
            r3 = r2; r2 = r1; r1 = r3; 
            net.minecraft.class_1297 r0 = r0.G(r1, r2)
            r18 = r0
            r0 = r18
            r1 = r17
            if (r1 != 0) goto Lae
            if (r0 == 0) goto Lb4
            goto Lac
        La2:
            r1 = -1630282860464520626(0xe9601260429ac24e, double:-3.8444229126057875E199)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lac:
            r0 = r18
        Lae:
            boolean r0 = r0 instanceof net.minecraft.class_1511     // Catch: kotlin.NoWhenBranchMatchedException -> Lb5
            if (r0 == 0) goto Lbf
        Lb4:
            return
        Lb5:
            r1 = -1630282860464520626(0xe9601260429ac24e, double:-3.8444229126057875E199)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lbf:
            r0 = r7
            r1 = r15
            r0.T(r1)
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u2.d(su.catlean.api.event.events.network.SendPacket):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void T(long r9) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u2.T(long):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:40:0x01f5
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void A(char r9, char r10, int r11) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u2.A(char, char, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean.u2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r26v0, types: [su.catlean.u2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void MN(long r14) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u2.MN(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v16, types: [long] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void u(double r18, boolean r20, boolean r21, long r22) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u2.u(double, boolean, boolean, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v0, types: [su.catlean.u2] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    static void L(long j2, u2 u2Var, double d2, boolean z2, boolean z3, int i2, Object obj) {
        long j3 = b ^ j2;
        long j4 = j3 ^ 12026231398172L;
        ?? r0 = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-159485134139184671L, j3) /* invoke-custom */;
        try {
            r0 = i2 & 2;
            ?? r02 = r0;
            if (r0 == 0) {
                if (r0 != 0) {
                    z2 = false;
                }
                r02 = i2 & 4;
            }
            ?? r14 = z3;
            ?? r03 = r02;
            if (r0 != 0) {
                r14 = r03;
            } else if (r02 != 0) {
                r03 = 0;
                r14 = r03;
            }
            u2Var.u(d2, z2, r14, j4);
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -152141961374214451L, j3) /* invoke-custom */;
        }
    }

    @Nullable
    public final class_1297 G(long a2, @NotNull class_2824 packet) {
        long j2 = b ^ a2;
        long j3 = j2 ^ 85687025901672L;
        (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5476513824075225128L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(packet, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16527, 4662031172973807358L ^ j2) /* invoke-custom */);
        class_1297 class_2540Var = new class_2540(Unpooled.buffer());
        try {
            packet.method_55976(class_2540Var);
            class_2540Var = zf.z(j3).method_8469(class_2540Var.method_10816());
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5544461338091016800L, j2) /* invoke-custom */ != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[5], 5481505317208491689L, j2) /* invoke-custom */;
            }
            return class_2540Var;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_2540Var, 5488307818839893764L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.minecraft.class_2824$class_5907] */
    @NotNull
    public final class_2824.class_5907 V(short a2, short a3, int a4, @NotNull class_2824 packet) {
        long j2 = (((((long) a2) << 48) | ((((long) a3) << 48) >>> 16)) | ((((long) a4) << 32) >>> 32)) ^ b;
        Intrinsics.checkNotNullParameter(packet, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15197, 2361893881611003757L ^ j2) /* invoke-custom */);
        class_2540 class_2540Var = new class_2540(Unpooled.buffer());
        packet.method_55976(class_2540Var);
        Object obj = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2993125965015645602L, j2) /* invoke-custom */;
        class_2540Var.method_10816();
        try {
            Enum enumMethod_10818 = class_2540Var.method_10818(class_2824.class_5907.class);
            Intrinsics.checkNotNullExpressionValue(enumMethod_10818, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16692, 3239155330972671252L ^ j2) /* invoke-custom */);
            obj = (class_2824.class_5907) enumMethod_10818;
            if (obj != 0) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[3], -2958303069306561332L, j2) /* invoke-custom */;
            }
            return obj;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3000424950079619726L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [net.minecraft.class_2824$class_5907] */
    public final boolean E(long a2, @NotNull class_2824 $this$isAttack) {
        long j2 = b ^ a2;
        Object objV = j2;
        long j3 = objV ^ 46888224866977L;
        int i2 = (int) (objV >>> 48);
        int i3 = (int) ((j3 << 16) >>> 48);
        int i4 = (int) ((j3 << 32) >>> 32);
        try {
            Intrinsics.checkNotNullParameter($this$isAttack, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3938, 830765540091658313L ^ j2) /* invoke-custom */);
            objV = V((short) i2, (short) i3, i4, $this$isAttack);
            return objV == class_2824.class_5907.field_29172;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objV, -4222390850683539895L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean M() {
        long j2 = b ^ 134517012051139L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 109312432346544L) << 32) >>> 32));
            return objX == p6.NCP;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, -1958199289870757891L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean MS() {
        long j2 = b ^ 64951230567940L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 37582122366839L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, 5049754935318179130L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean t() {
        long j2 = b ^ 96679954050303L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 86667748330892L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, -4832580484393494591L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean B() {
        long j2 = b ^ 55507715126664L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 47584004494587L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, -6514355488408695114L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean MJ() {
        long j2 = b ^ 81405597796021L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 91488469280710L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, -7591621735425655413L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean M0() {
        long j2 = b ^ 124144868926561L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 116360811840786L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, -832850775024804001L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean R() {
        long j2 = b ^ 25811749320678L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 15690088912533L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, -1732063757375714088L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean j() {
        long j2 = b ^ 35694177467149L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 62991413254782L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, 7718411372960694323L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean Mx() {
        long j2 = b ^ 44950810645357L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 54825443324446L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, 251434844464425043L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean v() {
        long j2 = b ^ 13962637679251L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 23699764034528L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, -3854128022980140627L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean K() {
        long j2 = b ^ 60191089596796L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 52238387558415L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, 5290701480501666370L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean Q() {
        long j2 = b ^ 14562086494271L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 22001405460812L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, -1139582816899376383L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean p() {
        long j2 = b ^ 63400790217506L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 35825456738897L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, -8993028882479667172L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean MO() {
        long j2 = b ^ 58518979447391L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 48403827436332L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, 6507520524302119265L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean Mm() {
        long j2 = b ^ 28356933337256L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 1059698991579L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, -8018527731511936106L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean MP() {
        long j2 = b ^ 119086379548735L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 129132810920268L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, 1166153060623661825L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean W() {
        long j2 = b ^ 45841989831061L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 53384523426022L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, -2772730864379235669L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean P() {
        long j2 = b ^ 40663263470251L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 67926003860440L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, 3655597654768032149L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean L() {
        long j2 = b ^ 76387986421149L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 101453851038958L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, 7317552455639060131L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean i() {
        long j2 = b ^ 9954523294124L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 17804012554463L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, -451372316748688750L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean MM() {
        long j2 = b ^ 38892715288776L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 64199232424379L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, 8707794637128356854L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean MZ() {
        long j2 = b ^ 110424920859871L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 137793961821612L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, 8416957391454756833L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean Ml() {
        long j2 = b ^ 107292381412211L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 132663256865280L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, 3126360011226939469L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean Z() {
        long j2 = b ^ 21360816703048L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 11345524123451L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, -7613197575649706634L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean r() {
        long j2 = b ^ 129515310537633L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 119811402693330L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, 842484852123967647L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p6] */
    private static final boolean e() {
        long j2 = b ^ 121633346893499L;
        Object objX = j2;
        try {
            objX = u.x((short) (objX >>> 48), (char) ((r1 << 16) >>> 48), (int) (((objX ^ 131542473250760L) << 32) >>> 32));
            return objX == p6.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, -1825364301741568635L, j2) /* invoke-custom */;
        }
    }

    public static void n(String[] strArr) {
        t = strArr;
    }

    public static String[] MQ() {
        return t;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 19423;
        if (i[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) k.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                i[i3] = b(((Cipher) objArr[0]).doFinal(h[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/u2", e2);
            }
        }
        return i[i3];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strB), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strB;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.u2.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/u2.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x000C: CONST
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: jadx.plugins.input.java.utils.JavaClassParseException: Unsupported constant type: FIELD_REF
        	at jadx.plugins.input.java.data.code.decoders.LoadConstDecoder.decode(LoadConstDecoder.java:65)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.u2.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/u2.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u2.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 8955;
        if (A[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) z[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) B.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    B.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/u2", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            A[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return A[i3].intValue();
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iC)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iC;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.u2.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/u2.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x000C: CONST
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: jadx.plugins.input.java.utils.JavaClassParseException: Unsupported constant type: FIELD_REF
        	at jadx.plugins.input.java.data.code.decoders.LoadConstDecoder.decode(LoadConstDecoder.java:65)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.u2.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/u2.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u2.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
