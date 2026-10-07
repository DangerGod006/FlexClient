package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.apache.commons.compress.utils.Lists;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/rq.class */
public final class rq implements ym {

    @NotNull
    public static final rq G;

    @NotNull
    private static final String F;

    @NotNull
    private static final String O;
    private static int S;
    private static boolean j;
    private static boolean Q;

    @NotNull
    private static final bg f;

    @NotNull
    private static final bg d;

    @NotNull
    private static CopyOnWriteArrayList B;

    @NotNull
    private static ConcurrentHashMap e;
    private static int[] l;
    private static final long a = yz.a(-4189204353788490942L, -434379992115234740L, MethodHandles.lookup().lookupClass()).a(276125987312247L);
    private static final String[] b;
    private static final String[] c;
    private static final Map g;
    private static final long[] h;
    private static final Integer[] i;
    private static final Map k;

    private rq() {
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:55:0x014b
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void X(su.catlean.api.event.events.client.TickEvent r9) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rq.X(su.catlean.api.event.events.client.TickEvent):void");
    }

    public final void C(@NotNull String name, long a2) {
        long j2 = a ^ a2;
        Intrinsics.checkNotNullParameter(name, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6052, 8451274540493767675L ^ j2) /* invoke-custom */);
        try {
            HttpClient.newHttpClient().send(HttpRequest.newBuilder(URI.create((String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4819, 6377172023156246165L ^ j2) /* invoke-custom */)).header((String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15977, 5062289061891615278L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5831, 3186677452161188499L ^ j2) /* invoke-custom */).POST(HttpRequest.BodyPublishers.ofString((String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30772, 7456348078002138218L ^ j2) /* invoke-custom */ + name + (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7582, 4102727638088354249L ^ j2) /* invoke-custom */)).build(), HttpResponse.BodyHandlers.ofString());
        } catch (Throwable th) {
        }
    }

    @NotNull
    public final List r(long j2) {
        List arrayList;
        ArrayList arrayList2;
        long j3 = a ^ j2;
        try {
            HttpResponse httpResponseSend = HttpClient.newHttpClient().send(HttpRequest.newBuilder(URI.create((String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18654, 3441523292642106645L ^ j3) /* invoke-custom */)).GET().build(), HttpResponse.BodyHandlers.ofString());
            if (httpResponseSend.statusCode() == (int) b(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19323, 844913058784551715L ^ j3) /* invoke-custom */) {
                Json jsonP = c9.p();
                Object objBody = httpResponseSend.body();
                Intrinsics.checkNotNullExpressionValue(objBody, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10734, 3216526010265091111L ^ j3) /* invoke-custom */);
                jsonP.getSerializersModule();
                arrayList2 = (List) jsonP.decodeFromString(new ArrayListSerializer(StringSerializer.INSTANCE), (String) objBody);
            } else {
                arrayList2 = new ArrayList();
            }
            arrayList = arrayList2;
        } catch (Exception e2) {
            arrayList = new ArrayList();
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.String] */
    public final boolean B(long a2, @NotNull String string) {
        long j2 = a ^ a2;
        long j3 = j2 ^ 27420177322949L;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2867822099959601410L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(string, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32642, 9020430445308929470L ^ j2) /* invoke-custom */);
        Object objContains = string + (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17121, 5928538920880232667L ^ j2) /* invoke-custom */;
        try {
            try {
                objContains = e.contains(objContains);
                if (iArr != null) {
                    return objContains;
                }
                if (objContains != 0) {
                    Object obj = e.get(objContains);
                    Intrinsics.checkNotNull(obj);
                    return ((Boolean) obj).booleanValue();
                }
                boolean zContains = Lists.newArrayList(B.iterator()).contains(U(j3, objContains));
                e.put(objContains, Boolean.valueOf(zContains));
                return zContains;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains, 2832001207779953321L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains, 2832001207779953321L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[LOOP:0: B:3:0x0073->B:13:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x009a -> B:6:0x0092). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String U(long r10, java.lang.String r12) {
        /*
            r9 = this;
            long r0 = su.catlean.rq.a
            r1 = r10
            long r0 = r0 ^ r1
            r10 = r0
            r0 = r10
            r1 = r0; r1 = r0; 
            r2 = 25756641414144(0x176cef764c00, double:1.27254716749805E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = r12
            r17 = r0
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            r1 = r17
            r2 = r0; r0 = r1; r1 = r2; 
            byte[] r0 = r0.getBytes(r1)
            r1 = r0
            r2 = 31244(0x7a0c, float:4.3782E-41)
            r3 = 6991631528092570287(0x610743d4e06112af, double:2.55534865500148E159)
            r4 = r10
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/rq;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "f"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r16 = r0
            r0 = 21701(0x54c5, float:3.041E-41)
            r1 = 2840070709461630059(0x2769f5434e73bc6b, double:8.041997324970801E-119)
            r2 = r10
            long r1 = r1 ^ r2
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/rq;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "f"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r18 = r0
            r0 = -3074115772635501672(0xd5568bfdfda2ab98, double:-1.262479401663424E103)
            r1 = r10
            int[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[I}
            ).invoke(r0, r1)
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            r2 = r18
            r3 = r1; r1 = r2; r2 = r3; 
            byte[] r1 = r1.getBytes(r2)
            r2 = r1
            r3 = 16018(0x3e92, float:2.2446E-41)
            r4 = 4303333552393016895(0x3bb88310dc67d63f, double:5.190612824468474E-21)
            r5 = r10
            long r4 = r4 ^ r5
            java.lang.String r3 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/rq;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "f"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r3, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r17 = r1
            r1 = r16
            int r1 = r1.length
            byte[] r1 = new byte[r1]
            r18 = r1
            r1 = 0
            r19 = r1
            r15 = r0
            r0 = r16
            int r0 = r0.length
            r20 = r0
        L73:
            r0 = r19
            r1 = r20
            if (r0 >= r1) goto L97
            r0 = r18
            r1 = r19
            r2 = r16
            r3 = r19
            r2 = r2[r3]
            r3 = r17
            r4 = r19
            r5 = r17
            int r5 = r5.length
            int r4 = r4 % r5
            r3 = r3[r4]
            r2 = r2 ^ r3
            byte r2 = (byte) r2
            r0[r1] = r2
            int r19 = r19 + 1
        L92:
            r0 = r15
            if (r0 == 0) goto L73
        L97:
            r0 = r10
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L92
            r0 = r9
            r1 = r13
            r2 = r18
            java.lang.String r0 = r0.s(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rq.U(long, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [char, int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [char, int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [char, int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [char, int] */
    private final String s(long j2, byte[] bArr) {
        long j3 = a ^ j2;
        String strEncodeToString = Base64.getEncoder().encodeToString(bArr);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(691, 8827854662728288068L ^ j3) /* invoke-custom */);
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(strEncodeToString, (char) (int) b(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4038, 806257748557920170L ^ j3) /* invoke-custom */, (char) (int) b(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24240, 5666040733155174110L ^ j3) /* invoke-custom */, false, 4, (Object) null), (char) (int) b(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31371, 8016910571858232036L ^ j3) /* invoke-custom */, (char) (int) b(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30275, 314182214789074474L ^ j3) /* invoke-custom */, false, 4, (Object) null), (char) (int) b(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17811, 519726637535346174L ^ j3) /* invoke-custom */, (char) (int) b(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23984, 3206892569649128913L ^ j3) /* invoke-custom */, false, 4, (Object) null);
    }

    public static final String p(rq $this, int a2, short a3, short a4, String input) {
        return $this.U(((((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a) ^ 63848086162077L, input);
    }

    public static final int j() {
        return S;
    }

    public static final CopyOnWriteArrayList Z() {
        return B;
    }

    static {
        int i2;
        long j2 = a ^ 70605707851705L;
        g = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, -7519231476710778821L, j2) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[18];
        int i4 = 0;
        String str = "mM©~¸Ïxßå¨a\u009c\u0004+Ôá ip¤ø\"  8\u008dk7f\u009aûÔýq\u009flùF£\u0082\u0018Wæ~Ø\u0085´\u0011k\u0010\n\u0089+á¦\u008eY\u001c(¡;\u0084ã\u0087\n\r(«ë¾èú\u0094=Ø:\u009fTy\\\u0094¤>\u0001ÜâÐÍ\u0000á¨\u0097\u0090Ã\u0089Öá'îC³òp3\u0080\u0016i\u0010Ü\u00ad\u0083R\u0097Æ^8\u0091\\\u007f\u0005\u0088:Hµ@\u000bâtÌ\u0096LK\u001d÷=\u0013 )Ø½úýa&\u0099É\u0015nÔ\b\r\rP\u008eC\u00108ç¹ «±¶wÊÜ.²ç÷hñ¬\u001d¹\"¡í` Â<fLþü·Û\n C\u008aø\\\u0081Ô¬?(\u0010À\u009d¶ì\u009d\u0083>¿å\u0095\u0089î\u001a3\u007f\u008f<\u0012©#¤%\u0018O\u008b;;ÂÃDf\u001eP\u0010ê£\u0093\u0091_¼(«@\u0014¶\u0096\u0018\u0010Äp5\u008f+\u0090Ô\u0093½\u0097½\u001c\rK\u0097ç \u009c\u0082à\u0001;ðó|È<(¥\u001fa§A-¨BÂs\n8ì¹Ó<÷U\u001d\u0084Z(Ë\u0092\\§9}UVXõîó+zg@\u0090Ö±~\u0002ÖÉÍ~$rì¿2\u0016àW\u009c¼\u0088Å\r_\t Ò\u0084\u0085ÝZ\u001dõ°¬£\u0085ÄF\u0001\u008d\u0007\nP©¡Ín2dKk«B\u009d9]3\u0018\u007fÂÌ0\r_¹quQPÛ/\u0010¡_m=\u0090|4ßU³ [ñ<\u0098\u0083ôk¸SæH¼é\u0019i ¨í¿·M\u0003S\u0082iâÜ\f\u0085K\u0013+0\u001fExm\u0080·Í\u0094³ö¶8¦CÁö1\u0097¨É\u001d\u0011M\u0019E&YëþÓËª\u0082ý~û%\u0086Cÿ\u0082,ÐO¯¬S` Û\u0080S20×Í\u0084%À×\u00110\u0005üd \rÙíS¯%¥HÃ\u0001?³\u000bGJ";
        int length = "mM©~¸Ïxßå¨a\u009c\u0004+Ôá ip¤ø\"  8\u008dk7f\u009aûÔýq\u009flùF£\u0082\u0018Wæ~Ø\u0085´\u0011k\u0010\n\u0089+á¦\u008eY\u001c(¡;\u0084ã\u0087\n\r(«ë¾èú\u0094=Ø:\u009fTy\\\u0094¤>\u0001ÜâÐÍ\u0000á¨\u0097\u0090Ã\u0089Öá'îC³òp3\u0080\u0016i\u0010Ü\u00ad\u0083R\u0097Æ^8\u0091\\\u007f\u0005\u0088:Hµ@\u000bâtÌ\u0096LK\u001d÷=\u0013 )Ø½úýa&\u0099É\u0015nÔ\b\r\rP\u008eC\u00108ç¹ «±¶wÊÜ.²ç÷hñ¬\u001d¹\"¡í` Â<fLþü·Û\n C\u008aø\\\u0081Ô¬?(\u0010À\u009d¶ì\u009d\u0083>¿å\u0095\u0089î\u001a3\u007f\u008f<\u0012©#¤%\u0018O\u008b;;ÂÃDf\u001eP\u0010ê£\u0093\u0091_¼(«@\u0014¶\u0096\u0018\u0010Äp5\u008f+\u0090Ô\u0093½\u0097½\u001c\rK\u0097ç \u009c\u0082à\u0001;ðó|È<(¥\u001fa§A-¨BÂs\n8ì¹Ó<÷U\u001d\u0084Z(Ë\u0092\\§9}UVXõîó+zg@\u0090Ö±~\u0002ÖÉÍ~$rì¿2\u0016àW\u009c¼\u0088Å\r_\t Ò\u0084\u0085ÝZ\u001dõ°¬£\u0085ÄF\u0001\u008d\u0007\nP©¡Ín2dKk«B\u009d9]3\u0018\u007fÂÌ0\r_¹quQPÛ/\u0010¡_m=\u0090|4ßU³ [ñ<\u0098\u0083ôk¸SæH¼é\u0019i ¨í¿·M\u0003S\u0082iâÜ\f\u0085K\u0013+0\u001fExm\u0080·Í\u0094³ö¶8¦CÁö1\u0097¨É\u001d\u0011M\u0019E&YëþÓËª\u0082ý~û%\u0086Cÿ\u0082,ÐO¯¬S` Û\u0080S20×Í\u0084%À×\u00110\u0005üd \rÙíS¯%¥HÃ\u0001?³\u000bGJ".length();
        char cCharAt = 16;
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
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
                            c = new String[18];
                            O = (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2167, 594366187501396627L ^ j2) /* invoke-custom */;
                            F = (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28962, 7853316942508973006L ^ j2) /* invoke-custom */;
                            k = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[10];
                            int i10 = 0;
                            String str3 = "\u009a\tÐ\u0011z\u001bZ\u008a¬A\u0095\u008253t\u001fLv¬\u0000\u00846\u0097³C.G+\u0080\u0094MðÊC¼£±uýÌÜú=mù\"\u0000\u0013wA\u008dæïïR¬À¹´t\u009dlóÕ";
                            int length2 = "\u009a\tÐ\u0011z\u001bZ\u008a¬A\u0095\u008253t\u001fLv¬\u0000\u00846\u0097³C.G+\u0080\u0094MðÊC¼£±uýÌÜú=mù\"\u0000\u0013wA\u008dæïïR¬À¹´t\u009dlóÕ".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j3 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j4 = j3;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j4 >>> 56), (byte) (j4 >>> 48), (byte) (j4 >>> 40), (byte) (j4 >>> 32), (byte) (j4 >>> 24), (byte) (j4 >>> 16), (byte) (j4 >>> 8), (byte) j4});
                                    long j5 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j5;
                                            if (i11 >= length2) {
                                                h = jArr;
                                                i = new Integer[10];
                                                G = new rq();
                                                S = -1;
                                                f = new bg();
                                                d = new bg();
                                                B = new CopyOnWriteArrayList();
                                                e = new ConcurrentHashMap();
                                                rq rqVar = G;
                                                S = Random.Default.nextInt(0, (int) b(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13652, 6048596185211494953L ^ j2) /* invoke-custom */);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j5;
                                            if (i11 >= length2) {
                                                str3 = ";Õ9\u0013ü\u0007ü\u0087DYDëÿ\b5(";
                                                length2 = ";Õ9\u0013ü\u0007ü\u0087DYDëÿ\b5(".length();
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
                                    j3 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "É\u000bÌ\f\u0003PÊö\u0094¨\u0095'ÅÅ\u0088\u0093\u008eÛE\u0098àÁ\u0094`Ü+£r{½þ\u009f8«ê\rñUaG\u001bÄÁ(Üü9\u009d.$|ß\u009dL\fê¢6î:ø\nnØôË£ì'\u009eÍÛÑWIÁtïÝ\u009eh\u0019Î]÷îÊ\u0083ü";
                        length = "É\u000bÌ\f\u0003PÊö\u0094¨\u0095'ÅÅ\u0088\u0093\u008eÛE\u0098àÁ\u0094`Ü+£r{½þ\u009f8«ê\rñUaG\u001bÄÁ(Üü9\u009d.$|ß\u009dL\fê¢6î:ø\nnØôË£ì'\u009eÍÛÑWIÁtïÝ\u009eh\u0019Î]÷îÊ\u0083ü".length();
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

    public static void O(int[] iArr) {
        l = iArr;
    }

    public static int[] x() {
        return l;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String a(byte[] bArr) {
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

    private static String a(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 15372;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) g.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = a(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/rq", e2);
            }
        }
        return c[i3];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strA = a(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strA), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strA;
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
    private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
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
            java.lang.String r1 = "su/catlean/rq"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rq.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 16792;
        if (i[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) h[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) k.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/rq", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            i[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return i[i3].intValue();
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iB)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iB;
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
            java.lang.String r1 = "su/catlean/rq"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.rq.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
