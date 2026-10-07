package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qn.class */
public final class qn extends _g {

    @NotNull
    public static final qn T;
    static final KProperty[] F;

    @NotNull
    private static final cq y;

    @NotNull
    private static final cr L;

    @NotNull
    private static final cq E;

    @NotNull
    private static final cr h;

    @NotNull
    private static final c8 w;

    @NotNull
    private static final c8 k;
    private static int B;
    private static int o;
    private static int t;

    @NotNull
    private static final Map i;
    private static final long a = yz.a(-138202280622548393L, -2141329995444132828L, MethodHandles.lookup().lookupClass()).a(46941064862638L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /* JADX WARN: Illegal instructions before constructor call */
    private qn(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2367, 3776990658550450266L ^ j2) /* invoke-custom */, jt.d(), null, 4, null, j2 ^ 127844023890049L);
    }

    private final boolean v(int i2, byte b2, int i3) {
        return ((Boolean) y.E(this, ((((((long) i2) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i3) << 40) >>> 40)) ^ a) ^ 115513059508759L, F[0])).booleanValue();
    }

    private final nv j(long j, short s) {
        return (nv) L.E(this, (((j << 16) | ((((long) s) << 48) >>> 48)) ^ a) ^ 58343887442551L, F[1]);
    }

    private final void x(int i2, int i3, nv nvVar) {
        L.b(this, (((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ a) ^ 126621541478793L, F[1], nvVar);
    }

    private final boolean n(long j) {
        return ((Boolean) E.E(this, (a ^ j) ^ 58901912870214L, F[2])).booleanValue();
    }

    private final nv C(long j) {
        return (nv) h.E(this, (a ^ j) ^ 70161647135556L, F[3]);
    }

    private final void k(nv nvVar, long j) {
        h.b(this, (a ^ j) ^ 104605068236502L, F[3], nvVar);
    }

    private final int r(long j) {
        return ((Number) w.E(this, (a ^ j) ^ 65732019230786L, F[4])).intValue();
    }

    private final void e(long j, int i2) {
        w.b(this, (a ^ j) ^ 66350457440789L, F[4], Integer.valueOf(i2));
    }

    private final int W(long j) {
        return ((Number) k.E(this, (a ^ j) ^ 99282917084553L, F[5])).intValue();
    }

    private final void I(long j, int i2) {
        k.b(this, (a ^ j) ^ 85050731708825L, F[5], Integer.valueOf(i2));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x01cd: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void B(su.catlean.api.event.events.player.PlayerUpdateEvent r15) {
        /*
            Method dump skipped, instruction units count: 1387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qn.B(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final boolean u(short r11, net.minecraft.class_1914 r12, int r13, short r14) {
        /*
            Method dump skipped, instruction units count: 911
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qn.u(short, net.minecraft.class_1914, int, short):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private static final boolean Y(Map.Entry entry) {
        long j = a ^ 13718662720570L;
        long j2 = j ^ 47752741298346L;
        Intrinsics.checkNotNullParameter(entry, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(216, 6285188353011946027L ^ j) /* invoke-custom */);
        Object objIntValue = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8284832206069662573L, j) /* invoke-custom */;
        try {
            try {
                objIntValue = zf.v(j2).field_6012 - ((Number) entry.getValue()).intValue();
                return objIntValue != 0 ? objIntValue > (int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30869, 5028172680403847107L ^ j) /* invoke-custom */ : objIntValue;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objIntValue, 8237663412821226955L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objIntValue, 8237663412821226955L, j) /* invoke-custom */;
        }
    }

    private static final boolean t(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private static final Unit b(class_1297 class_1297Var) {
        long j = a ^ 132067645927766L;
        long j2 = j ^ 3391788082448L;
        zf.Z((int) (j >>> 32), ((j ^ 73204923288777L) << 32) >>> 32).method_2905(zf.v(j ^ 104492397051334L), class_1297Var, class_1268.field_5808);
        qn qnVar = T;
        t = class_1297Var.method_5628();
        qn qnVar2 = T;
        B = T.r(j2);
        return Unit.INSTANCE;
    }

    static {
        int i2;
        long j = a ^ 140279868252631L;
        long j2 = j ^ 47167450792335L;
        long j3 = j ^ 6906967601955L;
        long j4 = j ^ 95414414342021L;
        long j5 = j ^ 104536872909050L;
        long j6 = j ^ 123921819268508L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[28];
        int i4 = 0;
        String str = "Ê1á\u000eýY\u0091\u008a×}[c\u0004\u0094È¹\u009f\u001af\u0094\u000e\u0007\u0094ð\u0010eÙ[¶Ï\u0019#$qeY\u0000\u0010\u0097\u0090o\u0010ÜÕ\u001e\u0091ÆöÙäY{ÙÖB¹î4\u0018Å/\bb@h²\u0085aÝ»\u009eIXÛ\u0012\u0085Ó\\¹½\u0005\u0081. üu\u009b¬3\u008d`\u0097\u0099\u0014¬.ÈL&\u001a\u008c$¾@Ã}ÞëKú¡\u0080û¶\u001b²\u0018oünÉgÌ\u0001áöT\u0088]mà\u009d¼/\u009c\u008dp\u001bZ\u007f+\u0018³½È\u008ct\u009fãj9\u0097±u\u009d8\u0005\u0082\u008f¼gØ>\u007f\u0088\u0011 Ágóç\u0000þ\u0010Ý\u0081\u001f2Çª'\u000b(\u0004\u0088í!\u0010±mâdëáàHò<ðEõ\u0019 É?Ù\u001bElÑ18ó9$\u0004È];Awol¯âw5aÿ\u0081ë\u009fý`\u0092¦ \u0000ÕÇ¤\u001c\u0090ÀO§Hª¸æÚúÒWî\u0013\u0003nZØ\u0012¦R<\u009c=1p\u0090O]\u001f4ë°\u0086áu\u0090À\u008e\u0081©¤M4î»hä£î°\u0090\u009a#<èÌp9xað\nYyf¢Â\u0081ÏÙ\u0001¡üJÙ\u0015õVé\u009aò-7\u00028PïEë³\u0011êþý\u009aK}éîv\\\u0083×Å\u008d\r¨\f\u0099Ä½B¼rvP\u0018´Ò¯x¾e=X\u0005\u0002<\u0087\u00028¢DÀ8eµ:ó2Ø BÄm¸mh\rÖÖ\u0091\u009d®\u000bUñdð»Êç)½ÄÖêü\u009d\u001d¨³\u0010Ý ³\u008b\u001dÃ´hËx«ó\u000e\u0094í\u0019³BM$\u009e\b\u009aÛ÷\u008cf÷H\u0013íAXY HcÖ\u001c&gØ\u0097©ºÑÍ\u0000TÍÚø¤UÖÁ\u0096<5uíß\u008b\u0084\u008b\u001dÙ\u0018\u0015\u008a¥G\u001e3\u0093ô\u009dr¯\u008eïûGÅo\u001ayaJgO\u008d\u0018\u009by³ë>ïc¾\u001fí\f\u001cÈe0\u009fq:\u001c¹WÛÒ\u0089 \u000e\u0014ç\u00996G\u0085P\u0094\u0080±\u0099\u0016\u001c\u0097\u009a\u0000K\u0091¯$g\u008d^\u000eÿ>cp7ùø\u0018a\u008f\u0081\\æÖsçrúL{%/r\u0011ï\"\u0007Î\u0093EÊN\u0018C\n\u0017\u009d\u0087 Æ\u0012eõ¦\r \u0000\u001e\u0083\u0097\u0091a'Ï¿¢\u001c\u0010L´_\u0014·¨0\f£\r\u00188åt\u00059 \u009c\u0080Ò5a\t\u008d#V\u0083ÔàzÐÒã\u0019¤)ì÷¾é7ÞöVx\u00916\u001b}\u0018d;åÙ\n\u009aÆ?\u0004éÈ\u0090X\u0013ëc\u00043¸¨_ \u008b\u0016(¾ý\u0097W\u0090qÏ¬ùNîtYw¸\u000fªxfd\"\u000bseû\u001d&ß§~¿EØ þ\u0018FAø\u009c \u009a\u0088\u0019±óÒ[\u009eò6ÒM S\u008c\u001e\u0014cC\u008b.kg\u000b8A\u0003\u0014ø*xß QKì}\r\u009e\u001e\u0005Ö>ÛH¾Å\u0086mgnp&\u0082K\u0004¿\u0098½ðÈj\u0001ÔÒ0B±2¼AAíÍf4¶0&` \u009f\u001a\u0007ª;~QÖäâü\u0005\u009f\u007f-\u007fÇ½Î5cm\u0002tráÍþ\u001c\u0091í2C\u0010\u0086r0ý\u0084ÁÞ\u0011°\u0091ìõD¶Ï¿(º\u0090\u008eêp\u000bE!¼\u0088Cé\u0080ÐnÏi@:à\u001e\u000e\u008ds'M\u001a¡G\u0095\u0019é\u0010sú2j¨2ñ";
        int length = "Ê1á\u000eýY\u0091\u008a×}[c\u0004\u0094È¹\u009f\u001af\u0094\u000e\u0007\u0094ð\u0010eÙ[¶Ï\u0019#$qeY\u0000\u0010\u0097\u0090o\u0010ÜÕ\u001e\u0091ÆöÙäY{ÙÖB¹î4\u0018Å/\bb@h²\u0085aÝ»\u009eIXÛ\u0012\u0085Ó\\¹½\u0005\u0081. üu\u009b¬3\u008d`\u0097\u0099\u0014¬.ÈL&\u001a\u008c$¾@Ã}ÞëKú¡\u0080û¶\u001b²\u0018oünÉgÌ\u0001áöT\u0088]mà\u009d¼/\u009c\u008dp\u001bZ\u007f+\u0018³½È\u008ct\u009fãj9\u0097±u\u009d8\u0005\u0082\u008f¼gØ>\u007f\u0088\u0011 Ágóç\u0000þ\u0010Ý\u0081\u001f2Çª'\u000b(\u0004\u0088í!\u0010±mâdëáàHò<ðEõ\u0019 É?Ù\u001bElÑ18ó9$\u0004È];Awol¯âw5aÿ\u0081ë\u009fý`\u0092¦ \u0000ÕÇ¤\u001c\u0090ÀO§Hª¸æÚúÒWî\u0013\u0003nZØ\u0012¦R<\u009c=1p\u0090O]\u001f4ë°\u0086áu\u0090À\u008e\u0081©¤M4î»hä£î°\u0090\u009a#<èÌp9xað\nYyf¢Â\u0081ÏÙ\u0001¡üJÙ\u0015õVé\u009aò-7\u00028PïEë³\u0011êþý\u009aK}éîv\\\u0083×Å\u008d\r¨\f\u0099Ä½B¼rvP\u0018´Ò¯x¾e=X\u0005\u0002<\u0087\u00028¢DÀ8eµ:ó2Ø BÄm¸mh\rÖÖ\u0091\u009d®\u000bUñdð»Êç)½ÄÖêü\u009d\u001d¨³\u0010Ý ³\u008b\u001dÃ´hËx«ó\u000e\u0094í\u0019³BM$\u009e\b\u009aÛ÷\u008cf÷H\u0013íAXY HcÖ\u001c&gØ\u0097©ºÑÍ\u0000TÍÚø¤UÖÁ\u0096<5uíß\u008b\u0084\u008b\u001dÙ\u0018\u0015\u008a¥G\u001e3\u0093ô\u009dr¯\u008eïûGÅo\u001ayaJgO\u008d\u0018\u009by³ë>ïc¾\u001fí\f\u001cÈe0\u009fq:\u001c¹WÛÒ\u0089 \u000e\u0014ç\u00996G\u0085P\u0094\u0080±\u0099\u0016\u001c\u0097\u009a\u0000K\u0091¯$g\u008d^\u000eÿ>cp7ùø\u0018a\u008f\u0081\\æÖsçrúL{%/r\u0011ï\"\u0007Î\u0093EÊN\u0018C\n\u0017\u009d\u0087 Æ\u0012eõ¦\r \u0000\u001e\u0083\u0097\u0091a'Ï¿¢\u001c\u0010L´_\u0014·¨0\f£\r\u00188åt\u00059 \u009c\u0080Ò5a\t\u008d#V\u0083ÔàzÐÒã\u0019¤)ì÷¾é7ÞöVx\u00916\u001b}\u0018d;åÙ\n\u009aÆ?\u0004éÈ\u0090X\u0013ëc\u00043¸¨_ \u008b\u0016(¾ý\u0097W\u0090qÏ¬ùNîtYw¸\u000fªxfd\"\u000bseû\u001d&ß§~¿EØ þ\u0018FAø\u009c \u009a\u0088\u0019±óÒ[\u009eò6ÒM S\u008c\u001e\u0014cC\u008b.kg\u000b8A\u0003\u0014ø*xß QKì}\r\u009e\u001e\u0005Ö>ÛH¾Å\u0086mgnp&\u0082K\u0004¿\u0098½ðÈj\u0001ÔÒ0B±2¼AAíÍf4¶0&` \u009f\u001a\u0007ª;~QÖäâü\u0005\u009f\u007f-\u007fÇ½Î5cm\u0002tráÍþ\u001c\u0091í2C\u0010\u0086r0ý\u0084ÁÞ\u0011°\u0091ìõD¶Ï¿(º\u0090\u008eêp\u000bE!¼\u0088Cé\u0080ÐnÏi@:à\u001e\u000e\u008ds'M\u001a¡G\u0095\u0019é\u0010sú2j¨2ñ".length();
        char cCharAt = 24;
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
                            c = new String[28];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[10];
                            int i10 = 0;
                            String str3 = "Ê¢5÷¶\u0094obE>\n:ô\u007fëå\f\u008eiúJçá\u008fIKäÛÉòö\u0089\u0081\u001d¼®ß¨`\u0016\u0006f\u009cÁS°\\CãàA¸¾\"\u0018ñ\u0013Äxø\u0090\u0004+\u0012";
                            int length2 = "Ê¢5÷¶\u0094obE>\n:ô\u007fëå\f\u008eiúJçá\u008fIKäÛÉòö\u0089\u0081\u001d¼®ß¨`\u0016\u0006f\u009cÁS°\\CãàA¸¾\"\u0018ñ\u0013Äxø\u0090\u0004+\u0012".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j7 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j8 = j7;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j8 >>> 56), (byte) (j8 >>> 48), (byte) (j8 >>> 40), (byte) (j8 >>> 32), (byte) (j8 >>> 24), (byte) (j8 >>> 16), (byte) (j8 >>> 8), (byte) j8});
                                    long j9 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j9;
                                            if (i11 >= length2) {
                                                e = jArr;
                                                f = new Integer[10];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24517, 3054365827505909106L ^ j) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(qn.class, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18175, 9121812089763502589L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27213, 7753638750233113931L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(qn.class, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15932, 7017811033981542708L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5702, 984418426830506306L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(qn.class, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2422, 6742609088967661181L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27360, 7763101799333344736L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(qn.class, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15422, 8142163776882500397L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7199, 8162975841142457092L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(qn.class, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7929, 4437453681003381240L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11439, 5796020614436909989L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(qn.class, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14580, 5369781264047695853L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25922, 5481655905627290181L ^ j) /* invoke-custom */, 0));
                                                F = kPropertyArr;
                                                T = new qn(j2);
                                                y = yp.t(T, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8757, 344316997750619431L ^ j) /* invoke-custom */, true, j5, null, null, (int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15116, 8980645450314451390L ^ j) /* invoke-custom */, null);
                                                L = yp.j(j3, T, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4107, 368598612955320083L ^ j) /* invoke-custom */, new nv((List) null, 1, j4, (DefaultConstructorMarker) null), null, null, (int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25112, 5133770966011105451L ^ j) /* invoke-custom */, null);
                                                E = yp.t(T, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21809, 6467802360457136672L ^ j) /* invoke-custom */, false, j5, null, null, (int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25112, 5133770966011105451L ^ j) /* invoke-custom */, null);
                                                h = yp.j(j3, T, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14193, 6203816328541464686L ^ j) /* invoke-custom */, new nv((List) null, 1, j4, (DefaultConstructorMarker) null), null, null, (int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25112, 5133770966011105451L ^ j) /* invoke-custom */, null);
                                                w = yp.L(T, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(144, 2789093565802798986L ^ j) /* invoke-custom */, (int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25112, 5133770966011105451L ^ j) /* invoke-custom */, new IntRange(0, (int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29214, 2411764343729340580L ^ j) /* invoke-custom */), j6, null, null, (int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30520, 8831396357608424846L ^ j) /* invoke-custom */, null);
                                                k = yp.L(T, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21623, 3072184440719870823L ^ j) /* invoke-custom */, 3, new IntRange(0, (int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15627, 1533450988512579519L ^ j) /* invoke-custom */), j6, null, null, (int) c(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1434, 1058756743311046442L ^ j) /* invoke-custom */, null);
                                                i = new LinkedHashMap();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j9;
                                            if (i11 >= length2) {
                                                str3 = "»¼ bu,!\u009faÞårQ·&\r";
                                                length2 = "»¼ bu,!\u009faÞårQ·&\r".length();
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
                                    j7 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "ôá2¼\u007fx8Zâ>\u0095Á¾Ð\u0011\u008fLF³Wï×¯Ýë\u0086ßS¢\u0087\u0099ÒqZ\u008d\u0011³\u0002¢ö«\u0011\u0005<,³êÖ\u008a\u0091½|¨\u0000Z\u0092\u0010\u009dN9ÅèÝÍAÔâ\u0088%W\u0002¬\u0094";
                        length = "ôá2¼\u007fx8Zâ>\u0095Á¾Ð\u0011\u008fLF³Wï×¯Ýë\u0086ßS¢\u0087\u0099ÒqZ\u008d\u0011³\u0002¢ö«\u0011\u0005<,³êÖ\u008a\u0091½|¨\u0000Z\u0092\u0010\u009dN9ÅèÝÍAÔâ\u0088%W\u0002¬\u0094".length();
                        cCharAt = '8';
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 24891;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/qn", e2);
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
            java.lang.String r1 = "su/catlean/qn"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qn.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 3227;
        if (f[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) g.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/qn", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            f[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return f[i3].intValue();
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
            java.lang.String r1 = "su/catlean/qn"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qn.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
