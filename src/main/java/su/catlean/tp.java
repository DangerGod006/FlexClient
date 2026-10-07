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
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/tp.class */
public final class tp extends tt {

    @NotNull
    public static final tp nc = null;
    static final KProperty[] nP = null;

    @NotNull
    private static final cp nk = null;

    @NotNull
    private static final cw ne = null;

    @NotNull
    private static final cw N = null;

    @NotNull
    private static final ct f = null;

    @NotNull
    private static final ct O = null;

    @NotNull
    private static final ct I = null;

    @NotNull
    private static final ct L = null;

    @NotNull
    private static final cw j = null;

    @NotNull
    private static final ct n = null;

    @NotNull
    private static final ct c = null;

    @NotNull
    private static final ct D = null;

    @NotNull
    private static final ct g = null;

    @NotNull
    private static final cw A = null;

    @NotNull
    private static final cw nA = null;

    @NotNull
    private static final cw U = null;

    @NotNull
    private static final ct nn = null;

    @NotNull
    private static final ct w = null;

    @NotNull
    private static final ct v = null;

    @NotNull
    private static final ct J = null;

    @NotNull
    private static final ct n2 = null;

    @NotNull
    private static final ct m = null;

    @NotNull
    private static final ct a = null;

    @NotNull
    private static final ct ns = null;

    @NotNull
    private static final ct nO = null;

    @NotNull
    private static final ct Q = null;

    @NotNull
    private static final ct x = null;

    @NotNull
    private static final ct y = null;

    @NotNull
    private static final ct n1 = null;

    @NotNull
    private static final cw B = null;

    @NotNull
    private static final cw nr = null;

    @NotNull
    private static final ct M = null;

    @NotNull
    private static final ct V = null;

    @NotNull
    private static final cq K = null;

    @NotNull
    private static final cq T = null;

    @NotNull
    private static final ct d = null;

    @NotNull
    private static final c8 R = null;

    @NotNull
    private static final ct G = null;

    @NotNull
    private static final c8 X = null;

    @NotNull
    private static final c8 nl = null;

    @NotNull
    private static final cq i = null;

    @NotNull
    private static final c8 ny = null;

    @NotNull
    private static final c8 n8 = null;

    @NotNull
    private static final c8 F = null;

    @NotNull
    private static final c8 nv = null;

    @NotNull
    private static final ct nE = null;

    @NotNull
    private static final ct P = null;

    @NotNull
    private static final cq nC = null;

    @NotNull
    private static final cq H = null;

    @NotNull
    private static final c8 l = null;

    @NotNull
    private static final cq C = null;

    @NotNull
    private static final c8 n7 = null;

    @NotNull
    private static final c8 n9 = null;

    @NotNull
    private static final cw nf = null;

    @NotNull
    private static final c8 E = null;

    @NotNull
    private static final ct nV = null;

    @NotNull
    private static final ct r = null;

    @NotNull
    private static final ct u = null;

    @NotNull
    private static final ct W = null;

    @NotNull
    private static final cw nT = null;

    @NotNull
    private static final ct nh = null;

    @NotNull
    private static final ct nM = null;

    @NotNull
    private static final ct nZ = null;

    @NotNull
    private static class_243 z;

    @NotNull
    private static class_243 np;

    @NotNull
    private static class_243 nR;

    @NotNull
    private static l5 nb;

    @NotNull
    private static l5 t;

    @NotNull
    private static l5 nL;

    @NotNull
    private static l5 s;

    @NotNull
    private static l5 nJ;
    private static float e;
    private static float nK;
    private static int nt;
    private static int n4;
    private static float nH;
    private static float nQ;
    private static int n_;
    private static int o;
    private static int p;
    private static int k;
    private static int q;
    private static float nw;
    private static float na;
    private static int S;
    private static int b;
    private static int nF;

    @NotNull
    private static final List nd = null;
    private static int[] Y;
    private static final long bb = 0;
    private static final String[] fb = null;
    private static final String[] gb = null;
    private static final Map hb = null;
    private static final long[] jb = null;
    private static final Integer[] kb = null;
    private static final Map lb = null;
    private static final long[] mb = null;
    private static final Long[] ob = null;
    private static final Map pb = null;

