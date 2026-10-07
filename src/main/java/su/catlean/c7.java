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
import net.minecraft.class_1657;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/c7.class */
public final class c7 implements ym {

    @NotNull
    public static final c7 b;
    private static boolean M;
    private static final long a = yz.a(6441365239734619426L, -2548520157343966958L, MethodHandles.lookup().lookupClass()).a(27629258573058L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    private c7() {
    }

    public final boolean Y(long a2, @NotNull String name) {
        long j = a ^ a2;
        long j2 = j ^ 71238238757772L;
        Intrinsics.checkNotNullParameter(name, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8902, 8933048608194119181L ^ j) /* invoke-custom */);
        return yl.g.g().P(j2).contains(name);
    }

    public final boolean Q(@NotNull class_1657 player, long a2) {
        long j = a ^ a2;
        long j2 = j ^ 13706023131856L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j2 << 16) >>> 32);
        int i3 = (int) ((j2 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(player, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3211, 2000729433070491173L ^ j) /* invoke-custom */);
        String strName = player.method_7334().name();
        Intrinsics.checkNotNullExpressionValue(strName, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22364, 3883689854696525299L ^ j) /* invoke-custom */);
        return h((char) i, i2, (short) i3, strName);
    }

    public final boolean h(char a2, int a3, short a4, @NotNull String name) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ a;
        long j2 = j ^ 18827239259379L;
        Intrinsics.checkNotNullParameter(name, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26604, 9169933196658646107L ^ j) /* invoke-custom */);
        return yl.g.g().P(j2).add(name);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x003d: INVOKE (r-1 I:su.catlean.c7), (r0 I:long), (r1 I:java.lang.String) VIRTUAL call: su.catlean.c7.j(long, java.lang.String):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final boolean u(long r10, @org.jetbrains.annotations.NotNull net.minecraft.class_1657 r12) {
        /*
            r9 = this;
            long r0 = su.catlean.c7.a
            r1 = r10
            long r0 = r0 ^ r1
            r10 = r0
            r0 = r10
            r1 = r0; r1 = r0; 
            r2 = 11226144653212(0xa35ca5d3f9c, double:5.5464524083964E-311)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = r12
            r1 = 28047(0x6d8f, float:3.9302E-41)
            r2 = 755588162498614627(0xa7c636e36385563, double:3.692705317247293E-258)
            r3 = r10
            long r2 = r2 ^ r3
            java.lang.String r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/c7;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "q"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r9
            r1 = r12
            com.mojang.authlib.GameProfile r1 = r1.method_7334()
            java.lang.String r1 = r1.name()
            r2 = r1
            r3 = 24622(0x602e, float:3.4503E-41)
            r4 = 1806330715274467521(0x1911603716cfd8c1, double:6.239769372069477E-188)
            r5 = r10
            long r4 = r4 ^ r5
            java.lang.String r3 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/c7;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "q"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r3, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r2 = r13
            r3 = r2; r2 = r1; r1 = r3; 
            r-1.j(r0, r1)
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.c7.u(long, net.minecraft.class_1657):boolean");
    }

    public final boolean j(long a2, @NotNull String name) {
        long j = a ^ a2;
        long j2 = j ^ 7963875474427L;
        Intrinsics.checkNotNullParameter(name, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26604, 9169948458104724307L ^ j) /* invoke-custom */);
        return yl.g.g().P(j2).remove(name);
    }

    public final void K(long j) {
        yl.g.g().P((a ^ j) ^ 75690207907022L).clear();
    }

    static {
        int i;
        long j = a ^ 139875772915231L;
        e = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, 2676611456589916195L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[6];
        int i3 = 0;
        String str = "Cc¾\u008e\nðs¬$hÜ\u00827¾Ô\u0086Ã±ä¶¥»Òe\u0010»\u0012'#Ô\u000e\u0084\u009a\u0083\n@ØÉa\u0090·\u0010öï\u0015$Ê#ê\u0083ñáoÐ\u000fõ¬ÿ\u0010>~·\t\u009c\u0089Ù\u0005c\u0090:\u001d&\u0082¤E";
        int length = "Cc¾\u008e\nðs¬$hÜ\u00827¾Ô\u0086Ã±ä¶¥»Òe\u0010»\u0012'#Ô\u000e\u0084\u009a\u0083\n@ØÉa\u0090·\u0010öï\u0015$Ê#ê\u0083ñáoÐ\u000fõ¬ÿ\u0010>~·\t\u009c\u0089Ù\u0005c\u0090:\u001d&\u0082¤E".length();
        char cCharAt = 24;
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
                            c = strArr;
                            d = new String[6];
                            b = new c7();
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i8 = i3;
                        i3++;
                        strArr[i8] = strIntern;
                        int i9 = i5 + cCharAt;
                        i4 = i9;
                        if (i9 < length) {
                        }
                        str = "\u0080=w¬Z¤ë\u0081\u0011e@Iäé\u009aL\u0083R=\u00822f&\u0083\u0010\u007fGºu\u001ceÉj\u0014&ÜëÝ©òh";
                        length = "\u0080=w¬Z¤ë\u0081\u0011e@Iäé\u009aL\u0083R=\u00822f&\u0083\u0010\u007fGºu\u001ceÉj\u0014&ÜëÝ©òh".length();
                        cCharAt = 24;
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

    public static void r(boolean z) {
        M = z;
    }

    public static boolean e() {
        return M;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean Z() {
        return !e();
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 27917;
        if (d[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i2] = a(((Cipher) objArr[0]).doFinal(c[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/c7", e2);
            }
        }
        return d[i2];
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
            java.lang.String r1 = "su/catlean/c7"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.c7.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
