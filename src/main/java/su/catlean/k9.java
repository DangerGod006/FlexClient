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
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_7833;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/k9.class */
public final class k9 extends _g {

    @NotNull
    public static final k9 K = null;
    static final /* synthetic */ KProperty[] o = null;

    @NotNull
    private static final cq e = null;

    @NotNull
    private static final cp x = null;

    @NotNull
    private static final ct W = null;

    @NotNull
    private static final ct F = null;

    @NotNull
    private static final ct h = null;

    @NotNull
    private static final ct T = null;

    @NotNull
    private static final ct J = null;

    @NotNull
    private static final ct n = null;

    @NotNull
    private static final ct V = null;

    @NotNull
    private static final cq l = null;

    @NotNull
    private static final cq U = null;

    @NotNull
    private static final cq E = null;

    @NotNull
    private static final ct b = null;

    @NotNull
    private static final cp i = null;

    @NotNull
    private static final ct D = null;

    @NotNull
    private static final ct y = null;

    @NotNull
    private static final ct j = null;

    @NotNull
    private static final ct A = null;

    @NotNull
    private static final ct N = null;

    @NotNull
    private static final ct f = null;

    @NotNull
    private static final ct w = null;

    @NotNull
    private static final cq S = null;

    @NotNull
    private static final cq G = null;

    @NotNull
    private static final cq X = null;

    @NotNull
    private static final ct B = null;

    @NotNull
    private static final cp d = null;

    @NotNull
    private static final ct k = null;

    @NotNull
    private static final ct z = null;

    @NotNull
    private static final ct P = null;
    private static float L;
    private static float Y;
    private static float g;
    private static float c;
    private static float a;
    private static float O;
    private static final long m = 0;
    private static final String[] t = null;
    private static final String[] u = null;
    private static final Map C = null;
    private static final long[] I = null;
    private static final Integer[] ab = null;
    private static final Map fb = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private k9(long j2) {
        long j3 = m ^ j2;
        super((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32425, 8694121602428939243L ^ j3) /* invoke-custom */, jt.F(), null, 4, null, j3 ^ 128483178105582L);
    }

    private final boolean v(long j2) {
        return ((Boolean) e.E(this, (m ^ j2) ^ 64242342810829L, o[0])).booleanValue();
    }

