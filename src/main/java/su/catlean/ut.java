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
import net.minecraft.class_1802;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.AfterElytraEvent;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreElytraEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.api.event.events.world.FireWorkVelocityEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ut.class */
public final class ut extends _g {

    @NotNull
    public static final ut D = null;
    static final KProperty[] pU = null;

    @NotNull
    private static final cw x = null;

    @NotNull
    private static final cq G = null;

    @NotNull
    private static final av pt = null;

    @NotNull
    private static final cq pT = null;

    @NotNull
    private static final cq pG = null;

    @NotNull
    private static final cq o = null;

    @NotNull
    private static final cq pV = null;

    @NotNull
    private static final cw p8 = null;

    @NotNull
    private static final cw pn = null;

    @NotNull
    private static final ct K = null;

    @NotNull
    private static final ct pl = null;

    @NotNull
    private static final c8 pE = null;

    @NotNull
    private static final cq g = null;

    @NotNull
    private static final ct p5 = null;

    @NotNull
    private static final ct W = null;

    @NotNull
    private static final cq pw = null;

    @NotNull
    private static final cq b = null;

    @NotNull
    private static final cq u = null;

    @NotNull
    private static final cq pJ = null;

    @NotNull
    private static final cq h = null;

    @NotNull
    private static final cq k = null;

    @NotNull
    private static final cq P = null;

    @NotNull
    private static final cq p9 = null;

    @NotNull
    private static final ct ps = null;

    @NotNull
    private static final ct pL = null;

    @NotNull
    private static final ct p1 = null;

    @NotNull
    private static final cq t = null;

    @NotNull
    private static final ct j = null;

    @NotNull
    private static final cq px = null;

    @NotNull
    private static final c8 pb = null;

    @NotNull
    private static final ct y = null;

    @NotNull
    private static final cq pj = null;

    @NotNull
    private static final ct S = null;

    @NotNull
    private static final ct p4 = null;

    @NotNull
    private static final ct py = null;

    @NotNull
    private static final ct pS = null;

    @NotNull
    private static final c8 O = null;

    @NotNull
    private static final cw e = null;

    @NotNull
    private static final c8 pv = null;

    @NotNull
    private static final c8 pP = null;

    @NotNull
    private static final cq pB = null;

    @NotNull
    private static final cq c = null;

    @NotNull
    private static final cq B = null;

    @NotNull
    private static final cq L = null;

    @NotNull
    private static final cq J = null;

    @NotNull
    private static final cq d = null;

    @NotNull
    private static final ct pA = null;

    @NotNull
    private static final ct A = null;

    @NotNull
    private static final ct F = null;

    @NotNull
    private static final ct pu = null;

    @NotNull
    private static final ct U = null;

    @NotNull
    private static final ct pe = null;

    @NotNull
    private static final ct C = null;

    @NotNull
    private static final ct N = null;

    @NotNull
    private static final ct i = null;

    @NotNull
    private static final ct pH = null;

    @NotNull
    private static final ct w = null;

    @NotNull
    private static final ct pc = null;

    @NotNull
    private static final ct E = null;

    @NotNull
    private static final ct Y = null;

    @NotNull
    private static final ct X = null;

    @NotNull
    private static final ct pz = null;

    @NotNull
    private static final ct I = null;

    @NotNull
    private static final ct l = null;

    @NotNull
    private static final ct a = null;

    @NotNull
    private static final bg z = null;

    @NotNull
    private static final bg f = null;
    private static boolean m;
    private static boolean n;
    private static float pC;
    private static float T;
    private static float V;
    private static _g[] p7;
    private static final long ab = 0;
    private static final String[] fb = null;
    private static final String[] gb = null;
    private static final Map hb = null;
    private static final long[] lb = null;
    private static final Integer[] mb = null;
    private static final Map nb = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private ut(byte b2, int i2, int i3) {
        long j2 = (((((long) b2) << 56) | ((((long) i2) << 32) >>> 8)) | ((((long) i3) << 40) >>> 40)) ^ ab;
        super((String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27929, 8396184468444483481L ^ j2) /* invoke-custom */, jt.V(), null, 4, null, j2 ^ 58926357268901L);
    }

    @NotNull
    public final dz FX(long j2) {
        return (dz) x.E(this, (ab ^ j2) ^ 10131556150432L, pU[0]);
    }

