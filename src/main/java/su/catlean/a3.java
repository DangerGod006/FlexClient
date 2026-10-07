package su.catlean;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
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
import net.minecraft.class_2561;
import net.minecraft.class_5250;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/a3.class */
public abstract class a3 {

    @NotNull
    private final String L;

    @NotNull
    private final String d;
    private static _g[] H;
    private static final long a = yz.a(-3293937965191506912L, -6601232492868737155L, MethodHandles.lookup().lookupClass()).a(11271304481541L);
    private static final String[] c;
    private static final String[] e;
    private static final Map f;

    public a3(long a2, @NotNull String name) {
        long j = a ^ a2;
        long j2 = j ^ 93897461427013L;
        int i = (int) ((j2 << 32) >>> 48);
        int i2 = (int) ((j2 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(name, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26118, 2965668006841850007L ^ j) /* invoke-custom */);
        this.L = name;
        i4 i4Var = i4.h;
        this.d = i4Var.E((int) (j >>> 32), (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26068, 1439037480054561610L ^ j) /* invoke-custom */ + this.L, i, new Object[0], i2);
    }

    @NotNull
    public final String E() {
        return this.L;
    }

    public abstract void l(@NotNull LiteralArgumentBuilder literalArgumentBuilder, long j);

    public final void q(long a2, @NotNull CommandDispatcher dispatcher) {
        long j = a ^ a2;
        long j2 = j ^ 48502509680065L;
        Intrinsics.checkNotNullParameter(dispatcher, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23305, 6652015202535004249L ^ j) /* invoke-custom */);
        LiteralArgumentBuilder literalArgumentBuilderLiteral = LiteralArgumentBuilder.literal(this.L);
        Intrinsics.checkNotNull(literalArgumentBuilderLiteral);
        l(literalArgumentBuilderLiteral, j2);
        dispatcher.register(literalArgumentBuilderLiteral);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.mojang.brigadier.builder.RequiredArgumentBuilder, java.lang.Object] */
    @NotNull
    public final RequiredArgumentBuilder j(@NotNull String name, @NotNull ArgumentType type, long a2) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(name, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19557, 5844530683590847825L ^ j) /* invoke-custom */);
        Object objArgument = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7267751676784076691L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(type, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19459, 8210955457299623216L ^ j) /* invoke-custom */);
        try {
            objArgument = RequiredArgumentBuilder.argument(name, type);
            Intrinsics.checkNotNullExpressionValue(objArgument, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14510, 1369458740062443928L ^ j) /* invoke-custom */);
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7276788263415347822L, j) /* invoke-custom */ != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[1], -7243067664372291136L, j) /* invoke-custom */;
            }
            return objArgument;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objArgument, -7303506338034073054L, j) /* invoke-custom */;
        }
    }

    @NotNull
    public final LiteralArgumentBuilder c(long a2, @NotNull String name) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(name, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26118, 2965649103474320984L ^ j) /* invoke-custom */);
        LiteralArgumentBuilder literalArgumentBuilderLiteral = LiteralArgumentBuilder.literal(name);
        Intrinsics.checkNotNullExpressionValue(literalArgumentBuilderLiteral, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28576, 7748257090975199227L ^ j) /* invoke-custom */);
        return literalArgumentBuilderLiteral;
    }

    public final void a(@NotNull String msg, long a2) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(msg, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3961, 4735516704726934589L ^ j) /* invoke-custom */);
        C(zm.G(j ^ 137557489866392L, msg), j ^ 71489716120494L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0059: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_5250), (r1 I:java.lang.String) STATIC call: su.catlean.zm.E(long, net.minecraft.class_5250, java.lang.String):net.minecraft.class_5250
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void C(@org.jetbrains.annotations.NotNull net.minecraft.class_2561 r9, long r10) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.a3.C(net.minecraft.class_2561, long):void");
    }

    private static final void n(class_5250 class_5250Var) {
        zf.v((a ^ 99552141081273L) ^ 28881855020570L).method_7353((class_2561) class_5250Var, false);
    }

    public static void Z(_g[] _gVarArr) {
        H = _gVarArr;
    }

    public static _g[] S() {
        return H;
    }

    static {
        int i;
        long j = a ^ 56869212652252L;
        f = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[4], -3154475442261662078L, j) /* invoke-custom */;
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
        String str = "úç£ç¾·¨9H\u0005~w´\u0005\u0016êÍÒ®°\u0099Á^¨ö{Y\u0099K\u0088=¿\u0018\u0007\u008cf¬\u009fÎb©\u0003E\u009au^h´m\u0081§øçKí\u0001Z\u0018\b\u0088Ãz\u0089\u0095ïOIÁ\u0004\u0099¶g\u009aõ[%Q¯yDøú\u0010\u00ad6b}\u0007\"/xÿH\u001b¿oìU%\u0010^é\u001b\u0098\u0001!¡\u0094à\u009fç\u0084~_Äì\u0010ù_e\u008e.3\b\u0088|®\u008b{b\u0090Æ\u009e\u0010]ÿ \u00934ÞÈ#\u0090!j±\u000eé¿\u000b";
        int length = "úç£ç¾·¨9H\u0005~w´\u0005\u0016êÍÒ®°\u0099Á^¨ö{Y\u0099K\u0088=¿\u0018\u0007\u008cf¬\u009fÎb©\u0003E\u009au^h´m\u0081§øçKí\u0001Z\u0018\b\u0088Ãz\u0089\u0095ïOIÁ\u0004\u0099¶g\u009aõ[%Q¯yDøú\u0010\u00ad6b}\u0007\"/xÿH\u001b¿oìU%\u0010^é\u001b\u0098\u0001!¡\u0094à\u009fç\u0084~_Äì\u0010ù_e\u008e.3\b\u0088|®\u008b{b\u0090Æ\u009e\u0010]ÿ \u00934ÞÈ#\u0090!j±\u000eé¿\u000b".length();
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
                        if (i7 >= length) {
                            c = strArr;
                            e = new String[9];
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
                        str = "ë9\u0011<*ëö÷º\u009d\u009c·N@?q(©àÜO\u0013\u00119\u0010\u0085E¯u1²ãüÄFÛn\u009dc¡1Ð*\u009e¾SÙ\u0083ü)\u009dô8þ\u0098¢G";
                        length = "ë9\u0011<*ëö÷º\u009d\u009c·N@?q(©àÜO\u0013\u00119\u0010\u0085E¯u1²ãüÄFÛn\u009dc¡1Ð*\u009e¾SÙ\u0083ü)\u009dô8þ\u0098¢G".length();
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

    private static NumberFormatException b(NumberFormatException numberFormatException) {
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 31589;
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
                e[i2] = a(((Cipher) objArr[0]).doFinal(c[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/a3", e2);
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
            java.lang.String r1 = "su/catlean/a3"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.a3.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
