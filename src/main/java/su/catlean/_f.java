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
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_f.class */
public final class _f extends _g {

    @NotNull
    public static final _f U = null;
    static final KProperty[] B = null;

    @NotNull
    private static final cq c = null;

    @NotNull
    private static final c8 I = null;

    @NotNull
    private static final ct K = null;

    @NotNull
    private static final ct l = null;

    @NotNull
    private static final c8 w = null;

    @NotNull
    private static final cq P = null;

    @NotNull
    private static final ct m = null;

    @NotNull
    private static final c8 i = null;

    @NotNull
    private static final c8 d = null;

    @NotNull
    private static final c8 y = null;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] e = null;
    private static final Map f = null;
    private static final long[] g = null;
    private static final Integer[] h = null;
    private static final Map j = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private _f(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31658, 5056583185653765538L ^ j3) /* invoke-custom */, jt.c(), null, 4, null, j3 ^ 39723996894539L);
    }

    private final boolean G(long j2) {
        return ((Boolean) c.E(this, (a ^ j2) ^ 97656702248356L, B[0])).booleanValue();
    }

    private final int C(short s, long j2) {
        return ((Number) I.E(this, (((((long) s) << 48) | ((j2 << 16) >>> 16)) ^ a) ^ 1533511107099L, B[1])).intValue();
    }

    private final float V(int i2, short s, short s2) {
        return ((Number) K.E(this, ((((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ a) ^ 43074350830724L, B[2])).floatValue();
    }

    private final float Y(long j2) {
        return ((Number) l.E(this, (a ^ j2) ^ 71892701662641L, B[3])).floatValue();
    }

    private final int L(long j2) {
        return ((Number) w.E(this, (a ^ j2) ^ 87468708589776L, B[4])).intValue();
    }

    private final boolean z(long j2) {
        return ((Boolean) P.E(this, (a ^ j2) ^ 87960443074939L, B[5])).booleanValue();
    }

    private final float W(long j2) {
        long j3 = a ^ j2;
        return ((Number) m.E(this, j3 ^ 34525140221574L, B[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30838, 2097028989919749107L ^ j3) /* invoke-custom */])).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    public final int e(long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 2378000892005L;
        Object objIntValue = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3636053042939604636L, j3) /* invoke-custom */;
        try {
            objIntValue = ((Number) i.E(this, j4, B[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4539, 8527495913182491866L ^ j3) /* invoke-custom */])).intValue();
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3661195245162277983L, j3) /* invoke-custom */ != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[3], -3619447028670930686L, j3) /* invoke-custom */;
            }
            return objIntValue;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objIntValue, -3638877783304251699L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    public final int H(long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 94510498671608L;
        Object objIntValue = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6478583262677681415L, j3) /* invoke-custom */;
        try {
            objIntValue = ((Number) d.E(this, j4, B[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14196, 4100606785139816841L ^ j3) /* invoke-custom */])).intValue();
            if (objIntValue != 0) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[3], -6423360998858838810L, j3) /* invoke-custom */;
            }
            return objIntValue;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objIntValue, -6476936907929174704L, j3) /* invoke-custom */;
        }
    }

    private final int n(long j2) {
        long j3 = a ^ j2;
        return ((Number) y.E(this, j3 ^ 22798555662124L, B[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26244, 5380948677752276144L ^ j3) /* invoke-custom */])).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow
    private final void S(PlayerUpdateEvent playerUpdateEvent) throws Throwable {
        long j2 = a ^ 62384814750423L;
        long j3 = j2 ^ 8081653167538L;
        long j4 = j2 >>> 16;
        int i2 = (int) (((j2 ^ 29225026799945L) << 48) >>> 48);
        long j5 = j2 ^ 10700061473563L;
        long j6 = j2 ^ 14816371616070L;
        Object objF = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1253068527986314638L, j2) /* invoke-custom */;
        try {
            objF = _a.n.f(j6);
            if (objF == 0) {
                return;
            }
            class_2338 class_2338VarB = B(j4, (char) i2);
            if (objF != 0 || class_2338VarB == null) {
                return;
            }
            class_243 class_243VarMethod_46558 = class_2338VarB.method_10074().method_46558();
            Intrinsics.checkNotNullExpressionValue(class_243VarMethod_46558, (String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17417, 2343153396989051127L ^ j2) /* invoke-custom */);
            _8.P.O(j3, _w.W.I(class_243VarMethod_46558, j5).n(z3.FORCE), 0);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, -1254804201009383973L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, net.minecraft.class_243] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow(priority = -10)
    private final void q(MoveEvent moveEvent) throws Throwable {
        long j2 = a ^ 26805561343615L;
        int i2 = (int) (j2 >>> 56);
        long j3 = ((j2 ^ 50413832337585L) << 8) >>> 8;
        long j4 = j2 >>> 16;
        int i3 = (int) (((j2 ^ 64082054581729L) << 48) >>> 48);
        long j5 = j2 ^ 78920487800061L;
        long j6 = j2 ^ 25694572989184L;
        long j7 = j2 ^ 136602866233070L;
        int i4 = (int) (j2 >>> 48);
        int i5 = (int) ((j7 << 16) >>> 32);
        int i6 = (int) ((j7 << 48) >>> 48);
        long j8 = j2 ^ 50189039562222L;
        long j9 = j2 ^ 86400144767152L;
        Object objF = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3041077690848884442L, j2) /* invoke-custom */;
        try {
            objF = _a.n.f(j8);
            if (objF != 0) {
                return;
            }
            class_2338 class_2338VarB = B(j4, (char) i3);
            if (objF != 0 || class_2338VarB == null) {
                return;
            }
            class_243 class_243VarMethod_46558 = class_2338VarB.method_10074().method_46558();
            Intrinsics.checkNotNullExpressionValue(class_243VarMethod_46558, (String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19372, 974193850018499581L ^ j2) /* invoke-custom */);
            Object objMethod_1021 = class_243VarMethod_46558.method_1020(U.J((byte) i2, j3, (class_1297) zf.v(j9))).method_1029().method_1021(Math.min(U.p((char) i4, i5, (char) i6), class_243VarMethod_46558.method_1022(U.J((byte) i2, j3, (class_1297) zf.v(j9)))));
            Intrinsics.checkNotNullExpressionValue(objMethod_1021, (String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27874, 6904470290088176818L ^ j2) /* invoke-custom */);
            try {
                try {
                    moveEvent.setX(((class_243) objMethod_1021).field_1352);
                    moveEvent.setZ(((class_243) objMethod_1021).field_1350);
                    moveEvent.cancel();
                    if (objF == 0) {
                        objMethod_1021 = U.z(j6);
                        if (objMethod_1021 != 0) {
                            tq.I.x(U.W(j5));
                        }
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_1021, 3043917565603885427L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_1021, 3043917565603885427L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, 3043917565603885427L, j2) /* invoke-custom */;
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
    private final net.minecraft.class_2338 B(long r10, char r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._f.B(long, char):net.minecraft.class_2338");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [double] */
    /* JADX WARN: Type inference failed for: r0v6, types: [long] */
    private final double p(char c2, int i2, char c3) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c3) << 48) >>> 48)) ^ a;
        Object objY = j2;
        long j3 = objY ^ 114557374995889L;
        int i3 = (int) (objY >>> 32);
        int i4 = (int) ((j3 << 32) >>> 48);
        int i5 = (int) ((j3 << 48) >>> 48);
        long j4 = objY ^ 15941344953476L;
        try {
            if (dm.h.K() >= L(objY ^ 618836539877L) * (int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13939, 8503759065420173290L ^ j2) /* invoke-custom */) {
                return 0.2873d * ((double) V(i3, (short) i4, (short) i5));
            }
            objY = 0.2873d * ((double) Y(j4));
            return objY;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objY, 1256571756797364797L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean s() {
        long j2 = a ^ 51691368819168L;
        long j3 = j2 ^ 29446187055729L;
        Object objF = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4443684414214545733L, j2) /* invoke-custom */;
        try {
            objF = _a.n.f(j3);
            return objF == 0 ? objF == 0 : objF;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, 4440863162303981292L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean j() {
        long j2 = a ^ 52876228246077L;
        long j3 = j2 ^ 6406361377196L;
        Object objF = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3347929868658717336L, j2) /* invoke-custom */;
        try {
            objF = _a.n.f(j3);
            return objF == 0 ? objF == 0 : objF;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, 3349555040697136433L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean M() {
        long j2 = a ^ 92927103417308L;
        long j3 = j2 ^ 106931445622861L;
        Object objF = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3429307400230974329L, j2) /* invoke-custom */;
        try {
            objF = _a.n.f(j3);
            return objF == 0 ? objF == 0 : objF;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, 3431010655915685072L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean T() {
        long j2 = a ^ 55384610253419L;
        long j3 = j2 ^ 8364720191994L;
        Object objF = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4476646414924554958L, j2) /* invoke-custom */;
        try {
            objF = _a.n.f(j3);
            return objF == 0 ? objF == 0 : objF;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, 4479393707565983079L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean l() {
        /*
            long r0 = su.catlean._f.a
            r1 = 10025901526357(0x91e564c8d55, double:4.9534535127603E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 6738977749034(0x6210a5ff82a, double:3.3294973938863E-311)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 66911201484484(0x3cdafa655ec4, double:3.30585259754454E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -7413481943635655184(0x991e057358d305f0, double:-1.0780827148580766E-187)
            r1 = r7
            int[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[I}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean._f r0 = su.catlean._f.U     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.z(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 != 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = -7416237156062035367(0x99143b9976de8259, double:-7.265724507247283E-188)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean._a r0 = su.catlean._a.n     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.f(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = -7416237156062035367(0x99143b9976de8259, double:-7.265724507247283E-188)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 != 0) goto L69
            if (r0 != 0) goto L6c
            goto L68
        L5e:
            r1 = -7416237156062035367(0x99143b9976de8259, double:-7.265724507247283E-188)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._f.l():boolean");
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 27527;
        if (e[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                e[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/_f", e2);
            }
        }
        return e[i3];
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
            java.lang.String r1 = "su/catlean/_f"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._f.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 10510;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) j.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/_f", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            h[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return h[i3].intValue();
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
            java.lang.String r1 = "su/catlean/_f"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._f.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
