package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/jn.class */
@Serializable
public final class jn {

    @NotNull
    public static final g U = null;

    @NotNull
    private final String B;

    @NotNull
    private List q;

    @JvmField
    @NotNull
    private static final Lazy[] t = null;
    private static _g[] M;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map d = null;
    private static final long e = 0;

    public jn(long a2, char a3, @NotNull String id, @NotNull List widgets) {
        long j = ((a2 << 16) | ((((long) a3) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(704, 4266243120036484386L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(widgets, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23805, 298694981598628637L ^ j) /* invoke-custom */);
        this.B = id;
        this.q = widgets;
    }

    public jn(String str, List list, int i, int i2, short s, DefaultConstructorMarker defaultConstructorMarker, short s2) {
        this(((((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ a) >>> 16, (char) (((r0 ^ 43384758444136L) << 48) >>> 48), str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final String w() {
        return this.B;
    }

    @NotNull
    public final List B() {
        return this.q;
    }

    public final void L(@NotNull List list, byte a2, long a3) {
        Intrinsics.checkNotNullParameter(list, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30243, 1142413528939680517L ^ (((((long) a2) << 56) | ((a3 << 8) >>> 8)) ^ a)) /* invoke-custom */);
        this.q = list;
    }

    @NotNull
    public final String s() {
        return this.B;
    }

    @NotNull
    public final List Y() {
        return this.q;
    }

    @NotNull
    public final jn d(int a2, char a3, int a4, @NotNull String id, @NotNull List widgets) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a;
        int i = (int) (((j ^ 50417463165696L) << 48) >>> 48);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12868, 8830743015570709851L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(widgets, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18478, 605298873970878263L ^ j) /* invoke-custom */);
        return new jn(j >>> 16, (char) i, id, widgets);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    public static jn a(jn jnVar, long j, String str, List list, int i, Object obj, int i2) {
        long j2 = ((j << 32) | ((((long) i2) << 32) >>> 32)) ^ a;
        long j3 = j2 ^ 95906077603631L;
        int i3 = (int) (j2 >>> 32);
        int i4 = (int) ((j3 << 32) >>> 48);
        int i5 = (int) ((j3 << 48) >>> 48);
        ?? r0 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7207414037805081294L, j2) /* invoke-custom */;
        try {
            r0 = i & 1;
            ?? r02 = r0;
            if (r0 != 0) {
                if (r0 != 0) {
                    str = jnVar.B;
                }
                r02 = i & 2;
            }
            if (r02 != 0) {
                list = jnVar.q;
            }
            return jnVar.d(i3, (char) i4, i5, str, list);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -7257903626408597233L, j2) /* invoke-custom */;
        }
    }

    @NotNull
    public String toString() {
        long j = a ^ 19484694293168L;
        return (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10452, 3604426599621607640L ^ j) /* invoke-custom */ + this.B + (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22112, 4230560401371741806L ^ j) /* invoke-custom */ + this.q + ")";
    }

    public int hashCode() {
        long j = a ^ 7207105237533L;
        return (this.B.hashCode() * ((int) e)) + this.q.hashCode();
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
            long r0 = su.catlean.jn.a
            r1 = 29999840144672(0x1b48e1d0ad20, double:1.48218903962115E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = -7516751529151442585(0x97af224f480dd167, double:-1.3328093948411671E-194)
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
            r1 = -7560556094504934054(0x9713824a229e655a, double:-1.6311601723192923E-197)
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
            r1 = -7560556094504934054(0x9713824a229e655a, double:-1.6311601723192923E-197)
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
            boolean r0 = r0 instanceof su.catlean.jn     // Catch: java.lang.NumberFormatException -> L45 java.lang.NumberFormatException -> L51
            if (r0 != 0) goto L5b
            goto L4f
        L45:
            r1 = -7560556094504934054(0x9713824a229e655a, double:-1.6311601723192923E-197)
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
            r1 = -7560556094504934054(0x9713824a229e655a, double:-1.6311601723192923E-197)
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
            su.catlean.jn r0 = (su.catlean.jn) r0
            r11 = r0
            r0 = r6
            java.lang.String r0 = r0.B     // Catch: java.lang.NumberFormatException -> L78
            r1 = r11
            java.lang.String r1 = r1.B     // Catch: java.lang.NumberFormatException -> L78
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.NumberFormatException -> L78
            r1 = r10
            if (r1 == 0) goto L9a
            if (r0 != 0) goto L8e
            goto L82
        L78:
            r1 = -7560556094504934054(0x9713824a229e655a, double:-1.6311601723192923E-197)
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
            r1 = -7560556094504934054(0x9713824a229e655a, double:-1.6311601723192923E-197)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8e:
            r0 = r6
            java.util.List r0 = r0.q
            r1 = r11
            java.util.List r1 = r1.q
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
        L9a:
            r1 = r10
            if (r1 == 0) goto Lbc
            if (r0 != 0) goto Lbb
            goto Laf
        La5:
            r1 = -7560556094504934054(0x9713824a229e655a, double:-1.6311601723192923E-197)
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
            r1 = -7560556094504934054(0x9713824a229e655a, double:-1.6311601723192923E-197)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jn.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [kotlinx.serialization.encoding.CompositeEncoder] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void P(su.catlean.jn r6, kotlinx.serialization.encoding.CompositeEncoder r7, long r8, kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            long r0 = su.catlean.jn.a
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            kotlin.Lazy[] r0 = su.catlean.jn.t
            r12 = r0
            r0 = -8646208857879425334(0x88027eda7442ceca, double:-4.376233274161912E-270)
            r1 = r8
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r1 = r7
            r2 = r10
            r3 = 0
            r4 = r6
            java.lang.String r4 = r4.B
            r1.encodeStringElement(r2, r3, r4)
            r11 = r0
            r0 = r7
            r1 = r10
            r2 = 1
            boolean r0 = r0.shouldEncodeElementDefault(r1, r2)     // Catch: java.lang.NumberFormatException -> L37
            r1 = r11
            if (r1 == 0) goto L59
            if (r0 == 0) goto L4f
            goto L41
        L37:
            r1 = -8593185989100209417(0x88bededf1ed17af7, double:-1.4959215169256081E-266)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L45
            throw r0     // Catch: java.lang.NumberFormatException -> L45
        L41:
            r0 = 1
            goto L73
        L45:
            r1 = -8593185989100209417(0x88bededf1ed17af7, double:-1.4959215169256081E-266)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L4f:
            r0 = r6
            java.util.List r0 = r0.q
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
        L59:
            r1 = r11
            if (r1 == 0) goto L6f
            if (r0 != 0) goto L72
            goto L6e
        L64:
            r1 = -8593185989100209417(0x88bededf1ed17af7, double:-1.4959215169256081E-266)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6e:
            r0 = 1
        L6f:
            goto L73
        L72:
            r0 = 0
        L73:
            if (r0 == 0) goto L9c
            r0 = r7
            r1 = r10
            r2 = 1
            r3 = r12
            r4 = 1
            r3 = r3[r4]     // Catch: java.lang.NumberFormatException -> L92
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.NumberFormatException -> L92
            kotlinx.serialization.SerializationStrategy r3 = (kotlinx.serialization.SerializationStrategy) r3     // Catch: java.lang.NumberFormatException -> L92
            r4 = r6
            java.util.List r4 = r4.q     // Catch: java.lang.NumberFormatException -> L92
            r0.encodeSerializableElement(r1, r2, r3, r4)     // Catch: java.lang.NumberFormatException -> L92
            goto L9c
        L92:
            r1 = -8593185989100209417(0x88bededf1ed17af7, double:-1.4959215169256081E-266)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jn.P(su.catlean.jn, kotlinx.serialization.encoding.CompositeEncoder, long, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054 A[Catch: NumberFormatException -> 0x0069, TryCatch #1 {NumberFormatException -> 0x0069, blocks: (B:9:0x004c, B:12:0x0054, B:14:0x005a), top: B:26:0x004c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v18, types: [su.catlean.jn] */
    /* JADX WARN: Type inference failed for: r0v22, types: [su.catlean.jn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public jn(int r7, java.lang.String r8, char r9, java.util.List r10, kotlinx.serialization.internal.SerializationConstructorMarker r11, int r12, char r13) {
        /*
            r6 = this;
            r0 = r9
            long r0 = (long) r0
            r1 = 48
            long r0 = r0 << r1
            r1 = r12
            long r1 = (long) r1
            r2 = 32
            long r1 = r1 << r2
            r2 = 16
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            r1 = r13
            long r1 = (long) r1
            r2 = 48
            long r1 = r1 << r2
            r2 = 48
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            long r1 = su.catlean.jn.a
            long r0 = r0 ^ r1
            r14 = r0
            r0 = 8737875303408484235(0x79432b4b0f523f8b, double:1.3273580347279608E276)
            r1 = r14
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r16 = r0
            r0 = 1
            r1 = 1
            r2 = r7
            r1 = r1 & r2
            if (r0 == r1) goto L3d
            r0 = r7
            r1 = 1
            su.catlean.o1 r2 = su.catlean.o1.J
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r2.getDescriptor()
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(r0, r1, r2)
        L3d:
            r0 = r6
            r0.<init>()
            r0 = r12
            if (r0 <= 0) goto L50
            r0 = r6
            r1 = r16
            if (r1 == 0) goto L83
            r1 = r8
            r0.B = r1     // Catch: java.lang.NumberFormatException -> L69
        L50:
            r0 = r9
            if (r0 < 0) goto L61
            r0 = r7
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L74
            r0 = r6
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.NumberFormatException -> L69 java.lang.NumberFormatException -> L78
            r0.q = r1     // Catch: java.lang.NumberFormatException -> L69 java.lang.NumberFormatException -> L78
        L61:
            r0 = r16
            if (r0 != 0) goto L88
            goto L74
        L69:
            r1 = 8790898166481390518(0x79ff8b4e65c18bb6, double:4.473372146589597E279)
            r2 = r14
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L78
            throw r0     // Catch: java.lang.NumberFormatException -> L78
        L74:
            r0 = r6
            goto L83
        L78:
            r1 = 8790898166481390518(0x79ff8b4e65c18bb6, double:4.473372146589597E279)
            r2 = r14
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L83:
            r1 = r10
            r0.q = r1
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jn.<init>(int, java.lang.String, char, java.util.List, kotlinx.serialization.internal.SerializationConstructorMarker, int, char):void");
    }

    private static final KSerializer C() {
        return new ArrayListSerializer(j8.C);
    }

    public static final Lazy[] K() {
        return t;
    }

    public static void R(_g[] _gVarArr) {
        M = _gVarArr;
    }

    public static _g[] L() {
        return M;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 31046;
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
                throw new RuntimeException("su/catlean/jn", e2);
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
            java.lang.String r1 = "su/catlean/jn"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jn.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
