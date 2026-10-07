package su.catlean;

import com.mojang.brigadier.Message;
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
import net.minecraft.class_2561;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/fk.class */
public final class fk implements ArgumentType {

    @NotNull
    public static final ou V = null;

    @NotNull
    private static final Collection P = null;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map d = null;

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x004c: INVOKE (r-1 I:su.catlean.iq), (r0 I:long), (r1 I:java.lang.String) VIRTUAL call: su.catlean.iq.R(long, java.lang.String):su.catlean._g
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @org.jetbrains.annotations.NotNull
    public su.catlean._g B(long r10, @org.jetbrains.annotations.NotNull com.mojang.brigadier.StringReader r12) throws com.mojang.brigadier.exceptions.CommandSyntaxException {
        /*
            r9 = this;
            long r0 = su.catlean.fk.a
            r1 = r10
            long r0 = r0 ^ r1
            r10 = r0
            r0 = r10
            r1 = r0; r1 = r0; 
            r2 = 5433593407441(0x4f11b67a7d1, double:2.684551836086E-311)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = 4500824969243728579(0x3e7624768ffb1ac3, double:8.248699500798586E-8)
            r1 = r10
            int[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[I}
            ).invoke(r0, r1)
            r1 = r12
            r2 = 28043(0x6d8b, float:3.9297E-41)
            r3 = 8219192432758669269(0x72106ff86f28bfd5, double:2.740117936336881E241)
            r4 = r10
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/fk;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "r"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r15 = r0
            r0 = r15
            if (r0 != 0) goto L6e
            su.catlean.iq r0 = su.catlean.iq.a     // Catch: com.mojang.brigadier.exceptions.CommandSyntaxException -> L56 com.mojang.brigadier.exceptions.CommandSyntaxException -> L64
            r1 = r12
            java.lang.String r1 = r1.readString()     // Catch: com.mojang.brigadier.exceptions.CommandSyntaxException -> L56 com.mojang.brigadier.exceptions.CommandSyntaxException -> L64
            r2 = r1
            r3 = 29750(0x7436, float:4.1689E-41)
            r4 = 8221713854029309545(0x7219653092532669, double:4.2334010711715026E241)
            r5 = r10
            long r4 = r4 ^ r5
            java.lang.String r3 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/fk;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "r"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r3, r4)     // Catch: com.mojang.brigadier.exceptions.CommandSyntaxException -> L56 com.mojang.brigadier.exceptions.CommandSyntaxException -> L64
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: com.mojang.brigadier.exceptions.CommandSyntaxException -> L56 com.mojang.brigadier.exceptions.CommandSyntaxException -> L64
            r2 = r13
            r3 = r2; r2 = r1; r1 = r3;      // Catch: com.mojang.brigadier.exceptions.CommandSyntaxException -> L56 com.mojang.brigadier.exceptions.CommandSyntaxException -> L64
            r-1.R(r0, r1)     // Catch: com.mojang.brigadier.exceptions.CommandSyntaxException -> L56 com.mojang.brigadier.exceptions.CommandSyntaxException -> L64
            r0 = r-1
            if (r0 != 0) goto L82
            goto L60
        L56:
            r1 = 4535168202860740104(0x3ef02773c0293e08, double:1.540575977748533E-5)
            r2 = r10
            com.mojang.brigadier.exceptions.CommandSyntaxException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lcom/mojang/brigadier/exceptions/CommandSyntaxException;}
            ).invoke(r0, r1, r2)     // Catch: com.mojang.brigadier.exceptions.CommandSyntaxException -> L64
            throw r0     // Catch: com.mojang.brigadier.exceptions.CommandSyntaxException -> L64
        L60:
            goto L6e
        L64:
            r1 = 4535168202860740104(0x3ef02773c0293e08, double:1.540575977748533E-5)
            r2 = r10
            com.mojang.brigadier.exceptions.CommandSyntaxException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lcom/mojang/brigadier/exceptions/CommandSyntaxException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6e:
            com.mojang.brigadier.exceptions.DynamicCommandExceptionType r0 = new com.mojang.brigadier.exceptions.DynamicCommandExceptionType
            r1 = r0
            su.catlean._g r2 = su.catlean.fk::s
            r1.<init>(r2)
            r1 = r12
            java.lang.String r1 = r1.readString()
            com.mojang.brigadier.exceptions.CommandSyntaxException r0 = r0.create(r1)
            throw r0
        L82:
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.fk.B(long, com.mojang.brigadier.StringReader):su.catlean._g");
    }

    @NotNull
    public CompletableFuture listSuggestions(@NotNull CommandContext context, @NotNull SuggestionsBuilder builder) {
        long j = a ^ 100209053376683L;
        Intrinsics.checkNotNullParameter(context, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16350, 7259945514693357417L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(builder, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31339, 2488889992513006298L ^ j) /* invoke-custom */);
        Stream stream = iq.a.L().stream();
        Function1 function1 = fk::p;
        CompletableFuture completableFutureMethod_9264 = class_2172.method_9264(stream.map((v1) -> {
            return n(r1, v1);
        }), builder);
        Intrinsics.checkNotNullExpressionValue(completableFutureMethod_9264, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32183, 7455768606363495681L ^ j) /* invoke-custom */);
        return completableFutureMethod_9264;
    }

    @NotNull
    public Collection getExamples() {
        return P;
    }

    private static final Message s(Object obj) {
        long j = a ^ 135140641234311L;
        long j2 = j ^ 18465753968277L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j2 << 32) >>> 48);
        int i3 = (int) ((j2 << 48) >>> 48);
        i4 i4Var = i4.h;
        String strR = (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10598, 2193393390448968953L ^ j) /* invoke-custom */;
        Intrinsics.checkNotNull(obj);
        return class_2561.method_43470(i4Var.E(i, strR, i2, new Object[]{obj}, i3));
    }

    private static final String p(_g _gVar) {
        return _gVar.U();
    }

    private static final String n(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    private static final String k(_g _gVar) {
        return _gVar.U();
    }

    private static final String d(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    public Object parse(StringReader p0) {
        return B((a ^ 101052041986731L) ^ 126887908359503L, p0);
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 28090;
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
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/fk", e);
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
            r1 = 2
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
            java.lang.String r1 = "su/catlean/fk"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.fk.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
