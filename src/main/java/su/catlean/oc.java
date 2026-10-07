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

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/oc.class */
public final class oc extends o3 {

    @NotNull
    private final mx v;

    @NotNull
    private final File a;
    public List s;
    public y_ J;
    private static String I;
    private static final long c = yz.a(-173405399289624608L, 2318500442154879409L, MethodHandles.lookup().lookupClass()).a(109920486178251L);
    private static final String[] d;
    private static final String[] h;
    private static final Map i;
    private static final long[] m;
    private static final Integer[] n;
    private static final Map o;

    /* JADX WARN: Illegal instructions before constructor call */
    public oc(@NotNull Json json, long a, @NotNull mx sharedSource) {
        long j = c ^ a;
        long j2 = j ^ 56025027228860L;
        Intrinsics.checkNotNullParameter(json, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14760, 6537536497470233620L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(sharedSource, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22884, 414530745612287185L ^ j) /* invoke-custom */);
        super((int) (j >>> 32), (short) ((j2 << 32) >>> 48), (char) ((j2 << 48) >>> 48), json);
        this.v = sharedSource;
        this.a = new File(mj.v(), (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8674, 8896086676631995485L ^ j) /* invoke-custom */);
    }

    @Override // su.catlean.o3
    @NotNull
    public File U() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    @NotNull
    public final List F(long j) throws Exception {
        Object obj = c ^ j;
        try {
            obj = this.s;
            if (obj != 0) {
                return obj;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12192, 7922773202555136186L ^ obj) /* invoke-custom */);
            return null;
        } catch (NumberFormatException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6157606737754931983L, obj) /* invoke-custom */;
        }
    }

    public final void d(short a, int a2, @NotNull List list, short a3) {
        Intrinsics.checkNotNullParameter(list, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21223, 450600083611320755L ^ ((((((long) a) << 48) | ((((long) a2) << 32) >>> 16)) | ((((long) a3) << 48) >>> 48)) ^ c)) /* invoke-custom */);
        this.s = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean.y_] */
    @NotNull
    public final y_ i(long j) throws Exception {
        Object obj = c ^ j;
        try {
            obj = this.J;
            if (obj != 0) {
                return obj;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25121, 9082933622789800646L ^ obj) /* invoke-custom */);
            return null;
        } catch (NumberFormatException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8253694630579627248L, obj) /* invoke-custom */;
        }
    }

    public final void F(long a, @NotNull y_ y_Var) {
        Intrinsics.checkNotNullParameter(y_Var, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21769, 8568483105321737407L ^ (c ^ a)) /* invoke-custom */);
        this.J = y_Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0 A[Catch: Exception -> 0x0282, TryCatch #10 {Exception -> 0x0282, blocks: (B:3:0x0054, B:4:0x0062, B:10:0x007f, B:15:0x0096, B:24:0x00c5, B:84:0x026f, B:32:0x00e3, B:35:0x010b, B:36:0x0119, B:49:0x015c, B:50:0x0165, B:46:0x0141, B:51:0x0166, B:54:0x017d, B:52:0x0173, B:53:0x017c, B:44:0x0137, B:45:0x0140, B:57:0x0185, B:59:0x01bf, B:60:0x01c8, B:62:0x01d2, B:63:0x0202, B:73:0x023b, B:74:0x0244, B:75:0x0245, B:80:0x0260, B:81:0x0269, B:29:0x00d7, B:30:0x00e0, B:16:0x009c, B:17:0x00a5, B:19:0x00a9, B:23:0x00c0, B:21:0x00b9, B:22:0x00bf, B:13:0x008c, B:14:0x0095, B:8:0x0075, B:9:0x007e), top: B:118:0x0054, inners: #1, #3, #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3 A[Catch: Exception -> 0x0282, PHI: r0
  0x00e3: PHI (r0v58 java.io.File[]) = (r0v57 java.io.File[]), (r0v133 java.io.File[]) binds: [B:26:0x00ce, B:31:0x00e1] A[DONT_GENERATE, DONT_INLINE], TryCatch #10 {Exception -> 0x0282, blocks: (B:3:0x0054, B:4:0x0062, B:10:0x007f, B:15:0x0096, B:24:0x00c5, B:84:0x026f, B:32:0x00e3, B:35:0x010b, B:36:0x0119, B:49:0x015c, B:50:0x0165, B:46:0x0141, B:51:0x0166, B:54:0x017d, B:52:0x0173, B:53:0x017c, B:44:0x0137, B:45:0x0140, B:57:0x0185, B:59:0x01bf, B:60:0x01c8, B:62:0x01d2, B:63:0x0202, B:73:0x023b, B:74:0x0244, B:75:0x0245, B:80:0x0260, B:81:0x0269, B:29:0x00d7, B:30:0x00e0, B:16:0x009c, B:17:0x00a5, B:19:0x00a9, B:23:0x00c0, B:21:0x00b9, B:22:0x00bf, B:13:0x008c, B:14:0x0095, B:8:0x0075, B:9:0x007e), top: B:118:0x0054, inners: #1, #3, #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010b A[Catch: Exception -> 0x0282, TryCatch #10 {Exception -> 0x0282, blocks: (B:3:0x0054, B:4:0x0062, B:10:0x007f, B:15:0x0096, B:24:0x00c5, B:84:0x026f, B:32:0x00e3, B:35:0x010b, B:36:0x0119, B:49:0x015c, B:50:0x0165, B:46:0x0141, B:51:0x0166, B:54:0x017d, B:52:0x0173, B:53:0x017c, B:44:0x0137, B:45:0x0140, B:57:0x0185, B:59:0x01bf, B:60:0x01c8, B:62:0x01d2, B:63:0x0202, B:73:0x023b, B:74:0x0244, B:75:0x0245, B:80:0x0260, B:81:0x0269, B:29:0x00d7, B:30:0x00e0, B:16:0x009c, B:17:0x00a5, B:19:0x00a9, B:23:0x00c0, B:21:0x00b9, B:22:0x00bf, B:13:0x008c, B:14:0x0095, B:8:0x0075, B:9:0x007e), top: B:118:0x0054, inners: #1, #3, #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bf A[Catch: Exception -> 0x0282, TryCatch #10 {Exception -> 0x0282, blocks: (B:3:0x0054, B:4:0x0062, B:10:0x007f, B:15:0x0096, B:24:0x00c5, B:84:0x026f, B:32:0x00e3, B:35:0x010b, B:36:0x0119, B:49:0x015c, B:50:0x0165, B:46:0x0141, B:51:0x0166, B:54:0x017d, B:52:0x0173, B:53:0x017c, B:44:0x0137, B:45:0x0140, B:57:0x0185, B:59:0x01bf, B:60:0x01c8, B:62:0x01d2, B:63:0x0202, B:73:0x023b, B:74:0x0244, B:75:0x0245, B:80:0x0260, B:81:0x0269, B:29:0x00d7, B:30:0x00e0, B:16:0x009c, B:17:0x00a5, B:19:0x00a9, B:23:0x00c0, B:21:0x00b9, B:22:0x00bf, B:13:0x008c, B:14:0x0095, B:8:0x0075, B:9:0x007e), top: B:118:0x0054, inners: #1, #3, #6, #9 }] */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v116, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v136, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v138 */
    /* JADX WARN: Type inference failed for: r0v139 */
    /* JADX WARN: Type inference failed for: r0v141 */
    /* JADX WARN: Type inference failed for: r0v142 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [su.catlean.oc] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.oc] */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Override // su.catlean.co
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(long r11) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 888
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.oc.w(long):void");
    }

    @Override // su.catlean.co
    public void h(int i2, int i3, byte b) throws Exception {
        long j = (((long) i2) << 32) | ((((long) i3) << 40) >>> 32) | ((((long) b) << 56) >>> 56);
        List<y_> listF = F(j ^ 29356394894069L);
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7463364205943846071L, j) /* invoke-custom */;
        for (y_ y_Var : listF) {
            File file = new File(U(), y_Var.q() + (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10565, 2931328700796198003L ^ j) /* invoke-custom */);
            file.createNewFile();
            Json jsonV = V();
            try {
                jsonV.getSerializersModule();
                FilesKt.writeText$default(file, jsonV.encodeToString(y_.v.l(), y_Var), null, 2, null);
                do {
                    String str2 = str;
                    if (i2 >= 0) {
                        if (str2 != null) {
                            return;
                        } else {
                            str2 = str;
                        }
                    }
                    if (str2 != null) {
                    }
                } while (i2 <= 0);
                return;
            } catch (NumberFormatException unused) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file, 7447582922453446944L, j) /* invoke-custom */;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x010e, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x01f2 -> B:34:0x018d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@org.jetbrains.annotations.NotNull java.util.List r10, @org.jetbrains.annotations.NotNull java.lang.String r11, long r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.oc.a(java.util.List, java.lang.String, long):void");
    }

    private static final boolean h(String str, y_ y_Var) {
        Intrinsics.checkNotNullParameter(y_Var, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19211, 3703422947193398507L ^ (c ^ 40835155532906L)) /* invoke-custom */);
        return Intrinsics.areEqual(y_Var.q(), str);
    }

    private static final boolean o(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static void j(String str) {
        I = str;
    }

    public static String X() {
        return I;
    }

    static {
        int i2;
        long j = c ^ 30678742887054L;
        i = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("vbJRLc", 800701434209133185L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[13];
        int i4 = 0;
        String str = "þ\u00912\u0094aR|©9-\u0083´ô\u001e)\u009ecÉÄ`\u009c\u0088\u0091\u0093q«?ñ\u0011+\u00196\u0010ÏÿªíÅ½À9;mÂZAû¸%X?åÑr\u0001\u008e\u0081Cc\u0097kÉ®q}øðk\u008f\u0087\u0091B\u0092<ïE\u009dÁ\u0013àºÀë\u000e6\u0010\u007fþT½ÇÎ\u00061ò\u0089zGãqY¿\u0011cxk\\UÒRÝÙ!EÖ\tóö¾a\fM?È è7¬Ð\n\u009b\u000fïá¬w,\t\u0010\u0094ó¾ÆÚ¤Ï\u000fÍWÝxË\u0013U°\u00107\u009e\u0091·-Ï¥Ôt\u007fÂÍð<½à\u0010àäN·\rl\u000b$ölpDÓ\u0017\u001a\u001f\u0010\u0018\u009b\u0080\u009eeú;£\u001fÚ\u009dé?¡JE\u0010¼íØètUÊù®f*\u001d}\u0004àô\u0010ï:Ç*\u009d¿·Åf\u0081Fòä\u001f{v\u0010dë©Ñ\u0013\u0081AA×Å*-S¹Éd\u0010\u001c@\u0095Ì|\u0015>\u0097\u00adÞ®U2xèj";
        int length = "þ\u00912\u0094aR|©9-\u0083´ô\u001e)\u009ecÉÄ`\u009c\u0088\u0091\u0093q«?ñ\u0011+\u00196\u0010ÏÿªíÅ½À9;mÂZAû¸%X?åÑr\u0001\u008e\u0081Cc\u0097kÉ®q}øðk\u008f\u0087\u0091B\u0092<ïE\u009dÁ\u0013àºÀë\u000e6\u0010\u007fþT½ÇÎ\u00061ò\u0089zGãqY¿\u0011cxk\\UÒRÝÙ!EÖ\tóö¾a\fM?È è7¬Ð\n\u009b\u000fïá¬w,\t\u0010\u0094ó¾ÆÚ¤Ï\u000fÍWÝxË\u0013U°\u00107\u009e\u0091·-Ï¥Ôt\u007fÂÍð<½à\u0010àäN·\rl\u000b$ölpDÓ\u0017\u001a\u001f\u0010\u0018\u009b\u0080\u009eeú;£\u001fÚ\u009dé?¡JE\u0010¼íØètUÊù®f*\u001d}\u0004àô\u0010ï:Ç*\u009d¿·Åf\u0081Fòä\u001f{v\u0010dë©Ñ\u0013\u0081AA×Å*-S¹Éd\u0010\u001c@\u0095Ì|\u0015>\u0097\u00adÞ®U2xèj".length();
        char cCharAt = ' ';
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i7 = i4;
                        i4++;
                        strArr[i7] = strIntern;
                        int i8 = i6 + cCharAt;
                        i2 = i8;
                        if (i8 >= length) {
                            d = strArr;
                            h = new String[13];
                            o = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[2];
                            int i10 = 0;
                            int length2 = "H\u0083oÁ4\u0014a\u001f~µ_aÕ×M\u000e".length();
                            int i11 = 0;
                            do {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = "H\u0083oÁ4\u0014a\u001f~µ_aÕ×M\u000e".substring(i12, i11).getBytes("ISO-8859-1");
                                i10++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i11 < length2);
                            m = jArr;
                            n = new Integer[2];
                            return;
                        }
                        cCharAt = str.charAt(i2);
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
                        str = "ì½¨\u001fR\u009b\u008dàk\u00adÀg\bz~*\u0010'¦Eò\u009a\u0003*:äT\u00822Àû#Ç";
                        length = "ì½¨\u001fR\u009b\u008dàk\u00adÀg\bz~*\u0010'¦Eò\u009a\u0003*:äT\u00822Àû#Ç".length();
                        cCharAt = 16;
                        i2 = -1;
                        break;
                        break;
                }
                i6 = i2 + 1;
                strSubstring = str.substring(i6, i6 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i5);
        }
    }

    private static Exception a(Exception exc) {
        return exc;
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 4949;
        if (h[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) i.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                h[i3] = b(((Cipher) objArr[0]).doFinal(d[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/oc", e);
            }
        }
        return h[i3];
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
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
            java.lang.String r1 = "su/catlean/oc"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.oc.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int d(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 27796;
        if (n[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) m[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) o.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/oc", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            n[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return n[i3].intValue();
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
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
            java.lang.String r1 = "su/catlean/oc"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.oc.d(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
