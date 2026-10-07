package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1299;
import net.minecraft.class_332;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/d8.class */
public final class d8 extends dt {

    @NotNull
    private final a1 F;
    private static final String[] o;
    private static final String[] q;
    private static final long d = yz.a(5470963018992934984L, 6806161391662975180L, MethodHandles.lookup().lookupClass()).a(211938083608534L);
    private static final Map r = new HashMap(13);

    /* JADX WARN: Illegal instructions before constructor call */
    public d8(@NotNull a1 setting, long a) {
        long j = d ^ a;
        Intrinsics.checkNotNullParameter(setting, (String) c(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23719, 7033969978418595695L ^ j) /* invoke-custom */);
        super((int) (j >>> 32), (int) (((j ^ 138350912194254L) << 32) >>> 40), (String) c(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7128, 5411692729527910418L ^ j) /* invoke-custom */, (byte) ((r1 << 56) >>> 56));
        this.F = setting;
    }

    @NotNull
    public final a1 N() {
        return this.F;
    }

    @Override // su.catlean.dt
    @NotNull
    protected List a(long j) {
        Iterable iterable = class_7923.field_41177;
        Intrinsics.checkNotNullExpressionValue(iterable, (String) c(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6063, 4374319516400173577L ^ j) /* invoke-custom */);
        return CollectionsKt.toList(iterable);
    }

    @NotNull
    protected String Z(@NotNull class_1299 item, long a) {
        long j = d ^ a;
        Intrinsics.checkNotNullParameter(item, (String) c(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22865, 6869875231387687479L ^ j) /* invoke-custom */);
        String string = item.method_5897().getString();
        Intrinsics.checkNotNullExpressionValue(string, (String) c(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30112, 7315521719478859461L ^ j) /* invoke-custom */);
        return string;
    }

    protected boolean L(long a, @NotNull class_1299 item) {
        Intrinsics.checkNotNullParameter(item, (String) c(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20976, 8024302858533048606L ^ (d ^ a)) /* invoke-custom */);
        return ((d4) this.F.F()).q().contains(item);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Type inference failed for: r0v25, types: [net.minecraft.class_1826] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A(@org.jetbrains.annotations.NotNull net.minecraft.class_332 r9, float r10, long r11, float r13, @org.jetbrains.annotations.NotNull net.minecraft.class_1299 r14) {
        /*
            r8 = this;
            long r0 = su.catlean.d8.d
            r1 = r11
            long r0 = r0 ^ r1
            r11 = r0
            r0 = 7665641275394559561(0x6a61d4202b770e49, double:2.7948898799139936E204)
            r1 = r11
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r1 = r9
            r2 = 21131(0x528b, float:2.9611E-41)
            r3 = 6103299079457331555(0x54b3462d1505d963, double:1.0539336186893702E100)
            r4 = r11
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/d8;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "f"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r15 = r0
            r0 = r14
            r1 = 28113(0x6dd1, float:3.9395E-41)
            r2 = 4604678328301315642(0x3fe71a8aff56e63a, double:0.7219901072596209)
            r3 = r11
            long r2 = r2 ^ r3
            java.lang.String r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/d8;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "f"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r1, r2)     // Catch: java.lang.NumberFormatException -> L45
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)     // Catch: java.lang.NumberFormatException -> L45
            r0 = r15
            if (r0 == 0) goto L60
            r0 = r14
            net.minecraft.class_1826 r0 = net.minecraft.class_1826.method_8019(r0)     // Catch: java.lang.NumberFormatException -> L45 java.lang.NumberFormatException -> L55
            r1 = r0
            if (r1 == 0) goto L5f
            goto L4f
        L45:
            r1 = 7699286578352075748(0x6ad95c59b69bb3e4, double:5.088842756854394E206)
            r2 = r11
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L55
            throw r0     // Catch: java.lang.NumberFormatException -> L55
        L4f:
            net.minecraft.class_1792 r0 = (net.minecraft.class_1792) r0     // Catch: java.lang.NumberFormatException -> L55
            goto L63
        L55:
            r1 = 7699286578352075748(0x6ad95c59b69bb3e4, double:5.088842756854394E206)
            r2 = r11
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L5f:
        L60:
            net.minecraft.class_1792 r0 = net.minecraft.class_1802.field_8077
        L63:
            r17 = r0
            r0 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0 = r17
            r16 = r0
            r0 = r9
            org.joml.Matrix3x2fStack r0 = r0.method_51448()
            org.joml.Matrix3x2fStack r0 = r0.pushMatrix()
            r0 = r9
            org.joml.Matrix3x2fStack r0 = r0.method_51448()
            r1 = r10
            r2 = 1090519040(0x41000000, float:8.0)
            float r1 = r1 + r2
            r2 = r13
            org.joml.Matrix3x2f r0 = r0.translate(r1, r2)
            r0 = r9
            r1 = r16
            net.minecraft.class_1799 r1 = r1.method_7854()
            r2 = 0
            r3 = 0
            r0.method_51427(r1, r2, r3)
            r0 = r9
            org.joml.Matrix3x2fStack r0 = r0.method_51448()
            org.joml.Matrix3x2fStack r0 = r0.popMatrix()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.d8.A(net.minecraft.class_332, float, long, float, net.minecraft.class_1299):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    protected void Y(@NotNull class_1299 class_1299Var, long j) {
        long j2 = d ^ j;
        Intrinsics.checkNotNullParameter(class_1299Var, (String) c(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20976, 8024408318961727272L ^ j2) /* invoke-custom */);
        int i = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8694516514022104194L, j2) /* invoke-custom */;
        List listQ = ((d4) this.F.F()).q();
        ?? Contains = listQ;
        class_1299 class_1299Var2 = class_1299Var;
        ?? r0 = Contains;
        if (i != 0) {
            try {
                try {
                    Contains = Contains.contains(class_1299Var2);
                    if (Contains != 0) {
                        listQ.remove(class_1299Var);
                        return;
                    } else {
                        r0 = listQ;
                        class_1299Var2 = class_1299Var;
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Contains, -8651881960360288557L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Contains, -8651881960360288557L, j2) /* invoke-custom */;
            }
        }
        r0.add(class_1299Var2);
    }

