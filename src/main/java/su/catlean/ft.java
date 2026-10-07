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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ft.class */
@Serializable
public final class ft implements wl {

    @NotNull
    public static final fs D;

    @NotNull
    private String W;

    @NotNull
    private lj A;
    private boolean t;

    @NotNull
    private String K;
    private boolean x;
    private static boolean J;
    private static final long a = yz.a(8886840658067660929L, 5790751051605416259L, MethodHandles.lookup().lookupClass()).a(233490946805399L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    public ft(@NotNull String id, long a2, @NotNull lj bind, boolean enabled, @NotNull String item, boolean legit) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4840, 6458500500027405863L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(bind, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14753, 4026645042279832931L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(item, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16007, 3378548267059534411L ^ j) /* invoke-custom */);
        this.W = id;
        this.A = bind;
        this.t = enabled;
        this.K = item;
        this.x = legit;
    }

    @Override // su.catlean.wl
    @NotNull
    public String W() {
        return this.W;
    }

    @Override // su.catlean.wl
    public void j(@NotNull String str, long a2) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15643, 712546676899240808L ^ a2) /* invoke-custom */);
        this.W = str;
    }

    @Override // su.catlean.wl
    @NotNull
    public lj X() {
        return this.A;
    }

    @Override // su.catlean.wl
    public void r(@NotNull lj ljVar, long a2) {
        Intrinsics.checkNotNullParameter(ljVar, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15643, 712549811910299780L ^ a2) /* invoke-custom */);
        this.A = ljVar;
    }

    @Override // su.catlean.wl
    public boolean I() {
        return this.t;
    }

    @Override // su.catlean.wl
    public void K(boolean z) {
        this.t = z;
    }

    @NotNull
    public final String E() {
        return this.K;
    }

    public final void d(short a2, long a3, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1473, 1756523462763824644L ^ (((((long) a2) << 48) | ((a3 << 16) >>> 16)) ^ a)) /* invoke-custom */);
        this.K = str;
    }

    public final boolean h() {
        return this.x;
    }

    public final void w(boolean z) {
        this.x = z;
    }

    @NotNull
    public final String F() {
        return this.W;
    }

    @NotNull
    public final lj A() {
        return this.A;
    }

    public final boolean O() {
        return this.t;
    }

    @NotNull
    public final String D() {
        return this.K;
    }

    public final boolean R() {
        return this.x;
    }

    @NotNull
    public final ft Q(long a2, @NotNull String id, @NotNull lj bind, boolean enabled, @NotNull String item, boolean legit) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10138, 3471935090861412780L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(bind, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28009, 1617378935392263000L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(item, (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15942, 7108271938509736050L ^ j) /* invoke-custom */);
        return new ft(id, j ^ 121895633115514L, bind, enabled, item, legit);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:16:0x0053
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static su.catlean.ft g(su.catlean.ft r9, java.lang.String r10, su.catlean.lj r11, boolean r12, java.lang.String r13, boolean r14, int r15, java.lang.Object r16, long r17) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ft.g(su.catlean.ft, java.lang.String, su.catlean.lj, boolean, java.lang.String, boolean, int, java.lang.Object, long):su.catlean.ft");
    }

    @NotNull
    public String toString() {
        long j = a ^ 59420885731029L;
        return (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17178, 5544142494106989442L ^ j) /* invoke-custom */ + this.W + (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8873, 7027700749164532278L ^ j) /* invoke-custom */ + this.A + (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20725, 8779714037877710947L ^ j) /* invoke-custom */ + this.t + (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9049, 1729677893269869513L ^ j) /* invoke-custom */ + this.K + (String) a(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12387, 7265952133510709497L ^ j) /* invoke-custom */ + this.x + ")";
    }

    public int hashCode() {
        long j = a ^ 37162301695181L;
        return (((((((this.W.hashCode() * (int) b(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29585, 4363389573746430636L ^ j) /* invoke-custom */) + this.A.hashCode()) * (int) b(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5992, 6804551253063005782L ^ j) /* invoke-custom */) + Boolean.hashCode(this.t)) * (int) b(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5992, 6804551253063005782L ^ j) /* invoke-custom */) + this.K.hashCode()) * (int) b(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5992, 6804551253063005782L ^ j) /* invoke-custom */) + Boolean.hashCode(this.x);
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
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ft.equals(java.lang.Object):boolean");
    }

    @JvmStatic
    public static final void l(ft self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.W());
        output.encodeSerializableElement(serialDesc, 1, ss.B, self.X());
        output.encodeBooleanElement(serialDesc, 2, self.I());
        output.encodeStringElement(serialDesc, 3, self.K);
        output.encodeBooleanElement(serialDesc, 4, self.x);
    }

    public ft(int seen0, String id, lj bind, boolean enabled, String item, boolean legit, SerializationConstructorMarker serializationConstructorMarker, long a2) {
        long j = a ^ a2;
        if ((int) b(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5992, 6804561207934307906L ^ j) /* invoke-custom */ != ((int) b(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5992, 6804561207934307906L ^ j) /* invoke-custom */ & seen0)) {
            PluginExceptionsKt.throwMissingFieldException(seen0, (int) b(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5992, 6804561207934307906L ^ j) /* invoke-custom */, ca.N.getDescriptor());
        }
        this.W = id;
        this.A = bind;
        this.t = enabled;
        this.K = item;
        this.x = legit;
    }

    static {
        int i;
        long j = a ^ 65113441048867L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(false, 1418858238928455437L, j) /* invoke-custom */;
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
        String str = "Ë\t ÚW+_\u0084\u001c\u001dàdúÏ\u0084\u0018\u0010\u000e£\u0090ãÆ¡Çù\u008fD^\u008b\u0082Pp%\u0010é%Þ\u0003\u0006IÖ\u0099j\u00170~\u0005EÑ\"\u0010{\u0094»ÿl\u008b''\n)\u0083\u0017\u000fE,.\u0018ÁàÕ=õº§U\u0095ËLü\u0098\u0088®¼)iv?A%K\u0092\u0010Xz\u0012\u009d4\u0089EôvÃÉÉ\u0015 \u0093i \u0098h]/}{\t¶7c6µÁÏ\u001a\u0098Û\u0005²¡jóS¯ûvÉ\t\u008cç_ç\u0010\u0097µ\u00993ºk\u0083\u000b\u0088\u0084\u009f\t5\nü\u0018\u0010\u0082\u008c\u0011\u001aÔ\u001a\u0080Ü\u0001áÅKæw\u0019ä\u0010\u008d.x\u001bË/ÿ,Ú®\u0002>\u008c·f\u0016\u0018x\u001da³\u0086§sa\u008bp\u0013ú§Åì>K¢\u0010ÑìÕ §";
        int length = "Ë\t ÚW+_\u0084\u001c\u001dàdúÏ\u0084\u0018\u0010\u000e£\u0090ãÆ¡Çù\u008fD^\u008b\u0082Pp%\u0010é%Þ\u0003\u0006IÖ\u0099j\u00170~\u0005EÑ\"\u0010{\u0094»ÿl\u008b''\n)\u0083\u0017\u000fE,.\u0018ÁàÕ=õº§U\u0095ËLü\u0098\u0088®¼)iv?A%K\u0092\u0010Xz\u0012\u009d4\u0089EôvÃÉÉ\u0015 \u0093i \u0098h]/}{\t¶7c6µÁÏ\u001a\u0098Û\u0005²¡jóS¯ûvÉ\t\u008cç_ç\u0010\u0097µ\u00993ºk\u0083\u000b\u0088\u0084\u009f\t5\nü\u0018\u0010\u0082\u008c\u0011\u001aÔ\u001a\u0080Ü\u0001áÅKæw\u0019ä\u0010\u008d.x\u001bË/ÿ,Ú®\u0002>\u008c·f\u0016\u0018x\u001da³\u0086§sa\u008bp\u0013ú§Åì>K¢\u0010ÑìÕ §".length();
        char cCharAt = 16;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            b = strArr;
                            c = new String[13];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[4];
                            int i9 = 0;
                            String str3 = "\u0017\nªÙ\u0011Ö8Wù]EÉ+¼ùB";
                            int length2 = "\u0017\nªÙ\u0011Ö8Wù]EÉ+¼ùB".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j3 = j2;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                e = jArr;
                                                f = new Integer[4];
                                                D = new fs(null);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "\u0096\u0084\u0007`%iÆ~0dgþ¼\n\u0002\r";
                                                length2 = "\u0096\u0084\u0007`%iÆ~0dgþ¼\n\u0002\r".length();
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
                                    b4 = 0;
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
                        str = "\u0090\u0018´Æ\u0010wo¼TWG§-\u000f?¤\u0010wº\u0011ÙQK\u007fX7Î\u0088q¡Î'è";
                        length = "\u0090\u0018´Æ\u0010wo¼TWG§-\u000f?¤\u0010wº\u0011ÙQK\u007fX7Î\u0088q¡Î'è".length();
                        cCharAt = 16;
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

    public static void x(boolean z) {
        J = z;
    }

    public static boolean H() {
        return J;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean j() {
        return !H();
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String a(byte[] bArr) {
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

    private static String a(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 15810;
        if (c[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i2] = a(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/ft", e2);
            }
        }
        return c[i2];
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
            java.lang.String r1 = "su/catlean/ft"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ft.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 20088;
        if (f[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) g.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/ft", e2);
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
            java.lang.String r1 = "su/catlean/ft"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ft.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
