package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.class_10055;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_591;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/tk.class */
public final class tk {

    @NotNull
    private final class_591 Y;

    @NotNull
    private final class_10055 i;

    @NotNull
    private class_243 m;

    @NotNull
    private final class_2960 M;
    private float a;
    private float b;

    @NotNull
    private class_243 G;
    private static String[] N;
    private static final long c = yz.a(-2108292055991162960L, -4210892576235190131L, MethodHandles.lookup().lookupClass()).a(40802403328362L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public tk(@NotNull class_591 model, @NotNull class_10055 state, @NotNull class_243 pos, @NotNull class_2960 texture, float alpha, long a) {
        long j = c ^ a;
        Intrinsics.checkNotNullParameter(model, (String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26188, 4079926944745700107L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(state, (String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27163, 7972490256460691294L ^ j) /* invoke-custom */);
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5235422289277385180L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(pos, (String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27204, 942193167850583812L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(texture, (String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27579, 3329412305783797503L ^ j) /* invoke-custom */);
        this.Y = model;
        this.i = state;
        try {
            this.m = pos;
            this.M = texture;
            this.a = alpha;
            this.b = this.a;
            this.G = this.m;
            if (obj == null) {
                obj = new _g[5];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5223104778868376130L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5205397129496850191L, j) /* invoke-custom */;
        }
    }

    @NotNull
    public final class_591 D() {
        return this.Y;
    }

    @NotNull
    public final class_10055 z() {
        return this.i;
    }

    @NotNull
    public final class_243 G() {
        return this.m;
    }

    public final void g(long a, @NotNull class_243 class_243Var) {
        Intrinsics.checkNotNullParameter(class_243Var, (String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13694, 7155416100709787481L ^ (c ^ a)) /* invoke-custom */);
        this.m = class_243Var;
    }

    @NotNull
    public final class_2960 V() {
        return this.M;
    }

    public final float N() {
        return this.a;
    }

    public final void k(float f2) {
        this.a = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    public final boolean W(float aSpeed, float ySpeed, long a) {
        long j = c ^ a;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2986945942457358352L, j) /* invoke-custom */;
        try {
            try {
                obj = (this.a > 0.0f ? 1 : (this.a == 0.0f ? 0 : -1));
                if (obj == 0) {
                    return obj;
                }
                if (obj <= 0) {
                    return true;
                }
                this.b = this.a;
                this.a -= aSpeed;
                this.G = this.m;
                this.m = new class_243(this.m.field_1352, this.m.field_1351 + ((double) ySpeed), this.m.field_1350);
                return false;
            } catch (NumberFormatException unused) {
                obj = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3020083886194560731L, j) /* invoke-custom */;
                throw obj;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3020083886194560731L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [float] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    public final float p(long j) {
        long j2 = c ^ j;
        long j3 = j2 ^ 32039250440926L;
        int i = (int) (j2 >>> 32);
        int i2 = (int) ((j3 << 32) >>> 48);
        int i3 = (int) ((j3 << 48) >>> 48);
        Object objCoerceIn = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-704701931802736828L, j2) /* invoke-custom */;
        try {
            objCoerceIn = RangesKt.coerceIn(jl.y.B(this.b, this.a, zi.v.n(i, (char) i2, i3)), 0.0f, 255.0f) / 255.0f;
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-678489784927000572L, j2) /* invoke-custom */ != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[3], -708381853308354567L, j2) /* invoke-custom */;
            }
            return objCoerceIn;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objCoerceIn, -674738834295434863L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x004a: INVOKE (r-1 I:su.catlean.zi), (r0 I:long), (r1 I:net.minecraft.class_243), (r2 I:net.minecraft.class_243), (r3 I:float) VIRTUAL call: su.catlean.zi.q(long, net.minecraft.class_243, net.minecraft.class_243, float):net.minecraft.class_243
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @org.jetbrains.annotations.NotNull
    public final net.minecraft.class_243 C(long r11) {
        /*
            r10 = this;
            long r0 = su.catlean.tk.c
            r1 = r11
            long r0 = r0 ^ r1
            r11 = r0
            r0 = r11
            r1 = r0; r1 = r0; 
            r2 = 54228592482553(0x315213fdd8f9, double:2.67924845679543E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r14 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r15 = r2
            r1 = r0; r3 = r0; 
            r2 = 39453207211721(0x23e1ea66aec9, double:1.94924743015675E-310)
            long r1 = r1 ^ r2
            r16 = r1
            su.catlean.zi r0 = su.catlean.zi.v
            r1 = r10
            net.minecraft.class_243 r1 = r1.G
            r2 = r16
            r3 = r2; r2 = r1; r1 = r3; 
            r2 = r10
            net.minecraft.class_243 r2 = r2.m
            su.catlean.zi r3 = su.catlean.zi.v
            r4 = r13
            r5 = r14
            char r5 = (char) r5
            r6 = r15
            float r3 = r3.n(r4, r5, r6)
            r-1.q(r0, r1, r2, r3)
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tk.C(long):net.minecraft.class_243");
    }

    public static void T(String[] strArr) {
        N = strArr;
    }

    public static String[] s() {
        return N;
    }

    static {
        int i;
        long j = c ^ 3360678718998L;
        f = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[1], 1531021267675061485L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[5];
        int i3 = 0;
        String str = "k\u0016ªùb±©ðfôøÍ\u0083RØ8\u0010ò \u0011[=h\u0086±^\u001cÜjÕÄuÎ\u0010}\u001cÚ\u0093NÜ\u0012Øæ\u009c\u008aºÝÁ(\u0087";
        int length = "k\u0016ªùb±©ðfôøÍ\u0083RØ8\u0010ò \u0011[=h\u0086±^\u001cÜjÕÄuÎ\u0010}\u001cÚ\u0093NÜ\u0012Øæ\u009c\u008aºÝÁ(\u0087".length();
        char cCharAt = 16;
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
                        if (i7 >= length) {
                            d = strArr;
                            e = new String[5];
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                    default:
                        int i8 = i3;
                        i3++;
                        strArr[i8] = strIntern;
                        int i9 = i5 + cCharAt;
                        i4 = i9;
                        if (i9 < length) {
                        }
                        str = "y¶<\u0082ùt;¢\u0095øU¸©\u0083\u0005\u0084\u0010\u000fw\u00adQ¨¤ZÒ\u00adó´\u001c\u0002\u0001\u000fm";
                        length = "y¶<\u0082ùt;¢\u0095øU¸©\u0083\u0005\u0084\u0010\u000fw\u00adQ¨¤ZÒ\u00adó´\u001c\u0002\u0001\u000fm".length();
                        cCharAt = 16;
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

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
                char c2 = (char) (((char) (((char) (i3 & 15)) << '\f')) | (((char) (bArr[i6] & 63)) << 6));
                i2 = i6 + 1;
                int i7 = i;
                i++;
                cArr[i7] = (char) (c2 | ((char) (bArr[i2] & 63)));
            }
            i2++;
        }
        return new String(cArr, 0, i);
    }

    private static String a(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 27616;
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
                e[i2] = a(((Cipher) objArr[0]).doFinal(d[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/tk", e2);
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
            java.lang.String r1 = "su/catlean/tk"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tk.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
