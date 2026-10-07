package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2604;
import net.minecraft.class_2868;
import net.minecraft.class_2885;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.PostSyncEvent;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ux.class */
public final class ux extends _g {

    @NotNull
    public static final ux X = null;
    static final KProperty[] HR = null;

    @NotNull
    private static final cp Hz = null;

    @NotNull
    private static final cw HL = null;

    @NotNull
    private static final cq H6 = null;

    @NotNull
    private static final cw kU = null;

    @NotNull
    private static final cw Hf = null;

    @NotNull
    private static final cq a = null;

    @NotNull
    private static final cq k = null;

    @NotNull
    private static final cq HE = null;

    @NotNull
    private static final cq H4 = null;

    @NotNull
    private static final cq Hg = null;

    @NotNull
    private static final cw Ht = null;

    @NotNull
    private static final c8 Hi = null;

    @NotNull
    private static final cp Hd = null;

    @NotNull
    private static final cq HD = null;

    @NotNull
    private static final c8 I = null;

    @NotNull
    private static final ct Hx = null;

    @NotNull
    private static final cq C = null;

    @NotNull
    private static final cq c = null;

    @NotNull
    private static final cq HO = null;

    @NotNull
    private static final cp HH = null;

    @NotNull
    private static final c8 Ha = null;

    @NotNull
    private static final cq H9 = null;

    @NotNull
    private static final ct HI = null;

    @NotNull
    private static final cq G = null;

    @NotNull
    private static final cq HY = null;

    @NotNull
    private static final cp Hc = null;

    @NotNull
    private static final cq z = null;

    @NotNull
    private static final cq Hs = null;

    @NotNull
    private static final cq Hm = null;

    @NotNull
    private static final c8 u = null;

    @NotNull
    private static final c8 A = null;

    @NotNull
    private static final cp E = null;

    @NotNull
    private static final cq Hy = null;

    @NotNull
    private static final ct N = null;

    @NotNull
    private static final ct Hq = null;

    @NotNull
    private static final ct HJ = null;

    @NotNull
    private static final c8 f = null;

    @NotNull
    private static final cq Hv = null;

    @NotNull
    private static final cq W = null;

    @NotNull
    private static final ct U = null;

    @NotNull
    private static final ct Hu = null;

    @NotNull
    private static final cq Hj = null;

    @NotNull
    private static final cq Hb = null;

    @NotNull
    private static final cq HC = null;

    @NotNull
    private static final cq b = null;

    @NotNull
    private static final cw Hk = null;

    @NotNull
    private static final cq L = null;

    @NotNull
    private static final cw K = null;

    @NotNull
    private static final cq HB = null;

    @NotNull
    private static final cq HP = null;

    @NotNull
    private static final ct HA = null;

    @NotNull
    private static final cq Hw = null;

    @NotNull
    private static final ct H_ = null;

    @NotNull
    private static final cp Ho = null;

    @NotNull
    private static final cq Hn = null;

    @NotNull
    private static final cw H2 = null;

    @NotNull
    private static final cw P = null;

    @NotNull
    private static final cp kf = null;

    @NotNull
    private static final cq n = null;

    @NotNull
    private static final c8 h = null;

    @NotNull
    private static final c8 Hl = null;

    @NotNull
    private static final c8 O = null;

    @NotNull
    private static final cq HW = null;

    @NotNull
    private static final cq g = null;

    @NotNull
    private static final cq H5 = null;

    @NotNull
    private static final cp HU = null;

    @NotNull
    private static final cw Hr = null;

    @NotNull
    private static final cq d = null;

    @NotNull
    private static final cq m = null;

    @NotNull
    private static final cp S = null;

    @NotNull
    private static final cq J = null;

    @NotNull
    private static final c8 t = null;

    @NotNull
    private static final cw HT = null;

    @NotNull
    private static final cw H7 = null;

    @NotNull
    private static final cl Hp = null;

    @NotNull
    private static final ct l = null;

    @Nullable
    private static class_1657 B;

    @NotNull
    private static AtomicReference w;

    @NotNull
    private static AtomicReference HG;

    @NotNull
    private static AtomicBoolean HZ;

    @NotNull
    private static final i9 e = null;

    @NotNull
    private static final i9 HN = null;

    @NotNull
    private static final bg HX = null;

    @NotNull
    private static final i9 j = null;

    @NotNull
    private static final i9 D = null;
    private static int HF;
    private static int H0;
    private static int H3;
    private static int HS;

    @Nullable
    private static fa HM;

    @Nullable
    private static Function0 HV;

    @Nullable
    private static Function0 Hh;
    private static volatile boolean y;
    private static volatile boolean He;
    private static volatile boolean T;
    private static long H8;
    private static long F;
    private static volatile int Y;

    @NotNull
    private static final Map HK = null;

    @NotNull
    private static final LinkedList HQ = null;

    @NotNull
    private static AtomicReference H1;
    private static volatile boolean i;

    @NotNull
    private static bg o;

    @NotNull
    private static final fd V = null;
    private static String x;
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
    private ux(long j2) {
        long j3 = ab ^ j2;
        super((String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29634, 1103074514705929963L ^ j3) /* invoke-custom */, jt.Q(), null, 4, null, j3 ^ 116590713636373L);
    }

    private final h NM(long j2) {
        return (h) Hz.E(this, (ab ^ j2) ^ 74890524873779L, HR[0]);
    }

    private final y zK(long j2) {
        return (y) HL.E(this, (ab ^ j2) ^ 85551135822374L, HR[1]);
    }

    private final boolean D(long j2) {
        return ((Boolean) H6.E(this, (ab ^ j2) ^ 89135498751030L, HR[2])).booleanValue();
    }

    private final t9 N2(long j2) {
        return (t9) kU.E(this, (ab ^ j2) ^ 93831940389374L, HR[3]);
    }

