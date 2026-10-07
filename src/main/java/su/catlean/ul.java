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
import kotlin.reflect.KProperty;
import net.minecraft.class_4050;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ul.class */
public final class ul extends _g {

    @NotNull
    public static final ul b = null;
    static final KProperty[] L = null;

    @NotNull
    private static final c8 g = null;

    @NotNull
    private static final c8 z = null;

    @NotNull
    private static final c8 l = null;

    @NotNull
    private static final cq Y = null;

    @NotNull
    private static final cq G = null;

    @NotNull
    private static final cq k = null;

    @NotNull
    private static final cq I = null;

    @NotNull
    private static final cq m = null;

    @NotNull
    private static final cq V = null;

    @NotNull
    private static final cq i = null;

    @NotNull
    private static final cq T = null;

    @NotNull
    private static final ct X = null;

    @NotNull
    private static final ct S = null;

    @NotNull
    private static final ct h = null;

    @NotNull
    private static final ct A = null;

    @NotNull
    private static final ct e = null;

    @NotNull
    private static final ct D = null;

    @NotNull
    private static final ct F = null;

    @NotNull
    private static final ct y = null;

    @NotNull
    private static final ct x = null;

    @NotNull
    private static final ct t = null;

    @NotNull
    private static final ct u = null;

    @NotNull
    private static final ct a = null;

    @NotNull
    private static final ct W = null;

    @NotNull
    private static final ct J = null;

    @NotNull
    private static final ct o = null;

    @NotNull
    private static final ct c = null;

    @NotNull
    private static final ct C = null;

    @NotNull
    private static final ct N = null;

    @NotNull
    private static final ct n = null;

    @NotNull
    private static final i9 j = null;

    @NotNull
    private static final i9 f = null;

    @NotNull
    private static final i9 K = null;

    @NotNull
    private static HashMap d;
    private static boolean P;
    private static int w;
    private static final long B = 0;
    private static final String[] E = null;
    private static final String[] O = null;
    private static final Map U = null;
    private static final long[] ab = null;
    private static final Integer[] fb = null;
    private static final Map gb = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private ul(long j2) {
        long j3 = B ^ j2;
        super((String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2131, 6907087335007337821L ^ j3) /* invoke-custom */, jt.V(), null, 4, null, j3 ^ 63625304519295L);
    }

