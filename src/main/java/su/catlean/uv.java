package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import net.minecraft.class_6880;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/uv.class */
public final class uv extends _g {

    @NotNull
    public static final uv K;
    static final KProperty[] D;

    @NotNull
    private static final cq O;

    @NotNull
    private static final cq c;

    @NotNull
    private static final cq J;

    @NotNull
    private static final cq W;

    @NotNull
    private static final c8 C;

    @NotNull
    private static final cq F;

    @NotNull
    private static final cw I;

    @NotNull
    private static final c8 B;

    @NotNull
    private static final c8 U;

    @NotNull
    private static final cw e;

    @NotNull
    private static final i9 w;
    private static int y;
    private static final long a = yz.a(8088570268154467807L, -3809793699463186813L, MethodHandles.lookup().lookupClass()).a(57019293668033L);
    private static final String[] b;
    private static final String[] d;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;

    /* JADX WARN: Illegal instructions before constructor call */
    private uv(long j, byte b2) {
        long j2 = ((j << 8) | ((((long) b2) << 56) >>> 56)) ^ a;
        super((String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30148, 8229275945614697101L ^ j2) /* invoke-custom */, jt.A(), null, 4, null, j2 ^ 71485639214076L);
    }

    private final boolean Z(long j) {
        return ((Boolean) O.E(this, (a ^ j) ^ 25298002645926L, D[0])).booleanValue();
    }

    private final boolean V(long j) {
        return ((Boolean) c.E(this, (a ^ j) ^ 118338166536730L, D[1])).booleanValue();
    }

    private final boolean t(long j) {
        return ((Boolean) J.E(this, (a ^ j) ^ 75974777542971L, D[2])).booleanValue();
    }

    private final boolean n(long j) {
        return ((Boolean) W.E(this, (a ^ j) ^ 87437867057446L, D[3])).booleanValue();
    }

    private final int Q(long j) {
        return ((Number) C.E(this, (a ^ j) ^ 23541861759837L, D[4])).intValue();
    }

    private final boolean q(char c2, long j) {
        return ((Boolean) F.E(this, (((((long) c2) << 48) | ((j << 16) >>> 16)) ^ a) ^ 135297252619298L, D[5])).booleanValue();
    }

