package su.catlean;

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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.PostTasksProcessEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qg.class */
public final class qg extends _g {

    @NotNull
    public static final qg f;
    static final KProperty[] F;

    @NotNull
    private static final cw n;

    @NotNull
    private static final cw y;

    @NotNull
    private static final cr G;

    @NotNull
    private static final c8 O;

    @NotNull
    private static final c8 g;

    @NotNull
    private static final c8 e;

    @NotNull
    private static final c8 o;

    @NotNull
    private static final cq b;

    @NotNull
    private static final cq t;

    @NotNull
    private static final cq Y;

    @NotNull
    private static final cq S;

    @NotNull
    private static final bg N;

    @NotNull
    private static final bg X;

    @NotNull
    private static final bg h;
    private static int B;
    private static int k;
    private static final long a = yz.a(2071335294806830349L, 3805267430008194486L, MethodHandles.lookup().lookupClass()).a(252413335889516L);
    private static final String[] c;
    private static final String[] d;
    private static final Map i;
    private static final long[] j;
    private static final Integer[] l;
    private static final Map m;

    /* JADX WARN: Illegal instructions before constructor call */
    private qg(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29285, 3429619289919788405L ^ j3) /* invoke-custom */, jt.I(), null, 4, null, j3 ^ 40305898885883L);
    }

    private final v T(long j2) {
        return (v) n.E(this, (a ^ j2) ^ 25703708667128L, F[0]);
    }

    private final ta K(long j2, char c2) {
        return (ta) y.E(this, (((j2 << 16) | ((((long) c2) << 48) >>> 48)) ^ a) ^ 86539244427302L, F[1]);
    }

    private final nv W(long j2) {
        return (nv) G.E(this, (a ^ j2) ^ 115954698085515L, F[2]);
    }

    private final int h(long j2) {
        return ((Number) O.E(this, (a ^ j2) ^ 132162967536167L, F[3])).intValue();
    }

    private final int p(int i2, long j2) {
        return ((Number) g.E(this, (((((long) i2) << 32) | ((j2 << 32) >>> 32)) ^ a) ^ 11841898087846L, F[4])).intValue();
    }

    private final int R(long j2) {
        return ((Number) e.E(this, (a ^ j2) ^ 61024322270091L, F[5])).intValue();
    }

    private final int l(short s, long j2) {
        long j3 = ((((long) s) << 48) | ((j2 << 16) >>> 16)) ^ a;
        return ((Number) o.E(this, j3 ^ 76233777280167L, F[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31259, 1414832235714437086L ^ j3) /* invoke-custom */])).intValue();
    }

    private final boolean Q(int i2, char c2, short s) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ a;
        return ((Boolean) b.E(this, j2 ^ 20411719709702L, F[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26629, 3715231257856953699L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean Y(long j2) {
        long j3 = a ^ j2;
        return ((Boolean) t.E(this, j3 ^ 136541027396330L, F[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13175, 9151894214768363765L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean F(char c2, int i2, short s) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s) << 48) >>> 48)) ^ a;
        return ((Boolean) Y.E(this, j2 ^ 26615368483135L, F[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10704, 3709868427383568782L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean j(long j2) {
        long j3 = a ^ j2;
        return ((Boolean) S.E(this, j3 ^ 126758124253777L, F[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7256, 2524103420016410494L ^ j3) /* invoke-custom */])).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.v] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.qg] */
    @Flow
    private final void q(PostTasksProcessEvent postTasksProcessEvent) {
        long j2 = a ^ 58282767210913L;
        long j3 = j2 ^ 113230335700892L;
        long j4 = j2 ^ 108448480737629L;
        Object objT = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-153636739794128619L, j2) /* invoke-custom */;
        try {
            objT = this;
            qg qgVar = objT;
            if (objT != 0) {
                try {
                    objT = objT.T(j4);
                    if (objT != v.FAST) {
                        return;
                    } else {
                        qgVar = this;
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objT, -169235459861169074L, j2) /* invoke-custom */;
                }
            }
            qgVar.w(j3, false);
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objT, -169235459861169074L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ef, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ef, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012c  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [su.catlean.qg] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v60, types: [su.catlean.v] */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62, types: [su.catlean.qg] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [su.catlean.qg] */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void Q(su.catlean.api.event.events.player.PlayerUpdateEvent r11) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qg.Q(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:97:0x02f9
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void w(long r13, boolean r15) {
        /*
            Method dump skipped, instruction units count: 1015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qg.w(long, boolean):void");
    }

    private final void z(long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 64083399031397L;
        k = mf.f(new IntRange(h(j3 ^ 100679682083736L), p((int) (j3 >>> 32), ((j3 ^ 45526354840601L) << 32) >>> 32)), false, j4, 2, null);
        B = mf.f(new IntRange(R(j3 ^ 22138729364020L), l((short) (j3 >>> 48), ((j3 ^ 113212269968664L) << 16) >>> 16)), false, j4, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private final boolean M(class_1799 class_1799Var, long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 94881845964787L;
        long j5 = j3 >>> 16;
        int i2 = (int) (((j3 ^ 124838941545310L) << 48) >>> 48);
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7134659273551228872L, j3) /* invoke-custom */;
        try {
            try {
                obj = ml.L[K(j5, (char) i2).ordinal()];
                boolean zContains = obj;
                if (obj != 0) {
                    switch (obj) {
                        case 1:
                            return true;
                        case 2:
                            return W(j4).x().contains(class_1799Var.method_7909());
                        default:
                            zContains = W(j4).x().contains(class_1799Var.method_7909());
                            break;
                    }
                }
                return obj != 0 ? zContains == 0 : zContains;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 7168476901105443475L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 7168476901105443475L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        if (r0 < r16) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        r0 = r8.method_7611(r15).method_7681();
        r1 = r0;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        if (r11 < 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        if (r1 == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        if (r1 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, 7789714136591085042L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        if (r0 == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, 7789714136591085042L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
    
        if (r0 != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
    
        r0 = (r9 > 0 ? 1 : (r9 == 0 ? 0 : -1));
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        if (r0 < 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:40:0x0086, B:34:0x00c7], limit reached: 47 */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c4 -> B:34:0x00c7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean P(net.minecraft.class_1707 r8, long r9, char r11) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qg.P(net.minecraft.class_1707, long, char):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.ta] */
    private static final boolean V() {
        long j2 = a ^ 92786512253162L;
        Object objK = j2;
        try {
            objK = f.K(objK >>> 16, (char) (((objK ^ 99058204263624L) << 48) >>> 48));
            return objK != ta.NONE;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objK, 8425566809828865285L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.v] */
    private static final boolean Z() {
        long j2 = a ^ 130762375546541L;
        Object objT = j2;
        try {
            objT = f.T(objT ^ 36616181163601L);
            return objT == v.FAST;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objT, -2113733238575848638L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.v] */
    private static final boolean e() {
        long j2 = a ^ 53459209979151L;
        Object objT = j2;
        try {
            objT = f.T(objT ^ 113519537284595L);
            return objT == v.FAST;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objT, -6843003433708330784L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.v] */
    private static final boolean t() {
        long j2 = a ^ 105980065130501L;
        Object objT = j2;
        try {
            objT = f.T(objT ^ 61311910922489L);
            return objT == v.ON_TICK;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objT, -8357954820152013334L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.v] */
    private static final boolean M() {
        long j2 = a ^ 140591250801729L;
        Object objT = j2;
        try {
            objT = f.T(objT ^ 44520844125373L);
            return objT == v.ON_TICK;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objT, 2325700056128283054L, j2) /* invoke-custom */;
        }
    }

    private static final boolean n() {
        return f.F((char) (r0 >>> 48), (int) ((((a ^ 15154213190072L) ^ 93717193962627L) << 16) >>> 32), (short) ((r1 << 48) >>> 48));
    }

    static {
        int i2;
        long j2 = a ^ 120356432177155L;
        long j3 = j2 ^ 115361439263265L;
        long j4 = j2 ^ 41218346762261L;
        long j5 = j2 ^ 129689321899187L;
        long j6 = j2 ^ 91809484572330L;
        long j7 = j2 ^ 136509640379340L;
        long j8 = j2 ^ 67457261941112L;
        i = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[42];
        int i4 = 0;
        String str = "å\u0081)ö\\º&\u001bÀ\tý\u0091ho]X´\u008a=\u009dªÜ.[<e\u0012\u008a\u0080ÄJH8Bá \\a\n¹\u0001\u001b£MywØ\u009663qQQ*i\u0016Ë\b\u009a{ñ¹^SÜnCæ\u0084¡Øo\u0082ðºÈG{¤¹\u0003\u001fY®æ\u000bbÎÓ\u0010ë\u0013ÛpÒSÑkÄ}^,Á<\u001a\u00ad\u0018\u001b\b6ZË\u0097µÞ¤\u008a»\u0090B\n=\u00adÅ¦EÕöt\u0087Å\u0010x\u008e±\u0088Lm<#¥ñ-N]UW\u001e00 \u009f\\Ô/÷\u00123»©sK-\u0084\u0013\u008bÏ\u0083~,ò\u008fô#\u0086Üg½mIP7\u007fÉm\u0016,.w$\u0092p\u0007á\u007f\u0093é0þÊ\u0096¨bJ¨\u0010\u000b2\u009e¦ª¥\u0014¢\në:\u0007\u0019RPÄ\f\u0011¶jj+ÓS\u0087L×]¯H\u009f0uêqX\u0010gÄÜ I\u000eâÑ\"±y´Ó\u0000\u0005ô\u001axÐ¸!äSA\u008fÐ\u009b\u000f5¤º?û»/\u008a\u0018J4Ô\u0088\rf\u001e\fPüv¼\u00073\u009b\u008fá\u0001\u0019÷m¤Ë\u009e ýÐìk\u007f\u0002\u007fac²\u0004³~bÛ[\u009aMI\u0085!ê$å\u008a\f\\\u001f/\u0003\u0002<\u0010×ê\u000bx\u008c\u0084qÃÞ\u0087\u001eh¥å\u000fÌ ¿&Zñ\u0099Éº¬#Ãh2P\u0007ÕO\u0097îE¾\u009d\u0007g\u0089{d¤t\u008cåáå Qtð\u0098!\u001aåA@YÍ7øÈ\u0093Õ~Ä\u00adpsÌ¡\u0096\u008b5ä¦*\u000bOs ¹§óW8ò¿Z\bº\u0088Ü7Q¾¹¼êÜ³/¡OÎ\u009c3\u000fâ\u0014?\u000bixpìjé\u0080Hõ.üê6C\tMù×C\bü\u0006\u0013\u0081\u000e0\u009bí`2ÇZÄ³\u0016\u00876ö=)ÕÐ\u009d\u008d± \u0003ø\u009bß\u0016®T\u008a\u008fÌ\u0002q\u0017\u009b\u001aÿ\u008b(é»)T;\u0082ëG{\u0099Ù3×dinO\u0013[ý \u0084\u0084R\u001e¤\u000f\u0010\u0001,Ðq4çU#æ\u008c\fT>\u0006e$\u0093W\u001c<$KØl@s/T2T(B\u0093,ªöQÈ5Öüú×|sb¿\u008eÀÄGC.¹§Åä!â\u0082¸\u0080¡){Ó\u0006>\u0007¨¸ iVÃé]þ2éS\u009f\u008d¡¢R|«\u0007$»\u0091¿\u0016Jñ\u008d\u008b*\u009aB´\u0088¼ PVñElm\"?nnuxy\u0089øIÎÅ.\u001fÁÜ\u0090\u0097b}\u0084+1\u0015?a\u0010\u009b\u008f\u0006|#´â\nó£ëKÞJ§Õ\u0010Ê\t\u0081v\u000eÍ\u0004Ì\u008aØ\u0006\u0084%\u0088\u0015^\u0010£X0uKq·\u0010_£'\u0000öBMR\u0018\u008e\u0081+o\u0002\f!Îïö\u0088\u0096ö:ü+°¾\u0092±\u0012¼¥X0Z½xÁ·ÿ¼·\rõ\u007f¡@Uì\u0082å\u000f\u009dYm\ryt\f\u001eÉ\u0017\u0010«Ð\u008c\u001acÅßÕï\u0096k\u008cq\u0006\"§\u0090\u0011ÿ õÙ9\u008aÔ\u0007¸³Ø\u0095à¦#]]Á\u008f\u0087E_\f¤\u001c\f)ì«\u0013\u0091dW\u0003 \u009førËC\u0001\u0007Í\u0090\u0000[cc\u0013´\u001f7±,eÈ\u008b5¨WÎ4O\u0010(\u0099\u0088\u0010Ñ&\u001c\u0013/àI\u0017\u0002ðÑÖò¨´m\u0018%øqü\u0090)¬Zô\u0003\u0003Óu\u0086¿Ifñ\u0011\u0004\u001aV.'\u0010W\u0080à\u007f\u0015;\u0094\u001eüõÍz\u0083wÆ\u0094\u0018\u0088|õÄ?\u008293û*\u0015¨\u0093Ê\u008eä\u008d\u009e\fÙ¤\u0019ÚZ\u0010N²-g.ýZîuùPÃî(iê !\u0012+\u0006iA\u0080îü¨\u008b`/k(ô=N!ýhb4\u009d\u0015Ï¯åi\u0089úÍ0¤ÜózÑ/öi\u00105Èû©°¬Rvb_\u001b~\u0097ø\u009aB(g±\u009adi$»G\u0083tY¯ÕµÓÚýP&å\u0000%(ÿîÂ\u009eêj§»'\u0097¥FÎ]\u0080&Zf£_µøÆÔù;_LÚe\u0005áL\t\u008aÜD¬#\u0084 ¥}8ÃÄJÇ%íY\u0090KqBw\u0097ÛÃtémh]ÒÀÀ+ZHØJ (+üS,S\u008e8\u0010%~\u001e¹IÔ\u0013óûÀ\u0094\t\u0013ý\u0088\u0080A\u0018\u008fù´Ý\u00121\u00115VÖ \u0087ð[ :t¤of\u0094\u008bÛf]:d\u0019Üí\u008aÆ\u00840â\u000f×\u0000Çj±2\u0014\u0014o\u0082¦\u0018&»\u0014£\u0019à\u0003U¼ìB\u0014\u0088=½îw5K\u0014¶ \u001c\u0081 \u0088ag\u0080Ï äÇ9\u0084¹h\u0015\u001f}zxÞÚ\u0095p<Ê¿\u001dÜ\u00896ÝÂ½\u009b\u0018É*û7\t%]¯\u0010;Éwòåé«åüf\u00ad$\u0086ØI\u0018þ#·J.Ç\u0083ß¨Ó ¢ò\u0014\u0001\u0011gÝj¤ü¾d\u009a";
        int length = "å\u0081)ö\\º&\u001bÀ\tý\u0091ho]X´\u008a=\u009dªÜ.[<e\u0012\u008a\u0080ÄJH8Bá \\a\n¹\u0001\u001b£MywØ\u009663qQQ*i\u0016Ë\b\u009a{ñ¹^SÜnCæ\u0084¡Øo\u0082ðºÈG{¤¹\u0003\u001fY®æ\u000bbÎÓ\u0010ë\u0013ÛpÒSÑkÄ}^,Á<\u001a\u00ad\u0018\u001b\b6ZË\u0097µÞ¤\u008a»\u0090B\n=\u00adÅ¦EÕöt\u0087Å\u0010x\u008e±\u0088Lm<#¥ñ-N]UW\u001e00 \u009f\\Ô/÷\u00123»©sK-\u0084\u0013\u008bÏ\u0083~,ò\u008fô#\u0086Üg½mIP7\u007fÉm\u0016,.w$\u0092p\u0007á\u007f\u0093é0þÊ\u0096¨bJ¨\u0010\u000b2\u009e¦ª¥\u0014¢\në:\u0007\u0019RPÄ\f\u0011¶jj+ÓS\u0087L×]¯H\u009f0uêqX\u0010gÄÜ I\u000eâÑ\"±y´Ó\u0000\u0005ô\u001axÐ¸!äSA\u008fÐ\u009b\u000f5¤º?û»/\u008a\u0018J4Ô\u0088\rf\u001e\fPüv¼\u00073\u009b\u008fá\u0001\u0019÷m¤Ë\u009e ýÐìk\u007f\u0002\u007fac²\u0004³~bÛ[\u009aMI\u0085!ê$å\u008a\f\\\u001f/\u0003\u0002<\u0010×ê\u000bx\u008c\u0084qÃÞ\u0087\u001eh¥å\u000fÌ ¿&Zñ\u0099Éº¬#Ãh2P\u0007ÕO\u0097îE¾\u009d\u0007g\u0089{d¤t\u008cåáå Qtð\u0098!\u001aåA@YÍ7øÈ\u0093Õ~Ä\u00adpsÌ¡\u0096\u008b5ä¦*\u000bOs ¹§óW8ò¿Z\bº\u0088Ü7Q¾¹¼êÜ³/¡OÎ\u009c3\u000fâ\u0014?\u000bixpìjé\u0080Hõ.üê6C\tMù×C\bü\u0006\u0013\u0081\u000e0\u009bí`2ÇZÄ³\u0016\u00876ö=)ÕÐ\u009d\u008d± \u0003ø\u009bß\u0016®T\u008a\u008fÌ\u0002q\u0017\u009b\u001aÿ\u008b(é»)T;\u0082ëG{\u0099Ù3×dinO\u0013[ý \u0084\u0084R\u001e¤\u000f\u0010\u0001,Ðq4çU#æ\u008c\fT>\u0006e$\u0093W\u001c<$KØl@s/T2T(B\u0093,ªöQÈ5Öüú×|sb¿\u008eÀÄGC.¹§Åä!â\u0082¸\u0080¡){Ó\u0006>\u0007¨¸ iVÃé]þ2éS\u009f\u008d¡¢R|«\u0007$»\u0091¿\u0016Jñ\u008d\u008b*\u009aB´\u0088¼ PVñElm\"?nnuxy\u0089øIÎÅ.\u001fÁÜ\u0090\u0097b}\u0084+1\u0015?a\u0010\u009b\u008f\u0006|#´â\nó£ëKÞJ§Õ\u0010Ê\t\u0081v\u000eÍ\u0004Ì\u008aØ\u0006\u0084%\u0088\u0015^\u0010£X0uKq·\u0010_£'\u0000öBMR\u0018\u008e\u0081+o\u0002\f!Îïö\u0088\u0096ö:ü+°¾\u0092±\u0012¼¥X0Z½xÁ·ÿ¼·\rõ\u007f¡@Uì\u0082å\u000f\u009dYm\ryt\f\u001eÉ\u0017\u0010«Ð\u008c\u001acÅßÕï\u0096k\u008cq\u0006\"§\u0090\u0011ÿ õÙ9\u008aÔ\u0007¸³Ø\u0095à¦#]]Á\u008f\u0087E_\f¤\u001c\f)ì«\u0013\u0091dW\u0003 \u009førËC\u0001\u0007Í\u0090\u0000[cc\u0013´\u001f7±,eÈ\u008b5¨WÎ4O\u0010(\u0099\u0088\u0010Ñ&\u001c\u0013/àI\u0017\u0002ðÑÖò¨´m\u0018%øqü\u0090)¬Zô\u0003\u0003Óu\u0086¿Ifñ\u0011\u0004\u001aV.'\u0010W\u0080à\u007f\u0015;\u0094\u001eüõÍz\u0083wÆ\u0094\u0018\u0088|õÄ?\u008293û*\u0015¨\u0093Ê\u008eä\u008d\u009e\fÙ¤\u0019ÚZ\u0010N²-g.ýZîuùPÃî(iê !\u0012+\u0006iA\u0080îü¨\u008b`/k(ô=N!ýhb4\u009d\u0015Ï¯åi\u0089úÍ0¤ÜózÑ/öi\u00105Èû©°¬Rvb_\u001b~\u0097ø\u009aB(g±\u009adi$»G\u0083tY¯ÕµÓÚýP&å\u0000%(ÿîÂ\u009eêj§»'\u0097¥FÎ]\u0080&Zf£_µøÆÔù;_LÚe\u0005áL\t\u008aÜD¬#\u0084 ¥}8ÃÄJÇ%íY\u0090KqBw\u0097ÛÃtémh]ÒÀÀ+ZHØJ (+üS,S\u008e8\u0010%~\u001e¹IÔ\u0013óûÀ\u0094\t\u0013ý\u0088\u0080A\u0018\u008fù´Ý\u00121\u00115VÖ \u0087ð[ :t¤of\u0094\u008bÛf]:d\u0019Üí\u008aÆ\u00840â\u000f×\u0000Çj±2\u0014\u0014o\u0082¦\u0018&»\u0014£\u0019à\u0003U¼ìB\u0014\u0088=½îw5K\u0014¶ \u001c\u0081 \u0088ag\u0080Ï äÇ9\u0084¹h\u0015\u001f}zxÞÚ\u0095p<Ê¿\u001dÜ\u00896ÝÂ½\u009b\u0018É*û7\t%]¯\u0010;Éwòåé«åüf\u00ad$\u0086ØI\u0018þ#·J.Ç\u0083ß¨Ó ¢ò\u0014\u0001\u0011gÝj¤ü¾d\u009a".length();
        char cCharAt = ' ';
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
                            c = strArr;
                            d = new String[42];
                            m = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[24];
                            int i10 = 0;
                            String str3 = "\u009aØâ¤z°\u008añHCuÊPO±d6\u0012å3ö(GÎ\u001f\nÍz[`ò?\u008eÊP\\t\u009dÓ\u001cÔ¿,±,F\u001eþ±\u009c\u0088ùc\u0003XU/>¸Op=\u00adû\\Íc\u000f §M¯@èeÙ\u0004£S$&ÊèI\u001f?èQ¹\u0091\u0003÷e\u008cF¡\u009egìü\u001bDé×\u001cÓ\u0094\u0000¨\u0004*LhiR*s/Ì\u008886Q\u009aÚ¯±ÁáX++ùu\u0081ùZ3äe¦¡\u0083U¾°Ö\u0098\u007f\u0013,\u008a\u0018\u008eú @,SíÊúQ\u008c_½C\u009cµc\u0092wZìrê";
                            int length2 = "\u009aØâ¤z°\u008añHCuÊPO±d6\u0012å3ö(GÎ\u001f\nÍz[`ò?\u008eÊP\\t\u009dÓ\u001cÔ¿,±,F\u001eþ±\u009c\u0088ùc\u0003XU/>¸Op=\u00adû\\Íc\u000f §M¯@èeÙ\u0004£S$&ÊèI\u001f?èQ¹\u0091\u0003÷e\u008cF¡\u009egìü\u001bDé×\u001cÓ\u0094\u0000¨\u0004*LhiR*s/Ì\u008886Q\u009aÚ¯±ÁáX++ùu\u0081ùZ3äe¦¡\u0083U¾°Ö\u0098\u007f\u0013,\u008a\u0018\u008eú @,SíÊúQ\u008c_½C\u009cµc\u0092wZìrê".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j9 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j10 = j9;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j10 >>> 56), (byte) (j10 >>> 48), (byte) (j10 >>> 40), (byte) (j10 >>> 32), (byte) (j10 >>> 24), (byte) (j10 >>> 16), (byte) (j10 >>> 8), (byte) j10});
                                    long j11 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j11;
                                            if (i11 >= length2) {
                                                j = jArr;
                                                l = new Integer[24];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5724, 2723922952270497330L ^ j2) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(qg.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11343, 7927933774195573830L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11484, 6801201051936834769L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(qg.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7808, 3907239587928667801L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12429, 3612349139915528327L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(qg.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27337, 9082447902490034911L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29156, 7599911886515706352L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(qg.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7484, 6718450196473738544L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4672, 1187440486115211844L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(qg.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4606, 290607337511156207L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12796, 1042489855244130775L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(qg.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30606, 5228032920392867739L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25575, 8981537754079824873L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2956, 1840297053603159033L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(qg.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29149, 224641420563454455L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24557, 2572411234096363460L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18930, 8705587070705637786L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(qg.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1258, 1798352873598610665L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10252, 5833060637597745169L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7856, 8145181563148750559L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(qg.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25398, 8595540515464973102L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10660, 7226688140536824228L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5305, 2054551900597404871L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(qg.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21309, 7442878091460098855L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24337, 3752616094821726015L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24186, 8544468828269710864L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(qg.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13841, 4349804316201868830L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24104, 2668530544940332576L ^ j2) /* invoke-custom */, 0));
                                                F = kPropertyArr;
                                                f = new qg(j3);
                                                n = yp.L(f, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26429, 8918016317411200802L ^ j2) /* invoke-custom */, v.FAST, null, null, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11226, 8815863240003025831L ^ j2) /* invoke-custom */, null, j8);
                                                y = yp.L(f, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1666, 5642317512811310736L ^ j2) /* invoke-custom */, ta.NONE, null, null, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17308, 659821771902751727L ^ j2) /* invoke-custom */, null, j8);
                                                G = yp.j(j4, f, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(645, 5305566183352265365L ^ j2) /* invoke-custom */, new nv((List) null, 1, j5, (DefaultConstructorMarker) null), null, qg::V, 4, null);
                                                O = yp.L(f, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9038, 8012411826874370924L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20872, 2238875150362477055L ^ j2) /* invoke-custom */, new IntRange(0, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6488, 8480571710303193388L ^ j2) /* invoke-custom */), j6, null, qg::Z, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7856, 8145181563148750559L ^ j2) /* invoke-custom */, null);
                                                g = yp.L(f, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8506, 5674344317594323218L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23119, 9101584666319555108L ^ j2) /* invoke-custom */, new IntRange(0, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22465, 9101478766867253168L ^ j2) /* invoke-custom */), j6, null, qg::e, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7856, 8145181563148750559L ^ j2) /* invoke-custom */, null);
                                                e = yp.L(f, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13461, 8165459079022238906L ^ j2) /* invoke-custom */, 0, new IntRange(0, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9949, 8010077013283960491L ^ j2) /* invoke-custom */), j6, null, qg::t, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7856, 8145181563148750559L ^ j2) /* invoke-custom */, null);
                                                o = yp.L(f, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21112, 3606622334471879259L ^ j2) /* invoke-custom */, 1, new IntRange(0, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21187, 8623519182845117119L ^ j2) /* invoke-custom */), j6, null, qg::M, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7856, 8145181563148750559L ^ j2) /* invoke-custom */, null);
                                                b = yp.t(f, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10379, 1308128317427630231L ^ j2) /* invoke-custom */, false, j7, null, null, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17308, 659821771902751727L ^ j2) /* invoke-custom */, null);
                                                t = yp.t(f, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16304, 1621062917525034919L ^ j2) /* invoke-custom */, false, j7, null, null, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17308, 659821771902751727L ^ j2) /* invoke-custom */, null);
                                                Y = yp.t(f, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11470, 3239687678674552012L ^ j2) /* invoke-custom */, false, j7, null, null, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17308, 659821771902751727L ^ j2) /* invoke-custom */, null);
                                                S = yp.t(f, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30549, 3179911769809395540L ^ j2) /* invoke-custom */, false, j7, null, qg::n, 4, null);
                                                N = new bg();
                                                X = new bg();
                                                h = new bg();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j11;
                                            if (i11 >= length2) {
                                                str3 = "Ñ\u00910¨\u0096&-Á¥\u0093\fZ3ÊÊ\u0007";
                                                length2 = "Ñ\u00910¨\u0096&-Á¥\u0093\fZ3ÊÊ\u0007".length();
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
                                    j9 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "¢J,ãN°_¶\\\u0087Dß80¹E¼ºLÙ\u0083\u0010>W\u0093Ã\u0081Bof·% \u0000\u0099|ØÁ,kë#æ/Czý\u009füL\u0012\u0085ãÖRÌ}\u0015\u00adðü\u009aàºü";
                        length = "¢J,ãN°_¶\\\u0087Dß80¹E¼ºLÙ\u0083\u0010>W\u0093Ã\u0081Bof·% \u0000\u0099|ØÁ,kë#æ/Czý\u009füL\u0012\u0085ãÖRÌ}\u0015\u00adðü\u009aàºü".length();
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 9493;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) i.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = b(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/qg", e2);
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
            r1 = 1065353216(0x3f800000, float:1.0)
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
            java.lang.String r1 = "su/catlean/qg"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qg.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 7523;
        if (l[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) j[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) m.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/qg", e2);
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
            r1 = 1065353216(0x3f800000, float:1.0)
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
            java.lang.String r1 = "su/catlean/qg"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qg.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
