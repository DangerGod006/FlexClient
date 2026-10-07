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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ag.class */
public final class ag {
    private static String h;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map d = null;
    private static final long e = 0;

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00ac: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public static final void r(int r8, int r9, @org.jetbrains.annotations.NotNull net.minecraft.class_1713 r10, boolean r11, long r12) {
        /*
            long r0 = su.catlean.ag.a
            r1 = r12
            long r0 = r0 ^ r1
            r12 = r0
            r0 = r12
            r1 = r0; r1 = r0; 
            r2 = 20037258255898(0x123949a91e1a, double:9.899720941088E-311)
            long r1 = r1 ^ r2
            r14 = r1
            r1 = r0; r2 = r0; 
            r2 = 55860580885625(0x32ce0e14a479, double:2.75987939723235E-310)
            long r1 = r1 ^ r2
            r16 = r1
            r1 = r0; r2 = r0; 
            r2 = 55648819548220(0x329cc01f103c, double:2.74941699703943E-310)
            long r1 = r1 ^ r2
            r18 = r1
            r0 = -4453636147929904791(0xc231818513cc8969, double:-7.518742625253676E10)
            r1 = r12
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r1 = r10
            r2 = 17972(0x4634, float:2.5184E-41)
            r3 = 1051834205897321576(0xe98dda32d1d6c68, double:2.3866315344791562E-238)
            r4 = r12
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ag;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "l"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r20 = r0
            r0 = r20
            if (r0 != 0) goto L84
            r0 = r14
            net.minecraft.class_310 r0 = su.catlean.zf.F(r0)     // Catch: java.lang.NumberFormatException -> L52 java.lang.NumberFormatException -> L79
            net.minecraft.class_636 r0 = r0.field_1761     // Catch: java.lang.NumberFormatException -> L52 java.lang.NumberFormatException -> L79
            r1 = r0
            if (r1 == 0) goto L87
            goto L5d
        L52:
            r1 = -4427200012217321952(0xc28f6d0b922e7620, double:-4.3191507532307656E12)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L79
            throw r0     // Catch: java.lang.NumberFormatException -> L79
        L5d:
            r1 = r18
            net.minecraft.class_746 r1 = su.catlean.zf.v(r1)     // Catch: java.lang.NumberFormatException -> L79
            net.minecraft.class_1703 r1 = r1.field_7512     // Catch: java.lang.NumberFormatException -> L79
            int r1 = r1.field_7763     // Catch: java.lang.NumberFormatException -> L79
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r18
            net.minecraft.class_746 r5 = su.catlean.zf.v(r5)     // Catch: java.lang.NumberFormatException -> L79
            net.minecraft.class_1657 r5 = (net.minecraft.class_1657) r5     // Catch: java.lang.NumberFormatException -> L79
            r0.method_2906(r1, r2, r3, r4, r5)     // Catch: java.lang.NumberFormatException -> L79
            goto L84
        L79:
            r1 = -4427200012217321952(0xc28f6d0b922e7620, double:-4.3191507532307656E12)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L84:
            goto L88
        L87:
        L88:
            r0 = r12
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Laf
            r0 = r11
            if (r0 == 0) goto Lbd
            net.minecraft.class_2815 r0 = new net.minecraft.class_2815     // Catch: java.lang.NumberFormatException -> Lb2
            r1 = r0
            r2 = r18
            net.minecraft.class_746 r2 = su.catlean.zf.v(r2)     // Catch: java.lang.NumberFormatException -> Lb2
            net.minecraft.class_1703 r2 = r2.field_7512     // Catch: java.lang.NumberFormatException -> Lb2
            int r2 = r2.field_7763     // Catch: java.lang.NumberFormatException -> Lb2
            r1.<init>(r2)     // Catch: java.lang.NumberFormatException -> Lb2
            net.minecraft.class_2596 r0 = (net.minecraft.class_2596) r0     // Catch: java.lang.NumberFormatException -> Lb2
            r1 = r16
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.NumberFormatException -> Lb2
            su.catlean._r.a(r-1, r0)     // Catch: java.lang.NumberFormatException -> Lb2
        Laf:
            goto Lbd
        Lb2:
            r1 = -4427200012217321952(0xc28f6d0b922e7620, double:-4.3191507532307656E12)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ag.r(int, int, net.minecraft.class_1713, boolean, long):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:16:0x004a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static /* synthetic */ void e(int r7, long r8, int r10, net.minecraft.class_1713 r11, boolean r12, int r13, java.lang.Object r14) {
        /*
            long r0 = su.catlean.ag.a
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 107573549780878(0x61d66b38cf8e, double:5.3148395347925E-310)
            long r1 = r1 ^ r2
            r15 = r1
            r0 = 7387021495139295356(0x6683f8e965f3e07c, double:6.78915416030149E185)
            r1 = r8
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r17 = r0
            r0 = r13
            r1 = 2
            r0 = r0 & r1
            r1 = r17
            if (r1 == 0) goto L39
            if (r0 == 0) goto L35
            goto L33
        L29:
            r1 = 7387156683823436331(0x668473dd7772d22b, double:6.952417204848404E185)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L33:
            r0 = 0
            r10 = r0
        L35:
            r0 = r13
            r1 = 4
            r0 = r0 & r1
        L39:
            r1 = r17
            r2 = r8
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L62
            if (r1 == 0) goto L60
            if (r0 == 0) goto L59
            goto L54
        L4a:
            r1 = 7387156683823436331(0x668473dd7772d22b, double:6.952417204848404E185)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L54:
            net.minecraft.class_1713 r0 = net.minecraft.class_1713.field_7790
            r11 = r0
        L59:
            r0 = r13
            long r1 = su.catlean.ag.e
            int r1 = (int) r1
            r0 = r0 & r1
        L60:
            r1 = r17
        L62:
            r2 = r8
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L80
            if (r1 == 0) goto L7f
            if (r0 == 0) goto L7e
            goto L7b
        L71:
            r1 = 7387156683823436331(0x668473dd7772d22b, double:6.952417204848404E185)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L7b:
            r0 = 0
            r12 = r0
        L7e:
            r0 = r7
        L7f:
            r1 = r10
        L80:
            r2 = r11
            r3 = r12
            r4 = r15
            r(r0, r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ag.e(int, long, int, net.minecraft.class_1713, boolean, int, java.lang.Object):void");
    }

    @NotNull
    public static final class_1269 x(@NotNull class_1268 hand, float y, long a2, float p) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(hand, (String) a(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15643, 1756834930680020021L ^ j) /* invoke-custom */);
        class_1269 class_1269VarMethod_2919 = zf.Z((int) (j >>> 32), ((j ^ 123990516976194L) << 32) >>> 32).method_2919(zf.v(j ^ 120231636745037L), hand);
        Intrinsics.checkNotNullExpressionValue(class_1269VarMethod_2919, (String) a(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7860, 2307691643251433368L ^ j) /* invoke-custom */);
        return class_1269VarMethod_2919;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static /* synthetic */ class_1269 K(class_1268 class_1268Var, float f, long j, float f2, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 111312524667847L;
        ?? r0 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1604508768705024188L, j2) /* invoke-custom */;
        try {
            r0 = i & 2;
            ?? r02 = r0;
            if (r0 != 0) {
                if (r0 != 0) {
                    f = -1337.0f;
                }
                r02 = i & 4;
            }
            if (r02 != 0) {
                f2 = -1337.0f;
            }
            return x(class_1268Var, f, j3, f2);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -1604362344436638445L, j2) /* invoke-custom */;
        }
    }

    public static void i(String str) {
        h = str;
    }

    public static String x() {
        return h;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 26894;
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
                throw new RuntimeException("su/catlean/ag", e2);
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
            r1 = 1
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
            java.lang.String r1 = "su/catlean/ag"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ag.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
