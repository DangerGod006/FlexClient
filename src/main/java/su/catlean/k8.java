package su.catlean;

import java.awt.Color;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_276;
import net.minecraft.class_6364;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.CrystalRenderEvent;
import su.catlean.api.event.events.render.CrystalYOffsetEvent;
import su.catlean.api.event.events.render.FrameBufferEvent;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.api.event.events.render.SetCrystalScaleEvent;
import su.catlean.api.event.events.world.CrystalCreateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/k8.class */
public final class k8 extends _g {

    @NotNull
    public static final k8 Y = null;
    static final KProperty[] L = null;

    @NotNull
    private static final cp d = null;

    @NotNull
    private static final cq E = null;

    @NotNull
    private static final cq t = null;

    @NotNull
    private static final cq f = null;

    @NotNull
    private static final cq B = null;

    @NotNull
    private static final cw y = null;

    @NotNull
    private static final cw j = null;

    @NotNull
    private static final cs n = null;

    @NotNull
    private static final cs i = null;

    @NotNull
    private static final cs u = null;

    @NotNull
    private static final cq P = null;

    @NotNull
    private static final cq o = null;

    @NotNull
    private static final ct a = null;

    @NotNull
    private static final ct T = null;

    @NotNull
    private static final ct m = null;

    @NotNull
    private static final ct g = null;

    @NotNull
    private static final ct D = null;

    @NotNull
    private static final cs k = null;

    @NotNull
    private static final cw z = null;

    @NotNull
    private static final c8 I = null;

    @NotNull
    private static final ct A = null;

    @NotNull
    private static final ct l = null;

    @NotNull
    private static final ct O = null;

    @NotNull
    private static final ct S = null;

    @NotNull
    private static final ct X = null;

    @NotNull
    private static final c8 F = null;

    @NotNull
    private static final c8 W = null;

    @NotNull
    private static final cq C = null;

    @NotNull
    private static final ct V = null;

    @NotNull
    private static final cq e = null;

    @NotNull
    private static final ct G = null;

    @NotNull
    private static final ct U = null;

    @NotNull
    private static final iv K = null;
    private static final long b = 0;
    private static final String[] c = null;
    private static final String[] h = null;
    private static final Map w = null;
    private static final long[] x = null;
    private static final Integer[] J = null;
    private static final Map N = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private k8(long j2, char c2) {
        long j3 = ((j2 << 16) | ((((long) c2) << 48) >>> 48)) ^ b;
        super((String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17385, 361309752133530416L ^ j3) /* invoke-custom */, jt.F(), null, 4, null, j3 ^ 69964838705899L);
    }

    private final h g(long j2) {
        return (h) d.E(this, (b ^ j2) ^ 7769819613127L, L[0]);
    }

    private final boolean A(long j2) {
        return ((Boolean) E.E(this, (b ^ j2) ^ 37903300679342L, L[1])).booleanValue();
    }

    private final void E(boolean z2, long j2) {
        E.b(this, (b ^ j2) ^ 7393336222865L, L[1], Boolean.valueOf(z2));
    }

    private final boolean xO(long j2) {
        return ((Boolean) t.E(this, (b ^ j2) ^ 20415688725510L, L[2])).booleanValue();
    }