    private final void V(boolean z2, char c2, char c3, int i2) {
        e.b(this, ((((((long) c2) << 48) | ((((long) c3) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ m) ^ 116431041331383L, o[0], Boolean.valueOf(z2));
    }

    private final h K(long j2) {
        return (h) x.E(this, (m ^ j2) ^ 67139769435147L, o[1]);
    }

    private final void M(short s, int i2, h hVar, int i3) {
        x.b(this, ((((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ m) ^ 116443599541324L, o[1], hVar);
    }

    private final float r(int i2, int i3, short s) {
        return ((Number) W.E(this, ((((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ m) ^ 112097815149010L, o[2])).floatValue();
    }

    private final void j(float f2, long j2) {
        W.b(this, (m ^ j2) ^ 132294726249881L, o[2], Float.valueOf(f2));
    }

    private final float z(long j2) {
        return ((Number) F.E(this, (m ^ j2) ^ 124655854688720L, o[3])).floatValue();
    }

    private final void R(int i2, byte b2, int i3, float f2) {
        F.b(this, ((((((long) i2) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i3) << 40) >>> 40)) ^ m) ^ 138511198297188L, o[3], Float.valueOf(f2));
    }

    private final float XT(long j2) {
        return ((Number) h.E(this, (m ^ j2) ^ 4307867562533L, o[4])).floatValue();
    }

    private final void G(long j2, float f2) {
        h.b(this, (m ^ j2) ^ 132156014314628L, o[4], Float.valueOf(f2));
    }

    public final float h(long j2) {
        return ((Number) T.E(this, (m ^ j2) ^ 38350412873322L, o[5])).floatValue();
    }

    public final void W(float f2, long a2) {
        long j2 = m ^ a2;
        long j3 = j2 ^ 87479914527418L;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2320528421048298716L, j2) /* invoke-custom */;
        try {
            T.b(this, j3, o[5], Float.valueOf(f2));
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2306874488422481554L, j2) /* invoke-custom */ != null) {
                str = "K07vO";
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("K07vO", 2362851222541570028L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(str, 2431671141463192018L, j2) /* invoke-custom */;
        }
    }

    private final float D(long j2) {
        long j3 = m ^ j2;
        return ((Number) J.E(this, j3 ^ 32052369817761L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29007, 6578164727918744148L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void D(long j2, float f2) {
        long j3 = m ^ j2;
        J.b(this, j3 ^ 74203280293452L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26959, 4283229083343872857L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float x(long j2) {
        long j3 = m ^ j2;
        return ((Number) n.E(this, j3 ^ 56521889507266L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21362, 1357954106369152775L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void N(float f2, long j2) {
        long j3 = m ^ j2;
        n.b(this, j3 ^ 108373047955270L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21362, 1357844208005687407L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float B(long j2) {
        long j3 = m ^ j2;
        return ((Number) V.E(this, j3 ^ 13927138790262L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1318, 7938999652263603683L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void i(float f2, long j2) {
        long j3 = m ^ j2;
        V.b(this, j3 ^ 72182014449967L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15852, 8977665128132022457L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final boolean V(long j2) {
        long j3 = m ^ j2;
        return ((Boolean) l.E(this, j3 ^ 130758940889081L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5846, 5954677358726036144L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void l(boolean z2, int i2, int i3, short s) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ m;
        l.b(this, j2 ^ 108213013592914L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25996, 6179134565805189815L ^ j2) /* invoke-custom */], Boolean.valueOf(z2));
    }

    private final boolean w(long j2) {
        long j3 = m ^ j2;
        return ((Boolean) U.E(this, j3 ^ 39170307240062L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13007, 8154113970134950181L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void F(boolean z2, long j2) {
        long j3 = m ^ j2;
        U.b(this, j3 ^ 87195771840788L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13007, 8154156821041819555L ^ j3) /* invoke-custom */], Boolean.valueOf(z2));
    }

    private final boolean I(long j2) {
        long j3 = m ^ j2;
        return ((Boolean) E.E(this, j3 ^ 94661716550509L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13947, 1178869070170797742L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void J(boolean z2, long j2) {
        long j3 = m ^ j2;
        E.b(this, j3 ^ 113093967333202L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13947, 1178863498582705533L ^ j3) /* invoke-custom */], Boolean.valueOf(z2));
    }

    private final float E(long j2) {
        long j3 = m ^ j2;
        return ((Number) b.E(this, j3 ^ 64268489604752L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2746, 5660771963645499295L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void E(char c2, float f2, short s, int i2) {
        long j2 = (((((long) c2) << 48) | ((((long) s) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ m;
        b.b(this, j2 ^ 74293856133908L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29059, 3261937551091508966L ^ j2) /* invoke-custom */], Float.valueOf(f2));
    }

    private final h j(int i2, int i3, short s) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ m;
        return (h) i.E(this, j2 ^ 121426327330968L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22939, 7084815916266101438L ^ j2) /* invoke-custom */]);
    }

    private final void D(long j2, h hVar) {
        long j3 = m ^ j2;
        i.b(this, j3 ^ 139674950931672L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15544, 174019415302347782L ^ j3) /* invoke-custom */], hVar);
    }

    private final float M(long j2) {
        long j3 = m ^ j2;
        return ((Number) D.E(this, j3 ^ 56974331325935L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2427, 9116497763320104714L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void z(float f2, long j2) {
        long j3 = m ^ j2;
        D.b(this, j3 ^ 99558323997488L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17841, 751709984658242277L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float a(int i2, byte b2, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i3) << 40) >>> 40)) ^ m;
        return ((Number) y.E(this, j2 ^ 73274958868501L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25372, 982499195726147716L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final void g(byte b2, float f2, int i2, int i3) {
        long j2 = (((((long) b2) << 56) | ((((long) i2) << 32) >>> 8)) | ((((long) i3) << 40) >>> 40)) ^ m;
        y.b(this, j2 ^ 72619405824853L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9460, 1219931811797550030L ^ j2) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float W(long j2) {
        long j3 = m ^ j2;
        return ((Number) j.E(this, j3 ^ 41360272162964L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3274, 8361435066484338670L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void w(long j2, float f2) {
        long j3 = m ^ j2;
        j.b(this, j3 ^ 75549300569232L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4752, 8523516035295547986L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float Xv(long j2) {
        long j3 = m ^ j2;
        return ((Number) A.E(this, j3 ^ 3042826162662L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16129, 1666718036785466738L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void Y(float f2, long j2) {
        long j3 = m ^ j2;
        A.b(this, j3 ^ 111223478988404L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16129, 1666627776213067020L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float R(long j2) {
        long j3 = m ^ j2;
        return ((Number) N.E(this, j3 ^ 116699359049221L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21540, 8450755714941157786L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void K(float f2, long j2) {
        long j3 = m ^ j2;
        N.b(this, j3 ^ 23890157449562L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21540, 8450819853168464169L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float X1(long j2) {
        long j3 = m ^ j2;
        return ((Number) f.E(this, j3 ^ 95357786361327L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8407, 6759262059909648035L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void H(float f2, long j2) {
        long j3 = m ^ j2;
        f.b(this, j3 ^ 80570635485087L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6942, 2120183772958052588L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float e(long j2) {
        long j3 = m ^ j2;
        return ((Number) w.E(this, j3 ^ 67323178480827L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9718, 1921283607173198551L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void T(float f2, long j2) {
        long j3 = m ^ j2;
        w.b(this, j3 ^ 79514364191166L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10315, 3343821795329883543L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final boolean P(long j2) {
        long j3 = m ^ j2;
        return ((Boolean) S.E(this, j3 ^ 138122006999031L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32509, 8287986560898003603L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void H(boolean z2, long j2) {
        long j3 = m ^ j2;
        S.b(this, j3 ^ 118203447796145L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32509, 8288017731898157881L ^ j3) /* invoke-custom */], Boolean.valueOf(z2));
    }

    private final boolean g(long j2) {
        long j3 = m ^ j2;
        return ((Boolean) G.E(this, j3 ^ 50514621299085L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21342, 8845121577005549892L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void I(long j2, boolean z2) {
        long j3 = m ^ j2;
        G.b(this, j3 ^ 138295080295318L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21319, 3767865673087843502L ^ j3) /* invoke-custom */], Boolean.valueOf(z2));
    }

    private final boolean Xw(long j2) {
        long j3 = m ^ j2;
        return ((Boolean) X.E(this, j3 ^ 75760454174630L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18119, 6720640371729195741L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void t(boolean z2, long j2) {
        long j3 = m ^ j2;
        X.b(this, j3 ^ 22732092455238L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18119, 6720751015377128401L ^ j3) /* invoke-custom */], Boolean.valueOf(z2));
    }

    private final float L(long j2) {
        long j3 = m ^ j2;
        return ((Number) B.E(this, j3 ^ 27744375596544L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9999, 7347328619118125727L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void A(char c2, int i2, float f2, int i3) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ m;
        B.b(this, j2 ^ 49965363262056L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31824, 3631920401962547796L ^ j2) /* invoke-custom */], Float.valueOf(f2));
    }

    private final h Y(long j2) {
        long j3 = m ^ j2;
        return (h) d.E(this, j3 ^ 74465937054731L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(220, 238951669511454552L ^ j3) /* invoke-custom */]);
    }

    private final void f(h hVar, long j2) {
        long j3 = m ^ j2;
        d.b(this, j3 ^ 35031292322190L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29361, 8284194006627936075L ^ j3) /* invoke-custom */], hVar);
    }

    private final float n(long j2) {
        long j3 = m ^ j2;
        return ((Number) k.E(this, j3 ^ 42797503733068L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29588, 1303034480740896081L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void e(long j2, float f2) {
        long j3 = m ^ j2;
        k.b(this, j3 ^ 62925572450731L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29588, 1303058544241274458L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float Q(long j2) {
        long j3 = m ^ j2;
        return ((Number) z.E(this, j3 ^ 34020877348481L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11254, 408479946289325766L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void v(long j2, float f2) {
        long j3 = m ^ j2;
        z.b(this, j3 ^ 105106204092418L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11254, 408493630316181417L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float A(long j2) {
        long j3 = m ^ j2;
        return ((Number) P.E(this, j3 ^ 107547382912833L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30211, 8835014748136194771L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void a(float f2, long j2) {
        long j3 = m ^ j2;
        P.b(this, j3 ^ 63000380567969L, o[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3221, 4277581608941865324L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private final float T(long j2, float f2, float f3) {
        float f4;
        float f5;
        long j3 = m ^ j2;
        ?? r0 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1421188366243077969L, j3) /* invoke-custom */;
        try {
            try {
                try {
                    r0 = ((f2 - f3) > 180.0f ? 1 : ((f2 - f3) == 180.0f ? 0 : -1));
                    ?? r02 = r0;
                    if (r0 != 0) {
                        if (r0 <= 0) {
                            f4 = f2 - f3;
                            if (j3 <= 0) {
                                return f4;
                            }
                            f5 = -180.0f;
                            if (r0 != 0) {
                                r02 = (f4 > (-180.0f) ? 1 : (f4 == (-180.0f) ? 0 : -1));
                            }
                            return f4 - f5;
                        }
                        return 180.0f;
                    }
                    if (r02 > 0) {
                        f4 = f2;
                        f5 = f3;
                        return f4 - f5;
                    }
                    return 180.0f;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 1311170927381529183L, j3) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 1311170927381529183L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 1311170927381529183L, j3) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0118: INVOKE (r-1 I:su.catlean.k9), (r0 I:long), (r1 I:float) DIRECT call: su.catlean.k9.D(long, float):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    public final void u(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.player.PlayerUpdateEvent r10) {
        /*
            Method dump skipped, instruction units count: 645
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k9.u(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x016e: INVOKE (r-1 I:su.catlean.k9), (r0 I:long), (r1 I:float) DIRECT call: su.catlean.k9.w(long, float):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void Z(su.catlean.api.event.events.render.HandModifyEvent r11) {
        /*
            Method dump skipped, instruction units count: 1134
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k9.Z(su.catlean.api.event.events.render.HandModifyEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [float] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private final void X(class_4587 class_4587Var, long j2, float f2, class_1268 class_1268Var, class_1799 class_1799Var) {
        long j3 = m ^ j2;
        long j4 = j3 ^ 7981575487004L;
        long j5 = j3 ^ 70912518353937L;
        long j6 = j3 ^ 69680789605841L;
        long j7 = j3 ^ 30597334090776L;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1590105257058900729L, j3) /* invoke-custom */;
        float fMethod_6014 = ((zf.v(j7).method_6014() - f2) + 1.0f) / class_1799Var.method_7935(zf.v(j7));
        float f3 = fMethod_6014;
        float fPow = 0.8f;
        if (str != null) {
            if (f3 < 0.8f) {
                class_4587Var.method_46416(0.0f, class_3532.method_15379(((float) Math.cos((r1 / 4.0f) * 3.1415927f)) * A(j5)), 0.0f);
            }
            f3 = 1.0f;
            fPow = (float) Math.pow(fMethod_6014, 27.0f);
        }
        Object obj = f3 - fPow;
        try {
            obj = class_1268Var;
            int i2 = obj == class_1268.field_5808 ? 1 : -1;
            class_4587Var.method_46416(obj * 0.6f * i2 * n(j4), obj * (-0.5f) * Q(j6), obj * 0.0f);
            class_4587Var.method_22907(class_7833.field_40716.rotationDegrees(i2 * obj * 90.0f));
            class_4587Var.method_22907(class_7833.field_40714.rotationDegrees(obj * 10.0f));
            class_4587Var.method_22907(class_7833.field_40718.rotationDegrees(i2 * obj * 30.0f));
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1700693827918579703L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String] */
    public final void w(@NotNull class_4587 class_4587Var, int i2, int i3, short s) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ m;
        long j3 = j2 ^ 80304324165578L;
        long j4 = j2 ^ 51752211510333L;
        int i4 = (int) (j2 >>> 32);
        int i5 = (int) ((j4 << 32) >>> 48);
        int i6 = (int) ((j4 << 48) >>> 48);
        long j5 = j2 ^ 65687190852671L;
        long j6 = j2 ^ 21639851868153L;
        Object objF = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4084301980462101574L, j2) /* invoke-custom */;
        try {
            objF = class_4587Var;
            class_4587 class_4587Var2 = objF;
            if (objF != 0) {
                try {
                    Intrinsics.checkNotNullParameter(objF, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32059, 3606765882734709634L ^ j2) /* invoke-custom */);
                    objF = f(j6);
                    if (objF == 0) {
                        return;
                    } else {
                        class_4587Var2 = class_4587Var;
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, 4117837390547872072L, j2) /* invoke-custom */;
                }
            }
            class_4587Var2.method_46416(r(i4, i5, (short) i6), z(j5), XT(j3));
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, 4117837390547872072L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    public final void V(long j2, @NotNull class_4587 class_4587Var) {
        long j3 = m ^ j2;
        long j4 = j3 ^ 138436143143958L;
        long j5 = j3 ^ 118354328285549L;
        long j6 = j3 ^ 13872006267372L;
        int i2 = (int) (j3 >>> 32);
        int i3 = (int) ((j6 << 32) >>> 56);
        int i4 = (int) ((j6 << 40) >>> 40);
        long j7 = j3 ^ 25792722945007L;
        Object objF = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(340127160723703888L, j3) /* invoke-custom */;
        try {
            objF = class_4587Var;
            class_4587 class_4587Var2 = objF;
            if (objF != 0) {
                try {
                    Intrinsics.checkNotNullParameter(objF, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32059, 3606761728519354260L ^ j3) /* invoke-custom */);
                    objF = f(j7);
                    if (objF == 0) {
                        return;
                    } else {
                        class_4587Var2 = class_4587Var;
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, 374779057370649950L, j3) /* invoke-custom */;
                }
            }
            class_4587Var2.method_46416(-M(j4), a(i2, (byte) i3, i4), W(j5));
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, 374779057370649950L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    public final void Q(@NotNull class_4587 class_4587Var, long j2) {
        long j3 = m ^ j2;
        long j4 = j3 ^ 20598611510704L;
        long j5 = j3 ^ 128244275072583L;
        int i2 = (int) (j3 >>> 32);
        int i3 = (int) ((j5 << 32) >>> 48);
        int i4 = (int) ((j5 << 48) >>> 48);
        long j6 = j3 ^ 105618882326085L;
        long j7 = j3 ^ 79288753046915L;
        Object objF = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(203788640370101820L, j3) /* invoke-custom */;
        try {
            objF = class_4587Var;
            class_4587 class_4587Var2 = objF;
            if (objF != 0) {
                try {
                    Intrinsics.checkNotNullParameter(objF, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32059, 3606703559837331960L ^ j3) /* invoke-custom */);
                    objF = f(j7);
                    if (objF == 0) {
                        return;
                    } else {
                        class_4587Var2 = class_4587Var;
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, 242953555293918002L, j3) /* invoke-custom */;
                }
            }
            class_4587Var2.method_46416(-r(i2, i3, (short) i4), -z(j6), -XT(j4));
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, 242953555293918002L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    public final void s(@NotNull class_4587 class_4587Var, long j2) {
        long j3 = m ^ j2;
        long j4 = j3 ^ 122866663846906L;
        long j5 = j3 ^ 134087558389377L;
        long j6 = j3 ^ 33856807316992L;
        int i2 = (int) (j3 >>> 32);
        int i3 = (int) ((j6 << 32) >>> 56);
        int i4 = (int) ((j6 << 40) >>> 40);
        long j7 = j3 ^ 5645280373763L;
        Object objF = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6101166318812223556L, j3) /* invoke-custom */;
        try {
            objF = class_4587Var;
            class_4587 class_4587Var2 = objF;
            if (objF != 0) {
                try {
                    Intrinsics.checkNotNullParameter(objF, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6824, 3744484228968742811L ^ j3) /* invoke-custom */);
                    objF = f(j7);
                    if (objF == 0) {
                        return;
                    } else {
                        class_4587Var2 = class_4587Var;
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, -6134067867975550286L, j3) /* invoke-custom */;
                }
            }
            class_4587Var2.method_46416(M(j4), -a(i2, (byte) i3, i4), -W(j5));
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, -6134067867975550286L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean F() {
        long j2 = m ^ 133488301247084L;
        long j3 = j2 ^ 4144679555749L;
        Object objV = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5536849976524423231L, j2) /* invoke-custom */;
        try {
            objV = K.v(j3);
            return objV != 0 ? objV == 0 : objV;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objV, -5574880191369256241L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean H() {
        long j2 = m ^ 90327126919405L;
        long j3 = j2 ^ 44580765454372L;
        Object objV = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1033572786415141568L, j2) /* invoke-custom */;
        try {
            objV = K.v(j3);
            return objV != 0 ? objV == 0 : objV;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objV, -1143026664351621042L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean Z() {
        long j2 = m ^ 52798110972392L;
        long j3 = j2 ^ 82086157754657L;
        Object objV = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-9174570054195311547L, j2) /* invoke-custom */;
        try {
            objV = K.v(j3);
            return objV != 0 ? objV == 0 : objV;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objV, -9140542055247523509L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean G() {
        long j2 = m ^ 87294328032108L;
        long j3 = j2 ^ 59141222159269L;
        Object objV = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8226139475115212481L, j2) /* invoke-custom */;
        try {
            objV = K.v(j3);
            return objV != 0 ? objV == 0 : objV;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objV, 8332286084368835535L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean i() {
        long j2 = m ^ 21330896734329L;
        long j3 = j2 ^ 116322015236272L;
        Object objV = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8159469495197597140L, j2) /* invoke-custom */;
        try {
            objV = K.v(j3);
            return objV != 0 ? objV == 0 : objV;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objV, 8122072665823387866L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean p() {
        long j2 = m ^ 9826678773727L;
        long j3 = j2 ^ 125631473028886L;
        Object objV = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3358095222043320946L, j2) /* invoke-custom */;
        try {
            objV = K.v(j3);
            return objV != 0 ? objV == 0 : objV;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objV, 3391630013586964348L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean T() {
        long j2 = m ^ 140501392532342L;
        long j3 = j2 ^ 5927851244479L;
        Object objV = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1887904247260976859L, j2) /* invoke-custom */;
        try {
            objV = K.v(j3);
            return objV != 0 ? objV == 0 : objV;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objV, 1997358125325372373L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean t() {
        long j2 = m ^ 22681616746229L;
        long j3 = j2 ^ 121005625679420L;
        Object objV = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4589244440472925016L, j2) /* invoke-custom */;
        try {
            objV = K.v(j3);
            return objV != 0 ? objV == 0 : objV;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objV, 4484285365923901014L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean C() {
        long j2 = m ^ 37796515565782L;
        long j3 = j2 ^ 97637609130015L;
        Object objV = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1615821121984862853L, j2) /* invoke-custom */;
        try {
            objV = K.v(j3);
            return objV != 0 ? objV == 0 : objV;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objV, -1722531162289096587L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean q() {
        long j2 = m ^ 135771002094393L;
        long j3 = j2 ^ 2021029174256L;
        Object objV = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8825975942926005908L, j2) /* invoke-custom */;
        try {
            objV = K.v(j3);
            return objV != 0 ? objV == 0 : objV;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objV, 8932623861964090266L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean l() {
        long j2 = m ^ 129295546745731L;
        long j3 = j2 ^ 16745536592714L;
        Object objV = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4235112872201696814L, j2) /* invoke-custom */;
        try {
            objV = K.v(j3);
            return objV != 0 ? objV == 0 : objV;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objV, 4273072717163883296L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean s() {
        long j2 = m ^ 33511687215030L;
        long j3 = j2 ^ 110877346254719L;
        Object objV = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1228551023223578085L, j2) /* invoke-custom */;
        try {
            objV = K.v(j3);
            return objV != 0 ? objV == 0 : objV;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objV, -1191084374659711211L, j2) /* invoke-custom */;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 20293;
        if (u[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) C.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    C.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                u[i3] = b(((Cipher) objArr[0]).doFinal(t[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/k9", e2);
            }
        }
        return u[i3];
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
            r1 = 1065353216(0x3f800000, float:1.0)
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
            java.lang.String r1 = "su/catlean/k9"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k9.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 28562;
        if (ab[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) I[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) fb.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/k9", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            ab[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return ab[i3].intValue();
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
            r1 = 1065353216(0x3f800000, float:1.0)
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
            java.lang.String r1 = "su/catlean/k9"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k9.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
