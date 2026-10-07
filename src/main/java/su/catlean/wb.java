package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2fStack;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/wb.class */
public final class wb {

    @NotNull
    private String a;

    @NotNull
    private final o_ V;
    private float f;
    private float L;

    @NotNull
    private Color O;
    private boolean e;
    private boolean g;
    private boolean n;
    private boolean u;
    private float C;
    private float U;

    @NotNull
    private final fd W;

    @NotNull
    private final fd p;

    @NotNull
    private final fd R;

    @NotNull
    private final ArrayList v;
    private static final String[] c;
    private static final String[] d;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map k;
    private static final long[] l;
    private static final Long[] m;
    private static final Map o;
    private static final long b = yz.a(-6284521952040941729L, -6362170675702915004L, MethodHandles.lookup().lookupClass()).a(233407246976513L);
    private static final Map h = new HashMap(13);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public wb(@NotNull String id, @NotNull o_ theme, int a, short a2, float x, float y, @NotNull Color setting, int a3) {
        long j2 = (((((long) a) << 32) | ((((long) a2) << 48) >>> 32)) | ((((long) a3) << 48) >>> 48)) ^ b;
        long j3 = j2 ^ 97770241240569L;
        long j4 = j2 ^ 73411705854084L;
        int i2 = (int) (j2 >>> 56);
        int i3 = (int) ((j4 << 8) >>> 32);
        int i4 = (int) ((j4 << 40) >>> 40);
        final long j5 = j2 ^ 91753777907281L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1081765240510475375L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5860, 8725969600582471423L ^ j2) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(theme, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3705, 374003492838692468L ^ j2) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(setting, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20615, 2248747172188686472L ^ j2) /* invoke-custom */);
        this.a = id;
        this.V = theme;
        this.f = x;
        this.L = y;
        this.O = setting;
        this.C = 116.0f;
        this.U = 14.0f;
        this.W = new fd(_s.OUT_QUINT, (long) c(MethodHandles.lookup(), "u", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21708, 6963546736965651857L ^ j2) /* invoke-custom */, j3);
        this.p = new fd(_s.OUT_QUINT, (long) c(MethodHandles.lookup(), "u", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8310, 5413238593780873514L ^ j2) /* invoke-custom */, j3);
        this.R = new fd(_s.OUT_QUINT, (long) c(MethodHandles.lookup(), "u", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8310, 5413238593780873514L ^ j2) /* invoke-custom */, j3);
        this.v = new ArrayList();
        int i5 = 0;
        while (i5 < 4) {
            Object objAdd = 0;
            try {
                objAdd = this.v.add(new ig(new MutablePropertyReference0Impl(j5, this) { // from class: su.catlean.y2
                    private static final String[] b;
                    private static final String[] c;
                    private static final long a = yz.a(-668203047525412557L, -8392754963173714466L, MethodHandles.lookup().lookupClass()).a(229614599826399L);
                    private static final Map d = new HashMap(13);

                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        long j6 = a ^ j5;
                        super(this, wb.class, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15071, 5800492891573074500L ^ j6) /* invoke-custom */, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16182, 703694294817652652L ^ j6) /* invoke-custom */, 0);
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                    public Object get() {
                        return ((wb) this.receiver).Z();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                    public void set(Object value) {
                        ((wb) this.receiver).g((Color) value, (a ^ 112053618765945L) ^ 39902215122245L);
                    }

                    static {
                        long j6 = a ^ 102500007877108L;
                        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
                        byte[] bArr = new byte[8];
                        bArr[0] = (byte) (j6 >>> 56);
                        for (int i6 = 1; i6 < 8; i6++) {
                            bArr[i6] = (byte) ((j6 << (i6 * 8)) >>> 56);
                        }
                        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
                        String[] strArr = new String[2];
                        int i7 = 0;
                        int length = "y^\u0082' tÏMß¼z]'\u008f¥S0ùÆ¢\u0004á)\u008d]7F\u000e\u0018,\u008bxç\u008f],ÐRD]\bÔã¾\u0081(\u0005\u0005CáÇÄÄ74\u00149æ¯Äeð\u0019Æ\u0087".length();
                        char cCharAt = 16;
                        int i8 = -1;
                        while (true) {
                            int i9 = i8 + 1;
                            int i10 = i7;
                            i7++;
                            strArr[i10] = a(cipher.doFinal("y^\u0082' tÏMß¼z]'\u008f¥S0ùÆ¢\u0004á)\u008d]7F\u000e\u0018,\u008bxç\u008f],ÐRD]\bÔã¾\u0081(\u0005\u0005CáÇÄÄ74\u00149æ¯Äeð\u0019Æ\u0087".substring(i9, i9 + cCharAt).getBytes("ISO-8859-1"))).intern();
                            int i11 = i9 + cCharAt;
                            i8 = i11;
                            if (i11 >= length) {
                                b = strArr;
                                c = new String[2];
                                return;
                            }
                            cCharAt = "y^\u0082' tÏMß¼z]'\u008f¥S0ùÆ¢\u0004á)\u008d]7F\u000e\u0018,\u008bxç\u008f],ÐRD]\bÔã¾\u0081(\u0005\u0005CáÇÄÄ74\u00149æ¯Äeð\u0019Æ\u0087".charAt(i8);
                        }
                    }

                    private static String a(byte[] bArr) {
                        int i6 = 0;
                        int length = bArr.length;
                        char[] cArr = new char[length];
                        int i7 = 0;
                        while (i7 < length) {
                            int i8 = 255 & bArr[i7];
                            if (i8 < 192) {
                                int i9 = i6;
                                i6++;
                                cArr[i9] = (char) i8;
                            } else if (i8 < 224) {
                                i7++;
                                int i10 = i6;
                                i6++;
                                cArr[i10] = (char) (((char) (((char) (i8 & 31)) << 6)) | ((char) (bArr[i7] & 63)));
                            } else if (i7 < length - 2) {
                                int i11 = i7 + 1;
                                char c2 = (char) (((char) (((char) (i8 & 15)) << '\f')) | (((char) (bArr[i11] & 63)) << 6));
                                i7 = i11 + 1;
                                int i12 = i6;
                                i6++;
                                cArr[i12] = (char) (c2 | ((char) (bArr[i7] & 63)));
                            }
                            i7++;
                        }
                        return new String(cArr, 0, i6);
                    }

                    private static String a(int i6, long j6) throws InvalidKeyException, InvalidAlgorithmParameterException {
                        int i7 = (i6 ^ ((int) (j6 & 32767))) ^ 20444;
                        if (c[i7] == null) {
                            try {
                                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                                Object[] objArr = (Object[]) d.get(lValueOf);
                                if (objArr == null) {
                                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                                    d.put(lValueOf, objArr);
                                }
                                byte[] bArr = new byte[8];
                                bArr[0] = (byte) (j6 >>> 56);
                                for (int i8 = 1; i8 < 8; i8++) {
                                    bArr[i8] = (byte) ((j6 << (i8 * 8)) >>> 56);
                                }
                                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                                c[i7] = a(((Cipher) objArr[0]).doFinal(b[i7].getBytes("ISO-8859-1")));
                            } catch (Exception e) {
                                throw new RuntimeException("su/catlean/y2", e);
                            }
                        }
                        return c[i7];
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
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:123)
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
                            java.lang.String r1 = "su/catlean/y2"
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
                        throw new UnsupportedOperationException("Method not decompiled: su.catlean.y2.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
                    }
                }, this.f, (byte) i2, i3, i4, this.L, i5));
                i5++;
                do {
                    _g[] _gVarArr2 = _gVarArr;
                    if (a3 >= 0) {
                        if (_gVarArr2 == null) {
                            return;
                        } else {
                            _gVarArr2 = _gVarArr;
                        }
                    }
                    if (_gVarArr2 == null) {
                    }
                } while (a2 > 0);
                return;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAdd, 1089912563008722094L, j2) /* invoke-custom */;
            }
        }
    }

    @NotNull
    public final String B() {
        return this.a;
    }

    public final void Z(@NotNull String str, long a) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20302, 2628346521771156144L ^ (b ^ a)) /* invoke-custom */);
        this.a = str;
    }

    @NotNull
    public final o_ S() {
        return this.V;
    }

    public final float N() {
        return this.f;
    }

    public final void E(float f) {
        this.f = f;
    }

    public final float e() {
        return this.L;
    }

    public final void V(float f) {
        this.L = f;
    }

    @NotNull
    public final Color Z() {
        return this.O;
    }

    public final void g(@NotNull Color color, long a) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3870, 3564719319493144597L ^ (b ^ a)) /* invoke-custom */);
        this.O = color;
    }

    public final float L() {
        return this.C;
    }

    public final void e(float f) {
        this.C = f;
    }

    public final float C() {
        return this.U;
    }

    public final void D(float f) {
        this.U = f;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x03FD: MOVE_MULTI in method: su.catlean.wb.J(net.minecraft.class_332, long, int, int):void, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/wb.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x03FD: MOVE_MULTI
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for object array[23]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:313)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    public final void J(@org.jetbrains.annotations.NotNull net.minecraft.class_332 r1, long r2, int r4, int r5) {
        /*
            Method dump skipped, instruction units count: 2495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.wb.J(net.minecraft.class_332, long, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [float[]] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r3v19, types: [float] */
    /* JADX WARN: Type inference failed for: r4v9, types: [float] */
    /* JADX WARN: Type inference failed for: r6v2, types: [float] */
    private final void D(Matrix3x2fStack matrix3x2fStack, int i2, long j2, int i3) {
        long j3 = b ^ j2;
        long j4 = j3 ^ 35656724584548L;
        int i4 = (int) (j3 >>> 48);
        int i5 = (int) ((j4 << 16) >>> 48);
        int i6 = (int) ((j4 << 32) >>> 32);
        long j5 = j3 ^ 6597716237309L;
        int i7 = (int) (j3 >>> 48);
        int i8 = (int) ((j5 << 16) >>> 32);
        int i9 = (int) ((j5 << 48) >>> 48);
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5136052236969878571L, j3) /* invoke-custom */;
        float f = ((this.f + this.C) - 48.0f) + 2.0f;
        float f2 = this.L + 10.0f + 2.0f;
        ?? r0 = new float[3];
        try {
            Color.RGBtoHSB(this.O.getRed(), this.O.getGreen(), this.O.getBlue(), (float[]) r0);
            float fD = (f - 4.0f) + ((int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(249, 6876061412052891237L ^ j3) /* invoke-custom */ * r0[1]);
            float fD2 = (f2 - 4.0f) + ((int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2170, 8366007212442877668L ^ j3) /* invoke-custom */ * (1.0f - r0[2]));
            Color color = this.O;
            Color color2 = Color.BLACK;
            Intrinsics.checkNotNullExpressionValue(color2, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18507, 7133456165763786724L ^ j3) /* invoke-custom */);
            x1.n(matrix3x2fStack, (char) i4, fD, fD2, 7.0f, 7.0f, 2.5f, 1.5f, 1.0f, 1.0f, color, color2, 0.0f, (short) i5, 0.0f, i6, 0.0f, (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11916, 6078688369640134675L ^ j3) /* invoke-custom */, null);
            r0 = this.g;
            ?? r02 = r0;
            if (_gVarArr != null) {
                if (r0 == 0) {
                    return;
                } else {
                    r02 = i2;
                }
            }
            this.O = jl.y.p(new Color(Color.HSBtoRGB((float) r0[0], Math.clamp((((float) r02) - f) / 40.0f, 0.0f, 1.0f), Math.clamp(1.0f - ((i3 - f2) / 40.0f), 0.0f, 1.0f))), (char) i7, i8, this.O.getAlpha() / 255.0f, (short) i9);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5144793295764036844L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    private final void d(Matrix3x2fStack matrix3x2fStack, long j2, int i2) {
        long j3 = b ^ j2;
        long j4 = j3 ^ 27469793375976L;
        int i3 = (int) (j3 >>> 48);
        int i4 = (int) ((j4 << 16) >>> 48);
        int i5 = (int) ((j4 << 32) >>> 32);
        long j5 = j3 ^ 68814295922033L;
        int i6 = (int) (j3 >>> 48);
        int i7 = (int) ((j5 << 16) >>> 32);
        int i8 = (int) ((j5 << 48) >>> 48);
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1600232684384089433L, j3) /* invoke-custom */;
        float f = this.L + 11.0f;
        try {
            try {
                x1.n(matrix3x2fStack, (char) i3, this.f + 58.0f, (f - 4.0f) + ((int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24584, 774152197212616733L ^ j3) /* invoke-custom */ * (1.0f - (this.O.getAlpha() / 255.0f))), 7.0f, 7.0f, 2.5f, 1.0f, 1.0f, 1.0f, this.O, jl.y.p(this.O, (char) i6, i7, 1.0f, (short) i8), 0.0f, (short) i4, 0.0f, i5, 0.0f, (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15049, 2999635468091450079L ^ j3) /* invoke-custom */, null);
                wb wbVar = this;
                if (obj != 0) {
                    obj = wbVar.n;
                    if (obj == 0) {
                        return;
                    } else {
                        wbVar = this;
                    }
                }
                wbVar.O = jl.y.p(this.O, (char) i6, i7, Math.clamp(1.0f - ((i2 - f) / 39.0f), 0.0f, 1.0f), (short) i8);
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1591526963503025560L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1591526963503025560L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    private final void e(Matrix3x2fStack matrix3x2fStack, char c2, int i2, long j2) {
        long j3 = ((((long) c2) << 48) | ((j2 << 16) >>> 16)) ^ b;
        long j4 = j3 ^ 135804072367043L;
        int i3 = (int) (j3 >>> 48);
        int i4 = (int) ((j4 << 16) >>> 48);
        int i5 = (int) ((j4 << 32) >>> 32);
        long j5 = j3 ^ 103279024492634L;
        int i6 = (int) (j3 >>> 48);
        int i7 = (int) ((j5 << 16) >>> 32);
        int i8 = (int) ((j5 << 48) >>> 48);
        ?? r0 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5539910925461073806L, j3) /* invoke-custom */;
        float f = this.f;
        float[] fArr = new float[3];
        Color.RGBtoHSB(this.O.getRed(), this.O.getGreen(), this.O.getBlue(), fArr);
        try {
            x1.n(matrix3x2fStack, (char) i3, (f - 3.5f) + ((int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(900, 3620735770149977784L ^ j3) /* invoke-custom */ * fArr[0]), this.L + 52.0f, 7.0f, 7.0f, 2.5f, 1.0f, 1.0f, 1.0f, new Color(Color.HSBtoRGB(fArr[0], 1.0f, 1.0f)), new Color(Color.HSBtoRGB(fArr[0], 1.0f, 1.0f)), 0.0f, (short) i4, 0.0f, i5, 0.0f, (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11916, 6078607372512383924L ^ j3) /* invoke-custom */, null);
            r0 = this.u;
            ?? r02 = r0;
            if (r0 != 0) {
                if (r0 == 0) {
                    return;
                } else {
                    r02 = i2;
                }
            }
            this.O = jl.y.p(new Color(Color.HSBtoRGB(Math.clamp((((float) r02) - f) / 107.0f, 0.0f, 1.0f), fArr[1], fArr[2])), (char) i6, i7, this.O.getAlpha() / 255.0f, (short) i8);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5531161207757248333L, j3) /* invoke-custom */;
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
    public final void r(double r9, double r11, int r13, long r14) {
        /*
            Method dump skipped, instruction units count: 1933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.wb.r(double, double, int, long):void");
    }

    public final void T() {
        this.g = false;
        this.u = false;
        this.n = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean.wb] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.wb] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    public final void X(int i2, long j2) {
        long j3 = b ^ j2;
        long j4 = j3 ^ 33882770163855L;
        ?? r0 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2773002866317903128L, j3) /* invoke-custom */;
        try {
            r0 = this;
            ?? r02 = r0;
            if (r0 != 0) {
                try {
                    r0 = r0.e;
                    if (r0 == 0) {
                        return;
                    } else {
                        r02 = this;
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -2763161886549081559L, j3) /* invoke-custom */;
                }
            }
            for (ig igVar : r02.v) {
                ig igVar2 = null;
                try {
                    igVar2 = igVar;
                    igVar2.W(j4, i2);
                    do {
                        ?? r03 = r0;
                        if (j3 >= 0) {
                            if (r03 == 0) {
                                return;
                            } else {
                                r03 = r0;
                            }
                        }
                        if (r03 == 0) {
                        }
                    } while (j3 < 0);
                    return;
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(igVar2, -2763161886549081559L, j3) /* invoke-custom */;
                }
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -2763161886549081559L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean.wb] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.wb] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    public final void P(long j2, char c2) {
        long j3 = b ^ j2;
        long j4 = j3 ^ 39642354645067L;
        int i2 = (int) (j3 >>> 32);
        int i3 = (int) ((j4 << 32) >>> 48);
        int i4 = (int) ((j4 << 48) >>> 48);
        ?? r0 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1813432128296843847L, j3) /* invoke-custom */;
        try {
            r0 = this;
            ?? r02 = r0;
            if (r0 != 0) {
                try {
                    r0 = r0.e;
                    if (r0 == 0) {
                        return;
                    } else {
                        r02 = this;
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -1804127723351360136L, j3) /* invoke-custom */;
                }
            }
            for (ig igVar : r02.v) {
                ig igVar2 = null;
                try {
                    igVar2 = igVar;
                    igVar2.x(c2, i2, (char) i3, i4);
                    do {
                        ?? r03 = r0;
                        if (j3 > 0) {
                            if (r03 == 0) {
                                return;
                            } else {
                                r03 = r0;
                            }
                        }
                        if (r03 == 0) {
                        }
                    } while (j3 <= 0);
                    return;
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(igVar2, -1804127723351360136L, j3) /* invoke-custom */;
                }
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -1804127723351360136L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean.wb] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    public final void p(double d2, double d3, long j2, double d4) {
        long j3 = b ^ j2;
        long j4 = j3 ^ 87616068024527L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2248095543537237087L, j3) /* invoke-custom */;
        Object obj = this;
        wb wbVar = obj;
        if (_gVarArr != null) {
            try {
                try {
                    obj = obj.e;
                    if (obj == 0) {
                        return;
                    } else {
                        wbVar = this;
                    }
                } catch (NumberFormatException unused) {
                    obj = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -2238782209338098848L, j3) /* invoke-custom */;
                    throw obj;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -2238782209338098848L, j3) /* invoke-custom */;
            }
        }
        for (ig igVar : wbVar.v) {
            ig igVar2 = null;
            try {
                igVar2 = igVar;
                igVar2.L(d2, j4, d3, d4);
                do {
                    _g[] _gVarArr2 = _gVarArr;
                    if (j3 > 0) {
                        if (_gVarArr2 == null) {
                            return;
                        } else {
                            _gVarArr2 = _gVarArr;
                        }
                    }
                    if (_gVarArr2 == null) {
                    }
                } while (j3 < 0);
                return;
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(igVar2, -2238782209338098848L, j3) /* invoke-custom */;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v100, types: [int] */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v106, types: [int] */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v112, types: [int] */
    /* JADX WARN: Type inference failed for: r0v113, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v116, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v118, types: [int] */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v124, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [int] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [su.catlean.o_] */
    /* JADX WARN: Type inference failed for: r0v64, types: [int] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [int] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [int] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [int] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [int] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [int] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void w(long r9, su.catlean.o_ r11) {
        /*
            Method dump skipped, instruction units count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.wb.w(long, su.catlean.o_):void");
    }

    static {
        int i2;
        long j2 = b ^ 98708708520001L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[26];
        int i4 = 0;
        String str = "Û\u008bÏapèYV\u009eôíAç \u0085\u000eõw\u0086\u0080`]L\\\u0010á¹¼\u007fk\nÒR\u0017+¾\u001c\b\b×t\u0018ÏË¡\u000en!ý\u001f\u0016»1\u0018\u000f\u0002ÛUs(a)\u0017\u0084\u0099^\u0010\u009d}SÊÒ/\u0001a¦þ\u0089Ú\u0084J#{\u0010\u009bUa\u0083hê\u0097ZÕ\u0083Ò1\u001c\u001aQV\u0010l\u0090Ü±ä\u0099êéP\u008ec\u000evE\u0093¼\u0010§DÊ\u0089nx\u0014úó\u0017\u007fuB\u000b{¯ '\u001fî*\u009c¤?\u0002<^\u0000\u0004\u00886£Ù¼éà\u001fmH;³\u0093¶/ {\u0091Ñf \u0082\u0090'M?\u0000âº6\u0081\u0090®\r\u0090\u0096Øög1èe\u000bµ\u0002hdü\u0080\u0007!\u009cò\u0010p-D\u001eB\u0011fm¢øþØ¹]Î_ ø÷\u001exë\u0087Ó¶fÎ¯\u0013\u0084\u0004ÌÄ\u0080xMÐeûéA@« ¯Ñ¸i#(ãâ4#ãðP\b\u00002b÷\u00039O\u001dãjH\u0095\u0085\u00163ÿ\u0082\u0016 \bvíG\u001c\u0006\u0080Él0\u0005\u000e\u0002\u0010\u008c\u0094Ï¦\u0015HãÇãÁé¬ãH\u009dP\u0018\u0092.±ÿ\b'i\u0099\u0098ë¿JÑ+k©gý´IIúì\b\u0010ÜbÒÔ\u008fÙl\u009cù\u001f¤\u0095\u0000\u0004H6(\u000f¹ÃJÍÓI\u0081\u0087\u0016e5äz÷Qï÷ÌÍ\u0006\u00141Ò Âð\\\u0016\u0084¡Ó¬±ýd¼û\u0003l\u0010Çx®\u00ad \u0098m\u0002Ï*\u0082T~\u0095LQ\u0018² =§µè¹N\nÝ%èC\u009ah\u001c \u0000ôK¨\u009d[Ã 8h\u009aùQ£\u0002á=TÅT*1T\u0095\u0081¼\u0001\u009cÿrÍÑè\u009d+\u008f\u00ady¡É\u0010\fÉ\u0095Î\u0015\u0092\u0099¤Û¶÷Ï\u008cy5\u009c\u0010ø¡V>f\u001bWÛ\u000f[¨I:º5\u0097\u0010\u0092Á(bÛ\u007fM°t®\u0095-óz\nk\u0010\u0089\u000fK\u009f\u0014×\u008b\u0086N³\u0098`ÁÂ\u0080\u001a é\u008e\f\u008a\u009b%(6ÌkÄÛ\u00ad\u0018aú\u008aé\u00053\u0097êÌAÿ²&¼ \u001e^ó";
        int length = "Û\u008bÏapèYV\u009eôíAç \u0085\u000eõw\u0086\u0080`]L\\\u0010á¹¼\u007fk\nÒR\u0017+¾\u001c\b\b×t\u0018ÏË¡\u000en!ý\u001f\u0016»1\u0018\u000f\u0002ÛUs(a)\u0017\u0084\u0099^\u0010\u009d}SÊÒ/\u0001a¦þ\u0089Ú\u0084J#{\u0010\u009bUa\u0083hê\u0097ZÕ\u0083Ò1\u001c\u001aQV\u0010l\u0090Ü±ä\u0099êéP\u008ec\u000evE\u0093¼\u0010§DÊ\u0089nx\u0014úó\u0017\u007fuB\u000b{¯ '\u001fî*\u009c¤?\u0002<^\u0000\u0004\u00886£Ù¼éà\u001fmH;³\u0093¶/ {\u0091Ñf \u0082\u0090'M?\u0000âº6\u0081\u0090®\r\u0090\u0096Øög1èe\u000bµ\u0002hdü\u0080\u0007!\u009cò\u0010p-D\u001eB\u0011fm¢øþØ¹]Î_ ø÷\u001exë\u0087Ó¶fÎ¯\u0013\u0084\u0004ÌÄ\u0080xMÐeûéA@« ¯Ñ¸i#(ãâ4#ãðP\b\u00002b÷\u00039O\u001dãjH\u0095\u0085\u00163ÿ\u0082\u0016 \bvíG\u001c\u0006\u0080Él0\u0005\u000e\u0002\u0010\u008c\u0094Ï¦\u0015HãÇãÁé¬ãH\u009dP\u0018\u0092.±ÿ\b'i\u0099\u0098ë¿JÑ+k©gý´IIúì\b\u0010ÜbÒÔ\u008fÙl\u009cù\u001f¤\u0095\u0000\u0004H6(\u000f¹ÃJÍÓI\u0081\u0087\u0016e5äz÷Qï÷ÌÍ\u0006\u00141Ò Âð\\\u0016\u0084¡Ó¬±ýd¼û\u0003l\u0010Çx®\u00ad \u0098m\u0002Ï*\u0082T~\u0095LQ\u0018² =§µè¹N\nÝ%èC\u009ah\u001c \u0000ôK¨\u009d[Ã 8h\u009aùQ£\u0002á=TÅT*1T\u0095\u0081¼\u0001\u009cÿrÍÑè\u009d+\u008f\u00ady¡É\u0010\fÉ\u0095Î\u0015\u0092\u0099¤Û¶÷Ï\u008cy5\u009c\u0010ø¡V>f\u001bWÛ\u000f[¨I:º5\u0097\u0010\u0092Á(bÛ\u007fM°t®\u0095-óz\nk\u0010\u0089\u000fK\u009f\u0014×\u008b\u0086N³\u0098`ÁÂ\u0080\u001a é\u008e\f\u008a\u009b%(6ÌkÄÛ\u00ad\u0018aú\u008aé\u00053\u0097êÌAÿ²&¼ \u001e^ó".length();
        char cCharAt = 24;
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
                            c = strArr;
                            d = new String[26];
                            k = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[10];
                            int i10 = 0;
                            String str3 = "øà÷ëRº\u007f(\u001e\b\u0082Ú;Bñ2«\fÕ.\u008f}s\u0015#_Àv£\u001dÞþ\u0089-E<Ö\u00984Þ:Q\u0011\u0095\u0010\u0084\u0019*Û\u0086\u00966]\u000bUEÖÂO¿\u0098k¢,";
                            int length2 = "øà÷ëRº\u007f(\u001e\b\u0082Ú;Bñ2«\fÕ.\u008f}s\u0015#_Àv£\u001dÞþ\u0089-E<Ö\u00984Þ:Q\u0011\u0095\u0010\u0084\u0019*Û\u0086\u00966]\u000bUEÖÂO¿\u0098k¢,".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j3 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j4 = j3;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j4 >>> 56), (byte) (j4 >>> 48), (byte) (j4 >>> 40), (byte) (j4 >>> 32), (byte) (j4 >>> 24), (byte) (j4 >>> 16), (byte) (j4 >>> 8), (byte) j4});
                                    long j5 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j5;
                                            if (i11 >= length2) {
                                                i = jArr;
                                                j = new Integer[10];
                                                o = new HashMap(13);
                                                Cipher cipher3 = Cipher.getInstance("DES/CBC/NoPadding");
                                                SecretKeyFactory secretKeyFactory3 = SecretKeyFactory.getInstance("DES");
                                                byte[] bArr3 = new byte[8];
                                                bArr3[0] = (byte) (j2 >>> 56);
                                                for (int i15 = 1; i15 < 8; i15++) {
                                                    bArr3[i15] = (byte) ((j2 << (i15 * 8)) >>> 56);
                                                }
                                                cipher3.init(2, secretKeyFactory3.generateSecret(new DESKeySpec(bArr3)), new IvParameterSpec(new byte[8]));
                                                long[] jArr3 = new long[2];
                                                int i16 = 0;
                                                int length3 = "ê\u0017v|Ì5ô\u0014½Ô\u0082r±\u0090äf".length();
                                                int i17 = 0;
                                                do {
                                                    int i18 = i17;
                                                    i17 += 8;
                                                    byte[] bytes2 = "ê\u0017v|Ì5ô\u0014½Ô\u0082r±\u0090äf".substring(i18, i17).getBytes("ISO-8859-1");
                                                    i16++;
                                                    byte[] bArrDoFinal2 = cipher3.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255))});
                                                    jArr3[-1] = ((((long) bArrDoFinal2[0]) & 255) << 56) | ((((long) bArrDoFinal2[1]) & 255) << 48) | ((((long) bArrDoFinal2[2]) & 255) << 40) | ((((long) bArrDoFinal2[3]) & 255) << 32) | ((((long) bArrDoFinal2[4]) & 255) << 24) | ((((long) bArrDoFinal2[5]) & 255) << 16) | ((((long) bArrDoFinal2[6]) & 255) << 8) | (((long) bArrDoFinal2[7]) & 255);
                                                } while (i17 < length3);
                                                l = jArr3;
                                                m = new Long[2];
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j5;
                                            if (i11 >= length2) {
                                                str3 = "å\rÙgÈ¡\u009c\"QjÎð\u009aºË\u0087";
                                                length2 = "å\rÙgÈ¡\u009c\"QjÎð\u009aºË\u0087".length();
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
                                    j3 = ((((long) bytes3[0]) & 255) << 56) | ((((long) bytes3[1]) & 255) << 48) | ((((long) bytes3[2]) & 255) << 40) | ((((long) bytes3[3]) & 255) << 32) | ((((long) bytes3[4]) & 255) << 24) | ((((long) bytes3[5]) & 255) << 16) | ((((long) bytes3[6]) & 255) << 8) | (((long) bytes3[7]) & 255);
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
                        str = "á\u001b¿\u001c\u0018¨\u0019\u0090\u0083Ø°@3 íÏ\u0010\u0000\u0081=\u0007Gû×*xX\u0099\u001d/Ð\\É";
                        length = "á\u001b¿\u001c\u0018¨\u0019\u0090\u0083Ø°@3 íÏ\u0010\u0000\u0081=\u0007Gû×*xX\u0099\u001d/Ð\\É".length();
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

    private static String a(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 22078;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) h.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = a(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/wb", e);
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
            java.lang.String r1 = "su/catlean/wb"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.wb.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 20251;
        if (j[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) i[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) k.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/wb", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            j[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return j[i3].intValue();
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
            java.lang.String r1 = "su/catlean/wb"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.wb.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static long c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 22369;
        if (m[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) l[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) o.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/wb", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            m[i3] = Long.valueOf(((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255));
        }
        return m[i3].longValue();
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
            java.lang.String r1 = "su/catlean/wb"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.wb.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
