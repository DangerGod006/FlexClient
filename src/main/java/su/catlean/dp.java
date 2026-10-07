package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_332;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/dp.class */
public final class dp extends dt {

    @NotNull
    private final a1 s;
    private static final String[] o;
    private static final String[] q;
    private static final long d = yz.a(-8632702415593481019L, 3831179648269467186L, MethodHandles.lookup().lookupClass()).a(92361440263941L);
    private static final Map r = new HashMap(13);

    /* JADX WARN: Illegal instructions before constructor call */
    public dp(@NotNull a1 setting, long a) {
        long j = d ^ a;
        Intrinsics.checkNotNullParameter(setting, (String) c(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21355, 5657583585141246017L ^ j) /* invoke-custom */);
        super((int) (j >>> 32), (int) (((j ^ 109865850533469L) << 32) >>> 40), (String) c(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3300, 4237963031964391375L ^ j) /* invoke-custom */, (byte) ((r1 << 56) >>> 56));
        this.s = setting;
    }

    @NotNull
    public final a1 n() {
        return this.s;
    }

    @Override // su.catlean.dt
    @NotNull
    protected List a(long j) {
        ArrayList arrayList = new ArrayList();
        Iterable iterable = class_7923.field_41175;
        Intrinsics.checkNotNullExpressionValue(iterable, (String) c(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22610, 2588749750499736961L ^ j) /* invoke-custom */);
        CollectionsKt.addAll(arrayList, iterable);
        arrayList.remove(class_2246.field_10124);
        CollectionsKt.sortedWith(arrayList, new q());
        return arrayList;
    }

    @NotNull
    protected String a(@NotNull class_2248 item, long a) {
        long j = d ^ a;
        Intrinsics.checkNotNullParameter(item, (String) c(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22076, 834703210093760144L ^ j) /* invoke-custom */);
        String string = item.method_9518().getString();
        Intrinsics.checkNotNullExpressionValue(string, (String) c(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16279, 335564226107844412L ^ j) /* invoke-custom */);
        return string;
    }

    protected boolean j(short a, int a2, short a3, @NotNull class_2248 item) {
        Intrinsics.checkNotNullParameter(item, (String) c(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22076, 834695658280716376L ^ ((((((long) a) << 48) | ((((long) a2) << 32) >>> 16)) | ((((long) a3) << 48) >>> 48)) ^ d)) /* invoke-custom */);
        return ((dg) this.s.F()).e().contains(item);
    }

    public void c(@NotNull class_332 context, float x, float y, int a, short a2, @NotNull class_2248 block, int a3) {
        long j = (((((long) a) << 32) | ((((long) a2) << 48) >>> 32)) | ((((long) a3) << 48) >>> 48)) ^ d;
        Intrinsics.checkNotNullParameter(context, (String) c(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(92, 8521576591074619161L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(block, (String) c(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10664, 2226623374868367087L ^ j) /* invoke-custom */);
        context.method_51448().pushMatrix();
        context.method_51448().translate(x + 8.0f, y);
        context.method_51427(block.method_8389().method_7854(), 0, 0);
        context.method_51448().popMatrix();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    protected void z(long j, @NotNull class_2248 class_2248Var) {
        long j2 = d ^ j;
        Intrinsics.checkNotNullParameter(class_2248Var, (String) c(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25165, 5796904821762076005L ^ j2) /* invoke-custom */);
        int i = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2389397522718134060L, j2) /* invoke-custom */;
        List listE = ((dg) this.s.F()).e();
        ?? Contains = listE;
        class_2248 class_2248Var2 = class_2248Var;
        ?? r0 = Contains;
        if (i == 0) {
            try {
                try {
                    Contains = Contains.contains(class_2248Var2);
                    if (Contains != 0) {
                        listE.remove(class_2248Var);
                        return;
                    } else {
                        r0 = listE;
                        class_2248Var2 = class_2248Var;
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Contains, -2397295401231545226L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Contains, -2397295401231545226L, j2) /* invoke-custom */;
            }
        }
        r0.add(class_2248Var2);
    }

    @Override // su.catlean.dt
    public String n(long a, Object item) {
        return a((class_2248) item, a ^ 5115181560600L);
    }

    @Override // su.catlean.dt
    public boolean O(Object item, long a) {
        return j((short) (a >>> 48), (int) (((a ^ 83392101042522L) << 16) >>> 32), (short) ((r1 << 48) >>> 48), (class_2248) item);
    }

    @Override // su.catlean.dt
    public void j(class_332 context, float x, float y, long a, Object component) {
        c(context, x, y, (int) (a >>> 32), (short) ((r1 << 32) >>> 48), (class_2248) component, (int) (((a ^ 93427562403384L) << 48) >>> 48));
    }

    @Override // su.catlean.dt
    public void v(Object item, long a) {
        z(a ^ 119614146666790L, (class_2248) item);
    }

    static {
        int i;
        long j = d ^ 18464682235336L;
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
        String str = ",8¾\u0089\u0016\\\\'\u008bsóf{\u009f'\u008c\u0010\u008b&_è\u0085\u0089o¥\u001fål|\u0087v\u0083\u0090 \u0094)\u0087Æ\u0000\u000e\u0006l\foÄï¯<F\tvf\u009eõ\u009drG$Îï,ÒÍ4\u0093?\u0010Ýb;kÓÚ\u00937\u0086¢ª\u009a\u001d%\u0016ñ\u0010°B\u0000ÀTzJ~Æ\u0093H6R8~²\u0010\u0098ÐÆs\u0013¤î¬\u0003FÒr\u0015\u0007g\u0086";
        int length = ",8¾\u0089\u0016\\\\'\u008bsóf{\u009f'\u008c\u0010\u008b&_è\u0085\u0089o¥\u001fål|\u0087v\u0083\u0090 \u0094)\u0087Æ\u0000\u000e\u0006l\foÄï¯<F\tvf\u009eõ\u009drG$Îï,ÒÍ4\u0093?\u0010Ýb;kÓÚ\u00937\u0086¢ª\u009a\u001d%\u0016ñ\u0010°B\u0000ÀTzJ~Æ\u0093H6R8~²\u0010\u0098ÐÆs\u0013¤î¬\u0003FÒr\u0015\u0007g\u0086".length();
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
                        str = "îÝ°ô8«\u0095/&\u008e\t;í\nQYu\u0083\u0006I\u001a©Ç7¤\u0086¿[ïÔ Q\u0010vE\u0010)\u0089Ü\u008aÙ4µ\u0017\u008b©e\u008bÃ";
                        length = "îÝ°ô8«\u0095/&\u008e\t;í\nQYu\u0083\u0006I\u001a©Ç7¤\u0086¿[ïÔ Q\u0010vE\u0010)\u0089Ü\u008aÙ4µ\u0017\u008b©e\u008bÃ".length();
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 4139;
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
                throw new RuntimeException("su/catlean/dp", e);
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
            r1 = 0
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
            java.lang.String r1 = "su/catlean/dp"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dp.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
