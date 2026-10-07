package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2663;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.PostTasksProcessEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PostSyncEvent;
import su.catlean.api.event.events.render.HotBarRenderEventPost;
import su.catlean.api.event.events.render.HotBarRenderEventPre;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.MinecraftAccessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qb.class */
public final class qb extends _g {

    @NotNull
    public static final qb a = null;
    static final KProperty[] C = null;

    @NotNull
    private static final c8 w = null;

    @NotNull
    private static final ct J = null;

    @NotNull
    private static final ct K = null;

    @NotNull
    private static final cq E = null;

    @NotNull
    private static final cw OA = null;

    @NotNull
    private static final cq B = null;

    @NotNull
    private static final av d = null;

    @NotNull
    private static final cw y = null;

    @NotNull
    private static final cp O = null;

    @NotNull
    private static final cb z = null;

    @NotNull
    private static final cl Y = null;

    @NotNull
    private static final cl O5 = null;

    @NotNull
    private static final cl t = null;

    @NotNull
    private static final cl D = null;

    @NotNull
    private static final cl A = null;

    @NotNull
    private static final cl n = null;

    @NotNull
    private static final cl W = null;

    @NotNull
    private static final cl l = null;

    @NotNull
    private static final cl F = null;

    @NotNull
    private static final cq u = null;

    @NotNull
    private static final cq x = null;

    @NotNull
    private static final cq T = null;

    @NotNull
    private static final cw g = null;

    @NotNull
    private static final cw Os = null;

    @NotNull
    private static final cq h = null;

    @NotNull
    private static final cq c = null;

    @NotNull
    private static final cq Og = null;

    @NotNull
    private static final cp k = null;

    @NotNull
    private static final cq Ob = null;

    @NotNull
    private static final cq S = null;

    @NotNull
    private static final cq N = null;

    @NotNull
    private static final cq V = null;

    @NotNull
    private static final cq P = null;

    @NotNull
    private static final class_2960 U = null;

    @NotNull
    private static final class_2960 I = null;

    @NotNull
    private static class_1799 OJ;
    private static int b;
    private static int f;

    @NotNull
    private static AtomicBoolean o;
    private static int X;

    @NotNull
    private static final bg e = null;

