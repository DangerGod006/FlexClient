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
import kotlin.reflect.KProperty;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/pl.class */
public final class pl extends gf {

    @NotNull
    public static final pl N;
    static final /* synthetic */ KProperty[] n;

    @NotNull
    private static final cq R;

    @NotNull
    private static final cq c;

    @NotNull
    private static final cq E;

    @NotNull
    private static final cq h;

    @NotNull
    private static final cq m;

    @NotNull
    private static final cq y;

    @NotNull
    private static final cq O;
    private static final long a = yz.a(3253173483629988902L, -2862634010910326185L, MethodHandles.lookup().lookupClass()).a(139530684506669L);
    private static final String[] b;
    private static final String[] f;
    private static final Map g;
    private static final long[] i;
    private static final Integer[] k;
    private static final Map l;

    /* JADX WARN: Illegal instructions before constructor call */
    private pl(long j) {
        long j2 = a ^ j;
        super((char) (j2 >>> 48), (int) (((j2 ^ 40107945685868L) << 16) >>> 32), (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23029, 3714729669287709909L ^ j2) /* invoke-custom */, (char) ((r1 << 48) >>> 48));
    }

    private final boolean y(long j, char c2) {
        return ((Boolean) R.E(this, (((j << 16) | ((((long) c2) << 48) >>> 48)) ^ a) ^ 51234942695119L, n[0])).booleanValue();
    }

    private final boolean v(long j) {
        return ((Boolean) c.E(this, (a ^ j) ^ 63763284703669L, n[1])).booleanValue();
    }

    private final boolean g(long j) {
        return ((Boolean) E.E(this, (a ^ j) ^ 63016436155165L, n[2])).booleanValue();
    }

    private final boolean j(long j) {
        return ((Boolean) h.E(this, (a ^ j) ^ 117154015412001L, n[3])).booleanValue();
    }

    private final boolean a(long j) {
        return ((Boolean) m.E(this, (a ^ j) ^ 62498629570608L, n[4])).booleanValue();
    }

    private final boolean H(long j) {
        return ((Boolean) y.E(this, (a ^ j) ^ 51653178845481L, n[5])).booleanValue();
    }

    private final boolean S(int i2, short s, char c2) {
        long j = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ a;
        return ((Boolean) O.E(this, j ^ 84762914557447L, n[(int) d(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26321, 2717073318309412922L ^ j) /* invoke-custom */])).booleanValue();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:113:0x0414
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // su.catlean.gf
    public void h(long r18, @org.jetbrains.annotations.NotNull net.minecraft.class_332 r20) {
        /*
            Method dump skipped, instruction units count: 1220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.pl.h(long, net.minecraft.class_332):void");
    }

    @Override // su.catlean.gf
    public void H(@NotNull class_332 context, long a2) {
        long j = a2 ^ 1549896540735L;
        Intrinsics.checkNotNullParameter(context, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15899, 8568995777682437885L ^ a2) /* invoke-custom */);
        b8.f(a2 ^ 26980051417349L).g((int) (a2 >>> 32), (char) ((j << 32) >>> 48), (short) ((j << 48) >>> 48));
    }

