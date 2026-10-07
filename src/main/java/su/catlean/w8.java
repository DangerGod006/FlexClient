package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_276;
import net.minecraft.class_310;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.CrosshairRenderEvent;
import su.catlean.api.event.events.render.FrameBufferEvent;
import su.catlean.api.event.events.render.ScreenMouseCoordsEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/w8.class */
public final class w8 implements ym {

    @NotNull
    public static final w8 T;

    @NotNull
    private static List k;

    @NotNull
    private static final ab W;

    @NotNull
    private static List A;

    @NotNull
    private static List c;

    @Nullable
    private static gf z;

    @Nullable
    private static gf N;
    private static float U;
    private static float s;
    public static final float u = 5.0f;
    private static int i;
    private static final long a = yz.a(2968210992011873301L, 703918193530156074L, MethodHandles.lookup().lookupClass()).a(213037719741682L);
    private static final String[] b;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    private w8() {
    }

    @NotNull
    public final List C() {
        return k;
    }

    public final void u(long a2, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22839, 3616156181020518593L ^ (a ^ a2)) /* invoke-custom */);
        k = list;
    }

    @NotNull
    public final ab c() {
        return W;
    }

    @NotNull
    public final List B() {
        return A;
    }

    public final void t(long a2, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25006, 8205698193564135985L ^ (a ^ a2)) /* invoke-custom */);
        A = list;
    }

    @NotNull
    public final List X() {
        return c;
    }

    public final void k(long a2, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25006, 8205616301706672973L ^ (a ^ a2)) /* invoke-custom */);
        c = list;
    }

    @Nullable
    public final gf q() {
        return z;
    }

    public final void R(@Nullable gf gfVar) {
        z = gfVar;
    }

    @Nullable
    public final gf a() {
        return N;
    }

    public final void w(@Nullable gf gfVar) {
        N = gfVar;
    }

    public final float H() {
        return U;
    }

    public final void V(float f2) {
        U = f2;
    }

    public final float u() {
        return s;
    }

    public final void m(float f2) {
        s = f2;
    }

    @Flow
    private final void p(ScreenMouseCoordsEvent screenMouseCoordsEvent) {
        U = screenMouseCoordsEvent.getX();
        s = screenMouseCoordsEvent.getY();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow
    private final void n(PlayerUpdateEvent playerUpdateEvent) throws Exception {
        long j = a ^ 57469884423856L;
        long j2 = j ^ 48133219538008L;
        long j3 = j ^ 13173222554461L;
        int i2 = (int) (j >>> 48);
        int i3 = (int) ((j3 << 16) >>> 48);
        int i4 = (int) ((j3 << 32) >>> 32);
        List<gf> list = k;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8074612982084901174L, j) /* invoke-custom */;
        for (gf gfVar : list) {
            if (str == null) {
                return;
            }
            ?? r0 = str;
            if (r0 != 0) {
                try {
                    try {
                        if (gfVar.U((short) i2, (char) i3, i4)) {
                            gfVar.w(j2);
                        }
                    } catch (NumberFormatException unused) {
                        r0 = (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8100864052459602528L, j) /* invoke-custom */;
                        throw r0;
                    }
                } catch (NumberFormatException unused2) {
                    throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8100864052459602528L, j) /* invoke-custom */;
                }
            }
            if (str == null) {
                return;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x012c: INVOKE (r-1 I:su.catlean.gf), (r0 I:long), (r1 I:net.minecraft.class_332) VIRTUAL call: su.catlean.gf.O(long, net.minecraft.class_332):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow(priority = -20)
    private final void A(su.catlean.api.event.events.render.Render2DEvent r16) {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.w8.A(su.catlean.api.event.events.render.Render2DEvent):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: net.minecraft.class_310 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow
    private final void R(InputEvent inputEvent) throws Exception {
        long j = a ^ 9328222466084L;
        long j2 = j ^ 22083723886070L;
        long j3 = j ^ 95559162625406L;
        int i2 = (int) (j >>> 48);
        int i3 = (int) ((j3 << 16) >>> 48);
        int i4 = (int) ((j3 << 32) >>> 32);
        long j4 = j ^ 61315022919113L;
        int i5 = (int) (j >>> 48);
        int i6 = (int) ((j4 << 16) >>> 48);
        int i7 = (int) ((j4 << 32) >>> 32);
        class_310 class_310VarF = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6817030946056091554L, j) /* invoke-custom */;
        try {
            try {
                try {
                    if (inputEvent.getDevice() == InputEvent.Device.Mouse) {
                        class_310VarF = zf.F(j2);
                        if (class_310VarF != null) {
                            if (class_310VarF.field_1687 == null) {
                                return;
                            } else {
                                class_310VarF = zf.F(j2);
                            }
                        }
                        if (class_310VarF.field_1724 != null) {
                            for (gf gfVar : k) {
                                if (class_310VarF == null) {
                                    return;
                                }
                                class_310 class_310Var = class_310VarF;
                                if (class_310Var != null) {
                                    try {
                                        try {
                                            if (gfVar.U((short) i5, (char) i6, i7)) {
                                                gfVar.O((char) i2, (short) i3, inputEvent.getKey(), i4, inputEvent.getAction());
                                            }
                                        } catch (NumberFormatException unused) {
                                            class_310Var = (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_310Var, -6843273305210694860L, j) /* invoke-custom */;
                                            throw class_310Var;
                                        }
                                    } catch (NumberFormatException unused2) {
                                        throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_310Var, -6843273305210694860L, j) /* invoke-custom */;
                                    }
                                }
                                if (class_310VarF == null) {
                                    return;
                                }
                            }
                        }
                    }
                } catch (NumberFormatException unused3) {
                    throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_310VarF, -6843273305210694860L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused4) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_310VarF, -6843273305210694860L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused5) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_310VarF, -6843273305210694860L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [su.catlean.api.event.events.render.FrameBufferEvent] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    @Flow
    private final void k(FrameBufferEvent frameBufferEvent) throws Exception {
        long j = a ^ 36199105724748L;
        long j2 = j ^ 34444087747745L;
        int i2 = (int) (j >>> 48);
        int i3 = (int) ((j2 << 16) >>> 48);
        int i4 = (int) ((j2 << 32) >>> 32);
        ?? U2 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3455066930794251978L, j) /* invoke-custom */;
        try {
            try {
                U2 = ps.b.U((short) i2, (char) i3, i4);
                ?? A2 = U2;
                if (U2 != 0) {
                    if (U2 == 0) {
                        return;
                    } else {
                        A2 = ps.b.a();
                    }
                }
                if (A2 != 0) {
                    try {
                        frameBufferEvent.setFrameBuffer((class_276) ps.b.k());
                        A2 = frameBufferEvent;
                        A2.cancel();
                    } catch (NumberFormatException unused) {
                        throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(A2, -3427266013917044132L, j) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused2) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(U2, -3427266013917044132L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(U2, -3427266013917044132L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.render.CrosshairRenderEvent] */
    @Flow
    private final void e(CrosshairRenderEvent crosshairRenderEvent) throws Exception {
        long j = a ^ 114427059499135L;
        Object obj = j;
        try {
            if (g6.F.U((short) (obj >>> 48), (char) ((r1 << 16) >>> 48), (int) (((obj ^ 96403786306962L) << 32) >>> 32))) {
                obj = crosshairRenderEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6819383018896370833L, j) /* invoke-custom */;
        }
    }

    private final void I(long j) {
        long j2 = a ^ j;
        List list = k;
        gf[] gfVarArr = new gf[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17560, 7999893116545841597L ^ j2) /* invoke-custom */];
        gfVarArr[0] = g1.I;
        gfVarArr[1] = pq.i;
        gfVarArr[2] = pj.J;
        gfVarArr[3] = pr.z;
        gfVarArr[4] = ph.H;
        gfVarArr[5] = pg.k;
        gfVarArr[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2606, 6887954601059153695L ^ j2) /* invoke-custom */] = p3.Y;
        gfVarArr[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16858, 6650448214510091517L ^ j2) /* invoke-custom */] = pd.f;
        gfVarArr[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11781, 6156900648770556707L ^ j2) /* invoke-custom */] = pc.m;
        gfVarArr[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26515, 6155576751232621233L ^ j2) /* invoke-custom */] = pp.n;
        gfVarArr[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21055, 4185265321915232028L ^ j2) /* invoke-custom */] = p7.b;
        gfVarArr[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28278, 2508940990665069398L ^ j2) /* invoke-custom */] = ps.b;
        gfVarArr[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32670, 7327589950729978550L ^ j2) /* invoke-custom */] = gv.N;
        gfVarArr[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31138, 6176138800356787342L ^ j2) /* invoke-custom */] = pt.S;
        gfVarArr[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26808, 9156847282672899467L ^ j2) /* invoke-custom */] = go.E;
        gfVarArr[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14514, 3235761193573074332L ^ j2) /* invoke-custom */] = g2.N;
        gfVarArr[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20646, 5114541787015261584L ^ j2) /* invoke-custom */] = pl.N;
        gfVarArr[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11104, 5694122554914133584L ^ j2) /* invoke-custom */] = pb.o;
        gfVarArr[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2161, 4557411070417597776L ^ j2) /* invoke-custom */] = g6.F;
        gfVarArr[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30729, 7315110471786857762L ^ j2) /* invoke-custom */] = gz.x;
        gfVarArr[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7849, 4287179759749456781L ^ j2) /* invoke-custom */] = p8.S;
        gfVarArr[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22826, 54186347325465603L ^ j2) /* invoke-custom */] = ga.N;
        gfVarArr[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21098, 8101608633279033159L ^ j2) /* invoke-custom */] = pw.G;
        list.addAll(CollectionsKt.listOf((Object[]) gfVarArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [su.catlean.sd] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [su.catlean.sh] */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    public final void p(long j) throws Exception {
        ?? r0;
        ?? r02;
        long j2 = a ^ j;
        long j3 = j2 ^ 59860262225302L;
        long j4 = j2 ^ 98907165691242L;
        Iterator it = k.iterator();
        do {
            Iterator it2 = it;
            while (it2.hasNext()) {
                gf gfVar = (gf) it.next();
                List<a1> listC = gfVar.c();
                if (j2 <= 0) {
                    return;
                }
                for (a1 a1Var : listC) {
                    it2 = yl.g.d().n(j3).B().iterator();
                    if (j2 >= 0) {
                        while (true) {
                            if (!it2.hasNext()) {
                                r0 = 0;
                                break;
                            }
                            Object next = it2.next();
                            Object obj = next;
                            while (Intrinsics.areEqual(((sd) obj).y(), gfVar.I())) {
                                obj = next;
                                r0 = obj;
                                if (j2 <= 0) {
                                }
                            }
                        }
                        try {
                            r0 = (sd) r0;
                            if (r0 != 0) {
                                Iterator it3 = r0.p().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        r02 = 0;
                                        break;
                                    }
                                    Object next2 = it3.next();
                                    Object obj2 = next2;
                                    while (Intrinsics.areEqual(((sh) obj2).d(), a1Var.e())) {
                                        obj2 = next2;
                                        r02 = obj2;
                                        if (j2 <= 0) {
                                        }
                                    }
                                }
                                try {
                                    r02 = (sh) r02;
                                    if (r02 != 0) {
                                        try {
                                            a1Var.P(r02.G(), j4);
                                        } catch (Exception e2) {
                                            a1Var.A();
                                            zf.x().warn((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13091, 5611329874906332878L ^ j2) /* invoke-custom */ + a1Var.Q() + (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32632, 1347161944863437460L ^ j2) /* invoke-custom */ + gfVar.A() + (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5488, 1011961030697654424L ^ j2) /* invoke-custom */ + e2.getMessage());
                                        }
                                    }
                                } catch (Exception unused) {
                                    throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -5308097691640150938L, j2) /* invoke-custom */;
                                }
                            }
                            if (j2 <= 0) {
                                break;
                            }
                        } catch (Exception unused2) {
                            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5308097691640150938L, j2) /* invoke-custom */;
                        }
                    }
                }
            }
            return;
        } while (j2 >= 0);
    }

    /*  JADX ERROR: Failed to decode insn: 0x0092: MOVE_MULTI
        java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for object array[8]
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
    private static final boolean J(su.catlean.g7 r8, java.awt.Color r9, su.catlean.aj r10) {
        /*
            long r0 = su.catlean.w8.a
            r1 = 17331048964966(0xfc333046366, double:8.562675899982E-311)
            long r0 = r0 ^ r1
            r11 = r0
            r0 = r11
            r1 = r0; r1 = r0; 
            r2 = 42758592089606(0x26e382b14e06, double:2.11255514160136E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r1 = r0; r2 = r0; 
            r2 = 124162017628256(0x70ecb8f49060, double:6.13441874284565E-310)
            long r1 = r1 ^ r2
            r15 = r1
            r0 = r10
            r1 = 3625(0xe29, float:5.08E-42)
            r2 = 9192707858852284371(0x7f930f17b2d507d3, double:3.345913399491369E306)
            r3 = r11
            long r2 = r2 ^ r3
            java.lang.String r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/w8;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "a"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r8
            r1 = r10
            org.joml.Matrix3x2f r1 = r1.D()
            r2 = r13
            r3 = r2; r2 = r1; r1 = r3; 
            r3 = r10
            float r3 = r3.d()
            r4 = r10
            float r4 = r4.v()
            r5 = r10
            float r5 = r5.J()
            float r4 = r4 + r5
            r5 = 0
            su.catlean.g7 r0 = r0.b(r1, r2, r3, r4, r5)
            r1 = r9
            r2 = r15
            su.catlean.g7 r0 = r0.n(r1, r2)
            r1 = r10
            org.joml.Matrix3x2f r1 = r1.D()
            r2 = r13
            r3 = r2; r2 = r1; r1 = r3; 
            r2 = r10
            float r2 = r2.d()
            r3 = r10
            float r3 = r3.C()
            float r2 = r2 + r3
            r3 = r10
            float r3 = r3.v()
            r4 = r10
            float r4 = r4.J()
            float r3 = r3 + r4
            r4 = 0
            r-1.b(r0, r1, r2, r3, r4)
            r0 = r9
            r1 = r15
            r-1.n(r0, r1)
            r0 = r10
            org.joml.Matrix3x2f r0 = r0.D()
            r1 = r13
            r2 = r1; r1 = r0; r0 = r2; 
            r1 = r10
            float r1 = r1.d()
            r2 = r10
            float r2 = r2.C()
            float r1 = r1 + r2
            r2 = r10
            float r2 = r2.v()
            r3 = 0
            su.catlean.g7 r-2 = r-2.b(r-1, r0, r1, r2, r3)
            r-1 = r9
            r0 = r15
            su.catlean.g7 r-2 = r-2.n(r-1, r0)
            r-1 = r10
            r-1.D()
            r0 = r13
            // decode failed: arraycopy: source index -1 out of bounds for object array[8]
            r0 = r10
            float r0 = r0.d()
            r1 = r10
            float r1 = r1.v()
            r2 = 0
            su.catlean.g7 r-3 = r-3.b(r-2, r-1, r0, r1, r2)
            r-2 = r9
            r-1 = r15
            su.catlean.g7 r-3 = r-3.n(r-2, r-1)
            r-3 = 1
            return r-3
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.w8.J(su.catlean.g7, java.awt.Color, su.catlean.aj):boolean");
    }

    private static final boolean g(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private static final boolean H(ff ffVar) throws Throwable {
        long j = a ^ 127350983097218L;
        Intrinsics.checkNotNullParameter(ffVar, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20037, 1475299721436356440L ^ j) /* invoke-custom */);
        bj.p(ffVar.v(), ffVar.B(), ffVar.l(), ffVar.I(), ffVar.E(), ffVar.r(), null, null, ffVar.m(), (int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19445, 170510273017719852L ^ j) /* invoke-custom */, j ^ 92998633286637L, null);
        return true;
    }

    private static final boolean k(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    static {
        int i2;
        long j = a ^ 119902178546712L;
        long j2 = j ^ 1813831001578L;
        long j3 = j ^ 126044134253557L;
        e = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(0, -4220815506572243468L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[9];
        int i4 = 0;
        String str = "BÐ^\u0012f\u0080²Ñ@O½\u0019¤µ4L\u0010U8,_o;½Î¼b\u000f5û½\rÁ\u0010Ø^2\u0089\\í»Dq\f\u0013\u001eW\u0006Þ¨\u0010\u0081ãX\u0000\u001dIOÚx\\\u001dóÑ£ëÖ\u0010é\u000b\u0098ºÍd¤XdÒ\u0010Azô\u009aO\u0018UBç]\u0001\u0018\u00adû\u009a-\u0019+7 \u001f\u0095\u0083ëå\u00adÔ`C\u00890ã\u0095+iÎ¯\u008aª\u001b\u0093\u008f_\u0099ìX\u0018Å*KRpÚbi?{K\u001e\u009bßà\u0085\u0086\u0019\u0002QF\u0014ðzlruì¥\u0007d]";
        int length = "BÐ^\u0012f\u0080²Ñ@O½\u0019¤µ4L\u0010U8,_o;½Î¼b\u000f5û½\rÁ\u0010Ø^2\u0089\\í»Dq\f\u0013\u001eW\u0006Þ¨\u0010\u0081ãX\u0000\u001dIOÚx\\\u001dóÑ£ëÖ\u0010é\u000b\u0098ºÍd¤XdÒ\u0010Azô\u009aO\u0018UBç]\u0001\u0018\u00adû\u009a-\u0019+7 \u001f\u0095\u0083ëå\u00adÔ`C\u00890ã\u0095+iÎ¯\u008aª\u001b\u0093\u008f_\u0099ìX\u0018Å*KRpÚbi?{K\u001e\u009bßà\u0085\u0086\u0019\u0002QF\u0014ðzlruì¥\u0007d]".length();
        char cCharAt = 16;
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
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
                            b = strArr;
                            d = new String[9];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[21];
                            int i10 = 0;
                            String str3 = "\u008d!\\È\u0088k_\u008a}õT9jÙ8¸\u0002XÖ\u0081½\u0084ÀèÎ\u008a¹%'\u0014æ¦1n:¾\u0012\u0019\u001du\u0092ø8ºç&ãÎb\u000ec\u0002Îi»D¡©(\u0088\u0010Û\tÿ'$ø[\u009a{\u009c\u0013)Ü\u009d},È[Ö=<\u007f\u0010<\u009c\u009eý\bÃ\u0095® Ë:Æ\u0002ö¹®DÓ\nE\u001b\u0018\u000e\u0084GÙ*±\u0091\u0012mOì\u001c\u009awõÓ¨\u0085òEÏé!kV\u0099\u0001\u0015?±Ò\u0017\u0001\u00adH§H\bi#Â>\u0000\u008aY9";
                            int length2 = "\u008d!\\È\u0088k_\u008a}õT9jÙ8¸\u0002XÖ\u0081½\u0084ÀèÎ\u008a¹%'\u0014æ¦1n:¾\u0012\u0019\u001du\u0092ø8ºç&ãÎb\u000ec\u0002Îi»D¡©(\u0088\u0010Û\tÿ'$ø[\u009a{\u009c\u0013)Ü\u009d},È[Ö=<\u007f\u0010<\u009c\u009eý\bÃ\u0095® Ë:Æ\u0002ö¹®DÓ\nE\u001b\u0018\u000e\u0084GÙ*±\u0091\u0012mOì\u001c\u009awõÓ¨\u0085òEÏé!kV\u0099\u0001\u0015?±Ò\u0017\u0001\u00adH§H\bi#Â>\u0000\u008aY9".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j4 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j5 = j4;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j5 >>> 56), (byte) (j5 >>> 48), (byte) (j5 >>> 40), (byte) (j5 >>> 32), (byte) (j5 >>> 24), (byte) (j5 >>> 16), (byte) (j5 >>> 8), (byte) j5});
                                    long j6 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j6;
                                            if (i11 >= length2) {
                                                f = jArr;
                                                g = new Integer[21];
                                                T = new w8();
                                                k = new ArrayList();
                                                W = new ab();
                                                A = new ArrayList();
                                                c = new ArrayList();
                                                T.I(j2);
                                                T.p(j3);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j6;
                                            if (i11 >= length2) {
                                                str3 = "\u0010q\u0001/½\u008b|VFìæÜ÷Ç$\u0019";
                                                length2 = "\u0010q\u0001/½\u008b|VFìæÜ÷Ç$\u0019".length();
                                                i11 = 0;
                                            }
                                            break;
                                    }
                                    int i15 = i11;
                                    i11 += 8;
                                    byte[] bytes2 = str3.substring(i15, i11).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i13 = i10;
                                    i10++;
                                    j4 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i16 = i4;
                        i4++;
                        strArr[i16] = strIntern;
                        int i17 = i6 + cCharAt;
                        i5 = i17;
                        if (i17 < length) {
                        }
                        str = "¥\tÛ\u0011\u0019\u0092¼\u0093\u0083¦j\u001cÛ(\u008c\u0011\u0018¨+ò¯«¥@E¡Jnàu\u0016\u0081Q\u0097W\u0006F\u0087Ü)±";
                        length = "¥\tÛ\u0011\u0019\u0092¼\u0093\u0083¦j\u001cÛ(\u008c\u0011\u0018¨+ò¯«¥@E¡Jnàu\u0016\u0081Q\u0097W\u0006F\u0087Ü)±".length();
                        cCharAt = 16;
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

    public static void D(int i2) {
        i = i2;
    }

    public static int F() {
        return i;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int R() {
        return F() == 0 ? 46 : 0;
    }

    private static Exception a(Exception exc) {
        return exc;
    }

    private static String a(byte[] bArr) {
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

    private static String a(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 14854;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = a(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/w8", e2);
            }
        }
        return d[i3];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strA = a(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strA), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strA;
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
    private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
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
            java.lang.String r1 = "su/catlean/w8"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.w8.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 19664;
        if (g[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/w8", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            g[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return g[i3].intValue();
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iB)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iB;
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
            java.lang.String r1 = "su/catlean/w8"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.w8.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
