package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_x.class */
public final class _x extends _g {

    @NotNull
    public static final _x I = null;
    static final KProperty[] E = null;

    @NotNull
    private static final cw d = null;

    @NotNull
    private static final cq C = null;

    @NotNull
    private static final cq h = null;

    @NotNull
    private static final cq e = null;

    @NotNull
    private static final cq L = null;

    @NotNull
    private static final cq u = null;

    @NotNull
    private static final cq j = null;

    @NotNull
    private static final cq t = null;

    @NotNull
    private static final cq F = null;

    @NotNull
    private static final ct Y = null;

    @NotNull
    private static final ct A = null;
    private static boolean k;
    private static boolean a;
    private static int X;
    private static boolean O;
    private static final long b = 0;
    private static final String[] c = null;
    private static final String[] f = null;
    private static final Map g = null;
    private static final long[] i = null;
    private static final Integer[] l = null;
    private static final Map m = null;
    private static final long[] n = null;
    private static final Long[] o = null;
    private static final Map w = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private _x(long j2) {
        long j3 = b ^ j2;
        super((String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7689, 8508297698189163217L ^ j3) /* invoke-custom */, jt.c(), null, 4, null, j3 ^ 9375985692863L);
    }

    private final zn Z(long j2) {
        return (zn) d.E(this, (b ^ j2) ^ 74696899056366L, E[0]);
    }

    private final boolean E(long j2) {
        return ((Boolean) C.E(this, (b ^ j2) ^ 110834260996783L, E[1])).booleanValue();
    }

    private final void s(byte b2, long j2, boolean z) {
        C.b(this, (((((long) b2) << 56) | ((j2 << 8) >>> 8)) ^ b) ^ 57980964804213L, E[1], Boolean.valueOf(z));
    }

    private final boolean H(long j2) {
        return ((Boolean) h.E(this, (b ^ j2) ^ 70122064450835L, E[2])).booleanValue();
    }

    private final void A(boolean z, long j2) {
        h.b(this, (b ^ j2) ^ 121953538849909L, E[2], Boolean.valueOf(z));
    }

    private final boolean a(long j2) {
        return ((Boolean) e.E(this, (b ^ j2) ^ 96982589369995L, E[3])).booleanValue();
    }

    private final void t(boolean z, long j2) {
        e.b(this, (b ^ j2) ^ 139395019270443L, E[3], Boolean.valueOf(z));
    }

    private final boolean C(long j2, char c2) {
        return ((Boolean) L.E(this, (((j2 << 16) | ((((long) c2) << 48) >>> 48)) ^ b) ^ 51179198948642L, E[4])).booleanValue();
    }

    private final void y(byte b2, boolean z, long j2) {
        L.b(this, (((((long) b2) << 56) | ((j2 << 8) >>> 8)) ^ b) ^ 120755343625771L, E[4], Boolean.valueOf(z));
    }

    private final boolean e(long j2) {
        return ((Boolean) u.E(this, (b ^ j2) ^ 26583339060316L, E[5])).booleanValue();
    }

    private final void p(boolean z, long j2) {
        u.b(this, (b ^ j2) ^ 114974977754404L, E[5], Boolean.valueOf(z));
    }