    @Nullable
    private static class_1799 i;
    private static long j;
    private static float Ot;
    private static float G;
    private static float m;
    private static int[] L;
    private static final long ab = 0;
    private static final String[] fb = null;
    private static final String[] gb = null;
    private static final Map hb = null;
    private static final long[] lb = null;
    private static final Integer[] mb = null;
    private static final Map nb = null;
    private static final long[] ob = null;
    private static final Long[] pb = null;
    private static final Map qb = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private qb(char c2, int i2, short s) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s) << 48) >>> 48)) ^ ab;
        super((String) b(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29404, 1150790725087606723L ^ j2) /* invoke-custom */, j2 ^ 98268444159107L, jt.n(), CollectionsKt.listOf((Object[]) new String[]{(String) b(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20831, 5211928801485493488L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26367, 7916646601312904182L ^ j2) /* invoke-custom */}));
    }

    private final int A(long j2) {
        return ((Number) w.E(this, (ab ^ j2) ^ 121532085675659L, C[0])).intValue();
    }

    private final float D5(long j2) {
        return ((Number) J.E(this, (ab ^ j2) ^ 108151546100280L, C[1])).floatValue();
    }

    private final float r(long j2) {
        return ((Number) K.E(this, (ab ^ j2) ^ 20083802806563L, C[2])).floatValue();
    }

    private final boolean t(long j2, int i2) {
        return ((Boolean) E.E(this, (((j2 << 32) | ((((long) i2) << 32) >>> 32)) ^ ab) ^ 73811906384048L, C[3])).booleanValue();
    }

    private final w4 L(long j2) {
        return (w4) OA.E(this, (ab ^ j2) ^ 5655555652403L, C[4]);
    }

    private final boolean DV(long j2) {
        return ((Boolean) B.E(this, (ab ^ j2) ^ 78720498421279L, C[5])).booleanValue();
    }

    private final lj DH(long j2) {
        long j3 = ab ^ j2;
        return (lj) d.E(this, j3 ^ 53998747298918L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3788, 3008019870936061144L ^ j3) /* invoke-custom */]);
    }

    private final b0 Dh(long j2) {
        long j3 = ab ^ j2;
        return (b0) y.E(this, j3 ^ 37793674466662L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13835, 8138711644100285804L ^ j3) /* invoke-custom */]);
    }

    private final h q(short s, int i2, int i3) {
        long j2 = (((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ ab;
        return (h) O.E(this, j2 ^ 88079593091665L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8015, 4029079391754967832L ^ j2) /* invoke-custom */]);
    }

    private final oi T(char c2, int i2, int i3) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ ab;
        return (oi) z.E(this, j2 ^ 127124711778660L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28709, 3769721263280500560L ^ j2) /* invoke-custom */]);
    }

    private final void M(oi oiVar, long j2) {
        long j3 = ab ^ j2;
        z.b(this, j3 ^ 7109323821652L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31290, 6492754681204476338L ^ j3) /* invoke-custom */], oiVar);
    }

    private final String s(long j2) {
        long j3 = ab ^ j2;
        return (String) Y.E(this, j3 ^ 86725169544211L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31251, 56532106740363383L ^ j3) /* invoke-custom */]);
    }

    private final void x(String str, long j2) {
        long j3 = ab ^ j2;
        Y.b(this, j3 ^ 53439268268471L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27405, 1148849161692193605L ^ j3) /* invoke-custom */], str);
    }

    private final String e(long j2) {
        long j3 = ab ^ j2;
        return (String) O5.E(this, j3 ^ 70426966443306L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9743, 1485524713091142935L ^ j3) /* invoke-custom */]);
    }

    private final void q(long j2, String str) {
        long j3 = ab ^ j2;
        O5.b(this, j3 ^ 44375154582199L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8885, 6828365640976081382L ^ j3) /* invoke-custom */], str);
    }

    private final String p(short s, int i2, int i3) {
        long j2 = (((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ ab;
        return (String) t.E(this, j2 ^ 106129982175758L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23929, 8429406630832083275L ^ j2) /* invoke-custom */]);
    }

    private final void y(long j2, String str) {
        long j3 = ab ^ j2;
        t.b(this, j3 ^ 103491852405271L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3122, 4625246497423681493L ^ j3) /* invoke-custom */], str);
    }

    private final String D8(long j2) {
        long j3 = ab ^ j2;
        return (String) D.E(this, j3 ^ 93075628117028L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16730, 1410781963046878029L ^ j3) /* invoke-custom */]);
    }

    private final void O(long j2, String str) {
        long j3 = ab ^ j2;
        D.b(this, j3 ^ 47228051177807L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1427, 624259086981309705L ^ j3) /* invoke-custom */], str);
    }

    private final String Dp(long j2) {
        long j3 = ab ^ j2;
        return (String) A.E(this, j3 ^ 119528966784763L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32049, 1834235744835997163L ^ j3) /* invoke-custom */]);
    }

    private final void M(long j2, String str) {
        long j3 = ab ^ j2;
        A.b(this, j3 ^ 21218951684513L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32049, 1834312773157780829L ^ j3) /* invoke-custom */], str);
    }

    private final String DK(long j2) {
        long j3 = ab ^ j2;
        return (String) n.E(this, j3 ^ 78097132893873L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29000, 3906660964134531534L ^ j3) /* invoke-custom */]);
    }

    private final void H(char c2, short s, int i2, String str) {
        long j2 = (((((long) c2) << 48) | ((((long) s) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ ab;
        n.b(this, j2 ^ 18865788197035L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16319, 3559310905995151087L ^ j2) /* invoke-custom */], str);
    }

    private final String DG(long j2) {
        long j3 = ab ^ j2;
        return (String) W.E(this, j3 ^ 25383105340609L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20942, 7037287039831212826L ^ j3) /* invoke-custom */]);
    }

    private final void p(String str, long j2) {
        long j3 = ab ^ j2;
        W.b(this, j3 ^ 119428897239039L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5691, 3720326334243280952L ^ j3) /* invoke-custom */], str);
    }

    private final String K(long j2) {
        long j3 = ab ^ j2;
        return (String) l.E(this, j3 ^ 1207850152693L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20021, 3617264381341567741L ^ j3) /* invoke-custom */]);
    }

    private final void D(String str, long j2) {
        long j3 = ab ^ j2;
        l.b(this, j3 ^ 75001469974945L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7598, 6954893151777113542L ^ j3) /* invoke-custom */], str);
    }

    private final String W(long j2) {
        long j3 = ab ^ j2;
        return (String) F.E(this, j3 ^ 78195030072686L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4729, 2472924728124111112L ^ j3) /* invoke-custom */]);
    }

    private final void g(long j2, String str) {
        long j3 = ab ^ j2;
        F.b(this, j3 ^ 59697162617205L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5823, 7188106445196719666L ^ j3) /* invoke-custom */], str);
    }

    private final boolean v(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) u.E(this, j3 ^ 57235758371267L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1566, 8744977514488930771L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean z(long j2, short s) {
        long j3 = ((j2 << 16) | ((((long) s) << 48) >>> 48)) ^ ab;
        return ((Boolean) x.E(this, j3 ^ 43915116664942L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12744, 3808511871129034642L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean V(int i2, short s, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ ab;
        return ((Boolean) T.E(this, j2 ^ 67476907345414L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31103, 4101805229553469791L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final lk DX(long j2) {
        long j3 = ab ^ j2;
        return (lk) g.E(this, j3 ^ 18924858587937L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13766, 8965701650787760382L ^ j3) /* invoke-custom */]);
    }

    private final gu DB(short s, short s2, int i2) {
        long j2 = (((((long) s) << 48) | ((((long) s2) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ ab;
        return (gu) Os.E(this, j2 ^ 54534968406857L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16857, 7055949081628198066L ^ j2) /* invoke-custom */]);
    }

    private final boolean D4(int i2, int i3, byte b2) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 40) >>> 32)) | ((((long) b2) << 56) >>> 56)) ^ ab;
        return ((Boolean) h.E(this, j2 ^ 123047637050435L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(416, 141580830569632731L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean g(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) c.E(this, j3 ^ 80105174972034L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1503, 7931600282562413939L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean D7(char c2, int i2, char c3) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c3) << 48) >>> 48)) ^ ab;
        return ((Boolean) Og.E(this, j2 ^ 46621058986632L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21463, 5973817552378844999L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final h H(char c2, int i2, char c3) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c3) << 48) >>> 48)) ^ ab;
        return (h) k.E(this, j2 ^ 86414577574337L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9118, 1017105942656185444L ^ j2) /* invoke-custom */]);
    }

    private final boolean Ds(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) Ob.E(this, j3 ^ 115725599672673L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25499, 581616274402614482L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean Dn(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) S.E(this, j3 ^ 39450021183351L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8906, 2608822420738665392L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean Dk(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) N.E(this, j3 ^ 29039556147672L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20402, 4154540625741250624L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean DT(int i2, int i3, char c2) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ ab;
        return ((Boolean) V.E(this, j2 ^ 95070719795357L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4728, 7240641129626371283L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean Dr(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) P.E(this, j3 ^ 74432707970739L, C[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12783, 996698634295017772L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final int M() {
        return X;
    }

    public final void P(int i2) {
        X = i2;
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
    private final void Z(su.catlean.api.event.events.render.Render2DEvent r13) {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.Z(su.catlean.api.event.events.render.Render2DEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [float] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v23, types: [float] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Flow
    private final void m(PostTasksProcessEvent postTasksProcessEvent) {
        long j2 = ab ^ 105295728111093L;
        long j3 = j2 ^ 81858348574609L;
        long j4 = j2 ^ 115107745532243L;
        long j5 = j2 ^ 2972810284028L;
        long j6 = j2 ^ 118393553527552L;
        ?? S2 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8159554162782423846L, j2) /* invoke-custom */;
        try {
            S2 = S(j3);
            if (S2 == 0) {
                return;
            }
            float fMethod_6032 = zf.v(j6).method_6032() + zf.v(j6).method_6067();
            ?? r0 = fMethod_6032;
            ?? r02 = r0;
            if (S2 == 0) {
                try {
                    try {
                        r0 = (r0 > m ? 1 : (r0 == m ? 0 : -1));
                        if (r0 < 0) {
                            G = Ot;
                            Ot = m - fMethod_6032;
                        }
                        r02 = fMethod_6032;
                    } catch (NoWhenBranchMatchedException unused) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 8181536703017285261L, j2) /* invoke-custom */;
                    }
                } catch (NoWhenBranchMatchedException unused2) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 8181536703017285261L, j2) /* invoke-custom */;
                }
            }
            m = r02;
            h(Q(j5), j4);
        } catch (NoWhenBranchMatchedException unused3) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(S2, 8181536703017285261L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v0 */
    @Flow
    private final void k(PostSyncEvent postSyncEvent) {
        long j2 = ab ^ 68738775943861L;
        long j3 = j2 ^ 46489802852966L;
        long j4 = j2 ^ 1971623002716L;
        long j5 = j2 ^ 12016405791808L;
        ?? B2 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7602940353685083034L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    B2 = B(j4);
                    try {
                        if (B2 == 0) {
                            if (B2 != 0) {
                                B2 = zf.v(j5).method_6115();
                                if (B2 == 0) {
                                    if (B2 == 0) {
                                        MinecraftAccessor minecraftAccessorF = zf.F(j3);
                                        Intrinsics.checkNotNull(minecraftAccessorF, (String) b(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28667, 5621336353515674889L ^ j2) /* invoke-custom */);
                                        minecraftAccessorF.idoItemUse();
                                    }
                                    B2 = X;
                                }
                            } else {
                                B2 = X;
                            }
                        }
                        X = (B2 == true ? 1 : 0) - 1;
                    } catch (NoWhenBranchMatchedException unused) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B2, -7581025983172406835L, j2) /* invoke-custom */;
                    }
                } catch (NoWhenBranchMatchedException unused2) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B2, -7581025983172406835L, j2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused3) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B2, -7581025983172406835L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused4) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B2, -7581025983172406835L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v16, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v42, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow
    private final void Y(ReceivePacket receivePacket) {
        long j2 = ab ^ 47936503321026L;
        long j3 = j2 ^ 69634979877137L;
        long j4 = j2 ^ 28145413602813L;
        long j5 = j2 ^ 32880921567632L;
        long j6 = j2 ^ 39047038430020L;
        long j7 = j2 ^ 35118362877751L;
        Object objF = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8283250997811464431L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    if (receivePacket.getPacket() instanceof class_2663) {
                        objF = zf.F(j3);
                        Object objG = objF;
                        if (objF == 0) {
                            if (((class_310) objF).field_1724 == null) {
                                return;
                            } else {
                                objG = zf.F(j3);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (((class_310) objG).field_1687 != null) {
                                        objG = g(j6);
                                        qb qbVarAreEqual = objG;
                                        if (objF == 0) {
                                            if (objG == 0) {
                                                return;
                                            } else {
                                                qbVarAreEqual = receivePacket.getPacket().method_11470();
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (objF == 0) {
                                                        if (qbVarAreEqual != 3) {
                                                            qbVarAreEqual = receivePacket.getPacket().method_11470();
                                                            if (objF == 0) {
                                                                if (qbVarAreEqual != (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2583, 4617346811703802960L ^ j2) /* invoke-custom */) {
                                                                    return;
                                                                } else {
                                                                    qbVarAreEqual = Intrinsics.areEqual(receivePacket.getPacket().method_11469(zf.z(j5)), zf.v(j7));
                                                                }
                                                            }
                                                        } else {
                                                            qbVarAreEqual = Intrinsics.areEqual(receivePacket.getPacket().method_11469(zf.z(j5)), zf.v(j7));
                                                        }
                                                    }
                                                    if (qbVarAreEqual != 0) {
                                                        try {
                                                            qbVarAreEqual = this;
                                                            qbVarAreEqual.a(j4);
                                                        } catch (NoWhenBranchMatchedException unused) {
                                                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(qbVarAreEqual, -8233182558325404998L, j2) /* invoke-custom */;
                                                        }
                                                    }
                                                } catch (NoWhenBranchMatchedException unused2) {
                                                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(qbVarAreEqual, -8233182558325404998L, j2) /* invoke-custom */;
                                                }
                                            } catch (NoWhenBranchMatchedException unused3) {
                                                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(qbVarAreEqual, -8233182558325404998L, j2) /* invoke-custom */;
                                            }
                                        } catch (NoWhenBranchMatchedException unused4) {
                                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(qbVarAreEqual, -8233182558325404998L, j2) /* invoke-custom */;
                                        }
                                    }
                                } catch (NoWhenBranchMatchedException unused5) {
                                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objG, -8233182558325404998L, j2) /* invoke-custom */;
                                }
                            } catch (NoWhenBranchMatchedException unused6) {
                                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objG, -8233182558325404998L, j2) /* invoke-custom */;
                            }
                        } catch (NoWhenBranchMatchedException unused7) {
                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objG, -8233182558325404998L, j2) /* invoke-custom */;
                        }
                    }
                } catch (NoWhenBranchMatchedException unused8) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, -8233182558325404998L, j2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused9) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, -8233182558325404998L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused10) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, -8233182558325404998L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:106:0x0246
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void G(su.catlean.api.event.events.player.UpdateSelectedSlotEvent r10) {
        /*
            Method dump skipped, instruction units count: 825
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.G(su.catlean.api.event.events.player.UpdateSelectedSlotEvent):void");
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
    private final void T(su.catlean.api.event.events.player.ClickSlotEvent r9) {
        /*
            Method dump skipped, instruction units count: 1846
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.T(su.catlean.api.event.events.player.ClickSlotEvent):void");
    }

    @Flow
    private final void S(HotBarRenderEventPre hotBarRenderEventPre) {
        long j2 = ab ^ 49260794230301L;
        long j3 = j2 ^ 61578327750350L;
        long j4 = j2 ^ 86115508514687L;
        long j5 = j2 ^ 47920453366790L;
        long j6 = j2 ^ 27096343640296L;
        Object objMethod_1560 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3086369060224012494L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    objMethod_1560 = zf.F(j3).method_1560();
                    if (objMethod_1560 != null) {
                        qb qbVarV = this;
                        if (objMethod_1560 == null) {
                            if (qbVarV.Dh(j4) != b0.CUSTOM) {
                                return;
                            } else {
                                qbVarV = this;
                            }
                        }
                        try {
                            if (qbVarV.DV(j5)) {
                                class_1799 class_1799VarMethod_6079 = zf.v(j6).method_6079();
                                Intrinsics.checkNotNullExpressionValue(class_1799VarMethod_6079, (String) b(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21036, 2342336996187479164L ^ j2) /* invoke-custom */);
                                OJ = class_1799VarMethod_6079;
                                qbVarV = zf.v(j6);
                                qbVarV.method_6122(class_1268.field_5810, class_1799.field_8037);
                            }
                        } catch (NoWhenBranchMatchedException unused) {
                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(qbVarV, 3054244573195152741L, j2) /* invoke-custom */;
                        }
                    }
                } catch (NoWhenBranchMatchedException unused2) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_1560, 3054244573195152741L, j2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused3) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_1560, 3054244573195152741L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused4) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_1560, 3054244573195152741L, j2) /* invoke-custom */;
        }
    }

    @Flow
    private final void U(HotBarRenderEventPost hotBarRenderEventPost) {
        long j2 = ab ^ 74656553405473L;
        long j3 = j2 ^ 95839697849586L;
        long j4 = j2 ^ 36805407135043L;
        long j5 = j2 ^ 75584460099130L;
        long j6 = j2 ^ 131459865330388L;
        Object objMethod_1560 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8004986271873881358L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    objMethod_1560 = zf.F(j3).method_1560();
                    if (objMethod_1560 != null) {
                        qb qbVarV = this;
                        if (objMethod_1560 == null) {
                            if (qbVarV.Dh(j4) != b0.CUSTOM) {
                                return;
                            } else {
                                qbVarV = this;
                            }
                        }
                        try {
                            if (qbVarV.DV(j5)) {
                                qbVarV = zf.v(j6);
                                qbVarV.method_6122(class_1268.field_5810, OJ);
                            }
                        } catch (NoWhenBranchMatchedException unused) {
                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(qbVarV, -8043793513268471975L, j2) /* invoke-custom */;
                        }
                    }
                } catch (NoWhenBranchMatchedException unused2) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_1560, -8043793513268471975L, j2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused3) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_1560, -8043793513268471975L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused4) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_1560, -8043793513268471975L, j2) /* invoke-custom */;
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
    private final void a(long r51) {
        /*
            Method dump skipped, instruction units count: 1940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.a(long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0245: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void h(int r13, long r14) {
        /*
            Method dump skipped, instruction units count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.h(int, long):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:488:0x0cb8
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final int Q(long r13) {
        /*
            Method dump skipped, instruction units count: 4428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.Q(long):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final su.catlean.bz R(su.catlean.bz r15, short r16, long r17) {
        /*
            Method dump skipped, instruction units count: 2552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.R(su.catlean.bz, short, long):su.catlean.bz");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final su.catlean.bz L(net.minecraft.class_1792 r14, long r15, boolean r17) {
        /*
            Method dump skipped, instruction units count: 1456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.L(net.minecraft.class_1792, long, boolean):su.catlean.bz");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067 A[Catch: NoWhenBranchMatchedException -> 0x0070, TryCatch #0 {NoWhenBranchMatchedException -> 0x0070, blocks: (B:12:0x0057, B:14:0x0067), top: B:20:0x0057 }] */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [float] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float C(long r8) {
        /*
            r7 = this;
            long r0 = su.catlean.qb.ab
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 134254628582116(0x7a1a977232e4, double:6.63305997776E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 11005700608511(0xa0276e011ff, double:5.4375385790794E-311)
            long r1 = r1 ^ r2
            r12 = r1
            r1 = r0; r2 = r0; 
            r2 = 119775365728813(0x6cef60208a2d, double:5.91768934246775E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r0 = 6346002906669900299(0x5811880563a7e20b, double:1.7269241532772997E116)
            r1 = r8
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r16 = r0
            r0 = r14
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)     // Catch: kotlin.NoWhenBranchMatchedException -> L3a
            boolean r0 = r0.method_6128()     // Catch: kotlin.NoWhenBranchMatchedException -> L3a
            r1 = r16
            if (r1 != 0) goto L57
            if (r0 == 0) goto L7a
            goto L44
        L3a:
            r1 = 6388267055572410272(0x58a7af0a61b95fa0, double:1.1944798073198692E119)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L4d
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L4d
        L44:
            su.catlean.dm r0 = su.catlean.dm.h     // Catch: kotlin.NoWhenBranchMatchedException -> L4d
            int r0 = r0.Z()     // Catch: kotlin.NoWhenBranchMatchedException -> L4d
            goto L57
        L4d:
            r1 = 6388267055572410272(0x58a7af0a61b95fa0, double:1.1944798073198692E119)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L57:
            r1 = 29000(0x7148, float:4.0638E-41)
            r2 = 3906706849845023289(0x3637692e6a991239, double:1.601836351739123E-47)
            r3 = r8
            long r2 = r2 ^ r3
            int r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/qb;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "e"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L70
            if (r0 <= r1) goto L7a
            r0 = r7
            r1 = r12
            float r0 = r0.r(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L70
            goto L7f
        L70:
            r1 = 6388267055572410272(0x58a7af0a61b95fa0, double:1.1944798073198692E119)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L7a:
            r0 = r7
            r1 = r10
            float r0 = r0.D5(r1)
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.C(long):float");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:41:0x013a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final boolean B(long r10) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.B(long):boolean");
    }

    private final float D_(long j2) {
        long j3 = (ab ^ j2) ^ 26453212229887L;
        return zf.v(j3).method_6032() + zf.v(j3).method_6067();
    }

    private final int A(int i2, int i3) {
        return ((i2 % i3) + i3) % i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e5 A[EDGE_INSN: B:110:0x02e5->B:86:0x02e5 BREAK  A[LOOP:2: B:6:0x0143->B:114:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e5 A[EDGE_INSN: B:111:0x02e5->B:86:0x02e5 BREAK  A[LOOP:2: B:6:0x0143->B:114:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[LOOP:3: B:8:0x0147->B:115:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e2 A[PHI: r0 r1
  0x01e2: PHI (r0v39 ??) = (r0v93 ??), (r0v94 ??) binds: [B:26:0x019b, B:38:0x01e0] A[DONT_GENERATE, DONT_INLINE]
  0x01e2: PHI (r1v46 su.catlean._g[]) = (r1v45 su.catlean._g[]), (r1v72 su.catlean._g[]) binds: [B:26:0x019b, B:38:0x01e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023c A[PHI: r0
  0x023c: PHI (r0v40 ??) = (r0v39 ??), (r0v63 ??) binds: [B:39:0x01e2, B:50:0x022e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b4  */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r40v0 */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1, types: [int] */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v4 */
    /* JADX WARN: Type inference failed for: r41v5 */
    /* JADX WARN: Type inference failed for: r41v6 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List Z(long r10) {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.Z(long):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.w4] */
    private static final boolean i() {
        long j2 = ab ^ 16175526726033L;
        Object objL = j2;
        try {
            objL = a.L(objL ^ 82817153318566L);
            return objL == w4.OFF;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objL, 6192160567849145065L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.qb] */
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
    private static final boolean E() {
        /*
            long r0 = su.catlean.qb.ab
            r1 = 123914661477119(0x70b321613aff, double:6.1221977251892E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 131851551029476(0x77eb14dcb8e4, double:6.5143321714548E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 58649236360648(0x355756e64dc8, double:2.89765728406195E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 2753564352705305644(0x2636a030952d9c2c, double:1.3369791088633305E-124)
            r1 = r7
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.qb r0 = su.catlean.qb.a     // Catch: kotlin.NoWhenBranchMatchedException -> L38
            r1 = r13
            if (r1 != 0) goto L52
            r1 = r11
            su.catlean.w4 r0 = r0.L(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L38 kotlin.NoWhenBranchMatchedException -> L48
            su.catlean.w4 r1 = su.catlean.w4.OFF     // Catch: kotlin.NoWhenBranchMatchedException -> L38 kotlin.NoWhenBranchMatchedException -> L48
            if (r0 != r1) goto L6f
            goto L42
        L38:
            r1 = 2774366077649625479(0x2680873f97332187, double:3.125362080945363E-123)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L48
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L48
        L42:
            su.catlean.qb r0 = su.catlean.qb.a     // Catch: kotlin.NoWhenBranchMatchedException -> L48
            goto L52
        L48:
            r1 = 2774366077649625479(0x2680873f97332187, double:3.125362080945363E-123)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r1 = r9
            boolean r0 = r0.DV(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = 2774366077649625479(0x2680873f97332187, double:3.125362080945363E-123)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6b:
            r0 = 1
        L6c:
            goto L70
        L6f:
            r0 = 0
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.E():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.qb] */
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
    private static final boolean Df() {
        /*
            long r0 = su.catlean.qb.ab
            r1 = 62100246198418(0x387ad71d7892, double:3.0681598244922E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 69419063638665(0x3f22e2a0fa89, double:3.42975745103316E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 138120252755877(0x7d9ea09a0fa5, double:6.82404718815886E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 7231629784484273729(0x645be8f96351de41, double:2.7612020787716417E175)
            r1 = r7
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.qb r0 = su.catlean.qb.a     // Catch: kotlin.NoWhenBranchMatchedException -> L38
            r1 = r13
            if (r1 != 0) goto L52
            r1 = r11
            su.catlean.w4 r0 = r0.L(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L38 kotlin.NoWhenBranchMatchedException -> L48
            su.catlean.w4 r1 = su.catlean.w4.OFF     // Catch: kotlin.NoWhenBranchMatchedException -> L38 kotlin.NoWhenBranchMatchedException -> L48
            if (r0 != r1) goto L6f
            goto L42
        L38:
            r1 = 7272697630374716394(0x64edcff6614f63ea, double:1.510093063954925E178)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L48
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L48
        L42:
            su.catlean.qb r0 = su.catlean.qb.a     // Catch: kotlin.NoWhenBranchMatchedException -> L48
            goto L52
        L48:
            r1 = 7272697630374716394(0x64edcff6614f63ea, double:1.510093063954925E178)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r1 = r9
            boolean r0 = r0.DV(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = 7272697630374716394(0x64edcff6614f63ea, double:1.510093063954925E178)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6b:
            r0 = 1
        L6c:
            goto L70
        L6f:
            r0 = 0
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.Df():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083 A[EXC_TOP_SPLITTER, PHI: r0
  0x0083: PHI (r0v17 ??) = (r0v10 ??), (r0v16 ??) binds: [B:14:0x005b, B:20:0x0073] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v20, types: [su.catlean.b0] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
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
    private static final boolean D() {
        /*
            long r0 = su.catlean.qb.ab
            r1 = 10519908232646(0x9915b64adc6, double:5.197525255153E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 117709535442084(0x6b0e630bf4a4, double:5.81562376498663E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 16258310942685(0xec96ed92fdd, double:8.0326728961855E-311)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 84066148014833(0x4c752ce3daf1, double:4.15341957123343E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -5688089129000629483(0xb10fd912ef280b15, double:-2.253162271222893E-72)
            r1 = r7
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.qb r0 = su.catlean.qb.a     // Catch: kotlin.NoWhenBranchMatchedException -> L3f
            r1 = r15
            if (r1 != 0) goto L59
            r1 = r13
            su.catlean.w4 r0 = r0.L(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L3f kotlin.NoWhenBranchMatchedException -> L4f
            su.catlean.w4 r1 = su.catlean.w4.OFF     // Catch: kotlin.NoWhenBranchMatchedException -> L3f kotlin.NoWhenBranchMatchedException -> L4f
            if (r0 != r1) goto L9b
            goto L49
        L3f:
            r1 = -5640197653817542978(0xb1b9fe1ded36b6be, double:-3.7660967004401327E-69)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L4f
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L4f
        L49:
            su.catlean.qb r0 = su.catlean.qb.a     // Catch: kotlin.NoWhenBranchMatchedException -> L4f
            goto L59
        L4f:
            r1 = -5640197653817542978(0xb1b9fe1ded36b6be, double:-3.7660967004401327E-69)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L59:
            r1 = r15
            if (r1 != 0) goto L83
            r1 = r11
            boolean r0 = r0.DV(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L69 kotlin.NoWhenBranchMatchedException -> L79
            if (r0 == 0) goto L9b
            goto L73
        L69:
            r1 = -5640197653817542978(0xb1b9fe1ded36b6be, double:-3.7660967004401327E-69)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L79
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L79
        L73:
            su.catlean.qb r0 = su.catlean.qb.a     // Catch: kotlin.NoWhenBranchMatchedException -> L79
            goto L83
        L79:
            r1 = -5640197653817542978(0xb1b9fe1ded36b6be, double:-3.7660967004401327E-69)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L83:
            r1 = r9
            su.catlean.b0 r0 = r0.Dh(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L91
            su.catlean.b0 r1 = su.catlean.b0.CUSTOM     // Catch: kotlin.NoWhenBranchMatchedException -> L91
            if (r0 != r1) goto L9b
            r0 = 1
            goto L9c
        L91:
            r1 = -5640197653817542978(0xb1b9fe1ded36b6be, double:-3.7660967004401327E-69)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.D():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[PHI: r0
  0x00a4: PHI (r0v17 ??) = (r0v10 ??), (r0v16 ??) binds: [B:14:0x007c, B:20:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[EXC_TOP_SPLITTER, PHI: r0
  0x00d0: PHI (r0v24 ??) = (r0v17 ??), (r0v23 ??) binds: [B:24:0x00a6, B:30:0x00c0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v22, types: [su.catlean.b0] */
    /* JADX WARN: Type inference failed for: r0v23, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
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
    private static final boolean Y() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.Y():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[PHI: r0
  0x00a4: PHI (r0v17 ??) = (r0v10 ??), (r0v16 ??) binds: [B:14:0x007c, B:20:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[EXC_TOP_SPLITTER, PHI: r0
  0x00d0: PHI (r0v24 ??) = (r0v17 ??), (r0v23 ??) binds: [B:24:0x00a6, B:30:0x00c0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v22, types: [su.catlean.b0] */
    /* JADX WARN: Type inference failed for: r0v23, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
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
    private static final boolean n() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.n():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[PHI: r0
  0x00a4: PHI (r0v17 ??) = (r0v10 ??), (r0v16 ??) binds: [B:14:0x007c, B:20:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[EXC_TOP_SPLITTER, PHI: r0
  0x00d0: PHI (r0v24 ??) = (r0v17 ??), (r0v23 ??) binds: [B:24:0x00a6, B:30:0x00c0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v22, types: [su.catlean.b0] */
    /* JADX WARN: Type inference failed for: r0v23, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
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
    private static final boolean l() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.l():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[PHI: r0
  0x00a4: PHI (r0v17 ??) = (r0v10 ??), (r0v16 ??) binds: [B:14:0x007c, B:20:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[EXC_TOP_SPLITTER, PHI: r0
  0x00d0: PHI (r0v24 ??) = (r0v17 ??), (r0v23 ??) binds: [B:24:0x00a6, B:30:0x00c0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v22, types: [su.catlean.b0] */
    /* JADX WARN: Type inference failed for: r0v23, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
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
    private static final boolean w() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.w():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[PHI: r0
  0x00a4: PHI (r0v17 ??) = (r0v10 ??), (r0v16 ??) binds: [B:14:0x007c, B:20:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[EXC_TOP_SPLITTER, PHI: r0
  0x00d0: PHI (r0v24 ??) = (r0v17 ??), (r0v23 ??) binds: [B:24:0x00a6, B:30:0x00c0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v22, types: [su.catlean.b0] */
    /* JADX WARN: Type inference failed for: r0v23, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
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
    private static final boolean j() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.j():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[PHI: r0
  0x00a4: PHI (r0v17 ??) = (r0v10 ??), (r0v16 ??) binds: [B:14:0x007c, B:20:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[EXC_TOP_SPLITTER, PHI: r0
  0x00d0: PHI (r0v24 ??) = (r0v17 ??), (r0v23 ??) binds: [B:24:0x00a6, B:30:0x00c0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v22, types: [su.catlean.b0] */
    /* JADX WARN: Type inference failed for: r0v23, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
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
    private static final boolean Db() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.Db():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[PHI: r0
  0x00a4: PHI (r0v17 ??) = (r0v10 ??), (r0v16 ??) binds: [B:14:0x007c, B:20:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[EXC_TOP_SPLITTER, PHI: r0
  0x00d0: PHI (r0v24 ??) = (r0v17 ??), (r0v23 ??) binds: [B:24:0x00a6, B:30:0x00c0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v22, types: [su.catlean.b0] */
    /* JADX WARN: Type inference failed for: r0v23, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
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
    private static final boolean h() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.h():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[PHI: r0
  0x00a4: PHI (r0v17 ??) = (r0v10 ??), (r0v16 ??) binds: [B:14:0x007c, B:20:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[EXC_TOP_SPLITTER, PHI: r0
  0x00d0: PHI (r0v24 ??) = (r0v17 ??), (r0v23 ??) binds: [B:24:0x00a6, B:30:0x00c0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v22, types: [su.catlean.b0] */
    /* JADX WARN: Type inference failed for: r0v23, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
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
    private static final boolean P() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.P():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[PHI: r0
  0x00a4: PHI (r0v17 ??) = (r0v10 ??), (r0v16 ??) binds: [B:14:0x007c, B:20:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[EXC_TOP_SPLITTER, PHI: r0
  0x00d0: PHI (r0v24 ??) = (r0v17 ??), (r0v23 ??) binds: [B:24:0x00a6, B:30:0x00c0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v22, types: [su.catlean.b0] */
    /* JADX WARN: Type inference failed for: r0v23, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
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
    private static final boolean R() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.R():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[PHI: r0
  0x00a4: PHI (r0v17 ??) = (r0v10 ??), (r0v16 ??) binds: [B:14:0x007c, B:20:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[EXC_TOP_SPLITTER, PHI: r0
  0x00d0: PHI (r0v24 ??) = (r0v17 ??), (r0v23 ??) binds: [B:24:0x00a6, B:30:0x00c0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v22, types: [su.catlean.b0] */
    /* JADX WARN: Type inference failed for: r0v23, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean.qb] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
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
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.I():boolean");
    }

    private static final boolean F() {
        return a.v((ab ^ 101940770285574L) ^ 44497682085313L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.lk] */
    private static final boolean G() {
        long j2 = ab ^ 15937411318201L;
        Object objDX = j2;
        try {
            objDX = a.DX(objDX ^ 105038796125852L);
            return objDX != lk.OFF;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objDX, -7077694946556273983L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.w4] */
    private static final boolean x() {
        long j2 = ab ^ 132541964207643L;
        Object objL = j2;
        try {
            objL = a.L(objL ^ 67549688934700L);
            return objL == w4.GAPPLE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objL, -2709883813883552413L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean E(net.minecraft.class_1799 r8) {
        /*
            long r0 = su.catlean.qb.ab
            r1 = 61600774484482(0x38068c47f202, double:3.04348264299966E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = -1239641613541878575(0xeecbe885380b54d1, double:-5.165113676676785E225)
            r1 = r9
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r1 = r8
            r2 = 17731(0x4543, float:2.4846E-41)
            r3 = 2082722180743778151(0x1ce750c9e50f4f67, double:1.9306283791640767E-169)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/qb;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "v"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r11 = r0
            r0 = r8
            net.minecraft.class_1792 r0 = r0.method_7909()     // Catch: kotlin.NoWhenBranchMatchedException -> L37
            net.minecraft.class_1792 r1 = net.minecraft.class_1802.field_8288     // Catch: kotlin.NoWhenBranchMatchedException -> L37
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L37
            r1 = r11
            if (r1 != 0) goto L52
            if (r0 == 0) goto L6a
            goto L41
        L37:
            r1 = -1261624128006919814(0xee7dcf8a3a15e97a, double:-1.7241260273516225E224)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L48
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L48
        L41:
            r0 = r8
            boolean r0 = r0.method_7942()     // Catch: kotlin.NoWhenBranchMatchedException -> L48
            goto L52
        L48:
            r1 = -1261624128006919814(0xee7dcf8a3a15e97a, double:-1.7241260273516225E224)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r1 = r11
            if (r1 != 0) goto L67
            if (r0 != 0) goto L6a
            goto L66
        L5c:
            r1 = -1261624128006919814(0xee7dcf8a3a15e97a, double:-1.7241260273516225E224)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L66:
            r0 = 1
        L67:
            goto L6b
        L6a:
            r0 = 0
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.E(net.minecraft.class_1799):boolean");
    }

    private static final boolean s(class_1799 class_1799Var, class_1799 class_1799Var2) {
        Intrinsics.checkNotNullParameter(class_1799Var2, (String) b(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5723, 5111076241324673668L ^ (ab ^ 12020733306075L)) /* invoke-custom */);
        return Intrinsics.areEqual(class_1799Var2, class_1799Var);
    }

    private static final boolean Y(class_1799 class_1799Var, class_1799 class_1799Var2) {
        Intrinsics.checkNotNullParameter(class_1799Var2, (String) b(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17731, 2082771079277733828L ^ (ab ^ 23697776106145L)) /* invoke-custom */);
        class_1792 class_1792VarMethod_7909 = class_1799Var2.method_7909();
        Intrinsics.checkNotNull(class_1799Var);
        return Intrinsics.areEqual(class_1792VarMethod_7909, class_1799Var.method_7909());
    }

    public static void F(int[] iArr) {
        L = iArr;
    }

    public static int[] Dm() {
        return L;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 26021;
        if (gb[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) hb.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    hb.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                gb[i3] = b(((Cipher) objArr[0]).doFinal(fb[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/qb", e2);
            }
        }
        return gb[i3];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strB), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strB;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.qb.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qb.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x000C: CONST
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: jadx.plugins.input.java.utils.JavaClassParseException: Unsupported constant type: METHOD_REF
        	at jadx.plugins.input.java.data.code.decoders.LoadConstDecoder.decode(LoadConstDecoder.java:65)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.qb.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qb.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 14896;
        if (mb[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) lb[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) nb.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    nb.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/qb", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            mb[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return mb[i3].intValue();
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iC)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iC;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.qb.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qb.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x000C: CONST
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: jadx.plugins.input.java.utils.JavaClassParseException: Unsupported constant type: METHOD_REF
        	at jadx.plugins.input.java.data.code.decoders.LoadConstDecoder.decode(LoadConstDecoder.java:65)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.qb.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qb.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static long e(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 28020;
        if (pb[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) ob[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) qb.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    qb.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/qb", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            pb[i3] = Long.valueOf(((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255));
        }
        return pb[i3].longValue();
    }

    private static long e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        long jE = e(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Long.TYPE, Long.valueOf(jE)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return jE;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.qb.e(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qb.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x000C: CONST
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: jadx.plugins.input.java.utils.JavaClassParseException: Unsupported constant type: METHOD_REF
        	at jadx.plugins.input.java.data.code.decoders.LoadConstDecoder.decode(LoadConstDecoder.java:65)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.qb.e(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qb.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qb.e(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
