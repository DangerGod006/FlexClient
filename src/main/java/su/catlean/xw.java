package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/xw.class */
public final class xw extends f6 {

    @NotNull
    private c2 t;

    @NotNull
    private final fd l;
    private static String[] Y;
    private static final long a = 0;
    private static final String[] c = null;
    private static final String[] d = null;
    private static final Map b = null;
    private static final long[] e = null;
    private static final Integer[] f = null;
    private static final Map g = null;
    private static final long h = 0;

    public xw(long a2, @NotNull c2 proxy) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(proxy, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25125, 2760494011942793595L ^ j) /* invoke-custom */);
        this.t = proxy;
        this.l = new fd(_s.OUT_QUINT, h, j ^ 20483073149542L);
    }

    @NotNull
    public final c2 b() {
        return this.t;
    }

    public final void J(long a2, @NotNull c2 c2Var) {
        Intrinsics.checkNotNullParameter(c2Var, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19849, 4432835804135997759L ^ (a ^ a2)) /* invoke-custom */);
        this.t = c2Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0297: INVOKE 
          (r-1 I:su.catlean.c6)
          (r0 I:net.minecraft.class_332)
          (r1 I:java.lang.String)
          (r2 I:long)
          (r3 I:float)
          (r4 I:float)
          (r5 I:java.awt.Color)
         VIRTUAL call: su.catlean.c6.e(net.minecraft.class_332, java.lang.String, long, float, float, java.awt.Color):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @Override // su.catlean.f6
    public void o(long r24, @org.jetbrains.annotations.NotNull net.minecraft.class_332 r26, float r27, float r28, float r29, float r30) {
        /*
            Method dump skipped, instruction units count: 1029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.xw.o(long, net.minecraft.class_332, float, float, float, float):void");
    }

    @Override // su.catlean.f6
    public boolean P(float x, float y, int button, long a2) {
        return false;
    }

    public static void R(String[] strArr) {
        Y = strArr;
    }

    public static String[] I() {
        return Y;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 15096;
        if (d[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) b.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    b.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i2] = a(((Cipher) objArr[0]).doFinal(c[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/xw", e2);
            }
        }
        return d[i2];
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
            r1 = 11446(0x2cb6, float:1.6039E-41)
            r2 = 0
            throw r2
            java.lang.invoke.MethodHandle r-3 = r-3.asCollector(r-2, r-1)
            r-2 = 0
            r-1 = 3
            java.lang.Object[] r-1 = new java.lang.Object[r-1]
            r0 = r-1
            r1 = 0
            r2 = r8
            r0[r1] = r2
            r0 = r-1
            r1 = 1
            r2 = r11
            r0[r1] = r2
            r0 = r-1
            r1 = 2
            r2 = r9
            r0[r1] = r2
            java.lang.invoke.MethodHandle r-3 = java.lang.invoke.MethodHandles.insertArguments(r-3, r-2, r-1)
            r-2 = r10
            java.lang.invoke.MethodHandle r-3 = java.lang.invoke.MethodHandles.explicitCastArguments(r-3, r-2)
            r-4.setTarget(r-3)
            goto L62
            r12 = r-5
            java.lang.RuntimeException r-5 = new java.lang.RuntimeException
            r-4 = r-5
            java.lang.StringBuilder r-3 = new java.lang.StringBuilder
            r-2 = r-3
            r-2.<init>()
            java.lang.String r-2 = "su/catlean/xw"
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            java.lang.String r-2 = " : "
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            r-2 = r9
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            java.lang.String r-2 = " : "
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            r-2 = r10
            java.lang.String r-2 = r-2.toString()
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            java.lang.String r-3 = r-3.toString()
            r-2 = r12
            r-4.<init>(r-3, r-2)
            throw r-5
            r-4 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.xw.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 19980;
        if (f[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) g.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/xw", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            f[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return f[i2].intValue();
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iB)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iB;
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
            r1 = 11446(0x2cb6, float:1.6039E-41)
            r2 = 0
            throw r2
            java.lang.invoke.MethodHandle r-3 = r-3.asCollector(r-2, r-1)
            r-2 = 0
            r-1 = 3
            java.lang.Object[] r-1 = new java.lang.Object[r-1]
            r0 = r-1
            r1 = 0
            r2 = r8
            r0[r1] = r2
            r0 = r-1
            r1 = 1
            r2 = r11
            r0[r1] = r2
            r0 = r-1
            r1 = 2
            r2 = r9
            r0[r1] = r2
            java.lang.invoke.MethodHandle r-3 = java.lang.invoke.MethodHandles.insertArguments(r-3, r-2, r-1)
            r-2 = r10
            java.lang.invoke.MethodHandle r-3 = java.lang.invoke.MethodHandles.explicitCastArguments(r-3, r-2)
            r-4.setTarget(r-3)
            goto L62
            r12 = r-5
            java.lang.RuntimeException r-5 = new java.lang.RuntimeException
            r-4 = r-5
            java.lang.StringBuilder r-3 = new java.lang.StringBuilder
            r-2 = r-3
            r-2.<init>()
            java.lang.String r-2 = "su/catlean/xw"
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            java.lang.String r-2 = " : "
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            r-2 = r9
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            java.lang.String r-2 = " : "
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            r-2 = r10
            java.lang.String r-2 = r-2.toString()
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            java.lang.String r-3 = r-3.toString()
            r-2 = r12
            r-4.<init>(r-3, r-2)
            throw r-5
            r-4 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.xw.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
