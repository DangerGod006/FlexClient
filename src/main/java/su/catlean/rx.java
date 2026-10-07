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
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2fStack;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/rx.class */
public final class rx extends ru {

    @NotNull
    private final a1 t;
    private boolean J;
    private boolean O;
    private boolean Z;
    private boolean h;

    @NotNull
    private final fd D;

    @NotNull
    private final fd r;

    @NotNull
    private final fd B;

    @NotNull
    private final ArrayList K;
    private static final String[] d;
    private static final String[] e;
    private static final long[] g;
    private static final Integer[] k;
    private static final Map l;
    private static final long[] m;
    private static final Long[] n;
    private static final Map o;
    private static final long b = yz.a(217593705347506475L, 8108681302133724723L, MethodHandles.lookup().lookupClass()).a(134993480702592L);
    private static final Map f = new HashMap(13);

    /* JADX WARN: Illegal instructions before constructor call */
    public rx(@NotNull a1 setting, long a) {
        long j = b ^ a;
        long j2 = j ^ 77463049195187L;
        long j3 = j ^ 76487498038020L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j3 << 16) >>> 48);
        int i3 = (int) ((j3 << 32) >>> 32);
        Intrinsics.checkNotNullParameter(setting, (String) a(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7237, 3535559049951543116L ^ j) /* invoke-custom */);
        super(j ^ 56221275223263L, setting);
        this.t = setting;
        this.D = new fd(_s.OUT_QUINT, (long) c(MethodHandles.lookup(), "k", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(492, 7248019978311701447L ^ j) /* invoke-custom */, j2);
        this.r = new fd(_s.OUT_QUINT, (long) c(MethodHandles.lookup(), "k", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1844, 1833690425395385630L ^ j) /* invoke-custom */, j2);
        this.B = new fd(_s.OUT_QUINT, (long) c(MethodHandles.lookup(), "k", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1844, 1833690425395385630L ^ j) /* invoke-custom */, j2);
        this.K = new ArrayList();
        int i4 = 0;
        while (i4 < 4) {
            this.K.add(new b7(A(), x(), R(), i4, (char) i, (short) i2, i3));
            i4++;
            if (j <= 0 || j < 0) {
                return;
            }
        }
    }

    @Override // su.catlean.ru
    @NotNull
    public a1 A() {
        return this.t;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x016d: INVOKE (r-1 I:su.catlean.fd), (r0 I:long), (r1 I:float) VIRTUAL call: su.catlean.fd.B(long, float):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @Override // su.catlean.ru
    public void r(@org.jetbrains.annotations.NotNull net.minecraft.class_332 r24, int r25, int r26, long r27, float r29) {
        /*
            Method dump skipped, instruction units count: 2454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rx.r(net.minecraft.class_332, int, int, long, float):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v6, types: [float[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [float] */
    /* JADX WARN: Type inference failed for: r4v9, types: [float] */
    /* JADX WARN: Type inference failed for: r6v2, types: [float] */
    private final void D(long j, Matrix3x2fStack matrix3x2fStack, int i, int i2) {
        long j2 = b ^ j;
        long j3 = j2 ^ 20097867638364L;
        int i3 = (int) (j2 >>> 48);
        int i4 = (int) ((j3 << 16) >>> 48);
        int i5 = (int) ((j3 << 32) >>> 32);
        long j4 = j2 ^ 57358125213125L;
        int i6 = (int) (j2 >>> 48);
        int i7 = (int) ((j4 << 16) >>> 32);
        int i8 = (int) ((j4 << 48) >>> 48);
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5091058274041692474L, j2) /* invoke-custom */;
        float fX = ((x() + F()) - 48.0f) + 2.0f;
        float fR = R() + 10.0f + 2.0f;
        ?? r0 = new float[3];
        try {
            Color.RGBtoHSB(((Color) A().F()).getRed(), ((Color) A().F()).getGreen(), ((Color) A().F()).getBlue(), (float[]) r0);
            float fY = (fX - 4.0f) + ((int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(946, 7973709942258675638L ^ j2) /* invoke-custom */ * r0[1]);
            float fY2 = (fR - 4.0f) + ((int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9456, 8832580972096358648L ^ j2) /* invoke-custom */ * (1.0f - r0[2]));
            Color color = (Color) A().F();
            Color color2 = Color.BLACK;
            Intrinsics.checkNotNullExpressionValue(color2, (String) a(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21841, 5153285528648850579L ^ j2) /* invoke-custom */);
            x1.n(matrix3x2fStack, (char) i3, fY, fY2, 7.0f, 7.0f, 2.5f, 1.5f, 1.0f, 1.0f, color, color2, 0.0f, (short) i4, 0.0f, i5, 0.0f, (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27297, 3840623251854575270L ^ j2) /* invoke-custom */, null);
            r0 = this.O;
            ?? r02 = r0;
            if (_gVarArr != null) {
                if (r0 == 0) {
                    return;
                } else {
                    r02 = i;
                }
            }
            A().H(jl.y.p(new Color(Color.HSBtoRGB((float) r0[0], Math.clamp((((float) r02) - fX) / 40.0f, 0.0f, 1.0f), Math.clamp(1.0f - ((i2 - fR) / 40.0f), 0.0f, 1.0f))), (char) i6, i7, ((Color) A().F()).getAlpha() / 255.0f, (short) i8));
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 5089845169605320982L, j2) /* invoke-custom */;
        }
    }

    private final void z(Matrix3x2fStack matrix3x2fStack, int i, long j) {
        long j2 = b ^ j;
        long j3 = j2 ^ 36764805142622L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j3 << 16) >>> 48);
        int i4 = (int) ((j3 << 32) >>> 32);
        long j4 = j2 ^ 7705805315015L;
        int i5 = (int) (j2 >>> 48);
        int i6 = (int) ((j4 << 16) >>> 32);
        int i7 = (int) ((j4 << 48) >>> 48);
        float fR = R() + 11.0f;
        x1.n(matrix3x2fStack, (char) i2, x() + 58.0f, (fR - 4.0f) + ((int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28860, 5134299399869276859L ^ j2) /* invoke-custom */ * (1.0f - (((Color) A().F()).getAlpha() / 255.0f))), 7.0f, 7.0f, 2.5f, 1.0f, 1.0f, 1.0f, (Color) A().F(), jl.y.p((Color) A().F(), (char) i5, i6, 1.0f, (short) i7), 0.0f, (short) i3, 0.0f, i4, 0.0f, (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8676, 2258401670414169056L ^ j2) /* invoke-custom */, null);
        if (this.Z) {
            A().H(jl.y.p((Color) A().F(), (char) i5, i6, Math.clamp(1.0f - ((i - fR) / 39.0f), 0.0f, 1.0f), (short) i7));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v8, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    private final void C(short s, Matrix3x2fStack matrix3x2fStack, int i, int i2, short s2) {
        long j = (((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s2) << 48) >>> 48)) ^ b;
        long j2 = j ^ 65491764045538L;
        int i3 = (int) (j >>> 48);
        int i4 = (int) ((j2 << 16) >>> 48);
        int i5 = (int) ((j2 << 32) >>> 32);
        long j3 = j ^ 32975177360763L;
        int i6 = (int) (j >>> 48);
        int i7 = (int) ((j3 << 16) >>> 32);
        int i8 = (int) ((j3 << 48) >>> 48);
        ?? r0 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5051133679507046788L, j) /* invoke-custom */;
        float fX = x();
        float[] fArr = new float[3];
        Color.RGBtoHSB(((Color) A().F()).getRed(), ((Color) A().F()).getGreen(), ((Color) A().F()).getBlue(), fArr);
        try {
            x1.n(matrix3x2fStack, (char) i3, (fX - 3.5f) + ((int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22775, 5096988557644395593L ^ j) /* invoke-custom */ * fArr[0]), R() + 52.0f, 7.0f, 7.0f, 2.5f, 1.0f, 1.0f, 1.0f, new Color(Color.HSBtoRGB(fArr[0], 1.0f, 1.0f)), new Color(Color.HSBtoRGB(fArr[0], 1.0f, 1.0f)), 0.0f, (short) i4, 0.0f, i5, 0.0f, (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8676, 2258395393255345500L ^ j) /* invoke-custom */, null);
            r0 = this.h;
            ?? r02 = r0;
            if (r0 != 0) {
                if (r0 == 0) {
                    return;
                } else {
                    r02 = i;
                }
            }
            A().H(jl.y.p(new Color(Color.HSBtoRGB(Math.clamp((((float) r02) - fX) / 107.0f, 0.0f, 1.0f), fArr[1], fArr[2])), (char) i6, i7, ((Color) A().F()).getAlpha() / 255.0f, (short) i8));
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 5052171138034442664L, j) /* invoke-custom */;
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
    @Override // su.catlean.ru
    public void W(long r9, double r11, double r13, int r15) {
        /*
            Method dump skipped, instruction units count: 1853
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rx.W(long, double, double, int):void");
    }

    @Override // su.catlean.ru
    public void U(double mouseX, double mouseY, int button) {
        this.O = false;
        this.h = false;
        this.Z = false;
    }

    @Override // su.catlean.ru
    public void V(int key, short a, int a2, char a3) throws Exception {
        long j = (((long) a) << 48) | ((((long) a2) << 32) >>> 16) | ((((long) a3) << 48) >>> 48);
        int i = (int) (j >>> 56);
        long j2 = ((j ^ 70303453601542L) << 8) >>> 8;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3368314324986226980L, j) /* invoke-custom */;
        for (b7 b7Var : this.K) {
            b7 b7Var2 = null;
            try {
                b7Var2 = b7Var;
                b7Var2.y((byte) i, key, j2);
                do {
                    _g[] _gVarArr2 = _gVarArr;
                    if (a3 > 0) {
                        if (_gVarArr2 == null) {
                            return;
                        } else {
                            _gVarArr2 = _gVarArr;
                        }
                    }
                    if (_gVarArr2 == null) {
                    }
                } while (a3 < 0);
                return;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(b7Var2, -3367418979510929680L, j) /* invoke-custom */;
            }
        }
    }

    @Override // su.catlean.ru
    public void T(char c, long a) throws Exception {
        long j = a ^ 78532298840237L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(666088507151863459L, a) /* invoke-custom */;
        for (b7 b7Var : this.K) {
            b7 b7Var2 = null;
            try {
                b7Var2 = b7Var;
                b7Var2.G(c, j);
                do {
                    _g[] _gVarArr2 = _gVarArr;
                    if (a > 0) {
                        if (_gVarArr2 == null) {
                            return;
                        } else {
                            _gVarArr2 = _gVarArr;
                        }
                    }
                    if (_gVarArr2 == null) {
                    }
                } while (a < 0);
                return;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(b7Var2, 665330188279639695L, a) /* invoke-custom */;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    @Override // su.catlean.ru
    public boolean S(byte b2, double d2, double d3, double d4, long j) {
        long j2 = (((long) b2) << 56) | ((j << 8) >>> 8);
        long j3 = j2 ^ 89558228970238L;
        ?? r0 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6537910343375756582L, j2) /* invoke-custom */;
        try {
            try {
                r0 = this.J;
                ?? r02 = r0;
                if (r0 != 0) {
                    if (r0 == 0) {
                        return false;
                    }
                    r02 = 0;
                }
                ?? r25 = r02;
                for (b7 b7Var : this.K) {
                    ?? D = r0;
                    r25 = r25;
                    if (b2 >= 0) {
                        if (D != 0) {
                            try {
                                try {
                                    D = b7Var.d(d2, d3, d4, j3);
                                    if (r0 == 0) {
                                        return D;
                                    }
                                    r25 = r25;
                                    if (D != 0) {
                                        r25 = 1;
                                    }
                                } catch (NumberFormatException unused) {
                                    D = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(D, 6538808162785574154L, j2) /* invoke-custom */;
                                    throw D;
                                }
                            } catch (NumberFormatException unused2) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(D, 6538808162785574154L, j2) /* invoke-custom */;
                            }
                        }
                        D = r0;
                    }
                    if (D == 0) {
                        break;
                    }
                }
                return r25;
            } catch (NumberFormatException unused3) {
                r0 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 6538808162785574154L, j2) /* invoke-custom */;
                throw r0;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 6538808162785574154L, j2) /* invoke-custom */;
        }
    }

    @Override // su.catlean.ru
    public void L() {
        this.O = false;
        this.h = false;
        this.Z = false;
    }

    static {
        int i;
        long j = b ^ 98005831403160L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[9];
        int i3 = 0;
        String str = "Â.\u0014×ºÃÔ\u0099fz\u000b¯Ã\t%\u0002\u00108âØ\u0081ÌÏ±h[ã'¶°xr\u0000\u0018zC\u009aO\u0087(«B¸i@ðµïÑdCáUC®K-«\u0010H^CgÉÞ\u001diÃo\nqø\u00835û \u008ciRx4\u000e*#~c\u0084Àw£ÞÔV\u0087\u0013ÄÐ¸g<oÅ.iý\u0019 \f\u0018\u001b6A%tüË&â\u0017«Uûn:íõ\u0003\u001c\\'øÊ\\\u0010\u0090ß\u008b\u0095*\u009cìeWRì\u000e×48´";
        int length = "Â.\u0014×ºÃÔ\u0099fz\u000b¯Ã\t%\u0002\u00108âØ\u0081ÌÏ±h[ã'¶°xr\u0000\u0018zC\u009aO\u0087(«B¸i@ðµïÑdCáUC®K-«\u0010H^CgÉÞ\u001diÃo\nqø\u00835û \u008ciRx4\u000e*#~c\u0084Àw£ÞÔV\u0087\u0013ÄÐ¸g<oÅ.iý\u0019 \f\u0018\u001b6A%tüË&â\u0017«Uûn:íõ\u0003\u001c\\'øÊ\\\u0010\u0090ß\u008b\u0095*\u009cìeWRì\u000e×48´".length();
        char cCharAt = 16;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            d = strArr;
                            e = new String[9];
                            l = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[11];
                            int i9 = 0;
                            String str3 = "AD\"¦z.B{ºàïR\fÇAA1ß\u0011\\Û]\u008f\tÀ\u00ad¶\u0096HËÍi¸¿\u008c¸\u0086÷\u000f\u0085gº\b:6óp\u0085Ù\u0082\u000b\u0006&\u000f¿×\fdëï\u001f}`£ê\u008eü\u009bÏTý4";
                            int length2 = "AD\"¦z.B{ºàïR\fÇAA1ß\u0011\\Û]\u008f\tÀ\u00ad¶\u0096HËÍi¸¿\u008c¸\u0086÷\u000f\u0085gº\b:6óp\u0085Ù\u0082\u000b\u0006&\u000f¿×\fdëï\u001f}`£ê\u008eü\u009bÏTý4".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j3 = j2;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                g = jArr;
                                                k = new Integer[11];
                                                o = new HashMap(13);
                                                Cipher cipher3 = Cipher.getInstance("DES/CBC/NoPadding");
                                                SecretKeyFactory secretKeyFactory3 = SecretKeyFactory.getInstance("DES");
                                                byte[] bArr3 = new byte[8];
                                                bArr3[0] = (byte) (j >>> 56);
                                                for (int i14 = 1; i14 < 8; i14++) {
                                                    bArr3[i14] = (byte) ((j << (i14 * 8)) >>> 56);
                                                }
                                                cipher3.init(2, secretKeyFactory3.generateSecret(new DESKeySpec(bArr3)), new IvParameterSpec(new byte[8]));
                                                long[] jArr3 = new long[2];
                                                int i15 = 0;
                                                int length3 = "äë®>±\u0083P²eÎT\u0094](éI".length();
                                                int i16 = 0;
                                                do {
                                                    int i17 = i16;
                                                    i16 += 8;
                                                    byte[] bytes2 = "äë®>±\u0083P²eÎT\u0094](éI".substring(i17, i16).getBytes("ISO-8859-1");
                                                    i15++;
                                                    byte[] bArrDoFinal2 = cipher3.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255))});
                                                    jArr3[-1] = ((((long) bArrDoFinal2[0]) & 255) << 56) | ((((long) bArrDoFinal2[1]) & 255) << 48) | ((((long) bArrDoFinal2[2]) & 255) << 40) | ((((long) bArrDoFinal2[3]) & 255) << 32) | ((((long) bArrDoFinal2[4]) & 255) << 24) | ((((long) bArrDoFinal2[5]) & 255) << 16) | ((((long) bArrDoFinal2[6]) & 255) << 8) | (((long) bArrDoFinal2[7]) & 255);
                                                } while (i16 < length3);
                                                m = jArr3;
                                                n = new Long[2];
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "\u0005z`\u0005Ä\u0015fÃV;\u009eÓ ñÐ\u001a";
                                                length2 = "\u0005z`\u0005Ä\u0015fÃV;\u009eÓ ñÐ\u001a".length();
                                                i10 = 0;
                                            }
                                            break;
                                    }
                                    int i18 = i10;
                                    i10 += 8;
                                    byte[] bytes3 = str3.substring(i18, i10).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i12 = i9;
                                    i9++;
                                    j2 = ((((long) bytes3[0]) & 255) << 56) | ((((long) bytes3[1]) & 255) << 48) | ((((long) bytes3[2]) & 255) << 40) | ((((long) bytes3[3]) & 255) << 32) | ((((long) bytes3[4]) & 255) << 24) | ((((long) bytes3[5]) & 255) << 16) | ((((long) bytes3[6]) & 255) << 8) | (((long) bytes3[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i19 = i3;
                        i3++;
                        strArr[i19] = strIntern;
                        int i20 = i5 + cCharAt;
                        i4 = i20;
                        if (i20 < length) {
                        }
                        str = "M¸3K\u008bzËFß@5\u0019\u0086Ö\u008f[ëI\u000e\u0019#\u0092?\u0080\u0010\u001b|\t»\u0015P\u008aº\u001dà¥g\u0018P+-";
                        length = "M¸3K\u008bzËFß@5\u0019\u0086Ö\u008f[ëI\u000e\u0019#\u0092?\u0080\u0010\u001b|\t»\u0015P\u008aº\u001dà¥g\u0018P+-".length();
                        cCharAt = 24;
                        i = -1;
                        break;
                        break;
                }
                i5 = i + 1;
                strSubstring = str.substring(i5, i5 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i4);
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String b(byte[] bArr) {
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 3710;
        if (e[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                e[i2] = b(((Cipher) objArr[0]).doFinal(d[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/rx", e2);
            }
        }
        return e[i2];
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
            r-1 = r-1[r0]
            r0 = r10
            int r0 = r0.parameterCount()
            java.lang.invoke.MethodHandle r-2 = r-2.asCollector(r-1, r0)
            r-1 = 0
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r8
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r11
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = r9
            r1[r2] = r3
            java.lang.invoke.MethodHandle r-2 = java.lang.invoke.MethodHandles.insertArguments(r-2, r-1, r0)
            r-1 = r10
            java.lang.invoke.MethodHandle r-2 = java.lang.invoke.MethodHandles.explicitCastArguments(r-2, r-1)
            r-3.setTarget(r-2)
            goto L62
            r12 = r-4
            java.lang.RuntimeException r-4 = new java.lang.RuntimeException
            r-3 = r-4
            java.lang.StringBuilder r-2 = new java.lang.StringBuilder
            r-1 = r-2
            r-1.<init>()
            java.lang.String r-1 = "su/catlean/rx"
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-1 = " : "
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            r-1 = r9
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-1 = " : "
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            r-1 = r10
            r-1.toString()
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-2 = r-2.toString()
            r-1 = r12
            r-3.<init>(r-2, r-1)
            throw r-4
            r-3 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rx.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 27583;
        if (k[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) l.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/rx", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            k[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return k[i2].intValue();
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
            r-1 = r-1[r0]
            r0 = r10
            int r0 = r0.parameterCount()
            java.lang.invoke.MethodHandle r-2 = r-2.asCollector(r-1, r0)
            r-1 = 0
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r8
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r11
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = r9
            r1[r2] = r3
            java.lang.invoke.MethodHandle r-2 = java.lang.invoke.MethodHandles.insertArguments(r-2, r-1, r0)
            r-1 = r10
            java.lang.invoke.MethodHandle r-2 = java.lang.invoke.MethodHandles.explicitCastArguments(r-2, r-1)
            r-3.setTarget(r-2)
            goto L62
            r12 = r-4
            java.lang.RuntimeException r-4 = new java.lang.RuntimeException
            r-3 = r-4
            java.lang.StringBuilder r-2 = new java.lang.StringBuilder
            r-1 = r-2
            r-1.<init>()
            java.lang.String r-1 = "su/catlean/rx"
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-1 = " : "
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            r-1 = r9
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-1 = " : "
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            r-1 = r10
            r-1.toString()
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-2 = r-2.toString()
            r-1 = r12
            r-3.<init>(r-2, r-1)
            throw r-4
            r-3 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rx.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static long c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 32604;
        if (n[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) m[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) o.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/rx", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            n[i2] = Long.valueOf(((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255));
        }
        return n[i2].longValue();
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
            r-1 = r-1[r0]
            r0 = r10
            int r0 = r0.parameterCount()
            java.lang.invoke.MethodHandle r-2 = r-2.asCollector(r-1, r0)
            r-1 = 0
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r8
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r11
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = r9
            r1[r2] = r3
            java.lang.invoke.MethodHandle r-2 = java.lang.invoke.MethodHandles.insertArguments(r-2, r-1, r0)
            r-1 = r10
            java.lang.invoke.MethodHandle r-2 = java.lang.invoke.MethodHandles.explicitCastArguments(r-2, r-1)
            r-3.setTarget(r-2)
            goto L62
            r12 = r-4
            java.lang.RuntimeException r-4 = new java.lang.RuntimeException
            r-3 = r-4
            java.lang.StringBuilder r-2 = new java.lang.StringBuilder
            r-1 = r-2
            r-1.<init>()
            java.lang.String r-1 = "su/catlean/rx"
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-1 = " : "
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            r-1 = r9
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-1 = " : "
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            r-1 = r10
            r-1.toString()
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-2 = r-2.toString()
            r-1 = r12
            r-3.<init>(r-2, r-1)
            throw r-4
            r-3 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rx.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
