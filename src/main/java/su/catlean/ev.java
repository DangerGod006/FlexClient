package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import net.minecraft.class_638;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.AttackBlockEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ev.class */
public final class ev extends _g {

    @NotNull
    public static final ev N = null;
    static final KProperty[] B = null;

    @NotNull
    private static final cw g = null;

    @NotNull
    private static final cw Y = null;

    @NotNull
    private static final az O = null;

    @NotNull
    private static final c8 V = null;

    @NotNull
    private static final ct f = null;

    @NotNull
    private static final c8 o = null;

    @NotNull
    private static final cq E = null;

    @NotNull
    private static final cq n = null;

    @NotNull
    private static final cq d = null;

    @NotNull
    private static final cq J = null;

    @Nullable
    private static class_2248 D;

    @Nullable
    private static s P;

    @NotNull
    private static final bg k = null;
    private static boolean y;
    private static String A;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map e = null;
    private static final long[] h = null;
    private static final Integer[] i = null;
    private static final Map j = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private ev(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16125, 5297045482333773140L ^ j3) /* invoke-custom */, jt.y(), null, 4, null, j3 ^ 131259284696760L);
    }

    private final xb q(long j2) {
        return (xb) g.E(this, (a ^ j2) ^ 97131319556012L, B[0]);
    }

    private final bm H(long j2) {
        return (bm) Y.E(this, (a ^ j2) ^ 93237146143842L, B[1]);
    }

    private final dg z(long j2) {
        return (dg) O.E(this, (a ^ j2) ^ 82544446800284L, B[2]);
    }

    private final void l(dg dgVar, long j2) {
        O.b(this, (a ^ j2) ^ 88928594338034L, B[2], dgVar);
    }

    private final int v(char c2, char c3, int i2) {
        return ((Number) V.E(this, ((((((long) c2) << 48) | ((((long) c3) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a) ^ 95299466923670L, B[3])).intValue();
    }

    private final float L(long j2) {
        return ((Number) f.E(this, (a ^ j2) ^ 62718082240298L, B[4])).floatValue();
    }

    private final int A(long j2) {
        return ((Number) o.E(this, (a ^ j2) ^ 110110949308014L, B[5])).intValue();
    }

    private final boolean D(long j2) {
        long j3 = a ^ j2;
        return ((Boolean) E.E(this, j3 ^ 58288897276899L, B[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19948, 5348176193436807633L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean e(int i2, char c2, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ a;
        return ((Boolean) n.E(this, j2 ^ 87536554836247L, B[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30074, 877079687738094523L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean C(long j2) {
        long j3 = a ^ j2;
        return ((Boolean) d.E(this, j3 ^ 22781168132184L, B[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30511, 122709185846726828L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean G(long j2) {
        long j3 = a ^ j2;
        return ((Boolean) J.E(this, j3 ^ 101719887150792L, B[(int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29485, 2742636483439692348L ^ j3) /* invoke-custom */])).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    @Flow
    public final void T(@NotNull AttackBlockEvent e2) {
        long j2 = a ^ 105467127687044L;
        long j3 = j2 ^ 114708971652453L;
        long j4 = j2 ^ 78599537810476L;
        Object objMethod_22347 = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1617876059146723371L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(e2, "e");
        try {
            try {
                class_638 class_638VarZ = zf.z(j3);
                class_2338 pos = e2.getPos();
                if (objMethod_22347 == 0) {
                    objMethod_22347 = class_638VarZ.method_22347(pos);
                    if (objMethod_22347 != 0) {
                        return;
                    }
                    class_638VarZ = zf.z(j3);
                    pos = e2.getPos();
                }
                class_2248 class_2248VarMethod_26204 = class_638VarZ.method_8320(pos).method_26204();
                Intrinsics.checkNotNullExpressionValue(class_2248VarMethod_26204, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32038, 5605516745057519680L ^ j2) /* invoke-custom */);
                try {
                    try {
                        try {
                            if (q(j4) == xb.Select) {
                                class_2248VarMethod_26204 = D;
                                if (objMethod_22347 == 0) {
                                    if (Intrinsics.areEqual(class_2248VarMethod_26204, class_2248VarMethod_26204)) {
                                        return;
                                    } else {
                                        class_2248VarMethod_26204 = class_2248VarMethod_26204;
                                    }
                                }
                                D = class_2248VarMethod_26204;
                            }
                        } catch (NumberFormatException unused) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_2248VarMethod_26204, -1589105454769469823L, j2) /* invoke-custom */;
                        }
                    } catch (NumberFormatException unused2) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_2248VarMethod_26204, -1589105454769469823L, j2) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused3) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_2248VarMethod_26204, -1589105454769469823L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused4) {
                objMethod_22347 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_22347, -1589105454769469823L, j2) /* invoke-custom */;
                throw objMethod_22347;
            }
        } catch (NumberFormatException unused5) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_22347, -1589105454769469823L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.s] */
    /* JADX WARN: Type inference failed for: r0v22, types: [net.minecraft.class_2680] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [su.catlean.ev] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.world.BlockStateEvent r8) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ev.n(su.catlean.api.event.events.world.BlockStateEvent):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x0715: MOVE_MULTI in method: su.catlean.ev.C(su.catlean.api.event.events.player.PlayerUpdateEvent):void, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ev.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x0715: MOVE_MULTI
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -3 out of bounds for object array[17]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:304)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    @su.catlean.gofra.Flow
    public final void C(@org.jetbrains.annotations.Nullable su.catlean.api.event.events.player.PlayerUpdateEvent r1) {
        /*
            Method dump skipped, instruction units count: 1964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ev.C(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.minecraft.class_1934] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [su.catlean.ex] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [su.catlean.ex] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [su.catlean.ex] */
    /* JADX WARN: Type inference failed for: r0v50, types: [su.catlean.ex] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v53, types: [su.catlean.ex] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v53 */
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
    public final synchronized void x(char r9, short r10, int r11) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ev.x(char, short, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Flow
    public final void o(@NotNull Render3DEvent render3DEvent) {
        long j2 = a ^ 68856322851795L;
        long j3 = j2 ^ 119478495402366L;
        long j4 = j2 ^ 117541529776015L;
        long j5 = j2 ^ 55050230263424L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j5 << 16) >>> 32);
        int i4 = (int) ((j5 << 48) >>> 48);
        long j6 = j2 ^ 138389132413234L;
        Object obj = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8224901954561164414L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(render3DEvent, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20310, 7447234811771166278L ^ j2) /* invoke-custom */);
        class_2338 class_2338VarE = null;
        try {
            try {
                try {
                    if (!C(j4)) {
                        obj = P;
                        s sVar = obj;
                        if (obj != null) {
                            class_2338VarE = sVar.E();
                        } else if (obj != null) {
                            s sVar2 = P;
                            Intrinsics.checkNotNull(sVar2);
                            sVar = sVar2;
                            class_2338VarE = sVar.E();
                        }
                    }
                    if (class_2338VarE != null) {
                        zi.x(zi.v, j6, new class_238(class_2338VarE), jl.y.p(jh.f.t(), (char) i2, i3, 1.0f, (short) i4), null, 4, null);
                        zi.E(j3, zi.v, new class_238(class_2338VarE), jl.y.p(jh.f.t(), (char) i2, i3, 0.5f, (short) i4), null, 4, null);
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -8240113465569516842L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -8240113465569516842L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -8240113465569516842L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x034d: INVOKE (r-1 I:su.catlean.dm), (r0 I:long), (r1 I:net.minecraft.class_243) VIRTUAL call: su.catlean.dm.R(long, net.minecraft.class_243):float
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final su.catlean.s n(short r15, short r16, int r17) {
        /*
            Method dump skipped, instruction units count: 1502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ev.n(short, short, int):su.catlean.s");
    }

    private final boolean f(int i2, int i3, class_2338 class_2338Var) {
        long j2 = ((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ a;
        long j3 = j2 ^ 87755766732265L;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8718970837953990489L, j2) /* invoke-custom */;
        Iterator<E> it = fp.X.iterator();
        while (it.hasNext()) {
            boolean zAreEqual = Intrinsics.areEqual(zf.z(j3).method_8320(class_2338Var.method_10093((class_2350) it.next())).method_26204(), class_2246.field_10164);
            while (zAreEqual) {
                zAreEqual = true;
                if (i3 > 0 && iArr == null) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void V(long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 51260522785520L;
        long j5 = j3 ^ 11237638859752L;
        int i2 = (int) (j3 >>> 48);
        int i3 = (int) ((j5 << 16) >>> 48);
        int i4 = (int) ((j5 << 32) >>> 32);
        long j6 = j3 ^ 38492048360248L;
        Object objQ = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5289404964619550527L, j3) /* invoke-custom */;
        try {
            try {
                objQ = D;
                try {
                    try {
                        if (objQ == null) {
                            try {
                                objQ = q(j6);
                                if (objQ == xb.Select) {
                                    return;
                                }
                            } catch (NumberFormatException unused) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, -5267459507804579435L, j3) /* invoke-custom */;
                            }
                        }
                        if (zf.F(j4).field_1690.field_1886.method_1434()) {
                            return;
                        }
                        s sVarN = P;
                        if (objQ == null) {
                            if (sVarN != null) {
                                return;
                            } else {
                                sVarN = n((short) i2, (short) i3, i4);
                            }
                        }
                        P = sVarN;
                    } catch (NumberFormatException unused2) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, -5267459507804579435L, j3) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused3) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, -5267459507804579435L, j3) /* invoke-custom */;
                }
            } catch (NumberFormatException unused4) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, -5267459507804579435L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused5) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, -5267459507804579435L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:101:0x0216
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final boolean L(short r8, char r9, net.minecraft.class_2248 r10, int r11) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ev.L(short, char, net.minecraft.class_2248, int):boolean");
    }

    private static final Unit Z() {
        return Unit.INSTANCE;
    }

    private static final class_2596 H(class_2338 class_2338Var, int i2) {
        return new class_2846(class_2846.class_2847.field_12968, class_2338Var, class_2350.field_11036, i2);
    }

    private static final class_2596 O(class_2338 class_2338Var, int i2) {
        return new class_2846(class_2846.class_2847.field_12973, class_2338Var, class_2350.field_11036, i2);
    }

    public static final bm j(long a2, ev $this) {
        return $this.H((a ^ a2) ^ 111255089830423L);
    }

    public static void B(String str) {
        A = str;
    }

    public static String M() {
        return A;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 24008;
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
                throw new RuntimeException("su/catlean/ev", e2);
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
            r1 = r52
            int r1 = r1.parameterCount()
            r-1.asCollector(r0, r1)
            r0 = 0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r9
            r2[r3] = r4
            java.lang.invoke.MethodHandles.insertArguments(r-1, r0, r1)
            r0 = r10
            java.lang.invoke.MethodHandles.explicitCastArguments(r-1, r0)
            r-2.setTarget(r-1)
            goto L62
            r12 = r-3
            java.lang.RuntimeException r-3 = new java.lang.RuntimeException
            r-2 = r-3
            java.lang.StringBuilder r-1 = new java.lang.StringBuilder
            r0 = r-1
            r0.<init>()
            java.lang.String r0 = "su/catlean/ev"
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r9
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r-1.append(r0)
            r-1.toString()
            r0 = r12
            r-2.<init>(r-1, r0)
            throw r-3
            r-2 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ev.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 19418;
        if (i[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) h[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) j.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/ev", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            i[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return i[i3].intValue();
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
            r1 = r52
            int r1 = r1.parameterCount()
            r-1.asCollector(r0, r1)
            r0 = 0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r9
            r2[r3] = r4
            java.lang.invoke.MethodHandles.insertArguments(r-1, r0, r1)
            r0 = r10
            java.lang.invoke.MethodHandles.explicitCastArguments(r-1, r0)
            r-2.setTarget(r-1)
            goto L62
            r12 = r-3
            java.lang.RuntimeException r-3 = new java.lang.RuntimeException
            r-2 = r-3
            java.lang.StringBuilder r-1 = new java.lang.StringBuilder
            r0 = r-1
            r0.<init>()
            java.lang.String r0 = "su/catlean/ev"
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r9
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r-1.append(r0)
            r-1.toString()
            r0 = r12
            r-2.<init>(r-1, r0)
            throw r-3
            r-2 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ev.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
