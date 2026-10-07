package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_2248;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.mixins.accessors.MinecraftAccessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/zg.class */
public final class zg implements ym {

    @NotNull
    public static final zg v;

    @Nullable
    private static Function0 Z;
    private static int D;
    private static boolean V;

    @NotNull
    private static final Map F;
    private static final String[] b;
    private static final String[] c;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final long a = yz.a(-4990807395987353533L, 5101663738302633781L, MethodHandles.lookup().lookupClass()).a(239882848715930L);
    private static final Map d = new HashMap(13);

    private zg() {
    }

    @NotNull
    public final List h(char c2, int i, int i2) {
        return yl.g.c().c(((((((long) c2) << 48) | ((((long) i) << 32) >>> 16)) | ((((long) i2) << 48) >>> 48)) ^ a) ^ 82464603893790L);
    }

    public final boolean B(@NotNull wl macro, long a2) {
        long j = a ^ a2;
        long j2 = j ^ 127835402816588L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j2 << 16) >>> 32);
        int i3 = (int) ((j2 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(macro, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16634, 6585005960992548915L ^ j) /* invoke-custom */);
        return h((char) i, i2, i3).add(macro);
    }

    public final boolean u(int a2, byte a3, int a4, @NotNull wl macro) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 56) >>> 32)) | ((((long) a4) << 40) >>> 40)) ^ a;
        long j2 = j ^ 115547240828018L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j2 << 16) >>> 32);
        int i3 = (int) ((j2 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(macro, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8687, 2297804857497536784L ^ j) /* invoke-custom */);
        return h((char) i, i2, i3).remove(macro);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g(su.catlean.api.event.events.player.PlayerUpdateEvent r8) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zg.g(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v25, types: [su.catlean.api.event.events.client.InputEvent$Action] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v55, types: [su.catlean.zg] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v74, types: [int] */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v86, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v88, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i(su.catlean.api.event.events.client.InputEvent r9) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zg.i(su.catlean.api.event.events.client.InputEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void b(su.catlean.wl r11, byte r12, boolean r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zg.b(su.catlean.wl, byte, boolean, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void x(long r9, su.catlean.bp r11) {
        /*
            r8 = this;
            long r0 = su.catlean.zg.a
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 82656606187677(0x4b2cfda6709d, double:4.083778951916E-310)
            long r1 = r1 ^ r2
            r12 = r1
            r0 = -6756762447364414683(0xa23b285a5d252325, double:-8.699492737858504E-144)
            r1 = r9
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L61
            r0 = r11
            java.lang.String r0 = r0.p()     // Catch: kotlin.NoWhenBranchMatchedException -> L31 kotlin.NoWhenBranchMatchedException -> L57
            java.lang.String r1 = "/"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r1, r2, r3, r4)     // Catch: kotlin.NoWhenBranchMatchedException -> L31 kotlin.NoWhenBranchMatchedException -> L57
            if (r0 == 0) goto L6c
            goto L3b
        L31:
            r1 = -6729930739060968808(0xa29a7ba64749f298, double:-5.429368682333007E-142)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L57
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L57
        L3b:
            r0 = r12
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)     // Catch: kotlin.NoWhenBranchMatchedException -> L57
            net.minecraft.class_634 r0 = r0.field_3944     // Catch: kotlin.NoWhenBranchMatchedException -> L57
            r1 = r11
            java.lang.String r1 = r1.p()     // Catch: kotlin.NoWhenBranchMatchedException -> L57
            java.lang.String r2 = "/"
            java.lang.String r3 = ""
            r4 = 0
            r5 = 4
            r6 = 0
            java.lang.String r1 = kotlin.text.StringsKt.replaceFirst$default(r1, r2, r3, r4, r5, r6)     // Catch: kotlin.NoWhenBranchMatchedException -> L57
            r0.method_45730(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L57
            goto L61
        L57:
            r1 = -6729930739060968808(0xa29a7ba64749f298, double:-5.429368682333007E-142)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L61:
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7b
            r0 = r14
            if (r0 != 0) goto L88
        L6c:
            r0 = r12
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)     // Catch: kotlin.NoWhenBranchMatchedException -> L7e
            net.minecraft.class_634 r0 = r0.field_3944     // Catch: kotlin.NoWhenBranchMatchedException -> L7e
            r1 = r11
            java.lang.String r1 = r1.p()     // Catch: kotlin.NoWhenBranchMatchedException -> L7e
            r0.method_45729(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L7e
        L7b:
            goto L88
        L7e:
            r1 = -6729930739060968808(0xa29a7ba64749f298, double:-5.429368682333007E-142)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zg.x(long, su.catlean.bp):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0393 A[PHI: r0
  0x0393: PHI (r0v39 ??) = (r0v36 ??), (r0v48 ??) binds: [B:104:0x0385, B:106:0x038b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0256 A[EXC_TOP_SPLITTER, PHI: r0
  0x0256: PHI (r0v69 ??) = (r0v117 ??), (r0v118 ??), (r0v119 ??) binds: [B:53:0x0229, B:55:0x022e, B:60:0x0241] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02a8 A[PHI: r0
  0x02a8: PHI (r0v75 ??) = (r0v120 ??), (r0v121 ??), (r0v122 ??) binds: [B:64:0x025c, B:66:0x0261, B:71:0x0274] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ae  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v118 */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v120 */
    /* JADX WARN: Type inference failed for: r0v121 */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [net.minecraft.class_1269] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [net.minecraft.class_239] */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76, types: [int] */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v87, types: [net.minecraft.class_1269] */
    /* JADX WARN: Type inference failed for: r0v9, types: [su.catlean.fg] */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v97, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void L(su.catlean.ft r14, long r15) {
        /*
            Method dump skipped, instruction units count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zg.L(su.catlean.ft, long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void j(su.catlean.nh r18, boolean r19, long r20) {
        /*
            Method dump skipped, instruction units count: 4968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zg.j(su.catlean.nh, boolean, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [net.minecraft.class_1792] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    @Nullable
    public final class_1792 e(@NotNull String id, long a2) {
        long j = a ^ a2;
        ?? ContainsKey = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1010229523630296859L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11556, 8200851622551628728L ^ j) /* invoke-custom */);
        try {
            try {
                Map map = F;
                String str = id;
                if (ContainsKey != 0) {
                    ContainsKey = map.containsKey(str);
                    if (ContainsKey == 0) {
                        for (?? Method_8389 : class_7923.field_41175) {
                            while (true) {
                                Intrinsics.checkNotNullExpressionValue(Method_8389, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(402, 1073042770588600077L ^ j) /* invoke-custom */);
                                do {
                                    class_2248 class_2248Var = (class_2248) Method_8389;
                                    if (Intrinsics.areEqual(class_2248Var.method_63499(), (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16957, 4716395709150020779L ^ j) /* invoke-custom */ + id)) {
                                        F.put(id, class_2248Var.method_8389());
                                        Method_8389 = class_2248Var.method_8389();
                                        if (j > 0) {
                                        }
                                    }
                                } while (ContainsKey == 0);
                                return Method_8389;
                            }
                        }
                        for (class_1792 class_1792Var : class_7923.field_41178) {
                            while (true) {
                                class_1792 class_1792Var2 = class_1792Var;
                                class_1792Var = class_1792Var2;
                                while (Intrinsics.areEqual(class_1792Var.method_7876(), (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30549, 6005649652566421960L ^ j) /* invoke-custom */ + id)) {
                                    F.put(id, class_1792Var2);
                                    class_1792Var = class_1792Var2;
                                    if (j > 0) {
                                        if (ContainsKey != 0) {
                                            return class_1792Var;
                                        }
                                    }
                                }
                            }
                        }
                        return null;
                    }
                    map = F;
                    str = id;
                }
                return (class_1792) map.get(str);
            } catch (NoWhenBranchMatchedException unused) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(ContainsKey, 1055071129321103014L, j) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused2) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(ContainsKey, 1055071129321103014L, j) /* invoke-custom */;
        }
    }

    private static final void s(wl wlVar) {
        v.L((ft) wlVar, (a ^ 58802903654858L) ^ 138203307234862L);
    }

    private static final void W() {
        long j = a ^ 86841199251415L;
        long j2 = j ^ 30440501632702L;
        MinecraftAccessor minecraftAccessorF = zf.F(j ^ 64918212530328L);
        Intrinsics.checkNotNull(minecraftAccessorF, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31138, 1390178091039948074L ^ j) /* invoke-custom */);
        minecraftAccessorF.idoItemUse();
        zf.v(j2).method_6104(class_1268.field_5808);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x008c: INVOKE 
          (r-1 I:int)
          (r0 I:long)
          (r1 I:int)
          (r2 I:net.minecraft.class_1713)
          (r3 I:boolean)
          (r4 I:int)
          (r5 I:java.lang.Object)
         STATIC call: su.catlean.ag.e(int, long, int, net.minecraft.class_1713, boolean, int, java.lang.Object):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final kotlin.Unit r(su.catlean.ft r12, su.catlean.fg r13) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zg.r(su.catlean.ft, su.catlean.fg):kotlin.Unit");
    }

    static {
        int i;
        long j = a ^ 132680317961752L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[15];
        int i3 = 0;
        String str = "\u0099G\u0083H¯ÔJhW\u0091\u001e\u0087\u0018\u000bì+\u0098Krô2\u009f½\u0013ä]\u008d\u0087¶\nU\u0003\u0095Üç\u0089,ËÛ\u0098\u007f\u0005\u0010¶\u0004\u0093Ä\f6\u0012ä\tM\fÍ\u001f¾9\u009a N\n¬Á+¢\u008em\u001c\u001bF/#\u0098\u0016aF\u0018UñLhô\u0006\u0082\u001d\u008d\u0007Á¥½¢ååëA\u0097`\u0089¦ç\u0085×w¼~OT\u008d`\u0093b\u001fxÚ\u0089×\u001b\u009e¦\u000b\u0099lÊÆX¶ß \nÊYó£tÞHf\u0014Ê\u008a\u0015XT\bæ\u0097Ý~\u00897Ð}!kfÉ\u009ef+ú\u0010\\4m1zóá}\u000fg9·B\u009dË\u0094\u0018Ú¼CSeä\np4c}Uyd¾©\taÓFYÜ£\t(£üùq$f\u0091^1«ÙïsS\r²8¬,?ÉIT\u000bÆ¦f¢X\u0011=\u0098òr$\u0018Í£_\u0019(\u00ad\u0011ÙOS¬\fO\u0011Ä\u0094W \u0007\u0089Æ`Ü~\u009d(Ä-]\u001d*!;\u009a\u0000üÚ¨=\t?EgIÈ\u0010µ\u00adâ\u0083\u0006ZñîI\u009fÿ\u008e3 Àÿxá\u0082Uò\u009c$\u0085þE÷×\u0018c\u0006I¬ÀgðÐ\u0016 Ò7G\"\u00823øÂb\u0089i²¾©\u00898c{òÕ´o\u0087òfÈ\u0088y\u000b\u0018óK\u000fMì«ßZÞm\u001b[OL3òU\u0082Q\u0088w¾\u0001¯\fl\u0096\u0083òáe¾f·§)ä\u0006ìÏ\u0087á²CÍÅñ\u00adlê»\u0004u\u000fÿÛ\u0098`RfmaBÝ@{q\u008b(\u0005µQEIñ*ÚØX\u008f Ý~dW=¼\u009dMEvÐ\u0096ûl\u0017®×\u0096?ö\u009aèW\u0081²ó»\u0003 \u007f\u0095PÍÜþ\u0010[¹¥EôÉÅWdÍÌë\u0086Êß`ø\u001e%!ë\u000eà}X\u0010\u009cK]Î}»-©mÉã\tg&NI\u0088ìòÝ³g4T\u0012\u0082\u009a7XàµÜ÷TÚðUÒÊßï_\bÁ\u0080¤^r h}ß.çÆ\u009c±N,©[\u008beÀ;\u0006\u009c\\\u0088\u00ad\u0086ÑQ\u0015é\u0093_\u008d#I\u000e=\u0086\u0098\u009bÖ\u0000\u009cünm«\u0099Å«@V\u0087XVJÊ\u0082\u0010Áò¨:ë\u0000mD\u000f³î7TU\u0080+y\u0090²\u0096¡Àí3Fh©\u0088\u00ad\u0010¶Nzð\u0095\u0088\u009b#\u009di\u0084:è*ê¬E\u0013$\u0010\u008crö\u0017ÛeÖM\u0019\u0091;ýzgk ";
        int length = "\u0099G\u0083H¯ÔJhW\u0091\u001e\u0087\u0018\u000bì+\u0098Krô2\u009f½\u0013ä]\u008d\u0087¶\nU\u0003\u0095Üç\u0089,ËÛ\u0098\u007f\u0005\u0010¶\u0004\u0093Ä\f6\u0012ä\tM\fÍ\u001f¾9\u009a N\n¬Á+¢\u008em\u001c\u001bF/#\u0098\u0016aF\u0018UñLhô\u0006\u0082\u001d\u008d\u0007Á¥½¢ååëA\u0097`\u0089¦ç\u0085×w¼~OT\u008d`\u0093b\u001fxÚ\u0089×\u001b\u009e¦\u000b\u0099lÊÆX¶ß \nÊYó£tÞHf\u0014Ê\u008a\u0015XT\bæ\u0097Ý~\u00897Ð}!kfÉ\u009ef+ú\u0010\\4m1zóá}\u000fg9·B\u009dË\u0094\u0018Ú¼CSeä\np4c}Uyd¾©\taÓFYÜ£\t(£üùq$f\u0091^1«ÙïsS\r²8¬,?ÉIT\u000bÆ¦f¢X\u0011=\u0098òr$\u0018Í£_\u0019(\u00ad\u0011ÙOS¬\fO\u0011Ä\u0094W \u0007\u0089Æ`Ü~\u009d(Ä-]\u001d*!;\u009a\u0000üÚ¨=\t?EgIÈ\u0010µ\u00adâ\u0083\u0006ZñîI\u009fÿ\u008e3 Àÿxá\u0082Uò\u009c$\u0085þE÷×\u0018c\u0006I¬ÀgðÐ\u0016 Ò7G\"\u00823øÂb\u0089i²¾©\u00898c{òÕ´o\u0087òfÈ\u0088y\u000b\u0018óK\u000fMì«ßZÞm\u001b[OL3òU\u0082Q\u0088w¾\u0001¯\fl\u0096\u0083òáe¾f·§)ä\u0006ìÏ\u0087á²CÍÅñ\u00adlê»\u0004u\u000fÿÛ\u0098`RfmaBÝ@{q\u008b(\u0005µQEIñ*ÚØX\u008f Ý~dW=¼\u009dMEvÐ\u0096ûl\u0017®×\u0096?ö\u009aèW\u0081²ó»\u0003 \u007f\u0095PÍÜþ\u0010[¹¥EôÉÅWdÍÌë\u0086Êß`ø\u001e%!ë\u000eà}X\u0010\u009cK]Î}»-©mÉã\tg&NI\u0088ìòÝ³g4T\u0012\u0082\u009a7XàµÜ÷TÚðUÒÊßï_\bÁ\u0080¤^r h}ß.çÆ\u009c±N,©[\u008beÀ;\u0006\u009c\\\u0088\u00ad\u0086ÑQ\u0015é\u0093_\u008d#I\u000e=\u0086\u0098\u009bÖ\u0000\u009cünm«\u0099Å«@V\u0087XVJÊ\u0082\u0010Áò¨:ë\u0000mD\u000f³î7TU\u0080+y\u0090²\u0096¡Àí3Fh©\u0088\u00ad\u0010¶Nzð\u0095\u0088\u009b#\u009di\u0084:è*ê¬E\u0013$\u0010\u008crö\u0017ÛeÖM\u0019\u0091;ýzgk ".length();
        char cCharAt = 128;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            b = strArr;
                            c = new String[15];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[7];
                            int i9 = 0;
                            String str3 = "à±\u00adØ\u001d\u001aî\u0098ª\u0017ï°4ÆL\u001f¡<\u008d\u0094¦\f\u009fãvè¼>?Xí\u0005\u0015½@çÖ}r(";
                            int length2 = "à±\u00adØ\u001d\u001aî\u0098ª\u0017ï°4ÆL\u001f¡<\u008d\u0094¦\f\u009fãvè¼>?Xí\u0005\u0015½@çÖ}r(".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j3 = j2;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                e = jArr;
                                                f = new Integer[7];
                                                v = new zg();
                                                F = new LinkedHashMap();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "FÆsÃ\u0082+5\u0015«$§XßU\u0004K";
                                                length2 = "FÆsÃ\u0082+5\u0015«$§XßU\u0004K".length();
                                                i10 = 0;
                                            }
                                            break;
                                    }
                                    int i14 = i10;
                                    i10 += 8;
                                    byte[] bytes2 = str3.substring(i14, i10).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i12 = i9;
                                    i9++;
                                    j2 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i15 = i3;
                        i3++;
                        strArr[i15] = strIntern;
                        int i16 = i5 + cCharAt;
                        i4 = i16;
                        if (i16 < length) {
                        }
                        str = "\u0017kx\u008aæ\u0095Ùö\u0016\u0013\u0099)\u0001\u00918å¹=\u0084+`\u0090\u008dRòm\u0005MÛÐ+\u009b\u0010Ã\u0082E\u0080Ì»fm\u001aè~v4UãÍ";
                        length = "\u0017kx\u008aæ\u0095Ùö\u0016\u0013\u0099)\u0001\u00918å¹=\u0084+`\u0090\u008dRòm\u0005MÛÐ+\u009b\u0010Ã\u0082E\u0080Ì»fm\u001aè~v4UãÍ".length();
                        cCharAt = ' ';
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

    private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException noWhenBranchMatchedException) {
        return noWhenBranchMatchedException;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 2386;
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
                throw new RuntimeException("su/catlean/zg", e2);
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
            java.lang.String r1 = "su/catlean/zg"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zg.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 11262;
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
                    throw new RuntimeException("su/catlean/zg", e2);
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
            java.lang.String r1 = "su/catlean/zg"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zg.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