    @Override // su.catlean.dt
    public String n(long a, Object item) {
        return Z((class_1299) item, a ^ 90927979473846L);
    }

    @Override // su.catlean.dt
    public boolean O(Object item, long a) {
        return L(a ^ 111487467574449L, (class_1299) item);
    }

    @Override // su.catlean.dt
    public void j(class_332 context, float x, float y, long a, Object component) {
        A(context, x, a ^ 74559184613877L, y, (class_1299) component);
    }

    @Override // su.catlean.dt
    public void v(Object item, long a) {
        Y((class_1299) item, a ^ 91422355180470L);
    }

    static {
        int i;
        long j = d ^ 23114834137429L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[8];
        int i3 = 0;
        String str = "ïÞÂ?\u008aV\u0087\u001c\u00002\u009a\u0084¥Ì{*\u0010\u0088ç\u009dl\u001cÉ2\u0095;]«ÅÁ;\u009eV Áª\u000b*éVÛìÞ\u0092O\u009b¡+\u007f%\u001a\u0092\u0091ÐÛy\u009a£ú\u0011Z¿®\u0018\u00adÃ\u0010j\u001f\u009bïËÃröóÖL*ÙÀÚ\u0003\u0010Y\u0083m~§?Ç?Ñãt^\u009c\\¿0\u0010\u0090ÜNÇ\u009cáKdÚ,MÑUÈ_&";
        int length = "ïÞÂ?\u008aV\u0087\u001c\u00002\u009a\u0084¥Ì{*\u0010\u0088ç\u009dl\u001cÉ2\u0095;]«ÅÁ;\u009eV Áª\u000b*éVÛìÞ\u0092O\u009b¡+\u007f%\u001a\u0092\u0091ÐÛy\u009a£ú\u0011Z¿®\u0018\u00adÃ\u0010j\u001f\u009bïËÃröóÖL*ÙÀÚ\u0003\u0010Y\u0083m~§?Ç?Ñãt^\u009c\\¿0\u0010\u0090ÜNÇ\u009cáKdÚ,MÑUÈ_&".length();
        char cCharAt = 16;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = c(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 >= length) {
                            o = strArr;
                            q = new String[8];
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
                        str = "ïq\u0012>Ä¦ D#¾\u009f\u008a\u0096\u0085\u0097;¾\u008b¸¿*\u008b\u0090OµÙhN\u009bG\u001cq\u0018\u0000¢½_\u0015\u0091ê\u0083\u001e¼¡o²ttqïjÝ²þx¤Ù";
                        length = "ïq\u0012>Ä¦ D#¾\u009f\u008a\u0096\u0085\u0097;¾\u008b¸¿*\u008b\u0090OµÙhN\u009bG\u001cq\u0018\u0000¢½_\u0015\u0091ê\u0083\u001e¼¡o²ttqïjÝ²þx¤Ù".length();
                        cCharAt = ' ';
                        i = -1;
                        break;
                        break;
                }
                i5 = i + 1;
                strSubstring = str.substring(i5, i5 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i4);
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String c(byte[] bArr) {
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
                char c = (char) (((char) (((char) (i3 & 15)) << '\f')) | (((char) (bArr[i6] & 63)) << 6));
                i2 = i6 + 1;
                int i7 = i;
                i++;
                cArr[i7] = (char) (c | ((char) (bArr[i2] & 63)));
            }
            i2++;
        }
        return new String(cArr, 0, i);
    }

    private static String c(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 24664;
        if (q[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) r.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    r.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                q[i2] = c(((Cipher) objArr[0]).doFinal(o[i2].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/d8", e);
            }
        }
        return q[i2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strC), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strC;
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
    private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
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
            java.lang.String r1 = "su/catlean/d8"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.d8.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
