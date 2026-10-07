package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2382;
import net.minecraft.class_2680;
import net.minecraft.class_2791;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/wc.class */
public final class wc implements ym {

    @NotNull
    public static final wc g;

    @NotNull
    private static final ExecutorService X;

    @Nullable
    private static Future Y;

    @NotNull
    private static final bg v;

    @NotNull
    private static final Set F;

    @NotNull
    private static final Set T;

    @NotNull
    private static List n;

    @NotNull
    private static final List Q;

    @NotNull
    private static final List J;

    @NotNull
    private static final List i;
    private static final long a = yz.a(8634210685257522792L, -2508606231224911979L, MethodHandles.lookup().lookupClass()).a(175533454796704L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map h;

    private wc() {
    }

    private final int l(int i2, byte b2, int i3) {
        long j = (((((long) i2) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i3) << 40) >>> 40)) ^ a;
        return Math.min((int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28559, 4921133340122326354L ^ j) /* invoke-custom */, Math.max(_f.U.e(j ^ 72922866134026L), k0.T.R(j ^ 138490109151727L)));
    }

    private final int P(long j) {
        long j2 = a ^ j;
        return Math.min((int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4003, 6735416115916961809L ^ j2) /* invoke-custom */, Math.max(_f.U.H(j2 ^ 80276565195514L), k0.T.g(j2 ^ 36478709737189L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Flow
    private final void h(PlayerUpdateEvent playerUpdateEvent) throws Throwable {
        long j = a ^ 77915122281644L;
        long j2 = j ^ 5924348110610L;
        Object objC = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8263420427547849093L, j) /* invoke-custom */;
        try {
            try {
                objC = objC;
                if (objC != 0) {
                    try {
                        objC = v.c((int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5730, 3431764555983856853L ^ j) /* invoke-custom */, j2);
                        if (objC == 0) {
                            Y = CompletableFuture.supplyAsync(wc::Z, X).exceptionally(wc::z);
                            return;
                        }
                        boolean zIsEmpty = n.isEmpty();
                        List listEmptyList = zIsEmpty;
                        if (objC != 0) {
                            listEmptyList = !zIsEmpty ? 1 : 0;
                        }
                        if (listEmptyList != 0) {
                            try {
                                listEmptyList = CollectionsKt.emptyList();
                                n = listEmptyList;
                            } catch (NumberFormatException unused) {
                                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(listEmptyList, -8304413179268530603L, j) /* invoke-custom */;
                            }
                        }
                    } catch (NumberFormatException unused2) {
                        throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objC, -8304413179268530603L, j) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused3) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objC, -8304413179268530603L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objC, -8304413179268530603L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List b(long r9) throws java.lang.Throwable {
        /*
            r8 = this;
            long r0 = su.catlean.wc.a
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = 9094456996280679711(0x7e36007420603d1f, double:9.209018756644777E299)
            r1 = r9
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            su.catlean.bg r1 = su.catlean.wc.v
            r1.l()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L68
            java.util.concurrent.Future r0 = su.catlean.wc.Y     // Catch: java.lang.NumberFormatException -> L24 java.lang.NumberFormatException -> L3a
            r1 = r0
            if (r1 == 0) goto L67
            goto L2e
        L24:
            r1 = 9197655170690682161(0x7fa4a2a57f8d8d31, double:7.245313496858394E306)
            r2 = r9
            java.lang.Throwable r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Throwable;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L3a
            throw r0     // Catch: java.lang.NumberFormatException -> L3a
        L2e:
            boolean r0 = r0.isDone()     // Catch: java.lang.NumberFormatException -> L3a java.lang.NumberFormatException -> L4b
            r1 = r11
            if (r1 == 0) goto L64
            goto L44
        L3a:
            r1 = 9197655170690682161(0x7fa4a2a57f8d8d31, double:7.245313496858394E306)
            r2 = r9
            java.lang.Throwable r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Throwable;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L4b
            throw r0     // Catch: java.lang.NumberFormatException -> L4b
        L44:
            r1 = 1
            if (r0 != r1) goto L63
            goto L55
        L4b:
            r1 = 9197655170690682161(0x7fa4a2a57f8d8d31, double:7.245313496858394E306)
            r2 = r9
            java.lang.Throwable r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Throwable;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L59
            throw r0     // Catch: java.lang.NumberFormatException -> L59
        L55:
            r0 = 1
            goto L69
        L59:
            r1 = 9197655170690682161(0x7fa4a2a57f8d8d31, double:7.245313496858394E306)
            r2 = r9
            java.lang.Throwable r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Throwable;}
            ).invoke(r0, r1, r2)
            throw r0
        L63:
            r0 = 0
        L64:
            goto L69
        L67:
        L68:
            r0 = 0
        L69:
            if (r0 == 0) goto L9c
            java.util.concurrent.Future r0 = su.catlean.wc.Y     // Catch: java.lang.NumberFormatException -> L92
            r1 = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.NumberFormatException -> L92
            java.lang.Object r0 = r0.get()     // Catch: java.lang.NumberFormatException -> L92
            r1 = r0
            r2 = 28522(0x6f6a, float:3.9968E-41)
            r3 = 1386052029964596371(0x133c3efa463fb493, double:5.1210636633821884E-216)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/wc;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "d"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)     // Catch: java.lang.NumberFormatException -> L92
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.NumberFormatException -> L92
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.NumberFormatException -> L92
            su.catlean.wc.n = r0     // Catch: java.lang.NumberFormatException -> L92
            goto L9c
        L92:
            r1 = 9197655170690682161(0x7fa4a2a57f8d8d31, double:7.245313496858394E306)
            r2 = r9
            java.lang.Throwable r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Throwable;}
            ).invoke(r0, r1, r2)
            throw r0
        L9c:
            java.util.List r0 = su.catlean.wc.n
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.wc.b(long):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x003e, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019e A[EDGE_INSN: B:102:0x019e->B:78:0x019e BREAK  A[LOOP:1: B:6:0x0054->B:106:?, LOOP_LABEL: LOOP:0: B:3:0x003e->B:103:0x003e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[LOOP:2: B:7:0x005d->B:107:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26, types: [su.catlean.z] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [su.catlean.z] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(@org.jetbrains.annotations.NotNull net.minecraft.class_2338 r9, long r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.wc.d(net.minecraft.class_2338, long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [net.minecraft.class_2826[]] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.minecraft.class_2826] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final net.minecraft.class_2680 c(int r11, int r12, int r13, int r14, short r15, char r16) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.wc.c(int, int, int, int, short, char):net.minecraft.class_2680");
    }

    private final class_2680 Z(int i2, int i3, int i4, int i5, char c2, int i6) {
        long j = (((((long) i5) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) i6) << 48) >>> 48)) ^ a;
        long j2 = j ^ 70881430763661L;
        return c(i2, i3, i4, (int) (j >>> 32), (short) ((j2 << 32) >>> 48), (char) ((j2 << 48) >>> 48));
    }

    private final boolean u(long j, int i2, int i3, int i4) {
        long j2 = a ^ j;
        return Z(i2, i3, i4, (int) (j2 >>> 32), (char) ((r1 << 32) >>> 48), (int) (((j2 ^ 26777239768777L) << 48) >>> 48)).method_45474();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    private final boolean X(class_2791 class_2791Var, int i2, long j, int i3, int i4) throws Throwable {
        long j2 = a ^ j;
        long j3 = j2 ^ 51771426868694L;
        Object objContains = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7370039489703388527L, j2) /* invoke-custom */;
        class_2248 class_2248VarMethod_26204 = c(i2, i3, i4, (int) (j2 >>> 32), (short) ((j3 << 32) >>> 48), (char) ((j3 << 48) >>> 48)).method_26204();
        Intrinsics.checkNotNullExpressionValue(class_2248VarMethod_26204, (String) a(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29025, 595191639498607897L ^ j2) /* invoke-custom */);
        try {
            try {
                try {
                    objContains = T.contains(class_2248VarMethod_26204);
                    if (objContains == 0) {
                        return objContains;
                    }
                    if (objContains == 0) {
                        boolean zContains = F.contains(class_2248VarMethod_26204);
                        if (objContains == 0) {
                            return zContains;
                        }
                        if (!zContains) {
                            return false;
                        }
                    }
                    return true;
                } catch (NumberFormatException unused) {
                    throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains, -7481887521957385537L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains, -7481887521957385537L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains, -7481887521957385537L, j2) /* invoke-custom */;
        }
    }

    private final boolean M(int i2, int i3, short s, int i4, char c2, int i5) {
        long j = (((((long) s) << 48) | ((((long) c2) << 48) >>> 16)) | ((((long) i5) << 32) >>> 32)) ^ a;
        long j2 = j ^ 69719935386143L;
        return T.contains(c(i2, i3, i4, (int) (j >>> 32), (short) ((j2 << 32) >>> 48), (char) ((j2 << 48) >>> 48)).method_26204());
    }

    private final boolean V(int i2, int i3, int i4, long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 27776790843737L;
        return F.contains(c(i2, i3, i4, (int) (j2 >>> 32), (short) ((j3 << 32) >>> 48), (char) ((j3 << 48) >>> 48)).method_26204());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final su.catlean.z7 H(long r11, int r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 2303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.wc.H(long, int, int, int):su.catlean.z7");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x02bc: INVOKE (r-1 I:su.catlean.wc), (r0 I:net.minecraft.class_2791), (r1 I:int), (r2 I:long), (r3 I:int), (r4 I:int) DIRECT call: su.catlean.wc.X(net.minecraft.class_2791, int, long, int, int):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final java.util.List A(int r10, char r11, int r12) {
        /*
            Method dump skipped, instruction units count: 941
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.wc.A(int, char, int):java.util.List");
    }

    private static final List Z() {
        long j = a ^ 32074865261119L;
        return g.A((int) (j >>> 32), (char) ((r1 << 32) >>> 48), (int) (((j ^ 43033162783419L) << 48) >>> 48));
    }

    private static final List z(Throwable th) {
        return CollectionsKt.emptyList();
    }

    static {
        int i2;
        long j = a ^ 121553176362570L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[10];
        int i4 = 0;
        String str = "ÜüÀ\u00847wV`0Ù§!/\u001d\n\u0082öÇ\u0001Ä\u0019íÛ^ò\u008a\u009e:æ´~\u008f(\u009f*Î\u009eÊ\bý\u0001=ºö\u0082Èø/²b*áÿ>O¤\u009d3\u0084ßz¢\u0004ú\u008eÿÎû¦àð\u001f³ ¯ÙÝ¢{\u009fÁ\f\f\u001fÒ1#ÂÈ°ì\u009fáI\u001f\u009aTã½ÔÇ\u008c2Â'\u0092\u0010$/¦h7Õ5äoàï2A\u0081®\u0093(øViØ\u0093E\u0012g\u0014âf/â\u0080zº\u0018c\u0011Ýä\u001b\u0011L##K\u0092\u000b-\u0085ô<L\t\b\u001fÅ\"\u0000\u0018zØM-Ô)sL#A-Yà\u000b\u0001\u0007\u0084*]±\u0014k\u009f\u0096(AA,\b\u0002\u0017©\u009bæ7ÎI-y\u008f\u0084\u0010ð(ëvW*u)Õ{K\b½vè\u0013\u0014'#\u0000üÝC ÁË=©ï\u0005¶\u0092\u0082m&\u001b¥©\u0013p\u0097òº\u000fuþ\u009dî\u008a¶jù\u0007\u0011So";
        int length = "ÜüÀ\u00847wV`0Ù§!/\u001d\n\u0082öÇ\u0001Ä\u0019íÛ^ò\u008a\u009e:æ´~\u008f(\u009f*Î\u009eÊ\bý\u0001=ºö\u0082Èø/²b*áÿ>O¤\u009d3\u0084ßz¢\u0004ú\u008eÿÎû¦àð\u001f³ ¯ÙÝ¢{\u009fÁ\f\f\u001fÒ1#ÂÈ°ì\u009fáI\u001f\u009aTã½ÔÇ\u008c2Â'\u0092\u0010$/¦h7Õ5äoàï2A\u0081®\u0093(øViØ\u0093E\u0012g\u0014âf/â\u0080zº\u0018c\u0011Ýä\u001b\u0011L##K\u0092\u000b-\u0085ô<L\t\b\u001fÅ\"\u0000\u0018zØM-Ô)sL#A-Yà\u000b\u0001\u0007\u0084*]±\u0014k\u009f\u0096(AA,\b\u0002\u0017©\u009bæ7ÎI-y\u008f\u0084\u0010ð(ëvW*u)Õ{K\b½vè\u0013\u0014'#\u0000üÝC ÁË=©ï\u0005¶\u0092\u0082m&\u001b¥©\u0013p\u0097òº\u000fuþ\u009dî\u008a¶jù\u0007\u0011So".length();
        char cCharAt = ' ';
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i7 = i4;
                        i4++;
                        strArr[i7] = strIntern;
                        int i8 = i6 + cCharAt;
                        i2 = i8;
                        if (i8 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            b = strArr;
                            c = new String[10];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[9];
                            int i10 = 0;
                            String str3 = "¤Þ\u0007)§7äÏViï\töèªH\u0083Ë[Õ\u0096Ñ\u00882m\u001bù\u0001ß¹¦¯\fK8\u0086Ã\u009bu9¡\u009c\u001d:Ä¯þ\u0088)\u0082å\f\u009b\u00adçº";
                            int length2 = "¤Þ\u0007)§7äÏViï\töèªH\u0083Ë[Õ\u0096Ñ\u00882m\u001bù\u0001ß¹¦¯\fK8\u0086Ã\u009bu9¡\u009c\u001d:Ä¯þ\u0088)\u0082å\f\u009b\u00adçº".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j3 = j2;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j4;
                                            if (i11 >= length2) {
                                                e = jArr;
                                                f = new Integer[9];
                                                g = new wc();
                                                ExecutorService executorServiceNewVirtualThreadPerTaskExecutor = Executors.newVirtualThreadPerTaskExecutor();
                                                Intrinsics.checkNotNullExpressionValue(executorServiceNewVirtualThreadPerTaskExecutor, (String) a(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25967, 6109948687598427930L ^ j) /* invoke-custom */);
                                                X = executorServiceNewVirtualThreadPerTaskExecutor;
                                                v = new bg();
                                                F = SetsKt.setOf((Object[]) new class_2248[]{class_2246.field_10540, class_2246.field_10443, class_2246.field_22109, class_2246.field_22108});
                                                T = SetsKt.setOf((Object[]) new class_2248[]{class_2246.field_9987, class_2246.field_10499});
                                                n = CollectionsKt.emptyList();
                                                class_2382[] class_2382VarArr = new class_2382[(int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16985, 4056732573472465409L ^ j) /* invoke-custom */];
                                                class_2382VarArr[0] = new class_2382(-1, 0, 1);
                                                class_2382VarArr[1] = new class_2382(0, 0, 2);
                                                class_2382VarArr[2] = new class_2382(1, 0, 2);
                                                class_2382VarArr[3] = new class_2382(2, 0, 1);
                                                class_2382VarArr[4] = new class_2382(2, 0, 0);
                                                class_2382VarArr[5] = new class_2382(1, 0, -1);
                                                Q = CollectionsKt.listOf((Object[]) class_2382VarArr);
                                                J = CollectionsKt.listOf((Object[]) new class_2382[]{new class_2382(-1, 0, 1), new class_2382(0, 0, 2), new class_2382(1, 0, 1), new class_2382(1, 0, 0)});
                                                i = CollectionsKt.mutableListOf(new class_2382(0, 0, 1), new class_2382(1, 0, 1), new class_2382(2, 0, 0), new class_2382(1, 0, -1));
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i11 >= length2) {
                                                str3 = "\u008eÀ\u000f\u0003»'F¶VúG\u009e\u0019\u0006\u009dä";
                                                length2 = "\u008eÀ\u000f\u0003»'F¶VúG\u009e\u0019\u0006\u009dä".length();
                                                i11 = 0;
                                            }
                                            break;
                                    }
                                    int i15 = i11;
                                    i11 += 8;
                                    byte[] bytes2 = str3.substring(i15, i11).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i13 = i10;
                                    i10++;
                                    j2 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i16 = i4;
                        i4++;
                        strArr[i16] = strIntern;
                        int i17 = i6 + cCharAt;
                        i5 = i17;
                        if (i17 < length) {
                        }
                        str = "1]*h\u00adÀºæ\u008aLHJ\u0084\u0016\u001dâo\u008aK\nüÚ\u008c\u0082!ý®\u007f3VÂé@ÉK\tú\u0082ÜmëQòÍ\u009f\u0006\u0007O¦\u0086½\u001dm¦\u0097Í£\u009c\u009eÛ+öiäØv·SÙÖ\u0090gå@âÀ(b*\u0010%\u00162ì\u0005TUi\u0093} -ª,Ð7E";
                        length = "1]*h\u00adÀºæ\u008aLHJ\u0084\u0016\u001dâo\u008aK\nüÚ\u008c\u0082!ý®\u007f3VÂé@ÉK\tú\u0082ÜmëQòÍ\u009f\u0006\u0007O¦\u0086½\u001dm¦\u0097Í£\u009c\u009eÛ+öiäØv·SÙÖ\u0090gå@âÀ(b*\u0010%\u00162ì\u0005TUi\u0093} -ª,Ð7E".length();
                        cCharAt = ' ';
                        i2 = -1;
                        break;
                        break;
                }
                i6 = i2 + 1;
                strSubstring = str.substring(i6, i6 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i5);
        }
    }

    private static Throwable a(Throwable th) {
        return th;
    }

    private static String a(byte[] bArr) {
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
                char c2 = (char) (((char) (((char) (i4 & 15)) << '\f')) | (((char) (bArr[i7] & 63)) << 6));
                i3 = i7 + 1;
                int i8 = i2;
                i2++;
                cArr[i8] = (char) (c2 | ((char) (bArr[i3] & 63)));
            }
            i3++;
        }
        return new String(cArr, 0, i2);
    }

    private static String a(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 9527;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = a(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/wc", e2);
            }
        }
        return c[i3];
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
            java.lang.String r1 = "su/catlean/wc"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.wc.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 16146;
        if (f[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/wc", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            f[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return f[i3].intValue();
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
            java.lang.String r1 = "su/catlean/wc"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.wc.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
