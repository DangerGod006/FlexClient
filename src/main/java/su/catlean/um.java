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
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_10209;
import net.minecraft.class_1297;
import net.minecraft.class_1743;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.client.PostTickEvent;
import su.catlean.api.event.events.network.PostTasksProcessEvent;
import su.catlean.api.event.events.player.UpdateCrosshairTarget;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/um.class */
public final class um extends _g {

    @NotNull
    public static final um E = null;
    static final KProperty[] hC = null;

    @NotNull
    private static final ct C = null;

    @NotNull
    private static final cq u = null;

    @NotNull
    private static final c8 x = null;

    @NotNull
    private static final cw g = null;

    @NotNull
    private static final cq w = null;

    @NotNull
    private static final cw D = null;

    @NotNull
    private static final cq a = null;

    @NotNull
    private static final cq W = null;

    @NotNull
    private static final c8 P = null;

    @NotNull
    private static final c8 I = null;

    @NotNull
    private static final cq V = null;

    @NotNull
    private static final cq y = null;

    @NotNull
    private static final cq N = null;

    @NotNull
    private static final c8 e = null;

    @NotNull
    private static final c8 F = null;

    @NotNull
    private static final cq hg = null;

    @NotNull
    private static final cq z = null;

    @NotNull
    private static final cw L = null;

    @NotNull
    private static final cq f = null;

    @NotNull
    private static final cq m = null;

    @NotNull
    private static final cq G = null;

    @NotNull
    private static final cq h = null;

    @NotNull
    private static final cw hm = null;

    @NotNull
    private static final cw hP = null;

    @NotNull
    private static final cw A = null;

    @NotNull
    private static final cw i = null;

    @NotNull
    private static final cp hT = null;

    @NotNull
    private static final cq t = null;

    @NotNull
    private static final cq X = null;

    @NotNull
    private static final cq Y = null;

    @NotNull
    private static final cq B = null;

    @NotNull
    private static final cq T = null;

    @NotNull
    private static final cq U = null;

    @NotNull
    private static final cq d = null;

    @NotNull
    private static final cq l = null;

    @NotNull
    private static final cq o = null;

    @NotNull
    private static final cq j = null;

    @NotNull
    private static final cq c = null;

    @NotNull
    private static final cq n = null;

    @NotNull
    private static final cq O = null;

    @Nullable
    private static class_1297 K;

    @NotNull
    private static List k;

    @NotNull
    private static _w S;
    private static boolean b;
    private static String J;
    private static final long ab = 0;
    private static final String[] fb = null;
    private static final String[] gb = null;
    private static final Map hb = null;
    private static final long[] lb = null;
    private static final Integer[] mb = null;
    private static final Map nb = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private um(long j2) {
        long j3 = ab ^ j2;
        super((String) b(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5027, 5544819476860668905L ^ j3) /* invoke-custom */, jt.Q(), null, 4, null, j3 ^ 3309245571128L);
    }

    public final float P(long j2) {
        return ((Number) C.E(this, (ab ^ j2) ^ 103954655074599L, hC[0])).floatValue();
    }

