package su.catlean;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_10017;
import net.minecraft.class_10039;
import net.minecraft.class_12075;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_2480;
import net.minecraft.class_276;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_6364;
import net.minecraft.class_9288;
import net.minecraft.class_9334;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2fStack;
import su.catlean.api.event.GofraState;
import su.catlean.api.event.events.render.FrameBufferEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.GameRendererAccessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/kn.class */
public final class kn extends _g {

    @NotNull
    public static final kn n = null;
    static final KProperty[] T = null;

    @NotNull
    private static final cw S = null;

    @NotNull
    private static final cw z = null;

    @NotNull
    private static final cq t = null;

    @NotNull
    private static final cq y = null;

    @NotNull
    private static final cq Y = null;

    @NotNull
    private static final cs i = null;

    @NotNull
    private static final cs w = null;

    @NotNull
    private static final cs G = null;

    @NotNull
    private static final ct x = null;

    @NotNull
    private static final cw U = null;

    @NotNull
    private static final cr V = null;

    @Nullable
    private static class_6364 D;
    private static boolean m;

    @NotNull
    private static final ab J = null;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map d = null;
    private static final long[] e = null;
    private static final Integer[] f = null;
    private static final Map g = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private kn(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6152, 8391759215724332785L ^ j2) /* invoke-custom */, jt.z(), null, 4, null, j2 ^ 129223921109236L);
    }

    private final w e(long j) {
        return (w) S.E(this, (a ^ j) ^ 52464296450790L, T[0]);
    }

    private final r3 Y(long j) {
        return (r3) z.E(this, (a ^ j) ^ 123235685179575L, T[1]);
    }

    private final boolean A(long j) {
        return ((Boolean) t.E(this, (a ^ j) ^ 10027560744056L, T[2])).booleanValue();
    }

    private final boolean z(long j) {
        return ((Boolean) y.E(this, (a ^ j) ^ 28553261047430L, T[3])).booleanValue();
    }

    private final boolean V(char c2, short s, int i2) {
        return ((Boolean) Y.E(this, ((((((long) c2) << 48) | ((((long) s) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a) ^ 96525055924676L, T[4])).booleanValue();
    }

    private final Color n(long j) {
        return (Color) i.E(this, (a ^ j) ^ 54401840830824L, T[5]);
    }

    private final Color x(long j) {
        long j2 = a ^ j;
        return (Color) w.E(this, j2 ^ 66032515287566L, T[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25292, 6886321005044011683L ^ j2) /* invoke-custom */]);
    }

    private final Color W(long j) {
        long j2 = a ^ j;
        return (Color) G.E(this, j2 ^ 6594900916761L, T[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30029, 4990969382782891321L ^ j2) /* invoke-custom */]);
    }

    private final float t(long j) {
        long j2 = a ^ j;
        return ((Number) x.E(this, j2 ^ 61270252899032L, T[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8871, 5359910448508736009L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final void s(float f2, long j) {
        long j2 = a ^ j;
        x.b(this, j2 ^ 31635899803321L, T[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8871, 5359886841194785156L ^ j2) /* invoke-custom */], Float.valueOf(f2));
    }

    private final gh C(long j) {
        long j2 = a ^ j;
        return (gh) U.E(this, j2 ^ 60669983799594L, T[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30967, 4687793929078553525L ^ j2) /* invoke-custom */]);
    }

    private final nv D(long j) {
        long j2 = a ^ j;
        return (nv) V.E(this, j2 ^ 95212700929760L, T[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3434, 669220586645846511L ^ j2) /* invoke-custom */]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Flow
    private final void l(FrameBufferEvent frameBufferEvent) {
        Object obj = a ^ 123778845986472L;
        try {
            try {
                if (D != null) {
                    obj = m;
                    if (obj != 0) {
                        frameBufferEvent.setFrameBuffer((class_276) D);
                        frameBufferEvent.cancel();
                    }
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1678810318842501602L, obj) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1678810318842501602L, obj) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00ff: INVOKE (r-1 I:su.catlean.kn), (r0 I:long), (r1 I:net.minecraft.class_4587) DIRECT call: su.catlean.kn.d(long, net.minecraft.class_4587):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void y(su.catlean.api.event.events.render.Render3DEvent r12) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kn.y(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0406: INVOKE 
          (r-1 I:su.catlean.c6)
          (r0 I:org.joml.Matrix3x2fStack)
          (r1 I:java.lang.String)
          (r2 I:float)
          (r3 I:float)
          (r4 I:long)
          (r5 I:java.awt.Color)
          (r6 I:boolean)
          (r7 I:int)
          (r8 I:int)
          (r9 I:java.lang.Object)
         STATIC call: su.catlean.c6.W(su.catlean.c6, org.joml.Matrix3x2fStack, java.lang.String, float, float, long, java.awt.Color, boolean, int, int, java.lang.Object):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void O(su.catlean.api.event.events.render.Render2DEvent r25) {
        /*
            Method dump skipped, instruction units count: 2212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kn.O(su.catlean.api.event.events.render.Render2DEvent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x007f, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x007f, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00fb, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00fb, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00fb, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00fb, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:23:0x0105, B:66:0x01cb], limit reached: 94 */
    /* JADX WARN: Path cross not found for [B:49:0x0178, B:58:0x019c], limit reached: 94 */
    /* JADX WARN: Path cross not found for [B:58:0x019c, B:49:0x0178], limit reached: 94 */
    /* JADX WARN: Path cross not found for [B:66:0x01cb, B:23:0x0105], limit reached: 94 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019f A[EDGE_INSN: B:59:0x019f->B:96:0x00fb BREAK  A[LOOP:3: B:22:0x0102->B:97:?]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0152 A[EXC_TOP_SPLITTER, PHI: r0 r1
  0x0152: PHI (r0v40 ??) = (r0v67 ??), (r0v68 ??), (r0v61 ??) binds: [B:25:0x0118, B:27:0x011d, B:39:0x014b] A[DONT_GENERATE, DONT_INLINE]
  0x0152: PHI (r1v26 net.minecraft.class_1297) = (r1v25 net.minecraft.class_1297), (r1v25 net.minecraft.class_1297), (r1v47 net.minecraft.class_1297) binds: [B:25:0x0118, B:27:0x011d, B:39:0x014b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.minecraft.class_1542] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [double] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01e8 -> B:6:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List K(long r9) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kn.K(long):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [net.minecraft.class_9288] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, net.minecraft.class_1792] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.minecraft.class_1799] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [int] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5, types: [int] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [int] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4, types: [int] */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private final void y(class_332 class_332Var, long j, class_1799 class_1799Var, float f2) {
        long j2 = a ^ j;
        long j3 = j2 ^ 81155752820577L;
        int i2 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6695367239870909442L, j2) /* invoke-custom */;
        ?? r0 = i2;
        if (r0 != 0) {
            return;
        }
        try {
            try {
                r0 = (class_9288) class_1799Var.method_58694(class_9334.field_49622);
                if (r0 == 0) {
                    return;
                }
                ?? Method_7909 = class_1799Var.method_7909();
                Intrinsics.checkNotNullExpressionValue(Method_7909, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(987, 3396720896409036592L ^ j2) /* invoke-custom */);
                try {
                    try {
                        Method_7909 = Method_7909 instanceof class_1747;
                        int i3 = i2;
                        ?? r02 = Method_7909;
                        ?? r03 = Method_7909;
                        if (j2 >= 0) {
                            if (i3 == 0) {
                                if (Method_7909 == 0) {
                                    return;
                                } else {
                                    r02 = ((class_1747) Method_7909).method_7711() instanceof class_2480;
                                }
                            }
                            i3 = i2;
                            r03 = r02;
                        }
                        ?? IsEmpty = r03;
                        ?? r04 = r03;
                        if (j2 > 0) {
                            if (i3 == 0) {
                                if (r03 == 0) {
                                    return;
                                } else {
                                    IsEmpty = r0.method_57489().toList().isEmpty();
                                }
                            }
                            i3 = i2;
                            r04 = IsEmpty;
                        }
                        if (i3 == 0) {
                            if (r04 != 0) {
                                return;
                            }
                            ab abVar = J;
                            Matrix3x2fStack matrix3x2fStackMethod_51448 = class_332Var.method_51448();
                            Intrinsics.checkNotNullExpressionValue(matrix3x2fStackMethod_51448, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10600, 4037936622195395979L ^ j2) /* invoke-custom */);
                            abVar.K(matrix3x2fStackMethod_51448, 12.0f, -79.0f, 169.0f, 60.0f, 2.0f);
                            r04 = 0;
                        }
                        ?? r23 = r04;
                        ?? r24 = 0;
                        Iterator it = r0.method_57489().toList().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ?? r05 = (class_1799) it.next();
                                try {
                                    class_332Var.method_51427((class_1799) r05, (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10138, 1935069880119669703L ^ j2) /* invoke-custom */ + ((r24 == true ? 1 : 0) * (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2756, 7338352021575868033L ^ j2) /* invoke-custom */), (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1686, 5048235027394532061L ^ j2) /* invoke-custom */ + ((r23 == true ? 1 : 0) * (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10645, 7559438330794065371L ^ j2) /* invoke-custom */));
                                    class_332Var.method_51431(zf.F(j3).field_1772, (class_1799) r05, (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4955, 3677491537245538055L ^ j2) /* invoke-custom */ + ((r24 == true ? 1 : 0) * (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10645, 7559438330794065371L ^ j2) /* invoke-custom */), (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6288, 8497743674336611538L ^ j2) /* invoke-custom */ + ((r23 == true ? 1 : 0) * (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10645, 7559438330794065371L ^ j2) /* invoke-custom */));
                                    r24++;
                                    r05 = r24;
                                    if (j2 >= 0) {
                                        if (i2 == 0) {
                                            if (r05 >= (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30278, 2463566193423540750L ^ j2) /* invoke-custom */) {
                                                r05 = 0;
                                            } else {
                                                continue;
                                            }
                                        }
                                        r24 = r05;
                                        r23++;
                                        r05 = i2;
                                    }
                                    if (r05 == 0) {
                                        continue;
                                    }
                                } catch (NumberFormatException unused) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r05, -6662052847058834138L, j2) /* invoke-custom */;
                                }
                            }
                            if (j2 > 0) {
                                return;
                            }
                        }
                    } catch (NumberFormatException unused2) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_7909, -6662052847058834138L, j2) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused3) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_7909, -6662052847058834138L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused4) {
                r0 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6662052847058834138L, j2) /* invoke-custom */;
                throw r0;
            }
        } catch (NumberFormatException unused5) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6662052847058834138L, j2) /* invoke-custom */;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: net.minecraft.class_1297 */
    /* JADX WARN: Multi-variable type inference failed */
    private final void d(long j, class_4587 class_4587Var) throws class_1297 {
        class_1297 class_1297VarF;
        boolean zMethod_3950;
        long j2 = a ^ j;
        long j3 = j2 ^ 98982580791190L;
        long j4 = j2 ^ 87330189688773L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j4 << 32) >>> 48);
        int i4 = (int) ((j4 << 48) >>> 48);
        long j5 = j2 ^ 12694673282228L;
        int i5 = (int) (j2 >>> 48);
        int i6 = (int) ((j5 << 16) >>> 32);
        int i7 = (int) ((j5 << 48) >>> 48);
        int i8 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-310836467331043637L, j2) /* invoke-custom */;
        class_4184 class_4184VarMethod_19418 = zf.F(j3).field_1773.method_19418();
        Intrinsics.checkNotNullExpressionValue(class_4184VarMethod_19418, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31062, 6545231271461569905L ^ j2) /* invoke-custom */);
        double dN = zi.v.n(i2, (char) i3, i4);
        Object objMethod_41753 = zf.F(j3).field_1690.method_42435().method_41753();
        Intrinsics.checkNotNullExpressionValue(objMethod_41753, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24764, 3479393242690018453L ^ j2) /* invoke-custom */);
        boolean zBooleanValue = ((Boolean) objMethod_41753).booleanValue();
        zf.F(j3).field_1690.method_42435().method_41748(false);
        GofraState.INSTANCE.setModifyBuffer(true);
        m = true;
        RenderSystem.backupProjectionMatrix();
        GameRendererAccessor gameRendererAccessor = zf.F(j3).field_1773;
        Intrinsics.checkNotNull(gameRendererAccessor, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16835, 2435656919906254311L ^ j2) /* invoke-custom */);
        RenderSystem.setProjectionMatrix(gameRendererAccessor.getLevelProjectionMatrixBuffer().method_71123(zi.v.s()), RenderSystem.getProjectionType());
        Iterator it = p((char) i5, i6, (char) i7).iterator();
        loop0: while (true) {
            boolean zHasNext = it.hasNext();
            while (zHasNext != 0) {
                class_1297VarF = (class_1542) it.next();
                try {
                    try {
                        class_1297VarF = zf.F(j3);
                        if (j2 <= 0) {
                            break loop0;
                        }
                        zMethod_3950 = class_1297VarF.method_1561().method_3950(class_1297VarF, zi.v.K(), class_4184VarMethod_19418.method_71156().field_1352, class_4184VarMethod_19418.method_71156().field_1351, class_4184VarMethod_19418.method_71156().field_1350);
                        if (i8 == 0) {
                            break loop0;
                        }
                        if (!zMethod_3950) {
                            zHasNext = i8;
                            if (j2 >= 0) {
                                if (zHasNext != 0) {
                                    continue;
                                }
                            }
                        }
                        double dMethod_16436 = class_3532.method_16436(dN, ((class_1542) class_1297VarF).field_6038, class_1297VarF.method_23317()) - class_4184VarMethod_19418.method_71156().field_1352;
                        double dMethod_164362 = class_3532.method_16436(dN, ((class_1542) class_1297VarF).field_5971, class_1297VarF.method_23318()) - class_4184VarMethod_19418.method_71156().field_1351;
                        double dMethod_164363 = class_3532.method_16436(dN, ((class_1542) class_1297VarF).field_5989, class_1297VarF.method_23321()) - class_4184VarMethod_19418.method_71156().field_1350;
                        class_10017 class_10017VarMethod_62425 = zf.F(j3).method_1561().method_3953(class_1297VarF).method_62425(class_1297VarF, zi.v.n(i2, (char) i3, i4));
                        Intrinsics.checkNotNull(class_10017VarMethod_62425, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21435, 7929775770884796331L ^ j2) /* invoke-custom */);
                        class_10017 class_10017Var = (class_10039) class_10017VarMethod_62425;
                        GameRendererAccessor gameRendererAccessor2 = zf.F(j3).field_1773;
                        Intrinsics.checkNotNull(gameRendererAccessor2, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2304, 1808216263985935662L ^ j2) /* invoke-custom */);
                        class_12075 class_12075Var = gameRendererAccessor2.getLevelRenderState().field_63082;
                        Intrinsics.checkNotNullExpressionValue(class_12075Var, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13574, 5881597853955033389L ^ j2) /* invoke-custom */);
                        zf.F(j3).method_1561().method_72976(class_10017Var, class_12075Var, dMethod_16436, dMethod_164362, dMethod_164363, class_4587Var, zf.F(j3).field_1773.method_72910());
                        if (i8 == 0) {
                            break;
                        }
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_1297VarF, -325189419224140335L, j2) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused2) {
                    class_1297VarF = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_1297VarF, -325189419224140335L, j2) /* invoke-custom */;
                    throw class_1297VarF;
                }
            }
            break loop0;
        }
        zf.F(j3).field_1773.method_72911().method_73002();
        zf.F(j3).method_22940().method_23000().method_22993();
        zf.F(j3).field_1773.method_72910().method_72953();
        RenderSystem.restoreProjectionMatrix();
        if (j2 > 0) {
            zMethod_3950 = false;
            m = zMethod_3950;
            GofraState.INSTANCE.setModifyBuffer(false);
            class_1297VarF = zf.F(j3);
            ((class_310) class_1297VarF).field_1690.method_42435().method_41748(Boolean.valueOf(zBooleanValue));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df A[PHI: r0 r1
  0x00df: PHI (r0v22 ??) = (r0v39 ??), (r0v40 ??), (r0v41 ??) binds: [B:18:0x00a3, B:20:0x00a8, B:25:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x00df: PHI (r1v22 int) = (r1v21 int), (r1v21 int), (r1v32 int) binds: [B:18:0x00a3, B:20:0x00a8, B:25:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.minecraft.class_6364] */
    /* JADX WARN: Type inference failed for: r0v16, types: [net.minecraft.class_276] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i(int r8, char r9, int r10) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kn.i(int, char, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015a A[PHI: r0
  0x015a: PHI (r0v32 ??) = (r0v59 ??), (r0v33 ??) binds: [B:32:0x0135, B:40:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0164 -> B:30:0x0109). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List p(char r10, int r11, char r12) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kn.p(char, int, char):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private final boolean G(class_1799 class_1799Var, long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 112443391900790L;
        long j4 = j2 ^ 8735955930044L;
        Object obj = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7468458617559347906L, j2) /* invoke-custom */;
        try {
            try {
                obj = n6.l[C(j4).ordinal()];
                boolean zContains = obj;
                if (obj != 0) {
                    switch (obj) {
                        case 1:
                            return true;
                        case 2:
                            return D(j3).x().contains(class_1799Var.method_7909());
                        default:
                            zContains = D(j3).x().contains(class_1799Var.method_7909());
                            break;
                    }
                }
                return obj != 0 ? zContains == 0 : zContains;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -7455240344687831516L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -7455240344687831516L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.w] */
    private static final boolean L() {
        long j = a ^ 53218249091778L;
        Object objE = j;
        try {
            objE = n.e(objE ^ 104527222029344L);
            return objE == w.SHADER;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objE, -8297343425211956620L, j) /* invoke-custom */;
        }
    }

    private static final boolean w() {
        return n.A((a ^ 84937004051415L) ^ 5368308798379L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.kn] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.w] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.r3] */
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
    private static final boolean T() {
        /*
            long r0 = su.catlean.kn.a
            r1 = 134222263670032(0x7a130e58d510, double:6.63146093864084E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 82217409722787(0x4ac6bb8039a3, double:4.0620797634083E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 23523460236274(0x1564fb7dc3f2, double:1.16221335740556E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 8347631346487617212(0x73d8be7b634f66bc, double:1.107254766333196E250)
            r1 = r7
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.kn r0 = su.catlean.kn.n     // Catch: java.lang.NumberFormatException -> L37
            r1 = r13
            if (r1 == 0) goto L51
            r1 = r9
            su.catlean.r3 r0 = r0.Y(r1)     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            su.catlean.r3 r1 = su.catlean.r3.DEFAULT     // Catch: java.lang.NumberFormatException -> L37 java.lang.NumberFormatException -> L47
            if (r0 == r1) goto L5c
            goto L41
        L37:
            r1 = 8289895909393464742(0x730ba068685c7da6, double:1.5090853621924972E246)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L41:
            su.catlean.kn r0 = su.catlean.kn.n     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = 8289895909393464742(0x730ba068685c7da6, double:1.5090853621924972E246)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            r1 = r11
            su.catlean.w r0 = r0.e(r1)     // Catch: java.lang.NumberFormatException -> L60
            su.catlean.w r1 = su.catlean.w.SHADER     // Catch: java.lang.NumberFormatException -> L60
            if (r0 != r1) goto L6a
        L5c:
            r0 = 1
            goto L6b
        L60:
            r1 = 8289895909393464742(0x730ba068685c7da6, double:1.5090853621924972E246)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6a:
            r0 = 0
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kn.T():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gh] */
    private static final boolean a() {
        long j = a ^ 35679850799070L;
        Object objC = j;
        try {
            objC = n.C(objC ^ 96337037486832L);
            return objC != gh.NONE;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objC, -5060363693027379352L, j) /* invoke-custom */;
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

    private static String b(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 18135;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/kn", e2);
            }
        }
        return c[i3];
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
            r1 = 1
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
            java.lang.String r1 = "su/catlean/kn"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kn.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 13926;
        if (f[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) g.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/kn", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            f[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return f[i3].intValue();
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
            r1 = 1
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
            java.lang.String r1 = "su/catlean/kn"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kn.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
