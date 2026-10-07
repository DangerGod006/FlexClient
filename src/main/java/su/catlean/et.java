package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/et.class */
public final class et extends _g {

    @NotNull
    public static final et P;
    static final KProperty[] g;

    @NotNull
    private static final a6 c;

    @NotNull
    private static final a6 m;

    @NotNull
    private static final a6 k;

    @NotNull
    private static final cq I;

    @NotNull
    private static final Map j;
    private static boolean d;
    private static boolean C;
    private static int a;
    private static boolean E;
    private static final long b = yz.a(7468643730345306145L, -6706891590298238627L, MethodHandles.lookup().lookupClass()).a(49911007672534L);
    private static final String[] e;
    private static final String[] f;
    private static final Map h;

    /* JADX WARN: Illegal instructions before constructor call */
    private et(long j2) {
        long j3 = b ^ j2;
        super((String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1993, 4228281837237265750L ^ j3) /* invoke-custom */, jt.v(), null, 4, null, j3 ^ 25520027361753L);
    }

    private final id P(long j2) {
        return (id) c.E(this, (b ^ j2) ^ 70998262922142L, g[0]);
    }

    private final id C(short s, long j2) {
        return (id) m.E(this, (((((long) s) << 48) | ((j2 << 16) >>> 16)) ^ b) ^ 129467196616568L, g[1]);
    }

    private final id q(long j2) {
        return (id) k.E(this, (b ^ j2) ^ 134396334240287L, g[2]);
    }

