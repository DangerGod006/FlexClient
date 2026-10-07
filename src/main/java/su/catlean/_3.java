package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_3.class */
public abstract class _3 extends _g {
    static final KProperty[] D;
    private final int L;
    private boolean z;

    @NotNull
    private final cw K;

    @NotNull
    private final c8 C;

    @NotNull
    private final c8 P;

    @NotNull
    private final cq U;

    @NotNull
    private final cq G;

    @NotNull
    private final cw d;

    @NotNull
    private final cw J;

    @NotNull
    private final cw E;

    @NotNull
    private final ct T;

    @NotNull
    private final ct b;

    @NotNull
    private final cp N;

    @NotNull
    private final cq X;

    @NotNull
    private final cq e;

    @NotNull
    private final cq Y;

    @NotNull
    private final cq k;

    @NotNull
    private final cw g;

    @NotNull
    private final cw V;

    @NotNull
    private final cq j;

    @NotNull
    private final cs x;

    @NotNull
    private final cs a;

    @NotNull
    private final bg A;
    private int f;
    private static int[] u;
    private static final long ab = yz.a(-2385895560131446595L, -5478889964095762468L, MethodHandles.lookup().lookupClass()).a(20760250163599L);
    private static final String[] fb;
    private static final String[] gb;
    private static final Map hb;
    private static final long[] lb;
    private static final Integer[] mb;
    private static final Map nb;

