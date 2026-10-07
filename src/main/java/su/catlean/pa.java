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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/pa.class */
@Serializable
public final class pa {

    @NotNull
    public static final l4 t = null;
    private final long L;

    @Nullable
    private final Long N;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map d = null;
    private static final long e = 0;

    public pa(long start, @Nullable Long end) {
        this.L = start;
        this.N = end;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pa(short s, int i, long j, char c2, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i2 & 2) != 0 ? null : l);
        long j2 = (((((long) s) << 48) | ((((long) i) << 32) >>> 16)) | ((((long) c2) << 48) >>> 48)) ^ a;
    }

    public final long M() {
        return this.L;
    }

    @Nullable
    public final Long e() {
        return this.N;
    }

    public final long B() {
        return this.L;
    }

    @Nullable
    public final Long i() {
        return this.N;
    }

    @NotNull
    public final pa W(long start, @Nullable Long end) {
        return new pa(start, end);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static pa G(pa paVar, long j, long j2, Long l, int i, Object obj) {
        long j3 = a ^ j2;
        ?? r0 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3361732830364849267L, j3) /* invoke-custom */;
        try {
            r0 = i & 1;
            ?? r02 = r0;
            if (r0 != 0) {
                if (r0 != 0) {
                    j = paVar.L;
                }
                r02 = i & 2;
            }
            if (r02 != 0) {
                l = paVar.N;
            }
            return paVar.W(j, l);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 3402013519954315308L, j3) /* invoke-custom */;
        }
    }

    @NotNull
    public String toString() {
        long j = a ^ 69976499656371L;
        long j2 = this.L;
        Long l = this.N;
        String strQ = (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12327, 8461471617016255256L ^ j) /* invoke-custom */;
        return strQ + j2 + strQ + (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2127, 7911224417043573617L ^ j) /* invoke-custom */ + l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    public int hashCode() {
        int iHashCode;
        long j = a ^ 51825561848752L;
        Object objHashCode = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4569614700411110847L, j) /* invoke-custom */;
        try {
            try {
                objHashCode = Long.hashCode(this.L) * ((int) e);
                Long l = this.N;
                if (objHashCode == 0) {
                    iHashCode = l.hashCode();
                } else if (l == null) {
                    iHashCode = 0;
                } else {
                    l = this.N;
                    iHashCode = l.hashCode();
                }
                return objHashCode + iHashCode;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objHashCode, -4538413656445426146L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            objHashCode = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objHashCode, -4538413656445426146L, j) /* invoke-custom */;
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
            long r0 = su.catlean.pa.a
            r1 = 131877998432901(0x77f13d401285, double:6.5156388468002E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = -7376843998718860428(0x99a02f77a4e3e374, double:-2.975888341881708E-185)
            r1 = r8
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r10 = r0
            r0 = r6
            r1 = r10
            if (r1 == 0) goto L37
            r1 = r7
            if (r0 != r1) goto L36
            goto L2a
        L20:
            r1 = -7480188707396534485(0x983108009abdbf2b, double:-3.732927319100172E-192)
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
            r1 = -7480188707396534485(0x983108009abdbf2b, double:-3.732927319100172E-192)
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
            if (r1 == 0) goto L5c
            boolean r0 = r0 instanceof su.catlean.pa     // Catch: java.lang.NumberFormatException -> L45 java.lang.NumberFormatException -> L51
            if (r0 != 0) goto L5b
            goto L4f
        L45:
            r1 = -7480188707396534485(0x983108009abdbf2b, double:-3.732927319100172E-192)
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
            r1 = -7480188707396534485(0x983108009abdbf2b, double:-3.732927319100172E-192)
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
            su.catlean.pa r0 = (su.catlean.pa) r0
            r11 = r0
            r0 = r6
            long r0 = r0.L     // Catch: java.lang.NumberFormatException -> L76
            r1 = r11
            long r1 = r1.L     // Catch: java.lang.NumberFormatException -> L76
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = r10
            if (r1 == 0) goto L98
            if (r0 == 0) goto L8c
            goto L80
        L76:
            r1 = -7480188707396534485(0x983108009abdbf2b, double:-3.732927319100172E-192)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L82
            throw r0     // Catch: java.lang.NumberFormatException -> L82
        L80:
            r0 = 0
            return r0
        L82:
            r1 = -7480188707396534485(0x983108009abdbf2b, double:-3.732927319100172E-192)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8c:
            r0 = r6
            java.lang.Long r0 = r0.N
            r1 = r11
            java.lang.Long r1 = r1.N
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
        L98:
            r1 = r10
            if (r1 == 0) goto Lba
            if (r0 != 0) goto Lb9
            goto Lad
        La3:
            r1 = -7480188707396534485(0x983108009abdbf2b, double:-3.732927319100172E-192)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> Laf
            throw r0     // Catch: java.lang.NumberFormatException -> Laf
        Lad:
            r0 = 0
            return r0
        Laf:
            r1 = -7480188707396534485(0x983108009abdbf2b, double:-3.732927319100172E-192)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lb9:
            r0 = 1
        Lba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.pa.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [kotlinx.serialization.encoding.CompositeEncoder] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @JvmStatic
    public static final void Z(long j, pa paVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor, byte b2) {
        long j2 = ((j << 8) | ((((long) b2) << 56) >>> 56)) ^ a;
        ?? ShouldEncodeElementDefault = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2085309356539864613L, j2) /* invoke-custom */;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, paVar.L);
        try {
            ShouldEncodeElementDefault = compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1);
            ?? r0 = ShouldEncodeElementDefault;
            if (ShouldEncodeElementDefault != 0) {
                if (ShouldEncodeElementDefault != 0) {
                    r0 = 1;
                } else {
                    try {
                        ShouldEncodeElementDefault = paVar.N;
                        r0 = ShouldEncodeElementDefault != 0 ? 1 : 0;
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(ShouldEncodeElementDefault, -2117156611410967164L, j2) /* invoke-custom */;
                    }
                }
            }
            if (r0 != 0) {
                try {
                    r0 = compositeEncoder;
                    r0.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, paVar.N);
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -2117156611410967164L, j2) /* invoke-custom */;
                }
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(ShouldEncodeElementDefault, -2117156611410967164L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[Catch: NumberFormatException -> 0x0060, TryCatch #1 {NumberFormatException -> 0x0060, blocks: (B:9:0x0043, B:12:0x004c, B:14:0x0053), top: B:26:0x0043, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.pa] */
    /* JADX WARN: Type inference failed for: r0v21, types: [su.catlean.pa] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public pa(long r7, short r9, int r10, long r11, java.lang.Long r13, kotlinx.serialization.internal.SerializationConstructorMarker r14) {
        /*
            r6 = this;
            r0 = r7
            r1 = 16
            long r0 = r0 << r1
            r1 = r9
            long r1 = (long) r1
            r2 = 48
            long r1 = r1 << r2
            r2 = 48
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            long r1 = su.catlean.pa.a
            long r0 = r0 ^ r1
            r15 = r0
            r0 = -2449271169766939434(0xde0270d90f6fa4d6, double:-7.19594729611635E144)
            r1 = r15
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r17 = r0
            r0 = 1
            r1 = 1
            r2 = r10
            r1 = r1 & r2
            if (r0 == r1) goto L33
            r0 = r10
            r1 = 1
            su.catlean.we r2 = su.catlean.we.i
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r2.getDescriptor()
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(r0, r1, r2)
        L33:
            r0 = r6
            r0.<init>()
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L48
            r0 = r6
            r1 = r17
            if (r1 == 0) goto L7a
            r1 = r11
            r0.L = r1     // Catch: java.lang.NumberFormatException -> L60
        L48:
            r0 = r9
            if (r0 <= 0) goto L58
            r0 = r10
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L6b
            r0 = r6
            r1 = 0
            r0.N = r1     // Catch: java.lang.NumberFormatException -> L60 java.lang.NumberFormatException -> L6f
        L58:
            r0 = r17
            if (r0 != 0) goto L7f
            goto L6b
        L60:
            r1 = -2336427376013870967(0xdf9357ae3131f889, double:-2.532622537433319E152)
            r2 = r15
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L6f
            throw r0     // Catch: java.lang.NumberFormatException -> L6f
        L6b:
            r0 = r6
            goto L7a
        L6f:
            r1 = -2336427376013870967(0xdf9357ae3131f889, double:-2.532622537433319E152)
            r2 = r15
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L7a:
            r1 = r13
            r0.N = r1
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.pa.<init>(long, short, int, long, java.lang.Long, kotlinx.serialization.internal.SerializationConstructorMarker):void");
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 32711;
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
                throw new RuntimeException("su/catlean/pa", e2);
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
            java.lang.String r1 = "su/catlean/pa"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.pa.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
