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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/__.class */
public final class __ extends _g {

    @NotNull
    public static final __ i;
    static final /* synthetic */ KProperty[] Y;

    @NotNull
    private static final cq a;

    @NotNull
    private static final cq N;

    @NotNull
    private static final cq y;

    @NotNull
    private static final cq t;

    @NotNull
    private static final cq z;

    @NotNull
    private static final cq G;

    @NotNull
    private static final cq X;

    @NotNull
    private static final cq h;

    @NotNull
    private static final cq b;

    @NotNull
    private static final cq A;
    private static final long c = yz.a(6327424761388380338L, 1684494716744056318L, MethodHandles.lookup().lookupClass()).a(183769510647313L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] j;
    private static final Map k;

    /* JADX WARN: Illegal instructions before constructor call */
    private __(long j2) {
        long j3 = c ^ j2;
        super((String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2453, 5601344132229111497L ^ j3) /* invoke-custom */, jt.c(), null, 4, null, j3 ^ 110347829027516L);
    }

    private final boolean Q(long j2) {
        return ((Boolean) a.E(this, (c ^ j2) ^ 39511138051191L, Y[0])).booleanValue();
    }

    private final boolean E(long j2) {
        return ((Boolean) N.E(this, (c ^ j2) ^ 107483987635768L, Y[1])).booleanValue();
    }

