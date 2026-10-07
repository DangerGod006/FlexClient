package su.catlean;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1267;
import net.minecraft.class_1282;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1893;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_5321;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.PostTasksProcessEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/la.class */
@ExcludeFlow
@ExcludeIndy
public final class la implements ym {

    @NotNull
    public static final la l;
    public static final double S = -1.0E-7d;

    @NotNull
    private static final Long2ByteOpenHashMap X;

    @NotNull
    private static final class_265 c;

    @Nullable
    private static class_1282 b;
    private static boolean p;
    private static final long a = yz.a(926659411245365366L, -4733013729815131179L, MethodHandles.lookup().lookupClass()).a(255625429357492L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;

    private la() {
    }

    public final boolean k() {
        return p;
    }

    public final void t(boolean z) {
        p = z;
    }

    @Flow
    private final void E(PostTasksProcessEvent postTasksProcessEvent) {
        X.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v16, types: [double] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [net.minecraft.class_1267] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [net.minecraft.class_238] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r16v0, types: [su.catlean.la] */
    /* JADX WARN: Type inference failed for: r34v0, types: [net.minecraft.class_238] */
    public final float K(@NotNull class_243 class_243Var, @NotNull class_1657 class_1657Var, int i2, long j, boolean z, @NotNull List list, boolean z2) {
        ?? r0;
        long j2 = a ^ j;
        ?? F = j2;
        int i3 = (int) (F >>> 48);
        long j3 = ((F ^ 33314986034618L) << 16) >>> 16;
        long j4 = F ^ 82708488395348L;
        long j5 = F ^ 89720070527104L;
        long j6 = F ^ 51852622231465L;
        try {
            Intrinsics.checkNotNullParameter(class_243Var, (String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5989, 239934253948933908L ^ j2) /* invoke-custom */);
            Intrinsics.checkNotNullParameter(class_1657Var, (String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2028, 5415753862913591186L ^ j2) /* invoke-custom */);
            Intrinsics.checkNotNullParameter(list, (String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30546, 3559067682661627694L ^ j2) /* invoke-custom */);
            if (i2 > 0) {
                F = lo.k.F(j4, class_1657Var, i2);
                r0 = F;
            } else {
                class_238 class_238VarMethod_5829 = class_1657Var.method_5829();
                Intrinsics.checkNotNullExpressionValue(class_238VarMethod_5829, (String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2079, 4241640625242048614L ^ j2) /* invoke-custom */);
                r0 = class_238VarMethod_5829;
            }
            ?? r34 = r0;
            ?? Method_1022 = r34.method_1005().method_1031(0.0d, (-r34.method_17940()) / 2.0d, 0.0d).method_1022(class_243Var) / 12.0d;
            try {
                try {
                    try {
                        Method_1022 = zf.z(j5).method_8407();
                        if (Method_1022 != class_1267.field_5801 && Method_1022 <= 1.0d && !class_1657Var.method_68878()) {
                            return O(class_1657Var, j6, Method_1022, v(class_243Var, r34, z, (short) i3, list, z2, j3));
                        }
                        return 0.0f;
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_1022, 3872950505206576620L, j2) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_1022, 3872950505206576620L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_1022, 3872950505206576620L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F, 3872950505206576620L, j2) /* invoke-custom */;
        }
    }

    public static float K(la laVar, class_243 class_243Var, class_1657 class_1657Var, int i2, boolean z, List list, boolean z2, int i3, Object obj, long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 4683220406917L;
        long j4 = j2 ^ 135587242765179L;
        if ((i3 & 2) != 0) {
            class_1657Var = (class_1657) zf.v(j4);
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18829, 5336849459537247351L ^ j2) /* invoke-custom */) != 0) {
            z = false;
        }
        if ((i3 & (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29550, 1008136825782486674L ^ j2) /* invoke-custom */) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i3 & (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32321, 1396570908910668728L ^ j2) /* invoke-custom */) != 0) {
            z2 = false;
        }
        return laVar.K(class_243Var, class_1657Var, i2, j3, z, list, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0150  */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [net.minecraft.class_1282] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float O(net.minecraft.class_1657 r8, long r9, double r11, double r13) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.la.O(net.minecraft.class_1657, long, double, double):float");
    }

    private final float o(Iterable iterable) {
        float f2 = 0.0f;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!((class_1799) it.next()).method_7960()) {
                f2 += 8.0f;
            }
        }
        return f2;
    }

    private final float t(double d2, double d3) {
        double d4 = (1.0d - d2) * d3;
        return (float) (((((d4 * d4) + d4) / 2.0d) * 7.0d * 12.0d) + 1.0d);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final float v(net.minecraft.class_243 r13, net.minecraft.class_238 r14, boolean r15, short r16, java.util.List r17, boolean r18, long r19) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.la.v(net.minecraft.class_243, net.minecraft.class_238, boolean, short, java.util.List, boolean, long):float");
    }

    static float W(la laVar, long j, class_243 class_243Var, class_238 class_238Var, boolean z, List list, boolean z2, int i2, Object obj) {
        long j2 = a ^ j;
        int i3 = (int) (j2 >>> 48);
        long j3 = ((j2 ^ 56307701689264L) << 16) >>> 16;
        if ((i2 & (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18829, 5336846829678419745L ^ j2) /* invoke-custom */) != 0) {
            list = CollectionsKt.emptyList();
        }
        return laVar.v(class_243Var, class_238Var, z, (short) i3, list, z2, j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0079, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.NumberFormatException] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.NumberFormatException] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.NumberFormatException] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.NumberFormatException] */
    /* JADX WARN: Type inference failed for: r0v28, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.NumberFormatException] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.NumberFormatException] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean t(double r6, double r8, double r10) {
        /*
            r5 = this;
            r0 = 0
            r12 = r0
        L3:
            r0 = r12
            r1 = 2
            if (r0 >= r1) goto L85
            r0 = 0
            r13 = r0
        Lc:
            r0 = r13
            r1 = 2
            if (r0 >= r1) goto L7f
            r0 = 0
            r14 = r0
        L15:
            r0 = r14
            r1 = 2
            if (r0 >= r1) goto L79
            r0 = r6
            r1 = r12
            double r1 = (double) r1     // Catch: java.lang.NumberFormatException -> L26 java.lang.NumberFormatException -> L2e
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L32
            goto L2a
        L26:
            java.lang.NumberFormatException r0 = a(r0)     // Catch: java.lang.NumberFormatException -> L2e
            throw r0     // Catch: java.lang.NumberFormatException -> L2e
        L2a:
            r0 = 1
            goto L33
        L2e:
            java.lang.NumberFormatException r0 = a(r0)     // Catch: java.lang.NumberFormatException -> L2e
            throw r0
        L32:
            r0 = 0
        L33:
            if (r0 == 0) goto L73
            r0 = r8
            r1 = r13
            double r1 = (double) r1     // Catch: java.lang.NumberFormatException -> L41 java.lang.NumberFormatException -> L49
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4d
            goto L45
        L41:
            java.lang.NumberFormatException r0 = a(r0)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L45:
            r0 = 1
            goto L4e
        L49:
            java.lang.NumberFormatException r0 = a(r0)     // Catch: java.lang.NumberFormatException -> L49
            throw r0
        L4d:
            r0 = 0
        L4e:
            if (r0 == 0) goto L73
            r0 = r10
            r1 = r14
            double r1 = (double) r1     // Catch: java.lang.NumberFormatException -> L5d java.lang.NumberFormatException -> L65
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L69
            goto L61
        L5d:
            java.lang.NumberFormatException r0 = a(r0)     // Catch: java.lang.NumberFormatException -> L65
            throw r0     // Catch: java.lang.NumberFormatException -> L65
        L61:
            r0 = 1
            goto L6a
        L65:
            java.lang.NumberFormatException r0 = a(r0)     // Catch: java.lang.NumberFormatException -> L65
            throw r0
        L69:
            r0 = 0
        L6a:
            if (r0 == 0) goto L73
            r0 = 1
            return r0
        L6f:
            java.lang.NumberFormatException r0 = a(r0)     // Catch: java.lang.NumberFormatException -> L6f
            throw r0
        L73:
            int r14 = r14 + 1
            goto L15
        L79:
            int r13 = r13 + 1
            goto Lc
        L7f:
            int r12 = r12 + 1
            goto L3
        L85:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.la.t(double, double, double):boolean");
    }

    private final Pair X(class_243 class_243Var, class_238 class_238Var, boolean z, List list, boolean z2, long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 112567123830188L;
        double d2 = 1.0d / (((class_238Var.field_1320 - class_238Var.field_1323) * 2.0d) + 1.0d);
        double d3 = 1.0d / (((class_238Var.field_1324 - class_238Var.field_1321) * 2.0d) + 1.0d);
        double dFloor = (1.0d - (Math.floor(1.0d / d2) * d2)) / 2.0d;
        double dFloor2 = (1.0d - (Math.floor(1.0d / d3) * d3)) / 2.0d;
        int i2 = 0;
        int i3 = 0;
        double d4 = 0.0d;
        while (true) {
            double d5 = d4;
            if (d5 > 1.0d) {
                return new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
            }
            double d6 = 0.0d;
            while (true) {
                double d7 = d6;
                if (d7 <= 1.0d) {
                    double d8 = 0.0d;
                    while (true) {
                        double d9 = d8;
                        if (d9 <= 1.0d) {
                            class_3965 class_243Var2 = new class_243(class_3532.method_16436(d5, class_238Var.field_1323, class_238Var.field_1320) + dFloor, class_3532.method_16436(d7, class_238Var.field_1322, class_238Var.field_1325), class_3532.method_16436(d9, class_238Var.field_1321, class_238Var.field_1324) + dFloor2);
                            try {
                                class_243Var2 = V(class_243Var2, class_243Var, z, j3, list, z2);
                                if (class_243Var2 == null) {
                                    i2++;
                                }
                                i3++;
                                d8 = d9 + 1.0d;
                            } catch (NumberFormatException unused) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_243Var2, 1669243519134652281L, j2) /* invoke-custom */;
                            }
                        }
                    }
                    d6 = d7 + 1.0d;
                }
            }
            d4 = d5 + 1.0d;
        }
    }

    static Pair Z(la laVar, class_243 class_243Var, class_238 class_238Var, boolean z, List list, boolean z2, int i2, Object obj, long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 91587216040731L;
        if ((i2 & (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18829, 5336827769351106428L ^ j2) /* invoke-custom */) != 0) {
            list = CollectionsKt.emptyList();
        }
        return laVar.X(class_243Var, class_238Var, z, list, z2, j3);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final net.minecraft.class_3965 i(net.minecraft.class_2338 r10, net.minecraft.class_243 r11, net.minecraft.class_243 r12, boolean r13, long r14, java.util.List r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.la.i(net.minecraft.class_2338, net.minecraft.class_243, net.minecraft.class_243, boolean, long, java.util.List, boolean):net.minecraft.class_3965");
    }

    static class_3965 z(la laVar, class_2338 class_2338Var, class_243 class_243Var, class_243 class_243Var2, boolean z, int i2, char c2, List list, boolean z2, int i3, Object obj, int i4) {
        long j = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) i4) << 48) >>> 48)) ^ a;
        long j2 = j ^ 65198642729189L;
        if ((i3 & (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11171, 427636909415831516L ^ j) /* invoke-custom */) != 0) {
            z = false;
        }
        if ((i3 & (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19989, 5352348119202919020L ^ j) /* invoke-custom */) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i3 & (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26154, 3416970707416930896L ^ j) /* invoke-custom */) != 0) {
            z2 = true;
        }
        return laVar.i(class_2338Var, class_243Var, class_243Var2, z, j2, list, z2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final float p(byte r4) {
        /*
            r3 = this;
            r0 = r4
            r5 = r0
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L13
            r0 = r5
            r1 = 2
            if (r0 != r1) goto L1b
            goto L13
        Lf:
            java.lang.NumberFormatException r0 = a(r0)     // Catch: java.lang.NumberFormatException -> L17
            throw r0     // Catch: java.lang.NumberFormatException -> L17
        L13:
            r0 = 0
            goto L1d
        L17:
            java.lang.NumberFormatException r0 = a(r0)     // Catch: java.lang.NumberFormatException -> L17
            throw r0
        L1b:
            r0 = 1142292480(0x44160000, float:600.0)
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.la.p(byte):float");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11, types: [net.minecraft.class_265] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.NumberFormatException] */
    /* JADX WARN: Type inference failed for: r0v4, types: [net.minecraft.class_265] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.NumberFormatException] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, net.minecraft.class_265] */
    private final class_265 f(byte b2) {
        ?? Method_1077;
        ?? Method_1073 = b2;
        if (Method_1073 == 1) {
            try {
                Method_1073 = class_259.method_1073();
                Method_1077 = Method_1073;
            } catch (NumberFormatException unused) {
                throw a((NumberFormatException) Method_1073);
            }
        } else {
            ?? r0 = b2;
            if (r0 == 4) {
                try {
                    r0 = c;
                    Method_1077 = r0;
                } catch (NumberFormatException unused2) {
                    throw a((NumberFormatException) r0);
                }
            } else {
                Method_1077 = class_259.method_1077();
            }
        }
        ?? r5 = Method_1077;
        Intrinsics.checkNotNull(r5);
        return r5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    private final byte o(class_2248 class_2248Var, boolean z) {
        NumberFormatException numberFormatExceptionAreEqual = z;
        if (numberFormatExceptionAreEqual != 0) {
            return (byte) 1;
        }
        try {
            numberFormatExceptionAreEqual = Intrinsics.areEqual(class_2248Var, class_2246.field_10443);
            if (numberFormatExceptionAreEqual != 0) {
                return (byte) 4;
            }
            try {
                numberFormatExceptionAreEqual = (class_2248Var.method_9520() > 600.0f ? 1 : (class_2248Var.method_9520() == 600.0f ? 0 : -1));
                return numberFormatExceptionAreEqual >= 0 ? (byte) 3 : (byte) 2;
            } catch (NumberFormatException unused) {
                throw a(numberFormatExceptionAreEqual);
            }
        } catch (NumberFormatException unused2) {
            throw a(numberFormatExceptionAreEqual);
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
    public final net.minecraft.class_3965 V(@org.jetbrains.annotations.NotNull net.minecraft.class_243 r11, @org.jetbrains.annotations.NotNull net.minecraft.class_243 r12, boolean r13, long r14, @org.jetbrains.annotations.NotNull java.util.List r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.la.V(net.minecraft.class_243, net.minecraft.class_243, boolean, long, java.util.List, boolean):net.minecraft.class_3965");
    }

    public static class_3965 R(la laVar, class_243 class_243Var, class_243 class_243Var2, boolean z, List list, boolean z2, int i2, Object obj, long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 30796502964376L;
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18829, 5336832799285882506L ^ j2) /* invoke-custom */) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i2 & (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29550, 1008224069518365807L ^ j2) /* invoke-custom */) != 0) {
            z2 = true;
        }
        return laVar.V(class_243Var, class_243Var2, z, j3, list, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.minecraft.class_239$class_240] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    public final boolean c(long j, @NotNull class_243 class_243Var) {
        ?? r0;
        long j2 = a ^ j;
        ?? Method_17783 = j2;
        long j3 = Method_17783 ^ 55873018217316L;
        long j4 = Method_17783 ^ 7326746923793L;
        int i2 = (int) (Method_17783 >>> 48);
        int i3 = (int) ((j4 << 16) >>> 32);
        int i4 = (int) ((j4 << 48) >>> 48);
        long j5 = Method_17783 ^ 22492885394747L;
        try {
            try {
                Intrinsics.checkNotNullParameter(class_243Var, (String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16053, 1985568682279140831L ^ j2) /* invoke-custom */);
                class_3965 class_3965VarR = R(this, gw.Y.a((short) i2, i3, (char) i4, (class_1297) zf.v(j5)), class_243Var, false, null, false, (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8798, 4349240180143446496L ^ j2) /* invoke-custom */, null, j3);
                if (class_3965VarR != null) {
                    Method_17783 = class_3965VarR.method_17783();
                    r0 = Method_17783;
                    if (Method_17783 == 0) {
                        r0 = class_239.class_240.field_1333;
                    }
                } else {
                    r0 = class_239.class_240.field_1333;
                }
                try {
                    return r0 == class_239.class_240.field_1333;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 8548742545909462768L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_17783, 8548742545909462768L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_17783, 8548742545909462768L, j2) /* invoke-custom */;
        }
    }

    private final int g(Iterable iterable, long j) {
        long j2 = (a ^ j) ^ 42371490182690L;
        int iX = 0;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            iX += l.x(j2, (class_1799) it.next());
        }
        return iX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private final int x(long j, class_1799 class_1799Var) {
        long j2 = a ^ j;
        long j3 = j2 ^ 93919488457717L;
        Object objMethod_7960 = class_1799Var;
        if (objMethod_7960 == 0) {
            return 0;
        }
        try {
            try {
                objMethod_7960 = class_1799Var.method_7960();
                if (objMethod_7960 != 0) {
                    return 0;
                }
                class_5321 class_5321Var = class_1893.field_9107;
                Intrinsics.checkNotNullExpressionValue(class_5321Var, (String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16173, 1662301618130481337L ^ j2) /* invoke-custom */);
                int iF = lq.F(j3, class_1799Var, class_5321Var);
                class_5321 class_5321Var2 = class_1893.field_9111;
                Intrinsics.checkNotNullExpressionValue(class_5321Var2, (String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27540, 3509820504185807886L ^ j2) /* invoke-custom */);
                return (iF * 2) + lq.F(j3, class_1799Var, class_5321Var2);
            } catch (NumberFormatException unused) {
                objMethod_7960 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_7960, -405882181062608371L, j2) /* invoke-custom */;
                throw objMethod_7960;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_7960, -405882181062608371L, j2) /* invoke-custom */;
        }
    }

    static {
        int i2;
        long j = a ^ 8846302682020L;
        f = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[15];
        int i4 = 0;
        String str = "\u007fÚ_×ÄS\u0098\u0097?¬Iî¡\u0011YÚ\u0010ÿÖú1\u009eC/é^V\u009c\r$5O\u0086(\u001by\u001f\u0085\u0088ðº7\u001d4SÇcû\u0084B\u0086Øl&%i\u0088\u008cëß\u009e§À|\u008e\u0086õjÑÓ(ñÚ\u0006\u0018 \u001f\u0088\u0097Z\u0081T+\f\u009f\u0083F\\7ÇPÍ,Þ5\u008c\u009cþE\u0010\u008a\u00996\u0000RmJ§·Ô×\u009f\fJmt \\\u001f¹\u0092\u0083\u009caO·Ïacå\u0016\u008dËuSC\u008cpê±\u009ak;ÝÒ!´\u0098®\u0018×¼\u0097¶Á4äbýÂ\u0084SË-÷\u0017¬YLC5õ\u0006¯(!p°Õ9Ùo¾\u0096\\Ø\u0095LÎ©Q\u0094ÈæÇ¤\u0095îÕ\u0017=5T~à\\\u0013¿\u001e&H5\u0019ÖO(Ü\u0084å7\u0087©ªv\u008aêGÔ\u0013v\u009c\\}\u001b@\u0099±Ý´MË\u0017\u000fìµ\u0013¡º\u008bü8RH\u0086\u0013É\u0010\u001927ñ?nþÿ\u0014\u0088öQ\u0000\u0089I\u0007\u0018 \"\u0013\u0089[xQ¡7KØêjxãGX\u008b)6S×\u0098\u0081\u00101Åú\u0089ª®\u0004\u0083\u0011j\"\u0017L\u0011jß Íµ:\u0097\u0019>ùã'¼\u00ad\u0003`US\u0088\fø\u0094\bðo³eÒF\u0080ÉC\u0019<\u0091";
        int length = "\u007fÚ_×ÄS\u0098\u0097?¬Iî¡\u0011YÚ\u0010ÿÖú1\u009eC/é^V\u009c\r$5O\u0086(\u001by\u001f\u0085\u0088ðº7\u001d4SÇcû\u0084B\u0086Øl&%i\u0088\u008cëß\u009e§À|\u008e\u0086õjÑÓ(ñÚ\u0006\u0018 \u001f\u0088\u0097Z\u0081T+\f\u009f\u0083F\\7ÇPÍ,Þ5\u008c\u009cþE\u0010\u008a\u00996\u0000RmJ§·Ô×\u009f\fJmt \\\u001f¹\u0092\u0083\u009caO·Ïacå\u0016\u008dËuSC\u008cpê±\u009ak;ÝÒ!´\u0098®\u0018×¼\u0097¶Á4äbýÂ\u0084SË-÷\u0017¬YLC5õ\u0006¯(!p°Õ9Ùo¾\u0096\\Ø\u0095LÎ©Q\u0094ÈæÇ¤\u0095îÕ\u0017=5T~à\\\u0013¿\u001e&H5\u0019ÖO(Ü\u0084å7\u0087©ªv\u008aêGÔ\u0013v\u009c\\}\u001b@\u0099±Ý´MË\u0017\u000fìµ\u0013¡º\u008bü8RH\u0086\u0013É\u0010\u001927ñ?nþÿ\u0014\u0088öQ\u0000\u0089I\u0007\u0018 \"\u0013\u0089[xQ¡7KØêjxãGX\u008b)6S×\u0098\u0081\u00101Åú\u0089ª®\u0004\u0083\u0011j\"\u0017L\u0011jß Íµ:\u0097\u0019>ùã'¼\u00ad\u0003`US\u0088\fø\u0094\bðo³eÒF\u0080ÉC\u0019<\u0091".length();
        char cCharAt = 16;
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
                            d = strArr;
                            e = new String[15];
                            i = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[8];
                            int i10 = 0;
                            String str3 = "\u00ad\u0098¿*ö×Ö\\Ãr÷£VFBøÕì=ªI¯ÆÏö\u0017Á¹\u0000Q\u0000¸ü±V³s®Uþo\u008187k¶Âz";
                            int length2 = "\u00ad\u0098¿*ö×Ö\\Ãr÷£VFBøÕì=ªI¯ÆÏö\u0017Á¹\u0000Q\u0000¸ü±V³s®Uþo\u008187k¶Âz".length();
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
                                                g = jArr;
                                                h = new Integer[8];
                                                l = new la();
                                                X = new Long2ByteOpenHashMap();
                                                class_265 class_265VarMethod_66404 = class_2248.method_66404(14.0d, 0.0d, 14.0d);
                                                Intrinsics.checkNotNullExpressionValue(class_265VarMethod_66404, (String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14230, 6256652480248628958L ^ j) /* invoke-custom */);
                                                c = class_265VarMethod_66404;
                                                p = true;
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i11 >= length2) {
                                                str3 = "uádzöuËÊKj¡ã$\u0010\u0017b";
                                                length2 = "uádzöuËÊKj¡ã$\u0010\u0017b".length();
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
                        str = "\f«?U$*\u0093\u0013Ì¯\u0084î·\u0017¦¼(Å¸Ù+\u0090^mÐ®\u009f1Kw9©Û\u0004\u0089\u0094*ç¯ê!Ñõ5\u008a®xDw\u0094lRJ\u0083áoã";
                        length = "\f«?U$*\u0093\u0013Ì¯\u0084î·\u0017¦¼(Å¸Ù+\u0090^mÐ®\u009f1Kw9©Û\u0004\u0089\u0094*ç¯ê!Ñõ5\u008a®xDw\u0094lRJ\u0083áoã".length();
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 13631;
        if (e[i3] == null) {
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
                e[i3] = a(((Cipher) objArr[0]).doFinal(d[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/la", e2);
            }
        }
        return e[i3];
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
            java.lang.String r1 = "su/catlean/la"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.la.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 3561;
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
                    throw new RuntimeException("su/catlean/la", e2);
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
            java.lang.String r1 = "su/catlean/la"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.la.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
