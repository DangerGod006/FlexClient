package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/tw.class */
public final class tw {

    @NotNull
    private final ry y;

    @NotNull
    private final _g j;
    private float D;
    private float p;
    private float I;
    private float J;

    @NotNull
    private final fd P;

    @NotNull
    private final fd F;

    @NotNull
    private final fd Z;

    @NotNull
    private final fd v;

    @NotNull
    private final fd w;

    @NotNull
    private final fd m;

    @NotNull
    private final fd E;

    @NotNull
    private final List X;
    private boolean l;
    private boolean a;
    private long r;
    private static final String[] c;
    private static final String[] d;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final long[] i;
    private static final Long[] k;
    private static final Map n;
    private static final long b = yz.a(-7372753313878987426L, 3777541502221453432L, MethodHandles.lookup().lookupClass()).a(64410153257794L);
    private static final Map e = new HashMap(13);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02b3 A[PHI: r0
  0x02b3: PHI (r0v43 ??) = (r0v143 ??), (r0v144 ??) binds: [B:17:0x027b, B:23:0x02ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02ee A[PHI: r0
  0x02ee: PHI (r0v44 ??) = (r0v145 ??), (r0v146 ??) binds: [B:25:0x02b6, B:31:0x02e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0329 A[PHI: r0
  0x0329: PHI (r0v45 ??) = (r0v147 ??), (r0v148 ??) binds: [B:33:0x02f1, B:39:0x0324] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0368 A[PHI: r0
  0x0368: PHI (r0v46 ??) = (r0v149 ??), (r0v150 ??) binds: [B:41:0x032c, B:47:0x0363] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03a3 A[PHI: r0
  0x03a3: PHI (r0v47 ??) = (r0v151 ??), (r0v152 ??) binds: [B:49:0x036b, B:55:0x039e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03df A[PHI: r0
  0x03df: PHI (r0v48 ??) = (r0v153 ??), (r0v154 ??) binds: [B:57:0x03a6, B:63:0x03da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x041f A[PHI: r0
  0x041f: PHI (r0v49 ??) = (r0v155 ??), (r0v156 ??) binds: [B:65:0x03e2, B:71:0x041a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0460 A[PHI: r0
  0x0460: PHI (r0v50 ??) = (r0v157 ??), (r0v158 ??) binds: [B:73:0x0422, B:79:0x045b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x049b A[PHI: r0
  0x049b: PHI (r0v51 ??) = (r0v159 ??), (r0v160 ??) binds: [B:81:0x0463, B:87:0x0496] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04d6 A[PHI: r0
  0x04d6: PHI (r0v52 ??) = (r0v161 ??), (r0v162 ??) binds: [B:89:0x049e, B:95:0x04d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04d9 A[Catch: NoSuchElementException -> 0x04fc, TryCatch #3 {NoSuchElementException -> 0x04fc, blocks: (B:95:0x04d1, B:97:0x04d9), top: B:124:0x04d1 }] */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v108, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v114, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v119, types: [int] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v124, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v135, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v138, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v141 */
    /* JADX WARN: Type inference failed for: r0v142 */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r0v144 */
    /* JADX WARN: Type inference failed for: r0v145 */
    /* JADX WARN: Type inference failed for: r0v146 */
    /* JADX WARN: Type inference failed for: r0v147 */
    /* JADX WARN: Type inference failed for: r0v148 */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v150 */
    /* JADX WARN: Type inference failed for: r0v151 */
    /* JADX WARN: Type inference failed for: r0v152 */
    /* JADX WARN: Type inference failed for: r0v153 */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r0v155 */
    /* JADX WARN: Type inference failed for: r0v156 */
    /* JADX WARN: Type inference failed for: r0v157 */
    /* JADX WARN: Type inference failed for: r0v158 */
    /* JADX WARN: Type inference failed for: r0v159 */
    /* JADX WARN: Type inference failed for: r0v160 */
    /* JADX WARN: Type inference failed for: r0v161 */
    /* JADX WARN: Type inference failed for: r0v162 */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v96, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tw(@org.jetbrains.annotations.NotNull su.catlean.ry r11, long r12, @org.jetbrains.annotations.NotNull su.catlean._g r14, float r15, float r16) {
        /*
            Method dump skipped, instruction units count: 1424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tw.<init>(su.catlean.ry, long, su.catlean._g, float, float):void");
    }

    @NotNull
    public final _g K() {
        return this.j;
    }

    public final float k() {
        return this.D;
    }

    public final void m(float f2) {
        this.D = f2;
    }

    public final float Y() {
        return this.p;
    }

    public final void n(float f2) {
        this.p = f2;
    }

    public final float P() {
        return this.I;
    }

    public final void e(float f2) {
        this.I = f2;
    }

    public final float V() {
        return this.J;
    }

    public final void x(float f2) {
        this.J = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d A[PHI: r0
  0x008d: PHI (r0v23 ??) = (r0v31 ??), (r0v24 ??) binds: [B:8:0x006b, B:16:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006e  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0099 -> B:6:0x0049). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List T(long r7) {
        /*
            r6 = this;
            long r0 = su.catlean.tw.b
            r1 = r7
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r6
            java.util.List r0 = r0.X
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r10 = r0
            r0 = 2408255522490969455(0x216bd7a362726d6f, double:1.0887240593496996E-147)
            r1 = r7
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r1 = 0
            r11 = r1
            r1 = r10
            r12 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            r13 = r1
            r1 = 0
            r14 = r1
            r1 = r12
            java.util.Iterator r1 = r1.iterator()
            r15 = r1
            r9 = r0
        L38:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L90
            r0 = r15
            java.lang.Object r0 = r0.next()
        L49:
            r16 = r0
            r0 = r16
            su.catlean.ru r0 = (su.catlean.ru) r0
            r17 = r0
            r0 = 0
            r18 = r0
            r0 = r17
            su.catlean.a1 r0 = r0.A()     // Catch: java.util.NoSuchElementException -> L78
            kotlin.jvm.functions.Function0 r0 = r0.c()     // Catch: java.util.NoSuchElementException -> L78
            java.lang.Object r0 = r0.invoke()     // Catch: java.util.NoSuchElementException -> L78
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.util.NoSuchElementException -> L78
            boolean r0 = r0.booleanValue()     // Catch: java.util.NoSuchElementException -> L78
            r1 = r7
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L8d
            r1 = r9
            if (r1 != 0) goto L8b
            if (r0 == 0) goto L38
            goto L82
        L78:
            r1 = 2448455947279493766(0x21faa9b629c96a86, double:5.3381413113807554E-145)
            r2 = r7
            java.util.NoSuchElementException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/util/NoSuchElementException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r0 = r13
            r1 = r16
            boolean r0 = r0.add(r1)
        L8b:
            r0 = r9
        L8d:
            if (r0 == 0) goto L38
        L90:
            r0 = r13
            java.util.List r0 = (java.util.List) r0
            r1 = r7
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L49
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tw.T(long):java.util.List");
    }

    public final void m(long a, @NotNull List value) {
        Intrinsics.checkNotNullParameter(value, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24364, 4256817241053333068L ^ (b ^ a)) /* invoke-custom */);
        this.X.addAll(value);
    }

    public final boolean z() {
        return this.l;
    }

    public final void G(boolean z) {
        this.l = z;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x0A3B: MOVE_MULTI in method: su.catlean.tw.E(net.minecraft.class_332, int, int, char, short, int, float, boolean):void, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/tw.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x0A3B: MOVE_MULTI
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for object array[23]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:313)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    public final void E(@org.jetbrains.annotations.NotNull net.minecraft.class_332 r1, int r2, int r3, char r4, short r5, int r6, float r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 2758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tw.E(net.minecraft.class_332, int, int, char, short, int, float, boolean):void");
    }

    /*  JADX ERROR: Failed to decode insn: 0x0554: MOVE_MULTI
        java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -3 out of bounds for object array[23]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:304)
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
    private final void p(net.minecraft.class_332 r24, int r25, int r26, java.awt.Color r27, long r28, java.awt.Color r30) {
        /*
            Method dump skipped, instruction units count: 1425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tw.p(net.minecraft.class_332, int, int, java.awt.Color, long, java.awt.Color):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void D(short r10, int r11, double r12, int r14, double r15, int r17) {
        /*
            Method dump skipped, instruction units count: 1639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tw.D(short, int, double, int, double, int):void");
    }

    public final void j(long j) {
        d2.O.H().L((b ^ j) ^ 24516904665043L);
        this.r = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public final void R(short s, short s2, int i2, int i3) {
        tw twVar;
        long j = (((((long) s) << 48) | ((((long) s2) << 48) >>> 16)) | ((((long) i3) << 32) >>> 32)) ^ b;
        long j2 = j ^ 87443293068171L;
        long j3 = j ^ 112449341166161L;
        int i4 = (int) (j >>> 48);
        int i5 = (int) ((j3 << 16) >>> 32);
        int i6 = (int) ((j3 << 48) >>> 48);
        ?? AreEqual = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4378668713275509075L, j) /* invoke-custom */;
        try {
            AreEqual = Intrinsics.areEqual(this.y.Y(), this);
            ?? r0 = AreEqual;
            if (AreEqual != 0) {
                if (AreEqual != 0) {
                    loop0: for (ru ruVar : this.X) {
                        ru ruVar2 = null;
                        try {
                            ruVar2 = ruVar;
                            ruVar2.V(i2, (short) i4, i5, (char) i6);
                            do {
                                ?? r02 = AreEqual;
                                if (s >= 0) {
                                    if (r02 == 0) {
                                        break loop0;
                                    } else {
                                        r02 = AreEqual;
                                    }
                                }
                                if (r02 == 0) {
                                }
                            } while (s2 < 0);
                        } catch (NoSuchElementException unused) {
                            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(ruVar2, -4360377688980224000L, j) /* invoke-custom */;
                        }
                    }
                }
                r0 = this.l;
            }
            ?? r03 = r0;
            if (i3 >= 0) {
                r03 = r0;
                if (AreEqual != 0) {
                    if (r0 == 0) {
                        return;
                    } else {
                        r03 = i2;
                    }
                }
            }
            try {
                if (s >= 0) {
                    try {
                        switch (r03) {
                            case 256:
                            case 261:
                                twVar = this;
                                if (s2 > 0) {
                                    twVar.j.N(new lj(-1, this.a, false), j2);
                                    r03 = AreEqual;
                                }
                                twVar.l = false;
                                break;
                            default:
                                this.j.N(new lj(i2, this.a, false), j2);
                                twVar = this;
                                twVar.l = false;
                        }
                    } catch (NoSuchElementException unused2) {
                        throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r03, -4360377688980224000L, j) /* invoke-custom */;
                    }
                }
                if (r03 == 0) {
                    this.j.N(new lj(i2, this.a, false), j2);
                }
                twVar = this;
                twVar.l = false;
            } catch (NoSuchElementException unused3) {
                throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r03, -4360377688980224000L, j) /* invoke-custom */;
            }
        } catch (NoSuchElementException unused4) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(AreEqual, -4360377688980224000L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    public final void l(char c2, long a) {
        long j = b ^ a;
        long j2 = j ^ 57822309818805L;
        ?? AreEqual = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6307639418285792142L, j) /* invoke-custom */;
        try {
            try {
                tw twVarY = this.y.Y();
                if (AreEqual == 0) {
                    AreEqual = Intrinsics.areEqual(twVarY, this);
                    if (AreEqual == 0) {
                        return;
                    } else {
                        twVarY = this;
                    }
                }
                for (ru ruVar : twVarY.X) {
                    ru ruVar2 = null;
                    try {
                        ruVar2 = ruVar;
                        ruVar2.T(c2, j2);
                        do {
                            ?? r0 = AreEqual;
                            if (j > 0) {
                                if (r0 != 0) {
                                    return;
                                } else {
                                    r0 = AreEqual;
                                }
                            }
                            if (r0 != 0) {
                            }
                        } while (j < 0);
                        return;
                    } catch (NoSuchElementException unused) {
                        throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(ruVar2, -6275839425789697125L, j) /* invoke-custom */;
                    }
                }
            } catch (NoSuchElementException unused2) {
                throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(AreEqual, -6275839425789697125L, j) /* invoke-custom */;
            }
        } catch (NoSuchElementException unused3) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(AreEqual, -6275839425789697125L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0183 A[PHI: r0 r1
  0x0183: PHI (r0v48 ??) = (r0v85 ??), (r0v86 ??) binds: [B:56:0x014f, B:65:0x0181] A[DONT_GENERATE, DONT_INLINE]
  0x0183: PHI (r1v19 ??) = (r1v37 ??), (r1v20 ??) binds: [B:56:0x014f, B:65:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0197 A[PHI: r0
  0x0197: PHI (r0v49 ??) = (r0v48 ??), (r0v50 ??) binds: [B:66:0x0183, B:71:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109 A[EXC_TOP_SPLITTER, PHI: r0
  0x0109: PHI (r0v64 ??) = (r0v74 ??), (r0v75 ??), (r0v76 ??) binds: [B:27:0x00c2, B:29:0x00c7, B:39:0x00f0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a0 A[EDGE_INSN: B:96:0x01a0->B:75:0x01a0 BREAK  A[LOOP:0: B:10:0x0061->B:99:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[LOOP:0: B:10:0x0061->B:99:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Throwable, java.util.NoSuchElementException] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [su.catlean.h] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Throwable, java.util.NoSuchElementException] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, su.catlean.h] */
    /* JADX WARN: Type inference failed for: r0v64, types: [su.catlean.h] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Throwable, java.util.NoSuchElementException] */
    /* JADX WARN: Type inference failed for: r0v69, types: [su.catlean.w7] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(double r12, long r14, double r16, double r18) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tw.v(double, long, double, double):boolean");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:64:0x0183
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final float M(@org.jetbrains.annotations.NotNull su.catlean.h r9, long r10) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tw.M(su.catlean.h, long):float");
    }

    static {
        int i2;
        long j = b ^ 70540637732069L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[28];
        int i4 = 0;
        String str = "Ç5@õà¶*¶{ò\u0011¬g¨ÚßSZÏ>¬Ø\u001dh>ñ<C\u008a#K2³\u0083\u0012'Î& \u009cË\u0095S\u001a+4\u0000\u008eÚ'\u00ad,®\u0094ÖâÏ\u0002\u0093t\u001b\u009a¦/ ¶=ãLî\u0091°gìþ\u00ad8\\£\u00900ÂÉìD]\u0086'ñ]÷Ãi\u0098¼\u0086{Ð\u0016\u001f9\u0082nû\u0094\u00059\u009aÿ®\u0010Y\u0012Êÿ\u009fÌÐ¯W\u0095ÔmrÉ\u00ad\u0096\u0084J\u009c\u0000?\u0016ÛÌÔ\u0010·('@n6ôExkGû)Ç^ª\u0010¹BÌ\u0010\u000f\u008c\u009d8E7\u001dÔ\u001d\u008e¯û\u0010¯\u0003©®bÍÍøÐv ü!ñ\u0003m¨»\u0017\u0003öqîK»úòÇºïé\u008bP¦3tu!ì½áu×À\u008f?áð¢ºæ#\u0095ëJxô\u0097ópÞ\u000e\u0017Íâ\u0019¨\u009e¥Â*ã\n:|\b¡üË0³ +Àñp ñû89Øéè\u0091\u0001>àc\u0082`ýÂ\"Û\u0094Ü\u008f\fK\u008f\t\u0013Ë\r@\u001cÕßÞ\u0096/Sò·\\q\u0097ä=ÚìþèÝÏyõâ¤\u0080ÕX+N£\u0005=iJHçè¬\u001e\u0098\u0003¸;ù©zú(\u00122c&e\u0004ÔuÑ»Í)é²\u000e\u008c¿\u0018Û®Â°Ï¾ï \u0080\u001b\u0004ÌÛ\u008aÜ\u0092\u0094Ò\n[\u001c¹\u008b½M\u007f§q\u0089Î\u001a£æ\u000224,×s\fùòÊ\u009b{µæ\u009fÏñ^5LÇù[9nH¥²Q¾öÂÆE§Gê\u0084¡¿|ÞIÑY[|E7«#é\u0015\u0091\r{#[:³\u009drFu\u009a\u000eã+\fæ\u0087ÒÆ_v\u000f=ïÃ\u0089\u0093\u000bö¢Â4Z]\u009c\u009c\u0013Y\u001ad\u0087\u008d0¯\u0002&÷Û\u0010@_Ûì\\\fr\u000b·þÿ\bbûÑÔý'\u0096£±¤è\u009f\u0013¬ÛT\u001c]\u001a\u0098V\nC³\u0080\u000bï\bÓÕO,¨\f!~Ó\u008bu\u0005>i\u0002<è×¯9«SQÆôdÈû\t\u0088¢ñ½Ð\u0085¹\u0085Un\u001dòßøðNDìéE÷çÀ\u0083ÝÅ4\u000e\rþt<Å ÷»\u0006\u0098Íª\u009bx\u0098%´\u0089+<\u0092[l¸Ôz3¼\u0007¤hÆ\u0005ÄkÙb ®A\u008cL¬Á\u0090\u0001SÆA\fü\u0018K\u0014UI\u00adÁ+Ù¥>9÷¹\u008dx´õÔ?b-Ag¤nÈ´_\u0001\u0080¯yµg\u009c%\u0010±\u009fðUÜ\u0013{©þ±#.$6Æ\u0088ï°Ø°1e!\fCS\u0005@¦OÏ\u0089/Õ\u0090\u0010òCAÓÿóü÷)¾ªÒØ8Ù\u0004+x\t«þ\u0090\u007fezÌé«ºKª~\u000e®Èd\u0013$M\u008dá\u0087Ï\rUï>\u008a¿â9Â¬¨p\u0093 CÃa-\u000e\u0015\u001eñT´@9â?\u000ePØ\u0095WãìÕ\u0010øØGª(]ú\u0087\u001c\u0010ÊÌ\u0087÷¨\u0012\u00ad\u0010\u0088}ì4ÁáI\u0082ÀÐÇ\nIG\u0088d\u0005ÁôÃ½]X\fÆ\u008do\u008d¢lgr\u007fÔÖ¼s*|´`?\u0002^!yë8\u000bÝø[\u009fµ\u0096\u0016\u007fð.~Üªziúk\u0001nÁ\u0002\u0093d\u0089 Ñø\u0081°u®I\\¢*\u0085\u001cáÅËc@\u001f¡^Ai²\u001f\u0095\u0095~O&N\u0085\u0005¥ó\u0093&×ª\u0091èqc¶Á¬\u0016¹3|²£\u001d\u0014\u0016\u0001\u009e\u007f\u009c»=¿¶ñÃÿM÷\u000bmin¹ó\byu\u0091\u0085\fíTý|\u007f\u001f¿¯\u0006]x÷\\f\u0087\u0088\u009d\u0012\u009aº@Ô{\u0099&4Óh®øÁÁ\u009a3ÒÍ\u009d°R'\u0013\u001bÖ\u000fSkjÿ\u0010 \u009f\u0082-±R-,pû\u009b\u009b\u009dûÔ\u001d áR?¢à\u0098|\u0095o´)¸Â}¬®~i\u0081é\u000eÛu\u0019ÆÎºk2åt\u0085\u0088w\rÎÁßß¼f\u0005,2<ÅKøûSR \u009ej/Ãá\u0096\u0090\u0003\u0081\u001eS×¥:wFÑ\u0089bÏ¥tÛô\u0001J\u0082\u008b\t?Iñ+³g\u000b\u008d×\u007fv\u008b·´/Í\"\u001f\u0089ã\u0013HÐÅ\u0087{ô¡;G\u0007S^ª#øò_¸ÿ(?øÑ+Û<\bF8ÿ\u009fº!CÒ\u0019\u0091Ú»ñ¼ñ]ÉFÐ\u0090Ç\u0084ÏÖùHÊZÅ¹©(8ÕLa\f\u0087\u0017Ì\u0018\u0006h*ÖF>Pj9\u001e% ¶Cê\u0086\u0000y\u009cRk\u0019\u0019þ\u0010+YÕzÿö¶ìÛLFÄViôZ°9ù¾ñ?sÞ£\u000b[&\u009a\u0003S03\t÷\u0084«JNò\u008f:½Zµ\u0098ÑÐ y\u0082\u008e\u0019`<\u001f¹ãM\u0086\u0088Ð\u008c\u0015áHàf\u001dâTÕ\u0095\u000b\tw¬\u0012 \u0098§¦\u0081ædBîÍ«\u001c\u0012D\";í\u008d\u0001Ó¥WpÐJ\u008e£¦¶ô(Ýé.\u009d/tªhÏ\u001e\u0005Ñ¦l»æÞÖ´$üÁ²\u0082\u0012TRthgÉ± 0TçåÜ¼eÏIÎrÚwÄ'\u0006\u0082\u000f}é\u0090¥:\u0082\u008eà\u0002Ú\u00162\u000ej\u0011G\u0097\u0093*\u0099F\u000bñ\u0018\u0087Ï\u0005é¬\u009e¢àëX±Z\u0090%5(\u0002ëT÷\u001eòðx\u001e§¥;%£ð\u0004*Xí\u0014\u009e¤¢º!æ7?Ì¢þ\u0016t±\u000fùÉrjg paÆ\u009câßÙrU&ô\u001aò\u008a´}ð\u0099ÄÜù\u00915!ì±µf\u0088é\u0000+\u0015Ë~OÀr«\u0000\u009c QD$TÆµ¨\n\u0083\u001fZ$S1ìE\u009fÕ7ÅP»I~\u00825XûW'¸\u0016PÉÌñÀ\u00071z{W\u0091$/\u001a\u001e¾:#Á\rUÕ\u0092Êéf\u0003'å6\u0086\u009aÈ\u0095\u008f\u0019\u0006V=É¼\u0000\u0091;àÀ\u0018\u0085/\u009fï7«\u0089Bû\u0084Kì \u007f4ð\u000buð\u0017\u008e©\f\u0093ð \fÏæ£NDfÛ\u0082,ð\u009a|ðp\u008c)\u009e9¯ÚZªê¶Å¥\u008e:ì³\u009e=Ôÿv`¹'.ç\u0090ùðç\u0012ÆÔ\u00ad©¾\u0084-\u0005%\u0010Ñ\u0094ÏJO\u001fN\u0006\u0018¦\u0019Âû\u0097ØsX\u000bË#¼#\u0099\u0088\u0001ªòÆAôÜ\u009e[l\"\u0015<@g\u0002\u008fÙE\u0093\u001eÝµ·t@·©p?.©\u0093Ö<L\u0002\u008eî|\u0095W\u001f\u0090ªÏ\u008d^ÙÀm[\u0007ô¬ãp\u0091tüOYÃo\u00956§ë³\u0093t¶\u0018:º\u008f¿ðS2Q\u0080c\u0083d\r\u0088\u0090·\\\n\u0080Ãg°\u0087ñ7>%±\u0099\u0085`$\"(?\t«\u008bÆÙò \u009d\u001eìDs¿\u0013\u0014¤0ij\u008e0ZH´Êªýt¸\u000eÚ&ÁY<\u0005Üÿ¡(ñ!¹\u0083ï£\u008e ÎØ:û&²ÚÎf!\u0087§zÇoÆ7×÷½\u0000\u0099\b{g\b÷\u0097\r!àóY\u001a\u009f\u0012ªôÀ¢0\u001c\u0098y)±pÄÓwí%.×\u0080±¸\u009aaTùD «\u009f\u0001ú\u0087\u000eu2ÊÛ¢\u0090Rúø¨\\\u008f\u0088\u009fg\u0096\u009aÌ¥·\u001f¸\u0010jÞÁð\u0091£ØóÚ\u008c[\u0002\u001czSê¼V\u0012¶*~\u0097yaFñTÀ\u008e\u0012\u008e\u009b¨~1C>,©úv×Gò\u0010¡À¦)å$\u0094NÔSâØl<Î\u0007\u009d\u008c±v|ù\u0015ì\u0081Ò:2:A}s\\Ñ\u0018'u©k#ëÒ\r\u0095Î\u0010#è\u0087÷\u0091{Âë\u0015m\r@\u001a\u008eÝô\u0010Ý.\u000e×+¡{^aWk\u0081)\u0014\u009b.\u0090$#¬&`RTÞ\u0093âq\u0016\u0004$Câ\u00848þã\u0017î\u0010¶>Rò\u008dÀ?jï´\u007føJ\u0018\"w\u0098òy\u00810Q¤|}L\r\u0098|n)úx\u000eM\u0019©\u000b¢Þ_ dÙ\u0002'u\u007fâºXmñã6«ûDÀ\u0082½5/àLAhø\u0013yZ_\u0011\n¤<Ú\r\u0015.=×óÌ¦¸I\u0018\u0088Å\ts\u0005ó²l\u001bf\u009fç\u0094rÜH¢Ýã\u008f\u0087ÚBûÐÓ\u008fâSuJø\u0001";
        int length = "Ç5@õà¶*¶{ò\u0011¬g¨ÚßSZÏ>¬Ø\u001dh>ñ<C\u008a#K2³\u0083\u0012'Î& \u009cË\u0095S\u001a+4\u0000\u008eÚ'\u00ad,®\u0094ÖâÏ\u0002\u0093t\u001b\u009a¦/ ¶=ãLî\u0091°gìþ\u00ad8\\£\u00900ÂÉìD]\u0086'ñ]÷Ãi\u0098¼\u0086{Ð\u0016\u001f9\u0082nû\u0094\u00059\u009aÿ®\u0010Y\u0012Êÿ\u009fÌÐ¯W\u0095ÔmrÉ\u00ad\u0096\u0084J\u009c\u0000?\u0016ÛÌÔ\u0010·('@n6ôExkGû)Ç^ª\u0010¹BÌ\u0010\u000f\u008c\u009d8E7\u001dÔ\u001d\u008e¯û\u0010¯\u0003©®bÍÍøÐv ü!ñ\u0003m¨»\u0017\u0003öqîK»úòÇºïé\u008bP¦3tu!ì½áu×À\u008f?áð¢ºæ#\u0095ëJxô\u0097ópÞ\u000e\u0017Íâ\u0019¨\u009e¥Â*ã\n:|\b¡üË0³ +Àñp ñû89Øéè\u0091\u0001>àc\u0082`ýÂ\"Û\u0094Ü\u008f\fK\u008f\t\u0013Ë\r@\u001cÕßÞ\u0096/Sò·\\q\u0097ä=ÚìþèÝÏyõâ¤\u0080ÕX+N£\u0005=iJHçè¬\u001e\u0098\u0003¸;ù©zú(\u00122c&e\u0004ÔuÑ»Í)é²\u000e\u008c¿\u0018Û®Â°Ï¾ï \u0080\u001b\u0004ÌÛ\u008aÜ\u0092\u0094Ò\n[\u001c¹\u008b½M\u007f§q\u0089Î\u001a£æ\u000224,×s\fùòÊ\u009b{µæ\u009fÏñ^5LÇù[9nH¥²Q¾öÂÆE§Gê\u0084¡¿|ÞIÑY[|E7«#é\u0015\u0091\r{#[:³\u009drFu\u009a\u000eã+\fæ\u0087ÒÆ_v\u000f=ïÃ\u0089\u0093\u000bö¢Â4Z]\u009c\u009c\u0013Y\u001ad\u0087\u008d0¯\u0002&÷Û\u0010@_Ûì\\\fr\u000b·þÿ\bbûÑÔý'\u0096£±¤è\u009f\u0013¬ÛT\u001c]\u001a\u0098V\nC³\u0080\u000bï\bÓÕO,¨\f!~Ó\u008bu\u0005>i\u0002<è×¯9«SQÆôdÈû\t\u0088¢ñ½Ð\u0085¹\u0085Un\u001dòßøðNDìéE÷çÀ\u0083ÝÅ4\u000e\rþt<Å ÷»\u0006\u0098Íª\u009bx\u0098%´\u0089+<\u0092[l¸Ôz3¼\u0007¤hÆ\u0005ÄkÙb ®A\u008cL¬Á\u0090\u0001SÆA\fü\u0018K\u0014UI\u00adÁ+Ù¥>9÷¹\u008dx´õÔ?b-Ag¤nÈ´_\u0001\u0080¯yµg\u009c%\u0010±\u009fðUÜ\u0013{©þ±#.$6Æ\u0088ï°Ø°1e!\fCS\u0005@¦OÏ\u0089/Õ\u0090\u0010òCAÓÿóü÷)¾ªÒØ8Ù\u0004+x\t«þ\u0090\u007fezÌé«ºKª~\u000e®Èd\u0013$M\u008dá\u0087Ï\rUï>\u008a¿â9Â¬¨p\u0093 CÃa-\u000e\u0015\u001eñT´@9â?\u000ePØ\u0095WãìÕ\u0010øØGª(]ú\u0087\u001c\u0010ÊÌ\u0087÷¨\u0012\u00ad\u0010\u0088}ì4ÁáI\u0082ÀÐÇ\nIG\u0088d\u0005ÁôÃ½]X\fÆ\u008do\u008d¢lgr\u007fÔÖ¼s*|´`?\u0002^!yë8\u000bÝø[\u009fµ\u0096\u0016\u007fð.~Üªziúk\u0001nÁ\u0002\u0093d\u0089 Ñø\u0081°u®I\\¢*\u0085\u001cáÅËc@\u001f¡^Ai²\u001f\u0095\u0095~O&N\u0085\u0005¥ó\u0093&×ª\u0091èqc¶Á¬\u0016¹3|²£\u001d\u0014\u0016\u0001\u009e\u007f\u009c»=¿¶ñÃÿM÷\u000bmin¹ó\byu\u0091\u0085\fíTý|\u007f\u001f¿¯\u0006]x÷\\f\u0087\u0088\u009d\u0012\u009aº@Ô{\u0099&4Óh®øÁÁ\u009a3ÒÍ\u009d°R'\u0013\u001bÖ\u000fSkjÿ\u0010 \u009f\u0082-±R-,pû\u009b\u009b\u009dûÔ\u001d áR?¢à\u0098|\u0095o´)¸Â}¬®~i\u0081é\u000eÛu\u0019ÆÎºk2åt\u0085\u0088w\rÎÁßß¼f\u0005,2<ÅKøûSR \u009ej/Ãá\u0096\u0090\u0003\u0081\u001eS×¥:wFÑ\u0089bÏ¥tÛô\u0001J\u0082\u008b\t?Iñ+³g\u000b\u008d×\u007fv\u008b·´/Í\"\u001f\u0089ã\u0013HÐÅ\u0087{ô¡;G\u0007S^ª#øò_¸ÿ(?øÑ+Û<\bF8ÿ\u009fº!CÒ\u0019\u0091Ú»ñ¼ñ]ÉFÐ\u0090Ç\u0084ÏÖùHÊZÅ¹©(8ÕLa\f\u0087\u0017Ì\u0018\u0006h*ÖF>Pj9\u001e% ¶Cê\u0086\u0000y\u009cRk\u0019\u0019þ\u0010+YÕzÿö¶ìÛLFÄViôZ°9ù¾ñ?sÞ£\u000b[&\u009a\u0003S03\t÷\u0084«JNò\u008f:½Zµ\u0098ÑÐ y\u0082\u008e\u0019`<\u001f¹ãM\u0086\u0088Ð\u008c\u0015áHàf\u001dâTÕ\u0095\u000b\tw¬\u0012 \u0098§¦\u0081ædBîÍ«\u001c\u0012D\";í\u008d\u0001Ó¥WpÐJ\u008e£¦¶ô(Ýé.\u009d/tªhÏ\u001e\u0005Ñ¦l»æÞÖ´$üÁ²\u0082\u0012TRthgÉ± 0TçåÜ¼eÏIÎrÚwÄ'\u0006\u0082\u000f}é\u0090¥:\u0082\u008eà\u0002Ú\u00162\u000ej\u0011G\u0097\u0093*\u0099F\u000bñ\u0018\u0087Ï\u0005é¬\u009e¢àëX±Z\u0090%5(\u0002ëT÷\u001eòðx\u001e§¥;%£ð\u0004*Xí\u0014\u009e¤¢º!æ7?Ì¢þ\u0016t±\u000fùÉrjg paÆ\u009câßÙrU&ô\u001aò\u008a´}ð\u0099ÄÜù\u00915!ì±µf\u0088é\u0000+\u0015Ë~OÀr«\u0000\u009c QD$TÆµ¨\n\u0083\u001fZ$S1ìE\u009fÕ7ÅP»I~\u00825XûW'¸\u0016PÉÌñÀ\u00071z{W\u0091$/\u001a\u001e¾:#Á\rUÕ\u0092Êéf\u0003'å6\u0086\u009aÈ\u0095\u008f\u0019\u0006V=É¼\u0000\u0091;àÀ\u0018\u0085/\u009fï7«\u0089Bû\u0084Kì \u007f4ð\u000buð\u0017\u008e©\f\u0093ð \fÏæ£NDfÛ\u0082,ð\u009a|ðp\u008c)\u009e9¯ÚZªê¶Å¥\u008e:ì³\u009e=Ôÿv`¹'.ç\u0090ùðç\u0012ÆÔ\u00ad©¾\u0084-\u0005%\u0010Ñ\u0094ÏJO\u001fN\u0006\u0018¦\u0019Âû\u0097ØsX\u000bË#¼#\u0099\u0088\u0001ªòÆAôÜ\u009e[l\"\u0015<@g\u0002\u008fÙE\u0093\u001eÝµ·t@·©p?.©\u0093Ö<L\u0002\u008eî|\u0095W\u001f\u0090ªÏ\u008d^ÙÀm[\u0007ô¬ãp\u0091tüOYÃo\u00956§ë³\u0093t¶\u0018:º\u008f¿ðS2Q\u0080c\u0083d\r\u0088\u0090·\\\n\u0080Ãg°\u0087ñ7>%±\u0099\u0085`$\"(?\t«\u008bÆÙò \u009d\u001eìDs¿\u0013\u0014¤0ij\u008e0ZH´Êªýt¸\u000eÚ&ÁY<\u0005Üÿ¡(ñ!¹\u0083ï£\u008e ÎØ:û&²ÚÎf!\u0087§zÇoÆ7×÷½\u0000\u0099\b{g\b÷\u0097\r!àóY\u001a\u009f\u0012ªôÀ¢0\u001c\u0098y)±pÄÓwí%.×\u0080±¸\u009aaTùD «\u009f\u0001ú\u0087\u000eu2ÊÛ¢\u0090Rúø¨\\\u008f\u0088\u009fg\u0096\u009aÌ¥·\u001f¸\u0010jÞÁð\u0091£ØóÚ\u008c[\u0002\u001czSê¼V\u0012¶*~\u0097yaFñTÀ\u008e\u0012\u008e\u009b¨~1C>,©úv×Gò\u0010¡À¦)å$\u0094NÔSâØl<Î\u0007\u009d\u008c±v|ù\u0015ì\u0081Ò:2:A}s\\Ñ\u0018'u©k#ëÒ\r\u0095Î\u0010#è\u0087÷\u0091{Âë\u0015m\r@\u001a\u008eÝô\u0010Ý.\u000e×+¡{^aWk\u0081)\u0014\u009b.\u0090$#¬&`RTÞ\u0093âq\u0016\u0004$Câ\u00848þã\u0017î\u0010¶>Rò\u008dÀ?jï´\u007føJ\u0018\"w\u0098òy\u00810Q¤|}L\r\u0098|n)úx\u000eM\u0019©\u000b¢Þ_ dÙ\u0002'u\u007fâºXmñã6«ûDÀ\u0082½5/àLAhø\u0013yZ_\u0011\n¤<Ú\r\u0015.=×óÌ¦¸I\u0018\u0088Å\ts\u0005ó²l\u001bf\u009fç\u0094rÜH¢Ýã\u008f\u0087ÚBûÐÓ\u008fâSuJø\u0001".length();
        char cCharAt = 136;
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
                            c = strArr;
                            d = new String[28];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[14];
                            int i10 = 0;
                            String str3 = ";\u0010\u0015\n\u008a\u009c\u008bð»Ä6\\rw&»I\u0018ï\u0088\u009e¿5qø¨ìLýp;\b^±å=°\u001c]\u0087n\u001dê=\u0017\u0003\u001e×Z%C\u008e\u0099é@\u009eúu+:\u0081®ò\u0002½\u0088ÐGû¢½J\u0011þÇÎ\u0086\u0095ß5\u0092<Ü\u0093\u0011ÿ\u0081È\u0098¹üÁËÑVw";
                            int length2 = ";\u0010\u0015\n\u008a\u009c\u008bð»Ä6\\rw&»I\u0018ï\u0088\u009e¿5qø¨ìLýp;\b^±å=°\u001c]\u0087n\u001dê=\u0017\u0003\u001e×Z%C\u008e\u0099é@\u009eúu+:\u0081®ò\u0002½\u0088ÐGû¢½J\u0011þÇÎ\u0086\u0095ß5\u0092<Ü\u0093\u0011ÿ\u0081È\u0098¹üÁËÑVw".length();
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
                                                f = jArr;
                                                g = new Integer[14];
                                                n = new HashMap(13);
                                                Cipher cipher3 = Cipher.getInstance("DES/CBC/NoPadding");
                                                SecretKeyFactory secretKeyFactory3 = SecretKeyFactory.getInstance("DES");
                                                byte[] bArr3 = new byte[8];
                                                bArr3[0] = (byte) (j >>> 56);
                                                for (int i15 = 1; i15 < 8; i15++) {
                                                    bArr3[i15] = (byte) ((j << (i15 * 8)) >>> 56);
                                                }
                                                cipher3.init(2, secretKeyFactory3.generateSecret(new DESKeySpec(bArr3)), new IvParameterSpec(new byte[8]));
                                                long[] jArr3 = new long[4];
                                                int i16 = 0;
                                                String str4 = "\u00946âÏ\u0014y\u008b\u0017\u0004<P\u0018b¶\u00036";
                                                int length3 = "\u00946âÏ\u0014y\u008b\u0017\u0004<P\u0018b¶\u00036".length();
                                                int i17 = 0;
                                                while (true) {
                                                    int i18 = i17;
                                                    i17 += 8;
                                                    byte[] bytes2 = str4.substring(i18, i17).getBytes("ISO-8859-1");
                                                    long[] jArr4 = jArr3;
                                                    int i19 = i16;
                                                    i16++;
                                                    long j5 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                                    byte b6 = -1;
                                                    while (true) {
                                                        byte b7 = b6;
                                                        long j6 = j5;
                                                        int i20 = i19;
                                                        byte[] bArrDoFinal2 = cipher3.doFinal(new byte[]{(byte) (j6 >>> 56), (byte) (j6 >>> 48), (byte) (j6 >>> 40), (byte) (j6 >>> 32), (byte) (j6 >>> 24), (byte) (j6 >>> 16), (byte) (j6 >>> 8), (byte) j6});
                                                        long j7 = ((((long) bArrDoFinal2[0]) & 255) << 56) | ((((long) bArrDoFinal2[1]) & 255) << 48) | ((((long) bArrDoFinal2[2]) & 255) << 40) | ((((long) bArrDoFinal2[3]) & 255) << 32) | ((((long) bArrDoFinal2[4]) & 255) << 24) | ((((long) bArrDoFinal2[5]) & 255) << 16) | ((((long) bArrDoFinal2[6]) & 255) << 8) | (((long) bArrDoFinal2[7]) & 255);
                                                        switch (i20) {
                                                            case 0:
                                                                jArr4[b7] = j7;
                                                                if (i17 >= length3) {
                                                                    i = jArr3;
                                                                    k = new Long[4];
                                                                    return;
                                                                }
                                                                break;
                                                                break;
                                                            default:
                                                                jArr4[b7] = j7;
                                                                if (i17 >= length3) {
                                                                    str4 = "\u008bo\u001b ó\t\u0084¬Xêó\u0019®k\u009d\u0089";
                                                                    length3 = "\u008bo\u001b ó\t\u0084¬Xêó\u0019®k\u009d\u0089".length();
                                                                    i17 = 0;
                                                                }
                                                                break;
                                                        }
                                                        int i21 = i17;
                                                        i17 += 8;
                                                        byte[] bytes3 = str4.substring(i21, i17).getBytes("ISO-8859-1");
                                                        jArr4 = jArr3;
                                                        i19 = i16;
                                                        i16++;
                                                        j5 = ((((long) bytes3[0]) & 255) << 56) | ((((long) bytes3[1]) & 255) << 48) | ((((long) bytes3[2]) & 255) << 40) | ((((long) bytes3[3]) & 255) << 32) | ((((long) bytes3[4]) & 255) << 24) | ((((long) bytes3[5]) & 255) << 16) | ((((long) bytes3[6]) & 255) << 8) | (((long) bytes3[7]) & 255);
                                                        b6 = 0;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i11 >= length2) {
                                                str3 = "ôY\u0017Ó¢1\u00ad\u0090O\u001bÒþãÏsÇ";
                                                length2 = "ôY\u0017Ó¢1\u00ad\u0090O\u001bÒþãÏsÇ".length();
                                                i11 = 0;
                                            }
                                            break;
                                    }
                                    int i22 = i11;
                                    i11 += 8;
                                    byte[] bytes4 = str3.substring(i22, i11).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i13 = i10;
                                    i10++;
                                    j2 = ((((long) bytes4[0]) & 255) << 56) | ((((long) bytes4[1]) & 255) << 48) | ((((long) bytes4[2]) & 255) << 40) | ((((long) bytes4[3]) & 255) << 32) | ((((long) bytes4[4]) & 255) << 24) | ((((long) bytes4[5]) & 255) << 16) | ((((long) bytes4[6]) & 255) << 8) | (((long) bytes4[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i23 = i4;
                        i4++;
                        strArr[i23] = strIntern;
                        int i24 = i6 + cCharAt;
                        i5 = i24;
                        if (i24 < length) {
                        }
                        str = "\u009a\u0015Ql\u001a?JC\\²e¨¼\u001cl{\u0003ÜÎRHÂ°¤\u009a2ÚC\u008d\tÍ\u0007j$a\u0083hú«Ø·ÞÍd\u00802äï,HýÝ\u0086\u009f_çYÊÇ¢{¥M\u000b\u0016öÓS´/,w\u0015|bGf\u0084ôicRIS/Î\u0014ª\u0096´úÁ\u0081Æi\u0084Ätâ\u0015¦\u0097êÝ\u0013ßN6 \u0004bàt¦8@vû\u008cD6-ã\u000eØ@Fp\u0086RT\u0091 ¨ö5Í÷?\u001ff(\u001a\u0084 \u0098ë\u0017xäÁÞ1Ê\u0092\u009e\nàç}\u001fH\u0097Ç\u0096c\u0005\rÄGÉ\u0085!ÿì\u0019\u007fyH%î!®|ð\u0090\biã7yX\u0095\u0089S»)\u009f\u0091#\u008d\u0095\fû\\\u0090$Î<°è¡Ñ\u008fðm&àDcîâ+b¼\u008c+&®vX\u001b\u0007d\u008bIÓv\u008c\u0014\u0011\u001fÜB¡j\\Ù\u0093¡\u008aÅêÑWê ÝüÃ^ù+xäúÄ\u0096@C÷\t¸Oç\u007f\u000bð\u0004{\u009c\u0005\u0087¡lwâ\rx³yiímÞÙcë4÷_Z\u0001ï¸";
                        length = "\u009a\u0015Ql\u001a?JC\\²e¨¼\u001cl{\u0003ÜÎRHÂ°¤\u009a2ÚC\u008d\tÍ\u0007j$a\u0083hú«Ø·ÞÍd\u00802äï,HýÝ\u0086\u009f_çYÊÇ¢{¥M\u000b\u0016öÓS´/,w\u0015|bGf\u0084ôicRIS/Î\u0014ª\u0096´úÁ\u0081Æi\u0084Ätâ\u0015¦\u0097êÝ\u0013ßN6 \u0004bàt¦8@vû\u008cD6-ã\u000eØ@Fp\u0086RT\u0091 ¨ö5Í÷?\u001ff(\u001a\u0084 \u0098ë\u0017xäÁÞ1Ê\u0092\u009e\nàç}\u001fH\u0097Ç\u0096c\u0005\rÄGÉ\u0085!ÿì\u0019\u007fyH%î!®|ð\u0090\biã7yX\u0095\u0089S»)\u009f\u0091#\u008d\u0095\fû\\\u0090$Î<°è¡Ñ\u008fðm&àDcîâ+b¼\u008c+&®vX\u001b\u0007d\u008bIÓv\u008c\u0014\u0011\u001fÜB¡j\\Ù\u0093¡\u008aÅêÑWê ÝüÃ^ù+xäúÄ\u0096@C÷\t¸Oç\u007f\u000bð\u0004{\u009c\u0005\u0087¡lwâ\rx³yiímÞÙcë4÷_Z\u0001ï¸".length();
                        cCharAt = 144;
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

    private static NoSuchElementException a(NoSuchElementException noSuchElementException) {
        return noSuchElementException;
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 16666;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = a(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/tw", e2);
            }
        }
        return d[i3];
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
            r1 = r11
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
            java.lang.String r1 = "su/catlean/tw"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tw.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 7403;
        if (g[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/tw", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            g[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return g[i3].intValue();
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
            r1 = r11
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
            java.lang.String r1 = "su/catlean/tw"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tw.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static long c(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 17854;
        if (k[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) i[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) n.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    n.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/tw", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            k[i3] = Long.valueOf(((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255));
        }
        return k[i3].longValue();
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        long jC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Long.TYPE, Long.valueOf(jC)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return jC;
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
    private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = r11
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
            java.lang.String r1 = "su/catlean/tw"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tw.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
