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
import kotlin.reflect.KProperty;
import net.minecraft.class_10055;
import net.minecraft.class_276;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.EntityAlphaEvent;
import su.catlean.api.event.events.render.FrameBufferEvent;
import su.catlean.api.event.events.render.RenderArmorEvent;
import su.catlean.api.event.events.render.RenderNameTagEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/k1.class */
public final class k1 extends _g {

    @NotNull
    public static final k1 B = null;
    static final KProperty[] W = null;

    @NotNull
    private static final cp P = null;

    @NotNull
    private static final cw C = null;

    @NotNull
    private static final cw J = null;

    @NotNull
    private static final cw f = null;

    @NotNull
    private static final cq Y = null;

    @NotNull
    private static final cq w = null;

    @NotNull
    private static final cq u = null;

    @NotNull
    private static final cq S = null;

    @NotNull
    private static final cq y = null;

    @NotNull
    private static final cq e = null;

    @NotNull
    private static final cs j = null;

    @NotNull
    private static final cs i = null;

    @NotNull
    private static final cs F = null;

    @NotNull
    private static final cs l = null;

    @NotNull
    private static final cs V = null;

    @NotNull
    private static final cs n = null;

    @NotNull
    private static final cs X = null;

    @NotNull
    private static final cs t = null;

    @NotNull
    private static final cs A = null;

    @NotNull
    private static final cs E = null;

    @NotNull
    private static final cs m = null;

    @NotNull
    private static final cq G = null;

    @NotNull
    private static final cq O = null;

    @NotNull
    private static final ct T = null;

    @NotNull
    private static final ct N = null;

    @NotNull
    private static final ct b = null;

    @NotNull
    private static final ct L = null;

    @NotNull
    private static final ct k = null;

    @NotNull
    private static final cs h = null;

    @NotNull
    private static final c8 g = null;

    @NotNull
    private static final ct a = null;

    @NotNull
    private static final ct U = null;

    @NotNull
    private static final ct o = null;

    @NotNull
    private static final ct d = null;

    @NotNull
    private static final ct D = null;

    @NotNull
    private static final c8 c = null;

    @NotNull
    private static final c8 I = null;

    @NotNull
    private static final iv z = null;
    private static final long x = 0;
    private static final String[] K = null;
    private static final String[] ab = null;
    private static final Map fb = null;
    private static final long[] gb = null;
    private static final Integer[] hb = null;
    private static final Map lb = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private k1(long j2) {
        long j3 = x ^ j2;
        super((String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11208, 7117633612204861409L ^ j3) /* invoke-custom */, jt.z(), null, 4, null, j3 ^ 29820996560138L);
    }

    private final h js(int i2, char c2, int i3) {
        return (h) P.E(this, ((((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ x) ^ 31819984950096L, W[0]);
    }

    private final s8 x(long j2) {
        return (s8) C.E(this, (x ^ j2) ^ 56857272790945L, W[1]);
    }

    private final rw j_(long j2) {
        return (rw) J.E(this, (x ^ j2) ^ 115233318009398L, W[2]);
    }

    private final sa z(char c2, int i2, short s) {
        return (sa) f.E(this, ((((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s) << 48) >>> 48)) ^ x) ^ 59212504039281L, W[3]);
    }

    private final void O(long j2, sa saVar) {
        f.b(this, (x ^ j2) ^ 65576613753327L, W[3], saVar);
    }

    private final boolean Q(long j2) {
        return ((Boolean) Y.E(this, (x ^ j2) ^ 75256188814054L, W[4])).booleanValue();
    }

    private final void p(char c2, int i2, char c3, boolean z2) {
        Y.b(this, ((((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c3) << 48) >>> 48)) ^ x) ^ 40392911147673L, W[4], Boolean.valueOf(z2));
    }

    private final boolean jE(long j2) {
        return ((Boolean) w.E(this, (x ^ j2) ^ 118108031461553L, W[5])).booleanValue();
    }

    private final void o(long j2, boolean z2) {
        w.b(this, (x ^ j2) ^ 32107338748722L, W[5], Boolean.valueOf(z2));
    }

    private final boolean j3(long j2) {
        long j3 = x ^ j2;
        return ((Boolean) u.E(this, j3 ^ 68688347853643L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15702, 2271196357081117148L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void v(long j2, boolean z2) {
        long j3 = x ^ j2;
        u.b(this, j3 ^ 43384803696646L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17783, 6482461290658696569L ^ j3) /* invoke-custom */], Boolean.valueOf(z2));
    }

    private final boolean r(long j2) {
        long j3 = x ^ j2;
        return ((Boolean) S.E(this, j3 ^ 32818682252079L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21826, 2108504090732257675L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void E(boolean z2, long j2) {
        long j3 = x ^ j2;
        S.b(this, j3 ^ 20965324834218L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21826, 2108478954630052066L ^ j3) /* invoke-custom */], Boolean.valueOf(z2));
    }

    private final boolean jg(int i2, short s, short s2) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ x;
        return ((Boolean) y.E(this, j2 ^ 52772522247641L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22659, 4643681625193243320L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final void Y(boolean z2, long j2, char c2) {
        long j3 = ((j2 << 16) | ((((long) c2) << 48) >>> 48)) ^ x;
        y.b(this, j3 ^ 81294067165930L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4180, 94225956376941214L ^ j3) /* invoke-custom */], Boolean.valueOf(z2));
    }

    private final boolean jX(long j2) {
        long j3 = x ^ j2;
        return ((Boolean) e.E(this, j3 ^ 69098957307468L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16058, 2332597783492050741L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void x(long j2, boolean z2) {
        long j3 = x ^ j2;
        e.b(this, j3 ^ 24270240737361L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21901, 5487644048406566360L ^ j3) /* invoke-custom */], Boolean.valueOf(z2));
    }

    private final Color jf(long j2) {
        long j3 = x ^ j2;
        return (Color) j.E(this, j3 ^ 904753025677L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18514, 4433407921325647112L ^ j3) /* invoke-custom */]);
    }

    private final Color jo(long j2) {
        long j3 = x ^ j2;
        return (Color) i.E(this, j3 ^ 82886359852975L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20537, 1268974094184351833L ^ j3) /* invoke-custom */]);
    }