    private final boolean p(long j2) {
        return ((Boolean) I.E(this, (b ^ j2) ^ 32360748769912L, g[3])).booleanValue();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:41:0x0169
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void q(su.catlean.api.event.events.client.TickEvent r17) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.et.q(su.catlean.api.event.events.client.TickEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void R(long r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.et.R(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    private static final Unit E() {
        long j2 = b ^ 82312649539350L;
        ?? r0 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1340405339049906682L, j2) /* invoke-custom */;
        et etVar = P;
        try {
            r0 = d;
            ?? r02 = r0;
            if (r0 == 0) {
                r02 = r0 == 0 ? 1 : 0;
            }
            try {
                try {
                    d = r02;
                    r02 = d;
                    ?? r03 = r02;
                    if (r0 != 0) {
                        a = r03;
                    } else if (r02 != 0) {
                        et etVar2 = P;
                        r03 = 0;
                        a = r03;
                    }
                    return Unit.INSTANCE;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -1384180026116990021L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -1384180026116990021L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -1384180026116990021L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static final boolean A() {
        long j2 = b ^ 17770550588188L;
        Object obj = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7021031036263997964L, j2) /* invoke-custom */;
        try {
            obj = C;
            return obj == 0 ? obj == 0 : obj;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6971639761421047729L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    private static final Unit K() {
        long j2 = b ^ 42625353469045L;
        ?? r0 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2448128151657276059L, j2) /* invoke-custom */;
        et etVar = P;
        try {
            r0 = C;
            ?? r02 = r0;
            if (r0 == 0) {
                r02 = r0 == 0 ? 1 : 0;
            }
            try {
                try {
                    C = r02;
                    r02 = C;
                    ?? r03 = r02;
                    if (r0 != 0) {
                        a = r03;
                    } else if (r02 != 0) {
                        et etVar2 = P;
                        r03 = 0;
                        a = r03;
                    }
                    return Unit.INSTANCE;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -2330318683455739688L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -2330318683455739688L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -2330318683455739688L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static final boolean a() {
        long j2 = b ^ 15890803847115L;
        Object obj = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(9059176317923049179L, j2) /* invoke-custom */;
        try {
            obj = d;
            return obj == 0 ? obj == 0 : obj;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8941654302746774374L, j2) /* invoke-custom */;
        }
    }

    private static final Unit g() {
        j.clear();
        et etVar = P;
        d = false;
        et etVar2 = P;
        C = false;
        et etVar3 = P;
        a = 0;
        et etVar4 = P;
        E = false;
        return Unit.INSTANCE;
    }

    static {
        int i;
        long j2 = b ^ 61125639767691L;
        long j3 = j2 ^ 138802566681300L;
        long j4 = j2 ^ 1749143369611L;
        long j5 = j2 ^ 19085136835674L;
        h = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j2 << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[13];
        int i3 = 0;
        String str = "ÂÇ¯®üÛ#¤\u0015Ü\u0010\u0083Lw\u008c_ 49\u0003ÿ×½[\tö7\"5Ö\u0082õÖ%\u00022ª\u000e²ùo\u001c\u009bÉ\u0088(q\bà ||-\t\u0085ðZÈ¡I\u001c¨mha¢{eç×wÝÅ÷\u0019o)\bb£TK B8PàT\u000b\u0090í\u0091g\u001f¯¿Ï7ÕfS¼û²7r¹\u0018 \u0095xí\u000b\u007fG\u0010\u008f°\u0084\u0011\u0006ôh\u0089W@åH\u00950¬ÿ8\tS\u00adä*O3M\u001fC ÑEª^\u0087´y%ZÅ6S\u0095\u008cZÅG`\u0016\u0081\u0093b×\u0096\u0017W\u0085&k÷Eà\u0099\u000b?u\u0091\u009e\u0094¶®±öWß($\u0096Ý\\\u009fl6ëzÝ\u0088\u0013\u008a¯\u0098\u0081ÓCÔ°Ò\u0015Âî\n\u008e¶{pÈ,?H\u001a\u009b§\u001eo\\\u0012\u0010£\u001dÊ\u00896®ÀH\u0080\t\u0012B2ägò@Aì¡\u0089\u0019_VÛ¾%`=ÒA~\u0012¾\u001a\u0013Ñ00£\u001c\u0011á¡BèÍ\u009c\u001eÂA\u0017ÞÄö\u0007©Í\\{\u000f ±Î±o©e\u000f.pÉ±©\u007fù\u008bQ¤[?\u0018Ù/-M,kT\u0004a\u0011^ImÕ\u0011,¥\u0086\u008bÅ\u0097u\u008c¾86I2\u0014UH-ßO\\ÚÒð\u0000æþ\u008c\u001at\u0091×\u0088)q\u0088î|nâ\u008b\u0096A¬ß\u0016°\u001c\u0098PDa¨Y{\u000eÿà=_\u0015>zökÿ\t";
        int length = "ÂÇ¯®üÛ#¤\u0015Ü\u0010\u0083Lw\u008c_ 49\u0003ÿ×½[\tö7\"5Ö\u0082õÖ%\u00022ª\u000e²ùo\u001c\u009bÉ\u0088(q\bà ||-\t\u0085ðZÈ¡I\u001c¨mha¢{eç×wÝÅ÷\u0019o)\bb£TK B8PàT\u000b\u0090í\u0091g\u001f¯¿Ï7ÕfS¼û²7r¹\u0018 \u0095xí\u000b\u007fG\u0010\u008f°\u0084\u0011\u0006ôh\u0089W@åH\u00950¬ÿ8\tS\u00adä*O3M\u001fC ÑEª^\u0087´y%ZÅ6S\u0095\u008cZÅG`\u0016\u0081\u0093b×\u0096\u0017W\u0085&k÷Eà\u0099\u000b?u\u0091\u009e\u0094¶®±öWß($\u0096Ý\\\u009fl6ëzÝ\u0088\u0013\u008a¯\u0098\u0081ÓCÔ°Ò\u0015Âî\n\u008e¶{pÈ,?H\u001a\u009b§\u001eo\\\u0012\u0010£\u001dÊ\u00896®ÀH\u0080\t\u0012B2ägò@Aì¡\u0089\u0019_VÛ¾%`=ÒA~\u0012¾\u001a\u0013Ñ00£\u001c\u0011á¡BèÍ\u009c\u001eÂA\u0017ÞÄö\u0007©Í\\{\u000f ±Î±o©e\u000f.pÉ±©\u007fù\u008bQ¤[?\u0018Ù/-M,kT\u0004a\u0011^ImÕ\u0011,¥\u0086\u008bÅ\u0097u\u008c¾86I2\u0014UH-ßO\\ÚÒð\u0000æþ\u008c\u001at\u0091×\u0088)q\u0088î|nâ\u008b\u0096A¬ß\u0016°\u001c\u0098PDa¨Y{\u000eÿà=_\u0015>zökÿ\t".length();
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
                        if (i7 >= length) {
                            e = strArr;
                            f = new String[13];
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j2 << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[2];
                            int i9 = 0;
                            int length2 = "9\"\u0088\u0005\u009cV©\u00adÉé1\"Ó«\u000b\u0003".length();
                            int i10 = 0;
                            do {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = "9\"\u0088\u0005\u009cV©\u00adÉé1\"Ó«\u000b\u0003".substring(i11, i10).getBytes("ISO-8859-1");
                                i9++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i10 < length2);
                            g = new KProperty[]{Reflection.property1(new PropertyReference1Impl(et.class, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31207, 6811523541828845174L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23353, 2927895679552494761L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(et.class, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30831, 8109322662447759347L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21586, 7739857450797241280L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(et.class, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31620, 3538009082913864732L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(539, 6736721594221839750L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(et.class, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30364, 5226772255402012935L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32335, 4103526893962377681L ^ j2) /* invoke-custom */, 0))};
                            P = new et(j4);
                            c = yp.y(P, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9679, 2531852410420290133L ^ j2) /* invoke-custom */, et::E, j5, (h) null, et::A, 4, (Object) null);
                            m = yp.y(P, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8517, 2870838451557689041L ^ j2) /* invoke-custom */, et::K, j5, (h) null, et::a, 4, (Object) null);
                            k = yp.y(P, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16345, 8548883440907614278L ^ j2) /* invoke-custom */, et::g, j5, (h) null, (Function0) null, (int) jArr[0], (Object) null);
                            I = yp.t(P, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28084, 3479025062777236007L ^ j2) /* invoke-custom */, false, j3, null, null, (int) jArr[1], null);
                            j = new LinkedHashMap();
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i12 = i3;
                        i3++;
                        strArr[i12] = strIntern;
                        int i13 = i5 + cCharAt;
                        i4 = i13;
                        if (i13 < length) {
                        }
                        str = "äñ²\u0092\u0085Í\u009cÛ~ºí\u0007\u0095÷?æ\u0089\r_¦Ðj\u001f\rÌñ\u0007ûÞ ñ;\u0018Í½\r\u0010|í\u009fpí\u001da·É|§{õêý\u0006\u0019¾\u0087©";
                        length = "äñ²\u0092\u0085Í\u009cÛ~ºí\u0007\u0095÷?æ\u0089\r_¦Ðj\u001f\rÌñ\u0007ûÞ ñ;\u0018Í½\r\u0010|í\u009fpí\u001da·É|§{õêý\u0006\u0019¾\u0087©".length();
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

    private static String b(int i, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j2 & 32767))) ^ 21406;
        if (f[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) h.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                f[i2] = b(((Cipher) objArr[0]).doFinal(e[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/et", e2);
            }
        }
        return f[i2];
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
            java.lang.String r1 = "su/catlean/et"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.et.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
