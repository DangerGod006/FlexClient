package su.catlean;

import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.PostTickEvent;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/bo.class */
public final class bo implements ym {

    @NotNull
    public static final bo S;

    @NotNull
    private static AtomicBoolean u;

    @NotNull
    private static ExecutorService D;

    @NotNull
    private static List H;
    private static boolean U;
    private static final long a = yz.a(1694520301718390403L, 8890729676895669104L, MethodHandles.lookup().lookupClass()).a(177800358160334L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    private bo() {
    }

    @NotNull
    public final AtomicBoolean Z() {
        return u;
    }

    public final void M(int a2, @NotNull AtomicBoolean atomicBoolean, int a3, int a4) {
        Intrinsics.checkNotNullParameter(atomicBoolean, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20958, 1495725736828243487L ^ ((((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a)) /* invoke-custom */);
        u = atomicBoolean;
    }

    @NotNull
    public final ExecutorService Y() {
        return D;
    }

    public final void k(long a2, @NotNull ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(executorService, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30239, 6982233480313764606L ^ (a ^ a2)) /* invoke-custom */);
        D = executorService;
    }

    @NotNull
    public final List b() {
        return H;
    }

    public final void s(@NotNull List list, int a2, int a3, char a4) {
        Intrinsics.checkNotNullParameter(list, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20958, 1495656051674403324L ^ ((((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a)) /* invoke-custom */);
        H = list;
    }

    @Flow(priority = 20)
    private final void o(TickEvent tickEvent) {
        u.set(true);
    }

    @Flow(priority = -20)
    private final void D(PostTickEvent postTickEvent) {
        u.set(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public final boolean R(long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 137179598926387L;
        Object objMethod_18854 = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7949212381466476765L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    objMethod_18854 = zf.F(j3).method_18854();
                    if (objMethod_18854 == 0) {
                        return objMethod_18854;
                    }
                    if (objMethod_18854 == 0) {
                        boolean z = u.get();
                        if (objMethod_18854 == 0) {
                            return z;
                        }
                        if (z) {
                            return false;
                        }
                    }
                    return true;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_18854, 7942484239635455768L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_18854, 7942484239635455768L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_18854, 7942484239635455768L, j2) /* invoke-custom */;
        }
    }

    @Flow(priority = 20)
    public final void A(@NotNull PlayerUpdateEvent e) {
        long j = a ^ 24768536675790L;
        Intrinsics.checkNotNullParameter(e, "e");
        ArrayList arrayListNewArrayList = Lists.newArrayList(zf.z(j ^ 93871785803397L).method_18456());
        Intrinsics.checkNotNullExpressionValue(arrayListNewArrayList, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10954, 553664994632928631L ^ j) /* invoke-custom */);
        H = arrayListNewArrayList;
    }

    public final void i(int a2, short a3, int delay, @NotNull Function0 runnable, short a4) {
        Intrinsics.checkNotNullParameter(runnable, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3552, 6759749558298930642L ^ ((((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a)) /* invoke-custom */);
        Y().execute(new c(delay, runnable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1 */
    public static void J(bo boVar, long j, int i, Function0 function0, int i2, Object obj) {
        long j2 = a ^ j;
        ?? r0 = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3976903044339037696L, j2) /* invoke-custom */;
        try {
            r0 = i2 & 1;
            ?? r02 = r0;
            if (r0 == 0) {
                if (r0 != 0) {
                    i = 0;
                }
                Intrinsics.checkNotNullParameter(function0, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14372, 6868697757847569654L ^ j2) /* invoke-custom */);
                r02 = 0;
            }
            try {
                boVar.Y().execute(new c(i, function0));
                ?? r03 = r0;
                int i3 = r03;
                if (j2 > 0) {
                    if (r03 == 0) {
                        return;
                    } else {
                        i3 = 4;
                    }
                }
                r02 = new _g[i3];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -3961250983983660229L, j2) /* invoke-custom */;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -3935504576157403069L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -3935504576157403069L, j2) /* invoke-custom */;
        }
    }

    static {
        int i;
        long j = a ^ 137244189963026L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(false, -6594724597908482041L, j) /* invoke-custom */;
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
        String str = "\u001doÑ¡÷\b Çqß¤Á¨¹\fµ\u001cß.@n\u008eÛ7.ø\u0092½=è;\u0003\u0091«¡«\u0085sÃ|r\u0086®2\u0010×Õ¤\u0082¢Þ\u0081Ï WUÝ\u0099RÝf}`T(g\u0014¡äÚ7\u001cGî+o¼2×/F\u0017=:ÞÄ\\#¦\u0092ü×VOIjd2t~Åy\u0003\u001cÖ Â5[Äñ'5_,\f\fS\u008fAVÓ¨Z\bª¯Qá^\u008aqÐG§=S9\u0010E)c4*Gï¼\u0080-$\u0011»×¢Ò";
        int length = "\u001doÑ¡÷\b Çqß¤Á¨¹\fµ\u001cß.@n\u008eÛ7.ø\u0092½=è;\u0003\u0091«¡«\u0085sÃ|r\u0086®2\u0010×Õ¤\u0082¢Þ\u0081Ï WUÝ\u0099RÝf}`T(g\u0014¡äÚ7\u001cGî+o¼2×/F\u0017=:ÞÄ\\#¦\u0092ü×VOIjd2t~Åy\u0003\u001cÖ Â5[Äñ'5_,\f\fS\u008fAVÓ¨Z\bª¯Qá^\u008aqÐG§=S9\u0010E)c4*Gï¼\u0080-$\u0011»×¢Ò".length();
        char cCharAt = '@';
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
                            c = new String[6];
                            S = new bo();
                            u = new AtomicBoolean(false);
                            ExecutorService executorServiceNewVirtualThreadPerTaskExecutor = Executors.newVirtualThreadPerTaskExecutor();
                            Intrinsics.checkNotNullExpressionValue(executorServiceNewVirtualThreadPerTaskExecutor, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27212, 1020755771066481452L ^ j) /* invoke-custom */);
                            D = executorServiceNewVirtualThreadPerTaskExecutor;
                            H = CollectionsKt.emptyList();
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
                        str = "ç\u0094sÈ\u0091Î\u001cî?Èêw4µæÿ lçN3ðêÒO>\b9\u0085\u001d¿K¤Þ}\u001fÂ\u0019¯\u001f\u0082\u009a\u009a\t\u0086y«¨!";
                        length = "ç\u0094sÈ\u0091Î\u001cî?Èêw4µæÿ lçN3ðêÒO>\b9\u0085\u001d¿K¤Þ}\u001fÂ\u0019¯\u001f\u0082\u009a\u009a\t\u0086y«¨!".length();
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

    public static void b(boolean z) {
        U = z;
    }

    public static boolean S() {
        return U;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean t() {
        return !S();
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 13553;
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
                throw new RuntimeException("su/catlean/bo", e);
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
            java.lang.String r1 = "su/catlean/bo"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.bo.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
