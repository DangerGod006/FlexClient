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
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/uz.class */
public final class uz extends _g {

    @NotNull
    public static final uz E;
    static final KProperty[] O;

    @NotNull
    private static final cw t;

    @NotNull
    private static final cq A;
    private static final long a = yz.a(7968827108016304419L, 3547659086180938873L, MethodHandles.lookup().lookupClass()).a(242243382955606L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /* JADX WARN: Illegal instructions before constructor call */
    private uz(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7529, 5597332446653575383L ^ j2) /* invoke-custom */, jt.A(), null, 4, null, j2 ^ 2033134458576L);
    }

    private final f9 z(long j) {
        return (f9) t.E(this, (a ^ j) ^ 110621018384427L, O[0]);
    }

    private final void G(long j, f9 f9Var) {
        t.b(this, (a ^ j) ^ 27798356424983L, O[0], f9Var);
    }

    private final boolean t(long j) {
        return ((Boolean) A.E(this, (a ^ j) ^ 16418799650060L, O[1])).booleanValue();
    }

    private final void B(long j, boolean z) {
        A.b(this, (a ^ j) ^ 42219648755808L, O[1], Boolean.valueOf(z));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0145: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_1799), (r1 I:net.minecraft.class_5321) STATIC call: su.catlean.lq.v(long, net.minecraft.class_1799, net.minecraft.class_5321):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void T(su.catlean.api.event.events.network.AfterSendPacket r13) {
        /*
            Method dump skipped, instruction units count: 1035
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uz.T(su.catlean.api.event.events.network.AfterSendPacket):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final net.minecraft.class_2338 G(long r19) {
        /*
            Method dump skipped, instruction units count: 1006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uz.G(long):net.minecraft.class_2338");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00c1: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_1799), (r1 I:net.minecraft.class_5321) STATIC call: su.catlean.lq.v(long, net.minecraft.class_1799, net.minecraft.class_5321):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final boolean e(long r10, short r12) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uz.e(long, short):boolean");
    }

    private static final Unit w(class_2338 class_2338Var) {
        long j = a ^ 50556558965070L;
        zf.Z((int) (j >>> 32), ((j ^ 3112367685175L) << 32) >>> 32).method_2896(zf.v(j ^ 34402534297400L), class_1268.field_5808, new class_3965(new class_243(((double) class_2338Var.method_10263()) + 0.5d, class_2338Var.method_10084().method_10264(), ((double) class_2338Var.method_10260()) + 0.0d), class_2350.field_11036, class_2338Var, false));
        return Unit.INSTANCE;
    }

    private static final Unit c(class_2338 class_2338Var) {
        long j = a ^ 70588255305063L;
        zf.Z((int) (j >>> 32), ((j ^ 122168764332574L) << 32) >>> 32).method_2896(zf.v(j ^ 125902411991825L), class_1268.field_5808, new class_3965(new class_243(((double) class_2338Var.method_10263()) + 0.5d, ((double) class_2338Var.method_10084().method_10264()) + 0.125d, ((double) class_2338Var.method_10260()) + 0.5d), class_2350.field_11036, class_2338Var.method_10084(), false));
        return Unit.INSTANCE;
    }

    private static final Unit l(fg fgVar, class_2338 class_2338Var) {
        long j = a ^ 77019567453592L;
        long j2 = j ^ 100418912820480L;
        long j3 = j ^ 108129217008055L;
        gg.P.T(j ^ 2547411921928L, fgVar.a(), E.z(j3), () -> {
            return w(r4);
        });
        gg ggVar = gg.P;
        class_1792 class_1792Var = class_1802.field_8069;
        Intrinsics.checkNotNullExpressionValue(class_1792Var, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26116, 8460724620403760435L ^ j) /* invoke-custom */);
        ggVar.S(class_1792Var, E.z(j3), j2, () -> {
            return c(r3);
        });
        return Unit.INSTANCE;
    }

    static {
        int i;
        long j = a ^ 134073708646175L;
        long j2 = j ^ 84460013645012L;
        long j3 = j ^ 15038284912224L;
        long j4 = j ^ 97978450086166L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[25];
        int i3 = 0;
        String str = "(©\u0000\u0099ª\u0095\u0006ë\u0088\\§}ûÿ\u000b\u000b´\u00142;³õH9Âbo\u0081OU+\u0011õ:ÐB\u001e\u0084û\u0098=Ê~\f~ã Ý\u0013ÿ\u0088ÚëÔ0g \u0097m\u0096\u0016n(]Ð\u0018l×\u001f\u0082ÂUX«kgÜ\u0010!Ø\u0080*\u00adl\né\u009d\\\u0013 èÈlm\u0083ÕH\u0011Ç\u0081\u0012\u0086\u0092ð}Þ;QT\u007f00\\ü¤ó$\u0015ûÕ³V á`Z\u0018\tX¯çr\u009dï\u0095ÚÂF\u0007\n±õµÔÿÓ\u0000¶\u000f\u0087ªKnè\u0007\u0018ÿ³\u0000\b\u0086¤²ñE;\u007f\u0013\u007f\u000e¢<ù.þ3\u0097Ã\u0006%\u00109\\kXqã4²\u008b\u0016öøJ+Í³\u0018\u0084<ù\r²\u0002\u0081\u008e\u001bWOÔD¤j 5\u000b¡Veâ¶w(}N$\u008a¹¶Þqj\u000f{\u0095\u0087DC.5jc²²^^ æG\u0084$Q·ÇÎ.rºÒ\u000e\u0002o  ^ôÍ*¯\u0016B\u0007\u0091 \u0085\u008cB3ÅciC\u0016eW9n,à<\u001d\u0018H\u0019À®(\u008b{¾³î\u0097\u0096\u0010p\u001c¯\u0098Z\u009b\u0093¤\u0095t¡¶7S÷\f\u0002N|Z\u0081CiíÂS|f\u000f¼^g\u0010\u001c¤]lâî\u00ad-\u0092\u0018\u0016Â\u0081\u009e\n\u009e\u0010 9Qî;\u0003\u0002¼|w¢?\u0016EÎB\u0018c\u001bÚu(L\u009eü (qE\u0089\u0002\núF¯¾\u0004\u009a+ë\u0018\u0018Ym\u0097¿ù\u0003Ùq°u\f\u001bÛ>|Ws\u008fwXÕõ\u00908(ÁÙ\u0007\u0099GðLo³Ä\u0018L\u0002&¬s\u0091e\u009f³6D¾ÁööÎ!Â\\\u0093\u009bIK:«S,cÒ {,MRüÁàÞq©²\u0003ÙÑª]=8\u007fUM\u0087E·g\u0003\u0012õQç\u0005  \u009cÌ¸\u0016ÿó\u0013eß\"I\u009c¶\u009dÙPÃ\u0002¾Î!æ¶¥ý\u0010ù´\fbþl(¯x!\u0088Þ\u0015g\u0083|¹É\u008fÆF\u00810Î±EÖ[@¦\u001aFö\b\u0013P\u0085\u009bïöà\u0016Æ\u0094\u0013KT ã1ø©4$è\u0096\bìâÊS´^XD\u0082÷\u009a\u0097#Sh$\u0081½Zü\u009cÁs ù|#ÔÙ\u008c%\u0080Ä«µó ø\nX\u0086ê\u0080±P!f\u0002Ñ_· F»¬\u0013\u0018Ù% ´çÐ§±\u0000~#¸KGé\u0003\u0085Ãõ\u0015|ß)é\u0010+)ø\u000e\u0081gâi{\u009cØ´³ùuå\u0018\u0085\r®\u009dìµÎ\u0086$ÞápOÞ\u0007R+\u00ad8H\u0091qÙ~";
        int length = "(©\u0000\u0099ª\u0095\u0006ë\u0088\\§}ûÿ\u000b\u000b´\u00142;³õH9Âbo\u0081OU+\u0011õ:ÐB\u001e\u0084û\u0098=Ê~\f~ã Ý\u0013ÿ\u0088ÚëÔ0g \u0097m\u0096\u0016n(]Ð\u0018l×\u001f\u0082ÂUX«kgÜ\u0010!Ø\u0080*\u00adl\né\u009d\\\u0013 èÈlm\u0083ÕH\u0011Ç\u0081\u0012\u0086\u0092ð}Þ;QT\u007f00\\ü¤ó$\u0015ûÕ³V á`Z\u0018\tX¯çr\u009dï\u0095ÚÂF\u0007\n±õµÔÿÓ\u0000¶\u000f\u0087ªKnè\u0007\u0018ÿ³\u0000\b\u0086¤²ñE;\u007f\u0013\u007f\u000e¢<ù.þ3\u0097Ã\u0006%\u00109\\kXqã4²\u008b\u0016öøJ+Í³\u0018\u0084<ù\r²\u0002\u0081\u008e\u001bWOÔD¤j 5\u000b¡Veâ¶w(}N$\u008a¹¶Þqj\u000f{\u0095\u0087DC.5jc²²^^ æG\u0084$Q·ÇÎ.rºÒ\u000e\u0002o  ^ôÍ*¯\u0016B\u0007\u0091 \u0085\u008cB3ÅciC\u0016eW9n,à<\u001d\u0018H\u0019À®(\u008b{¾³î\u0097\u0096\u0010p\u001c¯\u0098Z\u009b\u0093¤\u0095t¡¶7S÷\f\u0002N|Z\u0081CiíÂS|f\u000f¼^g\u0010\u001c¤]lâî\u00ad-\u0092\u0018\u0016Â\u0081\u009e\n\u009e\u0010 9Qî;\u0003\u0002¼|w¢?\u0016EÎB\u0018c\u001bÚu(L\u009eü (qE\u0089\u0002\núF¯¾\u0004\u009a+ë\u0018\u0018Ym\u0097¿ù\u0003Ùq°u\f\u001bÛ>|Ws\u008fwXÕõ\u00908(ÁÙ\u0007\u0099GðLo³Ä\u0018L\u0002&¬s\u0091e\u009f³6D¾ÁööÎ!Â\\\u0093\u009bIK:«S,cÒ {,MRüÁàÞq©²\u0003ÙÑª]=8\u007fUM\u0087E·g\u0003\u0012õQç\u0005  \u009cÌ¸\u0016ÿó\u0013eß\"I\u009c¶\u009dÙPÃ\u0002¾Î!æ¶¥ý\u0010ù´\fbþl(¯x!\u0088Þ\u0015g\u0083|¹É\u008fÆF\u00810Î±EÖ[@¦\u001aFö\b\u0013P\u0085\u009bïöà\u0016Æ\u0094\u0013KT ã1ø©4$è\u0096\bìâÊS´^XD\u0082÷\u009a\u0097#Sh$\u0081½Zü\u009cÁs ù|#ÔÙ\u008c%\u0080Ä«µó ø\nX\u0086ê\u0080±P!f\u0002Ñ_· F»¬\u0013\u0018Ù% ´çÐ§±\u0000~#¸KGé\u0003\u0085Ãõ\u0015|ß)é\u0010+)ø\u000e\u0081gâi{\u009cØ´³ùuå\u0018\u0085\r®\u009dìµÎ\u0086$ÞápOÞ\u0007R+\u00ad8H\u0091qÙ~".length();
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
                            b = strArr;
                            c = new String[25];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[5];
                            int i9 = 0;
                            String str3 = "h\u0013\u000fíÂ5ï¶\u0083dù\u000fA\u001cß LvHÖH¸½È";
                            int length2 = "h\u0013\u000fíÂ5ï¶\u0083dù\u000fA\u001cß LvHÖH¸½È".length();
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
                                                f = new Integer[5];
                                                O = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(uz.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14227, 8385445434698004004L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9312, 9187176686090511827L ^ j) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(uz.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24002, 7987081538177932390L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28302, 5325774287078862644L ^ j) /* invoke-custom */, 0))};
                                                E = new uz(j4);
                                                t = yp.L(E, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13687, 8756610710373201104L ^ j) /* invoke-custom */, f9.SILENT_FULL, null, null, (int) c(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12078, 3917405411317712104L ^ j) /* invoke-custom */, null, j3);
                                                A = yp.t(E, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13342, 7918951831527880106L ^ j) /* invoke-custom */, false, j2, null, null, (int) c(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27424, 7670910185203253477L ^ j) /* invoke-custom */, null);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j7;
                                            if (i10 >= length2) {
                                                str3 = "ÆÖ\u008e\u0005¼×d\u0088ÈÓ]\u0086\u001f\b\u0015\u0004";
                                                length2 = "ÆÖ\u008e\u0005¼×d\u0088ÈÓ]\u0086\u001f\b\u0015\u0004".length();
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
                        str = "Ä\u0016wã\u009e\u001c>\t\u0081Ì«ÿ\u008f\u00adæ÷$Dá8p\u0002H¤-¥\u008f|³\u0004Tã dN\u009cA\u0011Vg\u0004Ì¶ý\u0003¶¯Q¤\u000fr\u0098d¤ù<è:4Å7ñ¾*\n";
                        length = "Ä\u0016wã\u009e\u001c>\t\u0081Ì«ÿ\u008f\u00adæ÷$Dá8p\u0002H¤-¥\u008f|³\u0004Tã dN\u009cA\u0011Vg\u0004Ì¶ý\u0003¶¯Q¤\u000fr\u0098d¤ù<è:4Å7ñ¾*\n".length();
                        cCharAt = ' ';
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 27573;
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
                throw new RuntimeException("su/catlean/uz", e2);
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
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
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
            java.lang.String r1 = "su/catlean/uz"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uz.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 451;
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
                    throw new RuntimeException("su/catlean/uz", e2);
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
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
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
            java.lang.String r1 = "su/catlean/uz"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uz.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
