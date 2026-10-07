package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_2797;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import su.catlean.api.event.events.network.PlayerEntityDeathEvent;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.world.EntitySpawn;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/q1.class */
public final class q1 extends _g {

    @NotNull
    public static final q1 W;
    static final KProperty[] f;

    @NotNull
    private static final cq e;

    @NotNull
    private static final cq E;

    @NotNull
    private static final cq Y;

    @NotNull
    private static final cq u;

    @NotNull
    private static final cq S;

    @NotNull
    private static final cq K;

    @NotNull
    private static final cq y;

    @NotNull
    private static final c8 z;

    @NotNull
    private static final c8 g;

    @NotNull
    private static final cq a;

    @NotNull
    private static final cw l;

    @NotNull
    private static final cw B;

    @NotNull
    private static final cq h;

    @NotNull
    private static final cq j;

    @NotNull
    private static final cq V;

    @NotNull
    private static final cw A;

    @NotNull
    private static final cq F;

    @NotNull
    private static final cw L;

    @NotNull
    private static final bj D;

    @NotNull
    private static final bj T;

    @NotNull
    private static final bj k;

    @NotNull
    private static final bj i;

    @NotNull
    private static final bj N;

    @NotNull
    private static final bj X;

    @NotNull
    private static final bj U;

    @NotNull
    private static final bg x;

    @NotNull
    private static final bg C;

    @NotNull
    private static final bg w;

    @NotNull
    private static final bg o;

    @NotNull
    private static final bg G;

    @NotNull
    private static final bg I;

    @NotNull
    private static final bg b;

    @NotNull
    private static final bg P;

    @NotNull
    private static final bg O;

    @NotNull
    private static final List t;

    @NotNull
    private static final List J;

    @NotNull
    private static final ConcurrentHashMap m;
    private static boolean n;
    private static int d;
    private static final long c = yz.a(8727518763717427279L, 4851239753951672957L, MethodHandles.lookup().lookupClass()).a(144039010805440L);
    private static final String[] ab;
    private static final String[] fb;
    private static final Map gb;
    private static final long[] hb;
    private static final Integer[] lb;
    private static final Map mb;
    private static final long[] nb;
    private static final Long[] ob;
    private static final Map pb;

    /* JADX WARN: Illegal instructions before constructor call */
    private q1(long j2) {
        long j3 = c ^ j2;
        super((String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32403, 2592944197218072364L ^ j3) /* invoke-custom */, jt.d(), null, 4, null, j3 ^ 85161383924604L);
    }

    private final boolean e(long j2) {
        return ((Boolean) e.E(this, (c ^ j2) ^ 79586049581197L, f[0])).booleanValue();
    }

    private final boolean K(long j2) {
        return ((Boolean) E.E(this, (c ^ j2) ^ 21625262190037L, f[1])).booleanValue();
    }

