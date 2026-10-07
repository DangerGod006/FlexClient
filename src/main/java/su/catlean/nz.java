package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/nz.class */
public final class nz {

    @NotNull
    public static final nz B;

    @NotNull
    private static final Map g;
    private static final String[] b;
    private static final String[] c;
    private static final long a = yz.a(-6607130875288731993L, -4856352360410586874L, MethodHandles.lookup().lookupClass()).a(157949681415734L);
    private static final Map d = new HashMap(13);

    private nz() {
    }

    @NotNull
    public final Map B() {
        return g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e0, code lost:
    
        if (r0 == 0) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106 A[EDGE_INSN: B:47:0x0106->B:37:0x0106 BREAK  A[LOOP:0: B:3:0x0041->B:50:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[LOOP:0: B:3:0x0041->B:50:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v32, types: [int, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(@org.jetbrains.annotations.NotNull net.minecraft.class_4587 r9, long r10) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nz.k(net.minecraft.class_4587, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    public final void p(@NotNull class_2338 pos, char a2, short a3, @NotNull Color lineColor, @NotNull Color fillColor, @NotNull og animationMode, @NotNull lr renderMode, int a4) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 48) >>> 16)) | ((((long) a4) << 32) >>> 32)) ^ a;
        long j2 = j ^ 20507458525471L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j2 << 32) >>> 48);
        int i3 = (int) ((j2 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(pos, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23910, 3381215174393594814L ^ j) /* invoke-custom */);
        Object obj = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-235881279989216244L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(lineColor, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2232, 1221319839452812902L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(fillColor, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24935, 6591705259045437374L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(animationMode, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15804, 7951496871287513958L ^ j) /* invoke-custom */);
        try {
            try {
                Intrinsics.checkNotNullParameter(renderMode, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16471, 3271966269775847051L ^ j) /* invoke-custom */);
                obj = renderMode;
                if (obj != 0) {
                    if (obj == lr.NONE) {
                        return;
                    }
                    g.put(new pe(pos, lineColor, fillColor, animationMode, i, renderMode, (char) i2, (short) i3), Long.valueOf(zf.A()));
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -233467849710207289L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -233467849710207289L, j) /* invoke-custom */;
        }
    }

    public final boolean c(@NotNull class_2338 pos, long a2) {
        Intrinsics.checkNotNullParameter(pos, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15235, 8717435955663267052L ^ (a ^ a2)) /* invoke-custom */);
        Stream stream = g.keySet().stream();
        Function1 function1 = (v1) -> {
            return p(r1, v1);
        };
        return stream.anyMatch((v1) -> {
            return K(r1, v1);
        });
    }

    private static final boolean p(class_2338 class_2338Var, pe peVar) {
        return Intrinsics.areEqual(peVar.i(), class_2338Var);
    }

    private static final boolean K(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    static {
        int i;
        long j = a ^ 72630649767131L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[7];
        int i3 = 0;
        String str = "´Ã\u0003\u0095áº\u001d´RûsÕt\u0088«\u0094\u009cj\u0004#}kÚ[áÖM8/ÞË\u001b \u0093dvM:\u009e\u0095nKA°Ôf \u0019ÞÖ4cß\n\u001cÖkÁ[×tâ\u008c+Â\u00108+d3ßõó?ïAÄÊ\u0083Í\u0019Þ\u0018D\u0005ÇïÍl¿ª}V»\u0003·¶!Ñhdê±\f¸Ñ¯ Ó\u009cê`>íRÚ`eh&®[\u0016ô\fÄ´\u0090¶eY]¯\u001aU\u0085â0ñ\u0016";
        int length = "´Ã\u0003\u0095áº\u001d´RûsÕt\u0088«\u0094\u009cj\u0004#}kÚ[áÖM8/ÞË\u001b \u0093dvM:\u009e\u0095nKA°Ôf \u0019ÞÖ4cß\n\u001cÖkÁ[×tâ\u008c+Â\u00108+d3ßõó?ïAÄÊ\u0083Í\u0019Þ\u0018D\u0005ÇïÍl¿ª}V»\u0003·¶!Ñhdê±\f¸Ñ¯ Ó\u009cê`>íRÚ`eh&®[\u0016ô\fÄ´\u0090¶eY]¯\u001aU\u0085â0ñ\u0016".length();
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
                            c = new String[7];
                            B = new nz();
                            g = new ConcurrentHashMap();
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
                        str = "8\u0098Á\u009b\u0005ÔÉBÛç8t\u0004Ô§Ë\u0018¨*\u0017'ÜpØ¾ÓY}\u001f\u0092\u0082\u0000K'>,æ\u000fp[\u0011";
                        length = "8\u0098Á\u009b\u0005ÔÉBÛç8t\u0004Ô§Ë\u0018¨*\u0017'ÜpØ¾ÓY}\u001f\u0092\u0082\u0000K'>,æ\u000fp[\u0011".length();
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 9188;
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
                throw new RuntimeException("su/catlean/nz", e);
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
            r1 = 4
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
            java.lang.String r1 = "su/catlean/nz"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nz.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
