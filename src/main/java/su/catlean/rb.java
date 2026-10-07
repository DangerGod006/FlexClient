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
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/rb.class */
public final class rb {
    private static final double h = 0.05d;
    private static final double U = 0.95d;
    private static final double b = 0.5d;

    @NotNull
    private static final Map l;

    @NotNull
    private static final List E;
    private static boolean N;
    private static final long a = yz.a(-181175479539052100L, 3244234991542762975L, MethodHandles.lookup().lookupClass()).a(140063211212728L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map i;

    @NotNull
    public static final Map W() {
        return l;
    }

    @NotNull
    public static final List N() {
        return E;
    }

    @Nullable
    public static final mm q(@NotNull ux $this$calcPosition, long a2, @NotNull gp configState) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$calcPosition, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(672, 3154676996142204407L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(configState, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14059, 7741706163646640549L ^ j) /* invoke-custom */);
        Pair pair = TuplesKt.to(ot.W(j ^ 137890815064519L, configState, W($this$calcPosition, configState, false, false, j ^ 61102753187219L, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3350, 9047693804052527659L ^ j) /* invoke-custom */, null)), Long.valueOf(zf.A() - zf.A()));
        mm mmVar = (mm) pair.component1();
        $this$calcPosition.I(((Number) pair.component2()).longValue());
        return mmVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @org.jetbrains.annotations.Nullable
    public static final net.minecraft.class_3965 N(@org.jetbrains.annotations.NotNull su.catlean.ux r10, boolean r11, long r12, boolean r14) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rb.N(su.catlean.ux, boolean, long, boolean):net.minecraft.class_3965");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0242 A[EDGE_INSN: B:44:0x0242->B:34:0x0242 BREAK  A[LOOP:1: B:4:0x00f7->B:45:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r50v0 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x023f -> B:14:0x0153). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.util.List h(su.catlean.ux r10, su.catlean.gp r11, long r12, boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rb.h(su.catlean.ux, su.catlean.gp, long, boolean, boolean):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    static List W(ux uxVar, gp gpVar, boolean z, boolean z2, long j, int i2, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 122508958998250L;
        ?? r0 = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4395454104907731523L, j2) /* invoke-custom */;
        try {
            r0 = i2 & 2;
            ?? r02 = r0;
            if (r0 == 0) {
                if (r0 != 0) {
                    z = false;
                }
                r02 = i2 & 4;
            }
            ?? r10 = z2;
            ?? r03 = r02;
            if (r0 != 0) {
                r10 = r03;
            } else if (r02 != 0) {
                r03 = 0;
                r10 = r03;
            }
            return h(uxVar, gpVar, j3, z, r10);
        } catch (NoSuchElementException unused) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -4386380459535722903L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:219:0x0592
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @org.jetbrains.annotations.Nullable
    public static final su.catlean.mm z(@org.jetbrains.annotations.NotNull su.catlean.ux r11, short r12, @org.jetbrains.annotations.NotNull net.minecraft.class_2338 r13, int r14, @org.jetbrains.annotations.NotNull net.minecraft.class_243 r15, @org.jetbrains.annotations.NotNull su.catlean.gp r16, short r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 1883
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rb.z(su.catlean.ux, short, net.minecraft.class_2338, int, net.minecraft.class_243, su.catlean.gp, short, boolean, boolean):su.catlean.mm");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public static mm U(ux uxVar, class_2338 class_2338Var, long j, class_243 class_243Var, gp gpVar, boolean z, boolean z2, int i2, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 78240960013558L;
        int i3 = (int) (j2 >>> 48);
        int i4 = (int) ((j3 << 16) >>> 32);
        int i5 = (int) ((j3 << 48) >>> 48);
        ?? J = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(9056209784625859056L, j2) /* invoke-custom */;
        try {
            J = i2 & (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7646, 1691391838674414532L ^ j2) /* invoke-custom */;
            ?? J2 = J;
            if (J != 0) {
                if (J != 0) {
                    z = false;
                }
                J2 = i2 & (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12238, 6273464189327104465L ^ j2) /* invoke-custom */;
            }
            ?? r17 = z2;
            ?? r0 = J2;
            if (J == 0) {
                r17 = r0;
            } else if (J2 != 0) {
                r0 = 0;
                r17 = r0;
            }
            return z(uxVar, (short) i3, class_2338Var, i4, class_243Var, gpVar, (short) i5, z, r17);
        } catch (NoSuchElementException unused) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(J, 9034068798787954710L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Nullable
    public static final class_3965 D(int i2, @NotNull class_2338 class_2338Var, @NotNull gp gpVar, int i3, boolean z) {
        long j = ((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ a;
        long j2 = j ^ 8200281328223L;
        long j3 = j ^ 68866561157866L;
        Object objR = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2975991064226618643L, j) /* invoke-custom */;
        try {
            objR = class_2338Var;
            class_2338 class_2338Var2 = objR;
            if (objR != 0) {
                try {
                    Intrinsics.checkNotNullParameter(objR, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13102, 8955299934449000023L ^ j) /* invoke-custom */);
                    Intrinsics.checkNotNullParameter(gpVar, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28581, 4617934827451155140L ^ j) /* invoke-custom */);
                    objR = gpVar.r();
                    if (objR != 0) {
                        return L(class_2338Var, j3, gpVar, z);
                    }
                    class_2338Var2 = class_2338Var;
                } catch (NoSuchElementException unused) {
                    throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objR, -3007757484091669749L, j) /* invoke-custom */;
                }
            }
            return r(class_2338Var2, j2, gpVar);
        } catch (NoSuchElementException unused2) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objR, -3007757484091669749L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    public static class_3965 f(char c2, class_2338 class_2338Var, int i2, gp gpVar, short s, boolean z, int i3, Object obj) {
        long j = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s) << 48) >>> 48)) ^ a;
        int i4 = (int) (j >>> 32);
        int i5 = (int) (((j ^ 18153519534358L) << 32) >>> 32);
        ?? r0 = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-166511264047164659L, j) /* invoke-custom */;
        try {
            r0 = i3 & 4;
            ?? r13 = z;
            ?? r02 = r0;
            if (r0 != 0) {
                r13 = r02;
            } else if (r0 != 0) {
                r02 = 0;
                r13 = r02;
            }
            return D(i4, class_2338Var, gpVar, i5, r13);
        } catch (NoSuchElementException unused) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -175595224313648935L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:170:0x0594
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private static final net.minecraft.class_3965 r(net.minecraft.class_2338 r13, long r14, su.catlean.gp r16) {
        /*
            Method dump skipped, instruction units count: 1517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rb.r(net.minecraft.class_2338, long, su.catlean.gp):net.minecraft.class_3965");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: net.minecraft.class_3965 */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0097, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0097, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014d A[Catch: NoSuchElementException -> 0x0154, TryCatch #5 {NoSuchElementException -> 0x0154, blocks: (B:16:0x0129, B:18:0x014d), top: B:71:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0129 A[EXC_TOP_SPLITTER, PHI: r0
  0x0129: PHI (r0v15 su.catlean.la) = (r0v48 su.catlean.la), (r0v49 su.catlean.la), (r0v50 su.catlean.la) binds: [B:7:0x00f6, B:9:0x010e, B:13:0x011c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22, types: [net.minecraft.class_3965] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Throwable, java.util.NoSuchElementException] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [int] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
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
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final net.minecraft.class_3965 L(net.minecraft.class_2338 r11, long r12, su.catlean.gp r14, boolean r15) throws net.minecraft.class_3965 {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rb.L(net.minecraft.class_2338, long, su.catlean.gp, boolean):net.minecraft.class_3965");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:25:0x00ce
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private static final boolean w(net.minecraft.class_243 r9, long r10, net.minecraft.class_2338 r12, net.minecraft.class_243 r13, su.catlean.gp r14) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rb.w(net.minecraft.class_243, long, net.minecraft.class_2338, net.minecraft.class_243, su.catlean.gp):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static final boolean a(@org.jetbrains.annotations.NotNull su.catlean.ux r10, long r11, @org.jetbrains.annotations.NotNull net.minecraft.class_2338 r13, boolean r14, @org.jetbrains.annotations.NotNull su.catlean.gp r15) {
        /*
            Method dump skipped, instruction units count: 1904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rb.a(su.catlean.ux, long, net.minecraft.class_2338, boolean, su.catlean.gp):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v21, types: [net.minecraft.class_1657] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, net.minecraft.class_243] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.minecraft.class_1657] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable, java.util.NoSuchElementException] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean L(long r9, @org.jetbrains.annotations.NotNull net.minecraft.class_2338 r11, @org.jetbrains.annotations.NotNull net.minecraft.class_1657 r12) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rb.L(long, net.minecraft.class_2338, net.minecraft.class_1657):boolean");
    }

    private static final Float D(class_2338 class_2338Var, class_243 class_243Var) {
        long j = a ^ 64267105467346L;
        long j2 = j ^ 3990975930591L;
        int i2 = (int) (j >>> 48);
        int i3 = (int) ((j2 << 16) >>> 48);
        return Float.valueOf(dm.h.z((short) i2, (char) i3, (int) ((j2 << 32) >>> 32), new class_243(((double) class_2338Var.method_10263()) + class_243Var.field_1352, ((double) class_2338Var.method_10264()) + class_243Var.field_1351, ((double) class_2338Var.method_10260()) + class_243Var.field_1350)));
    }

    private static final Float b(Function1 function1, Object obj) {
        return (Float) function1.invoke(obj);
    }

    static {
        int i2;
        long j = a ^ 102806594955871L;
        e = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, -3371240002363202452L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[25];
        int i4 = 0;
        String str = "Ù//VrÃÀ·u²ç/c+\u0084,zÁT'¡¶%3\u0010¨\u009a\u000e\u0012\u0015mP\u009eÄª;ø\u0088z2ø 6·\u0011TÜ\u0089\u0007òA\u0087ãq! \u001b\u0082.ÇIê\u0093êÄªôæ\u0002ä\u0088\u0089pª\u0010ïÎ!\r$W8|\u0088\u0005¸g\u000bÈ×\u001f(G>Ø\u0089û>mfÏ\u0000ñ¿\u000e\u0012½×C½\u0013P³BX]Â\u0011aü¡ý\u000enª}AÙ¢¸å9\u0018q·A\u0083#Ó\tw\u0012.cÞ$\u0087X{áß\u0097¤dÿ« \u00109\u009b\u0097iz\u0015µN5»µH}V-Ó\u0010¼O¶AuÓJ{á´:\u0090\u0017E³7 Åä\u0097ÿM\u0000\u0086\fõè\u008a\u0012¯c\u009cC\u0002kVl$ì\u001be*\u0015\u008dÚî\u0016IÐ\u0018\u0000Õ;Ò\u0003ÐFÓúÏ6öe%\u009a÷2¤lÉÉð2# ¹\u0098^Ê´«ÆtD\u0082&\u009dµ+ª\u0013Ô¹ö\n¿Küµ\u008b\u0086\u0084V·0i\u00ad(xn\u0090¹¦8É¥\f¢þñ\u0090'üj\u0097d\u0012Ü\u0018 \u008c\u008d\u009f\u0010\u001dÒA\fÊ2õy.vÄ\u009b\u009e[\u0018FIAyWk¦ÏW\u009e.¦Y\nãýÚq\u001dñ6y\u0098\u0019\u0010\u0007Ë¦ñü%Õ23Ìbb\u00013³^(>\u008eä\u009e\u0000V4Ëbr\r[\u001böq\u0085\u008df®.¸¯7O`µ\u0003³ÑÅ>ûÝ²oHzÉ\u0007ö\u0010i\u0085âä\u0097\u0002ä\u0000]Ì1Ö\u0087ïäD\u0010/\u0095«>Î¸J\u009b\u009cÆþÍ*øí28MV,Íó\u001d\u0092\u0094Y¶Ê ½£ð1\u001fÎtj\u0095ð\u008c±\u0093'\u007f¾\u0097\"}¥(æ\u001a{D\u0082t]Ý[f\u0013³c¨ß<\u0099p\u0084ª\u001c}\u009c\u0018W¦/\u0083êÌÁ/zwæµ\u008d0 =j&b¦\u000bA\u0011\u0080(Y6ýÐ\u0014Be\u008fLÚú\u0091³z©»&o\u0015\u000b\u0006E,\u0001\u0092Çb§\u0015»8\u008eO\u0082¢\u0006.r\u0080Þ\u0010\u00146µ\u0005^LvN¢£2\u001dJTßõ\u0010¬IUÑÝÝ¥\u009f:\u008bêW\\\u0091\u0019G [á\"\u001bÏÜFö¨Ä\u0007H\\º\teÑÝ¸ÇQx\u001eÚ;\u0010Ï\u000fJ\u0092\u0093\u000b";
        int length = "Ù//VrÃÀ·u²ç/c+\u0084,zÁT'¡¶%3\u0010¨\u009a\u000e\u0012\u0015mP\u009eÄª;ø\u0088z2ø 6·\u0011TÜ\u0089\u0007òA\u0087ãq! \u001b\u0082.ÇIê\u0093êÄªôæ\u0002ä\u0088\u0089pª\u0010ïÎ!\r$W8|\u0088\u0005¸g\u000bÈ×\u001f(G>Ø\u0089û>mfÏ\u0000ñ¿\u000e\u0012½×C½\u0013P³BX]Â\u0011aü¡ý\u000enª}AÙ¢¸å9\u0018q·A\u0083#Ó\tw\u0012.cÞ$\u0087X{áß\u0097¤dÿ« \u00109\u009b\u0097iz\u0015µN5»µH}V-Ó\u0010¼O¶AuÓJ{á´:\u0090\u0017E³7 Åä\u0097ÿM\u0000\u0086\fõè\u008a\u0012¯c\u009cC\u0002kVl$ì\u001be*\u0015\u008dÚî\u0016IÐ\u0018\u0000Õ;Ò\u0003ÐFÓúÏ6öe%\u009a÷2¤lÉÉð2# ¹\u0098^Ê´«ÆtD\u0082&\u009dµ+ª\u0013Ô¹ö\n¿Küµ\u008b\u0086\u0084V·0i\u00ad(xn\u0090¹¦8É¥\f¢þñ\u0090'üj\u0097d\u0012Ü\u0018 \u008c\u008d\u009f\u0010\u001dÒA\fÊ2õy.vÄ\u009b\u009e[\u0018FIAyWk¦ÏW\u009e.¦Y\nãýÚq\u001dñ6y\u0098\u0019\u0010\u0007Ë¦ñü%Õ23Ìbb\u00013³^(>\u008eä\u009e\u0000V4Ëbr\r[\u001böq\u0085\u008df®.¸¯7O`µ\u0003³ÑÅ>ûÝ²oHzÉ\u0007ö\u0010i\u0085âä\u0097\u0002ä\u0000]Ì1Ö\u0087ïäD\u0010/\u0095«>Î¸J\u009b\u009cÆþÍ*øí28MV,Íó\u001d\u0092\u0094Y¶Ê ½£ð1\u001fÎtj\u0095ð\u008c±\u0093'\u007f¾\u0097\"}¥(æ\u001a{D\u0082t]Ý[f\u0013³c¨ß<\u0099p\u0084ª\u001c}\u009c\u0018W¦/\u0083êÌÁ/zwæµ\u008d0 =j&b¦\u000bA\u0011\u0080(Y6ýÐ\u0014Be\u008fLÚú\u0091³z©»&o\u0015\u000b\u0006E,\u0001\u0092Çb§\u0015»8\u008eO\u0082¢\u0006.r\u0080Þ\u0010\u00146µ\u0005^LvN¢£2\u001dJTßõ\u0010¬IUÑÝÝ¥\u009f:\u008bêW\\\u0091\u0019G [á\"\u001bÏÜFö¨Ä\u0007H\\º\teÑÝ¸ÇQx\u001eÚ;\u0010Ï\u000fJ\u0092\u0093\u000b".length();
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
                        if (i8 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            c = strArr;
                            d = new String[25];
                            i = new HashMap(13);
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
                            String str3 = "\u0010\u008cØ|ÂY\u001ca\u0080n\u001f\u009e\u0098£CÕ\u0082±å\u00177C\u0018\u0017\u009d\"µ\u001cIYÞ;Mò\u0007¡\u001fú|\u0088\u0017%÷î\u0003r¼ûBíýkqê-:ëñ²\u0004¼°,÷/Pæ\u0095 \u008e\u008d@\u009c\\þìºYÝoª\u0015¨K5n\u0087èb#7;Ú§w\"";
                            int length2 = "\u0010\u008cØ|ÂY\u001ca\u0080n\u001f\u009e\u0098£CÕ\u0082±å\u00177C\u0018\u0017\u009d\"µ\u001cIYÞ;Mò\u0007¡\u001fú|\u0088\u0017%÷î\u0003r¼ûBíýkqê-:ëñ²\u0004¼°,÷/Pæ\u0095 \u008e\u008d@\u009c\\þìºYÝoª\u0015¨K5n\u0087èb#7;Ú§w\"".length();
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
                                                Pair[] pairArr = new Pair[(int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(65, 2321468868985281183L ^ j) /* invoke-custom */];
                                                pairArr[0] = TuplesKt.to(new class_243(b, 1.0d, b), true);
                                                pairArr[1] = TuplesKt.to(new class_243(b, 0.0d, b), true);
                                                pairArr[2] = TuplesKt.to(new class_243(b, b, 0.0d), true);
                                                pairArr[3] = TuplesKt.to(new class_243(b, b, 1.0d), true);
                                                pairArr[4] = TuplesKt.to(new class_243(0.0d, b, b), true);
                                                pairArr[5] = TuplesKt.to(new class_243(1.0d, b, b), true);
                                                pairArr[(int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19870, 8555386399941171020L ^ j) /* invoke-custom */] = TuplesKt.to(new class_243(h, h, h), false);
                                                pairArr[(int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11256, 2703697670755512623L ^ j) /* invoke-custom */] = TuplesKt.to(new class_243(h, h, U), false);
                                                pairArr[(int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29876, 1410350779812687460L ^ j) /* invoke-custom */] = TuplesKt.to(new class_243(h, U, h), false);
                                                pairArr[(int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23081, 8138838208477921526L ^ j) /* invoke-custom */] = TuplesKt.to(new class_243(h, U, U), false);
                                                pairArr[(int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10197, 4742365416383773967L ^ j) /* invoke-custom */] = TuplesKt.to(new class_243(U, h, h), false);
                                                pairArr[(int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5095, 8737859199014258996L ^ j) /* invoke-custom */] = TuplesKt.to(new class_243(U, h, U), false);
                                                pairArr[(int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7497, 192657446628444060L ^ j) /* invoke-custom */] = TuplesKt.to(new class_243(U, U, h), false);
                                                pairArr[(int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27150, 55785972830187730L ^ j) /* invoke-custom */] = TuplesKt.to(new class_243(U, U, U), false);
                                                l = MapsKt.mapOf(pairArr);
                                                class_243[] class_243VarArr = new class_243[(int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(765, 1313155645350074400L ^ j) /* invoke-custom */];
                                                class_243VarArr[0] = new class_243(0.51d, 0.0d, 0.49d);
                                                class_243VarArr[1] = new class_243(h, 0.0d, h);
                                                class_243VarArr[2] = new class_243(h, 0.0d, U);
                                                class_243VarArr[3] = new class_243(U, 0.0d, h);
                                                class_243VarArr[4] = new class_243(U, 0.0d, U);
                                                class_243VarArr[5] = new class_243(0.475d, 0.0d, U);
                                                class_243VarArr[(int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19870, 8555386399941171020L ^ j) /* invoke-custom */] = new class_243(0.475d, 0.0d, h);
                                                class_243VarArr[(int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17713, 657263871677931495L ^ j) /* invoke-custom */] = new class_243(U, 0.0d, 0.025d);
                                                class_243VarArr[(int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29876, 1410350779812687460L ^ j) /* invoke-custom */] = new class_243(h, 0.0d, 0.475d);
                                                E = CollectionsKt.listOf((Object[]) class_243VarArr);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i11 >= length2) {
                                                str3 = "\u0018G^Êm\\2\u009dîß³ï\u0083»äª";
                                                length2 = "\u0018G^Êm\\2\u009dîß³ï\u0083»äª".length();
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
                        str = "¾\u0087±VHÌ¥^ôa»9\u0004.8þ¶#l\u0095{\u0012\u0013\u000f¹J\u0090û_Üá+\u0010«Î\u009f:\t\u0097ÊJ\u0098¼È\u001b\u001b\u00062ü";
                        length = "¾\u0087±VHÌ¥^ôa»9\u0004.8þ¶#l\u0095{\u0012\u0013\u000f¹J\u0090û_Üá+\u0010«Î\u009f:\t\u0097ÊJ\u0098¼È\u001b\u001b\u00062ü".length();
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

    public static void l(boolean z) {
        N = z;
    }

    public static boolean t() {
        return N;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean D() {
        return !t();
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 14885;
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
                throw new RuntimeException("su/catlean/rb", e2);
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
            r1 = 3
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
            java.lang.String r1 = "su/catlean/rb"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rb.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 2636;
        if (g[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/rb", e2);
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
            r1 = 3
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
            java.lang.String r1 = "su/catlean/rb"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rb.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
