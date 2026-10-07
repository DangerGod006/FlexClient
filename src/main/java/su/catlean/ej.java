package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import net.minecraft.class_2596;
import net.minecraft.class_7439;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ej.class */
public final class ej extends _g {

    @NotNull
    public static final ej J;
    static final KProperty[] U;

    @NotNull
    private static final cw N;

    @NotNull
    private static final cw l;

    @NotNull
    private static final List b;

    @Nullable
    private static String E;
    private static final long a = yz.a(-5716957839514280275L, -8665533439793339563L, MethodHandles.lookup().lookupClass()).a(3944602796895L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    /* JADX WARN: Illegal instructions before constructor call */
    private ej(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22704, 7761574415243546944L ^ j2) /* invoke-custom */, jt.d(), null, 4, null, j2 ^ 54963272011131L);
    }

    private final iy x(long j, byte b2) {
        return (iy) N.E(this, (((j << 8) | ((((long) b2) << 56) >>> 56)) ^ a) ^ 135443388922298L, U[0]);
    }

    private final iy A(long j) {
        return (iy) l.E(this, (a ^ j) ^ 126286683148359L, U[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    @Flow
    private final void Q(ReceivePacket receivePacket) throws Throwable {
        long j = a ^ 505013318661L;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5469560587963060629L, j) /* invoke-custom */;
        try {
            try {
                class_2596<?> packet = receivePacket.getPacket();
                if (obj == 0) {
                    obj = packet instanceof class_7439;
                    if (obj == 0) {
                        return;
                    }
                    packet = receivePacket.getPacket();
                    Intrinsics.checkNotNull(packet, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20328, 4924315859089894950L ^ j) /* invoke-custom */);
                }
                String string = ((class_7439) packet).comp_763().getString();
                Intrinsics.checkNotNullExpressionValue(string, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20152, 6719496608427519971L ^ j) /* invoke-custom */);
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    if (StringsKt.contains$default((CharSequence) string, (CharSequence) it.next(), false, 2, (Object) null)) {
                        return;
                    }
                }
                bo.S.Y().execute(new xk(0, string));
            } catch (NumberFormatException unused) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5412349820757972669L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5412349820757972669L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:26:0x009c
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void m(su.catlean.api.event.events.network.SendPacket r9) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ej.m(su.catlean.api.event.events.network.SendPacket):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final java.lang.String n(java.lang.String r12, java.lang.String r13, long r14) throws java.io.UnsupportedEncodingException, java.net.MalformedURLException {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ej.n(java.lang.String, java.lang.String, long):java.lang.String");
    }

    public static final String h(ej $this, String text, String to, long a2) {
        return $this.n(text, to, (a ^ a2) ^ 65248979189681L);
    }

    public static final iy V(long a2, ej $this) {
        return $this.x((a ^ a2) >>> 8, (byte) (((r0 ^ 62353821098894L) << 56) >>> 56));
    }

    public static final iy D(ej $this, long a2) {
        return $this.A((a ^ a2) ^ 6697129224600L);
    }

    public static final void q(String str) {
        E = str;
    }

    static {
        int i;
        long j = a ^ 70474523897252L;
        long j2 = j ^ 88858436562950L;
        long j3 = j ^ 18474740158669L;
        e = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[23];
        int i3 = 0;
        String str = "r,L|\u009e;_¸\\E\u000e}Ùæ5{N¨ª`W\u009faË\u0001eqË\u0007ú\r\u009eE\u001aP±³9\u0081jCÉ\u0098 ú/\u0001ü\u008b\u0081\u001f\bMk\u001fS(NÁ:0DÜ/\u0005\\3\u00110\u009bìhç!±Êæ\u0094ÀS\u0097t\u00adAÃzç\u001d®\u0080jÔuÕ\u0093\u0092ù(6£VÀvH\u000f«Â:\táÜ%½ >¯\u00ad°1Ü\u001e\u0016\u0097:E@\u00ad\u009a\u001a\u000e\u0099uÄ7§H\u000eø\u0018/\u0012Ê\u008d\u0088 \u000f\u0097G\u001d\nä=L\\3\u008f¶\u0011\u0086Ö*¨õ(ä\u009fÅïåå#Å:fí\u0095%V,\u0083X¢á\u0099\u0095Ô6¼LXv\fó¤¤¤Ï\u00adÖØ%zôÍ0î*ÿ~¸vARð$\u0017:-Ø¬\"\u0003¼ªC±'ó~ÀR\u0010}|\u0013ôV6\u0017¡\u001cENaOý  H\u009a\u001fÇE \u009el\u009aC¢\u0013ÕÜ,ù\u0084ß\"èæv\u0012;f\u0083\u0091\u0015\u0081~\u009fûàø+A°Æ\u0098\u009c\u0093:\u0001y\u0002\f\u0010µ¯û\fÕ1*1Ký{Î=\u0014P\b»N48\u0095¯¦\u009fæâÜd!*üpT\u0089;4¿âñ\u0010A1&ðÀ¦\u009f\u0015Ù\u008a´ÓWBÓ¯Ú`\u001eè=\u009bå^¡\u008eô5Ç\u001d\u0090\u0087Í/\u0000è\u008e\f\u0003`Và\u0015]\u0006ð+>Ó\u0099\u009br\"\u009e+ª\tHp7\u001aÿÉKM\u000bßB>Xéêë\u009f\\ïìâÄ\u009e\u009a §+\u008c7\u009f´µ«'C\u009d\u0010YHî\u00816¤\u009e)²n\u00184;ºkÛ\u0080\u0092ÀÜ\u0090Å¢:v\u0086\"\u0093QtúM\u0005c] bW\f'9:ÍéV\u001cãôwvÕb¸j\\ñ\u0000\u0005\u0007Ðvë\teåèrÄ(NSû\u0011\bñYz\u009dÂ/]á\u0012\u009b²01co_\u008b¿R\u0006`Ä\u0096ú¥Î\f\u0091?\u007fkÑÌ*ã åÊté¸TDô\u008bÝf,(\u0097ý\u009cvCy!$|\u0005F&h\u0092\u001e\u0082Õ\u001fÌ\u0090\u0098;ê\u001a²býe\u0094?z@Þ¤PJ\u0091\u0087xfþ\u008bwD\u009agC¯v^\u009bÿ\u000fÝ]1]ü¡²\u008dLÅ,\u008c\u009dèÿ\u0015øÂzmÕÛ\u0092\n$·\u009a³F\n5mt\u0085\u001bªõÉ\u0019~òïk;òxVÅµs\u0081Ì.DËïgéÞ¶N\u0084\\³Q\u0097´dæ,wÙa\u008a\u0006û¹\u0004ê\u0091ú\u0005wL\u00002`»\u0093\u0098F\bC4h\u008e£$=DÐËü\u001f`{\u0019g\u0094â«\u0010yÍhËË\u0096Ç\u0002\u0096\u001aVì\u009a¸ÕÓ@ûz\u0099`ß¨p\u0080Î|«O\u0018$I\u00826«,\u0005\u0007¾ÆÕ\u001b\u0002\u0088*-UE&·úøùõ§~ô§\u0005N\u000fåÀ6h\u000b[÷xX±ÛÙt\u0094e0\u0017øX\u0093xêæE·Õ\u0010¢±àm´\u0080¢\u0010à\u0085¯(ã±¶î\bN5Li\u0015\u008f\u0098Dý\u0006¾pö\u0099OF\u0006\u00815ñ»|NÁgô\u0011\u001d\u0015?\u0013Y·vxs7NP\r\u0099Þ'ò\u0092\u0011ãZußÿ\u001b\u0003\u0094\u0082Ã@m\u0092ZÐ\u0080Õ¨ê\u0017\u001döã\u001e\u009f/à¡Ïe\u0001@i\u0084\u008c\u008baÎ´B²\u00041û¬L^ëþÌc\u0088sq\u009d/\u001cWµ\u0081ºp´\u0095°¬Ø\u0000\u0084ªµ\u0015øçåFÈ×,\u0012ä\u0012;9Úb?I\u0087{á\u001b#í\u0000g\u0000!`÷m?ÿVú}·«\u00131cq\u0092+\u001aØ&O\u000f×½ (ñ[ÙO_3j;$o¶\u0095_ls\u008d÷Ìïw\u0010ÉÕíß6#Q£\u008e\u001cû\u0017÷Ò\u0093q«Þ_,,§ð®É\u0098s/Laº~\u0084\u0002×Q\u0090Yn\u001bú°Òj\u0018=\u001b<Ò8§ðp7¸½\u008c£IôúëÒ¸±\u000f\u00ad³\u0099\u0018\u0094\u0017i«Ó\u0016ÏUãÀÞ ü\u0081\u009d\u0017[\u0085ë8À«çù 6\u001eJq\b\u0099.ù\u0098ø\u001b\u0081\u0090¾\u008bí¡C¹Á\u0080¦\u008fã\u0089b\u0081l-à\u0007\u0016 \u001dgf\nAï¯+Uêþÿ'±mE\u008fd)½¥|dH`R¬`\u008758æ";
        int length = "r,L|\u009e;_¸\\E\u000e}Ùæ5{N¨ª`W\u009faË\u0001eqË\u0007ú\r\u009eE\u001aP±³9\u0081jCÉ\u0098 ú/\u0001ü\u008b\u0081\u001f\bMk\u001fS(NÁ:0DÜ/\u0005\\3\u00110\u009bìhç!±Êæ\u0094ÀS\u0097t\u00adAÃzç\u001d®\u0080jÔuÕ\u0093\u0092ù(6£VÀvH\u000f«Â:\táÜ%½ >¯\u00ad°1Ü\u001e\u0016\u0097:E@\u00ad\u009a\u001a\u000e\u0099uÄ7§H\u000eø\u0018/\u0012Ê\u008d\u0088 \u000f\u0097G\u001d\nä=L\\3\u008f¶\u0011\u0086Ö*¨õ(ä\u009fÅïåå#Å:fí\u0095%V,\u0083X¢á\u0099\u0095Ô6¼LXv\fó¤¤¤Ï\u00adÖØ%zôÍ0î*ÿ~¸vARð$\u0017:-Ø¬\"\u0003¼ªC±'ó~ÀR\u0010}|\u0013ôV6\u0017¡\u001cENaOý  H\u009a\u001fÇE \u009el\u009aC¢\u0013ÕÜ,ù\u0084ß\"èæv\u0012;f\u0083\u0091\u0015\u0081~\u009fûàø+A°Æ\u0098\u009c\u0093:\u0001y\u0002\f\u0010µ¯û\fÕ1*1Ký{Î=\u0014P\b»N48\u0095¯¦\u009fæâÜd!*üpT\u0089;4¿âñ\u0010A1&ðÀ¦\u009f\u0015Ù\u008a´ÓWBÓ¯Ú`\u001eè=\u009bå^¡\u008eô5Ç\u001d\u0090\u0087Í/\u0000è\u008e\f\u0003`Và\u0015]\u0006ð+>Ó\u0099\u009br\"\u009e+ª\tHp7\u001aÿÉKM\u000bßB>Xéêë\u009f\\ïìâÄ\u009e\u009a §+\u008c7\u009f´µ«'C\u009d\u0010YHî\u00816¤\u009e)²n\u00184;ºkÛ\u0080\u0092ÀÜ\u0090Å¢:v\u0086\"\u0093QtúM\u0005c] bW\f'9:ÍéV\u001cãôwvÕb¸j\\ñ\u0000\u0005\u0007Ðvë\teåèrÄ(NSû\u0011\bñYz\u009dÂ/]á\u0012\u009b²01co_\u008b¿R\u0006`Ä\u0096ú¥Î\f\u0091?\u007fkÑÌ*ã åÊté¸TDô\u008bÝf,(\u0097ý\u009cvCy!$|\u0005F&h\u0092\u001e\u0082Õ\u001fÌ\u0090\u0098;ê\u001a²býe\u0094?z@Þ¤PJ\u0091\u0087xfþ\u008bwD\u009agC¯v^\u009bÿ\u000fÝ]1]ü¡²\u008dLÅ,\u008c\u009dèÿ\u0015øÂzmÕÛ\u0092\n$·\u009a³F\n5mt\u0085\u001bªõÉ\u0019~òïk;òxVÅµs\u0081Ì.DËïgéÞ¶N\u0084\\³Q\u0097´dæ,wÙa\u008a\u0006û¹\u0004ê\u0091ú\u0005wL\u00002`»\u0093\u0098F\bC4h\u008e£$=DÐËü\u001f`{\u0019g\u0094â«\u0010yÍhËË\u0096Ç\u0002\u0096\u001aVì\u009a¸ÕÓ@ûz\u0099`ß¨p\u0080Î|«O\u0018$I\u00826«,\u0005\u0007¾ÆÕ\u001b\u0002\u0088*-UE&·úøùõ§~ô§\u0005N\u000fåÀ6h\u000b[÷xX±ÛÙt\u0094e0\u0017øX\u0093xêæE·Õ\u0010¢±àm´\u0080¢\u0010à\u0085¯(ã±¶î\bN5Li\u0015\u008f\u0098Dý\u0006¾pö\u0099OF\u0006\u00815ñ»|NÁgô\u0011\u001d\u0015?\u0013Y·vxs7NP\r\u0099Þ'ò\u0092\u0011ãZußÿ\u001b\u0003\u0094\u0082Ã@m\u0092ZÐ\u0080Õ¨ê\u0017\u001döã\u001e\u009f/à¡Ïe\u0001@i\u0084\u008c\u008baÎ´B²\u00041û¬L^ëþÌc\u0088sq\u009d/\u001cWµ\u0081ºp´\u0095°¬Ø\u0000\u0084ªµ\u0015øçåFÈ×,\u0012ä\u0012;9Úb?I\u0087{á\u001b#í\u0000g\u0000!`÷m?ÿVú}·«\u00131cq\u0092+\u001aØ&O\u000f×½ (ñ[ÙO_3j;$o¶\u0095_ls\u008d÷Ìïw\u0010ÉÕíß6#Q£\u008e\u001cû\u0017÷Ò\u0093q«Þ_,,§ð®É\u0098s/Laº~\u0084\u0002×Q\u0090Yn\u001bú°Òj\u0018=\u001b<Ò8§ðp7¸½\u008c£IôúëÒ¸±\u000f\u00ad³\u0099\u0018\u0094\u0017i«Ó\u0016ÏUãÀÞ ü\u0081\u009d\u0017[\u0085ë8À«çù 6\u001eJq\b\u0099.ù\u0098ø\u001b\u0081\u0090¾\u008bí¡C¹Á\u0080¦\u008fã\u0089b\u0081l-à\u0007\u0016 \u001dgf\nAï¯+Uêþÿ'±mE\u008fd)½¥|dH`R¬`\u008758æ".length();
        char cCharAt = '8';
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
                            c = strArr;
                            d = new String[23];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[4];
                            int i9 = 0;
                            String str3 = "®\u0089\u008a\r«È9C\u0004Æ\u0086ÿãuJz";
                            int length2 = "®\u0089\u008a\r«È9C\u0004Æ\u0086ÿãuJz".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j4 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j5 = j4;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j5 >>> 56), (byte) (j5 >>> 48), (byte) (j5 >>> 40), (byte) (j5 >>> 32), (byte) (j5 >>> 24), (byte) (j5 >>> 16), (byte) (j5 >>> 8), (byte) j5});
                                    long j6 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b5] = j6;
                                            if (i10 >= length2) {
                                                f = jArr;
                                                g = new Integer[4];
                                                U = new KProperty[]{Reflection.property1(new PropertyReference1Impl(ej.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10270, 4116761643880943867L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22310, 3786241644437860318L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(ej.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28448, 1275022043201820635L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20301, 4605426961649301413L ^ j) /* invoke-custom */, 0))};
                                                J = new ej(j2);
                                                N = yp.L(J, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5507, 7488203809223912813L ^ j) /* invoke-custom */, iy.RU, null, null, (int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4382, 4204985988613975907L ^ j) /* invoke-custom */, null, j3);
                                                l = yp.L(J, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29136, 4086540099102230835L ^ j) /* invoke-custom */, iy.UK, null, null, (int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27412, 2067205128557155690L ^ j) /* invoke-custom */, null, j3);
                                                b = CollectionsKt.listOf((Object[]) new String[]{(String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3513, 9220552637092607321L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11967, 4546184293813818966L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13500, 4480665704925760606L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9530, 320696465871838679L ^ j) /* invoke-custom */});
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j6;
                                            if (i10 >= length2) {
                                                str3 = "\u000e¤ýuR\u00944\u008cñàc!ÝÖ\u0000Å";
                                                length2 = "\u000e¤ýuR\u00944\u008cñàc!ÝÖ\u0000Å".length();
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
                                    j4 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "\u009d\u008b³P@j¬ÕÄ2+2µ\u0007B\u0002\u0010\u001ck\u0007«Öi\u0086EF\u0086ÊOh@\n\u0005";
                        length = "\u009d\u008b³P@j¬ÕÄ2+2µ\u0007B\u0002\u0010\u001ck\u0007«Öi\u0086EF\u0086ÊOh@\n\u0005".length();
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

    private static Throwable a(Throwable th) {
        return th;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 21571;
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
                throw new RuntimeException("su/catlean/ej", e2);
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
            r1 = -1
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
            java.lang.String r1 = "su/catlean/ej"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ej.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 21207;
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
                    throw new RuntimeException("su/catlean/ej", e2);
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
            r1 = -1
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
            java.lang.String r1 = "su/catlean/ej"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ej.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
