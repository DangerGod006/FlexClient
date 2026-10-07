package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/n7.class */
public final class n7 {
    private float F;
    private float n;
    private float h;
    private float J;

    @NotNull
    private String T;

    @NotNull
    private Function0 v;
    private final int m;

    @NotNull
    private final Color w;

    @NotNull
    private final Color a;
    private final float H;
    private final float b;

    @NotNull
    private final fd k;
    private static boolean B;
    private static final long c = 0;
    private static final String[] d = null;
    private static final String[] e = null;
    private static final Map f = null;
    private static final long[] g = null;
    private static final Integer[] i = null;
    private static final Map j = null;
    private static final long l = 0;

    public n7(float x, float y, float width, float height, @NotNull String label, @NotNull Function0 clickActionX, long a, int id, @NotNull Color fill, @NotNull Color outline, float outlineWidth, float radius) {
        long j2 = c ^ a;
        long j3 = j2 ^ 50190090782863L;
        boolean z = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1581177926169793717L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(label, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3984, 2468051222014936963L ^ j2) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(clickActionX, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9438, 1264067518159514828L ^ j2) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(fill, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7614, 1824049928601195940L ^ j2) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(outline, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2256, 4487361674023682241L ^ j2) /* invoke-custom */);
        this.F = x;
        this.n = y;
        this.h = width;
        this.J = height;
        this.T = label;
        this.v = clickActionX;
        this.m = id;
        this.w = fill;
        this.a = outline;
        this.H = outlineWidth;
        this.b = radius;
        this.k = new fd(_s.OUT_QUINT, l, j3);
        if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1577729010546183029L, j2) /* invoke-custom */ != null) {
            boolean z2 = z;
            if (j2 >= 0) {
                if (z2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(z2, -1514234090517576093L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n7(float f2, float f3, float f4, float f5, String str, Function0 function0, int i2, long j2, Color color, Color color2, float f6, float f7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        long j3 = c ^ j2;
        long j4 = j3 ^ 131918976233697L;
        i2 = (i3 & (int) b(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9887, 5852934104075334605L ^ j3) /* invoke-custom */) != 0 ? 0 : i2;
        color = (i3 & (int) b(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17284, 9116187031407302353L ^ j3) /* invoke-custom */) != 0 ? jh.f.g() : color;
        if ((i3 & (int) b(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16638, 2329826419479287215L ^ j3) /* invoke-custom */) != 0) {
            Color color3 = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue(color3, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28847, 8423535416547589619L ^ j3) /* invoke-custom */);
            color2 = color3;
        }
        this(f2, f3, f4, f5, str, function0, j4, i2, color, color2, (i3 & (int) b(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2725, 3693495750056206321L ^ j3) /* invoke-custom */) != 0 ? 2.0f : f6, (i3 & (int) b(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2018, 9222695219219452594L ^ j3) /* invoke-custom */) != 0 ? 3.0f : f7);
    }

    public final float I() {
        return this.F;
    }

    public final void u(float f2) {
        this.F = f2;
    }

    public final float D() {
        return this.n;
    }

    public final void N(float f2) {
        this.n = f2;
    }

    public final float A() {
        return this.h;
    }

    public final void P(float f2) {
        this.h = f2;
    }

    public final float z() {
        return this.J;
    }

    public final void G(float f2) {
        this.J = f2;
    }

    @NotNull
    public final Function0 o() {
        return this.v;
    }

    public final void n(long a, @NotNull Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3247, 8878862094027391203L ^ (c ^ a)) /* invoke-custom */);
        this.v = function0;
    }

    public final int F() {
        return this.m;
    }

    @NotNull
    public final Color T() {
        return this.w;
    }

    @NotNull
    public final Color V() {
        return this.a;
    }

    public final float E() {
        return this.b;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00fc: INVOKE (r-1 I:su.catlean.fd), (r0 I:long), (r1 I:float) VIRTUAL call: su.catlean.fd.B(long, float):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void k(float r24, float r25, float r26, long r27, float r29, @org.jetbrains.annotations.NotNull net.minecraft.class_332 r30) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.n7.k(float, float, float, long, float, net.minecraft.class_332):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.n7] */
    public final void P(float mouseX, float mouseY, long a) {
        long j2 = c ^ a;
        long j3 = j2 ^ 124072835705275L;
        Object objJ = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7941646859266332580L, j2) /* invoke-custom */;
        try {
            objJ = this;
            if (objJ == 0) {
                try {
                    objJ = objJ.j(j3, mouseX, mouseY);
                    if (objJ != 0) {
                        this.v.invoke();
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objJ, -8058015264035563990L, j2) /* invoke-custom */;
                }
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objJ, -8058015264035563990L, j2) /* invoke-custom */;
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
    private final boolean j(long r8, float r10, float r11) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.n7.j(long, float, float):boolean");
    }

    public static void E(boolean z) {
        B = z;
    }

    public static boolean M() {
        return B;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean R() {
        return !M();
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 9049;
        if (e[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                e[i3] = a(((Cipher) objArr[0]).doFinal(d[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/n7", e2);
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
            r1 = 11446(0x2cb6, float:1.6039E-41)
            r2 = 0
            if (r1 <= r2) goto LB_49ef
            int r11 = r11 + 6
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
            java.lang.String r-1 = "su/catlean/n7"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.n7.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 15191;
        if (i[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) j.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/n7", e2);
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
            r1 = 11446(0x2cb6, float:1.6039E-41)
            r2 = 0
            if (r1 <= r2) goto LB_49ef
            int r11 = r11 + 6
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
            java.lang.String r-1 = "su/catlean/n7"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.n7.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
