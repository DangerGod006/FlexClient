package su.catlean;

import com.google.common.collect.Queues;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2596;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.PostTasksProcessEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/uc.class */
public final class uc extends _g {

    @NotNull
    public static final uc Y;
    static final KProperty[] X;

    @NotNull
    private static final cw N;

    @NotNull
    private static final cw P;

    @NotNull
    private static final cq j;

    @NotNull
    private static final cq W;

    @NotNull
    private static final cq f;

    @NotNull
    private static final cq w;

    @NotNull
    private static final cq d;

    @NotNull
    private static final cq O;

    @NotNull
    private static final cq J;

    @NotNull
    private static final cq A;

    @NotNull
    private static final cq a;

    @NotNull
    private static final cq L;

    @NotNull
    private static final cq y;

    @NotNull
    private static final cq B;

    @NotNull
    private static final bg V;

    @Nullable
    private static zl U;
    private static int x;

    @Nullable
    private static _w i;
    private static boolean h;

    @NotNull
    private static final ConcurrentLinkedQueue o;

    @NotNull
    private static final ConcurrentLinkedQueue S;

    @NotNull
    private static final bg l;

    @NotNull
    private static final class_2338[] D;
    private static final long b = yz.a(3772004756923701576L, -5245564808337987449L, MethodHandles.lookup().lookupClass()).a(229853068187810L);
    private static final String[] c;
    private static final String[] e;
    private static final Map g;
    private static final long[] k;
    private static final Integer[] m;
    private static final Map n;

