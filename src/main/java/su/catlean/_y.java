package su.catlean;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_2246;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_y.class */
public final class _y extends _3 {

    @NotNull
    public static final _y o;
    static final KProperty[] B;

    @NotNull
    private static final cw I;

    @NotNull
    private static final cq F;
    private static final long c = yz.a(-1253310128162134313L, -5888801338452362260L, MethodHandles.lookup().lookupClass()).a(252527122700999L);
    private static final String[] h;
    private static final String[] i;
    private static final Map l;
    private static final long[] m;
    private static final Integer[] n;
    private static final Map t;

    /* JADX WARN: Illegal instructions before constructor call */
    private _y(byte b, long j) {
        long j2 = ((((long) b) << 56) | ((j << 8) >>> 8)) ^ c;
        short s = (short) (j2 >>> 48);
        super((String) c(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3723, 1812641356812457876L ^ j2) /* invoke-custom */, s, jt.Q(), 0, false, (int) f(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24615, 7772603856957562732L ^ j2) /* invoke-custom */, (short) ((r1 << 16) >>> 48), (int) (((j2 ^ 83626112277756L) << 32) >>> 32), null);
    }

    private final br I(long j) {
        return (br) I.E(this, (c ^ j) ^ 36723201632667L, B[0]);
    }

    private final void X(br brVar, long j) {
        I.b(this, (c ^ j) ^ 45624320347546L, B[0], brVar);
    }

    private final boolean i(long j) {
        return ((Boolean) F.E(this, (c ^ j) ^ 91054542877388L, B[1])).booleanValue();
    }

