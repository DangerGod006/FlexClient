package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/uy.class */
public final class uy extends _g {

    @NotNull
    public static final uy U = null;
    static final KProperty[] o = null;

    @NotNull
    private static final ct X = null;

    @NotNull
    private static final cq I = null;

    @NotNull
    private static final c8 G = null;

    @NotNull
    private static final cq n = null;

    @NotNull
    private static final cq u = null;

    @NotNull
    private static final c8 t = null;

    @NotNull
    private static final cq k = null;

    @NotNull
    private static final cq S = null;

    @NotNull
    private static final cq e = null;

    @NotNull
    private static final cq d = null;

    @NotNull
    private static final cq f = null;

    @NotNull
    private static final cq W = null;

    @NotNull
    private static final ct m = null;

    @NotNull
    private static final ct O = null;

    @NotNull
    private static final ct Kb = null;

    @NotNull
    private static final ct g = null;

    @NotNull
    private static final ct x = null;

    @NotNull
    private static final ct E = null;

    @NotNull
    private static final ct N = null;

    @NotNull
    private static final ct B = null;

    @NotNull
    private static final ct C = null;

    @NotNull
    private static final ct Y = null;

    @NotNull
    private static final ct T = null;

    @NotNull
    private static final ct KR = null;

    @NotNull
    private static final ct L = null;

    @NotNull
    private static final ct c = null;

    @NotNull
    private static final ct l = null;

    @NotNull
    private static final ct b = null;

    @NotNull
    private static final ct w = null;

    @NotNull
    private static final ct Kk = null;

    @NotNull
    private static final ct K2 = null;

    @NotNull
    private static final i9 K = null;

    @NotNull
    private static final i9 V = null;

    @NotNull
    private static final i9 F = null;

    @NotNull
    private static final i9 A = null;
    private static boolean D;

    @Nullable
    private static _w a;

    @Nullable
    private static class_2350 Kd;
    private static boolean y;

    @Nullable
    private static class_238 i;

    @Nullable
    private static class_238 P;

    @Nullable
    private static class_243 J;

    @NotNull
    private static final HashMap h = null;

    @NotNull
    private static HashMap j;
    private static int[] z;
    private static final long ab = 0;
    private static final String[] fb = null;
    private static final String[] gb = null;
    private static final Map hb = null;
    private static final long[] lb = null;
    private static final Integer[] mb = null;
    private static final Map nb = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private uy(long j2) {
        long j3 = ab ^ j2;
        super((String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18250, 1185155302391588066L ^ j3) /* invoke-custom */, jt.V(), null, 4, null, j3 ^ 21437846921522L);
    }

    private final float M(long j2) {
        return ((Number) X.E(this, (ab ^ j2) ^ 111635318229910L, o[0])).floatValue();
    }

