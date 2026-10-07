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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1792;
import net.minecraft.class_332;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/dr.class */
public final class dr extends dt {

    @NotNull
    private final List H;

    @NotNull
    private final Function1 v;
    private static final String[] o;
    private static final String[] q;
    private static final long d = yz.a(4484864159493499220L, 3951599726281628396L, MethodHandles.lookup().lookupClass()).a(38506403934038L);
    private static final Map r = new HashMap(13);

    /* JADX WARN: Illegal instructions before constructor call */
    public dr(@NotNull List list, @NotNull Function1 clickAction, short a, long a2) {
        long j = ((((long) a) << 48) | ((a2 << 16) >>> 16)) ^ d;
        Intrinsics.checkNotNullParameter(list, (String) c(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5108, 2212345201528404993L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(clickAction, (String) c(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32527, 8327294638916571388L ^ j) /* invoke-custom */);
        super((int) (j >>> 32), (int) (((j ^ 136078964668537L) << 32) >>> 40), (String) c(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23052, 669134434756900346L ^ j) /* invoke-custom */, (byte) ((r1 << 56) >>> 56));
        this.H = list;
        this.v = clickAction;
    }

    @NotNull
    public final List n() {
        return this.H;
    }

    @NotNull
    public final Function1 u() {
        return this.v;
    }

    @Override // su.catlean.dt
    @NotNull
    protected List a(long j) {
        Iterable iterable = class_7923.field_41178;
        Intrinsics.checkNotNullExpressionValue(iterable, (String) c(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32021, 7901087721088737855L ^ j) /* invoke-custom */);
        return CollectionsKt.toList(iterable);
    }

    @NotNull
    protected String k(long a, @NotNull class_1792 item) {
        long j = d ^ a;
        Intrinsics.checkNotNullParameter(item, (String) c(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23404, 3422953051738709725L ^ j) /* invoke-custom */);
        String string = item.method_63680().getString();
        Intrinsics.checkNotNullExpressionValue(string, (String) c(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1133, 6407000217992217050L ^ j) /* invoke-custom */);
        return string;
    }

    protected boolean Q(long a, @NotNull class_1792 item) {
        Intrinsics.checkNotNullParameter(item, (String) c(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23404, 3422880875024631781L ^ (d ^ a)) /* invoke-custom */);
        return this.H.contains(item);
    }

    public void b(@NotNull class_332 context, float x, long a, float y, @NotNull class_1792 item) {
        long j = d ^ a;
        Intrinsics.checkNotNullParameter(context, (String) c(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15549, 1139476252797781133L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(item, (String) c(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14125, 3364884482898972443L ^ j) /* invoke-custom */);
        context.method_51448().pushMatrix();
        context.method_51448().translate(x + 8.0f, y);
        context.method_51427(item.method_7854(), 0, 0);
        context.method_51448().popMatrix();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v9 */
    protected void O(@NotNull class_1792 class_1792Var, long j) {
        long j2 = d ^ j;
        int i = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8188107968003071905L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(class_1792Var, (String) c(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23404, 3422912336265380301L ^ j2) /* invoke-custom */);
        this.v.invoke(class_1792Var);
        List list = this.H;
        ?? Contains = 0;
        try {
            Contains = list;
            class_1792 class_1792Var2 = class_1792Var;
            ?? r0 = Contains;
            if (i == 0) {
                try {
                    Contains = Contains.contains(class_1792Var2);
                    if (Contains != 0) {
                        list.remove(class_1792Var);
                        return;
                    } else {
                        r0 = list;
                        class_1792Var2 = class_1792Var;
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Contains, 8177874475170667514L, j2) /* invoke-custom */;
                }
            }
            r0.add(class_1792Var2);
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Contains, 8177874475170667514L, j2) /* invoke-custom */;
        }
    }

    @Override // su.catlean.dt
    public String n(long a, Object item) {
        return k(a ^ 65279083500531L, (class_1792) item);
    }

    @Override // su.catlean.dt
    public boolean O(Object item, long a) {
        return Q(a ^ 49399548081729L, (class_1792) item);
    }

    @Override // su.catlean.dt
    public void j(class_332 context, float x, float y, long a, Object component) {
        b(context, x, a ^ 52143984131262L, y, (class_1792) component);
    }

    @Override // su.catlean.dt
    public void v(Object item, long a) {
        O((class_1792) item, a ^ 103613740616024L);
    }

    static {
        int i;
        long j = d ^ 2911767454843L;
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
        String str = "Ñå¤\u0096LDr^3ì:óÐÂÀ\u0017\u0010\u0086:Îï´ÛÀt\u001a\u0098\u0000.\u0099sÉ^ ª\u0080óZÝ\u0080\u00941['\u008fR\nü¡\u009c\u0006m\u0097]:{sOt|;\u0083\u009f\u0096\n\u0005\u0010déc\u0005\u0083Þ*@¨¼\u0095ê¾Æ\u0082;\u0010,pqç¸óU\u0012p#tJRú_F\u0010:/\u008b{-SoÚè\u0082z\u000ev»: ";
        int length = "Ñå¤\u0096LDr^3ì:óÐÂÀ\u0017\u0010\u0086:Îï´ÛÀt\u001a\u0098\u0000.\u0099sÉ^ ª\u0080óZÝ\u0080\u00941['\u008fR\nü¡\u009c\u0006m\u0097]:{sOt|;\u0083\u009f\u0096\n\u0005\u0010déc\u0005\u0083Þ*@¨¼\u0095ê¾Æ\u0082;\u0010,pqç¸óU\u0012p#tJRú_F\u0010:/\u008b{-SoÚè\u0082z\u000ev»: ".length();
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
                        str = "j\u0007§Ñ$\u0082ko\u0093ø°íi?\u008dL\u00adæØ5\u0017H\u0019¢\u0098HËw\u009fÛAD\u0018\u0006\u0002s[ÐT0W\u008bD2Ô\u0099q\u0089<¡]näÃÙa¾";
                        length = "j\u0007§Ñ$\u0082ko\u0093ø°íi?\u008dL\u00adæØ5\u0017H\u0019¢\u0098HËw\u009fÛAD\u0018\u0006\u0002s[ÐT0W\u008bD2Ô\u0099q\u0089<¡]näÃÙa¾".length();
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 10963;
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
                throw new RuntimeException("su/catlean/dr", e);
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
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
            r1 = -1
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
            java.lang.String r1 = "su/catlean/dr"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dr.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
