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
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qs.class */
public final class qs extends _g {

    @NotNull
    public static final qs c;
    static final KProperty[] K;

    @NotNull
    private static final c8 Y;

    @NotNull
    private static final av b;

    @NotNull
    private static final cq W;

    @NotNull
    private static final cq e;

    @NotNull
    private static final cq I;

    @NotNull
    private static class_243 G;

    @NotNull
    private static bg f;
    private static final long a = yz.a(-8322813928051460090L, 5770892342167639590L, MethodHandles.lookup().lookupClass()).a(113023663211465L);
    private static final String[] d;
    private static final String[] g;
    private static final Map h;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map k;

    /* JADX WARN: Illegal instructions before constructor call */
    private qs(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17817, 4382902247837762968L ^ j3) /* invoke-custom */, jt.A(), null, 4, null, j3 ^ 102790477132195L);
    }

    private final int E(long j2) {
        return ((Number) Y.E(this, (a ^ j2) ^ 135470461928381L, K[0])).intValue();
    }

    private final lj w(long j2) {
        return (lj) b.E(this, (a ^ j2) ^ 18982311126957L, K[1]);
    }

    private final boolean L(long j2) {
        return ((Boolean) W.E(this, (a ^ j2) ^ 131436574975100L, K[2])).booleanValue();
    }

    private final boolean Q(long j2) {
        return ((Boolean) e.E(this, (a ^ j2) ^ 18226615615185L, K[3])).booleanValue();
    }

    private final boolean x(long j2) {
        return ((Boolean) I.E(this, (a ^ j2) ^ 27518910901446L, K[4])).booleanValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x04bb: INVOKE 
          (r-1 I:su.catlean.o8)
          (r0 I:long)
          (r1 I:int)
          (r2 I:byte)
          (r3 I:boolean)
          (r4 I:java.lang.Runnable)
          (r5 I:int)
          (r6 I:java.lang.Object)
         STATIC call: su.catlean.o8.p(su.catlean.o8, long, int, byte, boolean, java.lang.Runnable, int, java.lang.Object):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void g(su.catlean.api.event.events.player.PlayerUpdateEvent r12) {
        /*
            Method dump skipped, instruction units count: 1215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qs.g(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:25:0x00d8
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void D(su.catlean.api.event.events.world.EntitySpawn r11) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qs.D(su.catlean.api.event.events.world.EntitySpawn):void");
    }

    private static final void F(int i2) {
        gg.P.f(i2, (a ^ 57414889229178L) ^ 127382683435682L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00d0: INVOKE 
          (r-1 I:su.catlean.o8)
          (r0 I:long)
          (r1 I:int)
          (r2 I:byte)
          (r3 I:boolean)
          (r4 I:java.lang.Runnable)
          (r5 I:int)
          (r6 I:java.lang.Object)
         STATIC call: su.catlean.o8.p(su.catlean.o8, long, int, byte, boolean, java.lang.Runnable, int, java.lang.Object):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final void w(int r10) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qs.w(int):void");
    }

    private static final void Q(int i2, int i3) {
        long j2 = a ^ 72456785196994L;
        long j3 = j2 ^ 137807709118069L;
        gg.P.f(i2, j2 ^ 6645614280218L);
        o8.p(o8.g, j3, c.E(j2 ^ 134223010101371L), (byte) 0, false, () -> {
            w(r5);
        }, 2, null);
    }

    private static final void Z(int i2) {
        gg.P.f(i2, (a ^ 33866421988134L) ^ 97995073151742L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00d0: INVOKE 
          (r-1 I:su.catlean.o8)
          (r0 I:long)
          (r1 I:int)
          (r2 I:byte)
          (r3 I:boolean)
          (r4 I:java.lang.Runnable)
          (r5 I:int)
          (r6 I:java.lang.Object)
         STATIC call: su.catlean.o8.p(su.catlean.o8, long, int, byte, boolean, java.lang.Runnable, int, java.lang.Object):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final void V(int r10) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qs.V(int):void");
    }

    static {
        int i2;
        long j2 = a ^ 134040623585386L;
        long j3 = j2 ^ 132700972686563L;
        long j4 = j2 ^ 95758267060613L;
        long j5 = j2 ^ 3603423655351L;
        long j6 = j2 ^ 6190978398480L;
        long j7 = j2 ^ 42307268482724L;
        int i3 = (int) (j2 >>> 32);
        int i4 = (int) ((j7 << 32) >>> 48);
        int i5 = (int) ((j7 << 48) >>> 48);
        h = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i6 = 1; i6 < 8; i6++) {
            bArr[i6] = (byte) ((j2 << (i6 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[28];
        int i7 = 0;
        String str = "\u0096Å)§¶ËÏï\u008c\u0081Ýv¶m15\u0097Dûñ:^÷¸¥Â¯\u0006\u00979\u0015\f\u0080\u0080¿øRùïÌ£\u00068\u001a¢Ò¬|/ÙöG« l\u001aN4|âXªÓv\u0016÷Sâö¡\u0017]½-ó4Y¾2ó\u009eý\u0005´\u001eÄÃ%OèÐ¨²7þ\u0098d.g\u0082\t\"\u0083%©\u009b\u0085\f\u0093áÀ\u000f¤]Y\t`x\u0084\u0019²\u0083Ô¦é¾\u0096ñoôÔ\u001e5\u008e\u0083ª}[ÖîmZò®Ø¦\fÙ\u0012À¹¬X*i§\u000e=o,?(\u0091>#{¬0}E¦'dw\bÔaGôI4Á\u0007r/-L\u0093#¡Ã\u001aO\u0003ô\u0093êí\u0017P+\u0099\u0088ß\u0013\u001d\rñ§ò°yñ\r¾ï\u001bä°]à_\f\u0017\u008e:\u0003\u000eäËÁ\u0017§^¯&iaUó\u009a\u007febFS¥Oiñ\u009e==[\u0082¶G\u0015\u009e*ö\t\u0088\u008cß\u000b(âX\u001f&Ç¡\u008cód«û\u0010R\u0002-¿µÕøÀ\u0018y)¤{}³3\u001eÏ/)àP\u0015?¨þ\u001f¤aà¦¶µÛièÕÈ\u0090\u0019J\u009bÖJ\u001b\fPpXvÑ}\u0011íñ~mxÒü\u0010{÷\u000f 94m¤7\bÍmÞ`_%\u0010À\b\u007fj¢½{.þíÂ¢Å~²ð Y8ö\u0081í\u0015ÔFóîcQ^Ci^U\fýì¸h\u0092Èm?\u0095¯·Ô\u009dí\u00100Gw\u0095Ëî¯\u001e'z|½ú\u0013¼8 \rV¸\u0090Ôþ³&ÊTæ\u0010·¶ß!EàÎýÝ^{ý\u009ctmk¬ \u0087ì\u0018\u009b *\u0019±\u009d\u0011\u008fÎ\u0004G\tt,]Õ\u0015\u0090[\u0090+Ï']\u0018\r\u0017\u0088Ì\u0088þ\u0002G&!ÚÀvå³¶Å\u0016\u009f&\u0001\u001e\u0085¨\u0080ß\u001cR¤hÌIë\u0006\u008a\u0005B8\u0092,îL¨j¸\u0096c\f¡×°vaY.¸³¾\u0014\u009bÙe\u008aF\u0093ø¬cé\u0091\u008699\u0012¶\f\u0097v\u0016\u0086X\u0086z\u00ad~ô3\u001cî\u008e§YÔbÏ·¦úÚ¢è\bsR&\u0097? IËè\u0001K;<,Ð¤ÏpÇÊííaÿ|\u000e6jè§\u001cðúpþR½-vîT\u0000\u008d%Â4â?\u0084Þã k\u008cØ\u0081´S\u0010\u0096Jû\u0000ÊÙ\u000ftëN´äÅpZfÔ+\u0002qFwBA\u0014 \fu\f¾Ù²\\÷\u0002¤,aÃ\u008bO,Õ´¥°3Y\u0011^âòeXk ¨¸ \u008e\u000f¥±\u0014ì«Â\u0019«Öf\u0012?¥@Ê\u0089\u0015Á{òP{ËGô¤\u008c©u[(Óþ'Jc\\Ä¶\u001cµ\u0082üß\u0089ÏÌØ®kIF'i{§\"¡\u0084z\u001fÔA÷\u008a\u0006\u009a×¬Û¨ µ²»\u0013\u0083§{h KOþ\u0091É<Ù$\u0011pfû\u0095Öÿ7òL¡õ\u00132A(·Â$\u001dÅo^\u008caLò4åt·W(þ\u0096ô°\u000e-Ó¶S\u009e6\u0011\u0011$P¥]'»XÔ¦ë \u0010E±`0-h\u0092of0æù1&÷é\u0000Q\u0004»2\u008bH<ÍôI:ÄÞ\u000bx|W®Èza¦&\u001e\r\u0001±'\n\u007fºãwù\u009aµÒ\u0011Uâh¦òµ\u0014\u000eF=Ù\u00adðtjZò©5\u0012\u00837\u009e\u0097:p\u0085$t\u0003\b¥â¶\u0098Õé\u008eíßè\u0081[¶\u0003â\u0017Õâ×\\ØÌ£sÐ\u009e &ÇxÝ5È\u0004l@fr\u009d»°äf\u0086\u009eRå»Cêù&!¢é-Ç\u009b§ç³ktÖ\u001dZ\u0090eÛ+À\u0018p\u0017g\u0099\u0018\u0017f<\u0011Q\b¨M'ê¾ü\u0087\u0088J\u0015\u00ad\u0001¸a\u0007©ú¥\u001a\u000e\u0017ñ|^|\u001cH\u008eSý\u0014\u0002gi)ç°û/\u0006\u001a\u0010\u0011&z\u001f\u009d\u009cÜkòê¡ÁÊÉ\u007f³\u0019kùï¾¸y\u0003²t\u0093q\u0099¿\u009d\b¾Öë\\y3Ù\u007fÑ\u008a|zë\t§xh\u0087\u000bn >Ü\u0085©\u0005È\u001fg \u0080\u0006\u0080¶V\u0005ô\u0080FèÛMÔòìè\u0007@Ò\u009caÿ\u0004H\u0018\u0000\u0003ÍZ$q¡5*G\u001b\u001d\u0015wª%-Bvª¤WÃ\u0005(.\u009fÓ\u0097\r\u0019}\u0098\u001aU¡\u00155@¥Y\u0018\u0019hÇ¿Çð¼Mß\"·þq§«Ñ§\u0090\u009fÔ÷åö\u0088\u009e¹vÐï47¢D\u00005>²Gz9\u0013+åqnÝ¼kõH2(\u008a\u00ad>tÿ\u009cWÇ\u00101\u0004\u0003²1ª\f~\u001fgj}vÚñb{\u0087\u001aö9§åc¶òm\u000bóËñl\u0091§\u001d\u0087·B\u001b\u001f\u009f\u001dd\rB\u001aé\u0091òñ×ïµY\u0086\u00193»¿\u0089V;\f\\iö3\u007fðÃ`\u0095^r\u009d¤\u009f_Ì\u00adS{\u0012¥7\f(\f\u0096N(\u0006û?¨ÊôÈ\u009c ¼Ì\\±¬$¯'ùË«\u0095õÌ*åY\u008aZ?¬:a£À\u00adÄ©\u001elÃ10\"¬\u0098\u0081\u0012)PîS\u001b`õt\u001dð¡\u001fÎ§>d\u0084\u009a'q2AhZ\u0089\u0092nZ8A\ntT\u0006CÍeY\u0089ò!Ö\u0080";
        int length = "\u0096Å)§¶ËÏï\u008c\u0081Ýv¶m15\u0097Dûñ:^÷¸¥Â¯\u0006\u00979\u0015\f\u0080\u0080¿øRùïÌ£\u00068\u001a¢Ò¬|/ÙöG« l\u001aN4|âXªÓv\u0016÷Sâö¡\u0017]½-ó4Y¾2ó\u009eý\u0005´\u001eÄÃ%OèÐ¨²7þ\u0098d.g\u0082\t\"\u0083%©\u009b\u0085\f\u0093áÀ\u000f¤]Y\t`x\u0084\u0019²\u0083Ô¦é¾\u0096ñoôÔ\u001e5\u008e\u0083ª}[ÖîmZò®Ø¦\fÙ\u0012À¹¬X*i§\u000e=o,?(\u0091>#{¬0}E¦'dw\bÔaGôI4Á\u0007r/-L\u0093#¡Ã\u001aO\u0003ô\u0093êí\u0017P+\u0099\u0088ß\u0013\u001d\rñ§ò°yñ\r¾ï\u001bä°]à_\f\u0017\u008e:\u0003\u000eäËÁ\u0017§^¯&iaUó\u009a\u007febFS¥Oiñ\u009e==[\u0082¶G\u0015\u009e*ö\t\u0088\u008cß\u000b(âX\u001f&Ç¡\u008cód«û\u0010R\u0002-¿µÕøÀ\u0018y)¤{}³3\u001eÏ/)àP\u0015?¨þ\u001f¤aà¦¶µÛièÕÈ\u0090\u0019J\u009bÖJ\u001b\fPpXvÑ}\u0011íñ~mxÒü\u0010{÷\u000f 94m¤7\bÍmÞ`_%\u0010À\b\u007fj¢½{.þíÂ¢Å~²ð Y8ö\u0081í\u0015ÔFóîcQ^Ci^U\fýì¸h\u0092Èm?\u0095¯·Ô\u009dí\u00100Gw\u0095Ëî¯\u001e'z|½ú\u0013¼8 \rV¸\u0090Ôþ³&ÊTæ\u0010·¶ß!EàÎýÝ^{ý\u009ctmk¬ \u0087ì\u0018\u009b *\u0019±\u009d\u0011\u008fÎ\u0004G\tt,]Õ\u0015\u0090[\u0090+Ï']\u0018\r\u0017\u0088Ì\u0088þ\u0002G&!ÚÀvå³¶Å\u0016\u009f&\u0001\u001e\u0085¨\u0080ß\u001cR¤hÌIë\u0006\u008a\u0005B8\u0092,îL¨j¸\u0096c\f¡×°vaY.¸³¾\u0014\u009bÙe\u008aF\u0093ø¬cé\u0091\u008699\u0012¶\f\u0097v\u0016\u0086X\u0086z\u00ad~ô3\u001cî\u008e§YÔbÏ·¦úÚ¢è\bsR&\u0097? IËè\u0001K;<,Ð¤ÏpÇÊííaÿ|\u000e6jè§\u001cðúpþR½-vîT\u0000\u008d%Â4â?\u0084Þã k\u008cØ\u0081´S\u0010\u0096Jû\u0000ÊÙ\u000ftëN´äÅpZfÔ+\u0002qFwBA\u0014 \fu\f¾Ù²\\÷\u0002¤,aÃ\u008bO,Õ´¥°3Y\u0011^âòeXk ¨¸ \u008e\u000f¥±\u0014ì«Â\u0019«Öf\u0012?¥@Ê\u0089\u0015Á{òP{ËGô¤\u008c©u[(Óþ'Jc\\Ä¶\u001cµ\u0082üß\u0089ÏÌØ®kIF'i{§\"¡\u0084z\u001fÔA÷\u008a\u0006\u009a×¬Û¨ µ²»\u0013\u0083§{h KOþ\u0091É<Ù$\u0011pfû\u0095Öÿ7òL¡õ\u00132A(·Â$\u001dÅo^\u008caLò4åt·W(þ\u0096ô°\u000e-Ó¶S\u009e6\u0011\u0011$P¥]'»XÔ¦ë \u0010E±`0-h\u0092of0æù1&÷é\u0000Q\u0004»2\u008bH<ÍôI:ÄÞ\u000bx|W®Èza¦&\u001e\r\u0001±'\n\u007fºãwù\u009aµÒ\u0011Uâh¦òµ\u0014\u000eF=Ù\u00adðtjZò©5\u0012\u00837\u009e\u0097:p\u0085$t\u0003\b¥â¶\u0098Õé\u008eíßè\u0081[¶\u0003â\u0017Õâ×\\ØÌ£sÐ\u009e &ÇxÝ5È\u0004l@fr\u009d»°äf\u0086\u009eRå»Cêù&!¢é-Ç\u009b§ç³ktÖ\u001dZ\u0090eÛ+À\u0018p\u0017g\u0099\u0018\u0017f<\u0011Q\b¨M'ê¾ü\u0087\u0088J\u0015\u00ad\u0001¸a\u0007©ú¥\u001a\u000e\u0017ñ|^|\u001cH\u008eSý\u0014\u0002gi)ç°û/\u0006\u001a\u0010\u0011&z\u001f\u009d\u009cÜkòê¡ÁÊÉ\u007f³\u0019kùï¾¸y\u0003²t\u0093q\u0099¿\u009d\b¾Öë\\y3Ù\u007fÑ\u008a|zë\t§xh\u0087\u000bn >Ü\u0085©\u0005È\u001fg \u0080\u0006\u0080¶V\u0005ô\u0080FèÛMÔòìè\u0007@Ò\u009caÿ\u0004H\u0018\u0000\u0003ÍZ$q¡5*G\u001b\u001d\u0015wª%-Bvª¤WÃ\u0005(.\u009fÓ\u0097\r\u0019}\u0098\u001aU¡\u00155@¥Y\u0018\u0019hÇ¿Çð¼Mß\"·þq§«Ñ§\u0090\u009fÔ÷åö\u0088\u009e¹vÐï47¢D\u00005>²Gz9\u0013+åqnÝ¼kõH2(\u008a\u00ad>tÿ\u009cWÇ\u00101\u0004\u0003²1ª\f~\u001fgj}vÚñb{\u0087\u001aö9§åc¶òm\u000bóËñl\u0091§\u001d\u0087·B\u001b\u001f\u009f\u001dd\rB\u001aé\u0091òñ×ïµY\u0086\u00193»¿\u0089V;\f\\iö3\u007fðÃ`\u0095^r\u009d¤\u009f_Ì\u00adS{\u0012¥7\f(\f\u0096N(\u0006û?¨ÊôÈ\u009c ¼Ì\\±¬$¯'ùË«\u0095õÌ*åY\u008aZ?¬:a£À\u00adÄ©\u001elÃ10\"¬\u0098\u0081\u0012)PîS\u001b`õt\u001dð¡\u001fÎ§>d\u0084\u009a'q2AhZ\u0089\u0092nZ8A\ntT\u0006CÍeY\u0089ò!Ö\u0080".length();
        char cCharAt = ' ';
        int i8 = -1;
        while (true) {
            int i9 = i8 + 1;
            String strSubstring = str.substring(i9, i9 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i10 = i7;
                        i7++;
                        strArr[i10] = strIntern;
                        int i11 = i9 + cCharAt;
                        i2 = i11;
                        if (i11 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            d = strArr;
                            g = new String[28];
                            k = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i12 = 1; i12 < 8; i12++) {
                                bArr2[i12] = (byte) ((j2 << (i12 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[7];
                            int i13 = 0;
                            String str3 = "ÞZ`\u0083\u008d\u00054Ë\u0099´ö\u0089\u0097O\u000bZºî1êõí}\u0090\u0099\u008ek\u0019Hîìk\"ñÔ\u0002F\u009cH¤";
                            int length2 = "ÞZ`\u0083\u008d\u00054Ë\u0099´ö\u0089\u0097O\u000bZºî1êõí}\u0090\u0099\u008ek\u0019Hîìk\"ñÔ\u0002F\u009cH¤".length();
                            int i14 = 0;
                            while (true) {
                                int i15 = i14;
                                i14 += 8;
                                byte[] bytes = str3.substring(i15, i14).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i16 = i13;
                                i13++;
                                long j8 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j9 = j8;
                                    int i17 = i16;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j9 >>> 56), (byte) (j9 >>> 48), (byte) (j9 >>> 40), (byte) (j9 >>> 32), (byte) (j9 >>> 24), (byte) (j9 >>> 16), (byte) (j9 >>> 8), (byte) j9});
                                    long j10 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i17) {
                                        case 0:
                                            jArr2[b5] = j10;
                                            if (i14 >= length2) {
                                                i = jArr;
                                                j = new Integer[7];
                                                K = new KProperty[]{Reflection.property1(new PropertyReference1Impl(qs.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32034, 3029590310221974276L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27998, 1763011255520435055L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(qs.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31108, 8477889183330865082L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21640, 7422418125278028463L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(qs.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16854, 6330566198771693536L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21388, 4678867509360436648L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(qs.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21024, 712339178208797704L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(772, 3709025842028016939L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(qs.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5060, 6363276578105714167L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18804, 1447444108232048456L ^ j2) /* invoke-custom */, 0))};
                                                c = new qs(j6);
                                                Y = yp.L(c, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31138, 8556261362865246105L ^ j2) /* invoke-custom */, 0, new IntRange(0, (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20424, 5509977257518886788L ^ j2) /* invoke-custom */), j3, null, null, (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2808, 5038127880651713202L ^ j2) /* invoke-custom */, null);
                                                b = yp.J(c, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32755, 6333305414388779460L ^ j2) /* invoke-custom */, new lj(0, false, j5, false, (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12596, 3654047612055589242L ^ j2) /* invoke-custom */, null), null, i3, null, i4, (char) i5, (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5384, 6569239621335004483L ^ j2) /* invoke-custom */, null);
                                                W = yp.t(c, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2875, 8011270594447179029L ^ j2) /* invoke-custom */, false, j4, null, null, (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9952, 5663623092350977704L ^ j2) /* invoke-custom */, null);
                                                e = yp.t(c, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16655, 5661003733000927012L ^ j2) /* invoke-custom */, false, j4, null, null, (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9952, 5663623092350977704L ^ j2) /* invoke-custom */, null);
                                                I = yp.t(c, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26597, 2198437436257505757L ^ j2) /* invoke-custom */, false, j4, null, null, (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9952, 5663623092350977704L ^ j2) /* invoke-custom */, null);
                                                class_243 class_243Var = class_243.field_1353;
                                                Intrinsics.checkNotNullExpressionValue(class_243Var, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6247, 343464282638839389L ^ j2) /* invoke-custom */);
                                                G = class_243Var;
                                                f = new bg();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j10;
                                            if (i14 >= length2) {
                                                str3 = "[N¯ÁsTw\u0002=7}W\u0019_äÝ";
                                                length2 = "[N¯ÁsTw\u0002=7}W\u0019_äÝ".length();
                                                i14 = 0;
                                            }
                                            break;
                                    }
                                    int i18 = i14;
                                    i14 += 8;
                                    byte[] bytes2 = str3.substring(i18, i14).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i16 = i13;
                                    i13++;
                                    j8 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i19 = i7;
                        i7++;
                        strArr[i19] = strIntern;
                        int i20 = i9 + cCharAt;
                        i8 = i20;
                        if (i20 < length) {
                        }
                        str = "ÿ¨g\b\u00806SO\"õöò\u0007µTð·AUÙ=Êê¦¶#Ü|ü»\b\u0000§\u0006ÿã6Ì\u009d{\u0090y6p\rÛª÷\u000b\u001ad[¼îó8ºM\u001a\u0005\u0093f\u0099ÊUàX({Þ§ÄÉ_¡ç\u009e>3,\u0012\u0006\u0019^¿\u0082\u0016¬ËI\u0093 yÕYÉ\u001f\u008fá×W&\u008f-ëêyBw\n×ðÐß¥ÛÎõgú\u0089æm±\u0080\u0002Vê[ª¢*KnäÔ\u009c'\u001a\u001fi\u0003\u009c¿\u001cEø\u009dz\u0004¸ä\u001cNP¶*ü\u009f\u0005O\u0011Ë¹\u0081\\\u0098\u0097\u000fÞ,Ëe²U\u008aÐh\u0003\u0014ÜH\u007f\u001d*";
                        length = "ÿ¨g\b\u00806SO\"õöò\u0007µTð·AUÙ=Êê¦¶#Ü|ü»\b\u0000§\u0006ÿã6Ì\u009d{\u0090y6p\rÛª÷\u000b\u001ad[¼îó8ºM\u001a\u0005\u0093f\u0099ÊUàX({Þ§ÄÉ_¡ç\u009e>3,\u0012\u0006\u0019^¿\u0082\u0016¬ËI\u0093 yÕYÉ\u001f\u008fá×W&\u008f-ëêyBw\n×ðÐß¥ÛÎõgú\u0089æm±\u0080\u0002Vê[ª¢*KnäÔ\u009c'\u001a\u001fi\u0003\u009c¿\u001cEø\u009dz\u0004¸ä\u001cNP¶*ü\u009f\u0005O\u0011Ë¹\u0081\\\u0098\u0097\u000fÞ,Ëe²U\u008aÐh\u0003\u0014ÜH\u007f\u001d*".length();
                        cCharAt = '(';
                        i2 = -1;
                        break;
                        break;
                }
                i9 = i2 + 1;
                strSubstring = str.substring(i9, i9 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i8);
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 8553;
        if (g[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) h.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                g[i3] = b(((Cipher) objArr[0]).doFinal(d[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/qs", e2);
            }
        }
        return g[i3];
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
            java.lang.String r1 = "su/catlean/qs"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qs.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 30493;
        if (j[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) i[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) k.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/qs", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            j[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return j[i3].intValue();
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
            java.lang.String r1 = "su/catlean/qs"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qs.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
