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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1713;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/tc.class */
public final class tc implements b4 {

    @NotNull
    public static final tc s;

    @NotNull
    private static Function0 m;

    @NotNull
    private static Function0 X;
    private static final String[] b;
    private static final String[] c;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final long a = yz.a(6133856104906453840L, -2501179907936501617L, MethodHandles.lookup().lookupClass()).a(149998217995249L);
    private static final Map d = new HashMap(13);

    private tc() {
    }

    @NotNull
    public final Function0 h() {
        return m;
    }

    public final void i(short a2, @NotNull Function0 function0, char a3, int a4) {
        Intrinsics.checkNotNullParameter(function0, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14816, 8512057891988436723L ^ ((((((long) a2) << 48) | ((((long) a3) << 48) >>> 16)) | ((((long) a4) << 32) >>> 32)) ^ a)) /* invoke-custom */);
        m = function0;
    }

    @NotNull
    public final Function0 T() {
        return X;
    }

    public final void Y(long a2, @NotNull Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1008, 4401351576574262025L ^ (a ^ a2)) /* invoke-custom */);
        X = function0;
    }

    @Override // su.catlean.b4
    public void Q(int i, long j) {
    }

    @Override // su.catlean.b4
    public void P(@NotNull _w rotation, short a2, int a3, int a4) {
        long j = (((long) a2) << 48) | ((((long) a3) << 32) >>> 16) | ((((long) a4) << 48) >>> 48);
        Intrinsics.checkNotNullParameter(rotation, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16593, 8912002639329686332L ^ j) /* invoke-custom */);
        X.invoke();
        X = tc::w;
        qb.a.P(1);
        dm.h.F(j ^ 51433702095905L);
    }

    @Override // su.catlean.b4
    public void n(long j) {
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:39:0x00d9
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void f(long r14) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tc.f(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:110:0x033e, B:94:0x02d9], limit reached: 250 */
    /* JADX WARN: Path cross not found for [B:119:0x0368, B:127:0x038d], limit reached: 250 */
    /* JADX WARN: Path cross not found for [B:126:0x0389, B:121:0x036d], limit reached: 250 */
    /* JADX WARN: Path cross not found for [B:127:0x038d, B:119:0x0368], limit reached: 250 */
    /* JADX WARN: Path cross not found for [B:207:0x0341, B:204:0x0359], limit reached: 250 */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03bf A[EDGE_INSN: B:215:0x03bf->B:140:0x03bf BREAK  A[LOOP:0: B:3:0x0022->B:217:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v104, types: [int] */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v120 */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v131, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v132 */
    /* JADX WARN: Type inference failed for: r0v133 */
    /* JADX WARN: Type inference failed for: r0v136 */
    /* JADX WARN: Type inference failed for: r0v145, types: [net.minecraft.class_9285$class_9287] */
    /* JADX WARN: Type inference failed for: r0v146, types: [net.minecraft.class_9285$class_9287] */
    /* JADX WARN: Type inference failed for: r0v147, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v151, types: [int] */
    /* JADX WARN: Type inference failed for: r0v152 */
    /* JADX WARN: Type inference failed for: r0v153 */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r0v158 */
    /* JADX WARN: Type inference failed for: r0v159, types: [net.minecraft.class_9285$class_9287] */
    /* JADX WARN: Type inference failed for: r0v160, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v162, types: [net.minecraft.class_9274] */
    /* JADX WARN: Type inference failed for: r0v163 */
    /* JADX WARN: Type inference failed for: r0v164 */
    /* JADX WARN: Type inference failed for: r0v165, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v172, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v173 */
    /* JADX WARN: Type inference failed for: r0v174, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v177, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v184, types: [int] */
    /* JADX WARN: Type inference failed for: r0v186 */
    /* JADX WARN: Type inference failed for: r0v187 */
    /* JADX WARN: Type inference failed for: r0v188 */
    /* JADX WARN: Type inference failed for: r0v189 */
    /* JADX WARN: Type inference failed for: r0v190 */
    /* JADX WARN: Type inference failed for: r0v191 */
    /* JADX WARN: Type inference failed for: r0v192 */
    /* JADX WARN: Type inference failed for: r0v193 */
    /* JADX WARN: Type inference failed for: r0v194 */
    /* JADX WARN: Type inference failed for: r0v195 */
    /* JADX WARN: Type inference failed for: r0v196 */
    /* JADX WARN: Type inference failed for: r0v197 */
    /* JADX WARN: Type inference failed for: r0v198 */
    /* JADX WARN: Type inference failed for: r0v199 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v200 */
    /* JADX WARN: Type inference failed for: r0v201 */
    /* JADX WARN: Type inference failed for: r0v202 */
    /* JADX WARN: Type inference failed for: r0v203 */
    /* JADX WARN: Type inference failed for: r0v204 */
    /* JADX WARN: Type inference failed for: r0v205 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r0v93, types: [net.minecraft.class_9285$class_9287] */
    /* JADX WARN: Type inference failed for: r0v94, types: [net.minecraft.class_9285$class_9287] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v97, types: [net.minecraft.class_9274] */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99, types: [net.minecraft.class_9285$class_9287] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x032e -> B:73:0x0222). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x0331 -> B:86:0x02a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0347 -> B:86:0x02a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x036d -> B:86:0x02a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x0398 -> B:73:0x0222). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x039b -> B:131:0x039e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0216 -> B:13:0x0078). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x025f -> B:72:0x021b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x02a9 -> B:72:0x021b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x02d0 -> B:79:0x0269). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x0316 -> B:75:0x025a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x031c -> B:73:0x0222). Please report as a decompilation issue!!! */
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
    public final int I(long r9) {
        /*
            Method dump skipped, instruction units count: 1247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tc.I(long):int");
    }

    public final void S() {
        m.invoke();
        m = tc::z;
    }

    private static final Unit p() {
        return Unit.INSTANCE;
    }

    private static final Unit E() {
        return Unit.INSTANCE;
    }

    private static final Unit w() {
        return Unit.INSTANCE;
    }

    private static final void m() {
        dm.h.F((a ^ 70370492559850L) ^ 95625243553081L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    private static final Unit y(int i, boolean z) {
        long j = a ^ 127186579379079L;
        long j2 = j ^ 87765350580788L;
        long j3 = j ^ 89080102069823L;
        long j4 = j ^ 2534986021261L;
        ?? Method_7960 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3108901491870669218L, j) /* invoke-custom */;
        _n.e.m(true);
        try {
            try {
                Method_7960 = zf.v(j4).field_7512.method_34255().method_7960();
                ?? r0 = Method_7960;
                if (Method_7960 != 0) {
                    if (Method_7960 == 0) {
                        ag.e((int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27940, 7763999658184814120L ^ j) /* invoke-custom */, j3, 0, null, false, (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7419, 3848521581975560177L ^ j) /* invoke-custom */, null);
                    }
                    r0 = i;
                }
                ag.r(r0, (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8279, 5667788938804093790L ^ j) /* invoke-custom */, class_1713.field_7791, z, j2);
                _n.e.m(false);
                qb.a.P((int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2420, 8884636087446325882L ^ j) /* invoke-custom */);
                return Unit.INSTANCE;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_7960, 3143553564249675624L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_7960, 3143553564249675624L, j) /* invoke-custom */;
        }
    }

    private static final Unit z() {
        return Unit.INSTANCE;
    }

    static {
        int i;
        long j = a ^ 126497688771329L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[18];
        int i3 = 0;
        String str = "½\u008c>\u009cèê*Ø\\\u0095½Qµµ\u0006]ªÿ\u0098§,\u009e+Ô(\bÜÔz¬ÒÊ*\u001a\u0090\u0095\u009bÃÑ\u0086\u0095Ìq*¸\u0095Nèw Ý;4Í±Îàÿ`8èe\u001bÿ!8\u0098ìµ'\u008a6g\u0090ké`SË\u008bY \u0091\u0003ý\u0007Yª\u0087«<x/\u001a\u0084\u00adY¬VILÀº-\tù\u0088\u009bU4\u007fF\u0004Ç:\u009f|â\u0095¥\u0001Â rÈ³£\u0001á²\u009fÿ\u0084\u001d£\u0011uºlÜØ\u009e§)\u0091)\u008ck\u0086&\u0081ÔÁs\u009e\u0010<\u009c\u0085·;\u007f\u0001a3\u0000e\u000f\"\u0007.\u0000 &%¤ORò§Ý2!»\u0012\u0002(`Ý\u0005¬c½'Ì%PÿÆ+\u0005:y¸\u001d Ñ\u0005\u0080ú\u0004sÓa;<¶v£û#®Êç\u001bäá÷ÏTåùÅê\u001cÆùµ\u0018\u0000»M?\td\u008e=T_+´ÃÒ|h)8$lµ\u009a\u009d\u0097\u0018NÙ\fXRæY\u0000>@64j\u0094ªí°Úíxa\u008awò(\u0080¡\u0010¶üÒ\u0017V±\u000bVïm~\u00ad\u0004\u0095·ð\u0002Ç\u00adÕb\u0097ÔKmò\u0085ó\u008dÙ)t³lå\u0096o\u0010ûÈohÓä\u00adr}bï\u001d<çt\u0015 a5µ\u000e;\u0004#ÝC°F\u00ad¦ÞÕ\u0012Q¤OyH\u00910Þ\u000bZç½\u00859ª~ :Åx¤ã1ÚÑÊÒ\u009f\u009faÑ\u007fê´|ÙÝh\u0080zV)dÈs\u000f±MR\u0018\u0005\u0090MíýZºNzyáJ´íMý\u000fkÂð/v\u0099Ï ß¾c¹<y\u0006l§V\u009c\u0095!nM\u0080/7\u008f\u0019àü\u0000cÍ¤\u0087×îè\"¸\u0098&þ)5;0$x¡\u008fxXÝs¥U£%úû\u0014\u0018!b\u001ea\u001cÝ¾&UFëM\n\":@RTg ì¢\u0012\u0019â\u0083ÄÐË\f]\u0016R8ðÝ9É<Q9 6Ø%P\u0018,Y\u0081R\"Cy¨¼\u0092¤6\nîjt\u0082\t¬x{-¾ç\\{Öæ\u0001jªÌ\u0090Î\u0019B_iô§\u001c.4ÐcË¬^Ö9I\u001cÔ\u0098R'\u009a\u00980®\u0019¶B%Õ\u0019\u0093Uóù\u001fì\u0005d\\Ýë¥I\u0010¢<\u0002";
        int length = "½\u008c>\u009cèê*Ø\\\u0095½Qµµ\u0006]ªÿ\u0098§,\u009e+Ô(\bÜÔz¬ÒÊ*\u001a\u0090\u0095\u009bÃÑ\u0086\u0095Ìq*¸\u0095Nèw Ý;4Í±Îàÿ`8èe\u001bÿ!8\u0098ìµ'\u008a6g\u0090ké`SË\u008bY \u0091\u0003ý\u0007Yª\u0087«<x/\u001a\u0084\u00adY¬VILÀº-\tù\u0088\u009bU4\u007fF\u0004Ç:\u009f|â\u0095¥\u0001Â rÈ³£\u0001á²\u009fÿ\u0084\u001d£\u0011uºlÜØ\u009e§)\u0091)\u008ck\u0086&\u0081ÔÁs\u009e\u0010<\u009c\u0085·;\u007f\u0001a3\u0000e\u000f\"\u0007.\u0000 &%¤ORò§Ý2!»\u0012\u0002(`Ý\u0005¬c½'Ì%PÿÆ+\u0005:y¸\u001d Ñ\u0005\u0080ú\u0004sÓa;<¶v£û#®Êç\u001bäá÷ÏTåùÅê\u001cÆùµ\u0018\u0000»M?\td\u008e=T_+´ÃÒ|h)8$lµ\u009a\u009d\u0097\u0018NÙ\fXRæY\u0000>@64j\u0094ªí°Úíxa\u008awò(\u0080¡\u0010¶üÒ\u0017V±\u000bVïm~\u00ad\u0004\u0095·ð\u0002Ç\u00adÕb\u0097ÔKmò\u0085ó\u008dÙ)t³lå\u0096o\u0010ûÈohÓä\u00adr}bï\u001d<çt\u0015 a5µ\u000e;\u0004#ÝC°F\u00ad¦ÞÕ\u0012Q¤OyH\u00910Þ\u000bZç½\u00859ª~ :Åx¤ã1ÚÑÊÒ\u009f\u009faÑ\u007fê´|ÙÝh\u0080zV)dÈs\u000f±MR\u0018\u0005\u0090MíýZºNzyáJ´íMý\u000fkÂð/v\u0099Ï ß¾c¹<y\u0006l§V\u009c\u0095!nM\u0080/7\u008f\u0019àü\u0000cÍ¤\u0087×îè\"¸\u0098&þ)5;0$x¡\u008fxXÝs¥U£%úû\u0014\u0018!b\u001ea\u001cÝ¾&UFëM\n\":@RTg ì¢\u0012\u0019â\u0083ÄÐË\f]\u0016R8ðÝ9É<Q9 6Ø%P\u0018,Y\u0081R\"Cy¨¼\u0092¤6\nîjt\u0082\t¬x{-¾ç\\{Öæ\u0001jªÌ\u0090Î\u0019B_iô§\u001c.4ÐcË¬^Ö9I\u001cÔ\u0098R'\u009a\u00980®\u0019¶B%Õ\u0019\u0093Uóù\u001fì\u0005d\\Ýë¥I\u0010¢<\u0002".length();
        char cCharAt = 24;
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
                            c = new String[18];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[10];
                            int i9 = 0;
                            String str3 = "ã\u0086\u00adS¦>`Na\tÿ4B¦çacE2Í\u0096ñg\u009d3ÝA~9|#Ð\nBm5dB%Ò67ÁHÞ1¹Ø\u0014òp\u0014\u0087\u001bîÓ¿k\u000b;un[\u0019";
                            int length2 = "ã\u0086\u00adS¦>`Na\tÿ4B¦çacE2Í\u0096ñg\u009d3ÝA~9|#Ð\nBm5dB%Ò67ÁHÞ1¹Ø\u0014òp\u0014\u0087\u001bîÓ¿k\u000b;un[\u0019".length();
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
                                                f = new Integer[10];
                                                s = new tc();
                                                m = tc::p;
                                                X = tc::E;
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "\u0080\u008dÛ\u0014 \u008dÑ¡\u0012\u0002¦*\u0017\u0088\u0086ó";
                                                length2 = "\u0080\u008dÛ\u0014 \u008dÑ¡\u0012\u0002¦*\u0017\u0088\u0086ó".length();
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
                        str = "1ÔR\u008cJ»\t\u008b¾»\u0014\u0082nø¨^\\\u000fãUâ\t1@¼\u0017\u0010.¢\u008eÏ\u001f©¾Þt.É?a\u0099\u0087È\u001eÇÃ\u00817va\u009f¶q¢¶©B\bñ¤\nèì w»\u008c`\u0018Ælî`\u000b«)ía¼\u009c\u0084 \u0016>8ë¨[õ\u001e:ý\rÒ \u008aÝ&W\u0015ò%yï¦\u008cçU4\u0002\u0088Ú³»\u0090\u0005\u0000\t¾q\"õ`\u001b¾Î~Éó6\u008c8Ðüâª0L,ùôDÍ\u0085ÉG×\u0017±\u0095=lb\u0097\n\u0003\u001e`f§f\u0081ioz³m\u001bpbPy¾·¾N½q7\u001c¡wºE.";
                        length = "1ÔR\u008cJ»\t\u008b¾»\u0014\u0082nø¨^\\\u000fãUâ\t1@¼\u0017\u0010.¢\u008eÏ\u001f©¾Þt.É?a\u0099\u0087È\u001eÇÃ\u00817va\u009f¶q¢¶©B\bñ¤\nèì w»\u008c`\u0018Ælî`\u000b«)ía¼\u009c\u0084 \u0016>8ë¨[õ\u001e:ý\rÒ \u008aÝ&W\u0015ò%yï¦\u008cçU4\u0002\u0088Ú³»\u0090\u0005\u0000\t¾q\"õ`\u001b¾Î~Éó6\u008c8Ðüâª0L,ùôDÍ\u0085ÉG×\u0017±\u0095=lb\u0097\n\u0003\u001e`f§f\u0081ioz³m\u001bpbPy¾·¾N½q7\u001c¡wºE.".length();
                        cCharAt = 136;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 27249;
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
                throw new RuntimeException("su/catlean/tc", e2);
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
            java.lang.String r1 = "su/catlean/tc"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tc.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 27113;
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
                    throw new RuntimeException("su/catlean/tc", e2);
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
            java.lang.String r1 = "su/catlean/tc"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.tc.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
