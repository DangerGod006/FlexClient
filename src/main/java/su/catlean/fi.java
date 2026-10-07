package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/fi.class */
public final class fi extends class_437 {

    @NotNull
    public static final fi C;
    private static boolean w;

    @NotNull
    private static final List H;

    @Nullable
    private static dj D;

    @NotNull
    private static fd p;

    @NotNull
    private static fd z;
    private static boolean I;
    private static boolean i;
    private static int X;
    private static int R;
    private static int n;
    private static final long a = yz.a(-5088834823080897051L, 1229873288916935859L, MethodHandles.lookup().lookupClass()).a(86875423871911L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    private fi(long j) {
        super(class_2561.method_30163((String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4574, 1689014234737857992L ^ (a ^ j)) /* invoke-custom */));
    }

    public final boolean V() {
        return w;
    }

    public final void A(boolean z2) {
        w = z2;
    }

    @Nullable
    public final dj F() {
        return D;
    }

    public final void o(@Nullable dj djVar) {
        D = djVar;
    }

    public void method_25394(@NotNull class_332 context, int mX, int mY, float delta) {
        long j = a ^ 90850974972160L;
        long j2 = j ^ 31348639938127L;
        Intrinsics.checkNotNullParameter(context, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7574, 7466334331026998931L ^ j) /* invoke-custom */);
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2114587376050845898L, j) /* invoke-custom */;
        X = mX;
        R = mY;
        Object obj = str;
        if (obj != null) {
            try {
                obj = D;
                if (obj != null) {
                    C.v(context, j2);
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2121285096040097525L, j) /* invoke-custom */;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0322: INVOKE 
          (r-1 I:su.catlean.c6)
          (r0 I:net.minecraft.class_332)
          (r1 I:java.lang.String)
          (r2 I:long)
          (r3 I:float)
          (r4 I:float)
          (r5 I:java.awt.Color)
         VIRTUAL call: su.catlean.c6.e(net.minecraft.class_332, java.lang.String, long, float, float, java.awt.Color):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void v(@org.jetbrains.annotations.NotNull net.minecraft.class_332 r16, long r17) {
        /*
            Method dump skipped, instruction units count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.fi.v(net.minecraft.class_332, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.dj] */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public void method_25393() {
        long j = a ^ 60998048568577L;
        long j2 = j ^ 138472612656062L;
        int i2 = (int) (j >>> 48);
        int i3 = (int) ((j2 << 16) >>> 32);
        int i4 = (int) ((j2 << 48) >>> 48);
        ?? K = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8167809920479679691L, j) /* invoke-custom */;
        super.method_25393();
        try {
            K = D;
            if (K != 0) {
                return;
            }
            try {
                K = bx.k((short) i2, i3, (char) i4, (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26365, 7050265215486732328L ^ j) /* invoke-custom */);
                ?? K2 = K;
                if (K != 0) {
                    if (K != 0) {
                        for (ry ryVar : H) {
                            ?? r0 = 0;
                            try {
                                ryVar.L(ryVar.A() - (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10731, 4424201014553929528L ^ j) /* invoke-custom */);
                                r0 = K;
                                if (r0 == 0 || K == 0) {
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 8174372336651176692L, j) /* invoke-custom */;
                            }
                        }
                    }
                    K2 = bx.k((short) i2, i3, (char) i4, (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14975, 7156134140390929577L ^ j) /* invoke-custom */);
                }
                ?? K3 = K2;
                if (K != 0) {
                    if (K2 != 0) {
                        for (ry ryVar2 : H) {
                            ?? r02 = 0;
                            try {
                                ryVar2.L(ryVar2.A() + (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10731, 4424201014553929528L ^ j) /* invoke-custom */);
                                r02 = K;
                                if (r02 == 0 || K == 0) {
                                    break;
                                }
                            } catch (NumberFormatException unused2) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 8174372336651176692L, j) /* invoke-custom */;
                            }
                        }
                    }
                    K3 = bx.k((short) i2, i3, (char) i4, (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6199, 2862471139723794149L ^ j) /* invoke-custom */);
                }
                ?? K4 = K3;
                if (K != 0) {
                    if (K3 != 0) {
                        for (ry ryVar3 : H) {
                            ?? r03 = 0;
                            try {
                                ryVar3.J(ryVar3.W() - (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10731, 4424201014553929528L ^ j) /* invoke-custom */);
                                r03 = K;
                                if (r03 == 0 || K == 0) {
                                    break;
                                }
                            } catch (NumberFormatException unused3) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r03, 8174372336651176692L, j) /* invoke-custom */;
                            }
                        }
                    }
                    K4 = bx.k((short) i2, i3, (char) i4, (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1033, 6980108885794933465L ^ j) /* invoke-custom */);
                }
                if (K4 != 0) {
                    for (ry ryVar4 : H) {
                        ?? r04 = 0;
                        try {
                            ryVar4.J(ryVar4.W() + (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10731, 4424201014553929528L ^ j) /* invoke-custom */);
                            r04 = K;
                            if (r04 != 0 && K != 0) {
                            }
                            return;
                        } catch (NumberFormatException unused4) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r04, 8174372336651176692L, j) /* invoke-custom */;
                        }
                    }
                }
            } catch (NumberFormatException unused5) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(K, 8174372336651176692L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused6) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(K, 8174372336651176692L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0157 A[EDGE_INSN: B:83:0x0157->B:56:0x0157 BREAK  A[LOOP:2: B:6:0x0050->B:85:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[LOOP:3: B:23:0x00a9->B:88:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v57, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void W(su.catlean.fu r8, long r9) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.fi.W(su.catlean.fu, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0 A[EDGE_INSN: B:47:0x00e0->B:34:0x00e0 BREAK  A[LOOP:1: B:4:0x003d->B:48:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:3: B:9:0x006e->B:52:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [su.catlean.ry] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00dd -> B:12:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(@org.jetbrains.annotations.NotNull su.catlean._g r9, long r10) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.fi.d(su.catlean._g, long):void");
    }

    public final void x(@NotNull _g module, long a2) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(module, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19700, 4504926825407726112L ^ j) /* invoke-custom */);
        W(module.N(), j ^ 93373027211500L);
        bo.S.Y().execute(new xg((int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20167, 1765191286417127884L ^ j) /* invoke-custom */, module));
    }

    public boolean method_25421() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean.dj] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.dj] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    public boolean method_25402(@NotNull class_11909 class_11909Var, boolean z2) {
        long j = a ^ 27769132021556L;
        long j2 = j ^ 16498284735137L;
        long j3 = j ^ 81118353809837L;
        long j4 = j ^ 120974204887591L;
        Intrinsics.checkNotNullParameter(class_11909Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16806, 3071273534395683988L ^ j) /* invoke-custom */);
        double dComp_4798 = class_11909Var.comp_4798();
        ?? H2 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3211966060703910146L, j) /* invoke-custom */;
        double dComp_4799 = class_11909Var.comp_4799();
        int iMethod_74245 = class_11909Var.method_74245();
        try {
            try {
                H2 = D;
                ?? r0 = H2;
                if (H2 != 0) {
                    if (H2 == 0) {
                        try {
                            H2 = tm.R.H(j3, dComp_4798, dComp_4799, iMethod_74245);
                            if (H2 == 0) {
                                return H2;
                            }
                            if (H2 == 0) {
                                for (ry ryVar : H) {
                                    ?? r02 = 0;
                                    try {
                                        ryVar.b(dComp_4798, dComp_4799, j4, iMethod_74245);
                                        r02 = H2;
                                        if (r02 == 0 || H2 == 0) {
                                            break;
                                        }
                                    } catch (NumberFormatException unused) {
                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -3223422368476813119L, j) /* invoke-custom */;
                                    }
                                }
                            }
                            return super.method_25402(class_11909Var, z2);
                        } catch (NumberFormatException unused2) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(H2, -3223422368476813119L, j) /* invoke-custom */;
                        }
                    }
                    dj djVar = D;
                    Intrinsics.checkNotNull(djVar);
                    r0 = djVar;
                }
                r0.T(j2, (int) dComp_4798, (int) dComp_4799, iMethod_74245);
                return false;
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(H2, -3223422368476813119L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(H2, -3223422368476813119L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
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
    public boolean method_25406(@NotNull class_11909 class_11909Var) {
        Object objMethod_25406;
        long j = a ^ 20494912170722L;
        long j2 = j ^ 36444356919255L;
        long j3 = j ^ 14581077137982L;
        Intrinsics.checkNotNullParameter(class_11909Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21760, 3726020062460239343L ^ j) /* invoke-custom */);
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8161993667462321368L, j) /* invoke-custom */;
        double dComp_4798 = class_11909Var.comp_4798();
        double dComp_4799 = class_11909Var.comp_4799();
        int iMethod_74245 = class_11909Var.method_74245();
        try {
            for (ry ryVar : H) {
                String str2 = null;
                try {
                    ryVar.I(dComp_4798, dComp_4799, iMethod_74245, j3);
                    str2 = str;
                    objMethod_25406 = str2;
                    if (str2 != null) {
                        if (str == null) {
                            break;
                        }
                    }
                    break;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(str2, -8173451074369325801L, j) /* invoke-custom */;
                }
            }
            break;
            objMethod_25406 = super.method_25406(class_11909Var);
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8183103076139101954L, j) /* invoke-custom */ != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("ZKIqm", -8212304636275471386L, j) /* invoke-custom */;
            }
            return objMethod_25406;
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_25406, -8173451074369325801L, j) /* invoke-custom */;
        }
        tm tmVar = tm.R;
        tmVar.r(j2, dComp_4798, dComp_4799, iMethod_74245);
        objMethod_25406 = tmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [su.catlean.dj] */
    /* JADX WARN: Type inference failed for: r0v15, types: [su.catlean.dj] */
    /* JADX WARN: Type inference failed for: r0v26, types: [su.catlean.tm] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
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
    public boolean method_25404(@NotNull class_11908 class_11908Var) {
        long j = a ^ 35749138686629L;
        long j2 = j ^ 97968705785852L;
        long j3 = j ^ 95433993264903L;
        long j4 = j ^ 54139714783155L;
        Intrinsics.checkNotNullParameter(class_11908Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2562, 7466641897052031653L ^ j) /* invoke-custom */);
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5115513171358540655L, j) /* invoke-custom */;
        int iComp_4795 = class_11908Var.comp_4795();
        int iComp_4796 = class_11908Var.comp_4796();
        ?? Comp_4797 = class_11908Var.comp_4797();
        try {
            try {
                Comp_4797 = D;
                ?? r0 = Comp_4797;
                if (str != null) {
                    if (Comp_4797 == 0) {
                        for (ry ryVar : H) {
                            String str2 = null;
                            try {
                                ryVar.O(iComp_4795, j3);
                                str2 = str;
                                if (str2 == null) {
                                    break;
                                }
                                if (str == null) {
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(str2, 5104024982161046864L, j) /* invoke-custom */;
                            }
                        }
                        tm.R.U(j4, iComp_4795, iComp_4796, Comp_4797);
                        return super.method_25404(class_11908Var);
                    }
                    dj djVar = D;
                    Intrinsics.checkNotNull(djVar);
                    r0 = djVar;
                }
                r0.w(iComp_4795, j2);
                return false;
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Comp_4797, 5104024982161046864L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Comp_4797, 5104024982161046864L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r0v14, types: [char] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dj] */
    /* JADX WARN: Type inference failed for: r0v20, types: [su.catlean.dj] */
    /* JADX WARN: Type inference failed for: r0v32, types: [su.catlean.tm] */
    /* JADX WARN: Type inference failed for: r0v36, types: [su.catlean.ry] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean method_25400(@NotNull class_11905 class_11905Var) {
        long j = a ^ 112720805612441L;
        long j2 = j ^ 132926351941604L;
        int i2 = (int) (j >>> 32);
        int i3 = (int) ((j2 << 32) >>> 48);
        int i4 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 108776984765701L;
        long j4 = j ^ 68459193348096L;
        ?? FirstOrNull = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1170458543614211501L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(class_11905Var, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27646, 5619396007940325996L ^ j) /* invoke-custom */);
        try {
            FirstOrNull = FirstOrNull;
            if (FirstOrNull != 0) {
                try {
                    String strMethod_74226 = class_11905Var.method_74226();
                    Intrinsics.checkNotNullExpressionValue(strMethod_74226, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9262, 2133199214421069238L ^ j) /* invoke-custom */);
                    char[] charArray = strMethod_74226.toCharArray();
                    Intrinsics.checkNotNullExpressionValue(charArray, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1200, 1118398697205067040L ^ j) /* invoke-custom */);
                    FirstOrNull = ArraysKt.firstOrNull(charArray);
                    if (FirstOrNull != 0) {
                        ?? CharValue = FirstOrNull.charValue();
                        try {
                            try {
                                CharValue = D;
                                ?? r0 = CharValue;
                                if (FirstOrNull != 0) {
                                    if (CharValue == 0) {
                                        for (?? r02 : H) {
                                            ?? r03 = 0;
                                            try {
                                                r02.V(i2, CharValue, (short) i3, i4);
                                                r03 = FirstOrNull;
                                                if (r03 == 0) {
                                                    break;
                                                }
                                                if (FirstOrNull == 0) {
                                                    break;
                                                }
                                            } catch (NumberFormatException unused) {
                                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r03, -1159283646251133844L, j) /* invoke-custom */;
                                            }
                                        }
                                        tm.R.D(CharValue, j3);
                                        return super.method_25400(class_11905Var);
                                    }
                                    dj djVar = D;
                                    Intrinsics.checkNotNull(djVar);
                                    r0 = djVar;
                                }
                                r0.I(j4, CharValue);
                                return super.method_25400(class_11905Var);
                            } catch (NumberFormatException unused2) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(CharValue, -1159283646251133844L, j) /* invoke-custom */;
                            }
                        } catch (NumberFormatException unused3) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(CharValue, -1159283646251133844L, j) /* invoke-custom */;
                        }
                    }
                } catch (NumberFormatException unused4) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(FirstOrNull, -1159283646251133844L, j) /* invoke-custom */;
                }
            }
            return super.method_25400(class_11905Var);
        } catch (NumberFormatException unused5) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(FirstOrNull, -1159283646251133844L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.dj] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [su.catlean.dj] */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r30v6 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public boolean method_25401(double d2, double d3, double d4, double d5) {
        ?? X2;
        long j = a ^ 105260294514479L;
        long j2 = j ^ 110419225213561L;
        long j3 = j ^ 136261308622220L;
        long j4 = j ^ 78636405686046L;
        ?? B = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8973550793518438683L, j) /* invoke-custom */;
        try {
            try {
                B = D;
                ?? r0 = B;
                if (B != 0) {
                    if (B == 0) {
                        try {
                            try {
                                B = tm.R.b(d2, d3, j2, d5);
                                ?? r02 = B;
                                if (B != 0) {
                                    if (B != 0) {
                                        return super.method_25401(d2, d3, d4, d5);
                                    }
                                    r02 = 0;
                                }
                                ?? r30 = r02;
                                for (ry ryVar : H) {
                                    X2 = B;
                                    r30 = r30;
                                    if (X2 != 0) {
                                        try {
                                            try {
                                                X2 = ryVar.X(d2, d3, d5, d4, j3);
                                                if (B == 0) {
                                                    break;
                                                }
                                                r30 = r30;
                                                if (X2 != 0) {
                                                    r30 = 1;
                                                }
                                            } catch (NumberFormatException unused) {
                                                X2 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(X2, -8980357334808299302L, j) /* invoke-custom */;
                                                throw X2;
                                            }
                                        } catch (NumberFormatException unused2) {
                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(X2, -8980357334808299302L, j) /* invoke-custom */;
                                        }
                                    }
                                    if (B == 0) {
                                        break;
                                    }
                                }
                                X2 = r30;
                                if (B == 0) {
                                    return X2;
                                }
                                if (X2 == 0) {
                                    for (ry ryVar2 : H) {
                                        ?? r03 = 0;
                                        try {
                                            ryVar2.d(d5, d4);
                                            r03 = B;
                                            if (r03 == 0 || B == 0) {
                                                break;
                                            }
                                        } catch (NumberFormatException unused3) {
                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r03, -8980357334808299302L, j) /* invoke-custom */;
                                        }
                                    }
                                }
                                return super.method_25401(d2, d3, d4, d5);
                            } catch (NumberFormatException unused4) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, -8980357334808299302L, j) /* invoke-custom */;
                            }
                        } catch (NumberFormatException unused5) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, -8980357334808299302L, j) /* invoke-custom */;
                        }
                    }
                    dj djVar = D;
                    Intrinsics.checkNotNull(djVar);
                    r0 = djVar;
                }
                r0.a(d2, d3, d5, j4);
                return super.method_25401(d2, d3, d4, d5);
            } catch (NumberFormatException unused6) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, -8980357334808299302L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused7) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B, -8980357334808299302L, j) /* invoke-custom */;
        }
    }

    public void method_25419() {
        long j = a ^ 106407135984678L;
        long j2 = j ^ 76546194668000L;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7458325583108981268L, j) /* invoke-custom */;
        Iterator it = H.iterator();
        while (it.hasNext()) {
            String str2 = null;
            try {
                ((ry) it.next()).d(j2);
                str2 = str;
                if (str2 == null) {
                    return;
                }
                if (str == null) {
                    break;
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(str2, -7469673081794894893L, j) /* invoke-custom */;
            }
        }
        w = false;
        I = true;
        i = false;
    }

    protected void method_57734(@NotNull class_332 context) {
        Intrinsics.checkNotNullParameter(context, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7574, 7466290876802806909L ^ (a ^ 135078578359278L)) /* invoke-custom */);
    }

    public void method_25420(@NotNull class_332 context, int mouseX, int mouseY, float deltaTicks) {
        Intrinsics.checkNotNullParameter(context, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7574, 7466266102744219794L ^ (a ^ 119101718544129L)) /* invoke-custom */);
    }

    public static final List P() {
        return H;
    }

    static {
        int i2;
        long j = a ^ 107832039035801L;
        int i3 = (int) (j >>> 48);
        long j2 = ((j ^ 109020214640157L) << 16) >>> 16;
        long j3 = j ^ 7665279275095L;
        long j4 = j ^ 103207055283585L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(0, -637148985718414577L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i4 = 1; i4 < 8; i4++) {
            bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[15];
        int i5 = 0;
        String str = "w_¦\u0090uV·r4gY\u000fë\u0095Àß\u0010\u0097é~\u0006»i]\u0093¤\u0086\u0003\u008er\u0003¹\u0096\u0010þ\u0096ç¾XHÌË¹¨|'=4\u0014ó(½*ï÷T\u00179ªk´ã×\u009e(zV\u009fw\u009dú®_\u0004söÈOF\u000e*aPá{ÑN,G®÷\u0010h°9lz³\"nJUc\rçg\u00114\u0010X\u0002\u00870\u009dýdÈF\u009d\u0004;F\\ÌÏ(j \u001c©qÙÐG:çî\u0087Ëfmbô;Ý8°ãÌórLÔ»Mb\bÿï7T\u0082{\u0091pÝĈ6ïÆ\u0087¡\u0011}\u000eÆ\t)\u001bç_2¯\u0006K¼\u000b¢ùë\u000b\u0007k\u0082öqô\u0089\u0017\u008a-\u0094@\\»ä$W:½2\u0098£\u0081£ÈA0TÌ?m}o^Q\u001aìÇl\u0095`ûÐÊÛ&ùf\u0080w|?÷ç=96\u001bLwrÇ 8\u009bª¼\u0089bV\u0094î\u0091\u0004lj4\u0019\u000b\n\u009dÍ\u00946\u008bÖtëºò\rÚ×ýº\u00007[\u0001Ó5\u0001|ñ\u009b½\u0098!\u0001Üs ¡¦\u0013~QKøLÃ\u000f\u0016\u001e!\u0091\rªanw[Þ~+öMÅ\u0017ÓþWâ!\u008e\u001dð\u0000*q=§TpÅ\u008cà=\u008aÓ_õáiç©ü\u009fñ\u0083Iúuq\u008d¥\u0015b\u0013cÎ~\u0019\u000b2D`²½\u009bS¶Ï)y Ðà\u0014Vªw°ÿ\u0081Óq£î\f{3øÜIè%í%í\u0018ôl\u0083 IRØ\u0005¶Y\u001cßî}\u0087Ze\u0088\u001f\u0010\u000bà·Ä0\u0014ÏÒúú\u009dÃcÞQó\u0010VÞÌ\u0007D*¥j\u009b2¸\u0082\u008a*\rp\u0010!Û{á!¹\u001a\u0091$Ö\u00808Ød\u0098ÿ8\u008c\u008fþ\u0002NÏ(U¯OX#à{\u000eõûFìZLµhu-Y*QQ¥ûY\u008dí\u009bcÔª\u0087\u0093¹G:Êf\u001fÏK\u0084)Â]3*\u000e³\u0010>QMé5¯\u0080¬¡¤Ä\u0007óï3\\";
        int length = "w_¦\u0090uV·r4gY\u000fë\u0095Àß\u0010\u0097é~\u0006»i]\u0093¤\u0086\u0003\u008er\u0003¹\u0096\u0010þ\u0096ç¾XHÌË¹¨|'=4\u0014ó(½*ï÷T\u00179ªk´ã×\u009e(zV\u009fw\u009dú®_\u0004söÈOF\u000e*aPá{ÑN,G®÷\u0010h°9lz³\"nJUc\rçg\u00114\u0010X\u0002\u00870\u009dýdÈF\u009d\u0004;F\\ÌÏ(j \u001c©qÙÐG:çî\u0087Ëfmbô;Ý8°ãÌórLÔ»Mb\bÿï7T\u0082{\u0091pÝĈ6ïÆ\u0087¡\u0011}\u000eÆ\t)\u001bç_2¯\u0006K¼\u000b¢ùë\u000b\u0007k\u0082öqô\u0089\u0017\u008a-\u0094@\\»ä$W:½2\u0098£\u0081£ÈA0TÌ?m}o^Q\u001aìÇl\u0095`ûÐÊÛ&ùf\u0080w|?÷ç=96\u001bLwrÇ 8\u009bª¼\u0089bV\u0094î\u0091\u0004lj4\u0019\u000b\n\u009dÍ\u00946\u008bÖtëºò\rÚ×ýº\u00007[\u0001Ó5\u0001|ñ\u009b½\u0098!\u0001Üs ¡¦\u0013~QKøLÃ\u000f\u0016\u001e!\u0091\rªanw[Þ~+öMÅ\u0017ÓþWâ!\u008e\u001dð\u0000*q=§TpÅ\u008cà=\u008aÓ_õáiç©ü\u009fñ\u0083Iúuq\u008d¥\u0015b\u0013cÎ~\u0019\u000b2D`²½\u009bS¶Ï)y Ðà\u0014Vªw°ÿ\u0081Óq£î\f{3øÜIè%í%í\u0018ôl\u0083 IRØ\u0005¶Y\u001cßî}\u0087Ze\u0088\u001f\u0010\u000bà·Ä0\u0014ÏÒúú\u009dÃcÞQó\u0010VÞÌ\u0007D*¥j\u009b2¸\u0082\u008a*\rp\u0010!Û{á!¹\u001a\u0091$Ö\u00808Ød\u0098ÿ8\u008c\u008fþ\u0002NÏ(U¯OX#à{\u000eõûFìZLµhu-Y*QQ¥ûY\u008dí\u009bcÔª\u0087\u0093¹G:Êf\u001fÏK\u0084)Â]3*\u000e³\u0010>QMé5¯\u0080¬¡¤Ä\u0007óï3\\".length();
        char cCharAt = 16;
        int i6 = -1;
        while (true) {
            int i7 = i6 + 1;
            String strSubstring = str.substring(i7, i7 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i8 = i5;
                        i5++;
                        strArr[i8] = strIntern;
                        int i9 = i7 + cCharAt;
                        i2 = i9;
                        if (i9 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            b = strArr;
                            c = new String[15];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i10 = 1; i10 < 8; i10++) {
                                bArr2[i10] = (byte) ((j << (i10 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[7];
                            int i11 = 0;
                            String str3 = "\u001cõ3ø\nÂy«¥¶ø\\\u009côdo\u0088;)Fè¦\u000e\u0099\u0007W\u0089É\u001då\u00991 \u008fÐªÑpy~";
                            int length2 = "\u001cõ3ø\nÂy«¥¶ø\\\u009côdo\u0088;)Fè¦\u000e\u0099\u0007W\u0089É\u001då\u00991 \u008fÐªÑpy~".length();
                            int i12 = 0;
                            while (true) {
                                int i13 = i12;
                                i12 += 8;
                                byte[] bytes = str3.substring(i13, i12).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i14 = i11;
                                i11++;
                                long j5 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j6 = j5;
                                    int i15 = i14;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j6 >>> 56), (byte) (j6 >>> 48), (byte) (j6 >>> 40), (byte) (j6 >>> 32), (byte) (j6 >>> 24), (byte) (j6 >>> 16), (byte) (j6 >>> 8), (byte) j6});
                                    long j7 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i15) {
                                        case 0:
                                            jArr2[b5] = j7;
                                            if (i12 >= length2) {
                                                e = jArr;
                                                f = new Integer[7];
                                                Cipher cipher3 = Cipher.getInstance("DES/CBC/NoPadding");
                                                SecretKeyFactory secretKeyFactory3 = SecretKeyFactory.getInstance("DES");
                                                byte[] bArr3 = new byte[8];
                                                bArr3[0] = (byte) (j >>> 56);
                                                for (int i16 = 1; i16 < 8; i16++) {
                                                    bArr3[i16] = (byte) ((j << (i16 * 8)) >>> 56);
                                                }
                                                cipher3.init(2, secretKeyFactory3.generateSecret(new DESKeySpec(bArr3)), new IvParameterSpec(new byte[8]));
                                                long[] jArr3 = new long[2];
                                                int i17 = 0;
                                                int length3 = "\u0002o\u0085\u001a¬\"/\u008aï£ÕZ\u0006\u0012od".length();
                                                int i18 = 0;
                                                do {
                                                    int i19 = i18;
                                                    i18 += 8;
                                                    byte[] bytes2 = "\u0002o\u0085\u001a¬\"/\u008aï£ÕZ\u0006\u0012od".substring(i19, i18).getBytes("ISO-8859-1");
                                                    i17++;
                                                    byte[] bArrDoFinal2 = cipher3.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255))});
                                                    jArr3[-1] = ((((long) bArrDoFinal2[0]) & 255) << 56) | ((((long) bArrDoFinal2[1]) & 255) << 48) | ((((long) bArrDoFinal2[2]) & 255) << 40) | ((((long) bArrDoFinal2[3]) & 255) << 32) | ((((long) bArrDoFinal2[4]) & 255) << 24) | ((((long) bArrDoFinal2[5]) & 255) << 16) | ((((long) bArrDoFinal2[6]) & 255) << 8) | (((long) bArrDoFinal2[7]) & 255);
                                                } while (i18 < length3);
                                                C = new fi(j3);
                                                w = true;
                                                ArrayList arrayListC = iq.a.C();
                                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListC, (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27955, 2897949821205325178L ^ j) /* invoke-custom */));
                                                int i20 = 0;
                                                for (Object obj : arrayListC) {
                                                    int i21 = i20;
                                                    i20++;
                                                    if (i21 < 0) {
                                                        try {
                                                            CollectionsKt.throwIndexOverflow();
                                                        } catch (NumberFormatException unused) {
                                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(arrayList, -582827765523674004L, j) /* invoke-custom */;
                                                        }
                                                    }
                                                    arrayList.add(new ry((char) i3, (nd) obj, j2, i21));
                                                }
                                                H = arrayList;
                                                p = new fd(_s.OUT_BACK, jArr3[1], j4);
                                                z = new fd(_s.IN_QUAD, jArr3[0], j4);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j7;
                                            if (i12 >= length2) {
                                                str3 = "ÂR\u008fz}\u0098·³M:À¿z5ûß";
                                                length2 = "ÂR\u008fz}\u0098·³M:À¿z5ûß".length();
                                                i12 = 0;
                                            }
                                            break;
                                    }
                                    int i22 = i12;
                                    i12 += 8;
                                    byte[] bytes3 = str3.substring(i22, i12).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i14 = i11;
                                    i11++;
                                    j5 = ((((long) bytes3[0]) & 255) << 56) | ((((long) bytes3[1]) & 255) << 48) | ((((long) bytes3[2]) & 255) << 40) | ((((long) bytes3[3]) & 255) << 32) | ((((long) bytes3[4]) & 255) << 24) | ((((long) bytes3[5]) & 255) << 16) | ((((long) bytes3[6]) & 255) << 8) | (((long) bytes3[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i23 = i5;
                        i5++;
                        strArr[i23] = strIntern;
                        int i24 = i7 + cCharAt;
                        i6 = i24;
                        if (i24 < length) {
                        }
                        str = "ß^LBÄÅþ¡ë]\u001c{5ØÛì(¦ü\u000f\u001ez¬¦\u001bL¡\u0098sÇsxêÙW\u0095hVÞ\u0005¶&¤n\b³@òªzW\u001c7Ï\u008cñ\u008f";
                        length = "ß^LBÄÅþ¡ë]\u001c{5ØÛì(¦ü\u000f\u001ez¬¦\u001bL¡\u0098sÇsxêÙW\u0095hVÞ\u0005¶&¤n\b³@òªzW\u001c7Ï\u008cñ\u008f".length();
                        cCharAt = 16;
                        i2 = -1;
                        break;
                        break;
                }
                i7 = i2 + 1;
                strSubstring = str.substring(i7, i7 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i6);
        }
    }

    public static void o(int i2) {
        n = i2;
    }

    public static int K() {
        return n;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int L() {
        return K() == 0 ? 121 : 0;
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 2011;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = a(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/fi", e2);
            }
        }
        return c[i3];
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
            java.lang.String r1 = "su/catlean/fi"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.fi.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 15885;
        if (f[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) g.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/fi", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            f[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return f[i3].intValue();
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
            java.lang.String r1 = "su/catlean/fi"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.fi.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