    private final p F(long j) {
        long j2 = a ^ j;
        return (p) I.E(this, j2 ^ 59961769573772L, D[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28752, 6449290476653114000L ^ j2) /* invoke-custom */]);
    }

    private final int I(long j) {
        long j2 = a ^ j;
        return ((Number) B.E(this, j2 ^ 105721377815013L, D[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7747, 2191756604649593068L ^ j2) /* invoke-custom */])).intValue();
    }

    private final int Y(char c2, short s, int i2) {
        long j = (((((long) c2) << 48) | ((((long) s) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a;
        return ((Number) U.E(this, j ^ 31663734881937L, D[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4408, 5681960216842522862L ^ j) /* invoke-custom */])).intValue();
    }

    private final f9 D(long j) {
        long j2 = a ^ j;
        return (f9) e.E(this, j2 ^ 80412029402908L, D[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15357, 286856782278114212L ^ j2) /* invoke-custom */]);
    }

    private final void s(f9 f9Var, long j) {
        long j2 = a ^ j;
        e.b(this, j2 ^ 54699019100494L, D[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15357, 286915155751137818L ^ j2) /* invoke-custom */], f9Var);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x009e: INVOKE (r-1 I:su.catlean._8), (r0 I:long), (r1 I:su.catlean.t5) VIRTUAL call: su.catlean._8.C(long, su.catlean.t5):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow(priority = -10)
    private final void Q(su.catlean.api.event.events.player.PlayerUpdateEvent r18) {
        /*
            r17 = this;
            long r0 = su.catlean.uv.a
            r1 = 82598681997414(0x4b1f81197066, double:4.0809171166688E-310)
            long r0 = r0 ^ r1
            r19 = r0
            r0 = r19
            r1 = r0; r1 = r0; 
            r2 = 125906186475050(0x7282d185162a, double:6.2205921336204E-310)
            long r1 = r1 ^ r2
            r21 = r1
            r1 = r0; r2 = r0; 
            r2 = 91831563111356(0x538533b2cbbc, double:4.53708205372233E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r23 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r24 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r25 = r2
            r1 = r0; r3 = r0; 
            r2 = 90859818331665(0x52a2f3322e11, double:4.48907148250524E-310)
            long r1 = r1 ^ r2
            r26 = r1
            r1 = r0; r2 = r0; 
            r2 = 132110420334426(0x78275aacd75a, double:6.52712201448867E-310)
            long r1 = r1 ^ r2
            r28 = r1
            r1 = r0; r2 = r0; 
            r2 = 129516268790078(0x75cb5b31a13e, double:6.39895389867184E-310)
            long r1 = r1 ^ r2
            r30 = r1
            r0 = 0
            su.catlean.uv.y = r0     // Catch: java.lang.NumberFormatException -> La4
            r0 = r17
            r1 = r23
            r2 = r24
            r3 = r25
            char r3 = (char) r3     // Catch: java.lang.NumberFormatException -> La4
            boolean r0 = r0.g(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> La4
            if (r0 == 0) goto Lae
            su.catlean._8 r0 = su.catlean._8.P     // Catch: java.lang.NumberFormatException -> La4
            su.catlean.t5 r1 = new su.catlean.t5     // Catch: java.lang.NumberFormatException -> La4
            r2 = r1
            su.catlean._w r3 = new su.catlean._w     // Catch: java.lang.NumberFormatException -> La4
            r4 = r3
            su.catlean.dm r5 = su.catlean.dm.h     // Catch: java.lang.NumberFormatException -> La4
            r6 = r21
            float r5 = r5.U(r6)     // Catch: java.lang.NumberFormatException -> La4
            r6 = r28
            r7 = 1119092736(0x42b40000, float:90.0)
            r8 = 0
            r9 = 0
            r10 = 7468(0x1d2c, float:1.0465E-41)
            r11 = 6724154610180274424(0x5d50fefdea99b8f8, double:3.238368638614973E141)
            r12 = r19
            long r11 = r11 ^ r12
            int r10 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/uv;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "e"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r10, r11)     // Catch: java.lang.NumberFormatException -> La4
            r11 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.NumberFormatException -> La4
            r4 = r30
            r5 = 9844(0x2674, float:1.3794E-41)
            r6 = 4043850788680991656(0x381ea4ddf80383a8, double:2.2513664352076763E-38)
            r7 = r19
            long r6 = r6 ^ r7
            int r5 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/uv;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "e"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r5, r6)     // Catch: java.lang.NumberFormatException -> La4
            void r6 = su.catlean.uv::W     // Catch: java.lang.NumberFormatException -> La4
            r2.<init>(r3, r4, r5, r6)     // Catch: java.lang.NumberFormatException -> La4
            r2 = r26
            r3 = r2; r2 = r1; r1 = r3;      // Catch: java.lang.NumberFormatException -> La4
            r-1.C(r0, r1)     // Catch: java.lang.NumberFormatException -> La4
            goto Lae
        La4:
            r1 = -2906521827365098729(0xd7a9f5cc23fbeb17, double:-1.9978160956063195E114)
            r2 = r19
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uv.Q(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:97:0x02b4
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void w(long r10) {
        /*
            Method dump skipped, instruction units count: 1138
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uv.w(long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void Q(net.minecraft.class_6880 r9, long r10) {
        /*
            r8 = this;
            long r0 = su.catlean.uv.a
            r1 = r10
            long r0 = r0 ^ r1
            r10 = r0
            r0 = r10
            r1 = r0; r1 = r0; 
            r2 = 20157992787219(0x125565ffdd13, double:9.9593717252805E-311)
            long r1 = r1 ^ r2
            r12 = r1
            r1 = r0; r2 = r0; 
            r2 = 42293827738023(0x26774c9419a7, double:2.0895927316485E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r1 = r0; r2 = r0; 
            r2 = 99221691855986(0x5a3dd9b27472, double:4.9022029268289E-310)
            long r1 = r1 ^ r2
            r16 = r1
            r0 = -6905227811898984181(0xa02bb3e3fa9cf90b, double:-1.0330807831368251E-153)
            r1 = r10
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r1 = r8
            r2 = r9
            r3 = r14
            int r1 = r1.a(r2, r3)
            r19 = r1
            r18 = r0
            r0 = r18
            if (r0 == 0) goto L69
            r0 = r19
            r1 = -1
            if (r0 != r1) goto L54
            goto L49
        L3f:
            r1 = -6870825017873556453(0xa0a5ed0ca7c79c1b, double:-2.0932017614080914E-151)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L4a
            throw r0     // Catch: java.lang.NumberFormatException -> L4a
        L49:
            return
        L4a:
            r1 = -6870825017873556453(0xa0a5ed0ca7c79c1b, double:-2.0932017614080914E-151)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L54:
            su.catlean.gg r0 = su.catlean.gg.P
            r1 = r12
            r2 = r19
            r3 = r8
            r4 = r16
            su.catlean.f9 r3 = r3.D(r4)
            void r4 = su.catlean.uv::B
            r0.T(r1, r2, r3, r4)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uv.Q(net.minecraft.class_6880, long):void");
    }

    private final int a(class_6880 class_6880Var, long j) {
        long j2 = a ^ j;
        return gg.P.X(j2 ^ 99790635397719L, (v1) -> {
            return y(r1, v1);
        }, D(j2 ^ 130135402007333L)).a();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final boolean R(long r8, net.minecraft.class_6880 r10) {
        /*
            r7 = this;
            long r0 = su.catlean.uv.a
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 73669315409766(0x430079603766, double:3.63974778966085E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 1980600769588(0x1cd25015c34, double:9.7854679838E-312)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -8148464641150232630(0x8eead694cf68d7ca, double:-8.243031095961345E-237)
            r1 = r8
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r15 = r0
            r0 = r13
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)     // Catch: java.lang.NumberFormatException -> L35
            r1 = r10
            boolean r0 = r0.method_6059(r1)     // Catch: java.lang.NumberFormatException -> L35
            r1 = r15
            if (r1 == 0) goto L53
            if (r0 != 0) goto L7a
            goto L3f
        L35:
            r1 = -8186268158337502502(0x8e64887b9233b2da, double:-2.4634782365342637E-239)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3f:
            r0 = r7
            r1 = r10
            r2 = r11
            int r0 = r0.a(r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = -8186268158337502502(0x8e64887b9233b2da, double:-2.4634782365342637E-239)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r15
            if (r1 == 0) goto L77
            r1 = -1
            if (r0 == r1) goto L7a
            goto L69
        L5f:
            r1 = -8186268158337502502(0x8e64887b9233b2da, double:-2.4634782365342637E-239)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L6d
            throw r0     // Catch: java.lang.NumberFormatException -> L6d
        L69:
            r0 = 1
            goto L77
        L6d:
            r1 = -8186268158337502502(0x8e64887b9233b2da, double:-2.4634782365342637E-239)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L77:
            goto L7b
        L7a:
            r0 = 0
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uv.R(long, net.minecraft.class_6880):boolean");
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:8:0x001e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final boolean t(net.minecraft.class_1799 r9, net.minecraft.class_6880 r10, long r11) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uv.t(net.minecraft.class_1799, net.minecraft.class_6880, long):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0219: INVOKE (r-1 I:su.catlean.uv), (r0 I:long), (r1 I:net.minecraft.class_6880) DIRECT call: su.catlean.uv.R(long, net.minecraft.class_6880):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final boolean g(int r11, int r12, char r13) {
        /*
            Method dump skipped, instruction units count: 1370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uv.g(int, int, char):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.p] */
    private static final boolean j() {
        long j = a ^ 124773285835464L;
        Object objF = j;
        try {
            objF = K.F(objF ^ 7917142885184L);
            return objF == p.Health;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, -7707963913915881031L, j) /* invoke-custom */;
        }
    }

    private static final Unit W() {
        K.w((a ^ 78190103345683L) ^ 99281786340020L);
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0040: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final kotlin.Unit B() {
        /*
            long r0 = su.catlean.uv.a
            r1 = 134482664607153(0x7a4faf73cdb1, double:6.6443264543585E-310)
            long r0 = r0 ^ r1
            r11 = r0
            r0 = r11
            r1 = r0; r1 = r0; 
            r2 = 76209197279396(0x454fd621e8a4, double:3.7652346272888E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r1 = r0; r2 = r0; 
            r2 = 85179748584555(0x4d7874a80c6b, double:4.2084387497023E-310)
            long r1 = r1 ^ r2
            r15 = r1
            net.minecraft.class_1268 r0 = net.minecraft.class_1268.field_5808
            r1 = 0
            r2 = r13
            r3 = 0
            r4 = 28752(0x7050, float:4.029E-41)
            r5 = 6449292733001951321(0x59807d922316e859, double:1.3626438509230573E123)
            r6 = r11
            long r5 = r5 ^ r6
            int r4 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/uv;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "e"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r4, r5)
            r5 = 0
            net.minecraft.class_1269 r0 = su.catlean.ag.K(r0, r1, r2, r3, r4, r5)
            net.minecraft.class_2879 r0 = new net.minecraft.class_2879
            r1 = r0
            net.minecraft.class_1268 r2 = net.minecraft.class_1268.field_5808
            r1.<init>(r2)
            net.minecraft.class_2596 r0 = (net.minecraft.class_2596) r0
            r1 = r15
            r2 = r1; r1 = r0; r0 = r2; 
            su.catlean._r.a(r-1, r0)
            int r-1 = su.catlean.uv.y
            r17 = r-1
            su.catlean.uv r-1 = su.catlean.uv.K
            r-1 = r17
            r0 = 1
            int r-1 = r-1 + r0
            su.catlean.uv.y = r-1
            kotlin.Unit r-1 = kotlin.Unit.INSTANCE
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uv.B():kotlin.Unit");
    }

    private static final boolean y(class_6880 class_6880Var, class_1799 class_1799Var) {
        long j = a ^ 41577808008006L;
        long j2 = j ^ 34143666591613L;
        Intrinsics.checkNotNullParameter(class_1799Var, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5741, 6891969580972320687L ^ j) /* invoke-custom */);
        return K.t(class_1799Var, class_6880Var, j2);
    }

    static {
        int i2;
        long j = a ^ 11051624758701L;
        long j2 = j ^ 44942839483737L;
        long j3 = j ^ 64846494899599L;
        long j4 = j ^ 23493192421609L;
        long j5 = j >>> 8;
        int i3 = (int) (((j ^ 116807293431432L) << 56) >>> 56);
        long j6 = j ^ 135824028346171L;
        f = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i4 = 1; i4 < 8; i4++) {
            bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[43];
        int i5 = 0;
        String str = "vmé\u009dóÝÒ]6\u001füÑ÷3\u000f\u0091fu\u0000\u0095îÂ ÇÄ\u0091\u0087À\u008de¡e0+cÚ¤\u00805\u0000Ñ\u0016Î4-ð¨\u0084mdM57ÔQ\të9(s£§\u001a\u00ad\u0017&Å\u0003fî¢z«þ\u0010É\\¿y@r Æ»\r\u0012X)ÔÉÏã\u009eñ\u001b]¨Áý%y_f\u000e»\bçnÿ\u008dç<åÊ Ã\u0010Ö{\u0098o\u0098C\u001c\u001f6zY\u001d¶|\u008b¿ù\u0016çÃtúc\u0015ÿ|T¬-O\u0018d\u009cmâÊ§Ô©\u001d¶4>\b§KÓ\u0000r¹´k\u0097>=\u0018_&ÛL\u0084I}\u0097\u008c\u0080\u008cttå\u0099OQJ(µà5Ð\f\u00186þñ\u0091B\u0087²ô\u0098!K÷Y\u0095îþ\u0088\u0086ï\u0083¥ó!1\u0010\u0085DZí\u000e9ÿ\u0005\u007f´\u001ejþì°g\u0010\u0002É!:\u0000\búþ?ò£¨Aá½n\u0018»(ïL©Gn~\u0086¹I\u0018\u0018Xª¿þÍ#.f\u000b+m\u0010¢xß\u008cÁ( 8¿ú£*1&ò\f\u0010¾)¯V\u0090\u001ama.\u0081\u0084Ô\r\u000ed³\u0010î6ãÏ\u009bï\u0083AÞi:\u0099&Å\b>\u0018tÉ¦sz[¢\u00adCÖm\u0090ß7^Å\u008aÅvïF]\u0097\r ØÎþë\u0097ÍºBû{Zk\u00966¼\u001c\u0013â8Ú\u0096s\u001c6\u0019g\u0014$nÜe\u0010(ò\u001ah\u008fÙÏêáR\rÊ×\u009aãv9äwµ\u0096ªli§},%\u008eül¦NK{îò\u001e\u0085§®\u0018æ[[f\u001cÝ\u008c¾Èò8\u007f\u008dB\u0084ÑcW»Æ£\u001d\u0001z(/\u0018Ò×.\u007f¾8>Zîâ\u0007©í\u0087¶\u008csv£ø5~Û\u001aa\u0095Ñ\u0083×%Sî¾\u0086ÃÌ\u0094½(ª\u008d\u0006\u009cùMÈ$|&bâazt\u0012{$4\u0097{Ó\u009a¼\u009eäÂè´Î]\u008eÕ\u008c\u0087Îì#nð !`p*-×]\u0006\u0003\u0085\u009d¾ ]\u0095ÔÓß4\u008f\u009b\u0012³:'(k%¶>\u00027\u0018\u0005\fyÉÉxî«-\u0081¤¬ú)HÇÂÛ\u001bSê\u0094\u0081b\u0010f®Ë¯á\u008f\u0007©\u0018-áætl±V 'éN&í°8ßD\u001d||M\u0092l¦dØÞ6¦\u0000Ý.ëp\u0087u\u008f:üÊ Ê\u0016 KºÌ\u0096\u000eÚÿÔE\u000e\u001cËb\u000e\u008eÙLÀ\u0013fÎr\u001f,=Ó\u0005O9\u0010w\t3û\u0007k¶©¹\u0093¢Q\u008d\u0006÷k\u0018\u0086\u001bu`\u0004³\b»ð~á×Fªú\u008aÈÆgr3ü@F\u0018Y\f.\u009aD]Î\u0002æ)Â\u0012°ó¥¹üÖ6\u0000\u009b#_?\u0018Ë)¶Ë\u0083Ðák\u0082ÐNv6\\B\u0019XÓ\u0015!Ð½;\u0085\u0010Â)\u0083tL\u00ad\u009aM5¨ô´LËlt\u0018\u0086\rÇ\u008a,+Þ\u0089s+0}WZL®V+T,\u0001\u001dIC Õaó\u0001\u0099\u0086\u000f\u009bR\u0097\u0086|\u001b\u0084\\²éÇ.\u0082Í¼*%Ç¢´½1Ñ\u0086\u000e(7\u007f j§Çy\u0086ØäÚ³Þ÷\u0093Gv!\u0081ÑýüåPSA\\ð¼Þ÷êæ\u0013Ä\u0014\u008dw'Ù \u0084ÊP\u0098NÑ·H\u001a´2xÌÒ\u0097ÒÔ\u0016Ë\u008aè~P×Ã\u0090\u0096\u0001ë4\u0013\u0007\u0010\u0018è2.$Këj\u007f»#òúlê\n0©.¯;-t\\U\u008e]®C=é\u008f\t\u0097À¬\u0018~\u0010\u0012\u0006º»QÜ\u00975íãý\u0006\u0088\u0005ÄR\u0087ëe\u000e,\u009c(\r\rÈ \u0003wH²\u007fe\u0017oã^¥ÊPÔõ\u0097J+r\u0019DTªÂ\u008b_\f\u009f\u0018\u0089æ) j¯'åW\u008bæ\u008eí\u0096»\"\u008d\u0098E¡i{Ú*¦.æu%ÙcÍþ\u001dîå\u0010ûf\u007f\u008a\rbÁõ:§u\u0003~ýE\u0010 g£)\u0014wÓ\u0004¼¸`91áN æ\u0090,m4ÚWà®Q\u0005 .D×\u009f{ éM\u001a\u008d8Ýg\u009b\u0003Wg\u000bð¶\u0098ÌùYNõïèóB¼ûÙÈ5\u0092QP\u0010YØ\u0018o|*¬1ç¢Ql©°\u0088Ã";
        int length = "vmé\u009dóÝÒ]6\u001füÑ÷3\u000f\u0091fu\u0000\u0095îÂ ÇÄ\u0091\u0087À\u008de¡e0+cÚ¤\u00805\u0000Ñ\u0016Î4-ð¨\u0084mdM57ÔQ\të9(s£§\u001a\u00ad\u0017&Å\u0003fî¢z«þ\u0010É\\¿y@r Æ»\r\u0012X)ÔÉÏã\u009eñ\u001b]¨Áý%y_f\u000e»\bçnÿ\u008dç<åÊ Ã\u0010Ö{\u0098o\u0098C\u001c\u001f6zY\u001d¶|\u008b¿ù\u0016çÃtúc\u0015ÿ|T¬-O\u0018d\u009cmâÊ§Ô©\u001d¶4>\b§KÓ\u0000r¹´k\u0097>=\u0018_&ÛL\u0084I}\u0097\u008c\u0080\u008cttå\u0099OQJ(µà5Ð\f\u00186þñ\u0091B\u0087²ô\u0098!K÷Y\u0095îþ\u0088\u0086ï\u0083¥ó!1\u0010\u0085DZí\u000e9ÿ\u0005\u007f´\u001ejþì°g\u0010\u0002É!:\u0000\búþ?ò£¨Aá½n\u0018»(ïL©Gn~\u0086¹I\u0018\u0018Xª¿þÍ#.f\u000b+m\u0010¢xß\u008cÁ( 8¿ú£*1&ò\f\u0010¾)¯V\u0090\u001ama.\u0081\u0084Ô\r\u000ed³\u0010î6ãÏ\u009bï\u0083AÞi:\u0099&Å\b>\u0018tÉ¦sz[¢\u00adCÖm\u0090ß7^Å\u008aÅvïF]\u0097\r ØÎþë\u0097ÍºBû{Zk\u00966¼\u001c\u0013â8Ú\u0096s\u001c6\u0019g\u0014$nÜe\u0010(ò\u001ah\u008fÙÏêáR\rÊ×\u009aãv9äwµ\u0096ªli§},%\u008eül¦NK{îò\u001e\u0085§®\u0018æ[[f\u001cÝ\u008c¾Èò8\u007f\u008dB\u0084ÑcW»Æ£\u001d\u0001z(/\u0018Ò×.\u007f¾8>Zîâ\u0007©í\u0087¶\u008csv£ø5~Û\u001aa\u0095Ñ\u0083×%Sî¾\u0086ÃÌ\u0094½(ª\u008d\u0006\u009cùMÈ$|&bâazt\u0012{$4\u0097{Ó\u009a¼\u009eäÂè´Î]\u008eÕ\u008c\u0087Îì#nð !`p*-×]\u0006\u0003\u0085\u009d¾ ]\u0095ÔÓß4\u008f\u009b\u0012³:'(k%¶>\u00027\u0018\u0005\fyÉÉxî«-\u0081¤¬ú)HÇÂÛ\u001bSê\u0094\u0081b\u0010f®Ë¯á\u008f\u0007©\u0018-áætl±V 'éN&í°8ßD\u001d||M\u0092l¦dØÞ6¦\u0000Ý.ëp\u0087u\u008f:üÊ Ê\u0016 KºÌ\u0096\u000eÚÿÔE\u000e\u001cËb\u000e\u008eÙLÀ\u0013fÎr\u001f,=Ó\u0005O9\u0010w\t3û\u0007k¶©¹\u0093¢Q\u008d\u0006÷k\u0018\u0086\u001bu`\u0004³\b»ð~á×Fªú\u008aÈÆgr3ü@F\u0018Y\f.\u009aD]Î\u0002æ)Â\u0012°ó¥¹üÖ6\u0000\u009b#_?\u0018Ë)¶Ë\u0083Ðák\u0082ÐNv6\\B\u0019XÓ\u0015!Ð½;\u0085\u0010Â)\u0083tL\u00ad\u009aM5¨ô´LËlt\u0018\u0086\rÇ\u008a,+Þ\u0089s+0}WZL®V+T,\u0001\u001dIC Õaó\u0001\u0099\u0086\u000f\u009bR\u0097\u0086|\u001b\u0084\\²éÇ.\u0082Í¼*%Ç¢´½1Ñ\u0086\u000e(7\u007f j§Çy\u0086ØäÚ³Þ÷\u0093Gv!\u0081ÑýüåPSA\\ð¼Þ÷êæ\u0013Ä\u0014\u008dw'Ù \u0084ÊP\u0098NÑ·H\u001a´2xÌÒ\u0097ÒÔ\u0016Ë\u008aè~P×Ã\u0090\u0096\u0001ë4\u0013\u0007\u0010\u0018è2.$Këj\u007f»#òúlê\n0©.¯;-t\\U\u008e]®C=é\u008f\t\u0097À¬\u0018~\u0010\u0012\u0006º»QÜ\u00975íãý\u0006\u0088\u0005ÄR\u0087ëe\u000e,\u009c(\r\rÈ \u0003wH²\u007fe\u0017oã^¥ÊPÔõ\u0097J+r\u0019DTªÂ\u008b_\f\u009f\u0018\u0089æ) j¯'åW\u008bæ\u008eí\u0096»\"\u008d\u0098E¡i{Ú*¦.æu%ÙcÍþ\u001dîå\u0010ûf\u007f\u008a\rbÁõ:§u\u0003~ýE\u0010 g£)\u0014wÓ\u0004¼¸`91áN æ\u0090,m4ÚWà®Q\u0005 .D×\u009f{ éM\u001a\u008d8Ýg\u009b\u0003Wg\u000bð¶\u0098ÌùYNõïèóB¼ûÙÈ5\u0092QP\u0010YØ\u0018o|*¬1ç¢Ql©°\u0088Ã".length();
        char cCharAt = ' ';
        int i6 = -1;
        while (true) {
            int i7 = i6 + 1;
            String strSubstring = str.substring(i7, i7 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i8 = i5;
                        i5++;
                        strArr[i8] = strIntern;
                        int i9 = i7 + cCharAt;
                        i2 = i9;
                        if (i9 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            b = strArr;
                            d = new String[43];
                            i = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i10 = 1; i10 < 8; i10++) {
                                bArr2[i10] = (byte) ((j << (i10 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[17];
                            int i11 = 0;
                            String str3 = "Rã\u0088¶0cpäÌ\u0084ûNûæt\u0080ÄZ¸>.+\u0083\u0085\u001e\u009c¾\u001eS\u0094óS\u001fí\u0018]Æ\"Z\u0001ìvF¶\u009c®z\u0088Ã\u0093!x¢E&È\u0080×ÀÑ0Ì~þ&å¾ËÞ¢\u009c\u0096\u001bðFÄñ\u0092\fg@5~nC¦fÁ\u0017@½Ý\u001a\u009eì¤)?\u0002\u0086ðim\u0004t\u000f4\u0096Ù·\u0011ÆC\u008dw\u008e\u0004´Ù/";
                            int length2 = "Rã\u0088¶0cpäÌ\u0084ûNûæt\u0080ÄZ¸>.+\u0083\u0085\u001e\u009c¾\u001eS\u0094óS\u001fí\u0018]Æ\"Z\u0001ìvF¶\u009c®z\u0088Ã\u0093!x¢E&È\u0080×ÀÑ0Ì~þ&å¾ËÞ¢\u009c\u0096\u001bðFÄñ\u0092\fg@5~nC¦fÁ\u0017@½Ý\u001a\u009eì¤)?\u0002\u0086ðim\u0004t\u000f4\u0096Ù·\u0011ÆC\u008dw\u008e\u0004´Ù/".length();
                            int i12 = 0;
                            while (true) {
                                int i13 = i12;
                                i12 += 8;
                                byte[] bytes = str3.substring(i13, i12).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i14 = i11;
                                i11++;
                                long j7 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j8 = j7;
                                    int i15 = i14;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j8 >>> 56), (byte) (j8 >>> 48), (byte) (j8 >>> 40), (byte) (j8 >>> 32), (byte) (j8 >>> 24), (byte) (j8 >>> 16), (byte) (j8 >>> 8), (byte) j8});
                                    long j9 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i15) {
                                        case 0:
                                            jArr2[b5] = j9;
                                            if (i12 >= length2) {
                                                g = jArr;
                                                h = new Integer[17];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25636, 7287825801162181664L ^ j) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(uv.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3151, 364148735467901801L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(986, 394719985301511423L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(uv.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8366, 1663245965983023006L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24293, 9079845438258905537L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(uv.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17916, 2555148354954074830L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24737, 3004159069559898002L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(uv.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20117, 5372529974282391980L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12519, 1582562157826502623L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(uv.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30293, 642705295737366888L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18003, 7843582168095168838L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(uv.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2293, 6355736300784900072L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26854, 4072441270771988433L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5613, 230212300045401584L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(uv.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3743, 5636992671171629476L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19112, 6261552457597916572L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1010, 4625482286824434667L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(uv.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23762, 4946545955837969388L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10330, 6108834192880596859L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13482, 6252182678451002558L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(uv.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6687, 5877433601597719817L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9336, 1940542631217396562L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19405, 5811940027651580892L ^ j) /* invoke-custom */] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(uv.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26975, 3245727369619060329L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26308, 2552603907933714899L ^ j) /* invoke-custom */, 0));
                                                D = kPropertyArr;
                                                K = new uv(j5, (byte) i3);
                                                O = yp.t(K, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12793, 3961061381712572139L ^ j) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27049, 2408685668990992825L ^ j) /* invoke-custom */, null);
                                                c = yp.t(K, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1951, 7329530375887280271L ^ j) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7468, 6724085278017467699L ^ j) /* invoke-custom */, null);
                                                J = yp.t(K, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15194, 7092192670898873457L ^ j) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7468, 6724085278017467699L ^ j) /* invoke-custom */, null);
                                                W = yp.t(K, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23608, 5018517584007037709L ^ j) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7468, 6724085278017467699L ^ j) /* invoke-custom */, null);
                                                C = yp.L(K, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23721, 4272598086668092292L ^ j) /* invoke-custom */, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4408, 5681920564766587174L ^ j) /* invoke-custom */, new IntRange(0, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3086, 2774540063569945628L ^ j) /* invoke-custom */), j4, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2718, 3237538886522544773L ^ j) /* invoke-custom */, null);
                                                F = yp.t(K, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25160, 1054737176803655014L ^ j) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7468, 6724085278017467699L ^ j) /* invoke-custom */, null);
                                                I = yp.L(K, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4599, 2338392069631889128L ^ j) /* invoke-custom */, p.LackOfRegen, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7468, 6724085278017467699L ^ j) /* invoke-custom */, null, j6);
                                                B = yp.L(K, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18734, 7363355808137549362L ^ j) /* invoke-custom */, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4408, 5681920564766587174L ^ j) /* invoke-custom */, new IntRange(0, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16034, 7897135907427784378L ^ j) /* invoke-custom */), j4, null, uv::j, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4408, 5681920564766587174L ^ j) /* invoke-custom */, null);
                                                U = yp.L(K, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25683, 1678191228724099956L ^ j) /* invoke-custom */, 3, new IntRange(1, 3), j4, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23335, 2160755619113268017L ^ j) /* invoke-custom */, null);
                                                e = yp.L(K, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3354, 4487447038689727034L ^ j) /* invoke-custom */, f9.SILENT_FULL, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7468, 6724085278017467699L ^ j) /* invoke-custom */, null, j6);
                                                w = new i9(j2);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j9;
                                            if (i12 >= length2) {
                                                str3 = "o·È_cW\u0080»À\b<C \u008eØ\u0011";
                                                length2 = "o·È_cW\u0080»À\b<C \u008eØ\u0011".length();
                                                i12 = 0;
                                            }
                                            break;
                                    }
                                    int i16 = i12;
                                    i12 += 8;
                                    byte[] bytes2 = str3.substring(i16, i12).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i14 = i11;
                                    i11++;
                                    j7 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i17 = i5;
                        i5++;
                        strArr[i17] = strIntern;
                        int i18 = i7 + cCharAt;
                        i6 = i18;
                        if (i18 < length) {
                        }
                        str = "Ç\u0001\u008a¸úJ\u0082ëçáÍ\u009cH\u000byÆ\u0010\u0019æÐ!\u0081d\u008a\u0093\u0084ch\u001aN\u009b\u0083£";
                        length = "Ç\u0001\u008a¸úJ\u0082ëçáÍ\u009cH\u000byÆ\u0010\u0019æÐ!\u0081d\u008a\u0093\u0084ch\u001aN\u009b\u0083£".length();
                        cCharAt = 16;
                        i2 = -1;
                        break;
                        break;
                }
                i7 = i2 + 1;
                strSubstring = str.substring(i7, i7 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i6);
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String b(byte[] bArr) {
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

    private static String b(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 1128;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/uv", e2);
            }
        }
        return d[i3];
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
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
            java.lang.String r1 = "su/catlean/uv"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uv.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 29513;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/uv", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            h[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return h[i3].intValue();
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iC)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iC;
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
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
            java.lang.String r1 = "su/catlean/uv"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uv.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
