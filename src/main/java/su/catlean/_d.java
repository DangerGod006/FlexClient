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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_d.class */
public class _d extends _3 {
    static final KProperty[] c;

    @NotNull
    private final az m;

    @NotNull
    private final cq n;
    private static String W;
    private static final long h = yz.a(-8127311394969466936L, 6317689863304216677L, MethodHandles.lookup().lookupClass()).a(182394309137271L);
    private static final String[] t;
    private static final String[] w;
    private static final Map y;
    private static final long[] B;
    private static final Integer[] F;
    private static final Map I;

    /* JADX WARN: Illegal instructions before constructor call */
    public _d(@NotNull String id, @NotNull fu category, long a) {
        long j = h ^ a;
        Intrinsics.checkNotNullParameter(id, (String) c(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2978, 2402558699367189460L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(category, (String) c(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(755, 5743247958583657099L ^ j) /* invoke-custom */);
        super(id, category, (int) f(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9785, 1270252356590231664L ^ j) /* invoke-custom */, j ^ 50769434288698L, true);
        String strC = (String) c(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9334, 336354224589399055L ^ j) /* invoke-custom */;
        class_2248 class_2248Var = class_2246.field_10540;
        Intrinsics.checkNotNullExpressionValue(class_2248Var, (String) c(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9922, 3792305215497917L ^ j) /* invoke-custom */);
        this.m = yp.y(this, strC, j ^ 121360109164928L, new dg(CollectionsKt.mutableListOf(class_2248Var), j ^ 102610374016516L), (h) null, (Function0) null, (int) f(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25850, 8182678803628696241L ^ j) /* invoke-custom */, (Object) null);
        this.n = yp.t(this, (String) c(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24008, 8098755472193854909L ^ j) /* invoke-custom */, true, j ^ 9814060001265L, null, null, (int) f(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16568, 4799897242665486069L ^ j) /* invoke-custom */, null);
    }

    private final dg T(long j) {
        return (dg) this.m.E(this, (h ^ j) ^ 924903946947L, c[0]);
    }

    private final void A(long j, dg dgVar) {
        this.m.b(this, (h ^ j) ^ 25016170929703L, c[0], dgVar);
    }

    public final boolean i(short s, int i, short s2) {
        return ((Boolean) this.n.E(this, ((((((long) s) << 48) | ((((long) i) << 32) >>> 16)) | ((((long) s2) << 48) >>> 48)) ^ h) ^ 19904277150562L, c[1])).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v46, types: [double] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.minecraft.class_1657] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83, types: [net.minecraft.class_1657] */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r50v1, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(int r17, @org.jetbrains.annotations.Nullable net.minecraft.class_1657 r18, int r19) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._d.J(int, net.minecraft.class_1657, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    @Override // su.catlean._3
    protected boolean m(@NotNull class_1297 crystal, long a) {
        int i = (int) (a >>> 56);
        long j = ((a ^ 75096564203215L) << 8) >>> 8;
        long j2 = a ^ 124027046021740L;
        long j3 = a ^ 42888259370702L;
        Object obj = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3173053555865120790L, a) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(crystal, (String) c(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3302, 349728123617591312L ^ a) /* invoke-custom */);
        try {
            obj = ((la.K(la.l, J((byte) i, j, crystal), zf.v(j3), 0, false, null, false, (int) f(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21031, 9017006915881638125L ^ a) /* invoke-custom */, null, j2) + 4.0f) > (zf.v(j3).method_6032() + zf.v(j3).method_6067()) ? 1 : ((la.K(la.l, J((byte) i, j, crystal), zf.v(j3), 0, false, null, false, (int) f(MethodHandles.lookup(), "o", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21031, 9017006915881638125L ^ a) /* invoke-custom */, null, j2) + 4.0f) == (zf.v(j3).method_6032() + zf.v(j3).method_6067()) ? 0 : -1));
            return obj == 0 ? obj < 0 : obj;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 3176127326945981668L, a) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:91:0x02a5
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final java.util.List x(net.minecraft.class_2338 r13, long r14, java.util.Set r16) {
        /*
            Method dump skipped, instruction units count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._d.x(net.minecraft.class_2338, long, java.util.Set):java.util.List");
    }

    @Override // su.catlean._3
    @NotNull
    protected List R(long j) {
        return T(j ^ 139471251167438L).e();
    }

    static {
        int i;
        long j = h ^ 96205042373378L;
        y = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("dqgH3", 4585743270880088197L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[14];
        int i3 = 0;
        String str = "ø¼7HCÆNÂ³\u0006(¶ÔNK¹Á'Y\u0093\u000es`S MYÄ+\u0098oÀïxÊ\u0080Æ(<\u008a\u0087\u0019X¢¾\u001dÍÀ¾÷Ï<ÍFÔµ\u000e\u0018\u0099 \u007f¼î\u008cÜ\u0011t¨5)\u0091K7píg'sØ}Ê\u009b Þ2ò½\"%É\\lñÿ\u009f\u0091G[\u0011 °È_ºJ¸B1WÁ\u00886Â\u0000ê\u0018\u008aàß!Y¨uFÕ£ExBÚûGl>\n\u0080ß\u0002áZ \u0002·\u0012è&\u000bÂv`\u001f?Ô|q~\u009f´\u008cöK\u0087ñKÅH\u0000SÔtõ\u008a\u0090 W\u0082ÑÅSÜ\u0086[ìô¹ñ\u0014¿^\b\u0019ýL¸ÕG\u008bey[\u0012\u00ad\u0085ÄhQ\u0010\u0012Ä=$tà\u009e¤Z[\u001c\u0018\u0094õ6\u008d\u0010¾B\u0013Úð4,~ËÕ*T(\u009eëõ(I\u001eõá½\u0019¤O=óì\u008b¬Ó×Ciz<³£Ä©\u0010ùûÜõÜ2ÐÂ\u0093¸úpÝ~Æw\u0010£p\r×ÜÞÙ*òÍ\f\u0098§\u008c5Ë\u0018¦irÆ'~ì®Ô¦\u0080b×m\u0094èJñÔÑÔª M";
        int length = "ø¼7HCÆNÂ³\u0006(¶ÔNK¹Á'Y\u0093\u000es`S MYÄ+\u0098oÀïxÊ\u0080Æ(<\u008a\u0087\u0019X¢¾\u001dÍÀ¾÷Ï<ÍFÔµ\u000e\u0018\u0099 \u007f¼î\u008cÜ\u0011t¨5)\u0091K7píg'sØ}Ê\u009b Þ2ò½\"%É\\lñÿ\u009f\u0091G[\u0011 °È_ºJ¸B1WÁ\u00886Â\u0000ê\u0018\u008aàß!Y¨uFÕ£ExBÚûGl>\n\u0080ß\u0002áZ \u0002·\u0012è&\u000bÂv`\u001f?Ô|q~\u009f´\u008cöK\u0087ñKÅH\u0000SÔtõ\u008a\u0090 W\u0082ÑÅSÜ\u0086[ìô¹ñ\u0014¿^\b\u0019ýL¸ÕG\u008bey[\u0012\u00ad\u0085ÄhQ\u0010\u0012Ä=$tà\u009e¤Z[\u001c\u0018\u0094õ6\u008d\u0010¾B\u0013Úð4,~ËÕ*T(\u009eëõ(I\u001eõá½\u0019¤O=óì\u008b¬Ó×Ciz<³£Ä©\u0010ùûÜõÜ2ÐÂ\u0093¸úpÝ~Æw\u0010£p\r×ÜÞÙ*òÍ\f\u0098§\u008c5Ë\u0018¦irÆ'~ì®Ô¦\u0080b×m\u0094èJñÔÑÔª M".length();
        char cCharAt = 24;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = c(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            t = strArr;
                            w = new String[14];
                            I = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[6];
                            int i9 = 0;
                            String str3 = "\u0007IBvm)\nxT\u0014;æ¡\u0013)5)o+^ðf\u001aé±Ì°ó5:7í";
                            int length2 = "\u0007IBvm)\nxT\u0014;æ¡\u0013)5)o+^ðf\u001aé±Ì°ó5:7í".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b3 = -1;
                                while (true) {
                                    byte b4 = b3;
                                    long j3 = j2;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b4] = j4;
                                            if (i10 >= length2) {
                                                B = jArr;
                                                F = new Integer[6];
                                                c = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(_d.class, (String) c(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2266, 4214197281517262780L ^ j) /* invoke-custom */, (String) c(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7706, 794424868788584816L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(_d.class, (String) c(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24400, 1084156864402358324L ^ j) /* invoke-custom */, (String) c(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3804, 4674419198276030899L ^ j) /* invoke-custom */, 0))};
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b4] = j4;
                                            if (i10 >= length2) {
                                                str3 = "fûoì_\u001fà½Õîsús»\u009fÕ";
                                                length2 = "fûoì_\u001fà½Õîsús»\u009fÕ".length();
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
                                    j2 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b3 = 0;
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
                        str = "\u009cà\u0090zË\u000e\u0089=¹\u0087\u0082RD¢\b.Ý\u0086ÇÀ.\u008c\u001f]æx\u0002\u0085t>øÉ~\u008e´Ð\u000b\u008c\u0013¢^bM\u0097æ\u0016¥YBA\u0014,ä¸Y¦/þ\u0081:¹íÈÀ0¿\u0096×\u0007M\bù}òoÏÚA¦@ÂÆ\u001fzÿë¢§\u0016áì9WáñQËj\nh+Î\u008bf\u0098x\u0012`5õÓIo";
                        length = "\u009cà\u0090zË\u000e\u0089=¹\u0087\u0082RD¢\b.Ý\u0086ÇÀ.\u008c\u001f]æx\u0002\u0085t>øÉ~\u008e´Ð\u000b\u008c\u0013¢^bM\u0097æ\u0016¥YBA\u0014,ä¸Y¦/þ\u0081:¹íÈÀ0¿\u0096×\u0007M\bù}òoÏÚA¦@ÂÆ\u001fzÿë¢§\u0016áì9WáñQËj\nh+Î\u008bf\u0098x\u0012`5õÓIo".length();
                        cCharAt = '@';
                        i = -1;
                        break;
                        break;
                }
                i5 = i + 1;
                strSubstring = str.substring(i5, i5 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i4);
        }
    }

    public static void s(String str) {
        W = str;
    }

    public static String I() {
        return W;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String c(byte[] bArr) {
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

    private static String c(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 24925;
        if (w[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) y.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    y.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                w[i2] = c(((Cipher) objArr[0]).doFinal(t[i2].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/_d", e);
            }
        }
        return w[i2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strC), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strC;
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
            java.lang.String r1 = "su/catlean/_d"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._d.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int f(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 26475;
        if (F[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) B[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) I.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    I.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/_d", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            F[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return F[i2].intValue();
    }

    private static int f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iF = f(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iF)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iF;
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
    private static java.lang.invoke.CallSite f(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
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
            java.lang.String r1 = "su/catlean/_d"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._d.f(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
