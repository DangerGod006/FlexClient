package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.PostTasksProcessEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/o8.class */
public final class o8 {

    @NotNull
    public static final o8 g;

    @NotNull
    private static final ArrayDeque P;

    @NotNull
    private static final ArrayDeque h;
    private static boolean G;
    private static int[] C;
    private static final long a = yz.a(-865246061451225110L, 1525567542605440342L, MethodHandles.lookup().lookupClass()).a(69302585697283L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map i;

    private o8() {
    }

    @Flow(priority = 10)
    private final void o(PlayerUpdateEvent playerUpdateEvent) {
        K(o8::l, (a ^ 127438983453844L) ^ 129369905740777L);
    }

    @Flow(priority = -10)
    private final void I(PlayerUpdateEvent playerUpdateEvent) {
        K(o8::m, (a ^ 136553121000989L) ^ 134686757439840L);
    }

    @Flow
    private final void L(PostTasksProcessEvent postTasksProcessEvent) {
        K(o8::D, (a ^ 9961674257407L) ^ 16774365860994L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(int r18, byte r19, boolean r20, @org.jetbrains.annotations.NotNull java.lang.Runnable r21, long r22) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.o8.X(int, byte, boolean, java.lang.Runnable, long):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:16:0x004a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static void p(su.catlean.o8 r8, long r9, int r11, byte r12, boolean r13, java.lang.Runnable r14, int r15, java.lang.Object r16) {
        /*
            long r0 = su.catlean.o8.a
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 75833439739460(0x44f8593cde44, double:3.74666973812396E-310)
            long r1 = r1 ^ r2
            r17 = r1
            r0 = -382568509721466136(0xfab0d7f7a3cd2ae8, double:-9.783887249885958E282)
            r1 = r9
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r19 = r0
            r0 = r15
            r1 = 1
            r0 = r0 & r1
            r1 = r19
            if (r1 == 0) goto L39
            if (r0 == 0) goto L35
            goto L33
        L29:
            r1 = -383458022907168684(0xfaadaef5b6583854, double:-8.621049293272537E282)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L33:
            r0 = 0
            r11 = r0
        L35:
            r0 = r15
            r1 = 2
            r0 = r0 & r1
        L39:
            r1 = r19
            r2 = r9
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L69
            if (r1 == 0) goto L67
            if (r0 == 0) goto L63
            goto L54
        L4a:
            r1 = -383458022907168684(0xfaadaef5b6583854, double:-8.621049293272537E282)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L54:
            r0 = 4189(0x105d, float:5.87E-42)
            r1 = 3147827194414967113(0x2baf5427c96b2949, double:2.8646676618534858E-98)
            r2 = r9
            long r1 = r1 ^ r2
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/o8;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "e"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r0, r1)
            r12 = r0
        L63:
            r0 = r15
            r1 = 4
            r0 = r0 & r1
        L67:
            r1 = r19
        L69:
            if (r1 == 0) goto L7d
            if (r0 == 0) goto L7f
            goto L7c
        L72:
            r1 = -383458022907168684(0xfaadaef5b6583854, double:-8.621049293272537E282)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L7c:
            r0 = 1
        L7d:
            r13 = r0
        L7f:
            r0 = r8
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r17
            r0.X(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.o8.p(su.catlean.o8, long, int, byte, boolean, java.lang.Runnable, int, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        r1 = r0;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0071, code lost:
    
        if (r0 < 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
    
        if (r1 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, 7379954118152529043L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0083, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        if (r0 == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, 7379954118152529043L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        r0 = r0.W(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (r1 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (r0 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        r0.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        if (r0 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        if (r0 < 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
    
        if (r0 != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0038, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0038, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        r0 = (su.catlean.f) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0038, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        r0 = (r0 > 0 ? 1 : (r0 == 0 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0051, code lost:
    
        if (r0 < 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0054, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        r0 = ((java.lang.Boolean) r9.invoke(r0)).booleanValue();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:6:0x0042, B:27:0x00af], limit reached: 74 */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b2 -> B:6:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void K(kotlin.jvm.functions.Function1 r9, long r10) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.o8.K(kotlin.jvm.functions.Function1, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean l(su.catlean.f r8) {
        /*
            long r0 = su.catlean.o8.a
            r1 = 21389549929461(0x1374248683f5, double:1.05678418001527E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = -2319375619052925033(0xdfcfec29bda60f97, double:-3.343835221782432E153)
            r1 = r9
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r1 = r8
            r2 = 25333(0x62f5, float:3.5499E-41)
            r3 = 4293314732039539469(0x3b94eb00782b0b0d, double:1.1073884242391483E-21)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/o8;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "y"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r11 = r0
            r0 = r8
            boolean r0 = r0.p()     // Catch: java.lang.NumberFormatException -> L31
            r1 = r11
            if (r1 == 0) goto L4c
            if (r0 == 0) goto L7e
            goto L3b
        L31:
            r1 = -2318626843404329685(0xdfd2952ba8331d2b, double:-3.893019337580881E153)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L42
            throw r0     // Catch: java.lang.NumberFormatException -> L42
        L3b:
            r0 = r8
            byte r0 = r0.B()     // Catch: java.lang.NumberFormatException -> L42
            goto L4c
        L42:
            r1 = -2318626843404329685(0xdfd2952ba8331d2b, double:-3.893019337580881E153)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L4c:
            r1 = r11
            if (r1 == 0) goto L7b
            r1 = 4189(0x105d, float:5.87E-42)
            r2 = 3147857783399910454(0x2baf6ff9d7000c36, double:2.8746046941285224E-98)
            r3 = r9
            long r2 = r2 ^ r3
            int r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/o8;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "e"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r1, r2)     // Catch: java.lang.NumberFormatException -> L63 java.lang.NumberFormatException -> L71
            if (r0 != r1) goto L7e
            goto L6d
        L63:
            r1 = -2318626843404329685(0xdfd2952ba8331d2b, double:-3.893019337580881E153)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L71
            throw r0     // Catch: java.lang.NumberFormatException -> L71
        L6d:
            r0 = 1
            goto L7b
        L71:
            r1 = -2318626843404329685(0xdfd2952ba8331d2b, double:-3.893019337580881E153)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L7b:
            goto L7f
        L7e:
            r0 = 0
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.o8.l(su.catlean.f):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean m(su.catlean.f r8) {
        /*
            long r0 = su.catlean.o8.a
            r1 = 57236420847370(0x340e6488670a, double:2.8278549231597E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = 4265132408718289768(0x3b30cb53fda8eb68, double:1.3891878290886772E-23)
            r1 = r9
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r1 = r8
            r2 = 30535(0x7747, float:4.2789E-41)
            r3 = 8292719969787345473(0x7315a8e034f67a41, double:2.366291962704563E246)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/o8;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "y"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r11 = r0
            r0 = r8
            boolean r0 = r0.p()     // Catch: java.lang.NumberFormatException -> L31
            r1 = r11
            if (r1 == 0) goto L4c
            if (r0 == 0) goto L7e
            goto L3b
        L31:
            r1 = 4264260487048198612(0x3b2db251e83df9d4, double:1.2282210298927997E-23)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L42
            throw r0     // Catch: java.lang.NumberFormatException -> L42
        L3b:
            r0 = r8
            byte r0 = r0.B()     // Catch: java.lang.NumberFormatException -> L42
            goto L4c
        L42:
            r1 = 4264260487048198612(0x3b2db251e83df9d4, double:1.2282210298927997E-23)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L4c:
            r1 = r11
            if (r1 == 0) goto L7b
            r1 = 13401(0x3459, float:1.8779E-41)
            r2 = 842675774916578511(0xbb1c92710bacccf, double:2.425916692750031E-252)
            r3 = r9
            long r2 = r2 ^ r3
            int r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/o8;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "e"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r1, r2)     // Catch: java.lang.NumberFormatException -> L63 java.lang.NumberFormatException -> L71
            if (r0 == r1) goto L7e
            goto L6d
        L63:
            r1 = 4264260487048198612(0x3b2db251e83df9d4, double:1.2282210298927997E-23)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L71
            throw r0     // Catch: java.lang.NumberFormatException -> L71
        L6d:
            r0 = 1
            goto L7b
        L71:
            r1 = 4264260487048198612(0x3b2db251e83df9d4, double:1.2282210298927997E-23)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L7b:
            goto L7f
        L7e:
            r0 = 0
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.o8.m(su.catlean.f):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private static final boolean D(f fVar) {
        long j = a ^ 127272504644208L;
        Object objP = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8193581964342764014L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(fVar, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25333, 4293209952899586696L ^ j) /* invoke-custom */);
        try {
            objP = fVar.p();
            return objP != 0 ? objP == 0 : objP;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objP, -8189807332006802258L, j) /* invoke-custom */;
        }
    }

    static {
        int i2;
        long j = a ^ 52695086021881L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[5], 6966259914585671197L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[4];
        int i4 = 0;
        String str = "ölÂÂW\rµP\u0004\u0090/6íp$Ç?\u0091UÏiNÒ(\u0018\u0001p\u007f\u008fN1Jõ\u0003K\u0089¹\t·M\n×4¯Ùâ\u0007ý×";
        int length = "ölÂÂW\rµP\u0004\u0090/6íp$Ç?\u0091UÏiNÒ(\u0018\u0001p\u007f\u008fN1Jõ\u0003K\u0089¹\t·M\n×4¯Ùâ\u0007ý×".length();
        char cCharAt = 24;
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
                        if (i8 >= length) {
                            b = strArr;
                            c = new String[4];
                            i = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[3];
                            int i10 = 0;
                            int length2 = "íw\u008cQwkÞ\u0001N\u008d\u001aå\u001c<Ä\u0006û>{\flæ_Ò".length();
                            int i11 = 0;
                            do {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = "íw\u008cQwkÞ\u0001N\u008d\u001aå\u001c<Ä\u0006û>{\flæ_Ò".substring(i12, i11).getBytes("ISO-8859-1");
                                i10++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i11 < length2);
                            e = jArr;
                            f = new Integer[3];
                            g = new o8();
                            P = new ArrayDeque();
                            h = new ArrayDeque();
                            return;
                        }
                        cCharAt = str.charAt(i2);
                        break;
                        break;
                    default:
                        int i13 = i4;
                        i4++;
                        strArr[i13] = strIntern;
                        int i14 = i6 + cCharAt;
                        i5 = i14;
                        if (i14 < length) {
                        }
                        str = "j\u0081Ã\n¯\u0087&·«v\u0016\u0093b\u0093è÷\u0010\u0097\u0004$Ú\u0012y\nµ\u0017eJçX\u0081ü£";
                        length = "j\u0081Ã\n¯\u0087&·«v\u0016\u0093b\u0093è÷\u0010\u0097\u0004$Ú\u0012y\nµ\u0017eJçX\u0081ü£".length();
                        cCharAt = 16;
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

    public static void X(int[] iArr) {
        C = iArr;
    }

    public static int[] K() {
        return C;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 14142;
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
                throw new RuntimeException("su/catlean/o8", e2);
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
            r1 = 4
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
            java.lang.String r1 = "su/catlean/o8"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.o8.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 17068;
        if (f[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/o8", e2);
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
            r1 = 4
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
            java.lang.String r1 = "su/catlean/o8"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.o8.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
