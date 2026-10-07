package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/os.class */
public final class os extends oq {

    @NotNull
    public static final os D;
    static final /* synthetic */ KProperty[] K;

    @NotNull
    private static final ReadWriteProperty x;

    @NotNull
    private static final ReadWriteProperty A;

    @NotNull
    private static final ReadWriteProperty M;

    @NotNull
    private static final ReadWriteProperty O;

    @NotNull
    private static final ReadWriteProperty o;

    @NotNull
    private static final ReadWriteProperty u;

    @NotNull
    private static final ReadWriteProperty i;
    private static String[] s;
    private static final long b = yz.a(4218366314374231825L, 1441945716120668429L, MethodHandles.lookup().lookupClass()).a(199741603584196L);
    private static final long[] m;
    private static final Integer[] n;
    private static final Map p;

    private os(int i2, int i3, byte b2) {
        super(((((((long) i2) << 32) | ((((long) i3) << 40) >>> 32)) | ((((long) b2) << 56) >>> 56)) ^ b) ^ 137556631966225L);
    }

    @Nullable
    public final Long B() {
        return (Long) x.getValue(this, K[0]);
    }

    public final void S(@Nullable Long l) {
        x.setValue(this, K[0], l);
    }

    @Nullable
    public final String Y() {
        return (String) A.getValue(this, K[1]);
    }

    public final void h(@Nullable String str) {
        A.setValue(this, K[1], str);
    }

    @Nullable
    public final String T() {
        return (String) M.getValue(this, K[2]);
    }

    public final void W(@Nullable String str) {
        M.setValue(this, K[2], str);
    }

    @Nullable
    public final Pair P() {
        return (Pair) O.getValue(this, K[3]);
    }

    public final void U(@Nullable Pair pair) {
        O.setValue(this, K[3], pair);
    }

    @Nullable
    public final Pair z() {
        return (Pair) o.getValue(this, K[4]);
    }

    public final void g(@Nullable Pair pair) {
        o.setValue(this, K[4], pair);
    }

    @Nullable
    public final Pair n() {
        return (Pair) u.getValue(this, K[5]);
    }

    public final void G(@Nullable Pair pair) {
        u.setValue(this, K[5], pair);
    }

