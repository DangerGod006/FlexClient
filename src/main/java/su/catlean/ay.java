package su.catlean;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
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
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ay.class */
public final class ay extends a3 {

    @NotNull
    public static final ay T;
    private static final long b = yz.a(-1270856413440841061L, -3374900414026391986L, MethodHandles.lookup().lookupClass()).a(14006675627272L);
    private static final String[] g;
    private static final String[] h;
    private static final Map i;

    /* JADX WARN: Illegal instructions before constructor call */
    private ay(long j) {
        long j2 = b ^ j;
        super(j2 ^ 131236193479240L, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13656, 4179453710309213405L ^ j2) /* invoke-custom */);
    }

    @Override // su.catlean.a3
    public void l(@NotNull LiteralArgumentBuilder builder, long a) {
        long j = a ^ 61473902788714L;
        Intrinsics.checkNotNullParameter(builder, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28903, 2240316839564784870L ^ a) /* invoke-custom */);
        builder.then(c(a ^ 131983109906692L, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4075, 6283679169002753003L ^ a) /* invoke-custom */).executes(ay::x));
        IntegerArgumentType integerArgumentTypeInteger = IntegerArgumentType.integer();
        Intrinsics.checkNotNullExpressionValue(integerArgumentTypeInteger, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15036, 7543299571016957624L ^ a) /* invoke-custom */);
        RequiredArgumentBuilder requiredArgumentBuilderJ = j("x", (ArgumentType) integerArgumentTypeInteger, j);
        IntegerArgumentType integerArgumentTypeInteger2 = IntegerArgumentType.integer();
        Intrinsics.checkNotNullExpressionValue(integerArgumentTypeInteger2, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20384, 6845230938382306213L ^ a) /* invoke-custom */);
        builder.then(requiredArgumentBuilderJ.then(j("z", (ArgumentType) integerArgumentTypeInteger2, j).executes(ay::u)));
        builder.executes(ay::M);
    }

    private static final int x(CommandContext commandContext) {
        pf.E.W(null);
        return 1;
    }

    private static final int u(CommandContext commandContext) {
        Integer num = (Integer) commandContext.getArgument("x", Integer.TYPE);
        Integer num2 = (Integer) commandContext.getArgument("z", Integer.TYPE);
        pf pfVar = pf.E;
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        Intrinsics.checkNotNull(num2);
        pfVar.W(new class_2338(iIntValue, 0, num2.intValue()));
        return 1;
    }

    private static final int M(CommandContext commandContext) {
        long j = b ^ 132182692321993L;
        T.a((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15111, 44337535345684763L ^ j) /* invoke-custom */, j ^ 29053385802756L);
        return 1;
    }

    static {
        int i2;
        long j = (b ^ 124824873267617L) ^ 55998433921494L;
        i = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (r0 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((r0 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[6];
        int i4 = 0;
        String str = "(û¸$Ü\u0091ÔkÌ*ÛD¿¡\u0094ïsë<2\u0018é\u008b8 { \u0002UÚu\u0084I\u0081\u008c@\u0096½\u001aß@koÊÅ\u000eõõ7$\"FãQ~m[\u0010âT\u0085\u00adÆ\u0084+\u0001Ð\u0080N\u001dÅT{9 õ)\u009fª\u000b\u009f\u008b\u000eÂ9º\u0081\u0011Õ\u009e\u0098\u009b\u0012Ä}.Ý`«Ì¢*¹\u0011Â|p";
        int length = "(û¸$Ü\u0091ÔkÌ*ÛD¿¡\u0094ïsë<2\u0018é\u008b8 { \u0002UÚu\u0084I\u0081\u008c@\u0096½\u001aß@koÊÅ\u000eõõ7$\"FãQ~m[\u0010âT\u0085\u00adÆ\u0084+\u0001Ð\u0080N\u001dÅT{9 õ)\u009fª\u000b\u009f\u008b\u000eÂ9º\u0081\u0011Õ\u009e\u0098\u009b\u0012Ä}.Ý`«Ì¢*¹\u0011Â|p".length();
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
                            h = new String[6];
                            T = new ay(j);
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
                        str = "\u0005¤\u000bSCgÿÍ\u0019\u0087£\f\u0086bgu\u0010\u0003TIÐ\u0012\u007fPªN\u008a2\u009c[Ì<h";
                        length = "\u0005¤\u000bSCgÿÍ\u0019\u0087£\f\u0086bgu\u0010\u0003TIÐ\u0012\u007fPªN\u008a2\u009c[Ì<h".length();
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 2544;
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
                throw new RuntimeException("su/catlean/ay", e);
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
            java.lang.String r1 = "su/catlean/ay"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ay.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
