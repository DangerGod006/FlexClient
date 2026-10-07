package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ti.class */
public final class ti {
    private float f;
    private float n;
    private float t;
    private final float r;
    private float b;
    private float A;
    private boolean U;
    private final float q;
    private final int g;
    private int K;
    private static String[] o;
    private static final long a = yz.a(1258532364230898749L, -780104895118626961L, MethodHandles.lookup().lookupClass()).a(223123135537519L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] h;
    private static final Integer[] i;
    private static final Map j;

    public ti(float yaw, float prevYaw, float pitch, float radius, float alpha, float prevAlpha, boolean fadeIn, float spinSpeed, int lifeTime, int age) {
        this.f = yaw;
        this.n = prevYaw;
        this.t = pitch;
        this.r = radius;
        this.b = alpha;
        this.A = prevAlpha;
        this.U = fadeIn;
        this.q = spinSpeed;
        this.g = lifeTime;
        this.K = age;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ti(float f, float f2, float f3, float f4, float f5, float f6, boolean z, float f7, int i2, int i3, int i4, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        long j3 = a ^ j2;
        this(f, (i4 & 2) != 0 ? f : f2, f3, f4, (i4 & (int) b(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15169, 3284804653344635219L ^ j3) /* invoke-custom */) != 0 ? 0.0f : f5, (i4 & (int) b(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2154, 1200896028887419502L ^ j3) /* invoke-custom */) != 0 ? 0.0f : f6, (i4 & (int) b(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(452, 296798598765085652L ^ j3) /* invoke-custom */) != 0 ? true : z, (i4 & (int) b(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(370, 9042027417960350572L ^ j3) /* invoke-custom */) != 0 ? 1.5f + (ThreadLocalRandom.current().nextFloat() * 1.0f) : f7, (i4 & (int) b(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13170, 3651126143444693357L ^ j3) /* invoke-custom */) != 0 ? ThreadLocalRandom.current().nextInt((int) b(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2691, 990507465895151765L ^ j3) /* invoke-custom */, (int) b(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9062, 6420965545661833597L ^ j3) /* invoke-custom */) : i2, (i4 & (int) b(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13766, 3898887027800848338L ^ j3) /* invoke-custom */) != 0 ? 0 : i3);
    }

    public final float b() {
        return this.f;
    }

    public final void G(float f) {
        this.f = f;
    }

    public final float I() {
        return this.n;
    }

    public final void P(float f) {
        this.n = f;
    }

    public final float A() {
        return this.t;
    }

    public final void c(float f) {
        this.t = f;
    }

    public final float E() {
        return this.r;
    }

    public final float O() {
        return this.b;
    }

    public final void g(float f) {
        this.b = f;
    }

    public final float D() {
        return this.A;
    }

    public final void E(float f) {
        this.A = f;
    }

    public final boolean G() {
        return this.U;
    }

    public final void I(boolean z) {
        this.U = z;
    }

    public final float z() {
        return this.q;
    }

    public final int Z() {
        return this.g;
    }

    public final int B() {
        return this.K;
    }

    public final void O(int i2) {
        this.K = i2;
    }

    public final float r() {
        return this.f;
    }

    public final float P() {
        return this.n;
    }

    public final float J() {
        return this.t;
    }

    public final float x() {
        return this.r;
    }

    public final float F() {
        return this.b;
    }

    public final float l() {
        return this.A;
    }

    public final boolean N() {
        return this.U;
    }

    public final float h() {
        return this.q;
    }

    public final int w() {
        return this.g;
    }

    public final int d() {
        return this.K;
    }

    @NotNull
    public final ti v(float yaw, float prevYaw, float pitch, float radius, float alpha, float prevAlpha, boolean fadeIn, float spinSpeed, int lifeTime, int age) {
        return new ti(yaw, prevYaw, pitch, radius, alpha, prevAlpha, fadeIn, spinSpeed, lifeTime, age);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:94:0x01d3
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static su.catlean.ti g(su.catlean.ti r12, float r13, float r14, float r15, float r16, float r17, float r18, boolean r19, float r20, long r21, int r23, int r24, int r25, java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ti.g(su.catlean.ti, float, float, float, float, float, float, boolean, float, long, int, int, int, java.lang.Object):su.catlean.ti");
    }

    @NotNull
    public String toString() {
        long j2 = a ^ 50726334621390L;
        return (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7621, 5280625849739169068L ^ j2) /* invoke-custom */ + this.f + (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8781, 8030165934937305763L ^ j2) /* invoke-custom */ + this.n + (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32160, 3494313686066736463L ^ j2) /* invoke-custom */ + this.t + (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12222, 3200861235310427997L ^ j2) /* invoke-custom */ + this.r + (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26106, 6361793550948840720L ^ j2) /* invoke-custom */ + this.b + (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20203, 3609087844241153536L ^ j2) /* invoke-custom */ + this.A + (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14522, 3147039521569826902L ^ j2) /* invoke-custom */ + this.U + (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4427, 3195809498934460835L ^ j2) /* invoke-custom */ + this.q + (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25963, 3550562967349835142L ^ j2) /* invoke-custom */ + this.g + (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12189, 658731530431561599L ^ j2) /* invoke-custom */ + this.K + ")";
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [int, java.lang.Object] */
    public int hashCode() {
        long j2 = a ^ 65369997840655L;
        String[] strArr = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4550261096093874927L, j2) /* invoke-custom */;
        ?? HashCode = (((((((((((((((((Float.hashCode(this.f) * (int) b(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17058, 4758707941637102975L ^ j2) /* invoke-custom */) + Float.hashCode(this.n)) * (int) b(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28690, 4884357783662964683L ^ j2) /* invoke-custom */) + Float.hashCode(this.t)) * (int) b(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28690, 4884357783662964683L ^ j2) /* invoke-custom */) + Float.hashCode(this.r)) * (int) b(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28690, 4884357783662964683L ^ j2) /* invoke-custom */) + Float.hashCode(this.b)) * (int) b(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28690, 4884357783662964683L ^ j2) /* invoke-custom */) + Float.hashCode(this.A)) * (int) b(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28690, 4884357783662964683L ^ j2) /* invoke-custom */) + Boolean.hashCode(this.U)) * (int) b(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28690, 4884357783662964683L ^ j2) /* invoke-custom */) + Float.hashCode(this.q)) * (int) b(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28690, 4884357783662964683L ^ j2) /* invoke-custom */) + Integer.hashCode(this.g)) * (int) b(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28690, 4884357783662964683L ^ j2) /* invoke-custom */) + Integer.hashCode(this.K);
        if (strArr != null) {
            try {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[1], -4579399249192760753L, j2) /* invoke-custom */;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(HashCode, -4608605593726326087L, j2) /* invoke-custom */;
            }
        }
        return HashCode;
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
            Method dump skipped, instruction units count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ti.equals(java.lang.Object):boolean");
    }

    public static void Y(String[] strArr) {
        o = strArr;
    }

    public static String[] X() {
        return o;
    }

    static {
        int i2;
        long j2 = a ^ 22759677013178L;
        e = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, 9008184485456575543L, j2) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[10];
        int i4 = 0;
        String str = "³N\u001fT]¶)\u0019?'nm\tÞd2C\u0082.\u0007\u0013Á¼¸ wìe\u008cºW\u0000\u00867x{àLrÜç|=*\u0000³¥Û¹7EõØ\u008bñÊ¦ Íbw_\u008c6»·Nã\u0002Î²\t\u0018 T#Y\u0080½?\u0086\u008a\u000f§ßFÅ\u0084×Ú Ì\u009bpß\u0010¬\u008b¹\u0014áãsabV.\u0094\u0001\u0013´ü½ïæ\u008aéöG\u009dÔ¹f Z\u00810Ó¨6_2àg|À\u009d\u001b¦ÞCvÇE%eZ\u0002¼Õ¢ù:©I\u0007 »\u0087#\u000f*ÑÇg¥ \u0019Ø\u0099K\u0015c}\u0000Ý\u001e³\u000eó\u0096XÌN»]íd\u0090 9\u0094 \u0085nä\u001e'©\tf\u008ed³µÁ\u0098T\u0080W\u0000$Þ\u0004\u009b\u0006\u0019R`ë~A\u0018Æ\u009dJI\u0001\u008a9x\u0000YñIÔj\u0084ÿþVÀ¼\u001c;Ãù";
        int length = "³N\u001fT]¶)\u0019?'nm\tÞd2C\u0082.\u0007\u0013Á¼¸ wìe\u008cºW\u0000\u00867x{àLrÜç|=*\u0000³¥Û¹7EõØ\u008bñÊ¦ Íbw_\u008c6»·Nã\u0002Î²\t\u0018 T#Y\u0080½?\u0086\u008a\u000f§ßFÅ\u0084×Ú Ì\u009bpß\u0010¬\u008b¹\u0014áãsabV.\u0094\u0001\u0013´ü½ïæ\u008aéöG\u009dÔ¹f Z\u00810Ó¨6_2àg|À\u009d\u001b¦ÞCvÇE%eZ\u0002¼Õ¢ù:©I\u0007 »\u0087#\u000f*ÑÇg¥ \u0019Ø\u0099K\u0015c}\u0000Ý\u001e³\u000eó\u0096XÌN»]íd\u0090 9\u0094 \u0085nä\u001e'©\tf\u008ed³µÁ\u0098T\u0080W\u0000$Þ\u0004\u009b\u0006\u0019R`ë~A\u0018Æ\u009dJI\u0001\u008a9x\u0000YñIÔj\u0084ÿþVÀ¼\u001c;Ãù".length();
        char cCharAt = 24;
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
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
                            d = new String[10];
                            j = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[17];
                            int i10 = 0;
                            String str3 = "al`:®À\u0003`õj\u0094\\}¼\u001eð\u0084\u001f&ëné!|\u001fwïÐFà.Ò9|\u008fqMý\u0005ì¹<\u000eA\u0005¬Ñï(Ñé\u009aíÝ\u0013\u0093¼Ìí\u000fÃò2N\b\u008eº÷î\u0094öÂÒ\u0099\u009etÍ\u0002#»>&qK\u00034ú\u0013\u0002Ç=À\u001a\u0000%Z'FÚSkrYárÀ¦ìZ_áv1¼×\u001c\u0019Æ\u0092ô";
                            int length2 = "al`:®À\u0003`õj\u0094\\}¼\u001eð\u0084\u001f&ëné!|\u001fwïÐFà.Ò9|\u008fqMý\u0005ì¹<\u000eA\u0005¬Ñï(Ñé\u009aíÝ\u0013\u0093¼Ìí\u000fÃò2N\b\u008eº÷î\u0094öÂÒ\u0099\u009etÍ\u0002#»>&qK\u00034ú\u0013\u0002Ç=À\u001a\u0000%Z'FÚSkrYárÀ¦ìZ_áv1¼×\u001c\u0019Æ\u0092ô".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j3 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b3 = -1;
                                while (true) {
                                    byte b4 = b3;
                                    long j4 = j3;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j4 >>> 56), (byte) (j4 >>> 48), (byte) (j4 >>> 40), (byte) (j4 >>> 32), (byte) (j4 >>> 24), (byte) (j4 >>> 16), (byte) (j4 >>> 8), (byte) j4});
                                    long j5 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b4] = j5;
                                            if (i11 >= length2) {
                                                h = jArr;
                                                i = new Integer[17];
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b4] = j5;
                                            if (i11 >= length2) {
                                                str3 = "y¬©q\u00adá\u009bB/G0*\u0015\b\u009b\u001e";
                                                length2 = "y¬©q\u00adá\u009bB/G0*\u0015\b\u009b\u001e".length();
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
                                    b3 = 0;
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
                        str = "æ\u0083®\u0084¨[\u001b,Ô\u001bqêaí\u0015U çµbdÄÇx)Â§ûäìa±|»B5\u001fÅ\u0013¤`¸Õ\u0097\u0093\u0081\u0095\u001cæ";
                        length = "æ\u0083®\u0084¨[\u001b,Ô\u001bqêaí\u0015U çµbdÄÇx)Â§ûäìa±|»B5\u001fÅ\u0013¤`¸Õ\u0097\u0093\u0081\u0095\u001cæ".length();
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 26238;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = a(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/ti", e2);
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
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
            r1 = 5
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
            java.lang.String r1 = "su/catlean/ti"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ti.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 7808;
        if (i[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) h[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) j.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/ti", e2);
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
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
            r1 = 5
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
            java.lang.String r1 = "su/catlean/ti"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ti.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
