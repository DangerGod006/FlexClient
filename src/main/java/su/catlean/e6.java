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
import net.minecraft.class_5904;
import net.minecraft.class_9998;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.GetFogBufferEvent;
import su.catlean.api.event.GofraState;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.render.BossBarRenderEvent;
import su.catlean.api.event.events.render.DarknessEffectEvent;
import su.catlean.api.event.events.render.HurtTiltEvent;
import su.catlean.api.event.events.render.ItemNameRenderEvent;
import su.catlean.api.event.events.render.MapRenderEvent;
import su.catlean.api.event.events.render.NauseaRenderEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.api.event.events.render.RenderArmorEvent;
import su.catlean.api.event.events.render.RenderFireOnEntityEvent;
import su.catlean.api.event.events.render.RenderFireOverlayEvent;
import su.catlean.api.event.events.render.RenderGuiBackgroundEvent;
import su.catlean.api.event.events.render.RenderInWallOverlayEvent;
import su.catlean.api.event.events.render.RenderNameTagEvent;
import su.catlean.api.event.events.render.RenderPortalOverlayEvent;
import su.catlean.api.event.events.render.RenderSpawnerEntityEvent;
import su.catlean.api.event.events.render.RenderUnderwaterOverlayEvent;
import su.catlean.api.event.events.render.RenderVignetteOverlayEvent;
import su.catlean.api.event.events.render.ScoreBoardRenderEvent;
import su.catlean.api.event.events.render.ShouldRenderEntityEvent;
import su.catlean.api.event.events.render.StatusEffectsRenderEvent;
import su.catlean.api.event.events.render.WeatherRenderEvent;
import su.catlean.api.event.events.world.GetFogModifierEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/e6.class */
public final class e6 extends _g {

    @NotNull
    public static final e6 f = null;
    static final KProperty[] m = null;

    @NotNull
    private static final cp F = null;

    @NotNull
    private static final cq E = null;

    @NotNull
    private static final cq t = null;

    @NotNull
    private static final cq a = null;

    @NotNull
    private static final cq h = null;

    @NotNull
    private static final cq z = null;

    @NotNull
    private static final cq G = null;

    @NotNull
    private static final cq B = null;

    @NotNull
    private static final cq l = null;

    @NotNull
    private static final cq P = null;

    @NotNull
    private static final cq V = null;

    @NotNull
    private static final cq w = null;

    @NotNull
    private static final cq b = null;

    @NotNull
    private static final cq o = null;

    @NotNull
    private static final cq T = null;

    @NotNull
    private static final cp O = null;

    @NotNull
    private static final cq D = null;

    @NotNull
    private static final cq e = null;

    @NotNull
    private static final cq n = null;

    @NotNull
    private static final cq y = null;

    @NotNull
    private static final cq c = null;

    @NotNull
    private static final cq J = null;

    @NotNull
    private static final cq u = null;

    @NotNull
    private static final cq X = null;

    @NotNull
    private static final cq i = null;

    @NotNull
    private static final cp W = null;

    @NotNull
    private static final cq Y = null;

    @NotNull
    private static final cq x = null;

    @NotNull
    private static final cq A = null;

    @NotNull
    private static final cq S = null;

    @NotNull
    private static final cp I = null;

    @NotNull
    private static final cq g = null;

    @NotNull
    private static final cq L = null;

    @NotNull
    private static final cq k = null;

    @NotNull
    private static final cq d = null;

    @NotNull
    private static final cq N = null;

    @NotNull
    private static final cq K = null;

    @NotNull
    private static final cp j = null;

    @NotNull
    private static final cq C = null;
    private static final long U = 0;
    private static final String[] ab = null;
    private static final String[] fb = null;
    private static final Map gb = null;
    private static final long[] hb = null;
    private static final Integer[] lb = null;
    private static final Map mb = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private e6(long j2) {
        long j3 = U ^ j2;
        super((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7200, 7312924865626682733L ^ j3) /* invoke-custom */, jt.y(), null, 4, null, j3 ^ 111920047983853L);
    }

    private final h B(long j2) {
        return (h) F.E(this, (U ^ j2) ^ 10232954195206L, m[0]);
    }

    private final boolean z(long j2) {
        return ((Boolean) E.E(this, (U ^ j2) ^ 133430331412870L, m[1])).booleanValue();
    }