    private final void a(long j, int i2, boolean z) {
        F.b(this, (((j << 32) | ((((long) i2) << 32) >>> 32)) ^ c) ^ 65872984306855L, B[1], Boolean.valueOf(z));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:86:0x0273
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void U(su.catlean.api.event.events.player.PlayerUpdateEvent r14) {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._y.U(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:110:0x0399
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void j(long r13, net.minecraft.class_1657 r15, short r16) {
        /*
            Method dump skipped, instruction units count: 1053
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._y.j(long, net.minecraft.class_1657, short):void");
    }

    @Override // su.catlean._3
    @NotNull
    protected List R(long j) {
        return CollectionsKt.listOf(class_2246.field_16999);
    }

    @Override // su.catlean._3
    @NotNull
    protected y4 s() {
        return y4.NONE;
    }

    static {
        int i2;
        long j = c ^ 128580885572689L;
        long j2 = j ^ 130674614915264L;
        int i3 = (int) (j >>> 56);
        long j3 = ((j ^ 30624273724035L) << 8) >>> 8;
        long j4 = j ^ 61180479400564L;
        l = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i4 = 1; i4 < 8; i4++) {
            bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[12];
        int i5 = 0;
        String str = "øEk?¼,J\u007f/ág\u009aô\u0004¨{ä\u0090½\u0013x5\bÕ(\u0087e6Ï\u008e.\fmYh\u0010z'\u0099SúTë + Ã!»Ò\u0095Ìü¶Ú{¶\u0081\u009fo½ý\u0004\u0004x *¸\u009ep\u0084¿÷\u0011_KEÍ\bFr(-äD?L%\nÇßXh¿FhÍ\u0011\u0080¯@\u00176«O\u009f{2£½\u0090\u009dayPok¶Õ<±È\u0083ÅIL)\u008aUZa\u00ad\u0094}z\u001dÊñ/æ9]8î½rÆº\u001aî\u009a\u001eÞÙ\u009d»¼\u0085±2ðJ(¦UG¾ØQO\u0095Õ\u0011\u0016t\u0006¿,\u0003;\u00adtãÊnF¤+À\u001d_Ã\u009e¹\u0099NÓÇ\u0003$\f\u0095i÷¶\u0012\u001aº§\u009c\u0018ù\u008b\u0012xÆW¹\u00ad\u001e\u0003'\u0010§\u001bÐ\u009e0\u0089,Ñ\f>ô \u009eßBK²\u0001\u008f\u0087\u0013LäBþðBOÚ³\u008b\u001e\u008f\u0080ñ\u008fÅ¤ý\u0092\u0096íöFÐ\u0014åÿ`Fv\u0000m(©¢\u0098³I\u00adûaM\u009a3\u0090\u000b\u009c3ÜZÔyñ*T\f\u0087\u0081ù\u00151§U¾T(y³:G`÷- n\u001bPc\u0013\u0005Ù!\u000e=Rt\u0007C.Üáò»\u000b0VM\u009b\u008bõW9\u0006\"\u0019%(UÃÍ)\u0013<Èq2ýÅçÔ\u001fO¼Ùu!\u0006\u0080W\u001c\u0006ÜK§öl#9³\u0016T Ø/Û\u008a\u0003 Ù\u008b]\u0010¾Xé*á³nãQ\\9\u0089é\u0099\u001a\u0092´^ïâ\u000b¨ê\u0091oûN\u0096 Øü2ë±æ}\u0083±==\u000e\nn\u0004*ä£µj\u0010\u0091\u0012!_¤9B\u0019Q\u001fo";
        int length = "øEk?¼,J\u007f/ág\u009aô\u0004¨{ä\u0090½\u0013x5\bÕ(\u0087e6Ï\u008e.\fmYh\u0010z'\u0099SúTë + Ã!»Ò\u0095Ìü¶Ú{¶\u0081\u009fo½ý\u0004\u0004x *¸\u009ep\u0084¿÷\u0011_KEÍ\bFr(-äD?L%\nÇßXh¿FhÍ\u0011\u0080¯@\u00176«O\u009f{2£½\u0090\u009dayPok¶Õ<±È\u0083ÅIL)\u008aUZa\u00ad\u0094}z\u001dÊñ/æ9]8î½rÆº\u001aî\u009a\u001eÞÙ\u009d»¼\u0085±2ðJ(¦UG¾ØQO\u0095Õ\u0011\u0016t\u0006¿,\u0003;\u00adtãÊnF¤+À\u001d_Ã\u009e¹\u0099NÓÇ\u0003$\f\u0095i÷¶\u0012\u001aº§\u009c\u0018ù\u008b\u0012xÆW¹\u00ad\u001e\u0003'\u0010§\u001bÐ\u009e0\u0089,Ñ\f>ô \u009eßBK²\u0001\u008f\u0087\u0013LäBþðBOÚ³\u008b\u001e\u008f\u0080ñ\u008fÅ¤ý\u0092\u0096íöFÐ\u0014åÿ`Fv\u0000m(©¢\u0098³I\u00adûaM\u009a3\u0090\u000b\u009c3ÜZÔyñ*T\f\u0087\u0081ù\u00151§U¾T(y³:G`÷- n\u001bPc\u0013\u0005Ù!\u000e=Rt\u0007C.Üáò»\u000b0VM\u009b\u008bõW9\u0006\"\u0019%(UÃÍ)\u0013<Èq2ýÅçÔ\u001fO¼Ùu!\u0006\u0080W\u001c\u0006ÜK§öl#9³\u0016T Ø/Û\u008a\u0003 Ù\u008b]\u0010¾Xé*á³nãQ\\9\u0089é\u0099\u001a\u0092´^ïâ\u000b¨ê\u0091oûN\u0096 Øü2ë±æ}\u0083±==\u000e\nn\u0004*ä£µj\u0010\u0091\u0012!_¤9B\u0019Q\u001fo".length();
        char cCharAt = 24;
        int i6 = -1;
        while (true) {
            int i7 = i6 + 1;
            String strSubstring = str.substring(i7, i7 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = c(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i8 = i5;
                        i5++;
                        strArr[i8] = strIntern;
                        int i9 = i7 + cCharAt;
                        i2 = i9;
                        if (i9 >= length) {
                            h = strArr;
                            i = new String[12];
                            t = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i10 = 1; i10 < 8; i10++) {
                                bArr2[i10] = (byte) ((j << (i10 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[3];
                            int i11 = 0;
                            int length2 = "½ \u009dp\u0014ÔÆN\"º~rJ\u009bå;¢úD0´¯\u0002ó".length();
                            int i12 = 0;
                            do {
                                int i13 = i12;
                                i12 += 8;
                                byte[] bytes = "½ \u009dp\u0014ÔÆN\"º~rJ\u009bå;¢úD0´¯\u0002ó".substring(i13, i12).getBytes("ISO-8859-1");
                                i11++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i12 < length2);
                            m = jArr;
                            n = new Integer[3];
                            B = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(_y.class, (String) c(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26531, 1002699128044418674L ^ j) /* invoke-custom */, (String) c(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24259, 5759672969640496925L ^ j) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(_y.class, (String) c(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2936, 7606320276773411492L ^ j) /* invoke-custom */, (String) c(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10973, 319952451855072000L ^ j) /* invoke-custom */, 0))};
                            o = new _y((byte) i3, j3);
                            I = yp.L(o, (String) c(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23797, 6721909681707994415L ^ j) /* invoke-custom */, br.AUTO, null, null, (int) f(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(91, 2509912927646758867L ^ j) /* invoke-custom */, null, j4);
                            F = yp.t(o, (String) c(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21899, 925250794467214419L ^ j) /* invoke-custom */, false, j2, null, null, (int) f(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(91, 2509912927646758867L ^ j) /* invoke-custom */, null);
                            return;
                        }
                        cCharAt = str.charAt(i2);
                        break;
                        break;
                    default:
                        int i14 = i5;
                        i5++;
                        strArr[i14] = strIntern;
                        int i15 = i7 + cCharAt;
                        i6 = i15;
                        if (i15 < length) {
                        }
                        str = "J4n\u0083\u0002\u0081ª¨©\u0003îÕxµ7^[güµX°Ãó¯]®\u0098hÖÚ\u0098°\u0013\u00184s+\u000eb w\u0016únFÏÍÜª\u008b÷\u0082M¯CR\u0012_Z++ó÷½Öqú\u000fY+\u009eä";
                        length = "J4n\u0083\u0002\u0081ª¨©\u0003îÕxµ7^[güµX°Ãó¯]®\u0098hÖÚ\u0098°\u0013\u00184s+\u000eb w\u0016únFÏÍÜª\u008b÷\u0082M¯CR\u0012_Z++ó÷½Öqú\u000fY+\u009eä".length();
                        cCharAt = '(';
                        i2 = -1;
                        break;
                        break;
                }
                i7 = i2 + 1;
                strSubstring = str.substring(i7, i7 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i6);
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String c(byte[] bArr) {
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

    private static String c(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 1992;
        if (i[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) l.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                i[i3] = c(((Cipher) objArr[0]).doFinal(h[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/_y", e);
            }
        }
        return i[i3];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strC), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strC;
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
            java.lang.String r1 = "su/catlean/_y"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._y.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int f(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 8600;
        if (n[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) m[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) t.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    t.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/_y", e);
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

    private static int f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iF = f(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iF)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iF;
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
    private static java.lang.invoke.CallSite f(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
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
            java.lang.String r1 = "su/catlean/_y"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._y.f(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
