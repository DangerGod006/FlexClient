package su.catlean;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
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
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ai.class */
public final class ai extends a3 {

    @NotNull
    public static final ai W;
    private static final long b = yz.a(-2463097534484928126L, -764143306516214348L, MethodHandles.lookup().lookupClass()).a(53855180085146L);
    private static final String[] g;
    private static final String[] h;
    private static final Map i;

    /* JADX WARN: Illegal instructions before constructor call */
    private ai(long j) {
        long j2 = b ^ j;
        super(j2 ^ 100938899573221L, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13589, 614908245055901819L ^ j2) /* invoke-custom */);
    }

    @Override // su.catlean.a3
    public void l(@NotNull LiteralArgumentBuilder builder, long a) {
        long j = a ^ 61473902788714L;
        Intrinsics.checkNotNullParameter(builder, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(785, 8330185425017860176L ^ a) /* invoke-custom */);
        String strD = (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29590, 2231688508753838293L ^ a) /* invoke-custom */;
        StringArgumentType stringArgumentTypeString = StringArgumentType.string();
        Intrinsics.checkNotNullExpressionValue(stringArgumentTypeString, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(941, 665617550002581739L ^ a) /* invoke-custom */);
        RequiredArgumentBuilder requiredArgumentBuilderJ = j(strD, (ArgumentType) stringArgumentTypeString, j);
        String strD2 = (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25162, 624910127891616008L ^ a) /* invoke-custom */;
        StringArgumentType stringArgumentTypeString2 = StringArgumentType.string();
        Intrinsics.checkNotNullExpressionValue(stringArgumentTypeString2, (String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11965, 3352702118571007482L ^ a) /* invoke-custom */);
        builder.then(requiredArgumentBuilderJ.then(j(strD2, (ArgumentType) stringArgumentTypeString2, j).executes(ai::l))).executes(ai::j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Type inference failed for: r0v10, types: [float] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final float a(java.lang.String r6, float r7, long r8) {
        /*
            long r0 = su.catlean.ai.b
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            r0 = -5015834358632833327(0xba642d39d17d9ed1, double:-2.037322370965043E-27)
            r1 = r8
            int[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[I}
            ).invoke(r0, r1)
            r10 = r0
            r0 = r6
            r1 = r10
            if (r1 != 0) goto L6e
            java.lang.String r1 = "~"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r1, r2, r3, r4)     // Catch: java.lang.NumberFormatException -> L25 java.lang.NumberFormatException -> L48
            if (r0 == 0) goto L6d
            goto L2f
        L25:
            r1 = -5004014643552690374(0xba8e2b31b0305f3a, double:-1.2185051769453785E-26)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L48
            throw r0     // Catch: java.lang.NumberFormatException -> L48
        L2f:
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L63
            r0 = r6
            java.lang.String r1 = "~"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.NumberFormatException -> L48 java.lang.NumberFormatException -> L58
            java.lang.String r0 = kotlin.text.StringsKt.removePrefix(r0, r1)     // Catch: java.lang.NumberFormatException -> L48 java.lang.NumberFormatException -> L58
            java.lang.Float r0 = kotlin.text.StringsKt.toFloatOrNull(r0)     // Catch: java.lang.NumberFormatException -> L48 java.lang.NumberFormatException -> L58
            r1 = r0
            if (r1 == 0) goto L62
            goto L52
        L48:
            r1 = -5004014643552690374(0xba8e2b31b0305f3a, double:-1.2185051769453785E-26)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L58
            throw r0     // Catch: java.lang.NumberFormatException -> L58
        L52:
            float r0 = r0.floatValue()     // Catch: java.lang.NumberFormatException -> L58
            goto L64
        L58:
            r1 = -5004014643552690374(0xba8e2b31b0305f3a, double:-1.2185051769453785E-26)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L62:
        L63:
            r0 = 0
        L64:
            r11 = r0
            r0 = r7
            r1 = r11
            float r0 = r0 + r1
            goto L87
        L6d:
            r0 = r6
        L6e:
            java.lang.Float r0 = kotlin.text.StringsKt.toFloatOrNull(r0)     // Catch: java.lang.NumberFormatException -> L7b
            r1 = r0
            if (r1 == 0) goto L85
            float r0 = r0.floatValue()     // Catch: java.lang.NumberFormatException -> L7b
            goto L87
        L7b:
            r1 = -5004014643552690374(0xba8e2b31b0305f3a, double:-1.2185051769453785E-26)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L85:
            r0 = r7
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ai.a(java.lang.String, float, long):float");
    }

    private static final int l(CommandContext commandContext) {
        long j = b ^ 32193420269954L;
        long j2 = j ^ 66553274081908L;
        long j3 = j ^ 80114111405732L;
        String str = (String) commandContext.getArgument((String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10251, 7427416373014403953L ^ j) /* invoke-custom */, String.class);
        String str2 = (String) commandContext.getArgument((String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13652, 5300456957859530287L ^ j) /* invoke-custom */, String.class);
        class_746 class_746VarV = zf.v(j3);
        Intrinsics.checkNotNull(str);
        class_746VarV.method_36456(a(str, zf.v(j3).method_36454(), j2));
        class_746 class_746VarV2 = zf.v(j3);
        Intrinsics.checkNotNull(str2);
        class_746VarV2.method_36457(a(str2, zf.v(j3).method_36455(), j2));
        return 1;
    }

    private static final int j(CommandContext commandContext) {
        long j = b ^ 62110768415393L;
        W.a((String) b(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17765, 2838198213028523319L ^ j) /* invoke-custom */, j ^ 36385529696515L);
        return 1;
    }

    static {
        int i2;
        long j = (b ^ 132266376448068L) ^ 26065744090014L;
        i = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (r0 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((r0 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[9];
        int i4 = 0;
        String str = "%RÑ~uî^\u009f£~§z8\u0007å\u0093\u0094ÛWûH\u008bm_\u0018\u0089\u0081èï\u0013êÛÅO\u0099ö\u0098R\u0087\u0003\u0014Vß\u0014ÈI\u0082\u001fl\u0010&x\fX·\u0087_\u0012ÏÓ\u001ft\u009fs\u0015n\u0010·\u009dê¨ n\u0090\u0007DåK1\u0097\u009bc\u008c\u0010\u0001\bú¿£¬ë@ì¥ðÛ.h\\\u009f\u0010\u0005à\bIÁ\u001aÑüi=Àý®\u0006¯À\u0010@'\u0083:!\u0096ËØ³\u009f7\u0016´Ð^Ò";
        int length = "%RÑ~uî^\u009f£~§z8\u0007å\u0093\u0094ÛWûH\u008bm_\u0018\u0089\u0081èï\u0013êÛÅO\u0099ö\u0098R\u0087\u0003\u0014Vß\u0014ÈI\u0082\u001fl\u0010&x\fX·\u0087_\u0012ÏÓ\u001ft\u009fs\u0015n\u0010·\u009dê¨ n\u0090\u0007DåK1\u0097\u009bc\u008c\u0010\u0001\bú¿£¬ë@ì¥ðÛ.h\\\u009f\u0010\u0005à\bIÁ\u001aÑüi=Àý®\u0006¯À\u0010@'\u0083:!\u0096ËØ³\u009f7\u0016´Ð^Ò".length();
        char cCharAt = 24;
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i7 = i4;
                        i4++;
                        strArr[i7] = strIntern;
                        int i8 = i6 + cCharAt;
                        i2 = i8;
                        if (i8 >= length) {
                            g = strArr;
                            h = new String[9];
                            W = new ai(j);
                            return;
                        }
                        cCharAt = str.charAt(i2);
                        break;
                        break;
                    default:
                        int i9 = i4;
                        i4++;
                        strArr[i9] = strIntern;
                        int i10 = i6 + cCharAt;
                        i5 = i10;
                        if (i10 < length) {
                        }
                        str = "\f5´\u009däV¢\u0007h\u0016°\u0004´\u0000EÖ0Äá0\u0003\u0015ï\"CNè_Ø*\u0096eé£Ü.ü\u0085\u0010~æñL\u0099¤`K\u0085\u0004é\r\u0018\u009aÂòw^BÎf\u000bÞ\u009bn©";
                        length = "\f5´\u009däV¢\u0007h\u0016°\u0004´\u0000EÖ0Äá0\u0003\u0015ï\"CNè_Ø*\u0096eé£Ü.ü\u0085\u0010~æñL\u0099¤`K\u0085\u0004é\r\u0018\u009aÂòw^BÎf\u000bÞ\u009bn©".length();
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
                char c = (char) (((char) (((char) (i4 & 15)) << '\f')) | (((char) (bArr[i7] & 63)) << 6));
                i3 = i7 + 1;
                int i8 = i2;
                i2++;
                cArr[i8] = (char) (c | ((char) (bArr[i3] & 63)));
            }
            i3++;
        }
        return new String(cArr, 0, i2);
    }

    private static String b(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 16050;
        if (h[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) i.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                h[i3] = b(((Cipher) objArr[0]).doFinal(g[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/ai", e);
            }
        }
        return h[i3];
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
            java.lang.String r1 = "su/catlean/ai"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ai.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
