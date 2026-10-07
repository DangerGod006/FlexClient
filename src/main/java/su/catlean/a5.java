package su.catlean;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
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
import net.minecraft.class_124;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/a5.class */
public final class a5 extends a3 {

    @NotNull
    public static final a5 t;
    private static final long b = yz.a(-5802770135694742385L, -8426882597775477875L, MethodHandles.lookup().lookupClass()).a(110483891582363L);
    private static final String[] g;
    private static final String[] h;
    private static final Map i;

    /* JADX WARN: Illegal instructions before constructor call */
    private a5(long j) {
        long j2 = b ^ j;
        super(j2 ^ 70119702201576L, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11725, 4423852227413409655L ^ j2) /* invoke-custom */);
    }

    @Override // su.catlean.a3
    public void l(@NotNull LiteralArgumentBuilder builder, long a) {
        long j = a ^ 131983109906692L;
        long j2 = a ^ 61473902788714L;
        Intrinsics.checkNotNullParameter(builder, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15348, 1264386450225721955L ^ a) /* invoke-custom */);
        builder.then(c(j, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3894, 5723903325821355683L ^ a) /* invoke-custom */).executes(a5::f));
        builder.then(c(j, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31421, 3403825172219736876L ^ a) /* invoke-custom */).then(j((String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4674, 5222394056069536733L ^ a) /* invoke-custom */, mp.u.G(), j2).executes(a5::T)));
        builder.then(c(j, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20675, 458467496386861395L ^ a) /* invoke-custom */).then(j((String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10214, 3842420460808466044L ^ a) /* invoke-custom */, s5.n.T(), j2).executes(a5::O)));
        builder.then(c(j, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24709, 1041714556347951384L ^ a) /* invoke-custom */).executes(a5::E));
        builder.executes(a5::b);
    }

    private static final int f(CommandContext commandContext) {
        long j = b ^ 138310861079727L;
        long j2 = j ^ 86827820313270L;
        int i2 = (int) ((j2 << 32) >>> 48);
        int i3 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 39113626960875L;
        c7.b.K(j ^ 43960826173771L);
        t.a(i4.h.E((int) (j >>> 32), (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26494, 7364527594680215314L ^ j) /* invoke-custom */, i2, new Object[0], i3), j3);
        return 1;
    }

    private static final int T(CommandContext commandContext) {
        long j = b ^ 96093182154350L;
        long j2 = j ^ 110321656166519L;
        int i2 = (int) (j >>> 32);
        int i3 = (int) ((j2 << 32) >>> 48);
        int i4 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 10156382736682L;
        long j4 = j ^ 97428954151863L;
        String str = (String) commandContext.getArgument((String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10214, 3842415997748655433L ^ j) /* invoke-custom */, String.class);
        c7 c7Var = c7.b;
        Intrinsics.checkNotNull(str);
        c7Var.h((char) (j >>> 48), (int) ((j4 << 16) >>> 32), (short) ((j4 << 48) >>> 48), str);
        t.a(i4.h.E(i2, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26809, 4074041328287676952L ^ j) /* invoke-custom */, i3, new Object[]{str}, i4), j3);
        return 1;
    }

    private static final int O(CommandContext commandContext) {
        long j = b ^ 60407425216095L;
        long j2 = j ^ 51849311782030L;
        long j3 = j ^ 6337757151302L;
        int i2 = (int) (j >>> 32);
        int i3 = (int) ((j3 << 32) >>> 48);
        int i4 = (int) ((j3 << 48) >>> 48);
        long j4 = j ^ 115076861667611L;
        String str = (String) commandContext.getArgument((String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10214, 3842522007152741752L ^ j) /* invoke-custom */, String.class);
        c7 c7Var = c7.b;
        Intrinsics.checkNotNull(str);
        c7Var.j(j2, str);
        t.a(i4.h.E(i2, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24954, 4277814879403117536L ^ j) /* invoke-custom */, i3, new Object[]{str}, i4), j4);
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int E(com.mojang.brigadier.context.CommandContext r10) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.a5.E(com.mojang.brigadier.context.CommandContext):int");
    }

    private static final int b(CommandContext commandContext) {
        long j = b ^ 131652495427565L;
        t.a(class_124.field_1061 + (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26539, 1150489720601109638L ^ j) /* invoke-custom */, j ^ 46065207230633L);
        return 1;
    }

    static {
        int i2;
        long j = (b ^ 119496610384123L) ^ 113638874209836L;
        i = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (r0 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((r0 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[16];
        int i4 = 0;
        String str = "\u0004\u0011%=\u00832Õî[-nÝ[D[\u0087\u0010c!´æü´\u0019³ú\u0081PC\u001d1X\u0088\u0018\u000e3\u0082X\u001d\u009fÍ\u0094\u0092\u009f¥3p²\u0001lqï\u0095èa=\u008a\u001b(E\u009d\u0095ï\u0088#c\"L|ú¡\u009awG\u0092°äÈº1joØ\u001eÀeø¼¹[Ûð[¢Ú\tb>k\u0010èÎ¯t\u001f-SÌ¿ÓÙcÿJKç(êzçuLøÈ\u0007\u009bÞÌLV\u0019¸]¾Q\u0012Fü\u0085Û\u0091©\u0006¡n³=\u0007\u000fU\u0002\u001f_\"+êc\u0010`L¼%á\u001cöÙ8~}\nÖoÅ;(\u000eíìs\u009f?\nìû|Vî8\u008eT@ç(\u0091nâö÷&ÿþlLw\u0099\u0014rÛ\u0003\n\u0003Ì¨¡\u008b\u0010Oñ\u000eoÎ&\u0015-c³\u008e\"¦Úh\u0016(ßöÛq½\u0087@ìv\u0095·ùÈçÏéüÀ$é;kÐÿû\u008f\u0087hÚ\u0015ñô`Æz0ZÐ\u0093,pþ\u0080q;¥xw\u001b\u0085hI=ïØLP\nÄ\u0085È\u0000\u001d\u009b\u0098ª\u0015ÏÅ\u0090\u0003\u000bcã(¤\u0091\f¹§oøJ\u0016\u008c½óÛª\u009bbâÐ^ª\u0016\u008eTw\u0002µX\b\u0016W9þ\u0001\u008eÏt\u001e'-Ì\u0080{\u0092eY»y`×Ls{¢\u0013ùÉ\u0092#ý\u009c\u0091Õ¾\rîF:ÔÝ\u0095¦Ó¡j\u00ad\fH5\u0010\u0013\u0087Ú\u008cF%ú_\u008eå×¾4B\u007f\u0095\u0010\u0082ÿìrª8z\u0085¢7\u009cL|Bî\u0084\u0010\u0005\u0097I\fñªm¯\u0096\u0019Ü\fa\u009cS\u001a";
        int length = "\u0004\u0011%=\u00832Õî[-nÝ[D[\u0087\u0010c!´æü´\u0019³ú\u0081PC\u001d1X\u0088\u0018\u000e3\u0082X\u001d\u009fÍ\u0094\u0092\u009f¥3p²\u0001lqï\u0095èa=\u008a\u001b(E\u009d\u0095ï\u0088#c\"L|ú¡\u009awG\u0092°äÈº1joØ\u001eÀeø¼¹[Ûð[¢Ú\tb>k\u0010èÎ¯t\u001f-SÌ¿ÓÙcÿJKç(êzçuLøÈ\u0007\u009bÞÌLV\u0019¸]¾Q\u0012Fü\u0085Û\u0091©\u0006¡n³=\u0007\u000fU\u0002\u001f_\"+êc\u0010`L¼%á\u001cöÙ8~}\nÖoÅ;(\u000eíìs\u009f?\nìû|Vî8\u008eT@ç(\u0091nâö÷&ÿþlLw\u0099\u0014rÛ\u0003\n\u0003Ì¨¡\u008b\u0010Oñ\u000eoÎ&\u0015-c³\u008e\"¦Úh\u0016(ßöÛq½\u0087@ìv\u0095·ùÈçÏéüÀ$é;kÐÿû\u008f\u0087hÚ\u0015ñô`Æz0ZÐ\u0093,pþ\u0080q;¥xw\u001b\u0085hI=ïØLP\nÄ\u0085È\u0000\u001d\u009b\u0098ª\u0015ÏÅ\u0090\u0003\u000bcã(¤\u0091\f¹§oøJ\u0016\u008c½óÛª\u009bbâÐ^ª\u0016\u008eTw\u0002µX\b\u0016W9þ\u0001\u008eÏt\u001e'-Ì\u0080{\u0092eY»y`×Ls{¢\u0013ùÉ\u0092#ý\u009c\u0091Õ¾\rîF:ÔÝ\u0095¦Ó¡j\u00ad\fH5\u0010\u0013\u0087Ú\u008cF%ú_\u008eå×¾4B\u007f\u0095\u0010\u0082ÿìrª8z\u0085¢7\u009cL|Bî\u0084\u0010\u0005\u0097I\fñªm¯\u0096\u0019Ü\fa\u009cS\u001a".length();
        char cCharAt = 16;
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
                            h = new String[16];
                            t = new a5(j);
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
                        str = "H@\u0081È³ý,x_Ð4óÖaÑî(\u001e\u0090gLÙH\u0083hÖX%¤\u0097\u0003±Í'2iÝ@sî÷ÜëfD>úWq\u008eÍ\u000eÓ\u000e\u00ad\u0006Ò";
                        length = "H@\u0081È³ý,x_Ð4óÖaÑî(\u001e\u0090gLÙH\u0083hÖX%¤\u0097\u0003±Í'2iÝ@sî÷ÜëfD>úWq\u008eÍ\u000eÓ\u000e\u00ad\u0006Ò".length();
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 1125;
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
                throw new RuntimeException("su/catlean/a5", e);
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
            r1 = 3
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
            java.lang.String r1 = "su/catlean/a5"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.a5.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
