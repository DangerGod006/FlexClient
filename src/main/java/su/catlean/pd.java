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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/pd.class */
public final class pd extends gf {

    @NotNull
    public static final pd f;
    private static final long a = yz.a(3763233803705961437L, -4135775130737356960L, MethodHandles.lookup().lookupClass()).a(160838531008089L);
    private static final String[] b;
    private static final String[] c;
    private static final Map g;

    /* JADX WARN: Illegal instructions before constructor call */
    private pd(long j) {
        long j2 = a ^ j;
        super((char) (j2 >>> 48), (int) (((j2 ^ 130156062091631L) << 16) >>> 32), (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13547, 7214208543028376733L ^ j2) /* invoke-custom */, (char) ((r1 << 48) >>> 48));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00b2: INVOKE (r-1 I:su.catlean.pd), (r0 I:net.minecraft.class_332), (r1 I:long), (r2 I:java.lang.String) VIRTUAL call: su.catlean.pd.X(net.minecraft.class_332, long, java.lang.String):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @Override // su.catlean.gf
    public void h(long r12, @org.jetbrains.annotations.NotNull net.minecraft.class_332 r14) {
        /*
            r11 = this;
            r0 = r12
            r1 = r0; r0 = r0; 
            r2 = 106730335067037(0x611217b55b9d, double:5.27317919257483E-310)
            long r1 = r1 ^ r2
            r15 = r1
            r1 = r0; r2 = r0; 
            r2 = 116853176505585(0x6a47001394f1, double:5.7733140118833E-310)
            long r1 = r1 ^ r2
            r17 = r1
            r1 = r0; r2 = r0; 
            r2 = 100541977110631(0x5b7140d4a867, double:4.96743368553197E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            r19 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r21 = r2
            r0 = -5990947769900206742(0xacdbe0bea32df56a, double:-1.3364771522304728E-92)
            r1 = r12
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r1 = r14
            r2 = 17424(0x4410, float:2.4416E-41)
            r3 = 8670769436015217388(0x7854c2dcc3004aec, double:4.387207364840819E271)
            r4 = r12
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/pd;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "j"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r22 = r0
            r0 = r11
            r1 = r14
            su.catlean.nf r2 = su.catlean.nf.Z     // Catch: java.lang.NumberFormatException -> L61
            r3 = r19
            r4 = r21
            float r2 = r2.a(r3, r4)     // Catch: java.lang.NumberFormatException -> L61
            su.catlean.nf r3 = su.catlean.nf.Z     // Catch: java.lang.NumberFormatException -> L61
            r4 = r22
            if (r4 != 0) goto L88
            r4 = r15
            boolean r3 = r3.w(r4)     // Catch: java.lang.NumberFormatException -> L61 java.lang.NumberFormatException -> L7b
            if (r3 == 0) goto L85
            goto L6b
        L61:
            r1 = -6009886678615647284(0xac9897e854c31bcc, double:-7.368850369278154E-94)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L7b
            throw r0     // Catch: java.lang.NumberFormatException -> L7b
        L6b:
            r3 = 3215(0xc8f, float:4.505E-42)
            r4 = 6077842006547104369(0x5458d51a69300271, double:2.1216703049789568E98)
            r5 = r12
            long r4 = r4 ^ r5
            java.lang.String r3 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/pd;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "j"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r3, r4)     // Catch: java.lang.NumberFormatException -> L7b
            goto L8e
        L7b:
            r1 = -6009886678615647284(0xac9897e854c31bcc, double:-7.368850369278154E-94)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L85:
            su.catlean.nf r3 = su.catlean.nf.Z
        L88:
            float r3 = r3.p()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
        L8e:
            r4 = 20877(0x518d, float:2.9255E-41)
            r5 = 5924422710447791986(0x5237c710f37f5f72, double:1.182515418172683E88)
            r6 = r12
            long r5 = r5 ^ r6
            java.lang.String r4 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/pd;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "j"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r4, r5)
            r5 = r3; r3 = r4; r4 = r5; 
            r5 = 1529(0x5f9, float:2.143E-42)
            r6 = 7001809959180569348(0x612b6d0f89c00b04, double:1.2049540258784579E160)
            r7 = r12
            long r6 = r6 ^ r7
            java.lang.String r5 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/pd;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "j"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r5, r6)
            java.lang.String r2 = r2 + r3 + r4 + r5
            r3 = r17
            r4 = r3; r3 = r2; r2 = r4; 
            r-1.X(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.pd.h(long, net.minecraft.class_332):void");
    }

    static {
        int i;
        long j = (a ^ 72457318923244L) ^ 120025089873928L;
        g = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (r0 >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((r0 << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[5];
        int i3 = 0;
        String str = "\u009eCY\fF´\u0090ÁdAp\u008cT\u0080Sa\u0010¨\u0081~.áßÎ\u0092¤£®a):üÀ\u0010e¢u\u0001\u0017ØÏ|<\u0085ðÜÈ FC";
        int length = "\u009eCY\fF´\u0090ÁdAp\u008cT\u0080Sa\u0010¨\u0081~.áßÎ\u0092¤£®a):üÀ\u0010e¢u\u0001\u0017ØÏ|<\u0085ðÜÈ FC".length();
        char cCharAt = 16;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 >= length) {
                            b = strArr;
                            c = new String[5];
                            f = new pd(j);
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
                        str = "T\u008b&i@æ\u0015¢Iã\u0018\u0096Â/\u000eþ\u0018¼r8hV\u0083X¸=äBw\u0087%Aôöq 2Á\u0006«L";
                        length = "T\u008b&i@æ\u0015¢Iã\u0018\u0096Â/\u000eþ\u0018¼r8hV\u0083X¸=äBw\u0087%Aôöq 2Á\u0006«L".length();
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 9110;
        if (c[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) g.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i2] = b(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/pd", e);
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
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
            java.lang.String r1 = "su/catlean/pd"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.pd.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
