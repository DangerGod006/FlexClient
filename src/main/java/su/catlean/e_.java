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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/e_.class */
public final class e_ extends _g {

    @NotNull
    public static final e_ g;
    static final KProperty[] L;

    @NotNull
    private static final cw X;

    @NotNull
    private static final c8 K;

    @NotNull
    private static final cp c;

    @NotNull
    private static final cq P;

    @NotNull
    private static final cq N;

    @NotNull
    private static final cq d;

    @NotNull
    private static final cq f;

    @NotNull
    private static final cq D;

    @NotNull
    private static final cq J;

    @NotNull
    private static final i9 e;
    private static final long a = yz.a(-4809943490066907250L, 2188418459199564833L, MethodHandles.lookup().lookupClass()).a(70429097109631L);
    private static final String[] b;
    private static final String[] h;
    private static final Map i;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;

    /* JADX WARN: Illegal instructions before constructor call */
    private e_(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22406, 5624198197993362676L ^ j3) /* invoke-custom */, jt.y(), null, 4, null, j3 ^ 74050078764696L);
    }

    private final f9 r(long j2) {
        return (f9) X.E(this, (a ^ j2) ^ 76057175192196L, L[0]);
    }

    private final void N(f9 f9Var, long j2) {
        X.b(this, (a ^ j2) ^ 1064788964444L, L[0], f9Var);
    }

    private final int Q(int i2, int i3, short s) {
        return ((Number) K.E(this, ((((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ a) ^ 64876882263469L, L[1])).intValue();
    }

    private final void K(int i2, long j2) {
        K.b(this, (a ^ j2) ^ 132425098304933L, L[1], Integer.valueOf(i2));
    }

    private final h g(int i2, long j2) {
        return (h) c.E(this, (((((long) i2) << 32) | ((j2 << 32) >>> 32)) ^ a) ^ 45810186216168L, L[2]);
    }

    private final boolean p(long j2) {
        return ((Boolean) P.E(this, (a ^ j2) ^ 862404870326L, L[3])).booleanValue();
    }

    private final void f(int i2, boolean z, short s, short s2) {
        P.b(this, ((((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ a) ^ 14812850095739L, L[3], Boolean.valueOf(z));
    }

    private final boolean n(long j2) {
        return ((Boolean) N.E(this, (a ^ j2) ^ 5601897757528L, L[4])).booleanValue();
    }

    private final void I(short s, boolean z, long j2) {
        N.b(this, (((((long) s) << 48) | ((j2 << 16) >>> 16)) ^ a) ^ 94059064120867L, L[4], Boolean.valueOf(z));
    }

    private final boolean I(long j2) {
        return ((Boolean) d.E(this, (a ^ j2) ^ 2182465017186L, L[5])).booleanValue();
    }

    private final void H(int i2, long j2, boolean z) {
        d.b(this, (((((long) i2) << 32) | ((j2 << 32) >>> 32)) ^ a) ^ 90648588861130L, L[5], Boolean.valueOf(z));
    }

    private final boolean v(long j2) {
        long j3 = a ^ j2;
        return ((Boolean) f.E(this, j3 ^ 58721896766090L, L[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31127, 7841459729910869374L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void W(boolean z, long j2) {
        long j3 = a ^ j2;
        f.b(this, j3 ^ 5565920852076L, L[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31127, 7841456926631598196L ^ j3) /* invoke-custom */], Boolean.valueOf(z));
    }

    private final boolean s(short s, short s2, int i2) {
        long j2 = (((((long) s) << 48) | ((((long) s2) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a;
        return ((Boolean) D.E(this, j2 ^ 56540372021012L, L[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21844, 3152804701207344161L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final void s(long j2, boolean z) {
        long j3 = a ^ j2;
        D.b(this, j3 ^ 29975318169091L, L[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21844, 3152835231461346010L ^ j3) /* invoke-custom */], Boolean.valueOf(z));
    }

    private final boolean i(long j2) {
        long j3 = a ^ j2;
        return ((Boolean) J.E(this, j3 ^ 24394689479310L, L[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27488, 3798918974217758600L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void L(boolean z, int i2, int i3) {
        long j2 = ((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ a;
        J.b(this, j2 ^ 138724980996831L, L[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27488, 3798827369575155765L ^ j2) /* invoke-custom */], Boolean.valueOf(z));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x02de: INVOKE (r-1 I:su.catlean.gg), (r0 I:long), (r1 I:su.catlean.n5), (r2 I:su.catlean.f9) VIRTUAL call: su.catlean.gg.X(long, su.catlean.n5, su.catlean.f9):su.catlean.fg
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void I(su.catlean.api.event.events.player.PlayerUpdateEvent r13) {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e_.I(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:64:0x0206
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final java.util.List W(int r10, int r11, byte r12) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e_.W(int, int, byte):java.util.List");
    }

    private static final boolean M(class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28060, 5300353694965493763L ^ (a ^ 125587672815598L)) /* invoke-custom */);
        return Intrinsics.areEqual(class_1799Var.method_7909(), class_1802.field_8324);
    }

    private static final Unit Q(class_3965 class_3965Var) {
        long j2 = a ^ 35531723605321L;
        long j3 = j2 ^ 61077650186604L;
        zf.Z((int) (j2 >>> 32), ((j2 ^ 46256510685283L) << 32) >>> 32).method_2896(zf.v(j3), class_1268.field_5808, class_3965Var);
        zf.v(j3).method_6104(class_1268.field_5808);
        return Unit.INSTANCE;
    }

    private static final Unit K(fg fgVar, class_3965 class_3965Var) {
        long j2 = a ^ 47286420442495L;
        gg.P.T(j2 ^ 81581547357884L, fgVar.a(), g.r(j2 ^ 51597392884735L), () -> {
            return Q(r4);
        });
        return Unit.INSTANCE;
    }

    static {
        int i2;
        long j2 = a ^ 40399835436009L;
        long j3 = j2 ^ 77867828686248L;
        long j4 = j2 ^ 42786962354855L;
        long j5 = j2 ^ 30064287231767L;
        long j6 = j2 ^ 58206671970929L;
        long j7 = j2 ^ 55397559842627L;
        int i3 = (int) (j2 >>> 48);
        int i4 = (int) ((j7 << 16) >>> 32);
        int i5 = (int) ((j7 << 48) >>> 48);
        int i6 = (int) (j2 >>> 32);
        long j8 = ((j2 ^ 85576901639429L) << 32) >>> 32;
        long j9 = j2 ^ 129252523284677L;
        i = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i7 = 1; i7 < 8; i7++) {
            bArr[i7] = (byte) ((j2 << (i7 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[39];
        int i8 = 0;
        String str = "Y\u0083Ò\u001b¤É\u0091ZÎÁ$8¸øá_h\u0010\u0090Ü\u008d,ùMÃ\u008eª\\ô\u008bUa8l\u0017é\u0001\u0017\u000b\u0096\u0013(«o&\u0095?<»Òz\u0090â5\u009e³ç\u0016Ý\u0085y\u0090Ô|\u0006Ì\u007fxSõÄá\u0093¶£S\u0093Ã®\u00849Ìp\u0087\u008b\u009fËHI\u0018ùÄ\u0087\u0082ò\u00995\u0018ÍGOÁY²Ã\u0083\u0084Ã\u0082\u0015bÒâ½\u0018Èl}\u0000\u000b\u0016Ë=]Ê1í&»b\u008cG\u0086}\u0007¤Õ&\u0097\u0010ÍK\fÏMN³\u0011Üh¦\u000b^K8p(äög\u0094¬Ó(\u001e¥+\u009fy½<\u008f´\u0011\u009drÜ<¨3ã\u00ad\u009dà¦Ã¡d\u0006çN\u00006\u00021¹¸\u0010\u008aÑ\u007fú\u000fÁ\u0001¡ß\u001f\nx¸\u0083ÿ¿  Å£\u001c\u0013\u0092Ã\u000eÁ\u0002\t\fá\u001d\u0007êQ\u009a,ß]¶ã\u0082¤\u00979>HC÷Ô({çå¬j\u0014\u008e\u0006PÐµ»æº8ô;X¥OndWBtAÎÃ\u0011\u00899Ý7\u0095Õá\b\u009eÒ?\u0010b\u000f;\u001dÔ\u0086¾\u008c?äp\u000e\u0081\u0014\rÍ\u0010ó®¥\u009a§\"\u0004Tj¥ðÔ\u008d~·! «QÃä,¤Z7EpOMÂ\u000f¸\u0093\u009fð\u0005N\u000f\u0089\u0096\u0017Ìx\u008e\u0005\u0094Êô? g\u008b\u008c\u008e\u009b(4\u009eSà jmi?È\u0090¹\u001aÏ\u007fWá°ô½ÔÀB\u0084çh\u0010èE:1i\u009c;ò\u008a>æ\rt\u0006èì 1\u0014\u0019\n0ÇU¦¯f\u0089¿:\u0098ºPè@¯^5/ÏË\u008b[ØPµA¾h\u0010V\u0091ª1\u000f!H¤¸³S\u0017\u0001mfa\u0010\u009epÆð:(Á\u0004B)ºXq\u0088|\u0081\u0080\u001fw\u008aM¶\u009a\u0015æ\u00809\\*ºVÙüH\u0016\u008b²LJâ3Ü×²´|Ü9kk`\u0094[\u000e  \u0096u\"±J)z\u008dsk®T\u0002ý\u0003C[ï²\u0010¤=¬7Jâù=\u008e\u0019(>æ³å\u0092\u0000)eqúÄd\u0087\u001cî\u0013ØÁs\b05\u0085£ª\u0089¼\u0082s\u0087C%0`\u0087\u0017y\u000b<\u0004KAs!\u0086\u000bÊ\u0001ÕÄÂ\u000eàïP\fûQ\u0010¬\u0086©ÏãÍ\u0000Öb\r½\u0096/{°Ê\u0010\u0006Ù\u0012\u008d«2ô´¹¼=!»Ø\u0002É0n½r¾y\u0001ÈVõ\u008a\u0085\u0001öK\u008dÑv\u007f\b\u0014¥\u0093/\tÔõ½\u0014\u0019\u0000i\u0004fÀ÷ìd¯MåÚ£¨B,íYã\u0010«\u0018AÛýrýûHªs÷²fÑÉ\u0018jy\u0095\u0094\u0080ô¨\u009bï\u0082Ó\u0087<\u008f\u0089\u009aíæÔ\u00152ª&m\u0010}$¼öÒ\u009aä®æ,\bN\u008aü«Ì\u0018~\u008edÉ¤¦lMùq\u009f`ÀpLã#\u0088¦~\u0006m\u008fi\u0010ù\u00173Ú\u0002*ºÉÝ\f\u0011\u008f\u0097X´\u0006x\u0001»\u0092'«c\u008cQnu\u001fBÁæ¢O\u0007\u0005\u001b\u000bÐ\u0006°Û\u0099\u0013W©0Ð\u0019=\u001fî\u0089óÏ\u009fî\u009d½²ÝØ¡Þ\u000e_ô\u0086ñµf±\u0096ùe^è\u0001§vW<_P@vV-\u0019³\u0011\n\u0094ûÛw.\u0083Xä6\u0005ánØ>(\u008aa\u0083´RV\u008a!+Æ.ÞÀ\"gÉ¢\b:0qxÍ\u0019â§å(\u0092M«\u0010\u008bÂ\u0092\u001aN¥\u0084ì_Ã\u0089çã\u0014ñ\u000e\u0010JÀT]Ñ¹È@þ/@À¬\u0098æ§ [\u0011¯õ\u0015\u001d\u0004¨\u0093nòÉÌ¾\u008bïä\u0005'²t&Z\u0097·\u0013Bp¥\u0096_Ë\u0018\u0098{Ü\r\u008fCIfS®®dºf\u000bÍ6\u0003\n\u008aø\u0011·«\u0018þ,~ÿ\u0096k¾¶7x\u0084ÓT\u0010à\u0012Sã3Â¤q¡æ\u0018QtÐ<¯\t\\\u001bÙn¾õ®-3@\u000eöAqë:ì\u0017\u0010Áë¤K\u0003\u000fIR\"æ\u009e\u0083\u0097K\u001do\u0010\u0016aM|»5bNý»\u007fm¬ÿ\u0095\u009f ù\u00adUòþô(T~o\u0004\u0081ô\u00ad.Ûj\u0003²\u0092\u001er \u008fZ9\u0090\u0017ÊA¹³\u0018·'RÔ\u008eñfü¦+`8\u0083F\u00165\u009b\u0002a\u008c\u0090$\u000fÕ";
        int length = "Y\u0083Ò\u001b¤É\u0091ZÎÁ$8¸øá_h\u0010\u0090Ü\u008d,ùMÃ\u008eª\\ô\u008bUa8l\u0017é\u0001\u0017\u000b\u0096\u0013(«o&\u0095?<»Òz\u0090â5\u009e³ç\u0016Ý\u0085y\u0090Ô|\u0006Ì\u007fxSõÄá\u0093¶£S\u0093Ã®\u00849Ìp\u0087\u008b\u009fËHI\u0018ùÄ\u0087\u0082ò\u00995\u0018ÍGOÁY²Ã\u0083\u0084Ã\u0082\u0015bÒâ½\u0018Èl}\u0000\u000b\u0016Ë=]Ê1í&»b\u008cG\u0086}\u0007¤Õ&\u0097\u0010ÍK\fÏMN³\u0011Üh¦\u000b^K8p(äög\u0094¬Ó(\u001e¥+\u009fy½<\u008f´\u0011\u009drÜ<¨3ã\u00ad\u009dà¦Ã¡d\u0006çN\u00006\u00021¹¸\u0010\u008aÑ\u007fú\u000fÁ\u0001¡ß\u001f\nx¸\u0083ÿ¿  Å£\u001c\u0013\u0092Ã\u000eÁ\u0002\t\fá\u001d\u0007êQ\u009a,ß]¶ã\u0082¤\u00979>HC÷Ô({çå¬j\u0014\u008e\u0006PÐµ»æº8ô;X¥OndWBtAÎÃ\u0011\u00899Ý7\u0095Õá\b\u009eÒ?\u0010b\u000f;\u001dÔ\u0086¾\u008c?äp\u000e\u0081\u0014\rÍ\u0010ó®¥\u009a§\"\u0004Tj¥ðÔ\u008d~·! «QÃä,¤Z7EpOMÂ\u000f¸\u0093\u009fð\u0005N\u000f\u0089\u0096\u0017Ìx\u008e\u0005\u0094Êô? g\u008b\u008c\u008e\u009b(4\u009eSà jmi?È\u0090¹\u001aÏ\u007fWá°ô½ÔÀB\u0084çh\u0010èE:1i\u009c;ò\u008a>æ\rt\u0006èì 1\u0014\u0019\n0ÇU¦¯f\u0089¿:\u0098ºPè@¯^5/ÏË\u008b[ØPµA¾h\u0010V\u0091ª1\u000f!H¤¸³S\u0017\u0001mfa\u0010\u009epÆð:(Á\u0004B)ºXq\u0088|\u0081\u0080\u001fw\u008aM¶\u009a\u0015æ\u00809\\*ºVÙüH\u0016\u008b²LJâ3Ü×²´|Ü9kk`\u0094[\u000e  \u0096u\"±J)z\u008dsk®T\u0002ý\u0003C[ï²\u0010¤=¬7Jâù=\u008e\u0019(>æ³å\u0092\u0000)eqúÄd\u0087\u001cî\u0013ØÁs\b05\u0085£ª\u0089¼\u0082s\u0087C%0`\u0087\u0017y\u000b<\u0004KAs!\u0086\u000bÊ\u0001ÕÄÂ\u000eàïP\fûQ\u0010¬\u0086©ÏãÍ\u0000Öb\r½\u0096/{°Ê\u0010\u0006Ù\u0012\u008d«2ô´¹¼=!»Ø\u0002É0n½r¾y\u0001ÈVõ\u008a\u0085\u0001öK\u008dÑv\u007f\b\u0014¥\u0093/\tÔõ½\u0014\u0019\u0000i\u0004fÀ÷ìd¯MåÚ£¨B,íYã\u0010«\u0018AÛýrýûHªs÷²fÑÉ\u0018jy\u0095\u0094\u0080ô¨\u009bï\u0082Ó\u0087<\u008f\u0089\u009aíæÔ\u00152ª&m\u0010}$¼öÒ\u009aä®æ,\bN\u008aü«Ì\u0018~\u008edÉ¤¦lMùq\u009f`ÀpLã#\u0088¦~\u0006m\u008fi\u0010ù\u00173Ú\u0002*ºÉÝ\f\u0011\u008f\u0097X´\u0006x\u0001»\u0092'«c\u008cQnu\u001fBÁæ¢O\u0007\u0005\u001b\u000bÐ\u0006°Û\u0099\u0013W©0Ð\u0019=\u001fî\u0089óÏ\u009fî\u009d½²ÝØ¡Þ\u000e_ô\u0086ñµf±\u0096ùe^è\u0001§vW<_P@vV-\u0019³\u0011\n\u0094ûÛw.\u0083Xä6\u0005ánØ>(\u008aa\u0083´RV\u008a!+Æ.ÞÀ\"gÉ¢\b:0qxÍ\u0019â§å(\u0092M«\u0010\u008bÂ\u0092\u001aN¥\u0084ì_Ã\u0089çã\u0014ñ\u000e\u0010JÀT]Ñ¹È@þ/@À¬\u0098æ§ [\u0011¯õ\u0015\u001d\u0004¨\u0093nòÉÌ¾\u008bïä\u0005'²t&Z\u0097·\u0013Bp¥\u0096_Ë\u0018\u0098{Ü\r\u008fCIfS®®dºf\u000bÍ6\u0003\n\u008aø\u0011·«\u0018þ,~ÿ\u0096k¾¶7x\u0084ÓT\u0010à\u0012Sã3Â¤q¡æ\u0018QtÐ<¯\t\\\u001bÙn¾õ®-3@\u000eöAqë:ì\u0017\u0010Áë¤K\u0003\u000fIR\"æ\u009e\u0083\u0097K\u001do\u0010\u0016aM|»5bNý»\u007fm¬ÿ\u0095\u009f ù\u00adUòþô(T~o\u0004\u0081ô\u00ad.Ûj\u0003²\u0092\u001er \u008fZ9\u0090\u0017ÊA¹³\u0018·'RÔ\u008eñfü¦+`8\u0083F\u00165\u009b\u0002a\u008c\u0090$\u000fÕ".length();
        char cCharAt = ' ';
        int i9 = -1;
        while (true) {
            int i10 = i9 + 1;
            String strSubstring = str.substring(i10, i10 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i11 = i8;
                        i8++;
                        strArr[i11] = strIntern;
                        int i12 = i10 + cCharAt;
                        i2 = i12;
                        if (i12 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            b = strArr;
                            h = new String[39];
                            l = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i13 = 1; i13 < 8; i13++) {
                                bArr2[i13] = (byte) ((j2 << (i13 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[11];
                            int i14 = 0;
                            String str3 = "T\u0002&y\u009b)÷â¸dn\u0019ñ\t62\u0002 ö\u007fá\t¥t\u0095\u0082\u000b¬þ\u008aÃ×I¾1¦nk=Ê³\u0086ÿ·\u0096ù\u0005/Ò\u0083\u009a¼¹ýºxY\u0080Y\"éID_e\u0080½\b\u0016\u0004ÎÃ";
                            int length2 = "T\u0002&y\u009b)÷â¸dn\u0019ñ\t62\u0002 ö\u007fá\t¥t\u0095\u0082\u000b¬þ\u008aÃ×I¾1¦nk=Ê³\u0086ÿ·\u0096ù\u0005/Ò\u0083\u009a¼¹ýºxY\u0080Y\"éID_e\u0080½\b\u0016\u0004ÎÃ".length();
                            int i15 = 0;
                            while (true) {
                                int i16 = i15;
                                i15 += 8;
                                byte[] bytes = str3.substring(i16, i15).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i17 = i14;
                                i14++;
                                long j10 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j11 = j10;
                                    int i18 = i17;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j11 >>> 56), (byte) (j11 >>> 48), (byte) (j11 >>> 40), (byte) (j11 >>> 32), (byte) (j11 >>> 24), (byte) (j11 >>> 16), (byte) (j11 >>> 8), (byte) j11});
                                    long j12 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i18) {
                                        case 0:
                                            jArr2[b5] = j12;
                                            if (i15 >= length2) {
                                                j = jArr;
                                                k = new Integer[11];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13610, 5909957718114259946L ^ j2) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(e_.class, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13401, 4687556374130879936L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4500, 5090901297122625554L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(e_.class, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22095, 7374593469985656769L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26410, 7507453953098759871L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(e_.class, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25888, 8174687433011215549L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13036, 7344543879725181823L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(e_.class, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21897, 8551346512834071566L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32130, 1061510996493181965L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(e_.class, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21461, 1023031485808511589L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19253, 955164356093350591L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(e_.class, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12584, 4957984692047177911L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25640, 7712254258298011033L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26128, 1404656807713439964L ^ j2) /* invoke-custom */] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(e_.class, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6001, 7447358540854546161L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2438, 6215961312893849652L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2270, 2469511566906027545L ^ j2) /* invoke-custom */] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(e_.class, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3521, 6240884605188297792L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8690, 6740369630103107702L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31881, 4418479947575564871L ^ j2) /* invoke-custom */] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(e_.class, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29133, 487846026049661009L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26273, 7930174213631917872L ^ j2) /* invoke-custom */, 0));
                                                L = kPropertyArr;
                                                g = new e_(j3);
                                                X = yp.L(g, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14982, 781010139834671885L ^ j2) /* invoke-custom */, f9.SILENT_FULL, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14796, 1735273040653737742L ^ j2) /* invoke-custom */, null, j9);
                                                K = yp.L(g, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24287, 6974734568273741641L ^ j2) /* invoke-custom */, 0, new IntRange(0, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13271, 3757905205776405780L ^ j2) /* invoke-custom */), j5, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21415, 3522494521481934178L ^ j2) /* invoke-custom */, null);
                                                c = yp.B(g, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10466, 7360744537681523030L ^ j2) /* invoke-custom */, (short) i3, w7.BOOLS, null, 4, i4, null, (char) i5);
                                                P = yp.t(g, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8452, 7821330071178868895L ^ j2) /* invoke-custom */, true, j6, g.g(i6, j8), null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27488, 3798821833751104929L ^ j2) /* invoke-custom */, null);
                                                N = yp.t(g, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(361, 4569111779280345324L ^ j2) /* invoke-custom */, true, j6, g.g(i6, j8), null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27488, 3798821833751104929L ^ j2) /* invoke-custom */, null);
                                                d = yp.t(g, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10514, 9148755212194476197L ^ j2) /* invoke-custom */, true, j6, g.g(i6, j8), null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27488, 3798821833751104929L ^ j2) /* invoke-custom */, null);
                                                f = yp.t(g, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16698, 8672115345326577801L ^ j2) /* invoke-custom */, false, j6, g.g(i6, j8), null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27488, 3798821833751104929L ^ j2) /* invoke-custom */, null);
                                                D = yp.t(g, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1956, 2653474860469739046L ^ j2) /* invoke-custom */, false, j6, g.g(i6, j8), null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27488, 3798821833751104929L ^ j2) /* invoke-custom */, null);
                                                J = yp.t(g, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15541, 4425367670178374915L ^ j2) /* invoke-custom */, false, j6, g.g(i6, j8), null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27488, 3798821833751104929L ^ j2) /* invoke-custom */, null);
                                                e = new i9(j4);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j12;
                                            if (i15 >= length2) {
                                                str3 = "í]´Å¹ÃGf\f>óAU\u001aß\u0095";
                                                length2 = "í]´Å¹ÃGf\f>óAU\u001aß\u0095".length();
                                                i15 = 0;
                                            }
                                            break;
                                    }
                                    int i19 = i15;
                                    i15 += 8;
                                    byte[] bytes2 = str3.substring(i19, i15).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i17 = i14;
                                    i14++;
                                    j10 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i20 = i8;
                        i8++;
                        strArr[i20] = strIntern;
                        int i21 = i10 + cCharAt;
                        i9 = i21;
                        if (i21 < length) {
                        }
                        str = "d¤\\\u0090FT5z7l\u00ad¿z\u0013·\f\u0018Ä)uã*L\u008eZG{®Uæ^x`ç\u0087~/4>\u0084=";
                        length = "d¤\\\u0090FT5z7l\u00ad¿z\u0013·\f\u0018Ä)uã*L\u008eZG{®Uæ^x`ç\u0087~/4>\u0084=".length();
                        cCharAt = 16;
                        i2 = -1;
                        break;
                        break;
                }
                i10 = i2 + 1;
                strSubstring = str.substring(i10, i10 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i9);
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 15665;
        if (h[i3] == null) {
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
                h[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/e_", e2);
            }
        }
        return h[i3];
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
            java.lang.String r1 = "su/catlean/e_"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e_.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 613;
        if (k[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) j[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) l.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/e_", e2);
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
            java.lang.String r1 = "su/catlean/e_"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e_.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
