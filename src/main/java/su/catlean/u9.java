package su.catlean;

import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.Paths;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/u9.class */
public final class u9 extends _g {

    @NotNull
    public static final u9 j;

    @NotNull
    private static final ConcurrentLinkedQueue h;
    private static float k;
    private static float o;
    private static int z;
    private static File C;
    private static final long a = yz.a(-3861804502198670543L, 1664545703830537933L, MethodHandles.lookup().lookupClass()).a(196643281548153L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /* JADX WARN: Illegal instructions before constructor call */
    private u9(long j2, int i) {
        long j3 = ((j2 << 32) | ((((long) i) << 32) >>> 32)) ^ a;
        super((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5083, 8034592981909320521L ^ j3) /* invoke-custom */, jt.Q(), null, 4, null, j3 ^ 13223303563131L);
    }

    public final int I() {
        return z;
    }

    public final void D(int i) {
        z = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v23, types: [su.catlean.u9] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    @Override // su.catlean._g
    public void O(long j2) throws Throwable {
        Object obj;
        long j3 = j2 ^ 57052227101120L;
        int i = (int) (j2 >>> 48);
        int i2 = (int) ((j3 << 16) >>> 48);
        int i3 = (int) ((j3 << 32) >>> 32);
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2637436620605547178L, j2) /* invoke-custom */;
        C = new File(Paths.get(System.getProperty((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16916, 5115675174131519535L ^ j2) /* invoke-custom */), (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11358, 2752747992024235617L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12542, 4064620560689242831L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18469, 3534238944222763548L ^ j2) /* invoke-custom */).toString());
        Object obj2 = str;
        if (obj2 != null) {
            try {
                try {
                    obj2 = C;
                    obj = obj2;
                    if (j2 > 0) {
                        obj = obj2;
                        if (obj2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4373, 2442415122106647330L ^ j2) /* invoke-custom */);
                            obj = 0;
                        }
                    }
                } catch (NumberFormatException unused) {
                    throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, 2611324011044272197L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, 2611324011044272197L, j2) /* invoke-custom */;
            }
        } else {
            obj = 0;
        }
        try {
            if (!obj.exists()) {
                obj = this;
                obj.k((char) i, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8434, 9082751542458462912L ^ j2) /* invoke-custom */, (short) i2, i3);
            }
            if (j2 >= 0) {
                Object obj3 = str;
                if (obj3 != null) {
                    return;
                }
                try {
                    obj3 = new _g[3];
                    vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj3, 2605814174822968852L, j2) /* invoke-custom */;
                } catch (NumberFormatException unused3) {
                    throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj3, 2611324011044272197L, j2) /* invoke-custom */;
                }
            }
        } catch (NumberFormatException unused4) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2611324011044272197L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0127  */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v109, types: [su.catlean._g] */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v118 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, net.minecraft.class_1657] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void w(su.catlean.api.event.events.player.PlayerUpdateEvent r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u9.w(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.u9] */
    /* JADX WARN: Type inference failed for: r0v6, types: [long] */
    private final void k(char c2, String str, short s, int i) throws Throwable {
        long j2 = (((((long) c2) << 48) | ((((long) s) << 48) >>> 16)) | ((((long) i) << 32) >>> 32)) ^ a;
        Object obj = j2;
        long j3 = obj ^ 108329047932303L;
        try {
            h.add(str);
            if (h.size() >= (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19616, 8549953618824859350L ^ j2) /* invoke-custom */) {
                obj = this;
                obj.Y(j3);
            }
        } catch (NumberFormatException unused) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 5371484617726596851L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00c8: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r12 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_LEAVE], block:B:37:0x00c8 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00ca: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r13 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:38:0x00ca */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    private final void Y(long j2) {
        Closeable closeable;
        Throwable th;
        ?? r0;
        long j3 = a ^ j2;
        Object fileWriter = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8706970750732320485L, j3) /* invoke-custom */;
        try {
            File file = C;
            if (file == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32709, 6602188190160171447L ^ j3) /* invoke-custom */);
                file = null;
            }
            try {
                fileWriter = new FileWriter(file, true);
                Closeable closeable2 = (Closeable) fileWriter;
                FileWriter fileWriter2 = (FileWriter) closeable2;
                while (true) {
                    if (h.isEmpty()) {
                        r0 = 0;
                    } else {
                        r0 = 1;
                        r0 = 1;
                        r0 = 1;
                        if (j3 <= 0 || fileWriter != null) {
                        }
                    }
                    if (r0 == 0) {
                        break;
                    }
                    fileWriter2.append((CharSequence) h.poll());
                    fileWriter2.append((CharSequence) "\n");
                    r0 = fileWriter;
                    if (r0 == 0) {
                        if (j3 > 0) {
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(closeable2, null);
            } catch (Throwable th2) {
                CloseableKt.closeFinally(closeable, th);
                throw th2;
            }
        } catch (IOException e2) {
            System.out.println((Object) ((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15893, 6070678813608603744L ^ j3) /* invoke-custom */ + e2.getMessage()));
        }
    }

    static {
        int i;
        long j2 = a ^ 27147447471585L;
        long j3 = j2 >>> 32;
        int i2 = (int) (((j2 ^ 58838879902275L) << 32) >>> 32);
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[15];
        int i4 = 0;
        String str = "q¨gØ²£åmØÀxoI\fþ\u009b$'Ì2%·¢\u008e\u0099Ëz¢\u0007\u009f\u009e7\u0010NëÐ³}\u008c=ÐäP\u0093Õ2\n¸ú\u0018Lì©P4\u0095_f\u001e)»¬ã ?¹5óoëÎ\u0083\u0006b@ÒR#v#a\u008bî?wL\t\u007fþ$ R\"\u0019Q\u009aK\u001d\u0089ð\u0006*Ü \t\u001d#äo#ígjß\u0090Ø\rë\u009dDìò]`@jF\bÇí\u0086ù©Y±ÿÙ\u008d¥ HÜ\u0002^NÝºiýD¿Ø¾i\u009e=âß\u000b\u0099ËS!\u0004\u0017«\u001c\u001cd\u009e¢/(\u0000\u0089S\u0086\u00ad\u0017ÚgTmTj÷YrÇ«\u0012ÜjMÎ±K\f\u0099,TM-\u008c\u000fñª÷í%)0V\u0010s¯ýÆÙôc\u008a\u009f=/tg\u009f{r(\u0014?Æ¥¥\u0011Bìü¥\u009cÂ=C\u001aR\u009b\u008e.~Súä7ôA\u0000ý\u000b,±°\u0004ÓaÅÇ°\rU\u0010ü6+X¦}z7\u0094FÌa\u000fî\u009bÍ(\u0098Ó9\u009c¤p N\f5í\u0007R}T¾>°»©8Æ\u0084\u009c\u0006£J¼~ø\u001c#°Bµ\u008a\u0090plÝ \u0083\u0085 \u001a\u0007IQ«H]Æµ\fÚ\u008cðø/@\nBï²\u0086Å<CY.xæ\u0095Űq6í`>\u0011l\"`#\u0095ÃL{Á\u001a,MÜT\u0014W¿r\u0098?*\u0094à\u0082\u001b4\u0017(£2â×ü\u009a\u0099©åeõ\u0001U©Ö]%\u0006\u0086!3Dïú÷»ÐW¾¶÷MRËü]þ\u009c`ë·¼\u000b\u0005\u0018ú\u0002ænv\u00056õ\u009eEÖÒ3vê/·è\u001f\u008c\nÑò\u008b×>\u0002\"\u0093\u0003Â'¦á\u0080ÄL\u0099.^\u0017Ü\u0094K£\u00845\u008f\u0011Ô[°Ù2·\f$$/5\u0080÷QÕ,kÇÉ-Qù|[ò\"\u0010ã\u0016Â\u0003S½\u00820Ð\u0017\u0096+\u008b¬æS¸¬ÚNh¾æ§ñó\rkÓÍàøkÎÇH\u0088÷ÌiàØT)Ãë\fÕÈE\u0012\u0085\u0019ts¦\u009c¤\u00ad<ð\u0019Øý\u001d£Í\u008d\u0083Z>`/d°t¿AgÜ\u008d-ÓF}^\u0088©~å\t\u000bÎýM\u0092µ\u001cG|aL^\u0014§¢\u0096\f\u00ad@\u0018ëáëW³ÿß=Sº\rSÆÃ\u0095)3¥?\u0091\u0083Ô×-\u0088\u0007¨jÙ\u001bZ-d¸Y£fÃ\u0080~ùÆ\u000e«û\u0090\u0007YX\\?|Ì!Ç¬¶\u008eÔÊò5 \u0092Âíx²ìÄñ}B{Ì\u0000\u008d\u001f0Ä÷\u00ad¤\f üÂ\u0016\u0086\u0085\u0005\u0096Dö¼Î~OïÀ\u00ad#\u0010Ð_zzw,p\u0095\u0082ÆE9\u0005óº?";
        int length = "q¨gØ²£åmØÀxoI\fþ\u009b$'Ì2%·¢\u008e\u0099Ëz¢\u0007\u009f\u009e7\u0010NëÐ³}\u008c=ÐäP\u0093Õ2\n¸ú\u0018Lì©P4\u0095_f\u001e)»¬ã ?¹5óoëÎ\u0083\u0006b@ÒR#v#a\u008bî?wL\t\u007fþ$ R\"\u0019Q\u009aK\u001d\u0089ð\u0006*Ü \t\u001d#äo#ígjß\u0090Ø\rë\u009dDìò]`@jF\bÇí\u0086ù©Y±ÿÙ\u008d¥ HÜ\u0002^NÝºiýD¿Ø¾i\u009e=âß\u000b\u0099ËS!\u0004\u0017«\u001c\u001cd\u009e¢/(\u0000\u0089S\u0086\u00ad\u0017ÚgTmTj÷YrÇ«\u0012ÜjMÎ±K\f\u0099,TM-\u008c\u000fñª÷í%)0V\u0010s¯ýÆÙôc\u008a\u009f=/tg\u009f{r(\u0014?Æ¥¥\u0011Bìü¥\u009cÂ=C\u001aR\u009b\u008e.~Súä7ôA\u0000ý\u000b,±°\u0004ÓaÅÇ°\rU\u0010ü6+X¦}z7\u0094FÌa\u000fî\u009bÍ(\u0098Ó9\u009c¤p N\f5í\u0007R}T¾>°»©8Æ\u0084\u009c\u0006£J¼~ø\u001c#°Bµ\u008a\u0090plÝ \u0083\u0085 \u001a\u0007IQ«H]Æµ\fÚ\u008cðø/@\nBï²\u0086Å<CY.xæ\u0095Űq6í`>\u0011l\"`#\u0095ÃL{Á\u001a,MÜT\u0014W¿r\u0098?*\u0094à\u0082\u001b4\u0017(£2â×ü\u009a\u0099©åeõ\u0001U©Ö]%\u0006\u0086!3Dïú÷»ÐW¾¶÷MRËü]þ\u009c`ë·¼\u000b\u0005\u0018ú\u0002ænv\u00056õ\u009eEÖÒ3vê/·è\u001f\u008c\nÑò\u008b×>\u0002\"\u0093\u0003Â'¦á\u0080ÄL\u0099.^\u0017Ü\u0094K£\u00845\u008f\u0011Ô[°Ù2·\f$$/5\u0080÷QÕ,kÇÉ-Qù|[ò\"\u0010ã\u0016Â\u0003S½\u00820Ð\u0017\u0096+\u008b¬æS¸¬ÚNh¾æ§ñó\rkÓÍàøkÎÇH\u0088÷ÌiàØT)Ãë\fÕÈE\u0012\u0085\u0019ts¦\u009c¤\u00ad<ð\u0019Øý\u001d£Í\u008d\u0083Z>`/d°t¿AgÜ\u008d-ÓF}^\u0088©~å\t\u000bÎýM\u0092µ\u001cG|aL^\u0014§¢\u0096\f\u00ad@\u0018ëáëW³ÿß=Sº\rSÆÃ\u0095)3¥?\u0091\u0083Ô×-\u0088\u0007¨jÙ\u001bZ-d¸Y£fÃ\u0080~ùÆ\u000e«û\u0090\u0007YX\\?|Ì!Ç¬¶\u008eÔÊò5 \u0092Âíx²ìÄñ}B{Ì\u0000\u008d\u001f0Ä÷\u00ad¤\f üÂ\u0016\u0086\u0085\u0005\u0096Dö¼Î~OïÀ\u00ad#\u0010Ð_zzw,p\u0095\u0082ÆE9\u0005óº?".length();
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
                        i = i8;
                        if (i8 >= length) {
                            b = strArr;
                            c = new String[15];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[3];
                            int i10 = 0;
                            int length2 = "\u0091Û(\u009at\fÉ§ÂF\n\\\u0094\u001c¯=àõ8»\tZ94".length();
                            int i11 = 0;
                            do {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = "\u0091Û(\u009at\fÉ§ÂF\n\\\u0094\u001c¯=àõ8»\tZ94".substring(i12, i11).getBytes("ISO-8859-1");
                                i10++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i11 < length2);
                            e = jArr;
                            f = new Integer[3];
                            j = new u9(j3, i2);
                            h = new ConcurrentLinkedQueue();
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i13 = i4;
                        i4++;
                        strArr[i13] = strIntern;
                        int i14 = i6 + cCharAt;
                        i5 = i14;
                        if (i14 < length) {
                        }
                        str = "oÕ*C`ÇÙ¼\u000eÿ¥\u0082È\u0098\u001d\u008c\u008eqØg¨\u0010\u0092ÂÉ\u0080\u0017*\u0003WÏ\u0095ìLCB\u008eÄÔ/.\u0011h}*ô¸Ã\u0098EýZ\u007f·Z\u0013ú¹ÀZX\u0084ÉÎÃ-=\u0002b9õKÜ\u0092-÷\u001eIGÀÝ\\£øUøÙí\u0006C\u008e>¶?ì\u0089õ\u0017Y«\u009f1²rN\u0098óI\u0099qE§Z'zê0Ø³k î\u0097v\u0085n²Ûi§\u009dà\u0085\u009e¼.\u0094\u009fîjä×É\u00905\u0096\u00963\u0099ÅB;\\";
                        length = "oÕ*C`ÇÙ¼\u000eÿ¥\u0082È\u0098\u001d\u008c\u008eqØg¨\u0010\u0092ÂÉ\u0080\u0017*\u0003WÏ\u0095ìLCB\u008eÄÔ/.\u0011h}*ô¸Ã\u0098EýZ\u007f·Z\u0013ú¹ÀZX\u0084ÉÎÃ-=\u0002b9õKÜ\u0092-÷\u001eIGÀÝ\\£øUøÙí\u0006C\u008e>¶?ì\u0089õ\u0017Y«\u009f1²rN\u0098óI\u0099qE§Z'zê0Ø³k î\u0097v\u0085n²Ûi§\u009dà\u0085\u009e¼.\u0094\u009fîjä×É\u00905\u0096\u00963\u0099ÅB;\\".length();
                        cCharAt = 'x';
                        i = -1;
                        break;
                        break;
                }
                i6 = i + 1;
                strSubstring = str.substring(i6, i6 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i5);
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

    private static String b(int i, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j2 & 32767))) ^ 14135;
        if (c[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i2] = b(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/u9", e2);
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
            r1 = 11446(0x2cb6, float:1.6039E-41)
            r2 = 0
            long r1 = r1 & r2
            r-1.asCollector(r0, r1)
            r0 = 0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r9
            r2[r3] = r4
            java.lang.invoke.MethodHandles.insertArguments(r-1, r0, r1)
            r0 = r10
            java.lang.invoke.MethodHandles.explicitCastArguments(r-1, r0)
            r-2.setTarget(r-1)
            goto L62
            r12 = r-3
            java.lang.RuntimeException r-3 = new java.lang.RuntimeException
            r-2 = r-3
            java.lang.StringBuilder r-1 = new java.lang.StringBuilder
            r0 = r-1
            r0.<init>()
            java.lang.String r0 = "su/catlean/u9"
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r9
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r-1.append(r0)
            r-1.toString()
            r0 = r12
            r-2.<init>(r-1, r0)
            throw r-3
            r-2 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u9.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j2) {
        int i2 = (i ^ ((int) (j2 & 32767))) ^ 2511;
        if (f[i2] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) g.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/u9", e2);
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
            r1 = 11446(0x2cb6, float:1.6039E-41)
            r2 = 0
            long r1 = r1 & r2
            r-1.asCollector(r0, r1)
            r0 = 0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r9
            r2[r3] = r4
            java.lang.invoke.MethodHandles.insertArguments(r-1, r0, r1)
            r0 = r10
            java.lang.invoke.MethodHandles.explicitCastArguments(r-1, r0)
            r-2.setTarget(r-1)
            goto L62
            r12 = r-3
            java.lang.RuntimeException r-3 = new java.lang.RuntimeException
            r-2 = r-3
            java.lang.StringBuilder r-1 = new java.lang.StringBuilder
            r0 = r-1
            r0.<init>()
            java.lang.String r0 = "su/catlean/u9"
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r9
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r-1.append(r0)
            r-1.toString()
            r0 = r12
            r-2.<init>(r-1, r0)
            throw r-3
            r-2 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u9.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
