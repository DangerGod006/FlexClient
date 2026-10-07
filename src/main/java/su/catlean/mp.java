package su.catlean;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2172;
import net.minecraft.class_634;
import net.minecraft.class_640;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mp.class */
public final class mp implements ArgumentType {

    @NotNull
    public static final m5 u = null;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map d = null;
    private static final long e = 0;

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.mojang.brigadier.exceptions.CommandSyntaxException */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @NotNull
    public String c(@NotNull StringReader reader, long a2) throws CommandSyntaxException {
        long j = a ^ a2;
        long j2 = j ^ 108974926948204L;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4920338496713285886L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(reader, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21257, 8981055400137723694L ^ j) /* invoke-custom */);
        String string = reader.readString();
        class_634 class_634VarMethod_1562 = zf.F(j2).method_1562();
        Intrinsics.checkNotNull(class_634VarMethod_1562);
        Stream stream = class_634VarMethod_1562.method_2880().stream();
        Function1 function1 = (v1) -> {
            return F(r1, v1);
        };
        class_640 class_640Var = (class_640) stream.filter((v1) -> {
            return k(r1, v1);
        }).findFirst().orElse(null);
        try {
            class_640 class_640Var2 = class_640Var;
            if (iArr == null) {
                if (class_640Var2 == null) {
                    Intrinsics.checkNotNull(string);
                    return string;
                }
                class_640Var2 = class_640Var;
            }
            String strName = class_640Var2.method_2966().name();
            Intrinsics.checkNotNullExpressionValue(strName, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25608, 8249202444469745706L ^ j) /* invoke-custom */);
            return strName;
        } catch (CommandSyntaxException unused) {
            throw (CommandSyntaxException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(CommandSyntaxException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_640Var, -4942411822820656537L, j) /* invoke-custom */;
        }
    }

    @NotNull
    public CompletableFuture listSuggestions(@NotNull CommandContext context, @NotNull SuggestionsBuilder builder) {
        long j = a ^ 103610618056571L;
        Intrinsics.checkNotNullParameter(context, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20720, 1921184251350193008L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(builder, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2457, 3889266326104951322L ^ j) /* invoke-custom */);
        class_634 class_634VarMethod_1562 = zf.F(j ^ 135168414808266L).method_1562();
        Intrinsics.checkNotNull(class_634VarMethod_1562);
        Stream stream = class_634VarMethod_1562.method_2880().stream();
        Function1 function1 = mp::Z;
        CompletableFuture completableFutureMethod_9264 = class_2172.method_9264(stream.map((v1) -> {
            return E(r1, v1);
        }), builder);
        Intrinsics.checkNotNullExpressionValue(completableFutureMethod_9264, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14510, 8440773665024015147L ^ j) /* invoke-custom */);
        return completableFutureMethod_9264;
    }

    @NotNull
    public List h(long j) {
        long j2 = a ^ j;
        class_634 class_634VarMethod_1562 = zf.F(j2 ^ 30747113000016L).method_1562();
        Intrinsics.checkNotNull(class_634VarMethod_1562);
        Stream stream = class_634VarMethod_1562.method_2880().stream();
        Function1 function1 = mp::T;
        List list = stream.map((v1) -> {
            return t(r1, v1);
        }).limit(e).toList();
        Intrinsics.checkNotNullExpressionValue(list, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3255, 4179077760010435503L ^ j2) /* invoke-custom */);
        return list;
    }

    private static final boolean F(String str, class_640 class_640Var) {
        return Intrinsics.areEqual(str, class_640Var.method_2966().name());
    }

    private static final boolean k(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private static final String Z(class_640 class_640Var) {
        return class_640Var.method_2966().name();
    }

    private static final String E(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    private static final String T(class_640 class_640Var) {
        return class_640Var.method_2966().name();
    }

    private static final String t(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    public Object parse(StringReader p0) {
        return c(p0, (a ^ 23098167704667L) ^ 118527389533822L);
    }

    public Collection getExamples() {
        return h((a ^ 65779976840107L) ^ 68121632207538L);
    }

    private static CommandSyntaxException a(CommandSyntaxException commandSyntaxException) {
        return commandSyntaxException;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 26115;
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
                throw new RuntimeException("su/catlean/mp", e2);
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
            java.lang.String r1 = "su/catlean/mp"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.mp.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
