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
import net.minecraft.class_2596;
import net.minecraft.class_634;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_r.class */
public final class _r {
    private static int R;
    private static final long a = yz.a(3968893076603198003L, -6139546723945905808L, MethodHandles.lookup().lookupClass()).a(280235471804239L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public static final void a(long a2, @NotNull class_2596 packet) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(packet, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26123, 7534980123858906630L ^ j) /* invoke-custom */);
        zf.k(j ^ 13169632580300L).method_52787(packet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    public static final void M(char a2, @NotNull class_2596[] packet, char a3, int a4) throws Throwable {
        long j = (((((long) a2) << 48) | ((((long) a3) << 48) >>> 16)) | ((((long) a4) << 32) >>> 32)) ^ a;
        long j2 = j ^ 85542662619481L;
        int i = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1508911718877913000L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(packet, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16863, 2607290031045728833L ^ j) /* invoke-custom */);
        int i2 = 0;
        int length = packet.length;
        loop0: while (i2 < length) {
            class_2596 class_2596Var = packet[i2];
            class_634 class_634VarK = null;
            try {
                class_634VarK = zf.k(j2);
                class_634VarK.method_52787(class_2596Var);
                i2++;
                while (a2 >= 0 && i == 0) {
                    if (i != 0) {
                        if (a3 > 0) {
                            break loop0;
                        }
                    }
                }
                break loop0;
            } catch (NumberFormatException unused) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_634VarK, 1479537097887458393L, j) /* invoke-custom */;
            }
        }
        Object obj = a2;
        if (obj >= 0) {
            try {
                if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1496221886930618962L, j) /* invoke-custom */ == null) {
                    return;
                }
                obj = i + 1;
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1543598150584641248L, j) /* invoke-custom */;
            } catch (NumberFormatException unused2) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1479537097887458393L, j) /* invoke-custom */;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x006e: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public static final void R(long r8, @org.jetbrains.annotations.NotNull net.minecraft.class_7204 r10) {
        /*
            long r0 = su.catlean._r.a
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 29405395821529(0x1abe7a2c23d9, double:1.4528195877781E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 27469437118779(0x18fbba0aa93b, double:1.3571705190985E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -3473739818357143243(0xcfcacc0a34b14935, double:-2.4241282604861605E76)
            r1 = r8
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r1 = r10
            r2 = 29116(0x71bc, float:4.08E-41)
            r3 = 411937797862568357(0x5b77f3e9f27b1a5, double:4.045175667955947E-281)
            r4 = r8
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/_r;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "h"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r15 = r0
            r0 = r11
            net.minecraft.class_638 r0 = su.catlean.zf.z(r0)
            net.minecraft.class_7202 r0 = r0.method_41925()
            net.minecraft.class_7202 r0 = r0.method_41937()
            java.lang.AutoCloseable r0 = (java.lang.AutoCloseable) r0
            r16 = r0
            r0 = 0
            r17 = r0
            r0 = r16
            net.minecraft.class_7202 r0 = (net.minecraft.class_7202) r0     // Catch: java.lang.Throwable -> L81 java.lang.Throwable -> L8a
            r18 = r0
            r0 = 0
            r19 = r0
            r0 = r10
            r1 = r18
            int r1 = r1.method_41942()     // Catch: java.lang.Throwable -> L81 java.lang.Throwable -> L8a
            net.minecraft.class_2596 r0 = r0.predict(r1)     // Catch: java.lang.Throwable -> L81 java.lang.Throwable -> L8a
            r1 = r0
            r2 = 23533(0x5bed, float:3.2977E-41)
            r3 = 5688665273136782325(0x4ef232ed136b1bf5, double:2.009670377231642E72)
            r4 = r8
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/_r;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "h"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)     // Catch: java.lang.Throwable -> L81 java.lang.Throwable -> L8a
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.Throwable -> L81 java.lang.Throwable -> L8a
            r1 = r13
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.Throwable -> L81 java.lang.Throwable -> L8a
            a(r-1, r0)     // Catch: java.lang.Throwable -> L81 java.lang.Throwable -> L8a
            kotlin.Unit r-1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L81 java.lang.Throwable -> L8a
            r18 = r-1
            r-1 = r16
            r0 = r17
            kotlin.jdk7.AutoCloseableKt.closeFinally(r-1, r0)
            goto L96
        L81:
            r19 = move-exception
            r0 = r19
            r17 = r0
            r0 = r19
            throw r0     // Catch: java.lang.Throwable -> L8a
        L8a:
            r19 = move-exception
            r0 = r16
            r1 = r17
            kotlin.jdk7.AutoCloseableKt.closeFinally(r0, r1)
            r0 = r19
            throw r0
        L96:
            r-1 = r15
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto La2
            if (r-1 != 0) goto Lbb
            r-1 = 1
        La2:
            su.catlean._g[] r-1 = new su.catlean._g[r-1]     // Catch: java.lang.Throwable -> Lb1
            r0 = -3515459881481878261(0xcf3693dd0e22c50b, double:-3.9891151774991616E73)
            r1 = r8
            call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)V}
            ).invoke(r-1, r0, r1)     // Catch: java.lang.Throwable -> Lb1
            goto Lbb
        Lb1:
            r1 = -3527638330987577382(0xcf0b4fa0d16effda, double:-6.031805544726381E72)
            r2 = r8
            java.lang.Throwable r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Throwable;}
            ).invoke(r0, r1, r2)
            throw r0
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._r.R(long, net.minecraft.class_7204):void");
    }

    public static final void J(@NotNull String command, long a2) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(command, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1993, 9212140276470639684L ^ j) /* invoke-custom */);
        zf.k(j ^ 116249805041997L).method_45730(command);
    }

    public static void X(int i) {
        R = i;
    }

    public static int Y() {
        return R;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int w() {
        return Y() == 0 ? 122 : 0;
    }

    static {
        int i;
        long j = a ^ 100485939174887L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(0, -4885325726180601928L, j) /* invoke-custom */;
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
        String str = "'Ô\u008dW¯\u0091%Õ>Îí;wÎ|\u008a\u0002¦6Ý\u008e\u00941 ;[°à¶j\"Þ\u0018¦çòñ\u0087ÿ-,\u0095\u001f®õ\u001fÈ\u0085ê²öø\u0004¶\u0011\u007f\u0014\u0010òx\u000böõÇç\u0019wR¶ífýÙZ";
        int length = "'Ô\u008dW¯\u0091%Õ>Îí;wÎ|\u008a\u0002¦6Ý\u008e\u00941 ;[°à¶j\"Þ\u0018¦çòñ\u0087ÿ-,\u0095\u001f®õ\u001fÈ\u0085ê²öø\u0004¶\u0011\u007f\u0014\u0010òx\u000böõÇç\u0019wR¶ífýÙZ".length();
        char cCharAt = ' ';
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 >= length) {
                            b = strArr;
                            c = new String[5];
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
                        str = "¢Ì\u009c\u001ehÌ-\u0087\u0085ÇSÛ\u0080jþ\u0092\u0010 \u0099\u000b\u0006ÛªvSnt¾\u0014pK\u0087:";
                        length = "¢Ì\u009c\u001ehÌ-\u0087\u0085ÇSÛ\u0080jþ\u0092\u0010 \u0099\u000b\u0006ÛªvSnt¾\u0014pK\u0087:".length();
                        cCharAt = 16;
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

    private static Throwable a(Throwable th) {
        return th;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 3592;
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
                throw new RuntimeException("su/catlean/_r", e);
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
            java.lang.String r1 = "su/catlean/_r"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._r.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
