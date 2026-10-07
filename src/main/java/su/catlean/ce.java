package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_591;
import net.minecraft.class_630;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ce.class */
public final class ce {

    @NotNull
    private final Function1 D;

    @NotNull
    private final Function1 L;
    private final double F;
    private final double n;
    public static final ce HEAD = null;
    public static final ce BODY = null;
    public static final ce LEFT_ARM = null;
    public static final ce RIGHT_ARM = null;
    public static final ce LEFT_LEG = null;
    public static final ce RIGHT_LEG = null;
    private static final /* synthetic */ ce[] S = null;
    private static final /* synthetic */ EnumEntries V = null;
    private static String T;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map d = null;
    private static final long e = 0;

    private ce(String str, int i, Function1 function1, Function1 function12, double d2, double d3) {
        this.D = function1;
        this.L = function12;
        this.F = d2;
        this.n = d3;
    }

    @NotNull
    public final Function1 T() {
        return this.D;
    }

    @NotNull
    public final Function1 s() {
        return this.L;
    }

    public final double J() {
        return this.F;
    }

    public final double c() {
        return this.n;
    }

    public static ce[] values() {
        return (ce[]) S.clone();
    }

    public static ce valueOf(String value) {
        return (ce) Enum.valueOf(ce.class, value);
    }

    @NotNull
    public static EnumEntries d() {
        return V;
    }

    private static final class_630 d(class_591 class_591Var) {
        long j = a ^ 69886471686877L;
        Intrinsics.checkNotNullParameter(class_591Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2942, 1677016534219033978L ^ j) /* invoke-custom */);
        class_630 class_630Var = class_591Var.field_3398;
        Intrinsics.checkNotNullExpressionValue(class_630Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18818, 5877222634322218887L ^ j) /* invoke-custom */);
        return class_630Var;
    }

    private static final class_630 z(class_591 class_591Var) {
        long j = a ^ 4316816825493L;
        Intrinsics.checkNotNullParameter(class_591Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2942, 1676968287240559410L ^ j) /* invoke-custom */);
        class_630 class_630Var = class_591Var.field_3394;
        Intrinsics.checkNotNullExpressionValue(class_630Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6119, 5514559935106975666L ^ j) /* invoke-custom */);
        return class_630Var;
    }

    private static final class_630 A(class_591 class_591Var) {
        long j = a ^ 29322356492812L;
        Intrinsics.checkNotNullParameter(class_591Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2942, 1676975699579129259L ^ j) /* invoke-custom */);
        class_630 class_630Var = class_591Var.field_3391;
        Intrinsics.checkNotNullExpressionValue(class_630Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7458, 6431537017299655679L ^ j) /* invoke-custom */);
        return class_630Var;
    }

    private static final class_630 w(class_591 class_591Var) {
        long j = a ^ 137600223488744L;
        Intrinsics.checkNotNullParameter(class_591Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9015, 6706230186303145217L ^ j) /* invoke-custom */);
        class_630 class_630Var = class_591Var.field_3483;
        Intrinsics.checkNotNullExpressionValue(class_630Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14404, 7529837030977527405L ^ j) /* invoke-custom */);
        return class_630Var;
    }

    private static final class_630 K(class_591 class_591Var) {
        long j = a ^ 88112035457951L;
        Intrinsics.checkNotNullParameter(class_591Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2942, 1676915810655153208L ^ j) /* invoke-custom */);
        class_630 class_630Var = class_591Var.field_27433;
        Intrinsics.checkNotNullExpressionValue(class_630Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30676, 971516993753698452L ^ j) /* invoke-custom */);
        return class_630Var;
    }

    private static final class_630 I(class_591 class_591Var) {
        long j = a ^ 105561024561360L;
        Intrinsics.checkNotNullParameter(class_591Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2942, 1676933531308902263L ^ j) /* invoke-custom */);
        class_630 class_630Var = class_591Var.field_3484;
        Intrinsics.checkNotNullExpressionValue(class_630Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15640, 3719047736858276120L ^ j) /* invoke-custom */);
        return class_630Var;
    }

    private static final class_630 p(class_591 class_591Var) {
        long j = a ^ 68379991210835L;
        Intrinsics.checkNotNullParameter(class_591Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2942, 1677014821655100660L ^ j) /* invoke-custom */);
        class_630 class_630Var = class_591Var.field_3401;
        Intrinsics.checkNotNullExpressionValue(class_630Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5560, 5562118024544264759L ^ j) /* invoke-custom */);
        return class_630Var;
    }

    private static final class_630 x(class_591 class_591Var) {
        long j = a ^ 5451402698188L;
        Intrinsics.checkNotNullParameter(class_591Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2942, 1676973888643209835L ^ j) /* invoke-custom */);
        class_630 class_630Var = class_591Var.field_3486;
        Intrinsics.checkNotNullExpressionValue(class_630Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3164, 8686120153198533963L ^ j) /* invoke-custom */);
        return class_630Var;
    }

    private static final class_630 E(class_591 class_591Var) {
        long j = a ^ 119286424777259L;
        Intrinsics.checkNotNullParameter(class_591Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2942, 1676929320976479628L ^ j) /* invoke-custom */);
        class_630 class_630Var = class_591Var.field_3397;
        Intrinsics.checkNotNullExpressionValue(class_630Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12029, 5878738679393931266L ^ j) /* invoke-custom */);
        return class_630Var;
    }

    private static final class_630 e(class_591 class_591Var) {
        long j = a ^ 75283512504172L;
        Intrinsics.checkNotNullParameter(class_591Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2942, 1676902914502813899L ^ j) /* invoke-custom */);
        class_630 class_630Var = class_591Var.field_3482;
        Intrinsics.checkNotNullExpressionValue(class_630Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1920, 6456030473201312827L ^ j) /* invoke-custom */);
        return class_630Var;
    }

    private static final class_630 N(class_591 class_591Var) {
        long j = a ^ 111222720405630L;
        Intrinsics.checkNotNullParameter(class_591Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2942, 1676938853693876185L ^ j) /* invoke-custom */);
        class_630 class_630Var = class_591Var.field_3392;
        Intrinsics.checkNotNullExpressionValue(class_630Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16085, 3727532846253593206L ^ j) /* invoke-custom */);
        return class_630Var;
    }

    private static final class_630 u(class_591 class_591Var) {
        long j = a ^ 113021416047377L;
        Intrinsics.checkNotNullParameter(class_591Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2942, 1676936525002032310L ^ j) /* invoke-custom */);
        class_630 class_630Var = class_591Var.field_3479;
        Intrinsics.checkNotNullExpressionValue(class_630Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6772, 7674693150167455155L ^ j) /* invoke-custom */);
        return class_630Var;
    }

    private static final /* synthetic */ ce[] u(byte b2, long j) {
        long j2 = ((((long) b2) << 56) | ((j << 8) >>> 8)) ^ a;
        ce[] ceVarArr = new ce[(int) e];
        ceVarArr[0] = HEAD;
        ceVarArr[1] = BODY;
        ceVarArr[2] = LEFT_ARM;
        ceVarArr[3] = RIGHT_ARM;
        ceVarArr[4] = LEFT_LEG;
        ceVarArr[5] = RIGHT_LEG;
        return ceVarArr;
    }

    public static void u(String str) {
        T = str;
    }

    public static String w() {
        return T;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 12117;
        if (c[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i2] = a(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/ce", e2);
            }
        }
        return c[i2];
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
            java.lang.String r1 = "su/catlean/ce"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ce.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
