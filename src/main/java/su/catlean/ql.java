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
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_10192;
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import net.minecraft.class_9334;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ql.class */
public final class ql extends _g {

    @NotNull
    public static final ql k;
    static final KProperty[] C;

    @NotNull
    private static final cw I;

    @NotNull
    private static final cw D;

    @NotNull
    private static final cw F;

    @NotNull
    private static final cw L;

    @NotNull
    private static final cw S;

    @NotNull
    private static final c8 a;

    @NotNull
    private static final cq V;

    @NotNull
    private static final cq U;

    @NotNull
    private static final cq x;

    @NotNull
    private static final cq y;

    @NotNull
    private static final cq n;

    @NotNull
    private static i9 m;

    @NotNull
    private static i9 K;

    @NotNull
    private static final List T;
    private static final long b = yz.a(-5570765986815099006L, 8395397587163049665L, MethodHandles.lookup().lookupClass()).a(29513188429153L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    /* JADX WARN: Illegal instructions before constructor call */
    private ql(int i, int i2, short s) {
        long j = (((((long) i) << 32) | ((((long) i2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ b;
        super((String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15509, 627058729675314392L ^ j) /* invoke-custom */, jt.I(), null, 4, null, j ^ 15309197839966L);
    }

    private final d9 L(long j) {
        return (d9) I.E(this, (b ^ j) ^ 40621604480837L, C[0]);
    }

    private final d9 K(long j) {
        return (d9) D.E(this, (b ^ j) ^ 137531381873171L, C[1]);
    }

    private final d9 I(short s, long j) {
        return (d9) F.E(this, (((((long) s) << 48) | ((j << 16) >>> 16)) ^ b) ^ 127221995575583L, C[2]);
    }

    private final d9 W(long j) {
        return (d9) L.E(this, (b ^ j) ^ 68036088701698L, C[3]);
    }

    private final mb q(long j) {
        return (mb) S.E(this, (b ^ j) ^ 84689629736907L, C[4]);
    }

    private final int r(long j) {
        return ((Number) a.E(this, (b ^ j) ^ 115015628717326L, C[5])).intValue();
    }

    private final boolean P(long j) {
        long j2 = b ^ j;
        return ((Boolean) V.E(this, j2 ^ 92481912524022L, C[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25047, 3663824779676348326L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean w(long j) {
        long j2 = b ^ j;
        return ((Boolean) U.E(this, j2 ^ 126570000772294L, C[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2675, 6437142188465071146L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean z(long j) {
        long j2 = b ^ j;
        return ((Boolean) x.E(this, j2 ^ 42473008328853L, C[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11418, 924635799116029583L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean T(int i, short s, int i2) {
        long j = (((((long) i) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) i2) << 48) >>> 48)) ^ b;
        return ((Boolean) y.E(this, j ^ 117999757399932L, C[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11153, 49287882764910206L ^ j) /* invoke-custom */])).booleanValue();
    }

    private final boolean G(long j) {
        long j2 = b ^ j;
        return ((Boolean) n.E(this, j2 ^ 136734705492898L, C[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11864, 1265870377415593824L ^ j2) /* invoke-custom */])).booleanValue();
    }

    @NotNull
    public final i9 Y() {
        return m;
    }

    public final void F(long a2, @NotNull i9 i9Var) {
        Intrinsics.checkNotNullParameter(i9Var, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32233, 7944486924504680510L ^ (b ^ a2)) /* invoke-custom */);
        m = i9Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0448: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow(priority = -10)
    private final void L(su.catlean.api.event.events.player.PlayerUpdateEvent r13) {
        /*
            Method dump skipped, instruction units count: 1505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ql.L(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final int U(long r9, net.minecraft.class_1799 r11) {
        /*
            Method dump skipped, instruction units count: 1784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ql.U(long, net.minecraft.class_1799):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private final class_1304 g(long j, class_1799 class_1799Var) {
        long j2 = b ^ j;
        ?? Method_57826 = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3958632893009629470L, j2) /* invoke-custom */;
        try {
            try {
                Method_57826 = class_1799Var.method_57826(class_9334.field_54197);
                ?? r0 = Method_57826;
                if (Method_57826 == 0) {
                    if (Method_57826 != 0) {
                        return class_1304.field_6174;
                    }
                    try {
                        Object objMethod_58694 = class_1799Var.method_58694(class_9334.field_54196);
                        Intrinsics.checkNotNull(objMethod_58694);
                        class_1304 class_1304VarComp_3174 = ((class_10192) objMethod_58694).comp_3174();
                        if (Method_57826 != 0) {
                            return class_1304VarComp_3174;
                        }
                        Method_57826 = class_1304VarComp_3174.method_5927();
                        r0 = Method_57826;
                    } catch (NoWhenBranchMatchedException unused) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_57826, 3985866477988042924L, j2) /* invoke-custom */;
                    }
                }
                switch (r0) {
                    case 0:
                        return class_1304.field_6166;
                    case 1:
                        return class_1304.field_6172;
                    case 2:
                        return class_1304.field_6174;
                    default:
                        return class_1304.field_6169;
                }
            } catch (NoWhenBranchMatchedException unused2) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_57826, 3985866477988042924L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused3) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_57826, 3985866477988042924L, j2) /* invoke-custom */;
        }
    }

    public static final int p(long a2, ql $this, class_1799 stack) {
        return $this.U((b ^ a2) ^ 127963018742281L, stack);
    }

    static {
        int i;
        long j = b ^ 68529692513286L;
        long j2 = j ^ 133525957906815L;
        long j3 = j ^ 38763338038612L;
        long j4 = j ^ 20387295808129L;
        int i2 = (int) (j >>> 32);
        int i3 = (int) ((j4 << 32) >>> 48);
        int i4 = (int) ((j4 << 48) >>> 48);
        long j5 = j ^ 75647557962959L;
        long j6 = j ^ 118106214793641L;
        long j7 = j ^ 46278277315357L;
        e = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i5 = 1; i5 < 8; i5++) {
            bArr[i5] = (byte) ((j << (i5 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[40];
        int i6 = 0;
        String str = "J±Mÿ.¼\u008c?@ `FÍ{\u001e±\u0010Ò\u0003Î7u^\u0001\u0085\u0003\u0002\"\u0082G\u0096Îè84°Ù»¸Çs¿IêG!å½}\u009d\u0080\u0082ÄM5\u007fv\u001d\u0001!¬Æ\u009fI\\sM$Ù\u000fA\u009für\u0099Û\u0086\u009es\u008c\u0012Ý\u009bX¾÷\u0094]úÆ03Wû\u0094Åø\u0006\u0001!x²®-ÇÙó\u0018\u0080f/!\u0088bÏ+é\u009e+)\u009eN¸ªì\u001cMÙ,Ç\u000eÝü\u009f\fU\u0006\u001f&\u0010\u001büÞN®\u001a;ª\u0007pP\u000f?¦k*\u0018\u0088î Õ`T\u0096ON62\\=\u0011(\u009f4¢z$±hïÀ8rðÇ\u0014¡ô\u0014î<¾B\u0082\u0089\u0013Ât\r3Aý#AÕ\u0005fÖ¤[ÌÙ\u009aR\fv°\u0094è\u0007ã\u0002~^\t?vK\u0095¿al/\u0082\u0002p\u009bñ\u0010Þ\u008cÁ¬§\u0010<\u0089«øµa\n\u008cÉÕ\u0010¨,\u0088S8öÒ\u001eè\te\"-\u009aÒ.(\u0099\n8\u00894BÏCÙpÕà\u001a\u0098ÂráÎê+]\u000eòNÂÛûx¾Am.Ó5Ú ZHF¡0¤q2Eo>Ô\u00173§ò\u008aÛ\u0096¸!çç&\\ý\u001e~\u0093êS\u001cÆ\r\u009f@aÜÔ#\u000f³f\u0091\u0007Pm\u0087oõ\u008f¼\u0086\u0018ô{êï~aµPÙ\u0011ðV|[\nþà:AY£\u0016Ð\u0001\u0010ËDn«iE¯L\u008d1\u009aÑrk;¥\u00182'B\u0006\u0012\u008bÌ\u009a\u0014=(Ê| \u0085\u009b\u00ad\u009e\u0086g\u0007NÄg ÈÛ\"R\u0001L!&3\u0010:Ø\u0012êÙÁå~Êp®é\u0081\u0095ÇCY\u009a @\u001b8\u0010\u0082÷\u0001Ø\u001dùTIÌ\\\u0092\u008fª\u0087û(\u0010Àï\u001dê\u009d|\u001c\u0007\u0092¬Ícx\nü} s~i\u0007\\:DÙ\rË¢a7ÊN\u0081\u0094ï\u007fK\u0011\"\u0086¢\t}\u0012\u0004N\u0089\u0084Ð0G.ü\u0089\u008aé3áI\u00169÷\u008e\u0081\u008d\u0095!\u008eO\u009f&^×ï\fn'ø¬\u001cÂÀmñª\u0093ñ«Rü%íµ/ÿ_\u0096\u0018  ¤Ý\u0011Ä\u001aïã¨MAÚ\u0005Æ~YÔCZ\u0099°ÅÕ\u0000ê%uÇ\u009ffÇ\u0089\u0010O©\u0003\bf\u001eµ\u008f\u000b\f½´\u0016r¥&(\u0016ÀN\u0006§ç0uN~à\u0006\u0099!+qîyA3\u0094\u0004b\u000bBZ\u0086\u0090ï¤ø)tA\u001f\u008f\u0091&´2 E\u001d\u0005ìM\u001c\u0003ªEÙÕú7N;Ød\u000fs;\u0096\u0094Í\u0095éJv`>Óÿ\" ¥\u0003íT\t\u00817uè\u0003Ï×ïPTÊ¶>y\u009c\u0012¡øûöó\u0099Oï\u0090\n|(ß\u008d\"s\u0091\u0096480æ,¥aN¯ßËUî\u0087Y\u0099Å=¼G6¼\u009f{¡£\u0093Jn\u0007ý©\u008db\u0018\u0014h>r\u0096Î\u001c\u001b¼\u0006\u0005<àG7!\u009a,If+ì{¼\u0018R»\u0089.[\u001e_«¦p\u000fmpóù5\n'ä\u0080\u0019\u0090Ê¡\u0010\u0000\u008e\u009a´¼¯gx\t,N_\u0081]\u0005± «\u009e5h\u008e\u0006B¦[v\u000e\u0088\u009aõ](DyýH\u0091Õ[ø9y\u0084r\u009d[®¥\u0010\u008cD'\u001cH-Cmá\u001c9²0'<{ +LÀ»\u0011\u0018K9¹Ül B®>´¦ø±±vJ\u000bÒ\u007fòÝqx\u0084Ì8\u0018L#²+Î\u0016âäèÙ\u0090y\u009a\u0000\u000b\u0094!À2ü\u0002\u00121Ø\u0010\u0010RðÁ,NØ)ãïõ¾Q}eº@\u000b\u0084,ZäY»Ý=\u0085vKæ\u0015\u0091='\u009dÙÙ\u0099Ç\u0004iå\u008b\u0082\b\\à\u0085ëèfÃV g±»c\u0004ìß\u0097TQ\u0003nÉ¨>Ñ\u0086\u0092QòqôÖ\u008aîÌw \u0084±Ó^s©=¡\u000b¼RHä[\u0018\u009bS;8²Þ\u0002ZÉ\u009eg¹^*G¤\u00968\u0093A\u001eh¶0Ð\u001c?7NÐ\u0098Õz\u000eÈ\u000bd\u0090ÌJ\u008cd\u0010îFÊ\u000e]Im\u008c&sT\u0082æ\u001a¼1\u008c·d\u0004¡Îho\u0002\"Gv+þ\u008d\u0018¸¹\u0080UÐ\u007f\u0089ò'(\u001e \u0000\u0014µû¯\u0004ÜLøÿ\u0082¢\u0010Ö\u001eQÛMÍhA±\u009aÉ\u001a\u009cìX\u0099";
        int length = "J±Mÿ.¼\u008c?@ `FÍ{\u001e±\u0010Ò\u0003Î7u^\u0001\u0085\u0003\u0002\"\u0082G\u0096Îè84°Ù»¸Çs¿IêG!å½}\u009d\u0080\u0082ÄM5\u007fv\u001d\u0001!¬Æ\u009fI\\sM$Ù\u000fA\u009für\u0099Û\u0086\u009es\u008c\u0012Ý\u009bX¾÷\u0094]úÆ03Wû\u0094Åø\u0006\u0001!x²®-ÇÙó\u0018\u0080f/!\u0088bÏ+é\u009e+)\u009eN¸ªì\u001cMÙ,Ç\u000eÝü\u009f\fU\u0006\u001f&\u0010\u001büÞN®\u001a;ª\u0007pP\u000f?¦k*\u0018\u0088î Õ`T\u0096ON62\\=\u0011(\u009f4¢z$±hïÀ8rðÇ\u0014¡ô\u0014î<¾B\u0082\u0089\u0013Ât\r3Aý#AÕ\u0005fÖ¤[ÌÙ\u009aR\fv°\u0094è\u0007ã\u0002~^\t?vK\u0095¿al/\u0082\u0002p\u009bñ\u0010Þ\u008cÁ¬§\u0010<\u0089«øµa\n\u008cÉÕ\u0010¨,\u0088S8öÒ\u001eè\te\"-\u009aÒ.(\u0099\n8\u00894BÏCÙpÕà\u001a\u0098ÂráÎê+]\u000eòNÂÛûx¾Am.Ó5Ú ZHF¡0¤q2Eo>Ô\u00173§ò\u008aÛ\u0096¸!çç&\\ý\u001e~\u0093êS\u001cÆ\r\u009f@aÜÔ#\u000f³f\u0091\u0007Pm\u0087oõ\u008f¼\u0086\u0018ô{êï~aµPÙ\u0011ðV|[\nþà:AY£\u0016Ð\u0001\u0010ËDn«iE¯L\u008d1\u009aÑrk;¥\u00182'B\u0006\u0012\u008bÌ\u009a\u0014=(Ê| \u0085\u009b\u00ad\u009e\u0086g\u0007NÄg ÈÛ\"R\u0001L!&3\u0010:Ø\u0012êÙÁå~Êp®é\u0081\u0095ÇCY\u009a @\u001b8\u0010\u0082÷\u0001Ø\u001dùTIÌ\\\u0092\u008fª\u0087û(\u0010Àï\u001dê\u009d|\u001c\u0007\u0092¬Ícx\nü} s~i\u0007\\:DÙ\rË¢a7ÊN\u0081\u0094ï\u007fK\u0011\"\u0086¢\t}\u0012\u0004N\u0089\u0084Ð0G.ü\u0089\u008aé3áI\u00169÷\u008e\u0081\u008d\u0095!\u008eO\u009f&^×ï\fn'ø¬\u001cÂÀmñª\u0093ñ«Rü%íµ/ÿ_\u0096\u0018  ¤Ý\u0011Ä\u001aïã¨MAÚ\u0005Æ~YÔCZ\u0099°ÅÕ\u0000ê%uÇ\u009ffÇ\u0089\u0010O©\u0003\bf\u001eµ\u008f\u000b\f½´\u0016r¥&(\u0016ÀN\u0006§ç0uN~à\u0006\u0099!+qîyA3\u0094\u0004b\u000bBZ\u0086\u0090ï¤ø)tA\u001f\u008f\u0091&´2 E\u001d\u0005ìM\u001c\u0003ªEÙÕú7N;Ød\u000fs;\u0096\u0094Í\u0095éJv`>Óÿ\" ¥\u0003íT\t\u00817uè\u0003Ï×ïPTÊ¶>y\u009c\u0012¡øûöó\u0099Oï\u0090\n|(ß\u008d\"s\u0091\u0096480æ,¥aN¯ßËUî\u0087Y\u0099Å=¼G6¼\u009f{¡£\u0093Jn\u0007ý©\u008db\u0018\u0014h>r\u0096Î\u001c\u001b¼\u0006\u0005<àG7!\u009a,If+ì{¼\u0018R»\u0089.[\u001e_«¦p\u000fmpóù5\n'ä\u0080\u0019\u0090Ê¡\u0010\u0000\u008e\u009a´¼¯gx\t,N_\u0081]\u0005± «\u009e5h\u008e\u0006B¦[v\u000e\u0088\u009aõ](DyýH\u0091Õ[ø9y\u0084r\u009d[®¥\u0010\u008cD'\u001cH-Cmá\u001c9²0'<{ +LÀ»\u0011\u0018K9¹Ül B®>´¦ø±±vJ\u000bÒ\u007fòÝqx\u0084Ì8\u0018L#²+Î\u0016âäèÙ\u0090y\u009a\u0000\u000b\u0094!À2ü\u0002\u00121Ø\u0010\u0010RðÁ,NØ)ãïõ¾Q}eº@\u000b\u0084,ZäY»Ý=\u0085vKæ\u0015\u0091='\u009dÙÙ\u0099Ç\u0004iå\u008b\u0082\b\\à\u0085ëèfÃV g±»c\u0004ìß\u0097TQ\u0003nÉ¨>Ñ\u0086\u0092QòqôÖ\u008aîÌw \u0084±Ó^s©=¡\u000b¼RHä[\u0018\u009bS;8²Þ\u0002ZÉ\u009eg¹^*G¤\u00968\u0093A\u001eh¶0Ð\u001c?7NÐ\u0098Õz\u000eÈ\u000bd\u0090ÌJ\u008cd\u0010îFÊ\u000e]Im\u008c&sT\u0082æ\u001a¼1\u008c·d\u0004¡Îho\u0002\"Gv+þ\u008d\u0018¸¹\u0080UÐ\u007f\u0089ò'(\u001e \u0000\u0014µû¯\u0004ÜLøÿ\u0082¢\u0010Ö\u001eQÛMÍhA±\u009aÉ\u001a\u009cìX\u0099".length();
        char cCharAt = 16;
        int i7 = -1;
        while (true) {
            int i8 = i7 + 1;
            String strSubstring = str.substring(i8, i8 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i9 = i6;
                        i6++;
                        strArr[i9] = strIntern;
                        int i10 = i8 + cCharAt;
                        i = i10;
                        if (i10 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            c = strArr;
                            d = new String[40];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i11 = 1; i11 < 8; i11++) {
                                bArr2[i11] = (byte) ((j << (i11 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[25];
                            int i12 = 0;
                            String str3 = "[ý9\u00054÷\u0017Ô\u0094\fãé,\u0002UéÜ\u0000\\\u0092\u0004\u009f[É¿°&\u009c÷³í\r\u001cG7\u0097\u0018¾>¥\u001d\u0015Ñ\u001aÙ4\u0093å\u0082\u0005 µâÖô>ÏË\u0010ùßQ\u0011xf\u008dïwÑ·³wø^®o&jpÑ0Ð\u0001Z\u0082èæ\u0082é|·\u00101ð\u001d\u0010\u001f!Å|\u009b,YíQ[\u00adÌ^\r\u0094¸¤\u007fgx\u0015ö#\u009e©æ·õ\u0085/§\u0090<$*S\u000e¤ÃþÂ\u0006\u001by\u0002_,2\u000e\u0098L¸p<è°Ï\u0084\r]Wì~-\u007fk-\u008bíÜ\u009e óf¾ÖG eÓ\u0018\b]Í~>m|";
                            int length2 = "[ý9\u00054÷\u0017Ô\u0094\fãé,\u0002UéÜ\u0000\\\u0092\u0004\u009f[É¿°&\u009c÷³í\r\u001cG7\u0097\u0018¾>¥\u001d\u0015Ñ\u001aÙ4\u0093å\u0082\u0005 µâÖô>ÏË\u0010ùßQ\u0011xf\u008dïwÑ·³wø^®o&jpÑ0Ð\u0001Z\u0082èæ\u0082é|·\u00101ð\u001d\u0010\u001f!Å|\u009b,YíQ[\u00adÌ^\r\u0094¸¤\u007fgx\u0015ö#\u009e©æ·õ\u0085/§\u0090<$*S\u000e¤ÃþÂ\u0006\u001by\u0002_,2\u000e\u0098L¸p<è°Ï\u0084\r]Wì~-\u007fk-\u008bíÜ\u009e óf¾ÖG eÓ\u0018\b]Í~>m|".length();
                            int i13 = 0;
                            while (true) {
                                int i14 = i13;
                                i13 += 8;
                                byte[] bytes = str3.substring(i14, i13).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i15 = i12;
                                i12++;
                                long j8 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j9 = j8;
                                    int i16 = i15;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j9 >>> 56), (byte) (j9 >>> 48), (byte) (j9 >>> 40), (byte) (j9 >>> 32), (byte) (j9 >>> 24), (byte) (j9 >>> 16), (byte) (j9 >>> 8), (byte) j9});
                                    long j10 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i16) {
                                        case 0:
                                            jArr2[b5] = j10;
                                            if (i13 >= length2) {
                                                f = jArr;
                                                g = new Integer[25];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31087, 4471601344668512403L ^ j) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(ql.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22927, 8391500401543882795L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15563, 4593065528314842465L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(ql.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12776, 5813991963867988047L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2396, 3233325637251725535L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(ql.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(913, 7897778497936093733L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3923, 3800796337223794421L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(ql.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15619, 5606374957608619139L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22378, 257505214864762584L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(ql.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12810, 4065512915567788988L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24984, 4188888390286217241L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(ql.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26829, 6156860908101441901L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19862, 1371231628907068449L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23285, 4718994426987090719L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(ql.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2809, 2881350251669126011L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32165, 4282449623774956573L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31815, 8868983991654692284L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(ql.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14506, 1826905903676377351L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6239, 668176643466914282L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10331, 7536087675269276093L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(ql.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1429, 12826386851558458L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17175, 8242515604868018876L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32707, 3435698588419405348L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(ql.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10007, 2980544188727350957L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25372, 1390553969687106239L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32521, 7242166548723742448L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(ql.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25250, 7152828116079481607L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31510, 4106094894039796415L ^ j) /* invoke-custom */, 0));
                                                C = kPropertyArr;
                                                k = new ql(i2, i3, (short) i4);
                                                I = yp.L(k, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8373, 2872172594916020505L ^ j) /* invoke-custom */, d9.PROTECTION, null, null, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14082, 5190036998248267504L ^ j) /* invoke-custom */, null, j7);
                                                D = yp.L(k, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10412, 2427009434678614295L ^ j) /* invoke-custom */, d9.PROTECTION, null, null, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22941, 842654350328991870L ^ j) /* invoke-custom */, null, j7);
                                                F = yp.L(k, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22300, 6352842357871355545L ^ j) /* invoke-custom */, d9.PROTECTION, null, null, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22941, 842654350328991870L ^ j) /* invoke-custom */, null, j7);
                                                L = yp.L(k, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8850, 3223690112061395759L ^ j) /* invoke-custom */, d9.PROTECTION, null, null, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22941, 842654350328991870L ^ j) /* invoke-custom */, null, j7);
                                                S = yp.L(k, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9577, 5972196408806593754L ^ j) /* invoke-custom */, mb.IGNORE, null, null, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22941, 842654350328991870L ^ j) /* invoke-custom */, null, j7);
                                                a = yp.L(k, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16718, 2604833685870915814L ^ j) /* invoke-custom */, 1, new IntRange(0, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32521, 7242166548723742448L ^ j) /* invoke-custom */), j5, null, null, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16507, 9196733045999045012L ^ j) /* invoke-custom */, null);
                                                V = yp.t(k, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31826, 8019833758775938556L ^ j) /* invoke-custom */, false, j6, null, null, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22941, 842654350328991870L ^ j) /* invoke-custom */, null);
                                                U = yp.t(k, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18865, 3784358007311939592L ^ j) /* invoke-custom */, false, j6, null, null, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22941, 842654350328991870L ^ j) /* invoke-custom */, null);
                                                x = yp.t(k, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31339, 141564262609226698L ^ j) /* invoke-custom */, false, j6, null, null, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22941, 842654350328991870L ^ j) /* invoke-custom */, null);
                                                y = yp.t(k, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25827, 5491369594631427431L ^ j) /* invoke-custom */, true, j6, null, null, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22941, 842654350328991870L ^ j) /* invoke-custom */, null);
                                                n = yp.t(k, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4177, 3564763237527282158L ^ j) /* invoke-custom */, false, j6, null, null, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22941, 842654350328991870L ^ j) /* invoke-custom */, null);
                                                m = new i9(j2);
                                                K = new i9(j2);
                                                T = CollectionsKt.listOf((Object[]) new o0[]{new o0(j3, class_1304.field_6166, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25382, 3594629130920241867L ^ j) /* invoke-custom */, -1, -1, -1), new o0(j3, class_1304.field_6172, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17990, 2450246843296321454L ^ j) /* invoke-custom */, -1, -1, -1), new o0(j3, class_1304.field_6174, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16646, 2934882377696217314L ^ j) /* invoke-custom */, -1, -1, -1), new o0(j3, class_1304.field_6169, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(800, 1450470280470153931L ^ j) /* invoke-custom */, -1, -1, -1)});
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j10;
                                            if (i13 >= length2) {
                                                str3 = "l\u0096\tyziW\u0000\u009c\u008f¸\u0019xöå\u0087";
                                                length2 = "l\u0096\tyziW\u0000\u009c\u008f¸\u0019xöå\u0087".length();
                                                i13 = 0;
                                            }
                                            break;
                                    }
                                    int i17 = i13;
                                    i13 += 8;
                                    byte[] bytes2 = str3.substring(i17, i13).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i15 = i12;
                                    i12++;
                                    j8 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i18 = i6;
                        i6++;
                        strArr[i18] = strIntern;
                        int i19 = i8 + cCharAt;
                        i7 = i19;
                        if (i19 < length) {
                        }
                        str = ",ë\u0096¿l.\u0086Ñ\u001c\u0091h\u0012Mú\u0080®\u0002\u009f;H=V³6\u0006µ¹²7{\u0090Ï\u0018Ã¶\u001d!µw6îÔFÅ\u0099@\u0081\u0003û\u0016ë×Éõ¯\u0006·";
                        length = ",ë\u0096¿l.\u0086Ñ\u001c\u0091h\u0012Mú\u0080®\u0002\u009f;H=V³6\u0006µ¹²7{\u0090Ï\u0018Ã¶\u001d!µw6îÔFÅ\u0099@\u0081\u0003û\u0016ë×Éõ¯\u0006·".length();
                        cCharAt = ' ';
                        i = -1;
                        break;
                        break;
                }
                i8 = i + 1;
                strSubstring = str.substring(i8, i8 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i7);
        }
    }

    private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException noWhenBranchMatchedException) {
        return noWhenBranchMatchedException;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 14043;
        if (d[i2] == null) {
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
                d[i2] = b(((Cipher) objArr[0]).doFinal(c[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/ql", e2);
            }
        }
        return d[i2];
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
            java.lang.String r1 = "su/catlean/ql"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ql.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 3729;
        if (g[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/ql", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            g[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return g[i2].intValue();
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
            java.lang.String r1 = "su/catlean/ql"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ql.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