    private final boolean PX(int i2, char c2, short s) {
        return ((Boolean) I.E(this, ((((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ ab) ^ 57748419981595L, o[1])).booleanValue();
    }

    private final int h(byte b2, int i2, int i3) {
        return ((Number) G.E(this, ((((((long) b2) << 56) | ((((long) i2) << 32) >>> 8)) | ((((long) i3) << 40) >>> 40)) ^ ab) ^ 104650907883326L, o[2])).intValue();
    }

    private final boolean x(long j2) {
        return ((Boolean) n.E(this, (ab ^ j2) ^ 106504911344352L, o[3])).booleanValue();
    }

    private final boolean L(long j2) {
        return ((Boolean) u.E(this, (ab ^ j2) ^ 46089506604864L, o[4])).booleanValue();
    }

    private final int Ph(long j2) {
        return ((Number) t.E(this, (ab ^ j2) ^ 69429766649852L, o[5])).intValue();
    }

    private final boolean PH(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) k.E(this, j3 ^ 123722507132729L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27740, 4054341623927103616L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean D(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) S.E(this, j3 ^ 62058054822636L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18113, 2150241528671666145L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean a(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) e.E(this, j3 ^ 126611837812345L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8099, 6311589473310339604L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean PT(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) d.E(this, j3 ^ 13734916451302L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19341, 4883834650605728685L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean G(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) f.E(this, j3 ^ 62692529290052L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31785, 2827276635974194329L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean Pl(long j2) {
        long j3 = ab ^ j2;
        return ((Boolean) W.E(this, j3 ^ 69552320954481L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25740, 2988058831765616441L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final float r(long j2) {
        long j3 = ab ^ j2;
        return ((Number) m.E(this, j3 ^ 74063177103741L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27102, 6219870761579496257L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float E(long j2) {
        long j3 = ab ^ j2;
        return ((Number) O.E(this, j3 ^ 91056435130791L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22728, 3811183628001983167L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float Pf(char c2, int i2, short s) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s) << 48) >>> 48)) ^ ab;
        return ((Number) Kb.E(this, j2 ^ 72601450443698L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4287, 7436320857163231440L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final float PU(long j2) {
        long j3 = ab ^ j2;
        return ((Number) g.E(this, j3 ^ 5233493809817L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14209, 3808286694994067160L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float q(long j2) {
        long j3 = ab ^ j2;
        return ((Number) x.E(this, j3 ^ 93227769262721L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3116, 1397812211804269939L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float j(long j2) {
        long j3 = ab ^ j2;
        return ((Number) E.E(this, j3 ^ 38553668791699L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27145, 6117814638502106188L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float C(short s, char c2, int i2) {
        long j2 = (((((long) s) << 48) | ((((long) c2) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ ab;
        return ((Number) N.E(this, j2 ^ 51961561203460L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27146, 1998141324671498953L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final float Pa(long j2) {
        long j3 = ab ^ j2;
        return ((Number) B.E(this, j3 ^ 120539337490254L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20809, 7834724474429455866L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float P(int i2, char c2, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ ab;
        return ((Number) C.E(this, j2 ^ 40153131291399L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24743, 5683200399036768327L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final float z(int i2, char c2, char c3) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) c3) << 48) >>> 48)) ^ ab;
        return ((Number) Y.E(this, j2 ^ 11503249358233L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4519, 6819316691027886057L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final float Q(int i2, int i3, int i4) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) i4) << 48) >>> 48)) ^ ab;
        return ((Number) T.E(this, j2 ^ 56904144087758L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6450, 4994686408012849199L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final float s(long j2) {
        long j3 = ab ^ j2;
        return ((Number) KR.E(this, j3 ^ 96397048232261L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26438, 211761609340505567L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float A(long j2) {
        long j3 = ab ^ j2;
        return ((Number) L.E(this, j3 ^ 17149361092632L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10963, 8848438528947175697L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float w(char c2, short s, int i2) {
        long j2 = (((((long) c2) << 48) | ((((long) s) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ ab;
        return ((Number) c.E(this, j2 ^ 7503346169850L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27746, 1585473326329366617L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final float P7(long j2) {
        long j3 = ab ^ j2;
        return ((Number) l.E(this, j3 ^ 110772491390889L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32762, 4574118606120903553L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float Y(long j2) {
        long j3 = ab ^ j2;
        return ((Number) b.E(this, j3 ^ 135681377660137L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2190, 3994350760875587473L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float Z(int i2, long j2) {
        long j3 = ((((long) i2) << 32) | ((j2 << 32) >>> 32)) ^ ab;
        return ((Number) w.E(this, j3 ^ 134370841798311L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12195, 5242956707511573190L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float PJ(long j2) {
        long j3 = ab ^ j2;
        return ((Number) Kk.E(this, j3 ^ 13748554467928L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19402, 5635569553551872638L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float F(long j2) {
        long j3 = ab ^ j2;
        return ((Number) K2.E(this, j3 ^ 83089978397090L, o[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24166, 6991713865602325525L ^ j3) /* invoke-custom */])).floatValue();
    }

    @NotNull
    public final HashMap Pd() {
        return h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [su.catlean.us] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.us] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
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
    @Override // su.catlean._g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(long r8) {
        /*
            r7 = this;
            r0 = r8
            r1 = r0; r0 = r0; 
            r2 = 57994491392730(0x34bee50ef2da, double:2.8653085845184E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 133899321791605(0x79c7dd82d475, double:6.6155054898674E-310)
            long r1 = r1 ^ r2
            r12 = r1
            r0 = 1425088517856840087(0x13c6ee74e0584997, double:2.128653609112611E-213)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r14 = r0
            boolean r0 = su.catlean.uy.y     // Catch: java.lang.NumberFormatException -> L28
            r1 = r14
            if (r1 == 0) goto L5f
            if (r0 == 0) goto L84
            goto L32
        L28:
            r1 = 1430161254882443733(0x13d8f41580cb81d5, double:4.6326952402270054E-213)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L43
            throw r0     // Catch: java.lang.NumberFormatException -> L43
        L32:
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7d
            su.catlean.us r0 = su.catlean.us.z     // Catch: java.lang.NumberFormatException -> L43 java.lang.NumberFormatException -> L55
            r1 = r14
            if (r1 == 0) goto L79
            goto L4d
        L43:
            r1 = 1430161254882443733(0x13d8f41580cb81d5, double:4.6326952402270054E-213)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L55
            throw r0     // Catch: java.lang.NumberFormatException -> L55
        L4d:
            r1 = r12
            boolean r0 = r0.f(r1)     // Catch: java.lang.NumberFormatException -> L55
            goto L5f
        L55:
            r1 = 1430161254882443733(0x13d8f41580cb81d5, double:4.6326952402270054E-213)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L5f:
            if (r0 == 0) goto L84
            su.catlean.sg r0 = su.catlean.sg.H     // Catch: java.lang.NumberFormatException -> L6f
            r1 = 1
            r0.t(r1)     // Catch: java.lang.NumberFormatException -> L6f
            su.catlean.us r0 = su.catlean.us.z     // Catch: java.lang.NumberFormatException -> L6f
            goto L79
        L6f:
            r1 = 1430161254882443733(0x13d8f41580cb81d5, double:4.6326952402270054E-213)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L79:
            r1 = r10
            r0.d(r1)
        L7d:
            su.catlean.sg r0 = su.catlean.sg.H
            r1 = 0
            r0.t(r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.b(long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x03dc: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void f(su.catlean.api.event.events.player.PostSyncEvent r12) {
        /*
            Method dump skipped, instruction units count: 1013
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.f(su.catlean.api.event.events.player.PostSyncEvent):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:57:0x01a8
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow(priority = -10)
    private final void p(su.catlean.api.event.events.player.PlayerUpdateEvent r9) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.p(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
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
    private final void Q(su.catlean.api.event.events.world.FireWorkVelocityEvent r14) {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.Q(su.catlean.api.event.events.world.FireWorkVelocityEvent):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:36:0x0119
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void S(su.catlean.api.event.events.render.Render3DEvent r12) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.S(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [net.minecraft.class_2596] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v30, types: [int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
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
    private final void w(su.catlean.api.event.events.network.ReceivePacket r8) {
        /*
            r7 = this;
            long r0 = su.catlean.uy.ab
            r1 = 122719303295030(0x6f9cd07ae036, double:6.0631391839647E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 125258399553182(0x71ebfe69169e, double:6.1885872072284E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 2629201328435133997(0x247cccad985c7e2d, double:6.3396784765113676E-133)
            r1 = r9
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            r0 = r8
            net.minecraft.class_2596 r0 = r0.getPacket()     // Catch: java.lang.NumberFormatException -> L32
            boolean r0 = r0 instanceof net.minecraft.class_2616     // Catch: java.lang.NumberFormatException -> L32
            if (r0 == 0) goto Lc4
            su.catlean.um r0 = su.catlean.um.E     // Catch: java.lang.NumberFormatException -> L32
            net.minecraft.class_1297 r0 = r0.BR()     // Catch: java.lang.NumberFormatException -> L32
            if (r0 == 0) goto Lc4
            goto L3c
        L32:
            r1 = 2621894108919084655(0x2462d6ccf8cfb66f, double:2.0735345537941516E-133)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L3c:
            r0 = r8
            net.minecraft.class_2596 r0 = r0.getPacket()
            r14 = r0
            r0 = r14
            net.minecraft.class_2616 r0 = (net.minecraft.class_2616) r0     // Catch: java.lang.NumberFormatException -> L62
            int r0 = r0.method_11269()     // Catch: java.lang.NumberFormatException -> L62
            r1 = r13
            if (r1 == 0) goto L81
            su.catlean.um r1 = su.catlean.um.E     // Catch: java.lang.NumberFormatException -> L62 java.lang.NumberFormatException -> L77
            net.minecraft.class_1297 r1 = r1.BR()     // Catch: java.lang.NumberFormatException -> L62 java.lang.NumberFormatException -> L77
            r2 = r1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.NumberFormatException -> L62 java.lang.NumberFormatException -> L77
            int r1 = r1.method_5628()     // Catch: java.lang.NumberFormatException -> L62 java.lang.NumberFormatException -> L77
            if (r0 != r1) goto Lc4
            goto L6c
        L62:
            r1 = 2621894108919084655(0x2462d6ccf8cfb66f, double:2.0735345537941516E-133)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L77
            throw r0     // Catch: java.lang.NumberFormatException -> L77
        L6c:
            r0 = r14
            net.minecraft.class_2616 r0 = (net.minecraft.class_2616) r0     // Catch: java.lang.NumberFormatException -> L77
            int r0 = r0.method_11267()     // Catch: java.lang.NumberFormatException -> L77
            goto L81
        L77:
            r1 = 2621894108919084655(0x2462d6ccf8cfb66f, double:2.0735345537941516E-133)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L81:
            r1 = r13
            if (r1 == 0) goto Lab
            if (r0 == 0) goto Laf
            goto L96
        L8c:
            r1 = 2621894108919084655(0x2462d6ccf8cfb66f, double:2.0735345537941516E-133)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> La1
            throw r0     // Catch: java.lang.NumberFormatException -> La1
        L96:
            r0 = r14
            net.minecraft.class_2616 r0 = (net.minecraft.class_2616) r0     // Catch: java.lang.NumberFormatException -> La1
            int r0 = r0.method_11267()     // Catch: java.lang.NumberFormatException -> La1
            goto Lab
        La1:
            r1 = 2621894108919084655(0x2462d6ccf8cfb66f, double:2.0735345537941516E-133)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lab:
            r1 = 3
            if (r0 != r1) goto Lc4
        Laf:
            su.catlean.i9 r0 = su.catlean.uy.A     // Catch: java.lang.NumberFormatException -> Lba
            r1 = r11
            r0.X(r1)     // Catch: java.lang.NumberFormatException -> Lba
            goto Lc4
        Lba:
            r1 = 2621894108919084655(0x2462d6ccf8cfb66f, double:2.0735345537941516E-133)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.w(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:130:0x03d4
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void k(boolean r13, long r14, boolean r16) {
        /*
            Method dump skipped, instruction units count: 1389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.k(boolean, long, boolean):void");
    }

    public final void x(long a2, @NotNull class_238 box) {
        Intrinsics.checkNotNullParameter(box, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26000, 7361887439919519306L ^ (ab ^ a2)) /* invoke-custom */);
        P = i;
        i = box;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x017e: INVOKE (r-2 I:net.minecraft.class_3965) = (r-2 I:net.minecraft.class_638), (r-1 I:net.minecraft.class_3959) VIRTUAL call: net.minecraft.class_638.method_17742(net.minecraft.class_3959):net.minecraft.class_3965
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final su.catlean._w T(long r15) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.T(long):su.catlean._w");
    }

    private final void Pj(long j2) {
        long j3 = ab ^ j2;
        long j4 = j3 ^ 126483500605058L;
        long j5 = j3 ^ 26589648447795L;
        long j6 = j3 ^ 130737036303107L;
        int i2 = (int) (j3 >>> 32);
        int i3 = (int) ((j6 << 32) >>> 48);
        int i4 = (int) ((j6 << 48) >>> 48);
        long j7 = j3 ^ 47545126346719L;
        long j8 = j3 ^ 96848168383901L;
        int i5 = (int) (j3 >>> 32);
        int i6 = (int) ((j8 << 32) >>> 48);
        int i7 = (int) ((j8 << 48) >>> 48);
        long j9 = j3 ^ 50858384725821L;
        long j10 = j3 ^ 134427573522784L;
        int i8 = (int) (j3 >>> 48);
        int i9 = (int) ((j10 << 16) >>> 48);
        int i10 = (int) ((j10 << 32) >>> 32);
        long j11 = j3 ^ 87208753597524L;
        int i11 = (int) (j3 >>> 32);
        int i12 = (int) ((j11 << 32) >>> 48);
        int i13 = (int) ((j11 << 48) >>> 48);
        long j12 = j3 ^ 105010343398153L;
        long j13 = j3 ^ 92169594021278L;
        int i14 = (int) (j3 >>> 48);
        int i15 = (int) ((j13 << 16) >>> 48);
        int i16 = (int) ((j13 << 32) >>> 32);
        long j14 = j3 ^ 60474165655352L;
        long j15 = j3 ^ 70153808142311L;
        long j16 = j3 ^ 68814203327784L;
        int i17 = (int) (j3 >>> 48);
        int i18 = (int) ((j16 << 16) >>> 32);
        int i19 = (int) ((j16 << 48) >>> 48);
        long j17 = j3 ^ 18900438260180L;
        int i20 = (int) (j3 >>> 32);
        long j18 = ((j3 ^ 7303588200509L) << 32) >>> 32;
        long j19 = j3 ^ 44373750125595L;
        long j20 = j3 ^ 123217448037570L;
        long j21 = j3 ^ 132299438357507L;
        long j22 = j3 ^ 8757738048115L;
        Pair[] pairArr = new Pair[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31043, 4392295120626928082L ^ j3) /* invoke-custom */];
        pairArr[0] = TuplesKt.to(Float.valueOf(0.0f), Float.valueOf(r(j15)));
        pairArr[1] = TuplesKt.to(Float.valueOf(5.0f), Float.valueOf(E(j9)));
        pairArr[2] = TuplesKt.to(Float.valueOf(10.0f), Float.valueOf(Pf((char) i17, i18, (short) i19)));
        pairArr[3] = TuplesKt.to(Float.valueOf(15.0f), Float.valueOf(PU(j21)));
        pairArr[4] = TuplesKt.to(Float.valueOf(20.0f), Float.valueOf(q(j19)));
        pairArr[5] = TuplesKt.to(Float.valueOf(25.0f), Float.valueOf(j(j12)));
        pairArr[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25452, 5286735407548355563L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(30.0f), Float.valueOf(C((short) i14, (char) i15, i16)));
        pairArr[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28725, 8963887127164731566L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(35.0f), Float.valueOf(Pa(j17)));
        pairArr[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29853, 7914113602592228384L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(40.0f), Float.valueOf(P(i5, (char) i6, i7)));
        pairArr[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6475, 1775236929548528105L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(45.0f), Float.valueOf(z(i2, (char) i3, (char) i4)));
        pairArr[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6006, 1484094138912417735L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(50.0f), Float.valueOf(Q(i11, i12, i13)));
        pairArr[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8763, 5872231776288314034L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(55.0f), Float.valueOf(s(j7)));
        pairArr[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29789, 4158827751301334259L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(60.0f), Float.valueOf(A(j4)));
        pairArr[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12138, 4251565112433188848L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(65.0f), Float.valueOf(w((char) i8, (short) i9, i10)));
        pairArr[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18254, 6914682764983072765L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(70.0f), Float.valueOf(P7(j5)));
        pairArr[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14209, 3808305884499773203L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(75.0f), Float.valueOf(Y(j22)));
        pairArr[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9220, 8319511468051535039L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(80.0f), Float.valueOf(Z(i20, j18)));
        pairArr[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7249, 8083520704636300523L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(85.0f), Float.valueOf(PJ(j20)));
        pairArr[(int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24609, 5644042872004595861L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(90.0f), Float.valueOf(F(j14)));
        j = MapsKt.hashMapOf(pairArr);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final float PO(long r11) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.PO(long):float");
    }

    @NotNull
    public final class_243 x(long a2, @NotNull class_1297 player) {
        Intrinsics.checkNotNullParameter(player, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21430, 7323562964490056814L ^ (ab ^ a2)) /* invoke-custom */);
        return new class_243(player.method_23317() - player.field_6014, player.method_23318() - player.field_6036, player.method_23321() - player.field_5969);
    }

    private static final boolean PZ() {
        return U.x((ab ^ 999303489909L) ^ 36239032760209L);
    }

    private static final boolean v() {
        return U.D((ab ^ 49528928183589L) ^ 94258973262797L);
    }

    private static final boolean PI() {
        return U.D((ab ^ 13913235360949L) ^ 127641458207325L);
    }

    private static final boolean W() {
        return U.G((ab ^ 63390766580020L) ^ 70795339118196L);
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
    private static final boolean P0() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 99776785032524(0x5abf17d4254c, double:4.9296281737057E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 39011536196108(0x237b14c1d20c, double:1.92742598259893E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 40949297424697(0x253e4053a939, double:2.0231641078878E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -2231822175425086633(0xe106f98e5ff2bb57, double:-2.523480806694198E159)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = -2226779399034670315(0xe118e3ef3f617315, double:-5.467755182988987E159)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = -2226779399034670315(0xe118e3ef3f617315, double:-5.467755182988987E159)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = -2226779399034670315(0xe118e3ef3f617315, double:-5.467755182988987E159)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.P0():boolean");
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
    private static final boolean p() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 41044753430609(0x255479f2b851, double:2.02788026120886E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 101775607025425(0x5c907ae74f11, double:5.02838310159015E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 99871653966884(0x5ad52e753424, double:4.9343153218382E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 8942889254260057674(0x7c1b866531d4264a, double:6.705989723130495E289)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = 8936720577944088072(0x7c059c045147ee08, double:2.632384837315174E289)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = 8936720577944088072(0x7c059c045147ee08, double:2.632384837315174E289)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = 8936720577944088072(0x7c059c045147ee08, double:2.632384837315174E289)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.p():boolean");
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
    private static final boolean PF() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 46262488091998(0x2a13532b4d5e, double:2.2856706057396E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 92184229362206(0x53d7503eba1e, double:4.5545060816216E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 94085632016683(0x559204acc12b, double:4.64844785467043E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -8569073411403427003(0x891489221b0dd345, double:-6.368730066098776E-265)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = -8571877022700266745(0x890a93437b9e1b07, double:-4.1208913310565774E-265)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = -8571877022700266745(0x890a93437b9e1b07, double:-4.1208913310565774E-265)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = -8571877022700266745(0x890a93437b9e1b07, double:-4.1208913310565774E-265)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.PF():boolean");
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
    private static final boolean PC() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 71922185728872(0x4169b054f368, double:3.5534281142449E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 62318687880232(0x38adb3410428, double:3.0789522775526E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 69170042732317(0x3ee8e7d37f1d, double:3.4174541835409E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 3972986693047446899(0x3722e258f8726d73, double:4.233977365759935E-43)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = 3980329096950424881(0x373cf83998e1a531, double:1.2990430860278377E-42)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = 3980329096950424881(0x373cf83998e1a531, double:1.2990430860278377E-42)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = 3980329096950424881(0x373cf83998e1a531, double:1.2990430860278377E-42)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.PC():boolean");
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
    private static final boolean R() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 107424228731626(0x61b3a6fe6aea, double:5.30746209472886E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 26902163856810(0x1877a5eb9daa, double:1.3291434960442E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 33204148496031(0x1e32f179e69f, double:1.64050290713E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -5863472847227652879(0xaea0c282eed8f4f1, double:-4.313604455722752E-84)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = -5855003993678594893(0xaebed8e38e4b3cb3, double:-1.5878785288599734E-83)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = -5855003993678594893(0xaebed8e38e4b3cb3, double:-1.5878785288599734E-83)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = -5855003993678594893(0xaebed8e38e4b3cb3, double:-1.5878785288599734E-83)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.R():boolean");
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
    private static final boolean t() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 29231474399338(0x1a95fba5d86a, double:1.4442267278001E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 109203715796778(0x6351f8b02f2a, double:5.3953804373399E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 111139461682207(0x6514ac22541f, double:5.4910189914468E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 2026823949354223217(0x1c20b9a4b3834671, double:3.381139013155504E-173)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = 2035244151663005235(0x1c3ea3c5d3108e33, double:1.2388180801627752E-172)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = 2035244151663005235(0x1c3ea3c5d3108e33, double:1.2388180801627752E-172)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = 2035244151663005235(0x1c3ea3c5d3108e33, double:1.2388180801627752E-172)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.t():boolean");
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
    private static final boolean I() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 26440408944957(0x180c232ed13d, double:1.3063297721697E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 107512162100861(0x61c8203b267d, double:5.31180658041507E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 113857245306184(0x678d74a95d48, double:5.6252953435905E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 1546910869488160550(0x1577bb3d6b084f26, double:2.9566943653256776E-205)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = 1542941764054910820(0x1569a15c0b9b8764, double:1.5966393994188376E-205)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = 1542941764054910820(0x1569a15c0b9b8764, double:1.5966393994188376E-205)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = 1542941764054910820(0x1569a15c0b9b8764, double:1.5966393994188376E-205)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.I():boolean");
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
    private static final boolean l() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 43009053596000(0x271dd35c9960, double:2.12492958419285E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 104289595387424(0x5ed9d0496e20, double:5.152590629961E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 97429267092757(0x589c84db1515, double:4.81364537700223E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 6713323521671038843(0x5d2a842c9b7a077b, double:6.3154021251407306E140)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = 6716167002092326713(0x5d349e4dfbe9cf39, double:9.821379072465784E140)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = 6716167002092326713(0x5d349e4dfbe9cf39, double:9.821379072465784E140)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = 6716167002092326713(0x5d349e4dfbe9cf39, double:9.821379072465784E140)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.l():boolean");
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
    private static final boolean B() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 104252421529473(0x5ed1288d5f81, double:5.1507539973473E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 42971879221441(0x27152b98a8c1, double:2.12309292605533E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 36629612516340(0x21507f0ad3f4, double:1.80974331648E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -7220398437422087782(0x9bcbfde060abc19a, double:-8.841824290903893E-175)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = -7217608286550881832(0x9bd5e781003809d8, double:-1.3837962306932116E-174)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = -7217608286550881832(0x9bd5e781003809d8, double:-1.3837962306932116E-174)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = -7217608286550881832(0x9bd5e781003809d8, double:-1.3837962306932116E-174)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.B():boolean");
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
    private static final boolean e() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 72944333659598(0x4257ad189dce, double:3.60392893199887E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 65505466346126(0x3b93ae0d6a8e, double:3.2364000536431E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 67993537024443(0x3dd6fa9f11bb, double:3.3593270783012E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 6450528398350353365(0x5984e166e53e03d5, double:1.7253954370205904E123)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = 6456749025515129751(0x599afb0785adcb97, double:4.4589189458894366E123)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = 6456749025515129751(0x599afb0785adcb97, double:4.4589189458894366E123)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = 6456749025515129751(0x599afb0785adcb97, double:4.4589189458894366E123)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.e():boolean");
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
    private static final boolean Pc() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 58191709667895(0x34ecd02f0237, double:2.8750524619675E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 84837737887095(0x4d28d33af577, double:4.1915411760898E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 82933799489090(0x4b6d87a88e42, double:4.09747412066457E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -4143989104116655060(0xc67d97dd98099c2c, double:-3.751386943967685E31)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = -4151318588741233554(0xc6638dbcf89a546e, double:-1.2393607409629518E31)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = -4151318588741233554(0xc6638dbcf89a546e, double:-1.2393607409629518E31)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = -4151318588741233554(0xc6638dbcf89a546e, double:-1.2393607409629518E31)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.Pc():boolean");
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
    private static final boolean K() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 79148195019137(0x47fc200c7981, double:3.9104404089299E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 68410827968193(0x3e3823198ec1, double:3.37994399026397E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 62111527728628(0x387d778bf5f4, double:3.0687172061431E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -4770467809401837670(0xbdcbe4cd682ae79a, double:-5.0738452520145796E-11)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = -4767624615667617832(0xbdd5feac08b92fd8, double:-8.001666185618193E-11)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = -4767624615667617832(0xbdd5feac08b92fd8, double:-8.001666185618193E-11)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = -4767624615667617832(0xbdd5feac08b92fd8, double:-8.001666185618193E-11)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.K():boolean");
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
    private static final boolean V() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 74213114214213(0x437f164f7745, double:3.66661502041353E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 64575191547909(0x3abb155a8005, double:3.190438371744E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 67062723050288(0x3cfe41c8fb30, double:3.3133387575713E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -5543965989073720994(0xb30fe04e5e69e95e, double:-9.685842458235333E-63)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = -5543374585489383140(0xb311fa2f3efa211c, double:-1.0925088804419812E-62)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = -5543374585489383140(0xb311fa2f3efa211c, double:-1.0925088804419812E-62)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = -5543374585489383140(0xb311fa2f3efa211c, double:-1.0925088804419812E-62)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.V():boolean");
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
    private static final boolean i() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 46782893625292(0x2a8c7dc18fcc, double:2.3113820553302E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 91570830604428(0x53487ed4788c, double:4.5242001562796E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 93515032167353(0x550d2a4603b9, double:4.6202564763628E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 5442188645469983191(0x4b8689bd35e711d7, double:6.90789019409299E55)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = 5447266323840424341(0x4b9893dc5574d995, double:1.5066013178528887E56)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = 5447266323840424341(0x4b9893dc5574d995, double:1.5066013178528887E56)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = 5447266323840424341(0x4b9893dc5574d995, double:1.5066013178528887E56)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.i():boolean");
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
    private static final boolean P5() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 98993715874493(0x5a08c5450abd, double:4.8909394167756E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 39362407497213(0x23ccc650fdfd, double:1.9447613281977E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 41272802969288(0x258992c286c8, double:2.03914740547E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -3533081357068299098(0xcef7f9398d6394a6, double:-2.647348058575747E72)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = -3537046061234234140(0xcee9e358edf05ce4, double:-1.4293834554181389E72)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = -3537046061234234140(0xcee9e358edf05ce4, double:-1.4293834554181389E72)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = -3537046061234234140(0xcee9e358edf05ce4, double:-1.4293834554181389E72)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.P5():boolean");
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
    private static final boolean g() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 136444706500129(0x7c1882432e21, double:6.74126420386056E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 6444620896609(0x5dc8156d961, double:3.184065785485E-311)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 3959251313236(0x399d5c4a254, double:1.9561300571217E-311)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -1554903875744059334(0xea6bdf29ca65b03a, double:-4.3692915172150566E204)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = -1552117580662671240(0xea75c548aaf67878, double:-6.825716820216892E204)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = -1552117580662671240(0xea75c548aaf67878, double:-6.825716820216892E204)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = -1552117580662671240(0xea75c548aaf67878, double:-6.825716820216892E204)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.g():boolean");
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
    private static final boolean PB() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 120701569982602(0x6dc70633e08a, double:5.96344991275067E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 22003203839946(0x1403052617ca, double:1.08710271157595E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 20093227789567(0x124651b46cff, double:9.9273735648877E-311)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 2648344138161159825(0x24c0cef64e157e91, double:1.1840211549368932E-131)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = 2656794575980902099(0x24ded4972e86b6d3, double:4.3435168159664276E-131)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = 2656794575980902099(0x24ded4972e86b6d3, double:4.3435168159664276E-131)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = 2656794575980902099(0x24ded4972e86b6d3, double:4.3435168159664276E-131)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.PB():boolean");
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
    private static final boolean n() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 18704511505204(0x1102fbc39334, double:9.2412565569636E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 115203787613300(0x68c6f8d66474, double:5.6918233730523E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 121511809916737(0x6e83ac441f41, double:6.00348108438515E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 6304672463496482095(0x577eb233b3e50d2f, double:2.9528515097355105E113)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = 6296217352752514413(0x5760a852d376c56d, double:8.011956334798393E112)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = 6296217352752514413(0x5760a852d376c56d, double:8.011956334798393E112)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = 6296217352752514413(0x5760a852d376c56d, double:8.011956334798393E112)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.n():boolean");
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
    private static final boolean H() {
        /*
            long r0 = su.catlean.uy.ab
            r1 = 38380221364768(0x22e81775fa20, double:1.8962348856114E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 100244878527840(0x5b2c14600d60, double:4.95275506521346E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 102706642581077(0x5d6940f27655, double:5.0743823699006E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 4497549948490048571(0x3e6a81d95f53643b, double:4.9373550506464986E-8)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.G(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 == 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = 4500393143295847545(0x3e749bb83fc0ac79, double:7.677182617463346E-8)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean.uy r0 = su.catlean.uy.U     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.Pl(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = 4500393143295847545(0x3e749bb83fc0ac79, double:7.677182617463346E-8)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 == 0) goto L69
            if (r0 == 0) goto L6c
            goto L68
        L5e:
            r1 = 4500393143295847545(0x3e749bb83fc0ac79, double:7.677182617463346E-8)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.H():boolean");
    }

    public static final void l(boolean z2) {
        D = z2;
    }

    public static final void m(boolean z2) {
        y = z2;
    }

    public static final boolean O(uy $this, long a2) {
        return $this.a((ab ^ a2) ^ 37684859418660L);
    }

    public static void F(int[] iArr) {
        z = iArr;
    }

    public static int[] Pm() {
        return z;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 4612;
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
                throw new RuntimeException("su/catlean/uy", e2);
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
            java.lang.String r1 = "su/catlean/uy"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 24512;
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
                    throw new RuntimeException("su/catlean/uy", e2);
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
            java.lang.String r1 = "su/catlean/uy"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uy.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