    private final Color i(long j2) {
        long j3 = x ^ j2;
        return (Color) F.E(this, j3 ^ 106891294375867L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28516, 1998341907909111591L ^ j3) /* invoke-custom */]);
    }

    private final Color q(long j2) {
        long j3 = x ^ j2;
        return (Color) l.E(this, j3 ^ 124467778585772L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7890, 3105150817068639636L ^ j3) /* invoke-custom */]);
    }

    private final Color H(long j2, char c2) {
        long j3 = ((j2 << 16) | ((((long) c2) << 48) >>> 48)) ^ x;
        return (Color) V.E(this, j3 ^ 70921953752434L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1044, 3445168091295043243L ^ j3) /* invoke-custom */]);
    }

    private final Color je(long j2) {
        long j3 = x ^ j2;
        return (Color) n.E(this, j3 ^ 91613776621432L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8084, 3177648002275626795L ^ j3) /* invoke-custom */]);
    }

    private final Color W(long j2) {
        long j3 = x ^ j2;
        return (Color) X.E(this, j3 ^ 115810047998101L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27139, 4561399001013726548L ^ j3) /* invoke-custom */]);
    }

    private final Color A(long j2) {
        long j3 = x ^ j2;
        return (Color) t.E(this, j3 ^ 57956810001126L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30372, 6527335897035867067L ^ j3) /* invoke-custom */]);
    }

    private final Color jC(long j2) {
        long j3 = x ^ j2;
        return (Color) A.E(this, j3 ^ 94476315060262L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12420, 4720613078016075643L ^ j3) /* invoke-custom */]);
    }

    private final Color ji(long j2) {
        long j3 = x ^ j2;
        return (Color) E.E(this, j3 ^ 83050998985595L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14030, 1216262162867436102L ^ j3) /* invoke-custom */]);
    }

    private final Color E(long j2) {
        long j3 = x ^ j2;
        return (Color) m.E(this, j3 ^ 78907196244908L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27383, 5716816807075550961L ^ j3) /* invoke-custom */]);
    }

    private final boolean t(long j2) {
        long j3 = x ^ j2;
        return ((Boolean) G.E(this, j3 ^ 89345144203802L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19534, 1947186246185064833L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void B(long j2, boolean z2) {
        long j3 = x ^ j2;
        G.b(this, j3 ^ 80375172470700L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32526, 1112354321902141599L ^ j3) /* invoke-custom */], Boolean.valueOf(z2));
    }

    private final boolean jp(long j2) {
        long j3 = x ^ j2;
        return ((Boolean) O.E(this, j3 ^ 30942624510716L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4991, 3258553466978606662L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void V(char c2, int i2, boolean z2, char c3) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c3) << 48) >>> 48)) ^ x;
        O.b(this, j2 ^ 83624837435362L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7926, 577163389205657883L ^ j2) /* invoke-custom */], Boolean.valueOf(z2));
    }

    private final float jd(int i2, char c2, short s) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ x;
        return ((Number) T.E(this, j2 ^ 94719173819009L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23355, 7789709204196613706L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final void s(byte b2, int i2, float f2, int i3) {
        long j2 = (((((long) b2) << 56) | ((((long) i2) << 32) >>> 8)) | ((((long) i3) << 40) >>> 40)) ^ x;
        T.b(this, j2 ^ 12345653264413L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8199, 6949181162201925688L ^ j2) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float Z(byte b2, long j2) {
        long j3 = ((((long) b2) << 56) | ((j2 << 8) >>> 8)) ^ x;
        return ((Number) N.E(this, j3 ^ 30486870997441L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31083, 8066579773655334772L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void n(float f2, long j2) {
        long j3 = x ^ j2;
        N.b(this, j3 ^ 133675031182876L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28371, 6679967761122867452L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float jK(long j2) {
        long j3 = x ^ j2;
        return ((Number) b.E(this, j3 ^ 72005285178228L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3169, 6440781558568982752L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void C(int i2, float f2, int i3, int i4) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) i4) << 48) >>> 48)) ^ x;
        b.b(this, j2 ^ 43676943827478L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3169, 6440731872273376878L ^ j2) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float G(long j2) {
        long j3 = x ^ j2;
        return ((Number) L.E(this, j3 ^ 84241526725686L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20162, 5068199126044355840L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void H(long j2, float f2) {
        long j3 = x ^ j2;
        L.b(this, j3 ^ 3054348014985L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18157, 4891273883978414969L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float l(long j2) {
        long j3 = x ^ j2;
        return ((Number) k.E(this, j3 ^ 19734334629513L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(340, 9107630157267605554L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void X(float f2, char c2, int i2, int i3) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ x;
        k.b(this, j2 ^ 21680919116329L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31346, 6016877312588769388L ^ j2) /* invoke-custom */], Float.valueOf(f2));
    }

    private final Color jy(long j2) {
        long j3 = x ^ j2;
        return (Color) h.E(this, j3 ^ 115982188371513L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7369, 4525412030860082470L ^ j3) /* invoke-custom */]);
    }

    private final int M(long j2) {
        long j3 = x ^ j2;
        return ((Number) g.E(this, j3 ^ 37295893021763L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4347, 8147445232520719183L ^ j3) /* invoke-custom */])).intValue();
    }

    private final void s(long j2, int i2) {
        long j3 = x ^ j2;
        g.b(this, j3 ^ 14824053898791L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4347, 8147454973426403015L ^ j3) /* invoke-custom */], Integer.valueOf(i2));
    }

    private final float jw(long j2) {
        long j3 = x ^ j2;
        return ((Number) a.E(this, j3 ^ 133969638690703L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10041, 1164220323687978850L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void f(long j2, float f2) {
        long j3 = x ^ j2;
        a.b(this, j3 ^ 139188290759839L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31158, 8520779929006390557L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float Y(long j2) {
        long j3 = x ^ j2;
        return ((Number) U.E(this, j3 ^ 35265482861626L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27411, 1208429043592870103L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void S(long j2, float f2) {
        long j3 = x ^ j2;
        U.b(this, j3 ^ 52178242813110L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30908, 518534296836844573L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float j(long j2) {
        long j3 = x ^ j2;
        return ((Number) o.E(this, j3 ^ 27393534612987L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24357, 3164565601484666229L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void z(float f2, long j2) {
        long j3 = x ^ j2;
        o.b(this, j3 ^ 87456957085652L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5976, 2020711664354838704L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float jS(long j2) {
        long j3 = x ^ j2;
        return ((Number) d.E(this, j3 ^ 39773879501734L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18499, 906739911785329676L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void u(long j2, float f2, short s) {
        long j3 = ((j2 << 16) | ((((long) s) << 48) >>> 48)) ^ x;
        d.b(this, j3 ^ 92118875948357L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16906, 8315490664167862083L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float n(long j2) {
        long j3 = x ^ j2;
        return ((Number) D.E(this, j3 ^ 42032773345930L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9988, 8538352761819753058L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void w(long j2, float f2) {
        long j3 = x ^ j2;
        D.b(this, j3 ^ 110353859837775L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9988, 8538302672094081099L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final int K(int i2, byte b2, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i3) << 40) >>> 40)) ^ x;
        return ((Number) c.E(this, j2 ^ 32257528614273L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32417, 8369281390082411762L ^ j2) /* invoke-custom */])).intValue();
    }

    private final void p(int i2, char c2, short s, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ x;
        c.b(this, j2 ^ 54903987592069L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32417, 8369289383077661978L ^ j2) /* invoke-custom */], Integer.valueOf(i3));
    }

    private final int p(long j2) {
        long j3 = x ^ j2;
        return ((Number) I.E(this, j3 ^ 72733669808921L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29995, 4260910242299138519L ^ j3) /* invoke-custom */])).intValue();
    }

    private final void B(int i2, long j2) {
        long j3 = x ^ j2;
        I.b(this, j3 ^ 4531156159782L, W[(int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29995, 4260889611399598084L ^ j3) /* invoke-custom */], Integer.valueOf(i2));
    }

    @NotNull
    public final iv L() {
        return z;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:17:0x0165
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void T(su.catlean.api.event.events.render.Render3DEvent r19) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.T(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.api.event.events.render.RenderNameTagEvent] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow
    private final void w(RenderNameTagEvent renderNameTagEvent) {
        long j2 = x ^ 115806739176476L;
        long j3 = j2 ^ 57495998241591L;
        ?? r0 = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4775145779956734482L, j2) /* invoke-custom */;
        try {
            try {
                r0 = renderNameTagEvent.getState() instanceof class_10055;
                ?? C2 = r0;
                if (r0 != 0) {
                    if (r0 == 0) {
                        return;
                    } else {
                        C2 = r(j3);
                    }
                }
                try {
                    if (r0 != 0) {
                        if (C2 == 0) {
                            return;
                        } else {
                            C2 = z.C();
                        }
                    }
                    if (C2 != 0) {
                        try {
                            C2 = renderNameTagEvent;
                            C2.cancel();
                        } catch (NumberFormatException unused) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(C2, 4774022900929362663L, j2) /* invoke-custom */;
                        }
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(C2, 4774022900929362663L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 4774022900929362663L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 4774022900929362663L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0157: INVOKE (r-1 I:su.catlean.fr), (r0 I:long), (r1 I:net.minecraft.class_332), (r2 I:java.awt.Color), (r3 I:java.awt.Color) VIRTUAL call: su.catlean.fr.w(long, net.minecraft.class_332, java.awt.Color, java.awt.Color):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void c(su.catlean.api.event.events.render.Render2DEvent r26) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.c(su.catlean.api.event.events.render.Render2DEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean.k1] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.k1] */
    @Flow
    private final void y(RenderArmorEvent renderArmorEvent) {
        long j2 = x ^ 93239173077249L;
        long j3 = j2 ^ 10812056559146L;
        long j4 = j2 ^ 137170682900275L;
        Object objR = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(515221624737056743L, j2) /* invoke-custom */;
        try {
            objR = this;
            Object objC = objR;
            if (objR == 0) {
                try {
                    objR = objR.r(j3);
                    if (objR == 0) {
                        return;
                    } else {
                        objC = this;
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objR, 530722268548841466L, j2) /* invoke-custom */;
                }
            }
            try {
                try {
                    if (objC.j_(j4) == rw.MIRROR) {
                        objC = z.C();
                        if (objC == 0) {
                            renderArmorEvent.cancel();
                        }
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objC, 530722268548841466L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objC, 530722268548841466L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objR, 530722268548841466L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean.k1] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.k1] */
    @Flow
    private final void p(EntityAlphaEvent entityAlphaEvent) {
        long j2 = x ^ 13069390546547L;
        long j3 = j2 ^ 95638106767704L;
        long j4 = j2 ^ 39511861506113L;
        Object objR = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2858606568958158699L, j2) /* invoke-custom */;
        try {
            objR = this;
            Object objC = objR;
            if (objR == 0) {
                try {
                    objR = objR.r(j3);
                    if (objR == 0) {
                        return;
                    } else {
                        objC = this;
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objR, -2868830099194126200L, j2) /* invoke-custom */;
                }
            }
            try {
                try {
                    if (objC.j_(j4) == rw.MIRROR) {
                        objC = z.C();
                        if (objC == 0) {
                            entityAlphaEvent.setAlpha(0.0f);
                            entityAlphaEvent.cancel();
                        }
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objC, -2868830099194126200L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objC, -2868830099194126200L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objR, -2868830099194126200L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.iv] */
    /* JADX WARN: Type inference failed for: r0v14, types: [su.catlean.iv] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.api.event.events.render.FrameBufferEvent] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Flow
    private final void P(FrameBufferEvent frameBufferEvent) {
        long j2 = x ^ 44013327416412L;
        long j3 = j2 ^ 128772409850743L;
        Object obj = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6738770849002036550L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    if (r(j3)) {
                        obj = z;
                        Object obj2 = obj;
                        if (obj == 0) {
                            if (obj.d() == null) {
                                return;
                            } else {
                                obj2 = z;
                            }
                        }
                        try {
                            if (obj2.C()) {
                                frameBufferEvent.setFrameBuffer((class_276) z.d());
                                obj2 = frameBufferEvent;
                                obj2.cancel();
                            }
                        } catch (NumberFormatException unused) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, -6773134717521061209L, j2) /* invoke-custom */;
                        }
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6773134717521061209L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6773134717521061209L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6773134717521061209L, j2) /* invoke-custom */;
        }
    }

    @Flow
    private final void T(PlayerUpdateEvent playerUpdateEvent) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private static final boolean g() {
        long j2 = x ^ 19630789513755L;
        long j3 = j2 ^ 64257871525550L;
        long j4 = j2 ^ 23553244093689L;
        Object objJE = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(881626084829515005L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    objJE = B.jE(j3);
                    if (objJE != 0) {
                        return objJE;
                    }
                    if (objJE == 0) {
                        boolean zQ = B.Q(j4);
                        if (objJE != 0) {
                            return zQ;
                        }
                        if (!zQ) {
                            return false;
                        }
                    }
                    return true;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objJE, 884891361093367008L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objJE, 884891361093367008L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objJE, 884891361093367008L, j2) /* invoke-custom */;
        }
    }

    private static final boolean C() {
        return B.r((x ^ 97326605424172L) ^ 6172182466823L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
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
    private static final boolean B() {
        /*
            long r0 = su.catlean.k1.x
            r1 = 41577027258552(0x25d067f0c8b8, double:2.05417808246556E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 132808591855507(0x78c9e8f0cf93, double:6.56161627083576E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 15242871013002(0xddd01e97e8a, double:7.5309789115136E-311)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -7593317143358744994(0x969f1e4a0b37d65e, double:-1.0163399402094955E-199)
            r1 = r7
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L38
            r1 = r13
            if (r1 != 0) goto L52
            r1 = r11
            su.catlean.rw r0 = r0.j_(r1)     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            su.catlean.rw r1 = su.catlean.rw.DOUBLE     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            if (r0 != r1) goto L6f
            goto L42
        L38:
            r1 = -7573664739352072637(0x96e4f00beb04ae43, double:-2.1882728021644588E-198)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L48
            throw r0     // Catch: java.lang.NumberFormatException -> L48
        L42:
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L48
            goto L52
        L48:
            r1 = -7573664739352072637(0x96e4f00beb04ae43, double:-2.1882728021644588E-198)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r1 = r9
            boolean r0 = r0.r(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = -7573664739352072637(0x96e4f00beb04ae43, double:-2.1882728021644588E-198)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.B():boolean");
    }

    private static final boolean v() {
        long j2 = x ^ 14824512514989L;
        long j3 = j2 ^ 108044874277488L;
        return B.jg((int) (j2 >>> 32), (short) ((j3 << 32) >>> 48), (short) ((j3 << 48) >>> 48));
    }

    private static final boolean j9() {
        return B.r((x ^ 32701063497764L) ^ 71074197147407L);
    }

    private static final boolean P() {
        long j2 = x ^ 43067144762348L;
        long j3 = j2 ^ 79254633708081L;
        return B.jg((int) (j2 >>> 32), (short) ((j3 << 32) >>> 48), (short) ((j3 << 48) >>> 48));
    }

    private static final boolean a() {
        long j2 = x ^ 112712920650339L;
        long j3 = j2 ^ 10706079210430L;
        return B.jg((int) (j2 >>> 32), (short) ((j3 << 32) >>> 48), (short) ((j3 << 48) >>> 48));
    }

    private static final boolean D() {
        return B.jE((x ^ 52575539503756L) ^ 4924850849337L);
    }

    private static final boolean T() {
        return B.jE((x ^ 93364820964558L) ^ 139919923843195L);
    }

    private static final boolean h() {
        return B.jE((x ^ 77047482351581L) ^ 120639565831016L);
    }

    private static final boolean jY() {
        return B.jE((x ^ 88072268057581L) ^ 136006479638360L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
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
    private static final boolean j6() {
        /*
            long r0 = su.catlean.k1.x
            r1 = 116849527184004(0x6a46268f5a84, double:5.7731337114409E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 60884006165935(0x375fa98f5daf, double:3.0080695827775E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 72890973613238(0x424b4096ecb6, double:3.60129259542217E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 334200803936453730(0x4a351dc4a484462, double:2.5375583088816913E-286)
            r1 = r7
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L38
            r1 = r13
            if (r1 != 0) goto L52
            r1 = r11
            su.catlean.rw r0 = r0.j_(r1)     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            su.catlean.rw r1 = su.catlean.rw.MIRROR     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            if (r0 != r1) goto L6f
            goto L42
        L38:
            r1 = 349239655012187263(0x4d8bf9daa7b3c7f, double:2.6004768548979495E-285)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L48
            throw r0     // Catch: java.lang.NumberFormatException -> L48
        L42:
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L48
            goto L52
        L48:
            r1 = 349239655012187263(0x4d8bf9daa7b3c7f, double:2.6004768548979495E-285)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r1 = r9
            boolean r0 = r0.r(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = 349239655012187263(0x4d8bf9daa7b3c7f, double:2.6004768548979495E-285)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.j6():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
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
    private static final boolean jx() {
        /*
            long r0 = su.catlean.k1.x
            r1 = 12668811605795(0xb85b003f723, double:6.259224588058E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 95229072109576(0x569c3f03f008, double:4.70494130146803E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 39070614569233(0x2388d61a4111, double:1.93034484205625E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -6267831867986875963(0xa904301fdcc4e9c5, double:-4.197247773962086E-111)
            r1 = r7
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L38
            r1 = r13
            if (r1 != 0) goto L52
            r1 = r11
            su.catlean.rw r0 = r0.j_(r1)     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            su.catlean.rw r1 = su.catlean.rw.MIRROR     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            if (r0 != r1) goto L6f
            goto L42
        L38:
            r1 = -6233018862926327336(0xa97fde5e3cf791d8, double:-8.480957960333413E-109)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L48
            throw r0     // Catch: java.lang.NumberFormatException -> L48
        L42:
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L48
            goto L52
        L48:
            r1 = -6233018862926327336(0xa97fde5e3cf791d8, double:-8.480957960333413E-109)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r1 = r9
            boolean r0 = r0.r(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = -6233018862926327336(0xa97fde5e3cf791d8, double:-8.480957960333413E-109)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.jx():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
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
    private static final boolean jU() {
        /*
            long r0 = su.catlean.k1.x
            r1 = 6536060309037(0x5f1cb8d8e2d, double:3.2292428578417E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 97754605783302(0x58e8448d8906, double:4.82971924402836E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 50563267180575(0x2dfcad94381f, double:2.49815732554143E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -3455881131964329781(0xd00a3e6ba74a90cb, double:-3.798534905025299E77)
            r1 = r7
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L38
            r1 = r13
            if (r1 != 0) goto L52
            r1 = r11
            su.catlean.rw r0 = r0.j_(r1)     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            su.catlean.rw r1 = su.catlean.rw.BLOOM     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            if (r0 != r1) goto L6f
            goto L42
        L38:
            r1 = -3426728961445861162(0xd071d02a4779e8d6, double:-3.300194064683328E79)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L48
            throw r0     // Catch: java.lang.NumberFormatException -> L48
        L42:
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L48
            goto L52
        L48:
            r1 = -3426728961445861162(0xd071d02a4779e8d6, double:-3.300194064683328E79)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r1 = r9
            boolean r0 = r0.r(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = -3426728961445861162(0xd071d02a4779e8d6, double:-3.300194064683328E79)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.jU():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
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
    private static final boolean e() {
        /*
            long r0 = su.catlean.k1.x
            r1 = 3305138042892(0x3018994380c, double:1.632955161756E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 103457282604839(0x5e1806943f27, double:5.111468914714E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 47334558633534(0x2b0cef8d8e3e, double:2.33863792818873E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 7373751155523845634(0x6654d39baf1ffe02, double:8.849436395209521E184)
            r1 = r7
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L38
            r1 = r13
            if (r1 == 0) goto L52
            r1 = r11
            su.catlean.rw r0 = r0.j_(r1)     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            su.catlean.rw r1 = su.catlean.rw.BLOOM     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            if (r0 != r1) goto L6f
            goto L42
        L38:
            r1 = 7372628821886918391(0x6650d6da05605ef7, double:7.155178405658834E184)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L48
            throw r0     // Catch: java.lang.NumberFormatException -> L48
        L42:
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L48
            goto L52
        L48:
            r1 = 7372628821886918391(0x6650d6da05605ef7, double:7.155178405658834E184)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r1 = r9
            boolean r0 = r0.r(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 == 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = 7372628821886918391(0x6650d6da05605ef7, double:7.155178405658834E184)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.e():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
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
            long r0 = su.catlean.k1.x
            r1 = 73833581567687(0x4326b866dec7, double:3.64786361620116E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 33256861260268(0x1e3f3766d9ec, double:1.6431072637207E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 117836160657653(0x6b2bde7f68f5, double:5.8218798818776E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -9178455077228308279(0x809f93bc9eed18c9, double:-1.1241819645486758E-305)
            r1 = r7
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L38
            r1 = r13
            if (r1 == 0) goto L52
            r1 = r11
            su.catlean.rw r0 = r0.j_(r1)     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            su.catlean.rw r1 = su.catlean.rw.BLOOM     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            if (r0 != r1) goto L6f
            goto L42
        L38:
            r1 = -9179577401211701188(0x809b96fd3492b83c, double:-9.822295232819524E-306)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L48
            throw r0     // Catch: java.lang.NumberFormatException -> L48
        L42:
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L48
            goto L52
        L48:
            r1 = -9179577401211701188(0x809b96fd3492b83c, double:-9.822295232819524E-306)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r1 = r9
            boolean r0 = r0.r(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 == 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = -9179577401211701188(0x809b96fd3492b83c, double:-9.822295232819524E-306)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.F():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean jn() {
        /*
            long r0 = su.catlean.k1.x
            r1 = 19106603965606(0x11609a579ca6, double:9.4399166281E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 63144547199636(0x396dfc4e2a94, double:3.1197551493541E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r0 = -4431213300989001152(0xc2812afaf6908240, double:-2.3595370951842812E12)
            r1 = r7
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r11 = r0
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L30
            r1 = r9
            su.catlean.rw r0 = r0.j_(r1)     // Catch: java.lang.NumberFormatException -> L30
            su.catlean.rw r1 = su.catlean.rw.DEFAULT     // Catch: java.lang.NumberFormatException -> L30
            r2 = r11
            if (r2 != 0) goto L51
            if (r0 == r1) goto L54
            goto L3a
        L30:
            r1 = -4396985778356094371(0xc2fac4bb16a3fa5d, double:-4.709160757656698E14)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L3a:
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L47
            r1 = r9
            su.catlean.rw r0 = r0.j_(r1)     // Catch: java.lang.NumberFormatException -> L47
            su.catlean.rw r1 = su.catlean.rw.BLOOM     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = -4396985778356094371(0xc2fac4bb16a3fa5d, double:-4.709160757656698E14)
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
            r1 = -4396985778356094371(0xc2fac4bb16a3fa5d, double:-4.709160757656698E14)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.jn():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.rw] */
    private static final boolean w() {
        long j2 = x ^ 92526059487508L;
        Object objJ_ = j2;
        try {
            objJ_ = B.j_(objJ_ ^ 136526288729894L);
            return objJ_ == rw.MIRROR;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objJ_, -2357491479521466385L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
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
    private static final boolean jF() {
        /*
            long r0 = su.catlean.k1.x
            r1 = 133271573641993(0x7935b4ce3b09, double:6.58449061037105E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 39772400532514(0x242c3bce3c22, double:1.96501767557533E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 89304497360187(0x5138d2d78d3b, double:4.41222841647887E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 7290838169770599919(0x652e42afd80925ef, double:2.4524687086566993E179)
            r1 = r7
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L38
            r1 = r13
            if (r1 != 0) goto L52
            r1 = r11
            su.catlean.rw r0 = r0.j_(r1)     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            su.catlean.rw r1 = su.catlean.rw.DOUBLE     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            if (r0 != r1) goto L6f
            goto L42
        L38:
            r1 = 7301932509996670450(0x6555acee383a5df2, double:1.4053572808271335E180)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L48
            throw r0     // Catch: java.lang.NumberFormatException -> L48
        L42:
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L48
            goto L52
        L48:
            r1 = 7301932509996670450(0x6555acee383a5df2, double:1.4053572808271335E180)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r1 = r9
            boolean r0 = r0.r(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = 7301932509996670450(0x6555acee383a5df2, double:1.4053572808271335E180)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.jF():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
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
            long r0 = su.catlean.k1.x
            r1 = 16594720061047(0xf17c264f677, double:8.198881084516E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 90221381480796(0x520e4d64f15c, double:4.4575285109999E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 42995382304837(0x271aa47d4045, double:2.12425413266306E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -6318492494075795311(0xa850348daea3e891, double:-1.6451230242293396E-114)
            r1 = r7
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L38
            r1 = r13
            if (r1 != 0) goto L52
            r1 = r11
            su.catlean.rw r0 = r0.j_(r1)     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            su.catlean.rw r1 = su.catlean.rw.DOUBLE     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            if (r0 != r1) goto L6f
            goto L42
        L38:
            r1 = -6328724280312819572(0xa82bdacc4e90908c, double:-3.53467788377981E-115)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L48
            throw r0     // Catch: java.lang.NumberFormatException -> L48
        L42:
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L48
            goto L52
        L48:
            r1 = -6328724280312819572(0xa82bdacc4e90908c, double:-3.53467788377981E-115)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r1 = r9
            boolean r0 = r0.r(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = -6328724280312819572(0xa82bdacc4e90908c, double:-3.53467788377981E-115)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.R():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
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
    private static final boolean V() {
        /*
            long r0 = su.catlean.k1.x
            r1 = 32262158448661(0x1d579e7e7815, double:1.59396241501703E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 70704045129534(0x404e117e7f3e, double:3.4932439720512E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 58664830881319(0x355af867ce27, double:2.89842775575464E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 2752304988259182323(0x263226cdf2b966f3, double:1.0725961612592268E-124)
            r1 = r7
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L38
            r1 = r13
            if (r1 != 0) goto L52
            r1 = r11
            su.catlean.rw r0 = r0.j_(r1)     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            su.catlean.rw r1 = su.catlean.rw.DOUBLE     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            if (r0 != r1) goto L6f
            goto L42
        L38:
            r1 = 2758956750673157870(0x2649c88c128a1eee, double:3.0471355387246293E-124)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L48
            throw r0     // Catch: java.lang.NumberFormatException -> L48
        L42:
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L48
            goto L52
        L48:
            r1 = 2758956750673157870(0x2649c88c128a1eee, double:3.0471355387246293E-124)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r1 = r9
            boolean r0 = r0.r(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = 2758956750673157870(0x2649c88c128a1eee, double:3.0471355387246293E-124)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.V():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
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
            long r0 = su.catlean.k1.x
            r1 = 137572805392428(0x7d1f2a32382c, double:6.7969996946402E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 35212913426183(0x2006a5323f07, double:1.7397490813859E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 93537075695134(0x55124c2b8e1e, double:4.6213455713418E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 7353048354847532746(0x660b468546f526ca, double:3.6217597497164633E183)
            r1 = r7
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L38
            r1 = r13
            if (r1 != 0) goto L52
            r1 = r11
            su.catlean.rw r0 = r0.j_(r1)     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            su.catlean.rw r1 = su.catlean.rw.DOUBLE     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            if (r0 != r1) goto L6f
            goto L42
        L38:
            r1 = 7381585351825317591(0x6670a8c4a6c65ed7, double:2.831475506909083E185)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L48
            throw r0     // Catch: java.lang.NumberFormatException -> L48
        L42:
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L48
            goto L52
        L48:
            r1 = 7381585351825317591(0x6670a8c4a6c65ed7, double:2.831475506909083E185)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r1 = r9
            boolean r0 = r0.r(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = 7381585351825317591(0x6670a8c4a6c65ed7, double:2.831475506909083E185)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.I():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
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
    private static final boolean jl() {
        /*
            long r0 = su.catlean.k1.x
            r1 = 30266577595996(0x1b86fc9b2e5c, double:1.495367620737E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 77650653292919(0x469f739b2977, double:3.83645201691607E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 56674685720686(0x338b9a82986e, double:2.80010152034404E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 8105107261436473530(0x707b201c905c30ba, double:6.738036787142593E233)
            r1 = r7
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L38
            r1 = r13
            if (r1 != 0) goto L52
            r1 = r11
            su.catlean.rw r0 = r0.j_(r1)     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            su.catlean.rw r1 = su.catlean.rw.DOUBLE     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            if (r0 != r1) goto L6f
            goto L42
        L38:
            r1 = 8070677432961550503(0x7000ce5d706f48a7, double:3.261474363924771E231)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L48
            throw r0     // Catch: java.lang.NumberFormatException -> L48
        L42:
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L48
            goto L52
        L48:
            r1 = 8070677432961550503(0x7000ce5d706f48a7, double:3.261474363924771E231)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r1 = r9
            boolean r0 = r0.r(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = 8070677432961550503(0x7000ce5d706f48a7, double:3.261474363924771E231)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.jl():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
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
    private static final boolean jQ() {
        /*
            long r0 = su.catlean.k1.x
            r1 = 30356676410595(0x1b9bf6e9fce3, double:1.49981909363944E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 77526205070280(0x468279e9fbc8, double:3.8303034577669E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 56721769777873(0x339690f04ad1, double:2.80242778185633E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -6720554810268828947(0xa2bbcb01d0623aed, double:-2.2791736654167418E-141)
            r1 = r7
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L38
            r1 = r13
            if (r1 == 0) goto L52
            r1 = r11
            su.catlean.rw r0 = r0.j_(r1)     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            su.catlean.rw r1 = su.catlean.rw.DOUBLE     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            if (r0 != r1) goto L6f
            goto L42
        L38:
            r1 = -6719425342691501544(0xa2bfce407a1d9a18, double:-2.6082343699695148E-141)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L48
            throw r0     // Catch: java.lang.NumberFormatException -> L48
        L42:
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L48
            goto L52
        L48:
            r1 = -6719425342691501544(0xa2bfce407a1d9a18, double:-2.6082343699695148E-141)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r1 = r9
            boolean r0 = r0.r(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 == 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = -6719425342691501544(0xa2bfce407a1d9a18, double:-2.6082343699695148E-141)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.jQ():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.k1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
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
    private static final boolean s() {
        /*
            long r0 = su.catlean.k1.x
            r1 = 32920995504915(0x1df1043e2313, double:1.62651329058726E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 71367512695864(0x40e88b3e2438, double:3.52602362521654E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 59358094791969(0x35fc62279521, double:2.93267954393E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 9028535738021831965(0x7d4bcd6b22b5e51d, double:3.5513076847290156E295)
            r1 = r7
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L38
            r1 = r13
            if (r1 == 0) goto L52
            r1 = r11
            su.catlean.rw r0 = r0.j_(r1)     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            su.catlean.rw r1 = su.catlean.rw.DOUBLE     // Catch: java.lang.NumberFormatException -> L38 java.lang.NumberFormatException -> L48
            if (r0 != r1) goto L6f
            goto L42
        L38:
            r1 = 9029655862910273000(0x7d4fc82a88ca45e8, double:4.059622091686599E295)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L48
            throw r0     // Catch: java.lang.NumberFormatException -> L48
        L42:
            su.catlean.k1 r0 = su.catlean.k1.B     // Catch: java.lang.NumberFormatException -> L48
            goto L52
        L48:
            r1 = 9029655862910273000(0x7d4fc82a88ca45e8, double:4.059622091686599E295)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r1 = r9
            boolean r0 = r0.r(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 == 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = 9029655862910273000(0x7d4fc82a88ca45e8, double:4.059622091686599E295)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.s():boolean");
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 14737;
        if (ab[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) fb.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                ab[i3] = b(((Cipher) objArr[0]).doFinal(K[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/k1", e2);
            }
        }
        return ab[i3];
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
            r1 = 5
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
            java.lang.String r1 = "su/catlean/k1"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 13293;
        if (hb[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) gb[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) lb.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/k1", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            hb[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return hb[i3].intValue();
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
            r1 = 5
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
            java.lang.String r1 = "su/catlean/k1"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k1.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
