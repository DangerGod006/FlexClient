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
import kotlin.reflect.KProperty;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qc.class */
public final class qc extends _g {

    @NotNull
    public static final qc k;
    static final KProperty[] f;

    @NotNull
    private static final cw V;

    @NotNull
    private static final av l;

    @NotNull
    private static final av g;

    @NotNull
    private static final cq w;

    @NotNull
    private static final cw j;

    @NotNull
    private static final cw N;

    @NotNull
    private static final cw S;

    @NotNull
    private static final cq a;
    private static boolean m;
    private static boolean y;
    private static int W;

    @NotNull
    private static final class_1792[] T;
    private static boolean e;
    private static final long b = yz.a(-2684698560115584595L, 2535245307344694768L, MethodHandles.lookup().lookupClass()).a(63775117434846L);
    private static final String[] c;
    private static final String[] d;
    private static final Map h;
    private static final long[] i;
    private static final Integer[] n;
    private static final Map o;

    /* JADX WARN: Illegal instructions before constructor call */
    private qc(long j2) {
        long j3 = b ^ j2;
        super((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29655, 1489708192226968416L ^ j3) /* invoke-custom */, jt.I(), null, 4, null, j3 ^ 55105828314781L);
    }

    private final zp p(long j2) {
        return (zp) V.E(this, (b ^ j2) ^ 30383108391928L, f[0]);
    }

    private final lj z(long j2) {
        return (lj) l.E(this, (b ^ j2) ^ 104965042063631L, f[1]);
    }

    private final lj v(long j2) {
        return (lj) g.E(this, (b ^ j2) ^ 104098402877841L, f[2]);
    }

    private final boolean q(long j2) {
        return ((Boolean) w.E(this, (b ^ j2) ^ 11966124694092L, f[3])).booleanValue();
    }

    private final yt t(byte b2, long j2) {
        return (yt) j.E(this, (((((long) b2) << 56) | ((j2 << 8) >>> 8)) ^ b) ^ 63660395937305L, f[4]);
    }

