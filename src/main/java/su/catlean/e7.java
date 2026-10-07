package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.random.Random;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1536;
import net.minecraft.class_2767;
import net.minecraft.class_3417;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/e7.class */
public final class e7 extends _g {

    @NotNull
    public static final e7 U;
    static final KProperty[] C;

    @NotNull
    private static final cw O;

    @NotNull
    private static final cq L;

    @NotNull
    private static final cq o;

    @NotNull
    private static final cq W;
    private static boolean m;

    @NotNull
    private static final bg x;

    @NotNull
    private static final bg X;
    private static final long a = yz.a(1111780659855604800L, -2920809087298162523L, MethodHandles.lookup().lookupClass()).a(185081670462412L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /* JADX WARN: Illegal instructions before constructor call */
    private e7(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29980, 9111532957054145103L ^ j2) /* invoke-custom */, jt.v(), null, 4, null, j2 ^ 132475309305367L);
    }

    private final bh s(int i, int i2, int i3) {
        return (bh) O.E(this, ((((((long) i) << 32) | ((((long) i2) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ a) ^ 98861187870682L, C[0]);
    }

    private final boolean I(long j) {
        return ((Boolean) L.E(this, (a ^ j) ^ 76137543129118L, C[1])).booleanValue();
    }

    private final boolean n(long j) {
        return ((Boolean) o.E(this, (a ^ j) ^ 93491009567446L, C[2])).booleanValue();
    }

    private final boolean q(long j) {
        return ((Boolean) W.E(this, (a ^ j) ^ 52902343176829L, C[3])).booleanValue();
    }

    @Override // su.catlean._g
    public void b(long j) {
        m = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [net.minecraft.class_1536] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [su.catlean.e7] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    @Flow
    private final void B(ReceivePacket receivePacket) {
        long j = a ^ 43443011126549L;
        long j2 = j ^ 132331377509499L;
        long j3 = j ^ 68906478134987L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j3 << 32) >>> 48);
        int i3 = (int) ((j3 << 48) >>> 48);
        long j4 = j ^ 129208012857199L;
        Object objS = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8284461959623333084L, j) /* invoke-custom */;
        try {
            try {
                try {
                    if (receivePacket.getPacket() instanceof class_2767) {
                        objS = s(i, i2, i3);
                        Object objComp_349 = objS;
                        if (objS != null) {
                            if (objS != bh.V1_12_2) {
                                return;
                            } else {
                                objComp_349 = receivePacket.getPacket().method_11894().comp_349();
                            }
                        }
                        try {
                            try {
                                try {
                                    if (Intrinsics.areEqual(objComp_349, class_3417.field_14660)) {
                                        objComp_349 = zf.v(j4).field_7513;
                                        ?? r0 = objComp_349;
                                        if (objS != null) {
                                            if (objComp_349 == null) {
                                                return;
                                            }
                                            class_1536 class_1536Var = zf.v(j4).field_7513;
                                            Intrinsics.checkNotNull(class_1536Var);
                                            r0 = class_1536Var;
                                        }
                                        try {
                                            if (r0.method_5649(receivePacket.getPacket().method_11890(), receivePacket.getPacket().method_11889(), receivePacket.getPacket().method_11893()) < 4.0d) {
                                                r0 = this;
                                                r0.H(j2);
                                            }
                                        } catch (NumberFormatException unused) {
                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8262681357251362033L, j) /* invoke-custom */;
                                        }
                                    }
                                } catch (NumberFormatException unused2) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objComp_349, -8262681357251362033L, j) /* invoke-custom */;
                                }
                            } catch (NumberFormatException unused3) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objComp_349, -8262681357251362033L, j) /* invoke-custom */;
                            }
                        } catch (NumberFormatException unused4) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objComp_349, -8262681357251362033L, j) /* invoke-custom */;
                        }
                    }
                } catch (NumberFormatException unused5) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objS, -8262681357251362033L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused6) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objS, -8262681357251362033L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused7) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objS, -8262681357251362033L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:70:0x0249
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow(priority = -10)
    private final void c(su.catlean.api.event.events.player.PlayerUpdateEvent r12) {
        /*
            Method dump skipped, instruction units count: 950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e7.c(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private final void H(long j) {
        class_746 class_746VarV;
        long j2 = a ^ j;
        long j3 = j2 ^ 117413661917835L;
        long j4 = j2 ^ 70852669273602L;
        long j5 = j2 ^ 108491194634753L;
        String[] strArr = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4581926009179118006L, j2) /* invoke-custom */;
        Object objQ = strArr;
        if (objQ != 0) {
            try {
                objQ = q(j4);
                if (objQ != 0) {
                    int iNextDouble = (int) ((Random.Default.nextDouble() * 150.0d) + 200.0d);
                    bo.S.Y().execute(new yy(iNextDouble));
                    int i = iNextDouble * 2;
                    class_746VarV = null;
                    try {
                        bo.S.Y().execute(new w5(i));
                        if (j2 >= 0) {
                            if (strArr != null) {
                                return;
                            }
                            ag.K(class_1268.field_5808, 0.0f, j3, 0.0f, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14004, 6694626808057192012L ^ j2) /* invoke-custom */, null);
                            zf.v(j5).method_6104(class_1268.field_5808);
                            ag.K(class_1268.field_5808, 0.0f, j3, 0.0f, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14004, 6694626808057192012L ^ j2) /* invoke-custom */, null);
                            class_746VarV = zf.v(j5);
                            class_746VarV.method_6104(class_1268.field_5808);
                        }
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_746VarV, -4595052353951822239L, j2) /* invoke-custom */;
                    }
                } else {
                    ag.K(class_1268.field_5808, 0.0f, j3, 0.0f, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14004, 6694626808057192012L ^ j2) /* invoke-custom */, null);
                    zf.v(j5).method_6104(class_1268.field_5808);
                    ag.K(class_1268.field_5808, 0.0f, j3, 0.0f, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14004, 6694626808057192012L ^ j2) /* invoke-custom */, null);
                    class_746VarV = zf.v(j5);
                    class_746VarV.method_6104(class_1268.field_5808);
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, -4595052353951822239L, j2) /* invoke-custom */;
            }
        }
        x.l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        if (r0 < 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if (r1 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -6229214003317217321L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (r0 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -6229214003317217321L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        r0 = su.catlean.zf.v(r1).method_31548().method_5438(r13).method_7919();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -6229214003317217321L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        r1 = r0;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (r1 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a4, code lost:
    
        if (r0 >= call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/e7;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "j"}
            {METHOD_TYPE: (I, J)I}
        ).invoke(32295, 6141686964672036718L ^ r0)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -6229214003317217321L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -6229214003317217321L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        if (r0 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
    
        r0 = (r0 > 0 ? 1 : (r0 == 0 ? 0 : -1));
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        if (r0 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d2, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (r0 < r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(su.catlean.zf.v(r1).method_31548().method_5438(r13).method_7909(), net.minecraft.class_1802.field_8378);
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0048, code lost:
    
        if (r0 < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004b, code lost:
    
        if (r1 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        r0 = r0;
        r0 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:43:0x002e, B:35:0x00cc], limit reached: 52 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c9 -> B:35:0x00cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int V(long r8) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e7.V(long):int");
    }

    public static final bg M() {
        return x;
    }

    static {
        int i;
        long j = a ^ 135709011017036L;
        long j2 = j ^ 37538241971074L;
        long j3 = j ^ 51668496364171L;
        long j4 = j ^ 122611600328767L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[16];
        int i3 = 0;
        String str = "e\u009bpæÓ\u00972iAñ·Ó\u009c\u001fj\u0099¥þ\u0014\u0095\u000e-\u00adê\u0018ÄÂqË1a\u0082:\u0088MJ·°\u0002¨ÙSïÃ\u0001¤®9Æ \u0080!õ\u0011z\u0087¸\\J?\u0081^L½°]°RÀïhÎuf/\u0018\u0089\u000eõÌM³ \u008f\u0095úsÌ>¦\t¬ÓïñêK/f\u0002(P\"\u0099\f\u008dØ5ÝCXX\u007fM¾\u0018â\n0Ë´ÑAd\u009di\u0012@\u001e{¯Þu\u009b½pö\u009bXõ\u0010¬ïµøSâw\u0093èãõ´Î.ÅÑ\u0010\u008a>\u001a\u008c@a\u0013Ûó\u00ad¥«;Hö× ½ø\u0084ù\u008b\u0013\u0003EÞüo×®¢\u0003~\u0080\u0080?\u0088úV\u00116)\u0006º\fs±¡\u009f 9\u0019ìé©¯¯\u009f\u009daÕ^¢e¿ÚÏþLAXÙ\u009eåsôÂÖ\u009a]®í\u0010Â5¬\t\u008c\u000fõ\r\u000fÅ8Úo\u0096\u0015Ð <\u0087\u0095*\u0014\u0013ö,Lã\u0087°\u0094\u0015WäG\u0016Å\u0015\u0095#B\f\u0087\u0080´;X{ûß0\u0001\u0083õ½Ï5\u0088\u000e\u0098\u009cöö\u0001HÉV/3ÞÝ|¹b(\u0095²Hg\u0088À§ãj/ ZW\u000fr¿Ù\u0080ô\u001aij*¹ %©°\u0015\u001d&×úJX\u0007\fmé\u0019G6\u009eA<\u008e~+âü@:9æ.ïÁ ´ùÞ\u008cüÆ\u001aê4Ð®\b\u001fM\u009dê\u001dû\u0006\u000eo¢Ã\u0011\u009e¨z Æ¢ÿK";
        int length = "e\u009bpæÓ\u00972iAñ·Ó\u009c\u001fj\u0099¥þ\u0014\u0095\u000e-\u00adê\u0018ÄÂqË1a\u0082:\u0088MJ·°\u0002¨ÙSïÃ\u0001¤®9Æ \u0080!õ\u0011z\u0087¸\\J?\u0081^L½°]°RÀïhÎuf/\u0018\u0089\u000eõÌM³ \u008f\u0095úsÌ>¦\t¬ÓïñêK/f\u0002(P\"\u0099\f\u008dØ5ÝCXX\u007fM¾\u0018â\n0Ë´ÑAd\u009di\u0012@\u001e{¯Þu\u009b½pö\u009bXõ\u0010¬ïµøSâw\u0093èãõ´Î.ÅÑ\u0010\u008a>\u001a\u008c@a\u0013Ûó\u00ad¥«;Hö× ½ø\u0084ù\u008b\u0013\u0003EÞüo×®¢\u0003~\u0080\u0080?\u0088úV\u00116)\u0006º\fs±¡\u009f 9\u0019ìé©¯¯\u009f\u009daÕ^¢e¿ÚÏþLAXÙ\u009eåsôÂÖ\u009a]®í\u0010Â5¬\t\u008c\u000fõ\r\u000fÅ8Úo\u0096\u0015Ð <\u0087\u0095*\u0014\u0013ö,Lã\u0087°\u0094\u0015WäG\u0016Å\u0015\u0095#B\f\u0087\u0080´;X{ûß0\u0001\u0083õ½Ï5\u0088\u000e\u0098\u009cöö\u0001HÉV/3ÞÝ|¹b(\u0095²Hg\u0088À§ãj/ ZW\u000fr¿Ù\u0080ô\u001aij*¹ %©°\u0015\u001d&×úJX\u0007\fmé\u0019G6\u009eA<\u008e~+âü@:9æ.ïÁ ´ùÞ\u008cüÆ\u001aê4Ð®\b\u001fM\u009dê\u001dû\u0006\u000eo¢Ã\u0011\u009e¨z Æ¢ÿK".length();
        char cCharAt = 24;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
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
                            c = new String[16];
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
                            String str3 = "0c\nE)\u0097x\u00014É\u0099êkIXÌ%õ\n«\\\u0017\u0088#~\u0089Ky·\rü\u001f¯\u0017\u008aÐ5ÊÞ#góç\u0006,\u0011ö°.a\u0082½P\u0099òé";
                            int length2 = "0c\nE)\u0097x\u00014É\u0099êkIXÌ%õ\n«\\\u0017\u0088#~\u0089Ky·\rü\u001f¯\u0017\u008aÐ5ÊÞ#góç\u0006,\u0011ö°.a\u0082½P\u0099òé".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j5 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j6 = j5;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j6 >>> 56), (byte) (j6 >>> 48), (byte) (j6 >>> 40), (byte) (j6 >>> 32), (byte) (j6 >>> 24), (byte) (j6 >>> 16), (byte) (j6 >>> 8), (byte) j6});
                                    long j7 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b5] = j7;
                                            if (i10 >= length2) {
                                                e = jArr;
                                                f = new Integer[9];
                                                C = new KProperty[]{Reflection.property1(new PropertyReference1Impl(e7.class, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3997, 7093520086559973979L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2022, 5018638696042687017L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(e7.class, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6171, 2524024145832113625L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26448, 6179269972934527646L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(e7.class, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22388, 4277825715558595249L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15857, 3449207691735748666L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(e7.class, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20521, 3986254772183875043L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3864, 947303632906773208L ^ j) /* invoke-custom */, 0))};
                                                U = new e7(j2);
                                                O = yp.L(U, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17543, 4555945134298048836L ^ j) /* invoke-custom */, bh.V1_17, null, null, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17336, 1987981663842868850L ^ j) /* invoke-custom */, null, j4);
                                                L = yp.t(U, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25157, 3429148670004105097L ^ j) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3055, 2807962480269350436L ^ j) /* invoke-custom */, null);
                                                o = yp.t(U, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29092, 2255827856428145763L ^ j) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3055, 2807962480269350436L ^ j) /* invoke-custom */, null);
                                                W = yp.t(U, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(138, 6819057534104661323L ^ j) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3055, 2807962480269350436L ^ j) /* invoke-custom */, null);
                                                x = new bg();
                                                X = new bg();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j7;
                                            if (i10 >= length2) {
                                                str3 = "\u0095(²»©ùß²H\u001cn£éÌ°\u0013";
                                                length2 = "\u0095(²»©ùß²H\u001cn£éÌ°\u0013".length();
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
                                    j5 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "ûöÅwß¿\u001cu¢3\u0095×¶,¢J ÿ\u009aßØ\u0014a\u0098®+`]Ü\u0097Ö\u001f\u0095¢\u0098ä\u009bS\u0018\u0086§\u008a%[±]9ÃÎ";
                        length = "ûöÅwß¿\u001cu¢3\u0095×¶,¢J ÿ\u009aßØ\u0014a\u0098®+`]Ü\u0097Ö\u001f\u0095¢\u0098ä\u009bS\u0018\u0086§\u008a%[±]9ÃÎ".length();
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

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String b(byte[] bArr) {
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

    private static String b(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 6557;
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
                c[i2] = b(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/e7", e2);
            }
        }
        return c[i2];
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
            java.lang.String r1 = "su/catlean/e7"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e7.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 10641;
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
                    throw new RuntimeException("su/catlean/e7", e2);
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
            java.lang.String r1 = "su/catlean/e7"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e7.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