    private final boolean T(int i2, char c2, short s) {
        return ((Boolean) Y.E(this, ((((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ c) ^ 82288888314370L, f[2])).booleanValue();
    }

    private final boolean h(long j2) {
        return ((Boolean) u.E(this, (c ^ j2) ^ 41701130169949L, f[3])).booleanValue();
    }

    private final boolean P(short s, char c2, int i2) {
        return ((Boolean) S.E(this, ((((((long) s) << 48) | ((((long) c2) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ c) ^ 85066600182154L, f[4])).booleanValue();
    }

    private final boolean i(long j2) {
        return ((Boolean) K.E(this, (c ^ j2) ^ 2245890338417L, f[5])).booleanValue();
    }

    private final boolean F(long j2) {
        long j3 = c ^ j2;
        return ((Boolean) y.E(this, j3 ^ 54745667232752L, f[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12215, 452639540378165570L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final int z(int i2, int i3) {
        long j2 = ((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ c;
        return ((Number) z.E(this, j2 ^ 59662334028152L, f[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16564, 8617226668456412369L ^ j2) /* invoke-custom */])).intValue();
    }

    private final int G(long j2, short s) {
        long j3 = ((j2 << 16) | ((((long) s) << 48) >>> 48)) ^ c;
        return ((Number) g.E(this, j3 ^ 28166047638310L, f[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1988, 4776436343069149687L ^ j3) /* invoke-custom */])).intValue();
    }

    private final boolean D(char c2, int i2, short s) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s) << 48) >>> 48)) ^ c;
        return ((Boolean) a.E(this, j2 ^ 21108061392198L, f[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7492, 3922189982443044139L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final cm Q(long j2) {
        long j3 = c ^ j2;
        return (cm) l.E(this, j3 ^ 134986547562536L, f[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16691, 3082030363039622146L ^ j3) /* invoke-custom */]);
    }

    private final cm g(long j2) {
        long j3 = c ^ j2;
        return (cm) B.E(this, j3 ^ 67506950911254L, f[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27905, 4147026316751271212L ^ j3) /* invoke-custom */]);
    }

    private final boolean r(long j2) {
        long j3 = c ^ j2;
        return ((Boolean) h.E(this, j3 ^ 19668409050673L, f[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9898, 6473342272829222298L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean W(long j2) {
        long j3 = c ^ j2;
        return ((Boolean) j.E(this, j3 ^ 29905213929702L, f[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10338, 2255768636736716174L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean q(long j2) {
        long j3 = c ^ j2;
        return ((Boolean) V.E(this, j3 ^ 117417389080738L, f[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24992, 6215432912772926478L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final cm Y(int i2, short s, short s2) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ c;
        return (cm) A.E(this, j2 ^ 106909430098488L, f[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1987, 7108341647297511641L ^ j2) /* invoke-custom */]);
    }

    private final boolean M(long j2) {
        long j3 = c ^ j2;
        return ((Boolean) F.E(this, j3 ^ 123424491730697L, f[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11471, 7762575345875187396L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final cm l(long j2) {
        long j3 = c ^ j2;
        return (cm) L.E(this, j3 ^ 104843879290239L, f[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14258, 6966570284840062940L ^ j3) /* invoke-custom */]);
    }

    @NotNull
    public final bg j() {
        return I;
    }

    public final boolean x() {
        return n;
    }

    public final void h(boolean z2) {
        n = z2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0148: INVOKE 
          (r-1 I:su.catlean.q1)
          (r0 I:net.minecraft.class_332)
          (r1 I:su.catlean.bj)
          (r2 I:su.catlean.bj)
          (r3 I:long)
          (r4 I:java.lang.String)
          (r5 I:java.lang.String)
         DIRECT call: su.catlean.q1.O(net.minecraft.class_332, su.catlean.bj, su.catlean.bj, long, java.lang.String, java.lang.String):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void G(su.catlean.api.event.events.render.Render2DEvent r19) {
        /*
            Method dump skipped, instruction units count: 1358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q1.G(su.catlean.api.event.events.render.Render2DEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.bg] */
    @Flow
    private final void D(SendPacket sendPacket) throws Exception {
        Object obj = c ^ 87070958388400L;
        try {
            if (sendPacket.getPacket() instanceof class_2797) {
                obj = b;
                obj.l();
            }
        } catch (NumberFormatException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -248115543230292320L, obj) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0322: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2561) STATIC call: su.catlean.r5.D(long, net.minecraft.class_2561):java.lang.String
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void a(su.catlean.api.event.events.network.ReceivePacket r16) {
        /*
            Method dump skipped, instruction units count: 3111
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q1.a(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15, types: [su.catlean._g] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [su.catlean.lp] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow
    private final void B(EntitySpawn entitySpawn) throws Exception {
        long j2 = c ^ 79508422081881L;
        long j3 = j2 ^ 23938895571507L;
        long j4 = j2 ^ 97406085167439L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j4 << 32) >>> 48);
        int i4 = (int) ((j4 << 48) >>> 48);
        long j5 = j2 ^ 72946233117535L;
        int i5 = (int) (j2 >>> 32);
        int i6 = (int) ((j5 << 32) >>> 48);
        int i7 = (int) ((j5 << 48) >>> 48);
        long j6 = j2 ^ 92979472862524L;
        long j7 = j2 ^ 55487187957423L;
        long j8 = j2 ^ 56224466376540L;
        long j9 = j2 ^ 88046114996738L;
        ?? T2 = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4959743510487046044L, j2) /* invoke-custom */;
        try {
            try {
                T2 = T(i5, (char) i6, (short) i7);
                ?? AreEqual = T2;
                if (T2 != 0) {
                    if (T2 == 0) {
                        return;
                    } else {
                        AreEqual = entitySpawn.getEntity() instanceof class_1657;
                    }
                }
                try {
                    if (T2 != 0) {
                        if (AreEqual == 0) {
                            return;
                        } else {
                            AreEqual = Intrinsics.areEqual(entitySpawn.getEntity(), zf.v(j8));
                        }
                    }
                    if (AreEqual == 0) {
                        q1 q1VarQ = this;
                        q1 q1Var = this;
                        String strH = (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12350, 8838497478537920108L ^ j2) /* invoke-custom */;
                        Object[] objArr = new Object[1];
                        try {
                            try {
                                String string = entitySpawn.getEntity().method_5477().getString();
                                Intrinsics.checkNotNullExpressionValue(string, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27089, 2899959802127050740L ^ j2) /* invoke-custom */);
                                objArr[0] = string;
                                o2.S(q1VarQ, o2.Z(i2, q1Var, strH, objArr, (char) i3, false, 4, null, (short) i4), false, 2, null, j3);
                                q1VarQ = P.q((int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29045, 7696020161052202057L ^ j2) /* invoke-custom */, j6);
                                ?? F2 = q1VarQ;
                                if (T2 != 0) {
                                    if (q1VarQ == 0) {
                                        return;
                                    } else {
                                        F2 = zf.v(j8).field_6012;
                                    }
                                }
                                try {
                                    if (T2 != 0) {
                                        try {
                                            if (F2 <= (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5533, 3690911378843480237L ^ j2) /* invoke-custom */) {
                                                return;
                                            } else {
                                                F2 = qm.k.f(j9);
                                            }
                                        } catch (NumberFormatException unused) {
                                            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F2, 5001110245344012105L, j2) /* invoke-custom */;
                                        }
                                    }
                                    if (F2 != 0) {
                                        try {
                                            F2 = d2.O.g();
                                            F2.L(j7);
                                        } catch (NumberFormatException unused2) {
                                            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F2, 5001110245344012105L, j2) /* invoke-custom */;
                                        }
                                    }
                                } catch (NumberFormatException unused3) {
                                    throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F2, 5001110245344012105L, j2) /* invoke-custom */;
                                }
                            } catch (NumberFormatException unused4) {
                                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(q1VarQ, 5001110245344012105L, j2) /* invoke-custom */;
                            }
                        } catch (NumberFormatException unused5) {
                            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(q1VarQ, 5001110245344012105L, j2) /* invoke-custom */;
                        }
                    }
                } catch (NumberFormatException unused6) {
                    throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(AreEqual, 5001110245344012105L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused7) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(T2, 5001110245344012105L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused8) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(T2, 5001110245344012105L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0304: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2561) STATIC call: su.catlean.r5.D(long, net.minecraft.class_2561):java.lang.String
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void C(su.catlean.api.event.events.world.EntityRemove r15) {
        /*
            Method dump skipped, instruction units count: 2394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q1.C(su.catlean.api.event.events.world.EntityRemove):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean._g] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean.q1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Flow
    private final void l(PlayerEntityDeathEvent playerEntityDeathEvent) throws Exception {
        long j2 = c ^ 122302178973234L;
        long j3 = j2 ^ 55740017541464L;
        long j4 = j2 ^ 140614305124900L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j4 << 32) >>> 48);
        int i4 = (int) ((j4 << 48) >>> 48);
        long j5 = j2 ^ 113907318258363L;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5782715355720909577L, j2) /* invoke-custom */;
        ?? E2 = this;
        ?? r0 = E2;
        if (iArr != null) {
            try {
                try {
                    E2 = E2.e(j5);
                    if (E2 == 0) {
                        return;
                    } else {
                        r0 = this;
                    }
                } catch (NumberFormatException unused) {
                    throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(E2, -5905164480376730590L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(E2, -5905164480376730590L, j2) /* invoke-custom */;
            }
        }
        class_1657 player = playerEntityDeathEvent.getPlayer();
        Intrinsics.checkNotNull(player);
        o2.S(r0, player.method_5477().getString() + " " + o2.Z(i2, this, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24853, 1921819666673108033L ^ j2) /* invoke-custom */, new Object[]{Integer.valueOf(playerEntityDeathEvent.getTotemsPopped())}, (char) i3, false, 4, null, (short) i4), false, 2, null, j3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(4:18|187|21|(3:222|23|26)(2:231|230))(1:221)|(1:225)(1:(3:226|53|56)(2:232|230))|(1:227)(1:(3:228|60|63)(2:233|230))|206|65|(1:67)|70|71|(4:199|73|(4:75|186|78|(2:80|(4:84|208|87|90))(1:90))|91)|191|92|234|230) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c9, code lost:
    
        if (r0 == 0) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01cc, code lost:
    
        r61 = r61 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d1, code lost:
    
        if (r0 != null) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03fa, code lost:
    
        if (r0 == null) goto L229;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x065a A[Catch: Exception -> 0x0665, TRY_LEAVE, TryCatch #22 {Exception -> 0x0665, blocks: (B:155:0x0652, B:157:0x065a), top: B:216:0x0652 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0707 A[EDGE_INSN: B:254:0x0707->B:178:0x0707 BREAK  A[LOOP:5: B:127:0x055b->B:255:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[LOOP:5: B:127:0x055b->B:255:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0409 A[Catch: Exception -> 0x0412, TRY_LEAVE, TryCatch #11 {Exception -> 0x0412, blocks: (B:97:0x03fe, B:99:0x0409), top: B:201:0x03fe }] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v114, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v116, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v125, types: [java.lang.Object, net.minecraft.class_2818] */
    /* JADX WARN: Type inference failed for: r0v126, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v128, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v129, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v130, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v131 */
    /* JADX WARN: Type inference failed for: r0v137, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v138 */
    /* JADX WARN: Type inference failed for: r0v139, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v141 */
    /* JADX WARN: Type inference failed for: r0v142 */
    /* JADX WARN: Type inference failed for: r0v145, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v146, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v155 */
    /* JADX WARN: Type inference failed for: r0v156, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v158, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v160, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v162, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v163, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v167, types: [net.minecraft.class_642] */
    /* JADX WARN: Type inference failed for: r0v172, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v173 */
    /* JADX WARN: Type inference failed for: r0v191, types: [int] */
    /* JADX WARN: Type inference failed for: r0v192 */
    /* JADX WARN: Type inference failed for: r0v193 */
    /* JADX WARN: Type inference failed for: r0v196, types: [net.minecraft.class_2586] */
    /* JADX WARN: Type inference failed for: r0v197, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v199, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v200, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v202, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v203 */
    /* JADX WARN: Type inference failed for: r0v212, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v213 */
    /* JADX WARN: Type inference failed for: r0v214 */
    /* JADX WARN: Type inference failed for: r0v215 */
    /* JADX WARN: Type inference failed for: r0v216 */
    /* JADX WARN: Type inference failed for: r0v217 */
    /* JADX WARN: Type inference failed for: r0v218 */
    /* JADX WARN: Type inference failed for: r0v219 */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v220 */
    /* JADX WARN: Type inference failed for: r0v221 */
    /* JADX WARN: Type inference failed for: r0v222 */
    /* JADX WARN: Type inference failed for: r0v223 */
    /* JADX WARN: Type inference failed for: r0v224 */
    /* JADX WARN: Type inference failed for: r0v225 */
    /* JADX WARN: Type inference failed for: r0v226 */
    /* JADX WARN: Type inference failed for: r0v227 */
    /* JADX WARN: Type inference failed for: r0v228 */
    /* JADX WARN: Type inference failed for: r0v229 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v49, types: [su.catlean.q1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean.q1] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v59, types: [su.catlean.q1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.q1] */
    /* JADX WARN: Type inference failed for: r0v64, types: [su.catlean._g] */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [su.catlean.q1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [su.catlean.cm] */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r1v119, types: [char, int] */
    /* JADX WARN: Type inference failed for: r2v130, types: [char, int] */
    /* JADX WARN: Type inference failed for: r55v0, types: [su.catlean._g] */
    /* JADX WARN: Type inference failed for: r57v0, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r57v1 */
    /* JADX WARN: Type inference failed for: r57v2 */
    /* JADX WARN: Type inference failed for: r57v3 */
    /* JADX WARN: Type inference failed for: r57v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r59v0, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r59v1 */
    /* JADX WARN: Type inference failed for: r59v3 */
    /* JADX WARN: Type inference failed for: r59v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r63v10 */
    /* JADX WARN: Type inference failed for: r63v11 */
    /* JADX WARN: Type inference failed for: r63v5 */
    /* JADX WARN: Type inference failed for: r63v6 */
    /* JADX WARN: Type inference failed for: r63v7 */
    /* JADX WARN: Type inference failed for: r63v8 */
    /* JADX WARN: Type inference failed for: r63v9 */
    /* JADX WARN: Type inference failed for: r71v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
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
    private final void W(su.catlean.api.event.events.player.PlayerUpdateEvent r16) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q1.W(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    private final String O(long j2, long j3) {
        long j4 = c ^ j3;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strH = (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28872, 3699555008586090538L ^ j4) /* invoke-custom */;
        Object[] objArr = {Float.valueOf(j2 / 1000.0f)};
        String str = String.format(strH, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(str, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21153, 6802258686378846846L ^ j4) /* invoke-custom */);
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.awt.Color] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [su.catlean.c6] */
    /* JADX WARN: Type inference failed for: r0v25, types: [su.catlean.c6] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v37, types: [int] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r42v1 */
    private final void O(class_332 class_332Var, bj bjVar, bj bjVar2, long j2, String str, String str2) throws Exception {
        ?? r0;
        long j3 = c ^ j2;
        long j4 = j3 ^ 48456418652260L;
        long j5 = j3 ^ 8888083505721L;
        long j6 = j3 ^ 30965386149059L;
        long j7 = j3 ^ 137743565599055L;
        long j8 = j3 ^ 125852480446465L;
        long j9 = j3 ^ 84116123872008L;
        long j10 = j3 ^ 25545842879961L;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3299647471165210242L, j3) /* invoke-custom */;
        float fMax = Math.max(b8.p(j9).D(j7, str2), b8.v(j6).D(j7, str));
        float fMethod_4486 = ((zf.F(j4).method_22683().method_4486() / 2.0f) - (fMax / 2.0f)) - 17.0f;
        ?? CurrentTimeMillis = (int) ((System.currentTimeMillis() / 3.0d) % ((double) (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18596, 2274542403364553869L ^ j3) /* invoke-custom */));
        try {
            try {
                CurrentTimeMillis = CurrentTimeMillis;
                int iK = (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19002, 2985570888385955331L ^ j3) /* invoke-custom */;
                ?? K2 = CurrentTimeMillis;
                ?? r1 = iK;
                if (iArr == null) {
                    r0 = K2 - r1;
                } else if (CurrentTimeMillis >= iK) {
                    r1 = CurrentTimeMillis;
                    K2 = (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13048, 896975806192484089L ^ j3) /* invoke-custom */;
                    r0 = K2 - r1;
                } else {
                    r0 = CurrentTimeMillis;
                }
                ?? r42 = r0;
                jl jlVar = jl.y;
                Color color = Color.RED;
                Intrinsics.checkNotNullExpressionValue(color, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10955, 6763094468772580802L ^ j3) /* invoke-custom */);
                Color color2 = Color.YELLOW;
                Intrinsics.checkNotNullExpressionValue(color2, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11760, 8047882951366003425L ^ j3) /* invoke-custom */);
                ?? C2 = jlVar.C(color, j5, color2, (r42 == true ? 1.0f : 0.0f) / 360.0f);
                try {
                    b8.v(j6).e(class_332Var, str, j8, fMethod_4486, 8.0f, C2);
                    b8.p(j9).e(class_332Var, str2, j8, fMethod_4486, 20.0f, C2);
                    C2 = r42 == true ? 1 : 0;
                    bj bjVar3 = C2 > (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32619, 3097673690647933818L ^ j3) /* invoke-custom */ ? bjVar : bjVar2;
                    Matrix3x2f matrix3x2fMethod_51448 = class_332Var.method_51448();
                    Intrinsics.checkNotNullExpressionValue(matrix3x2fMethod_51448, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10333, 393144369113255694L ^ j3) /* invoke-custom */);
                    bj.p(bjVar3, matrix3x2fMethod_51448, ((double) (fMethod_4486 + 5)) + ((double) fMax), 5.0d, 0.0f, 0.0f, C2, null, 0.0f, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8982, 1763009786292104963L ^ j3) /* invoke-custom */, j10, null);
                } catch (NumberFormatException unused) {
                    throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(C2, 3204800211477827159L, j3) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(CurrentTimeMillis, 3204800211477827159L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(CurrentTimeMillis, 3204800211477827159L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean._g] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean.q1] */
    public final void s(@NotNull String str, int i2, long j2) {
        long j3 = c ^ j2;
        long j4 = j3 ^ 94648959470317L;
        long j5 = j3 ^ 29994036009361L;
        int i3 = (int) (j3 >>> 32);
        int i4 = (int) ((j5 << 32) >>> 48);
        int i5 = (int) ((j5 << 48) >>> 48);
        long j6 = j3 ^ 3563939197198L;
        long j7 = j3 ^ 25567415365090L;
        long j8 = j3 ^ 124964336752241L;
        long j9 = j3 ^ 21729542857436L;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2597116427666683714L, j3) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(str, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6743, 1061015241073554599L ^ j3) /* invoke-custom */);
        Object objE = this;
        Object objQ = objE;
        if (iArr != null) {
            try {
                try {
                    objE = objE.e(j6);
                    if (objE == 0) {
                        return;
                    } else {
                        objQ = this;
                    }
                } catch (NumberFormatException unused) {
                    throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objE, 2718415600313272215L, j3) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objE, 2718415600313272215L, j3) /* invoke-custom */;
            }
        }
        q1 q1Var = this;
        String strH = (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26820, 433140536550753904L ^ j3) /* invoke-custom */;
        Object[] objArr = new Object[1];
        try {
            try {
                objArr[0] = Integer.valueOf(i2);
                o2.S(objQ, str + " " + o2.Z(i3, q1Var, strH, objArr, (char) i4, false, 4, null, (short) i5), false, 2, null, j4);
                objQ = G.q((int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13616, 3688163922843234558L ^ j3) /* invoke-custom */, j7);
                lp lpVarI = objQ;
                if (j3 > 0) {
                    lpVarI = objQ;
                    if (iArr != null) {
                        if (objQ == 0) {
                            return;
                        } else {
                            lpVarI = qm.k.f(j9);
                        }
                    }
                }
                if (lpVarI != 0) {
                    try {
                        lpVarI = d2.O.I();
                        lpVarI.L(j8);
                    } catch (NumberFormatException unused3) {
                        throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(lpVarI, 2718415600313272215L, j3) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused4) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, 2718415600313272215L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused5) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, 2718415600313272215L, j3) /* invoke-custom */;
        }
    }

    private final int x(class_1799 class_1799Var) {
        return (int) ((((double) (class_1799Var.method_7936() - class_1799Var.method_7919())) / Math.max(0.1d, class_1799Var.method_7936())) * ((double) 100.0f));
    }

    private static final boolean n() {
        return W.F((c ^ 99793747647469L) ^ 48145711543321L);
    }

    private static final boolean Z() {
        return W.F((c ^ 37494863210934L) ^ 91341923616322L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.cm] */
    private static final boolean H() throws Exception {
        long j2 = c ^ 42462111421716L;
        Object objG = j2;
        try {
            objG = W.g(objG ^ 100310741724166L);
            return objG != cm.OFF;
        } catch (NumberFormatException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objG, 3254674904600776452L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.cm] */
    private static final boolean L() throws Exception {
        long j2 = c ^ 94788924267070L;
        Object objG = j2;
        try {
            objG = W.g(objG ^ 47901050479404L);
            return objG != cm.OFF;
        } catch (NumberFormatException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objG, -6773240944261988306L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.cm] */
    private static final boolean R() throws Exception {
        long j2 = c ^ 20367690306507L;
        Object objG = j2;
        try {
            objG = W.g(objG ^ 122196815243993L);
            return objG != cm.OFF;
        } catch (NumberFormatException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objG, 7779363129623366107L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.cm] */
    private static final boolean A() throws Exception {
        long j2 = c ^ 123325150952878L;
        Object objY = j2;
        long j3 = objY ^ 89965265361810L;
        try {
            objY = W.Y((int) (objY >>> 32), (short) ((j3 << 32) >>> 48), (short) ((j3 << 48) >>> 48));
            return objY != cm.OFF;
        } catch (NumberFormatException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objY, 401026127056512958L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.String] */
    private static final boolean R(List list, Map.Entry entry) throws Exception {
        long j2 = c ^ 69789675868873L;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6105478911570282484L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(entry, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31646, 4278299074659752666L ^ j2) /* invoke-custom */);
        Object key = entry.getKey();
        Intrinsics.checkNotNullExpressionValue(key, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4516, 5918875443231846512L ^ j2) /* invoke-custom */);
        Object objContains = (String) key;
        try {
            objContains = list.contains(objContains);
            return iArr != null ? objContains == 0 : objContains;
        } catch (NumberFormatException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains, -6127159990104094503L, j2) /* invoke-custom */;
        }
    }

    private static final boolean t(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    static {
        int i2;
        long j2 = c ^ 11129531296214L;
        long j3 = j2 ^ 130704686601838L;
        long j4 = j2 ^ 98164183063304L;
        long j5 = j2 ^ 118391761866367L;
        long j6 = j2 ^ 112554197887603L;
        long j7 = j2 ^ 61150416301274L;
        gb = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[131];
        int i4 = 0;
        String str = ";\u0091\f\u0005âWà\f\u0001)¶z8þ\u0098Ñ\u00ad\u009e(ºÑ2¬UÒ_ê\u0082m5þ¯ \u009e\u0091\u0094ZõúÞlÉ<Cu¿\u0013Þ#;Û#\u009f\u0087¹¿c\u0015\u0091\"\u0095\\\u0094¿Ï\u0010\"®i=ÈûÙ-\fç\u0015\u001dUòê,\u0010\u001añ4ò\u0002Pzù¼´\u0090_\u0012ÞQ· \u0093å´~oÃ\u001f\u008cÎ3d\u0099\u0019íQÞ\u008e\u009d\u0085Í'h\n÷.YeÈhËÊ+\u0010ÙÇ1\u0091¢Z\u0019´¦+\u001b&«äÇu\u0018Òt5£ôLR\u0016¾wïÔÿtÓ¾\u0085\u009cM[\u0086\u0012Zw\u0010\u008dåV\u009a\rÖ\u0018¹A\u0082 \u009a\u0096\u0001mß\u0010\u0088B\u0088¹O\u009f4H\b¨\u009c\u0003H§Û \u0010\u0011\u0093\u0092È½\u0094\u007f4OØ>ß]Ü[Ã\u0018¯J\u000bÐ¨K\rXpÃ\"5ú\u0013±\u0096¡ k¹PD \u0089À\u0018úÛß\u008cj?\u001b\u001b\\\u0003+<}\u008b;P ³\u00855wÀ<¿id\u008f£Ó¤\nÖ\u009b\u0089W4À\u001f».ó\u009a\tX%\u008aj¶z\u0083áá@\u0092j#ö^\u0015Ån*G\u0096\u0097\u0015\u0003®\u0086RU\u0084Ò[\u0085D\u0093pëÖZøTì\u0093¹\u0006î\u0080Õ-¿a\u0099NÔuN\u0001 î'×\u0092?c\u00800¬áh\u0007ÝÓªÙ\u0083\u008f\u0013\u001f8÷\u0086RT)\u008c°´ÌD\u00adF±Çº\u008f\u0011Ò\u0013º\u00adÚÂf\u0095\\)\u008bÏ\u000eZÕ»)ù\")áÞ@\u0095¦7\u0096\u0094\f/§-N\u000blà2ðµôz3\u0082\u0086,Îÿ\u0081|\u008bg\u000b\u008b\u0010Ü\u0013ûÁÜ2k\u009c\u008b\u008c´ rÒ\u008eþ\u0018v¢u:\u000e\u001e\u009d_\u000fÛn<ñâ°8¨\u0086äo{\u0007Ð\u0018\u0018Ûp_\u0099ï\fÉ\u0095ÝS*êóÃÖ\u0000\u000b°(b,Lî2\u0018\u008eà\u009dù\t§ÌÕ{Äc©w^#¬!\u0088\u000bs{\u009a.¤(ÑÐ\u008bÀ¾Ý\u0080B~ËÅR-{ì[p\u007f0r\"\u008e6E\u0014Ë[\n\u0095aèÌÏÀ3(åà\u0001õ ³]\u0096.ÁföA\u0016qé}63p9<\u0094Ó\u0014'84×U¥\u0088b|ZÝ\u0092 &[i\u009c\u000fN\u0012¬\u000bØ\u0085Uþ\u0080ºï\u008b\u0015\u0001^h\u0017é£b\u0097¤\t»#½¹ éz\u0006\\¾\u009cqÍd6Dü¥ý\u009amã\tÎ±!6\u008f4WÈ±ò¼\u00102Ù\u0010°2à\u0019Û¹\u0088á\u0000f\u0090)J,IÄ å\u0095~r\u0081\u008dËÔÇ\u0086b\\L\u008d\u0089»ÞízÇÚ\u0003»Ðèa§]»\u0088¥s(\u0082ÉJp\u00adð\u0003\u0006ó½\u009bg0Q1\u0088Ke\u0012ÁÅAîå;G\n=\u0015×à\u008cÈ,0Â\u001aì'Ò(÷Ü0ßî\u0002î\u0084h\u009cÔ»÷f_ÔÐ©ý\u001a`¼î\u008f\u000f\u0001àÓr/3VV¶X\u008fµ²Ic =gË¨.Ù\u009bµÇ\u0098uo\\!K\u0099\u0003¬$ß\r\u009cêßç¨\u0019v\u0092N\u008aÝ0\u009a\u0092u9\u0000\u0096\u0096;Çs}i¬¶á/\u001aáÐþÐË\u0010\u000fC¨ïª~\u0017¯?{Ðõ\u001e\u008a\u0004\u0080_¡|1\u0019ä)L÷ Hr\u0018¡Æ»o$ç »èÆû8åó\u0007Ls»\u0086ÞÐ»\u009eUv7c·«\u0018EÎe°ëÇu.ùÃ\u0098ð/í\rYÞ;äáxªdõ TùÁ\u001eJþít-£&kµø¥º\u0082m\u0093^s\u0015É=OgÞ.fF¦· ß4\u001d°d\u0010]_Í\u0011©\u008b1Ì¬\u0092\u0089qey\\Waãi2Ì\u009e²ï\u008aê\u0010\n¾|Z¾\u0007\t\u0099{X\u001a$i\u008cpt\u0010X\u0096ìZÜi\u0086Áa¹W\u000bl\u0081©u\u0010\u00adÅ\u0002çÛ@¥Ï/¾Þ4x*O\u0080\u0010V\u007f2ÿ×i.«û\bß\u001d%¯vÄ\u0018\"[d5µ\u001fÈÑFÃIå~¦\u000f\u0018\u0013ëª$Sý:æ(\u008f³\u0003§\u0086\u0097(\u0093h¾\u0088\u009aúÉqÃ³xÖ\u000bÔ\u0018R\u0011'\u008a4\u001b þ:«¢á\u0019\u009d®aá\\\u0010\u009fkKÚavXÿí\u009b\u0091S¼½à\u001f \u0005EJqY\u008eD8|4x;%(\u009b\"\u009eÜ<äs\rØm\u001fØ\u0088\u00adò\u0095|Ý \u0004!ò&³ò\u0081 A\u0084¯âÄ=\u0086¦¡\u000fê(ÒÒ(Ì0(\u008a\u00adôuÏ\u0001 [\u0095ö«¾\u00ad\u0093l|\u009a+\u001d×xJ÷\u0094ÖvÔý\u001e\u001eG\\Jt å`Î\u00060R}\tF[#~\u007fâÏ\u0090i¡\u0093BK²WÐ)>ª!\u0011ópº\u0012ÞþéÏµB\u0015]õ\\WcÄ~D\u0098þÑ\u0001F Ð¤e\u0016ý]G\u001d\u0095ý£fK\u0087F${¢+}\u0099ÀÚêf=â\u0085\u001b®Q\u009d öS'93.rå\u001b·\u0082F×2ªWë\u009b\u0013p\u009eÄòÁ±¾\u000fýTÉ«r\u0018¦ÆæÀ÷\u0088ñ-HÕª\u0091Q\u0082\u0092±`\u0090\u0083[&\u0089¦« oz?¯25.0%·\u0015a-\u0083¨ßgÚ¼¥ë¨eÌ\u000bÙ\u009fÔ¸\u008fØe(§¨þþ\u0092~Úôª\t\u000fbß\u0012Ñ\u00886<®\u008fº\u0000À9ÙBõe@+K\u0016\u0011\u0089\u0096+GÊÞx\u0018wiË½\u0085\u009de'¾\u0095¼(r\u0000\u0095[ÐÙ[ì»Vc\u008a\u0010éjO#Eõc¦â·p\u008b´ÉØ\u001a \u0087gz\u009ad8\u000f³µÂÕº\"ùìî\u0005 ¾ãK\u009e¦·\u0012)IùAß*\u008d ÝkðT<\rIâ\u0092ø\u001a\u00984\u009f_oª\u0000\u008cuòÚ^ÃÇÞ\u0099\u009fß¾¦ò(\u008c\u009ca¦dùEÄ\u0085S\u0080\u009boÕÅl\u0085sà\u0010\u008dØ\u001a¡Ò«èË\u009e \u0086ôÆ§!Ë9nv2(\u0003\u0010\u0002\u008a¸\u0010>xÙ½ßªCùî\u0015\u0019YùÓü)\u001dü\u009cÁ»\u009cºüDÄX\u0001\u008b`Ò\u0095(< \u0005\u0095ðKÃ^\u0016\u001bpìÓ+\u009bõ\u008ex\u009f\u000eI\u0001®\u001dc\u0002Úò\\\u008eß$\u0093@\u0018Ù\u0014!¹aWûÊ:\u007füÚ¯æfZó\u0082\u009dø¦åCy Óë\u000bëx\u00191\u0082\u0000POlk ²~ëk\u009bä¢>v\u0091\u0012\u0011t²äx\"q\u0018\u000foX\\\u0095p*\u0087é\u0091A\u0093¢TJÎ\"u\u0005Ä\u001dÁiÓ Æ]J\u0090\u0004·Ã¹â\u001f2p[Ð\u0011\u0087ÿÍä-x0\u0096\u001dqeÿ28ù\u0092Ï\u0010\u00883Z\tWÀ3\u0086ÒóÔ®Ïü§\u00978Á¡·QI÷¡\u008an|èÅøtûC\u008fF\u0091\u001a5\u008e\u009b8\u0019T\u0092ri<\u0084\u0001\b\u0012a° ¥1OLuU\u0088³ñ@8\u008d\u0014Ðºùv\u0092D \u0096¤täÉ\u0083âj¦[~\u00ad\u009e\u0015VO\r\u001e \u0010JÎ{\u0017\u000bW\u001aY¶\u0083&&\u0010vï-\b]çhä3Z\n:\\aÑ®\u0010e³Sp\u008aÍµ?û0§\u0001\u0095ÏÓ°\u0018\u00ad\u0016ëÜ<|lJ1Q×¯BE\u008a\u0005&\u0000íÚÌ\u0091)\u0007\u0018C»\u001e9Tæ\u001fe\u000bÅgº\u0001Ã·%\u0001Á\u0093ö\u0012åí7(h<\u0089tí\u00823B\r\u0004\u00145ÙÖ\u008fÍ&j_vû\u001cbe2úUM\u00810/PHø\u0082\u0010\u000e2)=\u0010}û\"ÓåñÂ)v\u0017Mï6öE\u0094\u0018æÒù¾^vÂ½¢ô{]~\u0011ypá°X¨ÿq¦~\u0010ÎvOàG\u0006<_\u001c\"óðnA\u0086'\u0018\u009f5\u008e\u001dôw\u0000\bÔ\u001fwf\u0086hëÙz\u001d'D@î\u0016&8ÀÈÍa\u000bJ\u0087B\u0092\u008fòD\u0000Þ\t\u0011\u000bú\u0091pÜLå\u0097À9\u000e¿Ê¥½Õe3\u0001t¶`-\u0090O}\u0082Ë<3\u0096\u0089Wû*1\u009a±ßä \b\u0002¬øf\u0005Í®FR\u001a\u001dàÂ\u000b\u0011\u0099´ÿè\u0013ÔÕ\u0019ä\u0003zÕ\u0002à\u009fá(G\u0081éà\u0018bmÀ^ü\u008b¼¢7\u009aÅnjÅ.´÷]ªª3(÷\u0016:¤Çø\u0086ãu\u0010}Óë\u0018¿\u0097fòeåT¬éÇ\u000e\u008bÑp3\u0006ÔÑLÔ\u0081qØ\u0085 \u0090T%&*8^7ók{o\u0081Ä5ñ\u008bÈ\u0082ü\u000e¦\\\\)\u008bé)|+Ãs\u0010:\u0083;pGü\u0015~x¡© e\u0095Tù\u0010¾\u0085þfå[\u008d¯ä£yñæ6ÚH\u0010È^l\u0089óO\u0082e\u0006\u009aâer¨Ðr\u0018Æù6\u0005£\u00ad¶å/ý\u0095\u0017?EÞ\u008bXÑN ¿\u001d\u001aÔ }u¦\u009d Ä\u0095\u001câ¶$Cs\u0000Ä\u008aêÅÄ\u008dÌ/e\u0082ùJ\u008dN\u0097U§\u0087\u0018¶1\u0015ê\u0011z¸Ç!Þ¬Ü!\u0098ëªÆ#\"Ö\u0018õ-\u0097(\\Åà\u0084®Ó|Æ\u0086è\u0090b\u0014\u0088 ¶\u0096»o¨\u0082éfCvÀÙa]ZKêÀßau\u0087í\u008d\u0006\u0018xÆh\u009fîD_Âåudf\u0001ÿ5f\u0080dæÕ\u008e´Iî8@}Ül\u000bjD«Ò.¬¦Ö|O\u0087ÐK%1|\u008dªª\u0093AZÁNÒ-ñ\u001dÜ\u007fÓ\u0016a[¼kØË&hÜB\u0016Ô»$Ïx\u0015]\u001c\u0018\u0011*\u009av\u0003Æ¨ØúR\\\u008c6ãBeÞ&ä»»!2\u0096 KgPIZKO\u0012÷\u0083\u0004\fH\u008b(\u0018\u009ay\u0085\u001ab/k\r\u001eÅ\f\u0092\u0018w\u00159\u0010x\u0086» \u001c\u0086jøF\u00ad7\u0089d\u00181 \u0010\u000b\u00ad\u001a°\u001cáâ\b\u0000ß¿Ð\u0090\u001f\u0091#\u0018>¸5-Xkd]<\u0018§\u0089÷ßÙ.\u0005©öòDÜt\u0085 \u008e|\u001añí\nº=ªÁÍ\u009b\u0083Í\u008fäC\u0016\u000fiç ¹á²\u0000\u0016üxÁ_\u001a\u0010\u000e\u001f\u0017}õO(¦ënWu>ö\u0019\u009c wÜ\u0015H\u008e/¯\u0083\u0010\u0081\u001dÒd\u0014\u008f|UûE¨Â2\u0094ÇÂcÃ\u0089Pû(ú \u0080h_ví¡7¿zj²'àîÎï\u000eÀ$3o\u0002¤\u0087 îm\u008f\u0000X¬@(ô\u0081ÏwÕ|\u001e\u0005Ë\u0096\u0081?5ZèÊ#\u0019\fÎ3à·)ªãÜD¬ù\u0096\u0082I<dÝa·T@\u0010TL«Ùæ-v·Hª¿\u0006×\u0080ì\u001a8|98\\ô\u0095/û¦¶0Ã\u008aÖ\u0094^\u008a¸DJ¤\u009a)¹\u0011E\u0087ÜÀ\"\u0093\u0000\u0099¶!I\u009f\u008a®/\u0085h8<3½ÚPu\u0083¿\u0003-g\u008c\u0087\u00104ëº\u001a\u0082·të\u000b2®oÔªõn\u0018&úÊÖÇê\u00adÏÂz¢FË¸$\u0094\u0086ßh#\u008e²8<\u0010Ð\u0006\u009b\u009c\fIéø\u008c¢\u0007R\u008b\u0090Ù\u001e \u0093|K½\u008f\u009alé\u0091+fØ¥\n¬\u0097òü\u0080ä\u0006\u0002Á°vu\faó+o\u0000 æQ¨\u008e\u007fÄ\u0013?{ÛÓ\u009a\u0019\u008aâ%\u008f'{)³\u0083b8/üA|éó±±(¼ºÍ\u001eBf~«\u0012àù7Ø³\u001aí@p\u0014¥t\u00ad\u000eîã\u0006VÙæÃÚD¶N=ÔW\u001b;Á\u0018qÓy@ï{±KWþä\u0012\u0010¾øFòá¯\u001f,H\u0013\b(Í¢mû\u0089Rª\u0007\u0088L:z]Cå¡\u0016´\u000fON\u0000öÅ{VuÄ¹\u009c´Ã!\u0005µÁîO¦ñ(æt ¬0\u001d_Cüe\u0090\u000f\u008dJ{qÍ¹4\bÌ\u00ad9ì2\u0088_íÉùÒôVFÅ}\u0014n!v 3Ëöæ½\u0005-\bv¡z{NSî<\u009eA#fÕ²ý¦0f«\u009fÿâÓ\u0010\u0010eÚQ³\u0019}\u0098óí(=Ñ,§\f\u0087 ÄFøWQÌÊ¨E§\u0087\u0016\u0097\u001d)%óg\u0019\u0085q\u0012Y·áÅÏ\u009e-bF_\u0018Ï4×ý²\u0015µ\u0098;_¢\u000bÎ\u001ff'ð\u0083:{êÞ\t\u001e «6*q\u0080\u0015\u0001tC\u0096óÚO¦ügDûQ6· \u0002\u0083bÜ\u0012;XÉ¿!\u0018:ËYrÓM\u0005N\u0017ÒpbHjH@Ûß\u0011\u0096\u009bV\u0004\u0097 ºª-=Ë<ÐÌþÔ°ÞÕE\u009dT, m¥\u0084XÚè\u009fùº\u0004ÒKòH |º\u0005TÙ\u0099Î5\u0088À\"\u0093 \u0004 óÃG¤ê\u0005j'ÄÚ5þ¦ê|(h\u0018AXÌñÓ\u0092\u008aÉ\u0084\u0097®1Y¨s3ª\u0096g9Ä\u001e\u0099Î(á\u0006y/ÒÜìÙúç²Iäì\u0080\u0087Ä\u0098OSÜçsÕ%#\u00070¾Xiín`J\f\u0002\u0084$'8µ%<wpj\u0012\u008bãcä\u001c\u0095¨×õ\u0017^\u000b\f¿6\u0086- \u008d\u009c°Á§¡Z::0§;V\n`et&\u0014wë3\u0017°|ñèãKÙ\u0087 \u001fAP\u009c\u000bù\u0016Â\rËj`@ú\bªlÒ×\u001fwÐ9ÅáCfîÐU0Ç\u0018\u0007\u0088îd¹á{l°\u008a\u001b\u0088\u009e\u0002¤\u0004Á¿¸÷+Ê¬Æ\u0010çu\u0006¥e½½ îBA£\u000fð¦C\u0010µÂ£É]Ö!éÓØ\u0015=çá?2 *\u0090/5\u0006Ú¢ô\u0010\u008b\u008b|íB¾\u0001À6CyÔî\u009a?þºÊIÔx\u0096\u00ad\u0010\u000fyh\b\u000bðÁ\u0086~\u0092»¼u\u0001)6 o\u008dh*\u0081ÇYu¯÷öÅ\u0004\u0091åðÃ©¾\u0095Aâ(ö\u0092£)8é½\u007f²\u0018ÆË>hãQçÝscOY~£\u0096»ÒÓ\u0098\u0089\u00856\u0085K\u0018\u008aåu|×j\u008ac\u008b]³!rSñÓr§`¾Âh\u0088( ³DÅ\u008bL_\u009dÏ¾s\u008d+\u0006þ+¸¸\u009bÓ·Lú=ÿrÞÖðÿ×\u001fó\u0010¬W¥·\u0001\u0096Y½b\u0086§ì\u0092¥\t\u0013(X<\u009bË'\u0085q)\u0015ÁÕî?F$\u0016(0\u007fÑ£¬\u0087: Ê]Ê¨\nä¸\u0004ZÖþ@N¬Ì \u0005ÒS\u0090Y\u0001m.Z\u0093«ÏÜcìÏ\u0005¥¶ì\u0092\u0003K:Ç\u0011y\u009cKßêÇ {´ð\u0018Ó\u009b\u000e¨¶/ôqKd\f7GÝ\u0086\u0098òiñ\u007fq\fR[p=cf";
        int length = ";\u0091\f\u0005âWà\f\u0001)¶z8þ\u0098Ñ\u00ad\u009e(ºÑ2¬UÒ_ê\u0082m5þ¯ \u009e\u0091\u0094ZõúÞlÉ<Cu¿\u0013Þ#;Û#\u009f\u0087¹¿c\u0015\u0091\"\u0095\\\u0094¿Ï\u0010\"®i=ÈûÙ-\fç\u0015\u001dUòê,\u0010\u001añ4ò\u0002Pzù¼´\u0090_\u0012ÞQ· \u0093å´~oÃ\u001f\u008cÎ3d\u0099\u0019íQÞ\u008e\u009d\u0085Í'h\n÷.YeÈhËÊ+\u0010ÙÇ1\u0091¢Z\u0019´¦+\u001b&«äÇu\u0018Òt5£ôLR\u0016¾wïÔÿtÓ¾\u0085\u009cM[\u0086\u0012Zw\u0010\u008dåV\u009a\rÖ\u0018¹A\u0082 \u009a\u0096\u0001mß\u0010\u0088B\u0088¹O\u009f4H\b¨\u009c\u0003H§Û \u0010\u0011\u0093\u0092È½\u0094\u007f4OØ>ß]Ü[Ã\u0018¯J\u000bÐ¨K\rXpÃ\"5ú\u0013±\u0096¡ k¹PD \u0089À\u0018úÛß\u008cj?\u001b\u001b\\\u0003+<}\u008b;P ³\u00855wÀ<¿id\u008f£Ó¤\nÖ\u009b\u0089W4À\u001f».ó\u009a\tX%\u008aj¶z\u0083áá@\u0092j#ö^\u0015Ån*G\u0096\u0097\u0015\u0003®\u0086RU\u0084Ò[\u0085D\u0093pëÖZøTì\u0093¹\u0006î\u0080Õ-¿a\u0099NÔuN\u0001 î'×\u0092?c\u00800¬áh\u0007ÝÓªÙ\u0083\u008f\u0013\u001f8÷\u0086RT)\u008c°´ÌD\u00adF±Çº\u008f\u0011Ò\u0013º\u00adÚÂf\u0095\\)\u008bÏ\u000eZÕ»)ù\")áÞ@\u0095¦7\u0096\u0094\f/§-N\u000blà2ðµôz3\u0082\u0086,Îÿ\u0081|\u008bg\u000b\u008b\u0010Ü\u0013ûÁÜ2k\u009c\u008b\u008c´ rÒ\u008eþ\u0018v¢u:\u000e\u001e\u009d_\u000fÛn<ñâ°8¨\u0086äo{\u0007Ð\u0018\u0018Ûp_\u0099ï\fÉ\u0095ÝS*êóÃÖ\u0000\u000b°(b,Lî2\u0018\u008eà\u009dù\t§ÌÕ{Äc©w^#¬!\u0088\u000bs{\u009a.¤(ÑÐ\u008bÀ¾Ý\u0080B~ËÅR-{ì[p\u007f0r\"\u008e6E\u0014Ë[\n\u0095aèÌÏÀ3(åà\u0001õ ³]\u0096.ÁföA\u0016qé}63p9<\u0094Ó\u0014'84×U¥\u0088b|ZÝ\u0092 &[i\u009c\u000fN\u0012¬\u000bØ\u0085Uþ\u0080ºï\u008b\u0015\u0001^h\u0017é£b\u0097¤\t»#½¹ éz\u0006\\¾\u009cqÍd6Dü¥ý\u009amã\tÎ±!6\u008f4WÈ±ò¼\u00102Ù\u0010°2à\u0019Û¹\u0088á\u0000f\u0090)J,IÄ å\u0095~r\u0081\u008dËÔÇ\u0086b\\L\u008d\u0089»ÞízÇÚ\u0003»Ðèa§]»\u0088¥s(\u0082ÉJp\u00adð\u0003\u0006ó½\u009bg0Q1\u0088Ke\u0012ÁÅAîå;G\n=\u0015×à\u008cÈ,0Â\u001aì'Ò(÷Ü0ßî\u0002î\u0084h\u009cÔ»÷f_ÔÐ©ý\u001a`¼î\u008f\u000f\u0001àÓr/3VV¶X\u008fµ²Ic =gË¨.Ù\u009bµÇ\u0098uo\\!K\u0099\u0003¬$ß\r\u009cêßç¨\u0019v\u0092N\u008aÝ0\u009a\u0092u9\u0000\u0096\u0096;Çs}i¬¶á/\u001aáÐþÐË\u0010\u000fC¨ïª~\u0017¯?{Ðõ\u001e\u008a\u0004\u0080_¡|1\u0019ä)L÷ Hr\u0018¡Æ»o$ç »èÆû8åó\u0007Ls»\u0086ÞÐ»\u009eUv7c·«\u0018EÎe°ëÇu.ùÃ\u0098ð/í\rYÞ;äáxªdõ TùÁ\u001eJþít-£&kµø¥º\u0082m\u0093^s\u0015É=OgÞ.fF¦· ß4\u001d°d\u0010]_Í\u0011©\u008b1Ì¬\u0092\u0089qey\\Waãi2Ì\u009e²ï\u008aê\u0010\n¾|Z¾\u0007\t\u0099{X\u001a$i\u008cpt\u0010X\u0096ìZÜi\u0086Áa¹W\u000bl\u0081©u\u0010\u00adÅ\u0002çÛ@¥Ï/¾Þ4x*O\u0080\u0010V\u007f2ÿ×i.«û\bß\u001d%¯vÄ\u0018\"[d5µ\u001fÈÑFÃIå~¦\u000f\u0018\u0013ëª$Sý:æ(\u008f³\u0003§\u0086\u0097(\u0093h¾\u0088\u009aúÉqÃ³xÖ\u000bÔ\u0018R\u0011'\u008a4\u001b þ:«¢á\u0019\u009d®aá\\\u0010\u009fkKÚavXÿí\u009b\u0091S¼½à\u001f \u0005EJqY\u008eD8|4x;%(\u009b\"\u009eÜ<äs\rØm\u001fØ\u0088\u00adò\u0095|Ý \u0004!ò&³ò\u0081 A\u0084¯âÄ=\u0086¦¡\u000fê(ÒÒ(Ì0(\u008a\u00adôuÏ\u0001 [\u0095ö«¾\u00ad\u0093l|\u009a+\u001d×xJ÷\u0094ÖvÔý\u001e\u001eG\\Jt å`Î\u00060R}\tF[#~\u007fâÏ\u0090i¡\u0093BK²WÐ)>ª!\u0011ópº\u0012ÞþéÏµB\u0015]õ\\WcÄ~D\u0098þÑ\u0001F Ð¤e\u0016ý]G\u001d\u0095ý£fK\u0087F${¢+}\u0099ÀÚêf=â\u0085\u001b®Q\u009d öS'93.rå\u001b·\u0082F×2ªWë\u009b\u0013p\u009eÄòÁ±¾\u000fýTÉ«r\u0018¦ÆæÀ÷\u0088ñ-HÕª\u0091Q\u0082\u0092±`\u0090\u0083[&\u0089¦« oz?¯25.0%·\u0015a-\u0083¨ßgÚ¼¥ë¨eÌ\u000bÙ\u009fÔ¸\u008fØe(§¨þþ\u0092~Úôª\t\u000fbß\u0012Ñ\u00886<®\u008fº\u0000À9ÙBõe@+K\u0016\u0011\u0089\u0096+GÊÞx\u0018wiË½\u0085\u009de'¾\u0095¼(r\u0000\u0095[ÐÙ[ì»Vc\u008a\u0010éjO#Eõc¦â·p\u008b´ÉØ\u001a \u0087gz\u009ad8\u000f³µÂÕº\"ùìî\u0005 ¾ãK\u009e¦·\u0012)IùAß*\u008d ÝkðT<\rIâ\u0092ø\u001a\u00984\u009f_oª\u0000\u008cuòÚ^ÃÇÞ\u0099\u009fß¾¦ò(\u008c\u009ca¦dùEÄ\u0085S\u0080\u009boÕÅl\u0085sà\u0010\u008dØ\u001a¡Ò«èË\u009e \u0086ôÆ§!Ë9nv2(\u0003\u0010\u0002\u008a¸\u0010>xÙ½ßªCùî\u0015\u0019YùÓü)\u001dü\u009cÁ»\u009cºüDÄX\u0001\u008b`Ò\u0095(< \u0005\u0095ðKÃ^\u0016\u001bpìÓ+\u009bõ\u008ex\u009f\u000eI\u0001®\u001dc\u0002Úò\\\u008eß$\u0093@\u0018Ù\u0014!¹aWûÊ:\u007füÚ¯æfZó\u0082\u009dø¦åCy Óë\u000bëx\u00191\u0082\u0000POlk ²~ëk\u009bä¢>v\u0091\u0012\u0011t²äx\"q\u0018\u000foX\\\u0095p*\u0087é\u0091A\u0093¢TJÎ\"u\u0005Ä\u001dÁiÓ Æ]J\u0090\u0004·Ã¹â\u001f2p[Ð\u0011\u0087ÿÍä-x0\u0096\u001dqeÿ28ù\u0092Ï\u0010\u00883Z\tWÀ3\u0086ÒóÔ®Ïü§\u00978Á¡·QI÷¡\u008an|èÅøtûC\u008fF\u0091\u001a5\u008e\u009b8\u0019T\u0092ri<\u0084\u0001\b\u0012a° ¥1OLuU\u0088³ñ@8\u008d\u0014Ðºùv\u0092D \u0096¤täÉ\u0083âj¦[~\u00ad\u009e\u0015VO\r\u001e \u0010JÎ{\u0017\u000bW\u001aY¶\u0083&&\u0010vï-\b]çhä3Z\n:\\aÑ®\u0010e³Sp\u008aÍµ?û0§\u0001\u0095ÏÓ°\u0018\u00ad\u0016ëÜ<|lJ1Q×¯BE\u008a\u0005&\u0000íÚÌ\u0091)\u0007\u0018C»\u001e9Tæ\u001fe\u000bÅgº\u0001Ã·%\u0001Á\u0093ö\u0012åí7(h<\u0089tí\u00823B\r\u0004\u00145ÙÖ\u008fÍ&j_vû\u001cbe2úUM\u00810/PHø\u0082\u0010\u000e2)=\u0010}û\"ÓåñÂ)v\u0017Mï6öE\u0094\u0018æÒù¾^vÂ½¢ô{]~\u0011ypá°X¨ÿq¦~\u0010ÎvOàG\u0006<_\u001c\"óðnA\u0086'\u0018\u009f5\u008e\u001dôw\u0000\bÔ\u001fwf\u0086hëÙz\u001d'D@î\u0016&8ÀÈÍa\u000bJ\u0087B\u0092\u008fòD\u0000Þ\t\u0011\u000bú\u0091pÜLå\u0097À9\u000e¿Ê¥½Õe3\u0001t¶`-\u0090O}\u0082Ë<3\u0096\u0089Wû*1\u009a±ßä \b\u0002¬øf\u0005Í®FR\u001a\u001dàÂ\u000b\u0011\u0099´ÿè\u0013ÔÕ\u0019ä\u0003zÕ\u0002à\u009fá(G\u0081éà\u0018bmÀ^ü\u008b¼¢7\u009aÅnjÅ.´÷]ªª3(÷\u0016:¤Çø\u0086ãu\u0010}Óë\u0018¿\u0097fòeåT¬éÇ\u000e\u008bÑp3\u0006ÔÑLÔ\u0081qØ\u0085 \u0090T%&*8^7ók{o\u0081Ä5ñ\u008bÈ\u0082ü\u000e¦\\\\)\u008bé)|+Ãs\u0010:\u0083;pGü\u0015~x¡© e\u0095Tù\u0010¾\u0085þfå[\u008d¯ä£yñæ6ÚH\u0010È^l\u0089óO\u0082e\u0006\u009aâer¨Ðr\u0018Æù6\u0005£\u00ad¶å/ý\u0095\u0017?EÞ\u008bXÑN ¿\u001d\u001aÔ }u¦\u009d Ä\u0095\u001câ¶$Cs\u0000Ä\u008aêÅÄ\u008dÌ/e\u0082ùJ\u008dN\u0097U§\u0087\u0018¶1\u0015ê\u0011z¸Ç!Þ¬Ü!\u0098ëªÆ#\"Ö\u0018õ-\u0097(\\Åà\u0084®Ó|Æ\u0086è\u0090b\u0014\u0088 ¶\u0096»o¨\u0082éfCvÀÙa]ZKêÀßau\u0087í\u008d\u0006\u0018xÆh\u009fîD_Âåudf\u0001ÿ5f\u0080dæÕ\u008e´Iî8@}Ül\u000bjD«Ò.¬¦Ö|O\u0087ÐK%1|\u008dªª\u0093AZÁNÒ-ñ\u001dÜ\u007fÓ\u0016a[¼kØË&hÜB\u0016Ô»$Ïx\u0015]\u001c\u0018\u0011*\u009av\u0003Æ¨ØúR\\\u008c6ãBeÞ&ä»»!2\u0096 KgPIZKO\u0012÷\u0083\u0004\fH\u008b(\u0018\u009ay\u0085\u001ab/k\r\u001eÅ\f\u0092\u0018w\u00159\u0010x\u0086» \u001c\u0086jøF\u00ad7\u0089d\u00181 \u0010\u000b\u00ad\u001a°\u001cáâ\b\u0000ß¿Ð\u0090\u001f\u0091#\u0018>¸5-Xkd]<\u0018§\u0089÷ßÙ.\u0005©öòDÜt\u0085 \u008e|\u001añí\nº=ªÁÍ\u009b\u0083Í\u008fäC\u0016\u000fiç ¹á²\u0000\u0016üxÁ_\u001a\u0010\u000e\u001f\u0017}õO(¦ënWu>ö\u0019\u009c wÜ\u0015H\u008e/¯\u0083\u0010\u0081\u001dÒd\u0014\u008f|UûE¨Â2\u0094ÇÂcÃ\u0089Pû(ú \u0080h_ví¡7¿zj²'àîÎï\u000eÀ$3o\u0002¤\u0087 îm\u008f\u0000X¬@(ô\u0081ÏwÕ|\u001e\u0005Ë\u0096\u0081?5ZèÊ#\u0019\fÎ3à·)ªãÜD¬ù\u0096\u0082I<dÝa·T@\u0010TL«Ùæ-v·Hª¿\u0006×\u0080ì\u001a8|98\\ô\u0095/û¦¶0Ã\u008aÖ\u0094^\u008a¸DJ¤\u009a)¹\u0011E\u0087ÜÀ\"\u0093\u0000\u0099¶!I\u009f\u008a®/\u0085h8<3½ÚPu\u0083¿\u0003-g\u008c\u0087\u00104ëº\u001a\u0082·të\u000b2®oÔªõn\u0018&úÊÖÇê\u00adÏÂz¢FË¸$\u0094\u0086ßh#\u008e²8<\u0010Ð\u0006\u009b\u009c\fIéø\u008c¢\u0007R\u008b\u0090Ù\u001e \u0093|K½\u008f\u009alé\u0091+fØ¥\n¬\u0097òü\u0080ä\u0006\u0002Á°vu\faó+o\u0000 æQ¨\u008e\u007fÄ\u0013?{ÛÓ\u009a\u0019\u008aâ%\u008f'{)³\u0083b8/üA|éó±±(¼ºÍ\u001eBf~«\u0012àù7Ø³\u001aí@p\u0014¥t\u00ad\u000eîã\u0006VÙæÃÚD¶N=ÔW\u001b;Á\u0018qÓy@ï{±KWþä\u0012\u0010¾øFòá¯\u001f,H\u0013\b(Í¢mû\u0089Rª\u0007\u0088L:z]Cå¡\u0016´\u000fON\u0000öÅ{VuÄ¹\u009c´Ã!\u0005µÁîO¦ñ(æt ¬0\u001d_Cüe\u0090\u000f\u008dJ{qÍ¹4\bÌ\u00ad9ì2\u0088_íÉùÒôVFÅ}\u0014n!v 3Ëöæ½\u0005-\bv¡z{NSî<\u009eA#fÕ²ý¦0f«\u009fÿâÓ\u0010\u0010eÚQ³\u0019}\u0098óí(=Ñ,§\f\u0087 ÄFøWQÌÊ¨E§\u0087\u0016\u0097\u001d)%óg\u0019\u0085q\u0012Y·áÅÏ\u009e-bF_\u0018Ï4×ý²\u0015µ\u0098;_¢\u000bÎ\u001ff'ð\u0083:{êÞ\t\u001e «6*q\u0080\u0015\u0001tC\u0096óÚO¦ügDûQ6· \u0002\u0083bÜ\u0012;XÉ¿!\u0018:ËYrÓM\u0005N\u0017ÒpbHjH@Ûß\u0011\u0096\u009bV\u0004\u0097 ºª-=Ë<ÐÌþÔ°ÞÕE\u009dT, m¥\u0084XÚè\u009fùº\u0004ÒKòH |º\u0005TÙ\u0099Î5\u0088À\"\u0093 \u0004 óÃG¤ê\u0005j'ÄÚ5þ¦ê|(h\u0018AXÌñÓ\u0092\u008aÉ\u0084\u0097®1Y¨s3ª\u0096g9Ä\u001e\u0099Î(á\u0006y/ÒÜìÙúç²Iäì\u0080\u0087Ä\u0098OSÜçsÕ%#\u00070¾Xiín`J\f\u0002\u0084$'8µ%<wpj\u0012\u008bãcä\u001c\u0095¨×õ\u0017^\u000b\f¿6\u0086- \u008d\u009c°Á§¡Z::0§;V\n`et&\u0014wë3\u0017°|ñèãKÙ\u0087 \u001fAP\u009c\u000bù\u0016Â\rËj`@ú\bªlÒ×\u001fwÐ9ÅáCfîÐU0Ç\u0018\u0007\u0088îd¹á{l°\u008a\u001b\u0088\u009e\u0002¤\u0004Á¿¸÷+Ê¬Æ\u0010çu\u0006¥e½½ îBA£\u000fð¦C\u0010µÂ£É]Ö!éÓØ\u0015=çá?2 *\u0090/5\u0006Ú¢ô\u0010\u008b\u008b|íB¾\u0001À6CyÔî\u009a?þºÊIÔx\u0096\u00ad\u0010\u000fyh\b\u000bðÁ\u0086~\u0092»¼u\u0001)6 o\u008dh*\u0081ÇYu¯÷öÅ\u0004\u0091åðÃ©¾\u0095Aâ(ö\u0092£)8é½\u007f²\u0018ÆË>hãQçÝscOY~£\u0096»ÒÓ\u0098\u0089\u00856\u0085K\u0018\u008aåu|×j\u008ac\u008b]³!rSñÓr§`¾Âh\u0088( ³DÅ\u008bL_\u009dÏ¾s\u008d+\u0006þ+¸¸\u009bÓ·Lú=ÿrÞÖðÿ×\u001fó\u0010¬W¥·\u0001\u0096Y½b\u0086§ì\u0092¥\t\u0013(X<\u009bË'\u0085q)\u0015ÁÕî?F$\u0016(0\u007fÑ£¬\u0087: Ê]Ê¨\nä¸\u0004ZÖþ@N¬Ì \u0005ÒS\u0090Y\u0001m.Z\u0093«ÏÜcìÏ\u0005¥¶ì\u0092\u0003K:Ç\u0011y\u009cKßêÇ {´ð\u0018Ó\u009b\u000e¨¶/ôqKd\f7GÝ\u0086\u0098òiñ\u007fq\fR[p=cf".length();
        char cCharAt = ' ';
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i7 = i4;
                        i4++;
                        strArr[i7] = strIntern;
                        int i8 = i6 + cCharAt;
                        i2 = i8;
                        if (i8 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            ab = strArr;
                            fb = new String[131];
                            mb = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[60];
                            int i10 = 0;
                            String str3 = "¤¢\u000f2ù}TèÂÁ!)ÍaZ\u0098#ø÷â£,9À\bí¶w\u000b D¶D\u0005AÊäß¹¡N¾TÓÙIò¹*Ü\u0084pNÙ®\\öíp¬;Hðð94Cô=«\bL(ºÅwDº\u0082\u0086*J \u0087óOåA´údS\u001cZÍ§\u001bê±\fM»\u008b,\r\u008e\u0017\u0096\u0005Fr\u0013\u009aúuÇ\u0084·ãÎ\u0000ÌOV§M\\\u0013Ëk\u008b9!\u0014åÚ$\u0013\u000fç\u0087Þ³\u001f\u0012½4y´\u0097\u009fðñ\"½F\u0016@ü:g\\D¢úúðÒv\u0014dì·~ßªSe¼Rçì©@\u0013\u000fìé¹ýÞv±pháUÏ*ÑVÏ\u0094¨\u0017lÂAË&ÃáåX¾2\u0098\u009bÃÁá\u001a5}aÏ\u0005 ÐguÒ\u0092ÀN¹!ºÜî\u0087$P\u008e\u000fi\u0096ðåáû³0+Ý&ÝZ%wb(!\u0017q?#)\u0001ç\u00ad<³E\u0094MÍ>\u0099\u000fe\u0085s\f8\u000f1¢2\u0081µ,\u0096Þðþ\u0084\tÊ'WÀQÑ$ÿÒ*«\u0010\\AÃé@y\u008a\u0089½É£ð2\u0084f\u007f\u0080Yù\u0080\u001eímÖ<)æÒ®\tV.ÌAxsOBWck?æ|I²B\u008f)Æº\u009fq?~Ý£%b@=,É\u0093¤\u0085I6ð9\u0010\u0089(]\u008có¸³Ðöí¡nòâ§ª~j\u0090¹BµdX1z\u0085\u009aO½»:\u0086·Å,uâ?_\bC'×èJs\u009eG\u0081\u00905òR\u009fCê.F\r\u0014~àe¡\u008c\u0085\u0001ès\u008d\u0013;S #\u0017`è\b\u0093\"¬";
                            int length2 = "¤¢\u000f2ù}TèÂÁ!)ÍaZ\u0098#ø÷â£,9À\bí¶w\u000b D¶D\u0005AÊäß¹¡N¾TÓÙIò¹*Ü\u0084pNÙ®\\öíp¬;Hðð94Cô=«\bL(ºÅwDº\u0082\u0086*J \u0087óOåA´údS\u001cZÍ§\u001bê±\fM»\u008b,\r\u008e\u0017\u0096\u0005Fr\u0013\u009aúuÇ\u0084·ãÎ\u0000ÌOV§M\\\u0013Ëk\u008b9!\u0014åÚ$\u0013\u000fç\u0087Þ³\u001f\u0012½4y´\u0097\u009fðñ\"½F\u0016@ü:g\\D¢úúðÒv\u0014dì·~ßªSe¼Rçì©@\u0013\u000fìé¹ýÞv±pháUÏ*ÑVÏ\u0094¨\u0017lÂAË&ÃáåX¾2\u0098\u009bÃÁá\u001a5}aÏ\u0005 ÐguÒ\u0092ÀN¹!ºÜî\u0087$P\u008e\u000fi\u0096ðåáû³0+Ý&ÝZ%wb(!\u0017q?#)\u0001ç\u00ad<³E\u0094MÍ>\u0099\u000fe\u0085s\f8\u000f1¢2\u0081µ,\u0096Þðþ\u0084\tÊ'WÀQÑ$ÿÒ*«\u0010\\AÃé@y\u008a\u0089½É£ð2\u0084f\u007f\u0080Yù\u0080\u001eímÖ<)æÒ®\tV.ÌAxsOBWck?æ|I²B\u008f)Æº\u009fq?~Ý£%b@=,É\u0093¤\u0085I6ð9\u0010\u0089(]\u008có¸³Ðöí¡nòâ§ª~j\u0090¹BµdX1z\u0085\u009aO½»:\u0086·Å,uâ?_\bC'×èJs\u009eG\u0081\u00905òR\u009fCê.F\r\u0014~àe¡\u008c\u0085\u0001ès\u008d\u0013;S #\u0017`è\b\u0093\"¬".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j8 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j9 = j8;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j9 >>> 56), (byte) (j9 >>> 48), (byte) (j9 >>> 40), (byte) (j9 >>> 32), (byte) (j9 >>> 24), (byte) (j9 >>> 16), (byte) (j9 >>> 8), (byte) j9});
                                    long j10 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j10;
                                            if (i11 >= length2) {
                                                hb = jArr;
                                                lb = new Integer[60];
                                                pb = new HashMap(13);
                                                Cipher cipher3 = Cipher.getInstance("DES/CBC/NoPadding");
                                                SecretKeyFactory secretKeyFactory3 = SecretKeyFactory.getInstance("DES");
                                                byte[] bArr3 = new byte[8];
                                                bArr3[0] = (byte) (j2 >>> 56);
                                                for (int i15 = 1; i15 < 8; i15++) {
                                                    bArr3[i15] = (byte) ((j2 << (i15 * 8)) >>> 56);
                                                }
                                                cipher3.init(2, secretKeyFactory3.generateSecret(new DESKeySpec(bArr3)), new IvParameterSpec(new byte[8]));
                                                long[] jArr3 = new long[3];
                                                int i16 = 0;
                                                int length3 = "Àû¸`SÑ h$_\u0019\u0099$·\u008dô =:\u001d\u000f4²a".length();
                                                int i17 = 0;
                                                do {
                                                    int i18 = i17;
                                                    i17 += 8;
                                                    byte[] bytes2 = "Àû¸`SÑ h$_\u0019\u0099$·\u008dô =:\u001d\u000f4²a".substring(i18, i17).getBytes("ISO-8859-1");
                                                    i16++;
                                                    byte[] bArrDoFinal2 = cipher3.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255))});
                                                    jArr3[-1] = ((((long) bArrDoFinal2[0]) & 255) << 56) | ((((long) bArrDoFinal2[1]) & 255) << 48) | ((((long) bArrDoFinal2[2]) & 255) << 40) | ((((long) bArrDoFinal2[3]) & 255) << 32) | ((((long) bArrDoFinal2[4]) & 255) << 24) | ((((long) bArrDoFinal2[5]) & 255) << 16) | ((((long) bArrDoFinal2[6]) & 255) << 8) | (((long) bArrDoFinal2[7]) & 255);
                                                } while (i17 < length3);
                                                nb = jArr3;
                                                ob = new Long[3];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32413, 5603845063007309594L ^ j2) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1322, 8855750676245536712L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1705, 7032019552778017846L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15573, 6573869395977659933L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4818, 6613976913591126143L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4915, 3408055530743941610L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13637, 2249957849359347636L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2764, 1549956518590763032L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9920, 7195229235102612494L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19767, 4388677114909399019L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18535, 4247649322630058706L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4704, 2466098631455885456L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13412, 6329171697975488173L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1145, 8388504345250395605L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21274, 3281044948204849658L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8713, 7396690562427713736L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20767, 2901562593937498297L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(709, 8977326464396941334L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25810, 3264436540262497888L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1988, 4776448759334991465L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15642, 7327025281752885147L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24589, 6611118571095931597L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28117, 5696061902589893732L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18201, 6710336915565387230L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18971, 8226152501703250070L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16691, 3082120530265288850L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11033, 8724524268298596794L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5487, 2090009570295566312L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25455, 2907743230067151564L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32085, 3262713018125100984L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(794, 8329196736340285830L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30281, 7372931142916736968L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27283, 543504732227547177L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20061, 3023607791181567128L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31855, 1490859156806372824L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29556, 78654353195018626L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5789, 5745752471231908864L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14926, 5961679929924373468L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20278, 699209096721470906L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14847, 1294587295071855435L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18381, 7080581896532080214L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32064, 4815633207825016735L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18118, 4210611787879783533L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11471, 7762597867830959477L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26039, 7113505616152739640L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32314, 214471845347435732L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18320, 9162352826212824635L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q1.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11075, 2590294788506055094L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3384, 4620686630831839155L ^ j2) /* invoke-custom */, 0));
                                                f = kPropertyArr;
                                                W = new q1(j6);
                                                e = yp.t(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3286, 4751968847802881620L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9898, 6473347608875718419L ^ j2) /* invoke-custom */, null);
                                                E = yp.t(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29087, 8123924532727098184L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9898, 6473347608875718419L ^ j2) /* invoke-custom */, null);
                                                Y = yp.t(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15951, 3092628415345157319L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9898, 6473347608875718419L ^ j2) /* invoke-custom */, null);
                                                u = yp.t(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19325, 1358511450687312326L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9898, 6473347608875718419L ^ j2) /* invoke-custom */, null);
                                                S = yp.t(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25990, 4961163318067085098L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9898, 6473347608875718419L ^ j2) /* invoke-custom */, null);
                                                K = yp.t(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27599, 6590362344217489702L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9898, 6473347608875718419L ^ j2) /* invoke-custom */, null);
                                                y = yp.t(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27035, 4872097407234585353L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9898, 6473347608875718419L ^ j2) /* invoke-custom */, null);
                                                z = yp.L(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2063, 4255858216152453820L ^ j2) /* invoke-custom */, 5, new IntRange(0, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2332, 1321881447987673231L ^ j2) /* invoke-custom */), j4, null, q1::n, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1988, 4776448759334991465L ^ j2) /* invoke-custom */, null);
                                                g = yp.L(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10388, 1030949911983354472L ^ j2) /* invoke-custom */, 0, new IntRange(0, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22362, 8373110645915461315L ^ j2) /* invoke-custom */), j4, null, q1::Z, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1988, 4776448759334991465L ^ j2) /* invoke-custom */, null);
                                                a = yp.t(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18201, 6710336915565387230L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9898, 6473347608875718419L ^ j2) /* invoke-custom */, null);
                                                l = yp.L(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1805, 8477207443478076858L ^ j2) /* invoke-custom */, cm.BOTH, null, null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9898, 6473347608875718419L ^ j2) /* invoke-custom */, null, j7);
                                                B = yp.L(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20530, 894674508370610916L ^ j2) /* invoke-custom */, cm.BOTH, null, null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9898, 6473347608875718419L ^ j2) /* invoke-custom */, null, j7);
                                                h = yp.t(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28261, 4847811611165504715L ^ j2) /* invoke-custom */, true, j3, null, q1::H, 4, null);
                                                j = yp.t(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25184, 9139803726250555642L ^ j2) /* invoke-custom */, false, j3, null, q1::L, 4, null);
                                                V = yp.t(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28093, 2903938775825332034L ^ j2) /* invoke-custom */, true, j3, null, q1::R, 4, null);
                                                A = yp.L(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4500, 5615349740697930700L ^ j2) /* invoke-custom */, cm.BOTH, null, null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9898, 6473347608875718419L ^ j2) /* invoke-custom */, null, j7);
                                                F = yp.t(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18081, 8433099763167108217L ^ j2) /* invoke-custom */, false, j3, null, q1::A, 4, null);
                                                L = yp.L(W, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15769, 1697707776068019983L ^ j2) /* invoke-custom */, cm.BOTH, null, null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9898, 6473347608875718419L ^ j2) /* invoke-custom */, null, j7);
                                                D = new bj((String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22107, 2278151822537690274L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6185, 5571678032754108813L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23077, 8457777720552663968L ^ j2) /* invoke-custom */, j5);
                                                T = new bj((String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9144, 7295596979663862105L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23077, 8457777720552663968L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23077, 8457777720552663968L ^ j2) /* invoke-custom */, j5);
                                                k = new bj((String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23804, 4430372333516260969L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23077, 8457777720552663968L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23077, 8457777720552663968L ^ j2) /* invoke-custom */, j5);
                                                i = new bj((String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22173, 8311311235759475756L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23077, 8457777720552663968L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23077, 8457777720552663968L ^ j2) /* invoke-custom */, j5);
                                                N = new bj((String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4031, 279779164688766308L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23077, 8457777720552663968L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23077, 8457777720552663968L ^ j2) /* invoke-custom */, j5);
                                                X = new bj((String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25625, 691915123464388337L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23077, 8457777720552663968L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23077, 8457777720552663968L ^ j2) /* invoke-custom */, j5);
                                                U = new bj((String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13669, 6278597653367484396L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23077, 8457777720552663968L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23077, 8457777720552663968L ^ j2) /* invoke-custom */, j5);
                                                x = new bg();
                                                C = new bg();
                                                w = new bg();
                                                o = new bg();
                                                G = new bg();
                                                I = new bg();
                                                b = new bg();
                                                P = new bg();
                                                O = new bg();
                                                t = new ArrayList();
                                                J = new ArrayList();
                                                m = new ConcurrentHashMap();
                                                d = (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6997, 2340522854975236811L ^ j2) /* invoke-custom */;
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j10;
                                            if (i11 >= length2) {
                                                str3 = ";ÙØÎ y\u0099òCN¯PÅ¦_^";
                                                length2 = ";ÙØÎ y\u0099òCN¯PÅ¦_^".length();
                                                i11 = 0;
                                            }
                                            break;
                                    }
                                    int i19 = i11;
                                    i11 += 8;
                                    byte[] bytes3 = str3.substring(i19, i11).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i13 = i10;
                                    i10++;
                                    j8 = ((((long) bytes3[0]) & 255) << 56) | ((((long) bytes3[1]) & 255) << 48) | ((((long) bytes3[2]) & 255) << 40) | ((((long) bytes3[3]) & 255) << 32) | ((((long) bytes3[4]) & 255) << 24) | ((((long) bytes3[5]) & 255) << 16) | ((((long) bytes3[6]) & 255) << 8) | (((long) bytes3[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i20 = i4;
                        i4++;
                        strArr[i20] = strIntern;
                        int i21 = i6 + cCharAt;
                        i5 = i21;
                        if (i21 < length) {
                        }
                        str = "yf¯\u0011¹@\u0087Mç\u009f\u0089pè|\u0010 Òb5ö\u0001âÉõY\u0015`§\u0015áÊ\u0083 4¾Ø«\u0002\u0087p\u0013ô\rd_\u009e¤\u0015/¦è;ÄiuGáçª¤Sç£å ";
                        length = "yf¯\u0011¹@\u0087Mç\u009f\u0089pè|\u0010 Òb5ö\u0001âÉõY\u0015`§\u0015áÊ\u0083 4¾Ø«\u0002\u0087p\u0013ô\rd_\u009e¤\u0015/¦è;ÄiuGáçª¤Sç£å ".length();
                        cCharAt = ' ';
                        i2 = -1;
                        break;
                        break;
                }
                i6 = i2 + 1;
                strSubstring = str.substring(i6, i6 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i5);
        }
    }

    private static Exception a(Exception exc) {
        return exc;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 19045;
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
                throw new RuntimeException("su/catlean/q1", e2);
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
            r1 = r10
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
            java.lang.String r1 = "su/catlean/q1"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q1.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 24853;
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
                    throw new RuntimeException("su/catlean/q1", e2);
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
            r1 = r10
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
            java.lang.String r1 = "su/catlean/q1"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q1.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static long e(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 1479;
        if (ob[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) nb[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) pb.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    pb.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/q1", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            ob[i3] = Long.valueOf(((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255));
        }
        return ob[i3].longValue();
    }

    private static long e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        long jE = e(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Long.TYPE, Long.valueOf(jE)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return jE;
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
            r1 = r10
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
            java.lang.String r1 = "su/catlean/q1"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q1.e(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
