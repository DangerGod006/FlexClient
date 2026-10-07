package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2fStack;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/dt.class */
public abstract class dt extends dj {

    @NotNull
    private final String k;

    @Nullable
    private Object g;
    private boolean W;
    private boolean a;

    @NotNull
    private String w;
    private static int p;
    private static final long c = 0;
    private static final String[] i = null;
    private static final String[] m = null;
    private static final Map n = null;
    private static final long[] u = null;
    private static final Integer[] A = null;
    private static final Map B = null;
    private static final long C = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public dt(int a, int a2, @NotNull String title, byte a3) {
        long j = (((((long) a) << 32) | ((((long) a2) << 40) >>> 32)) | ((((long) a3) << 56) >>> 56)) ^ c;
        Intrinsics.checkNotNullParameter(title, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10593, 3913483959331140908L ^ j) /* invoke-custom */);
        super(j ^ 95963845695957L);
        this.k = title;
        this.W = true;
        this.w = "";
    }

    @NotNull
    protected final String x() {
        return this.w;
    }

    protected final void I(@NotNull String str, long a) {
        Intrinsics.checkNotNullParameter(str, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11483, 2305760007214717560L ^ (c ^ a)) /* invoke-custom */);
        this.w = str;
    }

    @Override // su.catlean.dj
    public void B(@NotNull class_332 context, long a, int mouseX, int mouseY) throws Throwable {
        long j = a ^ 49135606458366L;
        long j2 = a ^ 138498907406235L;
        Intrinsics.checkNotNullParameter(context, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28775, 3535944608719077988L ^ a) /* invoke-custom */);
        float fMethod_4486 = (zf.F(j).method_22683().method_4486() / 2.0f) - (l() / 2.0f);
        float fMethod_4502 = ((zf.F(j).method_22683().method_4502() / 2.0f) - (p() / 2.0f)) - 50.0f;
        b8.v(a ^ 31386901146457L).g(a ^ 42294086766012L, context, this.k, fMethod_4486 + (l() / 2.0f), fMethod_4502 + 3, (int) e(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12411, 4732257175529804104L ^ a) /* invoke-custom */);
        N(context, fMethod_4486, fMethod_4502, a ^ 52204105005381L);
        T(context, fMethod_4486, fMethod_4502, a ^ 116260126008077L);
        k(context, (int) (a >>> 32), fMethod_4486, fMethod_4502, mouseX, (char) ((j2 << 32) >>> 48), (short) ((j2 << 48) >>> 48), mouseY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0115  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, su.catlean.c6] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [int] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void N(net.minecraft.class_332 r25, float r26, float r27, long r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dt.N(net.minecraft.class_332, float, float, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [int] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, org.joml.Matrix3x2fStack] */
    private final void T(class_332 class_332Var, float f, float f2, long j) throws Throwable {
        c6 c6VarP;
        c6 c6Var;
        long j2 = c ^ j;
        long j3 = j2 ^ 55610656821753L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j3 << 16) >>> 48);
        int i4 = (int) ((j3 << 32) >>> 32);
        long j4 = j2 ^ 120847207200319L;
        long j5 = j2 ^ 85467259892108L;
        int i5 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5636060957152979488L, j2) /* invoke-custom */;
        Object objMethod_51448 = class_332Var.method_51448();
        Intrinsics.checkNotNullExpressionValue(objMethod_51448, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24681, 5846090232989128907L ^ j2) /* invoke-custom */);
        float fL = f + 4.0f;
        float f3 = f2 + 52.0f;
        float fL2 = l() - 8.0f;
        float f4 = 17.0f;
        float f5 = 4.0f;
        float f6 = 2.0f;
        float f7 = 0.1f;
        float f8 = 1.0f;
        Color colorDarker = jh.f.g().darker();
        Intrinsics.checkNotNullExpressionValue(colorDarker, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12505, 4677498494577887356L ^ j2) /* invoke-custom */);
        Color colorF = jh.f.F();
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        int iK = (int) e(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4176, 8077204918395468746L ^ j2) /* invoke-custom */;
        Object obj = null;
        Matrix3x2fStack matrix3x2fStack = objMethod_51448;
        if (i5 != 0) {
            ?? r0 = objMethod_51448;
            if (j2 >= 0) {
                try {
                    try {
                        x1.n(objMethod_51448, (char) i2, fL, f3, fL2, 17.0f, 4.0f, 2.0f, 0.1f, 1.0f, colorDarker, colorF, 0.0f, (short) i3, 0.0f, i4, 0.0f, iK, null);
                        if (this.W) {
                            Matrix3x2fStack matrix3x2fStackMethod_51448 = class_332Var.method_51448();
                            Intrinsics.checkNotNullExpressionValue(matrix3x2fStackMethod_51448, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24681, 5846090232989128907L ^ j2) /* invoke-custom */);
                            x1.n(matrix3x2fStackMethod_51448, (char) i2, f + 6.0f, f2 + 54.0f, (l() / 2.0f) - 8.0f, 13.0f, 3.0f, 2.0f, 0.1f, 1.0f, jh.f.g(), jh.f.F(), 0.0f, (short) i3, 0.0f, i4, 0.0f, (int) e(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4176, 8077204918395468746L ^ j2) /* invoke-custom */, null);
                            objMethod_51448 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                            c6VarP = objMethod_51448;
                            if (objMethod_51448 > 0) {
                                int i6 = i5;
                                c6VarP = i6;
                                if (i6 == 0) {
                                }
                            }
                        }
                        Matrix3x2fStack matrix3x2fStackMethod_514482 = class_332Var.method_51448();
                        Intrinsics.checkNotNullExpressionValue(matrix3x2fStackMethod_514482, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24681, 5846090232989128907L ^ j2) /* invoke-custom */);
                        r0 = matrix3x2fStackMethod_514482;
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_51448, -5650725589244299306L, j2) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_51448, -5650725589244299306L, j2) /* invoke-custom */;
                }
            }
            fL = ((f + 6.0f) + (l() / 2.0f)) - 4;
            f3 = f2 + 54.0f;
            fL2 = (l() / 2.0f) - 8.0f;
            f4 = 13.0f;
            f5 = 3.0f;
            f6 = 2.0f;
            f7 = 0.1f;
            f8 = 1.0f;
            colorDarker = jh.f.g();
            colorF = jh.f.F();
            f9 = 0.0f;
            f10 = 0.0f;
            f11 = 0.0f;
            iK = (int) e(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4176, 8077204918395468746L ^ j2) /* invoke-custom */;
            obj = null;
            matrix3x2fStack = r0;
            float f12 = f11;
            Color color = colorF;
            Color color2 = colorDarker;
            float f13 = f8;
            float f14 = f7;
            float f15 = f6;
            float f16 = f5;
            float f17 = f4;
            float f18 = fL2;
            float f19 = f3;
            float f20 = fL;
            char c2 = (char) i2;
            x1.n(matrix3x2fStack, c2, f20, f19, f18, f17, f16, f15, f14, f13, color2, color, f9, (short) i3, f10, i4, f12, iK, obj);
            c6VarP = matrix3x2fStack;
        } else {
            float f122 = f11;
            Color color3 = colorF;
            Color color22 = colorDarker;
            float f132 = f8;
            float f142 = f7;
            float f152 = f6;
            float f162 = f5;
            float f172 = f4;
            float f182 = fL2;
            float f192 = f3;
            float f202 = fL;
            char c22 = (char) i2;
            x1.n(matrix3x2fStack, c22, f202, f192, f182, f172, f162, f152, f142, f132, color22, color3, f9, (short) i3, f10, i4, f122, iK, obj);
            c6VarP = matrix3x2fStack;
        }
        try {
            c6VarP = b8.p(j4);
            class_332 class_332Var2 = class_332Var;
            String strN = (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6777, 2901509131949859542L ^ j2) /* invoke-custom */;
            float fL3 = f + (l() / 4.0f);
            float f21 = f2 + 60.5f;
            Color colorT = this.W ? jh.f.t() : jh.f.r();
            c6 c6Var2 = c6VarP;
            if (j2 > 0) {
                try {
                    c6VarP.I(class_332Var2, strN, fL3, f21, colorT, j5);
                    c6VarP = b8.p(j4);
                    class_332Var2 = class_332Var;
                    strN = (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15596, 3402394920853947467L ^ j2) /* invoke-custom */;
                    fL3 = f + ((3 * l()) / 4.0f);
                    f21 = f2 + 60.5f;
                    if (this.W) {
                        colorT = jh.f.r();
                        c6Var = c6VarP;
                    } else {
                        colorT = jh.f.t();
                        c6Var2 = c6VarP;
                        c6Var = c6Var2;
                    }
                } catch (NumberFormatException unused3) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(c6VarP, -5650725589244299306L, j2) /* invoke-custom */;
                }
            } else {
                c6Var = c6Var2;
            }
            c6Var.I(class_332Var2, strN, fL3, f21, colorT, j5);
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(c6VarP, -5650725589244299306L, j2) /* invoke-custom */;
        }
    }

    @NotNull
    protected abstract List a(long j);

    @NotNull
    protected abstract String n(long j, Object obj);

    protected abstract boolean O(Object obj, long j);

    protected abstract void v(Object obj, long j);

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void k(net.minecraft.class_332 r24, int r25, float r26, float r27, int r28, char r29, short r30, int r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dt.k(net.minecraft.class_332, int, float, float, int, char, short, int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // su.catlean.dj
    public void T(long r8, int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dt.T(long, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [su.catlean.dt] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // su.catlean.dj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(int r8, long r9) {
        /*
            r7 = this;
            r0 = r9
            r1 = r0; r0 = r0; 
            r2 = 0
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 672567780086327126(0x95570d5236b2756, double:1.0639073891854821E-263)
            r1 = r9
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r13 = r0
            r0 = r13
            if (r0 != 0) goto Lc2
            r0 = r8
            r1 = r9
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L57
            switch(r0) {
                case 256: goto L4a;
                case 257: goto L4a;
                case 258: goto Lbb;
                case 259: goto L67;
                default: goto Lbb;
            }     // Catch: java.lang.NumberFormatException -> L40 java.lang.NumberFormatException -> L5d
        L40:
            r1 = 651820398485933897(0x90bbb32ed1b8f49, double:4.300146081142835E-265)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L5d
            throw r0     // Catch: java.lang.NumberFormatException -> L5d
        L4a:
            r0 = r7
            r1 = 0
            r0.a = r1     // Catch: java.lang.NumberFormatException -> L5d java.lang.NumberFormatException -> L87
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lc2
            r0 = r13
        L57:
            if (r0 == 0) goto Lbb
            goto L67
        L5d:
            r1 = 651820398485933897(0x90bbb32ed1b8f49, double:4.300146081142835E-265)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L87
            throw r0     // Catch: java.lang.NumberFormatException -> L87
        L67:
            r0 = r7
            r1 = r7
            java.lang.String r1 = r1.w     // Catch: java.lang.NumberFormatException -> L87 java.lang.NumberFormatException -> L97
            r2 = 1
            java.lang.String r1 = kotlin.text.StringsKt.dropLast(r1, r2)     // Catch: java.lang.NumberFormatException -> L87 java.lang.NumberFormatException -> L97
            r0.w = r1     // Catch: java.lang.NumberFormatException -> L87 java.lang.NumberFormatException -> L97
            r0 = r7
            java.lang.String r0 = r0.w     // Catch: java.lang.NumberFormatException -> L87 java.lang.NumberFormatException -> L97
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.lang.NumberFormatException -> L87 java.lang.NumberFormatException -> L97
            int r0 = r0.length()     // Catch: java.lang.NumberFormatException -> L87 java.lang.NumberFormatException -> L97
            r1 = r13
            if (r1 != 0) goto La2
            goto L91
        L87:
            r1 = 651820398485933897(0x90bbb32ed1b8f49, double:4.300146081142835E-265)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L97
            throw r0     // Catch: java.lang.NumberFormatException -> L97
        L91:
            if (r0 != 0) goto La5
            goto La1
        L97:
            r1 = 651820398485933897(0x90bbb32ed1b8f49, double:4.300146081142835E-265)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        La1:
            r0 = 1
        La2:
            goto La6
        La5:
            r0 = 0
        La6:
            if (r0 == 0) goto Lbb
            r0 = r7
            r1 = 0
            r0.a = r1     // Catch: java.lang.NumberFormatException -> Lb1
            goto Lbb
        Lb1:
            r1 = 651820398485933897(0x90bbb32ed1b8f49, double:4.300146081142835E-265)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lbb:
            r0 = r7
            r1 = r8
            r2 = r11
            super.w(r1, r2)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dt.w(int, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[Catch: NumberFormatException -> 0x0072, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0072, blocks: (B:18:0x0050, B:20:0x0060), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [su.catlean.dt] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // su.catlean.dj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void I(long r8, char r10) {
        /*
            r7 = this;
            r0 = 6888181981803199423(0x5f97bd046da03bbf, double:3.108195522891499E152)
            r1 = r8
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r11 = r0
            r0 = r7
            boolean r0 = r0.a     // Catch: java.lang.NumberFormatException -> L20
            r1 = r11
            r2 = r8
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L5d
            if (r1 == 0) goto L50
            if (r0 == 0) goto L80
            goto L2a
        L20:
            r1 = 6902780643331070345(0x5fcb9a6c3030d989, double:2.8913951755113463E153)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L33
            throw r0     // Catch: java.lang.NumberFormatException -> L33
        L2a:
            r0 = r7
            r1 = r11
            if (r1 == 0) goto L7c
            goto L3d
        L33:
            r1 = 6902780643331070345(0x5fcb9a6c3030d989, double:2.8913951755113463E153)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L46
            throw r0     // Catch: java.lang.NumberFormatException -> L46
        L3d:
            java.lang.String r0 = r0.w     // Catch: java.lang.NumberFormatException -> L46
            int r0 = r0.length()     // Catch: java.lang.NumberFormatException -> L46
            goto L50
        L46:
            r1 = 6902780643331070345(0x5fcb9a6c3030d989, double:2.8913951755113463E153)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L50:
            r1 = 14292(0x37d4, float:2.0027E-41)
            r2 = 4992135469599666710(0x4547a0c2981db216, double:5.712892423571758E25)
            r3 = r8
            long r2 = r2 ^ r3
            int r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/dt;->e(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "k"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r1, r2)     // Catch: java.lang.NumberFormatException -> L72
        L5d:
            if (r0 >= r1) goto L80
            r0 = r7
            r1 = r7
            java.lang.String r1 = r1.w     // Catch: java.lang.NumberFormatException -> L72
            r2 = r10
            java.lang.String r1 = r1 + r2     // Catch: java.lang.NumberFormatException -> L72
            r0.w = r1     // Catch: java.lang.NumberFormatException -> L72
            r0 = r7
            goto L7c
        L72:
            r1 = 6902780643331070345(0x5fcb9a6c3030d989, double:2.8913951755113463E153)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L7c:
            r1 = 0
            r0.Z(r1)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dt.I(long, char):void");
    }

    public void j(@NotNull class_332 context, float x, float y, long a, Object component) {
        Intrinsics.checkNotNullParameter(context, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29865, 4722312863181285644L ^ a) /* invoke-custom */);
    }

    public static void c(int i2) {
        p = i2;
    }

    public static int O() {
        return p;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int R() {
        if (O() == 0) {
            return AbstractJsonLexerKt.BEGIN_OBJ;
        }
        return 0;
    }

    private static NumberFormatException b(NumberFormatException numberFormatException) {
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 18622;
        if (m[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) n.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    n.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                m[i3] = b(((Cipher) objArr[0]).doFinal(i[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/dt", e);
            }
        }
        return m[i3];
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
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
            r1 = 5
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
            java.lang.String r1 = "su/catlean/dt"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dt.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int e(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 23425;
        if (A[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) u[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) B.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    B.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/dt", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            A[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return A[i3].intValue();
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
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
            r1 = 5
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
            java.lang.String r1 = "su/catlean/dt"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dt.e(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