    private final boolean F(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) j.E(this, j3 ^ 14844571999008L, E[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3681, 8365690531934218540L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void E(boolean z, long j2) {
        long j3 = b ^ j2;
        j.b(this, j3 ^ 117188477068751L, E[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3681, 8365636241386651695L ^ j3) /* invoke-custom */], Boolean.valueOf(z));
    }

    private final boolean w(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) t.E(this, j3 ^ 387151083559L, E[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4415, 3497123079160943995L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void G(boolean z, long j2) {
        long j3 = b ^ j2;
        t.b(this, j3 ^ 116086343907663L, E[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4415, 3497074608483746815L ^ j3) /* invoke-custom */], Boolean.valueOf(z));
    }

    private final boolean r(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) F.E(this, j3 ^ 115326175885141L, E[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18093, 4353916691222662546L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void l(long j2, boolean z) {
        long j3 = b ^ j2;
        F.b(this, j3 ^ 43692114680003L, E[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18093, 4353928069387859432L ^ j3) /* invoke-custom */], Boolean.valueOf(z));
    }

    private final float D(long j2) {
        long j3 = b ^ j2;
        return ((Number) Y.E(this, j3 ^ 72737077806967L, E[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29405, 1893946745906579906L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void N(long j2, float f2) {
        long j3 = b ^ j2;
        Y.b(this, j3 ^ 15713972366755L, E[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29405, 1894008967086945530L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float I(long j2) {
        long j3 = b ^ j2;
        return ((Number) A.E(this, j3 ^ 37321013123153L, E[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23166, 2161855439548939844L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void t(long j2, float f2) {
        long j3 = b ^ j2;
        A.b(this, j3 ^ 1423034969551L, E[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23166, 2161834884119845942L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void n(su.catlean.api.event.events.network.ReceivePacket r14) {
        /*
            Method dump skipped, instruction units count: 1371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._x.n(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final boolean g(long r10) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._x.g(long):boolean");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:25:0x00d6
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow(priority = -10)
    private final void V(su.catlean.api.event.events.player.PlayerUpdateEvent r15) {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._x.V(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void w(su.catlean.api.event.events.network.SendPacket r8) {
        /*
            r7 = this;
            long r0 = su.catlean._x.b
            r1 = 49469373520602(0x2cfdfc6f9ada, double:2.4441117977818E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 119191357812473(0x6c67668aeef9, double:5.88883551763146E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 3896410102352101421(0x3612d45811f0c02d, double:3.2209113492952185E-48)
            r1 = r9
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r13 = r0
            r0 = r7
            r1 = r11
            boolean r0 = r0.w(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L2d
            r1 = r13
            if (r1 != 0) goto L3a
            if (r0 == 0) goto L7c
            goto L37
        L2d:
            r1 = 3946773138000854513(0x36c5c14213983df1, double:7.621282069395818E-45)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L37:
            boolean r0 = su.catlean._x.a
        L3a:
            r1 = r13
            if (r1 != 0) goto L75
            if (r0 == 0) goto L7c
            goto L4f
        L45:
            r1 = 3946773138000854513(0x36c5c14213983df1, double:7.621282069395818E-45)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L58
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L58
        L4f:
            r0 = r8
            r1 = r13
            if (r1 != 0) goto L79
            goto L62
        L58:
            r1 = 3946773138000854513(0x36c5c14213983df1, double:7.621282069395818E-45)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L6b
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L6b
        L62:
            net.minecraft.class_2596 r0 = r0.getPacket()     // Catch: kotlin.NoWhenBranchMatchedException -> L6b
            boolean r0 = r0 instanceof net.minecraft.class_2828     // Catch: kotlin.NoWhenBranchMatchedException -> L6b
            goto L75
        L6b:
            r1 = 3946773138000854513(0x36c5c14213983df1, double:7.621282069395818E-45)
            r2 = r9
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L75:
            if (r0 == 0) goto L7c
            r0 = r8
        L79:
            r0.cancel()
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._x.w(su.catlean.api.event.events.network.SendPacket):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public final void L(long j2, short s) {
        long j3 = ((j2 << 16) | ((((long) s) << 48) >>> 48)) ^ b;
        long j4 = j3 ^ 77075406452581L;
        Object objR = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6881391845928086349L, j3) /* invoke-custom */;
        try {
            objR = r(j4);
            boolean z = objR;
            if (objR != 0) {
                if (objR == 0) {
                    return;
                } else {
                    z = 0;
                }
            }
            a = z;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objR, -6905280993660916961L, j3) /* invoke-custom */;
        }
    }

    @Override // su.catlean._g
    public void O(long j2) {
        X = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.zn] */
    private static final boolean n() {
        long j2 = b ^ 109528183324080L;
        Object objZ = j2;
        try {
            objZ = I.Z(objZ ^ 106319779603290L);
            return objZ == zn.GrimNew;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, 1274393498052860571L, j2) /* invoke-custom */;
        }
    }

    private static final boolean j() {
        return I.e((b ^ 117853263748161L) ^ 56908542467097L);
    }

    private static final boolean h() {
        return I.w((b ^ 94147241036153L) ^ 23342178286938L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.zn] */
    private static final boolean Y() {
        long j2 = b ^ 78103053641889L;
        Object objZ = j2;
        try {
            objZ = I.Z(objZ ^ 74937717175883L);
            return objZ == zn.Custom;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, 341898325340131210L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.zn] */
    private static final boolean A() {
        long j2 = b ^ 50921094166876L;
        Object objZ = j2;
        try {
            objZ = I.Z(objZ ^ 49894525839286L);
            return objZ == zn.Custom;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, 1532283734102711927L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [net.minecraft.class_2846] */
    private static final class_2596 q(int i2) {
        class_2338 class_2338VarMethod_49638;
        long j2 = b ^ 58317420802853L;
        Object class_2846Var = j2;
        long j3 = class_2846Var ^ 18722685324686L;
        int i3 = (int) (class_2846Var >>> 56);
        long j4 = ((class_2846Var ^ 84261198843171L) << 8) >>> 8;
        long j5 = class_2846Var ^ 52707531279650L;
        try {
            class_2846.class_2847 class_2847Var = class_2846.class_2847.field_12973;
            if (!zf.v(j5).method_20448()) {
                class_2338VarMethod_49638 = I.E(j3) ? class_2338.method_49638(I.J((byte) i3, j4, (class_1297) zf.v(j5))) : zf.v(j5).method_24515().method_10084();
            }
            class_2846Var = new class_2846(class_2847Var, class_2338VarMethod_49638, class_2350.field_11033, i2);
            return (class_2596) class_2846Var;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_2846Var, 2250349239933670414L, j2) /* invoke-custom */;
        }
    }

    public static void R(boolean z) {
        O = z;
    }

    public static boolean q() {
        return O;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean i() {
        return !q();
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

    private static String b(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 1203;
        if (f[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) g.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                f[i3] = b(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/_x", e2);
            }
        }
        return f[i3];
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
            r1 = 11446(0x2cb6, float:1.6039E-41)
            r2 = 0
            r3 = 0
            java.lang.invoke.MethodHandle r1 = r1.asCollector(r2, r3)
            r2 = 0
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r11
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = r9
            r4[r5] = r6
            java.lang.invoke.MethodHandle r1 = java.lang.invoke.MethodHandles.insertArguments(r1, r2, r3)
            r2 = r10
            java.lang.invoke.MethodHandle r1 = java.lang.invoke.MethodHandles.explicitCastArguments(r1, r2)
            r0.setTarget(r1)
            goto L62
            r12 = r-1
            java.lang.RuntimeException r-1 = new java.lang.RuntimeException
            r0 = r-1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "su/catlean/_x"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " : "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " : "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r12
            r0.<init>(r1, r2)
            throw r-1
            r0 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._x.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 12396;
        if (l[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) i[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) m.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/_x", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            l[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return l[i3].intValue();
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
            r1 = 11446(0x2cb6, float:1.6039E-41)
            r2 = 0
            r3 = 0
            java.lang.invoke.MethodHandle r1 = r1.asCollector(r2, r3)
            r2 = 0
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r11
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = r9
            r4[r5] = r6
            java.lang.invoke.MethodHandle r1 = java.lang.invoke.MethodHandles.insertArguments(r1, r2, r3)
            r2 = r10
            java.lang.invoke.MethodHandle r1 = java.lang.invoke.MethodHandles.explicitCastArguments(r1, r2)
            r0.setTarget(r1)
            goto L62
            r12 = r-1
            java.lang.RuntimeException r-1 = new java.lang.RuntimeException
            r0 = r-1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "su/catlean/_x"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " : "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " : "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r12
            r0.<init>(r1, r2)
            throw r-1
            r0 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._x.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static long e(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 15988;
        if (o[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) n[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) w.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    w.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/_x", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            o[i3] = Long.valueOf(((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255));
        }
        return o[i3].longValue();
    }

    private static long e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        long jE = e(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Long.TYPE, Long.valueOf(jE)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return jE;
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
    private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = 11446(0x2cb6, float:1.6039E-41)
            r2 = 0
            r3 = 0
            java.lang.invoke.MethodHandle r1 = r1.asCollector(r2, r3)
            r2 = 0
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r11
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = r9
            r4[r5] = r6
            java.lang.invoke.MethodHandle r1 = java.lang.invoke.MethodHandles.insertArguments(r1, r2, r3)
            r2 = r10
            java.lang.invoke.MethodHandle r1 = java.lang.invoke.MethodHandles.explicitCastArguments(r1, r2)
            r0.setTarget(r1)
            goto L62
            r12 = r-1
            java.lang.RuntimeException r-1 = new java.lang.RuntimeException
            r0 = r-1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "su/catlean/_x"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " : "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " : "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r12
            r0.<init>(r1, r2)
            throw r-1
            r0 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._x.e(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
