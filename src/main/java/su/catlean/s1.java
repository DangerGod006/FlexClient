package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_11905;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/s1.class */
public final class s1 extends class_437 {

    @NotNull
    public static final s1 d = null;

    @NotNull
    private static Set G;

    @Nullable
    private static f6 L;

    @Nullable
    private static i8 T;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map e = null;
    private static final long f = 0;

    private s1(char c2, short s, int i) {
        super(class_2561.method_30163((String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8435, 2968727802654088895L ^ ((((((long) c2) << 48) | ((((long) s) << 48) >>> 16)) | ((((long) i) << 32) >>> 32)) ^ a)) /* invoke-custom */));
    }

    @NotNull
    public final Set r() {
        return G;
    }

    public final void s(@NotNull Set set, long a2) {
        Intrinsics.checkNotNullParameter(set, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19403, 8936442160946783844L ^ (a ^ a2)) /* invoke-custom */);
        G = set;
    }

    @Nullable
    public final f6 E() {
        return L;
    }

    public final void j(@Nullable f6 f6Var) {
        L = f6Var;
    }

    @Nullable
    public final i8 u() {
        return T;
    }

    public final void a(@Nullable i8 i8Var) {
        T = i8Var;
    }

    protected void method_25426() {
        long j = a ^ 105657866734956L;
        Set<i8> set = G;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2767205651690551928L, j) /* invoke-custom */;
        for (i8 i8Var : set) {
            int[] iArr2 = null;
            try {
                i8Var.D();
                iArr2 = iArr;
                if (iArr2 == null && iArr == null) {
                }
                return;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(iArr2, 2810166546091595203L, j) /* invoke-custom */;
            }
        }
    }

    public void method_25394(@NotNull class_332 context, int mouseX, int mouseY, float delta) throws Throwable {
        long j = a ^ 22652926162405L;
        long j2 = j ^ 105386315694720L;
        long j3 = j ^ 127616886644673L;
        long j4 = j ^ 78984872468462L;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6994544993222835471L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(context, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9936, 7266858375395331170L ^ j) /* invoke-custom */);
        Object obj = iArr;
        if (obj == null) {
            try {
                try {
                    obj = zf.F(j2).field_1687;
                    if (obj == null) {
                        method_25420(context, mouseX, mouseY, delta);
                    }
                    tm.R.N(context, mouseX, mouseY, j4);
                    L = null;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -7028215662304989878L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -7028215662304989878L, j) /* invoke-custom */;
            }
        }
        for (i8 i8Var : G) {
            int[] iArr2 = null;
            try {
                i8Var.p(context, mouseX, mouseY, j3);
                iArr2 = iArr;
                if (iArr2 == null && iArr == null) {
                }
                return;
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(iArr2, -7028215662304989878L, j) /* invoke-custom */;
            }
        }
    }

    public boolean method_25421() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e4, code lost:
    
        r0 = su.catlean.s1.L;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e9, code lost:
    
        if (r0 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ec, code lost:
    
        if (r0 == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fb, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, 399111064540083893L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fc, code lost:
    
        r0 = su.catlean.s1.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ff, code lost:
    
        r0 = r0 instanceof su.catlean.fz;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0104, code lost:
    
        if (r0 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0107, code lost:
    
        if (r0 == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0116, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, 399111064540083893L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0117, code lost:
    
        r25 = su.catlean.s1.G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0122, code lost:
    
        r0 = r25;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0126, code lost:
    
        if (r0 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0129, code lost:
    
        r0 = r0 instanceof java.util.Collection;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0138, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, 399111064540083893L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0139, code lost:
    
        if (r0 == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013c, code lost:
    
        r0 = r25;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0143, code lost:
    
        if (r0 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0152, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, 399111064540083893L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0158, code lost:
    
        if (r0.isEmpty() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0167, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, 399111064540083893L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0168, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0175, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, 399111064540083893L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0176, code lost:
    
        r0 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0178, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0186, code lost:
    
        if (r0.hasNext() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0189, code lost:
    
        r0 = (su.catlean.i8) r0.next();
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a1, code lost:
    
        if (r0.W() != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a4, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a8, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a9, code lost:
    
        if (r0 != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ac, code lost:
    
        r0 = false;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01af, code lost:
    
        if (r0 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b5, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b6, code lost:
    
        if (r0 == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b9, code lost:
    
        r0 = su.catlean.fz.I;
        r1 = su.catlean.s1.L;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r1, call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/s1;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "j"}
            {METHOD_TYPE: (I, J)Ljava/lang/String;}
        ).invoke(2896, 4098588455627749912L ^ r0));
        r0.A((su.catlean.fz) r1);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d8, code lost:
    
        if (r0 == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e7, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, 399111064540083893L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01e8, code lost:
    
        su.catlean.s1.L = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f8, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, 399111064540083893L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ff, code lost:
    
        return super.method_25402(r10, r11);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean.tm] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean.f6] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [su.catlean.i8] */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
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
    public boolean method_25402(@org.jetbrains.annotations.NotNull net.minecraft.class_11909 r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.s1.method_25402(net.minecraft.class_11909, boolean):boolean");
    }

    public boolean method_25406(@NotNull class_11909 click) {
        long j = a ^ 61349731353297L;
        long j2 = j ^ 26231727626260L;
        Intrinsics.checkNotNullParameter(click, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11084, 1882268375831541446L ^ j) /* invoke-custom */);
        double dComp_4798 = click.comp_4798();
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6207577438439115323L, j) /* invoke-custom */;
        double dComp_4799 = click.comp_4799();
        int iMethod_74245 = click.method_74245();
        Iterator it = G.iterator();
        while (it.hasNext()) {
            int[] iArr2 = null;
            try {
                ((i8) it.next()).z();
                iArr2 = iArr;
                if (iArr2 != null) {
                    break;
                }
                if (iArr != null) {
                    break;
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(iArr2, -6250186759702488450L, j) /* invoke-custom */;
            }
        }
        tm.R.r(j2, dComp_4798, dComp_4799, iMethod_74245);
        return super.method_25406(click);
    }

    public boolean method_25401(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        long j = a ^ 66046917211595L;
        long j2 = j ^ 36193274981565L;
        Set<i8> set = G;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7007518656172965153L, j) /* invoke-custom */;
        for (i8 i8Var : set) {
            int[] iArr2 = null;
            try {
                i8Var.a(mouseX, j2, mouseY, verticalAmount);
                iArr2 = iArr;
                if (iArr2 != null || iArr != null) {
                    break;
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(iArr2, -7036615360641143452L, j) /* invoke-custom */;
            }
        }
        return super.method_25401(mouseX, mouseY, horizontalAmount, verticalAmount);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x023e: INVOKE (r-1 I:su.catlean.fz), (r0 I:long), (r1 I:java.lang.String) VIRTUAL call: su.catlean.fz.M(long, java.lang.String):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public boolean method_25404(@org.jetbrains.annotations.NotNull net.minecraft.class_11908 r9) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.s1.method_25404(net.minecraft.class_11908):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public boolean method_25400(@NotNull class_11905 input) {
        long j = a ^ 8676920262067L;
        long j2 = j ^ 101709655303698L;
        long j3 = j ^ 17725759757535L;
        long j4 = j ^ 62902161759053L;
        ?? FirstOrNull = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7586189202361595225L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(input, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8392, 5963645366640820782L ^ j) /* invoke-custom */);
        try {
            FirstOrNull = FirstOrNull;
            if (FirstOrNull == 0) {
                try {
                    String strMethod_74226 = input.method_74226();
                    Intrinsics.checkNotNullExpressionValue(strMethod_74226, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5067, 4186580200807035179L ^ j) /* invoke-custom */);
                    char[] charArray = strMethod_74226.toCharArray();
                    Intrinsics.checkNotNullExpressionValue(charArray, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27477, 2692510411188668848L ^ j) /* invoke-custom */);
                    FirstOrNull = ArraysKt.firstOrNull(charArray);
                    if (FirstOrNull != 0) {
                        char cCharValue = FirstOrNull.charValue();
                        for (i8 i8Var : G) {
                            ?? r0 = 0;
                            try {
                                i8Var.u(cCharValue, j4);
                                r0 = FirstOrNull;
                                if (r0 != 0 || FirstOrNull != 0) {
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -7628868616953567972L, j) /* invoke-custom */;
                            }
                        }
                        fz fzVarT = fz.I.T();
                        fz fzVar = fzVarT;
                        if (FirstOrNull != 0) {
                            fzVarT.M(j2, fzVar.m() + cCharValue);
                        } else if (fzVar != null) {
                            fzVar = fzVarT;
                            fzVarT.M(j2, fzVar.m() + cCharValue);
                        }
                        tm.R.D(cCharValue, j3);
                        return super.method_25400(input);
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(FirstOrNull, -7628868616953567972L, j) /* invoke-custom */;
                }
            }
            return super.method_25400(input);
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(FirstOrNull, -7628868616953567972L, j) /* invoke-custom */;
        }
    }

    protected void method_57734(@NotNull class_332 guiGraphics) {
        Intrinsics.checkNotNullParameter(guiGraphics, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4338, 8946837932288851586L ^ (a ^ 56138445566250L)) /* invoke-custom */);
    }

    public void method_25420(@NotNull class_332 guiGraphics, int mouseY, int j, float deltaTicks) {
        Intrinsics.checkNotNullParameter(guiGraphics, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6582, 992383656513678486L ^ (a ^ 100454816295537L)) /* invoke-custom */);
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 30078;
        if (c[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i2] = a(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/s1", e2);
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
            r1 = 1
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
            java.lang.String r1 = "su/catlean/s1"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.s1.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
