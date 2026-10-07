package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_636;
import net.minecraft.class_638;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.CollisionEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.world.UpdateBlockBreakingProgressEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.InteractionManagerAccessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ex.class */
public final class ex extends _g {

    @NotNull
    public static final ex c = null;
    static final KProperty[] G = null;

    @NotNull
    private static final cw A = null;

    @NotNull
    private static final cw U = null;

    @NotNull
    private static final cw X = null;

    @NotNull
    private static final cq D = null;

    @NotNull
    private static final cq E = null;

    @NotNull
    private static final cq w = null;

    @NotNull
    private static final cw F = null;

    @NotNull
    private static final cw y = null;

    @NotNull
    private static final cw x = null;

    @NotNull
    private static final cq b = null;

    @NotNull
    private static final cw t = null;

    @NotNull
    private static final ct h = null;

    @NotNull
    private static final ct L = null;

    @NotNull
    private static final cq l = null;

    @NotNull
    private static final cq V = null;

    @NotNull
    private static final cq n = null;

    @NotNull
    private static final cq B = null;

    @NotNull
    private static final cw a = null;

    @NotNull
    private static final cp T = null;

    @NotNull
    private static final cw z = null;

    @NotNull
    private static final cw Y = null;

    @NotNull
    private static final cs d = null;

    @NotNull
    private static final cs o = null;

    @NotNull
    private static final bg K = null;

    @Nullable
    private static class_2338 i;

    @Nullable
    private static class_2338 S;

    @NotNull
    private static AtomicBoolean I;

    @NotNull
    private static LinkedList J;

    @NotNull
    private static ConcurrentHashMap m;
    private static String g;
    private static final long e = 0;
    private static final String[] f = null;
    private static final String[] j = null;
    private static final Map k = null;
    private static final long[] u = null;
    private static final Integer[] C = null;
    private static final Map N = null;
    private static final long[] O = null;
    private static final Long[] P = null;
    private static final Map W = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private ex(long j2) {
        long j3 = e ^ j2;
        super((String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15665, 7910527814131014151L ^ j3) /* invoke-custom */, jt.v(), null, 4, null, j3 ^ 9307432592351L);
    }

    @NotNull
    public final gx F9(long j2, byte b2) {
        return (gx) A.E(this, (((j2 << 8) | ((((long) b2) << 56) >>> 56)) ^ e) ^ 90341341320601L, G[0]);
    }

    @NotNull
    public final jp T(long j2) {
        return (jp) U.E(this, (e ^ j2) ^ 113073072759996L, G[1]);
    }

    @NotNull
    public final d0 D(long j2) {
        return (d0) X.E(this, (e ^ j2) ^ 98672927949114L, G[2]);
    }

    private final boolean n(long j2) {
        return ((Boolean) D.E(this, (e ^ j2) ^ 16238985635151L, G[3])).booleanValue();
    }

    private final boolean F7(long j2) {
        return ((Boolean) E.E(this, (e ^ j2) ^ 71857893803835L, G[4])).booleanValue();
    }

    public final boolean x(long j2) {
        return ((Boolean) w.E(this, (e ^ j2) ^ 18564777191874L, G[5])).booleanValue();
    }