    private final wj x(char c2, int i2, char c3) {
        return (wj) N.E(this, ((((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c3) << 48) >>> 48)) ^ b) ^ 106885559255328L, f[5]);
    }

    private final b_ Q(long j2) {
        long j3 = b ^ j2;
        return (b_) S.E(this, j3 ^ 40352958733756L, f[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26702, 682197092812586205L ^ j3) /* invoke-custom */]);
    }

    private final boolean h(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) a.E(this, j3 ^ 22397923009318L, f[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15477, 83735921444476532L ^ j3) /* invoke-custom */])).booleanValue();
    }

    public final boolean r() {
        return m;
    }

    public final void K(boolean z) {
        m = z;
    }

    @Override // su.catlean._g
    public void O(long j2) {
        long j3 = j2 ^ 32978412894279L;
        long j4 = j2 ^ 10016030373321L;
        long j5 = j2 ^ 9607710392669L;
        Object obj = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2597617212703117212L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    obj = zf.F(j3).field_1724;
                    if (obj != null) {
                        qc qcVar = this;
                        if (obj != null) {
                            if (qcVar.p(j4) != zp.ENABLE) {
                                return;
                            } else {
                                qcVar = this;
                            }
                        }
                        P(qcVar, true, false, 2, j5, null);
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2612159299500069479L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2612159299500069479L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2612159299500069479L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:34:0x00b6
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void g(su.catlean.api.event.events.player.PlayerUpdateEvent r8) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qc.g(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Type inference failed for: r0v21, types: [su.catlean.qc] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v42 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(su.catlean.api.event.events.network.AfterSendPacket r8) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qc.e(su.catlean.api.event.events.network.AfterSendPacket):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.api.event.events.client.InputEvent] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [int] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void Z(su.catlean.api.event.events.client.InputEvent r9) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qc.Z(su.catlean.api.event.events.client.InputEvent):void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [byte, int] */
    private final void B(long j2) {
        long j3 = b ^ j2;
        o8.p(o8.g, j3 ^ 82055820429557L, 0, (int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24041, 6866193324498859692L ^ j3) /* invoke-custom */, false, qc::K, 5, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(short r9, int r10, short r11) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qc.l(short, int, short):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final int T(byte r9, int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qc.T(byte, int, int):int");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [byte, int] */
    private final void x(boolean z, long j2, boolean z2) {
        long j3 = b ^ j2;
        o8.p(o8.g, j3 ^ 90597746157585L, 0, (int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24041, 6866167230721480264L ^ j3) /* invoke-custom */, false, () -> {
            K(r5, r6);
        }, 5, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v0, types: [su.catlean.qc] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    static void P(qc qcVar, boolean z, boolean z2, int i2, long j2, Object obj) {
        long j3 = b ^ j2;
        long j4 = j3 ^ 125742767729352L;
        ?? r0 = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4209403275916743162L, j3) /* invoke-custom */;
        try {
            r0 = i2 & 2;
            ?? r02 = r0;
            ?? r9 = z2;
            ?? r03 = r0;
            if (r0 == 0) {
                r9 = r03;
                r02 = r03;
            } else if (r0 != 0) {
                r03 = 0;
                r9 = r03;
                r02 = r03;
            }
            try {
                qcVar.x(z, j4, r9);
                if (j3 >= 0) {
                    if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4195607152175359144L, j3) /* invoke-custom */ == null) {
                        return;
                    }
                    r02 = new int[1];
                    vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 4206649808650575889L, j3) /* invoke-custom */;
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 4190067181185223681L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 4190067181185223681L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:19:0x00d6
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void w(int r13, long r14, boolean r16) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qc.w(int, long, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [byte, int] */
    private final void j(short s, char c2, int i2) {
        long j2 = (((((long) s) << 48) | ((((long) c2) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ b;
        o8.p(o8.g, j2 ^ 3114346997459L, -1, (int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18111, 8021259039628067777L ^ j2) /* invoke-custom */, false, qc::F, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.zp] */
    private static final boolean Z() {
        long j2 = b ^ 129102497425976L;
        Object objP = j2;
        try {
            objP = k.p(objP ^ 50618957325764L);
            return objP == zp.BIND;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objP, -842905273353272726L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.zp] */
    private static final boolean E() {
        long j2 = b ^ 38328683479329L;
        Object objP = j2;
        try {
            objP = k.p(objP ^ 133860022521565L);
            return objP == zp.BIND;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objP, 2257483918252337523L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.zp] */
    private static final boolean g() {
        long j2 = b ^ 13235495071449L;
        Object objP = j2;
        try {
            objP = k.p(objP ^ 96117081284901L);
            return objP == zp.BIND;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objP, 3507212827502659211L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.zp] */
    private static final boolean H() {
        long j2 = b ^ 98278371434515L;
        Object objP = j2;
        try {
            objP = k.p(objP ^ 2201572143087L);
            return objP == zp.BIND;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objP, 9108048761622169665L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.zp] */
    private static final boolean A() {
        long j2 = b ^ 49308405881251L;
        Object objP = j2;
        try {
            objP = k.p(objP ^ 131641326671455L);
            return objP == zp.BIND;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objP, 564708816281825777L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x01e8: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final void K() {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qc.K():void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:108:0x0405
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private static final void K(boolean r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 1154
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qc.K(boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.minecraft.class_304] */
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
    private static final void F() {
        Object objMethod_24828;
        long j2 = b ^ 105376607550460L;
        long j3 = j2 ^ 17962303895950L;
        long j4 = j2 ^ 129371933572005L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j4 << 16) >>> 48);
        int i4 = (int) ((j4 << 32) >>> 32);
        long j5 = j2 ^ 53823003965352L;
        Object objAreEqual = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1889934319863476651L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    try {
                        objAreEqual = Intrinsics.areEqual(zf.v(j5).method_31548().method_5438((int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3166, 122435529582734781L ^ j2) /* invoke-custom */).method_7909(), class_1802.field_8833);
                        qc qcVar = objAreEqual;
                        if (objAreEqual != 0) {
                            if (objAreEqual != 0) {
                                try {
                                    if (zf.v(j5).method_6128()) {
                                        zf.F(j3).field_1690.field_1903.method_23481(false);
                                        if (objAreEqual != 0) {
                                            return;
                                        }
                                    }
                                    objMethod_24828 = zf.F(j3).field_1690.field_1903;
                                    int i5 = (zf.v(j5).field_6012 - W) % 2;
                                    boolean z = i5;
                                    if (objAreEqual != 0) {
                                        z = i5 == 0 ? 1 : 0;
                                    }
                                    try {
                                        objMethod_24828.method_23481(z);
                                        k.j((short) i2, (char) i3, i4);
                                        if (objAreEqual != 0) {
                                            return;
                                        }
                                    } catch (NumberFormatException unused) {
                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_24828, -1906908703022083154L, j2) /* invoke-custom */;
                                    }
                                } catch (NumberFormatException unused2) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -1906908703022083154L, j2) /* invoke-custom */;
                                }
                            }
                            objMethod_24828 = zf.v(j5).method_24828();
                            qcVar = objMethod_24828;
                        }
                        if (qcVar != 0) {
                            try {
                                zf.F(j3).field_1690.field_1903.method_23481(true);
                                qcVar = k;
                                qcVar.j((short) i2, (char) i3, i4);
                            } catch (NumberFormatException unused3) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(qcVar, -1906908703022083154L, j2) /* invoke-custom */;
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -1906908703022083154L, j2) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused5) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -1906908703022083154L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused6) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -1906908703022083154L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused7) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -1906908703022083154L, j2) /* invoke-custom */;
        }
    }

    static {
        int i2;
        long j2 = b ^ 18554803705775L;
        long j3 = j2 ^ 132315586022982L;
        long j4 = j2 ^ 48406801656436L;
        long j5 = j2 ^ 10144835127655L;
        int i3 = (int) (j2 >>> 32);
        int i4 = (int) ((j5 << 32) >>> 48);
        int i5 = (int) ((j5 << 48) >>> 48);
        long j6 = j2 ^ 62855256601842L;
        long j7 = j2 ^ 4170515601899L;
        h = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(false, -8504855650701065060L, j2) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i6 = 1; i6 < 8; i6++) {
            bArr[i6] = (byte) ((j2 << (i6 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[42];
        int i7 = 0;
        String str = "/Sf\u001d\u0092ê7Ç'\b\b»6£ô+Z\r×û\nU\u0015pJ\u0088\u007fîtKû\f JßT©bÒ\u0003Ð\u0086\"~õFÓ«;-a\u001efá¢Dê Þ\u0083D\u0016\u0090}* Ì¼=&b\u008a\u0093é°2\tA=Ø\u0080\tã´X=/\u000e|Én²÷X@í°\u0091\u0018\u0084\u009dÓCvK\u0095Øß/IIð\\ÕÏC}ÍK4\u009dÔ\u001e8¸¾µ\u001cè¢×Ö\u000eÈÇ§ØY\u0096F¬íôñl\"x\u007f\u008b»jñZO\u001ec_âùU\u00915A}ÝhU²wåR½\u0013 \u0000\u008f\u0091ó»Ý \u0004\u0082÷àÀ1\"G;\u0017WîgSÖBÂóÇE¸fLÁ}¢\u0010+gXÑ¬ z\u0094xÿÚY\u0006\u0019q\rk\u0010\u0017¦íý\u0091Ô\u009eÀ\nÉ\u008c÷Êü\u009aªC¹nå\u0018\u0013ÄIn°Õ\t]Ú\u009aµ\bæIå¨^ìJj¸\u0005F-\u0018äò|zT\u0096V\u007fÖù\u0089ç\u009a+.ßµéÑ\u009añ\u008eÆR(þåÀè\u001fÚ\u0088°iJ+52ÿðÎX¬\u009b\u0004Yn8\u000f\u000b\\¸QÄ÷<\u009d8þd¢\u001fAÇ\b l×,A\u009câòÛ¥\u0085ö2\u0093éS5ÂÌýñ\u0092<HÕ¶v\u0017sÂÖgp\u0018àãx\u009dc¢«2\u00ad\u000f]\u0092æßF\fz{+\u0014Í\u001c\u009dè(JÁ·\u0081Vcs8û_p\bJïg\u0015Ur)T£Ñ¡t§}\u0084È\u001côðpä\u0006\u0087UÆ¦»\u0083 ¦bì[e\u0088=M)?c~m)*Àde\u0003Ù¤òlb ³\u0091¾â¸bQ(\u0016t1¼4Þé\u008d®\u0099îÁ&©µs\u008bÖÞq\u008c®\u0001\u0017\u0002\u000e[×\u0001\u000bÀ\u000bÄ å]0`øT\u0018l\u0001²\u0090æ\u009f¨]\u000bNgªq\u0080èZ\u0000]=y(w\u0082] \u008d,Ëuj\u0002ë\u0089ï\u0007¤èåÙÊ¦\u009aHôµ\u001a\u0014@\u0096[ÀE´El\u0018÷ Ò\u0083»¥}\u001f)í\tÛ\rý\u009e\u0086*_E)\fZ>\u0015â\u0091bÔ\u0086òïñ\u001cD0¶À$Õáí\u008dI&\u0094sY^*\u0083\u0007\u0098ZÝì\u008f¦xz±ðcjAûøUö!\u000b§\\\u008fC\u0006¡eI¬á'Õä\u0010avP\u0010\u0085÷\u0006§¯\u001b\u0096\u008e$\u008c¶\u009c\u00100\u009e\fuZó\u0089\u0014S\u0093\u0094\u001e%\u001eÛ\u0016\u00184\u009dß\u0096ò>·\u0081Ú\u008d\u008c¥B\\Ïz\u0085ôa\u001beÃ[\rH´U\u007f¯¦¢ïA 1µíñ|\u008e\u0005\u001eÊÖralè\u0004\u0002Z\f!h¸o&?\u0017-æ$\u001c·æ¼:m1ùE©R\u0096b\u001f/#\u001d'.-JÒ@xº\u0090%.\u0084ñ÷ÇiÇ\u0084(`\u0019ºAØ\u0090g^Ä!J+\bìQe{\u0018\u0086.÷9\u0096BÐì\u001f?±í½æý÷ \u00115¤%d8%zñ¤\u0083ç@ ç¡öë\u009cyß\u009b\u0002.*\u009c÷ØûF}¼Ýº³QÉc\u008cúYàFZÊ[CÄsWÈ\u0098[&ÜJðe\u000fé¿?\u0018\u000f×T:ífTÓ\u0093®\u000e²Zõ\u0083ÁIÖ0køÈ\u0085Ä(\u0092\u0097\u0015-Ò\u0097ÐK\u0014ì8ä\u000bÿ\u001e¾×õÄ½¸A@\u0010\u009cÜ\u001aÕVÜ\u0081q),½¯\u0094?÷\u008e ÓFôü\u008dYhø\u0097>\u0005\nó×wN\u0082Pü\u0019^gék\u0018\u0004\u008fd\u0014Jv\u009c@\u001cn ß\u0086\u0083N±÷ÜWo\u001dðHHà~<>\bÀ\u00ad\u0098²\b\u001b\u008a\u0007}\tÑ\u0086\tXâ[ý\u0010\u0086½ø¿\u008cræÅ\u0003\u009d\u009cDd;åë\u0013ÇÓÁ\r1´êø0¿\u000fxfí´J¹vöý±\u0085¶Ø\u0012\u0017\u0099\u0014ÝFr\u0007÷\u0012M\u0011\"vZë\t{¹ùc$·Ûc\nòø3\u000f[Ê\u0010\u0018\u001e\u00ad¸ÔÞ°\u0085\u0016â\u008f¢ÖuÄê&6\u008bb³\u009f·\u0004â(Qýç¡\u0082AS\u0003X'ê¦\u00ad\u00031\u0080§\u0094Oúû\u009e¤n|>*Û\u0005?È·\u0083cË\u0016Ù\u0012\r\u008e U¯Êômâ\u001bòLà ÷K*,RÒ\u001e#^u)x(Pï7\u0080£\u001dÙ\u0094\u0018\u0018J\u001b´[Ä¨ZÕÚ\u0093\u001d-6Ï\u0010nG î>ã\u00ad»\u0018YØ§:\u0080áEÞ®~vý|3¥í\u009dUõ\u0017aj=,\u0018|®)\u0019Ëºÿ2Jiÿ\u00914uØZðy]\u0004\u008c\u0002\u0091\u0090(ïaJìä£\u0003ö¶ÊP£jh\nà\u0094y`\u0084\u008c\u0010E\u001e¥U£\u0019 Í£É\n³=\u00961\u0099ýn z©?ï0ÿ\u0099^¨H\u0014ÔÊìþnäóþ\u009fªË\u0015´´qvï\u001c¦ÏÙ(\n\u0015\fí\t\u00ad\u0082/k\u0095ð\u0089\u008c\u0099¶æíX¹\u007f:\u0086SÊ¬-\u008c\f]iZü¶\u0004 \u0019û(ï\u0082\u0018#\u0018À\u000fÿÒÌù!Á\u008aâö\u0086[W\fº\u0012®Íæ²ø";
        int length = "/Sf\u001d\u0092ê7Ç'\b\b»6£ô+Z\r×û\nU\u0015pJ\u0088\u007fîtKû\f JßT©bÒ\u0003Ð\u0086\"~õFÓ«;-a\u001efá¢Dê Þ\u0083D\u0016\u0090}* Ì¼=&b\u008a\u0093é°2\tA=Ø\u0080\tã´X=/\u000e|Én²÷X@í°\u0091\u0018\u0084\u009dÓCvK\u0095Øß/IIð\\ÕÏC}ÍK4\u009dÔ\u001e8¸¾µ\u001cè¢×Ö\u000eÈÇ§ØY\u0096F¬íôñl\"x\u007f\u008b»jñZO\u001ec_âùU\u00915A}ÝhU²wåR½\u0013 \u0000\u008f\u0091ó»Ý \u0004\u0082÷àÀ1\"G;\u0017WîgSÖBÂóÇE¸fLÁ}¢\u0010+gXÑ¬ z\u0094xÿÚY\u0006\u0019q\rk\u0010\u0017¦íý\u0091Ô\u009eÀ\nÉ\u008c÷Êü\u009aªC¹nå\u0018\u0013ÄIn°Õ\t]Ú\u009aµ\bæIå¨^ìJj¸\u0005F-\u0018äò|zT\u0096V\u007fÖù\u0089ç\u009a+.ßµéÑ\u009añ\u008eÆR(þåÀè\u001fÚ\u0088°iJ+52ÿðÎX¬\u009b\u0004Yn8\u000f\u000b\\¸QÄ÷<\u009d8þd¢\u001fAÇ\b l×,A\u009câòÛ¥\u0085ö2\u0093éS5ÂÌýñ\u0092<HÕ¶v\u0017sÂÖgp\u0018àãx\u009dc¢«2\u00ad\u000f]\u0092æßF\fz{+\u0014Í\u001c\u009dè(JÁ·\u0081Vcs8û_p\bJïg\u0015Ur)T£Ñ¡t§}\u0084È\u001côðpä\u0006\u0087UÆ¦»\u0083 ¦bì[e\u0088=M)?c~m)*Àde\u0003Ù¤òlb ³\u0091¾â¸bQ(\u0016t1¼4Þé\u008d®\u0099îÁ&©µs\u008bÖÞq\u008c®\u0001\u0017\u0002\u000e[×\u0001\u000bÀ\u000bÄ å]0`øT\u0018l\u0001²\u0090æ\u009f¨]\u000bNgªq\u0080èZ\u0000]=y(w\u0082] \u008d,Ëuj\u0002ë\u0089ï\u0007¤èåÙÊ¦\u009aHôµ\u001a\u0014@\u0096[ÀE´El\u0018÷ Ò\u0083»¥}\u001f)í\tÛ\rý\u009e\u0086*_E)\fZ>\u0015â\u0091bÔ\u0086òïñ\u001cD0¶À$Õáí\u008dI&\u0094sY^*\u0083\u0007\u0098ZÝì\u008f¦xz±ðcjAûøUö!\u000b§\\\u008fC\u0006¡eI¬á'Õä\u0010avP\u0010\u0085÷\u0006§¯\u001b\u0096\u008e$\u008c¶\u009c\u00100\u009e\fuZó\u0089\u0014S\u0093\u0094\u001e%\u001eÛ\u0016\u00184\u009dß\u0096ò>·\u0081Ú\u008d\u008c¥B\\Ïz\u0085ôa\u001beÃ[\rH´U\u007f¯¦¢ïA 1µíñ|\u008e\u0005\u001eÊÖralè\u0004\u0002Z\f!h¸o&?\u0017-æ$\u001c·æ¼:m1ùE©R\u0096b\u001f/#\u001d'.-JÒ@xº\u0090%.\u0084ñ÷ÇiÇ\u0084(`\u0019ºAØ\u0090g^Ä!J+\bìQe{\u0018\u0086.÷9\u0096BÐì\u001f?±í½æý÷ \u00115¤%d8%zñ¤\u0083ç@ ç¡öë\u009cyß\u009b\u0002.*\u009c÷ØûF}¼Ýº³QÉc\u008cúYàFZÊ[CÄsWÈ\u0098[&ÜJðe\u000fé¿?\u0018\u000f×T:ífTÓ\u0093®\u000e²Zõ\u0083ÁIÖ0køÈ\u0085Ä(\u0092\u0097\u0015-Ò\u0097ÐK\u0014ì8ä\u000bÿ\u001e¾×õÄ½¸A@\u0010\u009cÜ\u001aÕVÜ\u0081q),½¯\u0094?÷\u008e ÓFôü\u008dYhø\u0097>\u0005\nó×wN\u0082Pü\u0019^gék\u0018\u0004\u008fd\u0014Jv\u009c@\u001cn ß\u0086\u0083N±÷ÜWo\u001dðHHà~<>\bÀ\u00ad\u0098²\b\u001b\u008a\u0007}\tÑ\u0086\tXâ[ý\u0010\u0086½ø¿\u008cræÅ\u0003\u009d\u009cDd;åë\u0013ÇÓÁ\r1´êø0¿\u000fxfí´J¹vöý±\u0085¶Ø\u0012\u0017\u0099\u0014ÝFr\u0007÷\u0012M\u0011\"vZë\t{¹ùc$·Ûc\nòø3\u000f[Ê\u0010\u0018\u001e\u00ad¸ÔÞ°\u0085\u0016â\u008f¢ÖuÄê&6\u008bb³\u009f·\u0004â(Qýç¡\u0082AS\u0003X'ê¦\u00ad\u00031\u0080§\u0094Oúû\u009e¤n|>*Û\u0005?È·\u0083cË\u0016Ù\u0012\r\u008e U¯Êômâ\u001bòLà ÷K*,RÒ\u001e#^u)x(Pï7\u0080£\u001dÙ\u0094\u0018\u0018J\u001b´[Ä¨ZÕÚ\u0093\u001d-6Ï\u0010nG î>ã\u00ad»\u0018YØ§:\u0080áEÞ®~vý|3¥í\u009dUõ\u0017aj=,\u0018|®)\u0019Ëºÿ2Jiÿ\u00914uØZðy]\u0004\u008c\u0002\u0091\u0090(ïaJìä£\u0003ö¶ÊP£jh\nà\u0094y`\u0084\u008c\u0010E\u001e¥U£\u0019 Í£É\n³=\u00961\u0099ýn z©?ï0ÿ\u0099^¨H\u0014ÔÊìþnäóþ\u009fªË\u0015´´qvï\u001c¦ÏÙ(\n\u0015\fí\t\u00ad\u0082/k\u0095ð\u0089\u008c\u0099¶æíX¹\u007f:\u0086SÊ¬-\u008c\f]iZü¶\u0004 \u0019û(ï\u0082\u0018#\u0018À\u000fÿÒÌù!Á\u008aâö\u0086[W\fº\u0012®Íæ²ø".length();
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
                            c = strArr;
                            d = new String[42];
                            o = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i12 = 1; i12 < 8; i12++) {
                                bArr2[i12] = (byte) ((j2 << (i12 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[20];
                            int i13 = 0;
                            String str3 = "\u0000o\u0002Â\u0011ìm£Ý\u0084\bäRM/B©sÊd.xð\u0080Ñg\u009d\u0090I\u001d\u0011ô'ZOÝv³µ¦úù\r\u0000à½'M/nU|}¯úPèÝ\u0010PAÅãu\f\u0019\u008f\u0007y[ñõÉ\u0088Ü¿5-\u008f-_¯uiå{×86á\u0089Nrõ6³\u007f\u0091 êò\u000ea\\íå5ÈÁ\u000bó\u0015Öy\u0099íý¢âÊb\u009a}ÅÍï÷5ù±\"£3é9þú\u001dgÉû9Â\u0001";
                            int length2 = "\u0000o\u0002Â\u0011ìm£Ý\u0084\bäRM/B©sÊd.xð\u0080Ñg\u009d\u0090I\u001d\u0011ô'ZOÝv³µ¦úù\r\u0000à½'M/nU|}¯úPèÝ\u0010PAÅãu\f\u0019\u008f\u0007y[ñõÉ\u0088Ü¿5-\u008f-_¯uiå{×86á\u0089Nrõ6³\u007f\u0091 êò\u000ea\\íå5ÈÁ\u000bó\u0015Öy\u0099íý¢âÊb\u009a}ÅÍï÷5ù±\"£3é9þú\u001dgÉû9Â\u0001".length();
                            int i14 = 0;
                            while (true) {
                                int i15 = i14;
                                i14 += 8;
                                byte[] bytes = str3.substring(i15, i14).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i16 = i13;
                                i13++;
                                long j8 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j9 = j8;
                                    int i17 = i16;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j9 >>> 56), (byte) (j9 >>> 48), (byte) (j9 >>> 40), (byte) (j9 >>> 32), (byte) (j9 >>> 24), (byte) (j9 >>> 16), (byte) (j9 >>> 8), (byte) j9});
                                    long j10 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i17) {
                                        case 0:
                                            jArr2[b5] = j10;
                                            if (i14 >= length2) {
                                                i = jArr;
                                                n = new Integer[20];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22346, 3772978740507794168L ^ j2) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(qc.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16210, 1242213220307224835L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10313, 3319179169753226782L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(qc.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2668, 7043463946795351073L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16341, 1937104435773983110L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(qc.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26811, 8555364212061183729L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29957, 306945526799500136L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(qc.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24329, 8761174984734058845L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3867, 4076891517138663753L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(qc.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11735, 7426467932253674386L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20764, 2837848085763827521L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(qc.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14019, 7882902787435249805L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22107, 8163811082129383450L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4848, 8396202079120924493L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(qc.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5688, 387559725978050672L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16065, 1523817716288080024L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15477, 83716056452411842L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(qc.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13276, 8552741484014781884L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14349, 4747630892071079511L ^ j2) /* invoke-custom */, 0));
                                                f = kPropertyArr;
                                                k = new qc(j7);
                                                V = yp.L(k, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30480, 2482758635265950022L ^ j2) /* invoke-custom */, zp.ENABLE, null, null, (int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1574, 5522893183726062480L ^ j2) /* invoke-custom */, null, j6);
                                                l = yp.J(k, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27915, 5905094140945931081L ^ j2) /* invoke-custom */, new lj(0, false, j4, false, (int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15477, 83716056452411842L ^ j2) /* invoke-custom */, null), null, i3, qc::Z, i4, (char) i5, 4, null);
                                                g = yp.J(k, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22684, 1645331868724408003L ^ j2) /* invoke-custom */, new lj(0, false, j4, false, (int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15477, 83716056452411842L ^ j2) /* invoke-custom */, null), null, i3, qc::E, i4, (char) i5, 4, null);
                                                w = yp.t(k, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6383, 3186978779341450893L ^ j2) /* invoke-custom */, false, j3, null, qc::g, 4, null);
                                                j = yp.L(k, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16118, 8622446742641887405L ^ j2) /* invoke-custom */, yt.SILENT, null, qc::H, 4, null, j6);
                                                N = yp.L(k, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3870, 4662862054268926298L ^ j2) /* invoke-custom */, wj.ALT, null, null, (int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2292, 5488692679214990681L ^ j2) /* invoke-custom */, null, j6);
                                                S = yp.L(k, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25814, 1639988885702873757L ^ j2) /* invoke-custom */, b_.DEFAULT, null, null, (int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2292, 5488692679214990681L ^ j2) /* invoke-custom */, null, j6);
                                                a = yp.t(k, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14477, 6390762598162517736L ^ j2) /* invoke-custom */, false, j3, null, qc::A, 4, null);
                                                class_1792[] class_1792VarArr = new class_1792[(int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4848, 8396202079120924493L ^ j2) /* invoke-custom */];
                                                class_1792 class_1792Var = class_1802.field_22028;
                                                Intrinsics.checkNotNullExpressionValue(class_1792Var, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26616, 4050737994387493275L ^ j2) /* invoke-custom */);
                                                class_1792VarArr[0] = class_1792Var;
                                                class_1792 class_1792Var2 = class_1802.field_8058;
                                                Intrinsics.checkNotNullExpressionValue(class_1792Var2, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16536, 40592262117766865L ^ j2) /* invoke-custom */);
                                                class_1792VarArr[1] = class_1792Var2;
                                                class_1792 class_1792Var3 = class_1802.field_8873;
                                                Intrinsics.checkNotNullExpressionValue(class_1792Var3, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19469, 7715512421870451308L ^ j2) /* invoke-custom */);
                                                class_1792VarArr[2] = class_1792Var3;
                                                class_1792 class_1792Var4 = class_1802.field_8523;
                                                Intrinsics.checkNotNullExpressionValue(class_1792Var4, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15694, 8427715105586039570L ^ j2) /* invoke-custom */);
                                                class_1792VarArr[3] = class_1792Var4;
                                                class_1792 class_1792Var5 = class_1802.field_8678;
                                                Intrinsics.checkNotNullExpressionValue(class_1792Var5, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28073, 4000214692852472805L ^ j2) /* invoke-custom */);
                                                class_1792VarArr[4] = class_1792Var5;
                                                class_1792 class_1792Var6 = class_1802.field_8577;
                                                Intrinsics.checkNotNullExpressionValue(class_1792Var6, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19428, 6527537166040120712L ^ j2) /* invoke-custom */);
                                                class_1792VarArr[5] = class_1792Var6;
                                                T = class_1792VarArr;
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j10;
                                            if (i14 >= length2) {
                                                str3 = "ylWE\u001b\u009fi\u0095@_\u0089\u008dÆûE¡";
                                                length2 = "ylWE\u001b\u009fi\u0095@_\u0089\u008dÆûE¡".length();
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
                                    j8 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "\u001aO4--\u001dP õ\bØÉvM+\u008b[Dú¿[\u0086rvÌ\u009d\u009aÐ\u0091`\u00ad\u001b\u0087æóËûïÙõi{{yÀÝJ\u008cBÁ8Ì\u009dWMbê\u001fÝ«=ä®\u009b(I\u0017¡¶æ\u001e0>êÈt\u009a4\u0090=ºÖ\u009a1HýTÙ\u0083\u009a^\b¦öÐ1âääÌtùÅE÷";
                        length = "\u001aO4--\u001dP õ\bØÉvM+\u008b[Dú¿[\u0086rvÌ\u009d\u009aÐ\u0091`\u00ad\u001b\u0087æóËûïÙõi{{yÀÝJ\u008cBÁ8Ì\u009dWMbê\u001fÝ«=ä®\u009b(I\u0017¡¶æ\u001e0>êÈt\u009a4\u0090=ºÖ\u009a1HýTÙ\u0083\u009a^\b¦öÐ1âääÌtùÅE÷".length();
                        cCharAt = '@';
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

    public static void t(boolean z) {
        e = z;
    }

    public static boolean I() {
        return e;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean s() {
        return !I();
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 32465;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) h.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = b(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/qc", e2);
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
            r1 = 2
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
            java.lang.String r1 = "su/catlean/qc"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qc.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 1320;
        if (n[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) i[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) o.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/qc", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            n[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return n[i3].intValue();
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
            r1 = 2
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
            java.lang.String r1 = "su/catlean/qc"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qc.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
