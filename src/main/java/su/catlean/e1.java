package su.catlean;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/e1.class */
public final class e1 extends _g {

    @NotNull
    public static final e1 Y = null;
    static final KProperty[] F = null;

    @NotNull
    private static final cq C = null;

    @NotNull
    private static final cq P = null;
    private static final boolean c = false;

    @NotNull
    private static final List o = null;

    @NotNull
    private static final List A = null;

    @NotNull
    private static final IntArrayList a = null;
    private static final long b = 0;
    private static final String[] d = null;
    private static final String[] e = null;
    private static final Map f = null;
    private static final long[] g = null;
    private static final Integer[] h = null;
    private static final Map i = null;
    private static final long j = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    private e1(long j2) {
        long j3 = b ^ j2;
        super((String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8107, 854701900118441779L ^ j3) /* invoke-custom */, jt.y(), null, 4, null, j3 ^ 94385513073697L);
    }

    private final boolean H(int i2, char c2, int i3) {
        return ((Boolean) C.E(this, ((((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ b) ^ 11012229560820L, F[0])).booleanValue();
    }

    private final boolean E(long j2) {
        return ((Boolean) P.E(this, (b ^ j2) ^ 88763826677018L, F[1])).booleanValue();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:105:0x027f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void Y(su.catlean.api.event.events.network.ReceivePacket r14) {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e1.Y(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x02d5: INVOKE 
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
    @su.catlean.gofra.Flow
    private final void N(su.catlean.api.event.events.render.Render2DEvent r24) {
        /*
            Method dump skipped, instruction units count: 737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e1.N(su.catlean.api.event.events.render.Render2DEvent):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:111:0x037f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void b(su.catlean.api.event.events.player.PlayerUpdateEvent r12) {
        /*
            Method dump skipped, instruction units count: 931
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e1.b(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    private final String c(class_1799 class_1799Var) {
        String strMethod_7876 = class_1799Var.method_7909().method_7876();
        Intrinsics.checkNotNull(strMethod_7876);
        return strMethod_7876;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ed, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ed, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [int] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g(su.catlean.api.event.events.render.SlotRenderEvent r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e1.g(su.catlean.api.event.events.render.SlotRenderEvent):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: net.minecraft.class_642 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0219 A[EDGE_INSN: B:126:0x0219->B:80:0x0219 BREAK  A[LOOP:5: B:58:0x01b5->B:129:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x020e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[LOOP:5: B:58:0x01b5->B:129:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3 A[Catch: Exception -> 0x02ef, TryCatch #0 {Exception -> 0x02ef, blocks: (B:18:0x0063, B:23:0x007c, B:34:0x00b0, B:35:0x00c3, B:37:0x00cc, B:38:0x00d8, B:40:0x00e2, B:43:0x0106, B:48:0x0147, B:49:0x0153, B:51:0x015d, B:58:0x01b5, B:60:0x01c1, B:65:0x01de, B:74:0x0206, B:75:0x0209, B:82:0x021d, B:72:0x01fc, B:73:0x0205, B:68:0x01ec, B:69:0x01f5, B:44:0x0138, B:45:0x0141, B:86:0x0242, B:87:0x024e, B:89:0x0258, B:91:0x02a9, B:30:0x0098, B:31:0x00a1, B:33:0x00a3, B:26:0x0088, B:27:0x0091, B:21:0x0072, B:22:0x007b), top: B:99:0x005d, inners: #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc A[Catch: Exception -> 0x02ef, TryCatch #0 {Exception -> 0x02ef, blocks: (B:18:0x0063, B:23:0x007c, B:34:0x00b0, B:35:0x00c3, B:37:0x00cc, B:38:0x00d8, B:40:0x00e2, B:43:0x0106, B:48:0x0147, B:49:0x0153, B:51:0x015d, B:58:0x01b5, B:60:0x01c1, B:65:0x01de, B:74:0x0206, B:75:0x0209, B:82:0x021d, B:72:0x01fc, B:73:0x0205, B:68:0x01ec, B:69:0x01f5, B:44:0x0138, B:45:0x0141, B:86:0x0242, B:87:0x024e, B:89:0x0258, B:91:0x02a9, B:30:0x0098, B:31:0x00a1, B:33:0x00a3, B:26:0x0088, B:27:0x0091, B:21:0x0072, B:22:0x007b), top: B:99:0x005d, inners: #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015d A[Catch: Exception -> 0x02ef, TryCatch #0 {Exception -> 0x02ef, blocks: (B:18:0x0063, B:23:0x007c, B:34:0x00b0, B:35:0x00c3, B:37:0x00cc, B:38:0x00d8, B:40:0x00e2, B:43:0x0106, B:48:0x0147, B:49:0x0153, B:51:0x015d, B:58:0x01b5, B:60:0x01c1, B:65:0x01de, B:74:0x0206, B:75:0x0209, B:82:0x021d, B:72:0x01fc, B:73:0x0205, B:68:0x01ec, B:69:0x01f5, B:44:0x0138, B:45:0x0141, B:86:0x0242, B:87:0x024e, B:89:0x0258, B:91:0x02a9, B:30:0x0098, B:31:0x00a1, B:33:0x00a3, B:26:0x0088, B:27:0x0091, B:21:0x0072, B:22:0x007b), top: B:99:0x005d, inners: #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ca A[PHI: r0 r23 r24
  0x01ca: PHI (r0v87 ??) = (r0v110 ??), (r0v111 ??) binds: [B:79:0x0216, B:60:0x01c1] A[DONT_GENERATE, DONT_INLINE]
  0x01ca: PHI (r23v6 int) = (r23v4 int), (r23v3 int) binds: [B:79:0x0216, B:60:0x01c1] A[DONT_GENERATE, DONT_INLINE]
  0x01ca: PHI (r24v3 int) = (r24v2 int), (r24v1 int) binds: [B:79:0x0216, B:60:0x01c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0242 A[Catch: Exception -> 0x02ef, TryCatch #0 {Exception -> 0x02ef, blocks: (B:18:0x0063, B:23:0x007c, B:34:0x00b0, B:35:0x00c3, B:37:0x00cc, B:38:0x00d8, B:40:0x00e2, B:43:0x0106, B:48:0x0147, B:49:0x0153, B:51:0x015d, B:58:0x01b5, B:60:0x01c1, B:65:0x01de, B:74:0x0206, B:75:0x0209, B:82:0x021d, B:72:0x01fc, B:73:0x0205, B:68:0x01ec, B:69:0x01f5, B:44:0x0138, B:45:0x0141, B:86:0x0242, B:87:0x024e, B:89:0x0258, B:91:0x02a9, B:30:0x0098, B:31:0x00a1, B:33:0x00a3, B:26:0x0088, B:27:0x0091, B:21:0x0072, B:22:0x007b), top: B:99:0x005d, inners: #1, #3, #4 }] */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v44, types: [int] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.minecraft.class_2561] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61, types: [net.minecraft.class_2561] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v86, types: [int] */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v97, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0145 -> B:48:0x0147). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0216 -> B:61:0x01ca). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int H(long r9, net.minecraft.class_1799 r11) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e1.H(long, net.minecraft.class_1799):int");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:7:0x004d
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final java.util.List h(net.minecraft.class_2338 r8, long r9, int r11, int r12, byte r13) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e1.h(net.minecraft.class_2338, long, int, int, byte):java.util.List");
    }

    private static final void y(ReceivePacket receivePacket) {
        long j2 = b ^ 41125782328802L;
        long j3 = j2 ^ 44577544882254L;
        List list = o;
        class_243 class_243Var = new class_243(receivePacket.getPacket().method_11890(), receivePacket.getPacket().method_11889(), receivePacket.getPacket().method_11893());
        long jA = zf.A() + j;
        class_1792 class_1792Var = class_1802.field_22021;
        Intrinsics.checkNotNullExpressionValue(class_1792Var, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27048, 6423069045622675558L ^ j2) /* invoke-custom */);
        list.add(new zs(class_243Var, jA, class_1792Var, j3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d5 A[EDGE_INSN: B:174:0x02d5->B:113:0x02d5 BREAK  A[LOOP:1: B:90:0x025c->B:175:0x025c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x025c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0251 A[PHI: r0
  0x0251: PHI (r0v66 ??) = (r0v159 ??), (r0v105 ??), (r0v160 ??) binds: [B:70:0x0203, B:88:0x0250, B:76:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0266  */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v103, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r0v113, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v120 */
    /* JADX WARN: Type inference failed for: r0v125 */
    /* JADX WARN: Type inference failed for: r0v126, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v128, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v129, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v130, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v131, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v135, types: [int] */
    /* JADX WARN: Type inference failed for: r0v136 */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v138 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v142 */
    /* JADX WARN: Type inference failed for: r0v148 */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v150 */
    /* JADX WARN: Type inference failed for: r0v153 */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r0v155 */
    /* JADX WARN: Type inference failed for: r0v156 */
    /* JADX WARN: Type inference failed for: r0v157 */
    /* JADX WARN: Type inference failed for: r0v158 */
    /* JADX WARN: Type inference failed for: r0v159 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r0v160 */
    /* JADX WARN: Type inference failed for: r0v161 */
    /* JADX WARN: Type inference failed for: r0v162 */
    /* JADX WARN: Type inference failed for: r0v163 */
    /* JADX WARN: Type inference failed for: r0v164 */
    /* JADX WARN: Type inference failed for: r0v165 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v10 */
    /* JADX WARN: Type inference failed for: r29v11 */
    /* JADX WARN: Type inference failed for: r29v12, types: [int] */
    /* JADX WARN: Type inference failed for: r29v17 */
    /* JADX WARN: Type inference failed for: r29v18 */
    /* JADX WARN: Type inference failed for: r29v19 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v20 */
    /* JADX WARN: Type inference failed for: r29v21 */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r29v7, types: [int] */
    /* JADX WARN: Type inference failed for: r29v8 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void O(net.minecraft.class_2338 r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e1.O(net.minecraft.class_2338):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    private static final boolean Q(zs zsVar) throws Exception {
        long j2 = b ^ 15923714933178L;
        Object obj = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2851391507005618189L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(zsVar, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10408, 7801197314176388397L ^ j2) /* invoke-custom */);
        try {
            obj = ((zf.A() - zsVar.s()) > 0L ? 1 : ((zf.A() - zsVar.s()) == 0L ? 0 : -1));
            return obj == 0 ? obj >= 0 : obj;
        } catch (NumberFormatException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -2853693266662610616L, j2) /* invoke-custom */;
        }
    }

    private static final boolean M(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private static final boolean j(int i2) throws Exception {
        long j2 = b ^ 108291585533949L;
        long j3 = j2 ^ 37547762487931L;
        Object obj = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(9091288314954047924L, j2) /* invoke-custom */;
        class_1657 class_1657VarMethod_8469 = zf.z(j3).method_8469(i2);
        try {
            try {
                obj = obj;
                try {
                    if (obj == 0) {
                        obj = class_1657VarMethod_8469;
                        try {
                            if (obj != 0) {
                                try {
                                    try {
                                        obj = class_1657VarMethod_8469 instanceof class_1657;
                                        if (obj != 0) {
                                            return obj;
                                        }
                                        if (obj != 0) {
                                            try {
                                                boolean zMethod_5805 = class_1657VarMethod_8469.method_5805();
                                                if (obj != 0) {
                                                    return zMethod_5805;
                                                }
                                                if (zMethod_5805) {
                                                    boolean zMethod_8477 = zf.z(j3).method_8477(class_1657VarMethod_8469.method_24515());
                                                    if (obj != 0) {
                                                        return zMethod_8477;
                                                    }
                                                    if (zMethod_8477) {
                                                        return false;
                                                    }
                                                }
                                            } catch (NumberFormatException unused) {
                                                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 9089048076873961231L, j2) /* invoke-custom */;
                                            }
                                        }
                                    } catch (NumberFormatException unused2) {
                                        throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 9089048076873961231L, j2) /* invoke-custom */;
                                    }
                                } catch (NumberFormatException unused3) {
                                    throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 9089048076873961231L, j2) /* invoke-custom */;
                                }
                            }
                            zf.z(j3).method_2945(i2, class_1297.class_5529.field_26998);
                        } catch (NumberFormatException unused4) {
                            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 9089048076873961231L, j2) /* invoke-custom */;
                        }
                    }
                    return true;
                } catch (NumberFormatException unused5) {
                    throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 9089048076873961231L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused6) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 9089048076873961231L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused7) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 9089048076873961231L, j2) /* invoke-custom */;
        }
    }

    private static Exception a(Exception exc) {
        return exc;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 31864;
        if (e[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                e[i3] = b(((Cipher) objArr[0]).doFinal(d[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/e1", e2);
            }
        }
        return e[i3];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strB), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strB;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.e1.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/e1.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
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
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.e1.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/e1.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e1.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 11732;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/e1", e2);
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

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iC)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iC;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.e1.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/e1.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
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
    private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.e1.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/e1.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e1.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
