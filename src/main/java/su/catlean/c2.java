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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/c2.class */
@Serializable
public final class c2 {

    @NotNull
    public static final yd Y;

    @NotNull
    private String D;

    @NotNull
    private String f;
    private int m;

    @NotNull
    private String l;

    @NotNull
    private String c;
    private boolean z;
    private int k;
    private static int V;
    private static final long a = yz.a(-7652981070721862985L, -7688904333320191220L, MethodHandles.lookup().lookupClass()).a(244113080261655L);
    private static final String[] b;
    private static final String[] d;
    private static final Map e;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;

    public c2(int a2, @NotNull String id, @NotNull String ip, int port, byte a3, @NotNull String user, @NotNull String password, boolean socks4, int ping, int a4) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 56) >>> 32)) | ((((long) a4) << 40) >>> 40)) ^ a;
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30711, 8308745572163982379L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(ip, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29749, 4378560231035475941L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(user, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15051, 6442924547653622033L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(password, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21615, 2910209027001497531L ^ j) /* invoke-custom */);
        this.D = id;
        this.f = ip;
        this.m = port;
        this.l = user;
        this.c = password;
        this.z = socks4;
        this.k = ping;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c2(int i2, String str, String str2, int i3, int i4, String str3, String str4, boolean z, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        long j = ((((long) i2) << 32) | ((((long) i4) << 32) >>> 32)) ^ a;
        this((int) (j >>> 32), str, str2, i3, (byte) ((r1 << 32) >>> 56), str3, str4, z, (i6 & (int) b(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13001, 2415821724737158888L ^ j) /* invoke-custom */) != 0 ? -1 : i5, (int) (((j ^ 86905502283476L) << 40) >>> 40));
    }

    @NotNull
    public final String j() {
        return this.D;
    }

    public final void F(@NotNull String str, long a2) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24731, 458634005630313959L ^ (a ^ a2)) /* invoke-custom */);
        this.D = str;
    }

    @NotNull
    public final String c() {
        return this.f;
    }

    public final void N(char a2, char a3, int a4, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24731, 458533405261116130L ^ ((((((long) a2) << 48) | ((((long) a3) << 48) >>> 16)) | ((((long) a4) << 32) >>> 32)) ^ a)) /* invoke-custom */);
        this.f = str;
    }

    public final int X() {
        return this.m;
    }

    public final void W(int i2) {
        this.m = i2;
    }

    @NotNull
    public final String f() {
        return this.l;
    }

    public final void q(short a2, @NotNull String str, char a3, int a4) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24731, 458577580686304260L ^ ((((((long) a2) << 48) | ((((long) a3) << 48) >>> 16)) | ((((long) a4) << 32) >>> 32)) ^ a)) /* invoke-custom */);
        this.l = str;
    }

    @NotNull
    public final String G() {
        return this.c;
    }

    public final void U(@NotNull String str, long a2) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7101, 6155156277064870497L ^ (a ^ a2)) /* invoke-custom */);
        this.c = str;
    }

    public final boolean W() {
        return this.z;
    }

    public final void Y(boolean z) {
        this.z = z;
    }

    public final int o() {
        return this.k;
    }

    public final void Z(int i2) {
        this.k = i2;
    }

    @Transient
    public static void w() {
    }

    @NotNull
    public final String Z() {
        return this.D;
    }

    @NotNull
    public final String S() {
        return this.f;
    }

    public final int d() {
        return this.m;
    }

    @NotNull
    public final String e() {
        return this.l;
    }

    @NotNull
    public final String I() {
        return this.c;
    }

    public final boolean h() {
        return this.z;
    }

    public final int Y() {
        return this.k;
    }

    @NotNull
    public final c2 K(@NotNull String id, @NotNull String ip, int port, long a2, @NotNull String user, @NotNull String password, boolean socks4, int ping) {
        long j = a ^ a2;
        long j2 = j ^ 124476925679584L;
        int i2 = (int) (j >>> 32);
        int i3 = (int) ((j2 << 32) >>> 56);
        int i4 = (int) ((j2 << 40) >>> 40);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25788, 2508933039072717028L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(ip, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13109, 2234526169983483754L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(user, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25061, 6967959192820460981L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(password, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22374, 3072274479228558141L ^ j) /* invoke-custom */);
        return new c2(i2, id, ip, port, (byte) i3, user, password, socks4, ping, i4);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:64:0x012f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static su.catlean.c2 E(su.catlean.c2 r11, java.lang.String r12, java.lang.String r13, long r14, int r16, java.lang.String r17, java.lang.String r18, boolean r19, int r20, int r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.c2.E(su.catlean.c2, java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String, boolean, int, int, java.lang.Object):su.catlean.c2");
    }

    @NotNull
    public String toString() {
        long j = a ^ 8618316027730L;
        return (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19063, 8240913525228503645L ^ j) /* invoke-custom */ + this.D + (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9656, 5880833679621123480L ^ j) /* invoke-custom */ + this.f + (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3624, 2327008147981944334L ^ j) /* invoke-custom */ + this.m + (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14935, 6065611032896926329L ^ j) /* invoke-custom */ + this.l + (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29947, 3559568776361753817L ^ j) /* invoke-custom */ + this.c + (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17609, 7325231889682468076L ^ j) /* invoke-custom */ + this.z + (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25652, 3580108562468776983L ^ j) /* invoke-custom */ + this.k + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    public int hashCode() {
        long j = a ^ 49610470508324L;
        int i2 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-141414719223552707L, j) /* invoke-custom */;
        Object objHashCode = (((((((((((this.D.hashCode() * (int) b(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4888, 182362164656122377L ^ j) /* invoke-custom */) + this.f.hashCode()) * (int) b(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18370, 4303584575663603409L ^ j) /* invoke-custom */) + Integer.hashCode(this.m)) * (int) b(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18370, 4303584575663603409L ^ j) /* invoke-custom */) + this.l.hashCode()) * (int) b(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18370, 4303584575663603409L ^ j) /* invoke-custom */) + this.c.hashCode()) * (int) b(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18370, 4303584575663603409L ^ j) /* invoke-custom */) + Boolean.hashCode(this.z)) * (int) b(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18370, 4303584575663603409L ^ j) /* invoke-custom */) + Integer.hashCode(this.k);
        try {
            objHashCode = objHashCode;
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-135965590911197043L, j) /* invoke-custom */ != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(i2 + 1, -81743177255607571L, j) /* invoke-custom */;
            }
            return objHashCode;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objHashCode, -89550432666679533L, j) /* invoke-custom */;
        }
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
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.c2.equals(java.lang.Object):boolean");
    }

    @JvmStatic
    public static final void t(c2 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.D);
        output.encodeStringElement(serialDesc, 1, self.f);
        output.encodeIntElement(serialDesc, 2, self.m);
        output.encodeStringElement(serialDesc, 3, self.l);
        output.encodeStringElement(serialDesc, 4, self.c);
        output.encodeBooleanElement(serialDesc, 5, self.z);
    }

    public c2(int seen0, String id, String ip, int port, String user, String password, boolean socks4, SerializationConstructorMarker serializationConstructorMarker, long a2) {
        long j = a ^ a2;
        if ((int) b(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12320, 8006743239394230872L ^ j) /* invoke-custom */ != ((int) b(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30964, 3460765394250386054L ^ j) /* invoke-custom */ & seen0)) {
            PluginExceptionsKt.throwMissingFieldException(seen0, (int) b(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30964, 3460765394250386054L ^ j) /* invoke-custom */, w9.f.getDescriptor());
        }
        this.D = id;
        this.f = ip;
        this.m = port;
        this.l = user;
        this.c = password;
        this.z = socks4;
        this.k = -1;
    }

    static {
        int i2;
        long j = a ^ 89335643551130L;
        e = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(0, -8330556098190094253L, j) /* invoke-custom */;
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
        String str = "J\u0018å_pÕ\u007fjÍ\u0093±«\u000eÂÎÒ¼£\u0086éÉüWry\u0018ñð°_\u000bj\u0010½Æ¯jMÖ\u0092²Æ\u0080i\u001f×ä\u00186\u0010ÿ©¤¾Ô\u008f<f\b\u001fºñ³ãø×  u8ePôb·\u00834®ÞÇ!x\u001b¹%8\u0091éû\u009e\u000bgÔ\u008d\u0088\u001b{Ðù\u0010\u0085»&F×,ÏU¾\b1\u001bM\u0002P`\u0010SP\u0000gQnÃ\u0011A%{k|:Íu\u0018ÍwÆ\u008f5(\f\u0019®.,+áEûZímÂ\u0088PËw§\u0010\u0083@qúç\u0011wö\r\u009cÓ \u0090¦ó\u0017\u0010Ì\n\u0011æ¨àÏÂDk;«\u008cÀÞ-\u0010Ë`æ§\u000bs\u0097H\u0013h<ÚòÜ*\u0011\u0010\u000b>Ú\u0007SªÒ7\u009f6®Ù\u009f^\u0007/ \u000b0.ï\u0080É\u0093Î! ìÒ²â\u009f«\u008f××U\u00971S\u0019\u0081ÞøÚâôfP \u0089ï\u008fB\tW\u0011®Xx@ à\u0002\u00ad\u009c\u0093\u001fFK P´P/ÉJ®óDöÞ\u0010!Å\u0005\u0099u\rÕáå·'LÌ\u00870\u009c\u0010ø\u0092ZÚ\u001boÑ\u0081´\u009d?dÊ}\u008b\u0095";
        int length = "J\u0018å_pÕ\u007fjÍ\u0093±«\u000eÂÎÒ¼£\u0086éÉüWry\u0018ñð°_\u000bj\u0010½Æ¯jMÖ\u0092²Æ\u0080i\u001f×ä\u00186\u0010ÿ©¤¾Ô\u008f<f\b\u001fºñ³ãø×  u8ePôb·\u00834®ÞÇ!x\u001b¹%8\u0091éû\u009e\u000bgÔ\u008d\u0088\u001b{Ðù\u0010\u0085»&F×,ÏU¾\b1\u001bM\u0002P`\u0010SP\u0000gQnÃ\u0011A%{k|:Íu\u0018ÍwÆ\u008f5(\f\u0019®.,+áEûZímÂ\u0088PËw§\u0010\u0083@qúç\u0011wö\r\u009cÓ \u0090¦ó\u0017\u0010Ì\n\u0011æ¨àÏÂDk;«\u008cÀÞ-\u0010Ë`æ§\u000bs\u0097H\u0013h<ÚòÜ*\u0011\u0010\u000b>Ú\u0007SªÒ7\u009f6®Ù\u009f^\u0007/ \u000b0.ï\u0080É\u0093Î! ìÒ²â\u009f«\u008f××U\u00971S\u0019\u0081ÞøÚâôfP \u0089ï\u008fB\tW\u0011®Xx@ à\u0002\u00ad\u009c\u0093\u001fFK P´P/ÉJ®óDöÞ\u0010!Å\u0005\u0099u\rÕáå·'LÌ\u00870\u009c\u0010ø\u0092ZÚ\u001boÑ\u0081´\u009d?dÊ}\u008b\u0095".length();
        char cCharAt = ' ';
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
                            long[] jArr = new long[9];
                            int i10 = 0;
                            String str3 = "2c\u0000A¶\u0085G@·x\nàá×!\u000b÷\u001bÜ\u0099x\u0002\u0014 ±'\u00895P\u0095´d\u0000.êA\\\u0080]&QIb\u009bÊágàyò\u0080&Q^\bÜ";
                            int length2 = "2c\u0000A¶\u0085G@·x\nàá×!\u000b÷\u001bÜ\u0099x\u0002\u0014 ±'\u00895P\u0095´d\u0000.êA\\\u0080]&QIb\u009bÊágàyò\u0080&Q^\bÜ".length();
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
                                                g = jArr;
                                                h = new Integer[9];
                                                Y = new yd(null);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i11 >= length2) {
                                                str3 = "Aýê¡\u0082\u009fz«ÞB¿ç¦¹\u009eÇ";
                                                length2 = "Aýê¡\u0082\u009fz«ÞB¿ç¦¹\u009eÇ".length();
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
                        str = "}äô/\u0006\u0098`'wlBç\u0087\u0006`f\u00103U\u0092¡Ê=\u0084 |4\u0017\r\u0007q2¨";
                        length = "}äô/\u0006\u0098`'wlBç\u0087\u0006`f\u00103U\u0092¡Ê=\u0084 |4\u0017\r\u0007q2¨".length();
                        cCharAt = 16;
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

    public static void d(int i2) {
        V = i2;
    }

    public static int z() {
        return V;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int L() {
        return z() == 0 ? 71 : 0;
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 10002;
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
                throw new RuntimeException("su/catlean/c2", e2);
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
            r1 = 1065353216(0x3f800000, float:1.0)
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
            java.lang.String r1 = "su/catlean/c2"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.c2.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 18010;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/c2", e2);
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
            r1 = 1065353216(0x3f800000, float:1.0)
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
            java.lang.String r1 = "su/catlean/c2"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.c2.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
