package su.catlean;

import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.class_290;
import net.minecraft.class_332;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/g6.class */
public final class g6 extends gf {

    @NotNull
    public static final g6 F;
    private static float h;
    private static final long a = yz.a(5841002753880898457L, -1457486917065574799L, MethodHandles.lookup().lookupClass()).a(12815323864929L);
    private static final String[] b;
    private static final String[] c;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] i;
    private static final Map k;

    /* JADX WARN: Illegal instructions before constructor call */
    private g6(long j, byte b2) {
        long j2 = ((j << 8) | ((((long) b2) << 56) >>> 56)) ^ a;
        super((char) (j2 >>> 48), (int) (((j2 ^ 78450318097521L) << 16) >>> 32), (String) b(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9497, 130294385796245897L ^ j2) /* invoke-custom */, (char) ((r1 << 48) >>> 48));
    }

    public final float k() {
        return h;
    }

    public final void S(float f2) {
        h = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean.jl] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // su.catlean.gf
    public void h(long a2, @NotNull class_332 context) throws Throwable {
        long j = a2 ^ 80556358892348L;
        long j2 = a2 ^ 41533572548145L;
        Intrinsics.checkNotNullParameter(context, (String) b(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15441, 4987783582685702998L ^ a2) /* invoke-custom */);
        Color colorZ = jh.f.Z(a2 ^ 17946477735558L, 0);
        float fMethod_4486 = zf.F(r1).method_22683().method_4486() / 2.0f;
        float fMethod_4502 = zf.F(r1).method_22683().method_4502() / 2.0f;
        class_746 class_746Var = zf.F(a2 ^ 73719739740194L).field_1724;
        Intrinsics.checkNotNull(class_746Var);
        float fMethod_7261 = (3.0f - (class_746Var.method_7261(0.5f) * 3.0f)) + RangesKt.coerceIn(dm.h.r() * 10.0f, 0.0f, 3.0f);
        boolean z = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5990705277528627281L, a2) /* invoke-custom */;
        float fB = jl.y.B(h, fMethod_7261, jl.y.K(a2 ^ 20494741382199L)) + 7.0f;
        h = fMethod_7261;
        VertexFormat vertexFormat = class_290.field_1576;
        Intrinsics.checkNotNullExpressionValue(vertexFormat, (String) b(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25784, 7819702333978571704L ^ a2) /* invoke-custom */);
        g7 g7Var = new g7(a2 ^ 34973642043217L, vertexFormat, (int) d(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9737, 1058124202986338515L ^ a2) /* invoke-custom */, false, 4, null);
        Color color = Color.BLACK;
        Intrinsics.checkNotNullExpressionValue(color, (String) b(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21021, 9144173880792499486L ^ a2) /* invoke-custom */);
        jl.y.q(g7Var, fMethod_4486 - 1.0f, (fMethod_4502 - 6.0f) + fB, 2.0f, 4.0f, j2, new Color[]{color});
        jl.y.q(g7Var, fMethod_4486 - 0.5f, (fMethod_4502 - 5.5f) + fB, 1.0f, 3.0f, j2, new Color[]{colorZ});
        Color color2 = Color.BLACK;
        Intrinsics.checkNotNullExpressionValue(color2, (String) b(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4012, 1464068106395424942L ^ a2) /* invoke-custom */);
        jl.y.q(g7Var, fMethod_4486 - 1.0f, (fMethod_4502 + 2.0f) - fB, 2.0f, 4.0f, j2, new Color[]{color2});
        jl.y.q(g7Var, fMethod_4486 - 0.5f, (fMethod_4502 + 2.5f) - fB, 1.0f, 3.0f, j2, new Color[]{colorZ});
        Color color3 = Color.BLACK;
        Intrinsics.checkNotNullExpressionValue(color3, (String) b(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4012, 1464068106395424942L ^ a2) /* invoke-custom */);
        jl.y.q(g7Var, (fMethod_4486 - 6.0f) + fB, fMethod_4502 - 1.0f, 4.0f, 2.0f, j2, new Color[]{color3});
        jl.y.q(g7Var, (fMethod_4486 - 5.5f) + fB, fMethod_4502 - 0.5f, 3.0f, 1.0f, j2, new Color[]{colorZ});
        Color color4 = Color.BLACK;
        Intrinsics.checkNotNullExpressionValue(color4, (String) b(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4012, 1464068106395424942L ^ a2) /* invoke-custom */);
        jl.y.q(g7Var, (fMethod_4486 + 2.0f) - fB, fMethod_4502 - 1.0f, 4.0f, 2.0f, j2, new Color[]{color4});
        Object obj = jl.y;
        float f2 = (fMethod_4486 + 2.5f) - fB;
        float f3 = fMethod_4502 - 0.5f;
        Color[] colorArr = new Color[1];
        try {
            colorArr[0] = colorZ;
            obj.q(g7Var, f2, f3, 3.0f, 1.0f, j2, colorArr);
            g7.R(j, g7Var, b6.R.Z(), null, null, null, new Matrix3x2f(context.method_51448()), null, (int) d(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32471, 3541342135729037324L ^ a2) /* invoke-custom */, null);
            if (z) {
                return;
            }
            obj = new _g[3];
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6031189761757829519L, a2) /* invoke-custom */;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6037461906750728233L, a2) /* invoke-custom */;
        }
    }

    static {
        int i2;
        long j = a ^ 88508942317237L;
        long j2 = j >>> 8;
        int i3 = (int) (((j ^ 85253599658063L) << 56) >>> 56);
        f = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i4 = 1; i4 < 8; i4++) {
            bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[5];
        int i5 = 0;
        String str = "\u008b§©\u001b8qÃ_\u000fâ\u00adw\u0093hç\u0099\u0010@-°>\u0099Ð\u0091\u0081Q\u008ce\u0083\u0095>%ô\u0018N\u0096F\u0087òÝ\u0092\u00145,°ÍVwúN_['\"°!o\u00ad";
        int length = "\u008b§©\u001b8qÃ_\u000fâ\u00adw\u0093hç\u0099\u0010@-°>\u0099Ð\u0091\u0081Q\u008ce\u0083\u0095>%ô\u0018N\u0096F\u0087òÝ\u0092\u00145,°ÍVwúN_['\"°!o\u00ad".length();
        char cCharAt = 16;
        int i6 = -1;
        while (true) {
            int i7 = i6 + 1;
            String strSubstring = str.substring(i7, i7 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i8 = i5;
                        i5++;
                        strArr[i8] = strIntern;
                        int i9 = i7 + cCharAt;
                        i2 = i9;
                        if (i9 >= length) {
                            b = strArr;
                            c = new String[5];
                            k = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i10 = 1; i10 < 8; i10++) {
                                bArr2[i10] = (byte) ((j << (i10 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[2];
                            int i11 = 0;
                            int length2 = "ÔÇü»¤\u0085Eï×ë\\ÈÁE\u0084b".length();
                            int i12 = 0;
                            do {
                                int i13 = i12;
                                i12 += 8;
                                byte[] bytes = "ÔÇü»¤\u0085Eï×ë\\ÈÁE\u0084b".substring(i13, i12).getBytes("ISO-8859-1");
                                i11++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i12 < length2);
                            g = jArr;
                            i = new Integer[2];
                            F = new g6(j2, (byte) i3);
                            return;
                        }
                        cCharAt = str.charAt(i2);
                        break;
                        break;
                    default:
                        int i14 = i5;
                        i5++;
                        strArr[i14] = strIntern;
                        int i15 = i7 + cCharAt;
                        i6 = i15;
                        if (i15 < length) {
                        }
                        str = "õ\u0012\b\tÜ$û/ý\u0096Ó\u009bð\u009b\u0091×ä\u001dþ\u0002<ÎSUJø\u001bÖ»zØ¿\u0010µ\u008c¹\u000f\u0006\u008eèÏFe®b\u0001{\u0012n";
                        length = "õ\u0012\b\tÜ$û/ý\u0096Ó\u009bð\u009b\u0091×ä\u001dþ\u0002<ÎSUJø\u001bÖ»zØ¿\u0010µ\u008c¹\u000f\u0006\u008eèÏFe®b\u0001{\u0012n".length();
                        cCharAt = ' ';
                        i2 = -1;
                        break;
                        break;
                }
                i7 = i2 + 1;
                strSubstring = str.substring(i7, i7 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i6);
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
                char c2 = (char) (((char) (((char) (i4 & 15)) << '\f')) | (((char) (bArr[i7] & 63)) << 6));
                i3 = i7 + 1;
                int i8 = i2;
                i2++;
                cArr[i8] = (char) (c2 | ((char) (bArr[i3] & 63)));
            }
            i3++;
        }
        return new String(cArr, 0, i2);
    }

    private static String b(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 14952;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/g6", e);
            }
        }
        return c[i3];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strB), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strB;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.g6.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/g6.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x000C: CONST
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.g6.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/g6.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.g6.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int d(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 29617;
        if (i[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) k.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/g6", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            i[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return i[i3].intValue();
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iD = d(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iD)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iD;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.g6.d(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/g6.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x000C: CONST
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.g6.d(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/g6.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.g6.d(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
