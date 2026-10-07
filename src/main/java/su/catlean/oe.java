package su.catlean;

import java.io.File;
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
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/oe.class */
public final class oe extends o3 {

    @NotNull
    private final mx i;

    @NotNull
    private final File A;
    public jn E;
    public List r;
    private static String[] V;
    private static final long a = yz.a(-2121960723099750115L, 1228622568344113646L, MethodHandles.lookup().lookupClass()).a(146311957694098L);
    private static final String[] c;
    private static final String[] d;
    private static final Map h;
    private static final long[] m;
    private static final Integer[] n;
    private static final Map o;

    /* JADX WARN: Illegal instructions before constructor call */
    public oe(char a2, @NotNull Json json, int a3, short a4, @NotNull mx sharedSource) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ a;
        long j2 = j ^ 75309697505251L;
        Intrinsics.checkNotNullParameter(json, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24151, 3752514497001220329L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(sharedSource, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32152, 2888416035141503790L ^ j) /* invoke-custom */);
        super((int) (j >>> 32), (short) ((j2 << 32) >>> 48), (char) ((j2 << 48) >>> 48), json);
        this.i = sharedSource;
        this.A = new File(mj.v(), (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12081, 7193043355343460736L ^ j) /* invoke-custom */);
    }

    @Override // su.catlean.o3
    @NotNull
    public File U() {
        return this.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean.jn] */
    @NotNull
    public final jn n(long j) throws Exception {
        Object obj = a ^ j;
        try {
            obj = this.E;
            if (obj != 0) {
                return obj;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7861, 1276177270542834936L ^ obj) /* invoke-custom */);
            return null;
        } catch (NumberFormatException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6935571002737522472L, obj) /* invoke-custom */;
        }
    }

    public final void A(long a2, @NotNull jn jnVar) {
        Intrinsics.checkNotNullParameter(jnVar, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20679, 4954144263578893310L ^ (a ^ a2)) /* invoke-custom */);
        this.E = jnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [long] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    @NotNull
    public final List K(int i, char c2, int i2) throws Exception {
        Object obj = (((((long) i) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) i2) << 48) >>> 48)) ^ a;
        try {
            obj = this.r;
            if (obj != 0) {
                return obj;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(886, 203079720869997376L ^ obj) /* invoke-custom */);
            return null;
        } catch (NumberFormatException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 5350016243378117975L, obj) /* invoke-custom */;
        }
    }

    public final void H(long a2, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10415, 3769592400345057707L ^ (a ^ a2)) /* invoke-custom */);
        this.r = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da A[Catch: Exception -> 0x029c, TryCatch #4 {Exception -> 0x029c, blocks: (B:3:0x006e, B:4:0x007c, B:10:0x0099, B:15:0x00b0, B:24:0x00df, B:84:0x0289, B:32:0x00fd, B:35:0x0125, B:36:0x0133, B:49:0x0176, B:50:0x017f, B:46:0x015b, B:51:0x0180, B:54:0x0197, B:52:0x018d, B:53:0x0196, B:44:0x0151, B:45:0x015a, B:57:0x019f, B:59:0x01d9, B:60:0x01e2, B:62:0x01ec, B:63:0x021c, B:73:0x0255, B:74:0x025e, B:75:0x025f, B:80:0x027a, B:81:0x0283, B:29:0x00f1, B:30:0x00fa, B:16:0x00b6, B:17:0x00bf, B:19:0x00c3, B:23:0x00da, B:21:0x00d3, B:22:0x00d9, B:13:0x00a6, B:14:0x00af, B:8:0x008f, B:9:0x0098), top: B:123:0x006e, inners: #0, #2, #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd A[Catch: Exception -> 0x029c, PHI: r0
  0x00fd: PHI (r0v59 java.io.File[]) = (r0v58 java.io.File[]), (r0v134 java.io.File[]) binds: [B:26:0x00e8, B:31:0x00fb] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {Exception -> 0x029c, blocks: (B:3:0x006e, B:4:0x007c, B:10:0x0099, B:15:0x00b0, B:24:0x00df, B:84:0x0289, B:32:0x00fd, B:35:0x0125, B:36:0x0133, B:49:0x0176, B:50:0x017f, B:46:0x015b, B:51:0x0180, B:54:0x0197, B:52:0x018d, B:53:0x0196, B:44:0x0151, B:45:0x015a, B:57:0x019f, B:59:0x01d9, B:60:0x01e2, B:62:0x01ec, B:63:0x021c, B:73:0x0255, B:74:0x025e, B:75:0x025f, B:80:0x027a, B:81:0x0283, B:29:0x00f1, B:30:0x00fa, B:16:0x00b6, B:17:0x00bf, B:19:0x00c3, B:23:0x00da, B:21:0x00d3, B:22:0x00d9, B:13:0x00a6, B:14:0x00af, B:8:0x008f, B:9:0x0098), top: B:123:0x006e, inners: #0, #2, #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125 A[Catch: Exception -> 0x029c, TryCatch #4 {Exception -> 0x029c, blocks: (B:3:0x006e, B:4:0x007c, B:10:0x0099, B:15:0x00b0, B:24:0x00df, B:84:0x0289, B:32:0x00fd, B:35:0x0125, B:36:0x0133, B:49:0x0176, B:50:0x017f, B:46:0x015b, B:51:0x0180, B:54:0x0197, B:52:0x018d, B:53:0x0196, B:44:0x0151, B:45:0x015a, B:57:0x019f, B:59:0x01d9, B:60:0x01e2, B:62:0x01ec, B:63:0x021c, B:73:0x0255, B:74:0x025e, B:75:0x025f, B:80:0x027a, B:81:0x0283, B:29:0x00f1, B:30:0x00fa, B:16:0x00b6, B:17:0x00bf, B:19:0x00c3, B:23:0x00da, B:21:0x00d3, B:22:0x00d9, B:13:0x00a6, B:14:0x00af, B:8:0x008f, B:9:0x0098), top: B:123:0x006e, inners: #0, #2, #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d9 A[Catch: Exception -> 0x029c, TryCatch #4 {Exception -> 0x029c, blocks: (B:3:0x006e, B:4:0x007c, B:10:0x0099, B:15:0x00b0, B:24:0x00df, B:84:0x0289, B:32:0x00fd, B:35:0x0125, B:36:0x0133, B:49:0x0176, B:50:0x017f, B:46:0x015b, B:51:0x0180, B:54:0x0197, B:52:0x018d, B:53:0x0196, B:44:0x0151, B:45:0x015a, B:57:0x019f, B:59:0x01d9, B:60:0x01e2, B:62:0x01ec, B:63:0x021c, B:73:0x0255, B:74:0x025e, B:75:0x025f, B:80:0x027a, B:81:0x0283, B:29:0x00f1, B:30:0x00fa, B:16:0x00b6, B:17:0x00bf, B:19:0x00c3, B:23:0x00da, B:21:0x00d3, B:22:0x00d9, B:13:0x00a6, B:14:0x00af, B:8:0x008f, B:9:0x0098), top: B:123:0x006e, inners: #0, #2, #7, #9 }] */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v116, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v117, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v125 */
    /* JADX WARN: Type inference failed for: r0v131 */
    /* JADX WARN: Type inference failed for: r0v137, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v138 */
    /* JADX WARN: Type inference failed for: r0v139 */
    /* JADX WARN: Type inference failed for: r0v140 */
    /* JADX WARN: Type inference failed for: r0v142 */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [su.catlean.oe] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.oe] */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Override // su.catlean.co
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(long r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 925
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.oe.w(long):void");
    }

    @Override // su.catlean.co
    public void h(int i, int i2, byte b) throws Exception {
        long j = (((long) i) << 32) | ((((long) i2) << 40) >>> 32) | ((((long) b) << 56) >>> 56);
        long j2 = j ^ 15103071977056L;
        int i3 = (int) (j >>> 32);
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7463364205943846071L, j) /* invoke-custom */;
        for (jn jnVar : K(i3, (char) ((j2 << 32) >>> 48), (int) ((j2 << 48) >>> 48))) {
            File file = new File(U(), jnVar.w() + (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20741, 8782746056624395371L ^ j) /* invoke-custom */);
            file.createNewFile();
            Json jsonV = V();
            try {
                jsonV.getSerializersModule();
                FilesKt.writeText$default(file, jsonV.encodeToString(jn.U.J(), jnVar), null, 2, null);
                do {
                    String str2 = str;
                    if (i2 > 0) {
                        if (str2 != null) {
                            return;
                        } else {
                            str2 = str;
                        }
                    }
                    if (str2 != null) {
                    }
                } while (i2 < 0);
                return;
            } catch (NumberFormatException unused) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file, 7449365944779960329L, j) /* invoke-custom */;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x015f, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x023d -> B:32:0x01d8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(@org.jetbrains.annotations.NotNull java.util.List r11, long r12, @org.jetbrains.annotations.NotNull java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.oe.V(java.util.List, long, java.lang.String):void");
    }

    private static final boolean x(String str, jn jnVar) {
        Intrinsics.checkNotNullParameter(jnVar, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28120, 5456164594512657495L ^ (a ^ 135660907667900L)) /* invoke-custom */);
        return Intrinsics.areEqual(jnVar.w(), str);
    }

    private static final boolean Z(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static void Q(String[] strArr) {
        V = strArr;
    }

    public static String[] X() {
        return V;
    }

    static {
        int i;
        long j = a ^ 85593917996963L;
        h = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[2], -1301942896624354949L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[13];
        int i3 = 0;
        String str = "y\u009av\u0083\u008bÂB¦ÜÎï\u001fu¶6\u001b\u0010O=O°\t÷=\u008cÃd\u0007¹ÃIñ\u0017 \u0099æo{!j\u0098>k¯õW¿¾\\ýa°K\u001c2h¬bëÎFd¹Ù¸\u0017\u0010>þà\u008e\u0088ûô\bÞ\n=ÛKÝêø\u0010Tè¤xÖÅF¢ù:4C\u0092/n\u000e\u0010\u0088/\u00192ë¨àX%\u009fù\u0019Îéh\u000e\u0010+`>L¸k<\u0091\u0087«×2ÿ?Û/\u0010öú\u008eÜ\u0004¥î6Ö\u0006Æ¯¸æ¡®\u0010\nE>ììÏ2\f\u0099{ß¤¹¹¬tX\u00ad\u0099Ô\u0084\u001eÆ\u000fc\u0016u}Ó³òauôî\u008cBï}Ë¢º9\u0095LGçØÞ\u0001ñ\u0096;¾wZ)\u001d7\u008f\u009eÓ%R.?e\u0092¢ÚÞÇ\u008a\u008a\u0000AG\u001emE@Ý@\u00140xO\u0014¹Å X)ª_Å/\u0002\u00048\u0095'÷\u00031\u0010Õr\u009fÑÂ¼|/u\\\u000fdÑ©\tÿ";
        int length = "y\u009av\u0083\u008bÂB¦ÜÎï\u001fu¶6\u001b\u0010O=O°\t÷=\u008cÃd\u0007¹ÃIñ\u0017 \u0099æo{!j\u0098>k¯õW¿¾\\ýa°K\u001c2h¬bëÎFd¹Ù¸\u0017\u0010>þà\u008e\u0088ûô\bÞ\n=ÛKÝêø\u0010Tè¤xÖÅF¢ù:4C\u0092/n\u000e\u0010\u0088/\u00192ë¨àX%\u009fù\u0019Îéh\u000e\u0010+`>L¸k<\u0091\u0087«×2ÿ?Û/\u0010öú\u008eÜ\u0004¥î6Ö\u0006Æ¯¸æ¡®\u0010\nE>ììÏ2\f\u0099{ß¤¹¹¬tX\u00ad\u0099Ô\u0084\u001eÆ\u000fc\u0016u}Ó³òauôî\u008cBï}Ë¢º9\u0095LGçØÞ\u0001ñ\u0096;¾wZ)\u001d7\u008f\u009eÓ%R.?e\u0092¢ÚÞÇ\u008a\u008a\u0000AG\u001emE@Ý@\u00140xO\u0014¹Å X)ª_Å/\u0002\u00048\u0095'÷\u00031\u0010Õr\u009fÑÂ¼|/u\\\u000fdÑ©\tÿ".length();
        char cCharAt = 16;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 >= length) {
                            c = strArr;
                            d = new String[13];
                            o = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[2];
                            int i9 = 0;
                            int length2 = "\u0017\u0092\u009dÆýg\u0097\u008cð~\u0004¹ÅÏ\u0090g".length();
                            int i10 = 0;
                            do {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = "\u0017\u0092\u009dÆýg\u0097\u008cð~\u0004¹ÅÏ\u0090g".substring(i11, i10).getBytes("ISO-8859-1");
                                i9++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i10 < length2);
                            m = jArr;
                            n = new Integer[2];
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
                        str = "ö\u0098¿î\u0007`¶\u0095\u0015Ä¡¯îW&'\u0010\tÔ\u0099¾\u0094ýý\u0093¶«3Ù4Gé¾";
                        length = "ö\u0098¿î\u0007`¶\u0095\u0015Ä¡¯îW&'\u0010\tÔ\u0099¾\u0094ýý\u0093¶«3Ù4Gé¾".length();
                        cCharAt = 16;
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

    private static Exception a(Exception exc) {
        return exc;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 25355;
        if (d[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) h.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i2] = b(((Cipher) objArr[0]).doFinal(c[i2].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/oe", e);
            }
        }
        return d[i2];
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
            r1 = 3
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
            java.lang.String r1 = "su/catlean/oe"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.oe.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int d(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 1023;
        if (n[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) m[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) o.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/oe", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            n[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return n[i2].intValue();
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
            r1 = 3
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
            java.lang.String r1 = "su/catlean/oe"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.oe.d(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
