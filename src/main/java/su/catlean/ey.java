package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ey.class */
public final class ey extends _g {

    @NotNull
    public static final ey e;
    static final /* synthetic */ KProperty[] i;

    @NotNull
    private static final c8 x;

    @NotNull
    private static final cq t;

    @NotNull
    private static final cq b;

    @NotNull
    private static final cq D;

    @NotNull
    private static final cq F;

    @NotNull
    private static final cq Y;
    private static final long a = yz.a(-3387130272169361882L, -2414784297375456455L, MethodHandles.lookup().lookupClass()).a(213877211474L);
    private static final String[] c;
    private static final String[] d;
    private static final Map f;

    /* JADX WARN: Illegal instructions before constructor call */
    private ey(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21908, 5416723877694526080L ^ j2) /* invoke-custom */, jt.v(), null, 4, null, j2 ^ 137364041830288L);
    }

    private final int s(long j) {
        return ((Number) x.E(this, (a ^ j) ^ 3844009921486L, i[0])).intValue();
    }

    private final boolean i(long j) {
        return ((Boolean) t.E(this, (a ^ j) ^ 86012477722242L, i[1])).booleanValue();
    }

    private final void U(boolean z, byte b2, long j) {
        t.b(this, (((((long) b2) << 56) | ((j << 8) >>> 8)) ^ a) ^ 68512067867607L, i[1], Boolean.valueOf(z));
    }

    public final boolean F(long j) {
        return ((Boolean) b.E(this, (a ^ j) ^ 58663763077555L, i[2])).booleanValue();
    }

    public final void w(boolean z, long a2) {
        b.b(this, (a ^ a2) ^ 20691599727055L, i[2], Boolean.valueOf(z));
    }

    private final boolean W(long j) {
        return ((Boolean) D.E(this, (a ^ j) ^ 53332848059583L, i[3])).booleanValue();
    }

    private final void j(boolean z, long j) {
        D.b(this, (a ^ j) ^ 81061986037013L, i[3], Boolean.valueOf(z));
    }

    private final boolean R(long j) {
        return ((Boolean) F.E(this, (a ^ j) ^ 137950163874155L, i[4])).booleanValue();
    }

    private final void a(boolean z, long j) {
        F.b(this, (a ^ j) ^ 51711925389355L, i[4], Boolean.valueOf(z));
    }

    public final boolean a(long j) {
        return ((Boolean) Y.E(this, (a ^ j) ^ 7069781025109L, i[5])).booleanValue();
    }

    public final void T(long a2, boolean z) {
        long j = a ^ a2;
        long j2 = j ^ 124798123949971L;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7248091008064681807L, j) /* invoke-custom */;
        try {
            Y.b(this, j2, i[5], Boolean.valueOf(z));
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7289801739622382523L, j) /* invoke-custom */ != null) {
                iArr = new int[3];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(iArr, 7340610017976819036L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(iArr, 7301909341651939252L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0142 A[Catch: NumberFormatException -> 0x015e, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x015e, blocks: (B:36:0x0139, B:38:0x0142), top: B:53:0x0139 }] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [su.catlean.mixins.accessors.MinecraftAccessor] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v31, types: [su.catlean.mixins.accessors.MinecraftAccessor] */
    /* JADX WARN: Type inference failed for: r0v35, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.player.PlayerUpdateEvent r10) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ey.g(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3 A[Catch: NumberFormatException -> 0x0101, NumberFormatException -> 0x0111, TRY_ENTER, TryCatch #3 {NumberFormatException -> 0x0101, blocks: (B:50:0x00f3, B:48:0x00e9, B:49:0x00f2, B:41:0x00cb, B:44:0x00d9, B:45:0x00e2), top: B:67:0x00c8, outer: #4, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8 A[EXC_TOP_SPLITTER, PHI: r0 r1
  0x00c8: PHI (r0v22 ??) = (r0v40 ??), (r0v41 ??), (r0v36 ??) binds: [B:21:0x0077, B:23:0x007c, B:37:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00c8: PHI (r1v22 net.minecraft.class_1792) = (r1v21 net.minecraft.class_1792), (r1v21 net.minecraft.class_1792), (r1v31 net.minecraft.class_1792) binds: [B:21:0x0077, B:23:0x007c, B:37:0x00b7] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean n(net.minecraft.class_1792 r8, long r9) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ey.n(net.minecraft.class_1792, long):boolean");
    }

    static {
        int i2;
        long j = a ^ 42569103263097L;
        long j2 = j ^ 129686218740905L;
        long j3 = j ^ 99322228677071L;
        long j4 = j ^ 135706464492080L;
        f = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[24];
        int i4 = 0;
        String str = "öÖ\u008cYJ÷¡\u009f\u0013\u009f\u008d\u0099º\u0096\u001bÙâ!ÜT.>\u0015$ä2}ú¡Nüõ\u0088\u0002M9\u00985ª¾D¤\n÷\rè\u0098_¬¬xôèZ:És~Ó\rù\bÈ\u0002©ò|\u001f\u009bõ\u0090,]Ybè¼«\u000e7\u0003\u009e\\\u001aóü\u0086X®\u0015¦9WMý\u0015Io¼Öt±=\u0017\u000e<y×\u0001ê\u0005\u007fß\b¬$Ð\u0089[·\u0016\u00058Z¬\f<iTFíl\u0088uð_v®<u\u0005¶æ7bÔ\u0017V\u0000aV\u0004ÃôQØ\u0010º\u0088+à\u0098¦\u0019]-Låú\u0010Á\\ËûO\u001cLÝÐ\u000b\u0003Vj+\u00ad÷\u00100ú\u0098'O#ø\u0086^ü\u0098tå\u0016þ\u008f\u00186\u0098wðA\u0000\u009bÞófÈ7µH¤\u001a\u0081Â\u0019áÙÉ\u0087*\u0088ËP\u0090È\u001b\u008c\u0002N½]ãr\u009d8ø¢fåq®g\u000f\u0092J\u0090óRÊ\u008b\u0087Dp\u001cÉ=\u0097*\u008aÎtY\u00043É\bm¥øÙú¢{²5\u0002&§4¨\u000f¯P\u008a¾ßm\u001d_\u009f?%kÌ©À.üó6aíÙeÌÎm\u001b\u0097Ap\u0082l±@\u001f¥c1\u009eØ¤ÜÂ»{Ìì¥ügJè'\u0087ºQä\u008f;Áay0ê\u0001;\u009e¦x¿Z7½Æ½¶\u0010\u000f/§Íbû9W7¨Äüz\u0002e¢ §0NÛ\u0007¦éiÿ¦Hö\u000bsd\u0012\u0010E\u0092!\u0004/\"a\u001c¢ïÚ>;\u0016)\u0018ç\u001e¸\f?ÿy\u0099[LòäqÉÿ¬dÛI)·º\u0014/\u0010ü¤â\u0089ü\u0013Ó\u0001\u009aú²9\u000f·\u00ad0\u0010H\u0085§bÙð×x£Lì0eö¹y Ò®ñÑ¥§\u008fó_4\u008e Í±í\u0088ZV\u0014î\u0085\u0002ËG+»V\u0005½½Eo\u0010- ghÄ¼ø»\u0019\u00015½H0\u0004\u001a OÔ\u0097\u0099Ó*\u000euÑá5¯ gë¢q×À\u001aÁÒ\u001dKû¹\u0015î·í@²\u0010ä\u008f]xwb³\u001fAuléæ|N\u0082\u0010\u0005g=¸Gcó\u001dè÷2g\u0084î\u0014ô\u0010&ü\tOü%u\u0000\u0013Ë·²\u0007Ó\u0015ö\u0088á$Ë;q\u0016Ejg¦\u0095úm9\u0015àÉúúõ\u0010ñÁm,¥, RðvK'\u0094\rÛ@EÛ\u009dbÊÉý\u001aê6Wýô\u009a²Ë\u0004\u0092Äa©\t\u0087\u001dRÇq\u009bxuËÕ\u008f}7Z|4±ß\u0011\u0089^&]ßôfÝµ}hVg\u0016ý¸ÄL\u001eãÉ\u0086bæ\u0089§ÐÂ;\u0088³W}úöBWÑ\u0016Ö$ë\u0090\u0001¸\u001aÅ§g\u0081âÎ+Æ©t¬: Ö4â²©±0\u0003\b\u001aÉÎo¥,\\tÍ\u0018\u0094\u008cú\u0099L§#[×\u0084h¹\u0017\u0018Î\u0004vÈ¬Ç¶§\u0012nË\u008cZsÙÿßa\u0087\u009cÆU\u001bú\u0018\u0001{¡O»ÑúÆ\u0019iDU\u0089\u0004Òù\u0003\\0t\tôÃ«\u0010¨\u0096kºJ\u0085ÊmÙ\u008a[Á|fL\u009d";
        int length = "öÖ\u008cYJ÷¡\u009f\u0013\u009f\u008d\u0099º\u0096\u001bÙâ!ÜT.>\u0015$ä2}ú¡Nüõ\u0088\u0002M9\u00985ª¾D¤\n÷\rè\u0098_¬¬xôèZ:És~Ó\rù\bÈ\u0002©ò|\u001f\u009bõ\u0090,]Ybè¼«\u000e7\u0003\u009e\\\u001aóü\u0086X®\u0015¦9WMý\u0015Io¼Öt±=\u0017\u000e<y×\u0001ê\u0005\u007fß\b¬$Ð\u0089[·\u0016\u00058Z¬\f<iTFíl\u0088uð_v®<u\u0005¶æ7bÔ\u0017V\u0000aV\u0004ÃôQØ\u0010º\u0088+à\u0098¦\u0019]-Låú\u0010Á\\ËûO\u001cLÝÐ\u000b\u0003Vj+\u00ad÷\u00100ú\u0098'O#ø\u0086^ü\u0098tå\u0016þ\u008f\u00186\u0098wðA\u0000\u009bÞófÈ7µH¤\u001a\u0081Â\u0019áÙÉ\u0087*\u0088ËP\u0090È\u001b\u008c\u0002N½]ãr\u009d8ø¢fåq®g\u000f\u0092J\u0090óRÊ\u008b\u0087Dp\u001cÉ=\u0097*\u008aÎtY\u00043É\bm¥øÙú¢{²5\u0002&§4¨\u000f¯P\u008a¾ßm\u001d_\u009f?%kÌ©À.üó6aíÙeÌÎm\u001b\u0097Ap\u0082l±@\u001f¥c1\u009eØ¤ÜÂ»{Ìì¥ügJè'\u0087ºQä\u008f;Áay0ê\u0001;\u009e¦x¿Z7½Æ½¶\u0010\u000f/§Íbû9W7¨Äüz\u0002e¢ §0NÛ\u0007¦éiÿ¦Hö\u000bsd\u0012\u0010E\u0092!\u0004/\"a\u001c¢ïÚ>;\u0016)\u0018ç\u001e¸\f?ÿy\u0099[LòäqÉÿ¬dÛI)·º\u0014/\u0010ü¤â\u0089ü\u0013Ó\u0001\u009aú²9\u000f·\u00ad0\u0010H\u0085§bÙð×x£Lì0eö¹y Ò®ñÑ¥§\u008fó_4\u008e Í±í\u0088ZV\u0014î\u0085\u0002ËG+»V\u0005½½Eo\u0010- ghÄ¼ø»\u0019\u00015½H0\u0004\u001a OÔ\u0097\u0099Ó*\u000euÑá5¯ gë¢q×À\u001aÁÒ\u001dKû¹\u0015î·í@²\u0010ä\u008f]xwb³\u001fAuléæ|N\u0082\u0010\u0005g=¸Gcó\u001dè÷2g\u0084î\u0014ô\u0010&ü\tOü%u\u0000\u0013Ë·²\u0007Ó\u0015ö\u0088á$Ë;q\u0016Ejg¦\u0095úm9\u0015àÉúúõ\u0010ñÁm,¥, RðvK'\u0094\rÛ@EÛ\u009dbÊÉý\u001aê6Wýô\u009a²Ë\u0004\u0092Äa©\t\u0087\u001dRÇq\u009bxuËÕ\u008f}7Z|4±ß\u0011\u0089^&]ßôfÝµ}hVg\u0016ý¸ÄL\u001eãÉ\u0086bæ\u0089§ÐÂ;\u0088³W}úöBWÑ\u0016Ö$ë\u0090\u0001¸\u001aÅ§g\u0081âÎ+Æ©t¬: Ö4â²©±0\u0003\b\u001aÉÎo¥,\\tÍ\u0018\u0094\u008cú\u0099L§#[×\u0084h¹\u0017\u0018Î\u0004vÈ¬Ç¶§\u0012nË\u008cZsÙÿßa\u0087\u009cÆU\u001bú\u0018\u0001{¡O»ÑúÆ\u0019iDU\u0089\u0004Òù\u0003\\0t\tôÃ«\u0010¨\u0096kºJ\u0085ÊmÙ\u008a[Á|fL\u009d".length();
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
                            c = strArr;
                            d = new String[24];
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[4];
                            int i10 = 0;
                            String str3 = "w¯Ó\u001c¾àDQ\u00074c^¬+ý^";
                            int length2 = "w¯Ó\u001c¾àDQ\u00074c^¬+ý^".length();
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
                                                KProperty[] kPropertyArr = new KProperty[(int) jArr[2]];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(ey.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6064, 6223883987246256366L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4176, 5581760584393856789L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(ey.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18954, 7394621859384413535L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12081, 4113668425330141281L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(ey.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9205, 2412031772577014948L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7315, 5834233796083030992L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(ey.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11107, 3586155048298687527L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25893, 611055964811125366L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(ey.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29663, 8833586640500323485L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21895, 3734465447548506845L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(ey.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1731, 8273638773555331460L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5737, 3990830759319900478L ^ j) /* invoke-custom */, 0));
                                                i = kPropertyArr;
                                                e = new ey(j4);
                                                x = yp.L(e, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13120, 2341102253630141464L ^ j) /* invoke-custom */, 1, new IntRange(0, 4), j2, null, null, (int) jArr[3], null);
                                                t = yp.t(e, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3918, 5162023240836122650L ^ j) /* invoke-custom */, false, j3, null, null, (int) jArr[1], null);
                                                b = yp.t(e, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25676, 4567158609707393809L ^ j) /* invoke-custom */, false, j3, null, null, (int) jArr[0], null);
                                                D = yp.t(e, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10679, 4291427398237957864L ^ j) /* invoke-custom */, false, j3, null, null, (int) jArr[0], null);
                                                F = yp.t(e, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17513, 671028987977286448L ^ j) /* invoke-custom */, false, j3, null, null, (int) jArr[0], null);
                                                Y = yp.t(e, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5557, 4114235602847666926L ^ j) /* invoke-custom */, true, j3, null, null, (int) jArr[0], null);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j7;
                                            if (i11 >= length2) {
                                                str3 = "dâSÂ\u0091\u009aí0§¯(èqòÔé";
                                                length2 = "dâSÂ\u0091\u009aí0§¯(èqòÔé".length();
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
                        str = "\u0002$XSiå\u001dYz\u0012?±_\u0091\u0010\u001e\u0004=Ãê\u0083\u0097\u009cgXê*Ç`\u0019ã\u0098\u001a æõPt\u0093»TÚ\f\u0019\u008aªÍ`ß\u0002ÐK\u0092y/ë\u0014ã\u009eÀ¼ÛQmÚ\u0091a3*°/Ó³sæJNÏq\u001bt)ÅÛç\r\u0012ì\u0095\u0001RPÓ9äYú3¢6µ\n\u0084·Å_\u009aD«í\u001eÛìòcäXKî\u009b§äf.Ó\u0017Õ·\u0018ÉæÔÌ\u001cpt.Ø\u009d\u0011Ö,;ó\u0011\u0084Km¬Öã\u0098U";
                        length = "\u0002$XSiå\u001dYz\u0012?±_\u0091\u0010\u001e\u0004=Ãê\u0083\u0097\u009cgXê*Ç`\u0019ã\u0098\u001a æõPt\u0093»TÚ\f\u0019\u008aªÍ`ß\u0002ÐK\u0092y/ë\u0014ã\u009eÀ¼ÛQmÚ\u0091a3*°/Ó³sæJNÏq\u001bt)ÅÛç\r\u0012ì\u0095\u0001RPÓ9äYú3¢6µ\n\u0084·Å_\u009aD«í\u001eÛìòcäXKî\u009b§äf.Ó\u0017Õ·\u0018ÉæÔÌ\u001cpt.Ø\u009d\u0011Ö,;ó\u0011\u0084Km¬Öã\u0098U".length();
                        cCharAt = 128;
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 22602;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = b(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/ey", e2);
            }
        }
        return d[i3];
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
            java.lang.String r1 = "su/catlean/ey"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ey.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
