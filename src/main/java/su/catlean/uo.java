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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1893;
import net.minecraft.class_5321;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/uo.class */
public final class uo extends _g {

    @NotNull
    public static final uo i;
    static final KProperty[] c;

    @NotNull
    private static final c8 K;

    @NotNull
    private static final cw g;

    @NotNull
    private static final cq W;

    @NotNull
    private static final cq u;

    @NotNull
    private static final cq k;

    @NotNull
    private static final cq x;

    @NotNull
    private static final c8 z;
    private static int t;
    private static final long a = yz.a(326382974442152207L, 2524609626761883131L, MethodHandles.lookup().lookupClass()).a(123538379694604L);
    private static final String[] b;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] h;
    private static final Map j;

    /* JADX WARN: Illegal instructions before constructor call */
    private uo(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10005, 5479877268854169666L ^ j3) /* invoke-custom */, jt.Q(), null, 4, null, j3 ^ 131369936887161L);
    }

    private final int L(long j2) {
        return ((Number) K.E(this, (a ^ j2) ^ 108440492120588L, c[0])).intValue();
    }

    private final w0 P(long j2) {
        return (w0) g.E(this, (a ^ j2) ^ 128671667009269L, c[1]);
    }

    private final boolean F(long j2) {
        return ((Boolean) W.E(this, (a ^ j2) ^ 35839058357309L, c[2])).booleanValue();
    }

    private final boolean i(long j2) {
        return ((Boolean) u.E(this, (a ^ j2) ^ 57471661947626L, c[3])).booleanValue();
    }

    private final boolean a(int i2, byte b2, int i3) {
        return ((Boolean) k.E(this, ((((((long) i2) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i3) << 40) >>> 40)) ^ a) ^ 14185159488643L, c[4])).booleanValue();
    }

    private final boolean Y(short s, int i2, short s2) {
        return ((Boolean) x.E(this, ((((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s2) << 48) >>> 48)) ^ a) ^ 11065587808940L, c[5])).booleanValue();
    }

    private final int l(byte b2, int i2, int i3) {
        long j2 = (((((long) b2) << 56) | ((((long) i2) << 32) >>> 8)) | ((((long) i3) << 40) >>> 40)) ^ a;
        return ((Number) z.E(this, j2 ^ 126111970931257L, c[(int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2619, 1009148381073853684L ^ j2) /* invoke-custom */])).intValue();
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x0197: MOVE_MULTI in method: su.catlean.uo.d(su.catlean.api.event.events.network.SendPacket):void, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/uo.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x0197: MOVE_MULTI
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -3 out of bounds for object array[13]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:304)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    @su.catlean.gofra.Flow
    private final void d(su.catlean.api.event.events.network.SendPacket r1) {
        /*
            Method dump skipped, instruction units count: 1386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uo.d(su.catlean.api.event.events.network.SendPacket):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:24:0x0088
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void k(su.catlean.api.event.events.network.AfterSendPacket r8) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uo.k(su.catlean.api.event.events.network.AfterSendPacket):void");
    }

    private static final boolean R() {
        return i.F((a ^ 6718305301585L) ^ 112446178137192L);
    }

    private static final boolean Q() {
        return i.Y((short) (r0 >>> 48), (int) ((((a ^ 18236044128426L) ^ 99253446067714L) << 16) >>> 32), (short) ((r1 << 48) >>> 48));
    }

    private static final boolean C(class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11372, 3348413685572370187L ^ (a ^ 104188297065194L)) /* invoke-custom */);
        return Intrinsics.areEqual(class_1799Var.method_7909(), class_1802.field_49814);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private static final boolean p(net.minecraft.class_1799 r11) {
        /*
            long r0 = su.catlean.uo.a
            r1 = 24655251885725(0x166c7f87ce9d, double:1.21813129462993E-310)
            long r0 = r0 ^ r1
            r12 = r0
            r0 = r12
            r1 = r0; r1 = r0; 
            r2 = 55981515302050(0x32ea365564a2, double:2.7658543512879E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r0 = -6626095873340266327(0xa40b60e8e5df28a9, double:-4.708498740043302E-135)
            r1 = r12
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r1 = r11
            r2 = 17396(0x43f4, float:2.4377E-41)
            r3 = 4956946109932989671(0x44ca9c39554f6ce7, double:2.513267038513436E23)
            r4 = r12
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/uo;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "m"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r16 = r0
            r0 = r11
            net.minecraft.class_1792 r0 = r0.method_7909()     // Catch: java.lang.NumberFormatException -> L41
            net.minecraft.class_1792 r1 = net.minecraft.class_1802.field_49814     // Catch: java.lang.NumberFormatException -> L41
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.NumberFormatException -> L41
            r1 = r16
            if (r1 == 0) goto L71
            if (r0 == 0) goto L98
            goto L4b
        L41:
            r1 = -6589544682871417347(0xa48d3c0619e295fd, double:-1.2870846692518011E-132)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L67
            throw r0     // Catch: java.lang.NumberFormatException -> L67
        L4b:
            r0 = r14
            r1 = r11
            net.minecraft.class_5321 r2 = net.minecraft.class_1893.field_50158     // Catch: java.lang.NumberFormatException -> L67
            r3 = r2
            r4 = 5502(0x157e, float:7.71E-42)
            r5 = 216199698831653474(0x300187b09683a62, double:3.15022921416671E-294)
            r6 = r12
            long r5 = r5 ^ r6
            java.lang.String r4 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/uo;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "m"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r4, r5)     // Catch: java.lang.NumberFormatException -> L67
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.lang.NumberFormatException -> L67
            int r0 = su.catlean.lq.F(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L67
            goto L71
        L67:
            r1 = -6589544682871417347(0xa48d3c0619e295fd, double:-1.2870846692518011E-132)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L71:
            r1 = r16
            if (r1 == 0) goto L95
            r1 = 1
            if (r0 < r1) goto L98
            goto L87
        L7d:
            r1 = -6589544682871417347(0xa48d3c0619e295fd, double:-1.2870846692518011E-132)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L8b
            throw r0     // Catch: java.lang.NumberFormatException -> L8b
        L87:
            r0 = 1
            goto L95
        L8b:
            r1 = -6589544682871417347(0xa48d3c0619e295fd, double:-1.2870846692518011E-132)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L95:
            goto L99
        L98:
            r0 = 0
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uo.p(net.minecraft.class_1799):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private static final boolean e(net.minecraft.class_1799 r11) {
        /*
            long r0 = su.catlean.uo.a
            r1 = 6098833233684(0x58bfec9d714, double:3.013223980478E-311)
            long r0 = r0 ^ r1
            r12 = r0
            r0 = r12
            r1 = r0; r1 = r0; 
            r2 = 36342790323499(0x210db71b7d2b, double:1.79557241728525E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r0 = -4791140543619845856(0xbd82730f64913120, double:-2.0974600404435406E-12)
            r1 = r12
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r1 = r11
            r2 = 17396(0x43f4, float:2.4377E-41)
            r3 = 4956932527077029230(0x44ca8fded401756e, double:2.508709388346532E23)
            r4 = r12
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/uo;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "m"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r16 = r0
            r0 = r11
            net.minecraft.class_1792 r0 = r0.method_7909()     // Catch: java.lang.NumberFormatException -> L41
            net.minecraft.class_1792 r1 = net.minecraft.class_1802.field_49814     // Catch: java.lang.NumberFormatException -> L41
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.NumberFormatException -> L41
            r1 = r16
            if (r1 == 0) goto L71
            if (r0 == 0) goto L98
            goto L4b
        L41:
            r1 = -4826680254658737036(0xbd042fe198ac8c74, double:-8.964844900924831E-15)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L67
            throw r0     // Catch: java.lang.NumberFormatException -> L67
        L4b:
            r0 = r14
            r1 = r11
            net.minecraft.class_5321 r2 = net.minecraft.class_1893.field_50157     // Catch: java.lang.NumberFormatException -> L67
            r3 = r2
            r4 = 6425(0x1919, float:9.003E-42)
            r5 = 3916143020075003780(0x3658ef5401322f84, double:6.824453677686866E-47)
            r6 = r12
            long r5 = r5 ^ r6
            java.lang.String r4 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/uo;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "m"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r4, r5)     // Catch: java.lang.NumberFormatException -> L67
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.lang.NumberFormatException -> L67
            int r0 = su.catlean.lq.F(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L67
            goto L71
        L67:
            r1 = -4826680254658737036(0xbd042fe198ac8c74, double:-8.964844900924831E-15)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L71:
            r1 = r16
            if (r1 == 0) goto L95
            r1 = 1
            if (r0 < r1) goto L98
            goto L87
        L7d:
            r1 = -4826680254658737036(0xbd042fe198ac8c74, double:-8.964844900924831E-15)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L8b
            throw r0     // Catch: java.lang.NumberFormatException -> L8b
        L87:
            r0 = 1
            goto L95
        L8b:
            r1 = -4826680254658737036(0xbd042fe198ac8c74, double:-8.964844900924831E-15)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L95:
            goto L99
        L98:
            r0 = 0
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uo.e(net.minecraft.class_1799):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    private static final boolean c(class_1799 class_1799Var) {
        long j2 = a ^ 110129088677422L;
        long j3 = j2 ^ 71120982600721L;
        Object objF = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6001025965081419750L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(class_1799Var, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17396, 4957036557425796180L ^ j2) /* invoke-custom */);
        try {
            try {
                class_5321 class_5321Var = class_1893.field_9121;
                Intrinsics.checkNotNullExpressionValue(class_5321Var, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7366, 1738781103439493992L ^ j2) /* invoke-custom */);
                objF = lq.F(j3, class_1799Var, class_5321Var);
                return objF != 0 ? objF >= 1 : objF;
            } catch (NumberFormatException unused) {
                objF = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, -6035300400770278066L, j2) /* invoke-custom */;
                throw objF;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, -6035300400770278066L, j2) /* invoke-custom */;
        }
    }

    private static final void C(fg fgVar, class_1297 class_1297Var) {
        long j2 = a ^ 49210456468979L;
        long j3 = j2 ^ 124357757326847L;
        gg.P.f(fgVar.a(), j2 ^ 34750135189621L);
        zf.Z((int) (j2 >>> 32), ((j2 ^ 119327524431088L) << 32) >>> 32).method_2918(zf.v(j3), class_1297Var);
        zf.v(j3).method_6104(class_1268.field_5808);
    }

    private static final void v(int i2) {
        gg.P.f(i2, (a ^ 2857820043109L) ^ 54710197885667L);
    }

    static {
        int i2;
        long j2 = a ^ 13452122983803L;
        long j3 = j2 ^ 99452490563803L;
        long j4 = j2 ^ 133943851462060L;
        long j5 = j2 ^ 95063003046090L;
        long j6 = j2 ^ 25323835628158L;
        e = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[27];
        int i4 = 0;
        String str = "¿E³pô^S\u0003¿^!Ú÷Üù°¢ó\u001aôú¦\u0019¹\u0010.\u001bÒ\u0093þ\u0011L¢oÄá\u0017d<ËÎ \u009c´)\\{h\u0007Á#Ì~Qÿ(\u0000±\u0096HkMúR\u008cE?VTH¬ï¦ô\u0010E½ç³\u008b\u008d\u0080¢XÂX{=Ïê\u008d(\u009dÔx@*5êÜ¦¥]²FSø\u008f\u001dÁ¿/lÃYüJö\u008e\u0081Î¿³{A`9Ù\u0084ô¡\u00970éX\u0012«ôQú¦\u009a¤£T)mU[\u000bÝbcPHÉ´ßBë\u0084±W-.\u009fÌqýÃ7É\u0083\u001a\bÊV\u009cP\u0017Þ ®Û¢\u009fY>\u0097ÍôR\f\u0019µ\u0005¨ö\f Ç¦°\u0001+jõ)/E\u0016âÉ \u0010å\u0007ZGo\u0007\"\u0000\u0007°{\u0094\u001f»\u0087\u0019\u0010aoÿ{y\u0088\u0004\u0083\u001e\u0096\nG\f\u0085°\u001e0Ëd\u008c×\u009d)òM\u009bÕÒÆ\u0097à±ñA|ÀCÎ\u0094`\u0011\u0096SÚÃ\u001c\u0099ì¤]LØÆQv®Õ!\u001d\u001c\u00135Ç\u0082\u007f\u0010DÝ\u0095\u0017\u0004\u001bT\u0087Î\u001e\u0095y\u009cÃÒ°\u0010ì°T\u0081^\u0099\u0088øö<Z\u00035\u0088t)\u0010¹4´¦\u0093ñëk¸\u001c\u0019ÃF$ñÓ\u0010¸î\u000fP\u001e\u001aNñ\t`\u0086%¦ÇàG :\"ö²\u0096\u00ad\u00934\u0083K\u0089/!\u001e\u001eG÷j £-\u001dÿý\u0083§_\u009b\u0019úºç\u0010®ë'î!\u000e@VqU4ñ\u0085±ºÎ(Î½\u001d]¶çÇZ$¦«\u000fº~Xì4Ò¶ÐÀZ¬\u0005\u0012\u0085Ùm¦ÆÚ\u0082\u000b±FJÝ\u00809¯\u0018¸\f\u0016â\u0006\u0016YBZu¶O^d\n\u0086»EËCû¾\u008f\u0084 z\ra\u00818þ\u0081GÐi\bÅ¥\u001bOë\u0096Æ¯\u0087°\u0015:\u009a\u0005ôæ¦_\u008dv\u00ad(\\_¯´ít³\u0089\\\"Ý2Ëßn{3\u009f\u0089£û*\u0082ìW\u0006oÄ\u008fU¸\u0003fz\u0096ß\u000bmþA\u0010ÅüÆ×òªº·Ï,ÿ:fØuÒ \u001f#(.ÊãQ6Èª\u008eyñ:3ÐðÅ\u0084\u0097FãÏk\u008d9\u009buÃs4j\u0018\u0002\u0018õ\u009f\b0Rq]\u009dõÅW\u000e*\u0081Afzfb\u0095Yó Å;3\u00ad×\u0017%i®\u0097\u0087\u0011\u000fOñ'<\u0080b¶\u0013\u0083æ<\u000btrãÚ,ö! »v\u001cS\u000b\tzkqNjñì~j]/â\u001eÌÏ4Tt\u000bøú\u000e¾¼\u0010â";
        int length = "¿E³pô^S\u0003¿^!Ú÷Üù°¢ó\u001aôú¦\u0019¹\u0010.\u001bÒ\u0093þ\u0011L¢oÄá\u0017d<ËÎ \u009c´)\\{h\u0007Á#Ì~Qÿ(\u0000±\u0096HkMúR\u008cE?VTH¬ï¦ô\u0010E½ç³\u008b\u008d\u0080¢XÂX{=Ïê\u008d(\u009dÔx@*5êÜ¦¥]²FSø\u008f\u001dÁ¿/lÃYüJö\u008e\u0081Î¿³{A`9Ù\u0084ô¡\u00970éX\u0012«ôQú¦\u009a¤£T)mU[\u000bÝbcPHÉ´ßBë\u0084±W-.\u009fÌqýÃ7É\u0083\u001a\bÊV\u009cP\u0017Þ ®Û¢\u009fY>\u0097ÍôR\f\u0019µ\u0005¨ö\f Ç¦°\u0001+jõ)/E\u0016âÉ \u0010å\u0007ZGo\u0007\"\u0000\u0007°{\u0094\u001f»\u0087\u0019\u0010aoÿ{y\u0088\u0004\u0083\u001e\u0096\nG\f\u0085°\u001e0Ëd\u008c×\u009d)òM\u009bÕÒÆ\u0097à±ñA|ÀCÎ\u0094`\u0011\u0096SÚÃ\u001c\u0099ì¤]LØÆQv®Õ!\u001d\u001c\u00135Ç\u0082\u007f\u0010DÝ\u0095\u0017\u0004\u001bT\u0087Î\u001e\u0095y\u009cÃÒ°\u0010ì°T\u0081^\u0099\u0088øö<Z\u00035\u0088t)\u0010¹4´¦\u0093ñëk¸\u001c\u0019ÃF$ñÓ\u0010¸î\u000fP\u001e\u001aNñ\t`\u0086%¦ÇàG :\"ö²\u0096\u00ad\u00934\u0083K\u0089/!\u001e\u001eG÷j £-\u001dÿý\u0083§_\u009b\u0019úºç\u0010®ë'î!\u000e@VqU4ñ\u0085±ºÎ(Î½\u001d]¶çÇZ$¦«\u000fº~Xì4Ò¶ÐÀZ¬\u0005\u0012\u0085Ùm¦ÆÚ\u0082\u000b±FJÝ\u00809¯\u0018¸\f\u0016â\u0006\u0016YBZu¶O^d\n\u0086»EËCû¾\u008f\u0084 z\ra\u00818þ\u0081GÐi\bÅ¥\u001bOë\u0096Æ¯\u0087°\u0015:\u009a\u0005ôæ¦_\u008dv\u00ad(\\_¯´ít³\u0089\\\"Ý2Ëßn{3\u009f\u0089£û*\u0082ìW\u0006oÄ\u008fU¸\u0003fz\u0096ß\u000bmþA\u0010ÅüÆ×òªº·Ï,ÿ:fØuÒ \u001f#(.ÊãQ6Èª\u008eyñ:3ÐðÅ\u0084\u0097FãÏk\u008d9\u009buÃs4j\u0018\u0002\u0018õ\u009f\b0Rq]\u009dõÅW\u000e*\u0081Afzfb\u0095Yó Å;3\u00ad×\u0017%i®\u0097\u0087\u0011\u000fOñ'<\u0080b¶\u0013\u0083æ<\u000btrãÚ,ö! »v\u001cS\u000b\tzkqNjñì~j]/â\u001eÌÏ4Tt\u000bøú\u000e¾¼\u0010â".length();
        char cCharAt = 24;
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
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
                            d = new String[27];
                            j = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[8];
                            int i10 = 0;
                            String str3 = "{\u0087\u0010ðÓ\u0018Ù (ï\u0015Dý\u001bÐ\f7\u0081R^Z\u0089\u009b7ï\u0010|¬g\u001a\u009d\u0096;JóÉÊl\u0084\u0087lp#\u0005`\u008a{z";
                            int length2 = "{\u0087\u0010ðÓ\u0018Ù (ï\u0015Dý\u001bÐ\f7\u0081R^Z\u0089\u009b7ï\u0010|¬g\u001a\u009d\u0096;JóÉÊl\u0084\u0087lp#\u0005`\u008a{z".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j7 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j8 = j7;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j8 >>> 56), (byte) (j8 >>> 48), (byte) (j8 >>> 40), (byte) (j8 >>> 32), (byte) (j8 >>> 24), (byte) (j8 >>> 16), (byte) (j8 >>> 8), (byte) j8});
                                    long j9 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j9;
                                            if (i11 >= length2) {
                                                f = jArr;
                                                h = new Integer[8];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17843, 3892797607158225752L ^ j2) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(uo.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6429, 808013004984776161L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21321, 8347304690827280291L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(uo.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18140, 4636529465260419627L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13624, 7776515064422521292L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(uo.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10564, 4805062403728852405L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6608, 3087839401113580853L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(uo.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1367, 2787518836768696744L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22362, 5424603776715930531L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(uo.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5212, 4663182939415378081L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10637, 7999313173040022890L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(uo.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14713, 2240775542414169482L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6891, 8159552037182797318L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9509, 294138383816391625L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(uo.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12691, 4086364745122078079L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2073, 5653394609989313789L ^ j2) /* invoke-custom */, 0));
                                                c = kPropertyArr;
                                                i = new uo(j3);
                                                K = yp.L(i, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21580, 8249065722955446450L ^ j2) /* invoke-custom */, 0, new IntRange(0, 5), j4, null, null, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23277, 2532515434315252740L ^ j2) /* invoke-custom */, null);
                                                g = yp.L(i, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8374, 7069220786220878918L ^ j2) /* invoke-custom */, w0.ANY, null, null, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25849, 2364554216185117206L ^ j2) /* invoke-custom */, null, j6);
                                                W = yp.t(i, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25688, 5557010579411175601L ^ j2) /* invoke-custom */, true, j5, null, null, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8592, 3374299083470733176L ^ j2) /* invoke-custom */, null);
                                                u = yp.t(i, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26874, 4425873490390090754L ^ j2) /* invoke-custom */, true, j5, null, uo::R, 4, null);
                                                k = yp.t(i, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5428, 8497798092013894111L ^ j2) /* invoke-custom */, true, j5, null, null, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8592, 3374299083470733176L ^ j2) /* invoke-custom */, null);
                                                x = yp.t(i, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22929, 4599756759034541433L ^ j2) /* invoke-custom */, true, j5, null, null, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8592, 3374299083470733176L ^ j2) /* invoke-custom */, null);
                                                z = yp.L(i, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1009, 1842767570726416159L ^ j2) /* invoke-custom */, 4, new IntRange(1, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24819, 3435300644486987293L ^ j2) /* invoke-custom */), j4, null, uo::Q, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2989, 1937984134085793088L ^ j2) /* invoke-custom */, null);
                                                t = -1;
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j9;
                                            if (i11 >= length2) {
                                                str3 = "\u0012<e\u0096º\\|Ó\u0007õì\t\u0002½þç";
                                                length2 = "\u0012<e\u0096º\\|Ó\u0007õì\t\u0002½þç".length();
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
                                    j7 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "ó[cÍä}f\u001alV\u0006*ÒVY\u0013,Ç\u0085\u008bÂ )AN\u0094\u0015ê¨0ñj\u009d\u0013µTVÝ\u0001Q_Hª\u0087xÅ\u0097î vø\u0091r\u0092Jý>j\u009auÈ^ÇdHv\u0000áQ©Ñc\u0011GÖîÆ\u0007¯</";
                        length = "ó[cÍä}f\u001alV\u0006*ÒVY\u0013,Ç\u0085\u008bÂ )AN\u0094\u0015ê¨0ñj\u009d\u0013µTVÝ\u0001Q_Hª\u0087xÅ\u0097î vø\u0091r\u0092Jý>j\u009auÈ^ÇdHv\u0000áQ©Ñc\u0011GÖîÆ\u0007¯</".length();
                        cCharAt = '0';
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

    private static String b(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 2789;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/uo", e2);
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
            java.lang.String r1 = "su/catlean/uo"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uo.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 14576;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) j.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/uo", e2);
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
            java.lang.String r1 = "su/catlean/uo"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uo.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