    /* JADX WARN: Illegal instructions before constructor call */
    private uc(char c2, int i2, char c3) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c3) << 48) >>> 48)) ^ b;
        super((String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6125, 1059938518350726808L ^ j2) /* invoke-custom */, jt.V(), null, 4, null, j2 ^ 46903688290603L);
    }

    private final fb V(int i2, char c2, int i3) {
        return (fb) N.E(this, ((((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ b) ^ 54219286797139L, X[0]);
    }

    private final mq l(int i2, char c2, char c3) {
        return (mq) P.E(this, ((((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) c3) << 48) >>> 48)) ^ b) ^ 94092848684725L, X[1]);
    }

    private final boolean p(long j2) {
        return ((Boolean) j.E(this, (b ^ j2) ^ 65287210546831L, X[2])).booleanValue();
    }

    private final boolean q(long j2) {
        return ((Boolean) W.E(this, (b ^ j2) ^ 106402708048692L, X[3])).booleanValue();
    }

    private final boolean T(char c2, long j2) {
        return ((Boolean) f.E(this, (((((long) c2) << 48) | ((j2 << 16) >>> 16)) ^ b) ^ 65738491324199L, X[4])).booleanValue();
    }

    private final boolean B(long j2) {
        return ((Boolean) w.E(this, (b ^ j2) ^ 104355340807493L, X[5])).booleanValue();
    }

    private final boolean h(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) d.E(this, j3 ^ 120859640392367L, X[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(389, 8974552529878214616L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean R(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) O.E(this, j3 ^ 109940413242686L, X[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15422, 8763493532816682474L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean A(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) J.E(this, j3 ^ 72760302051487L, X[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26624, 8486154664087307363L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean F(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) A.E(this, j3 ^ 112410782768354L, X[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5290, 3789975965775856824L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean n(short s, int i2, char c2) {
        long j2 = (((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c2) << 48) >>> 48)) ^ b;
        return ((Boolean) a.E(this, j2 ^ 76831457664490L, X[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3335, 7584629707654257665L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean H(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) L.E(this, j3 ^ 20606148711766L, X[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13236, 431316418137041432L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean M(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) y.E(this, j3 ^ 91335060259258L, X[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23117, 4891796329879721743L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean D(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) B.E(this, j3 ^ 122544703295073L, X[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26574, 7915669710445192536L ^ j3) /* invoke-custom */])).booleanValue();
    }

    @Override // su.catlean._g
    public void O(long j2) {
        x = (int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11303, 1385161315789851072L ^ j2) /* invoke-custom */;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // su.catlean._g
    public void b(long j2) {
        long j3 = j2 ^ 64129331416845L;
        long j4 = j2 ^ 44030506242343L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j4 << 16) >>> 32);
        int i4 = (int) ((j4 << 48) >>> 48);
        Object obj = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1419675369082839990L, j2) /* invoke-custom */;
        if (obj != 0) {
            try {
                try {
                    try {
                        obj = h;
                        if (obj != 0) {
                            if (j2 <= 0) {
                                return;
                            }
                            if (!bx.k((short) i2, i3, (char) i4, (int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11437, 480356093397663256L ^ j2) /* invoke-custom */)) {
                                zf.F(j3).field_1690.field_1832.method_23481(false);
                            }
                        }
                        z();
                    } catch (NoWhenBranchMatchedException unused) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1418835501930229176L, j2) /* invoke-custom */;
                    }
                } catch (NoWhenBranchMatchedException unused2) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1418835501930229176L, j2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused3) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1418835501930229176L, j2) /* invoke-custom */;
            }
        }
    }

    @Flow(priority = -10)
    private final void t(PlayerUpdateEvent playerUpdateEvent) {
        E((b ^ 30069639042138L) ^ 52716773914972L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void E(long r16) {
        /*
            Method dump skipped, instruction units count: 2672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uc.E(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean C(long r9, int r11, short r12) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uc.C(long, int, short):boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x0487: MOVE_MULTI in method: su.catlean.uc.n(long, net.minecraft.class_3965):void, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/uc.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x0487: MOVE_MULTI
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -3 out of bounds for object array[14]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:304)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    private final void n(long r1, net.minecraft.class_3965 r3) {
        /*
            Method dump skipped, instruction units count: 1670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uc.n(long, net.minecraft.class_3965):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0078: INVOKE (r-1 I:su.catlean.gw), (r0 I:long), (r1 I:net.minecraft.class_2338) VIRTUAL call: su.catlean.gw.u(long, net.minecraft.class_2338):su.catlean.zl
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final su.catlean.zl V(net.minecraft.class_2338 r10, long r11) {
        /*
            r9 = this;
            long r0 = su.catlean.uc.b
            r1 = r11
            long r0 = r0 ^ r1
            r11 = r0
            r0 = r11
            r1 = r0; r1 = r0; 
            r2 = 35880315607084(0x20a20977582c, double:1.77272313034017E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r1 = r0; r2 = r0; 
            r2 = 47693056121610(0x2b6067ab1b0a, double:2.3563500574866E-310)
            long r1 = r1 ^ r2
            r15 = r1
            r0 = -5470875765175925738(0xb4138b7a3e654416, double:-7.78417925391782E-58)
            r1 = r11
            int[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[I}
            ).invoke(r0, r1)
            r17 = r0
            r0 = r13
            net.minecraft.class_638 r0 = su.catlean.zf.z(r0)     // Catch: kotlin.NoWhenBranchMatchedException -> L32
            r1 = r10
            net.minecraft.class_2680 r0 = r0.method_8320(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L32
            boolean r0 = r0.method_45474()     // Catch: kotlin.NoWhenBranchMatchedException -> L32
            if (r0 != 0) goto L3c
            r0 = 0
            return r0
        L32:
            r1 = -5471716192812332520(0xb4108f1cefab0a18, double:-6.59501629074959E-58)
            r2 = r11
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L3c:
            net.minecraft.class_2338[] r0 = su.catlean.uc.D
            r18 = r0
            r0 = 0
            r19 = r0
            r0 = r18
            int r0 = r0.length
            r20 = r0
        L49:
            r0 = r19
            r1 = r20
            if (r0 >= r1) goto Laf
            r0 = r18
            r1 = r19
            r0 = r0[r1]
            r21 = r0
            su.catlean.gw r0 = su.catlean.gw.Y
            r1 = r10
            r2 = r21
            net.minecraft.class_2382 r2 = (net.minecraft.class_2382) r2
            net.minecraft.class_2338 r1 = r1.method_10081(r2)
            r2 = r1
            r3 = 8036(0x1f64, float:1.1261E-41)
            r4 = 200437043692767761(0x2c8186de5230a11, double:2.9474665615847905E-295)
            r5 = r11
            long r4 = r4 ^ r5
            java.lang.String r3 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/uc;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "q"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r3, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r2 = r15
            r3 = r2; r2 = r1; r1 = r3; 
            r-1.u(r0, r1)
            r22 = r-1
            r-1 = r17
            r0 = r11
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto Lac
            if (r-1 == 0) goto Laa
            r-1 = r22
            r0 = r-1
            if (r0 == 0) goto La6
            goto L9b
        L91:
            r1 = -5471716192812332520(0xb4108f1cefab0a18, double:-6.59501629074959E-58)
            r2 = r11
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L9c
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L9c
        L9b:
            return r-1
        L9c:
            r1 = -5471716192812332520(0xb4108f1cefab0a18, double:-6.59501629074959E-58)
            r2 = r11
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        La6:
            int r19 = r19 + 1
        Laa:
            r-1 = r17
        Lac:
            if (r-1 != 0) goto L49
        Laf:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uc.V(net.minecraft.class_2338, long):su.catlean.zl");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:17:0x006c
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final boolean V(net.minecraft.class_1799 r9, long r10) {
        /*
            r8 = this;
            long r0 = su.catlean.uc.b
            r1 = r10
            long r0 = r0 ^ r1
            r10 = r0
            r0 = -6032600806938354622(0xac47e58736b45c42, double:-2.2375224236194762E-95)
            r1 = r10
            int[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[I}
            ).invoke(r0, r1)
            r12 = r0
            r0 = r9
            net.minecraft.class_1792 r0 = r0.method_7909()     // Catch: kotlin.NoWhenBranchMatchedException -> L23
            boolean r0 = r0 instanceof net.minecraft.class_1747     // Catch: kotlin.NoWhenBranchMatchedException -> L23
            r1 = r12
            if (r1 == 0) goto L5b
            if (r0 == 0) goto Lba
            goto L2d
        L23:
            r1 = -6033449240402193844(0xac44e1e1e77a124c, double:-1.9552883911236625E-95)
            r2 = r10
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L51
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L51
        L2d:
            r0 = r9
            net.minecraft.class_1792 r0 = r0.method_7909()     // Catch: kotlin.NoWhenBranchMatchedException -> L51
            r1 = r0
            r2 = 17731(0x4543, float:2.4846E-41)
            r3 = 6975771396493101135(0x60ceeb203a4d484f, double:2.1224897533857898E158)
            r4 = r10
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/uc;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "q"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)     // Catch: kotlin.NoWhenBranchMatchedException -> L51
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L51
            net.minecraft.class_1747 r0 = (net.minecraft.class_1747) r0     // Catch: kotlin.NoWhenBranchMatchedException -> L51
            net.minecraft.class_2248 r0 = r0.method_7711()     // Catch: kotlin.NoWhenBranchMatchedException -> L51
            net.minecraft.class_2680 r0 = r0.method_9564()     // Catch: kotlin.NoWhenBranchMatchedException -> L51
            boolean r0 = r0.method_45474()     // Catch: kotlin.NoWhenBranchMatchedException -> L51
            goto L5b
        L51:
            r1 = -6033449240402193844(0xac44e1e1e77a124c, double:-1.9552883911236625E-95)
            r2 = r10
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L5b:
            r1 = r12
            r2 = r10
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto La3
            if (r1 == 0) goto La1
            if (r0 != 0) goto Lba
            goto L76
        L6c:
            r1 = -6033449240402193844(0xac44e1e1e77a124c, double:-1.9552883911236625E-95)
            r2 = r10
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L97
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L97
        L76:
            r0 = r9
            net.minecraft.class_1792 r0 = r0.method_7909()     // Catch: kotlin.NoWhenBranchMatchedException -> L97
            r1 = r0
            r2 = 17731(0x4543, float:2.4846E-41)
            r3 = 6975771396493101135(0x60ceeb203a4d484f, double:2.1224897533857898E158)
            r4 = r10
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/uc;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "q"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)     // Catch: kotlin.NoWhenBranchMatchedException -> L97
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L97
            net.minecraft.class_1747 r0 = (net.minecraft.class_1747) r0     // Catch: kotlin.NoWhenBranchMatchedException -> L97
            net.minecraft.class_2248 r0 = r0.method_7711()     // Catch: kotlin.NoWhenBranchMatchedException -> L97
            boolean r0 = r0 instanceof net.minecraft.class_2346     // Catch: kotlin.NoWhenBranchMatchedException -> L97
            goto La1
        L97:
            r1 = -6033449240402193844(0xac44e1e1e77a124c, double:-1.9552883911236625E-95)
            r2 = r10
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        La1:
            r1 = r12
        La3:
            if (r1 == 0) goto Lb7
            if (r0 != 0) goto Lba
            goto Lb6
        Lac:
            r1 = -6033449240402193844(0xac44e1e1e77a124c, double:-1.9552883911236625E-95)
            r2 = r10
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lb6:
            r0 = 1
        Lb7:
            goto Lbb
        Lba:
            r0 = 0
        Lbb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uc.V(net.minecraft.class_1799, long):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0137: INVOKE (r-1 I:su.catlean.gg), (r0 I:long), (r1 I:su.catlean.n5) VIRTUAL call: su.catlean.gg.P(long, su.catlean.n5):su.catlean.fg
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final int A(long r10, boolean r12, char r13) {
        /*
            Method dump skipped, instruction units count: 801
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uc.A(long, boolean, char):int");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:86:0x01a5
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void A(su.catlean.api.event.events.network.ReceivePacket r10) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uc.A(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    @Flow
    private final void H(PostTasksProcessEvent postTasksProcessEvent) {
        long j2 = b ^ 33227595561643L;
        long j3 = j2 ^ 81600923073327L;
        long j4 = j2 ^ 135682870990825L;
        Object obj = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6372097191363651692L, j2) /* invoke-custom */;
        try {
            try {
                obj = obj;
                if (obj != null) {
                    try {
                        obj = zf.F(j3).field_1687;
                        if (obj != null && zf.F(j3).field_1724 != null) {
                            c(this, false, j4, 1, null);
                            ConcurrentLinkedQueue concurrentLinkedQueue = S;
                            Function1 function1 = uc::j;
                            concurrentLinkedQueue.removeIf((v1) -> {
                                return T(r1, v1);
                            });
                            return;
                        }
                        o.clear();
                    } catch (NoWhenBranchMatchedException unused) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6371811465161139814L, j2) /* invoke-custom */;
                    }
                }
            } catch (NoWhenBranchMatchedException unused2) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6371811465161139814L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused3) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6371811465161139814L, j2) /* invoke-custom */;
        }
    }

    private final void e(boolean z) {
        ConcurrentLinkedQueue concurrentLinkedQueue = o;
        Function1 function1 = (v1) -> {
            return l(r1, v1);
        };
        concurrentLinkedQueue.removeIf((v1) -> {
            return j(r1, v1);
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0, types: [su.catlean.uc] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    static void c(uc ucVar, boolean z, long j2, int i2, Object obj) {
        long j3 = b ^ j2;
        ?? r0 = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7833433090548931760L, j3) /* invoke-custom */;
        try {
            r0 = i2 & 1;
            ?? r02 = r0;
            ?? r7 = z;
            ?? r03 = r0;
            if (r0 == 0) {
                r7 = r03;
                r02 = r03;
            } else if (r0 != 0) {
                r03 = 0;
                r7 = r03;
                r02 = r03;
            }
            try {
                ucVar.e(r7);
                if (j3 >= 0) {
                    if (r0 != 0) {
                        return;
                    }
                    r02 = new _g[5];
                    vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 7810881534774830680L, j3) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 7833718543441711806L, j3) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused2) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 7833718543441711806L, j3) /* invoke-custom */;
        }
    }

    private final void z() {
        ConcurrentLinkedQueue concurrentLinkedQueue = o;
        Function1 function1 = uc::y;
        concurrentLinkedQueue.removeIf((v1) -> {
            return g(r1, v1);
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3 A[EXC_TOP_SPLITTER, PHI: r0
  0x00b3: PHI (r0v12 ??) = (r0v23 ??), (r0v24 ??), (r0v20 ??) binds: [B:12:0x0086, B:14:0x008b, B:19:0x00b2] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18, types: [su.catlean.gg] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void w(int r9, long r10) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uc.w(int, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean W() {
        long j2 = b ^ 121089418517128L;
        long j3 = j2 ^ 85917108723128L;
        Object objQ = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4056983206610585673L, j2) /* invoke-custom */;
        try {
            objQ = Y.q(j3);
            return objQ != 0 ? objQ == 0 : objQ;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, -4057260430889944647L, j2) /* invoke-custom */;
        }
    }

    private static final Unit y(Ref.ObjectRef objectRef) {
        Y.n((b ^ 105280385757453L) ^ 134891954116933L, (class_3965) objectRef.element);
        return Unit.INSTANCE;
    }

    private static final Unit M(Ref.ObjectRef objectRef) {
        Y.n((b ^ 76844421839238L) ^ 106159655342542L, (class_3965) objectRef.element);
        return Unit.INSTANCE;
    }

    private static final Unit w(Ref.ObjectRef objectRef) {
        Y.n((b ^ 75225503586045L) ^ 106671042461365L, (class_3965) objectRef.element);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [net.minecraft.class_2886] */
    private static final class_2596 A(boolean z, int i2) {
        long j2 = b ^ 64073512639208L;
        Object class_2886Var = j2;
        try {
            class_2886Var = new class_2886(z ? class_1268.field_5808 : class_1268.field_5810, i2, dm.h.U(class_2886Var ^ 70458384844441L), dm.h.w(class_2886Var ^ 51500963793140L));
            return (class_2596) class_2886Var;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_2886Var, -4048204702612096551L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v4, types: [net.minecraft.class_2885] */
    private static final class_2596 I(boolean z, class_3965 class_3965Var, int i2) {
        Object class_2885Var = b ^ 123482865802231L;
        try {
            class_2885Var = new class_2885(z ? class_1268.field_5808 : class_1268.field_5810, class_3965Var, i2);
            return (class_2596) class_2885Var;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_2885Var, 490515560494446790L, class_2885Var) /* invoke-custom */;
        }
    }

    private static final boolean Z(class_1799 class_1799Var) {
        long j2 = b ^ 87831625467822L;
        long j3 = j2 ^ 69122830608926L;
        Intrinsics.checkNotNullParameter(class_1799Var, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29780, 1259934245334732719L ^ j2) /* invoke-custom */);
        return Y.V(class_1799Var, j3);
    }

    private static final boolean g(class_1799 class_1799Var) {
        long j2 = b ^ 21153203157563L;
        long j3 = j2 ^ 107756706944907L;
        Intrinsics.checkNotNullParameter(class_1799Var, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5334, 4275433030236000915L ^ j2) /* invoke-custom */);
        return Y.V(class_1799Var, j3);
    }

    private static final boolean j(class_2596 class_2596Var) {
        long j2 = b ^ 113536890045318L;
        long j3 = j2 ^ 94607866776448L;
        uc ucVar = Y;
        try {
            Result.Companion companion = Result.Companion;
            Intrinsics.checkNotNull(class_2596Var, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3392, 2220597683181892242L ^ j2) /* invoke-custom */);
            class_2596Var.method_65081(zf.k(j3));
            Result.m185constructorimpl(Unit.INSTANCE);
            return true;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m185constructorimpl(ResultKt.createFailure(th));
            return true;
        }
    }

    private static final boolean T(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:7:0x001f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private static final boolean l(boolean r10, su.catlean.d r11) {
        /*
            long r0 = su.catlean.uc.b
            r1 = 112461540636330(0x66487e2e36aa, double:5.556338370679E-310)
            long r0 = r0 ^ r1
            r12 = r0
            r0 = 3139214744836692885(0x2b90bb2d9ba8db95, double:7.649404105330832E-99)
            r1 = r12
            int[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[I}
            ).invoke(r0, r1)
            r14 = r0
            r0 = r10
            r1 = r14
            if (r1 == 0) goto L63
            if (r0 != 0) goto L62
            goto L29
        L1f:
            r1 = 3140063695299057051(0x2b93bf4b4a66959b, double:9.02833971892602E-99)
            r2 = r12
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L48
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L48
        L29:
            r0 = r11
            long r0 = r0.d()     // Catch: kotlin.NoWhenBranchMatchedException -> L48 kotlin.NoWhenBranchMatchedException -> L58
            long r1 = su.catlean.zf.A()     // Catch: kotlin.NoWhenBranchMatchedException -> L48 kotlin.NoWhenBranchMatchedException -> L58
            r2 = 7566(0x1d8e, float:1.0602E-41)
            r3 = 6250554751139903245(0x56be6e6de6d2f70d, double:7.1469355300770016E109)
            r4 = r12
            long r3 = r3 ^ r4
            int r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/uc;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "t"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r2, r3)     // Catch: kotlin.NoWhenBranchMatchedException -> L48 kotlin.NoWhenBranchMatchedException -> L58
            long r2 = (long) r2     // Catch: kotlin.NoWhenBranchMatchedException -> L48 kotlin.NoWhenBranchMatchedException -> L58
            long r1 = r1 - r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = r14
            if (r1 == 0) goto L63
            goto L52
        L48:
            r1 = 3140063695299057051(0x2b93bf4b4a66959b, double:9.02833971892602E-99)
            r2 = r12
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L58
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L58
        L52:
            if (r0 > 0) goto L66
            goto L62
        L58:
            r1 = 3140063695299057051(0x2b93bf4b4a66959b, double:9.02833971892602E-99)
            r2 = r12
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L62:
            r0 = 1
        L63:
            goto L67
        L66:
            r0 = 0
        L67:
            r15 = r0
            r0 = r15
            r16 = r0
            r0 = 0
            r17 = r0
            r0 = r16
            r1 = r14
            if (r1 == 0) goto La2
            if (r0 == 0) goto L9f
            goto L87
        L7d:
            r1 = 3140063695299057051(0x2b93bf4b4a66959b, double:9.02833971892602E-99)
            r2 = r12
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L95
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L95
        L87:
            java.util.concurrent.ConcurrentLinkedQueue r0 = su.catlean.uc.S     // Catch: kotlin.NoWhenBranchMatchedException -> L95
            r1 = r11
            net.minecraft.class_2596 r1 = r1.f()     // Catch: kotlin.NoWhenBranchMatchedException -> L95
            boolean r0 = r0.add(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L95
            goto L9f
        L95:
            r1 = 3140063695299057051(0x2b93bf4b4a66959b, double:9.02833971892602E-99)
            r2 = r12
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L9f:
            r0 = r15
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uc.l(boolean, su.catlean.d):boolean");
    }

    private static final boolean j(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private static final boolean y(d dVar) {
        long j2 = b ^ 117408672959563L;
        long j3 = j2 ^ 100609952056397L;
        uc ucVar = Y;
        try {
            Result.Companion companion = Result.Companion;
            class_2596 class_2596VarF = dVar.f();
            Intrinsics.checkNotNull(class_2596VarF, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29800, 8038317981357769841L ^ j2) /* invoke-custom */);
            class_2596VarF.method_65081(zf.k(j3));
            Result.m185constructorimpl(Unit.INSTANCE);
            return true;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m185constructorimpl(ResultKt.createFailure(th));
            return true;
        }
    }

    private static final boolean g(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    static {
        int i2;
        long j2 = b ^ 96020141158510L;
        long j3 = j2 ^ 102020622713244L;
        int i3 = (int) (j2 >>> 48);
        int i4 = (int) ((j3 << 16) >>> 32);
        int i5 = (int) ((j3 << 48) >>> 48);
        long j4 = j2 ^ 40049755286129L;
        long j5 = j2 ^ 111125598490821L;
        g = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i6 = 1; i6 < 8; i6++) {
            bArr[i6] = (byte) ((j2 << (i6 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[56];
        int i7 = 0;
        String str = "\u0006LõÙ\u0087\u000bÕe2Ã*¢7\u0087\u0004\u0002\u0010ñâ\u0014\u0080¹`í>ß\t(ºÃ(cÜ(HÄ\u0088Ñ$\u001e]u\u00admÄIBà1ìT¾C \u0086´ÜÁP\u00000Ü)Þ¼\u000f\u0000\u009c\u0006\u009cÿ5¨òØÈÉr§\u001açEY¡Y\u001aÜ\u0082\n\u0091²ï\u0018êC²\u0094\u0083\u0085pó8²j*©p½¯Ô =¨\u0097\u0012ðH3Àb6Q\u008c±ô÷¢îô[Ý\u0007Ì¤\u008eµö\u0087l%gÊld?ÈyCt¥\u009b\u0085§»Í\u008d\u001c\u008dÌS\u0085-cPl\u000f³\u0085î\u0013\u0001Â3À[\u0092*+õrh3\u009aá;\u000e@þ\\Ëi&¶\u0018\u001aJFX[\u009bê\u0019>Ä°^\u0018\u0011Ì\u008d²;\u0099¹eø[Ù\u0002_ëàmÑ\f3\u009e\u008e\tsìo×\u0097[[Z\u001f½\u0090ÿ\u0007\u0017\u0017\u0018Zólû«c\u0098\u00016:¡ä\u0084ªq\u0019TuJÀúE\u0087X\u0097xl|¬bH8æ&Ê@\u0087³m\u001c\u008f²\u009f\u0003¤à\u0010½>Ñ\u0087Ðèä\u008bà²äA¸ú\u0092`à\u0015Ê\u0086!\u0005ÃKC8ÀáÏÇNÞ\\.h,Ê\u0080\u007f¹= \u008eç5\u0019\f\u0019\u009däô\u001eòT´ø]äµ\u000f\u007fu&Ô\u001c½iwÝ\u0096íÔóì\u009e=»Kd²×Òiþëzô«%v¿\u0014k\t§j|%\u009c}\u008f\u0014ÁT\u008d\u0087O\u009b{\t_»)\u00adD\u001dÊÆ@iÙ\u0087{SàÆp\u00ad-).Õ(Ý\u0019Ô\u008aµI;j\u0093\u009cÈk\u0099\u0002.ãlÁlt¤\u001bÓë]Ë#\u0096RÑ®L¿4¬\u009eïÂºø[(\u001aa\u0084\u001a\nÚ´'ç{±\n\u0097òUrÉ£V\u0090Ü\u008bT\u0017>\u0087×Å-ssm=Ñb®Øq½\u0080!âÊM\u0000ª°s\u00954\u0011E\u008e²ð\u0017¿ü\u0007X\bêø\u009aET\u0010µÙ\u0019X=JA©\u009eiÍ\u0096k-ì\u0098\u0010l\u0081®½?\u0096ãçñ-¿ BÒ`C Ûÿ¾\fÈ²Æ\\¡òÒxâ~\nh²à\u0094\u0082Þc·\t¬w\u000fd_\u0089Õ4(ä\u0096Ç\u00ad\u001c\u0011«U´ú\u0015~cî\u00834\u0096ÐÖS6\u0002ºe`¼8\r\u0084©Wãz0l`\u0006~m]@S^f%þÛfêÙ\u001dwN\u0098ºIéúØ¨¶ò/Ú\u009aý\u0011«Ùd\u009c<\u0003$_ú¡\u001dbðp`ÂNº=\u001cÆ§\u0088Úg'v$YªÜ\u0007Pôîi\u0082Ø \u001c\u0092*Ø\nNÏôhª\u000f\"ZK$\u0095Å¨xèæ\u0099e@¶Ò\u0087\u008eúÁg¨\u0010´ío/\u0085¤¥¸ð\t\u0095\u000fÛþ\fG ó\u0010û@\u0083ÞM\u0085C[úG`Ø[®\u009a\u007f\u0002HPÕ=c'¨§\u0018ÁÇ\u008b\u009b Wö&LÕä©Y08<£Ec}Õ\u008c\u008dß\u0004j\u009cõ\u0013 Nì(âåy. t¯×æ,ÙÑ\fL\u009cÔ¦\u0006%\u008fæ,\u0091Ñ\u0084ïugPÛà¶à\u0005èÓ\f \u009fªJ\u008a|³·XòÔ£\u008f#\u0088Ù®\u0003-\u0007H\u000eô\u0005þ=v\u009b\u000e\rX\n,\u0010UB@8®\u000eì¹}\u0086ÏúeG÷è\u0010+ð\u001di\u009cx\u0002Þ·Þ\u0006¨\u0012`4ù\u0018s\u0016á\\1¡\u001f5/Q5kÚ7\u0000\u0098¾ÞãHøµÇ\u009d\u0010\u0094\u001bc±g3ô£\u009cO\u0091¬\u0089\u008a$Ä0È\u0088nt\u008d\u008bIG\u008dD?*Q\u0081\u0080°\u0018O\u0003M¬gÚ°\u009bï3N4Ø\u0099\u009fÍa\u000fÎÛbm==\u0097ú\u0001\u0086`ßÛ \u000b;fW.\u008fEñ'\rÆâð¢\u0015/ãåËÐ\u0095Ì1#*\u0098+S\u008b3x\u009d8L_û\u0019 óâp9ÙÕ\u001fÌ%2ÞÓwH\u0099Ñ\t\u0003!9.D\u0099÷r¬\u0093'SÕMx\u007fùì«FªEû`|i\u0095/\u0006@\u008eÎá\u00020\u0081Ü¼P=4ßº£;\u0085á\u0019)oæ4o\u001dÏý\u0014Ê)\u008fvÏôo\u0089y\u001b\nzL\u0007\"â\u00ad¼\u0019\u001cQÍªö£\b\u00185\u0082\u009b\fÐç}Iiò¼«\u0005í¦#â®A¬\"OÅ]\u0010\u0097Æ.\u009b³V7e\u009f&ÐV\u0012,D\u0097\u0018\u000f_\u0015<mh\u009af<\u0094f\u0000²\u008bzæ{-Ù\tÓr³Õ\u0018\u0006¾\u0080i}±}äïZèáú;\u0089}¸q\u00ad´c:uÂ s\u0007\u0083\u0096\u0094\u0019Àgª\u001fÄ\u008aj¼¿\u007f¾#Ö\u0098ë_\n\u0010ûÙ\u0089[[x)»\u0010\u0086&ÚDÛ\u008b¡ÿÛåN(k\u000b\u0003\u0099\u0018Øï:\u0017\u001ekY=\u0002}\u008a£\u001a¹ýýQ\u008eað\u007f\u0004Bwp¸\u0014'j\u0017Èã\u0011þX\u000e9ôU¹k¨]#\u0016ñ4\u000e=*DI\u0099\u0086\u0090J0(«Î±g\u0098\u0018|3\u0080ÃªãyÄûoú\u0005x÷\u0085¯\u0003Û\u0089\u0086\u0081\u009e\u0003ÁzçóA.\u0089»~\u009aú0\br\u0094\u00851ï\u0083¼Ã\u001e*®Â&\u001eWÿt.N?\u0091G·N½e,®ø\u0098î\t\u009ae\u0006ò|\u0018\u0006\u0087\u009fAZýQ\u0005,;Ð®\u0011\u009eúOÉªéäA5\u001c& õ3ùäì\u0001\u0096£w{\u000bº¨Õ\nÄ4\u0080¤©{*¬jAWg\u0093öÀá4p0oÒú\u0092\u008eÍ\f\u0096ÿÂ\u0006»Ê-\u0084®Û¬Á\u001e\u0090þv¡\u0015\u0089\u0089íùÕ\u0087À\u001f%#ÿ\u0098\u0007q»®ª\u009fä\u0015 \u008a_\u0014i®\\üñÿ¢1ê÷B&öÖ\fâ´Ç,\u000e Å\u0087ý´«I] ³¨\u001e\u0082JÀ\u0016±&%ju\u0010Â\u0081z8³\u001crÕV\u0089D·\u0014@Ag\u0089\u001b\u001f\u0081\u0018%ìh\nMí\u009dC{\\\u0097\\iø©{aÐoU\u007fó9¸ 3 \u009a\rñòÄ.â/\u0094¼ì¸\u0003ö\u001b\u000bLÄC/Á\u007f:Þ/-P\u00adÁ\u0013 \u0018¯\u0096_·¸)ÌÒbàw]W\u0090\u001cãº=®e\u009eQ\u008d R\u0085\u009f\u008bÿ{T\u0010U9!\u008aN±h;¨·Ðy·Qð\u0080 n÷¥>\b ¬æ\\\u0097 Èq|UÕ\u0003\u0084\u000bF#ù§À¸Ê\u0084§L\u0098K÷\u0018\u009f\u00adD`.Y\u0010Ó\u001dº\u008a,íß\u0086Þ\u0019l\u0004\u0016Ú]pÆ\u0010\u0004ñêÇf\u0084\r©|?\u009a\u000e:n¥\u007f ©¦\u0085Ùu\u0017\u0015ÔÝ\u0089\u0095 ï½Â\u0013\u008e\u0017\u0007\u0012ô\u0000\u008b\u008e½É\u001c«¡Ñ%`\u0018\u001fF\u0098'B\t«\nÞ\u001f³+Y;\u001fdÆ\u0094Fã\u0084Ï£\u009808Æ\u0003'ãö\u0088T\u0010>èsé\u000f\u008b4N\u0086\u0019®*÷G<ð\u0003°¦±`\u0011\u0016\u0000ÑÕ\u0000Ã*\u0083ó^\u0086F½{æ\u0018ñ0H/¦ó\u0005\u0006Äû\u000eÕÉçã0v£öj:Ãxq[H\u0010èöþ@·¨Ì\u008d8µF=Ç¨5\u0010Ä2½5?=H\u0010Ü\u0087ãÈ\n\u009b¥_ÚF\u000b\u0086\u0088s\u008bý\u0018HÏI\u0095ÖDä\u000fðë\u009c{W\u0087#×`¬L\u00ad\u008f0\u0013©(,¸¯Úñ\u0085Ïwë#D\u008cdf\u0015¸SqÍ\u0003\u009e¶|cô»_\u0019ó\u0011¢Þg¨Ô\u00961\u0083\u0015# Cá\u0014\u0080<8dØj-ú7*`\u009c6ÃI£k\u00adi¦Æ\u0089ÔáÃh¾°8 \u009eg{té\u008eÒ\u0080\nI5ó\u009dU\u0005Púe\u0087áÇÊâ\u0088gÅ\u000bÂß¹Üó\u0018\u0084h0®núp2\u0098#©+ÛWMG©NôÆ!GÉÈ\u0010\u001a®Ìd:b\u0017ÅÖÃöß\u0098\u0080.ð";
        int length = "\u0006LõÙ\u0087\u000bÕe2Ã*¢7\u0087\u0004\u0002\u0010ñâ\u0014\u0080¹`í>ß\t(ºÃ(cÜ(HÄ\u0088Ñ$\u001e]u\u00admÄIBà1ìT¾C \u0086´ÜÁP\u00000Ü)Þ¼\u000f\u0000\u009c\u0006\u009cÿ5¨òØÈÉr§\u001açEY¡Y\u001aÜ\u0082\n\u0091²ï\u0018êC²\u0094\u0083\u0085pó8²j*©p½¯Ô =¨\u0097\u0012ðH3Àb6Q\u008c±ô÷¢îô[Ý\u0007Ì¤\u008eµö\u0087l%gÊld?ÈyCt¥\u009b\u0085§»Í\u008d\u001c\u008dÌS\u0085-cPl\u000f³\u0085î\u0013\u0001Â3À[\u0092*+õrh3\u009aá;\u000e@þ\\Ëi&¶\u0018\u001aJFX[\u009bê\u0019>Ä°^\u0018\u0011Ì\u008d²;\u0099¹eø[Ù\u0002_ëàmÑ\f3\u009e\u008e\tsìo×\u0097[[Z\u001f½\u0090ÿ\u0007\u0017\u0017\u0018Zólû«c\u0098\u00016:¡ä\u0084ªq\u0019TuJÀúE\u0087X\u0097xl|¬bH8æ&Ê@\u0087³m\u001c\u008f²\u009f\u0003¤à\u0010½>Ñ\u0087Ðèä\u008bà²äA¸ú\u0092`à\u0015Ê\u0086!\u0005ÃKC8ÀáÏÇNÞ\\.h,Ê\u0080\u007f¹= \u008eç5\u0019\f\u0019\u009däô\u001eòT´ø]äµ\u000f\u007fu&Ô\u001c½iwÝ\u0096íÔóì\u009e=»Kd²×Òiþëzô«%v¿\u0014k\t§j|%\u009c}\u008f\u0014ÁT\u008d\u0087O\u009b{\t_»)\u00adD\u001dÊÆ@iÙ\u0087{SàÆp\u00ad-).Õ(Ý\u0019Ô\u008aµI;j\u0093\u009cÈk\u0099\u0002.ãlÁlt¤\u001bÓë]Ë#\u0096RÑ®L¿4¬\u009eïÂºø[(\u001aa\u0084\u001a\nÚ´'ç{±\n\u0097òUrÉ£V\u0090Ü\u008bT\u0017>\u0087×Å-ssm=Ñb®Øq½\u0080!âÊM\u0000ª°s\u00954\u0011E\u008e²ð\u0017¿ü\u0007X\bêø\u009aET\u0010µÙ\u0019X=JA©\u009eiÍ\u0096k-ì\u0098\u0010l\u0081®½?\u0096ãçñ-¿ BÒ`C Ûÿ¾\fÈ²Æ\\¡òÒxâ~\nh²à\u0094\u0082Þc·\t¬w\u000fd_\u0089Õ4(ä\u0096Ç\u00ad\u001c\u0011«U´ú\u0015~cî\u00834\u0096ÐÖS6\u0002ºe`¼8\r\u0084©Wãz0l`\u0006~m]@S^f%þÛfêÙ\u001dwN\u0098ºIéúØ¨¶ò/Ú\u009aý\u0011«Ùd\u009c<\u0003$_ú¡\u001dbðp`ÂNº=\u001cÆ§\u0088Úg'v$YªÜ\u0007Pôîi\u0082Ø \u001c\u0092*Ø\nNÏôhª\u000f\"ZK$\u0095Å¨xèæ\u0099e@¶Ò\u0087\u008eúÁg¨\u0010´ío/\u0085¤¥¸ð\t\u0095\u000fÛþ\fG ó\u0010û@\u0083ÞM\u0085C[úG`Ø[®\u009a\u007f\u0002HPÕ=c'¨§\u0018ÁÇ\u008b\u009b Wö&LÕä©Y08<£Ec}Õ\u008c\u008dß\u0004j\u009cõ\u0013 Nì(âåy. t¯×æ,ÙÑ\fL\u009cÔ¦\u0006%\u008fæ,\u0091Ñ\u0084ïugPÛà¶à\u0005èÓ\f \u009fªJ\u008a|³·XòÔ£\u008f#\u0088Ù®\u0003-\u0007H\u000eô\u0005þ=v\u009b\u000e\rX\n,\u0010UB@8®\u000eì¹}\u0086ÏúeG÷è\u0010+ð\u001di\u009cx\u0002Þ·Þ\u0006¨\u0012`4ù\u0018s\u0016á\\1¡\u001f5/Q5kÚ7\u0000\u0098¾ÞãHøµÇ\u009d\u0010\u0094\u001bc±g3ô£\u009cO\u0091¬\u0089\u008a$Ä0È\u0088nt\u008d\u008bIG\u008dD?*Q\u0081\u0080°\u0018O\u0003M¬gÚ°\u009bï3N4Ø\u0099\u009fÍa\u000fÎÛbm==\u0097ú\u0001\u0086`ßÛ \u000b;fW.\u008fEñ'\rÆâð¢\u0015/ãåËÐ\u0095Ì1#*\u0098+S\u008b3x\u009d8L_û\u0019 óâp9ÙÕ\u001fÌ%2ÞÓwH\u0099Ñ\t\u0003!9.D\u0099÷r¬\u0093'SÕMx\u007fùì«FªEû`|i\u0095/\u0006@\u008eÎá\u00020\u0081Ü¼P=4ßº£;\u0085á\u0019)oæ4o\u001dÏý\u0014Ê)\u008fvÏôo\u0089y\u001b\nzL\u0007\"â\u00ad¼\u0019\u001cQÍªö£\b\u00185\u0082\u009b\fÐç}Iiò¼«\u0005í¦#â®A¬\"OÅ]\u0010\u0097Æ.\u009b³V7e\u009f&ÐV\u0012,D\u0097\u0018\u000f_\u0015<mh\u009af<\u0094f\u0000²\u008bzæ{-Ù\tÓr³Õ\u0018\u0006¾\u0080i}±}äïZèáú;\u0089}¸q\u00ad´c:uÂ s\u0007\u0083\u0096\u0094\u0019Àgª\u001fÄ\u008aj¼¿\u007f¾#Ö\u0098ë_\n\u0010ûÙ\u0089[[x)»\u0010\u0086&ÚDÛ\u008b¡ÿÛåN(k\u000b\u0003\u0099\u0018Øï:\u0017\u001ekY=\u0002}\u008a£\u001a¹ýýQ\u008eað\u007f\u0004Bwp¸\u0014'j\u0017Èã\u0011þX\u000e9ôU¹k¨]#\u0016ñ4\u000e=*DI\u0099\u0086\u0090J0(«Î±g\u0098\u0018|3\u0080ÃªãyÄûoú\u0005x÷\u0085¯\u0003Û\u0089\u0086\u0081\u009e\u0003ÁzçóA.\u0089»~\u009aú0\br\u0094\u00851ï\u0083¼Ã\u001e*®Â&\u001eWÿt.N?\u0091G·N½e,®ø\u0098î\t\u009ae\u0006ò|\u0018\u0006\u0087\u009fAZýQ\u0005,;Ð®\u0011\u009eúOÉªéäA5\u001c& õ3ùäì\u0001\u0096£w{\u000bº¨Õ\nÄ4\u0080¤©{*¬jAWg\u0093öÀá4p0oÒú\u0092\u008eÍ\f\u0096ÿÂ\u0006»Ê-\u0084®Û¬Á\u001e\u0090þv¡\u0015\u0089\u0089íùÕ\u0087À\u001f%#ÿ\u0098\u0007q»®ª\u009fä\u0015 \u008a_\u0014i®\\üñÿ¢1ê÷B&öÖ\fâ´Ç,\u000e Å\u0087ý´«I] ³¨\u001e\u0082JÀ\u0016±&%ju\u0010Â\u0081z8³\u001crÕV\u0089D·\u0014@Ag\u0089\u001b\u001f\u0081\u0018%ìh\nMí\u009dC{\\\u0097\\iø©{aÐoU\u007fó9¸ 3 \u009a\rñòÄ.â/\u0094¼ì¸\u0003ö\u001b\u000bLÄC/Á\u007f:Þ/-P\u00adÁ\u0013 \u0018¯\u0096_·¸)ÌÒbàw]W\u0090\u001cãº=®e\u009eQ\u008d R\u0085\u009f\u008bÿ{T\u0010U9!\u008aN±h;¨·Ðy·Qð\u0080 n÷¥>\b ¬æ\\\u0097 Èq|UÕ\u0003\u0084\u000bF#ù§À¸Ê\u0084§L\u0098K÷\u0018\u009f\u00adD`.Y\u0010Ó\u001dº\u008a,íß\u0086Þ\u0019l\u0004\u0016Ú]pÆ\u0010\u0004ñêÇf\u0084\r©|?\u009a\u000e:n¥\u007f ©¦\u0085Ùu\u0017\u0015ÔÝ\u0089\u0095 ï½Â\u0013\u008e\u0017\u0007\u0012ô\u0000\u008b\u008e½É\u001c«¡Ñ%`\u0018\u001fF\u0098'B\t«\nÞ\u001f³+Y;\u001fdÆ\u0094Fã\u0084Ï£\u009808Æ\u0003'ãö\u0088T\u0010>èsé\u000f\u008b4N\u0086\u0019®*÷G<ð\u0003°¦±`\u0011\u0016\u0000ÑÕ\u0000Ã*\u0083ó^\u0086F½{æ\u0018ñ0H/¦ó\u0005\u0006Äû\u000eÕÉçã0v£öj:Ãxq[H\u0010èöþ@·¨Ì\u008d8µF=Ç¨5\u0010Ä2½5?=H\u0010Ü\u0087ãÈ\n\u009b¥_ÚF\u000b\u0086\u0088s\u008bý\u0018HÏI\u0095ÖDä\u000fðë\u009c{W\u0087#×`¬L\u00ad\u008f0\u0013©(,¸¯Úñ\u0085Ïwë#D\u008cdf\u0015¸SqÍ\u0003\u009e¶|cô»_\u0019ó\u0011¢Þg¨Ô\u00961\u0083\u0015# Cá\u0014\u0080<8dØj-ú7*`\u009c6ÃI£k\u00adi¦Æ\u0089ÔáÃh¾°8 \u009eg{té\u008eÒ\u0080\nI5ó\u009dU\u0005Púe\u0087áÇÊâ\u0088gÅ\u000bÂß¹Üó\u0018\u0084h0®núp2\u0098#©+ÛWMG©NôÆ!GÉÈ\u0010\u001a®Ìd:b\u0017ÅÖÃöß\u0098\u0080.ð".length();
        char cCharAt = 16;
        int i8 = -1;
        while (true) {
            int i9 = i8 + 1;
            String strSubstring = str.substring(i9, i9 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i10 = i7;
                        i7++;
                        strArr[i10] = strIntern;
                        int i11 = i9 + cCharAt;
                        i2 = i11;
                        if (i11 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            c = strArr;
                            e = new String[56];
                            n = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i12 = 1; i12 < 8; i12++) {
                                bArr2[i12] = (byte) ((j2 << (i12 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[25];
                            int i13 = 0;
                            String str3 = "å\u009c\u00adMG\u007fit\u0095\u000f\u00adÝÚ\u0095\u0014\u0086ìCw`\u0096~G\u0085åª\u0090)¦¢PF\u001drÇyÆÎB÷=Î3INv(#M§-ÝÑ£ÿw|R@Å¹þE\u009e®Â\u0018w\u008a\u008a¨xyh\u0015\u001a\u008e\u001c\u000f\u0000{._É<9àÆ{PF\tgl\u0095xù\u0010|fL.;¦5\n\u0005\u009bBj?\u0088ô\u001bwÚX\u0017±m\u00858£å\u0092)\u008cl×Lt\u00005<¸æ%¼\f$\u008fº¶!âÕ\u0084\u009c\u0099aÖØÄ\u0098ÁÈ\u0088\u0098ðd\u0019\"è±±5\u008cØÈf\u008eÖú\u009au\u0096¼ÆE³»¸/e";
                            int length2 = "å\u009c\u00adMG\u007fit\u0095\u000f\u00adÝÚ\u0095\u0014\u0086ìCw`\u0096~G\u0085åª\u0090)¦¢PF\u001drÇyÆÎB÷=Î3INv(#M§-ÝÑ£ÿw|R@Å¹þE\u009e®Â\u0018w\u008a\u008a¨xyh\u0015\u001a\u008e\u001c\u000f\u0000{._É<9àÆ{PF\tgl\u0095xù\u0010|fL.;¦5\n\u0005\u009bBj?\u0088ô\u001bwÚX\u0017±m\u00858£å\u0092)\u008cl×Lt\u00005<¸æ%¼\f$\u008fº¶!âÕ\u0084\u009c\u0099aÖØÄ\u0098ÁÈ\u0088\u0098ðd\u0019\"è±±5\u008cØÈf\u008eÖú\u009au\u0096¼ÆE³»¸/e".length();
                            int i14 = 0;
                            while (true) {
                                int i15 = i14;
                                i14 += 8;
                                byte[] bytes = str3.substring(i15, i14).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i16 = i13;
                                i13++;
                                long j6 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j7 = j6;
                                    int i17 = i16;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j7 >>> 56), (byte) (j7 >>> 48), (byte) (j7 >>> 40), (byte) (j7 >>> 32), (byte) (j7 >>> 24), (byte) (j7 >>> 16), (byte) (j7 >>> 8), (byte) j7});
                                    long j8 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i17) {
                                        case 0:
                                            jArr2[b5] = j8;
                                            if (i14 >= length2) {
                                                k = jArr;
                                                m = new Integer[25];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22635, 9112435172097438756L ^ j2) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(uc.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26325, 1937977686018747085L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10658, 867975973326824883L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(uc.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6196, 6587036902521279547L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5139, 1547132056994912294L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(uc.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12733, 2759727794939739536L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16603, 6905175308362665160L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(uc.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27706, 3871272010178027534L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22802, 5009687202845316383L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(uc.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23519, 5037116926505342913L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13825, 7943124340603435558L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(uc.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30382, 200924324582881958L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1168, 1536168590852786311L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16521, 5607888968169499869L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(uc.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3376, 6627724902218563840L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26510, 8500481736276044679L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(956, 84013004884307936L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(uc.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8171, 6595727968621597650L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12904, 6796866175007505992L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8537, 2707855865121426709L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(uc.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27917, 4089272938723369254L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10058, 4912204840567417670L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17184, 6884951266886791034L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(uc.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15937, 3076327594790629992L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18754, 1897404051314656612L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15645, 1260135772298957124L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(uc.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16327, 3993418242208747L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26856, 5042007012975961287L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12584, 2561296689881963878L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(uc.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28371, 7280830930252980972L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3843, 7647433671486702344L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4245, 8640387039913213131L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(uc.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13956, 5773671156655012535L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16608, 8276783665071148226L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22047, 3515450838101277255L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(uc.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4925, 93157837403725604L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28815, 1033075226092665985L ^ j2) /* invoke-custom */, 0));
                                                X = kPropertyArr;
                                                Y = new uc((char) i3, i4, (char) i5);
                                                N = yp.L(Y, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24925, 2766429774262365527L ^ j2) /* invoke-custom */, fb.GRIM, null, null, (int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23117, 4891801464235472402L ^ j2) /* invoke-custom */, null, j5);
                                                P = yp.L(Y, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19865, 949992525995524519L ^ j2) /* invoke-custom */, mq.Silent, null, null, (int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23117, 4891801464235472402L ^ j2) /* invoke-custom */, null, j5);
                                                j = yp.t(Y, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5230, 3621323829916801110L ^ j2) /* invoke-custom */, true, j4, null, null, (int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23117, 4891801464235472402L ^ j2) /* invoke-custom */, null);
                                                W = yp.t(Y, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17425, 8865617780152584199L ^ j2) /* invoke-custom */, false, j4, null, null, (int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23117, 4891801464235472402L ^ j2) /* invoke-custom */, null);
                                                f = yp.t(Y, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29226, 3273504391361297975L ^ j2) /* invoke-custom */, false, j4, null, uc::W, 4, null);
                                                w = yp.t(Y, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24294, 1291909052483752691L ^ j2) /* invoke-custom */, true, j4, null, null, (int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23117, 4891801464235472402L ^ j2) /* invoke-custom */, null);
                                                d = yp.t(Y, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29726, 5137260771824433199L ^ j2) /* invoke-custom */, true, j4, null, null, (int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23117, 4891801464235472402L ^ j2) /* invoke-custom */, null);
                                                O = yp.t(Y, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6021, 2232675045316205476L ^ j2) /* invoke-custom */, false, j4, null, null, (int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23117, 4891801464235472402L ^ j2) /* invoke-custom */, null);
                                                J = yp.t(Y, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(409, 6699292626556358076L ^ j2) /* invoke-custom */, true, j4, null, null, (int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23117, 4891801464235472402L ^ j2) /* invoke-custom */, null);
                                                A = yp.t(Y, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9619, 754790784903391625L ^ j2) /* invoke-custom */, false, j4, null, null, (int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23117, 4891801464235472402L ^ j2) /* invoke-custom */, null);
                                                a = yp.t(Y, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2464, 3872148794222675351L ^ j2) /* invoke-custom */, false, j4, null, null, (int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23117, 4891801464235472402L ^ j2) /* invoke-custom */, null);
                                                L = yp.t(Y, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22921, 6133135363187070354L ^ j2) /* invoke-custom */, false, j4, null, null, (int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23117, 4891801464235472402L ^ j2) /* invoke-custom */, null);
                                                y = yp.t(Y, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28444, 292571810248614706L ^ j2) /* invoke-custom */, true, j4, null, null, (int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23117, 4891801464235472402L ^ j2) /* invoke-custom */, null);
                                                B = yp.t(Y, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28352, 7465880641431233236L ^ j2) /* invoke-custom */, false, j4, null, null, (int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23117, 4891801464235472402L ^ j2) /* invoke-custom */, null);
                                                V = new bg();
                                                ConcurrentLinkedQueue concurrentLinkedQueueNewConcurrentLinkedQueue = Queues.newConcurrentLinkedQueue();
                                                Intrinsics.checkNotNullExpressionValue(concurrentLinkedQueueNewConcurrentLinkedQueue, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11239, 530580075665532877L ^ j2) /* invoke-custom */);
                                                o = concurrentLinkedQueueNewConcurrentLinkedQueue;
                                                ConcurrentLinkedQueue concurrentLinkedQueueNewConcurrentLinkedQueue2 = Queues.newConcurrentLinkedQueue();
                                                Intrinsics.checkNotNullExpressionValue(concurrentLinkedQueueNewConcurrentLinkedQueue2, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16830, 8721837619530354070L ^ j2) /* invoke-custom */);
                                                S = concurrentLinkedQueueNewConcurrentLinkedQueue2;
                                                l = new bg();
                                                class_2338[] class_2338VarArr = new class_2338[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17669, 2187973559658555724L ^ j2) /* invoke-custom */];
                                                class_2338VarArr[0] = new class_2338(0, 0, 0);
                                                class_2338VarArr[1] = new class_2338(-1, 0, 0);
                                                class_2338VarArr[2] = new class_2338(1, 0, 0);
                                                class_2338VarArr[3] = new class_2338(0, 0, 1);
                                                class_2338VarArr[4] = new class_2338(0, 0, -1);
                                                class_2338VarArr[5] = new class_2338((int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13181, 777978445117415211L ^ j2) /* invoke-custom */, 0, 0);
                                                class_2338VarArr[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(389, 8974601328402820560L ^ j2) /* invoke-custom */] = new class_2338(2, 0, 0);
                                                class_2338VarArr[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(956, 84013004884307936L ^ j2) /* invoke-custom */] = new class_2338(0, 0, 2);
                                                class_2338VarArr[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26624, 8486185577964799067L ^ j2) /* invoke-custom */] = new class_2338(0, 0, (int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2836, 5178603044517013317L ^ j2) /* invoke-custom */);
                                                class_2338VarArr[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5290, 3789932438930946301L ^ j2) /* invoke-custom */] = new class_2338(0, -1, 0);
                                                class_2338VarArr[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3335, 7584658953544655180L ^ j2) /* invoke-custom */] = new class_2338(1, -1, 0);
                                                class_2338VarArr[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13236, 431249389526441961L ^ j2) /* invoke-custom */] = new class_2338(-1, -1, 0);
                                                class_2338VarArr[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23117, 4891801464235472402L ^ j2) /* invoke-custom */] = new class_2338(0, -1, 1);
                                                class_2338VarArr[(int) c(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26574, 7915686125321096094L ^ j2) /* invoke-custom */] = new class_2338(0, -1, -1);
                                                D = class_2338VarArr;
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j8;
                                            if (i14 >= length2) {
                                                str3 = "©l±ð\n®?\u001d_Å\u001bQy\u0098¬ö";
                                                length2 = "©l±ð\n®?\u001d_Å\u001bQy\u0098¬ö".length();
                                                i14 = 0;
                                            }
                                            break;
                                    }
                                    int i18 = i14;
                                    i14 += 8;
                                    byte[] bytes2 = str3.substring(i18, i14).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i16 = i13;
                                    i13++;
                                    j6 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i19 = i7;
                        i7++;
                        strArr[i19] = strIntern;
                        int i20 = i9 + cCharAt;
                        i8 = i20;
                        if (i20 < length) {
                        }
                        str = "\u0002:V«Á\u009e<¦q\u001b\u0087Ýñ4n\u0013\n\u008cV@\u001aÔfÖ\u0013·}º\"Ø\u0001R\u0087\u0003\u0012i\u001e¢\u001eR\u0010ô\u0016-ÞÄøð]0` Ù\u009c\"þÉ";
                        length = "\u0002:V«Á\u009e<¦q\u001b\u0087Ýñ4n\u0013\n\u008cV@\u001aÔfÖ\u0013·}º\"Ø\u0001R\u0087\u0003\u0012i\u001e¢\u001eR\u0010ô\u0016-ÞÄøð]0` Ù\u009c\"þÉ".length();
                        cCharAt = '(';
                        i2 = -1;
                        break;
                        break;
                }
                i9 = i2 + 1;
                strSubstring = str.substring(i9, i9 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i8);
        }
    }

    private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException noWhenBranchMatchedException) {
        return noWhenBranchMatchedException;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 8348;
        if (e[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) g.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                e[i3] = b(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/uc", e2);
            }
        }
        return e[i3];
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
            java.lang.String r1 = "su/catlean/uc"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uc.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 16636;
        if (m[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) k[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) n.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    n.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/uc", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            m[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return m[i3].intValue();
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
            java.lang.String r1 = "su/catlean/uc"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uc.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