    private final int t(char c2, int i2, int i3) {
        return ((Number) g.E(this, ((((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ B) ^ 20677112883924L, L[0])).intValue();
    }

    private final int FX(long j2) {
        return ((Number) z.E(this, (B ^ j2) ^ 55277627798502L, L[1])).intValue();
    }

    private final int q(long j2) {
        return ((Number) l.E(this, (B ^ j2) ^ 81350038769376L, L[2])).intValue();
    }

    private final boolean v(long j2) {
        return ((Boolean) Y.E(this, (B ^ j2) ^ 137012452859437L, L[3])).booleanValue();
    }

    private final boolean l(int i2, char c2, char c3) {
        return ((Boolean) G.E(this, ((((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) c3) << 48) >>> 48)) ^ B) ^ 139393779845720L, L[4])).booleanValue();
    }

    private final boolean Fq(long j2) {
        return ((Boolean) k.E(this, (B ^ j2) ^ 26132859436864L, L[5])).booleanValue();
    }

    private final boolean F2(long j2) {
        long j3 = B ^ j2;
        return ((Boolean) I.E(this, j3 ^ 104393592206163L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20598, 9092855884762177912L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean Fj(long j2) {
        long j3 = B ^ j2;
        return ((Boolean) m.E(this, j3 ^ 109549204934773L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4491, 665518726488114054L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean p(short s, long j2) {
        long j3 = ((((long) s) << 48) | ((j2 << 16) >>> 16)) ^ B;
        return ((Boolean) V.E(this, j3 ^ 106378706584588L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9603, 5292031412762567669L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean z(int i2, short s, char c2) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ B;
        return ((Boolean) i.E(this, j2 ^ 8363110032266L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1580, 954408839600842701L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean Z(int i2, long j2) {
        long j3 = ((((long) i2) << 32) | ((j2 << 32) >>> 32)) ^ B;
        return ((Boolean) T.E(this, j3 ^ 73369957163908L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15519, 6533849920166075763L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final float a(long j2) {
        long j3 = B ^ j2;
        return ((Number) X.E(this, j3 ^ 47079298720636L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18126, 4829097000148527083L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float F3(long j2, char c2) {
        long j3 = ((j2 << 16) | ((((long) c2) << 48) >>> 48)) ^ B;
        return ((Number) S.E(this, j3 ^ 26765039215349L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27191, 2426508716606032513L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float FL(short s, int i2, char c2) {
        long j2 = (((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c2) << 48) >>> 48)) ^ B;
        return ((Number) h.E(this, j2 ^ 65507352734149L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21865, 1093048644584210137L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final float T(long j2) {
        long j3 = B ^ j2;
        return ((Number) A.E(this, j3 ^ 11546290176319L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27085, 4264795071525972611L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float FW(long j2) {
        long j3 = B ^ j2;
        return ((Number) e.E(this, j3 ^ 120919105194194L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18317, 605084364544199981L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float W(long j2) {
        long j3 = B ^ j2;
        return ((Number) D.E(this, j3 ^ 84144892804007L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1424, 2809836355966942276L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float FS(int i2, int i3) {
        long j2 = ((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ B;
        return ((Number) F.E(this, j2 ^ 88467399280139L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27217, 6779659670616485380L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final float B(long j2) {
        long j3 = B ^ j2;
        return ((Number) y.E(this, j3 ^ 86120147729810L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5304, 6705039083228490594L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float F(long j2) {
        long j3 = B ^ j2;
        return ((Number) x.E(this, j3 ^ 41083431675849L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30279, 6428653983350346738L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float i(long j2) {
        long j3 = B ^ j2;
        return ((Number) t.E(this, j3 ^ 45538622383835L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21503, 5400312914226624349L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float h(long j2) {
        long j3 = B ^ j2;
        return ((Number) u.E(this, j3 ^ 88927666362436L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8715, 5948570889790404616L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float L(long j2) {
        long j3 = B ^ j2;
        return ((Number) a.E(this, j3 ^ 43199603767506L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6524, 8212925386139575234L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float R(long j2) {
        long j3 = B ^ j2;
        return ((Number) W.E(this, j3 ^ 88775236122650L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8675, 4772997246775892879L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float e(long j2) {
        long j3 = B ^ j2;
        return ((Number) J.E(this, j3 ^ 80918046805184L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27007, 1001065250064541640L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float Q(long j2) {
        long j3 = B ^ j2;
        return ((Number) o.E(this, j3 ^ 55674484466750L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29417, 4822504282383652020L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float j(long j2) {
        long j3 = B ^ j2;
        return ((Number) c.E(this, j3 ^ 23256042663131L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9015, 4838751834586320294L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float Y(long j2) {
        long j3 = B ^ j2;
        return ((Number) C.E(this, j3 ^ 17976291473822L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(475, 6871562746918926884L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float x(long j2) {
        long j3 = B ^ j2;
        return ((Number) N.E(this, j3 ^ 23386034781698L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3712, 8231970817649242866L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float n(long j2) {
        long j3 = B ^ j2;
        return ((Number) n.E(this, j3 ^ 76907750212130L, L[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9870, 1752059043916883672L ^ j3) /* invoke-custom */])).floatValue();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:162:0x03b8
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow(priority = -10)
    private final void w(su.catlean.api.event.events.player.PlayerUpdateEvent r14) {
        /*
            Method dump skipped, instruction units count: 1107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.w(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x01f2: INVOKE (r-1 I:su.catlean.uy), (r0 I:boolean), (r1 I:long), (r2 I:boolean) VIRTUAL call: su.catlean.uy.k(boolean, long, boolean):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void G(long r11) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.G(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [su.catlean.ul] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void R(long r9, int r11) {
        /*
            r8 = this;
            long r0 = su.catlean.ul.B
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 38298261652374(0x22d502480396, double:1.8921855377877E-310)
            long r1 = r1 ^ r2
            r12 = r1
            r1 = r0; r2 = r0; 
            r2 = 78444524643743(0x47584a06a59f, double:3.87567447308205E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r0 = -7224012202259727507(0x9bbf272d2f38bb6d, double:-4.920201287520383E-175)
            r1 = r9
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            su.catlean._n r1 = su.catlean._n.e
            r2 = 1
            r1.m(r2)
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L6f
            r0 = r11
            r1 = 16500(0x4074, float:2.3121E-41)
            r2 = 468847621625337087(0x681ae6d84c3d4ff, double:2.4936163391429995E-277)
            r3 = r9
            long r2 = r2 ^ r3
            int r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ul;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "x"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r1, r2)     // Catch: java.lang.NumberFormatException -> L41 java.lang.NumberFormatException -> L65
            if (r0 < r1) goto L7a
            goto L4b
        L41:
            r1 = -7343969141856734821(0x9a14faf9ba32f19b, double:-4.937599390493895E-183)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L65
            throw r0     // Catch: java.lang.NumberFormatException -> L65
        L4b:
            r0 = r8
            r1 = r11
            r2 = 16823(0x41b7, float:2.3574E-41)
            r3 = 4081119021104059648(0x38a30c2082ff5500, double:7.164824676317238E-36)
            r4 = r9
            long r3 = r3 ^ r4
            int r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ul;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "x"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r2, r3)     // Catch: java.lang.NumberFormatException -> L65
            int r1 = r1 - r2
            r2 = r14
            r3 = r2; r2 = r1; r1 = r3;      // Catch: java.lang.NumberFormatException -> L65
            r0.F(r1, r2)     // Catch: java.lang.NumberFormatException -> L65
            goto L6f
        L65:
            r1 = -7343969141856734821(0x9a14faf9ba32f19b, double:-4.937599390493895E-183)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6f:
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L95
            r0 = r16
            if (r0 != 0) goto L8e
        L7a:
            r0 = r8
            r1 = r11
            r2 = r12
            r0.x(r1, r2)     // Catch: java.lang.NumberFormatException -> L84
            goto L8e
        L84:
            r1 = -7343969141856734821(0x9a14faf9ba32f19b, double:-4.937599390493895E-183)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8e:
            su.catlean._n r0 = su.catlean._n.e
            r1 = 0
            r0.m(r1)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.R(long, int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x010d: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void x(int r14, long r15) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.x(int, long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00a4: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void F(long r9, int r11) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.F(long, int):void");
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
    private final void p(su.catlean.api.event.events.world.FireWorkVelocityEvent r14) {
        /*
            Method dump skipped, instruction units count: 805
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.p(su.catlean.api.event.events.world.FireWorkVelocityEvent):void");
    }

    @Flow
    private final void Y(SetPoseEvent setPoseEvent) {
        setPoseEvent.cancel();
        setPoseEvent.setPose(class_4050.field_18076);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:63:0x013e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void H(su.catlean.api.event.events.network.ReceivePacket r9) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.H(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x006e: INVOKE (r-1 I:su.catlean.u2), (r0 I:long), (r1 I:net.minecraft.class_2824) VIRTUAL call: su.catlean.u2.E(long, net.minecraft.class_2824):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void e(su.catlean.api.event.events.network.SendPacket r9) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.e(su.catlean.api.event.events.network.SendPacket):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00d7: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_1799), (r1 I:net.minecraft.class_5321) STATIC call: su.catlean.lq.v(long, net.minecraft.class_1799, net.minecraft.class_5321):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final boolean K(byte r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.K(byte, int, int):boolean");
    }

    private final void I(long j2) {
        long j3 = B ^ j2;
        long j4 = j3 ^ 101688626710235L;
        int i2 = (int) (j3 >>> 32);
        int i3 = (int) (((j3 ^ 107685531764738L) << 32) >>> 32);
        long j5 = j3 ^ 40413133893643L;
        long j6 = j3 >>> 16;
        int i4 = (int) (((j3 ^ 45982701153532L) << 48) >>> 48);
        long j7 = j3 ^ 64895927226166L;
        long j8 = j3 ^ 132068723475145L;
        long j9 = j3 ^ 3466842368567L;
        long j10 = j3 ^ 140561376277403L;
        long j11 = j3 ^ 137447883617710L;
        long j12 = j3 ^ 106893387183635L;
        long j13 = j3 ^ 128058427640875L;
        long j14 = j3 ^ 40283272094418L;
        long j15 = j3 ^ 27416376371410L;
        long j16 = j3 ^ 11070417381324L;
        int i5 = (int) (j3 >>> 48);
        int i6 = (int) ((j16 << 16) >>> 32);
        int i7 = (int) ((j16 << 48) >>> 48);
        long j17 = j3 ^ 22921928976832L;
        long j18 = j3 ^ 37232941561751L;
        long j19 = j3 ^ 30047974370677L;
        long j20 = j3 ^ 107084335027789L;
        long j21 = j3 ^ 25081120011995L;
        Pair[] pairArr = new Pair[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3426, 7106619489829404209L ^ j3) /* invoke-custom */];
        pairArr[0] = TuplesKt.to(Float.valueOf(0.0f), Float.valueOf(a(j19)));
        pairArr[1] = TuplesKt.to(Float.valueOf(5.0f), Float.valueOf(F3(j6, (char) i4)));
        pairArr[2] = TuplesKt.to(Float.valueOf(10.0f), Float.valueOf(FL((short) i5, i6, (char) i7)));
        pairArr[3] = TuplesKt.to(Float.valueOf(15.0f), Float.valueOf(T(j7)));
        pairArr[4] = TuplesKt.to(Float.valueOf(20.0f), Float.valueOf(FW(j4)));
        pairArr[5] = TuplesKt.to(Float.valueOf(25.0f), Float.valueOf(W(j11)));
        pairArr[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20598, 9092848263592207130L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(30.0f), Float.valueOf(FS(i2, i3)));
        pairArr[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20597, 5014975053231612703L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(35.0f), Float.valueOf(B(j10)));
        pairArr[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3065, 5967004360406710418L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(40.0f), Float.valueOf(F(j17)));
        pairArr[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6463, 5715695031148358219L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(45.0f), Float.valueOf(i(j15)));
        pairArr[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25340, 5967494171316572546L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(50.0f), Float.valueOf(h(j20)));
        pairArr[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7819, 2204971269756857829L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(55.0f), Float.valueOf(L(j21)));
        pairArr[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2735, 8459309029714180602L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(60.0f), Float.valueOf(R(j12)));
        pairArr[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14626, 7548917974425274955L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(65.0f), Float.valueOf(e(j8)));
        pairArr[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27085, 4264862557216037517L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(70.0f), Float.valueOf(Q(j9)));
        pairArr[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16798, 1113399453526618826L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(75.0f), Float.valueOf(j(j14)));
        pairArr[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12655, 8215232658355651104L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(80.0f), Float.valueOf(Y(j18)));
        pairArr[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7929, 5341433210756705703L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(85.0f), Float.valueOf(x(j5)));
        pairArr[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28000, 5811637179582471722L ^ j3) /* invoke-custom */] = TuplesKt.to(Float.valueOf(90.0f), Float.valueOf(n(j13)));
        d = MapsKt.hashMapOf(pairArr);
    }

    private static final boolean F4() {
        return b.v((B ^ 97175515240533L) ^ 110215242566268L);
    }

    private static final boolean F1() {
        return b.Fj((B ^ 114300837028207L) ^ 75412837121310L);
    }

    private static final boolean FR() {
        long j2 = B ^ 119847325891102L;
        long j3 = j2 ^ 46573276845456L;
        return b.z((int) (j2 >>> 32), (short) ((j3 << 32) >>> 48), (char) ((j3 << 48) >>> 48));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
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
            long r0 = su.catlean.ul.B
            r1 = 116728615158727(0x6a29ffa443c7, double:5.7671598636551E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 49969552845897(0x2d7271726c49, double:2.46882393992064E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 114707964521543(0x6853877a6c47, double:5.6673264574471E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = 9056590350036721021(0x7daf78f0822b5d7d, double:2.5728583356951184E297)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = 8936449135035357067(0x7c04a5241721178b, double:2.5149100793160515E289)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = 8936449135035357067(0x7c04a5241721178b, double:2.5149100793160515E289)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = 8936449135035357067(0x7c04a5241721178b, double:2.5149100793160515E289)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.g():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean Fn() {
        /*
            long r0 = su.catlean.ul.B
            r1 = 58778939143906(0x357589c9b6e2, double:2.9040654529997E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 125542013573484(0x722e071f996c, double:6.2025996016394E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 60541608892770(0x370ff1179962, double:2.99115290978746E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = -8608024113979152296(0x888a27acf446a858, double:-1.5842667318461727E-267)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = -8565289621346524498(0x8921fa78614ce2ae, double:-1.1151283144523607E-264)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = -8565289621346524498(0x8921fa78614ce2ae, double:-1.1151283144523607E-264)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = -8565289621346524498(0x8921fa78614ce2ae, double:-1.1151283144523607E-264)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.Fn():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean Fm() {
        /*
            long r0 = su.catlean.ul.B
            r1 = 98014056452712(0x5924ad049268, double:4.84253781028296E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 33531410693606(0x1e7f23d2bde6, double:1.65667180803045E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 100462872935912(0x5b5ed5dabde8, double:4.96352542001485E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = -6052754345688331054(0xac004bfdd08b8cd2, double:-9.537067278397733E-97)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = -5932482980126538204(0xadab96294581c624, double:-1.083400296264876E-88)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = -5932482980126538204(0xadab96294581c624, double:-1.083400296264876E-88)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = -5932482980126538204(0xadab96294581c624, double:-1.083400296264876E-88)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.Fm():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
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
            long r0 = su.catlean.ul.B
            r1 = 16668745202003(0xf28fea2f953, double:8.235454363591E-311)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 79660645144285(0x48737074d6dd, double:3.93575880913415E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 14648094807763(0xd52867cd6d3, double:7.237120421541E-311)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = -4090642913410816023(0xc73b1df1832de7e9, double:-1.407993396441453E35)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = -4138596792035463905(0xc690c0251627ad1f, double:-8.493545964756568E31)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = -4138596792035463905(0xc690c0251627ad1f, double:-8.493545964756568E31)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = -4138596792035463905(0xc690c0251627ad1f, double:-8.493545964756568E31)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.V():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
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
            long r0 = su.catlean.ul.B
            r1 = 79881054114683(0x48a6c1dad37b, double:3.94664845916504E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 17580627393781(0xffd4f0cfcf5, double:8.6859840276027E-311)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 82311857372411(0x4adcb904fcfb, double:4.0667460973093E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = -1363646757496042047(0xed135a7fbc55cdc1, double:-2.6686810002655897E217)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = -1389211315840514249(0xecb887ab295f8737, double:-5.285105640475441E215)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = -1389211315840514249(0xecb887ab295f8737, double:-5.285105640475441E215)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = -1389211315840514249(0xecb887ab295f8737, double:-5.285105640475441E215)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.Fg():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean w() {
        /*
            long r0 = su.catlean.ul.B
            r1 = 101328950508176(0x5c287c19ba90, double:5.00631533752377E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 30184808879390(0x1b73f2cf951e, double:1.49132770935904E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 103706360517904(0x5e5204c79510, double:5.12377499871234E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = -8865249069458086870(0x84f84ef10196a42a, double:-1.0216916845504464E-284)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = -8839559853981765924(0x85539325949ceedc, double:-5.265519731920122E-283)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = -8839559853981765924(0x85539325949ceedc, double:-5.265519731920122E-283)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = -8839559853981765924(0x85539325949ceedc, double:-5.265519731920122E-283)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.w():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean Fl() {
        /*
            long r0 = su.catlean.ul.B
            r1 = 15762355824167(0xe55f59ea627, double:7.7876385102466E-311)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 80326546721193(0x490e7b4889a9, double:3.96865871840033E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 13398372813223(0xc2f8d4089a7, double:6.619675717187E-311)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = -7471721866880501603(0x984f1c8c8811b89d, double:-1.3638103790615839E-191)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = -7357543307026894229(0x99e4c1581d1bf26b, double:-6.105772840338195E-184)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = -7357543307026894229(0x99e4c1581d1bf26b, double:-6.105772840338195E-184)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = -7357543307026894229(0x99e4c1581d1bf26b, double:-6.105772840338195E-184)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.Fl():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean FZ() {
        /*
            long r0 = su.catlean.ul.B
            r1 = 78446795986931(0x4758d16897f3, double:3.87578669234596E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 14491236477(0x35fbeb87d, double:7.159622109E-314)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 76015178528883(0x4522a9b6b873, double:3.755648827361E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = -6225288044469581495(0xa99b5581ace78949, double:-2.9096779147403043E-108)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = -6327407576830065729(0xa830885539edc3bf, double:-4.195865146431753E-115)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = -6327407576830065729(0xa830885539edc3bf, double:-4.195865146431753E-115)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = -6327407576830065729(0xa830885539edc3bf, double:-4.195865146431753E-115)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.FZ():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean r() {
        /*
            long r0 = su.catlean.ul.B
            r1 = 84707962387479(0x4d0a9c01fc17, double:4.1851294144866E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 11343324763033(0xa5112d7d399, double:5.604347075035E-311)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 87346294805399(0x4f70e4dfd397, double:4.31548035548694E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = -4431718144682302803(0xc27f5fd3e18ee2ad, double:-2.1560273205581672E12)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = -4335697572719712165(0xc3d482077484a85b, double:-5.911007299016682E18)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = -4335697572719712165(0xc3d482077484a85b, double:-5.911007299016682E18)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = -4335697572719712165(0xc3d482077484a85b, double:-5.911007299016682E18)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.r():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean A() {
        /*
            long r0 = su.catlean.ul.B
            r1 = 65993977708723(0x3c056b9940b3, double:3.2605357218293E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 135647504330557(0x7b5ee54f6f3d, double:6.701877183383E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 68715505217331(0x3e7f13476f33, double:3.3949970464508E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = 9140951391476801033(0x7edb2edc16165e09, double:1.1650746996309694E303)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = 9183106858093384959(0x7f70f308831c14ff, double:7.438898359773951E305)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = 9183106858093384959(0x7f70f308831c14ff, double:7.438898359773951E305)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = 9183106858093384959(0x7f70f308831c14ff, double:7.438898359773951E305)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.A():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
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
            long r0 = su.catlean.ul.B
            r1 = 1467025051169(0x1559181ce21, double:7.24806679371E-312)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 77026469339567(0x460e1f57e1af, double:3.8056132321124E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 3504313721249(0x32fe95fe1a1, double:1.731361021919E-311)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = -1132352335330226021(0xf049138cec0ed09b, double:-7.786303328057642E232)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = -1017023686449522067(0xf1e2ce5879049a6d, double:-3.918716543325117E240)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = -1017023686449522067(0xf1e2ce5879049a6d, double:-3.918716543325117E240)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = -1017023686449522067(0xf1e2ce5879049a6d, double:-3.918716543325117E240)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.E():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean FA() {
        /*
            long r0 = su.catlean.ul.B
            r1 = 119837330151027(0x6cfdcd7e9673, double:5.9207507916958E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 47993099696637(0x2ba643a8b9fd, double:2.37117417975423E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 121529146849779(0x6e87b5a0b9f3, double:6.0043376426872E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = -6333329754913929015(0xa81b7e24b0f188c9, double:-1.744374843886507E-115)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = -6219290833573920193(0xa9b0a3f025fbc23f, double:-7.085408306163337E-108)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = -6219290833573920193(0xa9b0a3f025fbc23f, double:-7.085408306163337E-108)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = -6219290833573920193(0xa9b0a3f025fbc23f, double:-7.085408306163337E-108)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.FA():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean M() {
        /*
            long r0 = su.catlean.ul.B
            r1 = 98699075532771(0x59c42b5637e3, double:4.87638224970325E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 33671025268845(0x1e9fa580186d, double:1.6635696845589E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 100873003341923(0x5bbe53881863, double:4.98378855440734E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = 687725957487339865(0x98b4b1d56d92959, double:1.0834570392578444E-262)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = 585633744876168111(0x82096c9c3d363af, double:1.5700537494741912E-269)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = 585633744876168111(0x82096c9c3d363af, double:1.5700537494741912E-269)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = 585633744876168111(0x82096c9c3d363af, double:1.5700537494741912E-269)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.M():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
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
            long r0 = su.catlean.ul.B
            r1 = 95881642428650(0x57342f3cc8ea, double:4.73718255908304E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 18071643940708(0x106fa1eae764, double:8.928578434979E-311)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 93794970298218(0x554e57e2e76a, double:4.63408725770496E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = -683907307809810864(0xf68245ed52b3d650, double:-7.192497356936864E262)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = -636810498364826458(0xf7299839c7b99ca6, double:-1.0316088813813336E266)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = -636810498364826458(0xf7299839c7b99ca6, double:-1.0316088813813336E266)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = -636810498364826458(0xf7299839c7b99ca6, double:-1.0316088813813336E266)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.FH():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean P() {
        /*
            long r0 = su.catlean.ul.B
            r1 = 88747926859714(0x50b73ca7afc2, double:4.38473018010163E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 26305373503564(0x17ecb271804c, double:1.29965813491336E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 91041570586690(0x52cd44798042, double:4.49805123703144E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = -7950469150862167688(0x91aa426e4128b178, double:-1.4188601709178188E-223)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = -8069993432499422322(0x90019fbad422fb8e, double:-1.4189806077378828E-231)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = -8069993432499422322(0x90019fbad422fb8e, double:-1.4189806077378828E-231)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = -8069993432499422322(0x90019fbad422fb8e, double:-1.4189806077378828E-231)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.P():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean C() {
        /*
            long r0 = su.catlean.ul.B
            r1 = 86919823663735(0x4f0d9936a277, double:4.29440988148305E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 9165860802041(0x85617e08df9, double:4.5285369368514E-311)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 85177286561271(0x4d77e1e88df7, double:4.20831710958993E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = -7196930510562935603(0x9c1f5dd4e4b9bccd, double:-3.1705089183907436E-173)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = -7082895574550972869(0x9db4800071b3f63b, double:-1.3905813424249678E-165)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = -7082895574550972869(0x9db4800071b3f63b, double:-1.3905813424249678E-165)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = -7082895574550972869(0x9db4800071b3f63b, double:-1.3905813424249678E-165)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.C():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean FE() {
        /*
            long r0 = su.catlean.ul.B
            r1 = 79489402089555(0x484b91933053, double:3.92729827809105E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 16561918517213(0xf101f451fdd, double:8.182674968577E-311)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 81578227998675(0x4a31e94d1fd3, double:4.030499990275E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = 1025512927229914857(0xe3b5a92ec1c2ee9, double:4.1022413241309313E-240)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = 1121545043964224543(0xf9087467916641f, double:1.0396680296614982E-233)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = 1121545043964224543(0xf9087467916641f, double:1.0396680296614982E-233)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = 1121545043964224543(0xf9087467916641f, double:1.0396680296614982E-233)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.FE():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean s() {
        /*
            long r0 = su.catlean.ul.B
            r1 = 110852267043386(0x64d1cdffea3a, double:5.4768296909757E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 39076739270068(0x238a4329c5b4, double:1.9306474424836E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 112887664330170(0x66abb521c5ba, double:5.57739167847953E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = -3147323409886546816(0xd4527608b070f480, double:-1.577304255004883E98)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = -3028200312419991946(0xd5f9abdc257abe76, double:-1.4719288762378709E106)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = -3028200312419991946(0xd5f9abdc257abe76, double:-1.4719288762378709E106)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = -3028200312419991946(0xd5f9abdc257abe76, double:-1.4719288762378709E106)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.s():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
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
            long r0 = su.catlean.ul.B
            r1 = 38488108907887(0x2301360f3d6f, double:1.90156523847834E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 110340811068129(0x645ab8d912e1, double:5.4515604083022E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 36813487018735(0x217b4ed112ef, double:1.81882792395797E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            r14 = r2
            r0 = 218197912000144341(0x30731d84b8023d5, double:4.5396579282085454E-294)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L61
            r1 = r10
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L61
            r3 = r12
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = r0.z(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L61
            r1 = r16
            if (r1 == 0) goto L82
            if (r0 == 0) goto L9b
            goto L6b
        L61:
            r1 = 192788424087464227(0x2acec0cde8a6923, double:8.844711356434225E-296)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L6b:
            su.catlean.ul r0 = su.catlean.ul.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r13
            r2 = r14
            boolean r0 = r0.Z(r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            goto L82
        L78:
            r1 = 192788424087464227(0x2acec0cde8a6923, double:8.844711356434225E-296)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r1 = r16
            if (r1 == 0) goto L98
            if (r0 == 0) goto L9b
            goto L97
        L8d:
            r1 = 192788424087464227(0x2acec0cde8a6923, double:8.844711356434225E-296)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L97:
            r0 = 1
        L98:
            goto L9c
        L9b:
            r0 = 0
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.H():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [net.minecraft.class_304] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    private static final void D() {
        long j2 = B ^ 69156294090790L;
        Object obj = j2;
        long j3 = obj ^ 93811637355095L;
        try {
            if (bx.k((short) (obj >>> 48), (int) (((obj ^ 78111932275837L) << 16) >>> 32), (char) ((r1 << 48) >>> 48), (int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(81, 6787303537235644681L ^ j2) /* invoke-custom */)) {
                return;
            }
            obj = zf.F(j3).field_1690.field_1903;
            obj.method_23481(false);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -2313176853292862358L, j2) /* invoke-custom */;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 22452;
        if (O[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) U.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    U.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                O[i3] = b(((Cipher) objArr[0]).doFinal(E[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/ul", e2);
            }
        }
        return O[i3];
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
            r-1 = r-1[r0]
            r0 = r10
            int r0 = r0.parameterCount()
            java.lang.invoke.MethodHandle r-2 = r-2.asCollector(r-1, r0)
            r-1 = 0
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r8
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r11
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = r9
            r1[r2] = r3
            java.lang.invoke.MethodHandle r-2 = java.lang.invoke.MethodHandles.insertArguments(r-2, r-1, r0)
            r-1 = r10
            java.lang.invoke.MethodHandle r-2 = java.lang.invoke.MethodHandles.explicitCastArguments(r-2, r-1)
            r-3.setTarget(r-2)
            goto L62
            r12 = r-4
            java.lang.RuntimeException r-4 = new java.lang.RuntimeException
            r-3 = r-4
            java.lang.StringBuilder r-2 = new java.lang.StringBuilder
            r-1 = r-2
            r-1.<init>()
            java.lang.String r-1 = "su/catlean/ul"
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-1 = " : "
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            r-1 = r9
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-1 = " : "
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            r-1 = r10
            r-1.toString()
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-2 = r-2.toString()
            r-1 = r12
            r-3.<init>(r-2, r-1)
            throw r-4
            r-3 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 3688;
        if (fb[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) ab[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) gb.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    gb.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/ul", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            fb[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return fb[i3].intValue();
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
            r-1 = r-1[r0]
            r0 = r10
            int r0 = r0.parameterCount()
            java.lang.invoke.MethodHandle r-2 = r-2.asCollector(r-1, r0)
            r-1 = 0
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r8
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r11
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = r9
            r1[r2] = r3
            java.lang.invoke.MethodHandle r-2 = java.lang.invoke.MethodHandles.insertArguments(r-2, r-1, r0)
            r-1 = r10
            java.lang.invoke.MethodHandle r-2 = java.lang.invoke.MethodHandles.explicitCastArguments(r-2, r-1)
            r-3.setTarget(r-2)
            goto L62
            r12 = r-4
            java.lang.RuntimeException r-4 = new java.lang.RuntimeException
            r-3 = r-4
            java.lang.StringBuilder r-2 = new java.lang.StringBuilder
            r-1 = r-2
            r-1.<init>()
            java.lang.String r-1 = "su/catlean/ul"
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-1 = " : "
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            r-1 = r9
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-1 = " : "
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            r-1 = r10
            r-1.toString()
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-2 = r-2.toString()
            r-1 = r12
            r-3.<init>(r-2, r-1)
            throw r-4
            r-3 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ul.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