    private final oh Ft(long j2) {
        long j3 = e ^ j2;
        return (oh) F.E(this, j3 ^ 108606317047343L, G[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26392, 6573087768254453146L ^ j3) /* invoke-custom */]);
    }

    private final bu W(long j2) {
        long j3 = e ^ j2;
        return (bu) y.E(this, j3 ^ 94279779324157L, G[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32474, 989390100841869998L ^ j3) /* invoke-custom */]);
    }

    @NotNull
    public final iw FC(int i2, char c2, char c3) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) c3) << 48) >>> 48)) ^ e;
        return (iw) x.E(this, j2 ^ 87359235383820L, G[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6369, 3399308789618812492L ^ j2) /* invoke-custom */]);
    }

    private final boolean Fk(long j2) {
        long j3 = e ^ j2;
        return ((Boolean) b.E(this, j3 ^ 50208739727832L, G[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12660, 3112957040296162318L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final zy K(long j2) {
        long j3 = e ^ j2;
        return (zy) t.E(this, j3 ^ 127700020832557L, G[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14413, 7531098049394068965L ^ j3) /* invoke-custom */]);
    }

    private final float A(long j2) {
        long j3 = e ^ j2;
        return ((Number) h.E(this, j3 ^ 70846539121985L, G[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26063, 2973763153883954204L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final float t(long j2, char c2) {
        long j3 = ((j2 << 16) | ((((long) c2) << 48) >>> 48)) ^ e;
        return ((Number) L.E(this, j3 ^ 117682865537304L, G[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13893, 8192079330471406531L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final boolean j(long j2) {
        long j3 = e ^ j2;
        return ((Boolean) l.E(this, j3 ^ 129850183699804L, G[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22326, 276640493716850378L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean I(long j2) {
        long j3 = e ^ j2;
        return ((Boolean) V.E(this, j3 ^ 94602487803468L, G[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6754, 6883512776123279533L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean F(long j2) {
        long j3 = e ^ j2;
        return ((Boolean) n.E(this, j3 ^ 101085503614428L, G[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16793, 1483296914587447519L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean Fl(int i2, int i3, int i4) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) i4) << 48) >>> 48)) ^ e;
        return ((Boolean) B.E(this, j2 ^ 113119543127679L, G[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31799, 5021368919719071451L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final cy i(long j2) {
        long j3 = e ^ j2;
        return (cy) a.E(this, j3 ^ 99666347502746L, G[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29549, 5752163916002165608L ^ j3) /* invoke-custom */]);
    }

    private final h V(int i2, short s, short s2) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ e;
        return (h) T.E(this, j2 ^ 117765282656468L, G[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30392, 6821754296517843663L ^ j2) /* invoke-custom */]);
    }

    private final nc E(long j2) {
        long j3 = e ^ j2;
        return (nc) z.E(this, j3 ^ 62417419254245L, G[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19022, 7926943565744353079L ^ j3) /* invoke-custom */]);
    }

    private final xi FG(long j2) {
        long j3 = e ^ j2;
        return (xi) Y.E(this, j3 ^ 88268808110473L, G[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3936, 8925598919667225164L ^ j3) /* invoke-custom */]);
    }

    private final Color M(short s, int i2, int i3) {
        long j2 = (((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ e;
        return (Color) d.E(this, j2 ^ 86085275124354L, G[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3906, 7507925612013769048L ^ j2) /* invoke-custom */]);
    }

    private final Color Fe(long j2, char c2) {
        long j3 = ((j2 << 16) | ((((long) c2) << 48) >>> 48)) ^ e;
        return (Color) o.E(this, j3 ^ 80553128314518L, G[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21109, 6642622430427039864L ^ j3) /* invoke-custom */]);
    }

    @NotNull
    public final AtomicBoolean P() {
        return I;
    }

    public final void m(@NotNull AtomicBoolean atomicBoolean, long a2) {
        Intrinsics.checkNotNullParameter(atomicBoolean, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25976, 2194655590669435L ^ (e ^ a2)) /* invoke-custom */);
        I = atomicBoolean;
    }

    @NotNull
    public final LinkedList Fn() {
        return J;
    }

    public final void l(short a2, @NotNull LinkedList linkedList, int a3, short a4) {
        Intrinsics.checkNotNullParameter(linkedList, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10480, 8465061260398010349L ^ ((((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ e)) /* invoke-custom */);
        J = linkedList;
    }

    @Override // su.catlean._g
    public void b(long j2) {
        P(j2 ^ 37449534539012L, ii.TOGGLE);
    }

    @Override // su.catlean._g
    public void O(long j2) {
        P(j2 ^ 6194460963406L, ii.TOGGLE);
    }

    private final void P(long j2, ii iiVar) {
        long j3 = e ^ j2;
        long j4 = j3 ^ 92713472860373L;
        LinkedList<sy> linkedList = J;
        int i2 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(877916142505592704L, j3) /* invoke-custom */;
        loop0: for (sy syVar : linkedList) {
            syVar = null;
            try {
                syVar.a(j4, iiVar);
                do {
                    int i3 = i2;
                    if (j3 >= 0) {
                        if (i3 == 0) {
                            return;
                        } else {
                            i3 = i2;
                        }
                    }
                    if (i3 == 0) {
                    }
                } while (j3 < 0);
            } catch (NoWhenBranchMatchedException unused) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(syVar, 880219223970115584L, j3) /* invoke-custom */;
            }
        }
        J.clear();
        i = null;
        I.set(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [su.catlean.cy] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean.ex] */
    /* JADX WARN: Type inference failed for: r0v25, types: [su.catlean.ex] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [su.catlean.cy] */
    /* JADX WARN: Type inference failed for: r0v29, types: [su.catlean.ex] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v60, types: [int] */
    /* JADX WARN: Type inference failed for: r0v68, types: [su.catlean.mixins.accessors.InteractionManagerAccessor] */
    /* JADX WARN: Type inference failed for: r0v69, types: [su.catlean.mixins.accessors.InteractionManagerAccessor] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow(priority = -10)
    private final void T(PlayerUpdateEvent playerUpdateEvent) {
        ?? r0;
        long j2 = e ^ 96020014091255L;
        int i2 = (int) (j2 >>> 32);
        long j3 = ((j2 ^ 134712355714027L) << 32) >>> 32;
        long j4 = j2 ^ 105423509833419L;
        long j5 = j2 ^ 84875953318761L;
        long j6 = j2 ^ 111117069270083L;
        long j7 = j2 >>> 8;
        int i3 = (int) (((j2 ^ 76686167102058L) << 56) >>> 56);
        long j8 = j2 ^ 113354846503652L;
        long j9 = j2 >>> 16;
        int i4 = (int) (((j2 ^ 137013572699883L) << 48) >>> 48);
        ?? r02 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3415506645727552713L, j2) /* invoke-custom */;
        try {
            try {
                r02 = zf.v(j8).method_31549().field_7477;
                ?? r03 = r02;
                if (r02 != 0) {
                    if (r02 != 0) {
                        return;
                    } else {
                        r03 = I.get();
                    }
                }
                ?? I2 = r03;
                if (r02 != 0) {
                    if (r03 != 0) {
                        return;
                    } else {
                        I2 = zf.v(j8).method_6115();
                    }
                }
                try {
                    if (I2 != 0) {
                        try {
                            I2 = i(j5);
                            cy cyVar = cy.PAUSE;
                            ?? r04 = I2;
                            if (r02 != 0) {
                                if (I2 == cyVar) {
                                    return;
                                }
                                ?? I3 = this;
                                r0 = I3;
                                if (r02 != 0) {
                                    try {
                                        I3 = I3.i(j5);
                                        cyVar = cy.RESET;
                                        r04 = I3;
                                    } catch (NoWhenBranchMatchedException unused) {
                                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(I3, -3422603355758154569L, j2) /* invoke-custom */;
                                    }
                                }
                            }
                            if (r04 == cyVar) {
                                try {
                                    r04 = this;
                                    r04.P(j4, ii.EATING);
                                } catch (NoWhenBranchMatchedException unused2) {
                                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r04, -3422603355758154569L, j2) /* invoke-custom */;
                                }
                            }
                            r0 = this;
                        } catch (NoWhenBranchMatchedException unused3) {
                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(I2, -3422603355758154569L, j2) /* invoke-custom */;
                        }
                    } else {
                        r0 = this;
                    }
                    try {
                        try {
                            try {
                                if (r0.F9(j7, (byte) i3) == gx.DAMAGE) {
                                    class_636 class_636VarZ = zf.Z(i2, j3);
                                    Intrinsics.checkNotNull(class_636VarZ, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6941, 5268480349812809384L ^ j2) /* invoke-custom */);
                                    r0 = (InteractionManagerAccessor) class_636VarZ;
                                    ?? r05 = r0;
                                    if (r02 == 0) {
                                        r05.setCurBlockDamageMP(t(j9, (char) i4));
                                    } else if (r0.getCurBlockDamageMP() < t(j9, (char) i4)) {
                                        InteractionManagerAccessor interactionManagerAccessorZ = zf.Z(i2, j3);
                                        Intrinsics.checkNotNull(interactionManagerAccessorZ, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28825, 1766154922296718641L ^ j2) /* invoke-custom */);
                                        r05 = interactionManagerAccessorZ;
                                        r05.setCurBlockDamageMP(t(j9, (char) i4));
                                    }
                                }
                                for (Map.Entry entry : m.entrySet()) {
                                    ?? r06 = r02;
                                    if (r06 != 0) {
                                        try {
                                            try {
                                                r06 = ((zf.A() - ((Number) entry.getValue()).longValue()) > (long) e(MethodHandles.lookup(), "c", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29825, 2776162844612113972L ^ j2) /* invoke-custom */ ? 1 : ((zf.A() - ((Number) entry.getValue()).longValue()) == (long) e(MethodHandles.lookup(), "c", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29825, 2776162844612113972L ^ j2) /* invoke-custom */ ? 0 : -1));
                                                if (r02 == 0) {
                                                    return;
                                                }
                                                if (r06 <= 0) {
                                                    try {
                                                        try {
                                                            class_638 class_638VarZ = zf.z(j6);
                                                            if (r02 != 0) {
                                                                if (!class_638VarZ.method_22347((class_2338) entry.getKey())) {
                                                                    continue;
                                                                }
                                                            }
                                                        } catch (NoWhenBranchMatchedException unused4) {
                                                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r06, -3422603355758154569L, j2) /* invoke-custom */;
                                                        }
                                                    } catch (NoWhenBranchMatchedException unused5) {
                                                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r06, -3422603355758154569L, j2) /* invoke-custom */;
                                                    }
                                                }
                                                m.remove(entry.getKey());
                                            } catch (NoWhenBranchMatchedException unused6) {
                                                r06 = (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r06, -3422603355758154569L, j2) /* invoke-custom */;
                                                throw r06;
                                            }
                                        } catch (NoWhenBranchMatchedException unused7) {
                                            r06 = (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r06, -3422603355758154569L, j2) /* invoke-custom */;
                                            throw r06;
                                        }
                                    }
                                    if (r02 == 0) {
                                        break;
                                    }
                                }
                                LinkedList linkedList = J;
                                Function1 function1 = ex::Y;
                                linkedList.removeIf((v1) -> {
                                    return g(r1, v1);
                                });
                            } catch (NoWhenBranchMatchedException unused8) {
                                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -3422603355758154569L, j2) /* invoke-custom */;
                            }
                        } catch (NoWhenBranchMatchedException unused9) {
                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -3422603355758154569L, j2) /* invoke-custom */;
                        }
                    } catch (NoWhenBranchMatchedException unused10) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -3422603355758154569L, j2) /* invoke-custom */;
                    }
                } catch (NoWhenBranchMatchedException unused11) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(I2, -3422603355758154569L, j2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused12) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -3422603355758154569L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused13) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -3422603355758154569L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.world.UpdateBlockBreakingProgressEvent] */
    @Flow
    private final void K(UpdateBlockBreakingProgressEvent updateBlockBreakingProgressEvent) {
        long j2 = e ^ 71946527345510L;
        Object obj = j2;
        try {
            if (F9(obj >>> 8, (byte) (((obj ^ 91834426561275L) << 56) >>> 56)) == gx.PACKET) {
                obj = updateBlockBreakingProgressEvent;
                obj.cancel();
            }
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -8065544122517558234L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0442: INVOKE 
          (r-1 I:long)
          (r0 I:su.catlean.zi)
          (r1 I:net.minecraft.class_238)
          (r2 I:java.awt.Color)
          (r3 I:java.awt.Color)
          (r4 I:int)
          (r5 I:java.lang.Object)
         STATIC call: su.catlean.zi.E(long, su.catlean.zi, net.minecraft.class_238, java.awt.Color, java.awt.Color, int, java.lang.Object):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void q(su.catlean.api.event.events.render.Render3DEvent r16) {
        /*
            Method dump skipped, instruction units count: 1183
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.q(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0049: INVOKE (r-1 I:su.catlean.ex), (r0 I:long), (r1 I:net.minecraft.class_2338) DIRECT call: su.catlean.ex.M(long, net.minecraft.class_2338):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void u(su.catlean.api.event.events.player.AttackBlockEvent r9) {
        /*
            r8 = this;
            long r0 = su.catlean.ex.e
            r1 = 118384873773238(0x6baba05918b6, double:5.84898991186093E-310)
            long r0 = r0 ^ r1
            r10 = r0
            r0 = r10
            r1 = r0; r1 = r0; 
            r2 = 87947216945735(0x4ffccea00247, double:4.3451698540235E-310)
            long r1 = r1 ^ r2
            r12 = r1
            r1 = r0; r2 = r0; 
            r2 = 20742229836921(0x12dd6d3dc479, double:1.0248023180566E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r1 = r0; r2 = r0; 
            r2 = 133320703869227(0x79412532012b, double:6.5869179661159E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 8
            long r2 = r2 >>> r3
            r16 = r2
            r2 = r1; r3 = r0; 
            r3 = 56
            long r2 = r2 << r3
            r3 = 56
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r18 = r2
            r1 = r0; r3 = r0; 
            r2 = 101050880217509(0x5be7bdd1d1a5, double:4.992576839749E-310)
            long r1 = r1 ^ r2
            r19 = r1
            r0 = 236443187516817487(0x34803d38980404f, double:7.52031188174939E-293)
            r1 = r10
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r21 = r0
            r0 = r8
            r1 = r9
            net.minecraft.class_2338 r1 = r1.getPos()     // Catch: kotlin.NoWhenBranchMatchedException -> L57
            r2 = r12
            r3 = r2; r2 = r1; r1 = r3;      // Catch: kotlin.NoWhenBranchMatchedException -> L57
            r-1.M(r0, r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L57
            r0 = r21
            if (r0 != 0) goto L79
            if (r-1 == 0) goto Laa
            goto L61
        L57:
            r1 = 270572899934699510(0x3c1449e72747ff6, double:1.384322593604834E-290)
            r2 = r10
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L6f
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L6f
        L61:
            r-1 = r19
            su.catlean.zf.v(r-1)     // Catch: kotlin.NoWhenBranchMatchedException -> L6f
            r-1.method_31549()     // Catch: kotlin.NoWhenBranchMatchedException -> L6f
            boolean r-1 = r-1.field_7477     // Catch: kotlin.NoWhenBranchMatchedException -> L6f
            goto L79
        L6f:
            r1 = 270572899934699510(0x3c1449e72747ff6, double:1.384322593604834E-290)
            r2 = r10
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L79:
            if (r-1 != 0) goto Laa
            r-1 = r8
            r0 = r21
            if (r0 != 0) goto Lba
            goto L8f
        L85:
            r1 = 270572899934699510(0x3c1449e72747ff6, double:1.384322593604834E-290)
            r2 = r10
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> La0
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> La0
        L8f:
            r0 = r16
            r1 = r18
            byte r1 = (byte) r1     // Catch: kotlin.NoWhenBranchMatchedException -> La0 kotlin.NoWhenBranchMatchedException -> Lab
            r-1.F9(r0, r1)     // Catch: kotlin.NoWhenBranchMatchedException -> La0 kotlin.NoWhenBranchMatchedException -> Lab
            su.catlean.gx r0 = su.catlean.gx.DAMAGE     // Catch: kotlin.NoWhenBranchMatchedException -> La0 kotlin.NoWhenBranchMatchedException -> Lab
            if (r-1 != r0) goto Lb5
            goto Laa
        La0:
            r1 = 270572899934699510(0x3c1449e72747ff6, double:1.384322593604834E-290)
            r2 = r10
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> Lab
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> Lab
        Laa:
            return
        Lab:
            r1 = 270572899934699510(0x3c1449e72747ff6, double:1.384322593604834E-290)
            r2 = r10
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lb5:
            r-1 = r9
            r-1.cancel()
            r-1 = r8
        Lba:
            r0 = r9
            net.minecraft.class_2338 r0 = r0.getPos()
            r1 = r9
            net.minecraft.class_2350 r1 = r1.getDirection()
            r2 = r14
            r-1.k(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.u(su.catlean.api.event.events.player.AttackBlockEvent):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:106:0x02a9
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void k(@org.jetbrains.annotations.NotNull net.minecraft.class_2338 r9, @org.jetbrains.annotations.NotNull net.minecraft.class_2350 r10, long r11) {
        /*
            Method dump skipped, instruction units count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.k(net.minecraft.class_2338, net.minecraft.class_2350, long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0181: INVOKE (r-1 I:su.catlean.ex), (r0 I:long), (r1 I:net.minecraft.class_2338) DIRECT call: su.catlean.ex.K(long, net.minecraft.class_2338):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void x(su.catlean.api.event.events.network.AfterReceivePacket r10) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.x(su.catlean.api.event.events.network.AfterReceivePacket):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ex] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v21, types: [su.catlean.iw] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [su.catlean.ex] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [su.catlean.o8] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(su.catlean.api.event.events.network.AfterSendPacket r14) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.e(su.catlean.api.event.events.network.AfterSendPacket):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [su.catlean.api.event.events.player.CollisionEvent] */
    /* JADX WARN: Type inference failed for: r0v28, types: [su.catlean.api.event.events.player.CollisionEvent] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, net.minecraft.class_2338] */
    @Flow
    private final void d(CollisionEvent collisionEvent) {
        long j2 = e ^ 85318491508767L;
        long j3 = j2 ^ 131571812063408L;
        int i2 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(856007052134729958L, j2) /* invoke-custom */;
        if (e(j3)) {
            ConcurrentHashMap concurrentHashMap = m;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                ?? pos = i2;
                if (pos != 0) {
                    return;
                }
                try {
                    try {
                        pos = collisionEvent.getPos();
                        if (i2 == 0) {
                            if (Intrinsics.areEqual((Object) pos, entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            } else {
                                continue;
                            }
                        }
                        if (i2 != 0) {
                            break;
                        }
                    } catch (NoWhenBranchMatchedException unused) {
                        pos = (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(pos, 822015427437426527L, j2) /* invoke-custom */;
                        throw pos;
                    }
                } catch (NoWhenBranchMatchedException unused2) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(pos, 822015427437426527L, j2) /* invoke-custom */;
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                ?? AreEqual = collisionEvent;
                if (i2 == 0) {
                    try {
                        AreEqual = Intrinsics.areEqual(AreEqual.getPos(), entry2.getKey());
                        if (AreEqual != 0) {
                            AreEqual = collisionEvent;
                        } else {
                            continue;
                        }
                    } catch (NoWhenBranchMatchedException unused3) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(AreEqual, 822015427437426527L, j2) /* invoke-custom */;
                    }
                }
                class_2680 class_2680VarMethod_9564 = class_2246.field_10124.method_9564();
                Intrinsics.checkNotNullExpressionValue(class_2680VarMethod_9564, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8352, 2187505864088469246L ^ j2) /* invoke-custom */);
                AreEqual.setState(class_2680VarMethod_9564);
                if (i2 != 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(long r9) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.e(long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final boolean Z(int i2, char c2, @NotNull class_2338 class_2338Var, short s) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ e;
        Intrinsics.checkNotNullParameter(class_2338Var, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29425, 6974277640053812291L ^ j2) /* invoke-custom */);
        int i3 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8425616574246565867L, j2) /* invoke-custom */;
        LinkedList linkedList = J;
        ?? r0 = 0;
        r0 = 0;
        r0 = 0;
        try {
            r0 = linkedList;
            ?? r02 = r0;
            if (i3 == 0) {
                try {
                    try {
                        try {
                            r0 = r0 instanceof Collection;
                            if (r0 != 0) {
                                LinkedList linkedList2 = linkedList;
                                r02 = linkedList2;
                                if (i3 == 0) {
                                    if (linkedList2.isEmpty()) {
                                        return false;
                                    }
                                    r02 = linkedList;
                                }
                            } else {
                                r02 = linkedList;
                            }
                        } catch (NoWhenBranchMatchedException unused) {
                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8386981168702556244L, j2) /* invoke-custom */;
                        }
                    } catch (NoWhenBranchMatchedException unused2) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8386981168702556244L, j2) /* invoke-custom */;
                    }
                } catch (NoWhenBranchMatchedException unused3) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8386981168702556244L, j2) /* invoke-custom */;
                }
            }
            Iterator it = r02.iterator();
            while (it.hasNext()) {
                boolean zAreEqual = Intrinsics.areEqual(((sy) it.next()).b(), class_2338Var);
                while (zAreEqual) {
                    zAreEqual = true;
                    if (s < 0 && i3 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (NoWhenBranchMatchedException unused4) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8386981168702556244L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x002d: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void Z(long r8) {
        /*
            r7 = this;
            long r0 = su.catlean.ex.e
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 20033733509220(0x12387791c064, double:9.897979484844E-311)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 20249589740577(0x126ab99a7421, double:1.00046266331985E-310)
            long r1 = r1 ^ r2
            r12 = r1
            net.minecraft.class_2815 r0 = new net.minecraft.class_2815
            r1 = r0
            r2 = r12
            net.minecraft.class_746 r2 = su.catlean.zf.v(r2)
            net.minecraft.class_1703 r2 = r2.field_7512
            int r2 = r2.field_7763
            r1.<init>(r2)
            net.minecraft.class_2596 r0 = (net.minecraft.class_2596) r0
            r1 = r10
            r2 = r1; r1 = r0; r0 = r2; 
            su.catlean._r.a(r-1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.Z(long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final float U(long r8, net.minecraft.class_2680 r10, net.minecraft.class_2338 r11, int r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.U(long, net.minecraft.class_2680, net.minecraft.class_2338, int, boolean):float");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[Catch: NoWhenBranchMatchedException -> 0x006b, NoWhenBranchMatchedException -> 0x007b, TRY_ENTER, TryCatch #3 {NoWhenBranchMatchedException -> 0x006b, blocks: (B:13:0x0047, B:15:0x004d), top: B:30:0x0047, outer: #2 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.ux] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
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
    private final boolean K(long r8, net.minecraft.class_2338 r10) {
        /*
            r7 = this;
            long r0 = su.catlean.ex.e
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 1566742483540(0x16cc9211254, double:7.74073636997E-312)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -3033391597350775072(0xd5e73a69ef4096e0, double:-6.659224529465342E105)
            r1 = r8
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.ux r0 = su.catlean.ux.X     // Catch: kotlin.NoWhenBranchMatchedException -> L2d
            r1 = r13
            if (r1 != 0) goto L47
            r1 = r11
            boolean r0 = r0.f(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L2d kotlin.NoWhenBranchMatchedException -> L3d
            if (r0 == 0) goto L89
            goto L37
        L2d:
            r1 = -3067376702273050279(0xd56e7d2414b4a959, double:-3.414360036022685E103)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L3d
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L3d
        L37:
            su.catlean.ux r0 = su.catlean.ux.X     // Catch: kotlin.NoWhenBranchMatchedException -> L3d
            goto L47
        L3d:
            r1 = -3067376702273050279(0xd56e7d2414b4a959, double:-3.414360036022685E103)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L47:
            net.minecraft.class_1657 r0 = r0.j()     // Catch: kotlin.NoWhenBranchMatchedException -> L6b
            if (r0 == 0) goto L89
            r0 = r10
            int r0 = r0.method_10264()     // Catch: kotlin.NoWhenBranchMatchedException -> L6b kotlin.NoWhenBranchMatchedException -> L7b
            double r0 = (double) r0     // Catch: kotlin.NoWhenBranchMatchedException -> L6b kotlin.NoWhenBranchMatchedException -> L7b
            su.catlean.ux r1 = su.catlean.ux.X     // Catch: kotlin.NoWhenBranchMatchedException -> L6b kotlin.NoWhenBranchMatchedException -> L7b
            net.minecraft.class_1657 r1 = r1.j()     // Catch: kotlin.NoWhenBranchMatchedException -> L6b kotlin.NoWhenBranchMatchedException -> L7b
            r2 = r1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L6b kotlin.NoWhenBranchMatchedException -> L7b
            double r1 = r1.method_23318()     // Catch: kotlin.NoWhenBranchMatchedException -> L6b kotlin.NoWhenBranchMatchedException -> L7b
            r2 = 1
            double r2 = (double) r2     // Catch: kotlin.NoWhenBranchMatchedException -> L6b kotlin.NoWhenBranchMatchedException -> L7b
            double r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = r13
            if (r1 != 0) goto L86
            goto L75
        L6b:
            r1 = -3067376702273050279(0xd56e7d2414b4a959, double:-3.414360036022685E103)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L7b
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L7b
        L75:
            if (r0 <= 0) goto L89
            goto L85
        L7b:
            r1 = -3067376702273050279(0xd56e7d2414b4a959, double:-3.414360036022685E103)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L85:
            r0 = 1
        L86:
            goto L8a
        L89:
            r0 = 0
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.K(long, net.minecraft.class_2338):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float a(net.minecraft.class_2680 r8, long r9, int r11) {
        /*
            r7 = this;
            long r0 = su.catlean.ex.e
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 109185770403868(0x634dcb0f381c, double:5.3944938171261E-310)
            long r1 = r1 ^ r2
            r12 = r1
            r0 = -1517366204285670922(0xeaf13b79ff5ea9f6, double:-1.3831237670577758E207)
            r1 = r9
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r15 = r1
            r14 = r0
            r0 = r11
            r1 = r14
            if (r1 != 0) goto L52
            r1 = -1
            if (r0 == r1) goto L6b
            goto L35
        L2b:
            r1 = -1551353508770703793(0xea787c3404aa964f, double:-7.676799006421901E204)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L48
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L48
        L35:
            r0 = r12
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)     // Catch: kotlin.NoWhenBranchMatchedException -> L48
            net.minecraft.class_1661 r0 = r0.method_31548()     // Catch: kotlin.NoWhenBranchMatchedException -> L48
            r1 = r11
            net.minecraft.class_1799 r0 = r0.method_5438(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L48
            boolean r0 = r0.method_7960()     // Catch: kotlin.NoWhenBranchMatchedException -> L48
            goto L52
        L48:
            r1 = -1551353508770703793(0xea787c3404aa964f, double:-7.676799006421901E204)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            if (r0 != 0) goto L6b
            r0 = r15
            r1 = r12
            net.minecraft.class_746 r1 = su.catlean.zf.v(r1)
            net.minecraft.class_1661 r1 = r1.method_31548()
            r2 = r11
            net.minecraft.class_1799 r1 = r1.method_5438(r2)
            r2 = r8
            float r1 = r1.method_7924(r2)
            float r0 = r0 * r1
            r15 = r0
        L6b:
            r0 = r15
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.a(net.minecraft.class_2680, long, int):float");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final float A(net.minecraft.class_2680 r12, long r13, int r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.A(net.minecraft.class_2680, long, int, boolean):float");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final int u(net.minecraft.class_2338 r8, long r9) {
        /*
            r7 = this;
            long r0 = su.catlean.ex.e
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 24219514780400(0x16070b933af0, double:1.196603021194E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 2230083450532304220(0x1ef2d9153074955c, double:1.3406243681733823E-159)
            r1 = r9
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r1 = r7
            r2 = r11
            r3 = r8
            r4 = 1
            int r1 = r1.Y(r2, r3, r4)
            r14 = r1
            r13 = r0
            r0 = r14
            r1 = r13
            if (r1 == 0) goto L51
            r1 = -1
            if (r0 == r1) goto L49
            goto L3c
        L32:
            r1 = 2227891731160982236(0x1eeb0fb9c1e162dc, double:9.624164202469688E-160)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L3f
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L3f
        L3c:
            r0 = r14
            return r0
        L3f:
            r1 = 2227891731160982236(0x1eeb0fb9c1e162dc, double:9.624164202469688E-160)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L49:
            r0 = r7
            r1 = r11
            r2 = r8
            r3 = 0
            int r0 = r0.Y(r1, r2, r3)
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.u(net.minecraft.class_2338, long):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final int Y(long r12, net.minecraft.class_2338 r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.Y(long, net.minecraft.class_2338, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [int] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean M(long r10, net.minecraft.class_2338 r12) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.M(long, net.minecraft.class_2338):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0140: INVOKE 
          (r-1 I:int)
          (r0 I:long)
          (r1 I:int)
          (r2 I:net.minecraft.class_1713)
          (r3 I:boolean)
          (r4 I:int)
          (r5 I:java.lang.Object)
         STATIC call: su.catlean.ag.e(int, long, int, net.minecraft.class_1713, boolean, int, java.lang.Object):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void Y(int r13, int r14, long r15) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.Y(int, int, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(long r8) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.l(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        if (r0 == 0) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v36, types: [su.catlean.sy] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [net.minecraft.class_2338] */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v67, types: [int] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r8v0, types: [su.catlean.ex] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List K(int r9, boolean r10, short r11, char r12) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.K(int, boolean, short, char):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v0, types: [su.catlean.ex] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static List q(ex exVar, boolean z2, int i2, Object obj, long j2) {
        long j3 = e ^ j2;
        long j4 = j3 ^ 100577655168380L;
        int i3 = (int) (j3 >>> 32);
        int i4 = (int) ((j4 << 32) >>> 48);
        int i5 = (int) ((j4 << 48) >>> 48);
        ?? r0 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8425642282911334211L, j3) /* invoke-custom */;
        try {
            r0 = i2 & 1;
            ?? r9 = z2;
            ?? r02 = r0;
            if (r0 == 0) {
                r9 = r02;
            } else if (r0 != 0) {
                r02 = 1;
                r9 = r02;
            }
            return exVar.K(i3, r9, (short) i4, (char) i5);
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 8427417629914106051L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:17:0x0066
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final boolean G(su.catlean.sy r8, long r9) {
        /*
            r7 = this;
            long r0 = su.catlean.ex.e
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 496863616605(0x73af611e5d, double:2.45483243633E-312)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -1002233089921011440(0xf2175a50951db110, double:-3.892918867792467E241)
            r1 = r9
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r13 = r0
            r0 = r8
            float r0 = r0.O()     // Catch: kotlin.NoWhenBranchMatchedException -> L2b
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = r13
            if (r1 != 0) goto L55
            if (r0 >= 0) goto La2
            goto L35
        L2b:
            r1 = -964301257958650199(0xf29e1d1d6ee98ea9, double:-1.285112247723692E244)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L4b
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L4b
        L35:
            r0 = r8
            float r0 = r0.O()     // Catch: kotlin.NoWhenBranchMatchedException -> L4b
            r1 = r8
            float r1 = r1.O()     // Catch: kotlin.NoWhenBranchMatchedException -> L4b
            r2 = r8
            float r2 = r2.G()     // Catch: kotlin.NoWhenBranchMatchedException -> L4b
            float r1 = r1 - r2
            r2 = 1075838976(0x40200000, float:2.5)
            float r1 = r1 * r2
            float r0 = r0 + r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            goto L55
        L4b:
            r1 = -964301257958650199(0xf29e1d1d6ee98ea9, double:-1.285112247723692E244)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L55:
            r1 = r13
            r2 = r9
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L8b
            if (r1 != 0) goto L89
            if (r0 < 0) goto La2
            goto L70
        L66:
            r1 = -964301257958650199(0xf29e1d1d6ee98ea9, double:-1.285112247723692E244)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L7f
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L7f
        L70:
            r0 = r11
            net.minecraft.class_638 r0 = su.catlean.zf.z(r0)     // Catch: kotlin.NoWhenBranchMatchedException -> L7f
            r1 = r8
            net.minecraft.class_2338 r1 = r1.b()     // Catch: kotlin.NoWhenBranchMatchedException -> L7f
            boolean r0 = r0.method_22347(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L7f
            goto L89
        L7f:
            r1 = -964301257958650199(0xf29e1d1d6ee98ea9, double:-1.285112247723692E244)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L89:
            r1 = r13
        L8b:
            if (r1 != 0) goto L9f
            if (r0 != 0) goto La2
            goto L9e
        L94:
            r1 = -964301257958650199(0xf29e1d1d6ee98ea9, double:-1.285112247723692E244)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L9e:
            r0 = 1
        L9f:
            goto La3
        La2:
            r0 = 0
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.G(su.catlean.sy, long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.ex] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.gx] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
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
    private static final boolean Y() {
        /*
            long r0 = su.catlean.ex.e
            r1 = 61878669426517(0x3847401c3f55, double:3.0572124774009E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 46925830629064(0x2aadc57726c8, double:2.31844408163855E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 8
            long r2 = r2 >>> r3
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 56
            long r2 = r2 << r3
            r3 = 56
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 16075608243725(0xe9ee4eb3e0d, double:7.942405769227E-311)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = 2610893569889972117(0x243bc1de63a4af95, double:3.818907649324236E-134)
            r1 = r8
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ex r0 = su.catlean.ex.c     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            r1 = r15
            if (r1 == 0) goto L63
            r1 = r10
            r2 = r12
            byte r2 = (byte) r2     // Catch: kotlin.NoWhenBranchMatchedException -> L49 kotlin.NoWhenBranchMatchedException -> L59
            su.catlean.gx r0 = r0.F9(r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L49 kotlin.NoWhenBranchMatchedException -> L59
            su.catlean.gx r1 = su.catlean.gx.DAMAGE     // Catch: kotlin.NoWhenBranchMatchedException -> L49 kotlin.NoWhenBranchMatchedException -> L59
            if (r0 == r1) goto L81
            goto L53
        L49:
            r1 = 2603669315419985941(0x2422177292315815, double:1.244539631763083E-134)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L59
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L59
        L53:
            su.catlean.ex r0 = su.catlean.ex.c     // Catch: kotlin.NoWhenBranchMatchedException -> L59
            goto L63
        L59:
            r1 = 2603669315419985941(0x2422177292315815, double:1.244539631763083E-134)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L63:
            r1 = r13
            boolean r0 = r0.j(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L73
            r1 = r15
            if (r1 == 0) goto L7e
            if (r0 == 0) goto L81
            goto L7d
        L73:
            r1 = 2603669315419985941(0x2422177292315815, double:1.244539631763083E-134)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L7d:
            r0 = 1
        L7e:
            goto L82
        L81:
            r0 = 0
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.Y():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gx] */
    private static final boolean R() {
        long j2 = e ^ 27426181815160L;
        Object objF9 = j2;
        try {
            objF9 = c.F9(objF9 >>> 8, (byte) (((objF9 ^ 11111662879461L) << 56) >>> 56));
            return objF9 != gx.DAMAGE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF9, 4283441583389752L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.ex] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.d0] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.gx] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
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
    private static final boolean L() {
        /*
            long r0 = su.catlean.ex.e
            r1 = 22220615764166(0x1435a3e8c8c6, double:1.0978442878513E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 14615939171832(0xd4b09dcc5f8, double:7.2212334265076E-311)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 7555493646683(0x6df2683d15b, double:3.732909848198E-311)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 8
            long r2 = r2 >>> r3
            r12 = r2
            r2 = r1; r3 = r0; 
            r3 = 56
            long r2 = r2 << r3
            r3 = 56
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r14 = r2
            r0 = -3226692460538130369(0xd3387c4d8a31903f, double:-7.980474060826604E92)
            r1 = r8
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ex r0 = su.catlean.ex.c     // Catch: kotlin.NoWhenBranchMatchedException -> L4a
            r1 = r15
            if (r1 != 0) goto L64
            r1 = r12
            r2 = r14
            byte r2 = (byte) r2     // Catch: kotlin.NoWhenBranchMatchedException -> L4a kotlin.NoWhenBranchMatchedException -> L5a
            su.catlean.gx r0 = r0.F9(r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L4a kotlin.NoWhenBranchMatchedException -> L5a
            su.catlean.gx r1 = su.catlean.gx.DAMAGE     // Catch: kotlin.NoWhenBranchMatchedException -> L4a kotlin.NoWhenBranchMatchedException -> L5a
            if (r0 == r1) goto L7c
            goto L54
        L4a:
            r1 = -3192705787734151290(0xd3b13b0071c5af86, double:-1.4376590764734614E95)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L5a
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L5a
        L54:
            su.catlean.ex r0 = su.catlean.ex.c     // Catch: kotlin.NoWhenBranchMatchedException -> L5a
            goto L64
        L5a:
            r1 = -3192705787734151290(0xd3b13b0071c5af86, double:-1.4376590764734614E95)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L64:
            r1 = r10
            su.catlean.d0 r0 = r0.D(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L72
            su.catlean.d0 r1 = su.catlean.d0.GRIM     // Catch: kotlin.NoWhenBranchMatchedException -> L72
            if (r0 != r1) goto L7c
            r0 = 1
            goto L7d
        L72:
            r1 = -3192705787734151290(0xd3b13b0071c5af86, double:-1.4376590764734614E95)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L7c:
            r0 = 0
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.L():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.ex] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.d0] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.gx] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
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
    private static final boolean r() {
        /*
            long r0 = su.catlean.ex.e
            r1 = 129878489884267(0x761fb140e66b, double:6.4168499985556E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 122462863158101(0x6f611b74eb55, double:6.05046935777754E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 111004305063926(0x64f5342bfff6, double:5.48434136725674E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 8
            long r2 = r2 >>> r3
            r12 = r2
            r2 = r1; r3 = r0; 
            r3 = 56
            long r2 = r2 << r3
            r3 = 56
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r14 = r2
            r0 = -214607599076084053(0xfd058f8692f876ab, double:-1.7212643502876903E294)
            r1 = r8
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ex r0 = su.catlean.ex.c     // Catch: kotlin.NoWhenBranchMatchedException -> L4a
            r1 = r15
            if (r1 == 0) goto L64
            r1 = r12
            r2 = r14
            byte r2 = (byte) r2     // Catch: kotlin.NoWhenBranchMatchedException -> L4a kotlin.NoWhenBranchMatchedException -> L5a
            su.catlean.gx r0 = r0.F9(r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L4a kotlin.NoWhenBranchMatchedException -> L5a
            su.catlean.gx r1 = su.catlean.gx.DAMAGE     // Catch: kotlin.NoWhenBranchMatchedException -> L4a kotlin.NoWhenBranchMatchedException -> L5a
            if (r0 == r1) goto L7c
            goto L54
        L4a:
            r1 = -208193444174266069(0xfd1c592a636d812b, double:-4.526294874008618E294)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L5a
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L5a
        L54:
            su.catlean.ex r0 = su.catlean.ex.c     // Catch: kotlin.NoWhenBranchMatchedException -> L5a
            goto L64
        L5a:
            r1 = -208193444174266069(0xfd1c592a636d812b, double:-4.526294874008618E294)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L64:
            r1 = r10
            su.catlean.d0 r0 = r0.D(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L72
            su.catlean.d0 r1 = su.catlean.d0.GRIM     // Catch: kotlin.NoWhenBranchMatchedException -> L72
            if (r0 != r1) goto L7c
            r0 = 1
            goto L7d
        L72:
            r1 = -208193444174266069(0xfd1c592a636d812b, double:-4.526294874008618E294)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L7c:
            r0 = 0
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.r():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gx] */
    private static final boolean z() {
        long j2 = e ^ 111618749371964L;
        Object objF9 = j2;
        try {
            objF9 = c.F9(objF9 >>> 8, (byte) (((objF9 ^ 131317660585889L) << 56) >>> 56));
            return objF9 != gx.DAMAGE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF9, 957941472261665148L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.ex] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.gx] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
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
            long r0 = su.catlean.ex.e
            r1 = 48631195289553(0x2c3ad51ec7d1, double:2.4027002908765E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 69064424021580(0x3ed05075de4c, double:3.41223592588756E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 8
            long r2 = r2 >>> r3
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 56
            long r2 = r2 << r3
            r3 = 56
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 136442941022743(0x7c1819082217, double:6.74117697768806E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -2540076764619188463(0xdcbfd5a3f6a65711, double:-5.923474291642211E138)
            r1 = r8
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ex r0 = su.catlean.ex.c     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            r1 = r15
            if (r1 == 0) goto L63
            r1 = r10
            r2 = r12
            byte r2 = (byte) r2     // Catch: kotlin.NoWhenBranchMatchedException -> L49 kotlin.NoWhenBranchMatchedException -> L59
            su.catlean.gx r0 = r0.F9(r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L49 kotlin.NoWhenBranchMatchedException -> L59
            su.catlean.gx r1 = su.catlean.gx.DAMAGE     // Catch: kotlin.NoWhenBranchMatchedException -> L49 kotlin.NoWhenBranchMatchedException -> L59
            if (r0 == r1) goto L81
            goto L53
        L49:
            r1 = -2547345176151220079(0xdca6030f0733a091, double:-2.047889439741821E138)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L59
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L59
        L53:
            su.catlean.ex r0 = su.catlean.ex.c     // Catch: kotlin.NoWhenBranchMatchedException -> L59
            goto L63
        L59:
            r1 = -2547345176151220079(0xdca6030f0733a091, double:-2.047889439741821E138)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L63:
            r1 = r13
            boolean r0 = r0.x(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L73
            r1 = r15
            if (r1 == 0) goto L7e
            if (r0 == 0) goto L81
            goto L7d
        L73:
            r1 = -2547345176151220079(0xdca6030f0733a091, double:-2.047889439741821E138)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L7d:
            r0 = 1
        L7e:
            goto L82
        L81:
            r0 = 0
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.h():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.ex] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.gx] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
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
            long r0 = su.catlean.ex.e
            r1 = 67544640168536(0x3d6e7648a258, double:3.33714862679823E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 52248061393861(0x2f84f323bbc5, double:2.5813972196511E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 8
            long r2 = r2 >>> r3
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 56
            long r2 = r2 << r3
            r3 = 56
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 120176311682974(0x6d4cba5e479e, double:5.93749870464675E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -5069270775977870687(0xb9a655165f91faa1, double:-5.505354905111538E-31)
            r1 = r8
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r15 = r0
            su.catlean.ex r0 = su.catlean.ex.c     // Catch: kotlin.NoWhenBranchMatchedException -> L49
            r1 = r15
            if (r1 != 0) goto L63
            r1 = r10
            r2 = r12
            byte r2 = (byte) r2     // Catch: kotlin.NoWhenBranchMatchedException -> L49 kotlin.NoWhenBranchMatchedException -> L59
            su.catlean.gx r0 = r0.F9(r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L49 kotlin.NoWhenBranchMatchedException -> L59
            su.catlean.gx r1 = su.catlean.gx.DAMAGE     // Catch: kotlin.NoWhenBranchMatchedException -> L49 kotlin.NoWhenBranchMatchedException -> L59
            if (r0 == r1) goto L81
            goto L53
        L49:
            r1 = -5102839667978025704(0xb92f125ba465c518, double:-2.9920969173389536E-33)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L59
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L59
        L53:
            su.catlean.ex r0 = su.catlean.ex.c     // Catch: kotlin.NoWhenBranchMatchedException -> L59
            goto L63
        L59:
            r1 = -5102839667978025704(0xb92f125ba465c518, double:-2.9920969173389536E-33)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L63:
            r1 = r13
            boolean r0 = r0.x(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L73
            r1 = r15
            if (r1 != 0) goto L7e
            if (r0 != 0) goto L81
            goto L7d
        L73:
            r1 = -5102839667978025704(0xb92f125ba465c518, double:-2.9920969173389536E-33)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L7d:
            r0 = 1
        L7e:
            goto L82
        L81:
            r0 = 0
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.C():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gx] */
    private static final boolean FZ() {
        long j2 = e ^ 12456844241057L;
        Object objF9 = j2;
        try {
            objF9 = c.F9(objF9 >>> 8, (byte) (((objF9 ^ 28307335524668L) << 56) >>> 56));
            return objF9 != gx.DAMAGE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF9, -5488159094593564703L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gx] */
    private static final boolean g() {
        long j2 = e ^ 28869832611985L;
        Object objF9 = j2;
        try {
            objF9 = c.F9(objF9 >>> 8, (byte) (((objF9 ^ 9531831943436L) << 56) >>> 56));
            return objF9 != gx.DAMAGE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF9, 280970799529295825L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gx] */
    private static final boolean F6() {
        long j2 = e ^ 25889607327812L;
        Object objF9 = j2;
        try {
            objF9 = c.F9(objF9 >>> 8, (byte) (((objF9 ^ 5915809036761L) << 56) >>> 56));
            return objF9 != gx.DAMAGE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF9, 4265815661666912004L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gx] */
    private static final boolean Fi() {
        long j2 = e ^ 26759819987676L;
        Object objF9 = j2;
        try {
            objF9 = c.F9(objF9 >>> 8, (byte) (((objF9 ^ 11802653725505L) << 56) >>> 56));
            return objF9 != gx.DAMAGE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF9, -7950199817446232676L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gx] */
    private static final boolean q() {
        long j2 = e ^ 103498290830725L;
        Object objF9 = j2;
        try {
            objF9 = c.F9(objF9 >>> 8, (byte) (((objF9 ^ 84435159942168L) << 56) >>> 56));
            return objF9 == gx.DAMAGE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF9, 500586840394398405L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gx] */
    private static final boolean F3() {
        long j2 = e ^ 103457294903714L;
        Object objF9 = j2;
        try {
            objF9 = c.F9(objF9 >>> 8, (byte) (((objF9 ^ 84604449255487L) << 56) >>> 56));
            return objF9 != gx.DAMAGE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF9, -948727704824148254L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gx] */
    private static final boolean Fc() {
        long j2 = e ^ 88892593154730L;
        Object objF9 = j2;
        try {
            objF9 = c.F9(objF9 >>> 8, (byte) (((objF9 ^ 72784363074359L) << 56) >>> 56));
            return objF9 != gx.DAMAGE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF9, 3593168734557916650L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gx] */
    private static final boolean B() {
        long j2 = e ^ 63644142160360L;
        Object objF9 = j2;
        try {
            objF9 = c.F9(objF9 >>> 8, (byte) (((objF9 ^ 47316767035509L) << 56) >>> 56));
            return objF9 != gx.DAMAGE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF9, 5953502347703430824L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gx] */
    private static final boolean a() {
        long j2 = e ^ 30473257847626L;
        Object objF9 = j2;
        try {
            objF9 = c.F9(objF9 >>> 8, (byte) (((objF9 ^ 10297701995223L) << 56) >>> 56));
            return objF9 != gx.DAMAGE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF9, -8053222822335943670L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gx] */
    private static final boolean p() {
        long j2 = e ^ 45719783170300L;
        Object objF9 = j2;
        try {
            objF9 = c.F9(objF9 >>> 8, (byte) (((objF9 ^ 65414264813921L) << 56) >>> 56));
            return objF9 != gx.DAMAGE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF9, 8902216377612502972L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gx] */
    private static final boolean w() {
        long j2 = e ^ 46095436881108L;
        Object objF9 = j2;
        try {
            objF9 = c.F9(objF9 >>> 8, (byte) (((objF9 ^ 64900903667017L) << 56) >>> 56));
            return objF9 != gx.DAMAGE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF9, 550291111701740436L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gx] */
    private static final boolean H() {
        long j2 = e ^ 107425057267003L;
        Object objF9 = j2;
        try {
            objF9 = c.F9(objF9 >>> 8, (byte) (((objF9 ^ 126827650335910L) << 56) >>> 56));
            return objF9 != gx.DAMAGE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF9, -4157862018364360069L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gx] */
    private static final boolean F2() {
        long j2 = e ^ 64782801110264L;
        Object objF9 = j2;
        try {
            objF9 = c.F9(objF9 >>> 8, (byte) (((objF9 ^ 43988764728677L) << 56) >>> 56));
            return objF9 != gx.DAMAGE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF9, 2274060383192114104L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gx] */
    private static final boolean v() {
        long j2 = e ^ 129728511453020L;
        Object objF9 = j2;
        try {
            objF9 = c.F9(objF9 >>> 8, (byte) (((objF9 ^ 113345273052865L) << 56) >>> 56));
            return objF9 != gx.DAMAGE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF9, -4887713150843305956L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gx] */
    private static final boolean G() {
        long j2 = e ^ 13701925427189L;
        Object objF9 = j2;
        try {
            objF9 = c.F9(objF9 >>> 8, (byte) (((objF9 ^ 33658569150056L) << 56) >>> 56));
            return objF9 != gx.DAMAGE;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF9, -3710364368433008459L, j2) /* invoke-custom */;
        }
    }

    private static final boolean Y(sy syVar) {
        return sy.Y((short) (r0 >>> 48), (int) ((((e ^ 121013438695962L) ^ 99638610151077L) << 16) >>> 32), syVar, false, 1, null, (short) ((r1 << 48) >>> 48));
    }

    private static final boolean g(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19 */
    private static final void Fd() {
        long j2 = e ^ 53963013250282L;
        long j3 = j2 ^ 106425476574079L;
        ex exVar = c;
        LinkedList linkedList = J;
        int i2 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5153464382029876266L, j2) /* invoke-custom */;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ?? r0 = 0;
            try {
                ((sy) it.next()).a(j3, ii.SWITCH);
                r0 = i2;
                if (r0 != 0 && i2 != 0) {
                }
                return;
            } catch (NoWhenBranchMatchedException unused) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 5160313879079762858L, j2) /* invoke-custom */;
            }
        }
    }

    public static final int m(int a2, ex $this, int a3, class_2338 pos, short a4) {
        return $this.u(pos, ((((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ e) ^ 42495886688316L);
    }

    public static final zy C(long a2, ex $this) {
        return $this.K((e ^ a2) ^ 36359399617068L);
    }

    public static final void C(ex $this, int slot, long a2, short a3, int from) {
        $this.Y(slot, from, (((a2 << 16) | ((((long) a3) << 48) >>> 48)) ^ e) ^ 126379515370600L);
    }

    public static final oh z(ex $this, long a2) {
        return $this.Ft((e ^ a2) ^ 119874971072399L);
    }

    public static final bu O(long a2, ex $this) {
        return $this.W((e ^ a2) ^ 108558635964245L);
    }

    public static final boolean T(long a2, ex $this) {
        return $this.Fk((e ^ a2) ^ 134824289929505L);
    }

    public static final class_2338 FO() {
        return S;
    }

    public static final boolean q(ex $this, int a2, int a3, class_2338 pos, int a4) {
        return $this.M(((((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ e) ^ 138409732247226L, pos);
    }

    public static final cy D(ex $this, long a2) {
        return $this.i((e ^ a2) ^ 9704949715829L);
    }

    public static final float K(ex $this, class_2680 state, class_2338 position, int slot, long a2, boolean ground) {
        return $this.U((e ^ a2) ^ 3187780139392L, state, position, slot, ground);
    }

    public static final ConcurrentHashMap s() {
        return m;
    }

    public static final boolean a(long a2, ex $this) {
        return $this.I((e ^ a2) ^ 26788845449223L);
    }

    public static final boolean S(ex $this, long a2) {
        return $this.j((e ^ a2) ^ 110721845598527L);
    }

    public static final boolean T(long a2, ex $this, class_2338 bp) {
        return $this.K((e ^ a2) ^ 100356085073593L, bp);
    }

    public static final boolean g(long a2, ex $this) {
        return $this.n((e ^ a2) ^ 5034876300335L);
    }

    public static final bg FU() {
        return K;
    }

    public static final void a(class_2338 class_2338Var) {
        i = class_2338Var;
    }

    public static void h(String str) {
        g = str;
    }

    public static String Q() {
        return g;
    }

    private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException noWhenBranchMatchedException) {
        return noWhenBranchMatchedException;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 5152;
        if (j[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) k.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                j[i3] = b(((Cipher) objArr[0]).doFinal(f[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/ex", e2);
            }
        }
        return j[i3];
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
            java.lang.String r1 = "su/catlean/ex"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 4227;
        if (C[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) u[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) N.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    N.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/ex", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            C[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return C[i3].intValue();
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
            java.lang.String r1 = "su/catlean/ex"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static long e(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 4927;
        if (P[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) O[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) W.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    W.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/ex", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            P[i3] = Long.valueOf(((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255));
        }
        return P[i3].longValue();
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
            java.lang.String r1 = "su/catlean/ex"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ex.e(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
