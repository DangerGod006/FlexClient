package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import net.minecraft.class_276;
import net.minecraft.class_290;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryUtil;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/g7.class */
public final class g7 {

    @NotNull
    private final VertexFormat O;
    private final boolean m;
    private ByteBuffer b;
    private final int x;
    private ByteBuffer M;
    private long j;
    private long A;
    private final ByteBuffer T;
    private long k;

    @NotNull
    private final int[] L;
    private int v;
    private int w;
    private int U;
    private final boolean B;
    private final boolean h;

    @NotNull
    private final Vector3f d;
    private static String[] t;
    private static final long a = yz.a(4593026781476974556L, 1292558664199173954L, MethodHandles.lookup().lookupClass()).a(178441875227259L);
    private static final String[] c;
    private static final String[] e;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] i;
    private static final Map l;
    private static final long[] n;
    private static final Long[] o;
    private static final Map p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [su.catlean.g7] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [int] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    public g7(int i2, long j, @NotNull VertexFormat vertexFormat, int i3, boolean z) {
        long j2 = ((((long) i2) << 32) | ((j << 32) >>> 32)) ^ a;
        Intrinsics.checkNotNullParameter(vertexFormat, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25389, 8191206824388698949L ^ j2) /* invoke-custom */);
        ?? r0 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8131811715319373529L, j2) /* invoke-custom */;
        this.O = vertexFormat;
        this.m = z;
        try {
            this.b = BufferUtils.createByteBuffer(this.O.getVertexSize() * i3 * 4);
            r0 = this;
            boolean z2 = this.m;
            r0.x = r0 == 0 ? z2 ? 2 : (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15395, 6242128073261756018L ^ j2) /* invoke-custom */ : z2;
            this.M = BufferUtils.createByteBuffer(i3 * this.x * 4);
            this.j = MemoryUtil.memAddress0(this.b);
            this.A = MemoryUtil.memAddress0(this.M);
            this.T = MemoryUtil.memAlloc((int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11104, 6985394795481708848L ^ j2) /* invoke-custom */);
            this.k = this.j;
            this.L = new int[4];
            this.B = Intrinsics.areEqual(this.O, class_290.field_1592);
            this.h = Intrinsics.areEqual(this.O, class_290.field_1585);
            this.d = new Vector3f();
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8096665713163997668L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g7(long j, VertexFormat vertexFormat, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        long j2 = a ^ j;
        int i4 = (int) (j2 >>> 32);
        long j3 = ((j2 ^ 74991063436375L) << 32) >>> 32;
        if ((i3 & 1) != 0) {
            VertexFormat vertexFormat2 = class_290.field_1592;
            Intrinsics.checkNotNullExpressionValue(vertexFormat2, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27497, 538229400808993832L ^ j2) /* invoke-custom */);
            vertexFormat = vertexFormat2;
        }
        this(i4, j3, vertexFormat, (i3 & 2) != 0 ? 1 : i2, (i3 & 4) != 0 ? false : z);
    }

    public final boolean A() {
        return this.m;
    }

    @NotNull
    public final g7 u(long j) {
        long j2 = (a ^ j) ^ 44841182356248L;
        return G(-1.0f, j2, -1.0f, 0.0f).G(-1.0f, j2, 1.0f, 0.0f).G(1.0f, j2, 1.0f, 0.0f).G(1.0f, j2, -1.0f, 0.0f);
    }

    @NotNull
    public final g7 T(short s, short s2, int i2) {
        long j = (((((long) s) << 48) | ((((long) s2) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a;
        long j2 = j ^ 114790030281856L;
        long j3 = j ^ 79030676370618L;
        long j4 = j ^ 12262281376340L;
        long j5 = j ^ 99133567637359L;
        float fMethod_4486 = zf.F(j2).method_22683().method_4486();
        float fMethod_4502 = zf.F(j2).method_22683().method_4502();
        g7 g7VarJ = G(0.0f, j3, fMethod_4502, 0.0f).j(0.0f, j5, 0.0f);
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10574, 2491310894055077507L ^ j) /* invoke-custom */);
        g7 g7VarJ2 = g7VarJ.n(color, j4).G(0.0f, j3, 0.0f, 0.0f).j(0.0f, j5, 1.0f);
        Color color2 = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color2, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22233, 4046159700459964677L ^ j) /* invoke-custom */);
        g7 g7VarJ3 = g7VarJ2.n(color2, j4).G(fMethod_4486, j3, 0.0f, 0.0f).j(1.0f, j5, 1.0f);
        Color color3 = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color3, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22233, 4046159700459964677L ^ j) /* invoke-custom */);
        g7 g7VarJ4 = g7VarJ3.n(color3, j4).G(fMethod_4486, j3, fMethod_4502, 0.0f).j(1.0f, j5, 0.0f);
        Color color4 = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color4, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22233, 4046159700459964677L ^ j) /* invoke-custom */);
        return g7VarJ4.n(color4, j4);
    }

    @NotNull
    public final g7 o(@NotNull Matrix4f matrix, long a2, float x, float y, float z, float u, float v, @NotNull Color color) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(matrix, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17486, 6429209154431766951L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30711, 213107434892747265L ^ j) /* invoke-custom */);
        matrix.transformPosition(x, y, z, this.d);
        c(this.d.x, this.d.y, this.d.z, u, v, color, j ^ 115016219901394L);
        return this;
    }

    @NotNull
    public final g7 c(float x, float y, float z, float u, float v, @NotNull Color color, long a2) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31777, 3881353189118592885L ^ j) /* invoke-custom */);
        F(j ^ 95994475545893L, (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24619, 40750348503484747L ^ j) /* invoke-custom */);
        this.T.putFloat(0, x);
        this.T.putFloat(4, y);
        this.T.putFloat((int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18967, 3208267836183946080L ^ j) /* invoke-custom */, z);
        this.T.putFloat((int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18579, 6590412752752157170L ^ j) /* invoke-custom */, u);
        this.T.putFloat((int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27672, 7599707658548348266L ^ j) /* invoke-custom */, v);
        this.T.put((int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27524, 7971894069183841008L ^ j) /* invoke-custom */, (byte) color.getRed());
        this.T.put((int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23340, 6910231750176387666L ^ j) /* invoke-custom */, (byte) color.getGreen());
        this.T.put((int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6555, 2898681032860889323L ^ j) /* invoke-custom */, (byte) color.getBlue());
        this.T.put((int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5694, 5079975028279836509L ^ j) /* invoke-custom */, (byte) RangesKt.coerceIn((int) (color.getAlpha() * jl.y.t()), (ClosedRange<Integer>) new IntRange(0, (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2595, 6636844741374010177L ^ j) /* invoke-custom */)));
        MemoryUtil.memCopy(MemoryUtil.memAddress(this.T), this.k, (long) c(MethodHandles.lookup(), "u", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29469, 893193862364032932L ^ j) /* invoke-custom */);
        this.k += (long) (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11104, 6985454729168863771L ^ j) /* invoke-custom */;
        a(j ^ 59668531466954L);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean._g[]] */
    @NotNull
    public final g7 G(float x, long a2, float y, float z) {
        long j = a ^ a2;
        long j2 = j ^ 123369033421211L;
        F(j ^ 18961381656180L, (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17988, 5725695263110311017L ^ j) /* invoke-custom */);
        MemoryUtil.memPutFloat(this.k, x);
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8600766681399400797L, j) /* invoke-custom */;
        MemoryUtil.memPutFloat(this.k + ((long) 4), y);
        try {
            try {
                MemoryUtil.memPutFloat(this.k + ((long) (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11914, 7516056037437949092L ^ j) /* invoke-custom */), z);
                this.k += (long) (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18579, 6590348501803704995L ^ j) /* invoke-custom */;
                if (obj != 0) {
                    return this;
                }
                obj = this.B;
                if (obj != 0) {
                    a(j2);
                }
                return this;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8635883735181596262L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8635883735181596262L, j) /* invoke-custom */;
        }
    }

    public static g7 j(g7 g7Var, float f2, float f3, float f4, int i2, long j, Object obj) {
        long j2 = (a ^ j) ^ 44302668378849L;
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        return g7Var.G(f2, j2, f3, f4);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0048: INVOKE (r-1 I:su.catlean.g7), (r0 I:float), (r1 I:long), (r2 I:float), (r3 I:float) VIRTUAL call: su.catlean.g7.G(float, long, float, float):su.catlean.g7
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @org.jetbrains.annotations.NotNull
    public final su.catlean.g7 O(@org.jetbrains.annotations.NotNull org.joml.Matrix4f r9, float r10, long r11, float r13, float r14) {
        /*
            r8 = this;
            long r0 = su.catlean.g7.a
            r1 = r11
            long r0 = r0 ^ r1
            r11 = r0
            r0 = r11
            r1 = r0; r1 = r0; 
            r2 = 1169490321634(0x1104b0e20e2, double:5.77804991063E-312)
            long r1 = r1 ^ r2
            r15 = r1
            r0 = r9
            r1 = 27345(0x6ad1, float:3.8319E-41)
            r2 = 5475863373937238336(0x4bfe2cb9ea19e140, double:1.1838108499354928E58)
            r3 = r11
            long r2 = r2 ^ r3
            java.lang.String r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/g7;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "s"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r9
            r1 = r10
            r2 = r13
            r3 = r14
            r4 = r8
            org.joml.Vector3f r4 = r4.d
            org.joml.Vector3f r0 = r0.transformPosition(r1, r2, r3, r4)
            r0 = r8
            r1 = r8
            org.joml.Vector3f r1 = r1.d
            float r1 = r1.x
            r2 = r8
            org.joml.Vector3f r2 = r2.d
            float r2 = r2.y
            r3 = r15
            r4 = r3; r3 = r2; r2 = r4; 
            r3 = r8
            org.joml.Vector3f r3 = r3.d
            float r3 = r3.z
            r-1.G(r0, r1, r2, r3)
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.g7.O(org.joml.Matrix4f, float, long, float, float):su.catlean.g7");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x004d: INVOKE (r-1 I:su.catlean.g7), (r0 I:float), (r1 I:long), (r2 I:float), (r3 I:float) VIRTUAL call: su.catlean.g7.G(float, long, float, float):su.catlean.g7
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @org.jetbrains.annotations.NotNull
    public final su.catlean.g7 b(long r9, @org.jetbrains.annotations.NotNull org.joml.Matrix3x2f r11, float r12, float r13, float r14) {
        /*
            r8 = this;
            long r0 = su.catlean.g7.a
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 37754479119340(0x225666510bec, double:1.86531911094966E-310)
            long r1 = r1 ^ r2
            r15 = r1
            r0 = r11
            r1 = 27345(0x6ad1, float:3.8319E-41)
            r2 = 5475831788163484238(0x4bfe0fffc746ca4e, double:1.1794084356080642E58)
            r3 = r9
            long r2 = r2 ^ r3
            java.lang.String r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/g7;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "s"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r8
            r1 = r11
            org.joml.Matrix4f r0 = r0.f(r1)
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r8
            org.joml.Vector3f r4 = r4.d
            org.joml.Vector3f r0 = r0.transformPosition(r1, r2, r3, r4)
            r0 = r8
            r1 = r8
            org.joml.Vector3f r1 = r1.d
            float r1 = r1.x
            r2 = r8
            org.joml.Vector3f r2 = r2.d
            float r2 = r2.y
            r3 = r15
            r4 = r3; r3 = r2; r2 = r4; 
            r3 = r8
            org.joml.Vector3f r3 = r3.d
            float r3 = r3.z
            r-1.G(r0, r1, r2, r3)
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.g7.b(long, org.joml.Matrix3x2f, float, float, float):su.catlean.g7");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [su.catlean.g7] */
    @NotNull
    public final g7 j(float u, long a2, float v) {
        long j = a ^ a2;
        long j2 = j ^ 120935560016462L;
        F(j ^ 14256541705633L, (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18967, 3208345382497616868L ^ j) /* invoke-custom */);
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3131951777262191992L, j) /* invoke-custom */;
        MemoryUtil.memPutFloat(this.k, u);
        MemoryUtil.memPutFloat(this.k + ((long) 4), v);
        this.k += (long) (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18967, 3208345382497616868L ^ j) /* invoke-custom */;
        try {
            obj = this;
            if (obj != 0) {
                return obj;
            }
            try {
                obj = obj.h;
                if (obj != 0) {
                    a(j2);
                }
                return this;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3166647050475194957L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3166647050475194957L, j) /* invoke-custom */;
        }
    }

    @NotNull
    public final g7 n(@NotNull Color c2, long a2) {
        long j = a ^ a2;
        int i2 = (int) (j >>> 32);
        int i3 = (int) (((j ^ 44394268905899L) << 48) >>> 48);
        Intrinsics.checkNotNullParameter(c2, "c");
        return b(c2.getRed(), c2.getGreen(), c2.getBlue(), i2, (char) ((r1 << 32) >>> 48), c2.getAlpha(), i3);
    }

    @NotNull
    public final g7 Y(float r, short a2, float g2, float b, int a3, float a4, int a5) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a5) << 48) >>> 48)) ^ a;
        long j2 = j ^ 88744123566574L;
        return b((int) (r * (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6439, 9152859720855514540L ^ j) /* invoke-custom */), (int) (g2 * (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6439, 9152859720855514540L ^ j) /* invoke-custom */), (int) (b * (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6439, 9152859720855514540L ^ j) /* invoke-custom */), (int) (j >>> 32), (char) ((int) ((j2 << 32) >>> 48)), (int) (a4 * (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6439, 9152859720855514540L ^ j) /* invoke-custom */), (int) ((j2 << 48) >>> 48));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    @NotNull
    public final g7 b(int r, int g2, int b, int a2, char a3, int a4, int a5) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a5) << 48) >>> 48)) ^ a;
        long j2 = j ^ 48434679502266L;
        F(j ^ 84695930831445L, 4);
        MemoryUtil.memPutByte(this.k, (byte) r);
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8321899510106660220L, j) /* invoke-custom */;
        MemoryUtil.memPutByte(this.k + 1, (byte) g2);
        MemoryUtil.memPutByte(this.k + ((long) 2), (byte) b);
        try {
            try {
                MemoryUtil.memPutByte(this.k + ((long) 3), (byte) RangesKt.coerceAtMost((int) (a4 * jl.y.t()), (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6439, 9152745203176109862L ^ j) /* invoke-custom */));
                this.k += (long) 4;
                if (obj != 0) {
                    return this;
                }
                obj = this.B;
                if (obj == 0) {
                    a(j2);
                }
                return this;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8356867511226372679L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8356867511226372679L, j) /* invoke-custom */;
        }
    }

    private final void F(long j, int i2) {
        long j2 = a ^ j;
        int i3 = (int) (this.k - this.j);
        if (i3 + i2 > this.b.capacity()) {
            ByteBuffer byteBuffer = this.b;
            ByteBuffer byteBufferCreateByteBuffer = BufferUtils.createByteBuffer(Math.max(byteBuffer.capacity() * 2, i3 + i2));
            MemoryUtil.memCopy(MemoryUtil.memAddress0(byteBuffer), MemoryUtil.memAddress0(byteBufferCreateByteBuffer), i3);
            this.b = byteBufferCreateByteBuffer;
            this.j = MemoryUtil.memAddress0(this.b);
            this.k = this.j + ((long) i3);
        }
    }

    private final void w(long j, int i2) {
        long j2 = a ^ j;
        int i3 = this.U * 4;
        if (i3 + i2 > this.M.capacity()) {
            ByteBuffer byteBuffer = this.M;
            ByteBuffer byteBufferCreateByteBuffer = BufferUtils.createByteBuffer(Math.max(byteBuffer.capacity() * 2, i3 + i2));
            MemoryUtil.memCopy(MemoryUtil.memAddress0(byteBuffer), MemoryUtil.memAddress0(byteBufferCreateByteBuffer), i3);
            this.M = byteBufferCreateByteBuffer;
            this.A = MemoryUtil.memAddress0(this.M);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v26, types: [long] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    private final g7 a(long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 112523815067422L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5358360993969316958L, j2) /* invoke-custom */;
        int i2 = this.w;
        this.w = i2 + 1;
        this.L[this.v] = i2;
        ?? r0 = this.v;
        try {
            this.v = r0 + 1;
            r0 = this.v;
            boolean z = this.m;
            ?? r1 = z;
            if (_gVarArr == null) {
                r1 = z ? 2 : 4;
            }
            try {
                if (r0 == r1) {
                    try {
                        r0 = this.m;
                        ?? R = r0;
                        if (_gVarArr == null) {
                            R = r0 != 0 ? 2 : (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7243, 2233316004365677725L ^ j2) /* invoke-custom */;
                        }
                        ?? r15 = R;
                        w(j3, (r15 == true ? 1 : 0) * 4);
                        ?? r02 = this.A + (((long) this.U) * ((long) 4));
                        try {
                            try {
                                MemoryUtil.memPutInt((long) r02, this.L[0]);
                                MemoryUtil.memPutInt(r02 + ((long) 4), this.L[1]);
                                g7 g7Var = this;
                                if (_gVarArr == null) {
                                    r02 = g7Var.m;
                                    if (r02 == 0) {
                                        MemoryUtil.memPutInt(r02 + (long) c(MethodHandles.lookup(), "u", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6172, 2176156330914694413L ^ j2) /* invoke-custom */, this.L[2]);
                                        MemoryUtil.memPutInt(r02 + (long) c(MethodHandles.lookup(), "u", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26885, 9205750073513620502L ^ j2) /* invoke-custom */, this.L[2]);
                                        MemoryUtil.memPutInt(r02 + (long) c(MethodHandles.lookup(), "u", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26886, 2295280013716796436L ^ j2) /* invoke-custom */, this.L[3]);
                                        MemoryUtil.memPutInt(r02 + (long) c(MethodHandles.lookup(), "u", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17638, 3789214085429729782L ^ j2) /* invoke-custom */, this.L[0]);
                                    }
                                    this.U += r15 == true ? 1 : 0;
                                    g7Var = this;
                                }
                                g7Var.v = 0;
                            } catch (NumberFormatException unused) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -5393172523206093671L, j2) /* invoke-custom */;
                            }
                        } catch (NumberFormatException unused2) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -5393172523206093671L, j2) /* invoke-custom */;
                        }
                    } catch (NumberFormatException unused3) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5393172523206093671L, j2) /* invoke-custom */;
                    }
                }
                return this;
            } catch (NumberFormatException unused4) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5393172523206093671L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused5) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5393172523206093671L, j2) /* invoke-custom */;
        }
    }

    @NotNull
    public final Matrix4f f(@NotNull Matrix3x2f m) {
        Intrinsics.checkNotNullParameter(m, "m");
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.m00(m.m00());
        matrix4f.m01(m.m01());
        matrix4f.m10(m.m10());
        matrix4f.m11(m.m11());
        matrix4f.m30(m.m20());
        matrix4f.m31(m.m21());
        return matrix4f;
    }

    public final void e(long a2, @NotNull RenderPipeline pipeline, @NotNull class_276 fb, @Nullable GpuBufferSlice ubo, @Nullable Matrix4f matrix3D, @Nullable Matrix3x2f matrix2D, @NotNull Map samplers) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(pipeline, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18285, 450809480711807249L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(fb, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1490, 6274257710473470889L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(samplers, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21503, 4760407712686650752L ^ j) /* invoke-custom */);
        H((char) (j >>> 48), pipeline, fb.method_71639(), fb.method_71640(), ubo, (int) (((j ^ 102227748173265L) << 16) >>> 32), matrix3D, matrix2D, (short) ((r1 << 48) >>> 48), samplers);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:16:0x006a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static void R(long r10, su.catlean.g7 r12, com.mojang.blaze3d.pipeline.RenderPipeline r13, net.minecraft.class_276 r14, com.mojang.blaze3d.buffers.GpuBufferSlice r15, org.joml.Matrix4f r16, org.joml.Matrix3x2f r17, java.util.Map r18, int r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.g7.R(long, su.catlean.g7, com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.class_276, com.mojang.blaze3d.buffers.GpuBufferSlice, org.joml.Matrix4f, org.joml.Matrix3x2f, java.util.Map, int, java.lang.Object):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void H(char r10, @org.jetbrains.annotations.NotNull com.mojang.blaze3d.pipeline.RenderPipeline r11, @org.jetbrains.annotations.Nullable com.mojang.blaze3d.textures.GpuTextureView r12, @org.jetbrains.annotations.Nullable com.mojang.blaze3d.textures.GpuTextureView r13, @org.jetbrains.annotations.Nullable com.mojang.blaze3d.buffers.GpuBufferSlice r14, int r15, @org.jetbrains.annotations.Nullable org.joml.Matrix4f r16, @org.jetbrains.annotations.Nullable org.joml.Matrix3x2f r17, short r18, @org.jetbrains.annotations.NotNull java.util.Map r19) {
        /*
            Method dump skipped, instruction units count: 1043
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.g7.H(char, com.mojang.blaze3d.pipeline.RenderPipeline, com.mojang.blaze3d.textures.GpuTextureView, com.mojang.blaze3d.textures.GpuTextureView, com.mojang.blaze3d.buffers.GpuBufferSlice, int, org.joml.Matrix4f, org.joml.Matrix3x2f, short, java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public static void L(g7 g7Var, long j, RenderPipeline renderPipeline, GpuTextureView gpuTextureView, GpuTextureView gpuTextureView2, GpuBufferSlice gpuBufferSlice, Matrix4f matrix4f, Matrix3x2f matrix3x2f, Map map, int i2, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 12920068952775L;
        int i3 = (int) (j2 >>> 48);
        int i4 = (int) ((j3 << 16) >>> 32);
        int i5 = (int) ((j3 << 48) >>> 48);
        ?? R = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3585870946560171971L, j2) /* invoke-custom */;
        try {
            R = i2 & (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27328, 9179786415885433228L ^ j2) /* invoke-custom */;
            ?? R2 = R;
            if (R == 0) {
                if (R != 0) {
                    matrix4f = null;
                }
                R2 = i2 & (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16213, 8073777765245578257L ^ j2) /* invoke-custom */;
            }
            ?? R3 = R2;
            if (R == 0) {
                if (R2 != 0) {
                    matrix3x2f = null;
                }
                R3 = i2 & (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6430, 956285536289737302L ^ j2) /* invoke-custom */;
            }
            if (R3 != 0) {
                map = MapsKt.emptyMap();
            }
            g7Var.H((char) i3, renderPipeline, gpuTextureView, gpuTextureView2, gpuBufferSlice, i4, matrix4f, matrix3x2f, (short) i5, map);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(R, -3550894355153539322L, j2) /* invoke-custom */;
        }
    }

    private static final String U() {
        return (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4648, 270485689953945465L ^ (a ^ 14574380533793L)) /* invoke-custom */;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g7(long j) {
        long j2 = a ^ j;
        this(j2 ^ 41318603034283L, null, 0, false, (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2544, 1206602483426466132L ^ j2) /* invoke-custom */, null);
    }

    public static void N(String[] strArr) {
        t = strArr;
    }

    public static String[] v() {
        return t;
    }

    static {
        int i2;
        long j = a ^ 113226160942963L;
        f = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[5], 4412414650340231858L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[24];
        int i4 = 0;
        String str = "²Tõ³\u008a\u00961íûÕ'òw\u0092ÄNðH\u001b×Á\u0017&Yúj\b\u0014\u0012\u0093\u0091\u001f\u001e\u008b7gû~\u001e\u001aO2\u0081\u001dnÓ\u0091|\u0082 ¨L\u00ad\u0094S©\u00166Õ?\u009fCkiEá§ÀÙ¯k\u0096âë\r\u009f\u001d§a\u0085\u0098å\u0088ÿ¿r\u0007\u007fü\u008d\u0091k+Yëg\u000f\u0080F_á(ûf\u0080>°\u008e7\u0096èi\u0014?\u0013\\\u0012¨ìæt~\u00adôûù!R'Ë«.6\u0000\u0093\u0083\u0014è\u0019mÚ4ñ½ ¼Î$\tLú\u0012õ\u008d\u0015Áq'sZUã²Õ\"Û#ë\u000eèØ:\u000e\\ù\u0005\u000b?©}\u0017A»Ã\u0097º ìÚc\u008b\u008f\u0085®4\u00149§@\u009a¯\u008bÿ0þÝ½\u008a¡Ma\u0015\u0001ô\u00adx\bø\u008c&În@\u009ayÚ\u001a\u0007±9\u008b<\u0088ñC\u0014{\u009aDd(ñ\u001c£\u009bVûµ¬\u0083°y\u0014óR\u0004uº\u007f8\u0010\u0089ö*æ\u0081\fÿÖ7ä¾jvðAÍ×\fûùÊ\u009d:\u008bPìðD\u009c\u0001`u\u0011\u0019ÿjñn¸¹¡¨2£(ÓI£¼}\u0097KLõ\u008c¶\u0018\n\u008dÀö'ñ\u001c9SfüV0#ÛDÚ\rA\u0012TÄ\u0086Ú»Ê»Í\u0010¿\u0001§»\u0093.óf\u0083»áoGªc\u009d\u0010ê'¡\u0090G\u009e\f\u001e¶^\u000b\u0090¹¡\u0017\"\u0018râ\u0092\u0080íå¨ýóÃ3\u00041\u009eC\u000fEÍ\u0086«Ì\u0006\u0098¬ êô¯HÃD²¿G¥g»%4Y\u0085²\u0015ÆPÔþß¶é2¦BóÓ\u0007 (·\u0001\u001e<Ár\u0000\")/\u0000G½û\t#\u0096.Ú³\r«\u008a±K\u008cªk·¦Áy¦å8±,È\u0083\u0000\u0018øU\u001fN,lë×\u000foøÒ³\u009d!XÄ\u001b\u009a\u009d\u008d\u001fÂ\u0080\u0018½®\u0098Þ\nx\u000f>Åy{\u0080øãÿ\u0018d\u009d1\u001a\u0011\u000f^F\u0010Ðñ\u001dWo´èÍ11Ê¶.³pÝ \u000fv-\u0093w\u008aGè¿÷\u001a\u009acÌ\u0010\u0097ã\u0085o\u0092És q\u009aK\u008fî¢^;¡\u0010Âß\u0083z¹\u009e/ ,¦vë¤\\H\u0090HY\u0005\u008b)Lx\u0096M&S¿ôK\u0013Ö¯a»Ò\u0099<w\u008ey\u0086¯8ÐÉ|\"Þgh\u0088\u0094Ë\"{nx*^û«-kgná\u0084D¯óÆ\u000e\ff\u001cu\"®V`\u0081ú\u0099\u001d,\u0098LJ0\u0004;^ß®]\u0013E³ãi\bªgó Õú\u008cQ¯Zw¼£å¯\u001e\u001e(\u0005¼XºkhS\u007f\r\u0081P7Z©T\u0006\u0095Ý\u0010àa¡\u0013§Y}º¥8zÕ\u0095\u001eëI\u0010\u008d$á?M(òÌsU<Ü\u0019\u0089Ô\u00158\u0084XøîS\"\u008eÏ°¨>|Q\u0018óêPå\u0014«\u0099:\u001dÍ)\u0003b\u0080±.[Nì½-N£Ü¸\u009fÙë~!¨\u007f=\u008d\u0004y8\u008f;\u001c\u008dI\u001095çÀÔ@¯ða\u0015á9Y£Jø\u0010¾f¢\u0002QÍ¿\u008b¥a\r\u000b+¿]î(ÚùyÅ´ZO(I[\u0096R\u0087®|\u0090\u0089:\u0095±Mr\u00196\u001eb6&MøÌ\u008c\u001f@\bV\u001d¢¤|($~Jü\u0092\u001d\u0003Î7Ædfüf\u007f¹ÅÝ{\u0086ìv\u0083ñü©;\u0080CÈ»;u¢öxÆ¬÷Ø";
        int length = "²Tõ³\u008a\u00961íûÕ'òw\u0092ÄNðH\u001b×Á\u0017&Yúj\b\u0014\u0012\u0093\u0091\u001f\u001e\u008b7gû~\u001e\u001aO2\u0081\u001dnÓ\u0091|\u0082 ¨L\u00ad\u0094S©\u00166Õ?\u009fCkiEá§ÀÙ¯k\u0096âë\r\u009f\u001d§a\u0085\u0098å\u0088ÿ¿r\u0007\u007fü\u008d\u0091k+Yëg\u000f\u0080F_á(ûf\u0080>°\u008e7\u0096èi\u0014?\u0013\\\u0012¨ìæt~\u00adôûù!R'Ë«.6\u0000\u0093\u0083\u0014è\u0019mÚ4ñ½ ¼Î$\tLú\u0012õ\u008d\u0015Áq'sZUã²Õ\"Û#ë\u000eèØ:\u000e\\ù\u0005\u000b?©}\u0017A»Ã\u0097º ìÚc\u008b\u008f\u0085®4\u00149§@\u009a¯\u008bÿ0þÝ½\u008a¡Ma\u0015\u0001ô\u00adx\bø\u008c&În@\u009ayÚ\u001a\u0007±9\u008b<\u0088ñC\u0014{\u009aDd(ñ\u001c£\u009bVûµ¬\u0083°y\u0014óR\u0004uº\u007f8\u0010\u0089ö*æ\u0081\fÿÖ7ä¾jvðAÍ×\fûùÊ\u009d:\u008bPìðD\u009c\u0001`u\u0011\u0019ÿjñn¸¹¡¨2£(ÓI£¼}\u0097KLõ\u008c¶\u0018\n\u008dÀö'ñ\u001c9SfüV0#ÛDÚ\rA\u0012TÄ\u0086Ú»Ê»Í\u0010¿\u0001§»\u0093.óf\u0083»áoGªc\u009d\u0010ê'¡\u0090G\u009e\f\u001e¶^\u000b\u0090¹¡\u0017\"\u0018râ\u0092\u0080íå¨ýóÃ3\u00041\u009eC\u000fEÍ\u0086«Ì\u0006\u0098¬ êô¯HÃD²¿G¥g»%4Y\u0085²\u0015ÆPÔþß¶é2¦BóÓ\u0007 (·\u0001\u001e<Ár\u0000\")/\u0000G½û\t#\u0096.Ú³\r«\u008a±K\u008cªk·¦Áy¦å8±,È\u0083\u0000\u0018øU\u001fN,lë×\u000foøÒ³\u009d!XÄ\u001b\u009a\u009d\u008d\u001fÂ\u0080\u0018½®\u0098Þ\nx\u000f>Åy{\u0080øãÿ\u0018d\u009d1\u001a\u0011\u000f^F\u0010Ðñ\u001dWo´èÍ11Ê¶.³pÝ \u000fv-\u0093w\u008aGè¿÷\u001a\u009acÌ\u0010\u0097ã\u0085o\u0092És q\u009aK\u008fî¢^;¡\u0010Âß\u0083z¹\u009e/ ,¦vë¤\\H\u0090HY\u0005\u008b)Lx\u0096M&S¿ôK\u0013Ö¯a»Ò\u0099<w\u008ey\u0086¯8ÐÉ|\"Þgh\u0088\u0094Ë\"{nx*^û«-kgná\u0084D¯óÆ\u000e\ff\u001cu\"®V`\u0081ú\u0099\u001d,\u0098LJ0\u0004;^ß®]\u0013E³ãi\bªgó Õú\u008cQ¯Zw¼£å¯\u001e\u001e(\u0005¼XºkhS\u007f\r\u0081P7Z©T\u0006\u0095Ý\u0010àa¡\u0013§Y}º¥8zÕ\u0095\u001eëI\u0010\u008d$á?M(òÌsU<Ü\u0019\u0089Ô\u00158\u0084XøîS\"\u008eÏ°¨>|Q\u0018óêPå\u0014«\u0099:\u001dÍ)\u0003b\u0080±.[Nì½-N£Ü¸\u009fÙë~!¨\u007f=\u008d\u0004y8\u008f;\u001c\u008dI\u001095çÀÔ@¯ða\u0015á9Y£Jø\u0010¾f¢\u0002QÍ¿\u008b¥a\r\u000b+¿]î(ÚùyÅ´ZO(I[\u0096R\u0087®|\u0090\u0089:\u0095±Mr\u00196\u001eb6&MøÌ\u008c\u001f@\bV\u001d¢¤|($~Jü\u0092\u001d\u0003Î7Ædfüf\u007f¹ÅÝ{\u0086ìv\u0083ñü©;\u0080CÈ»;u¢öxÆ¬÷Ø".length();
        char cCharAt = 144;
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i7 = i4;
                        i4++;
                        strArr[i7] = strIntern;
                        int i8 = i6 + cCharAt;
                        i2 = i8;
                        if (i8 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            c = strArr;
                            e = new String[24];
                            l = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[20];
                            int i10 = 0;
                            String str3 = "\u0010¬9ö\u0002«ÞE¢\u009f×÷©/÷\b}¥ºa°(\u0089øè|Ø\u0095¯°\u008f\u000blö0ë±§YSVu]\u0092\u009efÚM¬\u0081\"íÎ\u0017Ç*\u0090Æ \u009cJ\u0082E*\u008aOA\u001c£\u0002Pyé\u0089mpÒ\u00adÑ£ÿ\b\u0017HûØ\u0084äø\u0007\u0085ía\rêùº¹ëTþõ\r:ã@\u008fÿO:\u0090\u0014g\u0081§è\u0092!¯\u0087\u0001\u008aØ´@ÒüF\u0080K¶@Ë{rôÏ¯\u009d£\n\u007fª,";
                            int length2 = "\u0010¬9ö\u0002«ÞE¢\u009f×÷©/÷\b}¥ºa°(\u0089øè|Ø\u0095¯°\u008f\u000blö0ë±§YSVu]\u0092\u009efÚM¬\u0081\"íÎ\u0017Ç*\u0090Æ \u009cJ\u0082E*\u008aOA\u001c£\u0002Pyé\u0089mpÒ\u00adÑ£ÿ\b\u0017HûØ\u0084äø\u0007\u0085ía\rêùº¹ëTþõ\r:ã@\u008fÿO:\u0090\u0014g\u0081§è\u0092!¯\u0087\u0001\u008aØ´@ÒüF\u0080K¶@Ë{rôÏ¯\u009d£\n\u007fª,".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b3 = -1;
                                while (true) {
                                    byte b4 = b3;
                                    long j3 = j2;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b4] = j4;
                                            if (i11 >= length2) {
                                                g = jArr;
                                                i = new Integer[20];
                                                p = new HashMap(13);
                                                Cipher cipher3 = Cipher.getInstance("DES/CBC/NoPadding");
                                                SecretKeyFactory secretKeyFactory3 = SecretKeyFactory.getInstance("DES");
                                                byte[] bArr3 = new byte[8];
                                                bArr3[0] = (byte) (j >>> 56);
                                                for (int i15 = 1; i15 < 8; i15++) {
                                                    bArr3[i15] = (byte) ((j << (i15 * 8)) >>> 56);
                                                }
                                                cipher3.init(2, secretKeyFactory3.generateSecret(new DESKeySpec(bArr3)), new IvParameterSpec(new byte[8]));
                                                long[] jArr3 = new long[5];
                                                int i16 = 0;
                                                String str4 = "²0e5\u0018âí¨£ý\u0081Y\u008fë\f/W\u0016¿Ç_Údc";
                                                int length3 = "²0e5\u0018âí¨£ý\u0081Y\u008fë\f/W\u0016¿Ç_Údc".length();
                                                int i17 = 0;
                                                while (true) {
                                                    int i18 = i17;
                                                    i17 += 8;
                                                    byte[] bytes2 = str4.substring(i18, i17).getBytes("ISO-8859-1");
                                                    long[] jArr4 = jArr3;
                                                    int i19 = i16;
                                                    i16++;
                                                    long j5 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                                    byte b5 = -1;
                                                    while (true) {
                                                        byte b6 = b5;
                                                        long j6 = j5;
                                                        int i20 = i19;
                                                        byte[] bArrDoFinal2 = cipher3.doFinal(new byte[]{(byte) (j6 >>> 56), (byte) (j6 >>> 48), (byte) (j6 >>> 40), (byte) (j6 >>> 32), (byte) (j6 >>> 24), (byte) (j6 >>> 16), (byte) (j6 >>> 8), (byte) j6});
                                                        long j7 = ((((long) bArrDoFinal2[0]) & 255) << 56) | ((((long) bArrDoFinal2[1]) & 255) << 48) | ((((long) bArrDoFinal2[2]) & 255) << 40) | ((((long) bArrDoFinal2[3]) & 255) << 32) | ((((long) bArrDoFinal2[4]) & 255) << 24) | ((((long) bArrDoFinal2[5]) & 255) << 16) | ((((long) bArrDoFinal2[6]) & 255) << 8) | (((long) bArrDoFinal2[7]) & 255);
                                                        switch (i20) {
                                                            case 0:
                                                                jArr4[b6] = j7;
                                                                if (i17 >= length3) {
                                                                    n = jArr3;
                                                                    o = new Long[5];
                                                                    return;
                                                                }
                                                                break;
                                                                break;
                                                            default:
                                                                jArr4[b6] = j7;
                                                                if (i17 >= length3) {
                                                                    str4 = "4þÕ;\u009bC/Þ\u0016\u0016Ô\tåõ\u0018Ó";
                                                                    length3 = "4þÕ;\u009bC/Þ\u0016\u0016Ô\tåõ\u0018Ó".length();
                                                                    i17 = 0;
                                                                }
                                                                break;
                                                        }
                                                        int i21 = i17;
                                                        i17 += 8;
                                                        byte[] bytes3 = str4.substring(i21, i17).getBytes("ISO-8859-1");
                                                        jArr4 = jArr3;
                                                        i19 = i16;
                                                        i16++;
                                                        j5 = ((((long) bytes3[0]) & 255) << 56) | ((((long) bytes3[1]) & 255) << 48) | ((((long) bytes3[2]) & 255) << 40) | ((((long) bytes3[3]) & 255) << 32) | ((((long) bytes3[4]) & 255) << 24) | ((((long) bytes3[5]) & 255) << 16) | ((((long) bytes3[6]) & 255) << 8) | (((long) bytes3[7]) & 255);
                                                        b5 = 0;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            jArr2[b4] = j4;
                                            if (i11 >= length2) {
                                                str3 = "Q5.\u009bF\u009ch#Ô\u0099S:\u0007ÃD\u0015";
                                                length2 = "Q5.\u009bF\u009ch#Ô\u0099S:\u0007ÃD\u0015".length();
                                                i11 = 0;
                                            }
                                            break;
                                    }
                                    int i22 = i11;
                                    i11 += 8;
                                    byte[] bytes4 = str3.substring(i22, i11).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i13 = i10;
                                    i10++;
                                    j2 = ((((long) bytes4[0]) & 255) << 56) | ((((long) bytes4[1]) & 255) << 48) | ((((long) bytes4[2]) & 255) << 40) | ((((long) bytes4[3]) & 255) << 32) | ((((long) bytes4[4]) & 255) << 24) | ((((long) bytes4[5]) & 255) << 16) | ((((long) bytes4[6]) & 255) << 8) | (((long) bytes4[7]) & 255);
                                    b3 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i23 = i4;
                        i4++;
                        strArr[i23] = strIntern;
                        int i24 = i6 + cCharAt;
                        i5 = i24;
                        if (i24 < length) {
                        }
                        str = "µM~b\u008d\u008cm(%\u0093×¶]÷NØ 4\u0080*èºâ\\\u0011f\u0019ÿ\u001dÓ\u001eÃU¿®T\u0093ÖùôÝ¯\u0086J\u001f\t\u009f\u0093F";
                        length = "µM~b\u008d\u008cm(%\u0093×¶]÷NØ 4\u0080*èºâ\\\u0011f\u0019ÿ\u001dÓ\u001eÃU¿®T\u0093ÖùôÝ¯\u0086J\u001f\t\u009f\u0093F".length();
                        cCharAt = 16;
                        i2 = -1;
                        break;
                        break;
                }
                i6 = i2 + 1;
                strSubstring = str.substring(i6, i6 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i5);
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 19990;
        if (e[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                e[i3] = a(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/g7", e2);
            }
        }
        return e[i3];
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
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
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
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
            java.lang.String r1 = "su/catlean/g7"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.g7.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 7221;
        if (i[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) l.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/g7", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            i[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return i[i3].intValue();
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
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
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
            java.lang.String r1 = "su/catlean/g7"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.g7.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static long c(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 27131;
        if (o[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) n[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) p.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    p.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/g7", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            o[i3] = Long.valueOf(((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255));
        }
        return o[i3].longValue();
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        long jC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Long.TYPE, Long.valueOf(jC)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return jC;
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
    private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
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
            java.lang.String r1 = "su/catlean/g7"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.g7.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