    /*  JADX ERROR: Failed to decode insn: 0x03B2: MOVE_MULTI
        java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for object array[15]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:313)
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
    public _3(@org.jetbrains.annotations.NotNull java.lang.String r16, @org.jetbrains.annotations.NotNull su.catlean.fu r17, int r18, long r19, boolean r21) {
        /*
            Method dump skipped, instruction units count: 1247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._3.<init>(java.lang.String, su.catlean.fu, int, long, boolean):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public _3(String str, short s, fu fuVar, int i, boolean z, int i2, short s2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        long j = (((((long) s) << 48) | ((((long) s2) << 48) >>> 16)) | ((((long) i3) << 32) >>> 32)) ^ ab;
        this(str, fuVar, (i2 & 4) != 0 ? (int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17776, 5845187269335968814L ^ j) /* invoke-custom */ : i, j ^ 19777967815507L, (i2 & (int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20669, 179461351252687357L ^ j) /* invoke-custom */) != 0 ? true : z);
    }

    public final int e() {
        return this.L;
    }

    private final xl K(long j) {
        return (xl) this.K.E(this, (ab ^ j) ^ 120573102331404L, D[0]);
    }

    private final void a(long j, xl xlVar) {
        this.K.b(this, (ab ^ j) ^ 118079935616336L, D[0], xlVar);
    }

    private final int z(long j) {
        return ((Number) this.C.E(this, (ab ^ j) ^ 26509584060272L, D[1])).intValue();
    }

    private final void a(long j, int i) {
        this.C.b(this, (ab ^ j) ^ 105462548937371L, D[1], Integer.valueOf(i));
    }

    private final int C(long j) {
        return ((Number) this.P.E(this, (ab ^ j) ^ 92453957235794L, D[2])).intValue();
    }

    private final void M(int i, long j) {
        this.P.b(this, (ab ^ j) ^ 62291960017269L, D[2], Integer.valueOf(i));
    }

    protected final boolean h(long j) {
        return ((Boolean) this.U.E(this, (ab ^ j) ^ 57496035320061L, D[3])).booleanValue();
    }

    protected final void H(long a, boolean z) {
        this.U.b(this, (ab ^ a) ^ 109744926264116L, D[3], Boolean.valueOf(z));
    }

    protected final boolean E(int i, char c, char c2) {
        return ((Boolean) this.G.E(this, ((((((long) i) << 32) | ((((long) c) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ ab) ^ 61223432574780L, D[4])).booleanValue();
    }

    protected final void s(boolean z, short a, int a2, char a3) {
        this.G.b(this, ((((((long) a) << 48) | ((((long) a2) << 32) >>> 16)) | ((((long) a3) << 48) >>> 48)) ^ ab) ^ 64432408106211L, D[4], Boolean.valueOf(z));
    }

    @NotNull
    protected final zr r(long j, short s) {
        return (zr) this.d.E(this, (((j << 16) | ((((long) s) << 48) >>> 48)) ^ ab) ^ 118526483438614L, D[5]);
    }

    protected final void l(long a, @NotNull zr zrVar) {
        long j = ab ^ a;
        Intrinsics.checkNotNullParameter(zrVar, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9627, 5270203287100849727L ^ j) /* invoke-custom */);
        this.d.b(this, j ^ 3728319365740L, D[5], zrVar);
    }

    @NotNull
    protected final xx w(long j) {
        long j2 = ab ^ j;
        return (xx) this.J.E(this, j2 ^ 123555968685451L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21519, 7135644200347524241L ^ j2) /* invoke-custom */]);
    }

    protected final void Z(int a, char a2, @NotNull xx xxVar, char a3) {
        long j = (((((long) a) << 32) | ((((long) a2) << 48) >>> 32)) | ((((long) a3) << 48) >>> 48)) ^ ab;
        Intrinsics.checkNotNullParameter(xxVar, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9627, 5270206856453721209L ^ j) /* invoke-custom */);
        this.J.b(this, j ^ 17201467469866L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26364, 4556834836447747128L ^ j) /* invoke-custom */], xxVar);
    }

    @NotNull
    protected final yi a(int i, int i2, int i3) {
        long j = (((((long) i) << 32) | ((((long) i2) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ ab;
        return (yi) this.E.E(this, j ^ 123430307473609L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29869, 7789813839176450428L ^ j) /* invoke-custom */]);
    }

    protected final void a(@NotNull yi yiVar, int a, int a2, char a3) {
        long j = (((((long) a) << 32) | ((((long) a2) << 48) >>> 32)) | ((((long) a3) << 48) >>> 48)) ^ ab;
        Intrinsics.checkNotNullParameter(yiVar, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15372, 6192691952538636350L ^ j) /* invoke-custom */);
        this.E.b(this, j ^ 110446372353500L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27053, 7964578319394641540L ^ j) /* invoke-custom */], yiVar);
    }

    protected final float Y(long j) {
        long j2 = ab ^ j;
        return ((Number) this.T.E(this, j2 ^ 20461861107089L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31704, 6299905988475097922L ^ j2) /* invoke-custom */])).floatValue();
    }

    protected final void n(float f, long a) {
        long j = ab ^ a;
        this.T.b(this, j ^ 98280203085225L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31704, 6299899347823924374L ^ j) /* invoke-custom */], Float.valueOf(f));
    }

    protected final float Q(long j) {
        long j2 = ab ^ j;
        return ((Number) this.b.E(this, j2 ^ 95389596677855L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31523, 473857450147549432L ^ j2) /* invoke-custom */])).floatValue();
    }

    protected final void Y(float f, long a) {
        long j = ab ^ a;
        this.b.b(this, j ^ 25017551864232L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24671, 4051424895171275524L ^ j) /* invoke-custom */], Float.valueOf(f));
    }

    @NotNull
    protected final h v(long j) {
        long j2 = ab ^ j;
        return (h) this.N.E(this, j2 ^ 57296597313104L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29084, 5064867317070990039L ^ j2) /* invoke-custom */]);
    }

    protected final boolean x(long j) {
        long j2 = ab ^ j;
        return ((Boolean) this.X.E(this, j2 ^ 109444432388511L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14875, 7466110760427701913L ^ j2) /* invoke-custom */])).booleanValue();
    }

    protected final boolean W(long j) {
        long j2 = ab ^ j;
        return ((Boolean) this.e.E(this, j2 ^ 24496785454771L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14875, 882129250012778913L ^ j2) /* invoke-custom */])).booleanValue();
    }

    protected final boolean B(long j) {
        long j2 = ab ^ j;
        return ((Boolean) this.Y.E(this, j2 ^ 83257132603906L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1421, 264559722851091089L ^ j2) /* invoke-custom */])).booleanValue();
    }

    protected final boolean G(long j) {
        long j2 = ab ^ j;
        return ((Boolean) this.k.E(this, j2 ^ 76828083625559L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26014, 4628861928148494031L ^ j2) /* invoke-custom */])).booleanValue();
    }

    @NotNull
    protected final lr D(short s, int i, char c) {
        long j = (((((long) s) << 48) | ((((long) i) << 32) >>> 16)) | ((((long) c) << 48) >>> 48)) ^ ab;
        return (lr) this.g.E(this, j ^ 2619579479762L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2994, 6028266663000154179L ^ j) /* invoke-custom */]);
    }

    protected final void J(long a, @NotNull lr lrVar) {
        long j = ab ^ a;
        Intrinsics.checkNotNullParameter(lrVar, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9627, 5270256205211234218L ^ j) /* invoke-custom */);
        this.g.b(this, j ^ 53377559090169L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20474, 3393224476530349817L ^ j) /* invoke-custom */], lrVar);
    }

    @NotNull
    protected final og H(int i, int i2, byte b) {
        long j = (((((long) i) << 32) | ((((long) i2) << 40) >>> 32)) | ((((long) b) << 56) >>> 56)) ^ ab;
        return (og) this.V.E(this, j ^ 127712625548161L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18956, 7496291538082008215L ^ j) /* invoke-custom */]);
    }

    protected final void I(@NotNull og ogVar, long a) {
        long j = ab ^ a;
        Intrinsics.checkNotNullParameter(ogVar, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9627, 5270311852673355807L ^ j) /* invoke-custom */);
        this.V.b(this, j ^ 121115908992076L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20575, 2293994151714797301L ^ j) /* invoke-custom */], ogVar);
    }

    protected final boolean n(long j) {
        long j2 = ab ^ j;
        return ((Boolean) this.j.E(this, j2 ^ 137335833347677L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8802, 7551717229234288947L ^ j2) /* invoke-custom */])).booleanValue();
    }

    @NotNull
    protected final Color P(long j) {
        long j2 = ab ^ j;
        return (Color) this.x.E(this, j2 ^ 46537487466733L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20077, 2805939579330859907L ^ j2) /* invoke-custom */]);
    }

    @NotNull
    protected final Color A(long j) {
        long j2 = ab ^ j;
        return (Color) this.a.E(this, j2 ^ 17808481147381L, D[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2080, 2079024786315201754L ^ j2) /* invoke-custom */]);
    }

    @NotNull
    protected final bg p() {
        return this.A;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0083: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    protected final void h(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.network.ReceivePacket r8) {
        /*
            r7 = this;
            long r0 = su.catlean._3.ab
            r1 = 115782480572864(0x694db5a031c0, double:5.72041460413336E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 134781164776590(0x7a952f72ec8e, double:6.65907432225814E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 13005478502683(0xbd412ed211b, double:6.4255601359025E-311)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -8498944904247978477(0x8a0daea390aed613, double:-3.0164046535931896E-260)
            r1 = r9
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r1 = r8
            java.lang.String r2 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r15 = r0
            r0 = r8
            net.minecraft.class_2596 r0 = r0.getPacket()     // Catch: java.lang.UnsupportedOperationException -> L3b
            boolean r0 = r0 instanceof net.minecraft.class_3944     // Catch: java.lang.UnsupportedOperationException -> L3b
            r1 = r15
            if (r1 != 0) goto L68
            if (r0 == 0) goto L97
            goto L45
        L3b:
            r1 = -8404026909282059694(0x8b5ee60d6d6b3a52, double:-6.585110489280009E-254)
            r2 = r9
            java.lang.UnsupportedOperationException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/UnsupportedOperationException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.UnsupportedOperationException -> L5e
            throw r0     // Catch: java.lang.UnsupportedOperationException -> L5e
        L45:
            r0 = r7
            su.catlean.bg r0 = r0.A     // Catch: java.lang.UnsupportedOperationException -> L5e
            r1 = 24828(0x60fc, float:3.4791E-41)
            r2 = 2736427886308440653(0x25f9beaa14e33a4d, double:9.508041142000424E-126)
            r3 = r9
            long r2 = r2 ^ r3
            int r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/_3;->e(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "c"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r1, r2)     // Catch: java.lang.UnsupportedOperationException -> L5e
            r2 = r13
            boolean r0 = r0.c(r1, r2)     // Catch: java.lang.UnsupportedOperationException -> L5e
            goto L68
        L5e:
            r1 = -8404026909282059694(0x8b5ee60d6d6b3a52, double:-6.585110489280009E-254)
            r2 = r9
            java.lang.UnsupportedOperationException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/UnsupportedOperationException;}
            ).invoke(r0, r1, r2)
            throw r0
        L68:
            if (r0 != 0) goto L97
            net.minecraft.class_2815 r0 = new net.minecraft.class_2815     // Catch: java.lang.UnsupportedOperationException -> L8d
            r1 = r0
            r2 = r8
            net.minecraft.class_2596 r2 = r2.getPacket()     // Catch: java.lang.UnsupportedOperationException -> L8d
            net.minecraft.class_3944 r2 = (net.minecraft.class_3944) r2     // Catch: java.lang.UnsupportedOperationException -> L8d
            int r2 = r2.method_17592()     // Catch: java.lang.UnsupportedOperationException -> L8d
            r1.<init>(r2)     // Catch: java.lang.UnsupportedOperationException -> L8d
            net.minecraft.class_2596 r0 = (net.minecraft.class_2596) r0     // Catch: java.lang.UnsupportedOperationException -> L8d
            r1 = r11
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.UnsupportedOperationException -> L8d
            su.catlean._r.a(r-1, r0)     // Catch: java.lang.UnsupportedOperationException -> L8d
            r-1 = r8
            r-1.cancel()     // Catch: java.lang.UnsupportedOperationException -> L8d
            goto L97
        L8d:
            r1 = -8404026909282059694(0x8b5ee60d6d6b3a52, double:-6.585110489280009E-254)
            r2 = r9
            java.lang.UnsupportedOperationException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/UnsupportedOperationException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._3.h(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d5 A[EDGE_INSN: B:14:0x00d5->B:12:0x00d5 BREAK  A[LOOP:0: B:3:0x0083->B:16:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5 A[EDGE_INSN: B:15:0x00d5->B:12:0x00d5 BREAK  A[LOOP:0: B:3:0x0083->B:16:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00d2 -> B:6:0x0094). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean o(@org.jetbrains.annotations.NotNull java.util.List r10, long r11, boolean r13, boolean r14, @org.jetbrains.annotations.NotNull java.util.List r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._3.o(java.util.List, long, boolean, boolean, java.util.List, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Throwable, java.lang.UnsupportedOperationException] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public static boolean s(_3 _3, List list, boolean z, boolean z2, List list2, boolean z3, int i, long j, Object obj) {
        long j2 = ab ^ j;
        long j3 = j2 ^ 111567359980138L;
        long j4 = j2 ^ 88065703133033L;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-148417011689938450L, j2) /* invoke-custom */;
        ?? unsupportedOperationException = obj;
        if (unsupportedOperationException != 0) {
            try {
                unsupportedOperationException = new UnsupportedOperationException((String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4958, 1995443092623043859L ^ j2) /* invoke-custom */);
                throw unsupportedOperationException;
            } catch (UnsupportedOperationException unused) {
                throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(unsupportedOperationException, -242069384626090577L, j2) /* invoke-custom */;
            }
        }
        try {
            unsupportedOperationException = i & 2;
            String str2 = str;
            ?? r0 = unsupportedOperationException;
            ?? r02 = unsupportedOperationException;
            if (j2 > 0) {
                if (str2 == null) {
                    if (unsupportedOperationException != 0) {
                        z = false;
                    }
                    r0 = i & 4;
                }
                str2 = str;
                r02 = r0;
            }
            ?? C = r02;
            ?? r03 = r02;
            if (j2 >= 0) {
                if (str2 == null) {
                    if (r02 != 0) {
                        z2 = false;
                    }
                    C = i & (int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31704, 6299919950495110798L ^ j2) /* invoke-custom */;
                }
                str2 = str;
                r03 = C;
            }
            ?? C2 = r03;
            ?? r04 = r03;
            if (j2 >= 0) {
                if (str2 == null) {
                    if (r03 != 0) {
                        list2 = _3.R(j4);
                    }
                    C2 = i & (int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20575, 2293917732582653192L ^ j2) /* invoke-custom */;
                }
                str2 = str;
                r04 = C2;
            }
            if (str2 != null) {
                return r04;
            }
            if (r04 != 0) {
                z3 = false;
            }
            return _3.o(list, j3, z, z2, list2, z3);
        } catch (UnsupportedOperationException unused2) {
            throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(unsupportedOperationException, -242069384626090577L, j2) /* invoke-custom */;
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
    protected final boolean v(@org.jetbrains.annotations.NotNull java.util.List r10, boolean r11, long r12, boolean r14, @org.jetbrains.annotations.NotNull java.util.List r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._3.v(java.util.List, boolean, long, boolean, java.util.List, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Throwable, java.lang.UnsupportedOperationException] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public static boolean p(_3 _3, List list, boolean z, boolean z2, long j, List list2, boolean z3, int i, Object obj) {
        long j2 = ab ^ j;
        long j3 = j2 ^ 115830692985355L;
        long j4 = j2 ^ 77576500565137L;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5202530233969153070L, j2) /* invoke-custom */;
        ?? unsupportedOperationException = obj;
        if (unsupportedOperationException != 0) {
            try {
                unsupportedOperationException = new UnsupportedOperationException((String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17041, 9008183637158213337L ^ j2) /* invoke-custom */);
                throw unsupportedOperationException;
            } catch (UnsupportedOperationException unused) {
                throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(unsupportedOperationException, -5287315031517821037L, j2) /* invoke-custom */;
            }
        }
        try {
            unsupportedOperationException = i & 2;
            String str2 = str;
            ?? r0 = unsupportedOperationException;
            ?? r02 = unsupportedOperationException;
            if (j2 > 0) {
                if (str2 == null) {
                    if (unsupportedOperationException != 0) {
                        z = false;
                    }
                    r0 = i & 4;
                }
                str2 = str;
                r02 = r0;
            }
            ?? C = r02;
            ?? r03 = r02;
            if (j2 > 0) {
                if (str2 == null) {
                    if (r02 != 0) {
                        z2 = false;
                    }
                    C = i & (int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31704, 6299865186634898610L ^ j2) /* invoke-custom */;
                }
                str2 = str;
                r03 = C;
            }
            ?? C2 = r03;
            ?? r04 = r03;
            if (j2 > 0) {
                if (str2 == null) {
                    if (r03 != 0) {
                        list2 = _3.g(j3);
                    }
                    C2 = i & (int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20575, 2294007683350509364L ^ j2) /* invoke-custom */;
                }
                str2 = str;
                r04 = C2;
            }
            if (str2 != null) {
                return r04;
            }
            if (r04 != 0) {
                z3 = false;
            }
            return _3.v(list, z, j4, z2, list2, z3);
        } catch (UnsupportedOperationException unused2) {
            throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(unsupportedOperationException, -5287315031517821037L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x01d8: INVOKE (r-1 I:su.catlean.gg), (r0 I:long), (r1 I:su.catlean.n5) VIRTUAL call: su.catlean.gg.P(long, su.catlean.n5):su.catlean.fg
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final boolean d(long r21, net.minecraft.class_2338 r23, java.util.List r24, boolean r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 1684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._3.d(long, net.minecraft.class_2338, java.util.List, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable, java.lang.UnsupportedOperationException] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    static boolean v(long j, _3 _3, class_2338 class_2338Var, List list, boolean z, boolean z2, boolean z3, int i, Object obj) {
        long j2 = ab ^ j;
        long j3 = j2 ^ 85941835673356L;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(717630557503706603L, j2) /* invoke-custom */;
        Object objC = obj;
        if (objC != 0) {
            try {
                objC = new UnsupportedOperationException((String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23462, 6272147884778557841L ^ j2) /* invoke-custom */);
                throw objC;
            } catch (UnsupportedOperationException unused) {
                throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objC, 623398484501641642L, j2) /* invoke-custom */;
            }
        }
        try {
            objC = i & (int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20575, 2293911886735804685L ^ j2) /* invoke-custom */;
            if (str != null) {
                return objC;
            }
            if (objC != 0) {
                z3 = false;
            }
            return _3.d(j3, class_2338Var, list, z, z2, z3);
        } catch (UnsupportedOperationException unused2) {
            throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objC, 623398484501641642L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    protected boolean m(@NotNull class_1297 crystal, long a) {
        long j = a ^ 79616959566951L;
        Object objM = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3173053555865120790L, a) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(crystal, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28384, 7546024537418039659L ^ a) /* invoke-custom */);
        try {
            objM = M(j);
            return objM == 0 ? objM == 0 : objM;
        } catch (UnsupportedOperationException unused) {
            throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objM, 3268412436203740247L, a) /* invoke-custom */;
        }
    }

    private final class_1297 x(long j, class_2338 class_2338Var) {
        Object next;
        long j2 = ab ^ j;
        long j3 = j2 ^ 26932104152040L;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5797876486249974889L, j2) /* invoke-custom */;
        List listMethod_18467 = zf.z(j3).method_18467(class_1297.class, new class_238(class_2338Var));
        Intrinsics.checkNotNullExpressionValue(listMethod_18467, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29150, 622943989303549343L ^ j2) /* invoke-custom */);
        Iterator it = listMethod_18467.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            while (true) {
                Object obj = next;
                next = obj;
                while (((class_1297) next) instanceof class_1511) {
                    next = obj;
                    if (j2 > 0) {
                        if (str == null) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (class_1297) next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [net.minecraft.class_638] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    protected final boolean m(long a, @NotNull class_2338 bp) {
        long j = ab ^ a;
        long j2 = j ^ 62813429259920L;
        long j3 = j ^ 96786957890921L;
        ?? Z = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5552393723195035921L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(bp, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17158, 7548443677625823866L ^ j) /* invoke-custom */);
        try {
            Z = zf.z(j2);
            try {
                List listMethod_18467 = Z.method_18467(class_1309.class, e4.j.f(j3) ? new class_238(bp).method_1009(-1.0E-12d, 0.0d, -1.0E-12d) : new class_238(bp));
                Intrinsics.checkNotNullExpressionValue(listMethod_18467, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6463, 5529297371398170733L ^ j) /* invoke-custom */);
                Z = listMethod_18467.isEmpty();
                return Z == 0 ? Z == 0 : Z;
            } catch (UnsupportedOperationException unused) {
                throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Z, -5502651087911648594L, j) /* invoke-custom */;
            }
        } catch (UnsupportedOperationException unused2) {
            throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Z, -5502651087911648594L, j) /* invoke-custom */;
        }
    }

    @NotNull
    protected List R(long j) {
        return CollectionsKt.listOf((Object[]) new class_2248[]{class_2246.field_10540, class_2246.field_10443, class_2246.field_22108, class_2246.field_23152});
    }

    @NotNull
    protected List g(long j) {
        return CollectionsKt.emptyList();
    }

    @NotNull
    protected y4 s() {
        return y4.ONLY_CRYSTALS;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    protected boolean M(long r9) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._3.M(long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.xl] */
    private static final boolean h(_3 _3) {
        long j = ab ^ 129244065153879L;
        Object objK = j;
        try {
            objK = _3.K(objK ^ 97729172543839L);
            return objK == xl.Instant;
        } catch (UnsupportedOperationException unused) {
            throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objK, 8775821099269933253L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.xl] */
    private static final boolean X(_3 _3) {
        long j = ab ^ 58753786039479L;
        Object objK = j;
        try {
            objK = _3.K(objK ^ 26414258656959L);
            return objK == xl.Instant;
        } catch (UnsupportedOperationException unused) {
            throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objK, 8514541283530819365L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable, java.lang.UnsupportedOperationException] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean._3] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean._3] */
    /* JADX WARN: Type inference failed for: r0v9, types: [su.catlean.xl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean j(su.catlean._3 r7) {
        /*
            long r0 = su.catlean._3.ab
            r1 = 104536489088628(0x5f134c4c5674, double:5.16478879955494E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 125872309177468(0x727aee468c7c, double:6.2189183727295E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 47936741014157(0x2b99246b7a8d, double:2.3683896908684E-310)
            long r1 = r1 ^ r2
            r12 = r1
            r0 = -1316853201869033049(0xedb998fd6942b1a7, double:-3.6144013502511883E220)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r14 = r0
            r0 = r7
            r1 = r14
            if (r1 != 0) goto L4b
            r1 = r12
            boolean r0 = r0.h(r1)     // Catch: java.lang.UnsupportedOperationException -> L33 java.lang.UnsupportedOperationException -> L41
            if (r0 == 0) goto L63
            goto L3d
        L33:
            r1 = -1375057678815502874(0xecead05394875de6, double:-4.62173314359363E216)
            r2 = r8
            java.lang.UnsupportedOperationException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/UnsupportedOperationException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.UnsupportedOperationException -> L41
            throw r0     // Catch: java.lang.UnsupportedOperationException -> L41
        L3d:
            r0 = r7
            goto L4b
        L41:
            r1 = -1375057678815502874(0xecead05394875de6, double:-4.62173314359363E216)
            r2 = r8
            java.lang.UnsupportedOperationException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/UnsupportedOperationException;}
            ).invoke(r0, r1, r2)
            throw r0
        L4b:
            r1 = r10
            su.catlean.xl r0 = r0.K(r1)     // Catch: java.lang.UnsupportedOperationException -> L59
            su.catlean.xl r1 = su.catlean.xl.Instant     // Catch: java.lang.UnsupportedOperationException -> L59
            if (r0 != r1) goto L63
            r0 = 1
            goto L64
        L59:
            r1 = -1375057678815502874(0xecead05394875de6, double:-4.62173314359363E216)
            r2 = r8
            java.lang.UnsupportedOperationException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/UnsupportedOperationException;}
            ).invoke(r0, r1, r2)
            throw r0
        L63:
            r0 = 0
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._3.j(su.catlean._3):boolean");
    }

    private static final boolean u(_3 _3) {
        return _3.z;
    }

    private static final boolean W(_3 _3) {
        return _3.z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean k(_3 _3) {
        long j = ab ^ 60630640267023L;
        long j2 = j ^ 12111416427862L;
        Object objN = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3801865788223678684L, j) /* invoke-custom */;
        try {
            objN = _3.n(j2);
            return objN == 0 ? objN == 0 : objN;
        } catch (UnsupportedOperationException unused) {
            throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 3860069097199731869L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean O(_3 _3) {
        long j = ab ^ 67902295511414L;
        long j2 = j ^ 2091638463279L;
        Object objN = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6144042184275724635L, j) /* invoke-custom */;
        try {
            objN = _3.n(j2);
            return objN == 0 ? objN == 0 : objN;
        } catch (UnsupportedOperationException unused) {
            throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, -6059397029812036892L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean w(java.util.List r8, net.minecraft.class_1799 r9) {
        /*
            long r0 = su.catlean._3.ab
            r1 = 71091033386037(0x40a82bcaac35, double:3.5123637323394E-310)
            long r0 = r0 ^ r1
            r10 = r0
            r0 = 1727279192061791206(0x17f887460ec44be6, double:3.3601002732319803E-193)
            r1 = r10
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r1 = r9
            r2 = 17892(0x45e4, float:2.5072E-41)
            r3 = 4697932330959442339(0x4132689075a911a3, double:1206416.4596110366)
            r4 = r10
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/_3;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "y"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r12 = r0
            r0 = r9
            net.minecraft.class_1792 r0 = r0.method_7909()     // Catch: java.lang.UnsupportedOperationException -> L36
            boolean r0 = r0 instanceof net.minecraft.class_1747     // Catch: java.lang.UnsupportedOperationException -> L36
            r1 = r12
            if (r1 != 0) goto L57
            if (r0 == 0) goto L70
            goto L40
        L36:
            r1 = 1633627889268271015(0x16abcfe8f301a7a7, double:1.8167175829885753E-199)
            r2 = r10
            java.lang.UnsupportedOperationException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/UnsupportedOperationException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.UnsupportedOperationException -> L4d
            throw r0     // Catch: java.lang.UnsupportedOperationException -> L4d
        L40:
            r0 = r8
            r1 = r9
            net.minecraft.class_1792 r1 = r1.method_7909()     // Catch: java.lang.UnsupportedOperationException -> L4d
            boolean r0 = r0.contains(r1)     // Catch: java.lang.UnsupportedOperationException -> L4d
            goto L57
        L4d:
            r1 = 1633627889268271015(0x16abcfe8f301a7a7, double:1.8167175829885753E-199)
            r2 = r10
            java.lang.UnsupportedOperationException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/UnsupportedOperationException;}
            ).invoke(r0, r1, r2)
            throw r0
        L57:
            r1 = r12
            if (r1 != 0) goto L6d
            if (r0 != 0) goto L70
            goto L6c
        L62:
            r1 = 1633627889268271015(0x16abcfe8f301a7a7, double:1.8167175829885753E-199)
            r2 = r10
            java.lang.UnsupportedOperationException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/UnsupportedOperationException;}
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._3.w(java.util.List, net.minecraft.class_1799):boolean");
    }

    private static final Unit q() {
        return Unit.INSTANCE;
    }

    static {
        int i;
        long j = ab ^ 107889819955667L;
        hb = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, 784870051371612062L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[80];
        int i3 = 0;
        String str = "'òv¾\u000b\u0097)mË¥p\\/x¸\u009a\u0010\u0002£\nõÛLÞ=\u001458\u0093z¹hí \u008cx~P\u0006£ó\u0004Ç¶¾auÉWÉ\r\u0091è!jÍ«\fkÒÄ7¢qVÞ\u0018\u0088]SS\u008a&\u008d\u0084YÃFb2Í\bÊ´\u001e|¿\"×%å\u0010l³\u008e åðÐw\\ìCf¢`;\\\u0010\u008eøq\u0093n¶K\u0011\u008aö\u001e Àé¥Ä@³\u0089u.Ô´\u009cÙJ¬\u008d\u0085ªö}ÐA¸{\u0011õ=»\u008a\u008b\u0086Xs±Ö\u009c¤ÃÂ\u0002\u00adö\u0099¹dqÀìWÕz\u008eC\t\u008c\u0014`\u008dXý\u008aSpé\u0089\u009a¡Eï \u007ffx-ÑGTLµ\u0082]ÓoWF`÷¼ÚúhãTå\u001eÕÈÏÅ\u0001ÊÍ(Áü\u0011\f¥\u000fÇ±bÖ½\u008d\u0088\u0085D,)¤$k;LÛ\u0010éj\u000fë®\fk\u0019f.\u00ad¬¬Ld\u0012(ö\u0084¨5|Ôó¤\u0014ô~¯<v6·\u0014\u0001\u008c\u0090Ô\u0088úNâöåh¨ðôm\r5E=²Fg\u009d\u0010\u0007\u0013N\u008eá¶Wÿ¡\u0096<S´.\u001e\u00030½Ê\u0005ê\u0006\u001fóÔl\nª¯ö&Ù\u0082WÐ\u000fV¡¨[\u008cøêÁ)Ì\u00881\u008d±^r.3ßá²»\f=\u0011\u0081Ék\u0015\u0010\u009d¡}Kï³ÝdòÔð+'à|¤\u0088¬CÌ9©Ü{¯\u0091Ì[§\u0080#\u0003°Í\u0099¦kæt8¤z\u0006º7\u0010\u00adM\t\nÙ0qEÉ§\u008f[xñ\u00862YÈ \u0000Ï¶7Ò\u0016æ\u009fbZ\u0019é\u0083À\u0011\u0085'ô\"áq\u0018\u009bs¶MÇ\f\u0013\u0083}\u007fÇé\u001cv\u001b·È¬Ç\u008dÑl\u0080@\\\rî*x¬(SIêo\u0001×ö©m>°ÈNÃaû¡\u000fÎ\u001e\u00045½M¦\u0096aT§¸ÇÙ,0\u0004 2£¦ÛiXJiÛH\u0099JÂp1\u0086?\u0098\u009bå\u0012ã\u0003\u0081P©&®FÕuñ\u0018Ü2½ -·ì\r\u0093\\ç\u009e\u0086\u0095þºcTÃ?%O\u0017æ8=f1©\u0092\u0093(ÝÓªãæZ\u001cl´\u009d\u0090¸\u0098Út\u0018ë\u0096Â¶^\u009fÒ\\\n\f\u001fFR\u0082W5æê{\tsûxÞ\u001c\u009awÐ\u009f)\r6Ø({(9ufk\u0005S\u0085kQ\næ\u0000þ/ò\u0007\"¸\u008fø®\u008b|©\u0013bºSßfWï_âTð\u008f\u001a(DFÓs\u009d\u0081@q\u0088ÿéZ\u0094^,áá\"/\u0017q·r\u0000Du8\u0013ÐG{jÒüH};Ç\u0096É \u0007W\u0098|$Ãª¸¸0V\u0005ÅãT\u0016]\u0090Úm¦;/\u0097Ìéy\u0018¸Cpe ü\u0096d\u0016k\u001e\u008fò\u0099ÏaW\u008e\u001f\u0098k~ÐÆ\u0005¹c%Mq\u0005´æ\u0085\u009aFÊ \u00adâSnbZ\u000e\u0012\u008a/$eªFB¨\u00ad}¹\"Ö\n´Î°A¦î\b\u001eR»\u0010ÂHk\u0002Qj¢áRY°/ØöOë ]ÛB\u0098g¡ü\bZ\tß±\u0019Þ\u0007àõ\u009c}\u0083T\u009dN^ A\u0015\tú\u007f\r\u0084\u0018;/Ûf<\u008chm®ojAs9Â1(\u0092\bF,j ã\u0018ÎNVD}dR'\u0091Ñ\bBò\t-2G\u0081í ã¥Fª \u008e\u009aÆV`ðû>MømñÝ\u008bÜ\u0019jÂDR\u00030ª\u008c\nTAOï\b»n\u0010\u008eÕtâÆØ)D\u0005rÕ94I\u0094´ \u009fVð4\u0080·\u008bJá-\u0081æ\u0090ëÐæ,\u008f\u0005\u0096ü \u0087¼\u0012Ô|\u001c\u0083Á#Õ \u008fû\u008aD\u0012\u0087¹þ¿7\u0097¶ªûï¾¦U\u001fÍ\u0002#Ií¥ø«¦{\u0082Çâ8¿\u008d§Ñ\u000eì\u0014\u007f\u0006\u0089\u0097\u000bÐ\u000b,V\u0011\u0004D\tÌ$&\u0010xÍûâÆ\u008c]\u0081©j)RÍ\u001e£WÛfÝ«èu_\u0090\u001dx4M\u008f\u0013\u0002Û\u0010+4ÞâCPéö½\u008a'pµéFQ\u00103\u009b\u0098n\u0007\u0090¥;3z\u000f\u0090\u0085\r\u009fg8\n\u0017ÃðkìN\u008e\u0087R±|Ò\u0016W\u0091\u0089è\u008aU\u008a\n®S\u0002\u0089ä7CÓýZ¸>=\u0003úwTñ¥ÑÝk \u0092ù\t\u009d\u0001\u0089ljS³(\u0018;Ò(Q=9²·\u001cÇ¹ÿ\u008f\u0014£®C ÆW\u0012\u0007u±\u0010?kÊys*Ã\u0006\u0097à\u0099\u0000¦äËÍ(3CÁwKsøQ\u0085Ìy\tÕER¤ýDeà3}å\u0012\u0000¯\u008e\u0018dÖûé®\u0012EáS°ü¤\u0010kcÅ3\u0089\u0084u¾KBHÙÃu\u0087?\u0010HyS8!ï°É \u0094\u009b$2À\u001f>\u0010Ãx\b¶\u0015K\u0012\u0086Û÷ímÉ\u009c¬\u009e \u0085×\"h\u0019ò\u00014\u0003®D\u0084\u000e\u00adÄ.ÿöeVU\u008eYó`ß\u0014àu@)«8ê`¥¨Nhm\u007f\r±ñ»\u001d½:¾ÿ¦-¬d\u009b¡\u00adÛÖ\u008f\u0010l\u009eGí.\u0004ë½\u0087Í\u008a\b\u0010ÿW\u001c\u0085B\u0018>î\u0098~ê+\u0003I\u0000(TÕH:¦(2\u0013\u0094)>¯ùê»\u0089Õ4ß^Ë£y¿\u0003J×zgX7Tp¯Ú\u0002\u0094Æ¸ä Ö\u001c\tO\u000e±Ä\u000b4O\u0091\bÀ\u0093\"K7BÒÈQ!}üÄ\u0019B´~<Fö\u0010\u0087£\u0088Îú×wd0ÝÜâ\u0094ÏBV\u0010¶\u008f¡ç\u0001è\u0084'-ã8¢êýeY(üB!A|©äÊ\u008e+n\u009f\u0019»ñ¬ù0Ìpé\u0081R\u001fa3Ø³\u00ad±íí\u001b\u0094®{\u000ff¼³ 5Ã¦ø\u0019¹Ö\u00115Ï\u0014pú\u0010¡%}G\u008a\u0004\u0097\u0090\u0094\u008b\u0092Ñ»WÑ{§Ú\u0018\u0018æ\u001dÑ3Ã\"¨)Éz\u000b\u0097J\u0085Þ\u007fv¸Ë;ºß\u0012\u0018\u0088ùËn5;¶\u0088\u00009\u001eÃ$ãÛ\u0089ù\u0089m\u009d\u0086n\u0083×\u0010\rÓkITÑjþ\u0097ÿú\u008aRóXôH!yôe{>Ý\u009c\f\"NíU\u0010 :ñ\u0088'\u001b\u009a\n\u0082;3FOÊÈU.3\u0006Ë\r\u0012Ë\u0018Iqkn-)\u0000.\u0083Uå*&R\baî\u008b}x²B¦\r\u0001æld¥\u00804 \u000e3\u0090TNâ_'\u0004Ô\u00863ÛP¨õÊ\u0080ùª\u0085P*í=I\u009c_¾`³Úc\u0011ýéÔ\u0007Õ\u0084Äð3²i:\r\u008aí®£<\u0081û¡@ÄÍ\u001aE\u009eïÍ\u008bB)½\u0082\u00914(ð;MgMZÐ\u00195j\u0097\u0084Ý7è}\u0016\r6@ºXÙEÅdÖç\u0081À\u001a½,5\u0018NRy{`_ÐTî\u00877\u000fÊuz¤fÀ\u0017¬&¥\t\u00ad\u0098±c¡\u001d2\u0095\u000eÝµ\u0089¬ó´\u0000\u0093\u0089\u0010·M[\u001d{ECùI¨çà.Âoê\u0010{\u008a\u0086óhÃ/xZ\n\u0015LEû\u009a# \u001c\u008dç\u00815\u001f'~µ]\u000fØ\u0090Qá(MôÞÈ \u0092£¯Qt¾£Ñ½km\u0018j\u008beÇÜðkcÛl\u0003¬ÇMV\u0097÷\u007f\u0085FD\u0017\u0093\u00ad ÔÇ\u0007\u0007ÌRd\u0085æ g¯\u0007¢lg\u0087²9.ª·\u00adN\u000fkOÿ'\u0014ôõ :9\u0094*Hòl\u000b\u008dæmÃ#\u0085bÍ@ªW ä\u001ateO*Ø9\u0005\u008bßè\u0018[#\u009b9\u001c\u001dwïâ`\u008f\u001b]\rÛéLI6A\\~\u0080É ×\bðùJÉ6î\u0085j`\u0087\u0019\u0004×>¢Ù\u008aU\u007fp\u009a¸ÌbúI1KÚ\u0086\u0018ßwäÖ¬\u001cKrÙîàw'$p\u0013\u009f*ùMá\u0016;Û \u0092v\u009d\u0088päB0\u0090ö0JB\nÊu\u0087ýÑÃg³\u0084«cHÙaà\u009b]\u008e8-\u0011S\u009a\u0082<áqu\u0002±ãY\u0012;#ªÇ\u0090¡%Á\u0097cp+.pC\u0085%%\u0082ë¾5Ä+»j,\u009c$B\u008eº<\u007f@Ý.ú\u0091¦î¢\u00106»ùAM\u0016UéH¡åp´o\u001f½(>PÍ.¶äö/§\u0019âGÆâ\u0087§¦wÁú\u009bþ\u0019?ï¨\u0084À\u0018\u0004O\u0081ï±~ì\u009aÅ\u0011J P\u0096ëîUÊ9ExnúRºþ¦=>6Tª\u0003jD\u008c<ÉÁ XÇÀ»\u0010ÅýúêË^Î\u000b\u0083ßºÓEa?O ²§\teò¤ùL\u0082\u0091/Ü&\u009eVÂ\u0012êo·\u009cU9^¨¯4F\u0081ö\u001dë \u0097` \"WË\u0003:XÅ~#Ö\u009f\u009dò\u0011Îñ[\u008c\u009f\u0094°\u0005SZêvû(²\u0010f\r@\b#Ê©\u008ejt\u009eMÈè!O\u0010\tõ\u0014?0|ï\u0010°}\u0003¢\u0081_\u00050 \u0084á?@\u0098¹\"ml\u0099,qá¾\u009a\u001d5ýiX|\u0081\u0019\u008du\u0090\u009e\u0093OPâ! ¢kÆ\u0083O4ô7\u0012ÇþI2\rY\u0098ó\u0015\u0097,\u0013ÙüÌºÚù/\u00056\u0019\u00070¯`\u0014_Ö~9ûIãe»1ÃHô¦4órøÁî\u0098\u0012\u0096\u009e;yÙ¢\u009da\u009b\u001d\u0093\u0099·\u0005r!Í\u001b\u001ay2¾\u008c\u0088\u0088ñ°\bè\u0085\u001c[\u0095a{nÜ³ñ(\u0082\u001cL¹@·\u008dÊü×{z\u001aÅ(þÅ\u00127â¦Þ\u0092\u0013\u00999I-uýS0·)\u0091¿6Ä\u0017\u0088æ(\u00adr§Jù\"e¶YÃ.\\Å\u0091\u0016x¦\u008e\u0091o\tñ\u0081¸í±©\u0084ð\u0010!\u0099²Z\u000f¼\u0095H?UVx¹ÍNîÏ;n¬\u0085p\u001bYñ\u0010\u0091âÔË\u0083ôÑ\u0080\u0088¹¢b°ÐÂE¦Xª/B\u0094\u0010n_ÕÛ³a¾Qs\u009d\u001aLa/ 2\u0010Í \u00193\u0088\u000f3\u0016<IrÆ\u0099\u0082\u0002Ö";
        int length = "'òv¾\u000b\u0097)mË¥p\\/x¸\u009a\u0010\u0002£\nõÛLÞ=\u001458\u0093z¹hí \u008cx~P\u0006£ó\u0004Ç¶¾auÉWÉ\r\u0091è!jÍ«\fkÒÄ7¢qVÞ\u0018\u0088]SS\u008a&\u008d\u0084YÃFb2Í\bÊ´\u001e|¿\"×%å\u0010l³\u008e åðÐw\\ìCf¢`;\\\u0010\u008eøq\u0093n¶K\u0011\u008aö\u001e Àé¥Ä@³\u0089u.Ô´\u009cÙJ¬\u008d\u0085ªö}ÐA¸{\u0011õ=»\u008a\u008b\u0086Xs±Ö\u009c¤ÃÂ\u0002\u00adö\u0099¹dqÀìWÕz\u008eC\t\u008c\u0014`\u008dXý\u008aSpé\u0089\u009a¡Eï \u007ffx-ÑGTLµ\u0082]ÓoWF`÷¼ÚúhãTå\u001eÕÈÏÅ\u0001ÊÍ(Áü\u0011\f¥\u000fÇ±bÖ½\u008d\u0088\u0085D,)¤$k;LÛ\u0010éj\u000fë®\fk\u0019f.\u00ad¬¬Ld\u0012(ö\u0084¨5|Ôó¤\u0014ô~¯<v6·\u0014\u0001\u008c\u0090Ô\u0088úNâöåh¨ðôm\r5E=²Fg\u009d\u0010\u0007\u0013N\u008eá¶Wÿ¡\u0096<S´.\u001e\u00030½Ê\u0005ê\u0006\u001fóÔl\nª¯ö&Ù\u0082WÐ\u000fV¡¨[\u008cøêÁ)Ì\u00881\u008d±^r.3ßá²»\f=\u0011\u0081Ék\u0015\u0010\u009d¡}Kï³ÝdòÔð+'à|¤\u0088¬CÌ9©Ü{¯\u0091Ì[§\u0080#\u0003°Í\u0099¦kæt8¤z\u0006º7\u0010\u00adM\t\nÙ0qEÉ§\u008f[xñ\u00862YÈ \u0000Ï¶7Ò\u0016æ\u009fbZ\u0019é\u0083À\u0011\u0085'ô\"áq\u0018\u009bs¶MÇ\f\u0013\u0083}\u007fÇé\u001cv\u001b·È¬Ç\u008dÑl\u0080@\\\rî*x¬(SIêo\u0001×ö©m>°ÈNÃaû¡\u000fÎ\u001e\u00045½M¦\u0096aT§¸ÇÙ,0\u0004 2£¦ÛiXJiÛH\u0099JÂp1\u0086?\u0098\u009bå\u0012ã\u0003\u0081P©&®FÕuñ\u0018Ü2½ -·ì\r\u0093\\ç\u009e\u0086\u0095þºcTÃ?%O\u0017æ8=f1©\u0092\u0093(ÝÓªãæZ\u001cl´\u009d\u0090¸\u0098Út\u0018ë\u0096Â¶^\u009fÒ\\\n\f\u001fFR\u0082W5æê{\tsûxÞ\u001c\u009awÐ\u009f)\r6Ø({(9ufk\u0005S\u0085kQ\næ\u0000þ/ò\u0007\"¸\u008fø®\u008b|©\u0013bºSßfWï_âTð\u008f\u001a(DFÓs\u009d\u0081@q\u0088ÿéZ\u0094^,áá\"/\u0017q·r\u0000Du8\u0013ÐG{jÒüH};Ç\u0096É \u0007W\u0098|$Ãª¸¸0V\u0005ÅãT\u0016]\u0090Úm¦;/\u0097Ìéy\u0018¸Cpe ü\u0096d\u0016k\u001e\u008fò\u0099ÏaW\u008e\u001f\u0098k~ÐÆ\u0005¹c%Mq\u0005´æ\u0085\u009aFÊ \u00adâSnbZ\u000e\u0012\u008a/$eªFB¨\u00ad}¹\"Ö\n´Î°A¦î\b\u001eR»\u0010ÂHk\u0002Qj¢áRY°/ØöOë ]ÛB\u0098g¡ü\bZ\tß±\u0019Þ\u0007àõ\u009c}\u0083T\u009dN^ A\u0015\tú\u007f\r\u0084\u0018;/Ûf<\u008chm®ojAs9Â1(\u0092\bF,j ã\u0018ÎNVD}dR'\u0091Ñ\bBò\t-2G\u0081í ã¥Fª \u008e\u009aÆV`ðû>MømñÝ\u008bÜ\u0019jÂDR\u00030ª\u008c\nTAOï\b»n\u0010\u008eÕtâÆØ)D\u0005rÕ94I\u0094´ \u009fVð4\u0080·\u008bJá-\u0081æ\u0090ëÐæ,\u008f\u0005\u0096ü \u0087¼\u0012Ô|\u001c\u0083Á#Õ \u008fû\u008aD\u0012\u0087¹þ¿7\u0097¶ªûï¾¦U\u001fÍ\u0002#Ií¥ø«¦{\u0082Çâ8¿\u008d§Ñ\u000eì\u0014\u007f\u0006\u0089\u0097\u000bÐ\u000b,V\u0011\u0004D\tÌ$&\u0010xÍûâÆ\u008c]\u0081©j)RÍ\u001e£WÛfÝ«èu_\u0090\u001dx4M\u008f\u0013\u0002Û\u0010+4ÞâCPéö½\u008a'pµéFQ\u00103\u009b\u0098n\u0007\u0090¥;3z\u000f\u0090\u0085\r\u009fg8\n\u0017ÃðkìN\u008e\u0087R±|Ò\u0016W\u0091\u0089è\u008aU\u008a\n®S\u0002\u0089ä7CÓýZ¸>=\u0003úwTñ¥ÑÝk \u0092ù\t\u009d\u0001\u0089ljS³(\u0018;Ò(Q=9²·\u001cÇ¹ÿ\u008f\u0014£®C ÆW\u0012\u0007u±\u0010?kÊys*Ã\u0006\u0097à\u0099\u0000¦äËÍ(3CÁwKsøQ\u0085Ìy\tÕER¤ýDeà3}å\u0012\u0000¯\u008e\u0018dÖûé®\u0012EáS°ü¤\u0010kcÅ3\u0089\u0084u¾KBHÙÃu\u0087?\u0010HyS8!ï°É \u0094\u009b$2À\u001f>\u0010Ãx\b¶\u0015K\u0012\u0086Û÷ímÉ\u009c¬\u009e \u0085×\"h\u0019ò\u00014\u0003®D\u0084\u000e\u00adÄ.ÿöeVU\u008eYó`ß\u0014àu@)«8ê`¥¨Nhm\u007f\r±ñ»\u001d½:¾ÿ¦-¬d\u009b¡\u00adÛÖ\u008f\u0010l\u009eGí.\u0004ë½\u0087Í\u008a\b\u0010ÿW\u001c\u0085B\u0018>î\u0098~ê+\u0003I\u0000(TÕH:¦(2\u0013\u0094)>¯ùê»\u0089Õ4ß^Ë£y¿\u0003J×zgX7Tp¯Ú\u0002\u0094Æ¸ä Ö\u001c\tO\u000e±Ä\u000b4O\u0091\bÀ\u0093\"K7BÒÈQ!}üÄ\u0019B´~<Fö\u0010\u0087£\u0088Îú×wd0ÝÜâ\u0094ÏBV\u0010¶\u008f¡ç\u0001è\u0084'-ã8¢êýeY(üB!A|©äÊ\u008e+n\u009f\u0019»ñ¬ù0Ìpé\u0081R\u001fa3Ø³\u00ad±íí\u001b\u0094®{\u000ff¼³ 5Ã¦ø\u0019¹Ö\u00115Ï\u0014pú\u0010¡%}G\u008a\u0004\u0097\u0090\u0094\u008b\u0092Ñ»WÑ{§Ú\u0018\u0018æ\u001dÑ3Ã\"¨)Éz\u000b\u0097J\u0085Þ\u007fv¸Ë;ºß\u0012\u0018\u0088ùËn5;¶\u0088\u00009\u001eÃ$ãÛ\u0089ù\u0089m\u009d\u0086n\u0083×\u0010\rÓkITÑjþ\u0097ÿú\u008aRóXôH!yôe{>Ý\u009c\f\"NíU\u0010 :ñ\u0088'\u001b\u009a\n\u0082;3FOÊÈU.3\u0006Ë\r\u0012Ë\u0018Iqkn-)\u0000.\u0083Uå*&R\baî\u008b}x²B¦\r\u0001æld¥\u00804 \u000e3\u0090TNâ_'\u0004Ô\u00863ÛP¨õÊ\u0080ùª\u0085P*í=I\u009c_¾`³Úc\u0011ýéÔ\u0007Õ\u0084Äð3²i:\r\u008aí®£<\u0081û¡@ÄÍ\u001aE\u009eïÍ\u008bB)½\u0082\u00914(ð;MgMZÐ\u00195j\u0097\u0084Ý7è}\u0016\r6@ºXÙEÅdÖç\u0081À\u001a½,5\u0018NRy{`_ÐTî\u00877\u000fÊuz¤fÀ\u0017¬&¥\t\u00ad\u0098±c¡\u001d2\u0095\u000eÝµ\u0089¬ó´\u0000\u0093\u0089\u0010·M[\u001d{ECùI¨çà.Âoê\u0010{\u008a\u0086óhÃ/xZ\n\u0015LEû\u009a# \u001c\u008dç\u00815\u001f'~µ]\u000fØ\u0090Qá(MôÞÈ \u0092£¯Qt¾£Ñ½km\u0018j\u008beÇÜðkcÛl\u0003¬ÇMV\u0097÷\u007f\u0085FD\u0017\u0093\u00ad ÔÇ\u0007\u0007ÌRd\u0085æ g¯\u0007¢lg\u0087²9.ª·\u00adN\u000fkOÿ'\u0014ôõ :9\u0094*Hòl\u000b\u008dæmÃ#\u0085bÍ@ªW ä\u001ateO*Ø9\u0005\u008bßè\u0018[#\u009b9\u001c\u001dwïâ`\u008f\u001b]\rÛéLI6A\\~\u0080É ×\bðùJÉ6î\u0085j`\u0087\u0019\u0004×>¢Ù\u008aU\u007fp\u009a¸ÌbúI1KÚ\u0086\u0018ßwäÖ¬\u001cKrÙîàw'$p\u0013\u009f*ùMá\u0016;Û \u0092v\u009d\u0088päB0\u0090ö0JB\nÊu\u0087ýÑÃg³\u0084«cHÙaà\u009b]\u008e8-\u0011S\u009a\u0082<áqu\u0002±ãY\u0012;#ªÇ\u0090¡%Á\u0097cp+.pC\u0085%%\u0082ë¾5Ä+»j,\u009c$B\u008eº<\u007f@Ý.ú\u0091¦î¢\u00106»ùAM\u0016UéH¡åp´o\u001f½(>PÍ.¶äö/§\u0019âGÆâ\u0087§¦wÁú\u009bþ\u0019?ï¨\u0084À\u0018\u0004O\u0081ï±~ì\u009aÅ\u0011J P\u0096ëîUÊ9ExnúRºþ¦=>6Tª\u0003jD\u008c<ÉÁ XÇÀ»\u0010ÅýúêË^Î\u000b\u0083ßºÓEa?O ²§\teò¤ùL\u0082\u0091/Ü&\u009eVÂ\u0012êo·\u009cU9^¨¯4F\u0081ö\u001dë \u0097` \"WË\u0003:XÅ~#Ö\u009f\u009dò\u0011Îñ[\u008c\u009f\u0094°\u0005SZêvû(²\u0010f\r@\b#Ê©\u008ejt\u009eMÈè!O\u0010\tõ\u0014?0|ï\u0010°}\u0003¢\u0081_\u00050 \u0084á?@\u0098¹\"ml\u0099,qá¾\u009a\u001d5ýiX|\u0081\u0019\u008du\u0090\u009e\u0093OPâ! ¢kÆ\u0083O4ô7\u0012ÇþI2\rY\u0098ó\u0015\u0097,\u0013ÙüÌºÚù/\u00056\u0019\u00070¯`\u0014_Ö~9ûIãe»1ÃHô¦4órøÁî\u0098\u0012\u0096\u009e;yÙ¢\u009da\u009b\u001d\u0093\u0099·\u0005r!Í\u001b\u001ay2¾\u008c\u0088\u0088ñ°\bè\u0085\u001c[\u0095a{nÜ³ñ(\u0082\u001cL¹@·\u008dÊü×{z\u001aÅ(þÅ\u00127â¦Þ\u0092\u0013\u00999I-uýS0·)\u0091¿6Ä\u0017\u0088æ(\u00adr§Jù\"e¶YÃ.\\Å\u0091\u0016x¦\u008e\u0091o\tñ\u0081¸í±©\u0084ð\u0010!\u0099²Z\u000f¼\u0095H?UVx¹ÍNîÏ;n¬\u0085p\u001bYñ\u0010\u0091âÔË\u0083ôÑ\u0080\u0088¹¢b°ÐÂE¦Xª/B\u0094\u0010n_ÕÛ³a¾Qs\u009d\u001aLa/ 2\u0010Í \u00193\u0088\u000f3\u0016<IrÆ\u0099\u0082\u0002Ö".length();
        char cCharAt = 16;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            fb = strArr;
                            gb = new String[80];
                            nb = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[33];
                            int i9 = 0;
                            String str3 = "\rÓ§Ý!M}Á\u009bãDJ\u008f\u0012ú¤~\u0083\u0012Õõ£ßÑé HºåÕ\u0088s\u000f^\u007f\u0000¹à**Fy\u0089ô|½\u0019 ¾×Y©o\u0015¶'Ð%ýÖþºð\u008fÐ\u0096cìfr¹\r_r\u0092\u001a|+\u0005×TÒÃ\u0091(j\u001cªÇ+Ø¥X\u0095\u0016\u001051è¸W{eK\u0004\u009d\tù¸_áÈ+o\u007f\u009f-¥}A~¿éË\u00848dÓ\\úgd>Ç7 |tÎ\n,6±\u009cë\u009e5Øæ\u008c7¿<\u0019\u008a\u0010\u00034:F\u0013Jû©AÄ\u0082\"§\u0092ÉJ¦ì\u009f:Í:>+~Á\u008eI)4æv\u0002Êüe£\u009a[ÓÒ*nªxÓö,P6\u0000ý-Ìð®\u0098ñx$\u0088/ö¿Ð½µ»ü¯íYrèv/9?O§s\u008e½K\u0014'éî^P\u009c6";
                            int length2 = "\rÓ§Ý!M}Á\u009bãDJ\u008f\u0012ú¤~\u0083\u0012Õõ£ßÑé HºåÕ\u0088s\u000f^\u007f\u0000¹à**Fy\u0089ô|½\u0019 ¾×Y©o\u0015¶'Ð%ýÖþºð\u008fÐ\u0096cìfr¹\r_r\u0092\u001a|+\u0005×TÒÃ\u0091(j\u001cªÇ+Ø¥X\u0095\u0016\u001051è¸W{eK\u0004\u009d\tù¸_áÈ+o\u007f\u009f-¥}A~¿éË\u00848dÓ\\úgd>Ç7 |tÎ\n,6±\u009cë\u009e5Øæ\u008c7¿<\u0019\u008a\u0010\u00034:F\u0013Jû©AÄ\u0082\"§\u0092ÉJ¦ì\u009f:Í:>+~Á\u008eI)4æv\u0002Êüe£\u009a[ÓÒ*nªxÓö,P6\u0000ý-Ìð®\u0098ñx$\u0088/ö¿Ð½µ»ü¯íYrèv/9?O§s\u008e½K\u0014'éî^P\u009c6".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b3 = -1;
                                while (true) {
                                    byte b4 = b3;
                                    long j3 = j2;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b4] = j4;
                                            if (i10 >= length2) {
                                                lb = jArr;
                                                mb = new Integer[33];
                                                KProperty[] kPropertyArr = new KProperty[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23973, 6756113314880947970L ^ j) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23780, 5959496085819364712L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7102, 2906511151494418944L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20591, 4270011049473776065L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4887, 8329486912728816302L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13512, 3066790991382609240L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13081, 512394730572675718L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25412, 7330170346817792738L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8453, 4444737128261118096L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28397, 4272148227923453806L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2592, 3679126637198754748L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24782, 2646446229902174529L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3044, 9133856028515779133L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26364, 4556824153893878861L ^ j) /* invoke-custom */] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24999, 3656838410015484018L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7056, 779884337161392678L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29869, 7789686074727443974L ^ j) /* invoke-custom */] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14576, 8921307806779568416L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13748, 2546453933080050716L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31704, 6299935118032806240L ^ j) /* invoke-custom */] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24218, 3556108703469639502L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16515, 3973660389774887175L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31523, 473757606280110484L ^ j) /* invoke-custom */] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28106, 1501857665406018628L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16100, 9183513319409612603L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21236, 3690926919446661191L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13568, 185273533996203180L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11716, 316033961283740749L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(193, 5642690996021910113L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25032, 5315601425612711952L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15677, 8194303660025640065L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7505, 7871507040092604394L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7552, 4021521452821730341L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4952, 654860045386013388L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32248, 5711661238132811598L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31913, 5295431028162147601L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13632, 8809913525380578520L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32696, 7099942340327515417L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16528, 7435550200958224674L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24117, 3895917306064115584L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20474, 3393232311875900767L ^ j) /* invoke-custom */] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17166, 4468142544706570901L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31864, 2467881843547649445L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20575, 2293933424110209766L ^ j) /* invoke-custom */] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5934, 2295388501934825093L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7310, 5096380514442335519L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22372, 4631641001054506432L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15721, 7011984097927984363L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22693, 4591205138175103267L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31454, 4567493942274498666L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3565, 2996492452029645926L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13847, 8295595623969849232L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) e(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13221, 6146595669833312522L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(_3.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32378, 2493226501514835923L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23314, 9004712556336353974L ^ j) /* invoke-custom */, 0));
                                                D = kPropertyArr;
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b4] = j4;
                                            if (i10 >= length2) {
                                                str3 = "Ùæ\u0014X\u0005qÚVG\u0015#õ¬^\u008dÇ";
                                                length2 = "Ùæ\u0014X\u0005qÚVG\u0015#õ¬^\u008dÇ".length();
                                                i10 = 0;
                                            }
                                            break;
                                    }
                                    int i14 = i10;
                                    i10 += 8;
                                    byte[] bytes2 = str3.substring(i14, i10).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i12 = i9;
                                    i9++;
                                    j2 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b3 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i15 = i3;
                        i3++;
                        strArr[i15] = strIntern;
                        int i16 = i5 + cCharAt;
                        i4 = i16;
                        if (i16 < length) {
                        }
                        str = "×5¬\u0005P\u0099ûW\bq\u0095~\u0018×NjÊCy]9dõc\u0012\u000evÛ9\u0011)P¢\u0085¶È\u0015½\u009fÛSsªéf+\tÛ\u000b\u00adX!7¿Hj\u0010\u0019\u001eUÛ2_M\u0016m©ZÊ\u0013Ý#¯";
                        length = "×5¬\u0005P\u0099ûW\bq\u0095~\u0018×NjÊCy]9dõc\u0012\u000evÛ9\u0011)P¢\u0085¶È\u0015½\u009fÛSsªéf+\tÛ\u000b\u00adX!7¿Hj\u0010\u0019\u001eUÛ2_M\u0016m©ZÊ\u0013Ý#¯".length();
                        cCharAt = '8';
                        i = -1;
                        break;
                        break;
                }
                i5 = i + 1;
                strSubstring = str.substring(i5, i5 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i4);
        }
    }

    public static void D(int[] iArr) {
        u = iArr;
    }

    public static int[] j() {
        return u;
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    private static String b(byte[] bArr) {
        int i = 0;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i2 = 0;
        while (i2 < length) {
            int i3 = 255 & bArr[i2];
            if (i3 < 192) {
                int i4 = i;
                i++;
                cArr[i4] = (char) i3;
            } else if (i3 < 224) {
                i2++;
                int i5 = i;
                i++;
                cArr[i5] = (char) (((char) (((char) (i3 & 31)) << 6)) | ((char) (bArr[i2] & 63)));
            } else if (i2 < length - 2) {
                int i6 = i2 + 1;
                char c = (char) (((char) (((char) (i3 & 15)) << '\f')) | (((char) (bArr[i6] & 63)) << 6));
                i2 = i6 + 1;
                int i7 = i;
                i++;
                cArr[i7] = (char) (c | ((char) (bArr[i2] & 63)));
            }
            i2++;
        }
        return new String(cArr, 0, i);
    }

    private static String b(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 16928;
        if (gb[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) hb.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    hb.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                gb[i2] = b(((Cipher) objArr[0]).doFinal(fb[i2].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/_3", e);
            }
        }
        return gb[i2];
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
            r1 = 44
            int r1 = r1.parameterCount()
            r-1.asCollector(r0, r1)
            r0 = 0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r9
            r2[r3] = r4
            java.lang.invoke.MethodHandles.insertArguments(r-1, r0, r1)
            r0 = r10
            java.lang.invoke.MethodHandles.explicitCastArguments(r-1, r0)
            r-2.setTarget(r-1)
            goto L62
            r12 = r-3
            java.lang.RuntimeException r-3 = new java.lang.RuntimeException
            r-2 = r-3
            java.lang.StringBuilder r-1 = new java.lang.StringBuilder
            r0 = r-1
            r0.<init>()
            java.lang.String r0 = "su/catlean/_3"
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r9
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r-1.append(r0)
            r-1.toString()
            r0 = r12
            r-2.<init>(r-1, r0)
            throw r-3
            r-2 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._3.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int e(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 20743;
        if (mb[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) lb[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) nb.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    nb.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/_3", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            mb[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return mb[i2].intValue();
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iE = e(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iE)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iE;
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
    private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = 44
            int r1 = r1.parameterCount()
            r-1.asCollector(r0, r1)
            r0 = 0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r9
            r2[r3] = r4
            java.lang.invoke.MethodHandles.insertArguments(r-1, r0, r1)
            r0 = r10
            java.lang.invoke.MethodHandles.explicitCastArguments(r-1, r0)
            r-2.setTarget(r-1)
            goto L62
            r12 = r-3
            java.lang.RuntimeException r-3 = new java.lang.RuntimeException
            r-2 = r-3
            java.lang.StringBuilder r-1 = new java.lang.StringBuilder
            r0 = r-1
            r0.<init>()
            java.lang.String r0 = "su/catlean/_3"
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r9
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r-1.append(r0)
            r-1.toString()
            r0 = r12
            r-2.<init>(r-1, r0)
            throw r-3
            r-2 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._3.e(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
