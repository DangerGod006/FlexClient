package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1922;
import net.minecraft.class_2237;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2269;
import net.minecraft.class_2323;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_2401;
import net.minecraft.class_243;
import net.minecraft.class_2533;
import net.minecraft.class_259;
import net.minecraft.class_2596;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2885;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_7202;
import net.minecraft.class_7204;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gw.class */
public final class gw implements ym {

    @NotNull
    public static final gw Y;

    @NotNull
    private static final Map s;

    @NotNull
    private static final Map y;

    @NotNull
    private static class_243 B;
    private static int[] W;
    private static final long a = yz.a(-7212214856345696819L, 378907001664476378L, MethodHandles.lookup().lookupClass()).a(242930208664616L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    private gw() {
    }

    @NotNull
    public final Map r() {
        return y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Throwable, java.util.NoSuchElementException] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow(priority = 10)
    public final void M(@NotNull PlayerUpdateEvent e2) {
        long j = a ^ 106546504980728L;
        long j2 = j >>> 16;
        int i = (int) (((j ^ 3726227952921L) << 48) >>> 48);
        long j3 = j ^ 9920468344805L;
        Intrinsics.checkNotNullParameter(e2, "e");
        HashMap map = new HashMap(y);
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(991909883609414715L, j) /* invoke-custom */;
        for (Map.Entry entry : map.entrySet()) {
            class_2338 class_2338Var = (class_2338) entry.getKey();
            long jLongValue = ((Number) entry.getValue()).longValue();
            if (_gVarArr != null) {
                return;
            }
            ?? r0 = _gVarArr;
            if (r0 == 0) {
                try {
                    try {
                        if (System.currentTimeMillis() - jLongValue > nf.f(nf.Z, null, j2, 1, (char) i, null) * 2.0f) {
                            gw gwVar = Y;
                            y.remove(class_2338Var);
                        }
                    } catch (NoSuchElementException unused) {
                        r0 = (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 988485862313654427L, j) /* invoke-custom */;
                        throw r0;
                    }
                } catch (NoSuchElementException unused2) {
                    throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 988485862313654427L, j) /* invoke-custom */;
                }
            }
            if (_gVarArr != null) {
                break;
            }
        }
        class_243 class_243VarMethod_33571 = zf.v(j3).method_33571();
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_33571, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21216, 1328081510928694818L ^ j) /* invoke-custom */);
        B = class_243VarMethod_33571;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [net.minecraft.class_3965] */
    public final boolean F(@NotNull class_243 vec, long a2) {
        long j = a ^ a2;
        Object objR = j;
        long j2 = objR ^ 14981004585272L;
        try {
            Intrinsics.checkNotNullParameter(vec, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28439, 4345141161897186118L ^ j) /* invoke-custom */);
            objR = la.R(la.l, B, vec, false, null, false, (int) b(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14419, 564993326201983543L ^ j) /* invoke-custom */, null, j2);
            return objR == 0;
        } catch (NoSuchElementException unused) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objR, -2506837412686288871L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [su.catlean._g[]] */
    @NotNull
    public final class_243 a(short s2, int i, char c2, @NotNull class_1297 class_1297Var) {
        long j = (((((long) s2) << 48) | ((((long) i) << 32) >>> 16)) | ((((long) c2) << 48) >>> 48)) ^ a;
        long j2 = j ^ 77285480964696L;
        Object objAreEqual = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8106118169793560966L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(class_1297Var, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26022, 3252216019195720949L ^ j) /* invoke-custom */);
        try {
            objAreEqual = class_1297Var;
            class_1297 class_1297Var2 = objAreEqual;
            if (objAreEqual == 0) {
                try {
                    objAreEqual = Intrinsics.areEqual((Object) objAreEqual, zf.v(j2));
                    if (objAreEqual != 0) {
                        return B;
                    }
                    class_1297Var2 = class_1297Var;
                } catch (NoSuchElementException unused) {
                    throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, 8073408116335379750L, j) /* invoke-custom */;
                }
            }
            class_243 class_243VarMethod_33571 = class_1297Var2.method_33571();
            Intrinsics.checkNotNullExpressionValue(class_243VarMethod_33571, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24052, 4553834311520079035L ^ j) /* invoke-custom */);
            return class_243VarMethod_33571;
        } catch (NoSuchElementException unused2) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, 8073408116335379750L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [net.minecraft.class_3965] */
    /* JADX WARN: Type inference failed for: r0v23, types: [kotlin.jvm.functions.Function0, su.catlean.t5] */
    /* JADX WARN: Type inference failed for: r0v29, types: [su.catlean.t5] */
    /* JADX WARN: Type inference failed for: r0v8, types: [su.catlean._g[]] */
    @Nullable
    public final t5 O(@NotNull class_2338 bp, int slot, @NotNull xx interact, @NotNull zr mode, int a2, char a3, @NotNull y4 ignore, float range, float wallRange, int priority, @NotNull yi yiVar, @NotNull List calcGhost, boolean grim, char a4) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a;
        long j2 = j ^ 15790279692594L;
        long j3 = j ^ 97621591445599L;
        long j4 = j ^ 105683341439734L;
        int i = (int) (j >>> 48);
        long j5 = ((j ^ 123108548917406L) << 16) >>> 16;
        Object objM = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(294871851346163183L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(bp, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10130, 2905159125879210666L ^ j) /* invoke-custom */);
        try {
            try {
                Intrinsics.checkNotNullParameter(interact, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2482, 3508048592486886585L ^ j) /* invoke-custom */);
                Intrinsics.checkNotNullParameter(mode, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15575, 3842056840219056589L ^ j) /* invoke-custom */);
                Intrinsics.checkNotNullParameter(ignore, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23618, 4512737151387744617L ^ j) /* invoke-custom */);
                Intrinsics.checkNotNullParameter(yiVar, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28991, 4453691463412651063L ^ j) /* invoke-custom */);
                Intrinsics.checkNotNullParameter(calcGhost, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1263, 1414999542191284694L ^ j) /* invoke-custom */);
                if (objM != 0) {
                    return null;
                }
                objM = m(bp, j3, slot, interact, ignore, range, wallRange, calcGhost);
                if (objM == 0) {
                    return null;
                }
                ty tyVar = () -> {
                    return L(r0, r1, r2, r3, r4);
                };
                try {
                    if (interact != xx.GRIM) {
                        ye yeVar = _w.W;
                        class_243 class_243VarMethod_17784 = objM.method_17784();
                        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_17784, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6982, 5431717784653463119L ^ j) /* invoke-custom */);
                        return new t5(yeVar.I(class_243VarMethod_17784, j2).b(grim), j4, priority, tyVar);
                    }
                    ye yeVar2 = _w.W;
                    class_243 class_243VarMethod_177842 = objM.method_17784();
                    Intrinsics.checkNotNullExpressionValue(class_243VarMethod_177842, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(923, 6953640354163320452L ^ j) /* invoke-custom */);
                    tyVar = new ty((short) i, yeVar2.I(class_243VarMethod_177842, j2).b(grim), priority, tyVar, j5);
                    return tyVar;
                } catch (NoSuchElementException unused) {
                    throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(tyVar, 316287773003772239L, j) /* invoke-custom */;
                }
            } catch (NoSuchElementException unused2) {
                throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objM, 316287773003772239L, j) /* invoke-custom */;
            }
        } catch (NoSuchElementException unused3) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objM, 316287773003772239L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v0, types: [su.catlean.gw] */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public static t5 P(gw gwVar, class_2338 class_2338Var, int i, xx xxVar, zr zrVar, y4 y4Var, float f2, float f3, int i2, long j, yi yiVar, List list, boolean z, int i3, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 110144670419690L;
        int i4 = (int) (j2 >>> 32);
        int i5 = (int) ((j3 << 32) >>> 48);
        int i6 = (int) ((j3 << 48) >>> 48);
        ?? O = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7309438018128155785L, j2) /* invoke-custom */;
        try {
            O = i3 & (int) b(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12948, 7674558475904950077L ^ j2) /* invoke-custom */;
            ?? O2 = O;
            if (O == 0) {
                if (O != 0) {
                    list = new ArrayList();
                }
                O2 = i3 & (int) b(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5849, 3361009165303987060L ^ j2) /* invoke-custom */;
            }
            ?? r29 = z;
            ?? r0 = O2;
            if (O != 0) {
                r29 = r0;
            } else if (O2 != 0) {
                r0 = 0;
                r29 = r0;
            }
            return gwVar.O(class_2338Var, i, xxVar, zrVar, i4, (char) i5, y4Var, f2, f3, i2, yiVar, list, r29, (char) i6);
        } catch (NoSuchElementException unused) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(O, -7279049866973286441L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [net.minecraft.class_3965] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    public final boolean x(@NotNull class_2338 bp, @NotNull xx interact, long a2, @NotNull y4 ignore, float range, float wallRange) {
        long j = a ^ a2;
        long j2 = j ^ 67633042807993L;
        Object objContainsKey = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(706743995165308982L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(bp, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10130, 2905227876885057395L ^ j) /* invoke-custom */);
        try {
            Intrinsics.checkNotNullParameter(interact, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31439, 2457503219419943464L ^ j) /* invoke-custom */);
            Intrinsics.checkNotNullParameter(ignore, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17589, 7034935762847247433L ^ j) /* invoke-custom */);
            objContainsKey = y.containsKey(bp);
            if (objContainsKey != 0) {
                return objContainsKey;
            }
            if (objContainsKey != 0) {
                return false;
            }
            try {
                objContainsKey = j(this, bp, -1, j2, interact, ignore, range, wallRange, null, (int) b(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12848, 3624898128719973594L ^ j) /* invoke-custom */, null);
                return objContainsKey != 0;
            } catch (NoSuchElementException unused) {
                throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContainsKey, 701133845347990678L, j) /* invoke-custom */;
            }
        } catch (NoSuchElementException unused2) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContainsKey, 701133845347990678L, j) /* invoke-custom */;
        }
    }

    public final void y(@NotNull class_7204 packetCreator, int a2, int a3, char a4) throws Exception {
        long j = (((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a;
        long j2 = j ^ 17941672860198L;
        Intrinsics.checkNotNullParameter(packetCreator, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3337, 1741705163685635107L ^ j) /* invoke-custom */);
        class_7202 class_7202Var = (AutoCloseable) zf.z(j ^ 20093218366593L).method_41925().method_41937();
        Throwable th = null;
        try {
            try {
                zf.v(j2).field_3944.method_52787(packetCreator.predict(class_7202Var.method_41942()));
                Unit unit = Unit.INSTANCE;
                AutoCloseableKt.closeFinally(class_7202Var, null);
            } finally {
            }
        } catch (Throwable th2) {
            AutoCloseableKt.closeFinally(class_7202Var, th);
            throw th2;
        }
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
    public final net.minecraft.class_3965 m(@org.jetbrains.annotations.NotNull net.minecraft.class_2338 r11, long r12, int r14, @org.jetbrains.annotations.NotNull su.catlean.xx r15, @org.jetbrains.annotations.NotNull su.catlean.y4 r16, float r17, float r18, @org.jetbrains.annotations.NotNull java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 1726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gw.m(net.minecraft.class_2338, long, int, su.catlean.xx, su.catlean.y4, float, float, java.util.List):net.minecraft.class_3965");
    }

    public static class_3965 j(gw gwVar, class_2338 class_2338Var, int i, long j, xx xxVar, y4 y4Var, float f2, float f3, List list, int i2, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 125711503709517L;
        if ((i2 & (int) b(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1398, 4948250231950455632L ^ j2) /* invoke-custom */) != 0) {
            list = new ArrayList();
        }
        return gwVar.m(class_2338Var, j3, i, xxVar, y4Var, f2, f3, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0155 A[EXC_TOP_SPLITTER, PHI: r0
  0x0155: PHI (r0v60 ??) = (r0v49 ??), (r0v53 ??), (r0v48 ??) binds: [B:25:0x012c, B:32:0x0152, B:14:0x00f6] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018e A[EDGE_INSN: B:60:0x018e->B:45:0x018e BREAK  A[LOOP:0: B:3:0x0074->B:61:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[LOOP:0: B:3:0x0074->B:61:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Throwable, java.util.NoSuchElementException] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Throwable, java.util.NoSuchElementException] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [su.catlean.zl] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List h(long r9, @org.jetbrains.annotations.NotNull net.minecraft.class_2338 r11, @org.jetbrains.annotations.NotNull java.util.List r12) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gw.h(long, net.minecraft.class_2338, java.util.List):java.util.List");
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [int, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v32 ??, still in use, count: 2, list:
          (r0v32 ?? I:java.lang.Object) from 0x00d9: INVOKE_CUSTOM (r0v32 ?? I:java.lang.Object), (8908571832165600909L long), (r0v1 long)
         A[Catch: NoSuchElementException -> 0x00ed, MD:(java.lang.Object, long, long):java.util.NoSuchElementException (s), WRAPPED] call-site: 
          {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
          {STRING: "ￃﾅ"}
          {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/util/NoSuchElementException;}
        
          (r0v32 ?? I:java.lang.Object) from 0x00f1: INVOKE_CUSTOM (r0v32 ?? I:java.lang.Object), (8908571832165600909L long), (r0v1 long)
         A[MD:(java.lang.Object, long, long):java.util.NoSuchElementException (s), WRAPPED] call-site: 
          {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
          {STRING: "ￃﾅ"}
          {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/util/NoSuchElementException;}
        
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyIf(SimplifyVisitor.java:298)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:138)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    @org.jetbrains.annotations.Nullable
    public final su.catlean.zl u(long r9, @org.jetbrains.annotations.NotNull net.minecraft.class_2338 r11) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gw.u(long, net.minecraft.class_2338):su.catlean.zl");
    }

    public final float C(@NotNull class_243 vec, long a2) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(vec, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5353, 219366020439141280L ^ j) /* invoke-custom */);
        return (float) vec.method_1025(zf.v(j ^ 69882563218541L).method_33571());
    }

    public final float w(long a2, @NotNull class_243 vec) {
        long j = a ^ a2;
        long j2 = j ^ 127881067760341L;
        Intrinsics.checkNotNullParameter(vec, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28439, 4345223318990968564L ^ j) /* invoke-custom */);
        double dMethod_23317 = vec.field_1352 - zf.v(j2).method_23317();
        double dMethod_23321 = vec.field_1350 - zf.v(j2).method_23321();
        return (float) ((dMethod_23317 * dMethod_23317) + (dMethod_23321 * dMethod_23321));
    }

    @NotNull
    public final cg v(@NotNull class_2338 bp, long a2) {
        long j = a ^ a2;
        long j2 = j ^ 66628158144714L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j2 << 16) >>> 32);
        int i3 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 50878180931296L;
        Intrinsics.checkNotNullParameter(bp, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10130, 2905232149418058363L ^ j) /* invoke-custom */);
        class_243 class_243VarMethod_46558 = bp.method_46558();
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_46558, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17942, 8350769971604964313L ^ j) /* invoke-custom */);
        return new cg(a((short) i, i2, (char) i3, (class_1297) zf.v(j3)).field_1352 - class_243VarMethod_46558.method_1031(0.5d, 0.0d, 0.0d).field_1352, a((short) i, i2, (char) i3, (class_1297) zf.v(j3)).field_1352 - class_243VarMethod_46558.method_1031(-0.5d, 0.0d, 0.0d).field_1352, a((short) i, i2, (char) i3, (class_1297) zf.v(j3)).field_1350 - class_243VarMethod_46558.method_1031(0.0d, 0.0d, 0.5d).field_1350, a((short) i, i2, (char) i3, (class_1297) zf.v(j3)).field_1350 - class_243VarMethod_46558.method_1031(0.0d, 0.0d, -0.5d).field_1350, a((short) i, i2, (char) i3, (class_1297) zf.v(j3)).field_1351 - class_243VarMethod_46558.method_1031(0.0d, 0.5d, 0.0d).field_1351, a((short) i, i2, (char) i3, (class_1297) zf.v(j3)).field_1351 - class_243VarMethod_46558.method_1031(0.0d, -0.5d, 0.0d).field_1351);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    public final boolean B(@NotNull class_2338 bp, long a2) {
        long j = a ^ a2;
        long j2 = j ^ 7968300853660L;
        Object objMethod_45474 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(368720009466344677L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(bp, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10130, 2905206944709854112L ^ j) /* invoke-custom */);
        try {
            try {
                try {
                    objMethod_45474 = zf.z(j2).method_8320(bp).method_45474();
                    if (objMethod_45474 != 0) {
                        return objMethod_45474;
                    }
                    if (objMethod_45474 != 0) {
                        boolean zContainsKey = y.containsKey(bp);
                        if (objMethod_45474 != 0) {
                            return zContainsKey;
                        }
                        if (!zContainsKey) {
                            return false;
                        }
                    }
                    return true;
                } catch (NoSuchElementException unused) {
                    throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_45474, 390056741055656005L, j) /* invoke-custom */;
                }
            } catch (NoSuchElementException unused2) {
                throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_45474, 390056741055656005L, j) /* invoke-custom */;
            }
        } catch (NoSuchElementException unused3) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_45474, 390056741055656005L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:87:0x0221
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @org.jetbrains.annotations.NotNull
    public final java.util.List M(int r9, @org.jetbrains.annotations.NotNull net.minecraft.class_2338 r10, int r11) {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gw.M(int, net.minecraft.class_2338, int):java.util.List");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:47:0x0168
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @org.jetbrains.annotations.Nullable
    public final su.catlean.dl z(@org.jetbrains.annotations.NotNull net.minecraft.class_2338 r13, long r14, @org.jetbrains.annotations.NotNull su.catlean.xx r16) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gw.z(net.minecraft.class_2338, long, su.catlean.xx):su.catlean.dl");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:56:0x0187
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @org.jetbrains.annotations.Nullable
    public final net.minecraft.class_243 R(@org.jetbrains.annotations.NotNull net.minecraft.class_2350 r12, @org.jetbrains.annotations.NotNull net.minecraft.class_2338 r13, float r14, int r15, char r16, float r17, int r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 1156
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gw.R(net.minecraft.class_2350, net.minecraft.class_2338, float, int, char, float, int, boolean):net.minecraft.class_243");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v14, types: [net.minecraft.class_238] */
    @NotNull
    public final class_238 J(long a2, @NotNull class_2350 dir) {
        Object class_238Var = a ^ a2;
        try {
            Intrinsics.checkNotNullParameter(dir, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1128, 676506377395755570L ^ class_238Var) /* invoke-custom */);
            switch (rp.c[dir.ordinal()]) {
                case 1:
                    class_238Var = new class_238(0.15d, 0.0d, 0.15d, 0.85d, 0.0d, 0.85d);
                    return class_238Var;
                case 2:
                    return new class_238(0.15d, 1.0d, 0.15d, 0.85d, 1.0d, 0.85d);
                case 3:
                    return new class_238(0.15d, 0.15d, 0.0d, 0.85d, 0.85d, 0.0d);
                case 4:
                    return new class_238(0.15d, 0.15d, 1.0d, 0.85d, 0.85d, 1.0d);
                case AbstractJsonLexerKt.TC_COLON /* 5 */:
                    return new class_238(0.0d, 0.15d, 0.15d, 0.0d, 0.85d, 0.85d);
                case AbstractJsonLexerKt.TC_BEGIN_OBJ /* 6 */:
                    return new class_238(1.0d, 0.15d, 0.15d, 1.0d, 0.85d, 0.85d);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (NoSuchElementException unused) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_238Var, 4541289395744295465L, class_238Var) /* invoke-custom */;
        }
        throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_238Var, 4541289395744295465L, class_238Var) /* invoke-custom */;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014c A[PHI: r0
  0x014c: PHI (r0v18 ??) = (r0v40 ??), (r0v41 ??), (r0v42 ??) binds: [B:34:0x0144, B:14:0x00f5, B:21:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v10, types: [float] */
    /* JADX WARN: Type inference failed for: r0v13, types: [net.minecraft.class_3965] */
    /* JADX WARN: Type inference failed for: r0v16, types: [net.minecraft.class_239$class_240] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [net.minecraft.class_3965] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Throwable, java.util.NoSuchElementException] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(@org.jetbrains.annotations.NotNull net.minecraft.class_243 r10, @org.jetbrains.annotations.NotNull net.minecraft.class_2338 r11, long r12, float r14, float r15) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gw.f(net.minecraft.class_243, net.minecraft.class_2338, long, float, float):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    public final boolean D(@NotNull class_2248 b2, long a2) {
        long j = a ^ a2;
        Object objAreEqual = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3414322046254243483L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(b2, "b");
        try {
            try {
                try {
                    try {
                        objAreEqual = b2 instanceof class_2237;
                        if (objAreEqual != 0) {
                            return objAreEqual;
                        }
                        if (objAreEqual == 0) {
                            try {
                                objAreEqual = Intrinsics.areEqual(b2, class_2246.field_9980);
                                if (objAreEqual != 0) {
                                    return objAreEqual;
                                }
                                try {
                                    if (objAreEqual == 0) {
                                        try {
                                            try {
                                                objAreEqual = b2 instanceof class_2533;
                                                if (objAreEqual != 0) {
                                                    return objAreEqual;
                                                }
                                                if (objAreEqual == 0) {
                                                    try {
                                                        objAreEqual = b2 instanceof class_2401;
                                                        if (objAreEqual != 0) {
                                                            return objAreEqual;
                                                        }
                                                        try {
                                                            if (objAreEqual == 0) {
                                                                try {
                                                                    boolean z = b2 instanceof class_2269;
                                                                    if (objAreEqual != 0) {
                                                                        return z;
                                                                    }
                                                                    if (!z) {
                                                                        boolean z2 = b2 instanceof class_2323;
                                                                        if (objAreEqual != 0) {
                                                                            return z2;
                                                                        }
                                                                        if (!z2) {
                                                                            return false;
                                                                        }
                                                                    }
                                                                } catch (NoSuchElementException unused) {
                                                                    throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -3392949537152391739L, j) /* invoke-custom */;
                                                                }
                                                            }
                                                        } catch (NoSuchElementException unused2) {
                                                            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -3392949537152391739L, j) /* invoke-custom */;
                                                        }
                                                    } catch (NoSuchElementException unused3) {
                                                        throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -3392949537152391739L, j) /* invoke-custom */;
                                                    }
                                                }
                                            } catch (NoSuchElementException unused4) {
                                                throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -3392949537152391739L, j) /* invoke-custom */;
                                            }
                                        } catch (NoSuchElementException unused5) {
                                            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -3392949537152391739L, j) /* invoke-custom */;
                                        }
                                    }
                                } catch (NoSuchElementException unused6) {
                                    throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -3392949537152391739L, j) /* invoke-custom */;
                                }
                            } catch (NoSuchElementException unused7) {
                                throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -3392949537152391739L, j) /* invoke-custom */;
                            }
                        }
                        return true;
                    } catch (NoSuchElementException unused8) {
                        throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -3392949537152391739L, j) /* invoke-custom */;
                    }
                } catch (NoSuchElementException unused9) {
                    throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -3392949537152391739L, j) /* invoke-custom */;
                }
            } catch (NoSuchElementException unused10) {
                throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -3392949537152391739L, j) /* invoke-custom */;
            }
        } catch (NoSuchElementException unused11) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -3392949537152391739L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [float] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean, int] */
    public final boolean O(@NotNull class_243 pos, int fov, long a2) {
        long j = a ^ a2;
        long j2 = j ^ 107936635004176L;
        Intrinsics.checkNotNullParameter(pos, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16388, 375491243225470474L ^ j) /* invoke-custom */);
        double dMethod_10216 = pos.method_10216() - zf.v(j2).method_23317();
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8590215962161612494L, j) /* invoke-custom */;
        Object objMethod_15393 = class_3532.method_15393(((float) class_3532.method_15338(Math.toDegrees(Math.atan2(pos.method_10215() - zf.v(j2).method_23321(), dMethod_10216)) - 90.0d)) - class_3532.method_15393(zf.v(j2).method_36454()));
        try {
            objMethod_15393 = (Math.abs((double) objMethod_15393) > fov ? 1 : (Math.abs((double) objMethod_15393) == fov ? 0 : -1));
            return _gVarArr == null ? objMethod_15393 <= 0 : objMethod_15393;
        } catch (NoSuchElementException unused) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_15393, 8593613045421769326L, j) /* invoke-custom */;
        }
    }

    @NotNull
    public final class_3965 A(long a2, @NotNull class_3959 context, @NotNull class_2338 block, @NotNull class_2680 state) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(context, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16005, 2806672340575867288L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(block, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26219, 3172294206091102536L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(state, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13676, 3882433583002114669L ^ j) /* invoke-custom */);
        Object objMethod_17744 = class_1922.method_17744(context.method_17750(), context.method_17747(), context, (v2, v3) -> {
            return l(r3, r4, v2, v3);
        }, gw::n);
        Intrinsics.checkNotNullExpressionValue(objMethod_17744, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1265, 143164574390283247L ^ j) /* invoke-custom */);
        return (class_3965) objMethod_17744;
    }

    public static class_3965 q(gw gwVar, class_3959 class_3959Var, class_2338 class_2338Var, class_2680 class_2680Var, int i, long j, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 41519268577576L;
        if ((i & 4) != 0) {
            class_2680 class_2680VarMethod_9564 = class_2246.field_10540.method_9564();
            Intrinsics.checkNotNullExpressionValue(class_2680VarMethod_9564, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25888, 7396857008753516399L ^ j2) /* invoke-custom */);
            class_2680Var = class_2680VarMethod_9564;
        }
        return gwVar.A(j3, class_3959Var, class_2338Var, class_2680Var);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x006e: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_1297) STATIC call: su.catlean.p4.K(long, net.minecraft.class_1297):net.minecraft.class_243
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final boolean s(@org.jetbrains.annotations.NotNull net.minecraft.class_1297 r11, @org.jetbrains.annotations.NotNull su.catlean._w r12, float r13, boolean r14, long r15) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gw.s(net.minecraft.class_1297, su.catlean._w, float, boolean, long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [net.minecraft.class_239] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private final class_239 D(class_239 class_239Var, class_243 class_243Var, long j, float f2) {
        long j2 = a ^ j;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1308605540541457362L, j2) /* invoke-custom */;
        Object objMethod_24802 = class_239Var;
        if (_gVarArr != null) {
            return objMethod_24802;
        }
        try {
            objMethod_24802 = objMethod_24802.method_17784().method_24802((class_2374) class_243Var, f2);
            if (objMethod_24802 != 0) {
                return class_239Var;
            }
            class_2374 class_2374VarMethod_17784 = class_239Var.method_17784();
            Intrinsics.checkNotNullExpressionValue(class_2374VarMethod_17784, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6982, 5431667536836171662L ^ j2) /* invoke-custom */);
            class_239 class_239VarMethod_17778 = class_3965.method_17778(class_2374VarMethod_17784, class_2350.method_10142(((class_243) class_2374VarMethod_17784).field_1352 - class_243Var.field_1352, ((class_243) class_2374VarMethod_17784).field_1351 - class_243Var.field_1351, ((class_243) class_2374VarMethod_17784).field_1350 - class_243Var.field_1350), class_2338.method_49638(class_2374VarMethod_17784));
            Intrinsics.checkNotNullExpressionValue(class_239VarMethod_17778, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3103, 3419685512000962789L ^ j2) /* invoke-custom */);
            return class_239VarMethod_17778;
        } catch (NoSuchElementException unused) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_24802, -1323266236168759154L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r49v0, types: [java.lang.Iterable] */
    @NotNull
    public final List c(long j) {
        ArrayList arrayList;
        ?? Add;
        long j2 = a ^ j;
        long j3 = j2 ^ 45831227871323L;
        class_2338 class_2338VarMethod_49638 = class_2338.method_49638(zf.v(j3).method_33571());
        Intrinsics.checkNotNullExpressionValue(class_2338VarMethod_49638, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8330, 754863377121608647L ^ j2) /* invoke-custom */);
        int iCeil = (int) Math.ceil(zf.v(j3).method_55754());
        IntRange intRange = new IntRange(class_2338VarMethod_49638.method_10263() - iCeil, class_2338VarMethod_49638.method_10263() + iCeil);
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4791223500558807941L, j2) /* invoke-custom */;
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it = intRange.iterator();
        loop0: do {
            Iterator<Integer> it2 = it;
            while (it2.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                IntRange intRange2 = new IntRange(class_2338VarMethod_49638.method_10264() - iCeil, class_2338VarMethod_49638.method_10264() + iCeil);
                ArrayList arrayList3 = new ArrayList();
                if (j2 <= 0) {
                    return arrayList3;
                }
                arrayList = arrayList3;
                if (_gVarArr != null) {
                    break loop0;
                }
                Iterator<Integer> it3 = intRange2.iterator();
                while (it3.hasNext()) {
                    int iNextInt2 = ((IntIterator) it3).nextInt();
                    IntRange intRange3 = new IntRange(class_2338VarMethod_49638.method_10260() - iCeil, class_2338VarMethod_49638.method_10260() + iCeil);
                    ArrayList arrayList4 = new ArrayList();
                    it2 = intRange3.iterator();
                    if (_gVarArr == null) {
                        while (it2.hasNext()) {
                            class_2338 class_2338Var = new class_2338(iNextInt, iNextInt2, ((IntIterator) it2).nextInt());
                            Add = arrayList4;
                            if (j2 < 0) {
                                break;
                            }
                            try {
                                Add = Add.add(class_2338Var);
                                while (_gVarArr == null) {
                                    if (_gVarArr != null) {
                                        if (j2 >= 0) {
                                            break;
                                        }
                                    }
                                }
                                break;
                            } catch (NoSuchElementException unused) {
                                throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Add, 4758596219607988005L, j2) /* invoke-custom */;
                            }
                        }
                        Add = arrayList4;
                        CollectionsKt.addAll(arrayList, (Iterable) Add);
                        if (_gVarArr != null) {
                            break;
                        }
                    }
                }
                CollectionsKt.addAll(arrayList2, arrayList);
                if (j2 < 0) {
                    break;
                }
            }
            break loop0;
        } while (_gVarArr == null);
        arrayList = arrayList2;
        if (j2 >= 0) {
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v13, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int[]] */
    /* JADX WARN: Type inference failed for: r22v0 */
    @NotNull
    public final _w r(@NotNull class_2350 class_2350Var, long j) {
        ?? r0;
        float f2;
        long j2 = a ^ j;
        ?? r02 = j2;
        long j3 = r02 ^ 138531055625411L;
        long j4 = r02 ^ 131236172768691L;
        try {
            Intrinsics.checkNotNullParameter(class_2350Var, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16206, 7807421700016077677L ^ j2) /* invoke-custom */);
            r02 = rp.c[class_2350Var.ordinal()];
            switch (r02) {
                case 3:
                    r0 = 1127481344;
                    break;
                case 4:
                    r0 = 0;
                    break;
                case AbstractJsonLexerKt.TC_COLON /* 5 */:
                    r0 = 1119092736;
                    break;
                case AbstractJsonLexerKt.TC_BEGIN_OBJ /* 6 */:
                    r0 = -1028390912;
                    break;
                default:
                    r0 = 0;
                    break;
            }
            ?? r22 = r0;
            try {
                r0 = rp.c[class_2350Var.ordinal()];
                switch (r0) {
                    case 1:
                        f2 = 88.0f;
                        break;
                    case 2:
                        f2 = -88.0f;
                        break;
                    default:
                        f2 = -10.0f;
                        break;
                }
                return new _w((r22 == true ? 1.0f : 0.0f) + (((int) (dm.h.U(j3) / 360.0f)) * (int) b(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7429, 8600354416475475741L ^ j2) /* invoke-custom */), j4, f2, false, null, (int) b(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12363, 258377955347210842L ^ j2) /* invoke-custom */, null);
            } catch (NoSuchElementException unused) {
                throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6538465091004739474L, j2) /* invoke-custom */;
            }
        } catch (NoSuchElementException unused2) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -6538465091004739474L, j2) /* invoke-custom */;
        }
    }

    private static final class_2596 m(class_3965 class_3965Var, int i) {
        return new class_2885(class_1268.field_5808, class_3965Var, i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x020e: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final kotlin.Unit L(int r9, su.catlean.yi r10, net.minecraft.class_3965 r11, su.catlean.zr r12, net.minecraft.class_2338 r13) {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gw.L(int, su.catlean.yi, net.minecraft.class_3965, su.catlean.zr, net.minecraft.class_2338):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean M(su.catlean.zl r8) {
        /*
            long r0 = su.catlean.gw.a
            r1 = 46469442371265(0x2a43829afec1, double:2.29589550570416E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = 3169041466575215106(0x2bfab26c6db2da02, double:7.811659943039233E-97)
            r1 = r9
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r1 = r8
            r2 = 13641(0x3549, float:1.9115E-41)
            r3 = 1201211687385825213(0x10ab8faa56adffbd, double:2.272329520704995E-228)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/gw;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "e"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r11 = r0
            r0 = r8
            net.minecraft.class_2350 r0 = r0.p()     // Catch: java.util.NoSuchElementException -> L34
            net.minecraft.class_2350 r1 = net.minecraft.class_2350.field_11036     // Catch: java.util.NoSuchElementException -> L34
            r2 = r11
            if (r2 != 0) goto L52
            if (r0 == r1) goto L55
            goto L3e
        L34:
            r1 = 3138591140232388258(0x2b8e840358bd5ea2, double:6.975806595902333E-99)
            r2 = r9
            java.util.NoSuchElementException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/util/NoSuchElementException;}
            ).invoke(r0, r1, r2)     // Catch: java.util.NoSuchElementException -> L48
            throw r0     // Catch: java.util.NoSuchElementException -> L48
        L3e:
            r0 = r8
            net.minecraft.class_2350 r0 = r0.p()     // Catch: java.util.NoSuchElementException -> L48
            net.minecraft.class_2350 r1 = net.minecraft.class_2350.field_11033     // Catch: java.util.NoSuchElementException -> L48
            goto L52
        L48:
            r1 = 3138591140232388258(0x2b8e840358bd5ea2, double:6.975806595902333E-99)
            r2 = r9
            java.util.NoSuchElementException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/util/NoSuchElementException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            if (r0 != r1) goto L63
        L55:
            r0 = 1
            goto L64
        L59:
            r1 = 3138591140232388258(0x2b8e840358bd5ea2, double:6.975806595902333E-99)
            r2 = r9
            java.util.NoSuchElementException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/util/NoSuchElementException;}
            ).invoke(r0, r1, r2)
            throw r0
        L63:
            r0 = 0
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gw.M(su.catlean.zl):boolean");
    }

    private static final boolean l(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    private static final boolean E(ArrayList arrayList, zl s2) {
        long j = a ^ 80579609801103L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7256655137902204236L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(s2, "s");
        ArrayList arrayList2 = arrayList;
        ?? r0 = 0;
        r0 = 0;
        r0 = 0;
        r0 = 0;
        r0 = 0;
        try {
            try {
                try {
                    r0 = arrayList2;
                    ?? r02 = r0;
                    if (_gVarArr == null) {
                        try {
                            r0 = r0 instanceof Collection;
                            if (r0 != 0) {
                                ArrayList arrayList3 = arrayList2;
                                r02 = arrayList3;
                                if (_gVarArr == null) {
                                    if (arrayList3.isEmpty()) {
                                        return false;
                                    }
                                    r02 = arrayList2;
                                }
                            } else {
                                r02 = arrayList2;
                            }
                        } catch (NoSuchElementException unused) {
                            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 7260056628335153644L, j) /* invoke-custom */;
                        }
                    }
                    Iterator it = r02.iterator();
                    while (it.hasNext()) {
                        int i = (((class_1297) it.next()).method_5707(s2.v().method_46558().method_43206(s2.p(), 0.5d)) > 0.5d ? 1 : (((class_1297) it.next()).method_5707(s2.v().method_46558().method_43206(s2.p(), 0.5d)) == 0.5d ? 0 : -1));
                        do {
                            if (_gVarArr == null) {
                                i = i < 0 ? 1 : 0;
                            }
                            if (i != 0) {
                                i = 1;
                            }
                        } while (_gVarArr != null);
                        return true;
                    }
                    return false;
                } catch (NoSuchElementException unused2) {
                    throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 7260056628335153644L, j) /* invoke-custom */;
                }
            } catch (NoSuchElementException unused3) {
                throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 7260056628335153644L, j) /* invoke-custom */;
            }
        } catch (NoSuchElementException unused4) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 7260056628335153644L, j) /* invoke-custom */;
        }
    }

    private static final boolean W(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [net.minecraft.class_2680] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, net.minecraft.class_2680] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    private static final class_3965 l(class_2338 class_2338Var, class_2680 class_2680Var, class_3959 class_3959Var, class_2338 class_2338Var2) {
        ?? r0;
        long j = a ^ 137607223514716L;
        ?? Method_9564 = j;
        long j2 = Method_9564 ^ 25093898579942L;
        try {
            Intrinsics.checkNotNullParameter(class_3959Var, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22738, 8381547564901300918L ^ j) /* invoke-custom */);
            Intrinsics.checkNotNullParameter(class_2338Var2, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7479, 7093316094522802031L ^ j) /* invoke-custom */);
            if (class_2338Var2.equals(class_2338Var)) {
                r0 = class_2680Var;
            } else {
                Method_9564 = class_2246.field_10124.method_9564();
                r0 = Method_9564;
            }
            ?? r17 = r0;
            Intrinsics.checkNotNull(r17);
            class_243 class_243VarMethod_17750 = class_3959Var.method_17750();
            Intrinsics.checkNotNullExpressionValue(class_243VarMethod_17750, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26935, 7635303587329592135L ^ j) /* invoke-custom */);
            class_243 class_243VarMethod_17747 = class_3959Var.method_17747();
            Intrinsics.checkNotNullExpressionValue(class_243VarMethod_17747, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11523, 1001735136193253232L ^ j) /* invoke-custom */);
            class_265 class_265VarMethod_17748 = class_3959Var.method_17748((class_2680) r17, zf.z(j2), class_2338Var2);
            Intrinsics.checkNotNullExpressionValue(class_265VarMethod_17748, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6601, 8268883593354034054L ^ j) /* invoke-custom */);
            class_3965 class_3965VarMethod_17745 = zf.z(j2).method_17745(class_243VarMethod_17750, class_243VarMethod_17747, class_2338Var2, class_265VarMethod_17748, (class_2680) r17);
            class_265 class_265VarMethod_1073 = class_259.method_1073();
            Intrinsics.checkNotNullExpressionValue(class_265VarMethod_1073, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23163, 6136658343110735912L ^ j) /* invoke-custom */);
            class_3965 class_3965VarMethod_1092 = class_265VarMethod_1073.method_1092(class_243VarMethod_17750, class_243VarMethod_17747, class_2338Var2);
            return (class_3965VarMethod_17745 == null ? Double.MAX_VALUE : class_3959Var.method_17750().method_1025(class_3965VarMethod_17745.method_17784())) <= (class_3965VarMethod_1092 == null ? Double.MAX_VALUE : class_3959Var.method_17750().method_1025(class_3965VarMethod_1092.method_17784())) ? class_3965VarMethod_17745 : class_3965VarMethod_1092;
        } catch (NoSuchElementException unused) {
            throw (NoSuchElementException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoSuchElementException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_9564, -4389932768267946433L, j) /* invoke-custom */;
        }
    }

    private static final class_3965 n(class_3959 class_3959Var) {
        long j = a ^ 89735111973246L;
        Intrinsics.checkNotNullParameter(class_3959Var, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13641, 1201322507920873474L ^ j) /* invoke-custom */);
        class_243 class_243VarMethod_1020 = class_3959Var.method_17750().method_1020(class_3959Var.method_17747());
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1020, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22762, 8368835049018422698L ^ j) /* invoke-custom */);
        return class_3965.method_17778(class_3959Var.method_17747(), class_2350.method_10142(class_243VarMethod_1020.field_1352, class_243VarMethod_1020.field_1351, class_243VarMethod_1020.field_1350), class_2338.method_49638(class_3959Var.method_17747()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean t(net.minecraft.class_1297 r8, net.minecraft.class_1297 r9) {
        /*
            long r0 = su.catlean.gw.a
            r1 = 35410045445923(0x20348b2e2723, double:1.7494886972508E-310)
            long r0 = r0 ^ r1
            r10 = r0
            r0 = -1001848489308191776(0xf218b81b640603e0, double:-4.120694216346112E241)
            r1 = r10
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r1 = r9
            r2 = 15152(0x3b30, float:2.1232E-41)
            r3 = 5974810579702392880(0x52eaca90fb682830, double:2.7287395259459518E91)
            r4 = r10
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/gw;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "e"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r12 = r0
            r0 = r9
            boolean r0 = r0.method_5863()     // Catch: java.util.NoSuchElementException -> L33
            r1 = r12
            if (r1 != 0) goto L4f
            if (r0 == 0) goto L68
            goto L3d
        L33:
            r1 = -978250388819310784(0xf26c8e7451098740, double:-1.523319224799703E243)
            r2 = r10
            java.util.NoSuchElementException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/util/NoSuchElementException;}
            ).invoke(r0, r1, r2)     // Catch: java.util.NoSuchElementException -> L45
            throw r0     // Catch: java.util.NoSuchElementException -> L45
        L3d:
            r0 = r9
            r1 = r8
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.util.NoSuchElementException -> L45
            goto L4f
        L45:
            r1 = -978250388819310784(0xf26c8e7451098740, double:-1.523319224799703E243)
            r2 = r10
            java.util.NoSuchElementException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/util/NoSuchElementException;}
            ).invoke(r0, r1, r2)
            throw r0
        L4f:
            r1 = r12
            if (r1 != 0) goto L65
            if (r0 == 0) goto L68
            goto L64
        L5a:
            r1 = -978250388819310784(0xf26c8e7451098740, double:-1.523319224799703E243)
            r2 = r10
            java.util.NoSuchElementException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/util/NoSuchElementException;}
            ).invoke(r0, r1, r2)
            throw r0
        L64:
            r0 = 1
        L65:
            goto L69
        L68:
            r0 = 0
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gw.t(net.minecraft.class_1297, net.minecraft.class_1297):boolean");
    }

    static {
        int i;
        long j = a ^ 58458194141647L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[2], -5404662761471353252L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[56];
        int i3 = 0;
        String str = "ûg|\u0019 ÖÜ'\\Þ\u0011\u0096A0µ!Ñ¯\u0013§ÌRJ9\u0088!]Vv÷w\u0093\u0010\u000fÌ0\u0091ë\u0083ßÅ ýCÛ;ÄÛÑ\u0010<í\u009bç\fjDú´µ\u0010h\u0096uæ4 \u009dS?4\f\u009a\u0099xìmE\u0017%©»é³\u001bImºHlâZô»àÍ´áÎ(\"Ö\bgª¹4\u0015\u0018CbN;!QlÑ\u0082ùu_cl¸ñ±YÛªFN\u0019\u0005ò»\u0000H\"H-\u0010\f°¬îM\u0093½\u009b\b\u0004)üâ\u001c6ò\u0018Î\u009d\u000fè¯º]LD\u009d\u007f¢\u007f´Ó[mÚ5\n\u0085+$\u009a \u009e\u008eò\\\u000eáÆÐýG®\u000e}&?\u009e¡Ð\u001fÊ\u0001$ \u008eÔ\u0080»qØÍSõ\u0018o7\u0015I\u008ex¡\u0006q\u008e½6Îôþ\u0019\u009c2¡\u0010&ALª(äÚ¦ ô\u0012a,ªî¶\u0084öµ\rA\nÒÿ\u0016æ\u008bÝ\u00148\u009dEàè$½©\u0092ÖD\u008d\u0000\u0082§\n\u0010¤ E)\u0001;\u0084i7¿\u008cÔ»79¦\u0010\u008fæ&\u0006,ÆsÎ9²Ý_\"Ê\u0083Ñ ¦\rFþ\u0090l\\#Y{\u0018\u0094¦4H\u0091±\u009f7]û´Ó)ó]\u0013\u0010Ç²-·\u0018\u0081\u008an)\u0019ÜÈ\u008c\nh¶%,6Êq\u00004}\u009b/ÉÅ¼ \u0093öª«S\"\u0099x\u0017\u007f4\u0088\u001a \u0015pú\n{\u001e\u00ad2¾ÐIÐ:ÝU\u008f©ø ùsÏ~\u008cL¯t\u008b»ý{)¨x\u0014\\ÐN\u0005{z!Óf}(\u00ad\u0010\u0014Y\u0098\u0010\u0091\\ZEçý]jóÜf\u000b·(øx +^bÖ¬\u0088Â\u009dsÀíU\u0016ï!\u0083,=\u0016ªóÇ2\n\u0097K\u0084÷/£÷\f(ßÓCæ\u0083q\u0010èø\u0083\u008d\u001dDÐ*»\u0004\u0083Zræ\u000bM\\D²Zz\u0085f!Ææhf?oêE[ \u009c yL\u001fÄi\u0086~ÆV£þ¾\u0001\u0000áoä 2Ì«)\u0081m\u0003\u0005\u0011yI¢\u0010Aã\u007f¬:\u0002¯}°\u0019¥c\u0013\u0002\u0006x(Ï¿°}Ý\u001aR¹s¶£ªeÈJWkØ\u008bÆiÎ\u0016z\u000b\u0002\u001båF \u0019*ËÂ/1\fò2\u0017\u0010êE´\u008dx..`.X{\u0018D\u0017å\u0004\u0010\u0000\u00148îòÒ!]Ú\u000fè¼ÈçfS\u0010EÒ\u0017â¥jv+/\u008aaÖ\u0085SÌ% Å\u0094Ý*À{Á¨Ì\rçÕR\u0091\u0086§ºÒâpaæ*ø¸ªñ¦ªV×ë\u0010\u0002ô¯Mî¸\n\u0014 y\u008f\u008aµ\u00935\u009e(Ó\u0019\u0006\u0019%0Ö\u0013Ã³éë³w=.\u0096u@\u0000¸2\u0087\u0093Ã\u009eùær,òÛL\u00953HN]\u001aí\u0018,ü\u008cª´\u009dåE\u0088á\u009dº\u009b\u0001^\tÊi¶)ñ\u009d\u0087q\u0010ïÙ\u0002ß\u00032X¤P\u0093þ\u0001\u009ee\n\u0087(´^rPÞ³#/A\u0005Ê\u009e\u0001ªâyDú©\u0006'Q18R'è\føoô¹\u0017á\tx\u0094Ð°: ¤\tLÖ@\u0088ç°\u0015Y)§\u0092\u001d\u0092¡>JC¡/\u0016æ¯\tÉÍ¨\u0095y\u009d\u0086\u0018¸Wg\u0014ñ\u001eò¨\u001cu|¶\u0095wK\u001ak\u0097\u0089\rg¹>9\u0010÷_Aäupz\f\u0003Ô¼\u009e2vj)\u0010Ò1_(ªç|¤!i¬y=k\u0007\u001e\u0010Ný¤\r®eðGX+aÈ%ºô£ '\u001b¥û\u0091\u0086&\u0013b\u0018Ý¨gK\f¡È3\u0016\bèÃ¶\u00959\u0094.\u001auÆüF ×o\u008a\u0001ÏÐ\u008aª¬\u001fa°nbp?ÏÞT»]Â\u008eª\u000f\bÍ_]Cê¸\u0010\u0018EÜJ\bÞÊpô@u¡ò\u0082¯ö(\\\u0091Y¬¡\u008b\u0082dl£µ¾=F\u00ad!Q\u000esW\r\u0012\u009cJäÔ\u008e\u0014¹ú$fø°vó\u000bÀ|\u0006\u0010º\u0017¥Ó<P²ß\u0000\u0097l³¹\u0000\u0083\\(O±7»\u0081Ö\u0092ö\u0014\u000f/§Úb>¯!\u0089Ú,\u0099£Ab\u0085:u\u0010võéÏ\u0002ùÚ:\u0001\u0000k· ÌÆ\u009fó®\n\u0010C\r1]Ë\u000f=¹.\u0016H¾\u0094~?UóÂ\u001b\u000ez ñ\u0016&(B4ìÒA7P$Tx\u0016g3û?\u0002\u009aG±bí\u009aÓà^Ú6}p4çÓO[õ¾êRj\n _\u0001\u001c\u0090!\u0090\b5q`ùææ\u0098\u0004º|?ÂäyUKc\u0091\u009a¸\r\u0080tQÕ\u0018%¤¸·\u0004\u0004Ø\u0085qó¬´\u009d\u0004ÿl³íÀ!ÃO.Õ öÇù\r\u0087GÀ7ñH\u0019Ê/¤\u0093\u0080}ûJ\u009f¡q 6\u0098,\nÚI¬²\u0094 \u001cÈ³\u001c\u0019IïnKÏHý\u0092,\"lF\u001c8Ú93länMy\nM_\u008cö \u00927\u0083¬¦\u0016V$¤¸æ\u0089¨\u009dt\u0010óÚ\u0094Ç/¤ö\u000e¾\u0083\u00adÒl\u0090\\L\u0010\u0096x©B\u000bó¾ýBËU\n\\\r@\u0002(\u0092dóoi\u0092Q¢iÑñ\u0018\u009e\u009f\u0096>U\"8wPw\u0095\u000fü\u0004Z\u001a\u0003ÚÝ'\nÕ\u0005\u0083W|.ó\u0018'ÎC\u0002\u0013Z]f\u0015ÂÏfãªå¸\u0089\u00840\u000eÇúez ?#\u000b\u0016dö\u009c\u0082¯HB\u0001G\u0083\\ 8V\u0082È/§t\u0082±ö6\u00823=jð\u0010oÓXè\fõÑ\u0004XpL?Ï³¤ò";
        int length = "ûg|\u0019 ÖÜ'\\Þ\u0011\u0096A0µ!Ñ¯\u0013§ÌRJ9\u0088!]Vv÷w\u0093\u0010\u000fÌ0\u0091ë\u0083ßÅ ýCÛ;ÄÛÑ\u0010<í\u009bç\fjDú´µ\u0010h\u0096uæ4 \u009dS?4\f\u009a\u0099xìmE\u0017%©»é³\u001bImºHlâZô»àÍ´áÎ(\"Ö\bgª¹4\u0015\u0018CbN;!QlÑ\u0082ùu_cl¸ñ±YÛªFN\u0019\u0005ò»\u0000H\"H-\u0010\f°¬îM\u0093½\u009b\b\u0004)üâ\u001c6ò\u0018Î\u009d\u000fè¯º]LD\u009d\u007f¢\u007f´Ó[mÚ5\n\u0085+$\u009a \u009e\u008eò\\\u000eáÆÐýG®\u000e}&?\u009e¡Ð\u001fÊ\u0001$ \u008eÔ\u0080»qØÍSõ\u0018o7\u0015I\u008ex¡\u0006q\u008e½6Îôþ\u0019\u009c2¡\u0010&ALª(äÚ¦ ô\u0012a,ªî¶\u0084öµ\rA\nÒÿ\u0016æ\u008bÝ\u00148\u009dEàè$½©\u0092ÖD\u008d\u0000\u0082§\n\u0010¤ E)\u0001;\u0084i7¿\u008cÔ»79¦\u0010\u008fæ&\u0006,ÆsÎ9²Ý_\"Ê\u0083Ñ ¦\rFþ\u0090l\\#Y{\u0018\u0094¦4H\u0091±\u009f7]û´Ó)ó]\u0013\u0010Ç²-·\u0018\u0081\u008an)\u0019ÜÈ\u008c\nh¶%,6Êq\u00004}\u009b/ÉÅ¼ \u0093öª«S\"\u0099x\u0017\u007f4\u0088\u001a \u0015pú\n{\u001e\u00ad2¾ÐIÐ:ÝU\u008f©ø ùsÏ~\u008cL¯t\u008b»ý{)¨x\u0014\\ÐN\u0005{z!Óf}(\u00ad\u0010\u0014Y\u0098\u0010\u0091\\ZEçý]jóÜf\u000b·(øx +^bÖ¬\u0088Â\u009dsÀíU\u0016ï!\u0083,=\u0016ªóÇ2\n\u0097K\u0084÷/£÷\f(ßÓCæ\u0083q\u0010èø\u0083\u008d\u001dDÐ*»\u0004\u0083Zræ\u000bM\\D²Zz\u0085f!Ææhf?oêE[ \u009c yL\u001fÄi\u0086~ÆV£þ¾\u0001\u0000áoä 2Ì«)\u0081m\u0003\u0005\u0011yI¢\u0010Aã\u007f¬:\u0002¯}°\u0019¥c\u0013\u0002\u0006x(Ï¿°}Ý\u001aR¹s¶£ªeÈJWkØ\u008bÆiÎ\u0016z\u000b\u0002\u001båF \u0019*ËÂ/1\fò2\u0017\u0010êE´\u008dx..`.X{\u0018D\u0017å\u0004\u0010\u0000\u00148îòÒ!]Ú\u000fè¼ÈçfS\u0010EÒ\u0017â¥jv+/\u008aaÖ\u0085SÌ% Å\u0094Ý*À{Á¨Ì\rçÕR\u0091\u0086§ºÒâpaæ*ø¸ªñ¦ªV×ë\u0010\u0002ô¯Mî¸\n\u0014 y\u008f\u008aµ\u00935\u009e(Ó\u0019\u0006\u0019%0Ö\u0013Ã³éë³w=.\u0096u@\u0000¸2\u0087\u0093Ã\u009eùær,òÛL\u00953HN]\u001aí\u0018,ü\u008cª´\u009dåE\u0088á\u009dº\u009b\u0001^\tÊi¶)ñ\u009d\u0087q\u0010ïÙ\u0002ß\u00032X¤P\u0093þ\u0001\u009ee\n\u0087(´^rPÞ³#/A\u0005Ê\u009e\u0001ªâyDú©\u0006'Q18R'è\føoô¹\u0017á\tx\u0094Ð°: ¤\tLÖ@\u0088ç°\u0015Y)§\u0092\u001d\u0092¡>JC¡/\u0016æ¯\tÉÍ¨\u0095y\u009d\u0086\u0018¸Wg\u0014ñ\u001eò¨\u001cu|¶\u0095wK\u001ak\u0097\u0089\rg¹>9\u0010÷_Aäupz\f\u0003Ô¼\u009e2vj)\u0010Ò1_(ªç|¤!i¬y=k\u0007\u001e\u0010Ný¤\r®eðGX+aÈ%ºô£ '\u001b¥û\u0091\u0086&\u0013b\u0018Ý¨gK\f¡È3\u0016\bèÃ¶\u00959\u0094.\u001auÆüF ×o\u008a\u0001ÏÐ\u008aª¬\u001fa°nbp?ÏÞT»]Â\u008eª\u000f\bÍ_]Cê¸\u0010\u0018EÜJ\bÞÊpô@u¡ò\u0082¯ö(\\\u0091Y¬¡\u008b\u0082dl£µ¾=F\u00ad!Q\u000esW\r\u0012\u009cJäÔ\u008e\u0014¹ú$fø°vó\u000bÀ|\u0006\u0010º\u0017¥Ó<P²ß\u0000\u0097l³¹\u0000\u0083\\(O±7»\u0081Ö\u0092ö\u0014\u000f/§Úb>¯!\u0089Ú,\u0099£Ab\u0085:u\u0010võéÏ\u0002ùÚ:\u0001\u0000k· ÌÆ\u009fó®\n\u0010C\r1]Ë\u000f=¹.\u0016H¾\u0094~?UóÂ\u001b\u000ez ñ\u0016&(B4ìÒA7P$Tx\u0016g3û?\u0002\u009aG±bí\u009aÓà^Ú6}p4çÓO[õ¾êRj\n _\u0001\u001c\u0090!\u0090\b5q`ùææ\u0098\u0004º|?ÂäyUKc\u0091\u009a¸\r\u0080tQÕ\u0018%¤¸·\u0004\u0004Ø\u0085qó¬´\u009d\u0004ÿl³íÀ!ÃO.Õ öÇù\r\u0087GÀ7ñH\u0019Ê/¤\u0093\u0080}ûJ\u009f¡q 6\u0098,\nÚI¬²\u0094 \u001cÈ³\u001c\u0019IïnKÏHý\u0092,\"lF\u001c8Ú93länMy\nM_\u008cö \u00927\u0083¬¦\u0016V$¤¸æ\u0089¨\u009dt\u0010óÚ\u0094Ç/¤ö\u000e¾\u0083\u00adÒl\u0090\\L\u0010\u0096x©B\u000bó¾ýBËU\n\\\r@\u0002(\u0092dóoi\u0092Q¢iÑñ\u0018\u009e\u009f\u0096>U\"8wPw\u0095\u000fü\u0004Z\u001a\u0003ÚÝ'\nÕ\u0005\u0083W|.ó\u0018'ÎC\u0002\u0013Z]f\u0015ÂÏfãªå¸\u0089\u00840\u000eÇúez ?#\u000b\u0016dö\u009c\u0082¯HB\u0001G\u0083\\ 8V\u0082È/§t\u0082±ö6\u00823=jð\u0010oÓXè\fõÑ\u0004XpL?Ï³¤ò".length();
        char cCharAt = ' ';
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
                            c = new String[56];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[9];
                            int i9 = 0;
                            String str3 = "?ÆÇI\n\u0011ç \u0092¦âÛêL\"¨\u008d\u0017)4²]½½\u00016\r>\u0017\tQ±c ôÒ¿\u001a¸}¹ß\u0002+\u0080Þü\b.u£\n5Æ\u0010×";
                            int length2 = "?ÆÇI\n\u0011ç \u0092¦âÛêL\"¨\u008d\u0017)4²]½½\u00016\r>\u0017\tQ±c ôÒ¿\u001a¸}¹ß\u0002+\u0080Þü\b.u£\n5Æ\u0010×".length();
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
                                                f = new Integer[9];
                                                Y = new gw();
                                                Pair[] pairArr = new Pair[(int) b(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5509, 4226624292779562577L ^ j) /* invoke-custom */];
                                                pairArr[0] = TuplesKt.to(class_2350.field_11036, new class_2338(0, -1, 0));
                                                pairArr[1] = TuplesKt.to(class_2350.field_11033, new class_2338(0, 1, 0));
                                                pairArr[2] = TuplesKt.to(class_2350.field_11034, new class_2338(-1, 0, 0));
                                                pairArr[3] = TuplesKt.to(class_2350.field_11039, new class_2338(1, 0, 0));
                                                pairArr[4] = TuplesKt.to(class_2350.field_11043, new class_2338(0, 0, 1));
                                                pairArr[5] = TuplesKt.to(class_2350.field_11035, new class_2338(0, 0, -1));
                                                s = MapsKt.mapOf(pairArr);
                                                y = new LinkedHashMap();
                                                class_243 class_243Var = class_243.field_1353;
                                                Intrinsics.checkNotNullExpressionValue(class_243Var, (String) a(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13230, 7043092131973752410L ^ j) /* invoke-custom */);
                                                B = class_243Var;
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "Qn#>ÈAØg\\Ö_>Hd{À";
                                                length2 = "Qn#>ÈAØg\\Ö_>Hd{À".length();
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
                        str = "¹Íê\\OÊ\u0092Ðè\u001ez%~>Ýu\u0010çÁ-\u0099³\u0092\u0080\u0010]\u0005\t¤ó\u0011ì\u009bÏ\u0086è.\u001f\u0001\u009b¦";
                        length = "¹Íê\\OÊ\u0092Ðè\u001ez%~>Ýu\u0010çÁ-\u0099³\u0092\u0080\u0010]\u0005\t¤ó\u0011ì\u009bÏ\u0086è.\u001f\u0001\u009b¦".length();
                        cCharAt = 24;
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

    public static void S(int[] iArr) {
        W = iArr;
    }

    public static int[] Z() {
        return W;
    }

    private static NoSuchElementException a(NoSuchElementException noSuchElementException) {
        return noSuchElementException;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 24659;
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
                throw new RuntimeException("su/catlean/gw", e2);
            }
        }
        return c[i2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strA = a(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strA), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strA;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.gw.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gw.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x000C: CONST
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.gw.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gw.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gw.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 13935;
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
                    throw new RuntimeException("su/catlean/gw", e2);
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

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.gw.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gw.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x000C: CONST
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.gw.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gw.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gw.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