    public final boolean B(short s, int i2, short s2) {
        return ((Boolean) G.E(this, ((((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s2) << 48) >>> 48)) ^ ab) ^ 81556592982701L, pU[1])).booleanValue();
    }

    @NotNull
    public final lj Fy(long j2) {
        return (lj) pt.E(this, (ab ^ j2) ^ 116253054474937L, pU[2]);
    }

    public final boolean ku(long j2) {
        return ((Boolean) pT.E(this, (ab ^ j2) ^ 12264921179400L, pU[3])).booleanValue();
    }

    public final boolean FL(long j2) {
        return ((Boolean) pG.E(this, (ab ^ j2) ^ 64293351890917L, pU[4])).booleanValue();
    }

    public final boolean kP(long j2) {
        return ((Boolean) o.E(this, (ab ^ j2) ^ 1390587436067L, pU[5])).booleanValue();
    }

    public final boolean kG(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) pV.E(this, j3 ^ 12671561166117L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28643, 1316778784647762465L ^ j3) /* invoke-custom */])).booleanValue();
    }

    @NotNull
    public final aq kS(long j2) {
        long j3 = ab ^ j2;
        return (aq) p8.E(this, j3 ^ 60168876275443L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14622, 4931896761584967524L ^ j3) /* invoke-custom */]);
    }

    @NotNull
    public final oz FG(long j2) {
        long j3 = ab ^ j2;
        return (oz) pn.E(this, j3 ^ 96005945104720L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(452, 1053000115204802624L ^ j3) /* invoke-custom */]);
    }

    public final float FN(long j2) {
        long j3 = ab ^ j2;
        return ((Number) K.E(this, j3 ^ 137359604134424L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32501, 6625096333856218174L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float FF(long j2) {
        long j3 = ab ^ j2;
        return ((Number) pl.E(this, j3 ^ 111669957501960L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8982, 7184953468243564468L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final int kQ(char c2, int i2, int i3) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ ab;
        return ((Number) pE.E(this, j2 ^ 34666339685673L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31301, 2012114974865751938L ^ j2) /* invoke-custom */])).intValue();
    }

    public final boolean Fd(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) g.E(this, j3 ^ 105757537878682L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14871, 6478852348251809904L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final float kk(long j2) {
        long j3 = ab ^ j2;
        return ((Number) p5.E(this, j3 ^ 24668458503131L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9865, 7287720633775308186L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float E(long j2) {
        long j3 = ab ^ j2;
        return ((Number) W.E(this, j3 ^ 104777792661928L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8509, 4041804602028382223L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final boolean FB(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) pw.E(this, j3 ^ 136478754691773L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23888, 3522351401931036486L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean Fc(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) b.E(this, j3 ^ 96648800113967L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27205, 3959735535272570792L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean H(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) u.E(this, j3 ^ 42238767632240L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21103, 5797672095080517009L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean Fm(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) pJ.E(this, j3 ^ 25545343058902L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23696, 7259483753095548881L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean kA(int i2, char c2, short s) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ ab;
        return ((Boolean) h.E(this, j2 ^ 92536773762831L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27385, 7011354405062698249L ^ j2) /* invoke-custom */])).booleanValue();
    }

    public final boolean kC(short s, char c2, int i2) {
        long j2 = (((((long) s) << 48) | ((((long) c2) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ ab;
        return ((Boolean) k.E(this, j2 ^ 83850340757149L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4148, 6631923342720806438L ^ j2) /* invoke-custom */])).booleanValue();
    }

    public final boolean F6(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) P.E(this, j3 ^ 1220389891992L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9728, 7027423064715532602L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean Fn(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) p9.E(this, j3 ^ 72294876790121L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21965, 6821011032645842952L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final float Fl(short s, int i2, int i3) {
        long j2 = (((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ ab;
        return ((Number) ps.E(this, j2 ^ 87436270497093L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16388, 8625351732096630173L ^ j2) /* invoke-custom */])).floatValue();
    }

    public final float FK(long j2) {
        long j3 = ab ^ j2;
        return ((Number) pL.E(this, j3 ^ 65556529799890L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15091, 8255108847440300204L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float kI(long j2) {
        long j3 = ab ^ j2;
        return ((Number) p1.E(this, j3 ^ 35961061210225L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2494, 7140053717619188060L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final boolean FJ(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) t.E(this, j3 ^ 14365862512214L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17248, 2558915589143319998L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final float k5(long j2) {
        long j3 = ab ^ j2;
        return ((Number) j.E(this, j3 ^ 90059461986346L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21951, 687040968847985943L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final boolean k3(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) px.E(this, j3 ^ 79638846405972L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17302, 2737861019340009067L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final int D(long j2) {
        long j3 = ab ^ j2;
        return ((Number) pb.E(this, j3 ^ 40207156331074L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30334, 589873403657053412L ^ j3) /* invoke-custom */])).intValue();
    }

    public final float kx(long j2) {
        long j3 = ab ^ j2;
        return ((Number) y.E(this, j3 ^ 41947261752945L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24115, 2407837964716693680L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final boolean Fg(char c2, int i2, short s) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s) << 48) >>> 48)) ^ ab;
        return ((Boolean) pj.E(this, j2 ^ 41572179615624L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27828, 1922085369756787609L ^ j2) /* invoke-custom */])).booleanValue();
    }

    public final float FW(long j2) {
        long j3 = ab ^ j2;
        return ((Number) S.E(this, j3 ^ 90067582448646L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17673, 6781396782647828979L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float Fp(long j2) {
        long j3 = ab ^ j2;
        return ((Number) p4.E(this, j3 ^ 78840683846521L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27358, 4537259671785922826L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float W(long j2) {
        long j3 = ab ^ j2;
        return ((Number) py.E(this, j3 ^ 65902074856055L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9833, 8851303722993906887L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float FV(long j2) {
        long j3 = ab ^ j2;
        return ((Number) pS.E(this, j3 ^ 94393091698075L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30832, 6858441911643997521L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final int F9(long j2) {
        long j3 = ab ^ j2;
        return ((Number) O.E(this, j3 ^ 99975564153736L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11507, 9169765571937054661L ^ j3) /* invoke-custom */])).intValue();
    }

    @NotNull
    public final am a(long j2) {
        long j3 = ab ^ j2;
        return (am) e.E(this, j3 ^ 48131734124558L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6870, 4846469371572023897L ^ j3) /* invoke-custom */]);
    }

    public final int Fv(long j2) {
        long j3 = ab ^ j2;
        return ((Number) pv.E(this, j3 ^ 92832474856186L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31107, 724353404014187427L ^ j3) /* invoke-custom */])).intValue();
    }

    public final int kc(long j2) {
        long j3 = ab ^ j2;
        return ((Number) pP.E(this, j3 ^ 138189401993689L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15164, 908140000176232992L ^ j3) /* invoke-custom */])).intValue();
    }

    public final boolean kp(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) pB.E(this, j3 ^ 35564078795322L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1956, 1239589488550894941L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean M(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) c.E(this, j3 ^ 79565317583269L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24757, 7002541570281963981L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean Fu(int i2, char c2, char c3) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) c3) << 48) >>> 48)) ^ ab;
        return ((Boolean) B.E(this, j2 ^ 107755492914731L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16249, 8175870364658555301L ^ j2) /* invoke-custom */])).booleanValue();
    }

    public final boolean Fr(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) L.E(this, j3 ^ 30180345165194L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31966, 6886970925847124448L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean kZ(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) J.E(this, j3 ^ 11510426520878L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5520, 2447158653428140118L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean Ff(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) d.E(this, j3 ^ 9926506253268L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15494, 2768562081821091785L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final float L(int i2, short s, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ ab;
        return ((Number) pA.E(this, j2 ^ 14598434176L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14020, 6072104084829408194L ^ j2) /* invoke-custom */])).floatValue();
    }

    public final float q(short s, short s2, int i2) {
        long j2 = (((((long) s) << 48) | ((((long) s2) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ ab;
        return ((Number) A.E(this, j2 ^ 40875882440777L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29303, 5954471695269382872L ^ j2) /* invoke-custom */])).floatValue();
    }

    public final float kd(long j2) {
        long j3 = ab ^ j2;
        return ((Number) F.E(this, j3 ^ 114968076695502L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21247, 4463470054294599047L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float j(char c2, long j2) {
        long j3 = ((((long) c2) << 48) | ((j2 << 16) >>> 16)) ^ ab;
        return ((Number) pu.E(this, j3 ^ 96219938073642L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3866, 6147639929803207586L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float FO(long j2) {
        long j3 = ab ^ j2;
        return ((Number) U.E(this, j3 ^ 29139595285949L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5449, 8052072527181615169L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float kU(int i2, byte b2, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i3) << 40) >>> 40)) ^ ab;
        return ((Number) pe.E(this, j2 ^ 112019073273756L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25167, 440336738181463406L ^ j2) /* invoke-custom */])).floatValue();
    }

    public final float kf(int i2, long j2) {
        long j3 = ((((long) i2) << 32) | ((j2 << 32) >>> 32)) ^ ab;
        return ((Number) C.E(this, j3 ^ 120101196342155L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21414, 1344386243550224529L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float ke(long j2) {
        long j3 = ab ^ j2;
        return ((Number) N.E(this, j3 ^ 133152146168477L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20767, 7572495346001189707L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float kz(short s, int i2, int i3) {
        long j2 = (((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ ab;
        return ((Number) i.E(this, j2 ^ 329222391353L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28207, 3771622803527481513L ^ j2) /* invoke-custom */])).floatValue();
    }

    public final float F2(long j2) {
        long j3 = ab ^ j2;
        return ((Number) pH.E(this, j3 ^ 33589122078648L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28586, 4879110476875802793L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float F4(long j2) {
        long j3 = ab ^ j2;
        return ((Number) w.E(this, j3 ^ 550524332256L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8948, 3561083688222481130L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float I(long j2) {
        long j3 = ab ^ j2;
        return ((Number) pc.E(this, j3 ^ 112155697392552L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18656, 3587134575258547157L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float Y(long j2) {
        long j3 = ab ^ j2;
        return ((Number) E.E(this, j3 ^ 91579579848799L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27857, 3467225367703381022L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float A(long j2) {
        long j3 = ab ^ j2;
        return ((Number) Y.E(this, j3 ^ 25137073149435L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19842, 8554933855971395714L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float Fk(long j2) {
        long j3 = ab ^ j2;
        return ((Number) X.E(this, j3 ^ 112192395558077L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24691, 5405958417766911009L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float kW(long j2) {
        long j3 = ab ^ j2;
        return ((Number) pz.E(this, j3 ^ 77015540148742L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31696, 1710187223303684426L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float kN(long j2) {
        long j3 = ab ^ j2;
        return ((Number) I.E(this, j3 ^ 66808736298210L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11376, 1883518870030239844L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float Q(long j2) {
        long j3 = ab ^ j2;
        return ((Number) l.E(this, j3 ^ 21910657360585L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18705, 5259347473039260487L ^ j3) /* invoke-custom */])).floatValue();
    }

    public final float FP(long j2) {
        long j3 = ab ^ j2;
        return ((Number) a.E(this, j3 ^ 7793475244387L, pU[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1719, 6920748789740504878L ^ j3) /* invoke-custom */])).floatValue();
    }

    @NotNull
    public final bg k7() {
        return z;
    }

    @NotNull
    public final bg FT() {
        return f;
    }

    public final boolean Fb() {
        return m;
    }

    public final void E(boolean z2) {
        m = z2;
    }

    public final boolean F1() {
        return n;
    }

    public final void e(boolean z2) {
        n = z2;
    }

    public final float x() {
        return pC;
    }

    public final void E(float f2) {
        pC = f2;
    }

    public final float F5() {
        return T;
    }

    public final void K(float f2) {
        T = f2;
    }

    public final float i() {
        return V;
    }

    public final void Y(float f2) {
        V = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [net.minecraft.class_638] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [long] */
    @Override // su.catlean._g
    public void O(long j2) {
        long j3 = j2 ^ 32978412894279L;
        long j4 = j2 ^ 60613550834554L;
        long j5 = j2 ^ 116822717865188L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j5 << 16) >>> 32);
        int i4 = (int) ((j5 << 48) >>> 48);
        long j6 = j2 ^ 67464996320865L;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2608121635979070554L, j2) /* invoke-custom */;
        try {
            if (obj == 0) {
                obj = j3;
                long j7 = obj;
                if (j2 > 0) {
                    try {
                        obj = zf.F(obj).field_1687;
                        if (obj == 0) {
                            return;
                        }
                        pC = 0.0f;
                        j7 = j6;
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2652033809290394382L, j2) /* invoke-custom */;
                    }
                }
                T = (float) zf.v(j7).method_23318();
                FX(j4).Y().m((char) i2, i3, (short) i4);
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2652033809290394382L, j2) /* invoke-custom */;
        }
    }

    @Flow
    private final void P(PreElytraEvent preElytraEvent) {
        long j2 = ab ^ 124080991473127L;
        FX(j2 ^ 62876345724227L).Y().y(preElytraEvent, j2 ^ 136072144832775L);
    }

    @Flow
    private final void f(AfterElytraEvent afterElytraEvent) {
        long j2 = ab ^ 71887233586210L;
        FX(j2 ^ 9448327115910L).Y().b(j2 ^ 20324809467806L, afterElytraEvent);
    }

    @Flow
    private final void L(PreSyncEvent preSyncEvent) {
        long j2 = ab ^ 52077135480842L;
        FX(j2 ^ 112886605326510L).Y().w(j2 ^ 63830187006431L, preSyncEvent);
    }

    @Flow(priority = -20)
    public final void G(@NotNull MoveEvent e2) {
        long j2 = ab ^ 69109533441449L;
        Intrinsics.checkNotNullParameter(e2, "e");
        FX(j2 ^ 131033011526925L).Y().h(e2, j2 ^ 125720774857936L);
    }

    @Flow
    public final void R(@NotNull AfterSendPacket e2) {
        long j2 = ab ^ 50680601352414L;
        Intrinsics.checkNotNullParameter(e2, "e");
        FX(j2 ^ 114218986010746L).Y().j(j2 ^ 78338127964194L, e2);
    }

    @Flow
    public final void n(@NotNull ReceivePacket e2) {
        long j2 = ab ^ 9031108530219L;
        Intrinsics.checkNotNullParameter(e2, "e");
        FX(j2 ^ 72296801759375L).Y().A(e2, j2 >>> 16, (char) (((j2 ^ 101880706271650L) << 48) >>> 48));
    }

    @Flow
    public final void Q(@NotNull PlayerUpdateEvent e2) {
        long j2 = ab ^ 69559044161461L;
        long j3 = j2 ^ 61681878951712L;
        Intrinsics.checkNotNullParameter(e2, "e");
        FX(j2 ^ 130520486108945L).Y().P((int) (j2 >>> 32), e2, (char) ((j3 << 32) >>> 48), (char) ((j3 << 48) >>> 48));
    }

    @Flow
    private final void f(FireWorkVelocityEvent fireWorkVelocityEvent) {
        long j2 = ab ^ 47182580517589L;
        FX(j2 ^ 108988517083761L).Y().U(j2 ^ 76676405486803L, fireWorkVelocityEvent);
    }

    @Flow
    private final void o(SetPoseEvent setPoseEvent) {
        FX((ab ^ 137765848580427L) ^ 57974766461423L).Y().s(setPoseEvent);
    }

    @Flow
    private final void m(ReceivePacket receivePacket) {
        long j2 = ab ^ 52642819217421L;
        FX(j2 ^ 112247051516073L).Y().k(j2 ^ 114932143731890L, receivePacket);
    }

    @Override // su.catlean._g
    public void b(long j2) {
        FX(j2 ^ 18200288539696L).Y().b(j2 ^ 95879002268822L);
    }

    public final boolean FR(long j2) {
        long j3 = ab ^ j2;
        return Intrinsics.areEqual(zf.v(j3 ^ 46212040666491L).method_31548().method_5438((int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31107, 724349775076137801L ^ j3) /* invoke-custom */).method_7909(), class_1802.field_8833);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Y(long r9, @org.jetbrains.annotations.NotNull net.minecraft.class_1799 r11) {
        /*
            r8 = this;
            long r0 = su.catlean.ut.ab
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = -4006052956123766772(0xc867a40fb6d6e00c, double:-6.435655538692722E40)
            r1 = r9
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r1 = r11
            r2 = 11493(0x2ce5, float:1.6105E-41)
            r3 = 2643118364448988844(0x24ae3e260c4b1eac, double:5.325905435615047E-132)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ut;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "u"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r12 = r0
            r0 = r11
            int r0 = r0.method_7919()     // Catch: java.lang.NumberFormatException -> L37
            r1 = r12
            if (r1 != 0) goto L55
            r1 = r11
            int r1 = r1.method_7936()     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L4b
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L6e
            goto L41
        L37:
            r1 = -3991413635065211048(0xc89ba67242499758, double:-6.021676173105303E41)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L4b
            throw r0     // Catch: java.lang.NumberFormatException -> L4b
        L41:
            r0 = r11
            net.minecraft.class_9331 r1 = net.minecraft.class_9334.field_54197     // Catch: java.lang.NumberFormatException -> L4b
            boolean r0 = r0.method_57826(r1)     // Catch: java.lang.NumberFormatException -> L4b
            goto L55
        L4b:
            r1 = -3991413635065211048(0xc89ba67242499758, double:-6.021676173105303E41)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L55:
            r1 = r12
            if (r1 != 0) goto L6b
            if (r0 == 0) goto L6e
            goto L6a
        L60:
            r1 = -3991413635065211048(0xc89ba67242499758, double:-6.021676173105303E41)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6a:
            r0 = 1
        L6b:
            goto L6f
        L6e:
            r0 = 0
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.Y(long, net.minecraft.class_1799):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    public final void f(long j2, @NotNull String m2) {
        long j3 = ab ^ j2;
        long j4 = j3 ^ 82376938136711L;
        long j5 = j3 ^ 36086195983731L;
        ?? length = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8418031502439242937L, j3) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(m2, "m");
        try {
            length = m2.length();
            ?? r0 = length;
            if (length == 0) {
                r0 = length == 0 ? 1 : 0;
            }
            try {
                if (r0 != 0) {
                    try {
                        d(j5);
                        r0 = length;
                        if (r0 == 0) {
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 8371867836522376173L, j3) /* invoke-custom */;
                    }
                }
                F(m2, j4);
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 8371867836522376173L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(length, 8371867836522376173L, j3) /* invoke-custom */;
        }
    }

    public static void M(ut utVar, short s, String str, int i2, char c2, Object obj, int i3) {
        long j2 = ((((((long) s) << 48) | ((((long) c2) << 48) >>> 16)) | ((((long) i3) << 32) >>> 32)) ^ ab) ^ 36310638310661L;
        if ((i2 & 1) != 0) {
            str = "";
        }
        utVar.f(j2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.String] */
    @NotNull
    public final String J(@NotNull String key, long a2, @NotNull Object[] args) {
        long j2 = ab ^ a2;
        long j3 = j2 ^ 37197507678705L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j3 << 32) >>> 48);
        int i4 = (int) ((j3 << 48) >>> 48);
        String[] strArr = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1318815863283792423L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(key, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6933, 884609741531352256L ^ j2) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(args, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24217, 5802688845243173215L ^ j2) /* invoke-custom */);
        Object objZ = i2;
        ut utVar = this;
        Object[] objArr = new Object[1];
        try {
            objArr[0] = args;
            objZ = o2.Z(objZ, utVar, key, objArr, (char) i3, false, 4, null, (short) i4);
            if (strArr != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[5], -1321031244299180137L, j2) /* invoke-custom */;
            }
            return objZ;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, -1346966029950078323L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean.ut] */
    public final void F3(long j2) {
        long j3 = ab ^ j2;
        long j4 = j3 ^ 46774984373707L;
        long j5 = j3 ^ 27073664651755L;
        int i2 = (int) (j3 >>> 32);
        int i3 = (int) ((j5 << 32) >>> 48);
        int i4 = (int) ((j5 << 48) >>> 48);
        long j6 = j3 ^ 60853211790845L;
        (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5933309171456768573L, j3) /* invoke-custom */;
        Object obj = this;
        ut utVar = this;
        String strU = (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7185, 6484943725706234659L ^ j3) /* invoke-custom */;
        Object[] objArr = new Object[1];
        try {
            objArr[0] = String.valueOf(F9(j4));
            obj.F(o2.Z(i2, utVar, strU, objArr, (char) i3, false, 4, null, (short) i4), j6);
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5924803180919147689L, j3) /* invoke-custom */ != null) {
                obj = new String[5];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6017741928111014348L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5956955247927627113L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean kl() {
        long j2 = ab ^ 52022034611127L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 112863214525203L);
            return objFX == dz.BOOST;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -241862645845482649L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.ut] */
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
    private static final boolean Fa() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 55661201082952(0x329fa21e4a48, double:2.7500287261348E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 135694982163180(0x7b69f335aaec, double:6.7042228999868E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 62069847850209(0x3873c33b7ce1, double:3.06665794653814E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r2 = r1; r3 = r0; 
            r3 = 16
            long r2 = r2 << r3
            r3 = 32
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
            r0 = 983935941076067788(0xda7a486799425cc, double:6.925165479584179E-243)
            r1 = r8
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L51
            r1 = r15
            if (r1 != 0) goto L6b
            r1 = r10
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L51 java.lang.NumberFormatException -> L61
            su.catlean.dz r1 = su.catlean.dz.BOOST     // Catch: java.lang.NumberFormatException -> L51 java.lang.NumberFormatException -> L61
            if (r0 != r1) goto L8f
            goto L5b
        L51:
            r1 = 962546544707064472(0xd5ba6fb8d0b5298, double:2.5311297612684912E-244)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L61
            throw r0     // Catch: java.lang.NumberFormatException -> L61
        L5b:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L61
            goto L6b
        L61:
            r1 = 962546544707064472(0xd5ba6fb8d0b5298, double:2.5311297612684912E-244)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6b:
            r1 = r12
            short r1 = (short) r1     // Catch: java.lang.NumberFormatException -> L81
            r2 = r13
            r3 = r14
            short r3 = (short) r3     // Catch: java.lang.NumberFormatException -> L81
            boolean r0 = r0.B(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L81
            r1 = r15
            if (r1 != 0) goto L8c
            if (r0 == 0) goto L8f
            goto L8b
        L81:
            r1 = 962546544707064472(0xd5ba6fb8d0b5298, double:2.5311297612684912E-244)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 1
        L8c:
            goto L90
        L8f:
            r0 = 0
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.Fa():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.ut] */
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
    private static final boolean FC() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 85337137554848(0x4d9d19c525a0, double:4.21621479802793E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 4858831619332(0x46b48eec504, double:2.400581782039E-311)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 78552684827401(0x477178e01309, double:3.8810182961814E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r2 = r1; r3 = r0; 
            r3 = 16
            long r2 = r2 << r3
            r3 = 32
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
            r0 = 7084122102119221796(0x624fdb84c24f4a24, double:3.6690975085894536E165)
            r1 = r8
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L51
            r1 = r15
            if (r1 != 0) goto L6b
            r1 = r10
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L51 java.lang.NumberFormatException -> L61
            su.catlean.dz r1 = su.catlean.dz.BOOST     // Catch: java.lang.NumberFormatException -> L51 java.lang.NumberFormatException -> L61
            if (r0 != r1) goto L8f
            goto L5b
        L51:
            r1 = 7112267900937846128(0x62b3d9f936d03d70, double:2.9265101631393314E167)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L61
            throw r0     // Catch: java.lang.NumberFormatException -> L61
        L5b:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L61
            goto L6b
        L61:
            r1 = 7112267900937846128(0x62b3d9f936d03d70, double:2.9265101631393314E167)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6b:
            r1 = r12
            short r1 = (short) r1     // Catch: java.lang.NumberFormatException -> L81
            r2 = r13
            r3 = r14
            short r3 = (short) r3     // Catch: java.lang.NumberFormatException -> L81
            boolean r0 = r0.B(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L81
            r1 = r15
            if (r1 != 0) goto L8c
            if (r0 == 0) goto L8f
            goto L8b
        L81:
            r1 = 7112267900937846128(0x62b3d9f936d03d70, double:2.9265101631393314E167)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 1
        L8c:
            goto L90
        L8f:
            r0 = 0
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.FC():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean Fz() {
        long j2 = ab ^ 5981219898177L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 84141854368741L);
            return objFX == dz.PACKET;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -8911901194517357679L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean Fi() {
        long j2 = ab ^ 41265789684292L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 119235298175712L);
            return objFX == dz.PACKET;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, 961432637734998676L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean P() {
        long j2 = ab ^ 108564433803094L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 47603029440498L);
            return objFX == dz.PACKET;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, 5784300708557098886L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean km() {
        long j2 = ab ^ 834902714602L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 80488580483150L);
            return objFX == dz.PACKET;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, 3456957630927433786L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean FE() {
        long j2 = ab ^ 38310142403554L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 117792016040774L);
            return objFX == dz.FIRE_WORK;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -6561262298269680846L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[PHI: r0 r1
  0x007d: PHI (r0v13 java.lang.Object) = (r0v11 java.lang.Object), (r0v16 java.lang.Object) binds: [B:13:0x0053, B:18:0x0066] A[DONT_GENERATE, DONT_INLINE]
  0x007d: PHI (r1v11 su.catlean.dz) = (r1v9 su.catlean.dz), (r1v13 su.catlean.dz) binds: [B:13:0x0053, B:18:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean FU() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 113274601126839(0x6705cc5cbbb7, double:5.59650889631413E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 51623853775635(0x2ef39d775b13, double:2.5505572656473E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r0 = -263195475239840717(0xfc58f11c17d6d433, double:-9.722640531474169E290)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r11 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L30
            r1 = r9
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L30
            su.catlean.dz r1 = su.catlean.dz.BOOST     // Catch: java.lang.NumberFormatException -> L30
            r2 = r11
            if (r2 != 0) goto L51
            if (r0 == r1) goto L8e
            goto L3a
        L30:
            r1 = -241800878220532889(0xfca4f361e349a367, double:-2.6133922700791564E292)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L3a:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L47
            r1 = r9
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L47
            su.catlean.dz r1 = su.catlean.dz.INFINITE     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = -241800878220532889(0xfca4f361e349a367, double:-2.6133922700791564E292)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r2 = r11
            if (r2 != 0) goto L7d
            if (r0 == r1) goto L8e
            goto L66
        L5c:
            r1 = -241800878220532889(0xfca4f361e349a367, double:-2.6133922700791564E292)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L73
            throw r0     // Catch: java.lang.NumberFormatException -> L73
        L66:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L73
            r1 = r9
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L73
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L73
            goto L7d
        L73:
            r1 = -241800878220532889(0xfca4f361e349a367, double:-2.6133922700791564E292)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L7d:
            if (r0 == r1) goto L8e
            r0 = 1
            goto L8f
        L84:
            r1 = -241800878220532889(0xfca4f361e349a367, double:-2.6133922700791564E292)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8e:
            r0 = 0
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.FU():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
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
    private static final boolean FY() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 133068444903885(0x79066963a9cd, double:6.57445471725283E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 53808294545769(0x30f038484969, double:2.65848297963714E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 55252680214764(0x3240846088ec, double:2.7298451134767E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -1287203624049850807(0xee22ef1fb2e9c649, double:-3.42208633446323E222)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L37
            r1 = r9
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L37
            su.catlean.dz r1 = su.catlean.dz.FIRE_WORK     // Catch: java.lang.NumberFormatException -> L37
            r2 = r13
            if (r2 != 0) goto L6a
            if (r0 == r1) goto L8a
            goto L41
        L37:
            r1 = -1234288241508175587(0xeedeed624676b11d, double:-1.1447706939027244E226)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L4c
            throw r0     // Catch: java.lang.NumberFormatException -> L4c
        L41:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L4c java.lang.NumberFormatException -> L60
            r1 = r13
            if (r1 != 0) goto L70
            goto L56
        L4c:
            r1 = -1234288241508175587(0xeedeed624676b11d, double:-1.1447706939027244E226)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L60
            throw r0     // Catch: java.lang.NumberFormatException -> L60
        L56:
            r1 = r9
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L60
            su.catlean.dz r1 = su.catlean.dz.PACKET     // Catch: java.lang.NumberFormatException -> L60
            goto L6a
        L60:
            r1 = -1234288241508175587(0xeedeed624676b11d, double:-1.1447706939027244E226)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6a:
            if (r0 != r1) goto L8e
            su.catlean.ut r0 = su.catlean.ut.D
        L70:
            r1 = r11
            boolean r0 = r0.kG(r1)     // Catch: java.lang.NumberFormatException -> L80
            r1 = r13
            if (r1 != 0) goto L8b
            if (r0 == 0) goto L8e
            goto L8a
        L80:
            r1 = -1234288241508175587(0xeedeed624676b11d, double:-1.1447706939027244E226)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8a:
            r0 = 1
        L8b:
            goto L8f
        L8e:
            r0 = 0
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.FY():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean V() {
        long j2 = ab ^ 48343576036977L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 107758792124117L);
            return objFX == dz.FIRE_WORK;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, 99852783908839073L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean Fe() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 134440754918262(0x7a45ed70b376, double:6.6422558406076E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 56847052264402(0x33b3bc5b53d2, double:2.8086175591183E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r0 = -821365576214848270(0xf499ec5c36fadcf2, double:-4.751452063376285E253)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r11 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L30
            r1 = r9
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L30
            su.catlean.dz r1 = su.catlean.dz.CONTROL     // Catch: java.lang.NumberFormatException -> L30
            r2 = r11
            if (r2 != 0) goto L51
            if (r0 == r1) goto L54
            goto L3a
        L30:
            r1 = -836000327044584538(0xf465ee21c265aba6, double:-5.024455727581507E252)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L3a:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L47
            r1 = r9
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L47
            su.catlean.dz r1 = su.catlean.dz.PACKET     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = -836000327044584538(0xf465ee21c265aba6, double:-5.024455727581507E252)
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
            r1 = -836000327044584538(0xf465ee21c265aba6, double:-5.024455727581507E252)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.Fe():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (r0 != r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
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
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean ko() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 133597506276308(0x798197e78bd4, double:6.6005938221184E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 53290994527088(0x3077c6cc6b70, double:2.6329249628548E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 98331958707530(0x596eb178054a, double:4.85824426856706E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -3730124428949986224(0xcc3bef984c6de450, double:-1.7535659710693273E59)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L35
            r1 = r13
            if (r1 != 0) goto L4f
            r1 = r11
            boolean r0 = r0.Fd(r1)     // Catch: java.lang.NumberFormatException -> L35 java.lang.NumberFormatException -> L45
            if (r0 == 0) goto L93
            goto L3f
        L35:
            r1 = -3690719798700633340(0xccc7ede5b8f29304, double:-7.690576181472337E61)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L45
            throw r0     // Catch: java.lang.NumberFormatException -> L45
        L3f:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L45
            goto L4f
        L45:
            r1 = -3690719798700633340(0xccc7ede5b8f29304, double:-7.690576181472337E61)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L4f:
            r1 = r9
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L61
            su.catlean.dz r1 = su.catlean.dz.CONTROL     // Catch: java.lang.NumberFormatException -> L61
            r2 = r13
            if (r2 != 0) goto L82
            if (r0 == r1) goto L85
            goto L6b
        L61:
            r1 = -3690719798700633340(0xccc7ede5b8f29304, double:-7.690576181472337E61)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L78
            r1 = r9
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L78
            su.catlean.dz r1 = su.catlean.dz.PACKET     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = -3690719798700633340(0xccc7ede5b8f29304, double:-7.690576181472337E61)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            if (r0 != r1) goto L93
        L85:
            r0 = 1
            goto L94
        L89:
            r1 = -3690719798700633340(0xccc7ede5b8f29304, double:-7.690576181472337E61)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L93:
            r0 = 0
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.ko():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean e() {
        long j2 = ab ^ 127118996313637L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 64232908748417L);
            return objFX == dz.FIRE_WORK;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -3371252213911679243L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean F8() {
        long j2 = ab ^ 11849495172269L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 73876622586889L);
            return objFX == dz.FIRE_WORK;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, 1422748954204195965L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean C() {
        long j2 = ab ^ 19824483190620L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 101094645344248L);
            return objFX == dz.FIRE_WORK;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, 22384285341343628L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean Fs() {
        long j2 = ab ^ 81954757717396L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 3847302106416L);
            return objFX == dz.FIRE_WORK;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -1547022834349525692L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean FA() {
        long j2 = ab ^ 40641476826610L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 119850087347542L);
            return objFX == dz.FIRE_WORK;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, 5972248725133659426L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean kM() {
        long j2 = ab ^ 70269274131360L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 129873472678660L);
            return objFX == dz.FIRE_WORK;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -3696422247195831440L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean k0() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 22406176732907(0x1460d83476eb, double:1.1070122178377E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 102901127026255(0x5d96891f964f, double:5.0839911782019E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 33589749170242(0x1e8cb9114042, double:1.6595541117441E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r2 = r1; r3 = r0; 
            r3 = 16
            long r2 = r2 << r3
            r3 = 32
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
            r0 = 3532091464030755183(0x3104827903be196f, double:1.4510069550872516E-72)
            r1 = r8
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L51
            r1 = r10
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L51
            su.catlean.dz r1 = su.catlean.dz.BOOST     // Catch: java.lang.NumberFormatException -> L51
            r2 = r15
            if (r2 != 0) goto La2
            if (r0 != r1) goto L8b
            goto L5b
        L51:
            r1 = 3600768660897099323(0x31f88004f7216e3b, double:5.679739482556939E-68)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L71
            throw r0     // Catch: java.lang.NumberFormatException -> L71
        L5b:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L71 java.lang.NumberFormatException -> L81
            r1 = r12
            short r1 = (short) r1     // Catch: java.lang.NumberFormatException -> L71 java.lang.NumberFormatException -> L81
            r2 = r13
            r3 = r14
            short r3 = (short) r3     // Catch: java.lang.NumberFormatException -> L71 java.lang.NumberFormatException -> L81
            boolean r0 = r0.B(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L71 java.lang.NumberFormatException -> L81
            r1 = r15
            if (r1 != 0) goto La6
            goto L7b
        L71:
            r1 = 3600768660897099323(0x31f88004f7216e3b, double:5.679739482556939E-68)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L81
            throw r0     // Catch: java.lang.NumberFormatException -> L81
        L7b:
            if (r0 == 0) goto La5
            goto L8b
        L81:
            r1 = 3600768660897099323(0x31f88004f7216e3b, double:5.679739482556939E-68)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L98
            throw r0     // Catch: java.lang.NumberFormatException -> L98
        L8b:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L98
            r1 = r10
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L98
            su.catlean.dz r1 = su.catlean.dz.CONTROL     // Catch: java.lang.NumberFormatException -> L98
            goto La2
        L98:
            r1 = 3600768660897099323(0x31f88004f7216e3b, double:5.679739482556939E-68)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        La2:
            if (r0 != r1) goto La9
        La5:
            r0 = 1
        La6:
            goto Laa
        La9:
            r0 = 0
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.k0():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean Fj() {
        long j2 = ab ^ 27634075512521L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 88873047346797L);
            return objFX == dz.BOOST;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, 7627564251234973209L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean G() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 92537217081603(0x54297ff3e103, double:4.5719459921774E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 32844400820647(0x1ddf2ed801a7, double:1.62272901037217E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r0 = -6418541854736150905(0xa6ecc230a4798e87, double:-3.4803170785030937E-121)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r11 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L30
            r1 = r9
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L30
            su.catlean.dz r1 = su.catlean.dz.CONTROL     // Catch: java.lang.NumberFormatException -> L30
            r2 = r11
            if (r2 != 0) goto L51
            if (r0 == r1) goto L54
            goto L3a
        L30:
            r1 = -6480468425483814445(0xa610c04d50e6f9d3, double:-2.474612551109597E-125)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L3a:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L47
            r1 = r9
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L47
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = -6480468425483814445(0xa610c04d50e6f9d3, double:-2.474612551109597E-125)
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
            r1 = -6480468425483814445(0xa610c04d50e6f9d3, double:-2.474612551109597E-125)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.G():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean FZ() {
        long j2 = ab ^ 11311880365522L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 74490062538102L);
            return objFX == dz.BOOST;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, 2504456787924188418L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean F() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 137741766345491(0x7d46810dc313, double:6.8053474748799E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 57934011048887(0x34b0d02623b7, double:2.86232045850423E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 131575788926394(0x77aae028f5ba, double:6.50070771329904E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r2 = r1; r3 = r0; 
            r3 = 16
            long r2 = r2 << r3
            r3 = 32
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
            r0 = -8863951171798717289(0x84fceb5f5a87ac97, double:-1.2154965911152645E-284)
            r1 = r8
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L51
            r1 = r10
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L51
            su.catlean.dz r1 = su.catlean.dz.BOOST     // Catch: java.lang.NumberFormatException -> L51
            r2 = r15
            if (r2 != 0) goto La2
            if (r0 != r1) goto L8b
            goto L5b
        L51:
            r1 = -8934885325544039485(0x8400e922ae18dbc3, double:-2.1690790832961005E-289)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L71
            throw r0     // Catch: java.lang.NumberFormatException -> L71
        L5b:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L71 java.lang.NumberFormatException -> L81
            r1 = r12
            short r1 = (short) r1     // Catch: java.lang.NumberFormatException -> L71 java.lang.NumberFormatException -> L81
            r2 = r13
            r3 = r14
            short r3 = (short) r3     // Catch: java.lang.NumberFormatException -> L71 java.lang.NumberFormatException -> L81
            boolean r0 = r0.B(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L71 java.lang.NumberFormatException -> L81
            r1 = r15
            if (r1 != 0) goto La6
            goto L7b
        L71:
            r1 = -8934885325544039485(0x8400e922ae18dbc3, double:-2.1690790832961005E-289)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L81
            throw r0     // Catch: java.lang.NumberFormatException -> L81
        L7b:
            if (r0 == 0) goto La5
            goto L8b
        L81:
            r1 = -8934885325544039485(0x8400e922ae18dbc3, double:-2.1690790832961005E-289)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L98
            throw r0     // Catch: java.lang.NumberFormatException -> L98
        L8b:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L98
            r1 = r10
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L98
            su.catlean.dz r1 = su.catlean.dz.CONTROL     // Catch: java.lang.NumberFormatException -> L98
            goto La2
        L98:
            r1 = -8934885325544039485(0x8400e922ae18dbc3, double:-2.1690790832961005E-289)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        La2:
            if (r0 != r1) goto La9
        La5:
            r0 = 1
        La6:
            goto Laa
        La9:
            r0 = 0
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.F():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean R() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 101426549503568(0x5c3f35743650, double:5.01113736859295E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 23954716612340(0x15c9645fd6f4, double:1.183520253402E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 95465652683001(0x56d3545100f9, double:4.7166299348483E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r2 = r1; r3 = r0; 
            r3 = 16
            long r2 = r2 << r3
            r3 = 32
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
            r0 = 8196492115404806612(0x71bfca26eefe59d4, double:8.280230034601676E239)
            r1 = r8
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L51
            r1 = r10
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L51
            su.catlean.dz r1 = su.catlean.dz.BOOST     // Catch: java.lang.NumberFormatException -> L51
            r2 = r15
            if (r2 != 0) goto La2
            if (r0 != r1) goto L8b
            goto L5b
        L51:
            r1 = 8161587243335626368(0x7143c85b1a612e80, double:4.025602107390739E237)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L71
            throw r0     // Catch: java.lang.NumberFormatException -> L71
        L5b:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L71 java.lang.NumberFormatException -> L81
            r1 = r12
            short r1 = (short) r1     // Catch: java.lang.NumberFormatException -> L71 java.lang.NumberFormatException -> L81
            r2 = r13
            r3 = r14
            short r3 = (short) r3     // Catch: java.lang.NumberFormatException -> L71 java.lang.NumberFormatException -> L81
            boolean r0 = r0.B(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L71 java.lang.NumberFormatException -> L81
            r1 = r15
            if (r1 != 0) goto La6
            goto L7b
        L71:
            r1 = 8161587243335626368(0x7143c85b1a612e80, double:4.025602107390739E237)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L81
            throw r0     // Catch: java.lang.NumberFormatException -> L81
        L7b:
            if (r0 == 0) goto La5
            goto L8b
        L81:
            r1 = 8161587243335626368(0x7143c85b1a612e80, double:4.025602107390739E237)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L98
            throw r0     // Catch: java.lang.NumberFormatException -> L98
        L8b:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L98
            r1 = r10
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L98
            su.catlean.dz r1 = su.catlean.dz.CONTROL     // Catch: java.lang.NumberFormatException -> L98
            goto La2
        L98:
            r1 = 8161587243335626368(0x7143c85b1a612e80, double:4.025602107390739E237)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        La2:
            if (r0 != r1) goto La9
        La5:
            r0 = 1
        La6:
            goto Laa
        La9:
            r0 = 0
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.R():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.ut] */
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
    private static final boolean k8() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 91595602697190(0x534e435c9be6, double:4.52542406028054E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 29377886124866(0x1ab812777b42, double:1.45146042817325E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 98552897973583(0x59a22279ad4f, double:4.8691601186845E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r2 = r1; r3 = r0; 
            r3 = 16
            long r2 = r2 << r3
            r3 = 32
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
            r0 = -2591323130557959070(0xdc09c55798d6f462, double:-2.3414080912458368E135)
            r1 = r8
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L51
            r1 = r15
            if (r1 != 0) goto L6b
            r1 = r10
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L51 java.lang.NumberFormatException -> L61
            su.catlean.dz r1 = su.catlean.dz.BOOST     // Catch: java.lang.NumberFormatException -> L51 java.lang.NumberFormatException -> L61
            if (r0 != r1) goto L8f
            goto L5b
        L51:
            r1 = -2524893031051984074(0xdcf5c72a6c498336, double:-6.483594137446884E139)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L61
            throw r0     // Catch: java.lang.NumberFormatException -> L61
        L5b:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L61
            goto L6b
        L61:
            r1 = -2524893031051984074(0xdcf5c72a6c498336, double:-6.483594137446884E139)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6b:
            r1 = r12
            short r1 = (short) r1     // Catch: java.lang.NumberFormatException -> L81
            r2 = r13
            r3 = r14
            short r3 = (short) r3     // Catch: java.lang.NumberFormatException -> L81
            boolean r0 = r0.B(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L81
            r1 = r15
            if (r1 != 0) goto L8c
            if (r0 != 0) goto L8f
            goto L8b
        L81:
            r1 = -2524893031051984074(0xdcf5c72a6c498336, double:-6.483594137446884E139)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 1
        L8c:
            goto L90
        L8f:
            r0 = 0
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.k8():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.ut] */
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
    private static final boolean Fx() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 51178904150111(0x2e8c0466e05f, double:2.5285738332372E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 113775114780923(0x677a554d00fb, double:5.62123755648987E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 122392045470659(0x6f509e64c3c3, double:6.04697049912924E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -6363383319628050469(0xa7b0b895dfec8fdb, double:-1.6576960596979387E-117)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            su.catlean.dz r1 = su.catlean.dz.BOOST     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            if (r0 != r1) goto L6f
            goto L41
        L37:
            r1 = -6391528264821376881(0xa74cbae82b73f88f, double:-2.225199456711669E-119)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L41:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = -6391528264821376881(0xa74cbae82b73f88f, double:-2.225199456711669E-119)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            boolean r0 = r0.F6(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = -6391528264821376881(0xa74cbae82b73f88f, double:-2.225199456711669E-119)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.Fx():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.ut] */
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
    private static final boolean kb() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 104947782799924(0x5f730f505234, double:5.18510940886513E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 24762071626384(0x16855e7bb290, double:1.22340889104566E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 33739473318312(0x1eaf955271a8, double:1.66695146753553E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 1575073955370909104(0x15dbc96ad4da3db0, double:2.215650534405763E-203)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            su.catlean.dz r1 = su.catlean.dz.BOOST     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            if (r0 != r1) goto L6f
            goto L41
        L37:
            r1 = 1524410299074300644(0x1527cb1720454ae4, double:9.263776374094721E-207)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L41:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = 1524410299074300644(0x1527cb1720454ae4, double:9.263776374094721E-207)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            boolean r0 = r0.F6(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = 1524410299074300644(0x1527cb1720454ae4, double:9.263776374094721E-207)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.kb():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.ut] */
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
    private static final boolean g() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 125501236989465(0x722488a64e19, double:6.20058497070754E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 65776779112125(0x3bd2d98daebd, double:3.2498046853389E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 134734925922121(0x7a8a6b65ff49, double:6.6567898193085E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 718012142651711901(0x9f6e43d532c219d, double:1.1631592198292516E-260)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L37
            r1 = r13
            if (r1 != 0) goto L51
            r1 = r9
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            su.catlean.dz r1 = su.catlean.dz.BOOST     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            if (r0 != r1) goto L6f
            goto L41
        L37:
            r1 = 651586261474301641(0x90ae640a7b356c9, double:4.171159625887602E-265)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L41:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = 651586261474301641(0x90ae640a7b356c9, double:4.171159625887602E-265)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            boolean r0 = r0.k3(r1)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r13
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L6f
            goto L6b
        L61:
            r1 = 651586261474301641(0x90ae640a7b356c9, double:4.171159625887602E-265)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.g():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean r() {
        long j2 = ab ^ 18370532635059L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 98146046284055L);
            return objFX == dz.CONTROL;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, 3936292107874429283L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean v() {
        long j2 = ab ^ 96478043018210L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 33300396667718L);
            return objFX == dz.BOOST;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -3102483322305082574L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean kv() {
        long j2 = ab ^ 103232971206134L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 22083072953682L);
            return objFX == dz.BOOST;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -6132273732120021722L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean z() {
        long j2 = ab ^ 29630761684029L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 91279365876889L);
            return objFX == dz.BOOST;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, 805738161934390509L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean F0() {
        long j2 = ab ^ 30375680035157L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 90530171431409L);
            return objFX == dz.BOOST;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, 1028667638161297797L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean FS() {
        long j2 = ab ^ 119005080307646L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 41550967088922L);
            return objFX == dz.BOOST;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -9174403808361652370L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean kB() {
        long j2 = ab ^ 33238427169747L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 96536865215351L);
            return objFX == dz.INFINITE;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -5422181811739301117L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean Fq() {
        long j2 = ab ^ 74936684481304L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 15195046833084L);
            return objFX == dz.SILENT_FIRE_WORK;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -3743669676339588152L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean w() {
        long j2 = ab ^ 58828553746472L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 136851719952524L);
            return objFX == dz.SILENT_FIRE_WORK;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, 4556413453876158712L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean t() {
        long j2 = ab ^ 38381147856930L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 117777121984646L);
            return objFX == dz.SILENT_FIRE_WORK;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, 7435925173816670450L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean F_() {
        long j2 = ab ^ 106528960259669L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 45171882215153L);
            return objFX == dz.SILENT_FIRE_WORK;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -2213813305682641275L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
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
    private static final boolean F7() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 22413944708521(0x1462a7365da9, double:1.10739600682654E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 102894365687053(0x5d94f61dbd0d, double:5.0836571236599E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 128618996636567(0x74fa719b1b97, double:6.35462276406986E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 1893344160241168941(0x1a46827b7cbc322d, double:4.238012921364085E-182)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L35
            r1 = r13
            if (r1 != 0) goto L4f
            r1 = r11
            boolean r0 = r0.kp(r1)     // Catch: java.lang.NumberFormatException -> L35 java.lang.NumberFormatException -> L45
            if (r0 == 0) goto L67
            goto L3f
        L35:
            r1 = 1925992556196480377(0x1aba800688234579, double:6.386311661513937E-180)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L45
            throw r0     // Catch: java.lang.NumberFormatException -> L45
        L3f:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L45
            goto L4f
        L45:
            r1 = 1925992556196480377(0x1aba800688234579, double:6.386311661513937E-180)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L4f:
            r1 = r9
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L5d
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L5d
            if (r0 != r1) goto L67
            r0 = 1
            goto L68
        L5d:
            r1 = 1925992556196480377(0x1aba800688234579, double:6.386311661513937E-180)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L67:
            r0 = 0
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.F7():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean Fh() {
        long j2 = ab ^ 55946016700670L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 135341454940250L);
            return objFX == dz.SILENT_FIRE_WORK;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -5164930682150866L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean FQ() {
        long j2 = ab ^ 11936373399074L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 73862538608262L);
            return objFX == dz.SILENT_FIRE_WORK;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -7407965368731384078L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.dz] */
    private static final boolean kw() {
        long j2 = ab ^ 100394179085916L;
        Object objFX = j2;
        try {
            objFX = D.FX(objFX ^ 20583736289016L);
            return objFX == dz.SILENT_FIRE_WORK;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -9128850136192721268L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
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
    private static final boolean FM() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 23836898744396(0x15adf5e1d84c, double:1.17769927730024E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 104568258451814(0x5f1ab1e65966, double:5.166358414649E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 101548676495592(0x5c5ba4ca38e8, double:5.01717124371185E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -6943561390579009592(0x9fa383b42e6bb7c8, double:-2.842686567771854E-156)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 != 0) goto L4e
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NumberFormatException -> L44
            if (r0 == 0) goto L67
            goto L3e
        L34:
            r1 = -6962703794929614692(0x9f5f81c9daf4c09c, double:-1.434264156301464E-157)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L44
            throw r0     // Catch: java.lang.NumberFormatException -> L44
        L3e:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L44
            goto L4e
        L44:
            r1 = -6962703794929614692(0x9f5f81c9daf4c09c, double:-1.434264156301464E-157)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L4e:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L5d
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L5d
            if (r0 != r1) goto L67
            r0 = 1
            goto L68
        L5d:
            r1 = -6962703794929614692(0x9f5f81c9daf4c09c, double:-1.434264156301464E-157)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L67:
            r0 = 0
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.FM():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean T() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 27115896244788(0x18a9695d0a34, double:1.33970327907454E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 90289563405086(0x521e2d5a8b1e, double:4.4608971456458E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 89469411060368(0x515f3876ea90, double:4.42037623585767E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 89536752897508(0x516ee659cde4, double:4.42370336468354E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = 5610234650385933744(0x4ddb8eb0b2d765b0, double:1.1608524922149479E67)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = 5559567078287479524(0x4d278ccd464812e4, double:4.8439555299736256E63)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = 5559567078287479524(0x4d278ccd464812e4, double:4.8439555299736256E63)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = 5559567078287479524(0x4d278ccd464812e4, double:4.8439555299736256E63)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = 5559567078287479524(0x4d278ccd464812e4, double:4.8439555299736256E63)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.T():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean h() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 1598518712156(0x1742f23d75c, double:7.897731799107E-312)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 83302688249462(0x4bc36b245676, double:4.11569964702825E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 79725297416184(0x48827e0837f8, double:3.93895305578124E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 79936323260556(0x48b3a027108c, double:3.94937911779013E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -8019900012904728360(0x90b3976df4a9b8d8, double:-3.230512764639209E-228)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = -8048050113132179572(0x904f95100036cf8c, double:-4.0685226871120304E-230)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = -8048050113132179572(0x904f95100036cf8c, double:-4.0685226871120304E-230)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = -8048050113132179572(0x904f95100036cf8c, double:-4.0685226871120304E-230)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = -8048050113132179572(0x904f95100036cf8c, double:-4.0685226871120304E-230)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.h():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean FI() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 3125116590208(0x2d79f76d880, double:1.5440127464703E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 79580835699114(0x4860db7159aa, double:3.9318156986269E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 82608568219684(0x4b21ce5d3824, double:4.0814055609479E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 82532367474512(0x4b1010721f50, double:4.0776407439102E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -6958179285622540540(0x9f6f94ce44fcb704, double:-2.875291631492678E-157)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = -6948044101599903664(0x9f9396b3b063c050, double:-1.4267484860225374E-156)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = -6948044101599903664(0x9f9396b3b063c050, double:-1.4267484860225374E-156)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = -6948044101599903664(0x9f9396b3b063c050, double:-1.4267484860225374E-156)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = -6948044101599903664(0x9f9396b3b063c050, double:-1.4267484860225374E-156)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.FI():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean kR() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 28206555871242(0x19a759be380a, double:1.39358902434824E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 91328683292960(0x53101db9b920, double:4.5122364894967E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 88308966611118(0x50510895d8ae, double:4.3630426622295E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 88376849661914(0x5060d6baffda, double:4.36639653056283E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = 9215930260874614670(0x7fe58fbe8234578e, double:1.211280054720189E308)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = 9158507187883679962(0x7f198dc376ab20da, double:1.7523889820056747E304)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = 9158507187883679962(0x7f198dc376ab20da, double:1.7523889820056747E304)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = 9158507187883679962(0x7f198dc376ab20da, double:1.7523889820056747E304)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = 9158507187883679962(0x7f198dc376ab20da, double:1.7523889820056747E304)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.kR():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean Ft() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 119236958646417(0x6c7204907091, double:5.8910884981788E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 42628634112443(0x26c54097f1bb, double:2.10613436440943E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 41250304266293(0x258455bb9035, double:2.0380358218474E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 41461661087553(0x25b58b94b741, double:2.0484782362873E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = 3998908860363054869(0x377efa6bdf1a1f15, double:2.222577458291463E-41)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = 4000032193161553985(0x3782f8162b856841, double:2.721930678968737E-41)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = 4000032193161553985(0x3782f8162b856841, double:2.721930678968737E-41)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = 4000032193161553985(0x3782f8162b856841, double:2.721930678968737E-41)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = 4000032193161553985(0x3782f8162b856841, double:2.721930678968737E-41)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.Ft():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean K() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 98782594163432(0x59d79d6f62e8, double:4.880508618323E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 21306685318082(0x1360d968e3c2, double:1.05269012424144E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 17737347007052(0x1021cc44824c, double:8.7634138045494E-311)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 17661214565688(0x1010126ba538, double:8.7257993807375E-311)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = 2668329789099937132(0x2507cfce46e50d6c, double:2.6837560809051866E-130)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = 2737007370234919480(0x25fbcdb3b27a7a38, double:1.0268373412393251E-125)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = 2737007370234919480(0x25fbcdb3b27a7a38, double:1.0268373412393251E-125)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = 2737007370234919480(0x25fbcdb3b27a7a38, double:1.0268373412393251E-125)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = 2737007370234919480(0x25fbcdb3b27a7a38, double:1.0268373412393251E-125)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.K():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean Fo() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 91237565177058(0x52fae6a99ce2, double:4.5077346564186E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 26721720868296(0x184da2ae1dc8, double:1.3202284278784E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 29741432339526(0x1b0cb7827c46, double:1.46942199770716E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 29950579923762(0x1b3d69ad5b32, double:1.47975526133533E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -2662255324443708570(0xdb0dc4e33d23f366, double:-4.126993014474573E130)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = -2598077124724358094(0xdbf1c69ec9bc8432, double:-8.07511481619552E134)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = -2598077124724358094(0xdbf1c69ec9bc8432, double:-8.07511481619552E134)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = -2598077124724358094(0xdbf1c69ec9bc8432, double:-8.07511481619552E134)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = -2598077124724358094(0xdbf1c69ec9bc8432, double:-8.07511481619552E134)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.Fo():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean ky() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 49575220357618(0x2d16a16629f2, double:2.44934132637087E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 113945035778264(0x67a1e561a8d8, double:5.6296327692192E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 110917267081558(0x64e0f04dc956, double:5.4800411195596E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 110849589177890(0x64d12e62ee22, double:5.4766973868411E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = 7934703793657890422(0x6e1dbb0f7aec4676, double:2.6867176257716344E222)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = 7989871115599294754(0x6ee1b9728e733122, double:1.3121346598596101E226)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = 7989871115599294754(0x6ee1b9728e733122, double:1.3121346598596101E226)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = 7989871115599294754(0x6ee1b9728e733122, double:1.3121346598596101E226)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = 7989871115599294754(0x6ee1b9728e733122, double:1.3121346598596101E226)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.ky():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean kq() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 38826838119244(0x235013e4d34c, double:1.9183006851358E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 116442332877414(0x69e757e35266, double:5.7530156396341E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 117262317990888(0x6aa642cf33e8, double:5.79352828710097E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 117199404536988(0x6a979ce0149c, double:5.79041994947765E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -7736140406392439608(0x94a3b549c86ebcc8, double:-2.99736089822505E-209)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = -7755278598320043108(0x945fb7343cf1cb9c, double:-1.5073584329955946E-210)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = -7755278598320043108(0x945fb7343cf1cb9c, double:-1.5073584329955946E-210)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = -7755278598320043108(0x945fb7343cf1cb9c, double:-1.5073584329955946E-210)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = -7755278598320043108(0x945fb7343cf1cb9c, double:-1.5073584329955946E-210)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.kq():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean Z() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 91152080752388(0x52e6ff64cf04, double:4.5035111646702E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 26739315265070(0x1851bb634e2e, double:1.32109770657895E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 29758457851808(0x1b10ae4f2fa0, double:1.4702631697793E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 29830433212628(0x1b21706008d4, double:1.4738192250921E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -8580548064909025152(0x88ebc4ff24eea080, double:-1.0765201967179329E-265)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = -8640219094941837356(0x8817c682d071d7d4, double:-1.1251031463330111E-269)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = -8640219094941837356(0x8817c682d071d7d4, double:-1.1251031463330111E-269)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = -8640219094941837356(0x8817c682d071d7d4, double:-1.1251031463330111E-269)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = -8640219094941837356(0x8817c682d071d7d4, double:-1.1251031463330111E-269)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.Z():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean l() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 82504850523799(0x4b09a84ec697, double:4.07628122590763E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 1919519639485(0x1beec4947bd, double:9.48368710387E-312)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 3298424071731(0x2fff9652633, double:1.629638019258E-311)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 3084445679943(0x2ce274a0147, double:1.5239186469233E-311)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -9117294382880085741(0x8178dd1073c4a913, double:-1.450264382163844E-301)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = -9113914084375667129(0x8184df6d875bde47, double:-2.4349740270443946E-301)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = -9113914084375667129(0x8184df6d875bde47, double:-2.4349740270443946E-301)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = -9113914084375667129(0x8184df6d875bde47, double:-2.4349740270443946E-301)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = -9113914084375667129(0x8184df6d875bde47, double:-2.4349740270443946E-301)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.l():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean Fw() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 93640080599789(0x552a47bdaaed, double:4.6264346898161E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 34759232859079(0x1f9d03ba2bc7, double:1.7173342831467E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 31731597331017(0x1cdc16964a49, double:1.56774921289233E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 31807600422205(0x1cedc8b96d3d, double:1.5715042645257E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -1368316710335560343(0xed02c3339c37c569, double:-1.29359325139954E217)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = -1297387100128628163(0xedfec14e68a8b23d, double:-6.948227140164372E221)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = -1297387100128628163(0xedfec14e68a8b23d, double:-6.948227140164372E221)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = -1297387100128628163(0xedfec14e68a8b23d, double:-6.948227140164372E221)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = -1297387100128628163(0xedfec14e68a8b23d, double:-6.948227140164372E221)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.Fw():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean n() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 98265115290814(0x595f214a6cbe, double:4.85494176498206E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 21888852946324(0x13e8654ded94, double:1.08145302676496E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 18319920958490(0x10a970618c1a, double:9.051243580117E-311)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 18247945464686(0x1098ae4eab6e, double:9.015682961286E-311)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = 3121503920506012474(0x2b51cf46fac0033a, double:5.089059009475472E-100)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = 3147397368129746030(0x2badcd3b0e5f746e, double:2.7250357755122947E-98)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = 3147397368129746030(0x2badcd3b0e5f746e, double:2.7250357755122947E-98)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = 3147397368129746030(0x2badcd3b0e5f746e, double:2.7250357755122947E-98)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = 3147397368129746030(0x2badcd3b0e5f746e, double:2.7250357755122947E-98)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.n():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean FD() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 37865638172107(0x227047e995cb, double:1.8708110978693E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 115203973715169(0x68c703ee14e1, double:5.6918325677063E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 118223651632495(0x6b8616c2756f, double:5.8410244797519E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 118437094183451(0x6bb7c8ed521b, double:5.85156994293073E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -3304317860894737841(0xd224b4699c63fa4f, double:-5.148473281216851E87)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = -3253650531998200549(0xd2d8b61468fc8d1b, double:-1.2584425774406842E91)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = -3253650531998200549(0xd2d8b61468fc8d1b, double:-1.2584425774406842E91)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = -3253650531998200549(0xd2d8b61468fc8d1b, double:-1.2584425774406842E91)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = -3253650531998200549(0xd2d8b61468fc8d1b, double:-1.2584425774406842E91)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.FD():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean kh() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 51234992292208(0x2e9913840170, double:2.5313449556521E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 110150199509082(0x642e5783805a, double:5.4421429459997E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 113727557853652(0x676f42afe1d4, double:5.61888793209123E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 113656050271904(0x675e9c80c6a0, double:5.61535498813534E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = 5088988967203663604(0x469fb880c80e6ef4, double:1.6084313388760183E32)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = 5072103202154944928(0x4663bafd3c9119a0, double:1.2505643550790147E31)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = 5072103202154944928(0x4663bafd3c9119a0, double:1.2505643550790147E31)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = 5072103202154944928(0x4663bafd3c9119a0, double:1.2505643550790147E31)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = 5072103202154944928(0x4663bafd3c9119a0, double:1.2505643550790147E31)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.kh():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean s() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 92305020112383(0x53f36fef4dff, double:4.5604739376214E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 27780585147605(0x19442be8ccd5, double:1.3725432742799E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 28609830235483(0x1a053ec4ad5b, double:1.41351342527023E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 28814414154287(0x1a34e0eb8a2f, double:1.4236212138675E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = 725297151846195835(0xa10c5eab465227b, double:3.409081754938465E-260)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = 787223487327130927(0xaecc79740fa552f, double:4.791806058580783E-256)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = 787223487327130927(0xaecc79740fa552f, double:4.791806058580783E-256)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = 787223487327130927(0xaecc79740fa552f, double:4.791806058580783E-256)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = 787223487327130927(0xaecc79740fa552f, double:4.791806058580783E-256)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.s():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean k9() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 100495804993987(0x5b6680c211c3, double:4.965152479869E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 19592647119081(0x11d1c4c590e9, double:9.6800538526284E-311)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 20413206360423(0x1290d1e9f167, double:1.0085463984153E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 20482963723795(0x12a10fc6d613, double:1.01199287009396E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = 6209563933113089607(0x562ccd7f5b487e47, double:1.3211801781696046E107)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = 6255727492864608531(0x56d0cf02afd70913, double:1.5790317786018035E110)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = 6255727492864608531(0x56d0cf02afd70913, double:1.5790317786018035E110)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = 6255727492864608531(0x56d0cf02afd70913, double:1.5790317786018035E110)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = 6255727492864608531(0x56d0cf02afd70913, double:1.5790317786018035E110)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.k9():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean kH() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 97509438571428(0x58af2f72c3a4, double:4.817606374341E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 19896091361934(0x12186b75428e, double:9.8299752284504E-311)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 19076069532416(0x11597e592300, double:9.4248306136456E-311)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 19141066359924(0x1168a0760474, double:9.456943313206E-311)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -8913803752260457440(0x844bceb6f4f8ac20, double:-5.706841086600648E-288)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = -8883406567707780236(0x84b7cccb0067db74, double:-6.252023247083745E-286)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = -8883406567707780236(0x84b7cccb0067db74, double:-6.252023247083745E-286)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = -8883406567707780236(0x84b7cccb0067db74, double:-6.252023247083745E-286)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = -8883406567707780236(0x84b7cccb0067db74, double:-6.252023247083745E-286)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.kH():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ut] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dz] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean p() {
        /*
            long r0 = su.catlean.ut.ab
            r1 = 95731883184101(0x571150e40fe5, double:4.72978346929516E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 32599152234191(0x1da614e38ecf, double:1.61061212024627E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 33977516683073(0x1ee701cfef41, double:1.6787123724104E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 33908227885109(0x1ed6dfe0c835, double:1.67528905093885E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = 5191173762941083745(0x480ac1088b6e6061, double:1.1379908636882022E39)
            r1 = r7
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r9
            boolean r0 = r0.kZ(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r15
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L8b
            goto L45
        L3b:
            r1 = 5257604524426729269(0x48f6c3757ff11735, double:3.172770457656665E43)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            throw r0     // Catch: java.lang.NumberFormatException -> L50
        L45:
            su.catlean.ut r0 = su.catlean.ut.D     // Catch: java.lang.NumberFormatException -> L50 java.lang.NumberFormatException -> L62
            r1 = r15
            if (r1 != 0) goto L72
            goto L5a
        L50:
            r1 = 5257604524426729269(0x48f6c3757ff11735, double:3.172770457656665E43)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L62
            throw r0     // Catch: java.lang.NumberFormatException -> L62
        L5a:
            r1 = r13
            boolean r0 = r0.Ff(r1)     // Catch: java.lang.NumberFormatException -> L62
            goto L6c
        L62:
            r1 = 5257604524426729269(0x48f6c3757ff11735, double:3.172770457656665E43)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6c:
            if (r0 == 0) goto L8b
            su.catlean.ut r0 = su.catlean.ut.D
        L72:
            r1 = r11
            su.catlean.dz r0 = r0.FX(r1)     // Catch: java.lang.NumberFormatException -> L81
            su.catlean.dz r1 = su.catlean.dz.SILENT_FIRE_WORK     // Catch: java.lang.NumberFormatException -> L81
            if (r0 != r1) goto L8b
            r0 = 1
            goto L8c
        L81:
            r1 = 5257604524426729269(0x48f6c3757ff11735, double:3.172770457656665E43)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8b:
            r0 = 0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.p():boolean");
    }

    public static void j(_g[] _gVarArr) {
        p7 = _gVarArr;
    }

    public static _g[] FH() {
        return p7;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 31703;
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
                throw new RuntimeException("su/catlean/ut", e2);
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
            java.lang.String r1 = "su/catlean/ut"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 7322;
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
                    throw new RuntimeException("su/catlean/ut", e2);
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
            java.lang.String r1 = "su/catlean/ut"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ut.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
