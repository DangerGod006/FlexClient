package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import net.minecraft.class_10055;
import net.minecraft.class_124;
import net.minecraft.class_1293;
import net.minecraft.class_1657;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_1934;
import net.minecraft.class_2480;
import net.minecraft.class_332;
import net.minecraft.class_408;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_9288;
import net.minecraft.class_9334;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2fStack;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.api.event.events.render.RenderNameTagEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ko.class */
public final class ko extends _g {

    @NotNull
    public static final ko u = null;
    static final KProperty[] N = null;

    @NotNull
    private static final cw m = null;

    @NotNull
    private static final cw P = null;

    @NotNull
    private static final cp y = null;

    @NotNull
    private static final cq U = null;

    @NotNull
    private static final cq n = null;

    @NotNull
    private static final cq A = null;

    @NotNull
    private static final cq K = null;

    @NotNull
    private static final cq x = null;

    @NotNull
    private static final cq t = null;

    @NotNull
    private static final cq j = null;

    @NotNull
    private static final cq I = null;

    @NotNull
    private static final cq O = null;

    @NotNull
    private static final cp S = null;

    @NotNull
    private static final cq c = null;

    @NotNull
    private static final cq e = null;

    @NotNull
    private static final cs z = null;

    @NotNull
    private static final cs b = null;

    @NotNull
    private static final cs o = null;

    @NotNull
    private static final cs Y = null;

    @NotNull
    private static final cw d = null;

    @NotNull
    private static final cw F = null;

    @NotNull
    private static final cw k = null;

    @NotNull
    private static final Map D = null;

    @NotNull
    private static final bj J = null;

    @NotNull
    private static fd X;

    @NotNull
    private static final ab a = null;

    @NotNull
    private static final ab l = null;

    @NotNull
    private static final Map f = null;

    @NotNull
    private static String G;
    private static int[] E;
    private static final long g = 0;
    private static final String[] h = null;
    private static final String[] i = null;
    private static final Map w = null;
    private static final long[] B = null;
    private static final Integer[] C = null;
    private static final Map L = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private ko(long j2) {
        long j3 = g ^ j2;
        super((String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8754, 1028481503618279848L ^ j3) /* invoke-custom */, jt.z(), null, 4, null, j3 ^ 95458967973398L);
    }

    @NotNull
    public final at q(long j2) {
        return (at) m.E(this, (g ^ j2) ^ 12284422316867L, N[0]);
    }