    private final void m(int i2, boolean z2, short s, short s2) {
        t.b(this, ((((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ b) ^ 90682694884830L, L[2], Boolean.valueOf(z2));
    }

    private final boolean xw(long j2) {
        return ((Boolean) f.E(this, (b ^ j2) ^ 56229674531113L, L[3])).booleanValue();
    }

    private final void w(long j2, boolean z2) {
        f.b(this, (b ^ j2) ^ 78647287807403L, L[3], Boolean.valueOf(z2));
    }

    private final boolean xx(long j2) {
        return ((Boolean) B.E(this, (b ^ j2) ^ 101209069005638L, L[4])).booleanValue();
    }

    private final void O(long j2, boolean z2) {
        B.b(this, (b ^ j2) ^ 90913118286351L, L[4], Boolean.valueOf(z2));
    }

    private final s8 W(long j2) {
        return (s8) y.E(this, (b ^ j2) ^ 95562771956085L, L[5]);
    }

    private final rw xS(long j2) {
        long j3 = b ^ j2;
        return (rw) j.E(this, j3 ^ 88963434355578L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23485, 5016977033048115982L ^ j3) /* invoke-custom */]);
    }

    private final Color T(long j2) {
        long j3 = b ^ j2;
        return (Color) n.E(this, j3 ^ 43432763238792L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26619, 26954138317112758L ^ j3) /* invoke-custom */]);
    }

    private final Color xP(long j2) {
        long j3 = b ^ j2;
        return (Color) i.E(this, j3 ^ 1387366985878L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32574, 2271144507828847698L ^ j3) /* invoke-custom */]);
    }

    private final Color L(long j2) {
        long j3 = b ^ j2;
        return (Color) u.E(this, j3 ^ 92376426727134L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4218, 1873699195436981607L ^ j3) /* invoke-custom */]);
    }

    private final boolean l(long j2, byte b2) {
        long j3 = ((j2 << 8) | ((((long) b2) << 56) >>> 56)) ^ b;
        return ((Boolean) P.E(this, j3 ^ 90295881434616L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25230, 7427342530710596793L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void g(boolean z2, long j2) {
        long j3 = b ^ j2;
        P.b(this, j3 ^ 73199797351045L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19526, 8631722860717368057L ^ j3) /* invoke-custom */], Boolean.valueOf(z2));
    }

    private final boolean xn(long j2, char c2) {
        long j3 = ((j2 << 16) | ((((long) c2) << 48) >>> 48)) ^ b;
        return ((Boolean) o.E(this, j3 ^ 125155047094025L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6503, 4834211834103309702L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void S(long j2, boolean z2) {
        long j3 = b ^ j2;
        o.b(this, j3 ^ 4238690740481L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6503, 4834286481978092642L ^ j3) /* invoke-custom */], Boolean.valueOf(z2));
    }

    private final float t(char c2, char c3, int i2) {
        long j2 = (((((long) c2) << 48) | ((((long) c3) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ b;
        return ((Number) a.E(this, j2 ^ 119776504121093L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3157, 4639993697088012418L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final void H(float f2, long j2) {
        long j3 = b ^ j2;
        a.b(this, j3 ^ 109754418225408L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3157, 4640021971811561835L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float P(long j2) {
        long j3 = b ^ j2;
        return ((Number) T.E(this, j3 ^ 53482407875602L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22413, 617632596852344945L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void p(long j2, float f2) {
        long j3 = b ^ j2;
        T.b(this, j3 ^ 50518186993469L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10632, 6879799830872134303L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float H(long j2) {
        long j3 = b ^ j2;
        return ((Number) m.E(this, j3 ^ 124787858758155L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9635, 194575426754769995L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void I(long j2, float f2) {
        long j3 = b ^ j2;
        m.b(this, j3 ^ 22404625281975L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9635, 194523102182410779L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float n(short s, int i2, short s2) {
        long j2 = (((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s2) << 48) >>> 48)) ^ b;
        return ((Number) g.E(this, j2 ^ 25734450048034L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11148, 7880532194614660162L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final void c(long j2, float f2) {
        long j3 = b ^ j2;
        g.b(this, j3 ^ 79536302515430L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11148, 7880503861286163306L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float h(long j2) {
        long j3 = b ^ j2;
        return ((Number) D.E(this, j3 ^ 81051079367998L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10836, 7556510351070854279L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void S(long j2, float f2) {
        long j3 = b ^ j2;
        D.b(this, j3 ^ 19376359181586L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10836, 7556604752270736199L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final Color G(long j2) {
        long j3 = b ^ j2;
        return (Color) k.E(this, j3 ^ 94739795994660L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12209, 555752894541876308L ^ j3) /* invoke-custom */]);
    }

    private final sa r(long j2) {
        long j3 = b ^ j2;
        return (sa) z.E(this, j3 ^ 73776903954165L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1115, 9185545487531446655L ^ j3) /* invoke-custom */]);
    }

    private final void y(sa saVar, long j2) {
        long j3 = b ^ j2;
        z.b(this, j3 ^ 82185777940275L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1115, 9185549550620155733L ^ j3) /* invoke-custom */], saVar);
    }

    private final int v(long j2) {
        long j3 = b ^ j2;
        return ((Number) I.E(this, j3 ^ 29204104272280L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31707, 4225434354479835536L ^ j3) /* invoke-custom */])).intValue();
    }

    private final void o(long j2, int i2) {
        long j3 = b ^ j2;
        I.b(this, j3 ^ 53282800065677L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20484, 9124715419567624323L ^ j3) /* invoke-custom */], Integer.valueOf(i2));
    }

    private final float E(long j2) {
        long j3 = b ^ j2;
        return ((Number) A.E(this, j3 ^ 36067203263709L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20048, 5223143839246412122L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void r(long j2, byte b2, float f2) {
        long j3 = ((j2 << 8) | ((((long) b2) << 56) >>> 56)) ^ b;
        A.b(this, j3 ^ 6546141354800L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30491, 549806406282670120L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float Y(long j2) {
        long j3 = b ^ j2;
        return ((Number) l.E(this, j3 ^ 39080770637229L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10351, 3069129478629043752L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void s(int i2, short s, float f2, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ b;
        l.b(this, j2 ^ 99187624769311L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10351, 3069186335362532214L ^ j2) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float V(long j2) {
        long j3 = b ^ j2;
        return ((Number) O.E(this, j3 ^ 78051777514026L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21192, 5263644475459130144L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void k(float f2, long j2) {
        long j3 = b ^ j2;
        O.b(this, j3 ^ 46822613783678L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21192, 5263689123281197720L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float B(int i2, byte b2, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i3) << 40) >>> 40)) ^ b;
        return ((Number) S.E(this, j2 ^ 104850828916432L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32577, 7445865371122074221L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final void t(char c2, int i2, float f2, char c3) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c3) << 48) >>> 48)) ^ b;
        S.b(this, j2 ^ 54668035400617L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32577, 7445958757624430840L ^ j2) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float xT(long j2) {
        long j3 = b ^ j2;
        return ((Number) X.E(this, j3 ^ 77690927400092L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4626, 512077411660586324L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void U(long j2, float f2, byte b2) {
        long j3 = ((j2 << 8) | ((((long) b2) << 56) >>> 56)) ^ b;
        X.b(this, j3 ^ 81955718590990L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4626, 512137555120094250L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final int xE(short s, long j2) {
        long j3 = ((((long) s) << 48) | ((j2 << 16) >>> 16)) ^ b;
        return ((Number) F.E(this, j3 ^ 137373338268007L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9238, 8130123589415788196L ^ j3) /* invoke-custom */])).intValue();
    }

    private final void t(int i2, long j2) {
        long j3 = b ^ j2;
        F.b(this, j3 ^ 13528720352238L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9238, 8130199221580766145L ^ j3) /* invoke-custom */], Integer.valueOf(i2));
    }

    private final int xa(long j2) {
        long j3 = b ^ j2;
        return ((Number) W.E(this, j3 ^ 95458098978317L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18734, 1524657014635814108L ^ j3) /* invoke-custom */])).intValue();
    }

    private final void i(int i2, long j2) {
        long j3 = b ^ j2;
        W.b(this, j3 ^ 132919211563863L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18734, 1524662799426571882L ^ j3) /* invoke-custom */], Integer.valueOf(i2));
    }

    public final boolean s(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) C.E(this, j3 ^ 108817824043532L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28954, 4168052948405954766L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final void y(char a2, int a3, int a4, boolean z2) {
        long j2 = (((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ b;
        C.b(this, j2 ^ 124411865893164L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6686, 7053035701910605570L ^ j2) /* invoke-custom */], Boolean.valueOf(z2));
    }

    private final float x4(char c2, char c3, int i2) {
        long j2 = (((((long) c2) << 48) | ((((long) c3) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ b;
        return ((Number) V.E(this, j2 ^ 98709984106527L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20394, 4212948925247626353L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final boolean I(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) e.E(this, j3 ^ 98932339589523L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22383, 9093268498270264635L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final float x2(long j2) {
        long j3 = b ^ j2;
        return ((Number) G.E(this, j3 ^ 134083280002443L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21152, 6212693199445558489L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float xv(long j2) {
        long j3 = b ^ j2;
        return ((Number) U.E(this, j3 ^ 128730005650339L, L[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18072, 3322342156754253510L ^ j3) /* invoke-custom */])).floatValue();
    }

    @NotNull
    public final iv F() {
        return K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.nn] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    @Flow
    public final void Q(@NotNull Render3DEvent e2) throws Exception {
        long j2 = b ^ 29013582732058L;
        long j3 = j2 ^ 13685590034707L;
        long j4 = j2 ^ 101021844711304L;
        long j5 = j2 ^ 132881765286320L;
        int i2 = (int) (j2 >>> 48);
        long j6 = ((j2 ^ 42139126359673L) << 16) >>> 16;
        long j7 = j2 ^ 16114427285952L;
        long j8 = j2 ^ 39870137444409L;
        long j9 = j2 ^ 79382193423128L;
        long j10 = j2 ^ 13512231130731L;
        long j11 = j2 ^ 55391818616604L;
        int i3 = (int) (j2 >>> 32);
        int i4 = (int) ((j11 << 32) >>> 56);
        int i5 = (int) ((j11 << 40) >>> 40);
        long j12 = j2 ^ 7350504406104L;
        long j13 = j2 ^ 105760415168347L;
        ?? Xx = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8146198536851796824L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(e2, "e");
        try {
            try {
                Xx = xx(j12);
                ?? A2 = Xx;
                if (Xx == 0) {
                    if (Xx != 0) {
                        K.V(e2.getStack(), true, j8, xa(j3), xE((short) i2, j6));
                    }
                    A2 = xO(j9);
                }
                try {
                    if (Xx == 0) {
                        if (A2 != 0) {
                            j_.N.g(W(j10), xP(j4), L(j7), xa(j3), j13, xE((short) i2, j6));
                        }
                        A2 = A(j5);
                    }
                    if (A2 != 0) {
                        try {
                            A2 = nn.x;
                            A2.w(i3, e2.getStack(), (byte) i4, W(j10), i5, xP(j4), L(j7), xa(j3), xE((short) i2, j6));
                        } catch (NumberFormatException unused) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(A2, 8146132166868245240L, j2) /* invoke-custom */;
                        }
                    }
                    ?? r0 = Xx;
                    if (r0 != 0) {
                        try {
                            r0 = new _g[4];
                            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 8151401332544797474L, j2) /* invoke-custom */;
                        } catch (NumberFormatException unused2) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 8146132166868245240L, j2) /* invoke-custom */;
                        }
                    }
                } catch (NumberFormatException unused3) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(A2, 8146132166868245240L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused4) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Xx, 8146132166868245240L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused5) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Xx, 8146132166868245240L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [su.catlean.iv] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    public final void d(@NotNull Render2DEvent e2) throws Exception {
        long j2 = b ^ 22934034600869L;
        long j3 = j2 ^ 74203157590915L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j3 << 16) >>> 32);
        int i4 = (int) ((j3 << 48) >>> 48);
        long j4 = j2 ^ 131461221585420L;
        long j5 = j2 ^ 32625323590303L;
        long j6 = j2 ^ 133412444543L;
        long j7 = j2 ^ 86400185353785L;
        long j8 = j2 ^ 5439206884571L;
        long j9 = j2 ^ 110772977257395L;
        long j10 = j2 ^ 25299609616724L;
        long j11 = j2 ^ 20563568941885L;
        long j12 = j2 ^ 67254362579310L;
        int i5 = (int) (j2 >>> 32);
        int i6 = (int) ((j12 << 32) >>> 48);
        int i7 = (int) ((j12 << 48) >>> 48);
        long j13 = j2 ^ 127111611627049L;
        long j14 = j2 ^ 128464834212732L;
        long j15 = j2 ^ 2410885642117L;
        long j16 = j2 >>> 8;
        int i8 = (int) (((j2 ^ 6617033185881L) << 56) >>> 56);
        long j17 = j2 >>> 16;
        int i9 = (int) (((j2 ^ 41544917067944L) << 48) >>> 48);
        long j18 = j2 >>> 8;
        int i10 = (int) (((j2 ^ 55278600341818L) << 56) >>> 56);
        long j19 = j2 ^ 62623372712100L;
        int i11 = (int) (j2 >>> 48);
        int i12 = (int) ((j19 << 16) >>> 48);
        int i13 = (int) ((j19 << 32) >>> 32);
        long j20 = j2 ^ 12401658358129L;
        int i14 = (int) (j2 >>> 32);
        int i15 = (int) ((j20 << 32) >>> 56);
        int i16 = (int) ((j20 << 40) >>> 40);
        long j21 = j2 ^ 113494475089544L;
        long j22 = j2 ^ 8897335309543L;
        long j23 = j2 ^ 41117599385002L;
        long j24 = j2 ^ 20786976953739L;
        ?? Xw = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-454279926432056345L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(e2, "e");
        try {
            try {
                Xw = xw(j21);
                ?? Xx = Xw;
                if (Xw == 0) {
                    if (Xw != 0) {
                        fr.a.Y(e2.getContext(), L(j6), j18, (byte) i10);
                    }
                    Xx = xx(j22);
                }
                if (Xx != 0) {
                    try {
                        Xx = K;
                        Xx.O(xS(j8), T(j13), l(j16, (byte) i8), xn(j17, (char) i9), t((char) i11, (char) i12, i13), P(j9), i5, H(j23), n((short) i2, i3, (short) i4), r(j10).ordinal(), T(j13), G(j15), v(j7), (short) i6, E(j14), Y(j4), V(j24), B(i14, (byte) i15, i16), (char) i7, xT(j11), h(j5));
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Xx, -453756683573390777L, j2) /* invoke-custom */;
                    }
                }
                try {
                    if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-443973647112935609L, j2) /* invoke-custom */ != null) {
                        Xx = new _g[3];
                        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Xx, -457528464404795074L, j2) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Xx, -453756683573390777L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Xw, -453756683573390777L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Xw, -453756683573390777L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.api.event.events.world.CrystalCreateEvent] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Flow
    public final void e(@NotNull CrystalCreateEvent crystalCreateEvent) {
        long j2 = b ^ 4927148994718L;
        long j3 = j2 ^ 32169118907657L;
        ?? e2 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7311309836335556388L, j2) /* invoke-custom */;
        try {
            e2 = crystalCreateEvent;
            ?? r0 = e2;
            if (e2 == 0) {
                try {
                    Intrinsics.checkNotNullParameter(e2, "e");
                    e2 = I(j3);
                    if (e2 == 0) {
                        return;
                    } else {
                        r0 = crystalCreateEvent;
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(e2, -7311314634203631236L, j2) /* invoke-custom */;
                }
            }
            r0.cancel();
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(e2, -7311314634203631236L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.iv] */
    /* JADX WARN: Type inference failed for: r0v14, types: [su.catlean.iv] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.api.event.events.render.FrameBufferEvent] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    @Flow
    public final void d(@NotNull FrameBufferEvent frameBufferEvent) {
        long j2 = b ^ 76459519270667L;
        long j3 = j2 ^ 98158021621833L;
        Object objXx = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-784678009630279863L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(frameBufferEvent, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25531, 1425227220376923453L ^ j2) /* invoke-custom */);
        try {
            try {
                objXx = xx(j3);
                if (objXx != 0) {
                    try {
                        objXx = K;
                        Object obj = objXx;
                        if (objXx == 0) {
                            if (objXx.d() == null) {
                                return;
                            } else {
                                obj = K;
                            }
                        }
                        try {
                            if (obj.C()) {
                                class_6364 class_6364VarD = K.d();
                                Intrinsics.checkNotNull(class_6364VarD);
                                frameBufferEvent.setFrameBuffer((class_276) class_6364VarD);
                                obj = frameBufferEvent;
                                obj.cancel();
                            }
                        } catch (NumberFormatException unused) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -784259778721997079L, j2) /* invoke-custom */;
                        }
                    } catch (NumberFormatException unused2) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objXx, -784259778721997079L, j2) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objXx, -784259778721997079L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objXx, -784259778721997079L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [su.catlean.api.event.events.render.CrystalRenderEvent] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    @Flow
    private final void b(CrystalRenderEvent crystalRenderEvent) {
        long j2 = b ^ 120063436711394L;
        long j3 = j2 ^ 86907910650858L;
        ?? S2 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5761629193413561760L, j2) /* invoke-custom */;
        try {
            try {
                S2 = s(j3);
                ?? C2 = S2;
                if (S2 == 0) {
                    if (S2 != 0) {
                        return;
                    } else {
                        C2 = K.C();
                    }
                }
                if (C2 == 0) {
                    try {
                        C2 = crystalRenderEvent;
                        C2.cancel();
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(C2, 5761396238291608576L, j2) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(S2, 5761396238291608576L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(S2, 5761396238291608576L, j2) /* invoke-custom */;
        }
    }

    @Flow
    private final void C(SetCrystalScaleEvent setCrystalScaleEvent) {
        setCrystalScaleEvent.setScale(o(setCrystalScaleEvent.getAge(), (b ^ 19241326892370L) ^ 40029440511317L));
        setCrystalScaleEvent.cancel();
    }

    @Flow
    private final void N(CrystalYOffsetEvent crystalYOffsetEvent) {
        crystalYOffsetEvent.setOffset(z((b ^ 129045988325431L) ^ 108597401332726L, crystalYOffsetEvent.getAge()));
        crystalYOffsetEvent.cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.k8] */
    public final float o(float f2, long j2) {
        long j3 = b ^ j2;
        long j4 = j3 ^ 26512832888498L;
        long j5 = j3 ^ 26526531774270L;
        int i2 = (int) (j3 >>> 48);
        int i3 = (int) ((j5 << 16) >>> 48);
        int i4 = (int) ((j5 << 32) >>> 32);
        Object objI = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6427207511580711783L, j3) /* invoke-custom */;
        try {
            objI = this;
            k8 k8Var = objI;
            if (objI == 0) {
                try {
                    objI = objI.I(j4);
                    if (objI == 0) {
                        return x4((char) i2, (char) i3, i4);
                    }
                    k8Var = this;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objI, 6427757408972878535L, j3) /* invoke-custom */;
                }
            }
            return k8Var.x4((char) i2, (char) i3, i4) * ((float) ((Number) _s.OUT_EXPO.a().invoke(Double.valueOf(RangesKt.coerceIn(((double) f2) / 10.0d, 0.0d, 1.0d)))).doubleValue());
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objI, 6427757408972878535L, j3) /* invoke-custom */;
        }
    }

    private final float z(long j2, float f2) {
        long j3 = (b ^ j2) ^ 24722677354308L;
        float fSin = (((float) Math.sin(f2 * x2(r0 ^ 29252122749292L))) / 2.0f) + 0.5f;
        return (((fSin * fSin) + fSin) * xv(j3)) - 1.4f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    private static final boolean i() {
        long j2 = b ^ 64433338046145L;
        long j3 = j2 ^ 96910502906987L;
        long j4 = j2 ^ 115224661446339L;
        Object objXO = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8995443903023332995L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    objXO = Y.xO(j4);
                    if (objXO != 0) {
                        return objXO;
                    }
                    if (objXO == 0) {
                        boolean zA = Y.A(j3);
                        if (objXO != 0) {
                            return zA;
                        }
                        if (!zA) {
                            return false;
                        }
                    }
                    return true;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objXO, 8995870930570024739L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objXO, 8995870930570024739L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objXO, 8995870930570024739L, j2) /* invoke-custom */;
        }
    }

    private static final boolean K() {
        return Y.xx((b ^ 29944167983827L) ^ 8760776986001L);
    }

    private static final boolean e() {
        return Y.xx((b ^ 31836878318788L) ^ 243566136198L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k8] */
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
    private static final boolean z() {
        /*
            long r0 = su.catlean.k8.b
            r1 = 95977821188040(0x574a93f02fc8, double:4.74193442117047E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 78491684108470(0x476344f2f8b6, double:3.87800446022183E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 83042111506570(0x4b86bf8ec88a, double:4.10282544535143E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -8800225805207517302(0x85df51417961478a, double:-2.156601101884933E-280)
            r1 = r7
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.rw r0 = r0.xS(r1)     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            su.catlean.rw r1 = su.catlean.rw.MIRROR     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            if (r0 != r1) goto L6f
            goto L41
        L37:
            r1 = -8800406258681483734(0x85dead22602a6e2a, double:-2.1124532572832208E-280)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L41:
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = -8800406258681483734(0x85dead22602a6e2a, double:-2.1124532572832208E-280)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            boolean r0 = r0.xx(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = -8800406258681483734(0x85dead22602a6e2a, double:-2.1124532572832208E-280)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k8.z():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k8] */
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
    private static final boolean M() {
        /*
            long r0 = su.catlean.k8.b
            r1 = 76145013280245(0x4540e477cdf5, double:3.76206351638945E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 93910323239563(0x556933751a8b, double:4.6397864502515E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 98461186337463(0x598cc8092ab7, double:4.8646289618114E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 7485619520294790583(0x67e2434b0ee6a5b7, double:2.6038510226164267E192)
            r1 = r7
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.rw r0 = r0.xS(r1)     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            su.catlean.rw r1 = su.catlean.rw.MIRROR     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            if (r0 != r1) goto L6f
            goto L41
        L37:
            r1 = 7486037184536742935(0x67e3bf2817ad8c17, double:2.8154116030053626E192)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L41:
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = 7486037184536742935(0x67e3bf2817ad8c17, double:2.8154116030053626E192)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            boolean r0 = r0.xx(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = 7486037184536742935(0x67e3bf2817ad8c17, double:2.8154116030053626E192)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k8.M():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k8] */
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
    private static final boolean C() {
        /*
            long r0 = su.catlean.k8.b
            r1 = 101461229713571(0x5c47488e38a3, double:5.01285079862825E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 84038006927325(0x4c6e9f8cefdd, double:4.152029216776E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 70967438139361(0x408b64f0dfe1, double:3.5062573158022E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -7875570563180179231(0x92b45a4ca21f50e1, double:-1.4414044780800176E-218)
            r1 = r7
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.rw r0 = r0.xS(r1)     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            su.catlean.rw r1 = su.catlean.rw.BLOOM     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            if (r0 != r1) goto L6f
            goto L41
        L37:
            r1 = -7875205649450895039(0x92b5a62fbb547941, double:-1.5332194631732978E-218)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L41:
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = -7875205649450895039(0x92b5a62fbb547941, double:-1.5332194631732978E-218)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            boolean r0 = r0.xx(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = -7875205649450895039(0x92b5a62fbb547941, double:-1.5332194631732978E-218)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k8.C():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k8] */
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
    private static final boolean R() {
        /*
            long r0 = su.catlean.k8.b
            r1 = 28474678249696(0x19e5c71508e0, double:1.40683602995577E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 10772047978398(0x9cc1017df9e, double:5.32209884148E-311)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 5677601517474(0x529eb6befa2, double:2.80510786056E-311)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -6703854412491366238(0xa2f71fee2d8460a2, double:-3.0341612908888964E-140)
            r1 = r7
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.rw r0 = r0.xS(r1)     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            su.catlean.rw r1 = su.catlean.rw.BLOOM     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            if (r0 != r1) goto L6f
            goto L41
        L37:
            r1 = -6703920799678510846(0xa2f6e38d34cf4902, double:-3.003215149519494E-140)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L41:
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = -6703920799678510846(0xa2f6e38d34cf4902, double:-3.003215149519494E-140)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            boolean r0 = r0.xx(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = -6703920799678510846(0xa2f6e38d34cf4902, double:-3.003215149519494E-140)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k8.R():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k8] */
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
    private static final boolean j() {
        /*
            long r0 = su.catlean.k8.b
            r1 = 117458244360683(0x6ad3e0ee59eb, double:5.803208335944E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 135215098662549(0x7afa37ec8e95, double:6.68051350482E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 129878948101801(0x761fcc90bea9, double:6.4168726375098E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -865697353217134167(0xf3fc6cd80a7f31a9, double:-5.08791097590519E250)
            r1 = r7
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.rw r0 = r0.xS(r1)     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            su.catlean.rw r1 = su.catlean.rw.BLOOM     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            if (r0 != r1) goto L6f
            goto L41
        L37:
            r1 = -865376420229801975(0xf3fd90bb13341809, double:-5.291995924589721E250)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L41:
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = -865376420229801975(0xf3fd90bb13341809, double:-5.291995924589721E250)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            boolean r0 = r0.xx(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = -865376420229801975(0xf3fd90bb13341809, double:-5.291995924589721E250)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k8.j():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean a() {
        /*
            long r0 = su.catlean.k8.b
            r1 = 120773370508270(0x6dd7bdd8f3ee, double:5.96699733005926E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 138531667846288(0x7dfe6ada2490, double:6.84437379439413E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r0 = 6483331732677958572(0x59f96bdc57499bac, double:2.688787602720697E125)
            r1 = r7
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r11 = r0
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L30
            r1 = r9
            su.catlean.rw r0 = r0.xS(r1)     // Catch: java.lang.NumberFormatException -> L30
            su.catlean.rw r1 = su.catlean.rw.DEFAULT     // Catch: java.lang.NumberFormatException -> L30
            r2 = r11
            if (r2 != 0) goto L51
            if (r0 == r1) goto L54
            goto L3a
        L30:
            r1 = 6483098511503176204(0x59f897bf4e02b20c, double:2.6011508250917482E125)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L3a:
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L47
            r1 = r9
            su.catlean.rw r0 = r0.xS(r1)     // Catch: java.lang.NumberFormatException -> L47
            su.catlean.rw r1 = su.catlean.rw.BLOOM     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = 6483098511503176204(0x59f897bf4e02b20c, double:2.6011508250917482E125)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            if (r0 != r1) goto L62
        L54:
            r0 = 1
            goto L63
        L58:
            r1 = 6483098511503176204(0x59f897bf4e02b20c, double:2.6011508250917482E125)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L62:
            r0 = 0
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k8.a():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.rw] */
    private static final boolean q() {
        long j2 = b ^ 79271617539866L;
        Object objXS = j2;
        try {
            objXS = Y.xS(objXS ^ 96967671183460L);
            return objXS == rw.MIRROR;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objXS, 363861864809033464L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k8] */
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
    private static final boolean Z() {
        /*
            long r0 = su.catlean.k8.b
            r1 = 39818637883811(0x2436ffc439a3, double:1.9673021042584E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 57308432756445(0x341f28c6eedd, double:2.83141278419626E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 62649945218785(0x38fad3badee1, double:3.09531856464377E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -7803574608579964447(0x93b4223d155551e1, double:-9.344749017718713E-214)
            r1 = r7
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.rw r0 = r0.xS(r1)     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            su.catlean.rw r1 = su.catlean.rw.DOUBLE     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            if (r0 != r1) goto L6f
            goto L41
        L37:
            r1 = -7803086283837900735(0x93b5de5e0c1e7841, double:-1.0149964329464637E-213)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L41:
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = -7803086283837900735(0x93b5de5e0c1e7841, double:-1.0149964329464637E-213)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            boolean r0 = r0.xx(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = -7803086283837900735(0x93b5de5e0c1e7841, double:-1.0149964329464637E-213)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k8.Z():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k8] */
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
    private static final boolean Q() {
        /*
            long r0 = su.catlean.k8.b
            r1 = 40690924244495(0x25021815ce0f, double:2.01039877667337E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 58462274263409(0x352bcf171971, double:2.88842012912993E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 63557805484365(0x39ce346b294d, double:3.1401728214885E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 7212553328864306765(0x64182309f284a64d, double:1.4924454698888403E174)
            r1 = r7
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.rw r0 = r0.xS(r1)     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            su.catlean.rw r1 = su.catlean.rw.DOUBLE     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            if (r0 != r1) goto L6f
            goto L41
        L37:
            r1 = 7213041928526335981(0x6419df6aebcf8fed, double:1.599777880021281E174)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L41:
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = 7213041928526335981(0x6419df6aebcf8fed, double:1.599777880021281E174)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            boolean r0 = r0.xx(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = 7213041928526335981(0x6419df6aebcf8fed, double:1.599777880021281E174)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k8.Q():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k8] */
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
    private static final boolean p() {
        /*
            long r0 = su.catlean.k8.b
            r1 = 54594990505347(0x31a76303fd83, double:2.6973509243721E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 36896789048061(0x218eb4012afd, double:1.82294359104985E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 49938918349505(0x2d6b4f7d1ac1, double:2.46731039469615E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 6310730192034895297(0x579437ac899295c1, double:7.77938606268315E113)
            r1 = r7
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.rw r0 = r0.xS(r1)     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            su.catlean.rw r1 = su.catlean.rw.DOUBLE     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            if (r0 != r1) goto L6f
            goto L41
        L37:
            r1 = 6311174545178475617(0x5795cbcf90d9bc61, double:8.38683089728044E113)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L41:
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = 6311174545178475617(0x5795cbcf90d9bc61, double:8.38683089728044E113)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            boolean r0 = r0.xx(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = 6311174545178475617(0x5795cbcf90d9bc61, double:8.38683089728044E113)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k8.p():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k8] */
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
    private static final boolean x() {
        /*
            long r0 = su.catlean.k8.b
            r1 = 7791056522596(0x715ff280d64, double:3.849293372622E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 25547139373594(0x173c282ada1a, double:1.2621963914011E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 30622367541798(0x1bd9d356ea26, double:1.51294597967265E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -6380755018328742618(0xa773011e15b96526, double:-1.177538423050813E-118)
            r1 = r7
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.rw r0 = r0.xS(r1)     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            su.catlean.rw r1 = su.catlean.rw.DOUBLE     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            if (r0 != r1) goto L6f
            goto L41
        L37:
            r1 = -6380759008500626298(0xa772fd7d0cf24c86, double:-1.176660061070296E-118)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L41:
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = -6380759008500626298(0xa772fd7d0cf24c86, double:-1.176660061070296E-118)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            boolean r0 = r0.xx(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = -6380759008500626298(0xa772fd7d0cf24c86, double:-1.176660061070296E-118)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k8.x():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k8] */
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
    private static final boolean D() {
        /*
            long r0 = su.catlean.k8.b
            r1 = 133590962709302(0x798011e0a336, double:6.6002705269525E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 116177907119176(0x69a9c6e27448, double:5.739951271332E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 111378125702260(0x654c3d9e4474, double:5.50281056076746E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 657947259768523636(0x9217f8bfb71cb74, double:1.0853453089320668E-264)
            r1 = r7
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.rw r0 = r0.xS(r1)     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            su.catlean.rw r1 = su.catlean.rw.DOUBLE     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            if (r0 != r1) goto L6f
            goto L41
        L37:
            r1 = 657670581847253716(0x92083e8e23ae2d4, double:1.0243763846886059E-264)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L41:
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = 657670581847253716(0x92083e8e23ae2d4, double:1.0243763846886059E-264)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            boolean r0 = r0.xx(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = 657670581847253716(0x92083e8e23ae2d4, double:1.0243763846886059E-264)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k8.D():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k8] */
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
    private static final boolean w() {
        /*
            long r0 = su.catlean.k8.b
            r1 = 78213831182705(0x4722939fc971, double:3.86427670170014E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 95705907404303(0x570b449d1e0f, double:4.72850009525295E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 101080979549747(0x5beebfe12e33, double:4.99406394435116E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 7162483903759819059(0x63664129790ea133, double:6.719023540339528E170)
            r1 = r7
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.rw r0 = r0.xS(r1)     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            su.catlean.rw r1 = su.catlean.rw.DOUBLE     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            if (r0 != r1) goto L6f
            goto L41
        L37:
            r1 = 7162901859496462483(0x6367bd4a60458893, double:7.167333159550144E170)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L41:
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = 7162901859496462483(0x6367bd4a60458893, double:7.167333159550144E170)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            boolean r0 = r0.xx(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = 7162901859496462483(0x6367bd4a60458893, double:7.167333159550144E170)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k8.w():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k8] */
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
    private static final boolean xR() {
        /*
            long r0 = su.catlean.k8.b
            r1 = 19484746503699(0x11b8a564d613, double:9.626743865403E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 1724201173357(0x1917266016d, double:8.51868566275E-312)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 14794167562577(0xd74891a3151, double:7.309289951488E-311)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 8936293619517996625(0x7c0417b34ff5be51, double:2.447606247904745E289)
            r1 = r7
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.rw r0 = r0.xS(r1)     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            su.catlean.rw r1 = su.catlean.rw.DOUBLE     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            if (r0 != r1) goto L6f
            goto L41
        L37:
            r1 = 8936808315627673585(0x7c05ebd056be97f1, double:2.670355853742889E289)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L41:
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = 8936808315627673585(0x7c05ebd056be97f1, double:2.670355853742889E289)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            boolean r0 = r0.xx(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = 8936808315627673585(0x7c05ebd056be97f1, double:2.670355853742889E289)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k8.xR():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k8] */
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
    private static final boolean xA() {
        /*
            long r0 = su.catlean.k8.b
            r1 = 9406189340966(0x88e0c930926, double:4.6472750116494E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 27109222375000(0x18a7db91de58, double:1.33937354609583E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 22274252861028(0x144220edee64, double:1.1004943125415E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -6687548003416120988(0xa3310e85e6026164, double:-3.580781348839491E-139)
            r1 = r7
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.rw r0 = r0.xS(r1)     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            su.catlean.rw r1 = su.catlean.rw.DOUBLE     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            if (r0 != r1) goto L6f
            goto L41
        L37:
            r1 = -6687578372705793852(0xa330f2e6ff4948c4, double:-3.558130897825017E-139)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L41:
            su.catlean.k8 r0 = su.catlean.k8.Y     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = -6687578372705793852(0xa330f2e6ff4948c4, double:-3.558130897825017E-139)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            boolean r0 = r0.xx(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = -6687578372705793852(0xa330f2e6ff4948c4, double:-3.558130897825017E-139)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k8.xA():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    private static final boolean xb() {
        long j2 = b ^ 50307079170349L;
        long j3 = j2 ^ 58029520813366L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j3 << 16) >>> 48);
        int i4 = (int) ((j3 << 32) >>> 32);
        ?? r0 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4379139537104535185L, j2) /* invoke-custom */;
        try {
            r0 = (Y.x4((char) i2, (char) i3, i4) > 1.0f ? 1 : (Y.x4((char) i2, (char) i3, i4) == 1.0f ? 0 : -1));
            ?? r02 = r0;
            if (r0 == 0) {
                r02 = r0 == 0 ? 1 : 0;
            }
            return r02 == 0;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -4378669087739402033L, j2) /* invoke-custom */;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 15011;
        if (h[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) w.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    w.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                h[i3] = b(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/k8", e2);
            }
        }
        return h[i3];
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
            java.lang.String r1 = "su/catlean/k8"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k8.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 18382;
        if (J[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) x[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) N.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    N.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/k8", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            J[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return J[i3].intValue();
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
            java.lang.String r1 = "su/catlean/k8"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k8.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