    private tp(long j2) {
        super((char) (r0 >>> 48), (int) ((((bb ^ j2) ^ 112397824150122L) << 16) >>> 32), (short) ((r1 << 48) >>> 48));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.g9] */
    public final boolean FK(long j2) {
        long j3 = bb ^ j2;
        Object objH = j3;
        try {
            objH = um.E.h(objH ^ 23226776462300L);
            return objH == g9.ADVANCED;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, -6643432183411597801L, j3) /* invoke-custom */;
        }
    }

    @NotNull
    public final h gC(long j2) {
        return (h) nk.E(this, (bb ^ j2) ^ 51402652428321L, nP[0]);
    }

    @NotNull
    public final my U(int i2, long j2) {
        return (my) ne.E(this, (((((long) i2) << 32) | ((j2 << 32) >>> 32)) ^ bb) ^ 111841097639000L, nP[1]);
    }

    @NotNull
    public final ji Ff(long j2) {
        return (ji) N.E(this, (bb ^ j2) ^ 68394919656842L, nP[2]);
    }

    public final float gK(int i2, short s2, short s3) {
        return ((Number) f.E(this, ((((((long) i2) << 32) | ((((long) s2) << 48) >>> 32)) | ((((long) s3) << 48) >>> 48)) ^ bb) ^ 7662253981625L, nP[3])).floatValue();
    }

    public final float Fc(long j2) {
        return ((Number) O.E(this, (bb ^ j2) ^ 115201296343514L, nP[4])).floatValue();
    }

    public final float O(short s2, short s3, int i2) {
        return ((Number) I.E(this, ((((((long) s2) << 48) | ((((long) s3) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ bb) ^ 73080159278905L, nP[5])).floatValue();
    }

    public final float FS(int i2, long j2) {
        long j3 = ((((long) i2) << 32) | ((j2 << 32) >>> 32)) ^ bb;
        return ((Number) L.E(this, j3 ^ 69873500162999L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6500, 7986015265451182013L ^ j3) /* invoke-custom */])).floatValue();
    }

    @NotNull
    public final jz Fs(short s2, int i2, int i3) {
        long j2 = (((((long) s2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ bb;
        return (jz) j.E(this, j2 ^ 105428539733408L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7985, 2251821665761230836L ^ j2) /* invoke-custom */]);
    }

    public final float FX(int i2, int i3, byte b2) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 40) >>> 32)) | ((((long) b2) << 56) >>> 56)) ^ bb;
        return ((Number) n.E(this, j2 ^ 109255770686669L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24265, 3920756499277909766L ^ j2) /* invoke-custom */])).floatValue();
    }

    public final float F2(long j2) {
        long j3 = bb ^ j2;
        return ((Number) c.E(this, j3 ^ 53828354142953L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24978, 6083566260469335642L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float a(long j2) {
        long j3 = bb ^ j2;
        return ((Number) D.E(this, j3 ^ 38349119086854L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28687, 4074507582242030644L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float gG(long j2) {
        long j3 = bb ^ j2;
        return ((Number) g.E(this, j3 ^ 135049867465715L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16241, 5688717906340690321L ^ j3) /* invoke-custom */])).floatValue();
    }

    @NotNull
    public final jz Fa(long j2) {
        long j3 = bb ^ j2;
        return (jz) A.E(this, j3 ^ 42832791739228L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26558, 4656762143902132700L ^ j3) /* invoke-custom */]);
    }

    @NotNull
    public final ji FT(long j2) {
        long j3 = bb ^ j2;
        return (ji) nA.E(this, j3 ^ 15390209085118L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10987, 7330584237068530010L ^ j3) /* invoke-custom */]);
    }

    @NotNull
    public final ji Fd(long j2) {
        long j3 = bb ^ j2;
        return (ji) U.E(this, j3 ^ 40089214770888L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16111, 3258296004740838780L ^ j3) /* invoke-custom */]);
    }

    public final float FA(long j2) {
        long j3 = bb ^ j2;
        return ((Number) nn.E(this, j3 ^ 45510772273120L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20923, 4736991469606562579L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float FJ(char c2, int i2, short s2) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s2) << 48) >>> 48)) ^ bb;
        return ((Number) w.E(this, j2 ^ 26897244361579L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17721, 8886933559748248437L ^ j2) /* invoke-custom */])).floatValue();
    }

    public final float h(int i2, int i3, short s2) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ bb;
        return ((Number) v.E(this, j2 ^ 51430630033804L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22406, 4445478401087195972L ^ j2) /* invoke-custom */])).floatValue();
    }

    public final float z(long j2) {
        long j3 = bb ^ j2;
        return ((Number) J.E(this, j3 ^ 106697461739017L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12552, 5465462581412104760L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float f(int i2, int i3, short s2) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ bb;
        return ((Number) n2.E(this, j2 ^ 71421130512764L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11834, 3827728754136392203L ^ j2) /* invoke-custom */])).floatValue();
    }

    public final float e(short s2, short s3, int i2) {
        long j2 = (((((long) s2) << 48) | ((((long) s3) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ bb;
        return ((Number) m.E(this, j2 ^ 43899337602628L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28665, 4268034256611478726L ^ j2) /* invoke-custom */])).floatValue();
    }

    public final float L(long j2) {
        long j3 = bb ^ j2;
        return ((Number) a.E(this, j3 ^ 67019757933683L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6968, 6978165190335847006L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float F7(long j2) {
        long j3 = bb ^ j2;
        return ((Number) ns.E(this, j3 ^ 8584474409454L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25250, 3159191819713170986L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float Q(long j2) {
        long j3 = bb ^ j2;
        return ((Number) nO.E(this, j3 ^ 114718467556766L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14064, 177475182835476078L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float Fn(long j2) {
        long j3 = bb ^ j2;
        return ((Number) Q.E(this, j3 ^ 38445893617310L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1207, 6223359731328063264L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float F4(int i2, char c2, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ bb;
        return ((Number) x.E(this, j2 ^ 65770552178332L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9583, 4912497664883361433L ^ j2) /* invoke-custom */])).floatValue();
    }

    public final float Fm(long j2) {
        long j3 = bb ^ j2;
        return ((Number) y.E(this, j3 ^ 57694321263197L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30969, 978877906301824935L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float F3(long j2) {
        long j3 = bb ^ j2;
        return ((Number) n1.E(this, j3 ^ 15411386013559L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1023, 9107889180609692048L ^ j3) /* invoke-custom */])).floatValue();
    }

    @NotNull
    public final _s FY(long j2) {
        long j3 = bb ^ j2;
        return (_s) B.E(this, j3 ^ 94287194982172L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21247, 731327683366142111L ^ j3) /* invoke-custom */]);
    }

    @NotNull
    public final _s T(long j2) {
        long j3 = bb ^ j2;
        return (_s) nr.E(this, j3 ^ 77222141316307L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8008, 9176827827188975284L ^ j3) /* invoke-custom */]);
    }

    public final float F8(long j2) {
        long j3 = bb ^ j2;
        return ((Number) M.E(this, j3 ^ 81250194120100L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26208, 3316001344670871175L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float n(long j2) {
        long j3 = bb ^ j2;
        return ((Number) V.E(this, j3 ^ 138588471679417L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13162, 3174176289014480837L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final boolean t(long j2) {
        long j3 = bb ^ j2;
        return ((Boolean) K.E(this, j3 ^ 139509486628561L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20680, 953040057841380188L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean FE(long j2) {
        long j3 = bb ^ j2;
        return ((Boolean) T.E(this, j3 ^ 51802695564619L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2114, 2529481442197266518L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final float K(long j2) {
        long j3 = bb ^ j2;
        return ((Number) d.E(this, j3 ^ 78196787395490L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18661, 4176447909519812114L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final int M(short s2, int i2, int i3) {
        long j2 = (((((long) s2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ bb;
        return ((Number) R.E(this, j2 ^ 38964419324803L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20344, 7404527212382335475L ^ j2) /* invoke-custom */])).intValue();
    }

    public final float Fh(long j2) {
        long j3 = bb ^ j2;
        return ((Number) G.E(this, j3 ^ 83919706325969L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16987, 6111107004275512532L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final int Fu(long j2) {
        long j3 = bb ^ j2;
        return ((Number) X.E(this, j3 ^ 106842997062197L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18935, 242319252642539241L ^ j3) /* invoke-custom */])).intValue();
    }

    public final int FN(long j2) {
        long j3 = bb ^ j2;
        return ((Number) nl.E(this, j3 ^ 44278983203275L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10670, 6729297309729236306L ^ j3) /* invoke-custom */])).intValue();
    }

    public final boolean u(long j2) {
        long j3 = bb ^ j2;
        return ((Boolean) i.E(this, j3 ^ 9872744589530L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17987, 5274161071594699650L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final int q(long j2) {
        long j3 = bb ^ j2;
        return ((Number) ny.E(this, j3 ^ 94629052412899L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19161, 1578365250382179340L ^ j3) /* invoke-custom */])).intValue();
    }

    public final int Fk(long j2) {
        long j3 = bb ^ j2;
        return ((Number) n8.E(this, j3 ^ 106874290011602L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29428, 8236231169478105614L ^ j3) /* invoke-custom */])).intValue();
    }

    public final int B(long j2) {
        long j3 = bb ^ j2;
        return ((Number) F.E(this, j3 ^ 112788811734754L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8491, 2812722869913873030L ^ j3) /* invoke-custom */])).intValue();
    }

    public final int N(long j2) {
        long j3 = bb ^ j2;
        return ((Number) nv.E(this, j3 ^ 122665319332505L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32506, 3483002706475553150L ^ j3) /* invoke-custom */])).intValue();
    }

    public final float F5(short s2, int i2, char c2) {
        long j2 = (((((long) s2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c2) << 48) >>> 48)) ^ bb;
        return ((Number) nE.E(this, j2 ^ 113563285705543L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6413, 3842379611118493467L ^ j2) /* invoke-custom */])).floatValue();
    }

    public final float g2(long j2, int i2) {
        long j3 = ((j2 << 32) | ((((long) i2) << 32) >>> 32)) ^ bb;
        return ((Number) P.E(this, j3 ^ 40631778984293L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18768, 6639230060505800025L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final boolean s(int i2, int i3) {
        long j2 = ((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ bb;
        return ((Boolean) nC.E(this, j2 ^ 80085603450976L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2634, 2024857254079733521L ^ j2) /* invoke-custom */])).booleanValue();
    }

    public final boolean F0(long j2) {
        long j3 = bb ^ j2;
        return ((Boolean) H.E(this, j3 ^ 37387900447597L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6184, 4361163504825067119L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final int W(long j2) {
        long j3 = bb ^ j2;
        return ((Number) l.E(this, j3 ^ 82865540219396L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10089, 7214333843685011518L ^ j3) /* invoke-custom */])).intValue();
    }

    public final boolean v(int i2, char c2, short s2) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ bb;
        return ((Boolean) C.E(this, j2 ^ 61944226535910L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4035, 8634311787222778645L ^ j2) /* invoke-custom */])).booleanValue();
    }

    public final int k(long j2) {
        long j3 = bb ^ j2;
        return ((Number) n7.E(this, j3 ^ 137626987524042L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5463, 4680161141049716683L ^ j3) /* invoke-custom */])).intValue();
    }

    public final int d(long j2) {
        long j3 = bb ^ j2;
        return ((Number) n9.E(this, j3 ^ 120153169044259L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25120, 4601065885790327858L ^ j3) /* invoke-custom */])).intValue();
    }

    @NotNull
    public final x3 Fj(int i2, byte b2, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i3) << 40) >>> 40)) ^ bb;
        return (x3) nf.E(this, j2 ^ 96453689665942L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17540, 8326206278018054228L ^ j2) /* invoke-custom */]);
    }

    public final int I(long j2) {
        long j3 = bb ^ j2;
        return ((Number) E.E(this, j3 ^ 29960145632120L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5994, 5842072970021796146L ^ j3) /* invoke-custom */])).intValue();
    }

    public final float gN(long j2) {
        long j3 = bb ^ j2;
        return ((Number) nV.E(this, j3 ^ 47173018206158L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14646, 7034936340595086258L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float D(long j2) {
        long j3 = bb ^ j2;
        return ((Number) r.E(this, j3 ^ 91338187612394L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25778, 7282023874420265323L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float F6(long j2) {
        long j3 = bb ^ j2;
        return ((Number) u.E(this, j3 ^ 97505331727304L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7199, 5878004458060792563L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float P(long j2) {
        long j3 = bb ^ j2;
        return ((Number) W.E(this, j3 ^ 7372723373618L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5384, 5549801299048449649L ^ j3) /* invoke-custom */])).floatValue();
    }

    @NotNull
    public final yx F_(long j2) {
        long j3 = bb ^ j2;
        return (yx) nT.E(this, j3 ^ 95704437750466L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4831, 3772029277041130850L ^ j3) /* invoke-custom */]);
    }

    public final float FC(long j2) {
        long j3 = bb ^ j2;
        return ((Number) nh.E(this, j3 ^ 117382413606151L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29012, 8963529478454262143L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float b(long j2) {
        long j3 = bb ^ j2;
        return ((Number) nM.E(this, j3 ^ 54162658308323L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4988, 4380958900800304787L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float Fv(int i2, int i3, byte b2) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 40) >>> 32)) | ((((long) b2) << 56) >>> 56)) ^ bb;
        return ((Number) nZ.E(this, j2 ^ 92304636872350L, nP[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15846, 3417512635425074815L ^ j2) /* invoke-custom */])).floatValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x061e: INVOKE (r-1 I:su.catlean.tp), (r0 I:double), (r1 I:long), (r2 I:kotlin.ranges.ClosedFloatingPointRange) VIRTUAL call: su.catlean.tp.f(double, long, kotlin.ranges.ClosedFloatingPointRange):double
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @Override // su.catlean.tt
    @org.jetbrains.annotations.NotNull
    public su.catlean._w o(@org.jetbrains.annotations.NotNull net.minecraft.class_1297 r15, long r16, @org.jetbrains.annotations.NotNull su.catlean._w r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 2940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.o(net.minecraft.class_1297, long, su.catlean._w, boolean):su.catlean._w");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private final boolean F1(long j2) {
        long j3 = bb ^ j2;
        long j4 = j3 ^ 40134046075474L;
        int i2 = (int) (j3 >>> 32);
        int i3 = (int) ((j4 << 32) >>> 48);
        int i4 = (int) ((j4 << 48) >>> 48);
        Object objV = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4636498955711959939L, j3) /* invoke-custom */;
        try {
            objV = v(i2, (char) i3, (short) i4);
            if (objV != 0) {
                return objV;
            }
            if (objV != 0) {
                Object obj = nF;
                try {
                    try {
                        nF = obj - 1;
                        obj = nF;
                        if (objV != 0) {
                            return obj;
                        }
                        if (obj > 0) {
                            return true;
                        }
                    } catch (NoWhenBranchMatchedException unused) {
                        obj = (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 4672414064776936717L, j3) /* invoke-custom */;
                        throw obj;
                    }
                } catch (NoWhenBranchMatchedException unused2) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 4672414064776936717L, j3) /* invoke-custom */;
                }
            }
            return false;
        } catch (NoWhenBranchMatchedException unused3) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objV, 4672414064776936717L, j3) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0243: ARITH (r-1 I:float) = (r-1 I:float) + (r0 I:float)
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final su.catlean._w j(float r15, short r16, float r17, int r18, short r19) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.j(float, short, float, int, short):su.catlean._w");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [su.catlean.jz] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [su.catlean.jz] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    private final float G(long j2, ClosedRange closedRange, boolean z2) {
        long j3 = bb ^ j2;
        long j4 = j3 ^ 5724422808525L;
        long j5 = j3 ^ 74515889443579L;
        long j6 = j3 ^ 136489326267697L;
        int i2 = (int) (j3 >>> 48);
        int i3 = (int) ((j6 << 16) >>> 32);
        int i4 = (int) ((j6 << 48) >>> 48);
        int i5 = (int) (j3 >>> 32);
        long j7 = ((j3 ^ 16838113481119L) << 32) >>> 32;
        ?? Fs = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7745373506570385574L, j3) /* invoke-custom */;
        try {
            try {
                Fs = z2;
                try {
                    if (Fs != 0) {
                        try {
                            Fs = Fa(j4);
                            ?? start = Fs;
                            if (Fs == 0) {
                                if (Fs == jz.FLAT) {
                                    return mf.p(closedRange, j5, false, 2, null);
                                }
                                start = closedRange.getStart();
                            }
                            return ((Number) start).floatValue() + ((((Number) closedRange.getEndInclusive()).floatValue() - ((Number) closedRange.getStart()).floatValue()) * L((((float) mf.x()) + 3.0f) / 6.0f, RangesKt.rangeTo(0.0f, 1.0f), i5, j7));
                        } catch (NoWhenBranchMatchedException unused) {
                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Fs, 7778421072468530728L, j3) /* invoke-custom */;
                        }
                    }
                    try {
                        Fs = Fs((short) i2, i3, i4);
                        ?? start2 = Fs;
                        if (Fs == 0) {
                            if (Fs == jz.FLAT) {
                                return mf.p(closedRange, j5, false, 2, null);
                            }
                            start2 = closedRange.getStart();
                        }
                        return ((Number) start2).floatValue() + ((((Number) closedRange.getEndInclusive()).floatValue() - ((Number) closedRange.getStart()).floatValue()) * L((((float) mf.x()) + 3.0f) / 6.0f, RangesKt.rangeTo(0.0f, 1.0f), i5, j7));
                    } catch (NoWhenBranchMatchedException unused2) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Fs, 7778421072468530728L, j3) /* invoke-custom */;
                    }
                } catch (NoWhenBranchMatchedException unused3) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Fs, 7778421072468530728L, j3) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused4) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Fs, 7778421072468530728L, j3) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused5) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Fs, 7778421072468530728L, j3) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0299: INVOKE (r-2 I:net.minecraft.class_243), (r-1 I:double), (r0 I:double), (r1 I:double) DIRECT call: net.minecraft.class_243.<init>(double, double, double):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @Override // su.catlean.tt
    @org.jetbrains.annotations.NotNull
    public net.minecraft.class_243 B(long r16, @org.jetbrains.annotations.NotNull net.minecraft.class_1297 r18) {
        /*
            Method dump skipped, instruction units count: 1178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.B(long, net.minecraft.class_1297):net.minecraft.class_243");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final double f(double r8, long r10, @org.jetbrains.annotations.NotNull kotlin.ranges.ClosedFloatingPointRange r12) {
        /*
            r7 = this;
            long r0 = su.catlean.tp.bb
            r1 = r10
            long r0 = r0 ^ r1
            r10 = r0
            r0 = r12
            r1 = 19316(0x4b74, float:2.7067E-41)
            r2 = 3416390151150918949(0x2f6974bddd7e5d25, double:2.683624239644041E-80)
            r3 = r10
            long r2 = r2 ^ r3
            java.lang.String r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/tp;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "k"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = -8180368392856429150(0x8e797e49c3f59da2, double:-6.1171584622821734E-239)
            r1 = r10
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r1 = r12
            java.lang.Comparable r1 = r1.getStart()
            java.lang.Number r1 = (java.lang.Number) r1
            double r1 = r1.doubleValue()
            r14 = r1
            r13 = r0
            r0 = r12
            java.lang.Comparable r0 = r0.getEndInclusive()
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            r16 = r0
            r0 = r14
            r1 = r16
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = r13
            if (r1 != 0) goto L6b
            if (r0 <= 0) goto L67
            goto L5b
        L51:
            r1 = -8145069284175203540(0x8ef6e6a3f5cab32c, double:-1.4067493172364127E-236)
            r2 = r10
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L5b:
            r0 = r16
            r18 = r0
            r0 = r14
            r16 = r0
            r0 = r18
            r14 = r0
        L67:
            r0 = r8
            r1 = r14
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
        L6b:
            r1 = r10
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto La9
            r1 = r13
            if (r1 != 0) goto La9
            if (r0 >= 0) goto L93
            goto L86
        L7c:
            r1 = -8145069284175203540(0x8ef6e6a3f5cab32c, double:-1.4067493172364127E-236)
            r2 = r10
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L89
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L89
        L86:
            r0 = r14
            return r0
        L89:
            r1 = -8145069284175203540(0x8ef6e6a3f5cab32c, double:-1.4067493172364127E-236)
            r2 = r10
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L93:
            r0 = r8
            r1 = r13
            if (r1 != 0) goto Lba
            r1 = r16
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            goto La9
        L9f:
            r1 = -8145069284175203540(0x8ef6e6a3f5cab32c, double:-1.4067493172364127E-236)
            r2 = r10
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        La9:
            if (r0 <= 0) goto Lb9
            r0 = r16
            return r0
        Laf:
            r1 = -8145069284175203540(0x8ef6e6a3f5cab32c, double:-1.4067493172364127E-236)
            r2 = r10
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lb9:
            r0 = r8
        Lba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.f(double, long, kotlin.ranges.ClosedFloatingPointRange):double");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final float L(float r8, @org.jetbrains.annotations.NotNull kotlin.ranges.ClosedFloatingPointRange r9, int r10, long r11) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.L(float, kotlin.ranges.ClosedFloatingPointRange, int, long):float");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final int B(byte r8, int r9, @org.jetbrains.annotations.NotNull kotlin.ranges.IntRange r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.B(byte, int, kotlin.ranges.IntRange, int, int):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0318: INVOKE (r-2 I:net.minecraft.class_243), (r-1 I:double), (r0 I:double), (r1 I:double) DIRECT call: net.minecraft.class_243.<init>(double, double, double):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void gh(long r16) {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.gh(long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00c0: INVOKE (r-1 I:net.minecraft.class_243), (r0 I:double), (r1 I:double), (r2 I:double) DIRECT call: net.minecraft.class_243.<init>(double, double, double):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void F(long r17, @org.jetbrains.annotations.NotNull net.minecraft.class_1297 r19) {
        /*
            Method dump skipped, instruction units count: 1153
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.F(long, net.minecraft.class_1297):void");
    }

    private static final boolean Fr() {
        return nc.FK((bb ^ 49142780508564L) ^ 96432995965840L);
    }

    private static final boolean Fq() {
        return nc.FK((bb ^ 76065561224025L) ^ 68354861695325L);
    }

    private static final boolean R() {
        return nc.FK((bb ^ 21792301547657L) ^ 115262257177229L);
    }

    private static final boolean Fe() {
        return nc.FK((bb ^ 16051297391623L) ^ 129314022536707L);
    }

    private static final boolean Y() {
        return nc.FK((bb ^ 79458602546399L) ^ 56354706740955L);
    }

    private static final boolean w() {
        return nc.FK((bb ^ 93066227901339L) ^ 52372109115807L);
    }

    private static final boolean g() {
        return nc.FK((bb ^ 100092276522638L) ^ 35244285074570L);
    }

    private static final boolean j() {
        return nc.FK((bb ^ 15364701066639L) ^ 130825241573259L);
    }

    private static final boolean FM() {
        return nc.FK((bb ^ 34840027064511L) ^ 110684208515771L);
    }

    private static final boolean gV() {
        return nc.FK((bb ^ 108636533613082L) ^ 28349309075486L);
    }

    private static final boolean gf() {
        return nc.FK((bb ^ 70689035442591L) ^ 65214470519707L);
    }

    private static final boolean X() {
        return nc.FK((bb ^ 111593835672470L) ^ 33513788051858L);
    }

    private static final boolean FF() {
        return nc.FK((bb ^ 66833419938298L) ^ 78948507618302L);
    }

    private static final boolean FQ() {
        return nc.FK((bb ^ 128110072940275L) ^ 17070563681527L);
    }

    private static final boolean Fl() {
        return nc.FK((bb ^ 1362422530922L) ^ 134382165139822L);
    }

    private static final boolean Z() {
        return nc.FK((bb ^ 125968940601364L) ^ 10531569447440L);
    }

    private static final boolean FZ() {
        return nc.FK((bb ^ 46723746426736L) ^ 89592075079028L);
    }

    private static final boolean Ft() {
        return nc.FK((bb ^ 130657908585809L) ^ 15188442732373L);
    }

    private static final boolean FO() {
        return nc.FK((bb ^ 99671379168595L) ^ 36988034477911L);
    }

    private static final boolean FW() {
        return nc.FK((bb ^ 10867580616719L) ^ 126337298326027L);
    }

    private static final boolean G() {
        return nc.FK((bb ^ 87950178595308L) ^ 58239767450600L);
    }

    private static final boolean Fi() {
        return nc.FK((bb ^ 128394015982686L) ^ 17332075718234L);
    }

    private static final boolean A() {
        return nc.FK((bb ^ 42214880961999L) ^ 102673701029835L);
    }

    private static final boolean o() {
        return nc.FK((bb ^ 29204604966014L) ^ 107248648681082L);
    }

    private static final boolean H() {
        return nc.FK((bb ^ 53764594453930L) ^ 83440276631470L);
    }

    private static final boolean g5() {
        return nc.FK((bb ^ 72490700657146L) ^ 64782903800830L);
    }

    private static final boolean gT() {
        return nc.FK((bb ^ 250185186557L) ^ 135511581875961L);
    }

    private static final boolean Fz() {
        return nc.FK((bb ^ 64966184107830L) ^ 70451989765426L);
    }

    private static final boolean gi() {
        return nc.FK((bb ^ 105732457248704L) ^ 29878981203396L);
    }

    private static final boolean l() {
        return nc.FK((bb ^ 39000878179920L) ^ 97297769481300L);
    }

    private static final boolean V() {
        return nc.FK((bb ^ 93070490298803L) ^ 52367831780279L);
    }

    private static final boolean Fx() {
        return nc.FK((bb ^ 107955937322580L) ^ 27668393886800L);
    }

    private static final boolean x() {
        return nc.FK((bb ^ 116019181620168L) ^ 20348172642764L);
    }

    private static final boolean r() {
        return nc.FK((bb ^ 73204834148036L) ^ 63295665159360L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean FD() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 110531218164756(0x64870dfecc14, double:5.460967768819E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 12485241306459(0xb5af25f7d5b, double:6.1685288095595E-311)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 34645127163408(0x1f82727f6e10, double:1.71169671272413E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 6051746829176160295(0x53fc1fad77a44027, double:3.7544965896024835E96)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L35
            r1 = r11
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L35
            r1 = r13
            if (r1 != 0) goto L53
            if (r0 == 0) goto L6c
            goto L3f
        L35:
            r1 = 6013298667582877353(0x53738747419b6ea9, double:1.0183709844140395E94)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L49
        L3f:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            r1 = r9
            boolean r0 = r0.FE(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            goto L53
        L49:
            r1 = 6013298667582877353(0x53738747419b6ea9, double:1.0183709844140395E94)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 != 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = 6013298667582877353(0x53738747419b6ea9, double:1.0183709844140395E94)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L68:
            r0 = 1
        L69:
            goto L6d
        L6c:
            r0 = 0
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.FD():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean gw() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 17442209051784(0xfdd14acb488, double:8.6175962800677E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 105557059765703(0x6000eb0d05c7, double:5.2152116906245E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 128472859874956(0x74d86b2d168c, double:6.3474026487192E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 3125626747462498491(0x2b6074f76ef638bb, double:9.40501490539563E-100)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L35
            r1 = r11
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L35
            r1 = r13
            if (r1 != 0) goto L53
            if (r0 == 0) goto L6c
            goto L3f
        L35:
            r1 = 3166008673852528181(0x2befec1d58c91635, double:4.6703119945358934E-97)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L49
        L3f:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            r1 = r9
            boolean r0 = r0.FE(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            goto L53
        L49:
            r1 = 3166008673852528181(0x2befec1d58c91635, double:4.6703119945358934E-97)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 != 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = 3166008673852528181(0x2befec1d58c91635, double:4.6703119945358934E-97)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L68:
            r0 = 1
        L69:
            goto L6d
        L6c:
            r0 = 0
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.gw():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean FG() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 103907638126221(0x5e80e1dc268d, double:5.133719433867E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 54276013266882(0x315d1e7d97c2, double:2.681591354839E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 41255817806985(0x25859e5d8489, double:2.0383082269517E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -5087618789361145154(0xb96525aa9b86aabe, double:-3.258231967912944E-32)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L35
            r1 = r11
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L35
            r1 = r13
            if (r1 != 0) goto L53
            if (r0 == 0) goto L6c
            goto L3f
        L35:
            r1 = -5050015946652416976(0xb9eabd40adb98430, double:-1.0546781645700822E-29)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L49
        L3f:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            r1 = r9
            boolean r0 = r0.FE(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            goto L53
        L49:
            r1 = -5050015946652416976(0xb9eabd40adb98430, double:-1.0546781645700822E-29)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 != 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = -5050015946652416976(0xb9eabd40adb98430, double:-1.0546781645700822E-29)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L68:
            r0 = 1
        L69:
            goto L6d
        L6c:
            r0 = 0
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.FG():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean Fw() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 25607929214022(0x174a4f863446, double:1.26519980857827E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 132592890774793(0x7897b0278509, double:6.5509592214606E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 119087364019778(0x6c4f30079642, double:5.8836975415963E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -6075799686799902603(0xabae6c6035dcb875, double:-2.781879800927244E-98)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L35
            r1 = r11
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L35
            r1 = r13
            if (r1 != 0) goto L53
            if (r0 == 0) goto L6c
            goto L3f
        L35:
            r1 = -6115337945384511749(0xab21f48a03e396fb, double:-6.413313305420958E-101)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L49
        L3f:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            r1 = r9
            boolean r0 = r0.FE(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            goto L53
        L49:
            r1 = -6115337945384511749(0xab21f48a03e396fb, double:-6.413313305420958E-101)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 != 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = -6115337945384511749(0xab21f48a03e396fb, double:-6.413313305420958E-101)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L68:
            r0 = 1
        L69:
            goto L6d
        L6c:
            r0 = 0
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.Fw():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean gj() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 83505299505719(0x4bf297b6c237, double:4.125709973146E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 39786028430200(0x242f68177378, double:1.9656909831825E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 53841310998579(0x30f7e8376033, double:2.66011420914523E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 6764178873596530180(0x5ddf30d8edec4e04, double:1.5214041585884966E144)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L35
            r1 = r11
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L35
            r1 = r13
            if (r1 != 0) goto L53
            if (r0 == 0) goto L6c
            goto L3f
        L35:
            r1 = 6724059180054044810(0x5d50a832dbd3608a, double:3.173769952359364E141)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L49
        L3f:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            r1 = r9
            boolean r0 = r0.FE(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            goto L53
        L49:
            r1 = 6724059180054044810(0x5d50a832dbd3608a, double:3.173769952359364E141)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 != 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = 6724059180054044810(0x5d50a832dbd3608a, double:3.173769952359364E141)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L68:
            r0 = 1
        L69:
            goto L6d
        L6c:
            r0 = 0
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.gj():boolean");
    }

    private static final boolean FI() {
        return nc.FK((bb ^ 106894065413288L) ^ 28850525146796L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean Fg() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 3121004912915(0x2d6aa63a113, double:1.541981307973E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 133950733419287(0x79d3d5e20317, double:6.61804556177087E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 82380591809997(0x4aecb9e945cd, double:4.07014202973903E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 4538355176238034208(0x3efb79fcd0392d20, double:2.6203645587846995E-5)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L34
            r1 = r9
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L34
            r1 = r13
            if (r1 != 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = 4500469416114652078(0x3e74e116e60603ae, double:7.778128852631153E-8)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L49
        L3e:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            r1 = r11
            boolean r0 = r0.u(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            goto L53
        L49:
            r1 = 4500469416114652078(0x3e74e116e60603ae, double:7.778128852631153E-8)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 != 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = 4500469416114652078(0x3e74e116e60603ae, double:7.778128852631153E-8)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L68:
            r0 = 1
        L69:
            goto L6d
        L6c:
            r0 = 0
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.Fg():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean FR() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 91940648687012(0x539e99b495a4, double:4.54247159726117E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 44650047289248(0x289be63537a0, double:2.20600544508045E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 30393507934586(0x1ba48a3e717a, double:1.50163881270823E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 742012795992545687(0xa4c28b4e3ee1997, double:4.578583370837213E-259)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L34
            r1 = r9
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L34
            r1 = r13
            if (r1 != 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = 775657482198529817(0xac3b05ed5d13719, double:8.19551404264371E-257)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L49
        L3e:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            r1 = r11
            boolean r0 = r0.u(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            goto L53
        L49:
            r1 = 775657482198529817(0xac3b05ed5d13719, double:8.19551404264371E-257)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 != 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = 775657482198529817(0xac3b05ed5d13719, double:8.19551404264371E-257)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L68:
            r0 = 1
        L69:
            goto L6d
        L6c:
            r0 = 0
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.FR():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean Fo() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 36179916202093(0x20e7cb0da06d, double:1.78752536648693E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 101029249811049(0x5be2b48c0269, double:4.99150815567526E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 115302029804723(0x68ddd88744b3, double:5.6966771822277E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 4577165535293680734(0x3f855bcdb1572c5e, double:0.010429007505896756)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L34
            r1 = r9
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L34
            r1 = r13
            if (r1 != 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = 4542657748699448016(0x3f0ac327876802d0, double:5.104507811282621E-5)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L49
        L3e:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            r1 = r11
            boolean r0 = r0.u(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            goto L53
        L49:
            r1 = 4542657748699448016(0x3f0ac327876802d0, double:5.104507811282621E-5)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 != 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = 4542657748699448016(0x3f0ac327876802d0, double:5.104507811282621E-5)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L68:
            r0 = 1
        L69:
            goto L6d
        L6c:
            r0 = 0
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.Fo():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean F9() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 9899460396384(0x900e5d20560, double:4.8909832942193E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 125368389576548(0x72059a53a764, double:6.1940214364214E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 71721496928702(0x413af658e1be, double:3.543512770078E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -7311468467645281965(0x9a88722a9f888953, double:-7.364101445178272E-181)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L34
            r1 = r9
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L34
            r1 = r13
            if (r1 != 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = -7347646153829668899(0x9a07eac0a9b7a7dd, double:-2.8143583478898974E-183)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L49
        L3e:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            r1 = r11
            boolean r0 = r0.u(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            goto L53
        L49:
            r1 = -7347646153829668899(0x9a07eac0a9b7a7dd, double:-2.8143583478898974E-183)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 != 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = -7347646153829668899(0x9a07eac0a9b7a7dd, double:-2.8143583478898974E-183)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L68:
            r0 = 1
        L69:
            goto L6d
        L6c:
            r0 = 0
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.F9():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean gI() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 28330670384382(0x19c43f8b64fe, double:1.3997210960575E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 108582142658298(0x62c1400ac6fa, double:5.36467064392984E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 90152101838880(0x51fe2c018020, double:4.4541056418972E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -353986745188882227(0xfb1662ee45d1e8cd, double:-8.322256768388726E284)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L34
            r1 = r9
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L34
            r1 = r13
            if (r1 != 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = -316947401721067965(0xfb99fa0473eec643, double:-2.4721720766346676E287)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L49
        L3e:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            r1 = r11
            boolean r0 = r0.u(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            goto L53
        L49:
            r1 = -316947401721067965(0xfb99fa0473eec643, double:-2.4721720766346676E287)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 != 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = -316947401721067965(0xfb99fa0473eec643, double:-2.4721720766346676E287)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L68:
            r0 = 1
        L69:
            goto L6d
        L6c:
            r0 = 0
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.gI():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean y() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 14806272776150(0xd775aa117d6, double:7.31527072165E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 130232621250002(0x76722520b5d2, double:6.43434641274807E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 76198242415368(0x454d492bf308, double:3.76469338509167E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -8629329693637895195(0x883e765d20fb9be5, double:-5.7661695773812646E-269)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L34
            r1 = r9
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L34
            r1 = r13
            if (r1 != 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = -8596827743545150101(0x88b1eeb716c4b56b, double:-8.689689028768728E-267)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L49
        L3e:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            r1 = r11
            boolean r0 = r0.u(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            goto L53
        L49:
            r1 = -8596827743545150101(0x88b1eeb716c4b56b, double:-8.689689028768728E-267)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 != 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = -8596827743545150101(0x88b1eeb716c4b56b, double:-8.689689028768728E-267)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L68:
            r0 = 1
        L69:
            goto L6d
        L6c:
            r0 = 0
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.y():boolean");
    }

    private static final boolean FU() {
        return nc.FK((bb ^ 86319786399969L) ^ 58843664300773L);
    }

    private static final boolean gq() {
        return nc.FK((bb ^ 130317990845549L) ^ 14858339548777L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean Fp() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 138772385157611(0x7e3676b8d1eb, double:6.85626680978253E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 5716756231151(0x533093973ef, double:2.8244528594606E-311)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 31850485216898(0x1cf7c4db7682, double:1.5736230549044E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 5621342377921895896(0x4e03051c0ce25dd8, double:6.40971359212861E67)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L34
            r1 = r9
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L34
            r1 = r13
            if (r1 != 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = 5660072512572978006(0x4e8c9df63add7356, double:2.4688442547037783E70)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L49
        L3e:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            r1 = r11
            boolean r0 = r0.F0(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            goto L53
        L49:
            r1 = 5660072512572978006(0x4e8c9df63add7356, double:2.4688442547037783E70)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 != 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = 5660072512572978006(0x4e8c9df63add7356, double:2.4688442547037783E70)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L68:
            r0 = 1
        L69:
            goto L6d
        L6c:
            r0 = 0
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.Fp():boolean");
    }

    private static final boolean FB() {
        return nc.FK((bb ^ 13331968105326L) ^ 131002554431850L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean Fb() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 40341590444195(0x24b0c22b08a3, double:1.99313939370743E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 105234175797927(0x5fb5bdaaaaa7, double:5.1992591030174E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 101322561985857(0x5c26ff509d41, double:5.0059997025832E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r14 = r2
            r0 = -7544831632605084528(0x974b5f9ab8718490, double:-1.8309751495605934E-196)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L4e
            r1 = r10
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L4e
            r1 = r15
            if (r1 != 0) goto L73
            if (r0 == 0) goto L8c
            goto L58
        L4e:
            r1 = -7510658992309360098(0x97c4c7708e4eaa1e, double:-3.558104737347841E-194)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L69
        L58:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            r1 = r12
            r2 = r13
            char r2 = (char) r2     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            r3 = r14
            short r3 = (short) r3     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            boolean r0 = r0.v(r1, r2, r3)     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            goto L73
        L69:
            r1 = -7510658992309360098(0x97c4c7708e4eaa1e, double:-3.558104737347841E-194)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L73:
            r1 = r15
            if (r1 != 0) goto L89
            if (r0 == 0) goto L8c
            goto L88
        L7e:
            r1 = -7510658992309360098(0x97c4c7708e4eaa1e, double:-3.558104737347841E-194)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L88:
            r0 = 1
        L89:
            goto L8d
        L8c:
            r0 = 0
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.Fb():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean m() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 6077167081214(0x586f36296fe, double:3.002519478865E-311)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 139103469516026(0x7e838ce334fa, double:6.87262455051935E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 137511130694428(0x7d10ce19031c, double:6.79395255969026E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r14 = r2
            r0 = 654850075330616013(0x9167eac89381acd, double:6.976319312085411E-265)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L4e
            r1 = r10
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L4e
            r1 = r15
            if (r1 != 0) goto L73
            if (r0 == 0) goto L8c
            goto L58
        L4e:
            r1 = 691837209305101379(0x999e646bf073443, double:2.0562478192517795E-262)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L69
        L58:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            r1 = r12
            r2 = r13
            char r2 = (char) r2     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            r3 = r14
            short r3 = (short) r3     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            boolean r0 = r0.v(r1, r2, r3)     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            goto L73
        L69:
            r1 = 691837209305101379(0x999e646bf073443, double:2.0562478192517795E-262)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L73:
            r1 = r15
            if (r1 != 0) goto L89
            if (r0 == 0) goto L8c
            goto L88
        L7e:
            r1 = 691837209305101379(0x999e646bf073443, double:2.0562478192517795E-262)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L88:
            r0 = 1
        L89:
            goto L8d
        L8c:
            r0 = 0
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.m():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean FH() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 37660266946690(0x224076d56082, double:1.860664411157E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 98153044165254(0x59450954c286, double:4.84940471567906E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 99876439258464(0x5ad64baef560, double:4.9345517466557E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r14 = r2
            r0 = -42122934494434127(0xff6a596a0c8fecb1, double:-5.7822155459161096E305)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L4e
            r1 = r10
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L4e
            r1 = r15
            if (r1 != 0) goto L73
            if (r0 == 0) goto L8c
            goto L58
        L4e:
            r1 = -7387067886550465(0xffe5c1803ab0c23f, double:-1.222198916568787E308)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L69
        L58:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            r1 = r12
            r2 = r13
            char r2 = (char) r2     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            r3 = r14
            short r3 = (short) r3     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            boolean r0 = r0.v(r1, r2, r3)     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            goto L73
        L69:
            r1 = -7387067886550465(0xffe5c1803ab0c23f, double:-1.222198916568787E308)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L73:
            r1 = r15
            if (r1 != 0) goto L89
            if (r0 == 0) goto L8c
            goto L88
        L7e:
            r1 = -7387067886550465(0xffe5c1803ab0c23f, double:-1.222198916568787E308)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L88:
            r0 = 1
        L89:
            goto L8d
        L8c:
            r0 = 0
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.FH():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean E() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 131878736402584(0x77f1693c9898, double:6.515675307347E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 14242493053596(0xcf416bd3a9c, double:7.0367265289144E-311)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 16936469990778(0xf6754470d7a, double:8.3677279842646E-311)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r14 = r2
            r0 = 535942490719917227(0x7700cdb136614ab, double:7.417283317769152E-273)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L4e
            r1 = r10
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L4e
            r1 = r15
            if (r1 != 0) goto L73
            if (r0 == 0) goto L8c
            goto L58
        L4e:
            r1 = 576342216127625765(0x7ff943125593a25, double:3.7359456995189537E-270)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L69
        L58:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            r1 = r12
            r2 = r13
            char r2 = (char) r2     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            r3 = r14
            short r3 = (short) r3     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            boolean r0 = r0.v(r1, r2, r3)     // Catch: kotlin.NoWhenBranchMatchedException -> L69
            goto L73
        L69:
            r1 = 576342216127625765(0x7ff943125593a25, double:3.7359456995189537E-270)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L73:
            r1 = r15
            if (r1 != 0) goto L89
            if (r0 == 0) goto L8c
            goto L88
        L7e:
            r1 = 576342216127625765(0x7ff943125593a25, double:3.7359456995189537E-270)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L88:
            r0 = 1
        L89:
            goto L8d
        L8c:
            r0 = 0
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.E():boolean");
    }

    private static final boolean FL() {
        return nc.FK((bb ^ 81714263105381L) ^ 54240775093601L);
    }

    private static final boolean C() {
        return nc.FK((bb ^ 121104156423700L) ^ 23234661110800L);
    }

    private static final boolean FP() {
        return nc.FK((bb ^ 21319374837849L) ^ 114790286637661L);
    }

    private static final boolean Fy() {
        return nc.FK((bb ^ 72558787860046L) ^ 64839364326474L);
    }

    private static final boolean S() {
        return nc.FK((bb ^ 105354457281581L) ^ 40496181401129L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.tp] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.yx] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
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
    private static final boolean F() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 52746928127458(0x2ff919e9fde2, double:2.60604451114343E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 93443026608102(0x54fc66685fe6, double:4.61669892904927E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 61792937036580(0x38334a0fcb24, double:3.05297673454054E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 7064552232371581393(0x620a54d363b371d1, double:1.895399619287131E164)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L34
            r1 = r13
            if (r1 != 0) goto L4e
            r1 = r9
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L34 kotlin.NoWhenBranchMatchedException -> L44
            if (r0 == 0) goto L67
            goto L3e
        L34:
            r1 = 7099304934239919967(0x6285cc39558c5f5f, double:4.01679144920726E166)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L44
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L44
        L3e:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L44
            goto L4e
        L44:
            r1 = 7099304934239919967(0x6285cc39558c5f5f, double:4.01679144920726E166)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L4e:
            r1 = r11
            su.catlean.yx r0 = r0.F_(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L5d
            su.catlean.yx r1 = su.catlean.yx.OFF     // Catch: kotlin.NoWhenBranchMatchedException -> L5d
            if (r0 == r1) goto L67
            r0 = 1
            goto L68
        L5d:
            r1 = 7099304934239919967(0x6285cc39558c5f5f, double:4.01679144920726E166)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L67:
            r0 = 0
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.F():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.tp] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.yx] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
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
    private static final boolean gL() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 97355097970928(0x588b400818f0, double:4.80998093549444E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 39093858319092(0x238e3f89baf4, double:1.93149323588484E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 87140925845046(0x4f4113ee2e36, double:4.3053337806837E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -8712174303773027133(0x871823a13a5294c3, double:-1.743036398905381E-274)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L34
            r1 = r13
            if (r1 != 0) goto L4e
            r1 = r9
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L34 kotlin.NoWhenBranchMatchedException -> L44
            if (r0 == 0) goto L67
            goto L3e
        L34:
            r1 = -8676260226100512179(0x8797bb4b0c6dba4d, double:-4.386834016506435E-272)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L44
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L44
        L3e:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L44
            goto L4e
        L44:
            r1 = -8676260226100512179(0x8797bb4b0c6dba4d, double:-4.386834016506435E-272)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L4e:
            r1 = r11
            su.catlean.yx r0 = r0.F_(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L5d
            su.catlean.yx r1 = su.catlean.yx.REPLACE     // Catch: kotlin.NoWhenBranchMatchedException -> L5d
            if (r0 != r1) goto L67
            r0 = 1
            goto L68
        L5d:
            r1 = -8676260226100512179(0x8797bb4b0c6dba4d, double:-4.386834016506435E-272)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L67:
            r0 = 0
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.gL():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.tp] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.yx] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
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
    private static final boolean FV() {
        /*
            long r0 = su.catlean.tp.bb
            r1 = 22464554598564(0x146e6fcc00a4, double:1.10989646762755E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 122505625707168(0x6f6b104da2a0, double:6.0525821084198E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 4003918919266(0x3a43c2a3662, double:1.978198786743E-311)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -6968072185238352745(0x9f4c6f4415968c97, double:-6.472020835995691E-158)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L34
            r1 = r13
            if (r1 != 0) goto L4e
            r1 = r9
            boolean r0 = r0.FK(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L34 kotlin.NoWhenBranchMatchedException -> L44
            if (r0 == 0) goto L67
            goto L3e
        L34:
            r1 = -6934426673925742055(0x9fc3f7ae23a9a219, double:-1.163472072653943E-155)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L44
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L44
        L3e:
            su.catlean.tp r0 = su.catlean.tp.nc     // Catch: kotlin.NoWhenBranchMatchedException -> L44
            goto L4e
        L44:
            r1 = -6934426673925742055(0x9fc3f7ae23a9a219, double:-1.163472072653943E-155)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L4e:
            r1 = r11
            su.catlean.yx r0 = r0.F_(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L5d
            su.catlean.yx r1 = su.catlean.yx.REPLACE     // Catch: kotlin.NoWhenBranchMatchedException -> L5d
            if (r0 != r1) goto L67
            r0 = 1
            goto L68
        L5d:
            r1 = -6934426673925742055(0x9fc3f7ae23a9a219, double:-1.163472072653943E-155)
            r2 = r7
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L67:
            r0 = 0
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.FV():boolean");
    }

    public static void L(int[] iArr) {
        Y = iArr;
    }

    public static int[] gO() {
        return Y;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 6492;
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
                throw new RuntimeException("su/catlean/tp", e2);
            }
        }
        return gb[i3];
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
            r1 = 3
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
            java.lang.String r1 = "su/catlean/tp"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 22798;
        if (kb[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) jb[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) lb.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/tp", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            kb[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return kb[i3].intValue();
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
            r1 = 3
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
            java.lang.String r1 = "su/catlean/tp"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static long d(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 13805;
        if (ob[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) mb[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) pb.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    pb.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/tp", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            ob[i3] = Long.valueOf(((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255));
        }
        return ob[i3].longValue();
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        long jD = d(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Long.TYPE, Long.valueOf(jD)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return jD;
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
            r1 = 3
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
            java.lang.String r1 = "su/catlean/tp"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tp.d(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