    static {
        int i2;
        long j = a ^ 12859609424143L;
        long j2 = j ^ 57916652658614L;
        long j3 = j ^ 129088906336488L;
        g = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[34];
        int i4 = 0;
        String str = "õ=\u009b\u0016Áz$\u0086\u0001\u009dªª\u009eìêWÞ\u0019)Ðpy:8N'ð§Ë#b'\u0005æ}p¶ê®å \u008a_\u0092/\u0096g\u0080\u008dø\u001bíSÔ&AÔßÙ\u008bH\u0098Þó\u001cPÐI¥\u008a×\n½\u0018\u0081ª^%\u0084¼\u001açî\rR;G\u009dÝëv\u001eÇ\u009bÈà\u0014Û\u00108ÙQh)âü´ÖÿÒfQ\u0004q\u0000\u0010ÂÙt\u0002\u0013\u0011m¨¡\u0098N\u0013å}VI\u0010{Öv\u0081Ç\u0004³)\u009c7ñ£f\u0007]p\u0018\u007fC-Lï±þ\u0017p±;lDp\u0086\u0080\u0007\u00ad\u009b{ù\rÎú\u0018\u0018»¯j\u008bÁDR\u001eÊ1\u0019ÈøÀÃ»2æäP \u0085F\u0010GãC¹jÊ\u0090\u0011\u001fÞ³Ä\u0082xºÉ \u0099\u001d\u0011\u0084Ö\u008f;²/;\u0002¨L\u0084è*Ûôúç]\u0089ù×¡\u0085pé\u0096XeÔ\u0010\u000b\u0017Ö s\u0092À\u0092\u001c¿ÎG\u0094«}G \u008aÇmÆÔ|³6OÈ+\u0094R-\u009dÏ¾´^\u000fuLº\u0099û\u0004]\b\u0006I\u0012H\u0010>\u00adZI6¡\u009aË\u007f\u0016[²Å\u0019(\u009c\u0010\u0085\u0013³ÓÞda8\u001b:÷{\u0010gXø(@Þ·©Á\u009c?0\u0082\u001a\u0085ªP\u000fj1\t¿\u009et%\n\u001b®l\u0097bÜBa)êÉÄ÷\u0006K±]¾\u0018öÑLäJaX\u00009þjlç\u008ac\u000b\u0084\u0082S¤\u001e\u0007{m\u0018Ñ\u0017×1ÕU\u0011¤\n|Á\u0092¾\bAf\u0092Íø>,k^i $¸\u0086\u001f¸ãÊ\u009bá®lí\u0000ð\u009bÇ-\f\u008e½°¾à\u0015X\u0089|l¹\r1\u0098\u0018>zé\u0007ÛÜ\u001fK![_A§öõo\u0080\u0093f\u0093M\u0015\u008aÂ\u0010{±\u008f Ýñ\u009bz.ÕB²xêø\u0094((\u000eg1\u0088Ì×êµ\u0086\u009d\r&¬G\u0010Ëx¾\u0089ì´¦ñ1¾\u008aÖM?;x®y,¬+í\u008e% º\u00116hö0\u0016¯]þ½\u009c6\u0091]d:\u0016¿þ/Ì\u001eDJFï\u0004Õ£\\1\u00102L=û0¬_¹S\u008bóA\tsX2\u0018E7lXßxR@\u0010ê\u0094>4³Iê\u009d\u0013f7æ÷°x \u0007·\u000f\u009c&âw¥\u008fó8Ã]\u0082?`Ü\nÁ9{y½\bëÎmS\u0005þDi\u0010¬íLÀ*â\u0082êSJ¤p*Ì\u00833 Û d(üÿ$ÚW\u0016dÇ\u0011\u0080o\u008eÄô¯I¡ho=\u0013/BßªÚ\u009fØ\u0010\u0085«Éu\u0007©Xg\"¢ÊE!¥\u008c\u0012 £ë¿TK\t#\u0095^üÎ\u001c,ÑÅÆ§\u0003¦Jøÿ\u000bÿ\u0087<j\u0012å\u0015?\u0015 !W\u001fC\u0094Õ_¯áwj÷Ø\u008cÃy\t-pJFïÚ{¦\u008dî\u001b\u0087¡\u0097ã(gy\u000fitÍiÞÕz³ÌèÌu\u0096\u0088Úx\u009f.C[ì±ª³?\u009a\u009e±Âð\u0001¹_@Í\u009b'\u0018t\u001d.a\u009f@\u0093¿\u0004\"\u001b\u009e*>F\u0011-SFU1K\n\u008d";
        int length = "õ=\u009b\u0016Áz$\u0086\u0001\u009dªª\u009eìêWÞ\u0019)Ðpy:8N'ð§Ë#b'\u0005æ}p¶ê®å \u008a_\u0092/\u0096g\u0080\u008dø\u001bíSÔ&AÔßÙ\u008bH\u0098Þó\u001cPÐI¥\u008a×\n½\u0018\u0081ª^%\u0084¼\u001açî\rR;G\u009dÝëv\u001eÇ\u009bÈà\u0014Û\u00108ÙQh)âü´ÖÿÒfQ\u0004q\u0000\u0010ÂÙt\u0002\u0013\u0011m¨¡\u0098N\u0013å}VI\u0010{Öv\u0081Ç\u0004³)\u009c7ñ£f\u0007]p\u0018\u007fC-Lï±þ\u0017p±;lDp\u0086\u0080\u0007\u00ad\u009b{ù\rÎú\u0018\u0018»¯j\u008bÁDR\u001eÊ1\u0019ÈøÀÃ»2æäP \u0085F\u0010GãC¹jÊ\u0090\u0011\u001fÞ³Ä\u0082xºÉ \u0099\u001d\u0011\u0084Ö\u008f;²/;\u0002¨L\u0084è*Ûôúç]\u0089ù×¡\u0085pé\u0096XeÔ\u0010\u000b\u0017Ö s\u0092À\u0092\u001c¿ÎG\u0094«}G \u008aÇmÆÔ|³6OÈ+\u0094R-\u009dÏ¾´^\u000fuLº\u0099û\u0004]\b\u0006I\u0012H\u0010>\u00adZI6¡\u009aË\u007f\u0016[²Å\u0019(\u009c\u0010\u0085\u0013³ÓÞda8\u001b:÷{\u0010gXø(@Þ·©Á\u009c?0\u0082\u001a\u0085ªP\u000fj1\t¿\u009et%\n\u001b®l\u0097bÜBa)êÉÄ÷\u0006K±]¾\u0018öÑLäJaX\u00009þjlç\u008ac\u000b\u0084\u0082S¤\u001e\u0007{m\u0018Ñ\u0017×1ÕU\u0011¤\n|Á\u0092¾\bAf\u0092Íø>,k^i $¸\u0086\u001f¸ãÊ\u009bá®lí\u0000ð\u009bÇ-\f\u008e½°¾à\u0015X\u0089|l¹\r1\u0098\u0018>zé\u0007ÛÜ\u001fK![_A§öõo\u0080\u0093f\u0093M\u0015\u008aÂ\u0010{±\u008f Ýñ\u009bz.ÕB²xêø\u0094((\u000eg1\u0088Ì×êµ\u0086\u009d\r&¬G\u0010Ëx¾\u0089ì´¦ñ1¾\u008aÖM?;x®y,¬+í\u008e% º\u00116hö0\u0016¯]þ½\u009c6\u0091]d:\u0016¿þ/Ì\u001eDJFï\u0004Õ£\\1\u00102L=û0¬_¹S\u008bóA\tsX2\u0018E7lXßxR@\u0010ê\u0094>4³Iê\u009d\u0013f7æ÷°x \u0007·\u000f\u009c&âw¥\u008fó8Ã]\u0082?`Ü\nÁ9{y½\bëÎmS\u0005þDi\u0010¬íLÀ*â\u0082êSJ¤p*Ì\u00833 Û d(üÿ$ÚW\u0016dÇ\u0011\u0080o\u008eÄô¯I¡ho=\u0013/BßªÚ\u009fØ\u0010\u0085«Éu\u0007©Xg\"¢ÊE!¥\u008c\u0012 £ë¿TK\t#\u0095^üÎ\u001c,ÑÅÆ§\u0003¦Jøÿ\u000bÿ\u0087<j\u0012å\u0015?\u0015 !W\u001fC\u0094Õ_¯áwj÷Ø\u008cÃy\t-pJFïÚ{¦\u008dî\u001b\u0087¡\u0097ã(gy\u000fitÍiÞÕz³ÌèÌu\u0096\u0088Úx\u009f.C[ì±ª³?\u009a\u009e±Âð\u0001¹_@Í\u009b'\u0018t\u001d.a\u009f@\u0093¿\u0004\"\u001b\u009e*>F\u0011-SFU1K\n\u008d".length();
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
                            b = strArr;
                            f = new String[34];
                            l = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[8];
                            int i10 = 0;
                            String str3 = "â\u0015Ð¡Ï²Sk\u000e\u0013\u00843ð\u007f\u0015)Çû;VB\u0012Ð\u0081%®!D;.Ï*½ãÌ\u009fÏ¨\u0012,í\u007f\u0083+\u007fpjµ";
                            int length2 = "â\u0015Ð¡Ï²Sk\u000e\u0013\u00843ð\u007f\u0015)Çû;VB\u0012Ð\u0081%®!D;.Ï*½ãÌ\u009fÏ¨\u0012,í\u007f\u0083+\u007fpjµ".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j4 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j5 = j4;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j5 >>> 56), (byte) (j5 >>> 48), (byte) (j5 >>> 40), (byte) (j5 >>> 32), (byte) (j5 >>> 24), (byte) (j5 >>> 16), (byte) (j5 >>> 8), (byte) j5});
                                    long j6 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j6;
                                            if (i11 >= length2) {
                                                i = jArr;
                                                k = new Integer[8];
                                                KProperty[] kPropertyArr = new KProperty[(int) d(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17822, 2376224213756344343L ^ j) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(pl.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23920, 7404340044195784899L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20948, 7240747316552033377L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(pl.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1388, 3842814827102875858L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16268, 2200300061339388452L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(pl.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1586, 1256166154725503891L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4226, 1041087607565493541L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(pl.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6567, 2352674545064619025L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5507, 2584127109201043489L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(pl.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7963, 6237161746332297905L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4619, 7796653292022605728L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(pl.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28765, 5972338817353729523L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25045, 111095039952016506L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) d(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13126, 1955603585524272846L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(pl.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3647, 4263153278925388691L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28690, 5064706226650564023L ^ j) /* invoke-custom */, 0));
                                                n = kPropertyArr;
                                                N = new pl(j3);
                                                R = yp.t(N, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9453, 9142400379168002390L ^ j) /* invoke-custom */, true, j2, null, null, (int) d(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8685, 1469678748104039520L ^ j) /* invoke-custom */, null);
                                                c = yp.t(N, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10355, 9036546641009319363L ^ j) /* invoke-custom */, true, j2, null, null, (int) d(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31331, 1556401710552598508L ^ j) /* invoke-custom */, null);
                                                E = yp.t(N, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14202, 279433890455192264L ^ j) /* invoke-custom */, true, j2, null, null, (int) d(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31331, 1556401710552598508L ^ j) /* invoke-custom */, null);
                                                h = yp.t(N, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32279, 8500944350940023718L ^ j) /* invoke-custom */, false, j2, null, null, (int) d(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31331, 1556401710552598508L ^ j) /* invoke-custom */, null);
                                                m = yp.t(N, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21557, 8542958491737842061L ^ j) /* invoke-custom */, true, j2, null, null, (int) d(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31331, 1556401710552598508L ^ j) /* invoke-custom */, null);
                                                y = yp.t(N, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(222, 8494862383225582948L ^ j) /* invoke-custom */, true, j2, null, null, (int) d(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31331, 1556401710552598508L ^ j) /* invoke-custom */, null);
                                                O = yp.t(N, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1185, 4323289039095050526L ^ j) /* invoke-custom */, false, j2, null, null, (int) d(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31331, 1556401710552598508L ^ j) /* invoke-custom */, null);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j6;
                                            if (i11 >= length2) {
                                                str3 = "¿kÑQ\u0085%§ì\u0010\u001dº·¥\u0088\u009e\r";
                                                length2 = "¿kÑQ\u0085%§ì\u0010\u001dº·¥\u0088\u009e\r".length();
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
                                    j4 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "\u0001ÙÞf«\u0086:\u0094Ê½÷lq¢\u0004UÆ\u0015/¹W\u0015\u0000\u0017Õ\u000b\u0000KñªÜ\u0013 W\u009f/í=²«\u0091ø¶·Êù\u0096»{¾ë\u000et\u0087pÄ.\u009bj¹Ý\u0080ë/\u0092";
                        length = "\u0001ÙÞf«\u0086:\u0094Ê½÷lq¢\u0004UÆ\u0015/¹W\u0015\u0000\u0017Õ\u000b\u0000KñªÜ\u0013 W\u009f/í=²«\u0091ø¶·Êù\u0096»{¾ë\u000et\u0087pÄ.\u009bj¹Ý\u0080ë/\u0092".length();
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

    private static String b(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 27859;
        if (f[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) g.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                f[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/pl", e);
            }
        }
        return f[i3];
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
            java.lang.String r1 = "su/catlean/pl"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.pl.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int d(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 25834;
        if (k[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) i[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) l.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/pl", e);
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

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iD = d(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iD)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iD;
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
    private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
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
            java.lang.String r1 = "su/catlean/pl"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.pl.d(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
