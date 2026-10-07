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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/sl.class */
@Serializable
public final class sl {

    @NotNull
    public static final di C;

    @NotNull
    private String O;

    @NotNull
    private String g;

    @NotNull
    private String c;

    @NotNull
    private String S;
    private boolean k;
    private static String[] Y;
    private static final long a = yz.a(-3841110263315610045L, 4920367180720787619L, MethodHandles.lookup().lookupClass()).a(42694016176783L);
    private static final String[] b;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] h;
    private static final Map i;

    public sl(@NotNull String modulesConfig, long a2, @NotNull String widgetsConfig, @NotNull String inventoriesConfig, @NotNull String themeConfig, boolean rpcAsked) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(modulesConfig, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22868, 1983086120534880681L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(widgetsConfig, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15652, 8798538528363861460L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(inventoriesConfig, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8496, 7948754382886521292L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(themeConfig, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3502, 965624744569365851L ^ j) /* invoke-custom */);
        this.O = modulesConfig;
        this.g = widgetsConfig;
        this.c = inventoriesConfig;
        this.S = themeConfig;
        this.k = rpcAsked;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sl(String str, String str2, long j, String str3, String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        long j2 = a ^ j;
        this((i2 & 1) != 0 ? (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24244, 7858937622257329172L ^ j2) /* invoke-custom */ : str, j2 ^ 46259431120589L, (i2 & 2) != 0 ? (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5402, 710257351285813177L ^ j2) /* invoke-custom */ : str2, (i2 & 4) != 0 ? (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5402, 710257351285813177L ^ j2) /* invoke-custom */ : str3, (i2 & (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15090, 257247735445848112L ^ j2) /* invoke-custom */) != 0 ? cd.C().z() : str4, (i2 & (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24473, 6468248338486814045L ^ j2) /* invoke-custom */) != 0 ? false : z);
    }

    @NotNull
    public final String v() {
        return this.O;
    }

    public final void u(long a2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3474, 8756492794641826548L ^ (a ^ a2)) /* invoke-custom */);
        this.O = str;
    }

    @NotNull
    public final String a() {
        return this.g;
    }

    public final void p(@NotNull String str, int a2, short a3, int a4) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1441, 7299180217953510582L ^ ((((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a)) /* invoke-custom */);
        this.g = str;
    }

    @NotNull
    public final String x() {
        return this.c;
    }

    public final void A(@NotNull String str, long a2) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3474, 8756433401934104990L ^ (a ^ a2)) /* invoke-custom */);
        this.c = str;
    }

    @NotNull
    public final String u() {
        return this.S;
    }

    public final void H(@NotNull String str, long a2) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3474, 8756489870060350051L ^ (a ^ a2)) /* invoke-custom */);
        this.S = str;
    }

    public final boolean q() {
        return this.k;
    }

    public final void H(boolean z) {
        this.k = z;
    }

    @NotNull
    public final String E() {
        return this.O;
    }

    @NotNull
    public final String w() {
        return this.g;
    }

    @NotNull
    public final String l() {
        return this.c;
    }

    @NotNull
    public final String S() {
        return this.S;
    }

    public final boolean f() {
        return this.k;
    }

    @NotNull
    public final sl m(@NotNull String modulesConfig, long a2, @NotNull String widgetsConfig, @NotNull String inventoriesConfig, @NotNull String themeConfig, boolean rpcAsked) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(modulesConfig, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29727, 6699063396881756403L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(widgetsConfig, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1136, 7502647029895823519L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(inventoriesConfig, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3817, 620768469878147595L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(themeConfig, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1005, 7326184098577843974L ^ j) /* invoke-custom */);
        return new sl(modulesConfig, j ^ 112895556395136L, widgetsConfig, inventoriesConfig, themeConfig, rpcAsked);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:16:0x004d
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static su.catlean.sl L(long r9, su.catlean.sl r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, boolean r16, int r17, java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.sl.L(long, su.catlean.sl, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.Object):su.catlean.sl");
    }

    @NotNull
    public String toString() {
        long j = a ^ 28913039267864L;
        return (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16715, 2921241767940612717L ^ j) /* invoke-custom */ + this.O + (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8483, 3573202009532039692L ^ j) /* invoke-custom */ + this.g + (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25563, 2917412341222162683L ^ j) /* invoke-custom */ + this.c + (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22288, 4814306876705535011L ^ j) /* invoke-custom */ + this.S + (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21356, 7009300736054423630L ^ j) /* invoke-custom */ + this.k + ")";
    }

    public int hashCode() {
        long j = a ^ 15036304072423L;
        return (((((((this.O.hashCode() * (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25570, 3743498788724082259L ^ j) /* invoke-custom */) + this.g.hashCode()) * (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25570, 3743498788724082259L ^ j) /* invoke-custom */) + this.c.hashCode()) * (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25570, 3743498788724082259L ^ j) /* invoke-custom */) + this.S.hashCode()) * (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25570, 3743498788724082259L ^ j) /* invoke-custom */) + Boolean.hashCode(this.k);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.sl.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:102:0x01de
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @kotlin.jvm.JvmStatic
    public static final void X(su.catlean.sl r7, kotlinx.serialization.encoding.CompositeEncoder r8, long r9, kotlinx.serialization.descriptors.SerialDescriptor r11) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.sl.X(su.catlean.sl, kotlinx.serialization.encoding.CompositeEncoder, long, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0067 A[EXC_TOP_SPLITTER, PHI: r0
  0x0067: PHI (r0v9 ??) = (r0v8 ??), (r0v66 ??) binds: [B:16:0x0064, B:9:0x0038] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean.sl] */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* JADX WARN: Type inference failed for: r0v40, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [int] */
    /* JADX WARN: Type inference failed for: r0v53, types: [int] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67, types: [su.catlean.sl] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public sl(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, long r14, kotlinx.serialization.internal.SerializationConstructorMarker r16) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.sl.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, long, kotlinx.serialization.internal.SerializationConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sl(long j, int i2) {
        long j2 = ((j << 32) | ((((long) i2) << 32) >>> 32)) ^ a;
        this((String) null, (String) null, j2 ^ 34420792716390L, (String) null, (String) null, false, (int) b(MethodHandles.lookup(), "r", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30840, 3485355624279433807L ^ j2) /* invoke-custom */, (DefaultConstructorMarker) null);
    }

    static {
        int i2;
        long j = a ^ 99423844893040L;
        e = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[1], -3731383933864722281L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[17];
        int i4 = 0;
        String str = "Ï-¾\u0085®Ú¢\u0098o{Û LkP\u0017 iôûá¤j>\u0095¦º¥\u0000.es\u007f®àzàÂÔÈ\u0012£Ê}\u001d\u0099úF\u0005\u0018®?¨àÚCã\u001bs±ð¬6¥Ú\rZ¹\u008fÖJ¶àÓ(Ù\u0097L^\u0082+R aùTªgù¥²Áè\u0019\u001bq©s08\u0002ÙØÛmý\u000fã\u0011\u0090'#+%C(\u0018µ øç 2:\u0000û}\t\u0083  Þ³ÝÀ\u009bT\u0010NG&\u001d\u009cÕÏ±ÂÖ^kYÇÇ;Ù\n0ôs¼\u009ayrVT\u0002_\u009a\u000b¾F\u0084)fûª\u0095Õ\u009cz\b\u0006e´#=\u0007Dàv\u0001f%Mîhªä\u009cÁ\u009dl\u0003]\u000f\u0010>vÂ#\u000f\u008a\u008c¥Gã°û2Å{\" \u0080ßôb\u0095\u00ad.hSiÑ-K\u009d»_÷ÿg\u0093zÿïÏ[V=µ>á\u0082?\u0010Ñü=\u0082ÈÓ\u00969´²z;0U'þ\u0018ÃDÄ\u001cEµÜ2\u0017O\u0098ûr6ã\u008fö>JÎ\u0011o|Ê \u001c\u008dyXï8íû¢#ìaã\"\u0088¨àNy²\bSK7y1¥CÙý\u00933\u0010\u009bÉá\u0014\u0006ø\u0010\u001fôÿâË\u0091®ª|(\u0000¯uÖÚ/á\u0093%t\u0096+²À\u0012v\u0014Ú\u008c\u0005#oÈtE\"\u008e\u008av\u0003Ëµ+\rßã\u0006K\ft %muJÅM\u0085\u0087KÄS\u000f.*0û\u0001þ<\u0016b(ÁÎ\u00adÊÊª\u0019\u0005 \u0087(lõ®3% S\u000fX§h<U\b\u0002Uýjì«û\u009f\u0085\u0016fÔ~åþ  \u0014gêß\u009a\u0080\u0003ké";
        int length = "Ï-¾\u0085®Ú¢\u0098o{Û LkP\u0017 iôûá¤j>\u0095¦º¥\u0000.es\u007f®àzàÂÔÈ\u0012£Ê}\u001d\u0099úF\u0005\u0018®?¨àÚCã\u001bs±ð¬6¥Ú\rZ¹\u008fÖJ¶àÓ(Ù\u0097L^\u0082+R aùTªgù¥²Áè\u0019\u001bq©s08\u0002ÙØÛmý\u000fã\u0011\u0090'#+%C(\u0018µ øç 2:\u0000û}\t\u0083  Þ³ÝÀ\u009bT\u0010NG&\u001d\u009cÕÏ±ÂÖ^kYÇÇ;Ù\n0ôs¼\u009ayrVT\u0002_\u009a\u000b¾F\u0084)fûª\u0095Õ\u009cz\b\u0006e´#=\u0007Dàv\u0001f%Mîhªä\u009cÁ\u009dl\u0003]\u000f\u0010>vÂ#\u000f\u008a\u008c¥Gã°û2Å{\" \u0080ßôb\u0095\u00ad.hSiÑ-K\u009d»_÷ÿg\u0093zÿïÏ[V=µ>á\u0082?\u0010Ñü=\u0082ÈÓ\u00969´²z;0U'þ\u0018ÃDÄ\u001cEµÜ2\u0017O\u0098ûr6ã\u008fö>JÎ\u0011o|Ê \u001c\u008dyXï8íû¢#ìaã\"\u0088¨àNy²\bSK7y1¥CÙý\u00933\u0010\u009bÉá\u0014\u0006ø\u0010\u001fôÿâË\u0091®ª|(\u0000¯uÖÚ/á\u0093%t\u0096+²À\u0012v\u0014Ú\u008c\u0005#oÈtE\"\u008e\u008av\u0003Ëµ+\rßã\u0006K\ft %muJÅM\u0085\u0087KÄS\u000f.*0û\u0001þ<\u0016b(ÁÎ\u00adÊÊª\u0019\u0005 \u0087(lõ®3% S\u000fX§h<U\b\u0002Uýjì«û\u009f\u0085\u0016fÔ~åþ  \u0014gêß\u009a\u0080\u0003ké".length();
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
                            d = new String[17];
                            i = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[6];
                            int i10 = 0;
                            String str3 = "\u009c\u00ad¢Ân/hå\u008d_Êt6¥\u008f\u007f\u0015ªm~\u0087@Ó\u0012\u001aÍ\u0012\u001ec\u0084)¤";
                            int length2 = "\u009c\u00ad¢Ân/hå\u008d_Êt6¥\u008f\u007f\u0015ªm~\u0087@Ó\u0012\u001aÍ\u0012\u001ec\u0084)¤".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j3 = j2;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j4;
                                            if (i11 >= length2) {
                                                f = jArr;
                                                h = new Integer[6];
                                                C = new di(null);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i11 >= length2) {
                                                str3 = "Bµ\u007fC\u0088ÒYÕ\u0092Õä{oN\u008bØ";
                                                length2 = "Bµ\u007fC\u0088ÒYÕ\u0092Õä{oN\u008bØ".length();
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
                                    j2 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "\u008eDCãºÚð{§Gk\u0000\u008e£º ýÙ\u0084þ«{\u001f\u0003Î¡\u0088Ö\u00158ºM Í\u0004V)ðÎ\u0013;+VÔD\u0007\u0091\b\u0014\u008cøå\u0000g\u0088\u001b¿\u001dý\u0084D\u0091\u0006Öy";
                        length = "\u008eDCãºÚð{§Gk\u0000\u008e£º ýÙ\u0084þ«{\u001f\u0003Î¡\u0088Ö\u00158ºM Í\u0004V)ðÎ\u0013;+VÔD\u0007\u0091\b\u0014\u008cøå\u0000g\u0088\u001b¿\u001dý\u0084D\u0091\u0006Öy".length();
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

    public static void v(String[] strArr) {
        Y = strArr;
    }

    public static String[] P() {
        return Y;
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
                char c = (char) (((char) (((char) (i4 & 15)) << '\f')) | (((char) (bArr[i7] & 63)) << 6));
                i3 = i7 + 1;
                int i8 = i2;
                i2++;
                cArr[i8] = (char) (c | ((char) (bArr[i3] & 63)));
            }
            i3++;
        }
        return new String(cArr, 0, i2);
    }

    private static String a(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 14255;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = a(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/sl", e2);
            }
        }
        return d[i3];
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
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
            java.lang.String r1 = "su/catlean/sl"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.sl.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 14275;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/sl", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            h[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return h[i3].intValue();
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
            java.lang.String r1 = "su/catlean/sl"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.sl.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