    private final al R(short s, int i2, char c2) {
        return (al) P.E(this, ((((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c2) << 48) >>> 48)) ^ g) ^ 104533027606572L, N[1]);
    }

    private final h n(long j2) {
        return (h) y.E(this, (g ^ j2) ^ 42040615043911L, N[2]);
    }

    private final boolean g(long j2) {
        return ((Boolean) U.E(this, (g ^ j2) ^ 94671285752790L, N[3])).booleanValue();
    }

    private final boolean T(long j2) {
        return ((Boolean) n.E(this, (g ^ j2) ^ 65127695547012L, N[4])).booleanValue();
    }

    private final boolean C(long j2) {
        return ((Boolean) A.E(this, (g ^ j2) ^ 104408464684215L, N[5])).booleanValue();
    }

    private final boolean I(long j2) {
        long j3 = g ^ j2;
        return ((Boolean) K.E(this, j3 ^ 122182968194715L, N[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17715, 6827358283901805262L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean L(long j2) {
        long j3 = g ^ j2;
        return ((Boolean) x.E(this, j3 ^ 120877041323551L, N[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12630, 1332319865276034581L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean v(long j2) {
        long j3 = g ^ j2;
        return ((Boolean) t.E(this, j3 ^ 25109807033819L, N[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3672, 4323894993673532128L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean K(long j2) {
        long j3 = g ^ j2;
        return ((Boolean) j.E(this, j3 ^ 103333641934968L, N[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13627, 8840721954746711066L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean M(int i2, short s, char c2) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ g;
        return ((Boolean) I.E(this, j2 ^ 132433495483259L, N[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26137, 6884479538196730907L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean t(long j2) {
        long j3 = g ^ j2;
        return ((Boolean) O.E(this, j3 ^ 21049268640260L, N[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9997, 4525604037407370339L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final h Q(long j2) {
        long j3 = g ^ j2;
        return (h) S.E(this, j3 ^ 107035510800930L, N[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30766, 373320876385774373L ^ j3) /* invoke-custom */]);
    }

    private final boolean w(long j2) {
        long j3 = g ^ j2;
        return ((Boolean) c.E(this, j3 ^ 17850237562828L, N[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7548, 332687016057529323L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean h(long j2, byte b2) {
        long j3 = ((j2 << 8) | ((((long) b2) << 56) >>> 56)) ^ g;
        return ((Boolean) e.E(this, j3 ^ 68685232210301L, N[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13876, 173618219593229917L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final Color r(long j2) {
        long j3 = g ^ j2;
        return (Color) z.E(this, j3 ^ 57201348376232L, N[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23296, 5381981268639382687L ^ j3) /* invoke-custom */]);
    }

    private final Color P(int i2, short s, short s2) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ g;
        return (Color) b.E(this, j2 ^ 90874723388890L, N[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12006, 2636110750261097027L ^ j2) /* invoke-custom */]);
    }

    private final Color B(long j2) {
        long j3 = g ^ j2;
        return (Color) o.E(this, j3 ^ 22274872803000L, N[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15566, 8738241117106508604L ^ j3) /* invoke-custom */]);
    }

    private final Color j(long j2) {
        long j3 = g ^ j2;
        return (Color) Y.E(this, j3 ^ 120057496339055L, N[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8307, 5976654593378054958L ^ j3) /* invoke-custom */]);
    }

    private final yu Z(long j2) {
        long j3 = g ^ j2;
        return (yu) d.E(this, j3 ^ 109291727334918L, N[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15243, 2798014206530503840L ^ j3) /* invoke-custom */]);
    }

    private final m7 e(long j2) {
        long j3 = g ^ j2;
        return (m7) F.E(this, j3 ^ 112904450858354L, N[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6516, 533671745816958328L ^ j3) /* invoke-custom */]);
    }

    @NotNull
    public final _j H(long j2) {
        long j3 = g ^ j2;
        return (_j) k.E(this, j3 ^ 74798583686300L, N[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27584, 7914098340675165792L ^ j3) /* invoke-custom */]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean.api.event.events.render.RenderNameTagEvent] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean.api.event.events.render.RenderNameTagEvent] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.RuntimeException, java.lang.Throwable] */
    @Flow
    private final void u(RenderNameTagEvent renderNameTagEvent) {
        long j2 = g ^ 120589302831930L;
        int i2 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8057567392862541750L, j2) /* invoke-custom */;
        ?? r0 = renderNameTagEvent;
        ?? r02 = r0;
        if (i2 == 0) {
            try {
                try {
                    r0 = r0.getState() instanceof class_10055;
                    if (r0 == 0) {
                        return;
                    } else {
                        r02 = renderNameTagEvent;
                    }
                } catch (NoWhenBranchMatchedException unused) {
                    r0 = (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 8041877943629443956L, j2) /* invoke-custom */;
                    throw r0;
                }
            } catch (NoWhenBranchMatchedException unused2) {
                throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 8041877943629443956L, j2) /* invoke-custom */;
            }
        }
        r02.cancel();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x01c6: INVOKE (r-1 I:su.catlean.fd), (r0 I:long), (r1 I:float) VIRTUAL call: su.catlean.fd.B(long, float):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void K(su.catlean.api.event.events.render.Render2DEvent r18) {
        /*
            Method dump skipped, instruction units count: 2311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ko.K(su.catlean.api.event.events.render.Render2DEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean.api.event.events.client.InputEvent] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Flow
    private final void l(InputEvent inputEvent) {
        long j2 = g ^ 72989881740599L;
        long j3 = j2 ^ 19043003827493L;
        long j4 = j2 ^ 137924300778085L;
        long j5 = j2 ^ 64344161890834L;
        long j6 = j2 ^ 25371190359660L;
        long j7 = j2 ^ 99237812430096L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j7 << 32) >>> 48);
        int i4 = (int) ((j7 << 48) >>> 48);
        long j8 = j2 ^ 49087180584218L;
        int i5 = (int) (j2 >>> 48);
        int i6 = (int) ((j8 << 16) >>> 32);
        int i7 = (int) ((j8 << 48) >>> 48);
        Object objIsBlank = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6425180028596572453L, j2) /* invoke-custom */;
        try {
            objIsBlank = StringsKt.isBlank(G);
            Object obj = objIsBlank;
            if (objIsBlank != 0) {
                obj = objIsBlank == 0 ? 1 : 0;
            }
            try {
                try {
                    if (obj != 0) {
                        try {
                            try {
                                obj = zf.F(j3).field_1755 instanceof class_408;
                                if (obj != 0) {
                                    InputEvent inputEvent2 = inputEvent;
                                    Object objY = inputEvent2;
                                    if (objIsBlank != 0) {
                                        if (inputEvent2.getAction() != InputEvent.Action.Press) {
                                            return;
                                        } else {
                                            objY = inputEvent;
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (objY.getDevice() == InputEvent.Device.Mouse) {
                                                        objY = c7.b.Y(j4, G);
                                                        if (objIsBlank != 0) {
                                                            if (objY != 0) {
                                                                c7.b.j(j5, G);
                                                                o2.S(this, class_124.field_1061 + G + class_124.field_1080 + " " + o2.Z(i2, this, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31872, 4271044210682237341L ^ j2) /* invoke-custom */, new Object[0], (char) i3, false, 4, null, (short) i4), false, 2, null, j6);
                                                                if (objIsBlank != 0) {
                                                                    return;
                                                                }
                                                            }
                                                            c7.b.h((char) i5, i6, (short) i7, G);
                                                        }
                                                        o2.S(this, class_124.field_1060 + G + class_124.field_1080 + " " + o2.Z(i2, this, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21850, 2757146768669063218L ^ j2) /* invoke-custom */, new Object[0], (char) i3, false, 4, null, (short) i4), false, 2, null, j6);
                                                    }
                                                } catch (NoWhenBranchMatchedException unused) {
                                                    throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objY, 6455719504182953337L, j2) /* invoke-custom */;
                                                }
                                            } catch (NoWhenBranchMatchedException unused2) {
                                                throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objY, 6455719504182953337L, j2) /* invoke-custom */;
                                            }
                                        } catch (NoWhenBranchMatchedException unused3) {
                                            throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objY, 6455719504182953337L, j2) /* invoke-custom */;
                                        }
                                    } catch (NoWhenBranchMatchedException unused4) {
                                        throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objY, 6455719504182953337L, j2) /* invoke-custom */;
                                    }
                                }
                            } catch (NoWhenBranchMatchedException unused5) {
                                throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6455719504182953337L, j2) /* invoke-custom */;
                            }
                        } catch (NoWhenBranchMatchedException unused6) {
                            throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6455719504182953337L, j2) /* invoke-custom */;
                        }
                    }
                } catch (NoWhenBranchMatchedException unused7) {
                    throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6455719504182953337L, j2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused8) {
                throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6455719504182953337L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused9) {
            throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objIsBlank, 6455719504182953337L, j2) /* invoke-custom */;
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
    private final float j(net.minecraft.class_1657 r17, net.minecraft.class_332 r18, double r19, double r21, long r23) {
        /*
            Method dump skipped, instruction units count: 1368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ko.j(net.minecraft.class_1657, net.minecraft.class_332, double, double, long):float");
    }

    /*  JADX ERROR: Failed to decode insn: 0x01CB: MOVE_MULTI
        java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for object array[14]
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
    private final java.lang.String c(long r15, net.minecraft.class_1657 r17) {
        /*
            Method dump skipped, instruction units count: 1044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ko.c(long, net.minecraft.class_1657):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0373, code lost:
    
        if (r0 < 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0376, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fe A[PHI: r0
  0x01fe: PHI (r0v45 ??) = (r0v106 ??), (r0v107 ??) binds: [B:46:0x01eb, B:48:0x01f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023f A[PHI: r0
  0x023f: PHI (r0v47 ??) = (r0v109 ??), (r0v110 ??) binds: [B:62:0x0228, B:64:0x022e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c6 A[EXC_TOP_SPLITTER, PHI: r0
  0x00c6: PHI (r0v19 ??) = (r0v103 ??), (r0v104 ??) binds: [B:9:0x00be, B:11:0x00c3] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fe A[EXC_TOP_SPLITTER, PHI: r0
  0x00fe: PHI (r0v27 ??) = (r0v112 ??), (r0v113 ??), (r0v114 ??) binds: [B:13:0x00d1, B:15:0x00d6, B:20:0x00e9] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v15, types: [su.catlean.jl] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.RuntimeException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.minecraft.class_1917] */
    /* JADX WARN: Type inference failed for: r0v27, types: [net.minecraft.class_1917] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.RuntimeException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r0v33, types: [net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [int] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.RuntimeException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [int] */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v72, types: [su.catlean.c6] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.RuntimeException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [int] */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.Object, net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r2v23, types: [double, long] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
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
    private final void B(long r16, net.minecraft.class_332 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ko.B(long, net.minecraft.class_332):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:40:0x012d
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void j(long r16, net.minecraft.class_332 r18) {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ko.j(long, net.minecraft.class_332):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [net.minecraft.class_640] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    public final int F(@NotNull class_1657 entity, long a2) {
        long j2 = g ^ a2;
        long j3 = j2 ^ 18369806602822L;
        int i2 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3549939384199989544L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(entity, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14399, 2297442157680444010L ^ j2) /* invoke-custom */);
        class_634 class_634VarMethod_1562 = i2;
        if (class_634VarMethod_1562 != 0) {
            return 0;
        }
        try {
            try {
                try {
                    class_634VarMethod_1562 = zf.F(j3).method_1562();
                    if (class_634VarMethod_1562 != 0) {
                        Object objMethod_2871 = class_634VarMethod_1562.method_2871(entity.method_5667());
                        if (j2 < 0 || objMethod_2871 != 0) {
                            try {
                                objMethod_2871 = objMethod_2871.method_2959();
                                if (j2 > 0) {
                                    if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3576247472627396401L, j2) /* invoke-custom */ != null) {
                                        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(i2 + 1, -3564463492411097008L, j2) /* invoke-custom */;
                                    }
                                }
                                return objMethod_2871;
                            } catch (NoWhenBranchMatchedException unused) {
                                throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_2871, -3534108223058193894L, j2) /* invoke-custom */;
                            }
                        }
                    }
                    return 0;
                } catch (NoWhenBranchMatchedException unused2) {
                    throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_634VarMethod_1562, -3534108223058193894L, j2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused3) {
                throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_634VarMethod_1562, -3534108223058193894L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused4) {
            throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_634VarMethod_1562, -3534108223058193894L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [net.minecraft.class_1934] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    private final class_1934 Y(long j2, class_1657 class_1657Var) {
        Object objMethod_2958;
        long j3 = g ^ j2;
        long j4 = j3 ^ 61142793036482L;
        if (class_1657Var != null && j3 >= 0) {
            try {
                class_634 class_634VarMethod_1562 = zf.F(j4).method_1562();
                Intrinsics.checkNotNull(class_634VarMethod_1562);
                class_640 class_640VarMethod_2871 = class_634VarMethod_1562.method_2871(class_1657Var.method_5667());
                if (class_640VarMethod_2871 != null) {
                    objMethod_2958 = class_640VarMethod_2871.method_2958();
                    return objMethod_2958;
                }
            } catch (NoWhenBranchMatchedException unused) {
                throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_2958, 9110910024542970526L, j3) /* invoke-custom */;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [int, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private final String x(class_1934 class_1934Var, long j2) {
        long j3 = g ^ j2;
        ?? r0 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2886146084352217194L, j3) /* invoke-custom */;
        try {
            class_1934 class_1934VarT = class_1934Var;
            if (r0 == 0) {
                if (class_1934VarT == null) {
                    return (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30571, 5147789415323636847L ^ j3) /* invoke-custom */;
                }
                class_1934VarT = class_1934Var;
            }
            try {
                int i2 = z8.R[class_1934VarT.ordinal()];
                if (j3 > 0) {
                    switch (i2) {
                        case 1:
                            i2 = 12357;
                            break;
                        case 2:
                            return (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30541, 704321346611975239L ^ j3) /* invoke-custom */;
                        case 3:
                            return (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29789, 1715094989193484145L ^ j3) /* invoke-custom */;
                        case 4:
                            return (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7375, 8253777458826084336L ^ j3) /* invoke-custom */;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                class_1934VarT = (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(i2, 4181506365656814390L ^ j3) /* invoke-custom */;
                return class_1934VarT;
            } catch (NoWhenBranchMatchedException unused) {
                throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_1934VarT, -2901973105145656492L, j3) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused2) {
            throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -2901973105145656492L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:59:0x0190
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final float A(@org.jetbrains.annotations.NotNull net.minecraft.class_1657 r9, @org.jetbrains.annotations.NotNull su.catlean._j r10, long r11) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ko.A(net.minecraft.class_1657, su.catlean._j, long):float");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void v(long r11, double r13, double r15, net.minecraft.class_332 r17, net.minecraft.class_1657 r18, float r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ko.v(long, double, double, net.minecraft.class_332, net.minecraft.class_1657, float, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e6  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v32, types: [su.catlean.jl] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [su.catlean.jl] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.awt.Color[]] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.awt.Color[]] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void k(int r16, long r17, net.minecraft.class_332 r19, su.catlean.jy r20, int r21, boolean r22, net.minecraft.class_1657 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ko.k(int, long, net.minecraft.class_332, su.catlean.jy, int, boolean, net.minecraft.class_1657):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final java.lang.String x(float r7, long r8) {
        /*
            r6 = this;
            long r0 = su.catlean.ko.g
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            r0 = 161445406686808626(0x23d91bdf42f8a32, double:7.06456481680154E-298)
            r1 = r8
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r10 = r0
            r0 = r7
            r1 = 1097859072(0x41700000, float:15.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = r10
            if (r1 == 0) goto L6d
            if (r0 > 0) goto L69
            goto L2a
        L20:
            r1 = 180161728580132462(0x28010233a239e6e, double:1.228066694991795E-296)
            r2 = r8
            java.lang.RuntimeException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/RuntimeException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L3c
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L3c
        L2a:
            r0 = r7
            r1 = 1088421888(0x40e00000, float:7.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = r8
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L6d
            r1 = r10
            if (r1 == 0) goto L6d
            goto L46
        L3c:
            r1 = 180161728580132462(0x28010233a239e6e, double:1.228066694991795E-296)
            r2 = r8
            java.lang.RuntimeException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/RuntimeException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L4c
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L4c
        L46:
            if (r0 <= 0) goto L69
            goto L56
        L4c:
            r1 = 180161728580132462(0x28010233a239e6e, double:1.228066694991795E-296)
            r2 = r8
            java.lang.RuntimeException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/RuntimeException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L5f
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L5f
        L56:
            net.minecraft.class_124 r0 = net.minecraft.class_124.field_1054     // Catch: kotlin.NoWhenBranchMatchedException -> L5f
            java.lang.String r0 = r0     // Catch: kotlin.NoWhenBranchMatchedException -> L5f
            return r0
        L5f:
            r1 = 180161728580132462(0x28010233a239e6e, double:1.228066694991795E-296)
            r2 = r8
            java.lang.RuntimeException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/RuntimeException;}
            ).invoke(r0, r1, r2)
            throw r0
        L69:
            r0 = r7
            r1 = 1097859072(0x41700000, float:15.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
        L6d:
            if (r0 <= 0) goto L83
            net.minecraft.class_124 r0 = net.minecraft.class_124.field_1060     // Catch: kotlin.NoWhenBranchMatchedException -> L79
            java.lang.String r0 = r0     // Catch: kotlin.NoWhenBranchMatchedException -> L79
            return r0
        L79:
            r1 = 180161728580132462(0x28010233a239e6e, double:1.228066694991795E-296)
            r2 = r8
            java.lang.RuntimeException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/RuntimeException;}
            ).invoke(r0, r1, r2)
            throw r0
        L83:
            net.minecraft.class_124 r0 = net.minecraft.class_124.field_1061
            java.lang.String r0 = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ko.x(float, long):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String E(int r10, long r11) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ko.E(int, long):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final java.awt.Color d(long r9, float r11) {
        /*
            r8 = this;
            long r0 = su.catlean.ko.g
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = -1781493958063263927(0xe746dcaf14226f49, double:-3.1831887664707523E189)
            r1 = r9
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r12 = r0
            r0 = r11
            r1 = 1097859072(0x41700000, float:15.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = r12
            if (r1 == 0) goto L79
            if (r0 > 0) goto L75
            goto L2a
        L20:
            r1 = -1730687163098563819(0xe7fb5d31da2e7b15, double:-7.802926024245262E192)
            r2 = r9
            java.lang.RuntimeException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/RuntimeException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L3c
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L3c
        L2a:
            r0 = r11
            r1 = 1088421888(0x40e00000, float:7.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = r9
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L79
            r1 = r12
            if (r1 == 0) goto L79
            goto L46
        L3c:
            r1 = -1730687163098563819(0xe7fb5d31da2e7b15, double:-7.802926024245262E192)
            r2 = r9
            java.lang.RuntimeException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/RuntimeException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L4c
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L4c
        L46:
            if (r0 <= 0) goto L75
            goto L56
        L4c:
            r1 = -1730687163098563819(0xe7fb5d31da2e7b15, double:-7.802926024245262E192)
            r2 = r9
            java.lang.RuntimeException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/RuntimeException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L6b
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L6b
        L56:
            java.awt.Color r0 = java.awt.Color.YELLOW     // Catch: kotlin.NoWhenBranchMatchedException -> L6b
            r1 = r0
            r2 = 23333(0x5b25, float:3.2696E-41)
            r3 = 2687284132467410952(0x254b26ae3e438808, double:4.896200996837014E-129)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ko;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "t"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)     // Catch: kotlin.NoWhenBranchMatchedException -> L6b
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L6b
            return r0
        L6b:
            r1 = -1730687163098563819(0xe7fb5d31da2e7b15, double:-7.802926024245262E192)
            r2 = r9
            java.lang.RuntimeException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/RuntimeException;}
            ).invoke(r0, r1, r2)
            throw r0
        L75:
            r0 = r11
            r1 = 1097859072(0x41700000, float:15.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
        L79:
            if (r0 <= 0) goto L9b
            java.awt.Color r0 = java.awt.Color.GREEN     // Catch: kotlin.NoWhenBranchMatchedException -> L91
            r1 = r0
            r2 = 12092(0x2f3c, float:1.6945E-41)
            r3 = 7671439414470999090(0x6a766d809f797c32, double:7.031737612256409E204)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ko;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "t"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)     // Catch: kotlin.NoWhenBranchMatchedException -> L91
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L91
            return r0
        L91:
            r1 = -1730687163098563819(0xe7fb5d31da2e7b15, double:-7.802926024245262E192)
            r2 = r9
            java.lang.RuntimeException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/RuntimeException;}
            ).invoke(r0, r1, r2)
            throw r0
        L9b:
            java.awt.Color r0 = java.awt.Color.RED
            r1 = r0
            r2 = 18526(0x485e, float:2.596E-41)
            r3 = 1811125950082358050(0x19226974b2269b22, double:1.322367562704243E-187)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ko;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "t"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ko.d(long, float):java.awt.Color");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.RuntimeException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [float] */
    public final float z(float value, long a2) {
        long j2 = g ^ a2;
        int i2 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8150854263485794682L, j2) /* invoke-custom */;
        Object objIsNaN = value;
        if (i2 != 0) {
            return objIsNaN;
        }
        try {
            try {
                try {
                    try {
                        objIsNaN = Float.isNaN(objIsNaN);
                        if (objIsNaN == 0) {
                            if (i2 != 0) {
                                return value;
                            }
                            if (!Float.isInfinite(value)) {
                                return new BigDecimal(value).setScale(1, RoundingMode.HALF_UP).floatValue();
                            }
                        }
                        return 1.0f;
                    } catch (NoWhenBranchMatchedException unused) {
                        objIsNaN = (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objIsNaN, -8166681438898351548L, j2) /* invoke-custom */;
                        throw objIsNaN;
                    }
                } catch (NoWhenBranchMatchedException unused2) {
                    throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objIsNaN, -8166681438898351548L, j2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused3) {
                throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objIsNaN, -8166681438898351548L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused4) {
            throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objIsNaN, -8166681438898351548L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9 A[Catch: NoWhenBranchMatchedException -> 0x010c, TryCatch #0 {NoWhenBranchMatchedException -> 0x010c, blocks: (B:28:0x00de, B:31:0x00e9), top: B:57:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0122 A[PHI: r0 r41
  0x0122: PHI (r0v32 ??) = (r0v80 ??), (r0v59 ??) binds: [B:30:0x00e6, B:37:0x0120] A[DONT_GENERATE, DONT_INLINE]
  0x0122: PHI (r41v1 java.lang.String) = (r41v0 java.lang.String), (r41v7 java.lang.String) binds: [B:30:0x00e6, B:37:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0177 A[FALL_THROUGH, PHI: r41
  0x0177: PHI (r41v2 java.lang.String) = 
  (r41v1 java.lang.String)
  (r41v3 java.lang.String)
  (r41v4 java.lang.String)
  (r41v5 java.lang.String)
  (r41v6 java.lang.String)
  (r41v0 java.lang.String)
 binds: [B:38:0x0122, B:51:0x0173, B:50:0x0170, B:46:0x0156, B:42:0x013c, B:31:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0177 A[PHI: r41
  0x0177: PHI (r41v2 java.lang.String) = 
  (r41v1 java.lang.String)
  (r41v3 java.lang.String)
  (r41v4 java.lang.String)
  (r41v5 java.lang.String)
  (r41v6 java.lang.String)
  (r41v0 java.lang.String)
 binds: [B:38:0x0122, B:51:0x0173, B:50:0x0170, B:46:0x0156, B:42:0x013c, B:31:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x029c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[LOOP:0: B:17:0x00a7->B:65:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.RuntimeException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [int] */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float q(long r15, net.minecraft.class_332 r17, float r18, float r19, net.minecraft.class_1657 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ko.q(long, net.minecraft.class_332, float, float, net.minecraft.class_1657):float");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.RuntimeException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [net.minecraft.class_9288] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, net.minecraft.class_1792] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.minecraft.class_1799] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [int] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r30v5, types: [int] */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [int] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v4, types: [int] */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r31v6 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private final void J(long j2, class_332 class_332Var, int i2, class_1799 class_1799Var) {
        long j3 = ((j2 << 32) | ((((long) i2) << 32) >>> 32)) ^ g;
        long j4 = j3 ^ 40832839972668L;
        long j5 = j3 ^ 79200265861264L;
        int i3 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3113086043734123324L, j3) /* invoke-custom */;
        ?? r0 = i3;
        if (r0 == 0) {
            return;
        }
        try {
            try {
                r0 = (class_9288) class_1799Var.method_58694(class_9334.field_49622);
                if (r0 == 0) {
                    return;
                }
                ?? Method_7909 = class_1799Var.method_7909();
                Intrinsics.checkNotNullExpressionValue(Method_7909, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19345, 6624774177941607587L ^ j3) /* invoke-custom */);
                try {
                    try {
                        Method_7909 = Method_7909 instanceof class_1747;
                        int i4 = i3;
                        ?? r02 = Method_7909;
                        ?? r03 = Method_7909;
                        if (j2 > 0) {
                            if (i4 != 0) {
                                if (Method_7909 == 0) {
                                    return;
                                } else {
                                    r02 = ((class_1747) Method_7909).method_7711() instanceof class_2480;
                                }
                            }
                            i4 = i3;
                            r03 = r02;
                        }
                        ?? IsEmpty = r03;
                        ?? r04 = r03;
                        if (i2 < 0) {
                            if (i4 != 0) {
                                if (r03 == 0) {
                                    return;
                                } else {
                                    IsEmpty = r0.method_57489().toList().isEmpty();
                                }
                            }
                            i4 = i3;
                            r04 = IsEmpty;
                        }
                        if (i4 != 0) {
                            if (r04 != 0) {
                                return;
                            }
                            ab abVar = a;
                            Matrix3x2fStack matrix3x2fStackMethod_51448 = class_332Var.method_51448();
                            Intrinsics.checkNotNullExpressionValue(matrix3x2fStackMethod_51448, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28122, 3752137218960781997L ^ j3) /* invoke-custom */);
                            ab.N(j5, abVar, matrix3x2fStackMethod_51448, 12.0f, -79.0f, 169.0f, 60.0f, 0.0f, (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2192, 2035647761317511054L ^ j3) /* invoke-custom */, null);
                            r04 = 0;
                        }
                        ?? r30 = r04;
                        ?? r31 = 0;
                        Iterator it = r0.method_57489().toList().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ?? r05 = (class_1799) it.next();
                                try {
                                    class_332Var.method_51427((class_1799) r05, (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24309, 2111985254890924479L ^ j3) /* invoke-custom */ + ((r31 == true ? 1 : 0) * (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25555, 2262332615498290389L ^ j3) /* invoke-custom */), (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9566, 4627300684850106990L ^ j3) /* invoke-custom */ + ((r30 == true ? 1 : 0) * (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25555, 2262332615498290389L ^ j3) /* invoke-custom */));
                                    class_332Var.method_51431(zf.F(j4).field_1772, (class_1799) r05, (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24309, 2111985254890924479L ^ j3) /* invoke-custom */ + ((r31 == true ? 1 : 0) * (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25555, 2262332615498290389L ^ j3) /* invoke-custom */), (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10997, 6410492383217163713L ^ j3) /* invoke-custom */ + ((r30 == true ? 1 : 0) * (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25555, 2262332615498290389L ^ j3) /* invoke-custom */));
                                    r31++;
                                    r05 = r31;
                                    if (j2 > 0) {
                                        if (i3 != 0) {
                                            if (r05 >= (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13627, 8840750847627297299L ^ j3) /* invoke-custom */) {
                                                r05 = 0;
                                            } else {
                                                continue;
                                            }
                                        }
                                        r31 = r05;
                                        r30++;
                                        r05 = i3;
                                    }
                                    if (r05 != 0) {
                                        continue;
                                    }
                                } catch (NoWhenBranchMatchedException unused) {
                                    throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r05, 3138559091877853024L, j3) /* invoke-custom */;
                                }
                            }
                            if (j2 > 0) {
                                return;
                            }
                        }
                    } catch (NoWhenBranchMatchedException unused2) {
                        throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_7909, 3138559091877853024L, j3) /* invoke-custom */;
                    }
                } catch (NoWhenBranchMatchedException unused3) {
                    throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_7909, 3138559091877853024L, j3) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused4) {
                r0 = (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 3138559091877853024L, j3) /* invoke-custom */;
                throw r0;
            }
        } catch (NoWhenBranchMatchedException unused5) {
            throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 3138559091877853024L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    @NotNull
    public final String Z(@NotNull class_1293 class_1293Var, int i2, byte b2, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i3) << 40) >>> 40)) ^ g;
        Object objMethod_48559 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1920862302914142924L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(class_1293Var, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9686, 431192243375770500L ^ j2) /* invoke-custom */);
        try {
            try {
                objMethod_48559 = class_1293Var.method_48559();
                ?? r0 = objMethod_48559;
                if (objMethod_48559 == 0) {
                    if (objMethod_48559 != 0) {
                        return (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1493, 64522259347549159L ^ j2) /* invoke-custom */;
                    }
                    int iMethod_5584 = class_1293Var.method_5584() / (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7004, 4840768598384745839L ^ j2) /* invoke-custom */;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    r0 = iMethod_5584;
                }
                String strT = (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32164, 6594012579228963740L ^ j2) /* invoke-custom */;
                Object[] objArr = {Integer.valueOf((class_1293Var.method_5584() % (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15382, 4030301958844267054L ^ j2) /* invoke-custom */) / (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17082, 134293418701964530L ^ j2) /* invoke-custom */)};
                String str = String.format(strT, Arrays.copyOf(objArr, objArr.length));
                Intrinsics.checkNotNullExpressionValue(str, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25879, 638486737225403224L ^ j2) /* invoke-custom */);
                return r0 + ":" + str;
            } catch (NoWhenBranchMatchedException unused) {
                throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_48559, 1936549685730838030L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused2) {
            throw (RuntimeException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(RuntimeException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_48559, 1936549685730838030L, j2) /* invoke-custom */;
        }
    }

    private static final boolean p() {
        return u.v((g ^ 56532941414558L) ^ 111585165115713L);
    }

    public static void k(int[] iArr) {
        E = iArr;
    }

    public static int[] x() {
        return E;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 13670;
        if (i[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) w.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    w.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                i[i3] = b(((Cipher) objArr[0]).doFinal(h[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/ko", e2);
            }
        }
        return i[i3];
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
            r1 = r11
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
            java.lang.String r1 = "su/catlean/ko"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ko.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 7544;
        if (C[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) B[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) L.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    L.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/ko", e2);
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
            r1 = r11
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
            java.lang.String r1 = "su/catlean/ko"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ko.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
