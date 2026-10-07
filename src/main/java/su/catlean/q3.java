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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_2815;
import net.minecraft.class_437;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/q3.class */
public final class q3 extends _g {

    @NotNull
    public static final q3 h;
    static final /* synthetic */ KProperty[] B;

    @NotNull
    private static final av J;

    @Nullable
    private static class_437 f;

    @Nullable
    private static class_1703 e;
    private static final long a = yz.a(-5424758096061454398L, -4694255686044831542L, MethodHandles.lookup().lookupClass()).a(152072564617518L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /* JADX WARN: Illegal instructions before constructor call */
    private q3(short s, long j) {
        long j2 = ((((long) s) << 48) | ((j << 16) >>> 16)) ^ a;
        super((String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15287, 8259995435950368382L ^ j2) /* invoke-custom */, jt.I(), null, 4, null, j2 ^ 111519799231437L);
    }

    private final lj V(char c2, char c3, int i) {
        return (lj) J.E(this, ((((((long) c2) << 48) | ((((long) c3) << 48) >>> 16)) | ((((long) i) << 32) >>> 32)) ^ a) ^ 137900614967419L, B[0]);
    }

    private final void V(lj ljVar, long j) {
        J.b(this, (a ^ j) ^ 64632425422710L, B[0], ljVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v18, types: [net.minecraft.class_437] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    @Flow
    private final void Q(PlayerUpdateEvent playerUpdateEvent) {
        long j = a ^ 100969442509571L;
        long j2 = j ^ 15116119862746L;
        long j3 = j ^ 112695715016572L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j3 << 16) >>> 48);
        int i3 = (int) ((j3 << 32) >>> 32);
        long j4 = j ^ 35079654978544L;
        int i4 = (int) (j >>> 48);
        int i5 = (int) ((j4 << 16) >>> 32);
        int i6 = (int) ((j4 << 48) >>> 48);
        long j5 = j ^ 49593840722940L;
        ?? r0 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5673852728804488609L, j) /* invoke-custom */;
        try {
            try {
                r0 = zf.v(j5).field_7512 instanceof class_1707;
                ?? K = r0;
                if (r0 != 0) {
                    if (r0 != 0) {
                        f = zf.F(j2).field_1755;
                        e = zf.v(j5).field_7512;
                    }
                    K = bx.k((short) i4, i5, (char) i6, V((char) i, (char) i2, i3).X());
                }
                if (K != 0) {
                    try {
                        try {
                            K = f;
                            if (K == 0) {
                                return;
                            }
                            zf.F(j2).method_1507(f);
                            class_746 class_746VarV = zf.v(j5);
                            class_1703 class_1703Var = e;
                            Intrinsics.checkNotNull(class_1703Var);
                            class_746VarV.field_7512 = class_1703Var;
                        } catch (NumberFormatException unused) {
                            K = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(K, -5674235169240312383L, j) /* invoke-custom */;
                            throw K;
                        }
                    } catch (NumberFormatException unused2) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(K, -5674235169240312383L, j) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5674235169240312383L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5674235169240312383L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v9, types: [net.minecraft.class_437] */
    @Flow
    private final void L(SendPacket sendPacket) {
        Object obj = a ^ 27969464920847L;
        try {
            try {
                if (sendPacket.getPacket() instanceof class_2815) {
                    obj = f;
                    if (obj != 0) {
                        sendPacket.cancel();
                    }
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -2788480743500448307L, obj) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -2788480743500448307L, obj) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0042: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @Override // su.catlean._g
    public void b(long r8) {
        /*
            r7 = this;
            r0 = r8
            r1 = r0; r0 = r0; 
            r2 = 29291705890158(0x1aa401b9756e, double:1.4472025588413E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r0 = 1411134032729270408(0x13955aed1f4ae888, double:2.477914668093471E-214)
            r1 = r8
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L5a
            net.minecraft.class_1703 r0 = su.catlean.q3.e     // Catch: java.lang.NumberFormatException -> L21 java.lang.NumberFormatException -> L48
            if (r0 == 0) goto L52
            goto L2b
        L21:
            r1 = 1411358145570649878(0x139626c17597b716, double:2.5703014938536175E-214)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L48
            throw r0     // Catch: java.lang.NumberFormatException -> L48
        L2b:
            net.minecraft.class_2815 r0 = new net.minecraft.class_2815     // Catch: java.lang.NumberFormatException -> L48
            r1 = r0
            net.minecraft.class_1703 r2 = su.catlean.q3.e     // Catch: java.lang.NumberFormatException -> L48
            r3 = r2
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.NumberFormatException -> L48
            int r2 = r2.field_7763     // Catch: java.lang.NumberFormatException -> L48
            r1.<init>(r2)     // Catch: java.lang.NumberFormatException -> L48
            net.minecraft.class_2596 r0 = (net.minecraft.class_2596) r0     // Catch: java.lang.NumberFormatException -> L48
            r1 = r10
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.NumberFormatException -> L48
            su.catlean._r.a(r-1, r0)     // Catch: java.lang.NumberFormatException -> L48
            goto L52
        L48:
            r1 = 1411358145570649878(0x139626c17597b716, double:2.5703014938536175E-214)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r0 = 0
            su.catlean.q3.f = r0
            r0 = 0
            su.catlean.q3.e = r0
        L5a:
            r0 = r12
            r1 = r8
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L69
            if (r0 != 0) goto L7f
            r0 = 5
            su.catlean._g[] r0 = new su.catlean._g[r0]     // Catch: java.lang.NumberFormatException -> L75
        L69:
            r1 = 1397120299992947038(0x13639182b591195e, double:2.83823559301719E-215)
            r2 = r8
            call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)V}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L75
            goto L7f
        L75:
            r1 = 1411358145570649878(0x139626c17597b716, double:2.5703014938536175E-214)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q3.b(long):void");
    }

    static {
        int i;
        long j = a ^ 139081847285413L;
        int i2 = (int) (j >>> 48);
        long j2 = ((j ^ 63938292004273L) << 16) >>> 16;
        long j3 = j ^ 100550563575765L;
        long j4 = j ^ 138881288852678L;
        int i3 = (int) (j >>> 32);
        int i4 = (int) ((j4 << 32) >>> 48);
        int i5 = (int) ((j4 << 48) >>> 48);
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i6 = 1; i6 < 8; i6++) {
            bArr[i6] = (byte) ((j << (i6 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[4];
        int i7 = 0;
        String str = "$8\u000efSþeOC¸b¹¬³\u001f2 Ô\u0015Ö\u00850Ò\u008fõÛË\u001d;\u0004Í:É\u0084\u0016f,@`\u0093\u0091*<\u0010\bG_r\b";
        int length = "$8\u000efSþeOC¸b¹¬³\u001f2 Ô\u0015Ö\u00850Ò\u008fõÛË\u001d;\u0004Í:É\u0084\u0016f,@`\u0093\u0091*<\u0010\bG_r\b".length();
        char cCharAt = 16;
        int i8 = -1;
        while (true) {
            int i9 = i8 + 1;
            String strSubstring = str.substring(i9, i9 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i10 = i7;
                        i7++;
                        strArr[i10] = strIntern;
                        int i11 = i9 + cCharAt;
                        i = i11;
                        if (i11 >= length) {
                            b = strArr;
                            c = new String[4];
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i12 = 1; i12 < 8; i12++) {
                                bArr2[i12] = (byte) ((j << (i12 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[2];
                            int i13 = 0;
                            int length2 = "qR\fî]:\u009b`bÏ¡\u0010\u0091\u0082ðÆ".length();
                            int i14 = 0;
                            do {
                                int i15 = i14;
                                i14 += 8;
                                byte[] bytes = "qR\fî]:\u009b`bÏ¡\u0010\u0091\u0082ðÆ".substring(i15, i14).getBytes("ISO-8859-1");
                                i13++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i14 < length2);
                            B = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(q3.class, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14283, 5487880285816122400L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23150, 5490222123895947652L ^ j) /* invoke-custom */, 0))};
                            h = new q3((short) i2, j2);
                            J = yp.J(h, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16003, 1994717286229009770L ^ j) /* invoke-custom */, new lj(-1, false, j3, false, (int) jArr[0], null), null, i3, null, i4, (char) i5, (int) jArr[1], null);
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i16 = i7;
                        i7++;
                        strArr[i16] = strIntern;
                        int i17 = i9 + cCharAt;
                        i8 = i17;
                        if (i17 < length) {
                        }
                        str = "Åýñg \u0083Jîºi Á!»\u0010\u0096l2lsp\"í\u001fÈZ\u0006\t_\nî\u00058)Ïóç\u0093Å\u001cG\u0015îÈbL¼\u0018å´FÑÚ·\u0089\u0096\u0083H\u0092K7tþ_{Ó\u0003µ½ú\u001dÕõ\u0096Á\u009d\u008buÝh\u0092õh¢\tp\u0095,Ò";
                        length = "Åýñg \u0083Jîºi Á!»\u0010\u0096l2lsp\"í\u001fÈZ\u0006\t_\nî\u00058)Ïóç\u0093Å\u001cG\u0015îÈbL¼\u0018å´FÑÚ·\u0089\u0096\u0083H\u0092K7tþ_{Ó\u0003µ½ú\u001dÕõ\u0096Á\u009d\u008buÝh\u0092õh¢\tp\u0095,Ò".length();
                        cCharAt = ' ';
                        i = -1;
                        break;
                        break;
                }
                i9 = i + 1;
                strSubstring = str.substring(i9, i9 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i8);
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String b(byte[] bArr) {
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

    private static String b(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 20188;
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
                c[i2] = b(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/q3", e2);
            }
        }
        return c[i2];
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
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
            java.lang.String r1 = "su/catlean/q3"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q3.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
