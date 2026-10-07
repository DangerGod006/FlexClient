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

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/y_.class */
@Serializable
public final class y_ {

    @NotNull
    public static final yn v = null;

    @NotNull
    private final String V;

    @NotNull
    private List z;

    @JvmField
    @NotNull
    private static final Lazy[] X = null;
    private static String[] Z;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map d = null;
    private static final long e = 0;

    public y_(short a2, int a3, char a4, @NotNull String id, @NotNull List modules) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28458, 7077392197399984670L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(modules, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1556, 3231014226848437027L ^ j) /* invoke-custom */);
        this.V = id;
        this.z = modules;
    }

    public y_(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker, long j) {
        this((short) (r0 >>> 48), (int) ((((a ^ j) ^ 71171843658578L) << 16) >>> 32), (char) ((r1 << 48) >>> 48), str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final String q() {
        return this.V;
    }

    @NotNull
    public final List f() {
        return this.z;
    }

    public final void s(long a2, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8257, 291965477383083456L ^ (a ^ a2)) /* invoke-custom */);
        this.z = list;
    }

    @NotNull
    public final String L() {
        return this.V;
    }

    @NotNull
    public final List K() {
        return this.z;
    }

    @NotNull
    public final y_ Y(char a2, @NotNull String id, @NotNull List modules, int a3, int a4) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ a;
        long j2 = j ^ 121734145761918L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j2 << 16) >>> 32);
        int i3 = (int) ((j2 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32018, 4534790280016609056L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(modules, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27203, 6187642385776683127L ^ j) /* invoke-custom */);
        return new y_((short) i, i2, (char) i3, id, modules);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v8, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    public static y_ J(y_ y_Var, short s, String str, char c2, List list, int i, int i2, Object obj) {
        long j = (((((long) s) << 48) | ((((long) c2) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a;
        long j2 = j ^ 24314779121330L;
        int i3 = (int) (j >>> 48);
        int i4 = (int) ((j2 << 16) >>> 32);
        int i5 = (int) ((j2 << 48) >>> 48);
        ?? r0 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2646016064581427825L, j) /* invoke-custom */;
        try {
            r0 = i & 1;
            ?? r02 = r0;
            if (r0 != 0) {
                if (r0 != 0) {
                    str = y_Var.V;
                }
                r02 = i & 2;
            }
            if (r02 != 0) {
                list = y_Var.z;
            }
            return y_Var.Y((char) i3, str, list, i4, i5);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -2622600876764894720L, j) /* invoke-custom */;
        }
    }

    @NotNull
    public String toString() {
        long j = a ^ 109481644689280L;
        return (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9664, 3972739669808057589L ^ j) /* invoke-custom */ + this.V + (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21931, 238138345294855320L ^ j) /* invoke-custom */ + this.z + ")";
    }

    public int hashCode() {
        long j = a ^ 98155421641909L;
        return (this.V.hashCode() * ((int) e)) + this.z.hashCode();
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
            long r0 = su.catlean.y_.a
            r1 = 121019884357214(0x6e112337c65e, double:5.979176732458E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = 3626299793699337371(0x325334730c85749b, double:2.8493944360017075E-66)
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
            r1 = 3643100379696857876(0x328ee47e4cec0314, double:3.6667790272706146E-65)
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
            r1 = 3643100379696857876(0x328ee47e4cec0314, double:3.6667790272706146E-65)
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
            boolean r0 = r0 instanceof su.catlean.y_     // Catch: java.lang.NumberFormatException -> L45 java.lang.NumberFormatException -> L51
            if (r0 != 0) goto L5b
            goto L4f
        L45:
            r1 = 3643100379696857876(0x328ee47e4cec0314, double:3.6667790272706146E-65)
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
            r1 = 3643100379696857876(0x328ee47e4cec0314, double:3.6667790272706146E-65)
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
            su.catlean.y_ r0 = (su.catlean.y_) r0
            r11 = r0
            r0 = r6
            java.lang.String r0 = r0.V     // Catch: java.lang.NumberFormatException -> L78
            r1 = r11
            java.lang.String r1 = r1.V     // Catch: java.lang.NumberFormatException -> L78
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.NumberFormatException -> L78
            r1 = r10
            if (r1 == 0) goto L9a
            if (r0 != 0) goto L8e
            goto L82
        L78:
            r1 = 3643100379696857876(0x328ee47e4cec0314, double:3.6667790272706146E-65)
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
            r1 = 3643100379696857876(0x328ee47e4cec0314, double:3.6667790272706146E-65)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8e:
            r0 = r6
            java.util.List r0 = r0.z
            r1 = r11
            java.util.List r1 = r1.z
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
        L9a:
            r1 = r10
            if (r1 == 0) goto Lbc
            if (r0 != 0) goto Lbb
            goto Laf
        La5:
            r1 = 3643100379696857876(0x328ee47e4cec0314, double:3.6667790272706146E-65)
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
            r1 = 3643100379696857876(0x328ee47e4cec0314, double:3.6667790272706146E-65)
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.y_.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [kotlinx.serialization.encoding.CompositeEncoder] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(int r6, su.catlean.y_ r7, int r8, kotlinx.serialization.encoding.CompositeEncoder r9, kotlinx.serialization.descriptors.SerialDescriptor r10, byte r11) {
        /*
            r0 = r6
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r8
            long r1 = (long) r1
            r2 = 40
            long r1 = r1 << r2
            r2 = 32
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            r1 = r11
            long r1 = (long) r1
            r2 = 56
            long r1 = r1 << r2
            r2 = 56
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            long r1 = su.catlean.y_.a
            long r0 = r0 ^ r1
            r12 = r0
            r0 = -3137246598276934978(0xd47642d738e692be, double:-7.607906175361969E98)
            r1 = r12
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            kotlin.Lazy[] r1 = su.catlean.y_.X
            r15 = r1
            r1 = r9
            r2 = r10
            r3 = 0
            r4 = r7
            java.lang.String r4 = r4.V
            r1.encodeStringElement(r2, r3, r4)
            r14 = r0
            r0 = r9
            r1 = r10
            r2 = 1
            boolean r0 = r0.shouldEncodeElementDefault(r1, r2)     // Catch: java.lang.NumberFormatException -> L50
            r1 = r14
            if (r1 == 0) goto L74
            if (r0 == 0) goto L6a
            goto L5b
        L50:
            r1 = -3122240449628084943(0xd4ab92da788fe531, double:-7.538809677709563E99)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L5f
            throw r0     // Catch: java.lang.NumberFormatException -> L5f
        L5b:
            r0 = 1
            goto L8f
        L5f:
            r1 = -3122240449628084943(0xd4ab92da788fe531, double:-7.538809677709563E99)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6a:
            r0 = r7
            java.util.List r0 = r0.z
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
        L74:
            r1 = r14
            if (r1 == 0) goto L8b
            if (r0 != 0) goto L8e
            goto L8a
        L7f:
            r1 = -3122240449628084943(0xd4ab92da788fe531, double:-7.538809677709563E99)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8a:
            r0 = 1
        L8b:
            goto L8f
        L8e:
            r0 = 0
        L8f:
            if (r0 == 0) goto Lb9
            r0 = r9
            r1 = r10
            r2 = 1
            r3 = r15
            r4 = 1
            r3 = r3[r4]     // Catch: java.lang.NumberFormatException -> Lae
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.NumberFormatException -> Lae
            kotlinx.serialization.SerializationStrategy r3 = (kotlinx.serialization.SerializationStrategy) r3     // Catch: java.lang.NumberFormatException -> Lae
            r4 = r7
            java.util.List r4 = r4.z     // Catch: java.lang.NumberFormatException -> Lae
            r0.encodeSerializableElement(r1, r2, r3, r4)     // Catch: java.lang.NumberFormatException -> Lae
            goto Lb9
        Lae:
            r1 = -3122240449628084943(0xd4ab92da788fe531, double:-7.538809677709563E99)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.y_.h(int, su.catlean.y_, int, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor, byte):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d A[Catch: NumberFormatException -> 0x0052, TryCatch #0 {NumberFormatException -> 0x0052, blocks: (B:9:0x0033, B:12:0x003d, B:14:0x0043), top: B:25:0x0033, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14, types: [su.catlean.y_] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [su.catlean.y_] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y_(int r7, java.lang.String r8, long r9, java.util.List r11, kotlinx.serialization.internal.SerializationConstructorMarker r12) {
        /*
            r6 = this;
            long r0 = su.catlean.y_.a
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = -793369908429475275(0xf4fd62459093b235, double:-3.446873880539817E255)
            r1 = r9
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r13 = r0
            r0 = 1
            r1 = 1
            r2 = r7
            r1 = r1 & r2
            if (r0 == r1) goto L23
            r0 = r7
            r1 = 1
            su.catlean.g8 r2 = su.catlean.g8.d
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r2.getDescriptor()
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(r0, r1, r2)
        L23:
            r0 = r6
            r0.<init>()
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L37
            r0 = r6
            r1 = r13
            if (r1 == 0) goto L6a
            r1 = r8
            r0.V = r1     // Catch: java.lang.NumberFormatException -> L52
        L37:
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4a
            r0 = r7
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L5c
            r0 = r6
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.NumberFormatException -> L52 java.lang.NumberFormatException -> L60
            r0.z = r1     // Catch: java.lang.NumberFormatException -> L52 java.lang.NumberFormatException -> L60
        L4a:
            r0 = r13
            if (r0 != 0) goto L6f
            goto L5c
        L52:
            r1 = -855487903386909254(0xf420b248d0fac5ba, double:-2.390836354732796E251)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L60
            throw r0     // Catch: java.lang.NumberFormatException -> L60
        L5c:
            r0 = r6
            goto L6a
        L60:
            r1 = -855487903386909254(0xf420b248d0fac5ba, double:-2.390836354732796E251)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6a:
            r1 = r11
            r0.z = r1
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.y_.<init>(int, java.lang.String, long, java.util.List, kotlinx.serialization.internal.SerializationConstructorMarker):void");
    }

    private static final KSerializer v() {
        return new ArrayListSerializer(j8.C);
    }

    public static final Lazy[] y() {
        return X;
    }

    public static void H(String[] strArr) {
        Z = strArr;
    }

    public static String[] x() {
        return Z;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 23498;
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
                throw new RuntimeException("su/catlean/y_", e2);
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
            r1 = -1
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
            java.lang.String r1 = "su/catlean/y_"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.y_.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