    private final boolean L(int i2, int i3, char c2) {
        return ((Boolean) y.E(this, ((((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ c) ^ 126644378586627L, Y[2])).booleanValue();
    }

    private final boolean G(long j2, short s) {
        return ((Boolean) t.E(this, (((j2 << 16) | ((((long) s) << 48) >>> 48)) ^ c) ^ 79870953703070L, Y[3])).booleanValue();
    }

    private final boolean T(short s, long j2) {
        return ((Boolean) z.E(this, (((((long) s) << 48) | ((j2 << 16) >>> 16)) ^ c) ^ 120972228719671L, Y[4])).booleanValue();
    }

    private final boolean i(long j2) {
        return ((Boolean) G.E(this, (c ^ j2) ^ 1028165787345L, Y[5])).booleanValue();
    }

    private final boolean e(long j2) {
        long j3 = c ^ j2;
        return ((Boolean) X.E(this, j3 ^ 6621506911152L, Y[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21757, 2541630477592388482L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean g(long j2, char c2) {
        long j3 = ((j2 << 16) | ((((long) c2) << 48) >>> 48)) ^ c;
        return ((Boolean) h.E(this, j3 ^ 103699251800336L, Y[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5732, 4355048725796991929L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean l(long j2) {
        long j3 = c ^ j2;
        return ((Boolean) b.E(this, j3 ^ 132926243452102L, Y[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16314, 671940653486147506L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean j(long j2) {
        long j3 = c ^ j2;
        return ((Boolean) A.E(this, j3 ^ 68061875948288L, Y[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6695, 5191091075072548335L ^ j3) /* invoke-custom */])).booleanValue();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:224:0x04e0
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void a(su.catlean.api.event.events.player.CollisionEvent r11) {
        /*
            Method dump skipped, instruction units count: 1520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.__.a(su.catlean.api.event.events.player.CollisionEvent):void");
    }

    static {
        int i2;
        long j2 = c ^ 5687310803547L;
        long j3 = j2 ^ 31708673572040L;
        long j4 = j2 ^ 70665100398654L;
        f = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[32];
        int i4 = 0;
        String str = "\u008b\u000fmüÄ\u009d&éÆ²P$Q\u000b`/^\u0015\u0086P /\u0017,yµ¤ ñ\u009c\u0017Mv/\u0096h\u0006«\u0015M\u0010©\u0092B\u0087¬\u0094\u0014²»û ð\u001bM\u0091ñ(ËXn¼\u009bD\u0084\u0018ÃåqRÑyÃ4\u0089?ë4ý\u0002ðH\u0017í\u0014ßoÂ/\u009f\u0004\t\u0016\u008d\b\r\u0014º\u0010\u0001!b´÷o\u0001ÝãV\u0095²\u008b\u0083ä\u0006 h\u0018Î´ \u0001¸Ê\u001f\u001bá{%\u00841\u0015Ãâ\\;!ó\u009aèP3ò\u0091D§<\u0082\u0010¤ÿBª«\u008ecN\u009e1_3\fü\u0084M\u0010ù\u0087\u0094+¤Â£¿\u0002ù\u0096\u000e\u0096u\u00142 ¢\u0018\n;U#&I8Ä÷\u000b\u001d¯\u0005\u0088Níëº¸¨\u0015uòW\u0091RjÀ0b \u0005ÜT¬À\u0007´y@\u0096ú\u001a¶Î¬5Ê?z\u008eçÇð&\u0000x\u0088\u0098XA~\u008a ^Í\u0004\u0091½ÐE'\u009bêF\u0014\u0014\u001e¿nüK\u0085àÞëÀíQ6¯\u001c5^\u0001+\u0010;\u0097\u009b\u0080Ùã¿^gÿ\u0097Ý´]\u0094\u0096 CPÐð¦\u001døCç\u0011\t\u00864q\u0014w\u0092\u0089w©\u0002$Á±í ;º\u00976ºT\u0010ä\u001d\u0016Õ\u009co\\Î\u009f\u0000}L\u0002ënè\u0010»ÞÒ+¤þÞ\t3õ\u009f\u0082L3/S \u0005l*â¥3\u001a\u009a8Åå¸Ò÷Ñ[if\u008e\u0018u\u0014^)ÊÂhidwàF\u0018û§\u0092\t\nh,¯G\u000b\u0096\u0086\u00adFû|ê\u009fèñ¬©\u001bØ(Ã\u0001·@©Ns\u0005-ä >ÐP\u0097\u0005»õJÄÜ`lv}ä-ÌS\u0010yË¢A\u0000¡f·\u0006\u001c\u0018¨?ýçþV!Þ\u0092Ô\u001b\u0099÷õ\u001aFÐjiòâ:·¶\u0010\u0080\u008a\u0086ã\u001f\u007f)O\u001aØ×&ÛùÅÕ(\u0092\u000fg#Ã\r*Ì-\u0091K¸X¬Ë\u007fé'\b:}´ü\bjö½>*a&×\u008dÝÀ\tµÌYñ\u0018»|÷Äô\u009a\u0087jl\"L\u0081Ø~+¸\u008f#¢\u001d\u009b\u0002\u0092©\u0010¹+\u000e\u0083t\u0081Ô+Âèq=\u008c.¦Y ¾z\u0093Wt\u0081ãlZ³\u0087g\u009fØ\"a\u0091,\u00857¦\u0013ÈÎæ\u0017[pvh\u009c^ ç4*?`!«ßm}\u0086=\u0080\u0092±o+/¯\u0002ÙG²²]\u000eñà\u0093KZ\u008a Qk\u0082Kù*Pyy\u0081\u0000\u0099å\u000b©¦\u0012z¹oÀÿ#\u0014\u0098\u009cÚª£YÌl\u0010\u0098b¬¤q\\v\u0093-üÚñíVú3\u0018×\u0007\u001e_\u0006ØE\u00147á\u0083\u0000à*\u001aÃÉ\u0085ö~(«âv VÉ«ö°6u¯C\u0081;7Àòåé\u009e2Ez^`\u0087!¬p#_\fkbß \u00adE~´0\u008eõ\u009et\u0087yç7ÕÞ\u00926\u0097\\9¡Ï~\u0095/¶9\u000e¢¾àâ Htÿ;\u001a#¤Ø\u0097`ð64jYj1\u001b\u0093D\u0091\u0086\"ù\u008c\u001aXÄ¢vð'";
        int length = "\u008b\u000fmüÄ\u009d&éÆ²P$Q\u000b`/^\u0015\u0086P /\u0017,yµ¤ ñ\u009c\u0017Mv/\u0096h\u0006«\u0015M\u0010©\u0092B\u0087¬\u0094\u0014²»û ð\u001bM\u0091ñ(ËXn¼\u009bD\u0084\u0018ÃåqRÑyÃ4\u0089?ë4ý\u0002ðH\u0017í\u0014ßoÂ/\u009f\u0004\t\u0016\u008d\b\r\u0014º\u0010\u0001!b´÷o\u0001ÝãV\u0095²\u008b\u0083ä\u0006 h\u0018Î´ \u0001¸Ê\u001f\u001bá{%\u00841\u0015Ãâ\\;!ó\u009aèP3ò\u0091D§<\u0082\u0010¤ÿBª«\u008ecN\u009e1_3\fü\u0084M\u0010ù\u0087\u0094+¤Â£¿\u0002ù\u0096\u000e\u0096u\u00142 ¢\u0018\n;U#&I8Ä÷\u000b\u001d¯\u0005\u0088Níëº¸¨\u0015uòW\u0091RjÀ0b \u0005ÜT¬À\u0007´y@\u0096ú\u001a¶Î¬5Ê?z\u008eçÇð&\u0000x\u0088\u0098XA~\u008a ^Í\u0004\u0091½ÐE'\u009bêF\u0014\u0014\u001e¿nüK\u0085àÞëÀíQ6¯\u001c5^\u0001+\u0010;\u0097\u009b\u0080Ùã¿^gÿ\u0097Ý´]\u0094\u0096 CPÐð¦\u001døCç\u0011\t\u00864q\u0014w\u0092\u0089w©\u0002$Á±í ;º\u00976ºT\u0010ä\u001d\u0016Õ\u009co\\Î\u009f\u0000}L\u0002ënè\u0010»ÞÒ+¤þÞ\t3õ\u009f\u0082L3/S \u0005l*â¥3\u001a\u009a8Åå¸Ò÷Ñ[if\u008e\u0018u\u0014^)ÊÂhidwàF\u0018û§\u0092\t\nh,¯G\u000b\u0096\u0086\u00adFû|ê\u009fèñ¬©\u001bØ(Ã\u0001·@©Ns\u0005-ä >ÐP\u0097\u0005»õJÄÜ`lv}ä-ÌS\u0010yË¢A\u0000¡f·\u0006\u001c\u0018¨?ýçþV!Þ\u0092Ô\u001b\u0099÷õ\u001aFÐjiòâ:·¶\u0010\u0080\u008a\u0086ã\u001f\u007f)O\u001aØ×&ÛùÅÕ(\u0092\u000fg#Ã\r*Ì-\u0091K¸X¬Ë\u007fé'\b:}´ü\bjö½>*a&×\u008dÝÀ\tµÌYñ\u0018»|÷Äô\u009a\u0087jl\"L\u0081Ø~+¸\u008f#¢\u001d\u009b\u0002\u0092©\u0010¹+\u000e\u0083t\u0081Ô+Âèq=\u008c.¦Y ¾z\u0093Wt\u0081ãlZ³\u0087g\u009fØ\"a\u0091,\u00857¦\u0013ÈÎæ\u0017[pvh\u009c^ ç4*?`!«ßm}\u0086=\u0080\u0092±o+/¯\u0002ÙG²²]\u000eñà\u0093KZ\u008a Qk\u0082Kù*Pyy\u0081\u0000\u0099å\u000b©¦\u0012z¹oÀÿ#\u0014\u0098\u009cÚª£YÌl\u0010\u0098b¬¤q\\v\u0093-üÚñíVú3\u0018×\u0007\u001e_\u0006ØE\u00147á\u0083\u0000à*\u001aÃÉ\u0085ö~(«âv VÉ«ö°6u¯C\u0081;7Àòåé\u009e2Ez^`\u0087!¬p#_\fkbß \u00adE~´0\u008eõ\u009et\u0087yç7ÕÞ\u00926\u0097\\9¡Ï~\u0095/¶9\u000e¢¾àâ Htÿ;\u001a#¤Ø\u0097`ð64jYj1\u001b\u0093D\u0091\u0086\"ù\u008c\u001aXÄ¢vð'".length();
        char cCharAt = '(';
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
                            d = strArr;
                            e = new String[32];
                            k = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[11];
                            int i10 = 0;
                            String str3 = "Ï\u0004¹\u0098 )S\u009fç\u0098o\u0099Ü|>\u0090Â×Kð\u008f_yÙu·~(\u000f|×\u0000×\nX\u0096\u0001¨Y0ÆZfQ2\u001bª\u0003HöxéÙ±ð`Y0ª\u0003h\u0019¼\u001e*\u0084i¡\u0080\u008f)þ";
                            int length2 = "Ï\u0004¹\u0098 )S\u009fç\u0098o\u0099Ü|>\u0090Â×Kð\u008f_yÙu·~(\u000f|×\u0000×\nX\u0096\u0001¨Y0ÆZfQ2\u001bª\u0003HöxéÙ±ð`Y0ª\u0003h\u0019¼\u001e*\u0084i¡\u0080\u008f)þ".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j5 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j6 = j5;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j6 >>> 56), (byte) (j6 >>> 48), (byte) (j6 >>> 40), (byte) (j6 >>> 32), (byte) (j6 >>> 24), (byte) (j6 >>> 16), (byte) (j6 >>> 8), (byte) j6});
                                    long j7 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j7;
                                            if (i11 >= length2) {
                                                g = jArr;
                                                j = new Integer[11];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12971, 7535595020513560702L ^ j2) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(__.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32701, 3824934318160814212L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28727, 7437261963328335626L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(__.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18549, 8139337251335247685L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20110, 9141000923796640182L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(__.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18926, 4665522319242172102L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(265, 1068514438161423932L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(__.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21737, 2378157291750099910L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20532, 3417635558798135070L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(__.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30784, 7895249894563489638L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8117, 7075383121239949451L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(__.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7097, 2832069064464286863L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32286, 5754090370938872111L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13119, 1701927484667218402L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(__.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(325, 190492332605398654L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17284, 5638301228182805687L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27638, 5205212692022104354L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(__.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10470, 4412886784658700249L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21490, 1564304737972030656L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26048, 3901621938402959122L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(__.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29766, 6369774341785267057L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28733, 8155815236064227096L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32764, 3841526671038514467L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(__.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29084, 2447736662779178677L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22043, 6978846282603039033L ^ j2) /* invoke-custom */, 0));
                                                Y = kPropertyArr;
                                                i = new __(j4);
                                                a = yp.t(i, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5937, 347016025605130266L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21004, 3200084661501536466L ^ j2) /* invoke-custom */, null);
                                                N = yp.t(i, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10722, 4797860690015516382L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4292, 7073015189083974163L ^ j2) /* invoke-custom */, null);
                                                y = yp.t(i, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7191, 3146829399846011705L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4292, 7073015189083974163L ^ j2) /* invoke-custom */, null);
                                                t = yp.t(i, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28912, 4510725684615098327L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4292, 7073015189083974163L ^ j2) /* invoke-custom */, null);
                                                z = yp.t(i, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10818, 5200618703097132399L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4292, 7073015189083974163L ^ j2) /* invoke-custom */, null);
                                                G = yp.t(i, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19113, 3819690359402075525L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4292, 7073015189083974163L ^ j2) /* invoke-custom */, null);
                                                X = yp.t(i, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15657, 4804388975957238280L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4292, 7073015189083974163L ^ j2) /* invoke-custom */, null);
                                                h = yp.t(i, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5055, 5871152924174470277L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4292, 7073015189083974163L ^ j2) /* invoke-custom */, null);
                                                b = yp.t(i, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26164, 6143038619371911440L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4292, 7073015189083974163L ^ j2) /* invoke-custom */, null);
                                                A = yp.t(i, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30421, 1465579240111253985L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4292, 7073015189083974163L ^ j2) /* invoke-custom */, null);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j7;
                                            if (i11 >= length2) {
                                                str3 = "ôù\r\u0085\u0086Aî§E\"\rka®\u0011´";
                                                length2 = "ôù\r\u0085\u0086Aî§E\"\rka®\u0011´".length();
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
                                    j5 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "nó\u0014\u001fTrH\u0089\td¥mb]ßê\u008fÁ4\u000eÔP\"¤ Vï\u0018+Ä§JQA¼e\u0013ì\u00034À«\u0082~'\b\u0016ë\u0080\u0095Ç\u0080k\u0086¯}I";
                        length = "nó\u0014\u001fTrH\u0089\td¥mb]ßê\u008fÁ4\u000eÔP\"¤ Vï\u0018+Ä§JQA¼e\u0013ì\u00034À«\u0082~'\b\u0016ë\u0080\u0095Ç\u0080k\u0086¯}I".length();
                        cCharAt = 24;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 25912;
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
                throw new RuntimeException("su/catlean/__", e2);
            }
        }
        return e[i3];
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
            r1 = 5
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
            java.lang.String r1 = "su/catlean/__"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.__.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 16589;
        if (j[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) k.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/__", e2);
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
            r1 = 5
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
            java.lang.String r1 = "su/catlean/__"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.__.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
