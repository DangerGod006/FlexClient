package su.catlean;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_156;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qx.class */
public final class qx extends _g {

    @NotNull
    public static final qx o;
    static final KProperty[] c;

    @NotNull
    private static final File F;

    @NotNull
    private static final File U;

    @NotNull
    private static final cb E;

    @NotNull
    private static final a6 V;

    @NotNull
    private static final a6 i;

    @NotNull
    private static final cw X;

    @NotNull
    private static final cl D;

    @NotNull
    private static final bg S;
    private static long A;
    private static long n;

    @NotNull
    private static List N;

    @NotNull
    private static List u;
    private static final long a = yz.a(-2121401685907135450L, -8491782006441770304L, MethodHandles.lookup().lookupClass()).a(69608118360521L);
    private static final String[] b;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    /* JADX WARN: Illegal instructions before constructor call */
    private qx(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7672, 3968576183208762789L ^ j2) /* invoke-custom */, jt.d(), null, 4, null, j2 ^ 66163699035341L);
    }

    private final oi A(long j) {
        return (oi) E.E(this, (a ^ j) ^ 58086504253247L, c[0]);
    }

    private final void f(long j, oi oiVar) {
        E.b(this, (a ^ j) ^ 45355395706284L, c[0], oiVar);
    }

    private final id E(long j, byte b2) {
        return (id) V.E(this, (((j << 8) | ((((long) b2) << 56) >>> 56)) ^ a) ^ 99479626826090L, c[1]);
    }

    private final void N(long j, short s, id idVar) {
        V.b(this, (((j << 16) | ((((long) s) << 48) >>> 48)) ^ a) ^ 50662808992046L, c[1], idVar);
    }

    private final id T(long j) {
        return (id) i.E(this, (a ^ j) ^ 17978435729023L, c[2]);
    }

    private final void F(id idVar, long j) {
        i.b(this, (a ^ j) ^ 47362234501138L, c[2], idVar);
    }

    private final ak K(long j, int i2) {
        return (ak) X.E(this, (((j << 32) | ((((long) i2) << 32) >>> 32)) ^ a) ^ 62582419542818L, c[3]);
    }

    private final void z(long j, ak akVar) {
        X.b(this, (a ^ j) ^ 58404332788212L, c[3], akVar);
    }

    private final String g(long j) {
        return (String) D.E(this, (a ^ j) ^ 104962877561663L, c[4]);
    }

    private final void B(long j, String str) {
        D.b(this, (a ^ j) ^ 11185737211085L, c[4], str);
    }

    @Override // su.catlean._g
    public void O(long j) {
        long j2 = j ^ 49075368866138L;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2660793024346998566L, j) /* invoke-custom */;
        u = E(F, j2);
        try {
            N = E(U, j2);
            if (obj != null) {
                obj = new _g[3];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2605814174822968852L, j) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2632185436848151266L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:52:0x013e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void w(su.catlean.api.event.events.client.TickEvent r10) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qx.w(su.catlean.api.event.events.client.TickEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b A[PHI: r0
  0x015b: PHI (r0v71 ??) = (r0v70 ??), (r0v76 ??), (r0v78 ??) binds: [B:44:0x0109, B:58:0x0149, B:50:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019a A[Catch: NoWhenBranchMatchedException -> 0x01ad, TRY_LEAVE, TryCatch #5 {NoWhenBranchMatchedException -> 0x01ad, blocks: (B:67:0x018e, B:69:0x019a), top: B:100:0x018e }] */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.minecraft.class_2663] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [su.catlean.qx] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.minecraft.class_2663] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [su.catlean.qx] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
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
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void K(su.catlean.api.event.events.network.ReceivePacket r8) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qx.K(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x016d, code lost:
    
        if (r0 != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0269, code lost:
    
        if (r0 != 0) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ac A[Catch: NoWhenBranchMatchedException -> 0x01c9, NoWhenBranchMatchedException -> 0x01eb, TRY_ENTER, TryCatch #4 {NoWhenBranchMatchedException -> 0x01c9, blocks: (B:38:0x018d, B:39:0x01ac), top: B:81:0x018d, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d3 A[Catch: NoWhenBranchMatchedException -> 0x01eb, NoWhenBranchMatchedException -> 0x0219, FALL_THROUGH, TRY_ENTER, TryCatch #3 {NoWhenBranchMatchedException -> 0x0219, blocks: (B:45:0x01d3, B:51:0x01f5, B:49:0x01eb, B:50:0x01f4, B:39:0x01ac, B:43:0x01c9, B:44:0x01d2, B:38:0x018d), top: B:81:0x018d, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f5 A[Catch: NoWhenBranchMatchedException -> 0x0219, NoWhenBranchMatchedException -> 0x023f, FALL_THROUGH, TRY_ENTER, TryCatch #3 {NoWhenBranchMatchedException -> 0x0219, blocks: (B:45:0x01d3, B:51:0x01f5, B:49:0x01eb, B:50:0x01f4, B:39:0x01ac, B:43:0x01c9, B:44:0x01d2, B:38:0x018d), top: B:81:0x018d, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0223 A[Catch: NoWhenBranchMatchedException -> 0x023f, NoWhenBranchMatchedException -> 0x0251, FALL_THROUGH, TRY_ENTER, TryCatch #1 {NoWhenBranchMatchedException -> 0x023f, blocks: (B:55:0x0219, B:56:0x0222, B:51:0x01f5, B:57:0x0223, B:45:0x01d3, B:49:0x01eb, B:50:0x01f4), top: B:81:0x018d, outer: #0, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0249 A[Catch: NoWhenBranchMatchedException -> 0x0251, FALL_THROUGH, TryCatch #0 {NoWhenBranchMatchedException -> 0x0251, blocks: (B:61:0x023f, B:62:0x0248, B:57:0x0223, B:63:0x0249, B:64:0x0250, B:55:0x0219, B:56:0x0222, B:51:0x01f5), top: B:81:0x018d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018d A[EXC_TOP_SPLITTER, PHI: r0 r33
  0x018d: PHI (r0v38 ??) = (r0v96 ??), (r0v97 ??), (r0v98 ??) binds: [B:24:0x0128, B:26:0x012d, B:35:0x0170] A[DONT_GENERATE, DONT_INLINE]
  0x018d: PHI (r33v1 ??) = (r33v6 ??), (r33v7 ??), (r33v8 ??) binds: [B:24:0x0128, B:26:0x012d, B:35:0x0170] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0283 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean._g] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v65, types: [int[]] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r33v8 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void k(long r12, java.lang.String r14, java.util.List r15) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qx.k(long, java.lang.String, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.io.File] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x019f -> B:51:0x0143). Please report as a decompilation issue!!! */
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
    private final java.util.List E(java.io.File r10, long r11) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qx.E(java.io.File, long):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    private static final Unit V() throws IOException {
        long j = a ^ 19182278254433L;
        class_156.class_158 class_158VarMethod_668 = class_156.method_668();
        File file = F;
        Object objExists = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8483617183215326833L, j) /* invoke-custom */;
        if (objExists == 0) {
            try {
                try {
                    objExists = file.exists();
                    if (objExists == 0) {
                        file.createNewFile();
                    }
                    class_158VarMethod_668.method_672(file);
                } catch (NoWhenBranchMatchedException unused) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objExists, -8489764118812887989L, j) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused2) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objExists, -8489764118812887989L, j) /* invoke-custom */;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    private static final Unit n() throws IOException {
        long j = a ^ 35516818105472L;
        class_156.class_158 class_158VarMethod_668 = class_156.method_668();
        File file = U;
        Object objExists = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5646086621007785362L, j) /* invoke-custom */;
        if (objExists == 0) {
            try {
                try {
                    objExists = file.exists();
                    if (objExists == 0) {
                        file.createNewFile();
                    }
                    class_158VarMethod_668.method_672(file);
                } catch (NoWhenBranchMatchedException unused) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objExists, -5634146358635081814L, j) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused2) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objExists, -5634146358635081814L, j) /* invoke-custom */;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.ak] */
    private static final boolean w() {
        long j = a ^ 79939996725990L;
        Object objK = j;
        try {
            objK = o.K(objK >>> 32, (int) (((objK ^ 53463201131968L) << 32) >>> 32));
            return objK == ak.WHISPERS;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objK, -6365533207974716980L, j) /* invoke-custom */;
        }
    }

    static {
        int i2;
        long j = a ^ 90648174625199L;
        long j2 = j ^ 87309014334907L;
        long j3 = j ^ 91405314702139L;
        long j4 = j ^ 48238287835387L;
        long j5 = j ^ 20347306371343L;
        long j6 = j ^ 81591431554174L;
        long j7 = j ^ 66632662234421L;
        e = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[24];
        int i4 = 0;
        String str = "+\u0090ê\u000eùS\u008d>_-\u008c¿j6AA\u0006ÔÑLÖ\u009fßo%4Ê)È+êN\u00adë\u0082/ZGÑ\u0019« Y&\u0098[4nÁoÖ^«\u008c\u0094ímß*dQ|\u001bÉû\u009bàÆOe,R\u0018\u008aLê Ä¾Ë\u009d\t\u0004Ç9ºH+\u0097\u0089º\u001bÓ\u0018\u0084Gª\u0010S¦\u0015\u009eÃÎ4U\u0098\u001d;¶\u0010m\u0086q@©\u000eK\u0014\u0013VÚÞ\nx*\b»jP\u007f¥\u009fëYQCÏS|Ô+ÅU\u000eZ=¯\u0080\u0093ùÇÛÜèÀIk\u009a>^]ði\u0006ðÌØµrØÚ\u0091èÇ4½\tD8Â>ýOp>B*\u0006\u008bÙvH=0â\u001cÃâ\u0012²æÏÑ@\bßøb\u0091\u0007\u009c¹,,^\u001eüÁ(1\u0089þä*ª|h¤)ý-Ï\u0081_¤8 Í\u008c\u0087\u009d\u0089ëûôAî°øq\u0096\u0005\u0085Â¢7%É+U\u001cc!Á\u001aY\u001c4ô\u008eÍ\bJ\u0097î\u009fá¶Ñ\u0006\n\u00931p\u0090²Åè;$ç;\u0010\u0014±Iu-?Ûø×\u0085îp6cÝO\u0018Õ\u0084ËÛM¯õ7mÅÃ\u009e-¤H\u009c*\"\u0088o\u0013té~\u0010Rº\u009cð@[h\u0016\u0010¸>È<w¡\u0010\u0010¼W;Ô;\u000ef\u0004`\u0093k{ÕA\u0082\u0084\u00181§¿#cÐ#\b\u0091MF#mU¿W\t ?\u0013Då^C(\u0005V#ü\u0095\u0080ù:¿Ou\u0093vÛoÂL\u0095Dþs\u009cUÖ_\u0092£¿\u0084=ª§\u0088úvoÜ\u001e¸\u0093\u0010~òÈ\u0084ã\u001f+\u0007ëGhE¢\u0007óÜ \fI£6ª\u0093ç»üA\u0082k~:|¡<ªÂØ¹\bÌUt]ÚØ\u0003á/}\u0018x\u009a÷\u009fQDO²\u0080³®\u0003d\u0005{pp?v\u0007è°b\u0093\u0010¡í\u0007ÛÃÎÖ\u000et0/÷þ\u0081=¾ 7V\u008b\u0010u\u0096`rµ°\u009e(\u0006\u00817Ì\u00156\b\u0086_Ó¯rdî\u0099p(\u0002¥\u0085\u0010ô>Q\u0085L4Q'MÜ\"\u0091Õ\b7\n Zé\u0015GÄÜ\u008bäË\u0003QæÖÙ¯rx\u001fg\u009bÞéï;Ûµ\u009b!Íz®à@í¥lÀ7\u0010Fý\u009dE\u000fzéÎ3âh¨÷ m^\r#;i:ÓÂ\u0010OßL?3¦K\u0097\u0091> \nP{U÷1ã6\u0089qü\u0005oþ·âO#ÖnáQX GÙÅ\u0018\u0014}¸\u0006Úk\u0017;Ve±¯\u0001\u009a\u008d\u0082\u008eñ¤\u000bÄIÂ¡àãÖ°\u0018\u0089\u0089Ö\u000f£\u0019Â~õ\u0004c~®wzº\n\u0002¦CW;¬1";
        int length = "+\u0090ê\u000eùS\u008d>_-\u008c¿j6AA\u0006ÔÑLÖ\u009fßo%4Ê)È+êN\u00adë\u0082/ZGÑ\u0019« Y&\u0098[4nÁoÖ^«\u008c\u0094ímß*dQ|\u001bÉû\u009bàÆOe,R\u0018\u008aLê Ä¾Ë\u009d\t\u0004Ç9ºH+\u0097\u0089º\u001bÓ\u0018\u0084Gª\u0010S¦\u0015\u009eÃÎ4U\u0098\u001d;¶\u0010m\u0086q@©\u000eK\u0014\u0013VÚÞ\nx*\b»jP\u007f¥\u009fëYQCÏS|Ô+ÅU\u000eZ=¯\u0080\u0093ùÇÛÜèÀIk\u009a>^]ði\u0006ðÌØµrØÚ\u0091èÇ4½\tD8Â>ýOp>B*\u0006\u008bÙvH=0â\u001cÃâ\u0012²æÏÑ@\bßøb\u0091\u0007\u009c¹,,^\u001eüÁ(1\u0089þä*ª|h¤)ý-Ï\u0081_¤8 Í\u008c\u0087\u009d\u0089ëûôAî°øq\u0096\u0005\u0085Â¢7%É+U\u001cc!Á\u001aY\u001c4ô\u008eÍ\bJ\u0097î\u009fá¶Ñ\u0006\n\u00931p\u0090²Åè;$ç;\u0010\u0014±Iu-?Ûø×\u0085îp6cÝO\u0018Õ\u0084ËÛM¯õ7mÅÃ\u009e-¤H\u009c*\"\u0088o\u0013té~\u0010Rº\u009cð@[h\u0016\u0010¸>È<w¡\u0010\u0010¼W;Ô;\u000ef\u0004`\u0093k{ÕA\u0082\u0084\u00181§¿#cÐ#\b\u0091MF#mU¿W\t ?\u0013Då^C(\u0005V#ü\u0095\u0080ù:¿Ou\u0093vÛoÂL\u0095Dþs\u009cUÖ_\u0092£¿\u0084=ª§\u0088úvoÜ\u001e¸\u0093\u0010~òÈ\u0084ã\u001f+\u0007ëGhE¢\u0007óÜ \fI£6ª\u0093ç»üA\u0082k~:|¡<ªÂØ¹\bÌUt]ÚØ\u0003á/}\u0018x\u009a÷\u009fQDO²\u0080³®\u0003d\u0005{pp?v\u0007è°b\u0093\u0010¡í\u0007ÛÃÎÖ\u000et0/÷þ\u0081=¾ 7V\u008b\u0010u\u0096`rµ°\u009e(\u0006\u00817Ì\u00156\b\u0086_Ó¯rdî\u0099p(\u0002¥\u0085\u0010ô>Q\u0085L4Q'MÜ\"\u0091Õ\b7\n Zé\u0015GÄÜ\u008bäË\u0003QæÖÙ¯rx\u001fg\u009bÞéï;Ûµ\u009b!Íz®à@í¥lÀ7\u0010Fý\u009dE\u000fzéÎ3âh¨÷ m^\r#;i:ÓÂ\u0010OßL?3¦K\u0097\u0091> \nP{U÷1ã6\u0089qü\u0005oþ·âO#ÖnáQX GÙÅ\u0018\u0014}¸\u0006Úk\u0017;Ve±¯\u0001\u009a\u008d\u0082\u008eñ¤\u000bÄIÂ¡àãÖ°\u0018\u0089\u0089Ö\u000f£\u0019Â~õ\u0004c~®wzº\n\u0002¦CW;¬1".length();
        char cCharAt = 'H';
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
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
                            b = strArr;
                            d = new String[24];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[7];
                            int i10 = 0;
                            String str3 = " µ\u0099)ÿ\u000e´E6Â\"ù\u0016\u001b·è^\"l2G¡ÚR\u0001Ì\u000bnÚÒ±üetí2ÝØ ù";
                            int length2 = " µ\u0099)ÿ\u000e´E6Â\"ù\u0016\u001b·è^\"l2G¡ÚR\u0001Ì\u000bnÚÒ±üetí2ÝØ ù".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j8 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j9 = j8;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j9 >>> 56), (byte) (j9 >>> 48), (byte) (j9 >>> 40), (byte) (j9 >>> 32), (byte) (j9 >>> 24), (byte) (j9 >>> 16), (byte) (j9 >>> 8), (byte) j9});
                                    long j10 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j10;
                                            if (i11 >= length2) {
                                                f = jArr;
                                                g = new Integer[7];
                                                c = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(qx.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20577, 8901297857426225498L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7377, 2185829744989943268L ^ j) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(qx.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6071, 807667114826317462L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17112, 7250406361955560446L ^ j) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(qx.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7536, 4108844951815730261L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24180, 2698048334638708550L ^ j) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(qx.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11572, 3155535639719937027L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19971, 651835815295838007L ^ j) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(qx.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11110, 6697286040576164421L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21279, 7870870788394449469L ^ j) /* invoke-custom */, 0))};
                                                o = new qx(j2);
                                                F = new File(mj.v(), (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32375, 885659069569718099L ^ j) /* invoke-custom */);
                                                U = new File(mj.v(), (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23916, 3301812834446210134L ^ j) /* invoke-custom */);
                                                E = yp.X(o, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 5897741176689916573L ^ j) /* invoke-custom */, j3, new oi(j4, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18990, 8110510215954031391L ^ j) /* invoke-custom */), (h) null, (Function0) null, (int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20556, 690644335615869247L ^ j) /* invoke-custom */, (Object) null);
                                                V = yp.y(o, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12866, 6773943557506800510L ^ j) /* invoke-custom */, qx::V, j7, (h) null, (Function0) null, (int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8158, 6919048267299802798L ^ j) /* invoke-custom */, (Object) null);
                                                i = yp.y(o, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5989, 2820676580791828053L ^ j) /* invoke-custom */, qx::n, j7, (h) null, (Function0) null, (int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8158, 6919048267299802798L ^ j) /* invoke-custom */, (Object) null);
                                                X = yp.L(o, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15793, 2521568702274606223L ^ j) /* invoke-custom */, ak.GLOBAL, null, null, (int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8158, 6919048267299802798L ^ j) /* invoke-custom */, null, j5);
                                                D = yp.x(o, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32269, 822744595107927861L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25842, 8715684294380342731L ^ j) /* invoke-custom */, (h) null, qx::w, 4, j6, (Object) null);
                                                S = new bg();
                                                N = CollectionsKt.emptyList();
                                                u = CollectionsKt.emptyList();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j10;
                                            if (i11 >= length2) {
                                                str3 = "ICÌ\u000b&dõâ\u0019\u009da\u0010\u008e:|\u00ad";
                                                length2 = "ICÌ\u000b&dõâ\u0019\u009da\u0010\u008e:|\u00ad".length();
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
                                    j8 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "\u001b\r\u0098\u001f\u000bJ'\u0016ª}ã8T£\u0000\u009b8F\u001a7JJo!ûúlà\u007fV8\u008eËª<ø ªÈ\u0002\u0098¼\u0095¡\u0080\u0013B9ÖZ\u001e\t\u009fÃ\u001b'\u0092¦õ8(5BÃ\u0019¦\u00883f\u0084¨Rr";
                        length = "\u001b\r\u0098\u001f\u000bJ'\u0016ª}ã8T£\u0000\u009b8F\u001a7JJo!ûúlà\u007fV8\u008eËª<ø ªÈ\u0002\u0098¼\u0095¡\u0080\u0013B9ÖZ\u001e\t\u009fÃ\u001b'\u0092¦õ8(5BÃ\u0019¦\u00883f\u0084¨Rr".length();
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

    private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException noWhenBranchMatchedException) {
        return noWhenBranchMatchedException;
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 15448;
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
                d[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/qx", e2);
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
            r1 = 44
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
            java.lang.String r0 = "su/catlean/qx"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qx.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 17434;
        if (g[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/qx", e2);
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
            r1 = 44
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
            java.lang.String r0 = "su/catlean/qx"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qx.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