    public final boolean G(int i2, short s, int i3) {
        return ((Boolean) u.E(this, ((((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ ab) ^ 96059084688686L, hC[1])).booleanValue();
    }

    public final int e(long j2) {
        return ((Number) x.E(this, (ab ^ j2) ^ 116853956794187L, hC[2])).intValue();
    }

    @NotNull
    public final g9 h(long j2) {
        return (g9) g.E(this, (ab ^ j2) ^ 22294475016993L, hC[3]);
    }

    public final boolean BL(long j2) {
        return ((Boolean) w.E(this, (ab ^ j2) ^ 71861223012651L, hC[4])).booleanValue();
    }

    @NotNull
    public final a0 D(long j2, byte b2) {
        return (a0) D.E(this, (((j2 << 8) | ((((long) b2) << 56) >>> 56)) ^ ab) ^ 25073878964236L, hC[5]);
    }

    public final boolean BQ(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) a.E(this, j3 ^ 88092354402725L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30761, 5657165976266073442L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean V(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) W.E(this, j3 ^ 43237866808081L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(45, 3564873237685823464L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final int Bj(long j2) {
        long j3 = ab ^ j2;
        return ((Number) P.E(this, j3 ^ 112078707869188L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23911, 788692335853789095L ^ j3) /* invoke-custom */])).intValue();
    }

    public final int L(char c2, int i2, int i3) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ ab;
        return ((Number) I.E(this, j2 ^ 72444191437328L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15690, 1226259204996565987L ^ j2) /* invoke-custom */])).intValue();
    }

    public final boolean i(char c2, int i2, int i3) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ ab;
        return ((Boolean) V.E(this, j2 ^ 42489641151957L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17154, 5875766136323090951L ^ j2) /* invoke-custom */])).booleanValue();
    }

    public final boolean Z(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) y.E(this, j3 ^ 129948188619973L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31073, 5243389772114266467L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean q(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) N.E(this, j3 ^ 54464417702578L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31865, 422836789811419705L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final int A(long j2) {
        long j3 = ab ^ j2;
        return ((Number) e.E(this, j3 ^ 30736002211618L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12632, 5341417220118719153L ^ j3) /* invoke-custom */])).intValue();
    }

    public final int v(long j2) {
        long j3 = ab ^ j2;
        return ((Number) F.E(this, j3 ^ 33837058174854L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18388, 7131870079016250503L ^ j3) /* invoke-custom */])).intValue();
    }

    public final boolean BG(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) hg.E(this, j3 ^ 49036214619849L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18095, 7665062182866210003L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean M(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) z.E(this, j3 ^ 22439145232320L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12210, 1223608922467155142L ^ j3) /* invoke-custom */])).booleanValue();
    }

    @NotNull
    public final mt B9(int i2, byte b2, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i3) << 40) >>> 40)) ^ ab;
        return (mt) L.E(this, j2 ^ 55986645426069L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19344, 5759262077533180133L ^ j2) /* invoke-custom */]);
    }

    public final boolean BF(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) f.E(this, j3 ^ 37579128181979L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2956, 1982931701266078610L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean Br(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) m.E(this, j3 ^ 108450852009525L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30296, 2050413476003661015L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean W(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) G.E(this, j3 ^ 140113682738629L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20828, 9153201573580683386L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean T(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) h.E(this, j3 ^ 39095437075463L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13339, 6318137232738145453L ^ j3) /* invoke-custom */])).booleanValue();
    }

    @NotNull
    public final nl BH(long j2) {
        long j3 = ab ^ j2;
        return (nl) hm.E(this, j3 ^ 38770549505261L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25900, 3094186128405077366L ^ j3) /* invoke-custom */]);
    }

    @NotNull
    public final lb l(long j2) {
        long j3 = ab ^ j2;
        return (lb) hP.E(this, j3 ^ 132746991690066L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1997, 2463894264710111829L ^ j3) /* invoke-custom */]);
    }

    @NotNull
    public final s9 R(long j2) {
        long j3 = ab ^ j2;
        return (s9) A.E(this, j3 ^ 62544852847515L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29494, 9096891119321496642L ^ j3) /* invoke-custom */]);
    }

    @NotNull
    public final l8 H(long j2) {
        long j3 = ab ^ j2;
        return (l8) i.E(this, j3 ^ 84636870062164L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28125, 7400415715285899604L ^ j3) /* invoke-custom */]);
    }

    @NotNull
    public final h E(long j2) {
        long j3 = ab ^ j2;
        return (h) hT.E(this, j3 ^ 35247092775509L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20724, 6831404756621766238L ^ j3) /* invoke-custom */]);
    }

    public final boolean s(byte b2, long j2) {
        long j3 = ((((long) b2) << 56) | ((j2 << 8) >>> 8)) ^ ab;
        return ((Boolean) t.E(this, j3 ^ 28153929903929L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25511, 8259233222187944055L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean F(char c2, int i2, char c3) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c3) << 48) >>> 48)) ^ ab;
        return ((Boolean) X.E(this, j2 ^ 33533615214043L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14767, 8493074043191390337L ^ j2) /* invoke-custom */])).booleanValue();
    }

    public final boolean B3(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) Y.E(this, j3 ^ 12258618227476L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18986, 7178148172716357097L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean x(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) B.E(this, j3 ^ 55870629252950L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(931, 1141648927225858109L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean j(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) T.E(this, j3 ^ 65593324929106L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15399, 76404107338610894L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean t(int i2, int i3, short s) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ ab;
        return ((Boolean) U.E(this, j2 ^ 88428314627924L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22823, 1038502965618447043L ^ j2) /* invoke-custom */])).booleanValue();
    }

    public final boolean Y(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) d.E(this, j3 ^ 45279397579076L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10407, 2214929924669203727L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean a(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) l.E(this, j3 ^ 128497746200106L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5697, 2729174172986774665L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean B0(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) o.E(this, j3 ^ 72846459937053L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19413, 3109192010040520227L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean Bn(short s, long j2) {
        long j3 = ((((long) s) << 48) | ((j2 << 16) >>> 16)) ^ ab;
        return ((Boolean) j.E(this, j3 ^ 85272989850181L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2628, 26862146459571394L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean K(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) c.E(this, j3 ^ 11893757311314L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12627, 2540245632490310874L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean Bo(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) n.E(this, j3 ^ 120170825260641L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24031, 1856946654246569734L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean r(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) O.E(this, j3 ^ 62698132882838L, hC[(int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1498, 1008175845099963635L ^ j3) /* invoke-custom */])).booleanValue();
    }

    @Nullable
    public final class_1297 BR() {
        return K;
    }

    public final void P(@Nullable class_1297 class_1297Var) {
        K = class_1297Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e1 A[PHI: r0
  0x01e1: PHI (r0v33 ??) = (r0v73 ??), (r0v74 ??) binds: [B:59:0x01a7, B:64:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [su.catlean.bv] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [su.catlean.d2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
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
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void C(su.catlean.api.event.events.player.PlayerUpdateEvent r15) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.um.C(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void O(su.catlean.api.event.events.player.SprintEvent r7) {
        /*
            r6 = this;
            long r0 = su.catlean.um.ab
            r1 = 68676440478957(0x3e75fad6d4ed, double:3.3930669919314E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = -7812776425821752651(0x9393713c0d5932b5, double:-2.2559591963297985E-214)
            r1 = r8
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r10 = r0
            su.catlean.ja r0 = su.catlean.ja.E     // Catch: java.lang.NumberFormatException -> L24
            boolean r0 = r0.w()     // Catch: java.lang.NumberFormatException -> L24
            r1 = r10
            if (r1 != 0) goto L41
            if (r0 != 0) goto L44
            goto L2e
        L24:
            r1 = -7844857209986400285(0x932177ee6d193fe3, double:-1.5835372691495422E-216)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L37
            throw r0     // Catch: java.lang.NumberFormatException -> L37
        L2e:
            su.catlean._6 r0 = su.catlean._6.d     // Catch: java.lang.NumberFormatException -> L37
            boolean r0 = r0.V()     // Catch: java.lang.NumberFormatException -> L37
            goto L41
        L37:
            r1 = -7844857209986400285(0x932177ee6d193fe3, double:-1.5835372691495422E-216)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L41:
            if (r0 == 0) goto L56
        L44:
            r0 = r7
            r1 = 0
            r0.setSprinting(r1)     // Catch: java.lang.NumberFormatException -> L4c
            goto L56
        L4c:
            r1 = -7844857209986400285(0x932177ee6d193fe3, double:-1.5835372691495422E-216)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.um.O(su.catlean.api.event.events.player.SprintEvent):void");
    }

    @Flow
    private final void v(PostTickEvent postTickEvent) {
        tc.s.S();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
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
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(su.catlean.api.event.events.network.ReceivePacket r16) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.um.c(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.bv] */
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
    private final void S(PostTasksProcessEvent postTasksProcessEvent) {
        long j2 = ab ^ 38461258065803L;
        Object obj = j2;
        long j3 = obj ^ 91721571304902L;
        int i2 = (int) (obj >>> 32);
        int i3 = (int) ((j3 << 32) >>> 48);
        int i4 = (int) ((j3 << 48) >>> 48);
        try {
            if (q(obj ^ 92027043645757L)) {
                obj = bv.n;
                obj.Z(i2, (short) i3, i4);
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6897426238289212283L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00b0: INVOKE (r-1 I:su.catlean.a7), (r0 I:boolean), (r1 I:long), (r2 I:su.catlean.a0) VIRTUAL call: su.catlean.a7.r(boolean, long, su.catlean.a0):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void z(su.catlean.api.event.events.render.Render3DEvent r10) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.um.z(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0061: INVOKE (r-1 I:su.catlean.a7), (r0 I:boolean), (r1 I:long), (r2 I:su.catlean.a0) VIRTUAL call: su.catlean.a7.r(boolean, long, su.catlean.a0):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void g(su.catlean.api.event.events.render.Render2DEvent r9) {
        /*
            r8 = this;
            long r0 = su.catlean.um.ab
            r1 = 137334426590883(0x7ce7a9b65ea3, double:6.7852222169862E-310)
            long r0 = r0 ^ r1
            r10 = r0
            r0 = r10
            r1 = r0; r1 = r0; 
            r2 = 5245445806396(0x4c54cef193c, double:2.5915945700623E-311)
            long r1 = r1 ^ r2
            r12 = r1
            r1 = r0; r2 = r0; 
            r2 = 82163141261888(0x4aba18d93a40, double:4.05939854519003E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r16 = r2
            r1 = r0; r3 = r0; 
            r2 = 130456095023160(0x76a62d33e038, double:6.44538748415446E-310)
            long r1 = r1 ^ r2
            r17 = r1
            r1 = r0; r2 = r0; 
            r2 = 118994454334210(0x6c398e2e4b02, double:5.8791071932158E-310)
            long r1 = r1 ^ r2
            r19 = r1
            r1 = r0; r2 = r0; 
            r2 = 47188284902059(0x2aeae0f58aab, double:2.33141104562765E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 8
            long r2 = r2 >>> r3
            r21 = r2
            r2 = r1; r3 = r0; 
            r3 = 56
            long r2 = r2 << r3
            r3 = 56
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r23 = r2
            su.catlean.a7 r0 = su.catlean.a7.h     // Catch: java.lang.NumberFormatException -> L70
            r1 = r8
            r2 = r19
            boolean r1 = r1.BQ(r2)     // Catch: java.lang.NumberFormatException -> L70
            r2 = r8
            r3 = r21
            r4 = r23
            byte r4 = (byte) r4     // Catch: java.lang.NumberFormatException -> L70
            su.catlean.a0 r2 = r2.D(r3, r4)     // Catch: java.lang.NumberFormatException -> L70
            r3 = r17
            r4 = r3; r3 = r2; r2 = r4;      // Catch: java.lang.NumberFormatException -> L70
            r-1.r(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L70
            if (r-1 == 0) goto L7a
            net.minecraft.class_1297 r-1 = su.catlean.um.K     // Catch: java.lang.NumberFormatException -> L70 java.lang.NumberFormatException -> L7b
            if (r-1 != 0) goto L85
            goto L7a
        L70:
            r1 = 1832742381103461805(0x196f357c3e79b5ad, double:3.5863405847208057E-186)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L7b
            throw r0     // Catch: java.lang.NumberFormatException -> L7b
        L7a:
            return
        L7b:
            r1 = 1832742381103461805(0x196f357c3e79b5ad, double:3.5863405847208057E-186)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L85:
            r-1 = r8
            r0 = r12
            r-1.R(r0)     // Catch: java.lang.NumberFormatException -> La4
            int[] r0 = su.catlean.yw.i     // Catch: java.lang.NumberFormatException -> La4
            r1 = r-1; r-1 = r0; r0 = r1;      // Catch: java.lang.NumberFormatException -> La4
            int r0 = r0.ordinal()     // Catch: java.lang.NumberFormatException -> La4
            r-1 = r-1[r0]     // Catch: java.lang.NumberFormatException -> La4
            r0 = 3
            if (r-1 != r0) goto Lae
            su.catlean.zw r-1 = su.catlean.zw.l     // Catch: java.lang.NumberFormatException -> La4
            r0 = r14
            r1 = r16
            r-1.C(r0, r1)     // Catch: java.lang.NumberFormatException -> La4
            goto Lae
        La4:
            r1 = 1832742381103461805(0x196f357c3e79b5ad, double:3.5863405847208057E-186)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.um.g(su.catlean.api.event.events.render.Render2DEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.minecraft.class_1297] */
    @Flow
    private final void b(UpdateCrosshairTarget updateCrosshairTarget) {
        class_1297 class_1297VarMethod_17782;
        long j2 = ab ^ 68239985889800L;
        long j3 = j2 ^ 27887890844092L;
        long j4 = j2 ^ 31277234907193L;
        long j5 = j2 ^ 35576131766059L;
        long j6 = j2 ^ 79957622094925L;
        long j7 = j2 ^ 63740240578458L;
        Object objBr = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1546548151992824912L, j2) /* invoke-custom */;
        try {
            try {
                if (K != null) {
                    objBr = Br(j4);
                    if (objBr == 0) {
                        return;
                    }
                    try {
                        try {
                            class_10209.method_64146().method_15407();
                            updateCrosshairTarget.cancel();
                            class_310 class_310VarF = zf.F(j3);
                            if (objBr == 0) {
                                objBr = class_310VarF.method_1560();
                                if (objBr == 0) {
                                    return;
                                } else {
                                    class_310VarF = zf.F(j3);
                                }
                            }
                            if (objBr == 0) {
                                try {
                                    try {
                                        class_310VarF = class_310VarF.field_1687;
                                        if (class_310VarF == null) {
                                            return;
                                        } else {
                                            class_310VarF = zf.F(j3);
                                        }
                                    } catch (NumberFormatException unused) {
                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_310VarF, 1568510012535453958L, j2) /* invoke-custom */;
                                    }
                                } catch (NumberFormatException unused2) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_310VarF, 1568510012535453958L, j2) /* invoke-custom */;
                                }
                            }
                            if (class_310VarF.field_1724 != null) {
                                class_3966 class_3966VarL = dm.h.l(zf.v(j7).method_55754(), P(j5), S.q(), j6, S.N());
                                try {
                                    try {
                                        zf.F(j3).field_1765 = class_3966VarL;
                                        class_3966VarL = zf.F(j3);
                                        class_3966 class_3966Var = class_3966VarL;
                                        if (objBr != 0) {
                                            class_1297VarMethod_17782 = class_3966Var.method_17782();
                                        } else if (class_3966Var instanceof class_3966) {
                                            class_3966Var = class_3966VarL;
                                            class_1297VarMethod_17782 = class_3966Var.method_17782();
                                        } else {
                                            class_1297VarMethod_17782 = null;
                                        }
                                        ((class_310) class_3966VarL).field_1692 = class_1297VarMethod_17782;
                                    } catch (NumberFormatException unused3) {
                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_3966VarL, 1568510012535453958L, j2) /* invoke-custom */;
                                    }
                                } catch (NumberFormatException unused4) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_3966VarL, 1568510012535453958L, j2) /* invoke-custom */;
                                }
                            }
                        } catch (NumberFormatException unused5) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objBr, 1568510012535453958L, j2) /* invoke-custom */;
                        }
                    } catch (NumberFormatException unused6) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objBr, 1568510012535453958L, j2) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused7) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objBr, 1568510012535453958L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused8) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objBr, 1568510012535453958L, j2) /* invoke-custom */;
        }
    }

    @Override // su.catlean._g
    public void O(long j2) {
        g(j2 ^ 87812952281004L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.um] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    @Override // su.catlean._g
    public void b(long j2) {
        long j3 = j2 ^ 64129331416845L;
        long j4 = j2 ^ 38140406740344L;
        long j5 = j2 ^ 114833186027750L;
        long j6 = j2 ^ 29647348875563L;
        Object objW = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1425198344095314657L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    objW = this;
                    um umVar = objW;
                    if (objW == 0) {
                        try {
                            objW = objW.W(j4);
                            if (objW != 0) {
                                class_746 class_746VarV = zf.F(j3).field_1724;
                                if (objW != 0) {
                                    class_746VarV.method_64578(S.q(), false, S.N(), false);
                                } else if (class_746VarV != null) {
                                    class_746VarV = zf.v(j6);
                                    class_746VarV.method_64578(S.q(), false, S.N(), false);
                                }
                            }
                            umVar = this;
                        } catch (NumberFormatException unused) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objW, 1402119792055730103L, j2) /* invoke-custom */;
                        }
                    }
                    umVar.g(j5);
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objW, 1402119792055730103L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objW, 1402119792055730103L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objW, 1402119792055730103L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x006e: INVOKE (r-1 I:su.catlean.a7), (r0 I:boolean), (r1 I:long), (r2 I:su.catlean.a0) VIRTUAL call: su.catlean.a7.r(boolean, long, su.catlean.a0):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final boolean C(long r9) {
        /*
            r8 = this;
            long r0 = su.catlean.um.ab
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 71536217125537(0x410fd2cf72a1, double:3.5343587315168E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 100675943061915(0x5b9071d2d99b, double:4.97405248295616E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r1 = r0; r2 = r0; 
            r2 = 32174120704050(0x1d431f091832, double:1.58961277250207E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 8
            long r2 = r2 >>> r3
            r15 = r2
            r2 = r1; r3 = r0; 
            r3 = 56
            long r2 = r2 << r3
            r3 = 56
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r17 = r2
            r1 = r0; r3 = r0; 
            r2 = 52328640105718(0x2f97b6014cf6, double:2.58537833698257E-310)
            long r1 = r1 ^ r2
            r18 = r1
            r0 = -8411593773195908510(0x8b440407a1c52a62, double:-2.1328747611440744E-254)
            r1 = r9
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r20 = r0
            r0 = r8
            r1 = r18
            boolean r0 = r0.f(r1)     // Catch: java.lang.NumberFormatException -> L4f
            if (r0 == 0) goto L97
            net.minecraft.class_1297 r0 = su.catlean.um.K     // Catch: java.lang.NumberFormatException -> L4f java.lang.NumberFormatException -> L79
            if (r0 == 0) goto L97
            goto L59
        L4f:
            r1 = -8361492541068728524(0x8bf602d5c1852734, double:-4.80357816316635E-251)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L79
            throw r0     // Catch: java.lang.NumberFormatException -> L79
        L59:
            su.catlean.a7 r0 = su.catlean.a7.h     // Catch: java.lang.NumberFormatException -> L79 java.lang.NumberFormatException -> L89
            r1 = r8
            r2 = r13
            boolean r1 = r1.BQ(r2)     // Catch: java.lang.NumberFormatException -> L79 java.lang.NumberFormatException -> L89
            r2 = r8
            r3 = r15
            r4 = r17
            byte r4 = (byte) r4     // Catch: java.lang.NumberFormatException -> L79 java.lang.NumberFormatException -> L89
            su.catlean.a0 r2 = r2.D(r3, r4)     // Catch: java.lang.NumberFormatException -> L79 java.lang.NumberFormatException -> L89
            r3 = r11
            r4 = r3; r3 = r2; r2 = r4;      // Catch: java.lang.NumberFormatException -> L79 java.lang.NumberFormatException -> L89
            r-1.r(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L79 java.lang.NumberFormatException -> L89
            r0 = r20
            if (r0 != 0) goto L94
            goto L83
        L79:
            r1 = -8361492541068728524(0x8bf602d5c1852734, double:-4.80357816316635E-251)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L89
            throw r0     // Catch: java.lang.NumberFormatException -> L89
        L83:
            if (r-1 == 0) goto L97
            goto L93
        L89:
            r1 = -8361492541068728524(0x8bf602d5c1852734, double:-4.80357816316635E-251)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L93:
            r-1 = 1
        L94:
            goto L98
        L97:
            r0 = 0
        L98:
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.um.C(long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v13, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    public final void g(long j2) {
        long j3 = ab ^ j2;
        long j4 = j3 ^ 115169978183958L;
        long j5 = j3 ^ 83869410831763L;
        long j6 = j3 ^ 79278923677488L;
        K = null;
        String[] strArr = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5918855004598235910L, j3) /* invoke-custom */;
        bv.n.i();
        ?? r0 = strArr;
        if (r0 == 0) {
            try {
                try {
                    r0 = zf.F(j4).field_1724;
                    if (r0 == 0) {
                        return;
                    }
                    S = new _w(zf.v(j6).method_36454(), j5, zf.v(j6).method_36455(), false, null, (int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31865, 422832552018335952L ^ j3) /* invoke-custom */, null);
                    ja.E.f(false);
                } catch (NumberFormatException unused) {
                    r0 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5949811005547544148L, j3) /* invoke-custom */;
                    throw r0;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5949811005547544148L, j3) /* invoke-custom */;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:46:0x01ab
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final boolean B(int r9, char r10, short r11) {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.um.B(int, char, short):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0245 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x032d A[EXC_TOP_SPLITTER, PHI: r0
  0x032d: PHI (r0v12 ??) = (r0v11 ??), (r0v67 ??) binds: [B:13:0x00c9, B:101:0x032a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015a A[Catch: NumberFormatException -> 0x0163, TryCatch #7 {NumberFormatException -> 0x0163, blocks: (B:32:0x014f, B:34:0x015a), top: B:117:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0255 A[Catch: NumberFormatException -> 0x0264, NumberFormatException -> 0x0276, TryCatch #8 {NumberFormatException -> 0x0264, blocks: (B:69:0x0245, B:71:0x024f, B:72:0x0255), top: B:119:0x0245, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02da  */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v121 */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v125 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v28, types: [su.catlean._w] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [su.catlean.g9] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [int] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v88, types: [su.catlean.g9] */
    /* JADX WARN: Type inference failed for: r0v92, types: [int] */
    /* JADX WARN: Type inference failed for: r0v94 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void Y(net.minecraft.class_1297 r15, long r16, su.catlean._w r18) {
        /*
            Method dump skipped, instruction units count: 854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.um.Y(net.minecraft.class_1297, long, su.catlean._w):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    public final boolean BN(long j2) {
        long j3 = ab ^ j2;
        long j4 = j3 ^ 63411599649991L;
        long j5 = j3 ^ 65675015098976L;
        Object objHasNext = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4572152965610708566L, j3) /* invoke-custom */;
        try {
            objHasNext = zf.z(j4).method_20812(zf.v(j5), zf.v(j5).method_5829().method_1009(-0.25d, 1.0d, -0.25d)).iterator().hasNext();
            if (objHasNext != 0) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[2], -4600232614680212971L, j3) /* invoke-custom */;
            }
            return objHasNext;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objHasNext, -4594105066905506564L, j3) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x01de: INVOKE (r-1 I:su.catlean.a7), (r0 I:boolean), (r1 I:long), (r2 I:su.catlean.a0) VIRTUAL call: su.catlean.a7.r(boolean, long, su.catlean.a0):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final boolean Bx(long r9) {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.um.Bx(long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089 A[PHI: r0
  0x0089: PHI (r0v15 ??) = (r0v14 ??), (r0v25 ??), (r0v28 ??), (r0v28 ??) binds: [B:4:0x0031, B:20:0x0074, B:10:0x004f, B:12:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c A[EXC_TOP_SPLITTER, PHI: r0
  0x008c: PHI (r0v20 ??) = (r0v15 ??), (r0v28 ??) binds: [B:23:0x0089, B:16:0x0064] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, su.catlean.g9] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [su.catlean.g9] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final su.catlean.g9 Q(long r8) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.um.Q(long):su.catlean.g9");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.g9] */
    private static final boolean Bw() {
        long j2 = ab ^ 70497997350402L;
        Object objH = j2;
        try {
            objH = E.h(objH ^ 22644958208295L);
            return objH == g9.SNAP;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, -6787477119152091892L, j2) /* invoke-custom */;
        }
    }

    private static final boolean w() {
        return E.V((ab ^ 125932858822599L) ^ 23204097958098L);
    }

    private static final boolean z() {
        return E.V((ab ^ 110988438196581L) ^ 3720066252400L);
    }

    private static final boolean BV() {
        return E.q((ab ^ 36780305088770L) ^ 88217951268788L);
    }

    private static final boolean p() {
        long j2 = ab ^ 102652310867389L;
        return E.t((int) (j2 >>> 32), (int) (((j2 ^ 85697317539565L) << 32) >>> 48), (short) ((r1 << 48) >>> 48));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[PHI: r0
  0x009e: PHI (r0v9 ??) = (r0v6 ??), (r0v15 ??) binds: [B:11:0x005e, B:21:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean.um] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.um] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
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
    private static final kotlin.Unit W(boolean r8, boolean r9) {
        /*
            long r0 = su.catlean.um.ab
            r1 = 65758586241806(0x3bce9d2c830e, double:3.2489058381165E-310)
            long r0 = r0 ^ r1
            r10 = r0
            r0 = r10
            r1 = r0; r1 = r0; 
            r2 = 137395472379608(0x7cf5e0532ed8, double:6.7882382796894E-310)
            long r1 = r1 ^ r2
            r12 = r1
            r1 = r0; r2 = r0; 
            r2 = 90220048827915(0x520dfdf6460b, double:4.45746266919926E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r14 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r15 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r16 = r2
            r0 = -4291802319925582506(0xc47074876aa36556, double:-4.856715239353932E21)
            r1 = r10
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            su.catlean.um r1 = su.catlean.um.E
            r1 = 1
            su.catlean.um.b = r1
            r17 = r0
            r0 = r8
            r1 = r17
            if (r1 != 0) goto L5c
            if (r0 == 0) goto Lc4
            goto L5b
        L51:
            r1 = -4268723787213346816(0xc4c272550ae36800, double:-1.7422330695267062E23)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L5b:
            r0 = r9
        L5c:
            r1 = r17
            if (r1 != 0) goto L9e
            if (r0 == 0) goto Lc4
            goto L71
        L67:
            r1 = -4268723787213346816(0xc4c272550ae36800, double:-1.7422330695267062E23)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L7c
            throw r0     // Catch: java.lang.NumberFormatException -> L7c
        L71:
            su.catlean.um r0 = su.catlean.um.E     // Catch: java.lang.NumberFormatException -> L7c java.lang.NumberFormatException -> L94
            r1 = r17
            if (r1 != 0) goto Lb5
            goto L86
        L7c:
            r1 = -4268723787213346816(0xc4c272550ae36800, double:-1.7422330695267062E23)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L94
            throw r0     // Catch: java.lang.NumberFormatException -> L94
        L86:
            r1 = r14
            r2 = r15
            char r2 = (char) r2     // Catch: java.lang.NumberFormatException -> L94
            r3 = r16
            short r3 = (short) r3     // Catch: java.lang.NumberFormatException -> L94
            boolean r0 = r0.B(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L94
            goto L9e
        L94:
            r1 = -4268723787213346816(0xc4c272550ae36800, double:-1.7422330695267062E23)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L9e:
            if (r0 != 0) goto Lc4
            su.catlean.um r0 = su.catlean.um.E     // Catch: java.lang.NumberFormatException -> Lab
            su.catlean.um r1 = su.catlean.um.E     // Catch: java.lang.NumberFormatException -> Lab
            goto Lb5
        Lab:
            r1 = -4268723787213346816(0xc4c272550ae36800, double:-1.7422330695267062E23)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lb5:
            net.minecraft.class_1297 r1 = su.catlean.um.K
            r2 = r1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2 = r12
            su.catlean._w r3 = su.catlean.um.S
            r0.Y(r1, r2, r3)
        Lc4:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.um.W(boolean, boolean):kotlin.Unit");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x02df: SPUT (r-1 I:su.catlean._w) su.catlean.um.S su.catlean._w
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final kotlin.Unit I() {
        /*
            Method dump skipped, instruction units count: 1003
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.um.I():kotlin.Unit");
    }

    private static final boolean w(class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, (String) b(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13196, 1104424588477765115L ^ (ab ^ 62436030089216L)) /* invoke-custom */);
        return class_1799Var.method_7909() instanceof class_1743;
    }

    public static void C(String str) {
        J = str;
    }

    public static String n() {
        return J;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 26771;
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
                throw new RuntimeException("su/catlean/um", e2);
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
            java.lang.String r1 = "su/catlean/um"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.um.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 2295;
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
                    throw new RuntimeException("su/catlean/um", e2);
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
            java.lang.String r1 = "su/catlean/um"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.um.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