    private final n_ NS(short s, int i2, short s2) {
        return (n_) Hf.E(this, ((((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s2) << 48) >>> 48)) ^ ab) ^ 1660883417753L, HR[4]);
    }

    private final boolean N1(long j2) {
        return ((Boolean) a.E(this, (ab ^ j2) ^ 66100301961255L, HR[5])).booleanValue();
    }

    private final boolean E(long j2, short s) {
        long j3 = ((j2 << 16) | ((((long) s) << 48) >>> 48)) ^ ab;
        return ((Boolean) k.E(this, j3 ^ 110346804308958L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9942, 6041194902485379464L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean zd(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) HE.E(this, j3 ^ 64884930859947L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12330, 5411549897811183441L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean Nw(int i2, int i3) {
        long j2 = ((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ ab;
        return ((Boolean) H4.E(this, j2 ^ 28305385135929L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16114, 3339199650769929627L ^ j2) /* invoke-custom */])).booleanValue();
    }

    public final boolean NG(int i2, short s, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ ab;
        return ((Boolean) Hg.E(this, j2 ^ 115399006155987L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28064, 1702237274731789810L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final fy N8(long j2) {
        long j3 = ab ^ j2;
        return (fy) Ht.E(this, j3 ^ 86454363479667L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8282, 2247134595136641727L ^ j3) /* invoke-custom */]);
    }

    private final int l(int i2, int i3) {
        long j2 = ((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ ab;
        return ((Number) Hi.E(this, j2 ^ 112015807712620L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24754, 3660097189555161481L ^ j2) /* invoke-custom */])).intValue();
    }

    private final h i(long j2) {
        long j3 = ab ^ j2;
        return (h) Hd.E(this, j3 ^ 60504776623007L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31531, 4081029387675474952L ^ j3) /* invoke-custom */]);
    }

    private final boolean N3(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) HD.E(this, j3 ^ 102340954555327L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3238, 6418443199943322581L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final int W(long j2) {
        long j3 = ab ^ j2;
        return ((Number) I.E(this, j3 ^ 18583521810376L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5056, 3742447368889393399L ^ j3) /* invoke-custom */])).intValue();
    }

    private final float NT(long j2) {
        long j3 = ab ^ j2;
        return ((Number) Hx.E(this, j3 ^ 93152845246745L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3805, 7397387433748470681L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final boolean No(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) C.E(this, j3 ^ 93694935866669L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17638, 8858661305096961368L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean NK(int i2, byte b2, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i3) << 40) >>> 40)) ^ ab;
        return ((Boolean) c.E(this, j2 ^ 77760705694378L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31237, 8971353794492322879L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean Ni(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) HO.E(this, j3 ^ 24249204953132L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1131, 5106870001452445852L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final h NJ(long j2) {
        long j3 = ab ^ j2;
        return (h) HH.E(this, j3 ^ 18334079045788L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15822, 3966949951708645811L ^ j3) /* invoke-custom */]);
    }

    private final int NN(long j2) {
        long j3 = ab ^ j2;
        return ((Number) Ha.E(this, j3 ^ 76880798397429L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28215, 6563105599066175862L ^ j3) /* invoke-custom */])).intValue();
    }

    private final boolean Nb(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) H9.E(this, j3 ^ 90714780218673L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3204, 7597034779885706614L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final float Nr(long j2, byte b2) {
        long j3 = ((j2 << 8) | ((((long) b2) << 56) >>> 56)) ^ ab;
        return ((Number) HI.E(this, j3 ^ 93548656062167L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17233, 4036109440016877848L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final boolean Nj(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) G.E(this, j3 ^ 59181865424824L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24717, 4609786550333150149L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean N7(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) HY.E(this, j3 ^ 46458565396651L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29799, 6111169455861815407L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final h Ns(long j2) {
        long j3 = ab ^ j2;
        return (h) Hc.E(this, j3 ^ 140049313694677L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30760, 7220273503365914439L ^ j3) /* invoke-custom */]);
    }

    private final boolean NP(char c2, char c3, int i2) {
        long j2 = (((((long) c2) << 48) | ((((long) c3) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ ab;
        return ((Boolean) z.E(this, j2 ^ 132568477137421L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32430, 7546596388878033122L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean NW(char c2, char c3, int i2) {
        long j2 = (((((long) c2) << 48) | ((((long) c3) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ ab;
        return ((Boolean) Hs.E(this, j2 ^ 85620313971401L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28700, 1996786359298428435L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean Ne(int i2, short s, char c2) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ ab;
        return ((Boolean) Hm.E(this, j2 ^ 113346485285993L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20517, 6024513325130547394L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final int NB(long j2) {
        long j3 = ab ^ j2;
        return ((Number) u.E(this, j3 ^ 67575381905985L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27471, 7985335398338665958L ^ j3) /* invoke-custom */])).intValue();
    }

    private final int NR(long j2) {
        long j3 = ab ^ j2;
        return ((Number) A.E(this, j3 ^ 42732643672726L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24255, 4723246163566205061L ^ j3) /* invoke-custom */])).intValue();
    }

    private final h F(long j2) {
        long j3 = ab ^ j2;
        return (h) E.E(this, j3 ^ 61055883073493L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5781, 175405894988260847L ^ j3) /* invoke-custom */]);
    }

    public final boolean h(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) Hy.E(this, j3 ^ 131259127240039L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31089, 1387991664089385204L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final float zw(long j2) {
        long j3 = ab ^ j2;
        return ((Number) N.E(this, j3 ^ 15018276840666L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31693, 7520546949997214691L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float p(long j2) {
        long j3 = ab ^ j2;
        return ((Number) Hq.E(this, j3 ^ 23930732358460L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22776, 7763155883216492359L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float A(long j2) {
        long j3 = ab ^ j2;
        return ((Number) HJ.E(this, j3 ^ 50962574108390L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31978, 5919029467013791312L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final int Nf(long j2) {
        long j3 = ab ^ j2;
        return ((Number) f.E(this, j3 ^ 95603765662081L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11418, 737939288827812246L ^ j3) /* invoke-custom */])).intValue();
    }

    private final boolean Na(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) Hv.E(this, j3 ^ 61223435938020L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8141, 4979584645842637793L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean a(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) W.E(this, j3 ^ 60396761660340L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1467, 5450013891729332951L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final float r(int i2, int i3, int i4) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) i4) << 48) >>> 48)) ^ ab;
        return ((Number) U.E(this, j2 ^ 70937351983808L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28437, 7700560019904616845L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final float M(long j2) {
        long j3 = ab ^ j2;
        return ((Number) Hu.E(this, j3 ^ 45767724743147L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30241, 4689177046502599480L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final boolean Nc(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) Hj.E(this, j3 ^ 94961841173058L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30893, 1866810578304806519L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean NL(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) Hb.E(this, j3 ^ 23177288144207L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4263, 1320258314693534019L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean Nh(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) HC.E(this, j3 ^ 27705610205002L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23631, 4610827430237179892L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean t(long j2, short s) {
        long j3 = ((j2 << 16) | ((((long) s) << 48) >>> 48)) ^ ab;
        return ((Boolean) b.E(this, j3 ^ 27628068664352L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28123, 8140200584523660633L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final sv P(long j2) {
        long j3 = ab ^ j2;
        return (sv) Hk.E(this, j3 ^ 30529539424711L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20495, 9182328713353803103L ^ j3) /* invoke-custom */]);
    }

    private final boolean N0(int i2, short s, short s2) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ ab;
        return ((Boolean) L.E(this, j2 ^ 94328579540353L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13195, 1903499231365812898L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final zz Nz(long j2) {
        long j3 = ab ^ j2;
        return (zz) K.E(this, j3 ^ 91063901184983L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4126, 496452335450183510L ^ j3) /* invoke-custom */]);
    }

    private final boolean V(long j2, byte b2) {
        long j3 = ((j2 << 8) | ((((long) b2) << 56) >>> 56)) ^ ab;
        return ((Boolean) HB.E(this, j3 ^ 34595789186018L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20866, 8944761925229729440L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean zM(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) HP.E(this, j3 ^ 22464300843829L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13071, 6420295730377659588L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final float NV(long j2) {
        long j3 = ab ^ j2;
        return ((Number) HA.E(this, j3 ^ 103035604845625L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19968, 6853762800702566056L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final boolean N9(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) Hw.E(this, j3 ^ 40853321553724L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11217, 8930736411092883576L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final float NE(long j2) {
        long j3 = ab ^ j2;
        return ((Number) H_.E(this, j3 ^ 77665705096503L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26923, 5710591092202027086L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final h Nk(long j2) {
        long j3 = ab ^ j2;
        return (h) Ho.E(this, j3 ^ 123387711111271L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17574, 8375763002121494552L ^ j3) /* invoke-custom */]);
    }

    private final boolean B(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) Hn.E(this, j3 ^ 40926612289944L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12783, 6036226037493951699L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final x0 Nn(int i2, short s, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ ab;
        return (x0) H2.E(this, j2 ^ 138257758955618L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5142, 8299328199876352039L ^ j2) /* invoke-custom */]);
    }

    private final x0 NQ(int i2, char c2, char c3) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) c3) << 48) >>> 48)) ^ ab;
        return (x0) P.E(this, j2 ^ 70729920000606L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21118, 1114137438696424651L ^ j2) /* invoke-custom */]);
    }

    private final h NF(long j2) {
        long j3 = ab ^ j2;
        return (h) kf.E(this, j3 ^ 129810576960016L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19942, 3467168452940497708L ^ j3) /* invoke-custom */]);
    }

    private final boolean NI(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) n.E(this, j3 ^ 56580028194516L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6754, 684058355127246913L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final int Nt(long j2) {
        long j3 = ab ^ j2;
        return ((Number) h.E(this, j3 ^ 122865375689584L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20008, 5657531911391924633L ^ j3) /* invoke-custom */])).intValue();
    }

    private final int NZ(long j2) {
        long j3 = ab ^ j2;
        return ((Number) Hl.E(this, j3 ^ 37675458306042L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22904, 3926738141798326897L ^ j3) /* invoke-custom */])).intValue();
    }

    private final int N6(long j2) {
        long j3 = ab ^ j2;
        return ((Number) O.E(this, j3 ^ 46911249318773L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19671, 3189033225847106413L ^ j3) /* invoke-custom */])).intValue();
    }

    private final boolean NU(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) HW.E(this, j3 ^ 140126989300607L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14061, 2391706884610433306L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean Nd(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) g.E(this, j3 ^ 28157847218401L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21093, 2539787153445641788L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean s(int i2, short s, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ ab;
        return ((Boolean) H5.E(this, j2 ^ 97357232222070L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11426, 46080589871294238L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final h Z(long j2) {
        long j3 = ab ^ j2;
        return (h) HU.E(this, j3 ^ 64441947855883L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18666, 6448041634790436989L ^ j3) /* invoke-custom */]);
    }

    private final w2 Nq(long j2) {
        long j3 = ab ^ j2;
        return (w2) Hr.E(this, j3 ^ 28018637308894L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12963, 2182552983696774641L ^ j3) /* invoke-custom */]);
    }

    private final boolean T(short s, short s2, int i2) {
        long j2 = (((((long) s) << 48) | ((((long) s2) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ ab;
        return ((Boolean) d.E(this, j2 ^ 89362553854509L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13621, 5918181439448501146L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean C(short s, int i2, char c2) {
        long j2 = (((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c2) << 48) >>> 48)) ^ ab;
        return ((Boolean) m.E(this, j2 ^ 60061489280563L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20340, 8141905137181285769L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final h w(long j2) {
        long j3 = ab ^ j2;
        return (h) S.E(this, j3 ^ 2134815304280L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2871, 4743719911638680986L ^ j3) /* invoke-custom */]);
    }

    private final boolean NX(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) J.E(this, j3 ^ 107972024944210L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3857, 3359462574250847734L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final int Np(int i2, char c2, short s) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ ab;
        return ((Number) t.E(this, j2 ^ 38306273316982L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21588, 3404535781802352796L ^ j2) /* invoke-custom */])).intValue();
    }

    private final s9 Nm(long j2) {
        long j3 = ab ^ j2;
        return (s9) HT.E(this, j3 ^ 57060940722571L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6692, 4601017168382594901L ^ j3) /* invoke-custom */]);
    }

    private final s0 zH(long j2) {
        long j3 = ab ^ j2;
        return (s0) H7.E(this, j3 ^ 44440407971004L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11099, 1362646273731140517L ^ j3) /* invoke-custom */]);
    }

    private final String N_(long j2, short s) {
        long j3 = ((j2 << 16) | ((((long) s) << 48) >>> 48)) ^ ab;
        return (String) Hp.E(this, j3 ^ 133509168965101L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25708, 3078971889432880491L ^ j3) /* invoke-custom */]);
    }

    private final float zG(long j2) {
        long j3 = ab ^ j2;
        return ((Number) l.E(this, j3 ^ 104023812351902L, HR[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18624, 1024910239976114973L ^ j3) /* invoke-custom */])).floatValue();
    }

    @Nullable
    public final class_1657 j() {
        return B;
    }

    public final void b(@Nullable class_1657 class_1657Var) {
        B = class_1657Var;
    }

    @NotNull
    public final AtomicReference K() {
        return w;
    }

    public final void w(long a2, @NotNull AtomicReference atomicReference) {
        Intrinsics.checkNotNullParameter(atomicReference, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25887, 7487429968740928955L ^ (ab ^ a2)) /* invoke-custom */);
        w = atomicReference;
    }

    @NotNull
    public final AtomicBoolean I() {
        return HZ;
    }

    public final void Q(long a2, @NotNull AtomicBoolean atomicBoolean) {
        Intrinsics.checkNotNullParameter(atomicBoolean, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25887, 7487508810592804811L ^ (ab ^ a2)) /* invoke-custom */);
        HZ = atomicBoolean;
    }

    public final int Y() {
        return HS;
    }

    public final void z(int i2) {
        HS = i2;
    }

    public final long Nx() {
        return H8;
    }

    public final void t(long j2) {
        H8 = j2;
    }

    public final long Ng() {
        return F;
    }

    public final void I(long j2) {
        F = j2;
    }

    @NotNull
    public final Map N5() {
        return HK;
    }

    @NotNull
    public final LinkedList e() {
        return HQ;
    }

    @NotNull
    public final AtomicReference NC() {
        return H1;
    }

    public final void Z(@NotNull AtomicReference atomicReference, long a2) {
        Intrinsics.checkNotNullParameter(atomicReference, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14266, 6395384038628332164L ^ (ab ^ a2)) /* invoke-custom */);
        H1 = atomicReference;
    }

    public final boolean x() {
        return i;
    }

    public final void p(boolean z2) {
        i = z2;
    }

    @NotNull
    public final bg n() {
        return o;
    }

    public final void o(long a2, @NotNull bg bgVar) {
        Intrinsics.checkNotNullParameter(bgVar, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25887, 7487451111256043670L ^ (ab ^ a2)) /* invoke-custom */);
        o = bgVar;
    }

    @Override // su.catlean._g
    public void O(long j2) {
        R(j2 ^ 13073325695020L);
    }

    @Override // su.catlean._g
    public void b(long j2) {
        R(j2 ^ 48717721638758L);
    }

    private final void R(long j2) {
        long j3 = ab ^ j2;
        long j4 = j3 ^ 62812207801101L;
        yk.l.o();
        HQ.clear();
        HN.X(j4);
        e.X(j4);
        j.v(j3 ^ 89036599322938L, (int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28870, 8699738199635642457L ^ j3) /* invoke-custom */);
        y = false;
        HG.set(null);
        w.set(null);
        HM = null;
        B = null;
        H8 = 0L;
        Y = 0;
        HS = 0;
        HV = null;
        Hh = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x024b, code lost:
    
        r0 = su.catlean.ux.B;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0250, code lost:
    
        if (r0 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0253, code lost:
    
        if (r0 == 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0262, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Exception;}
        ).invoke(r0, 7968816299616041890L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0263, code lost:
    
        r0 = su.catlean.ux.B;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x026c, code lost:
    
        if (r0 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x027c, code lost:
    
        r0 = r0.method_29504();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x028b, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Exception;}
        ).invoke(r0, 7968816299616041890L, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x050a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.s0] */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v118, types: [su.catlean.ux] */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v125, types: [net.minecraft.class_1657] */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v127, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.ux] */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v131 */
    /* JADX WARN: Type inference failed for: r0v132, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v134, types: [net.minecraft.class_1657] */
    /* JADX WARN: Type inference failed for: r0v136, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v148 */
    /* JADX WARN: Type inference failed for: r0v149, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v150, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v151, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v153, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v154, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v158, types: [int] */
    /* JADX WARN: Type inference failed for: r0v162 */
    /* JADX WARN: Type inference failed for: r0v163 */
    /* JADX WARN: Type inference failed for: r0v164 */
    /* JADX WARN: Type inference failed for: r0v165 */
    /* JADX WARN: Type inference failed for: r0v166 */
    /* JADX WARN: Type inference failed for: r0v167 */
    /* JADX WARN: Type inference failed for: r0v168 */
    /* JADX WARN: Type inference failed for: r0v169 */
    /* JADX WARN: Type inference failed for: r0v170 */
    /* JADX WARN: Type inference failed for: r0v171 */
    /* JADX WARN: Type inference failed for: r0v172 */
    /* JADX WARN: Type inference failed for: r0v173 */
    /* JADX WARN: Type inference failed for: r0v174 */
    /* JADX WARN: Type inference failed for: r0v175 */
    /* JADX WARN: Type inference failed for: r0v176 */
    /* JADX WARN: Type inference failed for: r0v177 */
    /* JADX WARN: Type inference failed for: r0v178 */
    /* JADX WARN: Type inference failed for: r0v179 */
    /* JADX WARN: Type inference failed for: r0v180 */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [su.catlean.n8] */
    /* JADX WARN: Type inference failed for: r0v36, types: [su.catlean.ux] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.ux] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v84, types: [su.catlean._w] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [su.catlean._8] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object] */
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
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void U(su.catlean.api.event.events.player.PlayerUpdateEvent r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.U(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.functions.Function0] */
    @Flow
    private final void a(PostSyncEvent postSyncEvent) throws Exception {
        long j2 = ab ^ 44770724003914L;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7723109538818394774L, j2) /* invoke-custom */;
        try {
            try {
                obj = Hh;
                Function0 function0Invoke = obj;
                if (obj == 0) {
                    function0Invoke = obj;
                    if (obj != 0) {
                        function0Invoke = obj.invoke();
                    }
                }
                try {
                    try {
                        Hh = null;
                        function0Invoke = HV;
                        if (obj == 0 && function0Invoke != 0) {
                            function0Invoke.invoke();
                        }
                        HV = null;
                    } catch (NoWhenBranchMatchedException unused) {
                        throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(function0Invoke, -7781975449942228684L, j2) /* invoke-custom */;
                    }
                } catch (NoWhenBranchMatchedException unused2) {
                    throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(function0Invoke, -7781975449942228684L, j2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused3) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -7781975449942228684L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused4) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -7781975449942228684L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x012d: INVOKE (r-1 I:su.catlean.zw), (r0 I:net.minecraft.class_4587), (r1 I:long), (r2 I:net.minecraft.class_1297) VIRTUAL call: su.catlean.zw.I(net.minecraft.class_4587, long, net.minecraft.class_1297):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void x(su.catlean.api.event.events.render.Render3DEvent r10) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.x(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean.zw] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [net.minecraft.class_1657] */
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
    @Flow
    private final void h(Render2DEvent render2DEvent) throws Exception {
        long j2 = ab ^ 49889268257505L;
        Object obj = j2;
        long j3 = obj ^ 103882237882222L;
        long j4 = obj >>> 32;
        int i2 = (int) (((obj ^ 114084646266288L) << 32) >>> 32);
        try {
            obj = B;
            if (obj == 0) {
                return;
            }
            try {
                if (ox.m[Nm(j3).ordinal()] == 2) {
                    obj = zw.l;
                    obj.C(j4, i2);
                }
            } catch (NoWhenBranchMatchedException unused) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -8742653015503727713L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused2) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -8742653015503727713L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00d8: INVOKE (r-1 I:su.catlean.ux), (r0 I:long), (r1 I:int), (r2 I:net.minecraft.class_243) DIRECT call: su.catlean.ux.U(long, int, net.minecraft.class_243):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void p(su.catlean.api.event.events.world.AfterEntitySpawn r13) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.p(su.catlean.api.event.events.world.AfterEntitySpawn):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x009c: INVOKE (r-1 I:su.catlean.zx), (r0 I:long), (r1 I:int) VIRTUAL call: su.catlean.zx.Q(long, int):kotlin.Unit
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void G(su.catlean.api.event.events.network.ReceivePacket r14) {
        /*
            Method dump skipped, instruction units count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.G(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow
    private final void l(SendPacket sendPacket) throws Exception {
        long j2 = ab ^ 27230015175743L;
        long j3 = j2 ^ 46382818187792L;
        ?? r0 = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1682322338546972385L, j2) /* invoke-custom */;
        try {
            r0 = sendPacket.getPacket() instanceof class_2868;
            ?? r02 = r0;
            if (r0 == 0) {
                if (r0 == 0) {
                    return;
                } else {
                    r02 = Y;
                }
            }
            ?? r03 = r02;
            if (r0 == 0) {
                if (r02 <= 0) {
                    D.X(j3);
                    return;
                }
                r03 = Y;
            }
            Y = (r03 == true ? 1 : 0) - 1;
        } catch (NoWhenBranchMatchedException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -1696186922510418623L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e8  */
    /* JADX WARN: Type inference failed for: r0v11, types: [su.catlean.je] */
    /* JADX WARN: Type inference failed for: r0v29, types: [su.catlean.ux] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v41, types: [su.catlean.gp] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [su.catlean.oa] */
    /* JADX WARN: Type inference failed for: r0v54, types: [su.catlean.ux] */
    /* JADX WARN: Type inference failed for: r0v56, types: [int] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [su.catlean.t9] */
    /* JADX WARN: Type inference failed for: r0v67, types: [su.catlean.i9] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v82 */
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
    private final void U(long r10, int r12, net.minecraft.class_243 r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.U(long, int, net.minecraft.class_243):void");
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
    private final void i(su.catlean.api.event.events.render.RenderEntityEvent r9) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.i(su.catlean.api.event.events.render.RenderEntityEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [int] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.nw] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void N4(long r11) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.N4(long):void");
    }

    private final void T(gp gpVar, long j2) {
        long j3 = ab ^ j2;
        w.set(rb.q(this, j3 ^ 44999547554719L, gpVar));
        HG.set(oa.k.V(this, gpVar, j3 ^ 22967282962901L));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:44:0x01ae
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final boolean Q(long r18) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.Q(long):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00d0: INVOKE 
          (r-1 I:su.catlean.zi)
          (r0 I:net.minecraft.class_238)
          (r1 I:long)
          (r2 I:java.awt.Color)
          (r3 I:java.awt.Color)
          (r4 I:int)
          (r5 I:java.lang.Object)
         STATIC call: su.catlean.zi.g(su.catlean.zi, net.minecraft.class_238, long, java.awt.Color, java.awt.Color, int, java.lang.Object):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void m(net.minecraft.class_4587 r17, java.lang.String r18, long r19, net.minecraft.class_238 r21) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.m(net.minecraft.class_4587, java.lang.String, long, net.minecraft.class_238):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final boolean t(long r12, boolean r14) {
        /*
            Method dump skipped, instruction units count: 2013
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.t(long, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [net.minecraft.class_1657] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [int] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [su.catlean.y] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m(int r17, net.minecraft.class_243 r18, boolean r19, long r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.m(int, net.minecraft.class_243, boolean, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0173 A[PHI: r34
  0x0173: PHI (r34v1 int) = (r34v0 int), (r34v7 int), (r34v0 int), (r34v0 int) binds: [B:4:0x00c6, B:42:0x016d, B:11:0x00e1, B:13:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e4 A[EXC_TOP_SPLITTER, PHI: r0 r34
  0x01e4: PHI (r0v22 ??) = (r0v32 ??), (r0v34 ??), (r0v35 ??) binds: [B:56:0x01bb, B:61:0x01e2, B:54:0x01b6] A[DONT_GENERATE, DONT_INLINE]
  0x01e4: PHI (r34v2 int) = (r34v4 int), (r34v4 int), (r34v5 int) binds: [B:56:0x01bb, B:61:0x01e2, B:54:0x01b6] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0132 A[EXC_TOP_SPLITTER, PHI: r0
  0x0132: PHI (r0v47 ??) = (r0v54 ??), (r0v55 ??), (r0v53 ??) binds: [B:22:0x010b, B:24:0x0110, B:32:0x0130] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [su.catlean.x0] */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [su.catlean.x0] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.minecraft.class_1293] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [int] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v52, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void E(long r11, kotlin.jvm.functions.Function0 r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.E(long, kotlin.jvm.functions.Function0):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:46:0x01b7
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void k(byte r13, @org.jetbrains.annotations.NotNull net.minecraft.class_3965 r14, boolean r15, long r16) {
        /*
            Method dump skipped, instruction units count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.k(byte, net.minecraft.class_3965, boolean, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    private final int h(fg fgVar, long j2, fg fgVar2, x0 x0Var) throws Exception {
        long j3 = ab ^ j2;
        long j4 = j3 ^ 103498921740889L;
        long j5 = j3 ^ 45887975648028L;
        long j6 = j3 ^ 21706597757408L;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6676515073852095776L, j3) /* invoke-custom */;
        int iMethod_67532 = zf.v(j6).method_31548().method_67532();
        try {
            try {
                obj = ox.J[x0Var.ordinal()];
                try {
                    if (obj != 0) {
                        return obj;
                    }
                    try {
                        switch (obj) {
                            case 1:
                                boolean zR = fgVar2.R();
                                if (obj != 0) {
                                    return zR ? 1 : 0;
                                }
                                if (zR) {
                                    ag.r(fgVar2.a(), zf.v(j6).method_31548().method_67532(), class_1713.field_7791, true, j4);
                                    return fgVar2.a();
                                }
                                break;
                            case 2:
                            case 3:
                                if (x0Var == x0.SILENT) {
                                    Y++;
                                }
                                fgVar.x(j5);
                                break;
                        }
                        return iMethod_67532;
                    } catch (NoWhenBranchMatchedException unused) {
                        throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6662338228652132674L, j3) /* invoke-custom */;
                    }
                } catch (NoWhenBranchMatchedException unused2) {
                    throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6662338228652132674L, j3) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused3) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6662338228652132674L, j3) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused4) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6662338228652132674L, j3) /* invoke-custom */;
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
    private final void K(int r9, int r10, boolean r11, long r12, short r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.K(int, int, boolean, long, short, boolean):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x01CC: MOVE_MULTI in method: su.catlean.ux.i(net.minecraft.class_3965, long):void, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ux.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x01CC: MOVE_MULTI
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -3 out of bounds for object array[13]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:304)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    private final void i(net.minecraft.class_3965 r1, long r2) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.i(net.minecraft.class_3965, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public final boolean E(@NotNull class_2338 base, long a2, @NotNull ArrayList entities) throws Exception {
        long j2 = ab ^ a2;
        Intrinsics.checkNotNullParameter(base, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7462, 3895383208213794586L ^ j2) /* invoke-custom */);
        Object objAnyMatch = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2334686111711085022L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(entities, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8535, 9065044072377414653L ^ j2) /* invoke-custom */);
        class_238 class_238Var = new class_238(base.method_10084());
        try {
            Stream stream = entities.stream();
            Function1 function1 = (v1) -> {
                return j(r1, v1);
            };
            objAnyMatch = stream.anyMatch((v1) -> {
                return G(r1, v1);
            });
            if (objAnyMatch != 0) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[4], 2348240754972633771L, j2) /* invoke-custom */;
            }
            return objAnyMatch;
        } catch (NoWhenBranchMatchedException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAnyMatch, 2356691995029517696L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x008f: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void l(long r8, boolean r10, boolean r11) {
        /*
            r7 = this;
            long r0 = su.catlean.ux.ab
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 79540438201961(0x485773907669, double:3.92981979707476E-310)
            long r1 = r1 ^ r2
            r12 = r1
            r1 = r0; r2 = r0; 
            r2 = 79189493137964(0x4805bd9bc22c, double:3.9124808071049E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r0 = 1194609838921281836(0x10941b51b616f12c, double:8.288662158341009E-229)
            r1 = r8
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            r0 = r11
            if (r0 != 0) goto L5d
            r0 = r14
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)     // Catch: kotlin.NoWhenBranchMatchedException -> L32 kotlin.NoWhenBranchMatchedException -> L42
            r1 = r10
            if (r1 == 0) goto L4c
            goto L3c
        L32:
            r1 = 1172841449918072178(0x1046c515b0388572, double:2.933281396341674E-230)
            r2 = r8
            java.lang.Exception r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Exception;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L42
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L42
        L3c:
            net.minecraft.class_1268 r1 = net.minecraft.class_1268.field_5810     // Catch: kotlin.NoWhenBranchMatchedException -> L42
            goto L4f
        L42:
            r1 = 1172841449918072178(0x1046c515b0388572, double:2.933281396341674E-230)
            r2 = r8
            java.lang.Exception r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Exception;}
            ).invoke(r0, r1, r2)
            throw r0
        L4c:
            net.minecraft.class_1268 r1 = net.minecraft.class_1268.field_5808
        L4f:
            r0.method_6104(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L68
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5d
            r0 = r16
            if (r0 == 0) goto L92
        L5d:
            net.minecraft.class_2879 r0 = new net.minecraft.class_2879     // Catch: kotlin.NoWhenBranchMatchedException -> L68 kotlin.NoWhenBranchMatchedException -> L78
            r1 = r0
            r2 = r10
            if (r2 == 0) goto L82
            goto L72
        L68:
            r1 = 1172841449918072178(0x1046c515b0388572, double:2.933281396341674E-230)
            r2 = r8
            java.lang.Exception r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Exception;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L78
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L78
        L72:
            net.minecraft.class_1268 r2 = net.minecraft.class_1268.field_5810     // Catch: kotlin.NoWhenBranchMatchedException -> L78
            goto L85
        L78:
            r1 = 1172841449918072178(0x1046c515b0388572, double:2.933281396341674E-230)
            r2 = r8
            java.lang.Exception r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Exception;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            net.minecraft.class_1268 r2 = net.minecraft.class_1268.field_5808
        L85:
            r1.<init>(r2)
            net.minecraft.class_2596 r0 = (net.minecraft.class_2596) r0
            r1 = r12
            r2 = r1; r1 = r0; r0 = r2; 
            su.catlean._r.a(r-1, r0)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.l(long, boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    public final int NA(long j2) throws Exception {
        long j3 = ab ^ j2;
        long j4 = j3 ^ 3752552373405L;
        int i2 = (int) (j3 >>> 32);
        int i3 = (int) (((j3 ^ 44153245224834L) << 32) >>> 32);
        long j5 = j3 >>> 16;
        int i4 = (int) (((j3 ^ 136642416083510L) << 48) >>> 48);
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6517312794606615498L, j3) /* invoke-custom */;
        try {
            try {
                obj = ox.I[N8(j4).ordinal()];
                if (obj != 0) {
                    return obj;
                }
                switch (obj) {
                    case 1:
                        return Math.min((int) Math.floor((((double) nf.f(nf.Z, null, j5, 1, (char) i4, null)) * 1.5d) / 50.0d), (int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8282, 2247058957838783341L ^ j3) /* invoke-custom */);
                    case 2:
                        return l(i2, i3);
                    case 3:
                        return 0;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } catch (NoWhenBranchMatchedException unused) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6530495646930882452L, j3) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused2) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6530495646930882452L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [int, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v34, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [int[]] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int I(int r9, short r10, boolean r11, short r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.I(int, short, boolean, short):int");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:58:0x0165
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final boolean H(int r10, short r11, int r12) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.H(int, short, int):boolean");
    }

    public final void H(@NotNull class_243 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        o.l();
        H1.set(v);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x01ff: RETURN (r-1 I:su.catlean.gp)
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final su.catlean.gp a(long r33, net.minecraft.class_1657 r35) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.a(long, net.minecraft.class_1657):su.catlean.gp");
    }

    @NotNull
    public final gp L(long j2) {
        long j3 = (ab ^ j2) ^ 71829044527427L;
        class_1657 class_1657Var = B;
        Intrinsics.checkNotNull(class_1657Var);
        return a(j3, class_1657Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.fy] */
    private static final boolean NH() throws Exception {
        long j2 = ab ^ 92869767097976L;
        Object objN8 = j2;
        try {
            objN8 = X.N8(objN8 ^ 99056609164303L);
            return objN8 == fy.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN8, 4193592659010498310L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean v() throws Exception {
        long j2 = ab ^ 69466561870752L;
        long j3 = j2 ^ 49943508910741L;
        Object objNb = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3402495155673747072L, j2) /* invoke-custom */;
        try {
            objNb = X.Nb(j3);
            return objNb == 0 ? objNb == 0 : objNb;
        } catch (NoWhenBranchMatchedException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objNb, 3452793156796791518L, j2) /* invoke-custom */;
        }
    }

    private static final boolean NO() {
        return X.a((ab ^ 126935608094382L) ^ 5896834357534L);
    }

    private static final boolean Nl() {
        return X.a((ab ^ 74677759340302L) ^ 59123650697406L);
    }

    private static final boolean Nu() {
        return X.a((ab ^ 115731286246628L) ^ 34562731619156L);
    }

    private static final boolean Nv() {
        return X.a((ab ^ 8903727771510L) ^ 138776951396550L);
    }

    private static final boolean Ny() {
        return X.a((ab ^ 5688708887291L) ^ 126452563117387L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.zz] */
    private static final boolean NY() throws Exception {
        long j2 = ab ^ 48645097769655L;
        Object objNz = j2;
        try {
            objNz = X.Nz(objNz ^ 68362329351524L);
            return objNz == zz.CONDITIONS;
        } catch (NoWhenBranchMatchedException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objNz, -6990191323114501175L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.zz] */
    private static final boolean ND() throws Exception {
        long j2 = ab ^ 47440363576627L;
        Object objNz = j2;
        try {
            objNz = X.Nz(objNz ^ 62909922833120L);
            return objNz == zz.CONDITIONS;
        } catch (NoWhenBranchMatchedException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objNz, -8540552099652494259L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.ux] */
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
    private static final boolean g() throws java.lang.Exception {
        /*
            long r0 = su.catlean.ux.ab
            r1 = 16475231935576(0xefbf058dc58, double:8.1398461066347E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 31788022264715(0x1ce939c6738b, double:1.57053697502323E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 99321891591017(0x5a552e111369, double:4.907153451509E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -8592825727256270472(0x88c026871e0d6978, double:-1.5652358896940192E-266)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.ux r0 = su.catlean.ux.X     // Catch: kotlin.NoWhenBranchMatchedException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.zz r0 = r0.Nz(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L37 kotlin.NoWhenBranchMatchedException -> L47
            su.catlean.zz r1 = su.catlean.zz.CONDITIONS     // Catch: kotlin.NoWhenBranchMatchedException -> L37 kotlin.NoWhenBranchMatchedException -> L47
            if (r0 != r1) goto L6f
            goto L41
        L37:
            r1 = -8641571218163294938(0x8812f8c318231d26, double:-8.977817194970325E-270)
            r2 = r7
            java.lang.Exception r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Exception;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L47
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L47
        L41:
            su.catlean.ux r0 = su.catlean.ux.X     // Catch: kotlin.NoWhenBranchMatchedException -> L47
            goto L51
        L47:
            r1 = -8641571218163294938(0x8812f8c318231d26, double:-8.977817194970325E-270)
            r2 = r7
            java.lang.Exception r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Exception;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            boolean r0 = r0.zM(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = -8641571218163294938(0x8812f8c318231d26, double:-8.977817194970325E-270)
            r2 = r7
            java.lang.Exception r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Exception;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.g():boolean");
    }

    private static final boolean G() {
        return X.N9((ab ^ 123769563499024L) ^ 23596575494440L);
    }

    private static final boolean q() {
        return X.NX((ab ^ 131419789207292L) ^ 93961017273514L);
    }

    private static final void L(gp gpVar) {
        X.T(gpVar, (ab ^ 113830824186745L) ^ 103708697616223L);
    }

    private static final void a(class_2596 class_2596Var) throws Exception {
        X.U((ab ^ 75653950030144L) ^ 65620020633989L, ((class_2604) class_2596Var).method_11167(), new class_243(((class_2604) class_2596Var).method_11175(), ((class_2604) class_2596Var).method_11174(), ((class_2604) class_2596Var).method_11176()));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x01e2: INVOKE (r-1 I:su.catlean.yk), (r0 I:long), (r1 I:kotlin.Pair) VIRTUAL call: su.catlean.yk.I(long, kotlin.Pair):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final kotlin.Unit m(int r10, net.minecraft.class_243 r11) {
        /*
            Method dump skipped, instruction units count: 1013
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.m(int, net.minecraft.class_243):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v4, types: [net.minecraft.class_2885] */
    private static final class_2596 I(boolean z2, class_3965 class_3965Var, int i2) throws Exception {
        Object class_2885Var = ab ^ 119988122911890L;
        try {
            class_2885Var = new class_2885(z2 ? class_1268.field_5810 : class_1268.field_5808, class_3965Var, i2);
            return (class_2596) class_2885Var;
        } catch (NoWhenBranchMatchedException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_2885Var, -3397795391452068372L, class_2885Var) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x0461: MOVE_MULTI in method: su.catlean.ux.t(net.minecraft.class_3965, su.catlean.mm):kotlin.Unit, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ux.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x0461: MOVE_MULTI
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for object array[11]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:313)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    private static final kotlin.Unit t(net.minecraft.class_3965 r0, su.catlean.mm r1) {
        /*
            Method dump skipped, instruction units count: 3021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.t(net.minecraft.class_3965, su.catlean.mm):kotlin.Unit");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:7:0x001f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private static final boolean j(net.minecraft.class_238 r6, net.minecraft.class_1297 r7) {
        /*
            long r0 = su.catlean.ux.ab
            r1 = 14505580561724(0xd3157fa053c, double:7.1667090285304E-311)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = 5882868029010718748(0x51a4254db9afb01c, double:1.956822910125477E85)
            r1 = r8
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r10 = r0
            r0 = r7
            r1 = r10
            if (r1 != 0) goto L2a
            if (r0 == 0) goto L70
            goto L29
        L1f:
            r1 = 5870155183610250306(0x5176fb09bf81c442, double:2.7902331705842654E84)
            r2 = r8
            java.lang.Exception r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Exception;}
            ).invoke(r0, r1, r2)
            throw r0
        L29:
            r0 = r7
        L2a:
            net.minecraft.class_238 r0 = r0.method_5829()     // Catch: kotlin.NoWhenBranchMatchedException -> L3c
            r1 = r6
            boolean r0 = r0.method_994(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L3c
            r1 = r10
            if (r1 != 0) goto L57
            if (r0 == 0) goto L70
            goto L46
        L3c:
            r1 = 5870155183610250306(0x5176fb09bf81c442, double:2.7902331705842654E84)
            r2 = r8
            java.lang.Exception r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Exception;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L4d
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L4d
        L46:
            r0 = r7
            boolean r0 = r0 instanceof net.minecraft.class_1511     // Catch: kotlin.NoWhenBranchMatchedException -> L4d
            goto L57
        L4d:
            r1 = 5870155183610250306(0x5176fb09bf81c442, double:2.7902331705842654E84)
            r2 = r8
            java.lang.Exception r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Exception;}
            ).invoke(r0, r1, r2)
            throw r0
        L57:
            r1 = r10
            if (r1 != 0) goto L6d
            if (r0 == 0) goto L70
            goto L6c
        L62:
            r1 = 5870155183610250306(0x5176fb09bf81c442, double:2.7902331705842654E84)
            r2 = r8
            java.lang.Exception r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Exception;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            r0 = 1
        L6d:
            goto L71
        L70:
            r0 = 0
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.j(net.minecraft.class_238, net.minecraft.class_1297):boolean");
    }

    private static final boolean G(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static void g(String str) {
        x = str;
    }

    public static String z() {
        return x;
    }

    private static Exception a(Exception exc) {
        return exc;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 29672;
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
                throw new RuntimeException("su/catlean/ux", e2);
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
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.ux.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ux.class
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
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.ux.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ux.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 26839;
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
                    throw new RuntimeException("su/catlean/ux", e2);
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
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.ux.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ux.class
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
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.ux.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ux.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static long e(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 3739;
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
                    throw new RuntimeException("su/catlean/ux", e2);
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
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.ux.e(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ux.class
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
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.ux.e(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ux.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ux.e(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
