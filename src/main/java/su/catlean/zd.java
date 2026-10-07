package su.catlean;

import com.mojang.blaze3d.buffers.Std140Builder;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_11280;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/zd.class */
public final class zd implements class_11280.class_11281 {

    @NotNull
    private final Matrix4f A;

    @Nullable
    private final Matrix4f G;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map d = null;
    private static final long e = 0;

    public zd(@NotNull Matrix4f projection, int a2, int a3, int a4, @Nullable Matrix4f view) {
        Intrinsics.checkNotNullParameter(projection, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31498, 3099788824021794623L ^ ((((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a)) /* invoke-custom */);
        this.A = projection;
        this.G = view;
    }

    @NotNull
    public final Matrix4f n() {
        return this.A;
    }

    @Nullable
    public final Matrix4f U() {
        return this.G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.mojang.blaze3d.buffers.Std140Builder] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    public void method_71104(@NotNull ByteBuffer buffer) {
        long j = a ^ 14957564951829L;
        Object objPutMat4f = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8103537578194082892L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(buffer, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7408, 191627988942031248L ^ j) /* invoke-custom */);
        try {
            try {
                objPutMat4f = Std140Builder.intoBuffer(buffer).putMat4f(this.A);
                Matrix4f matrix4f = this.G;
                if (objPutMat4f == 0) {
                    if (matrix4f == null) {
                        matrix4f = new Matrix4f();
                    }
                    matrix4f = (Matrix4fc) matrix4f;
                }
                objPutMat4f.putMat4f(matrix4f);
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objPutMat4f, -8141395711454348467L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objPutMat4f, -8141395711454348467L, j) /* invoke-custom */;
        }
    }

    @NotNull
    public final Matrix4f d() {
        return this.A;
    }

    @Nullable
    public final Matrix4f J() {
        return this.G;
    }

    @NotNull
    public final zd u(long a2, @NotNull Matrix4f projection, @Nullable Matrix4f view) {
        long j = a ^ a2;
        long j2 = j ^ 55368600636004L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j2 << 32) >>> 48);
        int i3 = (int) ((j2 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(projection, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13176, 4064212633240964743L ^ j) /* invoke-custom */);
        return new zd(projection, i, i2, i3, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    public static zd i(int i, zd zdVar, int i2, Matrix4f matrix4f, short s, Matrix4f matrix4f2, int i3, Object obj) {
        long j = (((((long) i) << 32) | ((((long) i2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ a;
        long j2 = j ^ 3318375942600L;
        ?? r0 = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6734420288683290955L, j) /* invoke-custom */;
        try {
            r0 = i3 & 1;
            ?? r02 = r0;
            if (r0 == 0) {
                if (r0 != 0) {
                    matrix4f = zdVar.A;
                }
                r02 = i3 & 2;
            }
            if (r02 != 0) {
                matrix4f2 = zdVar.G;
            }
            return zdVar.u(j2, matrix4f, matrix4f2);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 6772560274849212850L, j) /* invoke-custom */;
        }
    }

    @NotNull
    public String toString() {
        long j = a ^ 59189522359043L;
        return (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29908, 895446534270615461L ^ j) /* invoke-custom */ + this.A + (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10845, 2617961216884842799L ^ j) /* invoke-custom */ + this.G + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    public int hashCode() {
        int iHashCode;
        long j = a ^ 125868162296540L;
        Object objHashCode = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2863431320196598659L, j) /* invoke-custom */;
        try {
            try {
                objHashCode = this.A.hashCode() * ((int) e);
                Matrix4f matrix4f = this.G;
                if (objHashCode != 0) {
                    iHashCode = matrix4f.hashCode();
                } else if (matrix4f == null) {
                    iHashCode = 0;
                } else {
                    matrix4f = this.G;
                    iHashCode = matrix4f.hashCode();
                }
                return objHashCode + iHashCode;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objHashCode, -2825291476007801724L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            objHashCode = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objHashCode, -2825291476007801724L, j) /* invoke-custom */;
            throw objHashCode;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
        /*
            r6 = this;
            long r0 = su.catlean.zd.a
            r1 = 86693766895277(0x4ed8f72e16ad, double:4.28324119315255E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = -2003485267318536180(0xe43230c3a8c0080c, double:-4.499060087186111E174)
            r1 = r8
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r10 = r0
            r0 = r6
            r1 = r10
            if (r1 != 0) goto L37
            r1 = r7
            if (r0 != r1) goto L36
            goto L2a
        L20:
            r1 = -1964782206884146955(0xe4bbb0fe21a990f5, double:-1.753323410814589E177)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L2c
            throw r0     // Catch: java.lang.NumberFormatException -> L2c
        L2a:
            r0 = 1
            return r0
        L2c:
            r1 = -1964782206884146955(0xe4bbb0fe21a990f5, double:-1.753323410814589E177)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L36:
            r0 = r7
        L37:
            r1 = r10
            if (r1 != 0) goto L5c
            boolean r0 = r0 instanceof su.catlean.zd     // Catch: java.lang.NumberFormatException -> L45 java.lang.NumberFormatException -> L51
            if (r0 != 0) goto L5b
            goto L4f
        L45:
            r1 = -1964782206884146955(0xe4bbb0fe21a990f5, double:-1.753323410814589E177)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L51
            throw r0     // Catch: java.lang.NumberFormatException -> L51
        L4f:
            r0 = 0
            return r0
        L51:
            r1 = -1964782206884146955(0xe4bbb0fe21a990f5, double:-1.753323410814589E177)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L5b:
            r0 = r7
        L5c:
            su.catlean.zd r0 = (su.catlean.zd) r0
            r11 = r0
            r0 = r6
            org.joml.Matrix4f r0 = r0.A     // Catch: java.lang.NumberFormatException -> L78
            r1 = r11
            org.joml.Matrix4f r1 = r1.A     // Catch: java.lang.NumberFormatException -> L78
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.NumberFormatException -> L78
            r1 = r10
            if (r1 != 0) goto L9a
            if (r0 != 0) goto L8e
            goto L82
        L78:
            r1 = -1964782206884146955(0xe4bbb0fe21a990f5, double:-1.753323410814589E177)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L84
            throw r0     // Catch: java.lang.NumberFormatException -> L84
        L82:
            r0 = 0
            return r0
        L84:
            r1 = -1964782206884146955(0xe4bbb0fe21a990f5, double:-1.753323410814589E177)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8e:
            r0 = r6
            org.joml.Matrix4f r0 = r0.G
            r1 = r11
            org.joml.Matrix4f r1 = r1.G
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
        L9a:
            r1 = r10
            if (r1 != 0) goto Lbc
            if (r0 != 0) goto Lbb
            goto Laf
        La5:
            r1 = -1964782206884146955(0xe4bbb0fe21a990f5, double:-1.753323410814589E177)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> Lb1
            throw r0     // Catch: java.lang.NumberFormatException -> Lb1
        Laf:
            r0 = 0
            return r0
        Lb1:
            r1 = -1964782206884146955(0xe4bbb0fe21a990f5, double:-1.753323410814589E177)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lbb:
            r0 = 1
        Lbc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zd.equals(java.lang.Object):boolean");
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 7132;
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
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/zd", e2);
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
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
            r1 = 1065353216(0x3f800000, float:1.0)
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
            java.lang.String r1 = "su/catlean/zd"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zd.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
