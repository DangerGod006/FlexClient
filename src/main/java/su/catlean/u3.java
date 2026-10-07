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
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2828;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.CollisionEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/u3.class */
public final class u3 extends _g {

    @NotNull
    public static final u3 N;
    static final KProperty[] L;

    @NotNull
    private static final cw I;

    @NotNull
    private static final cq T;

    @NotNull
    private static final cq f;

    @NotNull
    private static final cq Y;

    @NotNull
    private static final cq i;

    @NotNull
    private static final cq P;

    @NotNull
    private static final cw d;

    @NotNull
    private static final bg X;
    private static final long a = yz.a(-6936183447961913769L, 7191527392490522757L, MethodHandles.lookup().lookupClass()).a(14901899939729L);
    private static final String[] b;
    private static final String[] c;
    private static final Map e;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map j;

    /* JADX WARN: Illegal instructions before constructor call */
    private u3(char c2, short s, int i2) {
        long j2 = (((((long) c2) << 48) | ((((long) s) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a;
        super((String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7380, 6313091293284417431L ^ j2) /* invoke-custom */, jt.V(), null, 4, null, j2 ^ 116546865109373L);
    }

    private final wm Q(int i2, int i3, byte b2) {
        return (wm) I.E(this, ((((((long) i2) << 32) | ((((long) i3) << 40) >>> 32)) | ((((long) b2) << 56) >>> 56)) ^ a) ^ 29934429191945L, L[0]);
    }

    private final boolean H(long j2) {
        return ((Boolean) T.E(this, (a ^ j2) ^ 122512006718816L, L[1])).booleanValue();
    }

    private final boolean W(long j2) {
        return ((Boolean) f.E(this, (a ^ j2) ^ 132181257399726L, L[2])).booleanValue();
    }

    private final boolean q(char c2, char c3, int i2) {
        return ((Boolean) Y.E(this, ((((((long) c2) << 48) | ((((long) c3) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a) ^ 109045999539985L, L[3])).booleanValue();
    }

    private final boolean V(short s, char c2, int i2) {
        return ((Boolean) i.E(this, ((((((long) s) << 48) | ((((long) c2) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a) ^ 94726152412835L, L[4])).booleanValue();
    }

    private final boolean g(long j2) {
        return ((Boolean) P.E(this, (a ^ j2) ^ 23478728107383L, L[5])).booleanValue();
    }

    private final f9 n(long j2) {
        long j3 = a ^ j2;
        return (f9) d.E(this, j3 ^ 19667998840640L, L[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22327, 5735131414400463071L ^ j3) /* invoke-custom */]);
    }

    private final void x(int i2, short s, short s2, f9 f9Var) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ a;
        d.b(this, j2 ^ 121492133013646L, L[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22327, 5735067812707637501L ^ j2) /* invoke-custom */], f9Var);
    }

    @Flow
    private final void Q(CollisionEvent collisionEvent) {
        long j2 = a ^ 48319920301822L;
        long j3 = j2 ^ 134085292027803L;
        int i2 = (int) (j2 >>> 56);
        long j4 = ((j2 ^ 63891278913980L) << 8) >>> 8;
        long j5 = j2 ^ 123193659364851L;
        int i3 = (int) (j2 >>> 32);
        int i4 = (int) ((j5 << 32) >>> 40);
        int i5 = (int) ((j5 << 56) >>> 56);
        long j6 = j2 ^ 98228645487037L;
        Object objQ = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5477120535098774394L, j2) /* invoke-custom */;
        class_2338 class_2338VarMethod_49638 = class_2338.method_49638(J((byte) i2, j4, (class_1297) zf.v(j6)));
        Intrinsics.checkNotNullExpressionValue(class_2338VarMethod_49638, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(523, 7064787757071555115L ^ j2) /* invoke-custom */);
        try {
            try {
                try {
                    objQ = Q(i3, i4, (byte) i5);
                    try {
                        if (objQ == wm.VANILLA) {
                            CollisionEvent collisionEvent2 = collisionEvent;
                            if (objQ == null) {
                                if (Intrinsics.areEqual(collisionEvent2.getPos(), class_2338VarMethod_49638.method_10074()) && !zf.F(j3).field_1690.field_1832.method_1434()) {
                                    return;
                                }
                                collisionEvent2 = collisionEvent;
                            }
                            class_2680 class_2680VarMethod_9564 = class_2246.field_10124.method_9564();
                            Intrinsics.checkNotNullExpressionValue(class_2680VarMethod_9564, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15392, 8226937311576220689L ^ j2) /* invoke-custom */);
                            collisionEvent2.setState(class_2680VarMethod_9564);
                        }
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, -5485917570215590453L, j2) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, -5485917570215590453L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, -5485917570215590453L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, -5485917570215590453L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: Failed to decode insn: 0x021F: MOVE_MULTI
        java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for object array[12]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:313)
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
    @Override // su.catlean._g
    public void O(long r13) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u3.O(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.minecraft.class_3965] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(double[] r13, long r14, double[] r16) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u3.c(double[], long, double[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v0 */
    private final void A(long j2, double[] dArr, double[] dArr2) {
        long j3 = a ^ j2;
        int i2 = (int) (j3 >>> 56);
        long j4 = ((j3 ^ 52415435503922L) << 8) >>> 8;
        long j5 = j3 ^ 86799648704404L;
        long j6 = j3 ^ 84337556770166L;
        long j7 = j3 ^ 84553143646515L;
        ?? Method_22347 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6092439747095776248L, j3) /* invoke-custom */;
        try {
            Method_22347 = zf.z(j5).method_22347(class_2338.method_49638(J((byte) i2, j4, (class_1297) zf.v(j7)).method_1031(dArr[0], -2.0d, dArr[1])));
            ?? r0 = Method_22347;
            if (Method_22347 == 0) {
                r0 = Method_22347 != 0 ? 2 : 1;
            }
            zf.v(j7).method_5814(zf.v(j7).method_23317() + dArr2[0], zf.v(j7).method_23318() - (r0 == true ? 1.0d : 0.0d), zf.v(j7).method_23321() + dArr2[1]);
            _r.a(j6, new class_2828.class_2829(zf.v(j7).method_23317(), zf.v(j7).method_23318(), zf.v(j7).method_23321(), true, zf.v(j7).field_5976));
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_22347, -6102361306622599867L, j3) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x04cc: INVOKE (r-1 I:su.catlean.gg), (r0 I:long), (r1 I:su.catlean.n5), (r2 I:su.catlean.f9) VIRTUAL call: su.catlean.gg.X(long, su.catlean.n5, su.catlean.f9):su.catlean.fg
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow(priority = -10)
    private final void V(su.catlean.api.event.events.player.PlayerUpdateEvent r16) {
        /*
            Method dump skipped, instruction units count: 1306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u3.V(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18, types: [su.catlean.gw] */
    /* JADX WARN: Type inference failed for: r0v9, types: [su.catlean.fg] */
    private final void G(class_2338 class_2338Var, long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 122117648678478L;
        long j5 = j3 ^ 64290707017135L;
        long j6 = j3 ^ 68999084457880L;
        long j7 = j3 ^ 15783531927289L;
        long j8 = j3 ^ 13064559357533L;
        long j9 = j3 ^ 28586465251752L;
        class_2680 class_2680VarMethod_8320 = zf.z(j3 ^ 30686471155471L).method_8320(class_2338Var);
        Intrinsics.checkNotNullExpressionValue(class_2680VarMethod_8320, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20867, 3399808651605424556L ^ j3) /* invoke-custom */);
        if (class_2680VarMethod_8320.method_45474()) {
            Object objX = gg.P.X(j8, u3::L, n(j5));
            try {
                objX = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                if (objX > 0) {
                    try {
                        if (!objX.R()) {
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, -8949959089741892130L, j3) /* invoke-custom */;
                    }
                }
                objX = gw.Y;
                gg ggVarJ = gw.j(objX, class_2338Var, -1, j7, g(j6) ? xx.GRIM : xx.Strict, y4.ALL, (float) zf.v(j9).method_55754(), (float) zf.v(j9).method_55754(), null, (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18964, 7054367066608153716L ^ j3) /* invoke-custom */, null);
                if (j3 >= 0) {
                    gg ggVar = ggVarJ;
                    if (ggVar == null) {
                        return;
                    }
                    try {
                        ggVar = gg.P;
                        ggVar.T(j4, objX.a(), n(j5), () -> {
                            return N(r4);
                        });
                    } catch (NumberFormatException unused2) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(ggVar, -8949959089741892130L, j3) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, -8949959089741892130L, j3) /* invoke-custom */;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    private final float Z(long j2) {
        long j3 = a ^ j2;
        int i2 = (int) (j3 >>> 56);
        long j4 = ((j3 ^ 93299234127456L) << 8) >>> 8;
        long j5 = j3 ^ 58826537992390L;
        long j6 = j3 ^ 61124108861025L;
        ?? r0 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7791567264469119834L, j3) /* invoke-custom */;
        try {
            try {
                r0 = ((Math.abs(zf.v(j6).method_23318()) - Math.floor(zf.v(j6).method_23318())) > 0.1d ? 1 : ((Math.abs(zf.v(j6).method_23318()) - Math.floor(zf.v(j6).method_23318())) == 0.1d ? 0 : -1));
                ?? AreEqual = r0;
                if (r0 == 0) {
                    if (r0 > 0) {
                        return 81.0f;
                    }
                    AreEqual = Intrinsics.areEqual(zf.z(j5).method_8320(class_2338.method_49638(J((byte) i2, j4, (class_1297) zf.v(j6)))), class_2246.field_9983);
                }
                return AreEqual != 0 ? 80.0f : 85.0f;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 7782912608632773143L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            r0 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 7782912608632773143L, j3) /* invoke-custom */;
            throw r0;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:28:0x0100
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final boolean E(long r10) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u3.E(long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.wm] */
    private static final boolean e() {
        long j2 = a ^ 81680084498951L;
        Object objQ = j2;
        try {
            objQ = N.Q((int) (objQ >>> 32), (int) (((objQ ^ 19450724780298L) << 32) >>> 40), (byte) ((r1 << 56) >>> 56));
            return objQ == wm.PEARL;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, 3397819352622127410L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.wm] */
    private static final boolean x() {
        long j2 = a ^ 47938332202235L;
        Object objQ = j2;
        try {
            objQ = N.Q((int) (objQ >>> 32), (int) (((objQ ^ 123560213506038L) << 32) >>> 40), (byte) ((r1 << 56) >>> 56));
            return objQ == wm.PEARL;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, -4477955293533849650L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.wm] */
    private static final boolean h() {
        long j2 = a ^ 71222222687400L;
        Object objQ = j2;
        try {
            objQ = N.Q((int) (objQ >>> 32), (int) (((objQ ^ 29960327266213L) << 32) >>> 40), (byte) ((r1 << 56) >>> 56));
            return objQ == wm.PEARL;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, 6451529877611753373L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.wm] */
    private static final boolean F() {
        long j2 = a ^ 62861715056123L;
        Object objQ = j2;
        try {
            objQ = N.Q((int) (objQ >>> 32), (int) (((objQ ^ 108667971262198L) << 32) >>> 40), (byte) ((r1 << 56) >>> 56));
            return objQ == wm.PEARL;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, -1091267664046422322L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.u3] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
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
    private static final boolean D() {
        /*
            long r0 = su.catlean.u3.a
            r1 = 56230350259521(0x3324260d8541, double:2.77814843168497E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 41522640852966(0x25c3be4217e6, double:2.0514910370055E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 16
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r1 = r0; r3 = r0; 
            r2 = 115299469555276(0x68dd3fecf64c, double:5.69655068909806E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 40
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r14 = r2
            r2 = r1; r3 = r0; 
            r3 = 56
            long r2 = r2 << r3
            r3 = 56
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r15 = r2
            r0 = 5783258753739673401(0x504243320cd24f39, double:4.229301995941795E78)
            r1 = r8
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.u3 r0 = su.catlean.u3.N     // Catch: java.lang.NumberFormatException -> L70
            r1 = r16
            if (r1 != 0) goto L8a
            r1 = r13
            r2 = r14
            r3 = r15
            byte r3 = (byte) r3     // Catch: java.lang.NumberFormatException -> L70 java.lang.NumberFormatException -> L80
            su.catlean.wm r0 = r0.Q(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L70 java.lang.NumberFormatException -> L80
            su.catlean.wm r1 = su.catlean.wm.PEARL     // Catch: java.lang.NumberFormatException -> L70 java.lang.NumberFormatException -> L80
            if (r0 != r1) goto Lac
            goto L7a
        L70:
            r1 = 5791914853792425588(0x506103df659b2674, double:1.5761737309878344E79)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L80
            throw r0     // Catch: java.lang.NumberFormatException -> L80
        L7a:
            su.catlean.u3 r0 = su.catlean.u3.N     // Catch: java.lang.NumberFormatException -> L80
            goto L8a
        L80:
            r1 = 5791914853792425588(0x506103df659b2674, double:1.5761737309878344E79)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8a:
            r1 = r10
            short r1 = (short) r1     // Catch: java.lang.NumberFormatException -> L9e
            r2 = r11
            char r2 = (char) r2     // Catch: java.lang.NumberFormatException -> L9e
            r3 = r12
            boolean r0 = r0.V(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L9e
            r1 = r16
            if (r1 != 0) goto La9
            if (r0 == 0) goto Lac
            goto La8
        L9e:
            r1 = 5791914853792425588(0x506103df659b2674, double:1.5761737309878344E79)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        La8:
            r0 = 1
        La9:
            goto Lad
        Lac:
            r0 = 0
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u3.D():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.wm] */
    private static final boolean s() {
        long j2 = a ^ 27031431862466L;
        Object objQ = j2;
        try {
            objQ = N.Q((int) (objQ >>> 32), (int) (((objQ ^ 74133937695695L) << 32) >>> 40), (byte) ((r1 << 56) >>> 56));
            return objQ == wm.PEARL;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, 1000406524393323511L, j2) /* invoke-custom */;
        }
    }

    private static final boolean U(class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13674, 5379069627930248999L ^ (a ^ 60365596265618L)) /* invoke-custom */);
        return Intrinsics.areEqual(class_1799Var.method_7909(), class_1802.field_8634);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0040: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final kotlin.Unit T() {
        /*
            long r0 = su.catlean.u3.a
            r1 = 28740304584567(0x1a239fa53f77, double:1.4199597146248E-310)
            long r0 = r0 ^ r1
            r11 = r0
            r0 = r11
            r1 = r0; r1 = r0; 
            r2 = 106523964303550(0x60e20b0d68be, double:5.26298312212033E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r1 = r0; r2 = r0; 
            r2 = 115266881358961(0x68d5a9848c71, double:5.69494061827214E-310)
            long r1 = r1 ^ r2
            r15 = r1
            net.minecraft.class_1268 r0 = net.minecraft.class_1268.field_5808
            r1 = 0
            r2 = r13
            r3 = 0
            r4 = 22327(0x5737, float:3.1287E-41)
            r5 = 5735126808129716416(0x4f9743722c6440c0, double:2.630590566658583E75)
            r6 = r11
            long r5 = r5 ^ r6
            int r4 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/u3;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "u"}
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
            kotlin.Unit r-1 = kotlin.Unit.INSTANCE
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u3.T():kotlin.Unit");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x016f: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final kotlin.Unit d(net.minecraft.class_2338 r9, kotlin.jvm.internal.Ref.ObjectRef r10, su.catlean.fg r11) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u3.d(net.minecraft.class_2338, kotlin.jvm.internal.Ref$ObjectRef, su.catlean.fg):kotlin.Unit");
    }

    private static final boolean L(class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18176, 3946883712378180775L ^ (a ^ 122352416222549L)) /* invoke-custom */);
        return Intrinsics.areEqual(class_1799Var.method_7909(), class_1802.field_8281);
    }

    private static final Unit N(class_3965 class_3965Var) {
        long j2 = a ^ 69147120373700L;
        long j3 = j2 ^ 83869598877831L;
        zf.Z((int) (j2 >>> 32), ((j2 ^ 89997699053960L) << 32) >>> 32).method_2896(zf.v(j3), class_1268.field_5808, class_3965Var);
        zf.v(j3).method_6104(class_1268.field_5808);
        return Unit.INSTANCE;
    }

    static {
        int i2;
        long j2 = a ^ 132679081937428L;
        long j3 = j2 ^ 53193618916272L;
        int i3 = (int) (j2 >>> 48);
        int i4 = (int) ((j3 << 16) >>> 48);
        int i5 = (int) ((j3 << 32) >>> 32);
        long j4 = j2 ^ 14969103440106L;
        long j5 = j2 ^ 84529161888350L;
        e = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i6 = 1; i6 < 8; i6++) {
            bArr[i6] = (byte) ((j2 << (i6 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[33];
        int i7 = 0;
        String str = ")Ìb\u0087Û\u0086§rxí[Ñd\u0082Ò\ba8\u0013ÓFa:+ÕB*qO\u0006ðq(Å¬T°\u0003T÷\u008dÛ¯ð\u0001&ÒúäÌõ\u00ad\u0004!µÜ\u0005ÃN\u0091]¥\u0096\u000b°?ÂÇâP\\\u0096Ù\u0010¼ã*ñä\tÌÀ§\u008eN\n(m\u001dt\u0010\u0019ß\u0016Qz)\u009b?ÃÉ\u0094vZ¡ÖU\u0018Úø e)\u0014-f\u0019\u0084\u0082\u0007ÂUîV/\u0088\u0004tM3§Ú \u0088Îïò9\u0007\u0096Hs/\tÀQ'Á\u009fó«\u0083¦H)bGô\u0084g\u0091ßH\u000eÊ I\u0007$Ç\u0096\bx=s\u001d\u000eÝ\u000b\u009a\u0081'åÊo\u0010iøUi©\u001d¯9\u00900ß«\u0018~\u001f\u00994t\u001cÏ<ÒíêÄcÌÞªM\u000bO\u0083ùþß\u009f T8\u009a\u0000ÀæojV¼\u0082²êèéÅY\u00adXsårõ\bE\u0011ü¶* .I(+éß\u0012,ª1\u009ca6 aB{, SÌãR\u000f¢\u000eëQsú²²\u008c\u009aB7Vµ\nÚO\u0012\u008a ?\u0084\u0011Ñ³\u00adm\u0001\u001eU\u0091!Â&+^\u0005Âô«¸á\u0099³[\u0081\u0084X¿÷:Í(6½\u001cÙ4\u0081½xù\u000fè©ií\u000e\u008c\u0095\u0016£Å\u0099}ìBHWí\u00996bØH\u0004\u0082ÏM@â\u0018à \u009b@\nÎ,\u001e¦âÖ\u0098ýÌûÑî°_ý#\u007f\u0087\u0098ú\u009eWê\u0098hÓÔäÿ\u0010\u0006¶ßîb¡ñ4Ðü2ÄÓ)Ó\u00998þ:y«°Mò«\u0019ðýxJ¡óu3ý\u008a\u00adÏP@é\u0004F=h\u0017\u0019Ù`ç\u0083kO\u0094Ç\u0001w\u007f\u0092¨2ôÈ¼\u00050ÓÊ\u0019\u0003´÷\u0088 XæØ&zÿh)<\u0081È\u00973:Á¿\u001atÜ\u0014\u008f\u0092öÏ[Í\u0087;\u0095ní)\u0010¯\nfo\u009b,[ô\u0080\u0006\u000eñ\u0086\u009b2/8\røI/²?ØæÂÖ~\u001b«º°Iz\u001c3Àã\u0091\u0097·`Û,\u007få\u0002Ù\u0088-\u0007\u0082ú(\\ãge[¸´+-\u008a\u008bÎúöº÷Ã\u001c\u008c 73TÇ×c\f\u0094.\u0095¼ Õa2J7\u0013\u0099ä~\u0084I¤\u009e\u0090<\u0087.V\u0018 \u0010\u00178¤Ùªwâ&·\u0090#^Uê§» <{îv8Ô>âÀÈ_¨MüMn\u0012Ïà\u0001!ö\b\u001c×ÞDË\u008dzDÞ\u0010\u0099ó\u0092MÍ\u007föÓ4o^\u0004S\bÅÖ(|\u009fÿTÝ\u008a¼¥\u008ch\u0092\u0003LPoDsúp\u0088-¼[ïýq¶\u0086Ù¾GOc\u001a\u0001y$\u0002&>0áÃ\u0091ÀBªëR|\u0005ÕÎz¬\u0083`ID\"\u008dL\u0006Ì\u0014Ë.åÄ\u0019øC ù\u0002\u001b3¦¶\u009c½¼{;ñ\u009c\u009aG\u000f\u0018¦Ï\u008e\néVO\u0000ü>CU\u0082\u00001Týi}+_ÅÆ=\u0010¹i\u000f¢¦\u0088\u0012\u0096>\u007f³ö°á¶è\u0018'¢$>ø§\u0002¨\u008et]\u0084nO\u0004T\u007f¡Cx\u0003J\u0013ø\u0010&\u0000±výÑ\u0091êa\u0013ô9*\u008b\u008e\u000b\u0010\u0019|©Bkõ¡lô\u0001\u0080\u0098ÝÅãæ(`¬èº\u0013uÖi\u008fçÍè\u001cÃÈÈó\u001eZ®Â#£\u0097\u0002\u000e{è¿ìË[ºízÁúR\u008d\u0085\u0018x\u009dÒ5\u0012¸Ú\r)j\u0090ZtøÁ1é\u0091ønõ\u0089ö9";
        int length = ")Ìb\u0087Û\u0086§rxí[Ñd\u0082Ò\ba8\u0013ÓFa:+ÕB*qO\u0006ðq(Å¬T°\u0003T÷\u008dÛ¯ð\u0001&ÒúäÌõ\u00ad\u0004!µÜ\u0005ÃN\u0091]¥\u0096\u000b°?ÂÇâP\\\u0096Ù\u0010¼ã*ñä\tÌÀ§\u008eN\n(m\u001dt\u0010\u0019ß\u0016Qz)\u009b?ÃÉ\u0094vZ¡ÖU\u0018Úø e)\u0014-f\u0019\u0084\u0082\u0007ÂUîV/\u0088\u0004tM3§Ú \u0088Îïò9\u0007\u0096Hs/\tÀQ'Á\u009fó«\u0083¦H)bGô\u0084g\u0091ßH\u000eÊ I\u0007$Ç\u0096\bx=s\u001d\u000eÝ\u000b\u009a\u0081'åÊo\u0010iøUi©\u001d¯9\u00900ß«\u0018~\u001f\u00994t\u001cÏ<ÒíêÄcÌÞªM\u000bO\u0083ùþß\u009f T8\u009a\u0000ÀæojV¼\u0082²êèéÅY\u00adXsårõ\bE\u0011ü¶* .I(+éß\u0012,ª1\u009ca6 aB{, SÌãR\u000f¢\u000eëQsú²²\u008c\u009aB7Vµ\nÚO\u0012\u008a ?\u0084\u0011Ñ³\u00adm\u0001\u001eU\u0091!Â&+^\u0005Âô«¸á\u0099³[\u0081\u0084X¿÷:Í(6½\u001cÙ4\u0081½xù\u000fè©ií\u000e\u008c\u0095\u0016£Å\u0099}ìBHWí\u00996bØH\u0004\u0082ÏM@â\u0018à \u009b@\nÎ,\u001e¦âÖ\u0098ýÌûÑî°_ý#\u007f\u0087\u0098ú\u009eWê\u0098hÓÔäÿ\u0010\u0006¶ßîb¡ñ4Ðü2ÄÓ)Ó\u00998þ:y«°Mò«\u0019ðýxJ¡óu3ý\u008a\u00adÏP@é\u0004F=h\u0017\u0019Ù`ç\u0083kO\u0094Ç\u0001w\u007f\u0092¨2ôÈ¼\u00050ÓÊ\u0019\u0003´÷\u0088 XæØ&zÿh)<\u0081È\u00973:Á¿\u001atÜ\u0014\u008f\u0092öÏ[Í\u0087;\u0095ní)\u0010¯\nfo\u009b,[ô\u0080\u0006\u000eñ\u0086\u009b2/8\røI/²?ØæÂÖ~\u001b«º°Iz\u001c3Àã\u0091\u0097·`Û,\u007få\u0002Ù\u0088-\u0007\u0082ú(\\ãge[¸´+-\u008a\u008bÎúöº÷Ã\u001c\u008c 73TÇ×c\f\u0094.\u0095¼ Õa2J7\u0013\u0099ä~\u0084I¤\u009e\u0090<\u0087.V\u0018 \u0010\u00178¤Ùªwâ&·\u0090#^Uê§» <{îv8Ô>âÀÈ_¨MüMn\u0012Ïà\u0001!ö\b\u001c×ÞDË\u008dzDÞ\u0010\u0099ó\u0092MÍ\u007föÓ4o^\u0004S\bÅÖ(|\u009fÿTÝ\u008a¼¥\u008ch\u0092\u0003LPoDsúp\u0088-¼[ïýq¶\u0086Ù¾GOc\u001a\u0001y$\u0002&>0áÃ\u0091ÀBªëR|\u0005ÕÎz¬\u0083`ID\"\u008dL\u0006Ì\u0014Ë.åÄ\u0019øC ù\u0002\u001b3¦¶\u009c½¼{;ñ\u009c\u009aG\u000f\u0018¦Ï\u008e\néVO\u0000ü>CU\u0082\u00001Týi}+_ÅÆ=\u0010¹i\u000f¢¦\u0088\u0012\u0096>\u007f³ö°á¶è\u0018'¢$>ø§\u0002¨\u008et]\u0084nO\u0004T\u007f¡Cx\u0003J\u0013ø\u0010&\u0000±výÑ\u0091êa\u0013ô9*\u008b\u008e\u000b\u0010\u0019|©Bkõ¡lô\u0001\u0080\u0098ÝÅãæ(`¬èº\u0013uÖi\u008fçÍè\u001cÃÈÈó\u001eZ®Â#£\u0097\u0002\u000e{è¿ìË[ºízÁúR\u008d\u0085\u0018x\u009dÒ5\u0012¸Ú\r)j\u0090ZtøÁ1é\u0091ønõ\u0089ö9".length();
        char cCharAt = ' ';
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
                            b = strArr;
                            c = new String[33];
                            j = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i12 = 1; i12 < 8; i12++) {
                                bArr2[i12] = (byte) ((j2 << (i12 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[12];
                            int i13 = 0;
                            String str3 = "\u009b\u0013\u000bÄ\u0001È\fE\u008cD\u008bÜ´k\u008c\u0007\u008bï»k8±\u0016ÂP*\u000e\u008e£¼¸Ák_û\u0019ç\u0013\t\u001e\"\u0011¤ÐÖ J,^\u007fùyù~ç=\u009cÃ^61>½«B,N¿\u009b\u0000\u0015\u001f\u00adc\"cÙË2ò";
                            int length2 = "\u009b\u0013\u000bÄ\u0001È\fE\u008cD\u008bÜ´k\u008c\u0007\u008bï»k8±\u0016ÂP*\u000e\u008e£¼¸Ák_û\u0019ç\u0013\t\u001e\"\u0011¤ÐÖ J,^\u007fùyù~ç=\u009cÃ^61>½«B,N¿\u009b\u0000\u0015\u001f\u00adc\"cÙË2ò".length();
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
                                                g = jArr;
                                                h = new Integer[12];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28208, 3018967644140506279L ^ j2) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(u3.class, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31454, 5081516935439617562L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27025, 806087311821774150L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(u3.class, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13204, 2919457110411298636L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26320, 8819989434162188823L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(u3.class, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5367, 3576331677636943929L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6924, 8126081228244217793L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(u3.class, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22543, 320787494645869789L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2578, 6728717439298600659L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(u3.class, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9104, 2495784730670913349L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15694, 3076404495127890327L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(u3.class, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2044, 4358824386488824614L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29958, 833627964230042066L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26809, 4906400573783542309L ^ j2) /* invoke-custom */] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(u3.class, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(948, 3515549326683535229L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7905, 4478235650818599465L ^ j2) /* invoke-custom */, 0));
                                                L = kPropertyArr;
                                                N = new u3((char) i3, (short) i4, i5);
                                                I = yp.L(N, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(81, 999974754580034708L ^ j2) /* invoke-custom */, wm.VANILLA, null, null, (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20370, 5130541071313513731L ^ j2) /* invoke-custom */, null, j5);
                                                T = yp.t(N, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1934, 1380032197379486546L ^ j2) /* invoke-custom */, false, j4, null, u3::e, 4, null);
                                                f = yp.t(N, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6626, 6777307417619426593L ^ j2) /* invoke-custom */, false, j4, null, u3::x, 4, null);
                                                Y = yp.t(N, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25132, 866057167771408106L ^ j2) /* invoke-custom */, true, j4, null, u3::h, 4, null);
                                                i = yp.t(N, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3866, 3979245325062241225L ^ j2) /* invoke-custom */, true, j4, null, u3::F, 4, null);
                                                P = yp.t(N, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26610, 7385462635455550255L ^ j2) /* invoke-custom */, true, j4, null, u3::D, 4, null);
                                                d = yp.L(N, (String) b(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13273, 2431214898000054031L ^ j2) /* invoke-custom */, f9.SILENT_FULL, null, u3::s, 4, null, j5);
                                                X = new bg();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j8;
                                            if (i14 >= length2) {
                                                str3 = "B>bq~\b25þåSÎ\u0005\u009cø,";
                                                length2 = "B>bq~\b25þåSÎ\u0005\u009cø,".length();
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
                        str = "\u00054\u0011\u0013üKJ³ÄÓæï\u0096D\u0095Gz\u0018O\u008a·\u0018°Ùë*s6K\u0012H0\u0010\u0099XzÓt\u009c¸\u008f\u0089O\u0013Ò·\u0019XK";
                        length = "\u00054\u0011\u0013üKJ³ÄÓæï\u0096D\u0095Gz\u0018O\u008a·\u0018°Ùë*s6K\u0012H0\u0010\u0099XzÓt\u009c¸\u008f\u0089O\u0013Ò·\u0019XK".length();
                        cCharAt = ' ';
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 27390;
        if (c[i3] == null) {
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
                c[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/u3", e2);
            }
        }
        return c[i3];
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
            r1 = 1073741824(0x40000000, float:2.0)
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
            java.lang.String r1 = "su/catlean/u3"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u3.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 31917;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) j.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/u3", e2);
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
            r1 = 1073741824(0x40000000, float:2.0)
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
            java.lang.String r1 = "su/catlean/u3"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u3.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