    @Nullable
    public final Pair m(long j) {
        return (Pair) i.getValue(this, K[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15244, 7349445738734289931L ^ (b ^ j)) /* invoke-custom */]);
    }

    public final void Z(@Nullable Pair pair, long a) {
        i.setValue(this, K[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24629, 3069711114647302765L ^ (b ^ a)) /* invoke-custom */], pair);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00c6: INVOKE (r-1 I:java.util.List), (r0 I:java.lang.Object) INTERFACE call: java.util.List.add(java.lang.Object):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @org.jetbrains.annotations.NotNull
    public final su.catlean.yq u(long r12) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.os.u(long):su.catlean.yq");
    }

    private final ReadWriteProperty d(boolean z, Object obj) {
        Delegates delegates = Delegates.INSTANCE;
        return new tj(obj, z);
    }

    static /* synthetic */ ReadWriteProperty F(os osVar, int i2, boolean z, Object obj, int i3, int i4, Object obj2, short s2) {
        long j = (((((long) i2) << 32) | ((((long) i4) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ b;
        if ((i3 & 1) != 0) {
            z = false;
        }
        if ((i3 & 2) != 0) {
            obj = null;
        }
        return osVar.d(z, obj);
    }

    public final void j() {
        o.G.Z(0);
        o.G.B(true);
    }

    public final void U() {
        o.G.B(false);
    }

    static {
        int i2;
        long j = b ^ 120182687399445L;
        long j2 = j ^ 103113372945317L;
        int i3 = (int) (j >>> 32);
        int i4 = (int) ((j2 << 32) >>> 48);
        int i5 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 44264677680240L;
        int i6 = (int) (j >>> 32);
        int i7 = (int) ((j3 << 32) >>> 40);
        int i8 = (int) ((j3 << 56) >>> 56);
        if ((String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7156413194476380241L, j) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[5], 7190996725658347916L, j) /* invoke-custom */;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i9 = 1; i9 < 8; i9++) {
            bArr[i9] = (byte) ((j << (i9 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[14];
        int i10 = 0;
        String str = "\u0011¡\u0099ó$ë¼Ù\u0010êW½²\u0090õ\u000b9«%sØ7\u00158ñ µH¾u\u0091æ0~dõ\u0086\u001c¤ñ\u0011&½_D\u001f¾\u0012_ð\u0012ðÐdÞ¯¼Ö .óÙ_@aÓ¨Þ\u0005ø\u0003\u001ai\u001c\u008e»\u009a\u0001êvc\u000e\"ko\u0004\u0087*ª¶? ªÀ üâèý\f¿e<\u0018ØØ${¦U\u0094«E\u0001]PÜGÞhqÕ\u008a\u0007\b\u008fVåéªg\n\u008c ¿+ÇÜÀã\u0097´\u0090k³\u0017V0\u0012Ô.ßtäóiâ\u0011è¢\u000b«\u0084]µê \u0016E'\u009fg\u0093äübZ\\ò\u001dþ3¾\u0003¢¤¡\u0083f\u0097~?ùF@Vý²º\u0010ØÝ¥\u0092\u009cfÐÚ\u0090ôº=nü¾ü µH¾u\u0091æ0~\u0014I\u009dÉ\u000e\u0013» \u0087%À¯1é(ä}º|f3\u008d\u008d\u0091 Öa\u000f\f¥\u001f5J(%\u0088+w_äýP\u0007\u0086Æt\u0004?_SðlC\u0096\u0013ø*\bÐ;ùQ&\"ÙH";
        int length = "\u0011¡\u0099ó$ë¼Ù\u0010êW½²\u0090õ\u000b9«%sØ7\u00158ñ µH¾u\u0091æ0~dõ\u0086\u001c¤ñ\u0011&½_D\u001f¾\u0012_ð\u0012ðÐdÞ¯¼Ö .óÙ_@aÓ¨Þ\u0005ø\u0003\u001ai\u001c\u008e»\u009a\u0001êvc\u000e\"ko\u0004\u0087*ª¶? ªÀ üâèý\f¿e<\u0018ØØ${¦U\u0094«E\u0001]PÜGÞhqÕ\u008a\u0007\b\u008fVåéªg\n\u008c ¿+ÇÜÀã\u0097´\u0090k³\u0017V0\u0012Ô.ßtäóiâ\u0011è¢\u000b«\u0084]µê \u0016E'\u009fg\u0093äübZ\\ò\u001dþ3¾\u0003¢¤¡\u0083f\u0097~?ùF@Vý²º\u0010ØÝ¥\u0092\u009cfÐÚ\u0090ôº=nü¾ü µH¾u\u0091æ0~\u0014I\u009dÉ\u000e\u0013» \u0087%À¯1é(ä}º|f3\u008d\u008d\u0091 Öa\u000f\f¥\u001f5J(%\u0088+w_äýP\u0007\u0086Æt\u0004?_SðlC\u0096\u0013ø*\bÐ;ùQ&\"ÙH".length();
        char cCharAt = '\b';
        int i11 = -1;
        while (true) {
            int i12 = i11 + 1;
            String strSubstring = str.substring(i12, i12 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i13 = i10;
                        i10++;
                        strArr[i13] = strIntern;
                        int i14 = i12 + cCharAt;
                        i2 = i14;
                        if (i14 >= length) {
                            p = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i15 = 1; i15 < 8; i15++) {
                                bArr2[i15] = (byte) ((j << (i15 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[3];
                            int i16 = 0;
                            int length2 = "êüü\u0011z9î\u009eWIøðü\u008f\u0001\u008f$êB¯\u0006q 2".length();
                            int i17 = 0;
                            do {
                                int i18 = i17;
                                i17 += 8;
                                byte[] bytes = "êüü\u0011z9î\u009eWIøðü\u008f\u0001\u008f$êB¯\u0006q 2".substring(i18, i17).getBytes("ISO-8859-1");
                                i16++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i17 < length2);
                            m = jArr;
                            n = new Integer[3];
                            KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17154, 6510818073679353427L ^ j) /* invoke-custom */];
                            kPropertyArr[0] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(os.class, strArr[0], strArr[4], 0));
                            kPropertyArr[1] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(os.class, strArr[12], strArr[10], 0));
                            kPropertyArr[2] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(os.class, strArr[13], strArr[3], 0));
                            kPropertyArr[3] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(os.class, strArr[8], strArr[6], 0));
                            kPropertyArr[4] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(os.class, strArr[1], strArr[7], 0));
                            kPropertyArr[5] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(os.class, strArr[5], strArr[9], 0));
                            kPropertyArr[(int) c(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24629, 3069662445821556071L ^ j) /* invoke-custom */] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(os.class, strArr[11], strArr[2], 0));
                            K = kPropertyArr;
                            D = new os(i6, i7, (byte) i8);
                            x = F(D, i3, true, null, 2, i4, null, (short) i5);
                            A = F(D, i3, false, null, 3, i4, null, (short) i5);
                            M = F(D, i3, false, null, 3, i4, null, (short) i5);
                            O = F(D, i3, false, null, 3, i4, null, (short) i5);
                            o = F(D, i3, false, null, 3, i4, null, (short) i5);
                            u = F(D, i3, false, null, 3, i4, null, (short) i5);
                            i = F(D, i3, false, null, 3, i4, null, (short) i5);
                            return;
                        }
                        cCharAt = str.charAt(i2);
                        break;
                        break;
                    default:
                        int i19 = i10;
                        i10++;
                        strArr[i19] = strIntern;
                        int i20 = i12 + cCharAt;
                        i11 = i20;
                        if (i20 < length) {
                        }
                        str = "«\u0094¨Fñ\t7ò\bÆ@ØÐà\u0086\u0000°";
                        length = "«\u0094¨Fñ\t7ò\bÆ@ØÐà\u0086\u0000°".length();
                        cCharAt = '\b';
                        i2 = -1;
                        break;
                        break;
                }
                i12 = i2 + 1;
                strSubstring = str.substring(i12, i12 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i11);
        }
    }

    public static void d(String[] strArr) {
        s = strArr;
    }

    public static String[] q() {
        return s;
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

    private static int c(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 30678;
        if (n[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) m[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) p.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    p.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/os", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            n[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return n[i3].intValue();
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iC)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iC;
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
            java.lang.String r1 = "su/catlean/os"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.os.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
