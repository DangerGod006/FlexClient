package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
import net.minecraft.class_1799;
import net.minecraft.class_1893;
import net.minecraft.class_2680;
import net.minecraft.class_5321;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/q7.class */
public final class q7 extends _g {

    @NotNull
    public static final q7 T;
    static final /* synthetic */ KProperty[] d;

    @NotNull
    private static final cq e;

    @NotNull
    private static final cq E;

    @NotNull
    private static final cq i;

    @NotNull
    private static final cq N;
    private static int h;
    private static boolean U;
    private static long S;

    @NotNull
    private static final List P;
    private static final long a = yz.a(6547727397543396106L, -6245381199100599443L, MethodHandles.lookup().lookupClass()).a(167113169816925L);
    private static final String[] b;
    private static final String[] c;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] j;
    private static final Map k;

    /* JADX WARN: Illegal instructions before constructor call */
    private q7(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14793, 8308174372086147651L ^ j3) /* invoke-custom */, jt.I(), null, 4, null, j3 ^ 45563220508333L);
    }

    private final boolean x(long j2) {
        return ((Boolean) e.E(this, (a ^ j2) ^ 54140247592266L, d[0])).booleanValue();
    }

    private final boolean j(long j2) {
        return ((Boolean) E.E(this, (a ^ j2) ^ 21640816868228L, d[1])).booleanValue();
    }

    private final boolean C(long j2) {
        return ((Boolean) i.E(this, (a ^ j2) ^ 114187541927290L, d[2])).booleanValue();
    }

    private final boolean z(long j2) {
        return ((Boolean) N.E(this, (a ^ j2) ^ 26158746129333L, d[3])).booleanValue();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:76:0x0219
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    public final void q(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.player.PlayerUpdateEvent r11) {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q7.q(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00f1: INVOKE (r-1 I:su.catlean.q7), (r0 I:net.minecraft.class_2680), (r1 I:long), (r2 I:net.minecraft.class_1799) DIRECT call: su.catlean.q7.V(net.minecraft.class_2680, long, net.minecraft.class_1799):float
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    public final void Q(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.player.CalcBlockBreakingDeltaEvent r11) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q7.Q(su.catlean.api.event.events.player.CalcBlockBreakingDeltaEvent):void");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [int, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private final float V(class_2680 class_2680Var, long j2, class_1799 class_1799Var) {
        double d2;
        long j3 = a ^ j2;
        long j4 = j3 ^ 29276786491852L;
        boolean z = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4685069353094810738L, j3) /* invoke-custom */;
        double dMethod_7924 = class_1799Var.method_7924(class_2680Var);
        class_5321 class_5321Var = class_1893.field_9131;
        Intrinsics.checkNotNullExpressionValue(class_5321Var, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19821, 3053981408862220316L ^ j3) /* invoke-custom */);
        ?? F = lq.F(j4, class_1799Var, class_5321Var);
        try {
            int i2 = (dMethod_7924 > 1.0d ? 1 : (dMethod_7924 == 1.0d ? 0 : -1));
            if (!z) {
                d2 = ((double) i2) + 1.0d;
            } else if (i2 > 0) {
                i2 = F * F;
                d2 = ((double) i2) + 1.0d;
            } else {
                d2 = 0.0d;
            }
            return (float) Math.max(dMethod_7924 + d2, 0.0d);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F, 4719839927799843283L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:108:0x02b3
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final int T(int r12, int r13, net.minecraft.class_2338 r14) {
        /*
            Method dump skipped, instruction units count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q7.T(int, int, net.minecraft.class_2338):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean E() {
        long j2 = a ^ 39327348798814L;
        long j3 = j2 ^ 90407459075088L;
        Object objX = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7343865841726256651L, j2) /* invoke-custom */;
        try {
            objX = T.x(j3);
            return objX == 0 ? objX == 0 : objX;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, -7330055428925369835L, j2) /* invoke-custom */;
        }
    }

    static {
        int i2;
        long j2 = a ^ 85034676594000L;
        long j3 = j2 ^ 104424998981002L;
        long j4 = j2 ^ 75949434719012L;
        f = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[22];
        int i4 = 0;
        String str = "4,\u009esSË½H9g\u0090ë\u009d\u0089\u000b\u008cT(¯÷\u0004\u000b\u000f¡NÓ\u000fMë/àCx®·Á\u0093ðþ|\u009e°AáW\u0012¹2áéfÿ\\ü\u000f®xJøôE\u0087Z\u0003K\u001dç\u0014eQ\u0013Fú»\u0083°\u001dÓÙÎõÞH¹\u0018´\u000fV1¼½õ\f©¹\u0098Z®;\u001b1\u0097\u0083åà¬{\u001c\u001e6N*he£_>\u0081¨ß<í\u007fèì§é«\u00ad©ÿ¡\u0019ôÍg\u001dÍN\u0085Î\u00949ÔxB\u0015¹Ö|èº\u0013 Ù\u0094\u00ad¹Â]Q-\u0095öF\u0094íÏ9¤\u0091§[\f'\u0000~^1GE¡YZ\u00adÜ\u0018«_<ºèMþ¨\u0000£Òlé>C¯².D:ÈvRc(\\\u000e¨nåé`\u008cñ\u0099¿\u0012GL¶±%\u00ad4TÈÖ+71L\rµó\u00074µ\u00ad1¢ôÐÍîü\u00186\u0098©\u0003\u0019#\u0082Âkù\u0095ôW\u0011ÙÄµx\u009bf©\u009eÆ¾\u0010\u0004¡fÿ§Ú\u0085-sö\u0016í»9«E\u0018\u0007>\u008b\u00ad\u001aÉö=ºi\u009b\u0091`7+\u007fóð¦\u0082ÈÇ\u0088ê B÷ÊC~w\b\u008fP\u0005?V¾ã&«b\u00155Áà#6Ý£øÜ¨\u0010Né\u0005 ³N\u0092\u009d\fÊ\u008b6¥R\u001fjç_gùd7\u0096\u0083õ:I¹d\u0087A\u0002R\u001b\u001cp(\u00016nù\u00024wfé÷å6\u0091XÊVYauê^ \u0092Ø0£*-\u0006\u0012\u000fTº\u0001\u0012EbX\u0084~ \u0000\u0080\u0081)¥U\u00067\u0085y÷\u0090\u00848Uk+kí]v\u008aðe#\u008d#ÏX´Åó r\u008f\u0015\u0011ÀÒ'é\u0082i`\t&bý\u0094c\u0003\u0001\u001c§»Êy0\\ò¦F\u000bÕ\u0089\u0010\u0001\u0003\u0012\u0015Ñí\u0097£³\u0013ûwë¸8p \bR®\u008f²êp\u009a¡m.(Ý¨= ÉÏU;ôíDÍ\u0015Qß~ÓAû\u001d àx\u0005U?Él<Ú$õã\u008ePë\u00049e(Õ\u0082úføBú\fëd\u001a\u0087á(`æsE×\u00ad\u009c~ýºË ö\u001d\u00183±\n\u0002UßæI³d\u0017En7àp\u00adAM¢Û\u0089È¯\u0016\u0018\u0081\u009eÎªä+Fv\u0093S\f\u0003j´\u0089-Ò\u0088ÔîNMUÜ\u0018øÍê\u0091\u0002ù\t\u000e\u0014s\u0005B,[\u0097mS30«9¤x'\u0010îkõ\u008emcÇ{«\u008d¢t\u0084à#}";
        int length = "4,\u009esSË½H9g\u0090ë\u009d\u0089\u000b\u008cT(¯÷\u0004\u000b\u000f¡NÓ\u000fMë/àCx®·Á\u0093ðþ|\u009e°AáW\u0012¹2áéfÿ\\ü\u000f®xJøôE\u0087Z\u0003K\u001dç\u0014eQ\u0013Fú»\u0083°\u001dÓÙÎõÞH¹\u0018´\u000fV1¼½õ\f©¹\u0098Z®;\u001b1\u0097\u0083åà¬{\u001c\u001e6N*he£_>\u0081¨ß<í\u007fèì§é«\u00ad©ÿ¡\u0019ôÍg\u001dÍN\u0085Î\u00949ÔxB\u0015¹Ö|èº\u0013 Ù\u0094\u00ad¹Â]Q-\u0095öF\u0094íÏ9¤\u0091§[\f'\u0000~^1GE¡YZ\u00adÜ\u0018«_<ºèMþ¨\u0000£Òlé>C¯².D:ÈvRc(\\\u000e¨nåé`\u008cñ\u0099¿\u0012GL¶±%\u00ad4TÈÖ+71L\rµó\u00074µ\u00ad1¢ôÐÍîü\u00186\u0098©\u0003\u0019#\u0082Âkù\u0095ôW\u0011ÙÄµx\u009bf©\u009eÆ¾\u0010\u0004¡fÿ§Ú\u0085-sö\u0016í»9«E\u0018\u0007>\u008b\u00ad\u001aÉö=ºi\u009b\u0091`7+\u007fóð¦\u0082ÈÇ\u0088ê B÷ÊC~w\b\u008fP\u0005?V¾ã&«b\u00155Áà#6Ý£øÜ¨\u0010Né\u0005 ³N\u0092\u009d\fÊ\u008b6¥R\u001fjç_gùd7\u0096\u0083õ:I¹d\u0087A\u0002R\u001b\u001cp(\u00016nù\u00024wfé÷å6\u0091XÊVYauê^ \u0092Ø0£*-\u0006\u0012\u000fTº\u0001\u0012EbX\u0084~ \u0000\u0080\u0081)¥U\u00067\u0085y÷\u0090\u00848Uk+kí]v\u008aðe#\u008d#ÏX´Åó r\u008f\u0015\u0011ÀÒ'é\u0082i`\t&bý\u0094c\u0003\u0001\u001c§»Êy0\\ò¦F\u000bÕ\u0089\u0010\u0001\u0003\u0012\u0015Ñí\u0097£³\u0013ûwë¸8p \bR®\u008f²êp\u009a¡m.(Ý¨= ÉÏU;ôíDÍ\u0015Qß~ÓAû\u001d àx\u0005U?Él<Ú$õã\u008ePë\u00049e(Õ\u0082úføBú\fëd\u001a\u0087á(`æsE×\u00ad\u009c~ýºË ö\u001d\u00183±\n\u0002UßæI³d\u0017En7àp\u00adAM¢Û\u0089È¯\u0016\u0018\u0081\u009eÎªä+Fv\u0093S\f\u0003j´\u0089-Ò\u0088ÔîNMUÜ\u0018øÍê\u0091\u0002ù\t\u000e\u0014s\u0005B,[\u0097mS30«9¤x'\u0010îkõ\u008emcÇ{«\u008d¢t\u0084à#}".length();
        char cCharAt = ' ';
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
                            c = new String[22];
                            k = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[5];
                            int i10 = 0;
                            String str3 = "Ë\u0002\u0095¦\u001e£H\u0097qOm\u0007À\\=I'<y+\"3¥ï";
                            int length2 = "Ë\u0002\u0095¦\u001e£H\u0097qOm\u0007À\\=I'<y+\"3¥ï".length();
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
                                                j = new Integer[5];
                                                d = new KProperty[]{Reflection.property1(new PropertyReference1Impl(q7.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31731, 659661124407610717L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7050, 114795635198766373L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(q7.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1522, 1129085878886183775L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(279, 1504963201613313968L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(q7.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25823, 2927365482046935671L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3530, 2055736947592379233L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(q7.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24217, 6907117336803502136L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7611, 961119857474480899L ^ j2) /* invoke-custom */, 0))};
                                                T = new q7(j4);
                                                e = yp.t(T, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24671, 4379117005038737146L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23927, 7530592789552144271L ^ j2) /* invoke-custom */, null);
                                                E = yp.t(T, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32374, 2921280973803047116L ^ j2) /* invoke-custom */, true, j3, null, q7::E, 4, null);
                                                i = yp.t(T, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18152, 4676338431480918092L ^ j2) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28968, 5274086230947836886L ^ j2) /* invoke-custom */, null);
                                                N = yp.t(T, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15824, 7944993234751589229L ^ j2) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28968, 5274086230947836886L ^ j2) /* invoke-custom */, null);
                                                P = new ArrayList();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j7;
                                            if (i11 >= length2) {
                                                str3 = "§¹\u0096Âv\u0086W_Ï\u000f\u0018¶«\bE§";
                                                length2 = "§¹\u0096Âv\u0086W_Ï\u000f\u0018¶«\bE§".length();
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
                        str = "lF\u001fÓ¬Òú&1%âÈÓ\u009b\u008e\u0004USG\u008a\u0095\u0013\u0080q@}¥|\u0099\u0018s\u0006 Íï\u0082\u009c\u0017r\u00adÜ/\u008cPÙ.¶\u0081\u0085Ý÷µnç\u0018'¿!o û\u001a¸\u000fº";
                        length = "lF\u001fÓ¬Òú&1%âÈÓ\u009b\u008e\u0004USG\u008a\u0095\u0013\u0080q@}¥|\u0099\u0018s\u0006 Íï\u0082\u009c\u0017r\u00adÜ/\u008cPÙ.¶\u0081\u0085Ý÷µnç\u0018'¿!o û\u001a¸\u000fº".length();
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

    private static String b(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 15856;
        if (c[i3] == null) {
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
                c[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/q7", e2);
            }
        }
        return c[i3];
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
            java.lang.String r1 = "su/catlean/q7"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q7.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 18852;
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
                    throw new RuntimeException("su/catlean/q7", e2);
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
            java.lang.String r1 = "su/catlean/q7"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q7.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