    private final boolean T(byte b2, int i2, int i3) {
        return ((Boolean) t.E(this, ((((((long) b2) << 56) | ((((long) i2) << 32) >>> 8)) | ((((long) i3) << 40) >>> 40)) ^ U) ^ 69026286394822L, m[2])).booleanValue();
    }

    private final boolean NW(long j2) {
        return ((Boolean) a.E(this, (U ^ j2) ^ 95663785176011L, m[3])).booleanValue();
    }

    private final boolean A(long j2) {
        return ((Boolean) h.E(this, (U ^ j2) ^ 126027215561673L, m[4])).booleanValue();
    }

    private final boolean a(long j2) {
        return ((Boolean) z.E(this, (U ^ j2) ^ 27585131492558L, m[5])).booleanValue();
    }

    private final boolean Z(int i2, byte b2, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i3) << 40) >>> 40)) ^ U;
        return ((Boolean) G.E(this, j2 ^ 59515127821452L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21350, 1395246947394287464L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean w(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) B.E(this, j3 ^ 9755116787470L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15882, 3647676297745611176L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean h(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) l.E(this, j3 ^ 12858620438801L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19282, 752331044724470464L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean q(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) P.E(this, j3 ^ 10213083424222L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(220, 5796610102585619880L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean i(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) V.E(this, j3 ^ 138266492514208L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31321, 2752898422070740351L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean Ni(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) w.E(this, j3 ^ 125105775654772L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7750, 8396274319530162602L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean Q(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) b.E(this, j3 ^ 94239853139236L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4824, 1185493498126636885L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean V(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) o.E(this, j3 ^ 126307258723699L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17093, 3694730213948227331L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean p(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) T.E(this, j3 ^ 122351568371978L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11417, 6781647623027211575L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final h e(long j2) {
        long j3 = U ^ j2;
        return (h) O.E(this, j3 ^ 126896527161679L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11647, 212076568202986636L ^ j3) /* invoke-custom */]);
    }

    private final boolean L(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) D.E(this, j3 ^ 36068360336970L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1775, 1509782923519615027L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean g(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) e.E(this, j3 ^ 49638130115635L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17543, 7566646403098406970L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean W(int i2, int i3, short s) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ U;
        return ((Boolean) n.E(this, j2 ^ 74933273179374L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12482, 7735675298527990935L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean t(int i2, short s, char c2) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ U;
        return ((Boolean) y.E(this, j2 ^ 71692653869789L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30312, 4716565951854550076L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean s(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) c.E(this, j3 ^ 118107517477633L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6832, 2520117149259802896L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean R(int i2, int i3) {
        long j2 = ((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ U;
        return ((Boolean) J.E(this, j2 ^ 59158955423629L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3318, 1821904274392099814L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean v(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) u.E(this, j3 ^ 101506595095280L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12892, 6601263968373923895L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean K(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) X.E(this, j3 ^ 12361067093709L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5003, 2426271087486737873L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean n(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) i.E(this, j3 ^ 58567820275272L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26408, 8145183210288994781L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final h M(long j2) {
        long j3 = U ^ j2;
        return (h) W.E(this, j3 ^ 32140475046501L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12734, 8347790557672504154L ^ j3) /* invoke-custom */]);
    }

    private final boolean F(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) Y.E(this, j3 ^ 105125016900597L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31598, 7739892781315962931L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean Y(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) x.E(this, j3 ^ 75429025442476L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9573, 512522244410515310L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean l(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) A.E(this, j3 ^ 3301736050140L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1377, 3225910613935863832L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean G(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) S.E(this, j3 ^ 108252468678514L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12040, 6962935277288943851L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final h E(long j2) {
        long j3 = U ^ j2;
        return (h) I.E(this, j3 ^ 589178484102L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8061, 6594087178051254852L ^ j3) /* invoke-custom */]);
    }

    private final boolean D(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) g.E(this, j3 ^ 95167662360861L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16519, 4022145987494058292L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean I(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) L.E(this, j3 ^ 18839588239911L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4276, 6880973296782391820L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean r(int i2, int i3, char c2) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ U;
        return ((Boolean) k.E(this, j2 ^ 34982222507436L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29014, 2365419035144064066L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean x(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) d.E(this, j3 ^ 10281241451945L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30269, 4990273994573003574L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean P(short s, long j2) {
        long j3 = ((((long) s) << 48) | ((j2 << 16) >>> 16)) ^ U;
        return ((Boolean) N.E(this, j3 ^ 131343356803389L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8513, 7823436449326254283L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean C(long j2) {
        long j3 = U ^ j2;
        return ((Boolean) K.E(this, j3 ^ 112666886706354L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31326, 9054622376087666288L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final h N4(long j2) {
        long j3 = U ^ j2;
        return (h) j.E(this, j3 ^ 51587483751177L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5776, 3659648482456573214L ^ j3) /* invoke-custom */]);
    }

    private final boolean H(int i2, char c2, char c3) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) c3) << 48) >>> 48)) ^ U;
        return ((Boolean) C.E(this, j2 ^ 56753450534037L, m[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8068, 2720663669862566817L ^ j2) /* invoke-custom */])).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [su.catlean.api.event.events.network.ReceivePacket] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    @Flow
    private final void y(ReceivePacket receivePacket) {
        long j2 = U ^ 16248393560605L;
        long j3 = j2 ^ 36561187602195L;
        ?? r0 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2460328388235808259L, j2) /* invoke-custom */;
        try {
            try {
                r0 = receivePacket.getPacket() instanceof class_5904;
                ?? P2 = r0;
                if (r0 != 0) {
                    if (r0 == 0) {
                        return;
                    } else {
                        P2 = p(j3);
                    }
                }
                if (P2 != 0) {
                    try {
                        P2 = receivePacket;
                        P2.cancel();
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(P2, -2508901428424392050L, j2) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -2508901428424392050L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -2508901428424392050L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da A[PHI: r0
  0x00da: PHI (r0v31 ??) = (r0v43 ??), (r0v44 ??) binds: [B:28:0x00a4, B:33:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[EXC_TOP_SPLITTER, PHI: r0
  0x009f: PHI (r0v25 ??) = (r0v16 ??), (r0v24 ??) binds: [B:18:0x0071, B:24:0x008a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16, types: [net.minecraft.class_239] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [net.minecraft.class_239$class_240] */
    /* JADX WARN: Type inference failed for: r0v24, types: [net.minecraft.class_239] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void z(su.catlean.api.event.events.render.SignTextRenderEvent r8) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e6.z(su.catlean.api.event.events.render.SignTextRenderEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.RenderArmorEvent] */
    @Flow
    private final void F(RenderArmorEvent renderArmorEvent) {
        long j2 = U ^ 124814548197999L;
        Object obj = j2;
        try {
            if (s(obj ^ 99158257356138L)) {
                obj = renderArmorEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3648786295704235268L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.MapRenderEvent] */
    @Flow
    private final void h(MapRenderEvent mapRenderEvent) {
        long j2 = U ^ 104367176839357L;
        Object obj = j2;
        try {
            if (D(obj ^ 79880701097380L)) {
                obj = mapRenderEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6885660084445298734L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.RenderFireOverlayEvent] */
    @Flow
    private final void Q(RenderFireOverlayEvent renderFireOverlayEvent) {
        long j2 = U ^ 120578628092412L;
        Object obj = j2;
        try {
            if (Z((int) (obj >>> 32), (byte) ((r1 << 32) >>> 56), (int) (((obj ^ 30005356870004L) << 40) >>> 40))) {
                obj = renderFireOverlayEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5850188985678614161L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.WeatherRenderEvent] */
    @Flow
    private final void g(WeatherRenderEvent weatherRenderEvent) {
        long j2 = U ^ 85072194640885L;
        Object obj = j2;
        try {
            if (G(obj ^ 123057975187587L)) {
                obj = weatherRenderEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 3802961036714421094L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.RenderUnderwaterOverlayEvent] */
    @Flow
    private final void y(RenderUnderwaterOverlayEvent renderUnderwaterOverlayEvent) {
        long j2 = U ^ 93850319042162L;
        Object obj = j2;
        try {
            if (w(obj ^ 32181356146040L)) {
                obj = renderUnderwaterOverlayEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -7403410991270131999L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.RenderGuiBackgroundEvent] */
    @Flow
    private final void d(RenderGuiBackgroundEvent renderGuiBackgroundEvent) {
        long j2 = U ^ 120424028659052L;
        Object obj = j2;
        try {
            if (Ni(obj ^ 101767853876764L)) {
                obj = renderGuiBackgroundEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8241574334242614783L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.RenderInWallOverlayEvent] */
    @Flow
    private final void O(RenderInWallOverlayEvent renderInWallOverlayEvent) {
        long j2 = U ^ 48545896411260L;
        Object obj = j2;
        try {
            if (h(obj ^ 113626170791273L)) {
                obj = renderInWallOverlayEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2256221570179236079L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.DarknessEffectEvent] */
    @Flow
    private final void P(DarknessEffectEvent darknessEffectEvent) {
        long j2 = U ^ 106248973923544L;
        Object obj = j2;
        try {
            if (P((short) (obj >>> 48), ((obj ^ 95754024436193L) << 16) >>> 16)) {
                obj = darknessEffectEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2011975525356766283L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.RenderSpawnerEntityEvent] */
    @Flow
    private final void A(RenderSpawnerEntityEvent renderSpawnerEntityEvent) {
        long j2 = U ^ 105868424853326L;
        Object obj = j2;
        try {
            if (I(obj ^ 54613626061165L)) {
                obj = renderSpawnerEntityEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1764841506774550493L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.NauseaRenderEvent] */
    @Flow
    private final void L(NauseaRenderEvent nauseaRenderEvent) {
        long j2 = U ^ 84553838421113L;
        Object obj = j2;
        try {
            if (q(obj ^ 5978264210851L)) {
                obj = nauseaRenderEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3797988795480910614L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.StatusEffectsRenderEvent] */
    @Flow
    private final void q(StatusEffectsRenderEvent statusEffectsRenderEvent) {
        long j2 = U ^ 12665652045338L;
        Object obj = j2;
        long j3 = obj ^ 129206072834008L;
        try {
            if (T((byte) (obj >>> 56), (int) ((j3 << 8) >>> 32), (int) ((j3 << 40) >>> 40))) {
                obj = statusEffectsRenderEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3951466452946364791L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.RenderPortalOverlayEvent] */
    @Flow
    private final void J(RenderPortalOverlayEvent renderPortalOverlayEvent) {
        long j2 = U ^ 33385139935705L;
        Object obj = j2;
        try {
            if (A(obj ^ 48392820995604L)) {
                obj = renderPortalOverlayEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 3957124668210194762L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.RenderVignetteOverlayEvent] */
    @Flow
    private final void o(RenderVignetteOverlayEvent renderVignetteOverlayEvent) {
        long j2 = U ^ 17542247671437L;
        Object obj = j2;
        try {
            if (NW(obj ^ 26618403471682L)) {
                obj = renderVignetteOverlayEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3909522212834355682L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.ScoreBoardRenderEvent] */
    @Flow
    private final void f(ScoreBoardRenderEvent scoreBoardRenderEvent) {
        long j2 = U ^ 66947933143748L;
        Object obj = j2;
        try {
            if (Q(obj ^ 45727809772516L)) {
                obj = scoreBoardRenderEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 3312297835817644631L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.ItemNameRenderEvent] */
    @Flow
    private final void l(ItemNameRenderEvent itemNameRenderEvent) {
        long j2 = U ^ 131866238052830L;
        Object obj = j2;
        try {
            if (V(obj ^ 76751299070121L)) {
                obj = itemNameRenderEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -4112368822697830067L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.RenderFireOnEntityEvent] */
    @Flow
    private final void f(RenderFireOnEntityEvent renderFireOnEntityEvent) {
        long j2 = U ^ 62233425812979L;
        Object obj = j2;
        try {
            if (r((int) (obj >>> 32), (int) (((obj ^ 113840409476187L) << 32) >>> 48), (char) ((r1 << 48) >>> 48))) {
                obj = renderFireOnEntityEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 3657100121881947488L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.BossBarRenderEvent] */
    @Flow
    private final void P(BossBarRenderEvent bossBarRenderEvent) {
        long j2 = U ^ 62078874725055L;
        Object obj = j2;
        try {
            if (a(obj ^ 107356102185589L)) {
                obj = bossBarRenderEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -8823499709748078036L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [su.catlean.api.event.events.render.HurtTiltEvent] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    @Flow
    private final void c(HurtTiltEvent hurtTiltEvent) {
        long j2 = U ^ 129050022296604L;
        long j3 = j2 ^ 84408352170398L;
        long j4 = j2 ^ 34208332142391L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j4 << 32) >>> 48);
        int i4 = (int) ((j4 << 48) >>> 48);
        long j5 = j2 ^ 47082500276546L;
        Object objZ = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7792824103540326404L, j2) /* invoke-custom */;
        try {
            try {
                objZ = z(j3);
                Object obj = objZ;
                if (objZ != 0) {
                    if (objZ == 0) {
                        return;
                    } else {
                        obj = ((zf.v(j5).field_6235 - zi.v.n(i2, (char) i3, i4)) > 0.0f ? 1 : ((zf.v(j5).field_6235 - zi.v.n(i2, (char) i3, i4)) == 0.0f ? 0 : -1));
                    }
                }
                if (obj > 0) {
                    try {
                        obj = hurtTiltEvent;
                        obj.cancel();
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -7840787943486780273L, j2) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, -7840787943486780273L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, -7840787943486780273L, j2) /* invoke-custom */;
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
    @su.catlean.gofra.Flow
    private final void G(su.catlean.api.event.events.render.EntityAlphaEvent r10) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e6.G(su.catlean.api.event.events.render.EntityAlphaEvent):void");
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
    private final void J(su.catlean.api.event.events.render.RenderParticleEvent r9) {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e6.J(su.catlean.api.event.events.render.RenderParticleEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.ShouldRenderEntityEvent] */
    @Flow
    private final void E(ShouldRenderEntityEvent shouldRenderEntityEvent) {
        long j2 = U ^ 32940086152017L;
        Object obj = j2;
        try {
            if (l(obj ^ 12742537308288L, shouldRenderEntityEvent.getEntity())) {
                obj = shouldRenderEntityEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 7233489378697345986L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [su.catlean.api.event.events.render.RenderNameTagEvent] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    @Flow
    private final void I(RenderNameTagEvent renderNameTagEvent) {
        long j2 = U ^ 49728941930828L;
        long j3 = j2 ^ 97576138414848L;
        ?? r0 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1624123400399616684L, j2) /* invoke-custom */;
        try {
            try {
                r0 = renderNameTagEvent.getState() instanceof class_9998;
                ?? N2 = r0;
                if (r0 != 0) {
                    if (r0 == 0) {
                        return;
                    } else {
                        N2 = n(j3);
                    }
                }
                if (N2 != 0) {
                    try {
                        N2 = renderNameTagEvent;
                        N2.cancel();
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(N2, 1621212908461066719L, j2) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 1621212908461066719L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 1621212908461066719L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.GetFogBufferEvent] */
    @Flow
    private final void z(GetFogBufferEvent getFogBufferEvent) {
        long j2 = U ^ 86043084584863L;
        Object obj = j2;
        try {
            if (C(obj ^ 115420876681001L)) {
                obj = getFogBufferEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -2833652605797841140L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.world.GetFogModifierEvent] */
    @Flow
    private final void X(GetFogModifierEvent getFogModifierEvent) {
        long j2 = U ^ 129473767523625L;
        Object obj = j2;
        try {
            if (i(obj ^ 79995479631501L)) {
                obj = getFogModifierEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1577688719767800390L, j2) /* invoke-custom */;
        }
    }

    @Flow
    public final void K(@NotNull Render3DEvent event) {
        long j2 = U ^ 57555806230907L;
        long j3 = j2 ^ 103769333762179L;
        Object obj = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5279042563326715237L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(event, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31201, 3997787658774723495L ^ j2) /* invoke-custom */);
        try {
            GofraState.INSTANCE.setShouldRender(j(j3));
            if (obj == null) {
                obj = new _g[3];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5301334207333024688L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5311804521418053144L, j2) /* invoke-custom */;
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
    private final boolean l(long r9, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e6.l(long, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean j(long r9) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e6.j(long):boolean");
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 30048;
        if (fb[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) gb.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    gb.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                fb[i3] = b(((Cipher) objArr[0]).doFinal(ab[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/e6", e2);
            }
        }
        return fb[i3];
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
            java.lang.String r1 = "su/catlean/e6"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e6.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 7358;
        if (lb[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) hb[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) mb.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    mb.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/e6", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            lb[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return lb[i3].intValue();
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
            java.lang.String r1 = "su/catlean/e6"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e6.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
