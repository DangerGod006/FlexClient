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
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.StopUsingItemEvent;
import su.catlean.api.event.events.player.UsingItemEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/el.class */
public final class el extends _g {

    @NotNull
    public static final el C;
    static final /* synthetic */ KProperty[] X;

    @NotNull
    private static final c8 o;

    @NotNull
    private static final cq m;

    @NotNull
    private static final cq F;

    @NotNull
    private static final cq K;

    @NotNull
    private static final cq g;

    @NotNull
    private static final cq x;

    @NotNull
    private static final cq l;
    private static boolean V;
    private static int O;
    private static final long a = yz.a(-6054961735656640193L, 4709577558979737275L, MethodHandles.lookup().lookupClass()).a(50406202715930L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map h;

    /* JADX WARN: Illegal instructions before constructor call */
    private el(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24687, 2871346970098491349L ^ j2) /* invoke-custom */, jt.d(), null, 4, null, j2 ^ 7534316182341L);
    }

    private final int M(long j, int i) {
        return ((Number) o.E(this, (((j << 32) | ((((long) i) << 32) >>> 32)) ^ a) ^ 124150998118352L, X[0])).intValue();
    }

    private final boolean l(long j) {
        return ((Boolean) m.E(this, (a ^ j) ^ 34755012513556L, X[1])).booleanValue();
    }

    private final boolean r(long j) {
        return ((Boolean) F.E(this, (a ^ j) ^ 85744700850495L, X[2])).booleanValue();
    }

    private final boolean a(int i, int i2) {
        return ((Boolean) K.E(this, (((((long) i) << 32) | ((((long) i2) << 32) >>> 32)) ^ a) ^ 6393945492468L, X[3])).booleanValue();
    }

    private final boolean Z(long j) {
        return ((Boolean) g.E(this, (a ^ j) ^ 20498823386500L, X[4])).booleanValue();
    }

    private final boolean E(long j) {
        return ((Boolean) x.E(this, (a ^ j) ^ 74740587900438L, X[5])).booleanValue();
    }

    private final boolean F(int i, short s, short s2) {
        long j = (((((long) i) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ a;
        return ((Boolean) l.E(this, j ^ 7921348228237L, X[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18668, 4128179978997462599L ^ j) /* invoke-custom */])).booleanValue();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:25:0x00dc
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow(priority = -10)
    private final void y(su.catlean.api.event.events.player.PlayerUpdateEvent r9) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.el.y(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean._g[]] */
    private final void s(int i, long j) {
        long j2 = ((((long) i) << 32) | ((j << 32) >>> 32)) ^ a;
        long j3 = j2 ^ 6694344938342L;
        long j4 = j2 ^ 42938385807967L;
        long j5 = j2 ^ 15890482398188L;
        Object objMethod_6115 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3365201071313964617L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    objMethod_6115 = zf.v(j5).method_6115();
                    boolean z = objMethod_6115;
                    if (objMethod_6115 == 0) {
                        if (objMethod_6115 == 0) {
                            ag.K(R(class_1268.field_5810, j4) ? class_1268.field_5810 : class_1268.field_5808, 0.0f, j3, 0.0f, (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3809, 4849120619111258182L ^ j2) /* invoke-custom */, null);
                        }
                        z = 1;
                    }
                    V = z;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_6115, -3347879066039006568L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_6115, -3347879066039006568L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_6115, -3347879066039006568L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:95:0x0239
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final boolean W(long r9) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.el.W(long):boolean");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:99:0x0235
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final boolean R(net.minecraft.class_1268 r9, long r10) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.el.R(net.minecraft.class_1268, long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean.api.event.events.player.UsingItemEvent] */
    @Flow
    private final void Z(UsingItemEvent usingItemEvent) {
        Object obj = a ^ 117089520944362L;
        try {
            if (V) {
                obj = usingItemEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2163610706823709975L, obj) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean.api.event.events.player.StopUsingItemEvent] */
    @Flow
    private final void z(StopUsingItemEvent stopUsingItemEvent) {
        Object obj = a ^ 95483354595618L;
        try {
            if (V) {
                obj = stopUsingItemEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6615379727774826719L, obj) /* invoke-custom */;
        }
    }

    static {
        int i;
        long j = a ^ 31147944461090L;
        long j2 = j ^ 19445410108272L;
        long j3 = j ^ 68207636094486L;
        long j4 = j ^ 65676478204094L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[24];
        int i3 = 0;
        String str = "y8\u0086?é\u0012_\u0001Ã¸G¦\u0082\u0017HU\u0018Ô·\t<eÆ;¯\u0092£rÅ\u0003ìZ\u001e\u0013Ë!òÙ(=¯  d;Ù\u008aìPn\u0083\u008bÎõ\u0088`\u0015&Ó\u009a;(µ;\u0084ëHY\u007fó·v\u0083\u000f óö¢îñÖ\u0085Û\u0090ï\u0082\u008exÔLWÉZ!é¿ë\u0014\u0084as\u0019Î\u001d\u001a\\\u008e \u008a\u008b^G¹ób\u001e¨A°wa5¤µ\u000eÓ\u0080ã¶>Wº\u0001\u0094\u00ad\\\u008d<PÂ\u00102h2hä\u008eå\u008d\u0091-\u0094ÍïL:\u0017\u0010¬\u007fö¨\u001a\u0093\u0097cû\u001dRXÀ§'®\u0018(6d}¸ëè@\u0005²\u008a¬l\u009d\u001e5\u009cSé'ÚTç4(±uÜùEk\u0006©\u009bHD¦!\u0080£Âß~\u0088õÍ\nªy\u0015®=t6\u007f\u0089\u001fÅ(%Ü;\u000b0} äâ£æ*\\X}\u0016\u009bÙnQóq¼×Ó8ïP\t/Å\u0016lßås\u008cp\u0094\u0018(C\u0080Ää\u0002\u0083L\u0083Z\u00179Ä\u0081\u009bAM\u0014Ôñ)\u0094ÿY\u0018f]3\n\u0081\u0083\b-\u001cxß9\u0005xÜSÒ^jç\"\u00010\u0014 È\u0015\u0096\u009f¯)ã\u001b\"\u008b\u008dØKFÇÆåª{WV\u008c\u0085á¾\u0017\u0086ËO¸\u0016,\u0018ÑkólÔZ×\u0099H\u009dsõ|@Fþ¶I \u009a¸|ñ¶\u0010\u0017>Ù¶\u000f\u0089â¦\u0084Åb@\\\u008d,/ !\u0089£Nªº\u0097¢\u0097@hÚ\u0083v<è\u00adáR\t\f=ÒsÈFñÚb\u0002\u0019\u0016 *0\u0089À\\\u0081¨»4´28qÂ\u0019\u000eªßU·v\u0085ò\u009c+o¾b\u0000\u0095¦n\u0010òí4àìeÛ!3\u0018¦ïF'ËO\u0010D6Á\u008a\\=s\u0007$ÏÑç´Q\u0017; P\u0095\bE¬Öy9f¯\u0003}Ô\u0095,Ê\u0081|Í\u0084Â¡5[i`.\u001e4<\u001e\u00ad ÷ú(\u0094·\u001ea\u009a³öAÉÔ¬\u0098åµá\u000eÕö\u0091Vt}¡\\¸FÕ\u0013à \u001c\u0088 Ý\u0094ä\u0097\u0002=\u009eW´ußQÒ{`Hä\u0095Ö\u0089¾í \u0089\u008f¹\u007f\u0018i";
        int length = "y8\u0086?é\u0012_\u0001Ã¸G¦\u0082\u0017HU\u0018Ô·\t<eÆ;¯\u0092£rÅ\u0003ìZ\u001e\u0013Ë!òÙ(=¯  d;Ù\u008aìPn\u0083\u008bÎõ\u0088`\u0015&Ó\u009a;(µ;\u0084ëHY\u007fó·v\u0083\u000f óö¢îñÖ\u0085Û\u0090ï\u0082\u008exÔLWÉZ!é¿ë\u0014\u0084as\u0019Î\u001d\u001a\\\u008e \u008a\u008b^G¹ób\u001e¨A°wa5¤µ\u000eÓ\u0080ã¶>Wº\u0001\u0094\u00ad\\\u008d<PÂ\u00102h2hä\u008eå\u008d\u0091-\u0094ÍïL:\u0017\u0010¬\u007fö¨\u001a\u0093\u0097cû\u001dRXÀ§'®\u0018(6d}¸ëè@\u0005²\u008a¬l\u009d\u001e5\u009cSé'ÚTç4(±uÜùEk\u0006©\u009bHD¦!\u0080£Âß~\u0088õÍ\nªy\u0015®=t6\u007f\u0089\u001fÅ(%Ü;\u000b0} äâ£æ*\\X}\u0016\u009bÙnQóq¼×Ó8ïP\t/Å\u0016lßås\u008cp\u0094\u0018(C\u0080Ää\u0002\u0083L\u0083Z\u00179Ä\u0081\u009bAM\u0014Ôñ)\u0094ÿY\u0018f]3\n\u0081\u0083\b-\u001cxß9\u0005xÜSÒ^jç\"\u00010\u0014 È\u0015\u0096\u009f¯)ã\u001b\"\u008b\u008dØKFÇÆåª{WV\u008c\u0085á¾\u0017\u0086ËO¸\u0016,\u0018ÑkólÔZ×\u0099H\u009dsõ|@Fþ¶I \u009a¸|ñ¶\u0010\u0017>Ù¶\u000f\u0089â¦\u0084Åb@\\\u008d,/ !\u0089£Nªº\u0097¢\u0097@hÚ\u0083v<è\u00adáR\t\f=ÒsÈFñÚb\u0002\u0019\u0016 *0\u0089À\\\u0081¨»4´28qÂ\u0019\u000eªßU·v\u0085ò\u009c+o¾b\u0000\u0095¦n\u0010òí4àìeÛ!3\u0018¦ïF'ËO\u0010D6Á\u008a\\=s\u0007$ÏÑç´Q\u0017; P\u0095\bE¬Öy9f¯\u0003}Ô\u0095,Ê\u0081|Í\u0084Â¡5[i`.\u001e4<\u001e\u00ad ÷ú(\u0094·\u001ea\u009a³öAÉÔ¬\u0098åµá\u000eÕö\u0091Vt}¡\\¸FÕ\u0013à \u001c\u0088 Ý\u0094ä\u0097\u0002=\u009eW´ußQÒ{`Hä\u0095Ö\u0089¾í \u0089\u008f¹\u007f\u0018i".length();
        char cCharAt = 16;
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
                            c = new String[24];
                            h = new HashMap(13);
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
                            String str3 = "â\u000e¯r->I\u0089Öô\t\u0095³(\fÛ\u0090\f\u0090/\u0099-Îmvç\\ÝÀd\u001d<YV×\u0098ZàÖÿDÌ>{\u0099\u0015T>oÔ^\u000emñíD";
                            int length2 = "â\u000e¯r->I\u0089Öô\t\u0095³(\fÛ\u0090\f\u0090/\u0099-Îmvç\\ÝÀd\u001d<YV×\u0098ZàÖÿDÌ>{\u0099\u0015T>oÔ^\u000emñíD".length();
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
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20932, 5119222149124706083L ^ j) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(el.class, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15064, 5463949147593430576L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22230, 7531395008880032297L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(el.class, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13490, 5055483202379765833L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26378, 1155030495495425014L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(el.class, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14118, 4882962262440991691L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9084, 9129840590411943809L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(el.class, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28358, 2969879245966770720L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7709, 1987173973937386234L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(el.class, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10309, 4623009851239646380L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3095, 3559967447566049513L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(el.class, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13991, 8980913215801809476L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29972, 2421700475747179007L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18668, 4128251422640789002L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(el.class, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7781, 6210307634729382532L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13983, 921706006026443391L ^ j) /* invoke-custom */, 0));
                                                X = kPropertyArr;
                                                C = new el(j4);
                                                o = yp.L(C, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27477, 3009089627580532655L ^ j) /* invoke-custom */, (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21057, 2012898679388785838L ^ j) /* invoke-custom */, new IntRange(0, (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28458, 9040014078820676043L ^ j) /* invoke-custom */), j2, null, null, (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27616, 3996002599965652228L ^ j) /* invoke-custom */, null);
                                                m = yp.t(C, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6541, 1077097837991064929L ^ j) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25413, 1236896807944289696L ^ j) /* invoke-custom */, null);
                                                F = yp.t(C, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20040, 1291975266806637233L ^ j) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6171, 7242757416356316921L ^ j) /* invoke-custom */, null);
                                                K = yp.t(C, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21637, 6059280054636329067L ^ j) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6171, 7242757416356316921L ^ j) /* invoke-custom */, null);
                                                g = yp.t(C, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31057, 2487041652154701225L ^ j) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6171, 7242757416356316921L ^ j) /* invoke-custom */, null);
                                                x = yp.t(C, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12858, 1583913012437475039L ^ j) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6171, 7242757416356316921L ^ j) /* invoke-custom */, null);
                                                l = yp.t(C, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24795, 6167836727920561201L ^ j) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6171, 7242757416356316921L ^ j) /* invoke-custom */, null);
                                                O = -1;
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j7;
                                            if (i10 >= length2) {
                                                str3 = "\u001bÌ\u0086ÓÜc+\u00178\u0097:\u000fD)OÈ";
                                                length2 = "\u001bÌ\u0086ÓÜc+\u00178\u0097:\u000fD)OÈ".length();
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
                        str = "\u008a:wõW#«\u009c¤À\u0082V\u0099\"U\u0082aÆlé\u000b]\u0092A+Ñ²nÐ×è\u0084\u0090\u0091\u0005îpvâm\u0018ï\u0018A8Q\u0010\u0092ßl¾\u0006ËE§ø\u0083Ê s·\u009f¢ûÕ";
                        length = "\u008a:wõW#«\u009c¤À\u0082V\u0099\"U\u0082aÆlé\u000b]\u0092A+Ñ²nÐ×è\u0084\u0090\u0091\u0005îpvâm\u0018ï\u0018A8Q\u0010\u0092ßl¾\u0006ËE§ø\u0083Ê s·\u009f¢ûÕ".length();
                        cCharAt = '(';
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 13356;
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
                throw new RuntimeException("su/catlean/el", e2);
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
            r1 = 1073741824(0x40000000, float:2.0)
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
            java.lang.String r1 = "su/catlean/el"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.el.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 17955;
        if (f[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/el", e2);
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
            r1 = 1073741824(0x40000000, float:2.0)
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
            java.lang.String r1 = "su/catlean/el"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.el.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
