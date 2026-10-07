package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix3x2fc;
import org.lwjgl.glfw.GLFW;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gf.class */
public abstract class gf implements jk, ap {
    static final KProperty[] d;

    @NotNull
    private final String D;

    @NotNull
    private final List A;

    @NotNull
    private final List M;

    @NotNull
    private final bj P;

    @NotNull
    private final cq L;

    @NotNull
    private final ch e;

    @NotNull
    private bj j;
    private boolean w;
    private float C;
    private float V;
    private float T;
    private float X;
    private boolean s;
    private float r;
    private float v;

    @NotNull
    private final String t;
    private static String W;
    private static final long u = yz.a(4051785881732570208L, 7133493794591131875L, MethodHandles.lookup().lookupClass()).a(221274452969961L);
    private static final String[] Z;
    private static final String[] ab;
    private static final Map bb;
    private static final long[] cb;
    private static final Integer[] db;
    private static final Map eb;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0277 A[EDGE_INSN: B:29:0x0277->B:23:0x0277 BREAK  A[LOOP:0: B:3:0x0182->B:30:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:3:0x0182->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v50, types: [char, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public gf(char r15, int r16, @org.jetbrains.annotations.NotNull java.lang.String r17, char r18) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gf.<init>(char, int, java.lang.String, char):void");
    }

    @NotNull
    public final String I() {
        return this.D;
    }

    @Override // su.catlean.jk
    @NotNull
    public List c() {
        return this.A;
    }

    @Override // su.catlean.jk
    @NotNull
    public List u() {
        return this.M;
    }

    public final boolean U(short s, char c, int i) {
        return ((Boolean) this.L.E(this, ((((((long) s) << 48) | ((((long) c) << 48) >>> 16)) | ((((long) i) << 32) >>> 32)) ^ u) ^ 42830412438711L, d[0])).booleanValue();
    }

    public final void S(long a, boolean z) {
        this.L.b(this, (u ^ a) ^ 18304019655099L, d[0], Boolean.valueOf(z));
    }

    @NotNull
    public final d_ T(long j) {
        return (d_) this.e.E(this, (u ^ j) ^ 101591507570986L, d[1]);
    }

    public final void o(@NotNull d_ d_Var, long a) {
        long j = u ^ a;
        Intrinsics.checkNotNullParameter(d_Var, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22747, 1307705875522727721L ^ j) /* invoke-custom */);
        this.e.b(this, j ^ 86083090227906L, d[1], d_Var);
    }

    @NotNull
    public final bj x() {
        return this.j;
    }

    public final float F() {
        return this.r;
    }

    public final void w(float f) {
        this.r = f;
    }

    public final float Y() {
        return this.v;
    }

    public final void O(float f) {
        this.v = f;
    }

    @NotNull
    public final String A() {
        return this.t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15, types: [su.catlean.gf] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.gf] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Override // su.catlean.ap
    public void J(long j) {
        long j2 = j ^ 65469789313429L;
        long j3 = j ^ 24976244493437L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j3 << 16) >>> 48);
        int i3 = (int) ((j3 << 32) >>> 32);
        int i4 = (int) (j >>> 56);
        long j4 = ((j ^ 67469537118988L) << 8) >>> 8;
        ?? U = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-530648882990635844L, j) /* invoke-custom */;
        try {
            U = this;
            ?? r0 = U;
            if (U == 0) {
                try {
                    try {
                        U = U.U((short) i, (char) i2, i3);
                        if (U != 0) {
                            d(j2);
                            if (U == 0) {
                                return;
                            }
                        }
                        r0 = this;
                    } catch (UnsupportedOperationException unused) {
                        throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(U, -564810626170751245L, j) /* invoke-custom */;
                    }
                } catch (UnsupportedOperationException unused2) {
                    throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(U, -564810626170751245L, j) /* invoke-custom */;
                }
            }
            r0.o((byte) i4, j4);
        } catch (UnsupportedOperationException unused3) {
            throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(U, -564810626170751245L, j) /* invoke-custom */;
        }
    }

    @Override // su.catlean.ap
    public void o(byte b, long j) {
        S(((((long) b) << 56) | ((j << 8) >>> 8)) ^ 44318043563409L, true);
    }

    @Override // su.catlean.ap
    public void d(long j) {
        S(j ^ 51235729995528L, false);
    }

    public abstract void h(long j, @NotNull class_332 class_332Var);

    public void H(@NotNull class_332 context, long a) {
        Intrinsics.checkNotNullParameter(context, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27214, 2055742814358847666L ^ a) /* invoke-custom */);
    }

    public void w(long j) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void O(long r24, @org.jetbrains.annotations.NotNull net.minecraft.class_332 r26) {
        /*
            Method dump skipped, instruction units count: 3743
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gf.O(long, net.minecraft.class_332):void");
    }

    public final void X(@NotNull class_332 context, long a, @NotNull String text) throws Throwable {
        long j = u ^ a;
        long j2 = j ^ 119698447961557L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j2 << 16) >>> 32);
        int i3 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 40175902333318L;
        long j4 = j ^ 31055644862395L;
        long j5 = j ^ 77730028125946L;
        long j6 = j ^ 45773372937460L;
        long j7 = j ^ 98042369072257L;
        Intrinsics.checkNotNullParameter(context, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5770, 7266811636661257243L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(text, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5181, 1476635634356258475L ^ j) /* invoke-custom */);
        float fD = b8.f(j ^ 114987112415596L).D(j ^ 35369991241789L, text);
        Matrix3x2fStack matrix3x2fStackMethod_51448 = context.method_51448();
        Intrinsics.checkNotNullExpressionValue(matrix3x2fStackMethod_51448, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28129, 4485928044390186866L ^ j) /* invoke-custom */);
        b(this, matrix3x2fStackMethod_51448, p(j6), (short) i, i2, V(j4), fD + 19.0f, 13.0f, (short) i3, 0.0f, false, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2152, 8609652961156086801L ^ j) /* invoke-custom */, null);
        Matrix3x2fStack matrix3x2fStackMethod_514482 = context.method_51448();
        Intrinsics.checkNotNullExpressionValue(matrix3x2fStackMethod_514482, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29562, 1734888954848666098L ^ j) /* invoke-custom */);
        u(j7, this, matrix3x2fStackMethod_514482, p(j6) + (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15378, 2943123867270613093L ^ j) /* invoke-custom */, V(j4) + 3.0f, 0.0f, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15821, 430428874176399778L ^ j) /* invoke-custom */, null);
        bj bjVar = this.j;
        Matrix3x2fStack matrix3x2fStackMethod_514483 = context.method_51448();
        Intrinsics.checkNotNullExpressionValue(matrix3x2fStackMethod_514483, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29562, 1734888954848666098L ^ j) /* invoke-custom */);
        l(this, bjVar, matrix3x2fStackMethod_514483, p(j6) + 2.0f, V(j4), 10.0f, j3, 10.0f, 0.0f, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24933, 2891438112324801801L ^ j) /* invoke-custom */, null);
        Z(context, text, p(j6) + 16.0f, j5, V(j4) + 1.0f, jh.f.n());
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7064311914386374168L, j) /* invoke-custom */;
        this.v = fD + 20.0f;
        try {
            this.r = 13.0f;
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7129483989181889633L, j) /* invoke-custom */ != null) {
                str = "rpI2Lc";
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("rpI2Lc", -7124375750104873731L, j) /* invoke-custom */;
            }
        } catch (UnsupportedOperationException unused) {
            throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(str, -7098473855136853081L, j) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0214: INVOKE 
          (r-1 I:su.catlean.gf)
          (r0 I:net.minecraft.class_332)
          (r1 I:java.lang.String)
          (r2 I:float)
          (r3 I:long)
          (r4 I:float)
          (r5 I:java.awt.Color)
         VIRTUAL call: su.catlean.gf.Z(net.minecraft.class_332, java.lang.String, float, long, float, java.awt.Color):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void q(@org.jetbrains.annotations.NotNull net.minecraft.class_332 r18, @org.jetbrains.annotations.NotNull java.lang.String r19, float r20, boolean r21, long r22) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gf.q(net.minecraft.class_332, java.lang.String, float, boolean, long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public void O(char r9, short r10, int r11, int r12, @org.jetbrains.annotations.NotNull su.catlean.api.event.events.client.InputEvent.Action r13) {
        /*
            Method dump skipped, instruction units count: 1631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gf.O(char, short, int, int, su.catlean.api.event.events.client.InputEvent$Action):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v21, types: [su.catlean.gf] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    protected final void i(int i, int i2) {
        long j = ((((long) i) << 32) | ((((long) i2) << 32) >>> 32)) ^ u;
        long j2 = j ^ 111886389725826L;
        long j3 = j ^ 9362361592879L;
        long j4 = j ^ 67190958120800L;
        long j5 = j ^ 76309174011044L;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1613011060449757820L, j) /* invoke-custom */;
        ?? r0 = this;
        ?? r02 = r0;
        if (str == null) {
            try {
                try {
                    r0 = r0 instanceof g1;
                    if (r0 != 0) {
                        GLFW.glfwSetClipboardString(zf.F(j2).method_22683().method_4490(), ((int) zf.v(j5).method_23317()) + " " + ((int) zf.v(j5).method_23318()) + " " + ((int) zf.v(j5).method_23321()));
                    }
                    this.C = w8.T.H() - p(j4);
                    this.V = w8.T.u() - V(j3);
                    r02 = this;
                } catch (UnsupportedOperationException unused) {
                    throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 1650906943251355699L, j) /* invoke-custom */;
                }
            } catch (UnsupportedOperationException unused2) {
                throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 1650906943251355699L, j) /* invoke-custom */;
            }
        }
        r02.w = true;
        w8.T.R(this);
    }

    public final float p(long j) {
        return T((u ^ j) ^ 98587245974917L).C() * r(r0 ^ 26958820068720L);
    }

    public final float V(long j) {
        return T((u ^ j) ^ 118978727569098L).c() * l(r0 ^ 30998273965455L);
    }

    protected final float N() {
        return w8.T.H();
    }

    protected final float b() {
        return w8.T.u();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    protected final boolean G(long r8) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gf.G(long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r12v0 */
    protected final void s(long j) {
        ?? B;
        long j2 = u ^ j;
        ?? B2 = j2;
        long j3 = B2 ^ 42577454140691L;
        try {
            if (w8.T.q() != null) {
                B2 = (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9355, 5650974618625662198L ^ j2) /* invoke-custom */;
                B = B2;
            } else {
                B = (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11649, 928273687574795769L ^ j2) /* invoke-custom */;
            }
            GLFW.glfwSetCursor(zf.F(j3).method_22683().method_4490(), GLFW.glfwCreateStandardCursor(B == true ? 1 : 0));
        } catch (UnsupportedOperationException unused) {
            throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B2, 5870565697519443874L, j2) /* invoke-custom */;
        }
    }

    protected final void X(float w, float h) {
        this.v = w;
        this.r = h;
    }

    protected final int l(long j) {
        return zf.F((u ^ j) ^ 124726213401378L).method_22683().method_4502();
    }

    protected final int r(long j) {
        return zf.F((u ^ j) ^ 70756890826898L).method_22683().method_4486();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    protected final boolean t(long a, float n1, float n2) {
        long j = u ^ a;
        Object obj = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7851444665416823019L, j) /* invoke-custom */;
        try {
            obj = (Math.abs(n1 - n2) > 2.0f ? 1 : (Math.abs(n1 - n2) == 2.0f ? 0 : -1));
            return obj == 0 ? obj < 0 : obj;
        } catch (UnsupportedOperationException unused) {
            throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 7817771002017178276L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v17, types: [org.joml.Matrix3x2fStack] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    protected final void J(@NotNull Matrix3x2fStack matrix3x2fStack, float f, float f2, float f3, long j, float f4, float f5, boolean z) {
        long j2 = u ^ j;
        long j3 = j2 ^ 98781838910279L;
        int i = (int) (j2 >>> 48);
        int i2 = (int) ((j3 << 16) >>> 48);
        int i3 = (int) ((j3 << 32) >>> 32);
        ?? m = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-9003378454660129005L, j2) /* invoke-custom */;
        try {
            try {
                m = matrix3x2fStack;
                ?? r0 = m;
                if (m == 0) {
                    try {
                        Intrinsics.checkNotNullParameter(m, "m");
                        m = z;
                        if (m != 0) {
                            w8.T.c().K(matrix3x2fStack, f, f2, f3, f4, f5);
                            if (m == 0) {
                                return;
                            }
                        }
                        r0 = matrix3x2fStack;
                    } catch (UnsupportedOperationException unused) {
                        throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(m, -8969427860392997540L, j2) /* invoke-custom */;
                    }
                }
                x1.n(r0, (char) i, f, f2, f3, f4, 3.0f, 1.5f, 0.0f, f5, jh.f.T(), jh.f.F(), 0.0f, (short) i2, 0.0f, i3, 0.0f, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16517, 4105518362641623560L ^ j2) /* invoke-custom */, null);
            } catch (UnsupportedOperationException unused2) {
                throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(m, -8969427860392997540L, j2) /* invoke-custom */;
            }
        } catch (UnsupportedOperationException unused3) {
            throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(m, -8969427860392997540L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Throwable, java.lang.UnsupportedOperationException] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [su.catlean.gf] */
    /* JADX WARN: Type inference failed for: r21v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public static void b(gf gfVar, Matrix3x2fStack matrix3x2fStack, float f, short s, int i, float f2, float f3, float f4, short s2, float f5, boolean z, int i2, Object obj) {
        long j = (((((long) s) << 48) | ((((long) i) << 32) >>> 16)) | ((((long) s2) << 48) >>> 48)) ^ u;
        long j2 = j ^ 135910492181294L;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5339385317861561864L, j) /* invoke-custom */;
        ?? B = obj;
        if (B != 0) {
            try {
                B = new UnsupportedOperationException((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13513, 2486797632619974224L ^ j) /* invoke-custom */);
                throw B;
            } catch (UnsupportedOperationException unused) {
                throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, -5373617568064488521L, j) /* invoke-custom */;
            }
        }
        try {
            B = i2 & (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9284, 4299724659956365345L ^ j) /* invoke-custom */;
            String str2 = str;
            ?? B2 = B;
            ?? r0 = B;
            if (s >= 0) {
                if (str2 == null) {
                    if (B != 0) {
                        f5 = 1.0f;
                    }
                    B2 = i2 & (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19510, 4134726939345506393L ^ j) /* invoke-custom */;
                }
                str2 = str;
                r0 = B2;
            }
            if (str2 != null) {
                z = r0;
            } else if (r0 != 0) {
                r0 = 1;
                z = r0;
            }
            gfVar.J(matrix3x2fStack, f, f2, f3, j2, f4, f5, z);
        } catch (UnsupportedOperationException unused2) {
            throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, -5373617568064488521L, j) /* invoke-custom */;
        }
    }

    protected final void w(@NotNull Matrix3x2fStack m, float x, float y, float a) {
        Intrinsics.checkNotNullParameter(m, "m");
        w8.T.B().add(new aj(new Matrix3x2f((Matrix3x2fc) m), x, y, 0.5f, 8.5f, a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public static void u(long j, gf gfVar, Matrix3x2fStack matrix3x2fStack, float f, float f2, float f3, int i, Object obj) {
        long j2 = u ^ j;
        ?? unsupportedOperationException = obj;
        if (unsupportedOperationException != 0) {
            try {
                unsupportedOperationException = new UnsupportedOperationException((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22311, 8545360988187606249L ^ j2) /* invoke-custom */);
                throw unsupportedOperationException;
            } catch (UnsupportedOperationException unused) {
                throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(unsupportedOperationException, -2001525966947751197L, j2) /* invoke-custom */;
            }
        } else {
            if ((i & (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17822, 8435750616360552614L ^ j2) /* invoke-custom */) != 0) {
                f3 = 1.0f;
            }
            gfVar.w(matrix3x2fStack, f, f2, f3);
        }
    }

    protected final void m(@NotNull bj image, @NotNull Matrix3x2fStack m, float x, float y, float w, long a, float h, float a2) {
        long j = u ^ a;
        Intrinsics.checkNotNullParameter(image, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17036, 1501224778669912070L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(m, "m");
        w8.T.X().add(new ff(j ^ 11614707618062L, image, new Matrix3x2f((Matrix3x2fc) m), x, y, w, h, a2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public static void l(gf gfVar, bj bjVar, Matrix3x2fStack matrix3x2fStack, float f, float f2, float f3, long j, float f4, float f5, int i, Object obj) {
        long j2 = u ^ j;
        long j3 = j2 ^ 70630953007495L;
        ?? unsupportedOperationException = obj;
        if (unsupportedOperationException != 0) {
            try {
                unsupportedOperationException = new UnsupportedOperationException((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22768, 3745519605229319728L ^ j2) /* invoke-custom */);
                throw unsupportedOperationException;
            } catch (UnsupportedOperationException unused) {
                throw (UnsupportedOperationException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(UnsupportedOperationException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(unsupportedOperationException, 2395452235034931172L, j2) /* invoke-custom */;
            }
        } else {
            if ((i & (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19510, 4134806289554785290L ^ j2) /* invoke-custom */) != 0) {
                f5 = 1.0f;
            }
            gfVar.m(bjVar, matrix3x2fStack, f, f2, f3, j3, f4, f5);
        }
    }

    protected final void Z(@NotNull class_332 context, @NotNull String s, float x, long a, float y, @NotNull Color color) throws Throwable {
        long j = u ^ a;
        long j2 = j ^ 46553833905876L;
        Intrinsics.checkNotNullParameter(context, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27214, 2055639976252908516L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28444, 2333065126662874787L ^ j) /* invoke-custom */);
        c6 c6VarF = b8.f(j ^ 129818166237779L);
        Matrix3x2fStack matrix3x2fStackMethod_51448 = context.method_51448();
        Intrinsics.checkNotNullExpressionValue(matrix3x2fStackMethod_51448, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29562, 1734887327598295757L ^ j) /* invoke-custom */);
        c6.W(c6VarF, matrix3x2fStackMethod_51448, s, x, y, j2, color, false, 0, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8080, 8150977881992589506L ^ j) /* invoke-custom */, null);
    }

    static {
        int i;
        long j = u ^ 49269217096539L;
        bb = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, 6332125215637917244L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[28];
        int i3 = 0;
        String str = "1\u0002ÿC¾çÊ¤Ö\u0085Ã7Á@\u00982\u0087Ò=hæÜNîY¾<\u0089T0¶ß\u0010mî¦`\u000e±ó3ê´\u008c Ni¼Q\u0010£ã\f\u009f\u0004w:Ø-\nä¼³v(¦\u0010åã¸øÚ:\u0093Y¢|&c\u0098^\u001b]\u0010ÿ\u009eÔ\u0006µT\u001b\u0091h\u0006l 8y3«\u0010\u0093\u008cCfä¹2B¡u\u0090\"pêï!\u0010êÏm\u001fª\u0090A\u0006ô\u008f eç¡È\u009e\u0010Ã\u008cÀ~T\u001e ã°\u0012\u0084ý\u0094\u000fÂy\u0010\u008eÄåÛ,²ï5z}\rUdÐ\u0004\u00950AÆ\u0002ïÕ\u0089-8v\u001f\u008e\u008a\u0019\u001a\u009b(¬Ø.±K{\u001b\u00118\u000fó\f¶&×æ(¸_óIf\u000fµ\u0097£Ê\u0000<\\+M\u0010\u0082\u001d}qÄ5\u00adG\f\u0089¸ú£\u009af£\u0018\u008fÒÚ6>\u0001!¾Ô\u001d\u0085È!\u001c\u0088\u0083«=hï\u0018\u008a=\u008e\u0018sý\u0088\fjÑl|\u0084iDfz\t\u001cR¡å\u000f\u0094ß\u0018\u009c\u009b ³¬\n$ìúD\"éqºÇf~\f\u0012\u001dyb\\©,Û`î\u00103ö~D\u0002\r\u0010\r×FÌ7¶\u008d\u000bfë\u009b\u0018\u0000\t6÷\u0088h ´h¯üÉ:ú\u0081\u0016GÀÕk¢XÂçFmÇ\u0019#ê\u001e]³4Dv?\u007fÓÕÙ J\r\u0098×8h¿@ÊÛ\u0083eÌá@$t\u008bbA\u008b%\u009e \u0011ÞFÚ\u0093ÿ©²²ö³OqL¹.Z»Ë×Dü\u000esÌ¬\u001d\u0010ví¿:lì5\u0098\u0095ß2¶\rò8+G\u0019'\u001erÃ\u0085Hë\u0087u&ÒÝ&é\u001e$i\u0014)Ä\u001eÙ\u000f²ÝÚÏ±¢\u0080\u0085(v5ãä\u0007Ó¿¡*G\u0090D\u000f¦æà¾\"Ó'1\u0004\u0088\u0083¢j.¡ìH\u0003Dwi)\u001cãÕI\u0086ü¿û¦K$\u001fý\u0095ZE·\u008f\u001c\u008aÝ\u009c\u0095\u0081ø.\u001dÃÔ;|?^`V}\u008b\u0005_\u001d\u0003¹\u0088¡æþ,f\u0083\u000f$\u009dv\u0010ó\u008eÝüV\u0013ôw]Êµ\u0085qZF%«Þ\u0080\u0098ô\u0000\u001c\"p\u0099£\u0015Z\u008c^å \u001cÏÌ\u0005P+®\u0019sñ\u0011¶ýµ¡\u001a´Ö\u0012©\u000e;\u001b\u000e¬È³u´n\u0000Æ\u000eaÄA\u0095Mé¨ôÈãGÚ\fj\u008frøR>5e2\u0083,c®|T\u008e\u0088Rq\u009d'è\u008ceßÏ.{\u0080Ü6\u008arµÅæ¹XQ(\u0088¶\u0089]È\u0013]µ5\u009e92\n\u0097 Âõ\u0011ÈÛ\"¶\u00847\u0004\u0003K=÷\u0092%\u0098\u0099/\u009f\u0011±nï\u0017\u0010\u0016\u0085<\u0084Æóô*\u0083ßÞh\u007few\u000b\u0010\u0096\u000eiæ\u001bV9Ã\u000f\u009bÅ\u000e%k\u0091è\u0010XJì\u0093\u0096¤\u0019ovlE:ª2»\u0088\u0010e\u001d\u001fñ]\u00804á\u0012/÷Ä'ù\u001d×\u0018ê4\u000b\u001d\u0010å\u0081Ëß\u000bb\u0015ïÈJ¢\u009cgô\u0010Ã\u0002´ä\u0010g¨$Eè\u007fQ\u0001^Ö Ts%Ì1\u0088/`Ïf\u009dªk¡§\u0095)$ÿâ\u00adä \u0091\u001bnÅÐ³\u0080cAëèÓ;û c\u0096\bçvò`Pu\u008e3®ÐfÜ>ùÀ¤\u0095¼\u001b5+ã\u00adN!4N\u0083©\u001c\u0095=õ\u008ej\u0099À)\f«3BCkäbç@5Éî2¦åÆó\u0093\u00810\u0015\u0082«\u0081\r.C\rî\u0016µ\u009a$\u0090øÕG¾-\u0012u\u001e\u008f\\'ì.c®\u0086¨´»©_Ñy1êùæí";
        int length = "1\u0002ÿC¾çÊ¤Ö\u0085Ã7Á@\u00982\u0087Ò=hæÜNîY¾<\u0089T0¶ß\u0010mî¦`\u000e±ó3ê´\u008c Ni¼Q\u0010£ã\f\u009f\u0004w:Ø-\nä¼³v(¦\u0010åã¸øÚ:\u0093Y¢|&c\u0098^\u001b]\u0010ÿ\u009eÔ\u0006µT\u001b\u0091h\u0006l 8y3«\u0010\u0093\u008cCfä¹2B¡u\u0090\"pêï!\u0010êÏm\u001fª\u0090A\u0006ô\u008f eç¡È\u009e\u0010Ã\u008cÀ~T\u001e ã°\u0012\u0084ý\u0094\u000fÂy\u0010\u008eÄåÛ,²ï5z}\rUdÐ\u0004\u00950AÆ\u0002ïÕ\u0089-8v\u001f\u008e\u008a\u0019\u001a\u009b(¬Ø.±K{\u001b\u00118\u000fó\f¶&×æ(¸_óIf\u000fµ\u0097£Ê\u0000<\\+M\u0010\u0082\u001d}qÄ5\u00adG\f\u0089¸ú£\u009af£\u0018\u008fÒÚ6>\u0001!¾Ô\u001d\u0085È!\u001c\u0088\u0083«=hï\u0018\u008a=\u008e\u0018sý\u0088\fjÑl|\u0084iDfz\t\u001cR¡å\u000f\u0094ß\u0018\u009c\u009b ³¬\n$ìúD\"éqºÇf~\f\u0012\u001dyb\\©,Û`î\u00103ö~D\u0002\r\u0010\r×FÌ7¶\u008d\u000bfë\u009b\u0018\u0000\t6÷\u0088h ´h¯üÉ:ú\u0081\u0016GÀÕk¢XÂçFmÇ\u0019#ê\u001e]³4Dv?\u007fÓÕÙ J\r\u0098×8h¿@ÊÛ\u0083eÌá@$t\u008bbA\u008b%\u009e \u0011ÞFÚ\u0093ÿ©²²ö³OqL¹.Z»Ë×Dü\u000esÌ¬\u001d\u0010ví¿:lì5\u0098\u0095ß2¶\rò8+G\u0019'\u001erÃ\u0085Hë\u0087u&ÒÝ&é\u001e$i\u0014)Ä\u001eÙ\u000f²ÝÚÏ±¢\u0080\u0085(v5ãä\u0007Ó¿¡*G\u0090D\u000f¦æà¾\"Ó'1\u0004\u0088\u0083¢j.¡ìH\u0003Dwi)\u001cãÕI\u0086ü¿û¦K$\u001fý\u0095ZE·\u008f\u001c\u008aÝ\u009c\u0095\u0081ø.\u001dÃÔ;|?^`V}\u008b\u0005_\u001d\u0003¹\u0088¡æþ,f\u0083\u000f$\u009dv\u0010ó\u008eÝüV\u0013ôw]Êµ\u0085qZF%«Þ\u0080\u0098ô\u0000\u001c\"p\u0099£\u0015Z\u008c^å \u001cÏÌ\u0005P+®\u0019sñ\u0011¶ýµ¡\u001a´Ö\u0012©\u000e;\u001b\u000e¬È³u´n\u0000Æ\u000eaÄA\u0095Mé¨ôÈãGÚ\fj\u008frøR>5e2\u0083,c®|T\u008e\u0088Rq\u009d'è\u008ceßÏ.{\u0080Ü6\u008arµÅæ¹XQ(\u0088¶\u0089]È\u0013]µ5\u009e92\n\u0097 Âõ\u0011ÈÛ\"¶\u00847\u0004\u0003K=÷\u0092%\u0098\u0099/\u009f\u0011±nï\u0017\u0010\u0016\u0085<\u0084Æóô*\u0083ßÞh\u007few\u000b\u0010\u0096\u000eiæ\u001bV9Ã\u000f\u009bÅ\u000e%k\u0091è\u0010XJì\u0093\u0096¤\u0019ovlE:ª2»\u0088\u0010e\u001d\u001fñ]\u00804á\u0012/÷Ä'ù\u001d×\u0018ê4\u000b\u001d\u0010å\u0081Ëß\u000bb\u0015ïÈJ¢\u009cgô\u0010Ã\u0002´ä\u0010g¨$Eè\u007fQ\u0001^Ö Ts%Ì1\u0088/`Ïf\u009dªk¡§\u0095)$ÿâ\u00adä \u0091\u001bnÅÐ³\u0080cAëèÓ;û c\u0096\bçvò`Pu\u008e3®ÐfÜ>ùÀ¤\u0095¼\u001b5+ã\u00adN!4N\u0083©\u001c\u0095=õ\u008ej\u0099À)\f«3BCkäbç@5Éî2¦åÆó\u0093\u00810\u0015\u0082«\u0081\r.C\rî\u0016µ\u009a$\u0090øÕG¾-\u0012u\u001e\u008f\\'ì.c®\u0086¨´»©_Ñy1êùæí".length();
        char cCharAt = ' ';
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
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
                            Z = strArr;
                            ab = new String[28];
                            eb = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[20];
                            int i9 = 0;
                            String str3 = "Ö\u0089yQ\u0086¦iÇ®X\u0088]iE\u000eÞqÃéY´\u0098\u008d\u0089q¬{\u00934\u001fÃª½õ5ãx|x:\u0089(¸i{h\u0002FÄî|L^\u0080á6±¨/Ö: \u008a¬W×Uj3ì]l\u0005[Ýdû^Ô W=äÎ\u0095Óÿu\u009b\u0015Ã¸ñ\u0089nËª¹.hÕ¥#²\u000b`\u0005Úa¿I\u0015Ø\u0013\f+¢\u0003âÌ1is¦\n?ÊÞ\u0081Áh2Au\u008d]ºt~G¦\u009bh7";
                            int length2 = "Ö\u0089yQ\u0086¦iÇ®X\u0088]iE\u000eÞqÃéY´\u0098\u008d\u0089q¬{\u00934\u001fÃª½õ5ãx|x:\u0089(¸i{h\u0002FÄî|L^\u0080á6±¨/Ö: \u008a¬W×Uj3ì]l\u0005[Ýdû^Ô W=äÎ\u0095Óÿu\u009b\u0015Ã¸ñ\u0089nËª¹.hÕ¥#²\u000b`\u0005Úa¿I\u0015Ø\u0013\f+¢\u0003âÌ1is¦\n?ÊÞ\u0081Áh2Au\u008d]ºt~G¦\u009bh7".length();
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
                                                cb = jArr;
                                                db = new Integer[20];
                                                d = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(gf.class, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8905, 5997343448115509912L ^ j) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7362, 369086142322754695L ^ j) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(gf.class, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19706, 8668566338803438754L ^ j) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29587, 7408075875488869331L ^ j) /* invoke-custom */, 0))};
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b4] = j4;
                                            if (i10 >= length2) {
                                                str3 = "7\u0088Hõ\u0004\u0000u\u007f\u009d}\u000b\u0083d²5U";
                                                length2 = "7\u0088Hõ\u0004\u0000u\u007f\u009d}\u000b\u0083d²5U".length();
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
                        str = "½ÜA\u0015\u008aè÷Ó\u009c\u008fz(6ë\u0092ýIR\u0000æ9¯\u0091\u008dÁ:ö²\u0002V\u008aH\r¶\u0095\u0002DQ\u0015*º\u0080Ès%\u001d6ÌªÝ\u0019M®Æ9 p\u001cM\u0019F)R\u000fñ-\u0084¥»\u009aDÄ1©É\t\u008eÐ4WÆùßD£8\u001c¥$uÂÕ\u00941Ó¾8h\\Þ\u008a8ó|æ\u008co²\u0012\u0097EØù¿C~¹\u0012ã\u000fj\u008b\u0084\u0098ñ\u009d/\u0094³\u0012*åâ*ìù 7Ø^Zq$¼sµ°vÁ$\u008e\u001fÚ\u0083Å\u0084}\u009e\u000f\u0000¿B¼\u0001OíR\u0019¬";
                        length = "½ÜA\u0015\u008aè÷Ó\u009c\u008fz(6ë\u0092ýIR\u0000æ9¯\u0091\u008dÁ:ö²\u0002V\u008aH\r¶\u0095\u0002DQ\u0015*º\u0080Ès%\u001d6ÌªÝ\u0019M®Æ9 p\u001cM\u0019F)R\u000fñ-\u0084¥»\u009aDÄ1©É\t\u008eÐ4WÆùßD£8\u001c¥$uÂÕ\u00941Ó¾8h\\Þ\u008a8ó|æ\u008co²\u0012\u0097EØù¿C~¹\u0012ã\u000fj\u008b\u0084\u0098ñ\u009d/\u0094³\u0012*åâ*ìù 7Ø^Zq$¼sµ°vÁ$\u008e\u001fÚ\u0083Å\u0084}\u009e\u000f\u0000¿B¼\u0001OíR\u0019¬".length();
                        cCharAt = 136;
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

    public static void k(String str) {
        W = str;
    }

    public static String m() {
        return W;
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    private static String a(byte[] bArr) {
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

    private static String a(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 3788;
        if (ab[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) bb.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    bb.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                ab[i2] = a(((Cipher) objArr[0]).doFinal(Z[i2].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/gf", e);
            }
        }
        return ab[i2];
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
            r1 = r52
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
            java.lang.String r0 = "su/catlean/gf"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gf.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 10274;
        if (db[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) cb[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) eb.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/gf", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            db[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return db[i2].intValue();
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
            r1 = r52
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
            java.lang.String r0 = "su/catlean/gf"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gf.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
