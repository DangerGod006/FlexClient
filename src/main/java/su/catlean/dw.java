package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1792;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/dw.class */
public final class dw extends dj {

    @NotNull
    public static final ma X;

    @NotNull
    private final Map A;

    @NotNull
    private final n7 D;

    @Nullable
    private static dj C;
    private static _g[] u;
    private static final long a = yz.a(1339252223487118068L, 462184803136938387L, MethodHandles.lookup().lookupClass()).a(129072437144889L);
    private static final String[] c;
    private static final String[] d;
    private static final Map g;
    private static final long[] i;
    private static final Integer[] k;
    private static final Map m;

    /* JADX WARN: Illegal instructions before constructor call */
    public dw(long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 120721425278060L;
        long j4 = j2 ^ 72029045081835L;
        super(j2 ^ 115883801038959L);
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2068560621153135248L, j2) /* invoke-custom */;
        this.A = new LinkedHashMap();
        this.D = new n7(0.0f, 0.0f, 40.0f, 15.0f, "", () -> {
            return U(r9);
        }, 0, j4, jh.f.i(), jh.f.h(), 0.0f, 0.0f, (int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28036, 4645126838236825456L ^ j2) /* invoke-custom */, null);
        try {
            F(j3);
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2022381947828961921L, j2) /* invoke-custom */ != null) {
                _gVarArr = new _g[4];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr, 2021380006376900980L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr, 2076197329695723449L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.od] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r2v7 */
    private final void J(String str, long j) {
        ?? r0;
        long j2 = a ^ j;
        long j3 = j2 ^ 138432962331946L;
        long j4 = j2 ^ 84707000799653L;
        long j5 = j2 ^ 73485625961345L;
        od odVarM = yl.g.m();
        List listS = yl.g.m().s(j4);
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4463930072844307414L, j2) /* invoke-custom */;
        Iterator it = listS.iterator();
        while (true) {
            if (!it.hasNext()) {
                r0 = 0;
                break;
            }
            Object next = it.next();
            while (true) {
                ?? r21 = next;
                next = r21 == true ? 1 : 0;
                while (Intrinsics.areEqual(((mh) next).R(), str)) {
                    next = r21 == true ? 1 : 0;
                    if (j2 > 0) {
                        r0 = next;
                        if (_gVarArr == null) {
                        }
                    }
                }
            }
        }
        try {
            ?? r2 = r0;
            r0 = odVarM;
            mh mhVar = (mh) r2;
            if (mhVar == null) {
                return;
            }
            r0.m(j5, mhVar);
            F(j3);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 4437789820957290239L, j2) /* invoke-custom */;
        }
    }

    private final void H(int i2, String str, int i3, char c2) {
        long j = (((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ a;
        long j2 = j ^ 78887393206663L;
        List listS = yl.g.m().s(j ^ 131195852977416L);
        Function1 function1 = (v1) -> {
            return Y(r1, v1);
        };
        listS.removeIf((v1) -> {
            return G(r1, v1);
        });
        F(j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0139 A[EDGE_INSN: B:49:0x0139->B:32:0x0139 BREAK  A[LOOP:1: B:6:0x0044->B:50:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[LOOP:1: B:6:0x0044->B:50:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(long r23) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dw.F(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[LOOP:0: B:3:0x0059->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007c  */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [su.catlean.n7] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00eb -> B:6:0x006a). Please report as a decompilation issue!!! */
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
    private final void Y(int r10, int r11, net.minecraft.class_1792 r12, long r13) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dw.Y(int, int, net.minecraft.class_1792, long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0103: INVOKE 
          (r-1 I:su.catlean.n7)
          (r0 I:float)
          (r1 I:float)
          (r2 I:float)
          (r3 I:long)
          (r4 I:float)
          (r5 I:net.minecraft.class_332)
         VIRTUAL call: su.catlean.n7.k(float, float, float, long, float, net.minecraft.class_332):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @Override // su.catlean.dj
    public void B(@org.jetbrains.annotations.NotNull net.minecraft.class_332 r17, long r18, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 1155
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dw.B(net.minecraft.class_332, long, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [su.catlean.dj] */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [su.catlean.dj] */
    @Override // su.catlean.dj
    public void T(long j, int i2, int i3, int i4) {
        long j2;
        float f;
        float f2;
        n7 n7Var;
        long j3 = j ^ 83277054500049L;
        long j4 = j ^ 0;
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8772223444408192920L, j) /* invoke-custom */;
        try {
            try {
                obj = this;
                dw dwVar = obj;
                if (obj != 0) {
                    try {
                        super.T(j4, i2, i3, i4);
                        obj = C;
                        if (obj != 0) {
                            dj djVar = C;
                            Intrinsics.checkNotNull(djVar);
                            djVar.T(j4, i2, i3, i4);
                            if (obj != 0) {
                                return;
                            }
                        }
                        dwVar = this;
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8779785248991652529L, j) /* invoke-custom */;
                    }
                }
                loop0: for (Map.Entry entry : dwVar.A.entrySet()) {
                    n7Var = null;
                    try {
                        n7Var = (n7) entry.getKey();
                        f2 = i2;
                        f = i3;
                        j2 = j3;
                        if (j < 0) {
                            break;
                        }
                        n7Var.P(f2, f, j2);
                        while (obj != 0) {
                            if (obj == 0) {
                                if (j >= 0) {
                                    break loop0;
                                }
                            }
                        }
                        break loop0;
                    } catch (NumberFormatException unused2) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(n7Var, 8779785248991652529L, j) /* invoke-custom */;
                    }
                }
                n7Var = this.D;
                f2 = i2;
                f = i3;
                j2 = j3;
                n7Var.P(f2, f, j2);
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8779785248991652529L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8779785248991652529L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9, types: [su.catlean.dj] */
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
    @Override // su.catlean.dj
    public void w(int key, long a2) {
        long j = a2 ^ 0;
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(680427717724389204L, a2) /* invoke-custom */;
        super.w(key, j);
        try {
            obj = obj;
            if (obj != 0) {
                try {
                    obj = C;
                    if (obj != 0) {
                        obj.w(key, j);
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 654288527636028029L, a2) /* invoke-custom */;
                }
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 654288527636028029L, a2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9, types: [su.catlean.dj] */
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
    @Override // su.catlean.dj
    public void I(long a2, char c2) {
        long j = a2 ^ 0;
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6895429091544131988L, a2) /* invoke-custom */;
        super.I(j, c2);
        try {
            obj = obj;
            if (obj != 0) {
                try {
                    obj = C;
                    if (obj != 0) {
                        obj.I(j, c2);
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6905248229469752509L, a2) /* invoke-custom */;
                }
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6905248229469752509L, a2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9, types: [su.catlean.dj] */
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
    @Override // su.catlean.dj
    public void a(double mouseX, double mouseY, double verticalAmount, long a2) {
        long j = a2 ^ 0;
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8942245335760423484L, a2) /* invoke-custom */;
        super.a(mouseX, mouseY, verticalAmount, j);
        try {
            obj = obj;
            if (obj != 0) {
                try {
                    obj = C;
                    if (obj != 0) {
                        obj.a(mouseX, mouseY, verticalAmount, j);
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8970077909317693205L, a2) /* invoke-custom */;
                }
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8970077909317693205L, a2) /* invoke-custom */;
        }
    }

    private static final Unit l(dw dwVar, String str) {
        long j = a ^ 39683465804750L;
        Intrinsics.checkNotNullParameter(str, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24906, 1327771678608287286L ^ j) /* invoke-custom */);
        dwVar.J(str, j ^ 93641016133577L);
        dj djVar = C;
        Intrinsics.checkNotNull(djVar);
        djVar.L(true);
        return Unit.INSTANCE;
    }

    private static final Unit s(dw dwVar, String str) {
        long j = a ^ 23472141640334L;
        Intrinsics.checkNotNullParameter(str, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17390, 2962418372215676371L ^ j) /* invoke-custom */);
        dwVar.H((int) (j >>> 32), str, (int) (((j ^ 103615973571108L) << 32) >>> 48), (char) ((r1 << 48) >>> 48));
        return Unit.INSTANCE;
    }

    private static final Unit U(dw dwVar) {
        ArrayList arrayList;
        long j = a ^ 95396929469541L;
        long j2 = j ^ 139528571775403L;
        long j3 = j ^ 109574520643512L;
        ma maVar = X;
        List listS = yl.g.m().s(j2);
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8791832221606202408L, j) /* invoke-custom */;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listS, (int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6678, 7821618932099754411L ^ j) /* invoke-custom */));
        for (Object obj : listS) {
            arrayList = arrayList2;
            mh mhVar = (mh) obj;
            if (_gVarArr == null) {
                break;
            }
            arrayList.add(mhVar.R());
            if (_gVarArr == null) {
                break;
            }
        }
        arrayList = arrayList2;
        C = new db(j3, arrayList, (v1) -> {
            return l(r1, v1);
        }, (v1) -> {
            return s(r2, v1);
        });
        return Unit.INSTANCE;
    }

    private static final boolean Y(String str, mh mhVar) {
        Intrinsics.checkNotNullParameter(mhVar, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17390, 2962410886423085796L ^ (a ^ 21475294985657L)) /* invoke-custom */);
        return Intrinsics.areEqual(mhVar.R(), str);
    }

    private static final boolean G(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private static final Unit i(dw dwVar, int i2, class_1792 class_1792Var) {
        long j = a ^ 9368762449535L;
        Intrinsics.checkNotNullParameter(class_1792Var, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12297, 6651055657024729792L ^ j) /* invoke-custom */);
        dwVar.Y(i2, (int) (j >>> 32), class_1792Var, ((j ^ 132077789849138L) << 32) >>> 32);
        dj djVar = C;
        Intrinsics.checkNotNull(djVar);
        djVar.L(true);
        return Unit.INSTANCE;
    }

    private static final Unit N(class_1792 class_1792Var, dw dwVar, int i2) {
        long j = a ^ 51585089650204L;
        int i3 = (int) (j >>> 48);
        long j2 = ((j ^ 56551229650963L) << 16) >>> 16;
        ma maVar = X;
        C = new dr(CollectionsKt.mutableListOf(class_1792Var), (v2) -> {
            return i(r3, r4, v2);
        }, (short) i3, j2);
        return Unit.INSTANCE;
    }

    public static final dj Z() {
        return C;
    }

    public static final void J(dj djVar) {
        C = djVar;
    }

    static {
        int i2;
        long j = a ^ 123407693425694L;
        g = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[3], -3080911460543184825L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[8];
        int i4 = 0;
        String str = "U\u0094Á\u0091\u008dèÆû\u0000\u0013ÓÎ\"ÕZ´\u00188Ó\u008c\u0098KRªlg æ\u008e\u0098\u0001ü\u009aEk2H\u0001i=ð\u0010¼;j+ìN¥\u0088ØbÓvæë\u0002K\u0010¸Ì\u0096;ø½M\u0086\t\bÝ\u009c\u0015bPa\u0018Z\u009f\u008c\u009c\u009d\u008a«\bBð$9ê@\u0006\u0010:\r^ÒÊÜ®\u0015\u0010\u008e\u0084«\u009cÕé<oÙE\u001d(^ú\u0002Ò";
        int length = "U\u0094Á\u0091\u008dèÆû\u0000\u0013ÓÎ\"ÕZ´\u00188Ó\u008c\u0098KRªlg æ\u008e\u0098\u0001ü\u009aEk2H\u0001i=ð\u0010¼;j+ìN¥\u0088ØbÓvæë\u0002K\u0010¸Ì\u0096;ø½M\u0086\t\bÝ\u009c\u0015bPa\u0018Z\u009f\u008c\u009c\u009d\u008a«\bBð$9ê@\u0006\u0010:\r^ÒÊÜ®\u0015\u0010\u008e\u0084«\u009cÕé<oÙE\u001d(^ú\u0002Ò".length();
        char cCharAt = 16;
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
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
                            d = new String[8];
                            m = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[15];
                            int i10 = 0;
                            String str3 = "\u00875}$Ç\tP6\u009fqp#OH!\u008b\u001erãÂh\u0005¨}ü\u0005\u009b\u008c\bD\u009aØ\u0091\u0096ó`ü$\u0018üÅS£§D`V¿\u000e\u000eF! I\u0089W\u0095µ5\u009a´êv\u0001T\u001aê\u0007+Ç¢ÿé Ãë4\"\u0017\u0089aì\u0085\u0017G§è( fÊ`Ä«\u0004¥¹\r\u00058\u001e\b\rH";
                            int length2 = "\u00875}$Ç\tP6\u009fqp#OH!\u008b\u001erãÂh\u0005¨}ü\u0005\u009b\u008c\bD\u009aØ\u0091\u0096ó`ü$\u0018üÅS£§D`V¿\u000e\u000eF! I\u0089W\u0095µ5\u009a´êv\u0001T\u001aê\u0007+Ç¢ÿé Ãë4\"\u0017\u0089aì\u0085\u0017G§è( fÊ`Ä«\u0004¥¹\r\u00058\u001e\b\rH".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b3 = -1;
                                while (true) {
                                    byte b4 = b3;
                                    long j3 = j2;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b4] = j4;
                                            if (i11 >= length2) {
                                                i = jArr;
                                                k = new Integer[15];
                                                X = new ma(null);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b4] = j4;
                                            if (i11 >= length2) {
                                                str3 = "¼Ù÷\riBæÜÐÁév=?3e";
                                                length2 = "¼Ù÷\riBæÜÐÁév=?3e".length();
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
                                    b3 = 0;
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
                        str = "8ùr*\u0097\u009aø\u0094q+Á\u0099:cd¢\u0018Ý¢\\.FÒMäY\u009b\n\u0017\u009d\u0098R\u008c{\u0005=Z\u001e,Ð?";
                        length = "8ùr*\u0097\u009aø\u0094q+Á\u0099:cd¢\u0018Ý¢\\.FÒMäY\u009b\n\u0017\u009d\u0098R\u008c{\u0005=Z\u001e,Ð?".length();
                        cCharAt = 16;
                        i2 = -1;
                        break;
                        break;
                }
                i6 = i2 + 1;
                strSubstring = str.substring(i6, i6 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i5);
        }
    }

    public static void u(_g[] _gVarArr) {
        u = _gVarArr;
    }

    public static _g[] g() {
        return u;
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

    private static String b(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 1244;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) g.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = b(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/dw", e);
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
            java.lang.String r1 = "su/catlean/dw"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dw.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 14268;
        if (k[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) i[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) m.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/dw", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            k[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return k[i3].intValue();
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
            java.lang.String r1 = "su/catlean/dw"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dw.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
