package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.minecraft.class_1713;
import net.minecraft.class_1743;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1821;
import net.minecraft.class_2248;
import net.minecraft.class_2868;
import net.minecraft.class_476;
import net.minecraft.class_495;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gg.class */
public final class gg implements ym {

    @NotNull
    public static final gg P;
    private static int B;
    private static int O;
    private static int r;
    private static final long a = yz.a(6481707318787404420L, -7861560322843911412L, MethodHandles.lookup().lookupClass()).a(137461647105705L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    private gg() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    @Flow
    private final void J(SendPacket sendPacket) {
        long j = a ^ 56761333636155L;
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7905948457065487439L, j) /* invoke-custom */;
        try {
            try {
                obj = sendPacket.getPacket() instanceof class_2868;
                int iMethod_12442 = obj;
                if (obj == 0) {
                    if (obj == 0) {
                        return;
                    } else {
                        iMethod_12442 = sendPacket.getPacket().method_12442();
                    }
                }
                B = iMethod_12442;
            } catch (NoWhenBranchMatchedException unused) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 7893106694145695108L, j) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused2) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 7893106694145695108L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public final int O(@NotNull class_1792 class_1792Var, boolean z, long j) {
        _g[] _gVarArr;
        ?? AreEqual;
        long j2 = a ^ j;
        long j3 = j2 ^ 133287311474760L;
        long j4 = j2 ^ 98530163986030L;
        Intrinsics.checkNotNullParameter(class_1792Var, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15110, 6348862517523982309L ^ j2) /* invoke-custom */);
        int iMethod_7947 = 0;
        _g[] _gVarArr2 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6649749918798687664L, j2) /* invoke-custom */;
        int i = 0;
        do {
            ?? r0 = i;
            try {
                try {
                    try {
                        if (r0 >= (int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31484, 2342870364297144225L ^ j2) /* invoke-custom */) {
                            break;
                        }
                        class_746 class_746Var = zf.F(j3).field_1724;
                        Intrinsics.checkNotNull(class_746Var);
                        class_1799 class_1799VarMethod_5438 = class_746Var.method_31548().method_5438(i);
                        Intrinsics.checkNotNullExpressionValue(class_1799VarMethod_5438, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21254, 6247841768618381296L ^ j2) /* invoke-custom */);
                        AreEqual = _gVarArr2;
                        if (j2 >= 0) {
                            if (AreEqual == 0) {
                                try {
                                    try {
                                        AreEqual = Intrinsics.areEqual(class_1799VarMethod_5438.method_7909(), class_1792Var);
                                        _gVarArr = _gVarArr2;
                                        if (j2 < 0) {
                                            break;
                                        }
                                        if (_gVarArr != null) {
                                            break;
                                        }
                                        if (AreEqual != 0) {
                                            iMethod_7947 += class_1799VarMethod_5438.method_7947();
                                        }
                                        i++;
                                    } catch (NoWhenBranchMatchedException unused) {
                                        AreEqual = (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(AreEqual, 6662733504319450235L, j2) /* invoke-custom */;
                                        throw AreEqual;
                                    }
                                } catch (NoWhenBranchMatchedException unused2) {
                                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(AreEqual, 6662733504319450235L, j2) /* invoke-custom */;
                                }
                            }
                            AreEqual = _gVarArr2;
                        }
                    } catch (NoWhenBranchMatchedException unused3) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 6662733504319450235L, j2) /* invoke-custom */;
                    }
                } catch (NoWhenBranchMatchedException unused4) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 6662733504319450235L, j2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused5) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 6662733504319450235L, j2) /* invoke-custom */;
            }
        } while (AreEqual == 0);
        class_1792 class_1792VarMethod_7909 = zf.v(j4).field_7512.method_34255().method_7909();
        class_1792 class_1792Var2 = class_1792Var;
        if (j2 > 0) {
            AreEqual = Intrinsics.areEqual(class_1792VarMethod_7909, class_1792Var2);
            _gVarArr = _gVarArr2;
            ?? r02 = AreEqual;
            ?? r03 = AreEqual;
            if (j2 > 0) {
                if (_gVarArr == null) {
                    if (AreEqual != 0) {
                        O++;
                    }
                    r02 = z;
                }
                _gVarArr = _gVarArr2;
                r03 = r02;
            }
            if (_gVarArr != null) {
                return r03;
            }
            if (r03 != 0) {
                class_1792VarMethod_7909 = zf.v(j4).method_6079().method_7909();
                class_1792Var2 = class_1792Var;
            }
            return iMethod_7947;
        }
        boolean zAreEqual = Intrinsics.areEqual(class_1792VarMethod_7909, class_1792Var2);
        if (_gVarArr2 != null) {
            return zAreEqual ? 1 : 0;
        }
        if (zAreEqual) {
            iMethod_7947 += zf.v(j4).method_6079().method_7947();
        }
        return iMethod_7947;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    public static int k(gg ggVar, long j, class_1792 class_1792Var, boolean z, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 94229263815400L;
        Object obj2 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-115526788038193251L, j2) /* invoke-custom */;
        try {
            obj2 = i & 2;
            if (obj2 != 0) {
                return obj2;
            }
            if (obj2 != 0) {
                z = false;
            }
            return ggVar.O(class_1792Var, z, j3);
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, -118236548187468202L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[LOOP:0: B:3:0x005c->B:44:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0085 A[PHI: r0 r18 r19
  0x0085: PHI (r0v25 net.minecraft.class_1799) = (r0v19 net.minecraft.class_1799), (r0v40 net.minecraft.class_1799) binds: [B:25:0x00da, B:5:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r18v7 int) = (r18v2 int), (r18v1 int) binds: [B:25:0x00da, B:5:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r19v3 int) = (r19v2 int), (r19v1 int) binds: [B:25:0x00da, B:5:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008e  */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00da -> B:6:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(short r9, @org.jetbrains.annotations.NotNull net.minecraft.class_1792 r10, int r11, char r12) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gg.g(short, net.minecraft.class_1792, int, char):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    public final int R(@NotNull n5 searcher, long a2) {
        long j = a ^ a2;
        long j2 = j ^ 21213146670071L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5633472591590899671L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(searcher, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31109, 3279643746575419625L ^ j) /* invoke-custom */);
        int iMethod_7947 = 0;
        int i = 0;
        while (i < (int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11178, 2187790321288190822L ^ j) /* invoke-custom */) {
            class_1799 class_1799VarMethod_5438 = zf.v(j2).method_31548().method_5438(i);
            Intrinsics.checkNotNullExpressionValue(class_1799VarMethod_5438, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24361, 7245111314403700292L ^ j) /* invoke-custom */);
            ?? B2 = _gVarArr;
            if (j > 0) {
                if (B2 == 0) {
                    try {
                        try {
                            B2 = searcher.b(class_1799VarMethod_5438);
                            if (_gVarArr != null) {
                                return B2;
                            }
                            if (B2 != 0) {
                                iMethod_7947 += class_1799VarMethod_5438.method_7947();
                            }
                            i++;
                        } catch (NoWhenBranchMatchedException unused) {
                            B2 = (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B2, -5625134449236442654L, j) /* invoke-custom */;
                            throw B2;
                        }
                    } catch (NoWhenBranchMatchedException unused2) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B2, -5625134449236442654L, j) /* invoke-custom */;
                    }
                }
                B2 = _gVarArr;
            }
            if (B2 != 0) {
                break;
            }
        }
        return iMethod_7947;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 8118551606001844391L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        r0 = r0.method_5438(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 8118551606001844391L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        r18 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (r0 <= 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r0 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r18 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        if (r11.b(r18) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r18, 8118551606001844391L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c6, code lost:
    
        return new su.catlean.fg(r1, r17, true, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r18, 8118551606001844391L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d1, code lost:
    
        r17 = r17 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dc, code lost:
    
        if (r0 < 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e5, code lost:
    
        return su.catlean.fg.O.G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0044, code lost:
    
        if (r17 < call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/gg;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "g"}
            {METHOD_TYPE: (I, J)I}
        ).invoke(8828, 7804593736524813306L ^ r0)) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0047, code lost:
    
        r0 = (r0 > 0 ? 1 : (r0 == 0 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004a, code lost:
    
        if (r0 < 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004d, code lost:
    
        r0 = su.catlean.zf.F(r1).field_1724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
    
        if (r0 == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0059, code lost:
    
        r0 = r0.method_31548();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:5:0x0047, B:42:0x00d9], limit reached: 53 */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v19, types: [net.minecraft.class_746] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00dc -> B:5:0x0047). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final su.catlean.fg P(long r9, @org.jetbrains.annotations.NotNull su.catlean.n5 r11) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gg.P(long, su.catlean.n5):su.catlean.fg");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0076, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, -5415408409421282091L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0086, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
    
        r0 = r0.method_5438(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, -5415408409421282091L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        r21 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a1, code lost:
    
        if (r9 < 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        if (r0 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        if (r21 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
    
        r0 = r10.b(r21);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        if (r9 < 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r0 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d8, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r21, -5415408409421282091L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:
    
        if (r0 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e9, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r21, -5415408409421282091L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ea, code lost:
    
        r0 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fa, code lost:
    
        if (r0 >= call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/gg;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "g"}
            {METHOD_TYPE: (I, J)I}
        ).invoke(8828, 7804462944362567560L ^ r0)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
    
        r20 = r20 + 36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010d, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, -5415408409421282091L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011c, code lost:
    
        return new su.catlean.fg(r1, r20, true, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011d, code lost:
    
        r20 = r20 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0120, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x005f, code lost:
    
        if (r20 >= 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
    
        if (r0 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0127, code lost:
    
        if (r12 >= 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0130, code lost:
    
        return su.catlean.fg.O.G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0062, code lost:
    
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0063, code lost:
    
        if (r0 <= 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0066, code lost:
    
        r0 = su.catlean.zf.F(r1).field_1724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006f, code lost:
    
        if (r0 == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0072, code lost:
    
        r0 = r0.method_31548();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:5:0x0062, B:51:0x0125], limit reached: 64 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v22, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0127 -> B:5:0x0062). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final su.catlean.fg j(short r9, @org.jetbrains.annotations.NotNull su.catlean.n5 r10, short r11, int r12) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gg.j(short, su.catlean.n5, short, int):su.catlean.fg");
    }

    @NotNull
    public final fg U(long a2, @NotNull List items) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(items, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19060, 4005899812359164579L ^ j) /* invoke-custom */);
        return P(j ^ 68136080545853L, (v1) -> {
            return V(r1, v1);
        });
    }

    @NotNull
    public final fg Y(int a2, @NotNull class_1792[] items, int a3, char a4) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter(items, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19060, 4005904866845484089L ^ j) /* invoke-custom */);
        return P(j ^ 61705858920103L, (v1) -> {
            return w(r1, v1);
        });
    }

    @NotNull
    public final fg B(@NotNull List items, short a2, int a3, char a4) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ a;
        long j2 = j ^ 114977898525058L;
        int i = (int) ((j2 << 16) >>> 48);
        int i2 = (int) ((j2 << 32) >>> 32);
        Intrinsics.checkNotNullParameter(items, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20083, 8861407125440002938L ^ j) /* invoke-custom */);
        return j((short) (j >>> 48), (v1) -> {
            return W(r1, v1);
        }, (short) i, i2);
    }

    @NotNull
    public final fg o(@NotNull class_1792[] items, char a2, long a3) {
        long j = ((((long) a2) << 48) | ((a3 << 16) >>> 16)) ^ a;
        long j2 = j ^ 91050808020138L;
        int i = (int) ((j2 << 16) >>> 48);
        int i2 = (int) ((j2 << 32) >>> 32);
        Intrinsics.checkNotNullParameter(items, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19060, 4005888669917053510L ^ j) /* invoke-custom */);
        return j((short) (j >>> 48), (v1) -> {
            return L(r1, v1);
        }, (short) i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6 A[EDGE_INSN: B:14:0x00a6->B:12:0x00a6 BREAK  A[LOOP:0: B:3:0x0065->B:16:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6 A[EDGE_INSN: B:15:0x00a6->B:12:0x00a6 BREAK  A[LOOP:0: B:3:0x0065->B:16:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00a3 -> B:6:0x0076). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final su.catlean.fg H(long r10, @org.jetbrains.annotations.NotNull java.util.List r12) {
        /*
            r9 = this;
            long r0 = su.catlean.gg.a
            r1 = r10
            long r0 = r0 ^ r1
            r10 = r0
            r0 = r10
            r1 = r0; r1 = r0; 
            r2 = 64513567368182(0x3aacbc4423f6, double:3.18739373272836E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -3792166690596439385(0xcb5f847c95ee3aa7, double:-1.2075117023646744E55)
            r1 = r10
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r1 = r12
            r2 = 32442(0x7eba, float:4.5461E-41)
            r3 = 7302747256325829968(0x655891f021c27550, double:1.593029523991764E180)
            r4 = r10
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/gg;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "q"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r1 = r9
            r2 = r12
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r16 = r2
            r25 = r1
            r1 = 0
            r17 = r1
            r1 = r16
            r18 = r1
            r15 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r16
            r3 = 4355(0x1103, float:6.103E-42)
            r4 = 9166691904713120589(0x7f36a1b859dfdb4d, double:6.208020977681709E304)
            r5 = r10
            long r4 = r4 ^ r5
            int r3 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/gg;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "g"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r3, r4)
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r3)
            r1.<init>(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            r19 = r0
            r0 = 0
            r20 = r0
            r0 = r18
            java.util.Iterator r0 = r0.iterator()
            r21 = r0
        L65:
            r0 = r21
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L9e
            r0 = r21
            java.lang.Object r0 = r0.next()
        L76:
            r22 = r0
            r0 = r19
            r1 = r22
            net.minecraft.class_2248 r1 = (net.minecraft.class_2248) r1
            r23 = r1
            r1 = r15
            if (r1 != 0) goto La6
            r26 = r0
            r0 = 0
            r24 = r0
            r0 = r23
            net.minecraft.class_1792 r0 = r0.method_8389()
            r1 = r26
            r2 = r0; r0 = r1; r1 = r2; 
            boolean r0 = r0.add(r1)
            r0 = r15
            if (r0 == 0) goto L65
        L9e:
            r0 = r19
            r1 = r10
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L76
        La6:
            java.util.List r0 = (java.util.List) r0
            r1 = r25
            r2 = r0; r0 = r1; r1 = r2; 
            r2 = r13
            r3 = r2; r2 = r1; r1 = r3; 
            su.catlean.fg r0 = r0.U(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gg.H(long, java.util.List):su.catlean.fg");
    }

    @NotNull
    public final fg o(@NotNull class_2248[] blocks, long a2) {
        ArrayList arrayList;
        long j = a ^ a2;
        long j2 = j ^ 37334603764634L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8877614269766666955L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(blocks, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12709, 8448536519804881449L ^ j) /* invoke-custom */);
        ArrayList arrayList2 = new ArrayList(blocks.length);
        int i = 0;
        int length = blocks.length;
        while (i < length) {
            class_2248 class_2248Var = blocks[i];
            arrayList = arrayList2;
            if (_gVarArr != null) {
                break;
            }
            arrayList.add(class_2248Var.method_8389());
            i++;
            if (_gVarArr != null) {
                break;
            }
        }
        arrayList = arrayList2;
        if (j > 0) {
        }
        return U(j2, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00da A[EDGE_INSN: B:14:0x00da->B:12:0x00da BREAK  A[LOOP:0: B:3:0x009b->B:16:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00da A[EDGE_INSN: B:15:0x00da->B:12:0x00da BREAK  A[LOOP:0: B:3:0x009b->B:16:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00d7 -> B:6:0x00ac). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final su.catlean.fg r(byte r10, int r11, @org.jetbrains.annotations.NotNull java.util.List r12, int r13) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gg.r(byte, int, java.util.List, int):su.catlean.fg");
    }

    @NotNull
    public final fg O(int a2, short a3, @NotNull class_2248[] blocks, int a4) {
        ArrayList arrayList;
        long j = (((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a;
        long j2 = j ^ 85795162953136L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j2 << 16) >>> 32);
        int i3 = (int) ((j2 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(blocks, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32442, 7302807956485992155L ^ j) /* invoke-custom */);
        ArrayList arrayList2 = new ArrayList(blocks.length);
        int i4 = 0;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3398849203419340500L, j) /* invoke-custom */;
        int length = blocks.length;
        while (i4 < length) {
            class_2248 class_2248Var = blocks[i4];
            arrayList = arrayList2;
            if (_gVarArr != null) {
                break;
            }
            arrayList.add(class_2248Var.method_8389());
            i4++;
            if (_gVarArr != null) {
                break;
            }
        }
        arrayList = arrayList2;
        if (a4 >= 0) {
        }
        return B(arrayList, (short) i, i2, (char) i3);
    }

    public final void o(long j) {
        O = zf.v((a ^ j) ^ 78685578743396L).method_31548().method_67532();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    public final void d(long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 5420486027611L;
        ?? r0 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5839027264043327729L, j2) /* invoke-custom */;
        try {
            try {
                r0 = O;
                ?? r02 = r0;
                if (r0 == 0) {
                    if (r0 != -1) {
                        f(O, j3);
                    }
                    r02 = -1;
                }
                O = r02;
            } catch (NoWhenBranchMatchedException unused) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5851870124964831548L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused2) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5851870124964831548L, j2) /* invoke-custom */;
        }
    }

    public final void B(long a2, int slot) {
        long j = a ^ a2;
        o(j ^ 8057318228291L);
        f(slot, j ^ 74072632994408L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [su.catlean.fg] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [su.catlean.fg] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    @NotNull
    public final fg X(long a2, @NotNull n5 searcher, @NotNull f9 mode) {
        long j = a ^ a2;
        long j2 = j ^ 106633124093255L;
        long j3 = j ^ 28513782028597L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j3 << 16) >>> 48);
        int i3 = (int) ((j3 << 32) >>> 32);
        Object objP = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6707705711169744110L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(searcher, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10459, 3511925143752652156L ^ j) /* invoke-custom */);
        try {
            Intrinsics.checkNotNullParameter(mode, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18472, 7687240552458442129L ^ j) /* invoke-custom */);
            switch (w3.E[mode.ordinal()]) {
                case 1:
                case 2:
                    objP = P(j2, searcher);
                    return objP;
                case 3:
                case 4:
                    return j((short) i, searcher, (short) i2, i3);
                case AbstractJsonLexerKt.TC_COLON /* 5 */:
                case AbstractJsonLexerKt.TC_BEGIN_OBJ /* 6 */:
                    fg fgVarP = P(j2, searcher);
                    Object objR = fgVarP;
                    if (objP != 0) {
                        return objR;
                    }
                    try {
                        try {
                            objR = objR.R();
                            return objR != 0 ? fgVarP : j((short) i, searcher, (short) i2, i3);
                        } catch (NoWhenBranchMatchedException unused) {
                            objR = (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objR, 6712877262716398885L, j) /* invoke-custom */;
                            throw objR;
                        }
                    } catch (NoWhenBranchMatchedException unused2) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objR, 6712877262716398885L, j) /* invoke-custom */;
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (NoWhenBranchMatchedException unused3) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objP, 6712877262716398885L, j) /* invoke-custom */;
        }
        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objP, 6712877262716398885L, j) /* invoke-custom */;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x011f: INVOKE (r-1 I:su.catlean.gg), (r0 I:long), (r1 I:int), (r2 I:su.catlean.f9), (r3 I:kotlin.jvm.functions.Function0) VIRTUAL call: su.catlean.gg.T(long, int, su.catlean.f9, kotlin.jvm.functions.Function0):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final boolean m(@org.jetbrains.annotations.NotNull su.catlean.n5 r9, @org.jetbrains.annotations.NotNull su.catlean.f9 r10, long r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0 r13) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gg.m(su.catlean.n5, su.catlean.f9, long, kotlin.jvm.functions.Function0):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00f9: INVOKE (r-1 I:su.catlean.gg), (r0 I:long), (r1 I:int), (r2 I:su.catlean.f9), (r3 I:kotlin.jvm.functions.Function0) VIRTUAL call: su.catlean.gg.T(long, int, su.catlean.f9, kotlin.jvm.functions.Function0):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final boolean S(@org.jetbrains.annotations.NotNull net.minecraft.class_1792 r9, @org.jetbrains.annotations.NotNull su.catlean.f9 r10, long r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0 r13) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gg.S(net.minecraft.class_1792, su.catlean.f9, long, kotlin.jvm.functions.Function0):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x02ea, code lost:
    
        if (r0 != 0) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x029c A[Catch: NoWhenBranchMatchedException -> 0x02b2, NoWhenBranchMatchedException -> 0x02c2, FALL_THROUGH, TRY_ENTER, TryCatch #0 {NoWhenBranchMatchedException -> 0x02b2, blocks: (B:80:0x0286, B:84:0x029c), top: B:106:0x0286, outer: #6 }] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [su.catlean.gg] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [su.catlean.gg] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v41, types: [su.catlean.gg] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [int] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [int] */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83, types: [int] */
    /* JADX WARN: Type inference failed for: r0v84, types: [su.catlean.gg] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v94, types: [int] */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r1v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r9v0, types: [su.catlean.gg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(long r10, int r12, @org.jetbrains.annotations.NotNull su.catlean.f9 r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0 r14) {
        /*
            Method dump skipped, instruction units count: 775
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gg.T(long, int, su.catlean.f9, kotlin.jvm.functions.Function0):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [net.minecraft.class_636] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    public final void X(long a2, int slot) {
        int i;
        long j = a ^ a2;
        int i2 = (int) (j >>> 32);
        long j2 = ((j ^ 125646397432213L) << 32) >>> 32;
        long j3 = j ^ 122986483224730L;
        Object objZ = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4414479715626896572L, j) /* invoke-custom */;
        try {
            try {
                objZ = zf.Z(i2, j2);
                int i3 = zf.v(j3).field_7512.field_7763;
                int i4 = slot;
                int iG = (int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8828, 7804563990278988242L ^ j) /* invoke-custom */;
                if (objZ != 0) {
                    i = i4 + iG;
                } else if (i4 < iG) {
                    i4 = slot;
                    iG = (int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(340, 779923448058102515L ^ j) /* invoke-custom */;
                    i = i4 + iG;
                } else {
                    i = slot;
                }
                objZ.method_2906(i3, i, zf.v(j3).method_31548().method_67532(), class_1713.field_7791, zf.v(j3));
            } catch (NoWhenBranchMatchedException unused) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, -4430699164845444465L, j) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused2) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, -4430699164845444465L, j) /* invoke-custom */;
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
    public final void f(int r9, long r10) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gg.f(int, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [net.minecraft.class_634] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    public final void P(int slot, long a2) {
        long j = a ^ a2;
        Object objMethod_1562 = j;
        long j2 = objMethod_1562 ^ 21992541749540L;
        try {
            try {
                if (B != slot) {
                    objMethod_1562 = zf.F(j2).method_1562();
                    if (objMethod_1562 != 0) {
                        objMethod_1562.method_52787(new class_2868(slot));
                    }
                }
            } catch (NoWhenBranchMatchedException unused) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_1562, 6708857026232249623L, j) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused2) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_1562, 6708857026232249623L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0032, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0032, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [int, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [int] */
    /* JADX WARN: Type inference failed for: r0v48, types: [int] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v65, types: [int] */
    /* JADX WARN: Type inference failed for: r0v67, types: [int] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v26 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [int] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int O(long r9) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gg.O(long):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        if (r30 < call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/gg;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "g"}
            {METHOD_TYPE: (I, J)I}
        ).invoke(8828, 7804533023608455440L ^ r0)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        if (r0 != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        r0 = su.catlean.zf.F(r1).field_1724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        if (r0 == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 7079898735552680525L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        r0 = r0.method_31548();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 7079898735552680525L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        r0 = r0.method_5438(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 7079898735552680525L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        r31 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        if (r0 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        r0 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        if (r0 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c9, code lost:
    
        r0 = su.catlean.xa.N(r31, r1);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d2, code lost:
    
        if (r0 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 7079898735552680525L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (r0 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f1, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 7079898735552680525L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f2, code lost:
    
        r0 = r31.method_7909().method_57347().method_58694(net.minecraft.class_9334.field_50072);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        r0 = ((java.lang.Number) r0).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0118, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 7079898735552680525L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0119, code lost:
    
        r0 = ((float) r0) + net.minecraft.class_1890.method_8225((net.minecraft.class_6880) ((net.minecraft.class_2378) su.catlean.zf.z(r1).method_30349().method_46759(net.minecraft.class_1893.field_9118.method_58273()).get()).method_10223(net.minecraft.class_1893.field_9118.method_29177()).get(), r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0151, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0156, code lost:
    
        if (r0 <= 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0159, code lost:
    
        if (r0 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0161, code lost:
    
        if (r0 <= r29) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0171, code lost:
    
        r29 = r0;
        r28 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0179, code lost:
    
        r30 = r30 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017c, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017e, code lost:
    
        if (r0 == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0184, code lost:
    
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0187, code lost:
    
        r0 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018a, code lost:
    
        if (r0 != (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018d, code lost:
    
        r0 = su.catlean.fg.O.G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0193, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019d, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 7079898735552680525L, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:13:0x006b, B:63:0x0181], limit reached: 86 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [su.catlean.fg] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [int] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [su.catlean.fg] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0184 -> B:13:0x006b). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final su.catlean.fg R(long r15) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gg.R(long):su.catlean.fg");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, net.minecraft.class_1799] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final su.catlean.fg b(long r15) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gg.b(long):su.catlean.fg");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        if (r26 < call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/gg;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "g"}
            {METHOD_TYPE: (I, J)I}
        ).invoke(8828, 7804508457547174322L ^ r0)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        if (r0 != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        r0 = su.catlean.zf.F(r1).field_1724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (r0 == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 3666686677801730799L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        r0 = r0.method_31548();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 3666686677801730799L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        r0 = r0.method_5438(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 3666686677801730799L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        r27 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (r0 != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
    
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        r0 = r27.method_7909();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        if (r0 != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 3666686677801730799L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        if ((r0 instanceof net.minecraft.class_1743) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 3666686677801730799L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:
    
        r0 = r27.method_7909();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0, call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/gg;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "q"}
            {METHOD_TYPE: (I, J)Ljava/lang/String;}
        ).invoke(14850, 5667470890411411575L ^ r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0107, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 3666686677801730799L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0108, code lost:
    
        r0 = (net.minecraft.class_1743) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010d, code lost:
    
        r0 = r0;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0112, code lost:
    
        if (r0 < 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0115, code lost:
    
        if (r0 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0118, code lost:
    
        r0 = r0.method_57347().method_58694(net.minecraft.class_9334.field_50072);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0125, code lost:
    
        r0 = (java.lang.Integer) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0129, code lost:
    
        if (r0 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012f, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 3666686677801730799L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0138, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0139, code lost:
    
        r0 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0148, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 3666686677801730799L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014a, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014b, code lost:
    
        r0 = r0 + net.minecraft.class_1890.method_8225((net.minecraft.class_6880) su.catlean.zf.z(r1).method_30349().method_58561(net.minecraft.class_1893.field_9118).get(), r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016b, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0170, code lost:
    
        if (r0 <= 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0173, code lost:
    
        if (r0 != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017b, code lost:
    
        if (r0 <= r25) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
    
        r25 = r0;
        r24 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0193, code lost:
    
        r26 = r26 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0196, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0198, code lost:
    
        if (r0 == 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019e, code lost:
    
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a1, code lost:
    
        r0 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a4, code lost:
    
        if (r0 != (-1)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a7, code lost:
    
        r0 = su.catlean.fg.O.G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ad, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b7, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 3666686677801730799L, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:13:0x005d, B:80:0x019b], limit reached: 104 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [su.catlean.fg] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v72, types: [su.catlean.fg] */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x019e -> B:13:0x005d). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final su.catlean.fg g(long r15) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gg.g(long):su.catlean.fg");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x012a: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void r(int r12, long r13, int r15) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gg.r(int, long, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r3v0 */
    public static void N(long j, gg ggVar, int i, int i2, int i3, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 112377361654670L;
        ?? r0 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8562952620942460717L, j2) /* invoke-custom */;
        try {
            r0 = i3 & 2;
            ?? r11 = i2;
            ?? r02 = r0;
            if (r0 != 0) {
                r11 = r02;
            } else if (r0 != 0) {
                r02 = 1;
                r11 = r02;
            }
            ggVar.r(i, j3, r11 == true ? 1 : 0);
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 8569180802060306150L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00b9: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void O(int r13, int r14, int r15, int r16) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gg.O(int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r27v0 */
    public final void x(long j, int i, int i2) {
        long j2 = a ^ j;
        long j3 = j2 ^ 80057938857922L;
        long j4 = j2 ^ 41739411569245L;
        long j5 = j2 ^ 65012174429782L;
        long j6 = j2 ^ 114806501130724L;
        ?? r0 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1423869375092810298L, j2) /* invoke-custom */;
        int iMethod_67532 = (zf.v(j6).method_31548().method_67532() % (int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31781, 6319570057584668409L ^ j2) /* invoke-custom */) + 1;
        try {
            try {
                try {
                    r0 = zf.F(j3).field_1755 instanceof class_495;
                    ?? r02 = r0;
                    if (r0 == 0) {
                        if (r0 == 0) {
                            boolean z = zf.F(j3).field_1755 instanceof class_476;
                            r02 = z;
                            if (r0 == 0) {
                                r02 = z ? 1 : 0;
                            }
                        }
                    }
                    ?? r27 = r02;
                    try {
                        ag.e(i, j5, iMethod_67532, class_1713.field_7791, false, (int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10147, 6194561655817811321L ^ j2) /* invoke-custom */, null);
                        ag.e(i2, j5, iMethod_67532, class_1713.field_7791, false, (int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10147, 6194561655817811321L ^ j2) /* invoke-custom */, null);
                        r02 = i;
                        class_1713 class_1713Var = class_1713.field_7791;
                        boolean z2 = r27 == true ? 1 : 0;
                        if (r0 == 0) {
                            z2 = !z2;
                        }
                        ag.r(r02, iMethod_67532, class_1713Var, z2, j4);
                    } catch (NoWhenBranchMatchedException unused) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 1440299917654795249L, j2) /* invoke-custom */;
                    }
                } catch (NoWhenBranchMatchedException unused2) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 1440299917654795249L, j2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused3) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 1440299917654795249L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused4) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 1440299917654795249L, j2) /* invoke-custom */;
        }
    }

    private static final boolean V(List list, class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31525, 7842600123350081651L ^ (a ^ 60109200747112L)) /* invoke-custom */);
        return list.contains(class_1799Var.method_7909());
    }

    private static final boolean w(class_1792[] class_1792VarArr, class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31525, 7842728054120089860L ^ (a ^ 73071216558879L)) /* invoke-custom */);
        return ArraysKt.contains(class_1792VarArr, class_1799Var.method_7909());
    }

    private static final boolean W(List list, class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31525, 7842609677302036444L ^ (a ^ 68285544103367L)) /* invoke-custom */);
        return list.contains(class_1799Var.method_7909());
    }

    private static final boolean L(class_1792[] class_1792VarArr, class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1509, 5249445601235784427L ^ (a ^ 94296735884850L)) /* invoke-custom */);
        return ArraysKt.contains(class_1792VarArr, class_1799Var.method_7909());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    private static final boolean g(class_1799 class_1799Var) {
        long j = a ^ 4420937158436L;
        long j2 = j ^ 36232057696375L;
        long j3 = j ^ 94462863926001L;
        Object objN = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4515040738969177936L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(class_1799Var, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9828, 5818231784157632629L ^ j) /* invoke-custom */);
        try {
            try {
                try {
                    try {
                        objN = xa.N(class_1799Var, j3);
                        if (objN != 0) {
                            return objN;
                        }
                        if (objN == 0) {
                            try {
                                objN = xa.K(class_1799Var, j2);
                                if (objN != 0) {
                                    return objN;
                                }
                                try {
                                    if (objN == 0) {
                                        try {
                                            boolean z = class_1799Var.method_7909() instanceof class_1743;
                                            if (objN != 0) {
                                                return z;
                                            }
                                            if (!z) {
                                                boolean z2 = class_1799Var.method_7909() instanceof class_1821;
                                                if (objN != 0) {
                                                    return z2;
                                                }
                                                if (!z2) {
                                                    return false;
                                                }
                                            }
                                        } catch (NoWhenBranchMatchedException unused) {
                                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 4510008829186707099L, j) /* invoke-custom */;
                                        }
                                    }
                                } catch (NoWhenBranchMatchedException unused2) {
                                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 4510008829186707099L, j) /* invoke-custom */;
                                }
                            } catch (NoWhenBranchMatchedException unused3) {
                                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 4510008829186707099L, j) /* invoke-custom */;
                            }
                        }
                        return true;
                    } catch (NoWhenBranchMatchedException unused4) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 4510008829186707099L, j) /* invoke-custom */;
                    }
                } catch (NoWhenBranchMatchedException unused5) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 4510008829186707099L, j) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused6) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 4510008829186707099L, j) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused7) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 4510008829186707099L, j) /* invoke-custom */;
        }
    }

    static {
        int i;
        long j = a ^ 91196441282260L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(0, 8616787020908082901L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[21];
        int i3 = 0;
        String str = "zP8°\u0007àXc\u008c\u000fGM¸\u001adH\u0010æzÅ½Ì\t;pè]f\u0005p\u0088B\b \u0011à-Ô\u009eXû_øªýCÜ¿oVX xuæ^Þ0\u0006\u0011ÂçäæÀ\u000f\u0010Î§\u0098'ía\u008e/¤H\u0002(\u008a*.0\u0010\u0003|Ùä\u007fM[\u008dù\u0084×¤üq\u009aü\u0018N²\u001b}\u008cè\u0016¡¿6D\u001bþ¾gÕ>ºßÔïHêó\u0018<\u0091\u0087«\u0081\u0018<±\u00adß\u0089®JaÁ(Z\u0016\u0092\f\u0015D-X\u0018\u008c\u0011Ô_\no\u001e~?Îßq¡ÅôRâ\u0010ùe.KRæ((Ü\u008a\u0015\u0098à¼\u001dK\u0092t\u008dê J\u0018\u001c\u0081ØçöwÒö\t\u0097\u0001Üë\u0000\u00137¶3ªFi\u0095\u0005î\u00104\u0096ÿ\u0097\u008cß¿*Á\u009diFÒª\u0096æ a¸ÊÚSñSyýN\u00037åd;ù*x\u00ad¢;#\u009dà\u0092%\u0091°$þ0¡\u0010Ý\u0011MÂIIB\u009cjKæ\u0087Æ¦\u001a\t\u0010ã\u001esä\u0094ØB\n\u0013©¬\u0097Ý>ÿ\u0081(õ,âZ¦Æ\u0016ü«yüù'\u0002¹ ÕE\u008bO£ûÕoÀo\u0099×þÏ\u0080¥ß\u000f2\u0007|ZP\u0010\u0010q°×w\u0080µ¯adÕÈÍ.Á¢]\u0098^`×âgÙF'>|P\u007f9ýè\u0001\u0082 \u009aun?m,ÜçÁÙfT\u0082ð\u0019\\LÕ}C>ÓKÚÛ~\u0006x\u007f¯v¹b\u0010\u00999\u0002ðÕº\u008fç]?Éj\u0000mÊôRµ,¢Â:4\u001fjúpù@§©K\u009f \u0012È\fÏ¹c\n½\u0094ãLæ\u0017Ce\u0004\u008f&èY\u0086\u008bº\u000b&³ùÄ\u0083\u0089ì\u0002\u0004³\u0081\u009cpXû\u009d}Õ:\u000f\u009d\u0096ê\u0087*@mÜÖ¤¨E|xÙtð,\rµ\u001e$\u0010ek~\u0014À\u001b/\u0088}\u0082%pF'O^\u0010\u008a\bI\u0086\\5Î4Ç7\u009c\u0089?³\n\u008bp\u001en\u0007Þ \u0000JÛÚWô{Ë¡\u000e¦sêY²ZS/G\u0013ñ\u001fk¦mÞ¶hô¦{ý®\u0093É+P¹m\u0010Ë\u009eh\u008bÀ%\u0089E\u001crÎûFx\u0012èï\t9b\f¸æ%Åz\u009c\u0016\u0004\u0010¾0è\u001fo³ÂªFã¢\u0002¾ß~`z°\u0080Ê3ß\u008d{\u0092µ@{Ú\u008d°PÈ½W®Ú";
        int length = "zP8°\u0007àXc\u008c\u000fGM¸\u001adH\u0010æzÅ½Ì\t;pè]f\u0005p\u0088B\b \u0011à-Ô\u009eXû_øªýCÜ¿oVX xuæ^Þ0\u0006\u0011ÂçäæÀ\u000f\u0010Î§\u0098'ía\u008e/¤H\u0002(\u008a*.0\u0010\u0003|Ùä\u007fM[\u008dù\u0084×¤üq\u009aü\u0018N²\u001b}\u008cè\u0016¡¿6D\u001bþ¾gÕ>ºßÔïHêó\u0018<\u0091\u0087«\u0081\u0018<±\u00adß\u0089®JaÁ(Z\u0016\u0092\f\u0015D-X\u0018\u008c\u0011Ô_\no\u001e~?Îßq¡ÅôRâ\u0010ùe.KRæ((Ü\u008a\u0015\u0098à¼\u001dK\u0092t\u008dê J\u0018\u001c\u0081ØçöwÒö\t\u0097\u0001Üë\u0000\u00137¶3ªFi\u0095\u0005î\u00104\u0096ÿ\u0097\u008cß¿*Á\u009diFÒª\u0096æ a¸ÊÚSñSyýN\u00037åd;ù*x\u00ad¢;#\u009dà\u0092%\u0091°$þ0¡\u0010Ý\u0011MÂIIB\u009cjKæ\u0087Æ¦\u001a\t\u0010ã\u001esä\u0094ØB\n\u0013©¬\u0097Ý>ÿ\u0081(õ,âZ¦Æ\u0016ü«yüù'\u0002¹ ÕE\u008bO£ûÕoÀo\u0099×þÏ\u0080¥ß\u000f2\u0007|ZP\u0010\u0010q°×w\u0080µ¯adÕÈÍ.Á¢]\u0098^`×âgÙF'>|P\u007f9ýè\u0001\u0082 \u009aun?m,ÜçÁÙfT\u0082ð\u0019\\LÕ}C>ÓKÚÛ~\u0006x\u007f¯v¹b\u0010\u00999\u0002ðÕº\u008fç]?Éj\u0000mÊôRµ,¢Â:4\u001fjúpù@§©K\u009f \u0012È\fÏ¹c\n½\u0094ãLæ\u0017Ce\u0004\u008f&èY\u0086\u008bº\u000b&³ùÄ\u0083\u0089ì\u0002\u0004³\u0081\u009cpXû\u009d}Õ:\u000f\u009d\u0096ê\u0087*@mÜÖ¤¨E|xÙtð,\rµ\u001e$\u0010ek~\u0014À\u001b/\u0088}\u0082%pF'O^\u0010\u008a\bI\u0086\\5Î4Ç7\u009c\u0089?³\n\u008bp\u001en\u0007Þ \u0000JÛÚWô{Ë¡\u000e¦sêY²ZS/G\u0013ñ\u001fk¦mÞ¶hô¦{ý®\u0093É+P¹m\u0010Ë\u009eh\u008bÀ%\u0089E\u001crÎûFx\u0012èï\t9b\f¸æ%Åz\u009c\u0016\u0004\u0010¾0è\u001fo³ÂªFã¢\u0002¾ß~`z°\u0080Ê3ß\u008d{\u0092µ@{Ú\u008d°PÈ½W®Ú".length();
        char cCharAt = 16;
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
                            c = new String[21];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[15];
                            int i9 = 0;
                            String str3 = "Ø_|Á¬½\u00912\u0086÷~ñq\u0019ñI*\u009e\u0007Á\u0084:f.\u00196bÕê.\u00931ÿ\u00ad\txüË¾\u0090°\u000eÂIÛ\u009aNl÷.áð¡\u0085ÀÙ<Il\u0089Hxß´\u0086\u0099[t\\\u00858\u0097@m\u0097'\u0092\u0085?\u0087%\u0081òñ¿\u001d¥öKê3Á\u009c3\u0089á¾\u009aÜC\u0010T\u008a\u0096";
                            int length2 = "Ø_|Á¬½\u00912\u0086÷~ñq\u0019ñI*\u009e\u0007Á\u0084:f.\u00196bÕê.\u00931ÿ\u00ad\txüË¾\u0090°\u000eÂIÛ\u009aNl÷.áð¡\u0085ÀÙ<Il\u0089Hxß´\u0086\u0099[t\\\u00858\u0097@m\u0097'\u0092\u0085?\u0087%\u0081òñ¿\u001d¥öKê3Á\u009c3\u0089á¾\u009aÜC\u0010T\u008a\u0096".length();
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
                                                f = new Integer[15];
                                                P = new gg();
                                                B = -1;
                                                O = -1;
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "\u00ad\u0085¸\u0005b\u0083Óþ\b}\u0002\\M\u008aAñ";
                                                length2 = "\u00ad\u0085¸\u0005b\u0083Óþ\b}\u0002\\M\u008aAñ".length();
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
                        str = "Ë\u009fZåÚ\u0086\u0003\u009c-P/§2ÙdC\u0010\u0081\u0019¼2¼\u0090´Ä\u001a«ôÜ\u0087M\u0002\u0097";
                        length = "Ë\u009fZåÚ\u0086\u0003\u009c-P/§2ÙdC\u0010\u0081\u0019¼2¼\u0090´Ä\u001a«ôÜ\u0087M\u0002\u0097".length();
                        cCharAt = 16;
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

    public static void F(int i) {
        r = i;
    }

    public static int M() {
        return r;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int U() {
        return M() == 0 ? 96 : 0;
    }

    private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException noWhenBranchMatchedException) {
        return noWhenBranchMatchedException;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 16882;
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
                throw new RuntimeException("su/catlean/gg", e2);
            }
        }
        return c[i2];
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
            java.lang.String r1 = "su/catlean/gg"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gg.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 81;
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
                    throw new RuntimeException("su/catlean/gg", e2);
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
            java.lang.String r1 = "su/catlean/gg"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gg.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
