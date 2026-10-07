package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/d_.class */
@Serializable
public final class d_ {

    @NotNull
    public static final c3 r = null;
    private float H;
    private float I;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map d = null;
    private static final long e = 0;

    public d_(float x, float y) {
        this.H = x;
        this.I = y;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d_(int i, float f, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker, int i3) {
        this((i2 & 1) != 0 ? 0.5f : f, (i2 & 2) != 0 ? 0.5f : f2);
        long j = ((((long) i) << 32) | ((((long) i3) << 32) >>> 32)) ^ a;
    }

    public final float C() {
        return this.H;
    }

    public final void y(float f) {
        this.H = f;
    }

    public final float c() {
        return this.I;
    }

    public final void J(float f) {
        this.I = f;
    }

    public final float G() {
        return this.H;
    }

    public final float P() {
        return this.I;
    }

    @NotNull
    public final d_ m(float x, float y) {
        return new d_(x, y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static d_ D(d_ d_Var, float f, float f2, int i, long j, Object obj) {
        long j2 = a ^ j;
        ?? r0 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4094112085556462181L, j2) /* invoke-custom */;
        try {
            r0 = i & 1;
            ?? r02 = r0;
            if (r0 == 0) {
                if (r0 != 0) {
                    f = d_Var.H;
                }
                r02 = i & 2;
            }
            if (r02 != 0) {
                f2 = d_Var.I;
            }
            return d_Var.m(f, f2);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -4037947764366936939L, j2) /* invoke-custom */;
        }
    }

    @NotNull
    public String toString() {
        long j = a ^ 126365811796436L;
        return (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15628, 6803637108100067483L ^ j) /* invoke-custom */ + this.H + (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28940, 4413341727980174490L ^ j) /* invoke-custom */ + this.I + ")";
    }

    public int hashCode() {
        long j = a ^ 890749828987L;
        return (Float.hashCode(this.H) * ((int) e)) + Float.hashCode(this.I);
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
            long r0 = su.catlean.d_.a
            r1 = 54733178359974(0x31c78fa750a6, double:2.70417831153647E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = 4023640159958273379(0x37d6d768464f0d63, double:1.0488272514251943E-39)
            r1 = r8
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r10 = r0
            r0 = r6
            r1 = r10
            if (r1 != 0) goto L37
            r1 = r7
            if (r0 != r1) goto L36
            goto L2a
        L20:
            r1 = 3967194295476782189(0x370e4e3150d9846d, double:1.6986786612895975E-43)
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
            r1 = 3967194295476782189(0x370e4e3150d9846d, double:1.6986786612895975E-43)
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
            boolean r0 = r0 instanceof su.catlean.d_     // Catch: java.lang.NumberFormatException -> L45 java.lang.NumberFormatException -> L51
            if (r0 != 0) goto L5b
            goto L4f
        L45:
            r1 = 3967194295476782189(0x370e4e3150d9846d, double:1.6986786612895975E-43)
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
            r1 = 3967194295476782189(0x370e4e3150d9846d, double:1.6986786612895975E-43)
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
            su.catlean.d_ r0 = (su.catlean.d_) r0
            r11 = r0
            r0 = r6
            float r0 = r0.H     // Catch: java.lang.NumberFormatException -> L78
            r1 = r11
            float r1 = r1.H     // Catch: java.lang.NumberFormatException -> L78
            int r0 = java.lang.Float.compare(r0, r1)     // Catch: java.lang.NumberFormatException -> L78
            r1 = r10
            if (r1 != 0) goto L9a
            if (r0 == 0) goto L8e
            goto L82
        L78:
            r1 = 3967194295476782189(0x370e4e3150d9846d, double:1.6986786612895975E-43)
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
            r1 = 3967194295476782189(0x370e4e3150d9846d, double:1.6986786612895975E-43)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8e:
            r0 = r6
            float r0 = r0.I
            r1 = r11
            float r1 = r1.I
            int r0 = java.lang.Float.compare(r0, r1)
        L9a:
            r1 = r10
            if (r1 != 0) goto Lbc
            if (r0 == 0) goto Lbb
            goto Laf
        La5:
            r1 = 3967194295476782189(0x370e4e3150d9846d, double:1.6986786612895975E-43)
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
            r1 = 3967194295476782189(0x370e4e3150d9846d, double:1.6986786612895975E-43)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.d_.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:18:0x0051
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @kotlin.jvm.JvmStatic
    public static final void I(long r7, su.catlean.d_ r9, kotlinx.serialization.encoding.CompositeEncoder r10, kotlinx.serialization.descriptors.SerialDescriptor r11) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.d_.I(long, su.catlean.d_, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d A[EXC_TOP_SPLITTER, PHI: r0
  0x006d: PHI (r0v13 ??) = (r0v12 ??), (r0v30 ??) binds: [B:16:0x006a, B:9:0x004c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.d_] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [su.catlean.d_] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d_(int r7, float r8, short r9, int r10, float r11, int r12, kotlinx.serialization.internal.SerializationConstructorMarker r13) {
        /*
            r6 = this;
            r0 = r9
            long r0 = (long) r0
            r1 = 48
            long r0 = r0 << r1
            r1 = r10
            long r1 = (long) r1
            r2 = 32
            long r1 = r1 << r2
            r2 = 16
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            r1 = r12
            long r1 = (long) r1
            r2 = 48
            long r1 = r1 << r2
            r2 = 48
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            long r1 = su.catlean.d_.a
            long r0 = r0 ^ r1
            r14 = r0
            r0 = 5948394425362638905(0x528cf136c3a76839, double:4.6059678092625265E89)
            r1 = r14
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r16 = r0
            r0 = 0
            r1 = r7
            r0 = r0 & r1
            if (r0 == 0) goto L3c
            r0 = r7
            r1 = 0
            su.catlean.yc r2 = su.catlean.yc.k
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r2.getDescriptor()
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(r0, r1, r2)
        L3c:
            r0 = r6
            r0.<init>()
            r0 = r16
            r1 = r9
            if (r1 < 0) goto L6a
            if (r0 != 0) goto L63
            r0 = r7
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L6d
            r0 = r6
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.H = r1     // Catch: java.lang.NumberFormatException -> L58
            goto L63
        L58:
            r1 = 5932481438681260343(0x5254686fd531e137, double:4.0597403767055676E88)
            r2 = r14
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L63:
            r0 = r12
            if (r0 < 0) goto L80
            r0 = r16
        L6a:
            if (r0 == 0) goto L80
        L6d:
            r0 = r6
            r1 = r8
            r0.H = r1     // Catch: java.lang.NumberFormatException -> L75
            goto L80
        L75:
            r1 = 5932481438681260343(0x5254686fd531e137, double:4.0597403767055676E88)
            r2 = r14
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L80:
            r0 = r9
            if (r0 < 0) goto La9
            r0 = r7
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto La3
            r0 = r6
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.I = r1     // Catch: java.lang.NumberFormatException -> L98 java.lang.NumberFormatException -> Lac
            r0 = r16
            if (r0 == 0) goto Lb7
            goto La3
        L98:
            r1 = 5932481438681260343(0x5254686fd531e137, double:4.0597403767055676E88)
            r2 = r14
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> Lac
            throw r0     // Catch: java.lang.NumberFormatException -> Lac
        La3:
            r0 = r6
            r1 = r11
            r0.I = r1     // Catch: java.lang.NumberFormatException -> Lac
        La9:
            goto Lb7
        Lac:
            r1 = 5932481438681260343(0x5254686fd531e137, double:4.0597403767055676E88)
            r2 = r14
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.d_.<init>(int, float, short, int, float, int, kotlinx.serialization.internal.SerializationConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d_(long j) {
        long j2 = a ^ j;
        this((int) (j2 >>> 32), 0.0f, 0.0f, 3, null, (int) (((j2 ^ 138393852029368L) << 32) >>> 32));
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 17021;
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
                throw new RuntimeException("su/catlean/d_", e2);
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
            java.lang.String r1 = "su/catlean/d_"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.d_.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
